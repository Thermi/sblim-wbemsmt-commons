 /** 
  * WbemsmtWebAppBean.java
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
  * Description: base class for wbemsmt backing beans
  * 
  */
package org.sblim.wbemsmt.webapp.jsf;

import java.util.Locale;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.resources.*;

public abstract class WbemsmtWebAppBean
{
    protected WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(FacesContext.getCurrentInstance(),getClass().getClassLoader());
    
    public WbemsmtWebAppBean()
    {
    	WbemSmtResourceBundle bundleMessages = ResourceBundleManager.getResourceBundle(new String[]{"messages"},LocaleManager.getCurrent(FacesContext.getCurrentInstance()).getCurrentLocale());
    	bundle.add(bundleMessages);
    	
    	FacesContext fc = FacesContext.getCurrentInstance();
		ILocaleManager localeManager = (ILocaleManager) BeanNameConstants.LOCALE_MANAGER.asValueExpression(fc).getValue(fc.getELContext());
		localeManager.addLocaleChangeListener(new LocaleChangeListener()
		{
			public void localeChanged(Locale newLocale)
			{
				bundle = ResourceBundleManager.getResourceBundle(FacesContext.getCurrentInstance());

				WbemSmtResourceBundle bundleMessages = ResourceBundleManager.getResourceBundle(new String[]{"messages"},newLocale);
		    	bundle.add(bundleMessages);
			}
		});
    	
	}

}
