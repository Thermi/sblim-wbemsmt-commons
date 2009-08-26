 /** 
  * UserdefinedException.java
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
  * Description: Exceptions with a UserObject that can be used to create custom exception messages<br>
  * <br>
  * first the method getMessage is called to retrieve the custom message.<br>
  * <br>
  * After that the method addCIMExceptionCause is called to find out if to add the CIMException cause (if there is any)
  * 
  * 
  */
package org.sblim.wbemsmt.exception.impl;

import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public interface UserObjectExceptionIf {
    
    /**
     * retrieve the Text for the exception
     * @param bundle the ResourceBundle for the common application
     * @return
     */
    public Message getMessage(WbemSmtResourceBundle bundle);

    /**
     * Implementors should return true if after the creation of the message with getMessage the
     * WBEMException contained in the exception should be added
     * @return
     */
    public boolean addCIMExceptionCause();
}
