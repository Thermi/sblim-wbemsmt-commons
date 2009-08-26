 /** 
  * EnumerateInstancesException.java
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
  * Description: Exception for the EnumerateInstances call
  * 
  */
package org.sblim.wbemsmt.exception.impl;

import javax.cim.CIMInstance;

import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco;
import org.sblim.wbemsmt.bl.messages.ErrCodes;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.exception.ErrorCodeForUserException;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.exception.impl.userobject.EnumerateInstancesUserObject;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class EnumerateInstancesException extends WbemsmtException implements UserObjectExceptionIf {

    /**
     * 
     */
    private static final long serialVersionUID = 7554333135285266702L;

    private static final ErrorCodeForUserException ERRORCODE = WbemsmtException.ERR_CIM_ENUMERATE_INSTANCES;

    /**
     * @param errorCode
     * @param msg
     */
    public EnumerateInstancesException(String msg,
            EnumerateInstancesUserObject userObject) {
        super(null, msg);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param t
     */
    public EnumerateInstancesException(String msg, Throwable t,
            EnumerateInstancesUserObject userObject) {
        super(null, msg, t);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param e
     */
    public EnumerateInstancesException(Throwable e,
            EnumerateInstancesUserObject userObject) {
        super(null, e);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param fco
     */
    public EnumerateInstancesException(String msg, AbstractWbemsmtFco fco,
            EnumerateInstancesUserObject userObject) {
        super(null, msg, fco);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param fco
     */
    public EnumerateInstancesException(String msg, AbstractWbemsmtFco[] fco,
            EnumerateInstancesUserObject userObject) {
        super(null,msg, fco);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param fco
     * @param t
     */
    public EnumerateInstancesException(String msg, AbstractWbemsmtFco fco,
            Throwable t,
            EnumerateInstancesUserObject userObject) {
        super(null, msg, fco, t);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param fco
     * @param t
     */
    public EnumerateInstancesException(ErrorCodeForUserException errorCode, String msg,
            AbstractWbemsmtFco[] fco, Throwable t,
            EnumerateInstancesUserObject userObject) {
        super(null, msg, fco, t);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param fco
     * @param throwable
     */
    public EnumerateInstancesException(AbstractWbemsmtFco fco,
            Throwable throwable,
            EnumerateInstancesUserObject userObject) {
        super(null, fco, throwable);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param fco
     * @param throwable
     */
    public EnumerateInstancesException(AbstractWbemsmtFco[] fco,
            Throwable throwable,
            EnumerateInstancesUserObject userObject) {
        super(null, fco, throwable);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param msg
     * @param instances
     * @param throwable
     * @param userObject
     */
    public EnumerateInstancesException(String msg, CIMInstance[] instances, Throwable throwable,
            EnumerateInstancesUserObject userObject) {
        super(null, msg, instances, throwable);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    public Message getMessage(WbemSmtResourceBundle bundle) {
        EnumerateInstancesUserObject userObject = (EnumerateInstancesUserObject) getUserObject();
        return Message.create(ErrCodes.MSGDEF_CIM_ENUM_INSTANCES, bundle, new Object[]{userObject.getPath()});
    }      
    
    public boolean addCIMExceptionCause() {
        return true;
    }
    
    
}
