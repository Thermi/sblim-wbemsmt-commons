 /** 
  * WbemsmtEmbeddedObject.java
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
  * Description: represents a Wbemsmt embeddedObject array
  * 
  */
package org.sblim.wbemsmt.bl.fco;

import javax.cim.CIMClass;
import javax.cim.CIMInstance;

/**
 * represents a CIM EmbeddedObject array
 */
public class WbemsmtEmbeddedObjectArray {
	
	private final Object object;

	/**
	 * create a new array
	 * @param instances the cim instances
	 */
	public WbemsmtEmbeddedObjectArray(CIMInstance[] instances)
	{
		this.object = instances;
	}

    /**
     * create a new array
     * @param classes the cim classes
     */
	public WbemsmtEmbeddedObjectArray(CIMClass[] classes)
	{
		this.object = classes;
	}

    /**
     * get the value 
     * @return the value can be {@link CIMInstance}[] or a {@link CIMClass}[]
     */
     public Object getValue() {
		return object;
	}
	
	

}
