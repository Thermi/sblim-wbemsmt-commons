 /** 
  * UnsignedInt64StringArrayConverter.java
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
  * Description: Converts a int64 in the model to a string array for the view
  * 
  */

package org.sblim.wbemsmt.tools.converter.multiplevalue;

import javax.cim.UnsignedInteger64;

import org.sblim.wbemsmt.tools.converter.StringArrayConverter;

/**
 * Converts a int in the model to a string based on the given array for th view
 * @author Bauschert
 *
 */
public class UnsignedInt64StringArrayConverter extends MultipleValueConverter implements StringArrayConverter {

	protected Object getTypeWithInt(int ii) {
		return new UnsignedInteger64(""+ii);
	}
	
	public Class<UnsignedInteger64> getTypeForModel() {
		return UnsignedInteger64.class;
	}	
	
	
}
