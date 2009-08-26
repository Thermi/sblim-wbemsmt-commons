/** 
 * UnsignedInt32StringConverter.java
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
 * Description: Class for Converting Strings to unsignedInt32 and back
 * 
 */

package org.sblim.wbemsmt.tools.converter.test;

import javax.cim.UnsignedInteger32;

import org.apache.commons.lang.StringUtils;
import org.sblim.wbemsmt.tools.converter.Converter;

public class UnsignedInt32StringConverter implements Converter {

	/**
	 * return the SelectedIndex(UnsignedInt16) To Set (as a LongObject)
	 */
	public Object convertForGui(Object value) {
		UnsignedInteger32 iValue = (UnsignedInteger32)value;
		return iValue != null ? ""+iValue.longValue() : null;
	}

	/**
	 * Converts the selected Index of the param-given String as UnsignedInteger32-Object
	 */
	public Object convertForModel(Object guiElement) {
		String value = (String) guiElement;
		if (StringUtils.isEmpty(value))
		{
			return null;
		}
		else
		{
			return new UnsignedInteger32(Long.parseLong(value));
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
	
	public Class<UnsignedInteger32> getTypeForModel() {
		return UnsignedInteger32.class;
	}	

}
