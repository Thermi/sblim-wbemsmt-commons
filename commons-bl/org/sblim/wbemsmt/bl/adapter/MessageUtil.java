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

import java.io.PrintWriter;
import java.io.Reader;

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

    /**
     * Writer which maps to standard out
     */
    protected static PrintWriter cliOut;
    /**
     * Writer which maps to standard err
     */
	protected static PrintWriter cliErr;
    /**
     * Writer which maps to standard in
     */
    protected static Reader cliIn;

    public static void addMessage(MessageNumber msgNumber, String level, String[] bundles, String key, Object[] objects)
	{
		addMessageImpl(msgNumber, level, bundles, key, objects);
	}
	
	public static void addMessage(MessageNumber msgNumber, String level, String[] bundles, String key) {
		addMessage(msgNumber, level, bundles, key,null);
	}

	public static void addMessage(MessageDefinition messageDefinition, String[] bundles)
	{
        MessageInputHandler handler = null;
		addMessage(messageDefinition,handler,bundles, null);
	}
	public static void addMessage(MessageDefinition messageDefinition, String[] bundles, Object[] objects)
    {
	    MessageInputHandler handler = null;
        addMessage(messageDefinition, handler, bundles, objects);
    }

    public static void addMessage(MessageDefinition messageDefinition, MessageInputHandler handler, String[] bundles, Object[] objects)
	{
		if (RuntimeUtil.getInstance().isJSF())
		{
			ILocaleManager localeManager = (ILocaleManager) BeanNameConstants.LOCALE_MANAGER.getBoundValue(FacesContext.getCurrentInstance());
			WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(bundles,localeManager.getCurrentLocale());
			addMessageImpl(messageDefinition, handler,bundle,objects);
		}
		else if (RuntimeUtil.getInstance().isCommandline())
		{
			WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(bundles);
			addMessageImpl(messageDefinition, handler,bundle,objects);
		}
	}

    public static void addMessage(MessageDefinition messageDefinition, WbemSmtResourceBundle bundle)
	{
        addMessageImpl(messageDefinition,null,bundle,null);
	}
	public static void addMessage(MessageDefinition messageDefinition, WbemSmtResourceBundle bundle, Object[] objects)
	{
		
	    addMessageImpl(messageDefinition, null,bundle,objects);
	}

    public static void addMessage(MessageDefinition messageDefinition,  MessageInputHandler handler, WbemSmtResourceBundle bundle, Object[] objects)
    {
        addMessageImpl(messageDefinition, handler, bundle, objects);
    }

    public static void addAsynchronousMessage(MessageDefinition messageDefinition, WbemSmtResourceBundle bundle, Object[] objects, AsynchronousMessageHandler msgHandler)
    {
        addAsynchronousMessageImpl(messageDefinition, null, bundle, objects,msgHandler);
    }

    public static void addAsynchronousMessage(MessageDefinition messageDefinition, MessageInputHandler handler, WbemSmtResourceBundle bundle, Object[] objects, AsynchronousMessageHandler msgHandler)
    {
        addAsynchronousMessageImpl(messageDefinition, handler, bundle, objects,msgHandler);
    }


    private static void addMessageImpl(MessageDefinition messageDefinition, MessageInputHandler handler, WbemSmtResourceBundle bundle, Object[] objects) {
        if (RuntimeUtil.getInstance().isJSF())
        {
            FacesContext.getCurrentInstance().addMessage(null, new WbemsmtFacesMessage(Message.create(messageDefinition, handler, bundle, objects)));
        }
        else if (RuntimeUtil.getInstance().isCommandline())
        {
            Message msg = Message.create(messageDefinition,handler, bundle, objects);
			printMessageOnConsole(bundle, msg);
		}
	}

    private static void addAsynchronousMessageImpl(MessageDefinition messageDefinition, MessageInputHandler handler, WbemSmtResourceBundle bundle, Object[] objects, AsynchronousMessageHandler msgHandler) {
        if (RuntimeUtil.getInstance().isJSF())
	{
            msgHandler.addAsynchronousMessage(Message.create(messageDefinition, handler, bundle, objects),null);
	}
        else if (RuntimeUtil.getInstance().isCommandline())
	{
            Message msg = Message.create(messageDefinition, handler, bundle, objects);
            msgHandler.addAsynchronousMessage(msg,new Object[]{cliOut,cliErr,bundle});
        }
    }
    
    private static void addMessageImpl(MessageNumber msgNumber, String level, String[] bundles,
            String key, Object[] objects) {
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
			printMessageOnConsole(bundle, msg);
		}
	}

    private static void printMessageOnConsole(WbemSmtResourceBundle bundle, Message msg) {
        if (msg.isError())
        {
            cliErr.println(bundle.getString("error.while.execution") + "\n" + msg.getMessageString());
        }
        else if (msg.isError())
        {
            cliErr.println(bundle.getString("warning.while.execution") + "\n" + msg.getMessageString());
        }
        else
        {
            cliOut.println(bundle.getString("error.while.execution") + "\n" + msg.getMessageString());
        }
    }

    /**
     * Set the reader and writers for the command line
     */
    public static void setCliChannels(PrintWriter out, PrintWriter err, Reader in) {
        MessageUtil.cliOut = out;
        MessageUtil.cliErr = err;
        MessageUtil.cliIn = in;
    }
	
}
