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

import java.util.Locale;

import javax.faces.context.FacesContext;
import javax.faces.el.ValueBinding;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.sblim.wbemsmt.bl.cleanup.Cleanup;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.resources.ILocaleManager;
import org.sblim.wbemsmt.tools.resources.LocaleManager;

public class LocaleManagerBean extends LocaleManager implements ILocaleManager, Cleanup
{
	public LocaleManagerBean()
	{
		HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		HttpSession session = request.getSession(true);
		currentLocale = (Locale) session.getAttribute("locale");
		if (currentLocale == null)
		{
			currentLocale = FacesContext.getCurrentInstance().getExternalContext().getRequestLocale();
		}
		
		//add the common resourceBundle and the packages for the CIM Schema
		addResourceBundleEntry("common", new String[]{"messages"});
		
		logger.info("Locale is " + currentLocale);
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
	
    public void setCurrentLocale(Locale newLocale) {
        if (!newLocale.toString().equals(currentLocale.toString()))
        {
            logger.info("Locale is " + newLocale);
            currentLocale = newLocale;
            HttpServletRequest request = (HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
//          request.getSession().invalidate();
            HttpSession session = request.getSession(true);
            session.setAttribute("locale",newLocale);
            sendEvent(newLocale);
            
            //do a reload
            reloadBundles();
            
            logger.info("Locale is " + currentLocale);
        }
    }
    
    public void setEnglish(ActionEvent event) {
        setCurrentLocale(Locale.ENGLISH);
    }

    public void setGerman(ActionEvent event) {
        setCurrentLocale(Locale.GERMAN);
    }
    
	
}
