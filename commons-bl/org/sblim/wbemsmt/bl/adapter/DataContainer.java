 /** 
  * DataContainer.java
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
  * Description: Interface for DataContainers used by the Adapterclasses
  * 
  */
package org.sblim.wbemsmt.bl.adapter;


public interface DataContainer
{
	/**
	 * Sets the key defining the CIMObject to which the datContainer belongs
	 * @param key
	 */
	public void setKey(CimObjectKey key);
	
	/**
	 * get the key defining the CIMObject to which the datContainer belongs
	 * @return
	 */
	public CimObjectKey getKey();

	/**
	 * Set the Messages to be displayed
	 * @param messageList
	 */
	public void setMessagesList(MessageList messageList);
	
	/**
	 * Get the Messages to be displayed
	 * @return
	 */
	
	public MessageList getMessagesList();
	
	/**
	 * Get the adapter which is responsible for handling the container
	 * @return
	 */
	public AbstractBaseCimAdapter getAdapter();
	
	/**
	 * set the adapter belonging to a datacontainer
	 * @param adapter
	 */
	public void setAdapter(AbstractBaseCimAdapter adapter);

}
