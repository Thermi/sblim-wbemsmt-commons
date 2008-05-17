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
import javax.swing.JLabel;

import org.apache.commons.lang.ClassUtils;
import org.sblim.wbemsmt.tools.converter.Converter;

public class UnsignedInt16SwingLabelConverter implements Converter {

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
		JLabel l = (JLabel)guiElement;
		return new UnsignedInteger16(Integer.parseInt(l.getText()));
	}
	

	public boolean canConvert(Object guiElement) {
		try {
			JLabel l = (JLabel)guiElement;
			if (l.getText() != null && l.getText().length() > 0)
			{
				Integer.parseInt(l.getText());
				return true;
			}
		} catch (NumberFormatException e) {
			//do nothing
		}
		return false;
	}
	
	public String getTypeForModel() {
		return ClassUtils.getShortClassName(UnsignedInteger16.class);
	}	

}
