 /** 
  * CIMInstanceNaming.java
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
  * Description: base class for classes responsible loading the initial set of Objects
  * 
  */
package org.sblim.wbemsmt.tasklauncher.initialobjectloading;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.logging.Logger;

import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.tasklauncher.CIMClassNode;

public abstract class WbemsmtInitialObjectLoader
{
	
	protected static Logger logger = Logger.getLogger(WbemsmtInitialObjectLoader.class.getName());

	private Map params = new HashMap();

	private Vector initialObjects = new Vector(); 
	
	public void addParameter(String name, String value)
	{
		params.put(name,value);
	}

	public String getParameter(String name)
	{
		return (String) params.get(name);
	}
	
	
	public void addInitialObject(CIMInstance instance)
	{
		initialObjects.add(instance);
	}
	
	public abstract void load(CIMClassNode cimClassNode);
	
	/**
	 * returns the list with the Objects for the Initial use while building the tree
	 * @return
	 */
	public Vector getInitialObjects()
	{
		return initialObjects;
	}

	/**
	 * Returns the changed CIMClient.
	 * For example: If the Implementation starts in the InterOp namespace and navigates trough an association to an other 
	 * namespace the WbemsmtInitialObjectLoader can replace the namespace
	 * @return
	 */
	public abstract CIMClient getChangedCimClient();
}