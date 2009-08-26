 /** 
  * MessageUtil.java
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
  * Description: Utility class for Message handling
  * 
  */
package org.sblim.wbemsmt.bl.messages;

import java.io.PrintWriter;
import java.io.Reader;
import java.text.MessageFormat;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.AsynchronousMessageHandler;
import org.sblim.wbemsmt.bl.adapter.CliAsynchronousMessageHandler;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.jsf.WbemsmtFacesMessage;
import org.sblim.wbemsmt.tools.resources.ILocaleManager;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;
import org.sblim.wbemsmt.webapp.jsf.MessageHandlerBean;

/**
 * Utility class for Message handling
 */
public final class MessageUtil {

    /**
     * Util classes having a private constructor
     */
    private MessageUtil(){}
    
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

    /**
     * add a new message to runtime specific context
     * @param msgNumber the message number 
     * @param type the severity ({@link Message#SUCCESS},{@link Message#INFO},{@link Message#WARNING},{@link Message#ERROR})
     * @param bundles the resource bundle names
     * @param key the resource bundle key
     * @param objects object that are used to be inserted in the translated message (by using {@link MessageFormat}
     */
    public static void addMessage(MessageNumber msgNumber, String type, String[] bundles, String key, Object[] objects)
	{
		addMessageImpl(msgNumber, type, bundles, key, objects);
	}

    /**
     * add a new message to runtime specific context
     * @param msgNumber the message number 
     * @param type the severity ({@link Message#SUCCESS},{@link Message#INFO},{@link Message#WARNING},{@link Message#ERROR})
     * @param bundles the resource bundle names
     * @param key the resource bundle key
     */
	public static void addMessage(MessageNumber msgNumber, String type, String[] bundles, String key) {
		addMessage(msgNumber, type, bundles, key,null);
	}

    /**
     * add a new message to runtime specific context
     * @param messageDefinition the static data of the message 
     * @param bundles the resource bundle names
     */
	public static void addMessage(MessageDefinition messageDefinition, String[] bundles)
	{
        MessageInputHandler handler = null;
		addMessage(messageDefinition,handler,bundles, null);
	}

	/**
     * add a new message to runtime specific context
     * @param messageDefinition the static data of the message 
     * @param bundles the resource bundle names
     * @param objects object that are used to be inserted in the translated message (by using {@link MessageFormat}
     */
	public static void addMessage(MessageDefinition messageDefinition, String[] bundles, Object[] objects)
    {
	    MessageInputHandler handler = null;
        addMessage(messageDefinition, handler, bundles, objects);
    }

    /**
     * add a new message to runtime specific context
     * @param messageDefinition the static data of the message
     * @param handler object to handle user input
     * @param bundles the resource bundle names
     * @param objects object that are used to be inserted in the translated message (by using {@link MessageFormat}
     */

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

    /**
     * add a new message to runtime specific context
     * @param messageDefinition the static data of the message
     * @param bundle the resource bundle
     */
    public static void addMessage(MessageDefinition messageDefinition, WbemSmtResourceBundle bundle)
	{
        addMessageImpl(messageDefinition,null,bundle,null);
	}
    /**
     * add a new message to runtime specific context
     * @param messageDefinition the static data of the message
     * @param bundle the resource bundle
     * @param objects object that are used to be inserted in the translated message (by using {@link MessageFormat}
     */
	public static void addMessage(MessageDefinition messageDefinition, WbemSmtResourceBundle bundle, Object[] objects)
	{
		
	    addMessageImpl(messageDefinition, null,bundle,objects);
	}

    /**
     * add a new message to runtime specific context
     * @param messageDefinition the static data of the message
     * @param handler object to handle user input
     * @param bundle the resource bundle
     * @param objects object that are used to be inserted in the translated message (by using {@link MessageFormat}
     */
    public static void addMessage(MessageDefinition messageDefinition,  MessageInputHandler handler, WbemSmtResourceBundle bundle, Object[] objects)
    {
        addMessageImpl(messageDefinition, handler, bundle, objects);
    }

