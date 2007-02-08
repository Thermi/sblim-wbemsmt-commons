 /** 
  * MultipleValueConverter.java
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
  * Description: Baseclass for multiple value converters
  * 
  */
package org.sblim.wbemsmt.tools.converter.test.multiplevalue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MultipleValueConverter {

	/**
	 * return the SelectedIndex(UnsignedInt16) To Set (as a IntegerObject)
	 */
	public Object convertForGui(Object value) {
		List modelValues = (List)value;
		List result = new ArrayList();
		
		if (modelValues != null)
		{
			for (Iterator iter = modelValues.iterator(); iter.hasNext();) {
				Number iValue = (Number) iter.next();
				result.add(iValue != null ? ""+iValue.longValue() : "");
			}
		}
		return result; 
	}

	public boolean canConvert(Object guiElement) {
		return true;
	}

}
