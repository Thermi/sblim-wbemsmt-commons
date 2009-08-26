/** 
 * LabeledStringArrayInputComponentIf.java
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
 * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
 *
 * Contributors: 
 * 
 * Description: Interface for components that representing an Array of Strings
 * 
 */

package org.sblim.wbemsmt.tools.input;



public interface LabeledStringArrayInputComponentIf extends LabeledBaseInputComponentIf {

	public void setValues(String[] values);
	public String[] getValues();
	
	/**
	 * Show only selected items in the read only view or all items
	 * @return
	 */
	public boolean isShowAllInReadOnlyView() ;
	/**
	 * Show only selected items in the read only view or all items
	 * @param showAllInReadOnlyView
	 */
	public void setShowAllInReadOnlyView(boolean showAllInReadOnlyView);


}