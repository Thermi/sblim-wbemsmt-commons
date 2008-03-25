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

package org.sblim.wbemsmt.tools.converter.test;

import org.apache.commons.lang.ClassUtils;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbemsmt.tools.converter.Converter;

public class UnsignedInt16StringConverter implements Converter {

	/**
	 * return the SelectedIndex(UnsignedInt16) To Set (as a IntegerObject)
	 */
	public Object convertForGui(Object value) {
		UnsignedInt16 iValue = (UnsignedInt16)value;
		return iValue != null ? ""+iValue.intValue() : "0";
	}

	/**
	 * Converts the selected Index of the param-given comboBox as UnsignedInt16-Object
	 */
	public Object convertForModel(Object guiElement) {
		String value = (String) guiElement;
		if (value != null && !value.equals(""))
		{
			return new UnsignedInt16(Integer.parseInt(value));
		}
		else
		{
			return null;
		}
	}

	public boolean canConvert(Object guiElement) {

		if (guiElement == null || "".equals(guiElement))
		{
			return true;
		}
		
		try {
			String value = (String) guiElement;
			Integer.parseInt(value);
			return true;
		} catch (NumberFormatException e) {
			//do nothing
		}
		return false;
	}
	
	public String getTypeForModel() {
		return ClassUtils.getShortClassName(UnsignedInt16.class);
	}
	

}
