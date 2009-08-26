 /** 
  * ErrCodes.java
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
  * Description: Class with Error Codes
  * 
  */
package org.sblim.wbemsmt.bl.messages;

import java.util.HashMap;

import javax.wbem.WBEMException;

import org.sblim.wbemsmt.exception.ErrorCodeIf;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

/**
 * Class with Error Codes to help create messages with the style &lt;component&gt;&lt;subsystem&gt;&lt;e(error)|w(warning)|i(info)&gt;&lt;four digit number with leading zeroes&gt;
 *
 */
public final class ErrCodes
{
    
    /**
     * Utility class is having no public constructor
     */
    private ErrCodes()
    {
        
    }

    /**
     * Component token for all Errors inside wbemsmt
     */
	public static final String COMPONENT = "DIR";
	/**
	 * Subsystem token for Business Logic
	 */
	public static final String SUBSYS_BLO = "BLO";

	/**
	 * Error during conversion of data
	 */
	public static final MessageNumber MSG_CONVERSION_ERROR = new MessageNumber(COMPONENT,SUBSYS_BLO,1);
    /**
     * Successful save action
     */
	public static final MessageNumber MSG_SAVE_SUCCESS = new MessageNumber(COMPONENT,SUBSYS_BLO,2);
    /**
     * Informations during save
     */
	public static final MessageNumber MSG_SAVE_INFO = new MessageNumber(COMPONENT,SUBSYS_BLO,3);
    /**
     * Warnings during save
     */
	public static final MessageNumber MSG_SAVE_WARNING = new MessageNumber(COMPONENT,SUBSYS_BLO,4);
    /**
     * Errors during save
     */
	public static final MessageNumber MSG_SAVE_ERROR = new MessageNumber(COMPONENT,SUBSYS_BLO,5);
    /**
     * Successful create action
     */
	public static final MessageNumber MSG_CREATE_SUCCESS = new MessageNumber(COMPONENT,SUBSYS_BLO,6);
	/**
	 * Errors during create
	 */
	public static final MessageNumber MSG_CREATE_FAILED = new MessageNumber(COMPONENT,SUBSYS_BLO,7);
    /**
     * Errors during validation
     */
	public static final MessageNumber MSG_VALIDATION_ERROR = new MessageNumber(COMPONENT,SUBSYS_BLO,8);
    /**
     * Additional messages
     */
	public static final MessageNumber MSG_ADDITIONAL_MESSAGES = new MessageNumber(COMPONENT,SUBSYS_BLO,9);
	
	/**
	 * ErrorCode for exception not receiving a special handling
	 */
	public static final MessageDefinition MSGDEF_OTHER_EXCEPTION  = new MessageDefinition(new MessageNumber(COMPONENT,SUBSYS_BLO,18),Message.ERROR,"errorMessage.otherExceptions");
    /**
     * Error while executing a user's request
     */
    public static final MessageDefinition MSGDEF_ERROR_WHILE_EXECUTION = new MessageDefinition(new MessageNumber(COMPONENT,SUBSYS_BLO,19),Message.ERROR,"error.while.execution");
   
    /**
     * Changes reverted sucessful
     */
    public static final MessageNumber MSG_CANCEL_SUCCESS = new MessageNumber(COMPONENT,SUBSYS_BLO,20);
    /**
     * Information messages during revert
     */
	public static final MessageNumber MSG_CANCEL_INFO = new MessageNumber(COMPONENT,SUBSYS_BLO,21);
    /**
     * Warnings during revert
     */
	public static final MessageNumber MSG_CANCEL_WARNING = new MessageNumber(COMPONENT,SUBSYS_BLO,22);
    /**
     * Errors during revert
     */
	public static final MessageNumber MSG_CANCEL_ERROR = new MessageNumber(COMPONENT,SUBSYS_BLO,23);

	/**
	 * No treenode was selected
	 */
	public static final MessageNumber MSG_NO_NODE_SELECTED = new MessageNumber(COMPONENT,SUBSYS_BLO,24);
	
    /**
     * Action cannot be executed
     */
	public static final MessageNumber MSG_CANNOT_EXECUTE_ACTION = new MessageNumber(COMPONENT,SUBSYS_BLO,25);
	
