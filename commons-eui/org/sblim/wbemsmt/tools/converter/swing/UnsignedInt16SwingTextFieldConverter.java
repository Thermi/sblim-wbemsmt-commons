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

import javax.cim.UnsignedInteger16;
import javax.swing.JTextField;

import org.sblim.wbemsmt.tools.converter.Converter;

public class UnsignedInt16SwingTextFieldConverter implements Converter {

	/**
	 * Returns a string. if value is null empty String is return
	 */
	public Object convertForGui(Object value) {
		return value == null ? "" : value.toString();
	}

	/**
	 * Converts the content of the given Textfield as UnsignedInteger32
	 */
	public Object convertForModel(Object guiElement)
	{
		JTextField tf = (JTextField)guiElement;
		return new UnsignedInteger16(Integer.parseInt(tf.getText()));
	}
	

	public boolean canConvert(Object guiElement) {
		try {
			JTextField tf = (JTextField)guiElement;
			if (tf.getText() != null && tf.getText().length() > 0)
			{
				Integer.parseInt(tf.getText());
				return true;
			}
		} catch (NumberFormatException e) {
			//do nothing
		}
		return false;
	}
	
	public Class getTypeForModel() {
		return UnsignedInteger16.class;
	}	

}
