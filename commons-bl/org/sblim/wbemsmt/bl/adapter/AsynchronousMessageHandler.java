 /** 
  * AsynchronousMessageHandler.java
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
  * Description: Class to handle Asynchronous messages
  * 
  */
package org.sblim.wbemsmt.bl.adapter;

import org.sblim.wbemsmt.bl.messages.Message;


/**
 * Class to handle Asynchronous messages
 * @see MessageHandlerBean
 * @see CliAsynchronousMessageHandler
 */
public interface AsynchronousMessageHandler {

    /**
     * Add the asynchronous message
     * @param message the message to add
     * @param context the context where to add the message<br>
     * for JSF: null<br>
     * for cli: Object[]{PrintWriter out, PrinterWriter err, WbemSmtResourceBundle bundle}
     */
    void addAsynchronousMessage(Message message, Object context);

}
