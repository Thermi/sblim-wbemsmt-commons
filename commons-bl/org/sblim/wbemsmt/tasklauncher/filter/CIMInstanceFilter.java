 /** 
  * CIMInstanceFilter.java
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
  * Description: Filter for filtering CIMInstances
  * 
  */
package org.sblim.wbemsmt.tasklauncher.filter;

import java.util.HashMap;
import java.util.Map;

import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.exception.FilterException;

public abstract class CIMInstanceFilter
{
	private Map params = new HashMap(); 
	
	/**
	 * return true if we accept the instance
	 * @param cimInstance
	 * @param cimClient
	 * @return
	 */
	public abstract boolean accept(CIMInstance cimInstance, CIMClient cimClient) throws FilterException;
	
	public void addParameter(String name, String value)
	{
		params.put(name,value);
	}
	
	public String getParameter(String name)
	{
		return (String) params.get(name);
	}
	
}
