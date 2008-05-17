 /** 
  * WbemsmtEmbeddedObject.java
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
  * Description: represents a Wbemsmt embeddedObject
  * 
  */
package org.sblim.wbemsmt.bl.fco;

import javax.cim.CIMClass;
import javax.cim.CIMInstance;

public class WbemsmtEmbeddedObjectArray {
	
	private final Object object;

	public WbemsmtEmbeddedObjectArray(CIMInstance[] instance)
	{
		this.object = instance;
	}

	public WbemsmtEmbeddedObjectArray(CIMClass[] cls)
	{
		this.object = cls;
	}

	public Object getValue() {
		return object;
	}
	
	

}
