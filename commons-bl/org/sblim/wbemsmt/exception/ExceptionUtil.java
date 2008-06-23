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

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.cim.CIMInstance;
import javax.wbem.WBEMException;

import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco;
import org.sblim.wbemsmt.bl.messages.ErrCodes;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.exception.impl.UserObjectExceptionIf;
import org.sblim.wbemsmt.tools.cli.CimCommand;
import org.sblim.wbemsmt.tools.cli.CliLocaleManager;
import org.sblim.wbemsmt.tools.jsf.JsfUtil;
import org.sblim.wbemsmt.tools.resources.ILocaleManager;
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
	 * @param wbemsmtExceptionCause
	 * @param level Level to log the information if set to null default is SEVERE. For example the Commandline is using logging with level INFO to console. And Error Messages have to be &lt; error to be not shown  
	 * @param lineSeparator the separator character. If null space is used.
	 * @return
	 */
	
	public static Message getEnduserExceptionText(Throwable originalException, Locale currentLocale, WbemSmtResourceBundle bundle, WbemsmtException wbemsmtExceptionCause, Level level, String lineSeparator) {

	    Logger logger = Logger.getLogger(ExceptionUtil.class.getName());

	    level = level == null ? Level.SEVERE : level;
        logger.log(Level.SEVERE,"",originalException);

        lineSeparator = lineSeparator == null ? " " : lineSeparator;
		
		WBEMException cimException = (WBEMException) findDeepest(WBEMException.class, originalException);
        WbemsmtException wbemsmtException = (WbemsmtException) findDeepest(WbemsmtException.class, originalException);
	
		//handle the WbemsmtExceptions that are containing an userObject -> UserObjectExceptionIf
        Message message = null;
		if (wbemsmtException instanceof UserObjectExceptionIf)
		{
		    UserObjectExceptionIf userObjectException = ((UserObjectExceptionIf)wbemsmtException);
            message = userObjectException.getMessage(bundle);
            if (userObjectException.addCIMExceptionCause())
            {
                message = wbemsmtException.addCIMExceptionToMessageText(bundle, message);
            }
		}
		//handle all other standard wbemsmt Exceptions
		else if (wbemsmtException != null)
		{
		    int counter = 1;
		    StringBuffer instances = new StringBuffer();
		    for (int i = 0; wbemsmtException.getFco() != null &&  i < wbemsmtException.getFco().length; i++) {
                AbstractWbemsmtFco fco = wbemsmtException.getFco()[i];
                instances
                    .append(lineSeparator)
                    .append(lineSeparator)
                    .append(bundle.getString("instance.nr",new Object[]{"" + (counter++)})).append(lineSeparator)
                    .append(fco.getCimInstance().toString());
            }

		    for (int i = 0; wbemsmtException.getInstances() != null && i < wbemsmtException.getInstances().length; i++) {
                CIMInstance cimInstance = wbemsmtException.getInstances()[i];
                instances
                    .append(lineSeparator)
                    .append(lineSeparator)
                    .append(bundle.getString("instance.nr",new Object[]{"" + (counter++)})).append(lineSeparator)
                    .append(cimInstance.toString());
            }
		    
		    message = ErrCodes.getMessage(wbemsmtException, bundle, instances.toString(), cimException);
		}
		else
		{
		    message = ErrCodes.getMessage(originalException);
		}
		
		return message;
	}

	public static void handleException(Throwable t) {
	    handleException(t,new PrintWriter(new OutputStreamWriter(System.err)));
	}
	
	/**
	 * handle the Exception
	 * @param t
	 * @param err only used for Commandline runtime mode, if null System.err is used
	 */
    public static void handleException(Throwable t, PrintWriter err) {
        if (RuntimeUtil.getInstance().isJSF())
        {
            JsfUtil.handleException(t);
        }
        else if (RuntimeUtil.getInstance().isCommandline())
        {
            //first search for the deepest WbemsmtException
            ILocaleManager localeManager = (ILocaleManager) CliLocaleManager.getInstance();
            WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(new String[]{"messages"},localeManager.getCurrentLocale());

            //first search for the deepest WbemsmtException
            WbemsmtException smtException = (WbemsmtException) ExceptionUtil.findDeepest(WbemsmtException.class, t);
            Message msg = ExceptionUtil.getEnduserExceptionText(t, Locale.getDefault(), bundle , smtException, Level.FINE, "\n");
            String errText = bundle.getString("error.while.execution") + "\n" + msg.getMessageString();
            if (err != null)
            {
                err.println(errText);
            }
            else
            {
                System.err.println(errText);
            }
            
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
