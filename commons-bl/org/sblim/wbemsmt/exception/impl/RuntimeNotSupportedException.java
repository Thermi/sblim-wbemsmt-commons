 /** 
  * RuntimeNotSupportedException.java
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
  * Description: Exception for not supported runtimes
  * 
  */
package org.sblim.wbemsmt.exception.impl;

import org.sblim.wbemsmt.bl.messages.ErrCodes;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.exception.ErrorCodeForUserException;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.exception.impl.userobject.RuntimeNotSupportedUserObject;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class RuntimeNotSupportedException extends WbemsmtException implements UserObjectExceptionIf {

    /**
     * 
     */
    private static final long serialVersionUID = 7554333135285266702L;

    private static final ErrorCodeForUserException ERRORCODE = WbemsmtException.ERR_RUNTIME_NOT_SUPPORTED;
    /**
     * @param errorCode
     * @param msg
     */
    public RuntimeNotSupportedException(RuntimeNotSupportedUserObject userObject) {
        super(null,"Runtime not supported");
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    public Message getMessage(WbemSmtResourceBundle bundle) {
        RuntimeNotSupportedUserObject userObject = (RuntimeNotSupportedUserObject) getUserObject();
        return Message.create(ErrCodes.MSGDEF_RUNTIME_NOT_SUPPORTED, bundle, new Object[]{userObject.getRuntimeMode()});
    }    
    
    public boolean addCIMExceptionCause() {
        return false;
    }
    
    
}
