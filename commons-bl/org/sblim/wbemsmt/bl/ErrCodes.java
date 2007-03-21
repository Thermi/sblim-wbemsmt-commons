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
import java.util.Map;

import org.sblim.wbemsmt.exception.WbemSmtException;

/**
 * @author Bauschert
 *
 */
public class ErrCodes
{
	private static final Map exceptions = new HashMap();	

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
	
	public static final MessageNumber MSG_INITWIZARDEXCEPTION      = new MessageNumber(COMPONENT,SUBSYS_BLO,10);    
	public static final MessageNumber MSG_LOGINEXCEPTION           = new MessageNumber(COMPONENT,SUBSYS_BLO,11);
	public static final MessageNumber MSG_MODELLOADEXCEPTION       = new MessageNumber(COMPONENT,SUBSYS_BLO,12);
	public static final MessageNumber MSG_OBJECTCREATIONEXCEPTION  = new MessageNumber(COMPONENT,SUBSYS_BLO,13);
	public static final MessageNumber MSG_OBJECTDELETIONEXCEPTION  = new MessageNumber(COMPONENT,SUBSYS_BLO,14);
	public static final MessageNumber MSG_OBJECTNOTFOUNDEXCEPTION  = new MessageNumber(COMPONENT,SUBSYS_BLO,15);
	public static final MessageNumber MSG_OBJECTSAVEEXCEPTION      = new MessageNumber(COMPONENT,SUBSYS_BLO,16);
	public static final MessageNumber MSG_UPDATECONTROLSEXCEPTION  = new MessageNumber(COMPONENT,SUBSYS_BLO,17);	
	public static final MessageNumber MSG_OTHER_EXCEPTION  = new MessageNumber(COMPONENT,SUBSYS_BLO,18);
	public static final MessageNumber MSG_ERROR_WHILE_EXECUTION = new MessageNumber(COMPONENT,SUBSYS_BLO,19);
	
	public static final MessageNumber MSG_CANCEL_SUCCESS = new MessageNumber(COMPONENT,SUBSYS_BLO,20);
	public static final MessageNumber MSG_CANCEL_INFO = new MessageNumber(COMPONENT,SUBSYS_BLO,21);
	public static final MessageNumber MSG_CANCEL_WARNING = new MessageNumber(COMPONENT,SUBSYS_BLO,22);
	public static final MessageNumber MSG_CANCEL_ERROR = new MessageNumber(COMPONENT,SUBSYS_BLO,23);

	public static final MessageNumber MSG_NO_NODE_SELECTED = new MessageNumber(COMPONENT,SUBSYS_BLO,24);
	
	public static final MessageNumber MSG_CANNOT_EXECUTE_ACTION = new MessageNumber(COMPONENT,SUBSYS_BLO,25);

	
	static
	{
		exceptions.put(org.sblim.wbemsmt.exception.InitWizardException    .class    , MSG_INITWIZARDEXCEPTION    );
		exceptions.put(org.sblim.wbemsmt.exception.LoginException         .class    , MSG_LOGINEXCEPTION         );
		exceptions.put(org.sblim.wbemsmt.exception.ModelLoadException     .class    , MSG_MODELLOADEXCEPTION     );
		exceptions.put(org.sblim.wbemsmt.exception.ObjectCreationException.class    , MSG_OBJECTCREATIONEXCEPTION);
		exceptions.put(org.sblim.wbemsmt.exception.ObjectDeletionException.class    , MSG_OBJECTDELETIONEXCEPTION);
		exceptions.put(org.sblim.wbemsmt.exception.ObjectNotFoundException.class    , MSG_OBJECTNOTFOUNDEXCEPTION);
		exceptions.put(org.sblim.wbemsmt.exception.ObjectSaveException    .class    , MSG_OBJECTSAVEEXCEPTION    );
		exceptions.put(org.sblim.wbemsmt.exception.UpdateControlsException.class    , MSG_UPDATECONTROLSEXCEPTION);	
	}
	
	public static MessageNumber getMessageNumber(WbemSmtException wbemsmtExceptionCause) {
		
		MessageNumber result = null;
		if (wbemsmtExceptionCause != null)
		{
			result = (MessageNumber) exceptions.get(wbemsmtExceptionCause.getClass());
		}
		
		if (result == null)
		{
			result = MSG_OTHER_EXCEPTION;
		}
		return result;
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


	/**
	 * Locale IO
	 */
	public final static String SUBSYS_LIO = "LIO";

	public static final MessageNumber MSG_CANNOT_LOAD_SLP = new MessageNumber(COMPONENT,SUBSYS_LIO,1);
	public static final MessageNumber MSG_CANNOT_SAVE = new MessageNumber(COMPONENT,SUBSYS_LIO,2);
	
	/**
	 * WTR - Wbemsmt Tree
	 */
	public final static String SUBSYS_WTR = "WTR";

	public static final MessageNumber MSG_TASK_SUPPORTED = new MessageNumber(COMPONENT,SUBSYS_WTR,1);
	public static final MessageNumber MSG_TASK_NOT_SUPPORTED = new MessageNumber(COMPONENT,SUBSYS_WTR,2);
	public static final MessageNumber MSG_TASK_NOT_SUPPORTED_SERVER = new MessageNumber(COMPONENT,SUBSYS_WTR,3);
	public static final MessageNumber MSG_TASK_NOT_SUPPORTED_CLIENT = new MessageNumber(COMPONENT,SUBSYS_WTR,4);
	public static final MessageNumber MSG_HOST_NOT_FOUND =  new MessageNumber(COMPONENT,SUBSYS_WTR,5);

	/**
	 * ADM - Wbemsmt Tasklauncher admin
	 */
	
	public final static String SUBSYS_ADM = "ADM";
	
	public static final MessageNumber MSG_ADDED_HOST =  new MessageNumber(COMPONENT,SUBSYS_ADM,1);
	public static final MessageNumber MSG_REMOVED_HOST = new MessageNumber(COMPONENT,SUBSYS_ADM,2);
	
}
