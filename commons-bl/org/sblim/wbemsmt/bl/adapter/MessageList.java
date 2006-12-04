 /** 
  * MessageList.java
  *
  * (C) Copyright IBM Corp. 2005
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
  * Description: Result of a validation. Message for Info, Warning, Error can be added.
  * 
  */

package org.sblim.wbemsmt.bl.adapter;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections.MultiHashMap;
import org.apache.commons.collections.MultiMap;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public class MessageList {

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
	private MultiMap list = new MultiHashMap();
	private Set messages = new HashSet();
	
	public MessageList() {
		super();
	}

	/**
	 * @return true if the MessageList has messages from type ERROR
	 * @see #ERROR
	 */
	public boolean hasErrors()
	{
		List errorList = (List) list.get(ERROR);
		return errorList != null && errorList.size() > 0;
	}
	/**
	 * @return true if the MessageList has messages from type WARNING
	 * @see #WARNING
	 */
	public boolean hasWarning()
	{
		List warningList = (List) list.get(WARNING);
		return warningList != null && warningList.size() > 0;
	}
	/**
	 * @return true if the MessageList has messages from type INFO
	 * @see #INFO
	 */

	public boolean hasInfo()
	{
		List infoList = (List) list.get(INFO);
		return infoList != null && infoList.size() > 0;
	}

	/**
	 * @return all Messages from type ERROR
	 * @see #ERROR
	 */
	public Message[] getErrors() {
		return getList(ERROR);
	}

	/**
	 * @return all Messages from type WARNING
	 * @see #WARNING
	 */
	public Message[] getWarnings() {
		return getList(WARNING);
	}

	/**
	 * @return all Messages from type INFO
	 * @see #INFO
	 */
	public Message[] getInfos() {
		return getList(INFO);
	}

	/**
	 * Helper-Method to get a list with messages from type type
	 * @param type
	 * @return
	 */
	private Message[] getList(String type) {
		Collection collection = (List)list.get(type);
		if (collection != null)
		{
			return (Message[]) collection.toArray(new Message[collection.size()]);
		}
		else
		{
			return new Message[]{};
		}
	}

	/**
	 * add Info message
	 * If the message is already contained it's not added again
	 * @param msg
	 */
	public void addInfo(String msg)
	{
		put(INFO, new Message(INFO,msg, null));
	}
	/**
	 * add warning message
	 * If the message is already contained it's not added again
	 * @param msg
	 */
	public void addWarning(String msg)
	{
		put(WARNING, new Message(WARNING,msg, null));
	}
	/**
	 * add Error message
	 * If the message is already contained it's not added again
	 * @param msg
	 */
	public void addError(String msg)
	{
		put(ERROR, new Message(ERROR,msg, null));
	}
	
	/**
	 * add info message for the given component
	 * If the message is already contained it's not added again
	 * @param msg
	 * @param inputComponent
	 */
	public void addInfo(String msg,LabeledBaseInputComponentIf inputComponent)
	{
		put(INFO, new Message(INFO,msg,new LabeledBaseInputComponentIf[]{inputComponent}));
	}
	/**
	 * add warning message for the given component
	 * If the message is already contained it's not added again
	 * @param msg
	 * @param inputComponent
	 */
	public void addWarning(String msg,LabeledBaseInputComponentIf inputComponent)
	{
		put(WARNING, new Message(WARNING,msg,new LabeledBaseInputComponentIf[]{inputComponent}));
	}
	/**
	 * add error message for the given component
	 * If the message is already contained it's not added again
	 * @param msg
	 * @param inputComponent
	 */
	public void addError(String msg,LabeledBaseInputComponentIf inputComponent)
	{
		put(ERROR, new Message(ERROR,msg,new LabeledBaseInputComponentIf[]{inputComponent}));
	}

	/**
	 * add info message for the given components
	 * If the message is already contained it's not added again
	 * @param msg
	 * @param inputComponent
	 */

	public void addInfo(String msg,LabeledBaseInputComponentIf[] inputComponent)
	{
		put(INFO, new Message(INFO,msg,inputComponent));
	}

	/**
	 * add warning message for the given components
	 * If the message is already contained it's not added again
	 * @param msg
	 * @param inputComponent
	 */
	public void addWarning(String msg,LabeledBaseInputComponentIf[] inputComponent)
	{
		put(WARNING, new Message(WARNING,msg,inputComponent));
	}

	/**
	 * add error message for the given components
	 * If the message is already contained it's not added again
	 * @param msg
	 * @param inputComponent
	 */
	public void addError(String msg,LabeledBaseInputComponentIf[] inputComponent)
	{
		put(ERROR, new Message(ERROR,msg,inputComponent));
	}

	/**
	 * Add the message as is to the list
	 * If the message is already contained it's not added again
	 * @param message
	 */
	public void addMessage(Message message)
	{
		put(message.type,message);
	}
	
	/**
	 * Helper-Method to add the message message with type type.
	 * If the message is already contained it's not added again
	 * @param type
	 * @param message
	 */
	private void put(String type, Message message) {
		if (!messages.contains(message.getMessage()))
		{
			list.put(type,message);
		}
	}

	/**
	 * Get all Messages separated by the separator-string
	 * @param separator
	 * @return
	 */
	public String getMessages(String separator)
	{
		StringBuffer sb = new StringBuffer();
		Collection values = list.values();
		for (Iterator iter = values.iterator(); iter.hasNext();) {
			Message msg = (Message) iter.next();
			if (sb.length() > 0)
			{
				sb.append(separator);
			}
			sb.append(msg.toString());
		}
		return sb.toString();
	}
	
	/**
	 * count all messages 
	 * @return
	 */
	public int size() {
		return list.values().size();
	}

	
	/**
	 * clear alll messages
	 */
	public void clear() {
		list.clear();
		
	}

	/**
	 * Add all Messages contained in the given list to this list
	 * @param listToAdd
	 */
	public void addAll(MessageList listToAdd)
	{
		if (listToAdd != null)
		{
			for (Iterator iter = listToAdd.iterator(); iter.hasNext();) {
				Message msg = (Message) iter.next();
				addMessage(msg);
			}
		}
	}

	/**
	 * Get an iterator over all messages in this list
	 * @return
	 */
	public Iterator iterator() {
		return list.values().iterator();
	}

	/**
	 * return true if there are no messages in the list
	 * @return
	 */
	public boolean isEmpty() {
		return list.values().isEmpty();
	}

	/**
	 * data object class for types,messages and the components for this message
	 * @author Bauschert
	 *
	 */
	public static class Message
	{
		private final String type;
		private final String msg;
		private final LabeledBaseInputComponentIf[] inputComponents;

		Message(String type, String msg, LabeledBaseInputComponentIf[] inputComponents)
		{
			this.type = type;
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

		public String getMessage()
		{
			return msg;
		}

		public LabeledBaseInputComponentIf[] getInputComponents() {
			return inputComponents;
		}
		
	}
	
	
	/**
	 * Initializes the MessageList of a container and gives the (empty) list back
	 * @param container
	 * @return
	 */

	public static MessageList init(DataContainer container) {
		
		MessageList list = container.getMessagesList();
		if (list == null)
		{
			list = new MessageList();
			container.setMessagesList(list);
		}
		return list;
	}

	
}
