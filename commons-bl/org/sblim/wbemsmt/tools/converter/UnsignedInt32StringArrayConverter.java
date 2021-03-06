 /** 
  * UnsignedInt32StringArrayConverter.java
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
  * Description: Converts a int32 in the model to a string array for the view
  * 
  */

package org.sblim.wbemsmt.tools.converter;

import javax.cim.UnsignedInteger32;

import org.apache.commons.lang.StringUtils;

public class UnsignedInt32StringArrayConverter implements StringArrayConverter {

	private String[] values;

	public UnsignedInt32StringArrayConverter() {
		
	}

	public void setValues(String[] values) {
		this.values = values;
	}

	public String[] getValues() {
		return values;
	}

	/**
	 * return the String belonging to the given value (the index given as Number or as String)
	 */
	public Object convertForGui(Object value) {
		int index = 0;
		if (value instanceof Number) 
		{
			Number n = (Number)value;
			index = n.intValue();
		}
		else if (value instanceof String) {
			String s = (String) value;
			index = Integer.parseInt(s);
		}
		else if (value == null) {
		    return null;
		}
		else
		{
			throw new IllegalArgumentException("Cannot Convert Object " + value + " to a int");
		}
		return values != null && index < values.length ? values[index] : null;
	}

	/**
	 * Converts the givent text to a index (unsigned int32) that can be used by the model
	 * (should normally not be used, because this Converter should be only used for readOnly-Field)
	 */
	public Object convertForModel(Object guiElement) {
		
		if (values == null || guiElement == null)
		{
			return null;
		}
		String text = (String)guiElement;
		for (int i = 0; i < values.length; i++) {
			String textInArray = values[i];
			if (textInArray.equals(text))
			{
				return new UnsignedInteger32(i);
			}
		}
		if ("".equals(guiElement.toString()))
		{
			return null;
		}
		throw new IllegalArgumentException("Cannot Convert " + guiElement.toString());
	}

	/**
	 * Returns true - the string is found in the valueList
	 */
	public boolean canConvert(Object guiElement) {
		String text = (String)guiElement;
		if (StringUtils.isEmpty(text))
		{
			return true;
		}
		for (int i = 0; values != null && i < values.length; i++) {
			String textInArray = values[i];
			if (textInArray.equals(text))
			{
				return true;
			}
		}
		return false;
	}
	
	public Class<UnsignedInteger32> getTypeForModel() {
		return UnsignedInteger32.class;
	}	
	
}
