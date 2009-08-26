 /** 
  * AssociatorException.java
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
import org.sblim.wbemsmt.exception.impl.userobject.AssociatorUserObject;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class AssociatorException extends WbemsmtException implements UserObjectExceptionIf {

    /**
     * 
     */
    private static final long serialVersionUID = 7554333135285266702L;

    private static final ErrorCodeForUserException ERRORCODE = WbemsmtException.ERR_CIM_ASSOCIATORS;
    
    /**
     * @param errorCode
     * @param msg
     */
    public AssociatorException(String msg,
            AssociatorUserObject userObject) {
        super(null, msg);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param t
     */
    public AssociatorException(String msg, Throwable t,
            AssociatorUserObject userObject) {
        super(null, msg, t);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param e
     */
    public AssociatorException(Throwable e,
            AssociatorUserObject userObject) {
        super(null, e);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param fco
     */
    public AssociatorException(String msg, AbstractWbemsmtFco fco,
            AssociatorUserObject userObject) {
        super(null, msg, fco);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param fco
     */
    public AssociatorException(String msg, AbstractWbemsmtFco[] fco,
            AssociatorUserObject userObject) {
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
    public AssociatorException(String msg, AbstractWbemsmtFco fco,
            Throwable t,
            AssociatorUserObject userObject) {
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
    public AssociatorException(ErrorCodeForUserException errorCode, String msg,
            AbstractWbemsmtFco[] fco, Throwable t,
            AssociatorUserObject userObject) {
        super(null, msg, fco, t);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param fco
     * @param throwable
     */
    public AssociatorException(AbstractWbemsmtFco fco,
            Throwable throwable,
            AssociatorUserObject userObject) {
        super(null, fco, throwable);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param fco
     * @param throwable
     */
    public AssociatorException(AbstractWbemsmtFco[] fco,
            Throwable throwable,
            AssociatorUserObject userObject) {
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
    public AssociatorException(String msg, CIMInstance[] instances, Throwable throwable,
            AssociatorUserObject userObject) {
        super(null, msg, instances, throwable);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    public Message getMessage(WbemSmtResourceBundle bundle) {
        AssociatorUserObject userObject = (AssociatorUserObject) getUserObject();
        return Message.create(ErrCodes.MSGDEF_CIM_ASSOCIATOR, bundle, new Object[]{userObject.getObjectName(),
                userObject.getAssociationClass(),
                userObject.getResultClass(),
                userObject.getRole(),
                userObject.getResultRole(),
                "" + userObject.isIncludeQualifiers(),
                "" + userObject.isIncludeClassOrigin()});
    }

    public boolean addCIMExceptionCause() {
        return true;
    }

}
