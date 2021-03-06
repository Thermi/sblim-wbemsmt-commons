/** 
 * UnsignedInt64StringConverter.java
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
 * @author:	Michael Bauschert <Michael.Bauschert@de.ibm.com>
 *
 * Contributors: 
 *              
 *
 * Description: Class for Converting unsignedInt16 Values to Strings and back
 * 
 */

package org.sblim.wbemsmt.tools.converter.test;

import javax.cim.UnsignedInteger64;

import org.sblim.wbemsmt.tools.converter.Converter;

public class UnsignedInt64StringConverter implements Converter {

	/**
	 * return the SelectedIndex(UnsignedInt64) To Set (as a IntegerObject)
	 */
	public Object convertForGui(Object value) {
		UnsignedInteger64 iValue = (UnsignedInteger64)value;
		return iValue != null ? ""+iValue.longValue() : null;
	}

	/**
	 * Converts the selected Index of the param-given comboBox as UnsignedInteger64-Object
	 */
	public Object convertForModel(Object guiElement) {
		String value = (String) guiElement;
		if (value.equals(""))
		{
			return null;
		}
		else
		{
			return new UnsignedInteger64(""+Long.parseLong(value));
		}
	}

	public boolean canConvert(Object guiElement) {
		
		if (guiElement == null || "".equals(guiElement))
		{
			return true;
		}

		try {
			String value = (String) guiElement;
			Long.parseLong(value);
			return true;
		} catch (NumberFormatException e) {
			//do nothing
		}
		return false;
	}

	public Class<UnsignedInteger64> getTypeForModel() {
		return UnsignedInteger64.class;
	}	

}
