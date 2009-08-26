 /** 
  * DummyCIMInstanceaming.java
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
  * Description: A filter that takes the Name Attribute and returns it for display
  * 
  */
package org.sblim.wbemsmt.tasklauncher.naming;

import javax.cim.CIMInstance;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco;

public class DummyCIMInstanceNaming extends CIMInstanceNaming {

	/**
	 * 
	 */
	public DummyCIMInstanceNaming() {
		super();
	}

	/**
	 * accept all CIMInstances
	 * @see org.sblim.wbemsmt.tasklauncher.filter.CIMInstanceFilter#accept(org.sblim.wbem.cim.CIMInstance, WBEMClient)
	 */
	public String getDisplayString(CIMInstance cimInstance, WBEMClient cimClient) {
		return cimInstance.getProperty("Name").getValue().toString();
	}

	public String getDisplayString(AbstractWbemsmtFco cimObject, WBEMClient cimClient) {
		return getDisplayString(cimObject.getCimInstance(), cimClient);
	}
	
}
