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


public class StringUtil
{
	
	/**
	 * Seachres for the element given by value in the array given by values and returns the index
	 * @param values
	 * @param value
	 * @return
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
