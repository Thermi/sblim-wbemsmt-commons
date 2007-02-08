 /** 
  * ActionComponent.java
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
  * Description: Interface for all Components that are action Components 
  * 
  */
package org.sblim.wbemsmt.tools.input;

/**
 * @author Bauschert
 *
 */
public interface ActionComponent {
	
	public boolean isNeedConfirmation();
	/**
	 * set needConfirmation = true if you want a confirmation to be shown by the UI if the action is invoked.
	 * @param showWait
	 */
	public void setNeedConfirmation(boolean needConfirmation);

	
	public boolean isShowWait();
	/**
	 * set showWait = true if you want a waitIndicator to be shown by the UI if the action is invoked.
	 * @param showWait
	 */
	public void setShowWait(boolean showWait);

	/**
	 * set the wait text
	 * @param showWait
	 */
	public void setWaitText(String waitText);

}
