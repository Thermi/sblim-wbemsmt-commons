/** 
 * CimObjectKey.java
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
 * Description: A key to select a object within a AdapterClass
 * 
 * @see AbstractBaseCimAdapter
 * 
 */
package org.sblim.wbemsmt.bl.adapter;

import java.util.ArrayList;
import java.util.List;

import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbemsmt.bl.fco.CIM_ObjectIf;
import org.sblim.wbemsmt.bl.tree.ICIMInstanceNode;
import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;

public class CimObjectKey  {

	private CIMObjectPath objectPath;
	private CimObjectKey nextKey;

	/**
	 * Create a new Key with the object path of the given managedElement
	 * @param managedElement
	 */
	public CimObjectKey(CIM_ManagedElement managedElement)
	{
		this.objectPath = managedElement.getCimObjectPath();
	}

	/**
	 * Create a new Key with the object path of the given managedElement
	 * @param managedElement
	 */
	public CimObjectKey(CIM_ObjectIf cimObject)
	{
		this.objectPath = cimObject.getCimObjectPath();
	}

	/**
	 * Create a new Key with the object path
	 * @param objectPath
	 */
	public CimObjectKey(CIMObjectPath objectPath)
	{
		this.objectPath = objectPath;
	}
	
	/**
	 * Create a new Key with the object path of the instance node
	 * @param node
	 */
	public CimObjectKey(ICIMInstanceNode node)
	{
		this.objectPath = node.getCimInstance().getObjectPath();
	}

	/**
	 * Get the objectPath-Values of the keys as string
	 * @return
	 */
	public String getInfo() {
		String s = objectPath.toString();
		if (nextKey != null)
		{
			s = s + "\n" + nextKey.getInfo();
		}
		return s;
	}

	/**
	 * get the Object path of the string
	 * @return
	 */
	public CIMObjectPath getObjectPath() {
		return objectPath;
	}
	
	/**
	 * set the path 
	 * @param objectPath
	 * @return
	 */
	public CimObjectKey setObjectPath(CIMObjectPath objectPath) {
		this.objectPath = objectPath;
		return this;
	}
	
	/**
	 * get the child-key 
	 * @return
	 */
	public CimObjectKey getNextKey() {
		return nextKey;
	}
	
	/**
	 * set the child key
	 * @param key
	 * @return
	 */
	public CimObjectKey setNextKey(CimObjectKey key) {
		this.nextKey =key;
		return this;
	}
	
	
	/**
	 * get a list of this key element and all keys below
	 * @return
	 */
	public List getKeyList()
	{
		List result = new ArrayList();
		addKeyToList(result);
		return result;
	}
	
	/**
	 * helper method to add keys to a list
	 * @param result
	 */
	private void addKeyToList(List result) {
		result.add(this);
		if (nextKey != null)
		{
			nextKey.addKeyToList(result);
		}
	}
	
	/**
	 * Checks if the Object key is a key of the given class.
	 * This is done bei checking the name of classToCheck against the objectName of the ObjectPath of this key
	 * @param classToCheck
	 * @return
	 */
	public boolean isForType(Class classToCheck) {
		boolean result = false;
		
		String className = classToCheck.getName();
		if (className.indexOf(".") > -1)
		{
			className = className.substring(className.lastIndexOf(".")+1);
		}
		result = objectPath.getObjectName().equals(className);
		return result;
	}
	
	/**
	 * @return the String-Representation of this key and his childs
	 */
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		List list = getKeyList();
		
		for (int i=0; i < list.size(); i++)
		{
			CimObjectKey key = (CimObjectKey) list.get(i);
			if (i>0)
			{
				sb.append("\n");
			}
			sb.append(key.getObjectPath().toString());
		}

		return sb.toString();
	}

	/**
	 * @return a hashcode for this key and his childs
	 */
	public int hashCode() {
		return toString().hashCode();
	}
	
	/**
	 * @return true if the hashcode of this key and the given Object is the same
	 */
	public boolean equals(Object o)
	{
		return o != null && hashCode() == o.hashCode();
	}
	
	
}
