 /** 
  * ResourceBundleManager.java
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
  * Description: Loads ResourceBundles
  * 
  */

package org.sblim.wbemsmt.tools.resources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

public class ResourceBundleManager
{
	private static final String MISSING_TRANSLATIONS_TXT = "missingTranslations.txt";
	private static Map instances = new HashMap();
	private static List keys = new ArrayList();
	
	static
	{
		File file = new File(ResourceBundleManager.MISSING_TRANSLATIONS_TXT);
		if (file.exists())
		{
			try {
				BufferedReader in = new BufferedReader(new FileReader(file));
				String line = null;
				while ((line = in.readLine()) != null)
				{
					int index = line.indexOf("=");
					if (index > -1)
					{
						keys.add(line.substring(0,index));
					}
					else
					{
						keys.add(line);
					}
				}
				in.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	private static Logger logger = Logger.getLogger(ResourceBundleManager.class.getName());
	/**
	 * loads all the given ResourceBundle in the given order. New read resorceBundles are added to existing ones.
	 * If there exists a entry with the same key in two bundles the value of that resourceBundle which is last in Array is used.
	 * 
	 * USES THE DEFAULT LOCALE
	 * 
	 * @param array The Names of the Properties (e.g. use new String[]{"messages","messagesDns"} to first read the messages.properties and then overwrite this bundle with the messagesDns ResourceBundle
	 *
	 * The loaded ResourceBundle is cached.
	 * 
	 * @return
	 */
	public static synchronized WbemSmtResourceBundle getResourceBundle(String[] array)
	{
		if (RuntimeUtil.getInstance().isJSF())
		{
			return getResourceBundle(array,LocaleManager.getCurrent(FacesContext.getCurrentInstance()).getCurrentLocale(),false);
		}
		else
		{
			return getResourceBundle(array,Locale.getDefault(),false);
		}
	}
	
	/**
	 * loads all the given ResourceBundle in the given order. New read resorceBundles are added to existing ones.
	 * If there exists a entry with the same key in two bundles the value of that resourceBundle which is last in Array is used.
	 * 
	 * USES THE DEFAULT LOCALE
	 * 
	 * @param bundles The Names of the Properties (e.g. use new String[]{"messages","messagesDns"} to first read the messages.properties and then overwrite this bundle with the messagesDns ResourceBundle
	 *
	 * The loaded ResourceBundle is cached.
	 * 
	 * @return
	 */
	public static synchronized WbemSmtResourceBundle getResourceBundle(org.sblim.wbemsmt.tasklauncher.tasklauncherconfig.ResourceBundleDocument.ResourceBundle[] bundles)
	{
		String[] array = new String[bundles.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = bundles[i].getName();
		}
		return getResourceBundle(array);
	}
	
	public static synchronized WbemSmtResourceBundle reloadResourceBundle(String[] array)
	{
		if (RuntimeUtil.getInstance().isJSF())
		{
			return getResourceBundle(array,LocaleManager.getCurrent(FacesContext.getCurrentInstance()).getCurrentLocale(),true);
		}
		else
		{
			return getResourceBundle(array,Locale.getDefault(),true);
		}
	}

	public static synchronized WbemSmtResourceBundle reloadResourceBundle(String[] array, Locale locale, ClassLoader classLoader)
	{
		return getResourceBundle(array,locale,classLoader, true);
	}

	public static synchronized WbemSmtResourceBundle reloadResourceBundle(String[] array, Locale locale, ClassLoader[] classLoader)
	{
		return getResourceBundle(array,locale,classLoader, true);
	}

	public static synchronized WbemSmtResourceBundle getResourceBundle(String[] array,Locale locale)
	{
		return getResourceBundle(array,locale,false);
	}

	public static synchronized WbemSmtResourceBundle getResourceBundle(String[] array,Locale locale,ClassLoader classLoader)
	{
		return getResourceBundle(array,locale,classLoader, false);
	}

	public static synchronized WbemSmtResourceBundle getResourceBundle(String[] array,Locale locale,ClassLoader[] classLoader)
	{
		return getResourceBundle(array,locale,classLoader, false);
	}

	public static synchronized WbemSmtResourceBundle getResourceBundle(String[] array,Locale locale, boolean forceLoading)
	{
		ClassLoader loader = null;
		return getResourceBundle(array,locale,loader, false);
	}	
	/**
	 * loads all the given ResourceBundle in the given order. New read resorceBundles are added to existing ones.
	 * If there exists a entry with the same key in two bundles the value of that resourceBundle which is last in Array is used.
	 * @param array The Names of the Properties (e.g. use new String[]{"messages","messagesDns"} to first read the messages.properties and then overwrite this bundle with the messagesDns ResourceBundle
	 * @param locale the Locale which to load.
	 *
	 * The loaded ResourceBundle is cached.
	 * 
	 * @return
	 */
	public static synchronized WbemSmtResourceBundle getResourceBundle(String[] array,Locale locale, ClassLoader classLoader, boolean forceLoading)
	{
		String key = Arrays.asList(array) + locale.toString();
		WbemSmtResourceBundle result = (WbemSmtResourceBundle) instances.get(key);
		if (result == null || forceLoading)
		{
			result = loadBundle(array,locale, classLoader);
			instances.put(key,result);
		}
		return result;
	}

	
	/**
	 * loads all the given ResourceBundle in the given order. New read resorceBundles are added to existing ones.
	 * If there exists a entry with the same key in two bundles the value of that resourceBundle which is last in Array is used.
	 * @param array The Names of the Properties (e.g. use new String[]{"messages","messagesDns"} to first read the messages.properties and then overwrite this bundle with the messagesDns ResourceBundle
	 * @param locale the Locale which to load.
	 *
	 * The loaded ResourceBundle is cached.
	 * 
	 * @return
	 */
	public static synchronized WbemSmtResourceBundle getResourceBundle(String[] array,Locale locale, ClassLoader[] classLoader, boolean forceLoading)
	{
		String key = Arrays.asList(array) + locale.toString();
		WbemSmtResourceBundle result = (WbemSmtResourceBundle) instances.get(key);
		if (result == null || forceLoading)
		{
			result = loadBundle(array,locale, classLoader);
			instances.put(key,result);
		}
		return result;
	}
	
	private static WbemSmtResourceBundle loadBundle(String[] array, Locale locale, ClassLoader[] classLoader)
	{
		ClassLoader defaultClassLoader = WbemSmtResourceBundle.class.getClassLoader();

		WbemSmtResourceBundle result = new WbemSmtResourceBundle();
		result.setLocale(locale);
		result.setBundleNames(array);
		
		for (int i = 0; i < array.length; i++) {
			String bundleName = array[i];
			boolean found = false;
			for (int j = 0; j < classLoader.length && !found; j++) {
				ClassLoader loader = classLoader[j];
				if (loader !=null)
				{
					found = loadBundle(bundleName, locale, loader, result);		
				}
			}
			if (!found)
			{
				found = loadBundle(bundleName, locale, defaultClassLoader, result);
			}
		}
		return result;
	}

	
	private static WbemSmtResourceBundle loadBundle(String[] array, Locale locale, ClassLoader classLoader)
	{
		ClassLoader defaultClassLoader = WbemSmtResourceBundle.class.getClassLoader();
		if (classLoader==null)
		{
			classLoader = defaultClassLoader;
			logger.fine("Using defalt classloader of Class " + WbemSmtResourceBundle.class.getName());
		}

		WbemSmtResourceBundle result = new WbemSmtResourceBundle();
		result.setLocale(locale);
		result.setBundleNames(array);
		
		
		for (int i = 0; i < array.length; i++) {
			String bundleName = array[i];
			boolean ok = false;
			if (classLoader != null)
			{
				ok = loadBundle(bundleName, locale, classLoader,result);
			}
			if (!ok)
			{
				loadBundle(bundleName, locale, defaultClassLoader,result);
			}
		}
		return result;
	}

	private static boolean loadBundle(String bundleName, Locale locale, ClassLoader classLoader, WbemSmtResourceBundle result) {
		logger.fine("Loading Bundle " + bundleName + " for Locale " + locale + " with classLoader " + classLoader.toString());
		try {
			ResourceBundle bundle = ResourceBundle.getBundle(bundleName,locale, classLoader);
			result.add(bundle);
			return true;
		} catch (MissingResourceException e) {
			logger.severe("Cannot load bundle " + bundleName + " Evtl. this is a bundle of a task, defined in tasklaucher-config.xml but the jar-File with this resourceBundle is not deployed.");
		}
		return false;
	}
	
	public static void writeMissingTranslation(String key)
	{
		try {
			if (keys.contains(key))
				return;
			
			File file = new File(ResourceBundleManager.MISSING_TRANSLATIONS_TXT);
			keys.add(key);
			if (keys.size() == 1)
			{
				System.err.println("Writing missingTranslations to " + file.getAbsolutePath());
			}

			PrintWriter pw = new PrintWriter(new FileWriter(file,keys.size() > 1));
			
			String value = key.lastIndexOf(".") > -1 ? key.substring(key.lastIndexOf(".")+1) : key;
			pw.println(key + "=" + value);
			pw.flush();
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static WbemSmtResourceBundle getResourceBundle(FacesContext currentInstance) {

		Locale locale = LocaleManager.getCurrent(currentInstance).getCurrentLocale();
		String bundle = currentInstance.getApplication().getMessageBundle();

		try {
			Class cls = Class.forName("org.sblim.wbemsmt.webapp.jsf.WbemsmtWebAppBean");
			logger.fine("Using classloader of Class " + cls.getName());
			return getResourceBundle(new String[]{bundle},locale,cls.getClassLoader());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return getResourceBundle(new String[]{bundle},locale);
		}
		
	}

	public static WbemSmtResourceBundle getResourceBundle(FacesContext currentInstance, ClassLoader classLoader) {

		Locale locale = LocaleManager.getCurrent(currentInstance).getCurrentLocale();
		String bundle = currentInstance.getApplication().getMessageBundle();
		return getResourceBundle(new String[]{bundle},locale,classLoader);
	}

	/**
	 * Returns a Resource which is mananged in terms of reloading if the user changes the locale
	 * Uses the Resourcebundle called "messages"
	 * @return
	 */
	public static ManagedWbemSmtResourceBundle getCommonResourceBundle() {
        
		return getManagedResourceBundle(new String [] {"messages"});
	}

	/**
	 * Returns a Resource which is mananged in terms of reloading if the user changes the locale
	 * @param bundleNames
	 * @return
	 */
	public static ManagedWbemSmtResourceBundle getManagedResourceBundle(String[] bundleNames) {
        
		WbemSmtResourceBundle bundle;
		if (RuntimeUtil.getInstance().isJSF())
        {
			ILocaleManager lm = (ILocaleManager) BeanNameConstants.LOCALE_MANAGER.getBoundValue(FacesContext.getCurrentInstance());
        	bundle = ResourceBundleManager.getResourceBundle(bundleNames, lm.getCurrentLocale());
        }
        else
        {
        	bundle = ResourceBundleManager.getResourceBundle(bundleNames);
        }
		ManagedWbemSmtResourceBundle managedWbemSmtResourceBundle = new ManagedWbemSmtResourceBundle(bundle);
		
		return managedWbemSmtResourceBundle;
	}

}
