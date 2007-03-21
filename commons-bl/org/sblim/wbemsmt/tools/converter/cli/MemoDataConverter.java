/** 
 * MemoDataConverter.java
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
 * Description: Class for Converting MemoDatas to the value of a HTMLOutputText 
 * 
 */

package org.sblim.wbemsmt.tools.converter.cli;

import org.apache.commons.lang.ClassUtils;
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
	 * Returns true
	 */
	public boolean canConvert(Object guiElement) {
		return guiElement instanceof String;
	}

	public String getTypeForModel() {
		return ClassUtils.getShortClassName(MemoData.class);
	}	
}
