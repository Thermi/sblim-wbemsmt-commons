 /** 
  * DifferenceAfterModifyException.java
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
  * Description: Exception for Differences after Object modifications
  * 
  */
package org.sblim.wbemsmt.exception.impl;

import javax.cim.CIMInstance;

import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco;
import org.sblim.wbemsmt.bl.messages.ErrCodes;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.exception.ErrorCodeForUserException;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.exception.impl.userobject.DifferenceAfterModifyUserObject;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class DifferenceAfterModifyException extends WbemsmtException implements UserObjectExceptionIf {

    /**
     * 
     */
    private static final long serialVersionUID = 7554333135285266702L;

    /**
     * @param errorCode
     * @param msg
     */
    public DifferenceAfterModifyException(String msg,
            DifferenceAfterModifyUserObject userObject) {
        super(null, msg);
        setErrorCode(WbemsmtException.ERR_CIM_DIFFERENCE_AFTER_MODIFY);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param t
     */
    public DifferenceAfterModifyException(String msg, Throwable t,
            DifferenceAfterModifyUserObject userObject) {
        super(null, msg, t);
        setErrorCode(WbemsmtException.ERR_CIM_DIFFERENCE_AFTER_MODIFY);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param e
     */
    public DifferenceAfterModifyException(Throwable e,
            DifferenceAfterModifyUserObject userObject) {
        super(null, e);
        setErrorCode(WbemsmtException.ERR_CIM_DIFFERENCE_AFTER_MODIFY);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param fco
     */
    public DifferenceAfterModifyException(String msg, AbstractWbemsmtFco fco,
            DifferenceAfterModifyUserObject userObject) {
        super(null, msg, fco);
        setErrorCode(WbemsmtException.ERR_CIM_DIFFERENCE_AFTER_MODIFY);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param fco
     */
    public DifferenceAfterModifyException(String msg, AbstractWbemsmtFco[] fco,
            DifferenceAfterModifyUserObject userObject) {
        super(null,msg, fco);
        setErrorCode(WbemsmtException.ERR_CIM_DIFFERENCE_AFTER_MODIFY);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param fco
     * @param t
     */
    public DifferenceAfterModifyException(String msg, AbstractWbemsmtFco fco,
            Throwable t,
            DifferenceAfterModifyUserObject userObject) {
        super(null, msg, fco, t);
        setErrorCode(WbemsmtException.ERR_CIM_DIFFERENCE_AFTER_MODIFY);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param fco
     * @param t
     */
    public DifferenceAfterModifyException(ErrorCodeForUserException errorCode, String msg,
            AbstractWbemsmtFco[] fco, Throwable t,
            DifferenceAfterModifyUserObject userObject) {
        super(null, msg, fco, t);
        setErrorCode(WbemsmtException.ERR_CIM_DIFFERENCE_AFTER_MODIFY);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param fco
     * @param throwable
     */
    public DifferenceAfterModifyException(AbstractWbemsmtFco fco,
            Throwable throwable,
            DifferenceAfterModifyUserObject userObject) {
        super(null, fco, throwable);
        setErrorCode(WbemsmtException.ERR_CIM_DIFFERENCE_AFTER_MODIFY);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param fco
     * @param throwable
     */
    public DifferenceAfterModifyException(AbstractWbemsmtFco[] fco,
            Throwable throwable,
            DifferenceAfterModifyUserObject userObject) {
        super(null, fco, throwable);
        setErrorCode(WbemsmtException.ERR_CIM_DIFFERENCE_AFTER_MODIFY);
        setUserObject(userObject);
    }

    /**
     * @param msg
     * @param instances
     * @param throwable
     * @param userObject TODO
     */
    public DifferenceAfterModifyException(String msg, CIMInstance[] instances, Throwable throwable,
            DifferenceAfterModifyUserObject userObject) {
        super(null, msg, instances, throwable);
        setErrorCode(WbemsmtException.ERR_CIM_DIFFERENCE_AFTER_MODIFY);
        setUserObject(userObject);
    }
    
    public Message getMessage(WbemSmtResourceBundle bundle) {
        DifferenceAfterModifyUserObject userObject = (DifferenceAfterModifyUserObject) getUserObject();
        return Message.create(ErrCodes.MSGDEF_CIM_DIFF_AFTER_MODIFY, bundle, new Object[]{
                   userObject.getInstance().getObjectPath(),
                   DifferenceAfterCreateException.getAsString(bundle,userObject.getListWithDifferences())
         });
    }

    public boolean addCIMExceptionCause() {
        return false;
    }


}
