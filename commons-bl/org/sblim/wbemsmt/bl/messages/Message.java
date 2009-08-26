 /** 
  * Message.java
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
  * Description: data object for types,messages and the components for this message
  * 
  */

package org.sblim.wbemsmt.bl.messages;

import java.util.logging.Logger;

import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

/**
 * data object for types,messages and the components for this message
 */
public class Message
{
    /**
     * the logger
     */
	static Logger logger = Logger.getLogger(Message.class.getName());

	private String type;
	private String msg;
	private LabeledBaseInputComponentIf[] inputComponents;
	/**
	 * Key for Success-messages
	 */
	public static final String SUCCESS = "Success";
	/**
	 * Key for Info-messages
	 */
	public static final String INFO = "Info";
	/**
	 * Key for Warning-messages
	 */
	public static final String WARNING = "Warning";
	/**
	 * Key for Error-messages
	 */
	public static final String ERROR = "Error";

	/**
	 * Ordinal value for Success-messages
	 */
	public static final int SUCCESS_VALUE = 3;
	/**
	 * Ordinal value for Info-messages
	 */
	public static final int INFO_VALUE = 2;
	/**
	 * Ordinal value for Warning-messages
	 */
	public static final int WARNING_VALUE = 1;
	/**
	 * Ordinal value for Error-messages
	 */
	public static final int ERROR_VALUE = 0;
    /**
     * Ordinal value for unknown-level-messages
     */
	public static final int UNKNOWN_VALUE =99;

	/**
	 * The yes/no option for input message dialogs
	 */
	public static final int INPUT_YES_NO = 0;
	
    /**
     * The ok/cancel option for input message dialogs
     */
    public static final int INPUT_OK_CANCEL = 1;

    /**
     * The default option for messages without required input actions
     */
    public static final int INPUT_NONE = -1;
    
    /**
     * Defines if a input is required
     * 
     * @see #INPUT_NONE
     * @see #INPUT_OK_CANCEL
     * @see #INPUT_YES_NO
     */
    private int requiredInput = INPUT_NONE;
    
    private MessageNumber messageNumber;

	private Throwable cause;

	private int ordinal;

	/**
	 * the instance which handles input from a user within a message
	 */
    private MessageInputHandler handler;
	

    /**
     * create a new Message<br>
     * <br><b>It's recommended to use the static create methods in this class. This constructor si only public to ensure backwards-compatibility</b>
     * @param messageNumber the message number
     * @param type the type, {@link #SUCCESS}, {@link #INFO}, {@link #WARNING}, {@link #ERROR}
     * @param msg the message
     */
	
	public Message(MessageNumber messageNumber, String type, String msg)
	{
		LabeledBaseInputComponentIf[] inputComponent = null;
		init(messageNumber,type,msg,inputComponent);
	}

    /**
     * create a new Message
     * <br><b>It's recommended to use the static create methods in this class. This constructor si only public to ensure backwards-compatibility</b>
     * @param messageNumber the message number
     * @param type the type, {@link #SUCCESS}, {@link #INFO}, {@link #WARNING}, {@link #ERROR}
     * @param msg the message
     * @param inputComponents the input components that are cause of this message (for example during validation)
     */
	public Message(MessageNumber messageNumber, String type, String msg, LabeledBaseInputComponentIf[] inputComponents)
	{
		init(messageNumber, type, msg, inputComponents);
	}

    /**
     * create a new Message
     * <br><b>It's recommended to use the static create methods in this class. This constructor si only public to ensure backwards-compatibility</b>
     * @param messageNumber the message number
     * @param type the type, {@link #SUCCESS}, {@link #INFO}, {@link #WARNING}, {@link #ERROR}
     * @param msg the message
     * @param inputComponent the input component which is cause of this message (for example during validation)
     */
	public Message(MessageNumber messageNumber, String type, String msg, LabeledBaseInputComponentIf inputComponent)
	{
		this(messageNumber,type,msg,inputComponent != null ? new LabeledBaseInputComponentIf[]{inputComponent} : null);
	}
	
    /**
     * intializes the message
     * @param messageNumber the message number
     * @param type the type, {@link #SUCCESS}, {@link #INFO}, {@link #WARNING}, {@link #ERROR}
     * @param msg the message
     * @param inputComponents the input components that are cause of this message (for example during validation)
     */
    private void init(MessageNumber messageNumber, String type, String msg, LabeledBaseInputComponentIf[] inputComponents) {
        this.messageNumber = messageNumber;
        this.type = type;
        this.ordinal = Message.getOrdinalFromType(type);
        this.msg = msg;
        if (inputComponents == null)
        {
            this.inputComponents = new LabeledBaseInputComponentIf[]{};
        }
        else
        {
            this.inputComponents = inputComponents;
        }
    }

