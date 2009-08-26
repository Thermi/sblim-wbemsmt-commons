 /** 
  * UnsignedInt8StringArrayConverter.java
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
  * Description: Converts a int8 in the model to a string array for the view
  * 
  */


package org.sblim.wbemsmt.tools.converter.multiplevalue;

import javax.cim.UnsignedInteger8;

import org.sblim.wbemsmt.tools.converter.StringArrayConverter;

public class UnsignedInt8StringArrayConverter extends MultipleValueConverter implements StringArrayConverter {

	protected Object getTypeWithInt(int ii) {
		return new UnsignedInteger8((short)ii);
	}
	
	public Class<UnsignedInteger8> getTypeForModel() {
		return UnsignedInteger8.class;
	}	
}
