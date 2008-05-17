 /** 
  * ErrCodes.java
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
  * Description: Class with Error Codes
  * 
  */
package org.sblim.wbemsmt.bl;

import java.util.HashMap;

import javax.wbem.WBEMException;

import org.sblim.wbemsmt.bl.adapter.Message;
import org.sblim.wbemsmt.bl.adapter.MessageDefinition;
import org.sblim.wbemsmt.exception.ErrorCodeIf;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

/**
 * @author Bauschert
 *
 */
public class ErrCodes
{

	public final static String COMPONENT = "DIR";
	/**
	 * Business Logic
	 */
	public final static String SUBSYS_BLO = "BLO";

	/**
	 * Messages for Business logic
	 */
	public static final MessageNumber MSG_CONVERSION_ERROR = new MessageNumber(COMPONENT,SUBSYS_BLO,1);
	public static final MessageNumber MSG_SAVE_SUCCESS = new MessageNumber(COMPONENT,SUBSYS_BLO,2);
	public static final MessageNumber MSG_SAVE_INFO = new MessageNumber(COMPONENT,SUBSYS_BLO,3);
	public static final MessageNumber MSG_SAVE_WARNING = new MessageNumber(COMPONENT,SUBSYS_BLO,4);
	public static final MessageNumber MSG_SAVE_ERROR = new MessageNumber(COMPONENT,SUBSYS_BLO,5);
	public static final MessageNumber MSG_CREATE_SUCCESS = new MessageNumber(COMPONENT,SUBSYS_BLO,6);
	public static final MessageNumber MSG_CREATE_FAILED = new MessageNumber(COMPONENT,SUBSYS_BLO,7);
	public static final MessageNumber MSG_VALIDATION_ERROR = new MessageNumber(COMPONENT,SUBSYS_BLO,8);
	public static final MessageNumber MSG_ADDITIONAL_MESSAGES = new MessageNumber(COMPONENT,SUBSYS_BLO,9);
	
	public static final MessageDefinition MSGDEF_OTHER_EXCEPTION  = new MessageDefinition(new MessageNumber(COMPONENT,SUBSYS_BLO,18),Message.ERROR,"errorMessage.otherExceptions");
    public static final MessageDefinition MSGDEF_ERROR_WHILE_EXECUTION = new MessageDefinition(new MessageNumber(COMPONENT,SUBSYS_BLO,19),Message.ERROR,"error.while.execution");
    
    public static final MessageNumber MSG_CANCEL_SUCCESS = new MessageNumber(COMPONENT,SUBSYS_BLO,20);
	public static final MessageNumber MSG_CANCEL_INFO = new MessageNumber(COMPONENT,SUBSYS_BLO,21);
	public static final MessageNumber MSG_CANCEL_WARNING = new MessageNumber(COMPONENT,SUBSYS_BLO,22);
	public static final MessageNumber MSG_CANCEL_ERROR = new MessageNumber(COMPONENT,SUBSYS_BLO,23);

	public static final MessageNumber MSG_NO_NODE_SELECTED = new MessageNumber(COMPONENT,SUBSYS_BLO,24);
	
	public static final MessageNumber MSG_CANNOT_EXECUTE_ACTION = new MessageNumber(COMPONENT,SUBSYS_BLO,25);
	
