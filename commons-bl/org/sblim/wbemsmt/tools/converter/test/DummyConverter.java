/** 
 * DummyConverter.java
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
 * Description: Class for Converting nothing . Does no conversion. Is implemnted because a InputComponent with
 * a null-value converter is no fun working with
 * 
 */

package org.sblim.wbemsmt.tools.converter.test;

import org.sblim.wbemsmt.tools.converter.Converter;

public class DummyConverter implements Converter {

	/**
	 * return the Model value as Value for the GUI
	 */
	public Object convertForGui(Object value) {
		return value;
	}

	/**
	 * return the GUIValue as value for the Model
	 */
	public Object convertForModel(Object guiElement) {
		return guiElement;
	}

	/**
	 * Returns always true - to do no conversion is always possible
	 */
	public boolean canConvert(Object guiElement)
	{
		return true;
	}
	
	public String getTypeForModel() {
		return "*all Types*";
	}


}
