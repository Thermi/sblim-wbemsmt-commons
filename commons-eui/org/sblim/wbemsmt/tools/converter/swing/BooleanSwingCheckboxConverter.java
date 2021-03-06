/** 
 * LabeledBaseInputComponent.java
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
 * Description: Class for Converting Booleans to Checkbox-States
 * 
 */

package org.sblim.wbemsmt.tools.converter.swing;

import javax.swing.JCheckBox;

import org.sblim.wbemsmt.tools.converter.Converter;

public class BooleanSwingCheckboxConverter implements Converter {

	/**
	 * expects a Boolean
	 */
	public Object convertForGui(Object value) {
		return new Boolean(value != null && ((Boolean)value).booleanValue());
	}

	/**
	 * return the CheckboxState as Boolean
	 */
	public Object convertForModel(Object guiElement) {
		JCheckBox checkBox = (JCheckBox)guiElement;
		return new Boolean(checkBox.isSelected());
	}
	
	public boolean canConvert(Object guiElement)
	{
		return true;
	}

	public Class getTypeForModel() {
		return Boolean.class;
	}	
}
