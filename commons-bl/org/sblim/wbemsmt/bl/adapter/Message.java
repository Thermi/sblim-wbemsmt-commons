 /** 
  * Message.java
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
  * Description: data object for types,messages and the components for this message
  * 
  */

package org.sblim.wbemsmt.bl.adapter;

import java.util.logging.Logger;

import org.sblim.wbemsmt.bl.MessageNumber;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class Message
{
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

	public static final int UNKNOWN_VALUE =99;

	private MessageNumber messageNumber;

	private Throwable cause;

	private int ordinal;
	
	public Message(MessageNumber messageNumber, String type, String msg)
	{
		LabeledBaseInputComponentIf[] inputComponent = null;
		init(messageNumber,type,msg,inputComponent);
	}

	public Message(MessageNumber messageNumber, String type, String msg, LabeledBaseInputComponentIf[] inputComponents)
	{
		init(messageNumber, type, msg, inputComponents);
	}

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

	public Message(MessageNumber messageNumber, String type, String msg, LabeledBaseInputComponentIf inputComponent)
	{
		this(messageNumber,type,msg,inputComponent != null ? new LabeledBaseInputComponentIf[]{inputComponent} : null);
	}

	public String toString()
	{
		return type + " " + msg;
	}
	
	public String toLocalizedString(WbemSmtResourceBundle bundle,boolean addType)
	{
		return (addType ? bundle.getString("type." + type) + " " : "") + msg;
	}
	
	public String getType()
	{
		return type;
	}
	
	public int getOrdinal()
	{ 
		return ordinal;  
	}
	
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

	public String getMessage()
	{
		return msg;
	}
	
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public MessageNumber getMessageNumber() {
		return messageNumber;
	}

	public LabeledBaseInputComponentIf[] getInputComponents() {
		return inputComponents;
	}

	public Throwable getCause() {
		return cause;
	}

	public void setCause(Throwable cause) {
		this.cause = cause;
	}
	
	public String getMessageString()
	{
		return messageNumber.getQualifiedNumber() + Message.getTypeAsSeverityCode(this) + " " + getMessage(); 
	}
	
	public String getMessageCode()
	{
		return messageNumber.getQualifiedNumber() + Message.getTypeAsSeverityCode(this); 
	}

	public boolean isError() {
		return isError(type);
	}
	
	public boolean isInfo() {
		return isInfo(type);
	}
	public boolean isSuccess() {
		return isSuccess(type);
	}
	public boolean isWarning() {
		return isWarning(type);
	}

	public static boolean isError(String type) {
		return type == ERROR;
	}
	
	public static boolean isInfo(String type) {
		return type == INFO;
	}
	public static boolean isSuccess(String type) {
		return type == SUCCESS;
	}
	public static boolean isWarning(String type) {
		return type == WARNING;
	}

	/**
	 * the key and objects are resolved with the resource bundle and used as Msg-Text 
	 * @param number
	 * @param type the Severity - use Constants in Message class
	 * @param bundle
	 * @param key
	 * @param objects can be null
	 * @return
	 * @see Message#SUCCESS
	 * @see Message#INFO
	 * @see Message#WARNING
	 * @see Message#ERROR
	 */
	public static Message create(MessageNumber number, String type, WbemSmtResourceBundle bundle, String key, Object[] objects) {
		if (objects != null)
			return new Message(number,type,bundle.getString(number,key,objects));
		else
			return new Message(number,type,bundle.getString(number,key));
	}

	/**
	 * the key is resolved with the resource bundle and used as Msg-Text 
	 * @param number
	 * @param type the Severity - use Constants in Message class
	 * @param bundle
	 * @param key
	 * @param objects
	 * @return
	 * @see Message#SUCCESS
	 * @see Message#INFO
	 * @see Message#WARNING
	 * @see Message#ERROR
	 */
	public static Message create(MessageNumber number, String type, WbemSmtResourceBundle bundle, String key) {
		return new Message(number,type,bundle.getString(number,key));
	}
	
	/**
	 * the objects together with the key of the defintion are resolved with the resource bundle and used as Msg-Text 
	 * @param definition
	 * @param type the Severity - use Constants in Message class
	 * @param bundle
	 * @param key
	 * @param objects can be null
	 * @return
	 * @see Message#SUCCESS
	 * @see Message#INFO
	 * @see Message#WARNING
	 * @see Message#ERROR
	 */
	public static Message create(MessageDefinition definition, WbemSmtResourceBundle bundle, Object[] objects) {
		if (objects != null)
			return new Message(definition.getNumber(),definition.getType(),bundle.getString(definition.getNumber(),definition.getKey(),objects));
		else
			return new Message(definition.getNumber(),definition.getType(),bundle.getString(definition.getNumber(),definition.getKey()));
	}
	
	/**
	 * the objects together with the key of the defintion are resolved with the resource bundle and used as Msg-Text 
	 * @param definition
	 * @param type the Severity - use Constants in Message class
	 * @param bundle
	 * @param key
	 * @return
	 * @see Message#SUCCESS
	 * @see Message#INFO
	 * @see Message#WARNING
	 * @see Message#ERROR
	 */
	public static Message create(MessageDefinition definition, WbemSmtResourceBundle bundle) {
		return new Message(definition.getNumber(),definition.getType(),bundle.getString(definition.getNumber(),definition.getKey()));
	}
	
	
}