 /** 
  * WbemSmtResourceBundle.java
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
  * Description: The WbemSmt implementation of a ResourceBundle
  *
  * This class is used to load resourceBundleFiles from different locations using the method add to add new ResourceBundles
  * 
  */


package org.sblim.wbemsmt.tools.resources;

import java.text.MessageFormat;
import java.util.*;

import org.sblim.wbemsmt.bl.MessageNumber;

/**
 * This class is used to load resourceBundleFiles from different locations using the method add to add new ResourceBundles
 * 
 * @see #add(ResourceBundle)
 * @see org.sblim.wbemsmt.tools.resources.ResourceBundleManager#getResourceBundle(String[], Locale)
 *
 */
public class WbemSmtResourceBundle extends HashMap {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5820291962642135263L;

	public static final String TOKEN_EMPTY = "!!EMPTY!!";

	private static final String SUFFIX_ARGVALUE = ".argValue";

	public Properties properties = new Properties();
	
	public static final Mode MODE_INDICATION_FOR_MISSING_KEY = new Mode();
	public static final Mode MODE_INDICATION_FOR_MISSING_KEY_AND_USE_KEY_PARTS = new Mode();
	public static final Mode MODE_EXCEPTION_FOR_MISSING_KEY = new Mode();
	public static final Mode MODE_EXCEPTION_FOR_MISSING_KEY_AND_USE_KEY_PARTS = new Mode();

	private Mode mode = MODE_INDICATION_FOR_MISSING_KEY_AND_USE_KEY_PARTS;
	private String[] bundleNames = null;
	private Locale locale = null;
	
	protected Object handleGetObject(String key) {
		throw new IllegalArgumentException("Should not be called WbemSmtResourceBundle is just a wrapper");
		//return properties.getProperty(key,"???"+key+"???");
	}

	public Enumeration getKeys() {
		return properties.keys();
	}

	public void setMode(Mode mode)
	{
		this.mode = mode;
		
	}
	
	/**
	 * This Method takes the resourceBundle, reads the Entries and puts them to the 
	 * properties Object - if there is already a properties Object the existing object is overwritten
	 * @param bundle
	 */
	public void add(ResourceBundle bundle)
	{
		Enumeration keys = bundle.getKeys();
		while (keys.hasMoreElements())
		{
			String key = (String)keys.nextElement();
			String value = bundle.getString(key);
			properties.put(key,value);
			if (key.indexOf(".") > -1)
			{
				String key1 = key.replaceAll("\\.","_");
				properties.put(key1,value);
			}
		}
	}

	/**
	 * This Method takes the resourceBundle, reads the Entries and puts them to the 
	 * properties Object - if there is already a properties Object the existing object is overwritten
	 * The bundlenames of the added bundle are added to the existent bundleNames
	 * @param bundle
	 */
	public void add(WbemSmtResourceBundle bundle)
	{
		Enumeration keys = bundle.getKeys();
		while (keys.hasMoreElements())
		{
			String key = (String)keys.nextElement();
			String value = bundle.getString(key);
			properties.put(key,value);
			if (key.indexOf(".") > -1)
			{
				String key1 = key.replaceAll("\\.","_");
				properties.put(key1,value);
			}
		}
		addBundleNames(bundle);
	}
	
	/**
	 * add the bundleNames
	 * @param bundle
	 */
	private void addBundleNames(WbemSmtResourceBundle bundle) {

		List bundleNameList = new ArrayList();
		for (int i = 0; bundleNames != null && i < bundleNames.length; i++) {
			bundleNameList.add(bundleNames[i]);
		}
		
		for (int i = 0; i < bundle.getBundleNames().length; i++) {
			String newName = bundle.getBundleNames()[i];
			if (!bundleNameList.contains(newName))
			{
				bundleNameList.add(newName);
			}
		}
		
		bundleNames = (String[]) bundleNameList.toArray(new String[bundleNameList.size()]);
		
	}

	public String getString(String key)
	{
		String defaultValue = null;
		return getString(key,defaultValue);
	}
	
	public String getString(MessageNumber messageNumber, String key)
	{
		String defaultValue = null;
		key = messageNumber.getResourceBundleKey() + "." + key;
		return getString(key,defaultValue);
	}

	public String getString(String key, String defaultValue)
	{
		if (key == null)
		{
			key = TOKEN_EMPTY;
		}
		String firstKey = key;
		String value = properties.getProperty(key);
		if (value == null)
		{
			if (mode == MODE_EXCEPTION_FOR_MISSING_KEY_AND_USE_KEY_PARTS
				|| mode == MODE_INDICATION_FOR_MISSING_KEY_AND_USE_KEY_PARTS)
			{
				int index = -1;
				while (value == null && (index = key.indexOf(".")) > -1)
				{
					key = key.substring(index+1);
					value = properties.getProperty(key);
				}
			}
			if (value == null) {
				if (mode == MODE_EXCEPTION_FOR_MISSING_KEY_AND_USE_KEY_PARTS
					|| mode == MODE_EXCEPTION_FOR_MISSING_KEY) 
				{
					throw new MissingResourceException("Cannot find resource",WbemSmtResourceBundle.class.getName(),firstKey);
				}
				else
				{
					//if for a command therese a key Container.Field.argValue try to get the Fieldname as replacement for the ArgValue
					if (firstKey.endsWith(SUFFIX_ARGVALUE))
					{
						firstKey = firstKey.substring(0,firstKey.length()-SUFFIX_ARGVALUE.length());
						return getString(firstKey);
					}
					else
					{
						System.err.println("Key " + firstKey +  " not found");
						ResourceBundleManager.writeMissingTranslation(firstKey);
						return defaultValue != null ? defaultValue : "???" + firstKey + "???";
					}
				}
			}
		}
		
		if (value != null && value.indexOf(TOKEN_EMPTY) > -1)
		{
			value = "";
		}
		
		return value;
		
	}
	
	/**
	 * formats a message format string
	 * @param key
	 * @param objects
	 * @return
	 */
	public String getString(String key, Object[] objects) {
		String value = getString(key);
		return MessageFormat.format(value,objects);
	}
	
	/**
	 * formats a message format string
	 * @param key
	 * @param objects
	 * @return
	 */
	public String getString(MessageNumber messageNumber, String key, Object[] objects) {
		key = messageNumber.getResourceBundleKey() + "." + key;
		String value = getString(key);
		return MessageFormat.format(value,objects);
	}

	static class Mode 
	{
		
	}

	public String[] getBundleNames() {
		return bundleNames;
	}

	public void setBundleNames(String[] bundleNames) {
		this.bundleNames = bundleNames;
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	public boolean containsKey(Object key) {
		return true;
	}

	public boolean containsValue(Object value) {
		return true;
	}

	public Object get(Object key) {
		return getString(key.toString());
	}

	public boolean keyExists(String key) {
		return keyExists(key,false);
	}

	public boolean keyExists(String key, boolean checkPartsString) {
		if (checkPartsString)
		{
			String value = properties.getProperty(key);
			int index = -1;
			while (value == null && (index = key.indexOf(".")) > -1)
			{
				key = key.substring(index+1);
				value = properties.getProperty(key);
			}
			return value != null;
		}
		else
		{
			return properties.getProperty(key) != null;
		}
	}

	public boolean isEmpty() {
		return properties.size() == 0;
	}
	
	public int size()
	{
		return properties.size();
	}
	
}
