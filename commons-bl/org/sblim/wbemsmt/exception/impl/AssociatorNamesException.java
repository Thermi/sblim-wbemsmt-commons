 /** 
  * AssociatorNamesException.java
  *
  * © Copyright IBM Corp. 2005
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
  * Description: Exception for the Login process
  * 
  */
package org.sblim.wbemsmt.exception.impl;

import javax.cim.CIMInstance;

import org.sblim.wbemsmt.bl.ErrCodes;
import org.sblim.wbemsmt.bl.adapter.Message;
import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco;
import org.sblim.wbemsmt.exception.ErrorCodeForUserException;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.exception.impl.userobject.AssociatorNamesUserObject;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class AssociatorNamesException extends WbemsmtException implements UserObjectExceptionIf {

    /**
     * 
     */
    private static final long serialVersionUID = 7554333135285266702L;

    private static final ErrorCodeForUserException ERRORCODE = WbemsmtException.ERR_CIM_ASSOCIATORNAMES;

    /**
     * @param errorCode
     * @param msg
     */
    public AssociatorNamesException(String msg,
            AssociatorNamesUserObject userObject) {
        super(null, msg);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param t
     */
    public AssociatorNamesException(String msg, Throwable t,
            AssociatorNamesUserObject userObject) {
        super(null, msg, t);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param e
     */
    public AssociatorNamesException(Throwable e,
            AssociatorNamesUserObject userObject) {
        super(null, e);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param fco
     */
    public AssociatorNamesException(String msg, AbstractWbemsmtFco fco,
            AssociatorNamesUserObject userObject) {
        super(null, msg, fco);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param fco
     */
    public AssociatorNamesException(String msg, AbstractWbemsmtFco[] fco,
            AssociatorNamesUserObject userObject) {
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
    public AssociatorNamesException(String msg, AbstractWbemsmtFco fco,
            Throwable t,
            AssociatorNamesUserObject userObject) {
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
    public AssociatorNamesException(ErrorCodeForUserException errorCode, String msg,
            AbstractWbemsmtFco[] fco, Throwable t,
            AssociatorNamesUserObject userObject) {
        super(null, msg, fco, t);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param fco
     * @param throwable
     */
    public AssociatorNamesException(AbstractWbemsmtFco fco,
            Throwable throwable,
            AssociatorNamesUserObject userObject) {
        super(null, fco, throwable);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param fco
     * @param throwable
     */
    public AssociatorNamesException(AbstractWbemsmtFco[] fco,
            Throwable throwable,
            AssociatorNamesUserObject userObject) {
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
    public AssociatorNamesException(String msg, CIMInstance[] instances, Throwable throwable,
            AssociatorNamesUserObject userObject) {
        super(null, msg, instances, throwable);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }
    
    public Message getMessage(WbemSmtResourceBundle bundle) {
        AssociatorNamesUserObject userObject = (AssociatorNamesUserObject) getUserObject();
        return Message.create(ErrCodes.MSGDEF_CIM_ASSOCIATORNAMES, bundle, new Object[]{userObject.getObjectName(),
                userObject.getAssociationClass(),
                userObject.getResultClass(),
                userObject.getRole(),
                userObject.getResultRole()});
    }    
    
    public boolean addCIMExceptionCause() {
        return true;
    }
    

}
