 /** 
  * UnsignedInt32StringArrayConverter.java
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
  * Description: Converts a int32 in the model to a string array for the view
  * 
  */

package org.sblim.wbemsmt.tools.converter.multiplevalue;

import javax.cim.UnsignedInteger32;

import org.apache.commons.lang.ClassUtils;
import org.sblim.wbemsmt.tools.converter.StringArrayConverter;

public class UnsignedInt32StringArrayConverter extends MultipleValueConverter implements StringArrayConverter {


	protected Object getTypeWithInt(int ii) {
		return new UnsignedInteger32(ii);
	}
	public String getTypeForModel() {
		return ClassUtils.getShortClassName(UnsignedInteger32.class);
	}	
	
}
