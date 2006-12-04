/** 
 * StringHtmlInputFieldConverter.java
 *
 * (C) Copyright IBM Corp. 2005
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
 * Description: Class for Converting strings to JSF-HtmlTextFields 
 * 
 */

package org.sblim.wbemsmt.tools.converter.jsf;

import javax.faces.component.html.HtmlInputText;

import org.apache.commons.lang.ClassUtils;
import org.sblim.wbemsmt.tools.converter.Converter;

public class StringHtmlInputFieldConverter implements Converter {

	/**
	 * return the text to set (as String)
	 */
	public Object convertForGui(Object value) {
		return value;
	}

	/**
	 * Converts the content of the textfield to 
	 */
	public Object convertForModel(Object guiElement) {
		HtmlInputText inputText = (HtmlInputText) guiElement;
		return (String)inputText.getLocalValue();
	}

	/**
	 * Returns true - the content of the textfield can always be converted to a String
	 */
	public boolean canConvert(Object guiElement) {
		return true;
	}

	public String getTypeForModel() {
		return ClassUtils.getShortClassName(String.class);
	}	
}
