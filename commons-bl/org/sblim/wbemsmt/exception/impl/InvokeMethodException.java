 /** 
  * InvokeMethodException.java
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
  * Description: Exception for the create Instance call
  * 
  */
package org.sblim.wbemsmt.exception.impl;

import javax.cim.CIMArgument;
import javax.cim.CIMInstance;
import javax.cim.CIMObjectPath;

import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco;
import org.sblim.wbemsmt.bl.messages.ErrCodes;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.exception.ErrorCodeForUserException;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.exception.impl.userobject.InvokeMethodUserObject;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.util.StringUtil;

public class InvokeMethodException extends WbemsmtException implements UserObjectExceptionIf {

    /**
     * 
     */
    private static final long serialVersionUID = 7554333135285266702L;

    private static final ErrorCodeForUserException ERRORCODE = WbemsmtException.ERR_CIM_INVOKE_METHOD;

    /**
     * @param errorCode
     * @param msg
     */
    public InvokeMethodException(String msg,
            InvokeMethodUserObject userObject) {
        super(null, msg);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param t
     */
    public InvokeMethodException(String msg, Throwable t,
            InvokeMethodUserObject userObject) {
        super(null, msg, t);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param e
     */
    public InvokeMethodException(Throwable e,
            InvokeMethodUserObject userObject) {
        super(null, e);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param fco
     */
    public InvokeMethodException(String msg, AbstractWbemsmtFco fco,
            InvokeMethodUserObject userObject) {
        super(null, msg, fco);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param msg
     * @param fco
     */
    public InvokeMethodException(String msg, AbstractWbemsmtFco[] fco,
            InvokeMethodUserObject userObject) {
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
    public InvokeMethodException(String msg, AbstractWbemsmtFco fco,
            Throwable t,
            InvokeMethodUserObject userObject) {
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
    public InvokeMethodException(ErrorCodeForUserException errorCode, String msg,
            AbstractWbemsmtFco[] fco, Throwable t,
            InvokeMethodUserObject userObject) {
        super(null, msg, fco, t);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param fco
     * @param throwable
     */
    public InvokeMethodException(AbstractWbemsmtFco fco,
            Throwable throwable,
            InvokeMethodUserObject userObject) {
        super(null, fco, throwable);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }

    /**
     * @param errorCode
     * @param fco
     * @param throwable
     */
    public InvokeMethodException(AbstractWbemsmtFco[] fco,
            Throwable throwable,
            InvokeMethodUserObject userObject) {
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
    public InvokeMethodException(String msg, CIMInstance[] instances, Throwable throwable,
            InvokeMethodUserObject userObject) {
        super(null, msg, instances, throwable);
        setErrorCode(ERRORCODE);
        setUserObject(userObject);
    }
    
    public Message getMessage(WbemSmtResourceBundle bundle) {
        InvokeMethodUserObject userObject = (InvokeMethodUserObject) getUserObject();
        CIMObjectPath path = userObject.getPath();
        return Message.create(ErrCodes.MSGDEF_CIM_INVOKE_METHOD, bundle, new Object[]{
                   path != null ? path.toString() : "-",
                   userObject.getMethodName(),
                   getArgsAsString(userObject.getInputArguments())
         });
    }

    private String getArgsAsString(CIMArgument[] arguments) {
        
        String[] args = new String[arguments.length];
        for (int i = 0; i < args.length; i++) {
            CIMArgument arg = arguments[i];
            String value = arg.getValue() != null ? arg.getValue().toString() : "null";
            args[i] = arg.getName() + " = " + value + " (DataType =  "  + arg.getDataType().toString() + ")";
        }
        
        return StringUtil.asString(args, ", ");
    }        
    
    public boolean addCIMExceptionCause() {
        return true;
    }
    

}
