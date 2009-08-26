 /** 
  * CIMInstanceFilter.java
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
  * Description: Filter for filtering CIMInstances
  * 
  */
package org.sblim.wbemsmt.tasklauncher.filter;

import java.util.HashMap;
import java.util.Map;

import javax.cim.CIMInstance;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.exception.WbemsmtException;

public abstract class CIMInstanceFilter
{
	private Map<String, String> params = new HashMap<String, String>(); 
	
	/**
	 * return true if we accept the instance
	 * @param cimInstance
	 * @param cimClient
	 * @return
	 */
	public abstract boolean accept(CIMInstance cimInstance, WBEMClient cimClient) throws WbemsmtException;
	
	public void addParameter(String name, String value)
	{
		params.put(name,value);
	}
	
	public String getParameter(String name)
	{
		return (String) params.get(name);
	}
	
}