    /**
     * Unable to initialize adapter
     */
	public static final MessageDefinition MSGDEF_INIT_ADAPTER           = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_BLO,26),Message.ERROR,"cannot.init.adapter");

	/**
	 * Cannot login
	 */
	public static final MessageDefinition MSGDEF_CANNOT_LOGIN           = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_BLO,27),Message.ERROR,"cannot.login");

	/**
	 * Runtime is not supported
	 */
	public static final MessageDefinition MSGDEF_RUNTIME_NOT_SUPPORTED  = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_BLO,28),Message.ERROR,"runtime.not.supported");
    
	/**
	 * used to translate standard error codes of a WBEMException
	 */
	private static HashMap<String, String> messageKeysByID = new HashMap<String, String>();
	

	/**
	 * initializes the messages keys
	 */
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
	public static final String SUBSYS_COM = "COM";
	
	/**
	 * user logged out
	 */
	public static final MessageNumber MSG_LOGGED_OUT = new MessageNumber(COMPONENT,SUBSYS_COM,1);

	/**
	 * timeout occured
	 */
	public static final MessageNumber MSG_TIME_OUT = new MessageNumber(COMPONENT,SUBSYS_COM,2);
	
	
	/**   
	 * Validator
	 */
	public static final String SUBSYS_VAL = "VAL";

	/**
	 * Length of a bitmask not correct
	 */
	public static final MessageNumber MSG_BITMASK_LENGTH = new MessageNumber(COMPONENT,SUBSYS_VAL,1);
    /**
     * bitmask is not a number
     */
	public static final MessageNumber MSG_BITMASK_VALUE_NO_NUMBER =  new MessageNumber(COMPONENT,SUBSYS_VAL,2);
    /**
     * value within a bitmask is to large
     */
	public static final MessageNumber MSG_BITMASK_VALUE_TOO_LARGE  = new MessageNumber(COMPONENT,SUBSYS_VAL,3);
	/**
	 * required field not set
	 */
	public static final MessageNumber MSG_REQUIRED_FIELD =  new MessageNumber(COMPONENT,SUBSYS_VAL,4);

	/**
	 * current comobox entry is not valid
	 */
	public static final MessageNumber MSG_OTHER_COMBO_ENTRY = new MessageNumber(COMPONENT,SUBSYS_VAL,5);
    /**
     * ip doesn't contain 4 digits
     */
	public static final MessageNumber MSG_IP_4_DIGITS = new MessageNumber(COMPONENT,SUBSYS_VAL,6);
    /**
     * ip digit is larger than 255
     */
	public static final MessageNumber MSG_IP_LARGER_255 = new MessageNumber(COMPONENT,SUBSYS_VAL,7);
    /**
     * ip digit is less than 00
     */
	public static final MessageNumber MSG_IP_LESS_0 = new MessageNumber(COMPONENT,SUBSYS_VAL,8);
    /**
     * ip digit is no number
     */
	public static final MessageNumber MSG_IP_NO_NUMBER = new MessageNumber(COMPONENT,SUBSYS_VAL,9);
    /**
     * value below min
     */
	public static final MessageNumber MSG_BELOW_MIN = new MessageNumber(COMPONENT,SUBSYS_VAL,10);
    /**
     * value above max
     */
	public static final MessageNumber MSG_ABOVE_MAX = new MessageNumber(COMPONENT,SUBSYS_VAL,11);
    /**
     * value is not numeric
     */
	public static final MessageNumber MSG_NOT_NUMERIC = new MessageNumber(COMPONENT,SUBSYS_VAL,12);
    /**
     * value is not allowed
     */
	public static final MessageNumber MSG_VALUE_NOT_ALLOWED = new MessageNumber(COMPONENT,SUBSYS_VAL,13);
    /**
     * content of fields is not the same
     */
	public static final MessageNumber MSG_NOT_THE_SAME = new MessageNumber(COMPONENT,SUBSYS_VAL,14);
	/**
	 * conversion not possible
	 */
	public static final MessageNumber MSG_CANNOT_CONVERT = new MessageNumber(COMPONENT,SUBSYS_VAL,15);
	/**
	 * 
	 */
	public static final MessageDefinition MSGDEF_INVALID_UPDATE_INTERVAL = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_VAL,16),Message.WARNING,"invalid.update.interval");
	
	/**
	 * Locale IO
	 */
	public static final String SUBSYS_LIO = "LIO";

	/**
	 * Unable to retrieve slp data
	 */
	public static final MessageNumber MSG_CANNOT_LOAD_SLP = new MessageNumber(COMPONENT,SUBSYS_LIO,1);

	/**
	 * Cannot save
	 */
	public static final MessageNumber MSG_CANNOT_SAVE = new MessageNumber(COMPONENT,SUBSYS_LIO,2);

	/**
	 * New pending messages
	 */
	public static final MessageDefinition MSGDEF_NEW_MESSAGES = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_LIO,3),Message.INFO,"newMessages");

	/**
	 * usersession initialized
	 */
	public static final MessageDefinition MSGDEF_USERSESSION_INIT = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_LIO,4),Message.INFO,"usersession.init");

	/**
     * usersession saved
     */
    public static final MessageDefinition MSGDEF_USERSESSION_SAVE = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_LIO,5),Message.INFO,"usersession.save");

    /**
     * usersession deleted
     */
    public static final MessageDefinition MSGDEF_USERSESSION_DELETE = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_LIO,6),Message.INFO,"usersession.delete");
	
	/**
	 * WTR - Wbemsmt Tree
	 */
	public static final String SUBSYS_WTR = "WTR";

	/**
	 * Task is supported
	 */
	public static final MessageNumber MSG_TASK_SUPPORTED = new MessageNumber(COMPONENT,SUBSYS_WTR,1);
	/**
	 * Task is not supported
	 */
	public static final MessageNumber MSG_TASK_NOT_SUPPORTED = new MessageNumber(COMPONENT,SUBSYS_WTR,2);
    /**
     * Task not supported on server
     */
	public static final MessageNumber MSG_TASK_NOT_SUPPORTED_SERVER = new MessageNumber(COMPONENT,SUBSYS_WTR,3);
    /**
     * Task not supported on client
     */
	public static final MessageNumber MSG_TASK_NOT_SUPPORTED_CLIENT = new MessageNumber(COMPONENT,SUBSYS_WTR,4);
    /**
     * Host was not found in configuration - all tasks are added to the host
     */
	public static final MessageNumber MSG_HOST_NOT_FOUND_TASKS_ADDED =  new MessageNumber(COMPONENT,SUBSYS_WTR,5);

	/**
	 * checkbox for empty password was checked and password was entered
	 */
	public static final MessageDefinition MSGDEF_EMPTY_PASSWORD_AND_PASSWORD_SET = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_WTR,6),Message.ERROR,"empty.password.and.password.set");
    /**
     * directory containing the taskconfiguration xmls was not found
     */
	public static final MessageDefinition MSGDEF_TASKSLAUNCHER_D_NOT_FOUND = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_WTR,7),Message.ERROR,"tasklauncher.d.not.found");

	/**
	 * host was not found
	 */
	public static final MessageNumber MSG_HOST_NOT_FOUND =  new MessageNumber(COMPONENT,SUBSYS_WTR,8);
	
	/**
	 * no tasks found for a host
	 */
	public static final MessageDefinition MSGDEF_NO_TASKS_FOUND = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_WTR,9),Message.ERROR,"no.tasks.found");
	
	
	/**
	 * ADM - Wbemsmt Tasklauncher admin
	 */
	
	public static final String SUBSYS_ADM = "ADM";
	
	/**
	 * added a new host
	 */
	public static final MessageNumber MSG_ADDED_HOST =  new MessageNumber(COMPONENT,SUBSYS_ADM,1);
	
	/**
	 * removed a host
	 */
	public static final MessageNumber MSG_REMOVED_HOST = new MessageNumber(COMPONENT,SUBSYS_ADM,2);
	
	/**
	 * editing a entry is not possible
	 */
	public static final MessageDefinition MSGDEF_EDITING_NOT_POSSIBLE = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_ADM,3),Message.ERROR,"editing.not.possible");
	

    /**
     * CIM - CIM related messages
     */
    
    public static final String SUBSYS_CIM = "CIM";

    /**
     * error while executing an associators call
     */
    public static final MessageDefinition MSGDEF_CIM_ASSOCIATOR         = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,1),Message.ERROR,"cannot.execute.associators.call");
    /**
     * error while executing an associatornames call
     */
    public static final MessageDefinition MSGDEF_CIM_ASSOCIATORNAMES    = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,2),Message.ERROR,"cannot.execute.associatornames.call");
    /**
     * error while executing a create instance call
     */
    public static final MessageDefinition MSGDEF_CIM_CREATEINSTANCE     = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,3),Message.ERROR,"cannot.execute.createinstance.call");
    /**
     * error while executing a delete instance call
     */
    public static final MessageDefinition MSGDEF_CIM_DELETEINSTANCE     = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,4),Message.ERROR,"cannot.execute.deleteinstance.call");
    /**
     * differences after a create action between client and server instance
     */
    public static final MessageDefinition MSGDEF_CIM_DIFF_AFTER_CREATE  = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,13),Message.ERROR,"differences.after.create");
    /**
     * differences after a modify action between client and server instance
     */
    public static final MessageDefinition MSGDEF_CIM_DIFF_AFTER_MODIFY  = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,14),Message.ERROR,"differences.after.modify");
    /**
     * error during an enumerateInstances call
     */
    public static final MessageDefinition MSGDEF_CIM_ENUM_INSTANCES     = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,5),Message.ERROR,"cannot.execute.enumerateinstancenames.call");
    /**
     * error during an enumerateInstanceNames call
     */
    public static final MessageDefinition MSGDEF_CIM_ENUM_INSTANCENAMES = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,6),Message.ERROR,"cannot.execute.enumerateinstances.call");
    /**
     * error during a getClass call
     */
    public static final MessageDefinition MSGDEF_CIM_GET_CLASS          = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,7),Message.ERROR,"cannot.execute.getclass.call");
    /**
     * error during a getInstance call
     */
    public static final MessageDefinition MSGDEF_CIM_GET_INSTANCE       = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,8),Message.ERROR,"cannot.execute.getinstance.call");
    /**
     * error during a getClass call
     */
    public static final MessageDefinition MSGDEF_CIM_INVOKE_METHOD      = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,12),Message.ERROR,"cannot.invoke.method");
    
    /**
     * error during modify instance
     */
    public static final MessageDefinition MSGDEF_CIM_MODIFY_INSTANCE    = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,9),Message.ERROR,"cannot.execute.modifyinstance.call");

    /**
     * error during the executipon of a referencenames call
     */
    public static final MessageDefinition MSGDEF_CIM_REFERENCENAMES     = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,10),Message.ERROR,"cannot.execute.referencenames.call");
    /**
     * error during the executipon of a referencs call
     */
    public static final MessageDefinition MSGDEF_CIM_REFERENCES         = new MessageDefinition(new MessageNumber(ErrCodes.COMPONENT,SUBSYS_CIM,11),Message.ERROR,"cannot.execute.references.call");
    
    
    /**
     * CIM - CIM related messages
     * 
     * These messages are not translated by defining the complete errorcode and the text (like DIR.ADM.0001.addedHost) in the resourceBundle.
     * 
     * The errorCode of the ErrorCode object is used to build the messageNumber and the exception test is the message text which is later shown on the screen
     */
    
    public static final String SUBSYS_ERR = "ERR";    
    
    
    /**
     * get the Message for an exception<br>
     * uses the errorcode in the exception as error number, and SUBSYS_ERR as subsystem
     * @param exception the exception with the errorCode
     * @param bundle bundle to translate the message
     * @param cimObjects the cim object for the message
     * @param cimException contained in the message text if != null
     * @return the message for the exception
     */
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
     * &lt;COMPONENT&gt;&lt;SUBSYS_ERR&gt;&lt;WbemsmtException.ERR_FAILED_NONE_WBEMSMT.getCode()&gt; &lt;WbemsmtException.ERR_FAILED_NONE_WBEMSMT.getMessage()&gt;: &lt;t.getMessage&gt;
     * @param t the exception
     * @return the message
     */
    public static Message getMessage(Throwable t) {
        
        ErrorCodeIf errorCode = WbemsmtException.ERR_FAILED_NONE_WBEMSMT;
        MessageNumber messageNumber = new MessageNumber(ErrCodes.COMPONENT,SUBSYS_ERR,errorCode.getCode());
        return new Message(messageNumber, Message.ERROR, errorCode.getMsg() + ": " + t.getMessage());
       
   }
    
    /**
     * return the Message key for the resourceBundle by the id of the given exception<br>
     * the key has the structure 'errorMessage.' + name of the WBEMException for example CIM_ERR_ACCESS_DENIED  
     * @param e the exception
     * @return the mesage key
     * @see WBEMException#CIM_ERR_ACCESS_DENIED
     */
    public static String getMessageKeyById(WBEMException e)
    {
        return (String) messageKeysByID.get("" + e.getID());
    }
   
	
}
