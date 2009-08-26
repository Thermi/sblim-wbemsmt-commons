 /** 
  * CliAsynchronousMessageHandler.java
  *
  * © Copyright IBM Corp.  2009,2008
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
  * Description: handler for asynchronous messages within the command line interface
  * 
  */
package org.sblim.wbemsmt.bl.adapter;

import java.io.PrintWriter;

import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

/**
 * handler for asynchronous messages within the command line interface
 */
public class CliAsynchronousMessageHandler implements AsynchronousMessageHandler {

    /**
     * Add the asynchronous message
     * @param message the message to add
     * @param context the context where to add the message<br>
     * for cli: Object[]{PrintWriter out, PrinterWriter err, WbemSmtResourceBundle bundle}
     * @see org.sblim.wbemsmt.bl.adapter.AsynchronousMessageHandler#addAsynchronousMessage(org.sblim.wbemsmt.bl.messages.Message, java.lang.Object)
     */
    public void addAsynchronousMessage(Message message, Object context) {
        
        PrintWriter cliOut = (PrintWriter) ((Object[])context)[0];
        PrintWriter cliErr = (PrintWriter) ((Object[])context)[1];
        WbemSmtResourceBundle bundle = (WbemSmtResourceBundle) ((Object[])context)[2];
        
        if (message.isError())
        {
            cliErr.println(bundle.getString("error.while.execution") + "\n" + message.getMessageString());
        }
        else if (message.isError())
        {
            cliErr.println(bundle.getString("warning.while.execution") + "\n" + message.getMessageString());
        }
        else
        {
            cliOut.println(bundle.getString("error.while.execution") + "\n" + message.getMessageString());
        }
    }

}
