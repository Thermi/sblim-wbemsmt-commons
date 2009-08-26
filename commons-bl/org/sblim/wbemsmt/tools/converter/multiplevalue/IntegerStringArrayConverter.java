 /** 
  * IntegerStringArrayConverter.java
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
  * Description: Converts a int in the model to a string based on the given array for th view
  * 
  */

package org.sblim.wbemsmt.tools.converter.multiplevalue;

import org.sblim.wbemsmt.tools.converter.StringArrayConverter;

public class IntegerStringArrayConverter extends MultipleValueConverter implements StringArrayConverter {

	public IntegerStringArrayConverter() {
		
	}

	protected Object getTypeWithInt(int ii) {
		return new Integer(ii);
	}
	
	public Class<Integer> getTypeForModel() {
		return Integer.class;
	}	
	
}
