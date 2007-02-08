 /** 
  * UnsignedInt64StringConverter.java
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
  * Description: Converts a int64 in the model to a string for the view
  * 
  */

package org.sblim.wbemsmt.tools.converter;

import org.sblim.wbem.cim.UnsignedInt64;

public class UnsignedInt64StringConverter {

	public UnsignedInt64StringConverter() {
	}


	/**
	 * return the integer represented by the String
	 */
	public Object convertForGui(Object value) {
		try {
			return "" + ((UnsignedInt64)value).longValue();
		} catch (Exception e) {
			throw new IllegalArgumentException("Cannot Convert Object " + value + " to a String");
		}
	}

	/**
	 * Converts the givent text to a index (unsigned int8) that can be used by the model
	 * (should normally not be used, because this Converter should be only used for readOnly-Field)
	 */
	public Object convertForModel(Object guiElement) {
		
		long index = 0;
		try {
			String s = (String) guiElement;
			index = Long.parseLong(s);
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException("Cannot Convert Object " + guiElement + " to a int");
		}
		return new UnsignedInt64(index);
	}

	/**
	 * Returns true - the string is found in the valueList
	 */
	public boolean canConvert(Object guiElement) {
		
		try {
			Long.parseLong((String) guiElement);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}
}
