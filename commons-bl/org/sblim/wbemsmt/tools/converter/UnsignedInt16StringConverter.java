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
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Converts a int in the model to a string for the view
  * 
  */


package org.sblim.wbemsmt.tools.converter;

import javax.cim.UnsignedInteger16;


public class UnsignedInt16StringConverter {

	public UnsignedInt16StringConverter() {
	}


	/**
	 * return the integer represented by the String
	 */
	public Object convertForGui(Object value) {
		try {
			return "" + ((UnsignedInteger16)value).intValue();
		} catch (Exception e) {
			throw new IllegalArgumentException("Cannot Convert Object " + value + " to a String");
		}
	}

	/**
	 * Converts the a value for the model
	 */
	public Object convertForModel(Object guiElement) {
		
		int index = 0;
		try {
			String s = (String) guiElement;
			index = Integer.parseInt(s);
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException("Cannot Convert Object " + guiElement + " to a int");
		}
		return new UnsignedInteger16(index);
	}

	/**
	 * Returns true - the string is found in the valueList
	 */
	public boolean canConvert(Object guiElement) {
		
		try {
			Integer.parseInt((String) guiElement);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}
}
