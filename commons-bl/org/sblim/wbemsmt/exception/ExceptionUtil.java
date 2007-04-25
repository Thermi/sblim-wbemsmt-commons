 /** 
  * ExceptionUtil.java
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
  * Description: Class for handling Exceptions
  * 
  */
package org.sblim.wbemsmt.exception;

import java.net.UnknownHostException;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.sblim.wbem.cim.CIMException;
import org.sblim.wbemsmt.bl.ErrCodes;
import org.sblim.wbemsmt.bl.MessageNumber;
import org.sblim.wbemsmt.bl.adapter.Message;
import org.sblim.wbemsmt.tools.cli.CimCommand;
import org.sblim.wbemsmt.tools.jsf.JsfUtil;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;


public class ExceptionUtil {

	/**
	 * 
	 */
	public ExceptionUtil() {
		super();
		
	}

	public static Throwable findDeepest(Class exceptionClass, Throwable t) {
		
		Throwable result = null;
		Throwable cause = t;
		while (cause != null)
		{
			if (exceptionClass.isInstance(cause))
			{
					result = cause;
			}
			cause = cause.getCause();
		}
		return result;
	}

	/**
	 * Gets an Exception text for the Enduser
	 * 
	 * @param originalException
	 * @param currentLocale
	 * @param bundle
	 * @param taskBundle is only used if the fco in wbemsmtExceptionCause != null and  
	 * @param wbemsmtExceptionCause
	 * @param level Level to log the information if set to null default is SEVERE. For example the Commandline is using logging with level INFO to console. And Error Messages have to be &lt; error to be not shown  
	 * @param lineSeparator the separator character. If null space is used.
	 * @return
	 */
	
	public static Message getEnduserExceptionText(Throwable originalException, Locale currentLocale, WbemSmtResourceBundle bundle, WbemSmtResourceBundle taskBundle, WbemSmtException wbemsmtExceptionCause, Level level, String lineSeparator) {

		level = level == null ? Level.SEVERE : level;
		lineSeparator = lineSeparator == null ? " " : lineSeparator;
		
		String prefix = "errorMessage.";
		String prefixObjectname = "objectname.";
		
		Logger logger = Logger.getLogger(ExceptionUtil.class.getName());
		logger.log(Level.SEVERE,"",originalException);
		
		//then for the deepest CIMException
		CIMException cimException = (CIMException) findDeepest(CIMException.class, originalException);
	
		MessageNumber messageNumber = ErrCodes.getMessageNumber(wbemsmtExceptionCause);
	
		
		StringBuffer exceptionText = new StringBuffer();
		if (wbemsmtExceptionCause != null)
		{
			String objectText = null;
			
			//check if the exception is having a cimObject associated
			if (wbemsmtExceptionCause.getCIM_Object() != null && wbemsmtExceptionCause.getCIM_Object().getWrappedObject() != null)
			{
				objectText = taskBundle.getString(prefixObjectname + wbemsmtExceptionCause.getCIM_Object().getWrappedObject().getClass().getName());
				logger.log(level,"Related CIM Element: " + wbemsmtExceptionCause.getCIM_Object());
			}
			else if (wbemsmtExceptionCause.getCimIdentifier() != null)
			{
				objectText = wbemsmtExceptionCause.getCimIdentifier();
				logger.log(level,"Related CIM Element: " + objectText);
			}
			else if (wbemsmtExceptionCause instanceof LoginException && cimException.getCause() instanceof UnknownHostException)
			{
				UnknownHostException hostException = (UnknownHostException)cimException.getCause();
				objectText = hostException.getMessage();
				logger.log(level,"Host not found: " + objectText);
			}
			else
			{
				objectText = bundle.getString(prefix + "theObject");
			}
			
			if (bundle.keyExists(prefix + wbemsmtExceptionCause.getClass().getName()))
			{
				exceptionText.append( bundle.getString(prefix + wbemsmtExceptionCause.getClass().getName(), new Object[]{objectText}));
			}
			else
			{
				exceptionText.append( bundle.getString(prefix + "otherExceptions"));
			}
		} 
		else
		{
			exceptionText.append(bundle.getString("internal.error"));
		}
		exceptionText.append(lineSeparator);
		
		StringBuffer reasonText = new StringBuffer();
		if (cimException != null)
		{
			reasonText.append(" " + bundle.getString("reason") + ": ");
			if (bundle.keyExists(prefix + cimException.getID()))
			{
				reasonText.append( bundle.getString(prefix + cimException.getID()));
			}
			else
			{
				reasonText.append( bundle.getString(prefix + "OTHER_CIM_ERR"));
			}
		}
	
		String msg = exceptionText.toString() + (cimException != null ? reasonText.toString() : "");
		return new Message(messageNumber,Message.ERROR,msg);
	}

	public static void handleException(Throwable t) {
		if (RuntimeUtil.getInstance().isJSF())
		{
			JsfUtil.handleException(t);
		}
		else if (RuntimeUtil.getInstance().isCommandline())
		{
			//first search for the deepest WbemSmtException
			WbemSmtException smtException = (WbemSmtException) ExceptionUtil.findDeepest(WbemSmtException.class, t);
			WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(new String[]{"messages"});
			Message msg = ExceptionUtil.getEnduserExceptionText(t, Locale.getDefault(), bundle , bundle, smtException, Level.FINE, "\n");
			System.err.println(bundle.getString("error.while.execution") + "\n" + msg.getMessageString());
		}
	}
	
	public static boolean isHavingErrors()
	{
		if (RuntimeUtil.getInstance().isJSF())
		{
			return JsfUtil.havingErrors();
		}
		else if (RuntimeUtil.getInstance().isCommandline())
		{
			return CimCommand.getCurrentCommand() != null ? CimCommand.getCurrentCommand().getErrorCount() > 0 : false;  
		}
		return false;
	}
	
}