    /**
     * get the integer value by the given type
     * @param type the type, {@link #SUCCESS}, {@link #INFO}, {@link #WARNING}, {@link #ERROR}
     * @return the integer value, {@link #SUCCESS_VALUE}, {@link #INFO_VALUE}, {@link #WARNING_VALUE}, {@link #ERROR_VALUE} or {@link #UNKNOWN_VALUE} if string is wrong 
     */
    public static int getOrdinalFromType(String type) {
        if (type == SUCCESS)
            return SUCCESS_VALUE;
        if (type == INFO)
            return INFO_VALUE;
        if (type == WARNING)
            return WARNING_VALUE;
        if (type == ERROR)
            return ERROR_VALUE;
        
        return UNKNOWN_VALUE;
    }
	

    /**
     * @return the type and the message
     */
	public String toString()
	{
		return type + " " + msg;
	}
	
	
	/**
	 * returns the localized string
	 * @param bundle the resource bundle with common messages (wbemsmt-commons/commons-bl/messages.properties)
	 * @param addType if true the localized type is added. Searches for translatable key 'type.&lt;Success|Info|Warning|Error&gt;'
	 * @return the i18n string
	 */
	public String toLocalizedString(WbemSmtResourceBundle bundle,boolean addType)
	{
		return (addType ? bundle.getString("type." + type) + " " : "") + msg;
	}
	
	/**
	 * the type, {@link #SUCCESS}, {@link #INFO}, {@link #WARNING}, {@link #ERROR}
	 * @return the type, {@link #SUCCESS}, {@link #INFO}, {@link #WARNING}, {@link #ERROR}
	 */
	public String getType()
	{
		return type;
	}
	
	/**
	 * the ordinal value of the type
	 * @return {@link #SUCCESS_VALUE}, {@link #INFO_VALUE}, {@link #WARNING_VALUE}, {@link #ERROR_VALUE} or {@link #UNKNOWN_VALUE}
	 * @see #getOrdinalFromType(String)
	 */
	public int getOrdinal()
	{ 
		return ordinal;  
	}

	/**
	 * Returns the required input option
	 * @return {@link #INPUT_NONE}, {@link #INPUT_OK_CANCEL}, {@link #INPUT_YES_NO}
	 */
	public int getRequiredInput() {
        return requiredInput;
    }

	/**
	 * set the requires input option
	 * @param requiredInput {@link #INPUT_NONE}, {@link #INPUT_OK_CANCEL}, {@link #INPUT_YES_NO}
	 */
    private void setRequiredInput(int requiredInput) {
        this.requiredInput = requiredInput;
    }
    
    /**
     * set the object for handling message input 
     * @param handler the handler
     */
    private void setMessageInputHandler(MessageInputHandler handler) {
        this.handler = handler;
    }

    /**
     * the object for handling message input
     * @return the object for handling message input
     */
    public  MessageInputHandler getMessageInputHandler() {
        return this.handler;
    }

    /**
     * get the type as a one character serverity code
     * @param message the message to get the severity code from
     * @return 'E' for {@link #ERROR}, 'W' for {@link #WARNING}, 'I' for {@link #INFO} and {@link #SUCCESS}, '?' for every other
     */
    public static char getTypeAsSeverityCode(Message message)
	{
		if (message.type == ERROR)
		{
			return 'E';
		}
		else if (message.type == WARNING)
		{
			return 'W';
		}
		else if (message.type == INFO || message.type == SUCCESS)
		{
			return 'I';
		}
		else
		{
			logger.severe("Found msg " + message.msg + " with type " + message.type + " which is not supported");
			return '?';
		}
	}

	/**
	 * return only the translated messagetext without the messagenumber
	 * @return the message text
	 */
	public String getMessage()
	{
		return msg;
	}
	
	/**
	 * set the translated message text
	 * @param msg the message
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	/**
	 * return the messageNumber
	 * @return the number
	 */
	public MessageNumber getMessageNumber() {
		return messageNumber;
	}

	/**
	 * return the input components
	 * @return the input components
	 */
	public LabeledBaseInputComponentIf[] getInputComponents() {
		return inputComponents;
	}

	/**
	 * the cause for this message
	 * @return the cause
	 */
	public Throwable getCause() {
		return cause;
	}

	/**
	 * set the exception which was the cause for this message
	 * @param cause the exception
	 */
	public void setCause(Throwable cause) {
		this.cause = cause;
	}
	
	/**
	 * returns the messageNumber and the translated message string
	 * @return the messageNumber and the translated message string
	 */
	public String getMessageString()
	{
		return getMessageCode() + " " + getMessage(); 
	}
	
	/**
	 * returns the messageCode represented by the messageNumber
	 * <br>
	 * the messageCode constists of the qualified MessageNumber and the severity code of this message 
	 * @return the messageCode represented by the messageNumber
	 * @see MessageNumber#getQualifiedNumber()
	 * @see #getTypeAsSeverityCode(Message)
	 */
	

	public String getMessageCode()
	{
		return messageNumber.getQualifiedNumber() + Message.getTypeAsSeverityCode(this); 
	}
	
	/**
	 * @return true if this message is an error message
	 */
	public boolean isError() {
		return isError(type);
	}
	
