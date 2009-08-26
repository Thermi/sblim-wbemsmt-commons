 /** 
  * DummyCIMInstanceFilter.java
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
  * Description: A filter that accepts all Instances
  * 
  */
package org.sblim.wbemsmt.tasklauncher.filter;

import javax.cim.CIMInstance;
import javax.wbem.client.WBEMClient;

public class DummyCIMInstanceFilter extends CIMInstanceFilter {

	/**
	 * 
	 */
	public DummyCIMInstanceFilter() {
		super();
	}

	/**
	 * accept all CIMInstances
	 * @see org.sblim.wbemsmt.tasklauncher.filter.CIMInstanceFilter#accept(org.sblim.wbem.cim.CIMInstance, WBEMClient)
	 */
	public boolean accept(CIMInstance cimInstance, WBEMClient cimClient) {
		return true;
	}

}
