 /** 
  * EnumerateInstanceNamesException.java
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
  * Description: Exception for the EnumerateInstanceNames call
  * 
  */
package org.sblim.wbemsmt.exception.impl;

import javax.cim.CIMInstance;

import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco;
import org.sblim.wbemsmt.bl.messages.ErrCodes;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.exception.ErrorCodeForUserException;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.exception.impl.userobject.EnumerateInstanceNamesUserObject;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class EnumerateInstanceNamesException extends WbemsmtException implements UserObjectExceptionIf {

    /**
     * 
     */
    private static final long serialVersionUID = 7554333135285266702L;

    private static final ErrorCodeForUserException ERRORCODE = WbemsmtException.ERR_CIM_ENUMERATE_INSTANCENAMES;

    /**
     * @param errorCode
     * @param msg
     */
    public EnumerateInstanceNamesException(String msg,
            EnumerateInstanceNamesUserObject userObject) {
        super(null, msg);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param t
     */
    public EnumerateInstanceNamesException(String msg, Throwable t,
            EnumerateInstanceNamesUserObject userObject) {
        super(null, msg, t);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param e
     */
    public EnumerateInstanceNamesException(Throwable e,
            EnumerateInstanceNamesUserObject userObject) {
        super(null, e);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param fco
     */
    public EnumerateInstanceNamesException(String msg, AbstractWbemsmtFco fco,
            EnumerateInstanceNamesUserObject userObject) {
        super(null, msg, fco);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param fco
     */
    public EnumerateInstanceNamesException(String msg, AbstractWbemsmtFco[] fco,
            EnumerateInstanceNamesUserObject userObject) {
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
    public EnumerateInstanceNamesException(String msg, AbstractWbemsmtFco fco,
            Throwable t,
            EnumerateInstanceNamesUserObject userObject) {
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
    public EnumerateInstanceNamesException(ErrorCodeForUserException errorCode, String msg,
            AbstractWbemsmtFco[] fco, Throwable t,
            EnumerateInstanceNamesUserObject userObject) {
        super(null, msg, fco, t);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param fco
     * @param throwable
     */
    public EnumerateInstanceNamesException(AbstractWbemsmtFco fco,
            Throwable throwable,
            EnumerateInstanceNamesUserObject userObject) {
        super(null, fco, throwable);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param fco
     * @param throwable
     */
    public EnumerateInstanceNamesException(AbstractWbemsmtFco[] fco,
            Throwable throwable,
            EnumerateInstanceNamesUserObject userObject) {
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
    public EnumerateInstanceNamesException(String msg, CIMInstance[] instances, Throwable throwable,
            EnumerateInstanceNamesUserObject userObject) {
        super(null, msg, instances, throwable);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    public Message getMessage(WbemSmtResourceBundle bundle) {
        EnumerateInstanceNamesUserObject userObject = (EnumerateInstanceNamesUserObject) getUserObject();
        return Message.create(ErrCodes.MSGDEF_CIM_ENUM_INSTANCENAMES, bundle, new Object[]{userObject.getPath()});
    }      

    public boolean addCIMExceptionCause() {
        return true;
    }
    
}
