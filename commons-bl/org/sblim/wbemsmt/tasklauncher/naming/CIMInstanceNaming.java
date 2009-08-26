 /** 
  * CIMInstanceNaming.java
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
  * Description: Interface for classes responsible for displaying cimInstances
  * 
  */
package org.sblim.wbemsmt.tasklauncher.naming;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.cim.CIMInstance;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco;
import org.sblim.wbemsmt.exception.WbemsmtException;

public abstract class CIMInstanceNaming
{
	
	protected static Logger logger = Logger.getLogger(CIMInstanceNaming.class.getName());

	private Map<String, String> params = new HashMap<String, String>(); 
	
	/**
	 * return the node description
	 * 
	 * Called only if the instance is having no CIM_ObjectIf associated
	 * 
	 * @param cimInstance
	 * @param cimClient the cim client instance
	 * @return
	 */
	public abstract String getDisplayString(CIMInstance cimInstance, WBEMClient cimClient) throws WbemsmtException ;

	/**
	 * return the node description
	 * @param cimObject
	 * @param cimClient
	 * @return
	 */
	public abstract String getDisplayString(AbstractWbemsmtFco cimObject, WBEMClient cimClient) throws WbemsmtException;
	
	public void addParameter(String name, String value)
	{
		params.put(name,value);
	}
	
	public String getParameter(String name)
	{
		return (String) params.get(name);
	}
	
}
