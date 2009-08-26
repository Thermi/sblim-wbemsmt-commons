 /** 
  * CIMPropertyUtil.java
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
  * Description: Helper class for creating CIMProperties
  * 
  */
package org.sblim.wbemsmt.bl.fco;

import javax.cim.CIMDataType;
import javax.cim.CIMProperty;

import org.sblim.wbemsmt.schema.cim221.CIM_ManagedElement;

/**
 * Helper class for creating CIMProperties
 */
public final class CIMPropertyBuilder {

    /**
     * utility class with private constructor only
     */
    private CIMPropertyBuilder(){}
    
	/**
	 * Create a CIMProperty with name, value and type.
	 * @param name name of the property
	 * @param value  the value
	 * @param type the type see type integers in {@link CIMDataType}
	 * @return the Property
	 * @see CIMDataType#CIMDataType(int)
	 */
	public static CIMProperty create(String name, Object value, int type)
	{
		return new CIMProperty(name, new CIMDataType(type,-1),value);
	}

	/**
	 * Create a new CIMProperty with the objectPath of AbstractWbemsmtFco as value, the objectName of AbstractWbemsmtFco as CIMDataType 
	 * (can be use used for creating attributes representing associated classes)
     * @param name name of the property
     * @param object fco 
     * @return the Property
	 */
	public static CIMProperty create(String name, AbstractWbemsmtFco object) {
		return new CIMProperty(name, new CIMDataType(object.getCimObjectPath().getObjectName()),object.getCimObjectPath());
	}

    /**
     * Create a new CIMProperty with the objectPath of object as value, the objectName of CIM_Object as CIMDataType 
     * (can be use used for creating attributes representing associated classes)
     * @param name name of the property
     * @param object fco 
     * @return the Property
     */
	public static CIMProperty create(String name, CIM_ManagedElement object) {
		return new CIMProperty(name, new CIMDataType(object.getCimObjectPath().getObjectName()),object.getCimObjectPath());
	}
}
