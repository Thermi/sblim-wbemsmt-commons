/** 
 * IntegerStringConverter.java
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

package org.sblim.wbemsmt.tools.converter.test.multiplevalue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.sblim.wbemsmt.tools.converter.Converter;

public class IntegerStringConverter extends MultipleValueConverter implements Converter {

	/**
	 * Converts the selected Index of the param-given comboBox as Integer-Object
	 */
	public Object convertForModel(Object guiElement) {
		List<String> values = (List<String>) guiElement;
		List<Integer> result = new ArrayList<Integer>();
		for (Iterator<String> iter = values.iterator(); iter.hasNext();) {
			String value = (String) iter.next();
			result.add(new Integer(Integer.parseInt(value)));
		}
		return result;
	}

	public Class<Integer> getTypeForModel() {
		return Integer.class;
	}	
	
}
