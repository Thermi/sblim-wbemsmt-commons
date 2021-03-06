 /** 
  * WizardContainerBase.java
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
  * @author:	Bert Lange <LangeB@de.ibm.com>
  *
  * Contributors:
  *
  *
  * Description: Abstract class implementation for common parts for derived 'WizardContainer' 
  * 				classes (for all JSF/Swing configuration tasks).
  * 			
  * 
  */
package org.sblim.wbemsmt.tools.wizard.container;

import java.util.HashMap;
import java.util.Stack;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.tools.wizard.WizardStepList;

public abstract class AbstractWizardContainerBase {

	protected Stack<String> usedPages = new Stack<String>();
	protected String currentPageName = "";
	protected String summaryText = "";
	protected String wizardRunType = null; 	
	protected HashMap<String, DataContainer> hmPages = null;
	protected String[] summary = null;
	protected boolean noPages = false;
	private boolean backButtonFlag = true;
	private boolean nextButtonFlag = true;
	private boolean finishButtonFlag = true;
	private boolean cancelButtonFlag = true;
	
	protected WizardStepList stepList = null;
	private final AbstractBaseCimAdapter adapter;
	
	public AbstractWizardContainerBase(AbstractBaseCimAdapter adapter) {
		this.adapter = adapter;
	}

	public void updateButtonStates(boolean isLast, boolean isFirst) {
		//System.out.println("isLast: "+isLast);
		//System.out.println("isFirst: "+isFirst);
                
		if (noPages) {
			//System.out.println("state1");
			this.backButtonFlag = false;
			this.nextButtonFlag = false;
			this.finishButtonFlag = false;
			return;
		}
			if (isFirst) {
				//System.out.println("state22");
				this.backButtonFlag = false;
				if (isLast) {
					//System.out.println("state33");
					this.nextButtonFlag = false;
					this.finishButtonFlag = true;
				}
				else {
					this.finishButtonFlag = false;
					this.nextButtonFlag = true;
				}
			}
			else if (isLast) {
				//System.out.println("state55");
				this.backButtonFlag = true;
				this.nextButtonFlag = false; 
				this.finishButtonFlag = true;       		
			}
			else {
				//System.out.println("state66");
				this.backButtonFlag = true;
				this.nextButtonFlag = true; 
				this.finishButtonFlag = false;       		
			}
	}

	
	/**
	 * @return Returns the backButtonFlag.
	 */
	public boolean isBackButtonFlag() {
		return backButtonFlag;
	}
	/**
	 * @param backButtonFlag The backButtonFlag to set.
	 */
	public void setBackButtonFlag(boolean backButtonFlag) {
		this.backButtonFlag = backButtonFlag;
	}
	/**
	 * @return Returns the cancelButtonFlag.
	 */
	public boolean isCancelButtonFlag() {
		return cancelButtonFlag;
	}
	/**
	 * @param cancelButtonFlag The cancelButtonFlag to set.
	 */
	public void setCancelButtonFlag(boolean cancelButtonFlag) {
		this.cancelButtonFlag = cancelButtonFlag;
	}
	/**
	 * @return Returns the finishButtonFlag.
	 */
	public boolean isFinishButtonFlag() {
		return finishButtonFlag;
	}
	/**
	 * @param finishButtonFlag The finishButtonFlag to set.
	 */
	public void setFinishButtonFlag(boolean finishButtonFlag) {
		this.finishButtonFlag = finishButtonFlag;
	}
	/**
	 * @return Returns the nextButtonFlag.
	 */
	public boolean isNextButtonFlag() {
		return nextButtonFlag;
	}
	/**
	 * @param nextButtonFlag The nextButtonFlag to set.
	 */
	public void setNextButtonFlag(boolean nextButtonFlag) {
		this.nextButtonFlag = nextButtonFlag;
	}
	/**
	 * @return Returns the noPages.
	 */
	public boolean isNoPages() {
		return noPages;
	}
	/**
	 * @param noPages The noPages to set.
	 */
	public void setNoPages(boolean noPages) {
		this.noPages = noPages;
	}
	/**
	 * @return Returns the usedPages.
	 */
	public Stack<String> getUsedPages() {
		return usedPages;
	}
	/**
	 * @param usedPages The usedPages to set.
	 */
	public void setUsedPages(Stack<String> usedPages) {
		this.usedPages = usedPages;
	}
	/**
	 * @return Returns the summary.
	 */
	public String[] getSummary() {
		return summary;
	}
	/**
	 * @param summary The summary to set.
	 */
	public void setSummary(String[] summary) {
		this.summary = summary;
	}
	/**
	 * @return Returns the hmPages.
	 */
	public HashMap<String, DataContainer> getPages() {
		return hmPages;
	}
	/**
	 * @param hmPages The hmPages to set.
	 */
	public void setPages(HashMap<String, DataContainer> hmPages) {
		this.hmPages = hmPages;
	}
	/**
	 * @return Returns the wizardRunType.
	 */
	public String getWizardRunType() {
		return wizardRunType;
	}
	/**
	 * @param wizardRunType The runType to set.
	 */
	public void setWizardRunType(String wizardRunType) {
		this.wizardRunType = wizardRunType;
	}
	/**
	 * @return Returns the summaryText.
	 */
	public String getSummaryText() {
		return summaryText;
	}
	/**
	 * @param summaryText The summaryText to set.
	 */
	public void setSummaryText(String summaryText) {
		this.summaryText = summaryText;
	}
	/**
	 * @return Returns the currentPageName.
	 */
	public String getCurrentPageName() {
		return currentPageName;
	}
	/**
	 * @param currentPageName The currentPageName to set.
	 */
	public void setCurrentPageName(String currentPageName) {
		this.currentPageName = currentPageName;
	}

	/**
	 * The List with steps of the wizard
	 * @return
	 */
	public WizardStepList getStepList() {
		return stepList;
	}

	/**
	 * get the adapter responsible for this wizard
	 * @return
	 */
	public AbstractBaseCimAdapter getAdapter() {
		return adapter;
	}
	
	
}
