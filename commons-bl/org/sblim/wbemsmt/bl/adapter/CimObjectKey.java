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
 * CAUTION: because not every CIMInstance/ObjectPath has a hostname/port set, the hostname and port is removed during while the ObjectPath
 * 
 * 
 * @see AbstractBaseCimAdapter
 * 
 */
package org.sblim.wbemsmt.bl.adapter;

import java.util.ArrayList;
import java.util.List;

import javax.cim.CIMObjectPath;

import org.apache.commons.lang.ClassUtils;
import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco;
import org.sblim.wbemsmt.bl.tree.ICIMInstanceNode;

/**
 * A key to select a object within a AdapterClass
 * <br>
 * Can consist of a CIMObjectPath or an artificial key<br>
 * can contain a chiuld element to build hierarchical keys
 */
public class CimObjectKey  {

	private CIMObjectPath objectPath;
    private Object artificalKey;
	private CimObjectKey nextKey;
	private AbstractWbemsmtFco cimObject;

	/**
	 * Create a new Key with the object path of the given cimObject
	 * @param cimObject the object cotaining the path
	 */
	public CimObjectKey(AbstractWbemsmtFco cimObject)
	{
		this.cimObject = cimObject;
		setObjectPath(cimObject.getCimObjectPath());
	}

	/**
	 * Create a new Key with the object path
	 * @param objectPath the path for the key
	 */
	public CimObjectKey(CIMObjectPath objectPath)
	{
		setObjectPath(objectPath);
	}
	
	/**
	 * create a CIMObjectKey with an artifical key
	 * @param artificalKey the artifical key
	 */
	public CimObjectKey(Object artificalKey) {
        super();
        this.artificalKey = artificalKey;
    }

	/**
	 * returns the artficial key
	 * @return the artficial key
	 */
    public Object getArtificalKey() {
        return artificalKey;
    }

    /**
     * set the artficial key
     * @param artificalKey the key
     */
    public void setArtificalKey(Object artificalKey) {
        this.artificalKey = artificalKey;
    }

    /**
	 * Create a new Key with the object path of the instance node
	 * @param node the node carrying the ciminstance
	 */
	public CimObjectKey(ICIMInstanceNode node)
	{
		this.cimObject = node.getCimObject();
		setObjectPath(node.getCimInstance().getObjectPath());
	}

	/**
	 * Get the objectPath and artficialKey-Values of the keys as string
	 * @return the
	 */
	public String getInfo() {
	    
		String s = objectPath != null ? objectPath.toString() : artificalKey != null ? artificalKey.toString() : "--no key--";
        if (artificalKey != null)
        {
            s = s + "\n" + artificalKey;
        }
		if (nextKey != null)
		{
			s = s + "\n" + nextKey.getInfo();
		}
		return s;
	}

	/**
	 * get the Object path of the string
	 * @return the object path
	 */
	public CIMObjectPath getObjectPath() {
		return objectPath;
	}

	/**
	 * return the Object
	 * @return can be null
	 */
	public AbstractWbemsmtFco getCimObject() {
		return cimObject;
	}

	/**
	 * set the path 
	 * @param objectPath the object path
	 * @return the object key
	 */
	public CimObjectKey setObjectPath(CIMObjectPath objectPath) {
	    //we are cloning the objectPath but removing the host and the port
		this.objectPath = new CIMObjectPath(objectPath.getScheme(), null,null,objectPath.getNamespace(),objectPath.getObjectName(),objectPath.getKeys());
		return this;
	}
	
	/**
	 * get the child-key 
	 * @return the child-key - can be null
	 */
	public CimObjectKey getNextKey() {
		return nextKey;
	}
	
	/**
	 * set the child key
	 * @param key the child
	 * @return this key
	 */
	public CimObjectKey setNextKey(CimObjectKey key) {
		this.nextKey =key;
		return this;
	}
	
	
	/**
	 * get a list of this key element and all keys below
	 * @return a list with {@link CimObjectKey} instances
	 */
	public List getKeyList()
	{
		List result = new ArrayList();
		addKeyToList(result);
		return result;
	}
	
	/**
	 * helper method to add keys to a list<br>
	 * adds this key and all children to the list
	 * @param result the list with {@link CimObjectKey} elements
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
	 * @param fcoToCheck class of the FCO
	 * @return true if the objectPath of the contains the same cim class name than the fcoToCheck 
	 */
	public boolean isForType(Class fcoToCheck) {
		boolean result = false;
		
		String className = ClassUtils.getShortClassName(fcoToCheck);
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
	 * @param o the object to compar
	 * @return true if the hashcode of this key and the given Object is the same
	 */
	public boolean equals(Object o)
	{
		return o != null && hashCode() == o.hashCode();
	}
	
	
}
