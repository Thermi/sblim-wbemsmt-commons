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

public class DummyCIMInstanceNaming extends CIMInstanceNaming {

	/**
	 * 
	 */
	public DummyCIMInstanceNaming() {
		super();
	}

	/**
	 * accept all CIMInstances
	 * @see org.sblim.wbemsmt.tasklauncher.filter.CIMInstanceFilter#accept(org.sblim.wbem.cim.CIMInstance)
	 */
	public String getDisplayString(CIMInstance cimInstance) {
		return (String) cimInstance.getProperty("Name").getValue().getValue();
	}

}
