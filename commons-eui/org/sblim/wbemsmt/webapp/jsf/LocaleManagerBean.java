 /** 
  * LocaleManagerBean.java
  *
  * © Copyright IBM Corp. 2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE COMMON PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Common Public License from
  * http://www.opensource.org/licenses/cpl1.0.php
  *
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Manages the Locale of the current Session
  * 
  */
package org.sblim.wbemsmt.webapp.jsf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;
import javax.faces.el.ValueBinding;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.sblim.wbemsmt.bl.Cleanup;
import org.sblim.wbemsmt.bl.fco.CIM_ObjectIf;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.resources.ILocaleManager;
import org.sblim.wbemsmt.tools.resources.LocaleChangeListener;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class LocaleManagerBean implements ILocaleManager, Cleanup
{
	private Locale currentLocale;
	private static final Logger logger = Logger.getLogger(LocaleManagerBean.class.getName());
	private Map resourceBundleByAppName = new HashMap();
	
	Set listeners = new HashSet();
	private Map appNameByPackageName = new HashMap();
	
	public LocaleManagerBean()
	{
		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		HttpSession session = request.getSession(true);
		currentLocale = (Locale) session.getAttribute("locale");
		if (currentLocale == null)
		{
			currentLocale = FacesContext.getCurrentInstance().getExternalContext().getRequestLocale();
		}
		
		addResourceBundleEntry("common", new String[]{"messages"});
		
		logger.info("Locale is " + currentLocale);
	}
	
	public void addLocaleChangeListener(LocaleChangeListener listener)
	{
		listeners.add(listener);
	}
	
	public void removeLocaleChangeListener(LocaleChangeListener listener)
	{
		listeners.remove(listener);
	}

	public Locale getCurrentLocale()
	{
		return currentLocale;
	}
	
	public String getCurrentLocaleString()
	{
		return currentLocale.toString();
	}

	public void setCurrentLocale(Locale newLocale)
	{
		if (!newLocale.toString().equals(currentLocale.toString()))
		{
			logger.info("Locale is " + newLocale);
			currentLocale = newLocale;
			HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
//			request.getSession().invalidate();
			HttpSession session = request.getSession(true);
			session.setAttribute("locale",newLocale);
			sendEvent(newLocale);
			
			//do a reload
			reloadBundles();
			
			logger.info("Locale is " + currentLocale);
		}
	}

	private void sendEvent(Locale newLocale) {
		for (Iterator iter = listeners.iterator(); iter.hasNext();) {
			LocaleChangeListener listener = (LocaleChangeListener) iter.next();
			listener.localeChanged(newLocale);
		}
	}
	
	public void setEnglish(ActionEvent event)
	{
		setCurrentLocale(Locale.ENGLISH);
	}

	public void setGerman(ActionEvent event)
	{
		setCurrentLocale(Locale.GERMAN);
	}

	public Map getBundle()
	{
		return resourceBundleByAppName;
	}

	public WbemSmtResourceBundle getBundleByFco(CIM_ObjectIf co)
	{
		return getBundleByFco(co.getWrappedObject().getClass());
	}

	private WbemSmtResourceBundle getBundleByFco(Class fcoClass)
	{
		//get the package name
		String name = fcoClass.getPackage().getName();
		String appName = (String) appNameByPackageName.get(name);
		if (appName != null)
		{
			return (WbemSmtResourceBundle) resourceBundleByAppName.get(appName);
		}
		else
		{
			throw new RuntimeException("No ResourceBundle found for Object with classname " + fcoClass.getName() + " not supported");
		}
	}
	
	/**
	 * Expects a List with String with format <application>:<bundle>
	 */
	
	public void reloadBundles() {

		List keys = new ArrayList();
		List bundleNames = new ArrayList();
		for (Iterator iter = resourceBundleByAppName.entrySet().iterator(); iter.hasNext();) {
			Map.Entry entry = (Entry) iter.next();
			String app = (String) entry.getKey();
			WbemSmtResourceBundle bundle = (WbemSmtResourceBundle) entry.getValue();
			keys.add(app);
			bundleNames.add(bundle.getBundleNames());
		}

		resourceBundleByAppName.clear();
		
		for (int i=0; i < keys.size(); i++)
		{
			String app = (String) keys.get(i);
			String[] bundleNameArray = (String[]) bundleNames.get(i);
			WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(bundleNameArray,currentLocale);
			resourceBundleByAppName.put(app,bundle);
		}
	}	
	
	/**
	 * Adds the names of a resourceBundle to the bundles of the collection
	 * @param appAndBundle
	 */
	public void addResourceBundleEntry(String appName, String[] bundleNames)
	{
		WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(bundleNames,currentLocale);
		resourceBundleByAppName.put(appName,bundle);
	}

	public void addFcoPackage(String appName, String fcoPackage) {
		
		logger.fine("adding the package " + fcoPackage + " for the application " + appName);
		appNameByPackageName .put(fcoPackage,appName);
		
	}
	
	public ValueBinding getBinding(String appName, String key)
	{
		key = key.replaceAll("\\.", "_");
		String binding = "#{" + BeanNameConstants.LOCALE_MANAGER.getName() + ".bundle['"+ appName +"']." + key + "}";
		return FacesContext.getCurrentInstance().getApplication().createValueBinding(binding);
	}

	public ValueBinding getBinding(String key)
	{
		key = key.replaceAll("\\.", "_");
		String binding = "#{" + BeanNameConstants.LOCALE_MANAGER.getName() + ".bundle['common']." + key + "}";
		return FacesContext.getCurrentInstance().getApplication().createValueBinding(binding);
	}

	public void cleanup() {
		resourceBundleByAppName.clear();
		appNameByPackageName.clear();
		listeners.clear();
	}
	
}
