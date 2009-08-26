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
  * Description: represents a Wbemsmt embeddedObject
  * 
  */
package org.sblim.wbemsmt.bl.fco;

import javax.cim.CIMClass;
import javax.cim.CIMInstance;

/**
 * represents a CIM embeddedObject
 * 
 */
public class WbemsmtEmbeddedObject {
	
	private final Object object;

	/**
	 * creates the embedded object
	 * @param instance the instance of the object
	 */
	public WbemsmtEmbeddedObject(CIMInstance instance)
	{
		this.object = instance;
	}

    /**
     * creates the embedded object
     * @param cls the class of the object
     */
	public WbemsmtEmbeddedObject(CIMClass cls)
	{
		this.object = cls;
	}

	/**
	 * get the value 
	 * @return the value can be {@link CIMInstance} or a {@link CIMClass}
	 */
	public Object getValue() {
		return object;
	}	
}
