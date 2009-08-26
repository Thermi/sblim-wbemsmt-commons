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
 * Description: Class for Converting MemoDatas 
 * 
 */

package org.sblim.wbemsmt.tools.converter.cli;

import org.sblim.wbemsmt.bl.fielddata.MemoData;
import org.sblim.wbemsmt.tools.converter.Converter;

public class MemoDataConverter implements Converter {

	/**
	 * return the text to set (as String)
	 */
	public Object convertForGui(Object value) {
		MemoData memoData = (MemoData) value;
		return memoData.getText();
	}

	/**
	 * Converts the text into a memo data 
	 */
	public Object convertForModel(Object guiElement) {
		return new MemoData((String) guiElement);
	}

	/**
	 * Returns true if the guiElement is a string
	 */
	public boolean canConvert(Object guiElement) {
		return guiElement instanceof String;
	}

	public Class<MemoData> getTypeForModel() {
		return MemoData.class;
	}	
}
