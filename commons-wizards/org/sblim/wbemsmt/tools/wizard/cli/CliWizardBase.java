 /** 
  * JSFWizardBase.java
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
  * @author:	Michael Bauschert
  *
  * Contributors:
  *
  *
  * Description: Abstract class implementation for common 'JSF' related 
  * 				parts for derived 'JSFWizardAdapter' classes (for all Swing configuration tasks).
  * 
  */
package org.sblim.wbemsmt.tools.wizard.cli;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.BaseDataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.exception.InitWizardException;
import org.sblim.wbemsmt.exception.ObjectCreationException;
import org.sblim.wbemsmt.exception.ObjectSaveException;
import org.sblim.wbemsmt.exception.ObjectUpdateException;
import org.sblim.wbemsmt.exception.UpdateControlsException;
import org.sblim.wbemsmt.exception.ValidationException;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.tools.wizard.WizardBase;
import org.sblim.wbemsmt.tools.wizard.adapter.IPageWizardAdapter;
import org.sblim.wbemsmt.tools.wizard.container.IWizardContainer;

public abstract class CliWizardBase implements WizardBase {

	private IPageWizardAdapter adapter = null;	
	protected IWizardContainer container = null;
	private BaseDataContainer currentPanel;
	private final AbstractBaseCimAdapter baseCimAdapter;
	protected final WbemSmtResourceBundle resourceBundle;
	private boolean canBeExecuted;
	private MessageList list;

	static Logger logger = Logger.getLogger(CliWizardBase.class.getName());
		
	public CliWizardBase(AbstractBaseCimAdapter baseCimAdapter, WbemSmtResourceBundle resourceBundle) {
		this.baseCimAdapter = baseCimAdapter;
		this.resourceBundle = resourceBundle;
	}
	
	protected void initialize() {
	}

	public void initWizard(IWizardContainer container, IPageWizardAdapter adapter) throws Exception {
		this.container = container;
		this.adapter = adapter;
		container.setWizardRunType(IWizardContainer.RUN_TYPE_CMD);
		container.initWizardContainer();
		String actualPagename = container.getNextWizardPageName();
		if (container.getPages().get(actualPagename) == null || actualPagename.equals("")) {
			//System.out.println("found no panel to display");
			throw new InitWizardException("found no panel to display");
		}

		currentPanel = (BaseDataContainer)container.getPages().get(actualPagename);
		baseCimAdapter.initWizard(this,currentPanel,actualPagename);
		baseCimAdapter.updateControls(currentPanel);

		list = MessageList.init(((DataContainer) currentPanel));
		canBeExecuted = !list.hasErrors();
		
		//System.out.println("added first panel to contentPanel");
		container.updateButtonStates(container.isLast(actualPagename), container.isFirst(actualPagename));
	 	container.getUsedPages().push(actualPagename);
	 	container.setCurrentPageName(actualPagename);
	}

	public MessageList next(ContainerUpdater containerUpdater) throws ValidationException, ObjectUpdateException, UpdateControlsException
	{
        String actualPanelName = (String) container.getUsedPages().peek();
        currentPanel = (BaseDataContainer)container.getPages().get(actualPanelName);
        baseCimAdapter.validateValues((DataContainer) currentPanel);
		list = ((DataContainer) currentPanel).getMessagesList();
        if (list.size() == 0)
        {
        	baseCimAdapter.updateModel((DataContainer) currentPanel);
    		actualPanelName = container.getNextWizardPageName();
    		logger.info("next - currentPageName: "+actualPanelName);
    		
            currentPanel = (BaseDataContainer)container.getPages().get(actualPanelName);
            containerUpdater.prepareForUpdateControls(currentPanel);
            baseCimAdapter.updateControls((DataContainer) currentPanel);
            container.getUsedPages().push(actualPanelName);
            container.setCurrentPageName(actualPanelName);
        }
        container.updateButtonStates(container.isLast(actualPanelName),container.isFirst(actualPanelName));
        switchButtons();
        return list;
	}
	
	public void back() throws ValidationException, UpdateControlsException
	{
	}
	
	public List finish() throws ValidationException, ObjectUpdateException, UpdateControlsException, ObjectSaveException, ObjectCreationException
	{
        String actualPanelName = (String) container.getUsedPages().peek();
		logger.info("finish - currentPageName: "+actualPanelName);
        currentPanel = (BaseDataContainer)container.getPages().get(actualPanelName);
        baseCimAdapter.create((DataContainer) currentPanel);
        List result = new ArrayList();
        //put errors here
        return result;
	}	
	
	public void cancel() throws ValidationException, ObjectUpdateException, UpdateControlsException, ObjectSaveException
	{
        container.getUsedPages().clear();
	}	

	public void startWizard() { 		
	}

	public BaseDataContainer getCurrentPanel() {
		return currentPanel;
	}

	public IWizardContainer getContainer() {
		return container;
	}
	
	public void cleanUPPage(String panelName) {
		//cleanup is done in the adapter
	}

	
    public boolean savePageValues(String actualPanelName) {
    	//save pageValues is done in the JSFWizardBase.next-Method, delegating the call to the adapter
    	return true;
    }

    public void setSummaryText(String nextPanelName) {
    	//adapter-based wizards having no SummaryText
    	//if wanted a method like getSummaryText shoule be imlemented in AbstractBaseCimAdapter
    }
    
   public String wizardComplete() {
	   //everything necessary for completion is done in the Adaper
	   return "";
   }
   public void switchButtons() {
		
   }

	public IPageWizardAdapter getPageWizardAdapter() {
		return adapter;
	}

	public boolean canBeExecuted() {
		return canBeExecuted;
	}

	public MessageList getMessageList()
	{
		return list;
	}

	
   
}
