 /** 
  * JSFWizardBase.java
  *
  * (C) Copyright IBM Corp. 2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE COMMON PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Common Public License from
  * http://www.opensource.org/licenses/cpl1.0.php
  *
  * @author:	Michael Bauschert
  *
  * Contributors:
  *
  *
  * Description: Abstract class implementation for common 'JSF' related 
  * 				parts for derived 'JSFWizardAdapter' classes (for all Swing configuration tasks).
  * 
  */
package org.sblim.wbemsmt.tools.wizard.jsf;

import java.util.HashMap;
import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.event.ActionEvent;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.exception.ObjectSaveException;
import org.sblim.wbemsmt.exception.ObjectUpdateException;
import org.sblim.wbemsmt.exception.UpdateControlsException;
import org.sblim.wbemsmt.exception.ValidationException;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.tools.jsf.JsfBase;
import org.sblim.wbemsmt.tools.jsf.JsfUtil;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.tools.wizard.WizardBase;
import org.sblim.wbemsmt.tools.wizard.adapter.IPageWizardAdapter;
import org.sblim.wbemsmt.tools.wizard.container.IWizardContainer;

public abstract class JSFWizardBase extends JsfBase implements WizardBase{

	private IPageWizardAdapter adapter = null;	
	protected IWizardContainer container = null;
	private boolean finishButtonDisabled;
	private boolean nextButtonDisabled;
	private boolean backButtonDisabled;
	private boolean cancelButtonDisabled;
	private WizardBasePanel currentPanel;
	protected final AbstractBaseCimAdapter baseCimAdapter;
		
	protected static Logger logger = Logger.getLogger("org.sblim.wbemsmt.tools.wizard.jsf");
	
	private HashMap pages = new HashMap();
	
	public JSFWizardBase(AbstractBaseCimAdapter baseCimAdapter, WbemSmtResourceBundle resourceBundle) {
		super(resourceBundle);
		this.baseCimAdapter = baseCimAdapter;
	}
	
	protected void initialize() {
	}

	public void initWizard(IWizardContainer container, IPageWizardAdapter adapter) throws Exception {
		this.container = container;
		this.adapter = adapter;
		container.setWizardRunType(IWizardContainer.RUN_TYPE_JSF);
		container.initWizardContainer();
		String actualPanelName = container.getNextWizardPageName();

		if (container.getPages().get(actualPanelName) == null || actualPanelName.equals("")) {
			//System.out.println("found no panel to display");
			this.backButtonDisabled = true;
			this.nextButtonDisabled = true;
			this.finishButtonDisabled = true;
			throw new Exception("found no panel to display");
		}

		currentPanel = (WizardBasePanel)container.getPage(actualPanelName);
		container.getPages().put(actualPanelName, currentPanel);
		
		baseCimAdapter.initWizard(this,(DataContainer) currentPanel,actualPanelName);
		baseCimAdapter.updateControls((DataContainer) currentPanel);
		
		//System.out.println("added first panel to contentPanel");
		container.updateButtonStates(container.isLast(actualPanelName), container.isFirst(actualPanelName));
		switchButtons();
	 	container.getUsedPages().push(actualPanelName);
	 	container.setCurrentPageName(actualPanelName);
	 	
	 	pages.put(actualPanelName,currentPanel);
	}

	public void next(ActionEvent event)
	{
		System.err.println("Action");
	}
	
