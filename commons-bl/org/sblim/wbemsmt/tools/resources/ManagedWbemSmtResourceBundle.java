 /** 
  * ManagedWbemSmtResourceBundle.java
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
  * Description: Class that is managed in terms of reloading the bundle if the locale changes. Wrapper claas for WbemSmtResourceBundle
  * 
  */
package org.sblim.wbemsmt.tools.resources;

import java.util.Enumeration;
import java.util.Locale;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

public class ManagedWbemSmtResourceBundle extends WbemSmtResourceBundle implements LocaleChangeListener  {

	/**
	 * serial id
	 */
	private static final long serialVersionUID = 5170633780855553807L;
	private WbemSmtResourceBundle managedBundle;

	public ManagedWbemSmtResourceBundle(WbemSmtResourceBundle bundle) {
		this.managedBundle = bundle;
		if (RuntimeUtil.getInstance().isJSF())
        {
			ILocaleManager lm = (ILocaleManager) BeanNameConstants.LOCALE_MANAGER.getBoundValue(FacesContext.getCurrentInstance());
        	lm.addLocaleChangeListener(this);
        }
        else
        {
        	bundle = ResourceBundleManager.getResourceBundle(new String [] {"messages"});
        }
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tools.resources.LocaleChangeListener#localeChanged(java.util.Locale)
	 */
	public void localeChanged(Locale newLocale) {
		managedBundle = ResourceBundleManager.getResourceBundle(managedBundle.getBundleNames(),newLocale);
	}

	public WbemSmtResourceBundle getManagedBundle() {
		return managedBundle;
	}

	public String[] getBundleNames() {
		return managedBundle.getBundleNames();
	}

	public Enumeration getKeys() {
		return managedBundle.getKeys();
	}

	public String getString(String key, Object[] objects) {
		return managedBundle.getString(key, objects);
	}

	public String getString(String key) {
		return managedBundle.getString(key);
	}

	public boolean keyExists(String key, boolean checkPartsString) {
		return managedBundle.keyExists(key, checkPartsString);
	}

	public boolean keyExists(String key) {
		return managedBundle.keyExists(key);
	}

	public void setBundleNames(String[] bundleNames) {
		managedBundle.setBundleNames(bundleNames);
	}

	public void setLocale(Locale locale) {
		managedBundle.setLocale(locale);
	}

	public void setMode(Mode mode) {
		managedBundle.setMode(mode);
	}

	
	
	
}
