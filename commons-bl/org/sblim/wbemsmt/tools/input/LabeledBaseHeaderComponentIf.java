/** 
 * LabeledBaseHeaderComponentIf.java
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
 * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
 *
 * Contributors: 
 * 
 * Description: Interface for all HeaderComponents
 * 
 */

package org.sblim.wbemsmt.tools.input;

/**
 * Interface for all HeaderComponents
 */

public interface LabeledBaseHeaderComponentIf {

	/**
	 * sets the label text for the header
	 * @param labelText translated text for the header
	 */
	public abstract void setLabelText(String labelText);
	
	/**
	 * get the label text
	 * @return the labelText
	 */
	public abstract String getLabelText();

	/**
	 * Gets the ComponentProperties of the InputField
	 * If values are changed in the ComponentProperties the ComponentProperties 
	 * calls all his registered ComponentPropertyChangListener 
	 * @return the Properties
	 */
	public ComponentProperties getProperties();
	
	
}
