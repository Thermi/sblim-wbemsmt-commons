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

public class MessageList {

	private MultiMap list = new MultiHashMap();
	private Set messages = new HashSet();
	
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
	 * Add the message as is to the list
	 * If the message is already contained it's not added again
	 * @param message
	 */
	public void addMessage(Message message)
	{
		put(message.getType(),message);
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
