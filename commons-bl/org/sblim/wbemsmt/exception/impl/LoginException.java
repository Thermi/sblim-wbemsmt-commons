 /** 
  * LoginException.java
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
  * Description: Exception for the Login process
  * 
  */
package org.sblim.wbemsmt.exception.impl;

import javax.cim.CIMInstance;

import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco;
import org.sblim.wbemsmt.bl.messages.ErrCodes;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.exception.ErrorCodeForUserException;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.exception.impl.userobject.LoginUserObject;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class LoginException extends WbemsmtException implements UserObjectExceptionIf {

    /**
     * 
     */
    private static final long serialVersionUID = 7554333135285266702L;

    /**
     * @param errorCode
     * @param msg
     */
    public LoginException(String msg,
            LoginUserObject userObject) {
        super(null, msg);
        setErrorCode(WbemsmtException.ERR_LOGIN);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param t
     */
    public LoginException(String msg, Throwable t,
            LoginUserObject userObject) {
        super(null, msg, t);
        setErrorCode(WbemsmtException.ERR_LOGIN);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param e
     */
    public LoginException(Throwable e,
            LoginUserObject userObject) {
        super(null, e);
        setErrorCode(WbemsmtException.ERR_LOGIN);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param fco
     */
    public LoginException(String msg, AbstractWbemsmtFco fco,
            LoginUserObject userObject) {
        super(null, msg, fco);
        setErrorCode(WbemsmtException.ERR_LOGIN);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param fco
     */
    public LoginException(String msg, AbstractWbemsmtFco[] fco,
            LoginUserObject userObject) {
        super(null,msg, fco);
        setErrorCode(WbemsmtException.ERR_LOGIN);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param fco
     * @param t
     */
    public LoginException(String msg, AbstractWbemsmtFco fco,
            Throwable t,
            LoginUserObject userObject) {
        super(null, msg, fco, t);
        setErrorCode(WbemsmtException.ERR_LOGIN);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param fco
     * @param t
     */
    public LoginException(ErrorCodeForUserException errorCode, String msg,
            AbstractWbemsmtFco[] fco, Throwable t,
            LoginUserObject userObject) {
        super(null, msg, fco, t);
        setErrorCode(WbemsmtException.ERR_LOGIN);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param fco
     * @param throwable
     */
    public LoginException(AbstractWbemsmtFco fco,
            Throwable throwable,
            LoginUserObject userObject) {
        super(null, fco, throwable);
        setErrorCode(WbemsmtException.ERR_LOGIN);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param fco
     * @param throwable
     */
    public LoginException(AbstractWbemsmtFco[] fco,
            Throwable throwable,
            LoginUserObject userObject) {
        super(null, fco, throwable);
        setErrorCode(WbemsmtException.ERR_LOGIN);
        setUserObject(userObject);
    }

    /**
     * @param msg
     * @param instances
     * @param throwable
     * @param userObject
     */
    public LoginException(String msg, CIMInstance[] instances, Throwable throwable,
            LoginUserObject userObject) {
        super(null, msg, instances, throwable);
        setErrorCode(WbemsmtException.ERR_LOGIN);
        setUserObject(userObject);
    }
    
    public Message getMessage(WbemSmtResourceBundle bundle) {
        LoginUserObject userObject = (LoginUserObject) getUserObject();
        return Message.create(ErrCodes.MSGDEF_CANNOT_LOGIN, bundle,  
                new Object[]{
                   userObject.getLoginUrl()
         });
    }        

    public boolean addCIMExceptionCause() {
        return true;
    }
    
}
