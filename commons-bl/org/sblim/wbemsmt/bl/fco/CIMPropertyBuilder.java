 /** 
  * CIMPropertyUtil.java
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
  * Description: Helper class for creating CIMProperties
  * 
  */
package org.sblim.wbemsmt.bl.fco;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbemsmt.schema.cim29.CIM_ManagedElement;

public class CIMPropertyBuilder {

	/**
	 * Create a CIMProperty with name, value and type.
	 * @param name
	 * @param value 
	 * @param type
	 * @return
	 * @see CIMDataType#CIMDataType(int)
	 */
	public static CIMProperty create(String name, Object value, int type)
	{
		return new CIMProperty(name, new CIMValue(value,new CIMDataType(type)));
	}

	/**
	 * Create a new CIMProperty with the objectPath of CIM_Object as value, the objectName of CIM_Object as CIMDataType 
	 * (can be use used for creating attributes representing associated classes)
	 * @param name
	 * @param object
	 * @return
	 */
	public static CIMProperty create(String name, CIM_Object object) {
		return new CIMProperty(name, new CIMValue(object.getCimObjectPath(),new CIMDataType(object.getCimObjectPath().getObjectName())));
	}

	/**
	 * Create a new CIMProperty with the objectPath of CIM_ManagedElement as value, the objectName of CIM_ManagedElement as CIMDataType
	 * (can be use used for creating attributes representing associated classes) 
	 * @param name
	 * @param object
	 * @return
	 */
	public static CIMProperty create(String name, CIM_ManagedElement object) {
		return new CIMProperty(name, new CIMValue(object.getCimObjectPath(),new CIMDataType(object.getCimObjectPath().getObjectName())));
	}

	/**
	 * Create a CIMValue with value and type.
	 * @param value 
	 * @param type
	 * @return
	 * @see CIMDataType#CIMDataType(int)
	 */
	public static CIMValue createVaue(Object value, int type) {
		return new CIMValue(value,new CIMDataType(type));
	}
}
