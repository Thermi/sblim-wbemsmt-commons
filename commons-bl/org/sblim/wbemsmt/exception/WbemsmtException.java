 /** 
  * WbemsmtException.java
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
  * Description: Baseclass for all Exceptions thrown in the WebmSmt-Framework
  * 
  */

package org.sblim.wbemsmt.exception;

import javax.cim.CIMInstance;
import javax.wbem.WBEMException;

import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco;
import org.sblim.wbemsmt.bl.messages.ErrCodes;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.exception.impl.UserObjectExceptionIf;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class WbemsmtException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8090752773000518419L;
	
	/**
	 * The FCOs that were used during the exception was raised
	 */
	protected AbstractWbemsmtFco[] cimObject;
	
    /**
     * the errorCode of the Exception
     */
	private ErrorCodeIf errorCode;
	
	/**
	 * the CIMInstances
	 */
    private CIMInstance[] instances;

    /**
     * <br>
     * this object carries specific information depending on the error code.<br>
     * <br>
     * The description of the errorcode defines if a user object is set and which<br>
     * <br>
     * Example for usage of the userObject<br>
     * 
     * @see #ERR_LOGIN
     * @see #ERR_CIM_DIFFERENCE_AFTER_CREATE
     * @see #ERR_CIM_DIFFERENCE_AFTER_MODIFY
     */
    private WbemsmtExceptionUserObject userObject;

    /**
     * the CIMClass was not found <br>
     */
    public static final ErrorCode ERR_CIM_CLASS_NOT_FOUND = new ErrorCode("ERR_CIM_CLASS_NOT_FOUND",1);
    
    /**
     * establishing the connection was not possible  <br>
     */
    public static final ErrorCode ERR_CIM_CONNECTION = new ErrorCode("ERR_CIM_CONNECTION",2);

    /**
     * the cli command was not found  <br>
     */
    public static final ErrorCode ERR_COMMAND_NOT_FOUND = new ErrorCode("ERR_COMMAND_NOT_FOUND",3);

    /**
     * count operation was not possible  <br>
     */
    public static final ErrorCode ERR_COUNT = new ErrorCode("ERR_COUNT",4);
    
    /**
     * node filtering was not possible  <br>
     */
    public static final ErrorCode ERR_FILTER = new ErrorCode("ERR_FILTER",5);

    /**
     * IndicationPreparationException was not possible<br>
     */
    public static final ErrorCode ERR_INDICATION_PREPARATION = new ErrorCode("ERR_INDICATION_PREPARATION",6);

    /**
     * initializing a container was not possible<br>
     */
    public static final ErrorCode ERR_INIT_CONTAINER = new ErrorCode("ERR_INIT_CONTAINER",7);

    /**
     * initializing a wizard was not possible<br>
     */
    public static final ErrorCode ERR_INIT_WIZARD = new ErrorCode("ERR_INIT_WIZARD",8);

    /**
     * naming an instance was not possible<br>
     */
    public static final ErrorCode ERR_NAMING_INSTANCE = new ErrorCode("ERR_NAMING_INSTANCE",9);
    
    /**
     * cim class was not valid<br>
     */
    public static final ErrorCode ERR_CIM_CLASS_INVALID = new ErrorCode("ERR_CIM_CLASS_INVALID",10);
    
    /**
     * parameter was not valid<br>
     */
    public static final ErrorCode ERR_PARAMETER_INVALID = new ErrorCode("ERR_PARAMETER_INVALID",11);

    /**
     * property value was not valid<br>
     */
    public static final ErrorCode ERR_PROPERTY_VALUE_INVALID = new ErrorCode("ERR_PROPERTY_VALUE_INVALID",12);
    
    /**
     * error during loading the model<br>
     */
    public static final ErrorCode ERR_LOADING_MODEL = new ErrorCode("ERR_LOADING_MODEL",14);
    
    /**
     * error because the model was not loaded<br>
     */
    public static final ErrorCode ERR_MODEL_NOT_LOADED = new ErrorCode("ERR_MODEL_NOT_LOADED",15);

    /**
     * model is out of sync<br>
     */
    public static final ErrorCode ERR_MODEL_OUT_OF_SYNC = new ErrorCode("ERR_MODEL_OUT_OF_SYNC",16);

    /**
     * error during updating the model<br>
     */
    public static final ErrorCode ERR_UPDATING_MODEL = new ErrorCode("ERR_UPDATING_MODEL",17);

    /**
     * error because client is not connected<br>
     */
    public static final ErrorCode ERR_NOT_CONNECTED = new ErrorCode("ERR_NOT_CONNECTED",18);

    /**
     * error during value conversion<br>
     */
    public static final ErrorCode ERR_VALUE_CONVERSION = new ErrorCode("ERR_VALUE_CONVERSION",19);

    /**
     * error during object (FCO) creation<br>
     */
    public static final ErrorCode ERR_CREATE_OBJECT = new ErrorCode("ERR_CREATE_OBJECT",20);

    /**
     * error while saving the object<br>
     */
    public static final ErrorCode ERR_SAVE_OBJECT = new ErrorCode("ERR_SAVE_OBJECT",21);

    /**
     * error while updating the object
     */
    public static final ErrorCode ERR_UPDATE_OBJECT = new ErrorCode("ERR_UPDATE_OBJECT",22);

    /**
     * error while deleting the object<br>
     */
    public static final ErrorCode ERR_DELETE_OBJECT = new ErrorCode("ERR_DELETE_OBJECT",23);

    /**
     * object was not found<br>
     */
    public static final ErrorCode ERR_OBJECT_NOT_FOUND = new ErrorCode("ERR_OBJECT_NOT_FOUND",24);
    
    /**
     * error while reverting the object<br>
     */
    public static final ErrorCode ERR_REVERT_OBJECT = new ErrorCode("ERR_REVERT_OBJECT",25);
    
    /**
     * property was not found<br>
     */
    public static final ErrorCode ERR_PROPERTY_NOT_FOUND = new ErrorCode("ERR_PROPERTY_NOT_FOUND",26);

    /**
     * selection was not valid<br>
     */
    public static final ErrorCode ERR_SELECTION_INVALID = new ErrorCode("ERR_SELECTION_INVALID",27);
    
    /**
     * updating the controls was not possible<br>
     */
    public static final ErrorCode ERR_UPDATE_CONTROLS = new ErrorCode("ERR_UPDATE_CONTROLS",28);

    /**
     * validation was not possible<br>
     */
    public static final ErrorCode ERR_VALIDATION = new ErrorCode("ERR_VALIDATION",29);
    
    /**
     * an error because a parameter was invalid<br>
     * containing the real cause <br>
     */
    public static final ErrorCode ERR_INVALID_PARAMETER = new ErrorCode("ERR_INVALID_PARAMETER",30);

    /**
     * an generic error<br>
     * containing the real cause<br> 
     */
    public static final ErrorCode ERR_FAILED = new ErrorCode("ERR_FAILED",31);

    /**
     * an error during the execution of the wizard logic<br>
     * containing the real cause <br>
     */
    public static final ErrorCode ERR_WIZARD_LOGIC = new ErrorCode("ERR_WIZARD_LOGIC",32);

    /**
     * error if a method ist not supported<br>
     */
    public static final ErrorCode ERR_METHOD_NOT_SUPPORTED = new ErrorCode("ERR_METHOD_NOT_SUPPORTED",33);

    /**
     * error during decryption/encryption<br>
     */
    public static final ErrorCode ERR_CRYPTO = new ErrorCode("ERR_CRYPTO",34);

    /**
     * an generic error - shoule be used only for non-WbemsmtExceptions<br>
     * containing the real cause<br> 
     */
    public static final ErrorCode ERR_FAILED_NONE_WBEMSMT = new ErrorCode("ERR_FAILED_NONE_WBEMSMT",35);

    
    

    /**
     * an error that occurred during communication with the CIM server. <br>
     * Exception should contain a WBEMException as nested exception<br>
     * containing the real cause <br>
     */
    public static final ErrorCode ERR_CIM_COMMUNICATION = new ErrorCode("ERR_CIM_COMMUNICATION",100);

    /**
     * an error that occurred during a getClass call<br>
     * Exception should contain a WBEMException as nested exception<br>
     * containing the real cause <br>
     */
    public static final ErrorCodeForUserException ERR_CIM_GET_CLASS = new ErrorCodeForUserException("ERR_CIM_GET_CLASS",101);
    
    /**
     * an error that occurred during a getInstance call<br>
     * Exception should contain a WBEMException as nested exception<br>
     * containing the real cause <br>
     */
    public static final ErrorCodeForUserException ERR_CIM_GET_INSTANCE = new ErrorCodeForUserException("ERR_CIM_GET_INSTANCE",102);

    /**
     * an error that occurred during the iteration of a result set<br>
     * Exception should contain a WBEMException as nested exception<br>
     * containing the real cause <br>
     */
    public static final ErrorCode ERR_CIM_ITERATION = new ErrorCode("ERR_CIM_ITERATION",103);

    /**
     * an error that occurred during a createInstance call<br>
     * Exception should contain a WBEMException as nested exception<br>
     * containing the real cause <br>
     */
    public static final ErrorCodeForUserException ERR_CIM_CREATE_INSTANCE = new ErrorCodeForUserException("ERR_CIM_CREATE_INSTANCE",104);

    /**
     * an error that occurred during a modifyInstance call<br>
     * Exception should contain a WBEMException as nested exception<br>
     * containing the real cause<br> 
     */
    public static final ErrorCodeForUserException ERR_CIM_MODIFY_INSTANCE = new ErrorCodeForUserException("ERR_CIM_MODIFY_INSTANCE",105);
    
    /**
     * an error that occurred during a deleteInstance call<br>
     * Exception should contain a WBEMException as nested exception<br>
     * containing the real cause <br>
     */
    public static final ErrorCodeForUserException ERR_CIM_DELETE_INSTANCE = new ErrorCodeForUserException("ERR_CIM_DELETE_INSTANCE",106);
    
    /**
     * an error that occurred during an associator call<br>
     * Exception should contain a WBEMException as nested exception<br>
     * containing the real cause 
     */
    public static final ErrorCodeForUserException ERR_CIM_ASSOCIATORS = new ErrorCodeForUserException("ERR_CIM_ASSOCIATORS",107);

    /**
     * an error that occurred during an associatornames call<br>
     * Exception should contain a WBEMException as nested exception<br>
     * containing the real cause 
     */
    public static final ErrorCodeForUserException ERR_CIM_ASSOCIATORNAMES = new ErrorCodeForUserException("ERR_CIM_ASSOCIATORNAMES",108);
    
    /**
     * an error that occurred during a references call<br>
     * Exception should contain a WBEMException as nested exception<br>
     * containing the real cause 
     */
    public static final ErrorCodeForUserException ERR_CIM_REFERENCES = new ErrorCodeForUserException("ERR_CIM_REFERENCES",109);

    /**
     * an error that occurred during a referenceNames call<br>
     * Exception should contain a WBEMException as nested exception<br>
     * containing the real cause <br>
     */
    public static final ErrorCodeForUserException ERR_CIM_REFERENCENAMES = new ErrorCodeForUserException("ERR_CIM_REFERENCENAMES",110);
    
    /**
     * an error that occurred during a invokeMethod call<br>
     * Exception should contain a WBEMException as nested exception<br>
     * containing the real cause <br>
     */
    public static final ErrorCodeForUserException ERR_CIM_INVOKE_METHOD = new ErrorCodeForUserException("ERR_CIM_INVOKE_METHOD",111);
    
    /**
     * an error that occurred during a enumerateInstanceNames call<br>
     * Exception should contain a WBEMException as nested exception<br>
     * containing the real cause <br>
     */
    public static final ErrorCodeForUserException ERR_CIM_ENUMERATE_INSTANCENAMES = new ErrorCodeForUserException("ERR_CIM_ENUMERATE_INSTANCENAMES",112);

    /**
     * an error that occurred during a enumerateInstanceNames call<br>
     * Exception should contain a WBEMException as nested exception<br>
     * containing the real cause 
     */
    public static final ErrorCodeForUserException ERR_CIM_ENUMERATE_INSTANCES = new ErrorCodeForUserException("ERR_CIM_ENUMERATE_INSTANCES",113);
        
    /**
     * a difference was found after the creation of a new CIMInstance<br>
     * the userObject is a instance of DifferenceAfterCreateUserObject<br>
     * @see DifferenceAfterCreateUserObject<br>
     */
    protected static final ErrorCodeForUserException ERR_CIM_DIFFERENCE_AFTER_CREATE = new ErrorCodeForUserException("ERR_CIM_DIFFERENCE_AFTER_CREATE",114);
    
    /**
     * a difference was found after the modification of a CIMInstance<br>
     * the userObject is a instance of DifferenceAfterModifyUserObject<br>
     * @see DifferenceAfterModifyUserObject<br>
     */
    protected static final ErrorCodeForUserException ERR_CIM_DIFFERENCE_AFTER_MODIFY = new ErrorCodeForUserException("ERR_CIM_DIFFERENCE_AFTER_MODIFY",115);

    /**
     * an error occurred during the creation of an embeddedObject, because the received object was no CIMInstance or CIMClass<br>
     * containing the real cause <br>
     */
    public static final ErrorCode ERR_CIM_TYPE_MISMATCH = new ErrorCode("ERR_CIM_TYPE_MISMATCH",116);

    /**
     * error during login<br>
     * the userObject is a instance of DifferenceAfterCreateUserObject<br>
     * @see LoginUserObject<br>
     */
    public static final ErrorCodeForUserException ERR_LOGIN = new ErrorCodeForUserException("ERR_LOGIN",202);
    
    /**
     * error during initialization of the adapter<br>
     * the userObject is a instance of InitAdapterUserObject<br>
     * @see InitAdapterUserObject<br>
     */
    public static final ErrorCodeForUserException ERR_INIT_ADAPTER = new ErrorCodeForUserException("ERR_INIT_ADAPTER",203);
  
    /**
     * error during evaluating the runtime mode<br>
     * the userObject is a instance of RuntimeNotSupportedUserObject<br>
     * @see LoginUserObject<br>
     */
    public static final ErrorCodeForUserException ERR_RUNTIME_NOT_SUPPORTED= new ErrorCodeForUserException("ERR_RUNTIME_NOT_SUPPORTED",204);
    
    
    /**
     * create a new Exception for wbem-smt
     * @param errorCode the ErrorCode
     */
    protected WbemsmtException(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * create a new Exception for wbem-smt
     * @param errorCode the ErrorCode
     * @param msg the (already translated message)
     */
    public WbemsmtException(ErrorCode errorCode, String msg) {
	    super(msg);
        this.errorCode = errorCode;
    }

    /**
     * create a new Exception for wbem-smt
     * @param errorCode the ErrorCode
     * @param msg the (already translated message)
     * @param t the exception cause
     */
    public WbemsmtException(ErrorCode errorCode, String msg, Throwable t) {
        super(msg,t);
        this.errorCode = errorCode;
    }

    /**
     * create a new Exception for wbem-smt
     * @param errorCode the ErrorCode
     * @param t the exception cause
     */
    public WbemsmtException(ErrorCode errorCode, Throwable t) {
        super(t);
        this.errorCode = errorCode;
    }

    /**
     * create a new Exception for wbem-smt
     * @param errorCode the ErrorCode
     * @param msg the (already translated message)
     * @param fco the fco that was used at the time the exception occured
     */
    public WbemsmtException(ErrorCode errorCode, String msg, AbstractWbemsmtFco fco) {
        super(msg);
        this.errorCode = errorCode;
        cimObject = new AbstractWbemsmtFco[]{fco};
    }

    /**
     * create a new Exception for wbem-smt
     * @param errorCode the ErrorCode
     * @param msg the (already translated message)
     * @param fcos the fcos that were used at the time the exception occured
     */

    public WbemsmtException(ErrorCode errorCode, String msg, AbstractWbemsmtFco[] fcos) {
        super(msg);
        this.errorCode = errorCode;
        cimObject = fcos;
    }
    
    /**
     * create a new Exception for wbem-smt
     * @param errorCode the ErrorCode
     * @param msg the (already translated message)
     * @param fco the fco that was used at the time the exception occured
     * @param t the exception cause
     */

    public WbemsmtException(ErrorCode errorCode, String msg, AbstractWbemsmtFco fco,Throwable t) {
        super(msg,t);
        this.errorCode = errorCode;
        cimObject = new AbstractWbemsmtFco[]{fco};
    }

    /**
     * create a new Exception for wbem-smt
     * @param errorCode the ErrorCode
     * @param msg the (already translated message)
     * @param fcos the fcos that were used at the time the exception occured
     * @param t the exception cause
     */

    public WbemsmtException(ErrorCode errorCode, String msg, AbstractWbemsmtFco[] fcos,Throwable t) {
        super(msg,t);
        this.errorCode = errorCode;
        cimObject = fcos;
    }

    /**
     * create a new Exception for wbem-smt
     * @param errorCode the ErrorCode
     * @param fco the fco that was used at the time the exception occured
     * @param throwable the exception cause
     */

    public WbemsmtException(ErrorCode errorCode, AbstractWbemsmtFco fco,Throwable throwable) {
        super(throwable);
        this.errorCode = errorCode;
        cimObject = new AbstractWbemsmtFco[]{fco};
    }

    /**
     * create a new Exception for wbem-smt
     * @param errorCode the ErrorCode
     * @param fcos the fcos that were used at the time the exception occured
     * @param throwable the exception cause
     */
    public WbemsmtException(ErrorCode errorCode, AbstractWbemsmtFco[] fcos, Throwable throwable) {
        super(throwable);
        this.errorCode = errorCode;
        cimObject = fcos;
    }
    
    /**
     * create a new Exception for wbem-smt
     * @param errorCode the ErrorCode
     * @param msg the (already translated message)
     * @param instances the instances that were used at the time the exception occured
     * @param throwable the exception cause
     */

    public WbemsmtException(ErrorCode errorCode, String msg, CIMInstance[] instances, Throwable throwable) {
        super(msg,throwable);
        this.errorCode = errorCode;
        this.instances = instances;
    }

    /**
     * @return the FCOs that were used at the time the exception occured
     */
    public AbstractWbemsmtFco[] getFco() {
		return this.cimObject;
	}

    /**
     * @return the errorcode
     */
	public ErrorCodeIf getErrorCode()
	{
	    return errorCode;
	}

	/**
	 * set the errorcode<br>
	 * can be used by a subclass which carries a default error code so that the user does not to have to specify one
	 * @param errorCode the errorCode to set
	 */
    protected void setErrorCode(ErrorCodeIf errorCode)
    {
        this.errorCode = errorCode;
    }

    
    /**
     * get the subclasses user object
     * @return the user object
     */
    public WbemsmtExceptionUserObject getUserObject() {
        return userObject;
    }

    /**
     * set the user object
     * @param userObject the userobject of the subclass
     */
    protected void setUserObject(WbemsmtExceptionUserObject userObject) {
        this.userObject = userObject;
    }

    /**
     * @return all instances that were used during the error occured
     */
    public CIMInstance[] getInstances() {
        return instances;
    }

    /**
     * return the message of the exception<br>
     * if the exception is a UserObjectExceptionIf the method UserObjectExceptionIf.getMessage(bundle).getMessagesString is called<br>
     * for any other super.getMessafge
     * @return the mesage
     */
    public String getMessage()
    {
        if (this instanceof UserObjectExceptionIf) {
            UserObjectExceptionIf ex = (UserObjectExceptionIf) this;
            WbemSmtResourceBundle resourceBundle = ResourceBundleManager.getResourceBundle(new String[]{"messages"});
            return ex.getMessage(resourceBundle).getMessageString();
        } else {
            return super.getMessage();
        }
        
    }

    /**
     * add the CIMException (if there is any) to the message text<br>
     * Tries to find a WBEMException inside the causes of this exception<br> 
     * <br>
     * @param bundle the resourceBundle to translate the text 'cimexception' - the caption for the added cim exception 
     * @param message the message to add the cim exception
     * @return the message object with the modified message text (containing now the message of the cim exception)
     * 
     * @see ExceptionUtil#findDeepest(Class, Throwable)
     */
    public Message addCIMExceptionToMessageText(WbemSmtResourceBundle bundle, Message message) {
        WBEMException cimException = (WBEMException) ExceptionUtil.findDeepest(WBEMException.class, this);
        if (cimException != null)
        {
            String info = cimException.getMessage();

            String key = ErrCodes.getMessageKeyById(cimException);
            String defaultValue = null;
            String value = bundle.getString(key,defaultValue);
            if (key != null && value != null)
            {
                info = value + ": " + cimException.getMessage();
            }
            message.setMsg(message.getMessage() + "\n" + bundle.getString("cimexception", new Object[]{info}));
        }
        return message;
    }
    
	
	
	
	
}
