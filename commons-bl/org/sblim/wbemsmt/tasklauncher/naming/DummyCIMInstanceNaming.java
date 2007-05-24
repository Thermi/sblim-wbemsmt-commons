 /** 
  * DummyCIMInstanceaming.java
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
  * Description: A filter that takes the Name Attribute and returns it for display
  * 
  */
package org.sblim.wbemsmt.tasklauncher.naming;

import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.fco.CIM_ObjectIf;

public class DummyCIMInstanceNaming extends CIMInstanceNaming {

	/**
	 * 
	 */
	public DummyCIMInstanceNaming() {
		super();
	}

	/**
	 * accept all CIMInstances
	 * @see org.sblim.wbemsmt.tasklauncher.filter.CIMInstanceFilter#accept(org.sblim.wbem.cim.CIMInstance, CIMClient)
	 */
	public String getDisplayString(CIMInstance cimInstance, CIMClient cimClient) {
		return (String) cimInstance.getProperty("Name").getValue().getValue();
	}

	public String getDisplayString(CIM_ObjectIf cimObject, CIMClient cimClient) {
		return getDisplayString(cimObject.getCimInstance(), cimClient);
	}
	
}
