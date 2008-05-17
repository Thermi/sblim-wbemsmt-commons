 /** 
  * ReferencesException.java
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
  * Description: Exception for the References call
  * 
  */
package org.sblim.wbemsmt.exception.impl;

import javax.cim.CIMInstance;

import org.sblim.wbemsmt.bl.ErrCodes;
import org.sblim.wbemsmt.bl.adapter.Message;
import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco;
import org.sblim.wbemsmt.exception.ErrorCodeForUserException;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.exception.impl.userobject.ReferencesUserObject;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.util.StringUtil;

public class ReferencesException extends WbemsmtException implements UserObjectExceptionIf {

    /**
     * 
     */
    private static final long serialVersionUID = 7554333135285266702L;

    private static final ErrorCodeForUserException ERRORCODE = WbemsmtException.ERR_CIM_REFERENCES;

    /**
     * @param errorCode
     * @param msg
     */
    public ReferencesException(String msg,
            ReferencesUserObject userObject) {
        super(null, msg);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param t
     */
    public ReferencesException(String msg, Throwable t,
            ReferencesUserObject userObject) {
        super(null, msg, t);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param e
     */
    public ReferencesException(Throwable e,
            ReferencesUserObject userObject) {
        super(null, e);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param fco
     */
    public ReferencesException(String msg, AbstractWbemsmtFco fco,
            ReferencesUserObject userObject) {
        super(null, msg, fco);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param fco
     */
    public ReferencesException(String msg, AbstractWbemsmtFco[] fco,
            ReferencesUserObject userObject) {
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
    public ReferencesException(String msg, AbstractWbemsmtFco fco,
            Throwable t,
            ReferencesUserObject userObject) {
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
    public ReferencesException(ErrorCodeForUserException errorCode, String msg,
            AbstractWbemsmtFco[] fco, Throwable t,
            ReferencesUserObject userObject) {
        super(null, msg, fco, t);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param fco
     * @param throwable
     */
    public ReferencesException(AbstractWbemsmtFco fco,
            Throwable throwable,
            ReferencesUserObject userObject) {
        super(null, fco, throwable);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param fco
     * @param throwable
     */
    public ReferencesException(AbstractWbemsmtFco[] fco,
            Throwable throwable,
            ReferencesUserObject userObject) {
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
    public ReferencesException(String msg, CIMInstance[] instances, Throwable throwable,
            ReferencesUserObject userObject) {
        super(null, msg, instances, throwable);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }
    
    public Message getMessage(WbemSmtResourceBundle bundle) {
        ReferencesUserObject userObject = (ReferencesUserObject) getUserObject();
        return Message.create(ErrCodes.MSGDEF_CIM_REFERENCES, bundle, new Object[]{userObject.getObjectName(),
                userObject.getResultClass(),
                userObject.getRole(),
                StringUtil.asString(userObject.getPropertyList(), ", "),
                "" + userObject.isIncludeQualifiers(),
                "" + userObject.isIncludeClassOrigin()});
    }    
    
    public boolean addCIMExceptionCause() {
        return true;
    }
    

}
