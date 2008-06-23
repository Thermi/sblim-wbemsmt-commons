 /** 
  * MessageList.java
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
  * Description: A list of messages. Messages for Succes, Info, Warning, Error can be added.
  * 
  */

package org.sblim.wbemsmt.bl.messages;

import java.util.*;

import org.apache.commons.collections.MultiHashMap;
import org.apache.commons.collections.MultiMap;
import org.sblim.wbemsmt.bl.adapter.DataContainer;

/**
 * A list of messages. Messages for Succes, Info, Warning, Error can be added.
 */
public class MessageList {

    /**
     * stores the message objects
     * key: String representing the type of the messages ({@link Message#SUCCESS},{@link Message#INFO},{@link Message#WARNING},{@link Message#ERROR})
     * value: {@link List} of {@link Message} objects
     */
	private MultiMap list = new MultiHashMap();
	
	/**
	 * set to store all message texts to check if the new message already exists
	 * @see #addMessage(Message)
	 */
	private Set messages = new HashSet();
	
	/**
	 * creates an empty message list
	 */
	public MessageList() {
		super();
	}

	/**
	 * @return true if the MessageList has messages from type ERROR
	 * @see Message#ERROR
	 */
	public boolean hasErrors()
	{
		List errorList = (List) list.get(Message.ERROR);
		return errorList != null && errorList.size() > 0;
	}
	/**
	 * @return true if the MessageList has messages from type WARNING
	 * @see Message#WARNING
	 */
	public boolean hasWarning()
	{
		List warningList = (List) list.get(Message.WARNING);
		return warningList != null && warningList.size() > 0;
	}
	/**
	 * @return true if the MessageList has messages from type INFO
	 * @see Message#INFO
	 */

	public boolean hasInfo()
	{
		List infoList = (List) list.get(Message.INFO);
		return infoList != null && infoList.size() > 0;
	}

	/**
	 * @return true if the MessageList has messages from type SUCCESS
	 * @see Message#SUCCESS
	 */

	public boolean hasSuccess()
	{
		List infoList = (List) list.get(Message.SUCCESS);
		return infoList != null && infoList.size() > 0;
	}

	/**
	 * @return all Messages from type ERROR
	 * @see Message#ERROR
	 */
	public Message[] getErrors() {
		return getList(Message.ERROR);
	}

	/**
	 * @return all Messages from type WARNING
	 * @see Message#WARNING
	 */
	public Message[] getWarnings() {
		return getList(Message.WARNING);
	}

	/**
	 * @return all Messages from type INFO
	 * @see Message#INFO
	 */
	public Message[] getInfos() {
		return getList(Message.INFO);
	}

	/**
	 * Helper-Method to get a list with messages from type type
	 * @param type the type of the messages that should be in the result
	 * @return array of {@link Message} objects
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
	 * Add the message as is to the list<br>
	 * If the message is already contained it's not added again
	 * @param message the message to add
	 */
	public void addMessage(Message message)
	{
		put(message.getType(),message);
	}
	
	/**
	 * Helper-Method to add the message message with type type.<br>
	 * If the message is already contained it's not added again
	 * @param type the type of the message
	 * @param message the message itself
	 */
	private void put(String type, Message message) {
		if (!messages.contains(message.getMessage()))
		{
			list.put(type,message);
			messages.add(message.getMessage());
		}
	}

	/**
	 * Get all Messages separated by the separator-string
	 * @param separator the separator characters
	 * @return the messages as one string
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
	 * @return the amount of all messages
	 */
	public int size() {
		return list.values().size();
	}

	
	/**
	 * clear alll messages
	 */
	public void clear() {
		list.clear();
		messages.clear();
	}

	/**
	 * Add all Messages contained in the given list to this list.<br>
	 * Duplicates are not added twice
	 * @param listToAdd list with new Messages
	 * @see #addMessage(Message)
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
	 * @return the iterator
	 */
	public Iterator iterator() {
		return list.values().iterator();
	}

	/**
	 * return true if there are no messages in the list
	 * @return true if empty
	 */
	public boolean isEmpty() {
		return list.values().isEmpty();
	}

	/**
	 * Initializes the MessageList of a container and gives the (empty) list back<br>
	 * if the container is already having a list the list is not touched.
	 * @param container the container to create a new list for
	 * @return the list within the container
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
