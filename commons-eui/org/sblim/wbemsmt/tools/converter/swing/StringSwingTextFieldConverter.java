/** 
 * LabeledBaseInputComponent.java
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
 * @author:	Michael Bauschert <Michael.Bauschert@de.ibm.com>
 *
 * Contributors: 
 *              
 *
 * Description: Class for Converting unsignedInt32 Values to Textfields
 * 
 */

package org.sblim.wbemsmt.tools.converter.swing;

import javax.swing.JTextField;

import org.apache.commons.lang.ClassUtils;
import org.sblim.wbemsmt.tools.converter.Converter;

public class StringSwingTextFieldConverter implements Converter {

	/**
	 * Returns a string. if value is null empty String is return
	 */
	public Object convertForGui(Object value) {
		return value == null ? "" : value.toString();
	}

	/**
	 * Converts the content of the given Textfield as UnsignedInt32
	 */
	public Object convertForModel(Object guiElement)
	{
		JTextField tf = (JTextField)guiElement;
		return tf.getText();
	}
	

	public boolean canConvert(Object guiElement) {
		//Textfield content is always a string
		return true;
	}
	
	public String getTypeForModel() {
		return ClassUtils.getShortClassName(String.class);
	}	

}
