 /** 
  * DoubleStringConverter.java
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
  * Description: Converts a double in the model to a string for the view
  * 
  */


package org.sblim.wbemsmt.tools.converter;

import org.apache.commons.lang.StringUtils;

public class DoubleStringConverter {

	public DoubleStringConverter() {
	}


	/**
	 * return the integer represented by the String
	 */
	public Object convertForGui(Object value) {
		try {
			return "" + ((Double)value).doubleValue();
		} catch (Exception e) {
			throw new IllegalArgumentException("Cannot Convert Object " + value + " to a String");
		}
	}

	/**
	 * Converts the a value for the model
	 */
	public Object convertForModel(Object guiElement) {
		
		double index = 0;
		try {
			String s = (String) guiElement;
			index = Double.parseDouble(s);
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException("Cannot Convert Object " + guiElement + " to a int");
		}
		return new Double(index);
	}

	/**
	 * Returns true - the string is found in the valueList
	 */
	public boolean canConvert(Object guiElement) {
		
		if (StringUtils.isEmpty((String) guiElement))
		{
			return true;
		}
		try {
			Double.parseDouble((String) guiElement);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return false;
	}
}
