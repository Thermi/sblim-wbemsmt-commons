 /** 
  * UnsignedInt16StringArrayConverter.java
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
  * Description: Converts a int in the model to a string based on the given array for th view
  * 
  */

package org.sblim.wbemsmt.tools.converter.multiplevalue;

import javax.cim.UnsignedInteger16;

import org.apache.commons.lang.ClassUtils;
import org.sblim.wbemsmt.tools.converter.StringArrayConverter;

public class UnsignedInt16StringArrayConverter extends MultipleValueConverter implements StringArrayConverter {

	public UnsignedInt16StringArrayConverter() {
		
	}

	protected Object getTypeWithInt(int ii) {
		return new UnsignedInteger16(ii);
	}
	
	public String getTypeForModel() {
		return ClassUtils.getShortClassName(UnsignedInteger16.class);
	}	
	
}
