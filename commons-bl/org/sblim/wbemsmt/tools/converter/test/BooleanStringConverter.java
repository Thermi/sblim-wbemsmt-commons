/** 
 * BooleanStringConverter.java
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
 * Description: Class for Converting boolean Values to Strings and back
 * 
 */

package org.sblim.wbemsmt.tools.converter.test;

import org.sblim.wbemsmt.tools.converter.Converter;

public class BooleanStringConverter implements Converter {

	/**
	 * return the boolean value as String 
	 */
	public Object convertForGui(Object value) {
		Boolean iValue = (Boolean)value;
		return "" + (iValue != null && iValue.booleanValue());
	}

	/**
	 * Converts the param-given String as Boolean 
	 */
	public Object convertForModel(Object guiElement) {
		String value = (String) guiElement;
		return new Boolean("true".equalsIgnoreCase(value));
	}

	public boolean canConvert(Object guiElement) {
			//can always convert
			return true;
	}

	public String getTypeForModel() {
		return "Boolean";
	}

}
