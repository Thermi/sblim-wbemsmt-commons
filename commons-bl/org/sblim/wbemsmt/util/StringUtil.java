 /** 
  * StringUtil.java
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
  * Description: Util-Class for String(Array)-Functions
  * 
  */
package org.sblim.wbemsmt.util;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.sblim.wbem.cim.UnsignedInt16;


public class StringUtil
{
	
	/**
	 * Searches for the element given by value in the array given by values and returns the index
	 * @param values
	 * @param value
	 * @return -1 if the value was not found
	 */
	public static int indexOf(String[] values, String value)
	{
		if (values == null)
			return -1;
		
		for (int i = 0; i < values.length; i++) {
			String value1 = values[i];
			if (value1 != null && value1.equals(value))
			{
				return i;
			}
			else if (value1 == null && value == null)
			{
				return i;
			}
		}
		
		return -1;
	}

	/**
	 * Searches for the element given by value in the array given by values and returns the index
	 * @param values
	 * @param value
	 * @param defaultValue
	 * @return the index or the default value if the value was not found
	 */
	public static UnsignedInt16 indexOfAsUnsignedInt16(String[] values, String value, UnsignedInt16 defaultValue) {
		int indexOf = indexOf(values, value);
		if (indexOf > -1)
		{
			return new UnsignedInt16(indexOf);
		}
		else
		{
			return defaultValue;
		}
	}

	
	public static List asList(String[] values)
	{
		List result = new ArrayList();
		for (int i = 0; i < values.length; i++) {
			String value = values[i];
			result.add(value);
		}
		
		return result;
	}

	public static boolean containsWhitespaces(String value) {

		if (value != null)
		{
			for (int i=0; i < value.length(); i++)
			{
				if (StringUtils.isWhitespace(value.substring(i,i+1)))
				{
					return true;
				}
			}
		}

		return false;
	}

	/**
	 * Get the value within the array at the given position 
	 * @param array
	 * @param position
	 * @return value within the array at the given position or null if the position is null or is no valid index within the array
	 */

	public static String getValueByIndex(String[] array, Number position) {
		if (position != null)
		{
			return getValueByIndex(array, position.intValue());
		}
		return null;
	}

	/**
	 * Get the value within the array at the given position 
	 * @param array
	 * @param position
	 * @return value within the array at the given position or null if the position is no valid index within the array
	 */
	
	public static String getValueByIndex(String[] array, int position) {
		if (position < array.length)
		{
			return array[position];
		}
		return null;
	}

}
