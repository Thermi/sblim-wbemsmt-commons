 /** 
  * CliAsynchronousMessageHandler.java
  *
  * © Copyright IBM Corp. 2008
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
  * Description: handle for asynchronous messages within the command line interface
  * 
  */
package org.sblim.wbemsmt.bl.adapter;

import java.io.PrintWriter;

import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class CliAsynchronousMessageHandler implements AsynchronousMessageHandler {

    /* (non-Javadoc)
     * @see org.sblim.wbemsmt.bl.adapter.AsynchronousMessageHandler#addAsynchronousMessage(org.sblim.wbemsmt.bl.adapter.Message, java.lang.Object)
     */
    public void addAsynchronousMessage(Message msg, Object context) {
        
        PrintWriter cliOut = (PrintWriter) ((Object[])context)[0];
        PrintWriter cliErr = (PrintWriter) ((Object[])context)[1];
        WbemSmtResourceBundle bundle = (WbemSmtResourceBundle) ((Object[])context)[2];
        
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

}
