 /** 
  * BaseDataContainer.java
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
  * Description: The Baseclass for DataContainer implementations for the CommandLine
  * 
  */
package org.sblim.wbemsmt.bl.adapter;

import java.io.PrintWriter;

import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.exception.WbemsmtException;

/**
 * The Baseclass for DataContainer implementations for the CommandLine
 */
public abstract class BaseDataContainer implements DataContainer {

	/**
	 * List option for just listing the CIMObjectKey instance of a DateContainer
	 */
	public static final String LIST_OPTION_KEY = "KEY";
	/**
	 * List option for listing the CIMObjectKey instance of a DateContainer and the content
	 */
	public static final String LIST_OPTION_INSTANCE = "INSTANCE";
	/**
	 * List option for listing the CIMObjectKey instance of a DateContainer,the content and the childs
	 */
	public static final String LIST_OPTION_INSTANCE_WITH_CHILDS = "INSTANCE_WITH_CHILDS";
	
	private CimObjectKey key;
	private AbstractBaseCimAdapter adapter;
	
	/**
	 * @param key the next key (at the next deeper level of the hierarchy)
	 * @see DataContainer#setKey(CimObjectKey)
	 */

	public void setKey(CimObjectKey key)
	{
		this.key = key;
	}

	/**
	 * get the key
	 * @return the key
	 * @see DataContainer#getKey()
	 */

	public CimObjectKey getKey() {
		return this.key;
	}

	/**
	 * get the adapter which is responsible for this DataContainer
	 * @return the adapter
	 * @see DataContainer#getAdapter()
	 */
	public AbstractBaseCimAdapter getAdapter() {
		return adapter;
	}

	/**
	 * set the adapter
	 * @param adapter the adapter the adapter which is responsible for this object
	 * @see DataContainer#setAdapter(AbstractBaseCimAdapter)
	 */
	public void setAdapter(AbstractBaseCimAdapter adapter) {
		this.adapter = adapter;
	}

	/**
	 * returns true if the listOption defines that the Key of the Object should be traced
	 * currently thats true for all valid listOptions
	 * @param listOption the listOption
	 * @return true if the key is traced
     * @see #LIST_OPTION_KEY
     * @see #LIST_OPTION_INSTANCE
     * @see #LIST_OPTION_INSTANCE_WITH_CHILDS
	 */
	public boolean showKey(String listOption)
	{
		return listOptionIsValid(listOption);
	}

	/**
	 * return true if the given ListOption is one if the defined<br>
	 * Valid are the listoptions defined in this class
	 * @param listOption the listoption to check
	 * @return true of the listoption is valid
	 * 
	 * 
	 * @see #LIST_OPTION_KEY
	 * @see #LIST_OPTION_INSTANCE
	 * @see #LIST_OPTION_INSTANCE_WITH_CHILDS
	 * 
	 */
	public static boolean listOptionIsValid(String listOption)
	{
		return LIST_OPTION_KEY.equals(listOption) || LIST_OPTION_INSTANCE.equals(listOption) || LIST_OPTION_INSTANCE_WITH_CHILDS.equals(listOption);
	}

	/**
	 * returns true if the listOption defines that the InstanceData of the Object should be traced
	 * @param listOption the list option
	 * @return true if the listOption defines that the InstanceData of the Object should be traced
     * @see #LIST_OPTION_KEY
     * @see #LIST_OPTION_INSTANCE
     * @see #LIST_OPTION_INSTANCE_WITH_CHILDS
	 */
	public boolean showInstance(String listOption)
	{
		return LIST_OPTION_INSTANCE.equals(listOption) || LIST_OPTION_INSTANCE_WITH_CHILDS.equals(listOption);
	}
	
	/**
	 * returns true if the listOption defines that the instance data of the Object including its child should be traced
	 * @param listOption the option
	 * @return true if the listOption defines that the instance data of the Object including its child should be traced
     * @see #LIST_OPTION_KEY
     * @see #LIST_OPTION_INSTANCE
     * @see #LIST_OPTION_INSTANCE_WITH_CHILDS
	 */
	public boolean showChilds(String listOption)
	{
		return LIST_OPTION_INSTANCE_WITH_CHILDS.equals(listOption);
	}

	/**
	 * Trace to the PrintWriter<br>
	 * The listOprions used is LIST_OPTION_INSTANCE_WITH_CHILDS
	 * <br>showTitle is true
	 * @param out the output writer
	 */
	public void trace(PrintWriter out)
	{
		trace(out,LIST_OPTION_INSTANCE_WITH_CHILDS,true);
	}

	/**
	 * Trace to the PrintWriter
     * <br>showTitle is true
     * @param out the output writer
     * @param listOption the list option
     * @see #LIST_OPTION_KEY
     * @see #LIST_OPTION_INSTANCE
     * @see #LIST_OPTION_INSTANCE_WITH_CHILDS
	 */

	public void trace(PrintWriter out, String listOption)
	{
		trace(out,listOption,true);
	}
	
    /**
     * Trace children to the PrintWriter
     * <br>showTitle is true
     * @param out the output writer
     * @param listOption the list option
     * @see #LIST_OPTION_KEY
     * @see #LIST_OPTION_INSTANCE
     * @see #LIST_OPTION_INSTANCE_WITH_CHILDS
     */

	public void traceChilds(PrintWriter out, String listOption)
	{
		traceChilds(out,listOption,true);
	}

	/**
	 * Subclasses should implement this for tracing the object
	 * @param out the PrintStream for Tracing the object
	 * @param listOption one of the LIST_OPTION_... Values
	 * @param showTitle should the Instance trace it's name
	 * 
	 * @see #LIST_OPTION_KEY
	 * @see #LIST_OPTION_INSTANCE
	 * @see #LIST_OPTION_INSTANCE_WITH_CHILDS
	 */
	public abstract void trace(PrintWriter out, String listOption, boolean showTitle);
	
	/**
	 * Subclasses should implement this for tracing the object
	 * @param out the PrintStream for Tracing the object
	 * @param listOption one of the LIST_OPTION_... Values
	 * @param showTitle should the Instance trace it's name
	 * 
	 * @see #LIST_OPTION_KEY
	 * @see #LIST_OPTION_INSTANCE
	 * @see #LIST_OPTION_INSTANCE_WITH_CHILDS
	 */
	public abstract void traceChilds(PrintWriter out, String listOption,boolean showTitle);

	private MessageList messageList;

	/**
	 * @param messageList the messages
	 * @see DataContainer#setMessagesList(MessageList)
	 */
	public void setMessagesList(MessageList messageList) {
		this.messageList = messageList;
	}
	
	/**
	 * get the messages
	 * @return the messages
	 * @see DataContainer#getMessagesList()
	 */

	public MessageList getMessagesList() {
		return messageList;
	}
	
    /**
     * can be implemented to count and create the children objects<br>
     * TODO enable cli subclasses to create and count children
     * @throws WbemsmtException if the count or the create failed
     */
    public void countAndCreateChildren() throws WbemsmtException
    {}

}
