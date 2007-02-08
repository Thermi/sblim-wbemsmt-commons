/** 
 * UnsignedInt16StringConverter.java
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
 * @author:	Michael Bauschert <Michael.Bauschert@de.ibm.com>
 *
 * Contributors: 
 *              
 *
 * Description: Class for Converting unsignedInt16 Values to Strings and back
 * 
 */

package org.sblim.wbemsmt.tools.converter.test.multiplevalue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.ClassUtils;
import org.sblim.wbem.cim.UnsignedInt64;
import org.sblim.wbemsmt.tools.converter.Converter;

public class UnsignedInt64StringConverter extends MultipleValueConverter implements Converter {

	/**
	 * Converts the selected Index of the param-given comboBox as UnsignedInt16-Object
	 */
	public Object convertForModel(Object guiElement) {
		List values = (List) guiElement;
		List result = new ArrayList();
		for (Iterator iter = values.iterator(); iter.hasNext();) {
			String value = (String) iter.next();
			result.add(new UnsignedInt64(Long.parseLong(value)));
		}
		return result;
	}

	public String getTypeForModel() {
		return ClassUtils.getShortClassName(UnsignedInt64.class);
	}	
	
}
