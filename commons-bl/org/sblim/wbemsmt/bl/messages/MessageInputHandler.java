 /** 
  * MessageInputHandler.java
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
  * Description: Class which handles Input a user is doing within a message
  * 
  */
package org.sblim.wbemsmt.bl.messages;
/**
 * Class which handles Input a user is doing within a message
 */
public interface MessageInputHandler {

    /**
     * handle the input done by the user within a message
     * @param event the event triggered by the user
     */
    void handleInput(MessageInputEvent event);

}
