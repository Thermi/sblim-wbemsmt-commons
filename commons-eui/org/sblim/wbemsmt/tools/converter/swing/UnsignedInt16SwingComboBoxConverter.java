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
 * Description: Class for Converting unsignedInt16 Values to ComoboxBox-IndexValues
 * 
 */

package org.sblim.wbemsmt.tools.converter.swing;

import javax.cim.UnsignedInteger16;
import javax.swing.JComboBox;

import org.apache.commons.lang.ClassUtils;
import org.sblim.wbemsmt.tools.converter.ComboBoxIndexConverter;
import org.sblim.wbemsmt.tools.converter.StringArrayConverter;

public class UnsignedInt16SwingComboBoxConverter implements ComboBoxIndexConverter, StringArrayConverter {

	private String[] values;

	/**
	 * return the SelectedIndex(UnsignedInteger16) To Set (as a IntegerObject)
	 */
	public Object convertForGui(Object value) {
		UnsignedInteger16 iValue = (UnsignedInteger16)value;
		return new Integer(iValue.intValue());
	}

	/**
	 * Converts the selected Index of the param-given comboBox as UnsignedInteger16-Object
	 */
	public Object convertForModel(Object guiElement) {
		JComboBox comboBox = (JComboBox) guiElement;
		return new UnsignedInteger16(comboBox.getSelectedIndex());
	}

	/**
	 * Returns true - the index of a combobox can be converted to a int (it's a int :-)
	 */
	public boolean canConvert(Object guiElement) {
		return true;
	}

	public void setValues(String[] values) {
		this.values = values;
	}

	public String[] getValues() {
		return values;
	}

	public String getTypeForModel() {
		return ClassUtils.getShortClassName(UnsignedInteger16.class);
	}	
	
}
