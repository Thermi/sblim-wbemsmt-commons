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

package org.sblim.wbemsmt.tools.converter.jsf;

import org.apache.commons.lang.ClassUtils;
import org.sblim.wbemsmt.bl.fielddata.MemoData;
import org.sblim.wbemsmt.tools.converter.Converter;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFMemoComponent;

public class MemoDataConverter implements Converter {

	/**
	 * return the text to set (as String)
	 */
	public Object convertForGui(Object value) {
	    MemoData data = (MemoData) value;
	    String text = data.getText();
	    //replace all brackets by &lt; and &gt;
	    text = escapeHtmlTags(text);
		return new MemoData(text,"<br>",data.getLimit());
		
	}

    public static String escapeHtmlTags(String text) {
        
        text = text.replaceAll("<br>","\n");
	    text = text.replaceAll("<","&lt;");
	    text = text.replaceAll(">","&gt;");
	    text = text.replaceAll("\\\\n", "<br>");
        text = text.replaceAll("\\n", "<br>");
        return text;
    }

	/**
	 * Converts the content of the textfield to 
	 */
	public Object convertForModel(Object guiElement) {
		LabeledJSFMemoComponent link = (LabeledJSFMemoComponent) guiElement;
		return link.getFieldData();
	}

	/**
	 * Returns true
	 */
	public boolean canConvert(Object guiElement) {
		return true;
	}

	public String getTypeForModel() {
		return ClassUtils.getShortClassName(MemoData.class);
	}	
}
