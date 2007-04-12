 /** 
  * DummyCIMInstanceFilter.java
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
  * Description: A filter that accepts all Instances
  * 
  */
package org.sblim.wbemsmt.tasklauncher.filter;

import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.client.CIMClient;

public class DummyCIMInstanceFilter extends CIMInstanceFilter {

	/**
	 * 
	 */
	public DummyCIMInstanceFilter() {
		super();
	}

	/**
	 * accept all CIMInstances
	 * @see org.sblim.wbemsmt.tasklauncher.filter.CIMInstanceFilter#accept(org.sblim.wbem.cim.CIMInstance, CIMClient)
	 */
	public boolean accept(CIMInstance cimInstance, CIMClient cimClient) {
		return true;
	}

}
