 /** 
  * CIMInstanceNaming.java
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
  * Description: Interface for classes responsible for displaying cimInstances
  * 
  */
package org.sblim.wbemsmt.tasklauncher.naming;

import java.util.HashMap;
import java.util.Map;

import org.sblim.wbem.cim.CIMInstance;

public abstract class CIMInstanceNaming
{
	private Map params = new HashMap(); 
	
	/**
	 * return true if we accept the instance
	 * @param cimInstance
	 * @return
	 */
	public abstract String getDisplayString(CIMInstance cimInstance);
	
	public void addParameter(String name, String value)
	{
		params.put(name,value);
	}
	
	public String getParameter(String name)
	{
		return (String) params.get(name);
	}
	
}
