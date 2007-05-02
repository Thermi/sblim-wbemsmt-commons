 /** 
  * CIM_ObjectIf.java
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
  * Description: Interface for all wrappers of a CIMObject
  * 
  * 
  * 
  */
package org.sblim.wbemsmt.bl.fco;

import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;

public interface CIM_ObjectIf {

	public CIMObjectPath getCimObjectPath();
	public Object getWrappedObject();
	
	public CIMInstance getCimInstance();
	public void setCimInstance(CIMInstance cimInstance);

	public String getClassDisplayName();
	public boolean isModified();
}
