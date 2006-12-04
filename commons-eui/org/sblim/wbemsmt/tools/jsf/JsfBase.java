/** 
 * JsfBase.java
 *
 * (C) Copyright IBM Corp. 2005
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
 * Description: BaseClass for BackingBeans in the wbemsmt taskLauncher
 * 
 */
package org.sblim.wbemsmt.tools.jsf;

import java.util.Iterator;
import java.util.Locale;
import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.bl.adapter.MessageList.Message;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherController;
import org.sblim.wbemsmt.tools.resources.ILocaleManager;
import org.sblim.wbemsmt.tools.resources.LocaleChangeListener;
import org.sblim.wbemsmt.tools.resources.LocaleManager;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class JsfBase {

	protected WbemSmtResourceBundle bundle;

	protected static final Logger logger = TaskLauncherController.getLoggerFacesMessages();	
	
	public JsfBase(WbemSmtResourceBundle bundle)
	{
		this.bundle = bundle;
		
		ILocaleManager current = LocaleManager.getCurrent(FacesContext.getCurrentInstance());
		current.addLocaleChangeListener(new LocaleChangeListener()
		{
			public void localeChanged(Locale newLocale) {
				setBundle(ResourceBundleManager.getResourceBundle(getBundle().getBundleNames(),newLocale));
				reload();
			}
		});
		
	}
	
	
	public static void addInfo(String message) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_INFO,message,""));
	}

	public static void addError(String message, Throwable t) {
		t.printStackTrace();
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_FATAL,message,t.getMessage()));
	}

	public static void addError(String message) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_FATAL,message,""));
	}

	/**
	 * Prints the title with the given severity and the Messages in the List.
	 * If the list is empty nothing is printed, including the title 
	 * @param severity
	 * @param title
	 * @param messages
	 * @param bundle
	 */
	public static void addErrors(Severity severity, String title, MessageList messages,WbemSmtResourceBundle bundle) {
		
		if (messages != null && messages.size() > 0)
		{
			FacesContext facesContext = FacesContext.getCurrentInstance();
			facesContext.addMessage(null,new FacesMessage(severity,title,""));
			addErrors(messages,bundle);
		}
		
	}

	/**
	 * Prints the title as info-Messages and the Messages in the List.
	 * If the list is empty nothing is printed, including the title 
	 * @param title
	 * @param messages
	 * @param bundle
	 */
	public static void addErrors(String title, MessageList messages,WbemSmtResourceBundle bundle) {
		
		addErrors(FacesMessage.SEVERITY_INFO,title,messages,bundle);
	}

	/**
	 * Prints the Messages in the List.
	 * If the list is empty nothing is printed, including the title 
	 * @param title
	 * @param messages
	 * @param bundle
	 */
	public static void addErrors(MessageList messages,WbemSmtResourceBundle bundle) {
		
		if (messages != null && messages.size() > 0)
		{
			FacesContext facesContext = FacesContext.getCurrentInstance();
			
			for (Iterator iter = messages.iterator(); iter.hasNext();) {
				Message msgObject = (Message) iter.next();
				Severity severity = getSeverity(msgObject);
				facesContext.addMessage(null,new FacesMessage(severity,msgObject.toLocalizedString(bundle,false),""));
			}
		}
		
	}

	private static Severity getSeverity(Message msgObject) {
		String type = msgObject.getType();
		if (type == MessageList.INFO)
		{
			return FacesMessage.SEVERITY_INFO;
		}
		else if (type == MessageList.WARNING)
		{
			return FacesMessage.SEVERITY_WARN;
		}
		else if (type == MessageList.ERROR)
		{
			return FacesMessage.SEVERITY_ERROR;
		}
		return FacesMessage.SEVERITY_FATAL;
	}

	public WbemSmtResourceBundle getBundle() {
		return bundle;
	}


	public void setBundle(WbemSmtResourceBundle bundle) {
		this.bundle = bundle;
	}

	//called if the component should update it's components
	public void reload()
	{
		
	}
	

}
