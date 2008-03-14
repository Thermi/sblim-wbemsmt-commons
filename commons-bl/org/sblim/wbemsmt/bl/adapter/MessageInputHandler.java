 /** 
  * MessageInputHandler.java
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
  * Description: Class which handles Input a user is doing within a message
  * 
  */
package org.sblim.wbemsmt.bl.adapter;

public interface MessageInputHandler {

    /**
     * handle the input done by the user within a message
     * @param event
     */
    void handleInput(MessageInputEvent event);

}
