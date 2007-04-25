 /** 
  * IWizardBasePanel.java
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
  * Description: PresentationLayer-Independent Wizard Panel
  * 
  */

package org.sblim.wbemsmt.tools.wizard;

import org.sblim.wbemsmt.bl.adapter.DataContainer;

public interface IWizardBasePanel extends DataContainer {

	public abstract String getSubTitleText();
	public abstract String getTitleText();

}