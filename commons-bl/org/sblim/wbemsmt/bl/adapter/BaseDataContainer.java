 /** 
  * BaseDataContainer.java
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
  * Description: The Baseclass for DataContainer implementations for the CommandLine
  * 
  */
package org.sblim.wbemsmt.bl.adapter;

import java.io.PrintStream;

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
	 * @see DataContainer#setKey(CimObjectKey)
	 */

	public void setKey(CimObjectKey key)
	{
		this.key = key;
	}

	/**
	 * @see DataContainer#getKey()
	 */

	public CimObjectKey getKey() {
		return this.key;
	}

	/**
	 * @see DataContainer#getAdapter()
	 */
	public AbstractBaseCimAdapter getAdapter() {
		return adapter;
	}

	/**
	 * @see DataContainer#setAdapter(AbstractBaseCimAdapter)
	 */
	public void setAdapter(AbstractBaseCimAdapter adapter) {
		this.adapter = adapter;
	}

	/**
	 * returns true if the listOption defines that the Key of the Object should be traced
	 * currently thats true for all valid listOptions
	 * @param listOption
	 * @return
	 */
	public boolean showKey(String listOption)
	{
		return listOptionIsValid(listOption);
	}

	/**
	 * return true if the given ListOption is one if the defined<br>
	 * Valid are the listoptions defined in this class
	 * @param listOption
	 * @return
	 * 
	 * 
	 * @see #LIST_OPTION_KEY
	 * @see #LIST_OPTION_INSTANCE
	 * @see #LIST_OPTION_INSTANCE_WITH_CHILDS
	 * 
	 */
	public static boolean listOptionIsValid(String listOption)
	{
		return LIST_OPTION_INSTANCE.equals(listOption) || LIST_OPTION_INSTANCE.equals(listOption) || LIST_OPTION_INSTANCE_WITH_CHILDS.equals(listOption);
	}

	/**
	 * returns true if the listOption defines that the InstanceData of the Object should be traced
	 * @param listOption
	 * @return
	 */
	public boolean showInstance(String listOption)
	{
		return LIST_OPTION_INSTANCE.equals(listOption) || LIST_OPTION_INSTANCE_WITH_CHILDS.equals(listOption);
	}
	
	/**
	 * returns true if the listOption defines that the instance data of the Object including its child should be traced
	 * @param listOption
	 * @return
	 */
	public boolean showChilds(String listOption)
	{
		return LIST_OPTION_INSTANCE_WITH_CHILDS.equals(listOption);
	}

	/**
	 * Trace to the PribtStream, The listOprions used is LIST_OPTION_INSTANCE_WITH_CHILDS and showTitle is true
	 * @param out
	 */
	public void trace(PrintStream out)
	{
		trace(out,LIST_OPTION_INSTANCE_WITH_CHILDS,true);
	}

	/**
	 * Trace to the PribtStream, showTitle is true
	 * @param out
	 */

	public void trace(PrintStream out, String listOption)
	{
		trace(out,listOption,true);
	}
	
	/**
	 * Trace to the PrintStream, showTitle is true
	 * @param out
	 */

	public void traceChilds(PrintStream out, String listOption)
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
	public abstract void trace(PrintStream out, String listOption, boolean showTitle);
	
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
	public abstract void traceChilds(PrintStream out, String listOption,boolean showTitle);

	private MessageList messageList;

	/**
	 * @see DataContainer#setMessagesList(MessageList)
	 */
	public void setMessagesList(MessageList messageList) {
		this.messageList = messageList;
	}
	
	/**
	 * @see DataContainer#getMessagesList()
	 */

	public MessageList getMessagesList() {
		return messageList;
	}
	

}
