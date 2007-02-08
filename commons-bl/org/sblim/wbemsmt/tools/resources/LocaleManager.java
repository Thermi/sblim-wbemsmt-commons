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

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.tools.beans.BeanNameConstants;

public class LocaleManager {

	public static ILocaleManager getCurrent(FacesContext fc)
	{
		ILocaleManager localeManager = (ILocaleManager) BeanNameConstants.LOCALE_MANAGER.asValueBinding(fc).getValue(fc);
		return localeManager;
	}
}