    /**
     * @return true if this message is a info message
     */
	public boolean isInfo() {
		return isInfo(type);
	}

	/**
     * @return true if this message is a success message
     */
	public boolean isSuccess() {
		return isSuccess(type);
	}
    /**
     * @return true if this message is a warning message
     */
	public boolean isWarning() {
		return isWarning(type);
	}

	/**
	 * check if the type is the type for an error message 
	 * @param type the type to checl
	 * @return true if the type indicates an error message
	 */
	public static boolean isError(String type) {
		return type == ERROR;
	}
	
    /**
     * check if the type is the type for a info message 
     * @param type the type to check
     * @return true if the type indicates a info message
     */
	public static boolean isInfo(String type) {
		return type == INFO;
	}
    /**
     * check if the type is the type for a success message 
     * @param type the type to check
     * @return true if the type indicates a success message
     */
	public static boolean isSuccess(String type) {
		return type == SUCCESS;
	}
	
    /**
     * check if the type is the type for a warning message 
     * @param type the type to check
     * @return true if the type indicates a warning message
     */
	public static boolean isWarning(String type) {
		return type == WARNING;
	}

	/**
	 * the key and objects are resolved with the resource bundle and used as Msg-Text 
	 * @param number the message number
     * @param type the Severity - use Constants in Message class ({@link #SUCCESS}, {@link #INFO}, {@link #WARNING}, {@link #ERROR})
	 * @param bundle the resource bundle
	 * @param key the key for the message
	 * @param objects can be null
	 * @return the message
	 */
	public static Message create(MessageNumber number, String type, WbemSmtResourceBundle bundle, String key, Object[] objects) {
		if (objects != null)
			return new Message(number,type,bundle.getString(number,key,objects));
		else
			return new Message(number,type,bundle.getString(number,key));
	}

	/**
	 * the key is resolved with the resource bundle and used as Msg-Text 
     * @param number the message number
     * @param type the Severity - use Constants in Message class ({@link #SUCCESS}, {@link #INFO}, {@link #WARNING}, {@link #ERROR})
     * @param bundle the resource bundle
     * @param key the key for the message
	 * @return the new message
	 */
	public static Message create(MessageNumber number, String type, WbemSmtResourceBundle bundle, String key) {
		return new Message(number,type,bundle.getString(number,key));
	}
	
	/**
	 * the objects together with the key of the defintion are resolved with the resource bundle and used as Msg-Text 
     * @param definition the MesageDefinition with static data for the new mesaage
     * @param bundle the resource bundle
     * @param objects can be null
	 * @return the new message
	 */
	public static Message create(MessageDefinition definition, WbemSmtResourceBundle bundle, Object[] objects) {
		if (objects != null)
			return new Message(definition.getNumber(),definition.getType(),bundle.getString(definition.getNumber(),definition.getKey(),objects));
		else
			return new Message(definition.getNumber(),definition.getType(),bundle.getString(definition.getNumber(),definition.getKey()));
	}
	
	/**
	 * the objects together with the key of the defintion are resolved with the resource bundle and used as Msg-Text 
	 * @param definition the MesageDefinition with static data for the new mesaage
     * @param bundle the resource bundle
	 * @return the new message
	 */
	public static Message create(MessageDefinition definition, WbemSmtResourceBundle bundle) {
		return new Message(definition.getNumber(),definition.getType(),bundle.getString(definition.getNumber(),definition.getKey()));
	}
	
    /**
     * the objects together with the key of the defintion are resolved with the resource bundle and used as Msg-Text 
     * @param definition the MesageDefinition with static data for the new mesaage
     * @param handler class to handle the input
     * @param bundle the resource bundle
     * @param objects can be null
     * @return the new message
     */
    public static Message create(MessageDefinition definition, MessageInputHandler handler, WbemSmtResourceBundle bundle, Object[] objects) {
        Message message;
        if (objects != null) {
            message = new Message(definition.getNumber(),definition.getType(),bundle.getString(definition.getNumber(),definition.getKey(),objects));
        }
        else {
            message = new Message(definition.getNumber(),definition.getType(),bundle.getString(definition.getNumber(),definition.getKey()));
        }
        message.setRequiredInput(definition.getRequiredInput());
        message.setMessageInputHandler(handler);
        return message;
    }
    

    /**
     * the objects together with the key of the defintion are resolved with the resource bundle and used as Msg-Text 
     * @param definition the MesageDefinition with static data for the new mesaage
     * @param handler class to handle the input
     * @param bundle the resource bundle
     * @return the new message
     */
    public static Message create(MessageDefinition definition, MessageInputHandler handler, WbemSmtResourceBundle bundle) {
        Message message = new Message(definition.getNumber(),definition.getType(),bundle.getString(definition.getNumber(),definition.getKey()));
        message.setRequiredInput(definition.getRequiredInput());
        message.setMessageInputHandler(handler);
        return message;
    }	
	
	
}