/** 
 * JsfBase.java
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
 * Description: BaseClass for BackingBeans in the wbemsmt taskLauncher
 * 
 */
package org.sblim.wbemsmt.tools.jsf;

import java.util.Iterator;
import java.util.Locale;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.Message;
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.tools.resources.ILocaleManager;
import org.sblim.wbemsmt.tools.resources.LocaleChangeListener;
import org.sblim.wbemsmt.tools.resources.LocaleManager;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class JsfBase {

	protected WbemSmtResourceBundle bundle;

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
	
	
	public static void addMessage(Message message) {
		FacesContext facesContext = FacesContext.getCurrentInstance();
		facesContext.addMessage(null,new WbemsmtFacesMessage(message));
	}

	/**
	 * Prints the title with the given severity and the Messages in the List.
	 * If the list is empty nothing is printed, including the title 
	 * @param messages
	 * @param alwaysPrintTitle Always print the the tile even if the messages-List is empty or null
	 * @param severity
	 * @param title
	 * @param bundle
	 */
	public static void addMessages(Message titleMessage, MessageList messages, boolean alwaysPrintTitle) {
		
		if (alwaysPrintTitle || !alwaysPrintTitle && messages != null && messages.size() > 0)
		{
			addMessage(titleMessage);
		}
		addMessages(messages);

		
	}

	/**
	 * add all messages in the list 
	 * @param severity
	 * @param title
	 * @param messages
	 * @param bundle
	 */
	public static void addMessages(MessageList messages) {
		
		if (messages != null && messages.size() > 0)
		{
			for (Iterator iter = messages.iterator(); iter.hasNext();) {
				Message msgObject = (Message) iter.next();
				addMessage(msgObject);
			}
			
		}
		
	}
	
	
//	private static Severity getSeverity(Message msgObject) {
//		String type = msgObject.getType();
//		if (type == Message.INFO || type == Message.SUCCESS)
//		{
//			return FacesMessage.SEVERITY_INFO;
//		}
//		else if (type == Message.WARNING)
//		{
//			return FacesMessage.SEVERITY_WARN;
//		}
//		else if (type == Message.ERROR)
//		{
//			return FacesMessage.SEVERITY_ERROR;
//		}
//		return FacesMessage.SEVERITY_FATAL;
//	}

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
