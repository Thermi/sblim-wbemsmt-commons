 /** 
  * MessageUtil.java
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
  * Description: Utility class for Messages
  * 
  */
package org.sblim.wbemsmt.bl.adapter;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.MessageNumber;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.jsf.WbemsmtFacesMessage;
import org.sblim.wbemsmt.tools.resources.ILocaleManager;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

/**
 * @author Bauschert
 *
 */
public class MessageUtil {

	public static void addMessage(MessageNumber msgNumber, String level, String[] bundles, String key, Object[] objects)
	{
		if (RuntimeUtil.getInstance().isJSF())
		{
			ILocaleManager localeManager = (ILocaleManager) BeanNameConstants.LOCALE_MANAGER.getBoundValue(FacesContext.getCurrentInstance());
			WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(bundles,localeManager.getCurrentLocale());
			FacesContext.getCurrentInstance().addMessage(null, new WbemsmtFacesMessage(Message.create(msgNumber, level, bundle, key,objects)));
		}
		else if (RuntimeUtil.getInstance().isCommandline())
		{
			WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(bundles);
			Message msg = Message.create(msgNumber, level, bundle, key,objects);
			System.err.println(bundle.getString("error.while.execution") + "\n" + msg.getMessageString());
		}
	}
	
	public static void addMessage(MessageNumber msgNumber, String level, String[] bundles, String key) {
		addMessage(msgNumber, level, bundles, key,null);
	}

	public static void addMessage(MessageDefinition messageDefinition, String[] bundles)
	{
		addMessage(messageDefinition,bundles,null);
	}
	public static void addMessage(MessageDefinition messageDefinition, String[] bundles, Object[] objects)
	{
		if (RuntimeUtil.getInstance().isJSF())
		{
			ILocaleManager localeManager = (ILocaleManager) BeanNameConstants.LOCALE_MANAGER.getBoundValue(FacesContext.getCurrentInstance());
			WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(bundles,localeManager.getCurrentLocale());
			FacesContext.getCurrentInstance().addMessage(null, new WbemsmtFacesMessage(Message.create(messageDefinition, bundle, objects)));
		}
		else if (RuntimeUtil.getInstance().isCommandline())
		{
			WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(bundles);
			Message msg = Message.create(messageDefinition, bundle, objects);
			System.err.println(bundle.getString("error.while.execution") + "\n" + msg.getMessageString());
		}
	}
	
}
