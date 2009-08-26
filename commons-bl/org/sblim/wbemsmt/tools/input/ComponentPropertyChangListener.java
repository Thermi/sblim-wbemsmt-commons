 /** 
  * ComponentPropertyChangListener.java
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
  * Description: Change Listener for Component Properties
  * 
  */

package org.sblim.wbemsmt.tools.input;

import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponent.Size;

public interface ComponentPropertyChangListener {
	public void readOnlyChanged(Boolean readOnly);
	public void bgColorChanged(String bgColor);
	public void colorChanged(String color);
	public void visibilityChanged(Boolean visible);
	/**
	 * Use the sized defined in {@link LabeledBaseInputComponentIf} to set the size
	 * @param size
	 * @see LabeledBaseInputComponentIf#SIZE_S
	 * @see LabeledBaseInputComponentIf#SIZE_M
	 * @see LabeledBaseInputComponentIf#SIZE_L
	 */
	public void sizeChanged(Size size);
}
