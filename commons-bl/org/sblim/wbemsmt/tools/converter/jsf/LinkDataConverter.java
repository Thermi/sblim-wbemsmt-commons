/** 
 * LinkDataConverter.java
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
 * Description: Class for Converting LinkDatas to the value of a HTMLLink 
 * 
 */

package org.sblim.wbemsmt.tools.converter.jsf;

import org.sblim.wbemsmt.bl.fielddata.LinkData;
import org.sblim.wbemsmt.tools.converter.Converter;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLinkComponent;

public class LinkDataConverter implements Converter {

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
		LabeledJSFLinkComponent link = (LabeledJSFLinkComponent) guiElement;
		return link.getFieldData();
	}

	/**
	 * Returns true
	 */
	public boolean canConvert(Object guiElement) {
		return true;
	}

	public Class<LinkData> getTypeForModel() {
		return LinkData.class;
	}	
}
