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

import java.util.Locale;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

public class LocaleManager {

	public static ILocaleManager getCurrent(FacesContext fc)
	{
		ILocaleManager localeManager = (ILocaleManager) BeanNameConstants.LOCALE_MANAGER.asValueBinding(fc).getValue(fc);
		return localeManager;
	}

	/**
	 * Gets the current locale
	 * in JSF the FacesContext.currentLocale is used
	 * For other PresentationLayer the Default Locale of the VM is used
	 * @return
	 */
	public static Locale getCurrentLocale() {
		
		if (RuntimeUtil.getInstance().isJSF())
		{
			return getCurrent(FacesContext.getCurrentInstance()).getCurrentLocale();
		}
		else
		{
			return Locale.getDefault();
		}
	}
	
	
}
