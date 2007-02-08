 /** 
  * ComponentPropertyChangListener.java
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
  * Description: Change Listener for Component Properties
  * 
  */

package org.sblim.wbemsmt.tools.input;

public interface ComponentPropertyChangListener {
	public void readOnlyChanged(Boolean readOnly);
	public void bgColorChanged(String bgColor);
	public void colorChanged(String color);
	public void visibilityChanged(Boolean visible);
	public void sizeChanged(int size);
}
