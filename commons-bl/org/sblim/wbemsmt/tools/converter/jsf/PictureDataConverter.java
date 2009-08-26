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

package org.sblim.wbemsmt.tools.converter.jsf;

import org.sblim.wbemsmt.bl.fielddata.MemoData;
import org.sblim.wbemsmt.bl.fielddata.PictureData;
import org.sblim.wbemsmt.tools.converter.Converter;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFPictureComponent;

public class PictureDataConverter implements Converter {

	/**
	 * return the text to set (as String)
	 */
	public Object convertForGui(Object value) {
	    
	    MemoData tooltip = ((PictureData)value).getTooltip();
	    
	    if (tooltip != null) {
	        String escapedHtmlText = MemoDataConverter.escapeHtmlTags(tooltip.getText());
	        escapedHtmlText = escapedHtmlText.replaceAll("'","&quot;");
            tooltip = new MemoData(escapedHtmlText,"<br>",tooltip.getLimit());
	        ((PictureData)value).setTooltip(tooltip);
        }
	    

	    return value;
	}

	/**
	 * Converts the content of the textfield to 
	 */
	public Object convertForModel(Object guiElement) {
		LabeledJSFPictureComponent link = (LabeledJSFPictureComponent) guiElement;
		return link.getFieldData();
	}

	/**
	 * Returns true
	 */
	public boolean canConvert(Object guiElement) {
		return true;
	}

	public Class<PictureData> getTypeForModel() {
		return PictureData.class;
	}	
}
