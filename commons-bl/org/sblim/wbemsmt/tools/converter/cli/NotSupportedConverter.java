/** 
 * MemoDataConverter.java
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
 * Description: Class for Converting MemoDatas to the value of a HTMLOutputText 
 * 
 */

package org.sblim.wbemsmt.tools.converter.cli;

import org.sblim.wbemsmt.tools.converter.Converter;

public class NotSupportedConverter implements Converter {

	/**
	 * return the text to set (as String)
	 */
	public Object convertForGui(Object value) {
		return "---";
	}

	/**
	 * Converts the text into a memo data 
	 */
	public Object convertForModel(Object guiElement) {
		return null;
	}

	/**
	 * Returns true
	 */
	public boolean canConvert(Object guiElement) {
		return true;
	}

	public Class<String> getTypeForModel() {
		return String.class;
	}	
}
