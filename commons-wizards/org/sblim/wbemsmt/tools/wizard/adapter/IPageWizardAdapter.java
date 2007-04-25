 /** 
  * IPageWizardAdapter.java
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
  * @author:	Bert Lange <LangeB@de.ibm.com>
  *
  * Contributors:
  *
  *
  * Description: Methods which should be used in all JSF/Swing wizard adapter implementations.
  * 
  */
package org.sblim.wbemsmt.tools.wizard.adapter;

import org.sblim.wbemsmt.tools.wizard.container.IWizardContainer;

public interface IPageWizardAdapter {
	/*
	 * CleanUp user input values set in the page with given name (called in case of 'Back' or 'Cancel' actions)  
	 */
	public void cleanUPPage(String pageName);
	/*
	 * Do initial stuff for WizardAdapter and WizardContainer
	 */
	public void initWizard(IWizardContainer container, IPageWizardAdapter adapter) throws Exception;
	/*
	 * Work with user input values (store in data objects) 
	 */
	public boolean savePageValues(String pageName);
	/*
	 * Build and set the summary text here (from (all) user input values from all shown pages) to show it on the last page 
	 */
	public void setSummaryText(String pageName);
	/*
	 * Activate/Deactivate state of 'Back', 'Next', 'Finish' button
	 */
	public void switchButtons();
	/*
	 * Execute actions necessary if all wizard pages has been shown 
	 */
	public String wizardComplete();
}