    /**
     * add a new asychronous message to the runtime specific context
     * @param messageDefinition the static data of the message
     * @param bundle the resource bundle
     * @param objects object that are used to be inserted in the translated message (by using {@link MessageFormat}
     * @param msgHandler object to add the asychronous message
     * @see CliAsynchronousMessageHandler
     * @see MessageHandlerBean
     */

    public static void addAsynchronousMessage(MessageDefinition messageDefinition, WbemSmtResourceBundle bundle, Object[] objects, AsynchronousMessageHandler msgHandler)
    {
        addAsynchronousMessageImpl(messageDefinition, null, bundle, objects,msgHandler);
    }

    /**
     * add a new asychronous message to the runtime specific context
     * @param messageDefinition the static data of the message
     * @param handler object to handle user input
     * @param bundle the resource bundle
     * @param objects object that are used to be inserted in the translated message (by using {@link MessageFormat}
     * @param msgHandler object to add the asychronous message
     * @see CliAsynchronousMessageHandler
     * @see MessageHandlerBean
     */
    public static void addAsynchronousMessage(MessageDefinition messageDefinition, MessageInputHandler handler, WbemSmtResourceBundle bundle, Object[] objects, AsynchronousMessageHandler msgHandler)
    {
        addAsynchronousMessageImpl(messageDefinition, handler, bundle, objects,msgHandler);
    }
    
    /**
     * add a new message to runtime specific context
     * @param messageDefinition the static data of the message
     * @param handler object to handle user input
     * @param bundle the resource bundle
     * @param objects object that are used to be inserted in the translated message (by using {@link MessageFormat}
     */    
    private static void addMessageImpl(MessageDefinition messageDefinition, MessageInputHandler handler, WbemSmtResourceBundle bundle, Object[] objects) {
        if (RuntimeUtil.getInstance().isJSF())
        {
            FacesContext.getCurrentInstance().addMessage(null, new WbemsmtFacesMessage(Message.create(messageDefinition, handler, bundle, objects)));
        }
        else if (RuntimeUtil.getInstance().isCommandline())
        {
            Message msg = Message.create(messageDefinition, handler, bundle, objects);
            printMessageOnConsole(bundle, msg);
        }
    }
    
    /**
     * add a new message to runtime specific context
     * @param messageDefinition the static data of the message
     * @param handler object to handle user input
     * @param bundle the resource bundle
     * @param objects object that are used to be inserted in the translated message (by using {@link MessageFormat}
     * @param msgHandler object to add the asychronous message
     */    
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
    
    /**
     * add a new message to runtime specific context
     * @param msgNumber the message number 
     * @param type the severity ({@link Message#SUCCESS},{@link Message#INFO},{@link Message#WARNING},{@link Message#ERROR})
     * @param bundles the resource bundle names
     * @param key the resource bundle key
     * @param objects object that are used to be inserted in the translated message (by using {@link MessageFormat}
     */
    private static void addMessageImpl(MessageNumber msgNumber, String type, String[] bundles,
            String key, Object[] objects) {
        if (RuntimeUtil.getInstance().isJSF())
        {
            ILocaleManager localeManager = (ILocaleManager) BeanNameConstants.LOCALE_MANAGER.getBoundValue(FacesContext.getCurrentInstance());
            WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(bundles,localeManager.getCurrentLocale());
            FacesContext.getCurrentInstance().addMessage(null, new WbemsmtFacesMessage(Message.create(msgNumber, type, bundle, key,objects)));
        }
        else if (RuntimeUtil.getInstance().isCommandline())
        {
            WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(bundles);
            Message msg = Message.create(msgNumber, type, bundle, key,objects);
            printMessageOnConsole(bundle, msg);
        }
    }    

    /**
     * for commandline<br>
     * print the message on the console
     * @param bundle the bundle for translating common captions<br>
     * - 'error.while.execution'<br>
     * - 'warning.while.execution'<br>
     * @param msg the message to print
     */
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
     * @param out the system out
     * @param err the error out
     * @param in system in
     */
    public static void setCliChannels(PrintWriter out, PrintWriter err, Reader in) {
        MessageUtil.cliOut = out;
        MessageUtil.cliErr = err;
        MessageUtil.cliIn = in;
    }
	
}
