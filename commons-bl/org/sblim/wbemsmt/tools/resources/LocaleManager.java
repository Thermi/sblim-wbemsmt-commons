 /** 
  * LocaleManager.java
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
  * Description: Manager class to retrieve the localemanager in an ui independent way.
  * 
  */
package org.sblim.wbemsmt.tools.resources;

import java.util.*;
import java.util.Map.Entry;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.exception.impl.RuntimeNotSupportedException;
import org.sblim.wbemsmt.exception.impl.userobject.RuntimeNotSupportedUserObject;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.cli.CliLocaleManager;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;
import org.sblim.wbemsmt.webapp.jsf.LocaleManagerBean;

public class LocaleManager implements ILocaleManager {

    /**
     * Returns the LocaleManager. Can be null if param fc is also null
     * @param fc
     * @return the LocaleManager. Can be null if param fc is also null
     */
	public static ILocaleManager getCurrent(FacesContext fc)
	{
	    if (fc != null)
	    {
	        ILocaleManager localeManager = (ILocaleManager) BeanNameConstants.LOCALE_MANAGER.asValueBinding(fc).getValue(fc);
	        return localeManager;
	    }
	    else
	    {
	        return null;
	    }
	    
	}

    protected Locale currentLocale;
    protected static final Logger logger = Logger.getLogger(LocaleManagerBean.class.getName());
    private Map resourceBundleByAppName = new HashMap();
    Set listeners = new HashSet();
    //private Map appNameByPackageName = new HashMap();

    public LocaleManager() {
        super();
    }

    public void addLocaleChangeListener(LocaleChangeListener listener) {
        listeners.add(listener);
    }

    public void removeLocaleChangeListener(LocaleChangeListener listener) {
        listeners.remove(listener);
    }

    public Locale getCurrentLocale() {
        return currentLocale;
    }

    public String getCurrentLocaleString() {
        return currentLocale.toString();
    }


    protected void sendEvent(Locale newLocale) {
        for (Iterator iter = listeners.iterator(); iter.hasNext();) {
            LocaleChangeListener listener = (LocaleChangeListener) iter.next();
            listener.localeChanged(newLocale);
        }
    }
    
    public void setCurrentLocale(Locale newLocale) {
        if (!newLocale.toString().equals(currentLocale.toString()))
        {
            logger.info("Locale is " + newLocale);
            currentLocale = newLocale;
            sendEvent(newLocale);
            //do a reload
            reloadBundles();
            
            logger.info("Locale is " + currentLocale);
        }
    }    

    public Map getBundle() {
        return resourceBundleByAppName;
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
    public void addResourceBundleEntry(String appName, String[] bundleNames) {
        WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(bundleNames,currentLocale);
        resourceBundleByAppName.put(appName,bundle);
    }

    public void cleanup() {
        resourceBundleByAppName.clear();
        //appNameByPackageName.clear();
        listeners.clear();
    }

    /**
     * Retrieve the Jsf Locale by querying the LocaleManager bean which is a ManagedBean in Sessionscope
     * If the LocaleManager cannot be found because no FacesContext exists Locale.getDefault is used
     * @return
     */
    public static Locale getJsfUserLocale() {
        ILocaleManager localeManager = getCurrent(FacesContext.getCurrentInstance());
        Locale result = null;
        if (localeManager != null)
        {
            result = localeManager.getCurrentLocale();
        }
            
        if (result == null)
        {
            result = Locale.getDefault();
        }
        
        return result;
    }

    /**
     * gets the current localemanager<br>
     * <br>
     * For jsf the sessionwide #{localeManager} managed bean is used
     * For Cli the singleton  CliLocaleManager is used
     * @return
     * @throws WbemsmtException if the runtime is not supported
     * @see LocaleManagerBean
     * @see CliLocaleManager
     */
    public static ILocaleManager getCurrent() throws WbemsmtException {
        if (RuntimeUtil.getInstance().isJSF())
        {
            return (ILocaleManager) BeanNameConstants.LOCALE_MANAGER.getBoundValue(FacesContext.getCurrentInstance());
        }
        else if (RuntimeUtil.getInstance().isCommandline())
        {
            return CliLocaleManager.getInstance();
        }
        else
        {
            throw new RuntimeNotSupportedException(new RuntimeNotSupportedUserObject(RuntimeUtil.getInstance().getRuntime()));
        }
    }
	
	
}
