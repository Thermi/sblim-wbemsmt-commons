/** 
 * StringHtmlInputFieldConverter.java
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
 * Description: Class for Converting strings to JSF-HtmlTextFields 
 * 
 */

package org.sblim.wbemsmt.tools.converter.jsf;

import javax.faces.component.html.HtmlInputText;

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

	public Class<String> getTypeForModel() {
		return String.class;
	}	
}
