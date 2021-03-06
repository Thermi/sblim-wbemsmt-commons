 /** 
  * DataContainer.java
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
  * Description: Interface for DataContainers used by the Adapterclasses
  * 
  */
package org.sblim.wbemsmt.bl.adapter;

import java.util.List;

import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;


/**
 * Interface for DataContainers used by the Adapterclasses<br>
 * The abstraction layer between presentation and business logic<br>
 * The business logic works with the DataContainer interfaces and the PresentationLayer works with the Implementations
 */
public interface DataContainer
{
	/**
	 * Sets the key defining the CIMObject to which the datContainer belongs
	 * @param key the key
	 */
	public void setKey(CimObjectKey key);
	
	/**
	 * get the key defining the CIMObject to which the datContainer belongs
	 * @return the key
	 */
	public CimObjectKey getKey();

	/**
	 * Set the Messages to be displayed
	 * @param messageList the Messages
	 */
	public void setMessagesList(MessageList messageList);
	
	/**
	 * Get the Messages to be displayed
	 * @return the messages
	 */
	
	public MessageList getMessagesList();
	
	/**
	 * Get the adapter which is responsible for handling the container
	 * @return the adapter which is handling this container
	 */
	public AbstractBaseCimAdapter getAdapter();
	
	/**
	 * set the adapter belonging to a datacontainer
	 * @param adapter the adapter
	 */
	public void setAdapter(AbstractBaseCimAdapter adapter);

	/**
	 * Return a list of all Fields. A Field is a {@link LabeledBaseInputComponentIf}
	 * @return a list of {@link LabeledBaseInputComponentIf}
	 */
	public List<LabeledBaseInputComponentIf> getFields();

	/**
	 * Return a list of all associated childContainers. A childContainer is a DataContainer
	 * @return the {@link DataContainer} children
	 */
	public List<DataContainer> getChildContainers();

	/**
	 * copy the content (field and children) from one DataContainer to the target (this container instance)
	 * @param source the source
	 * @throws WbemsmtException if the copy failed
	 */
	public void copyFrom(DataContainer source) throws WbemsmtException;
	
	/**
	 * return true if a container or it's children is modified
	 * @return true if a container or it's children is modified 
	 */
	public boolean isModified();
	
    /**
     * can be implemented to count and cerate the children objects
     * @throws WbemsmtException if the count or create failed
     */
    public void countAndCreateChildren() throws WbemsmtException;
	
	
}
