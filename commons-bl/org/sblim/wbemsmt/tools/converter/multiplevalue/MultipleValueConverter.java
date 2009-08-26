 /** 
  * MultipleValueConverter.java
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
  * Description: baseclass for converting multiple values
  * 
  */
package org.sblim.wbemsmt.tools.converter.multiplevalue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.sblim.wbemsmt.util.StringTokenizer;

public abstract class MultipleValueConverter {

	private static final String SEPARATION_CHARACTER = ",";
	protected String[] values;

	public void setValues(String[] values) {
		this.values = values;
	}

	public String[] getValues() {
		return values;
	}

	/**
	 * return the String belonging to the given value (the index given as Number or as String)
	 * @param value expects that the array contains a list with number-objects. the number objects are representig the index in the values array
	 * @return the list with values as String
	 */
	public Object convertForGui(Object value) {

		List<Number> list = (List<Number>) value;
		StringBuffer result = new StringBuffer();
		if (list != null)
		{
			for (Iterator<Number> iter = list.iterator(); iter.hasNext();) {
				Number number = (Number) iter.next();
				int index = number.intValue();
				if (index >= values.length)
				{
					throw new IllegalArgumentException("Cannot find element at index  " + index + " in the values array " + values);				
				}
				if (result.length() > 0)
				{
					result.append(MultipleValueConverter.SEPARATION_CHARACTER);
				}
				result.append(values[index]);
			}
		}
		return result.toString();
	}

	/**
	 * Checks if every element in guiElement can is found in the values array
	 * 
	 * @param guiElement a String with comma separated values (value1,value2,etc)
	 */
	public boolean canConvert(Object guiElement) {
		
		String[] enteredValues = getEnteredValues((String)guiElement);
		
		for (int i = 0; i < enteredValues.length; i++) {
			String text = enteredValues[i];
			boolean found = false;
			for (int ii = 0; !found && ii < values.length; ii++) {
				String textInArray = values[ii];
				if (textInArray.equals(text))
				{
					found = true;
				}
			}
			if (!found)
			{
				return false;
			}
		}
		
		return true;
	}

	private String[] getEnteredValues(String string) {
		return new StringTokenizer(string,MultipleValueConverter.SEPARATION_CHARACTER).asArray(true, true);
	}

	/**
	 * Converts the given text in the list to index values (unsigned int16) that can be used by the model
	 * 
	 * @param guiElement - String with comma-separated values that are in the values array
	 * @param lsit with unsignedInt16 values (index values of values array)
	 * @see MultipleValueConverter#values
	 */
	public Object convertForModel(Object guiElement) {
		
		List<Object> result = new ArrayList<Object>();
		String[] guiElements = (String[])getEnteredValues((String) guiElement);
		for (int i = 0; i < guiElements.length; i++) {
			String text = guiElements[i];
			boolean found = false;
			for (int ii = 0; !found && ii < values.length; ii++) {
				String textInArray = values[ii];
				if (textInArray.equals(text))
				{
					result.add(getTypeWithInt(ii));
					found = true;
				}
			}
			if (!found)
			{
				throw new IllegalArgumentException("Cannot find value " + text + " in thegui elements " + guiElements.toString());				
			}
		}
		
		return result;
	}

	protected abstract Object getTypeWithInt(int ii);
	

}