	public static final MessageDefinition MSGDEF_INIT_ADAPTER           = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_BLO,26),Message.ERROR,"cannot.init.adapter");
	public static final MessageDefinition MSGDEF_CANNOT_LOGIN           = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_BLO,27),Message.ERROR,"cannot.login");
	public static final MessageDefinition MSGDEF_RUNTIME_NOT_SUPPORTED  = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_BLO,28),Message.ERROR,"runtime.not.supported");
    
	/**
	 * used to translate standard error codes of a WBEMException
	 */
	private static HashMap messageKeysByID = new HashMap();
	

	static
	{
	    messageKeysByID.put(""+WBEMException.CIM_ERR_ACCESS_DENIED,"errorMessage.CIM_ERR_ACCESS_DENIED");
	    messageKeysByID.put(""+WBEMException.CIM_ERR_ALREADY_EXISTS,"errorMessage.CIM_ERR_ALREADY_EXISTS");
	    messageKeysByID.put(""+WBEMException.CIM_ERR_INVALID_NAMESPACE,"errorMessage.CIM_ERR_INVALID_NAMESPACE");
	    messageKeysByID.put(""+WBEMException.CIM_ERR_NOT_FOUND,"errorMessage.CIM_ERR_NOT_FOUND");
	    messageKeysByID.put(""+WBEMException.CIM_ERR_NOT_SUPPORTED,"errorMessage.CIM_ERR_NOT_SUPPORTED");
	    messageKeysByID.put(""+WBEMException.CIM_ERR_ACCESS_DENIED,"errorMessage.EXT_ERR_ACCESS_DENIED");
	}
	
	
	/**
	 * Communication
	 */
	public final static String SUBSYS_COM = "COM";
	
	public static final MessageNumber MSG_LOGGED_OUT = new MessageNumber(COMPONENT,SUBSYS_COM,1);
	public static final MessageNumber MSG_TIME_OUT = new MessageNumber(COMPONENT,SUBSYS_COM,2);
	
	
	/**   
	 * Validator
	 */
	public final static String SUBSYS_VAL = "VAL";

	/**
	 * Messages for Validator
	 */
	public final static MessageNumber MSG_BITMASK_LENGTH = new MessageNumber(COMPONENT,SUBSYS_VAL,1);
	public static final MessageNumber MSG_BITMASK_VALUE_NO_NUMBER =  new MessageNumber(COMPONENT,SUBSYS_VAL,2);
	public static final MessageNumber MSG_BITMASK_VALUE_TOO_LARGE  = new MessageNumber(COMPONENT,SUBSYS_VAL,3);
	public static final MessageNumber MSG_REQUIRED_FIELD =  new MessageNumber(COMPONENT,SUBSYS_VAL,4);
	public static final MessageNumber MSG_OTHER_COMBO_ENTRY = new MessageNumber(COMPONENT,SUBSYS_VAL,5);
	public static final MessageNumber MSG_IP_4_DIGITS = new MessageNumber(COMPONENT,SUBSYS_VAL,6);
	public static final MessageNumber MSG_IP_LARGER_256 = new MessageNumber(COMPONENT,SUBSYS_VAL,7);
	public static final MessageNumber MSG_IP_LESS_0 = new MessageNumber(COMPONENT,SUBSYS_VAL,8);
	public static final MessageNumber MSG_IP_NO_NUMBER = new MessageNumber(COMPONENT,SUBSYS_VAL,9);
	public static final MessageNumber MSG_BELOW_MIN = new MessageNumber(COMPONENT,SUBSYS_VAL,10);
	public static final MessageNumber MSG_ABOVE_MAX = new MessageNumber(COMPONENT,SUBSYS_VAL,11);
	public static final MessageNumber MSG_NOT_NUMERIC = new MessageNumber(COMPONENT,SUBSYS_VAL,12);
	public static final MessageNumber MSG_VALUE_NOT_ALLOWED = new MessageNumber(COMPONENT,SUBSYS_VAL,13);
	public static final MessageNumber MSG_NOT_THE_SAME = new MessageNumber(COMPONENT,SUBSYS_VAL,14);
	public static final MessageNumber MSG_CANNOT_CONVERT = new MessageNumber(COMPONENT,SUBSYS_VAL,15);
	public static final MessageDefinition MSGDEF_INVALID_UPDATE_INTERVAL = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VAL,16),Message.WARNING,"invalid.update.interval");


	/**
	 * Locale IO
	 */
	public final static String SUBSYS_LIO = "LIO";

	public static final MessageNumber MSG_CANNOT_LOAD_SLP = new MessageNumber(COMPONENT,SUBSYS_LIO,1);
	public static final MessageNumber MSG_CANNOT_SAVE = new MessageNumber(COMPONENT,SUBSYS_LIO,2);
    public static final MessageDefinition MSGDEF_NEW_MESSAGES = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_LIO,3),Message.INFO,"newMessages");
	
	/**
	 * WTR - Wbemsmt Tree
	 */
	public final static String SUBSYS_WTR = "WTR";

	public static final MessageNumber MSG_TASK_SUPPORTED = new MessageNumber(COMPONENT,SUBSYS_WTR,1);
	public static final MessageNumber MSG_TASK_NOT_SUPPORTED = new MessageNumber(COMPONENT,SUBSYS_WTR,2);
	public static final MessageNumber MSG_TASK_NOT_SUPPORTED_SERVER = new MessageNumber(COMPONENT,SUBSYS_WTR,3);
	public static final MessageNumber MSG_TASK_NOT_SUPPORTED_CLIENT = new MessageNumber(COMPONENT,SUBSYS_WTR,4);
	public static final MessageNumber MSG_HOST_NOT_FOUND_TASKS_ADDED =  new MessageNumber(COMPONENT,SUBSYS_WTR,5);

	public static final MessageDefinition MSGDEF_EMPTY_PASSWORD_AND_PASSWORD_SET = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_WTR,6),Message.ERROR,"empty.password.and.password.set");
	public static final MessageDefinition MSGDEF_TASKSLAUNCHER_D_NOT_FOUND = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_WTR,7),Message.ERROR,"tasklauncher.d.not.found");
	public static final MessageNumber MSG_HOST_NOT_FOUND =  new MessageNumber(COMPONENT,SUBSYS_WTR,8);
	public static final MessageDefinition MSGDEF_NO_TASKS_FOUND = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_WTR,9),Message.ERROR,"no.tasks.found");
	
	
	/**
	 * ADM - Wbemsmt Tasklauncher admin
	 */
	
	public final static String SUBSYS_ADM = "ADM";
	
	public static final MessageNumber MSG_ADDED_HOST =  new MessageNumber(COMPONENT,SUBSYS_ADM,1);
	public static final MessageNumber MSG_REMOVED_HOST = new MessageNumber(COMPONENT,SUBSYS_ADM,2);
	public static final MessageDefinition MSGDEF_EDITING_NOT_POSSIBLE = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_ADM,3),Message.ERROR,"editing.not.possible");
	

    /**
     * CIM - CIM related messages
     */
    
    public final static String SUBSYS_CIM = "CIM";

    public static final MessageDefinition MSGDEF_CIM_ASSOCIATOR         = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,1),Message.ERROR,"cannot.execute.associators.call");
    public static final MessageDefinition MSGDEF_CIM_ASSOCIATORNAMES    = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,2),Message.ERROR,"cannot.execute.associatornames.call");
    public static final MessageDefinition MSGDEF_CIM_CREATEINSTANCE     = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,3),Message.ERROR,"cannot.execute.createinstance.call");
    public static final MessageDefinition MSGDEF_CIM_DELETEINSTANCE     = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,4),Message.ERROR,"cannot.execute.deleteinstance.call");
    public static final MessageDefinition MSGDEF_CIM_DIFF_AFTER_CREATE  = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,13),Message.ERROR,"differences.after.create");
    public static final MessageDefinition MSGDEF_CIM_DIFF_AFTER_MODIFY  = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,14),Message.ERROR,"differences.after.modify");
    public static final MessageDefinition MSGDEF_CIM_ENUM_INSTANCES     = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,5),Message.ERROR,"cannot.execute.enumerateinstancenames.call");
    public static final MessageDefinition MSGDEF_CIM_ENUM_INSTANCENAMES = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,6),Message.ERROR,"cannot.execute.enumerateinstances.call");
    public static final MessageDefinition MSGDEF_CIM_GET_CLASS          = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,7),Message.ERROR,"cannot.execute.getclass.call");
    public static final MessageDefinition MSGDEF_CIM_GET_INSTANCE       = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,8),Message.ERROR,"cannot.execute.getinstance.call");
    public static final MessageDefinition MSGDEF_CIM_INVOKE_METHOD      = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,12),Message.ERROR,"cannot.invoke.method");
    public static final MessageDefinition MSGDEF_CIM_MODIFY_INSTANCE    = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,9),Message.ERROR,"cannot.execute.modifyinstance.call");
    public static final MessageDefinition MSGDEF_CIM_REFERENCENAMES     = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,10),Message.ERROR,"cannot.execute.referencenames.call");
    public static final MessageDefinition MSGDEF_CIM_REFERENCES         = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,11),Message.ERROR,"cannot.execute.references.call");
    
    
    /**
     * CIM - CIM related messages
     * 
     * These messages are not translated by defining the complete errorcode and the text (like DIR.ADM.0001.addedHost) in the resourceBundle.
     * 
     * The errorCode of the ErrorCode object is used to build the messageNumber and the exception test is the message text which is later shown on the screen
     */
    
    public final static String SUBSYS_ERR = "ERR";    
    
    public static Message getMessage(WbemsmtException exception, WbemSmtResourceBundle bundle, String cimObjects,WBEMException cimException) {
        
        ErrorCodeIf errorCode = exception.getErrorCode();
        
        Integer hasCimObjects = new Integer(cimObjects.length() == 0 ? 0 : 1);
        Integer hasCimException = new Integer(cimException == null ? 0 : 1);
        String addOnText = bundle.getString("exception.text.addon",new Object[]{hasCimObjects,hasCimException, cimObjects,cimException != null ? cimException.toString() : ""});

        MessageNumber messageNumber = new MessageNumber(ErrCodes.COMPONENT,SUBSYS_ERR,errorCode.getCode());
        return new Message(messageNumber, Message.ERROR, errorCode.getMsg() + ": " + exception.getMessage() + "\n" + addOnText);
       
   }
	
    /**
     * get a message with the following Components
     * <COMPONENT><SUBSYS_ERR><WbemsmtException.ERR_FAILED_NONE_WBEMSMT.getCode()> <WbemsmtException.ERR_FAILED_NONE_WBEMSMT.getMessage()>: <t.getMessage>
     * @param t
     * @param bundle
     * @return
     */
    public static Message getMessage(Throwable t) {
        
        ErrorCodeIf errorCode = WbemsmtException.ERR_FAILED_NONE_WBEMSMT;
        MessageNumber messageNumber = new MessageNumber(ErrCodes.COMPONENT,SUBSYS_ERR,errorCode.getCode());
        return new Message(messageNumber, Message.ERROR, errorCode.getMsg() + ": " + t.getMessage());
       
   }
    
    /**
     * return the Message key for the resourceBundle by the id if the given exception 
     * @param e
     * @return
     */
    public static String getMessageKeyById(WBEMException e)
    {
        return (String) messageKeysByID.get("" + e.getID());
    }
   
	
}
