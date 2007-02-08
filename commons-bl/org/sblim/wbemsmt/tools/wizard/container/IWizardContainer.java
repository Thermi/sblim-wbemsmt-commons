 /** 
  * IWizardContainer.java
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
  * Contributors: Michael.Bauschert@de.ibm.com
  *
  *
  * Description: Methods which should be used in all JSF/Swing wizard container implementations.
  * 			
  * 
  */
package org.sblim.wbemsmt.tools.wizard.container;

import java.util.HashMap;
import java.util.Stack;
import java.util.Vector;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.tools.wizard.WizardStepList;

public interface IWizardContainer {

	public static final String RUN_TYPE_JSWING = "JSWING";
	public static final String RUN_TYPE_JSF = "JSF";
	public static final String RUN_TYPE_CMD = "CMD";
	
	/*
	 * CleanUp data object values if user input is no more valid (called in case of 'Back' or 'Cancel' action)
	 */
	public void cleanUP(String pageName);	
	/*
	 * Get the name of the current wizard page
	 */
	public String getCurrentPageName();
	/*
	 * Return the page next in wizard flow
	 */
	public String getNextWizardPageName();
	/*
	 * Returns the all page objects configured in wizard container class
	 */
	public HashMap getPages();
	/*
	 * Get the stack object holding the pages the wizard previously run through
	 */
	public Stack getUsedPages();
	/*
	 * Do initialization stuff for wizard container
	 */
	public void initWizardContainer() throws WbemSmtException;

	public boolean isBackButtonFlag();
	public boolean isCancelButtonFlag();
	public boolean isFinishButtonFlag();
	public boolean isNextButtonFlag();
	
	/*
	 * Check if the given page name ist the first page in wizard flow
	 */
	public boolean isFirst(String pageName);
	/*
	 * Check if the given page name is the last page in wizard flow
	 */
	public boolean isLast(String pageName);
	/*
	 * Use method to check (in data object) if user input for the named property is valid.
	 * The 'result' vector can be filled with specific error messages, error IDs or own exception objects
	 * for further processing
	 */
	public boolean isValid(String propertyName, Object value, Vector result);
	/*
	 * Do actions if wizard flow complete and preWizardFinish method (successfully) executed
	 */
	public void postWizardFinish();
	/*
	 * Do actions if wizard flow complete (usual create related CIM objects on server side)
	 */
	public void preWizardFinish() throws Exception;
	/*
	 * Set the name of the current wizard page
	 */
	public void setCurrentPageName(String pageName);
	/*
	 * Set run type to container ('JSF' or 'SWING')
	 */
	public void setWizardRunType(String wizardRunType);
	/*
	 * Set flags for navigation buttons according to actual wizard state
	 */
	public void updateButtonStates(boolean isLast, boolean isFirst);

	/**
	 * Get the page by the currentname
	 * @param actualPanelName
	 * @return
	 */
	public Object getPage(String actualPanelName) throws WbemSmtException;
	
	/**
	 * Get the List with Wizard Steps
	 * @return
	 */
	public WizardStepList getStepList();
	

	/**
	 * Get the Adapter responsible for this wizard
	 * @return
	 */
	public AbstractBaseCimAdapter getAdapter();

}
