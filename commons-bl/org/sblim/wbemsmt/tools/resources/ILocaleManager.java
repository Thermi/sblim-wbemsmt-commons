 /** 
  * ILocaleManager.java
  *
  * © Copyright IBM Corp.  2009,2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Eclipse Public License from
  * http://www.opensource.org/licenses/eclipse-1.0.php
  *
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Interface for LocaleManger (to manage the user session's locale)
  * 
  */
package org.sblim.wbemsmt.tools.resources;

import java.util.Locale;

public interface ILocaleManager {

	public void setCurrentLocale(Locale newLocale);
	public Locale getCurrentLocale();
	public void addLocaleChangeListener(LocaleChangeListener listener);
	public void removeLocaleChangeListener(LocaleChangeListener listener);
	public void addResourceBundleEntry(String appName, String[] bundles);
}