	public String next() throws ValidationException, ObjectUpdateException, UpdateControlsException
	{
        String actualPanelName = (String) container.getUsedPages().peek();
        //currentPanel = (WizardBasePanel)container.getPages().get(actualPanelName);
        baseCimAdapter.validateValues((DataContainer) currentPanel);
		MessageList result = ((DataContainer) currentPanel).getMessagesList();

		if(!result.hasErrors())
		{
        	baseCimAdapter.updateModel((DataContainer) currentPanel);
        	result = ((DataContainer) currentPanel).getMessagesList();
			addErrors(bundle.getString("additional.messages"),result,bundle);
		} else {
			addErrors(bundle.getString("validation.error"),result,bundle);
		}

        if (!result.hasErrors())
        {
        	result.clear();
        	
    		actualPanelName = container.getNextWizardPageName();
            try {
            	WizardBasePanel newPanel = (WizardBasePanel)container.getPage(actualPanelName);
				MessageList.init((DataContainer) newPanel).addAll(((DataContainer) currentPanel).getMessagesList());
				currentPanel = newPanel;
				container.getPages().put(actualPanelName, currentPanel);

				countAndCreateChilds((DataContainer) currentPanel);
			} catch (WbemSmtException e) {
				throw new UpdateControlsException("Cannot find WizardPage " + actualPanelName,e);
			}
        	DataContainer oldPanel = (DataContainer) pages.get(actualPanelName);
            //if the page was displayed before
            if (oldPanel != null)
            {
            	DataContainerUtil.copyValues(oldPanel,(DataContainer) currentPanel);
            }
            baseCimAdapter.updateControls((DataContainer) currentPanel);
            container.getUsedPages().push(actualPanelName);
            container.setCurrentPageName(actualPanelName);

        	addErrors(result,bundle);
        	result.clear();
        }
        else 
        {
        	DataContainer oldPanel = (DataContainer) currentPanel;
        	
            try {
				currentPanel = (WizardBasePanel) container.getPage(actualPanelName);
				container.getPages().put(actualPanelName, currentPanel);
			} catch (WbemSmtException e) {
				throw new UpdateControlsException("Cannot find WizardPage " + actualPanelName,e);
			}
            currentPanel =  (WizardBasePanel) DataContainerUtil.copyValues(oldPanel, (DataContainer) currentPanel);
            baseCimAdapter.updateControls((DataContainer) currentPanel);
            //revalidate to get the wrong fields marked
            baseCimAdapter.validateValues((DataContainer) currentPanel);
        }
        result.clear();
        container.updateButtonStates(container.isLast(actualPanelName),container.isFirst(actualPanelName));
        switchButtons();
        
	 	pages.put(actualPanelName,currentPanel);
        
        return "wizardPage";
	}
	
	public String back() throws ValidationException, UpdateControlsException
	{
        String actualPanelName = (String) container.getUsedPages().pop();
        actualPanelName = (String) container.getUsedPages().peek();
        DataContainer oldPanel = (DataContainer) pages.get(actualPanelName);
        try {
			currentPanel = (WizardBasePanel)container.getPage(actualPanelName);
			container.getPages().put(actualPanelName, currentPanel);
		} catch (WbemSmtException e) {
			throw new UpdateControlsException("Cannot find WizardPage " + actualPanelName,e);
		}
        DataContainerUtil.copyValues(oldPanel,(DataContainer) currentPanel);
        baseCimAdapter.updateControls((DataContainer) currentPanel);
        container.setCurrentPageName(actualPanelName);
        
        container.updateButtonStates(container.isLast(actualPanelName),container.isFirst(actualPanelName));
        switchButtons();
	 	pages.put(actualPanelName,currentPanel);
        return "wizardPage";
	}
	
	public String finish()
	{
        try {
			String actualPanelName = (String) container.getUsedPages().peek();
			currentPanel = (WizardBasePanel)container.getPages().get(actualPanelName);
			DataContainer dc = (DataContainer) currentPanel;
			baseCimAdapter.create(dc);
			
			
			if (dc.getMessagesList() != null && dc.getMessagesList().hasErrors())
			{
				addErrors(FacesMessage.SEVERITY_ERROR,bundle.getString("create.failed"),dc.getMessagesList(),bundle);
			}
			else
			{
				addInfo(bundle.getString(currentPanel.getClass().getName() + ".create.success"));        
				addErrors(dc.getMessagesList(),bundle);
				baseCimAdapter.reload();
			}
			
			return "start";
		} catch (Exception e) {
			e.printStackTrace();
			JsfUtil.handleException(e);
			return "";
		}
	}	
	
	public String cancel() throws ValidationException, ObjectUpdateException, UpdateControlsException, ObjectSaveException
	{
        container.getUsedPages().clear();
//        switchButtons();
        return "start";
	}	

	public void switchButtons() {
		this.backButtonDisabled = !container.isBackButtonFlag(); 
		this.nextButtonDisabled = !container.isNextButtonFlag(); 
		this.cancelButtonDisabled = !container.isCancelButtonFlag(); 
		this.finishButtonDisabled = !container.isFinishButtonFlag();
	}
	
	
	public void startWizard() { 		
	}

	public boolean isBackButtonDisabled() {
		return backButtonDisabled;
	}

	public boolean isCancelButtonDisabled() {
		return cancelButtonDisabled;
	}

	public boolean isFinishButtonDisabled() {
		return finishButtonDisabled;
	}

	public boolean isNextButtonDisabled() {
		return nextButtonDisabled;
	}
	
	public WizardBasePanel getCurrentPanel() {
		return currentPanel;
	}
	
	public AbstractBaseCimAdapter getAdapter()
	{
		return getAdapter();
	}
	
	public IPageWizardAdapter getPageWizardAdapter() {
		return adapter;
	}	
	
	public abstract void countAndCreateChilds(DataContainer dataContainer) throws UpdateControlsException;
	
	
}
