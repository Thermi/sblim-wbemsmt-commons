 /** 
  * JSFWizardBase.java
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
import java.util.Locale;
import java.util.logging.Logger;

import javax.faces.component.UICommand;
import javax.faces.component.UIParameter;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.apache.commons.lang.ClassUtils;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;
import org.sblim.wbemsmt.bl.messages.ErrCodes;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.ITreeSelector;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNode;
import org.sblim.wbemsmt.exception.ExceptionUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.jsf.JsfBase;
import org.sblim.wbemsmt.tools.jsf.JsfUtil;
import org.sblim.wbemsmt.tools.resources.*;
import org.sblim.wbemsmt.tools.wizard.IWizardBasePanel;
import org.sblim.wbemsmt.tools.wizard.WizardBase;
import org.sblim.wbemsmt.tools.wizard.WizardStepList;
import org.sblim.wbemsmt.tools.wizard.adapter.IPageWizardAdapter;
import org.sblim.wbemsmt.tools.wizard.container.IWizardContainer;
import org.sblim.wbemsmt.webapp.jsf.ObjectActionControllerBean;

public abstract class JSFWizardBase extends JsfBase implements WizardBase{

	public static final String WIZARD_PAGE = "wizardPage";
	private IPageWizardAdapter adapter = null;	
	protected IWizardContainer container = null;
	private boolean finishButtonDisabled;
	private boolean nextButtonDisabled;
	private boolean backButtonDisabled;
	private boolean cancelButtonDisabled;
	private IWizardBasePanel currentPanel;
	protected final AbstractBaseCimAdapter baseCimAdapter;
	private boolean canBeExecuted = false;
		
	protected static Logger logger = Logger.getLogger("org.sblim.wbemsmt.tools.wizard.jsf");
	
	private HashMap<String, IWizardBasePanel> pages = new HashMap<String, IWizardBasePanel>();
	private String keyForTitle;
	private String title;
	
	/**
	 * Panel selection while starting the wizard
	 */
	private ITaskLauncherTreeNode selectedNode;
	private int selectTabIndex;
	private String selectTabId;
	
	public abstract String getFinishText();
	public abstract String getJavaScriptWaitStatement();
	
	public JSFWizardBase(AbstractBaseCimAdapter baseCimAdapter,WbemSmtResourceBundle resourceBundle, String keyForTitle) {
		super(resourceBundle);
		this.baseCimAdapter = baseCimAdapter;

		ILocaleManager localeManager = LocaleManager.getCurrent(FacesContext.getCurrentInstance());
		if (keyForTitle != null)
		{
			this.keyForTitle = keyForTitle;
			this.title = bundle.getString(keyForTitle);
		}
		localeManager.addLocaleChangeListener(new LocaleChangeListener()
		{
			public void localeChanged(Locale newLocale) {
				bundle = ResourceBundleManager.getResourceBundle(bundle.getBundleNames(),newLocale);				
				reload();
			}
		});
		
		
	}
	
	protected void initialize() {
	}

	public void initWizard(IWizardContainer container, IPageWizardAdapter adapter) throws Exception {
		this.container = container;
		this.adapter = adapter;

		FacesContext facesContext = FacesContext.getCurrentInstance();
		ObjectActionControllerBean objectActionController = (ObjectActionControllerBean)BeanNameConstants.OBJECT_ACTION_CONTROLLER.getBoundValue(facesContext);
		selectedNode = objectActionController.getSelectedNode();
		selectTabIndex = objectActionController.getSelectedTabIndex();
		selectTabId = objectActionController.getSelectedTabId();
		
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

		currentPanel = (IWizardBasePanel)container.getPage(actualPanelName);
		container.getPages().put(actualPanelName, currentPanel);
		
		baseCimAdapter.initWizard(this,(DataContainer) currentPanel,actualPanelName);
		currentPanel.countAndCreateChildren();
		baseCimAdapter.updateControls((DataContainer) currentPanel);
		
		MessageList list = MessageList.init(((DataContainer) currentPanel));
		JsfBase.addMessages(list);
		canBeExecuted = !list.hasErrors();
		
		//System.out.println("added first panel to contentPanel");
		container.updateButtonStates(container.isLast(actualPanelName), container.isFirst(actualPanelName));
		switchButtons();
	 	container.getUsedPages().push(actualPanelName);
	 	container.setCurrentPageName(actualPanelName);
	 	container.getStepList().getWizardStep(actualPanelName).setCurrent(true);
	 	pages.put(actualPanelName,currentPanel);
	}

//	public void next(ActionEvent event)
//	{
//	}

	/**
	 * select the page and remove all other pages on the stack with pages
	 */
	public void select(ActionEvent event)
	{
		UIParameter parameter = (UIParameter) ((UICommand)event.getComponent()).getChildren().get(0);
		String pageName = (String) parameter.getValue();
		
		if (container.getUsedPages().contains(pageName))
		{
			String usedPageName = null;
			do
			{
				usedPageName = (String) container.getUsedPages().peek();
				if (!usedPageName.equals(pageName))
				{
					container.getUsedPages().pop();
					container.getStepList().getWizardStep(usedPageName).setCurrent(false);
					container.getStepList().getWizardStep(usedPageName).setVisited(false);
				}
			} while (!usedPageName.equals(pageName));

			try {
				selectContainerWhileSteppingBack(pageName);
			} catch (WbemsmtException e) {
				ExceptionUtil.handleException(e);
			}

		}
		else
		{
			logger.warning("Cannot select page " + pageName + " The page is no used page"); 
		}
	}
	
	public String selectAction()
	{
		return JSFWizardBase.WIZARD_PAGE;
	}
	
	public String next() throws WbemsmtException
	{
	
		try
		{
	        String actualPanelName = (String) container.getUsedPages().peek();
	        //currentPanel = (WizardBasePanel)container.getPages().get(actualPanelName);
	        baseCimAdapter.validateValues((DataContainer) currentPanel);
			MessageList result = ((DataContainer) currentPanel).getMessagesList();

			if(!result.hasErrors())
			{
	        	baseCimAdapter.updateModel((DataContainer) currentPanel);
	        	result = ((DataContainer) currentPanel).getMessagesList();
	        	if (result.hasWarning())
	        	{
	        		addMessage(new Message(ErrCodes.MSG_ADDITIONAL_MESSAGES,Message.WARNING,bundle.getString(ErrCodes.MSG_ADDITIONAL_MESSAGES,"additional.messages")));
	        	}
	        	if (result.hasInfo())
	        	{
	        		addMessage(new Message(ErrCodes.MSG_ADDITIONAL_MESSAGES,Message.INFO,bundle.getString(ErrCodes.MSG_ADDITIONAL_MESSAGES,"additional.messages")));
	        	}
	        	addMessages(result);
			} else {
				addMessages(new Message(ErrCodes.MSG_VALIDATION_ERROR,Message.ERROR,bundle.getString(ErrCodes.MSG_VALIDATION_ERROR,"validation.error")),result, true);
			}

	        if (!result.hasErrors())
	        {
	        	result.clear();
	        	
	        	container.getStepList().getWizardStep(actualPanelName).setCurrent(false);
	    		actualPanelName = container.getNextWizardPageName();
	            container.getStepList().getWizardStep(actualPanelName).setCurrent(true);

	            try {
	            	IWizardBasePanel newPanel = (IWizardBasePanel)container.getPage(actualPanelName);
					MessageList.init((DataContainer) newPanel).addAll(((DataContainer) currentPanel).getMessagesList());
					currentPanel = newPanel;
					container.getPages().put(actualPanelName, currentPanel);

					countAndCreateChilds((DataContainer) currentPanel);
				} catch (WbemsmtException e) {
					throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS,"Cannot find WizardPage " + actualPanelName,e);
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

	        	addMessages(result);
	        	result.clear();
	        }
	        else 
	        {
	        	DataContainer oldPanel = (DataContainer) currentPanel;
	        	
	            try {
					currentPanel = (IWizardBasePanel) container.getPage(actualPanelName);
					container.getPages().put(actualPanelName, currentPanel);
				} catch (WbemsmtException e) {
					throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS,"Cannot find WizardPage " + actualPanelName,e);
				}
	            currentPanel =  (IWizardBasePanel) DataContainerUtil.copyValues(oldPanel, (DataContainer) currentPanel);
	        }
	        result.clear();
	        container.updateButtonStates(container.isLast(actualPanelName),container.isFirst(actualPanelName));
	        switchButtons();
	        
		 	pages.put(actualPanelName,currentPanel);
		} catch (Exception e)
		{
			JsfUtil.handleException(e);
		}
		
		return JSFWizardBase.WIZARD_PAGE;
	}
	
	public String back() throws WbemsmtException
	{
        String actualPanelName = (String) container.getUsedPages().pop();
        container.getStepList().getWizardStep(actualPanelName).setCurrent(false);
        container.getStepList().getWizardStep(actualPanelName).setVisited(false);
        actualPanelName = (String) container.getUsedPages().peek();
        selectContainerWhileSteppingBack(actualPanelName);
        return JSFWizardBase.WIZARD_PAGE;
	}

	private void selectContainerWhileSteppingBack(String actualPanelName) throws WbemsmtException {
		container.getStepList().getWizardStep(actualPanelName).setCurrent(true);
        DataContainer oldPanel = (DataContainer) pages.get(actualPanelName);
        try {
			currentPanel = (IWizardBasePanel)container.getPage(actualPanelName);
			container.getPages().put(actualPanelName, currentPanel);
		} catch (WbemsmtException e) {
			throw new WbemsmtException(WbemsmtException.ERR_UPDATE_CONTROLS,"Cannot find WizardPage " + actualPanelName,e);
		}
        DataContainerUtil.copyValues(oldPanel,(DataContainer) currentPanel);
        baseCimAdapter.updateControls((DataContainer) currentPanel);
        container.setCurrentPageName(actualPanelName);
        
        container.updateButtonStates(container.isLast(actualPanelName),container.isFirst(actualPanelName));
        switchButtons();
	 	pages.put(actualPanelName,currentPanel);
	}
	
	public String finish()
	{
        try {
        	FacesContext facesContext = FacesContext.getCurrentInstance();
        	ITreeSelector treeSelectorBean = (ITreeSelector)BeanNameConstants.TREE_SELECTOR.getBoundValue(facesContext);
        	ObjectActionControllerBean objectActionController = (ObjectActionControllerBean)BeanNameConstants.OBJECT_ACTION_CONTROLLER.getBoundValue(facesContext);
			
        	String actualPanelName = (String) container.getUsedPages().peek();
			currentPanel = (IWizardBasePanel)container.getPages().get(actualPanelName);
			DataContainer dc = (DataContainer) currentPanel;
			baseCimAdapter.create(dc);
			
			
			String wizardName = ClassUtils.getShortClassName(getClass());
			if (dc.getMessagesList() != null && dc.getMessagesList().hasErrors())
			{
				addMessages(new Message(ErrCodes.MSG_CREATE_FAILED,Message.ERROR,bundle.getString(wizardName + ".create.failed")),dc.getMessagesList(), true);        
			}
			else
			{
				addMessages(new Message(ErrCodes.MSG_CREATE_SUCCESS,Message.SUCCESS,bundle.getString(wizardName + ".create.success")),dc.getMessagesList(), true);        
				baseCimAdapter.reload();
			}

			objectActionController.setWizardActive(false);

			

	        /**
			 * If the business logic set the path to a node try 
			 */
			if (baseCimAdapter.getPathOfTreeNode() != null)
			{
				TaskLauncherTreeNode node = baseCimAdapter.getRootNode().findInstanceNode(baseCimAdapter.getPathOfTreeNode());
				if (node != null)
				{
					
			        treeSelectorBean.setSelectedTaskLauncherTreeNode(node);

			        objectActionController.setSelectedNode(node);
			        
			        //don't revert the changes becuse we entering a new node
			        boolean revert = false;
			        String result = node.click(revert);
			        
			        //if after finishing the wizard the same node is active, switch the tabs
			        if (selectedNode != null && selectedNode.getInfo().equals(node.getInfo()))
			        {
			        	objectActionController.setSelectedTabIndex(selectTabIndex);
			        	objectActionController.setSelectedTabId(selectTabId);
			        }
			        selectedNode = node;
					return result != null ? result : "";
				}
				else
				{
					logger.warning("Node with path " + baseCimAdapter.getPathOfTreeNode() + " was not found in tree");
				}
				baseCimAdapter.setPathOfTreeNode(null);
			}
			treeSelectorBean.setSelectedTaskLauncherTreeNode(selectedNode);
			return "editPage";
			
		} catch (Exception e) {
			e.printStackTrace();
			JsfUtil.handleException(e);
			return "";
		}
	}	
	
	public String cancel() throws WbemsmtException
	{
		ITreeSelector treeSelectorBean = (ITreeSelector)BeanNameConstants.TREE_SELECTOR.getBoundValue(FacesContext.getCurrentInstance());
		ObjectActionControllerBean objectActionController = (ObjectActionControllerBean)BeanNameConstants.OBJECT_ACTION_CONTROLLER.getBoundValue(FacesContext.getCurrentInstance());

		objectActionController.setWizardActive(false);

		treeSelectorBean.setSelectedTaskLauncherTreeNode(selectedNode);

        objectActionController.setSelectedNode(selectedNode);
    	objectActionController.setSelectedTabIndex(selectTabIndex);
    	objectActionController.setSelectedTabId(selectTabId);

        container.getUsedPages().clear();

        String result = null;
        if (selectedNode != null)
        {
        	result = selectedNode.click(true);
        }
        
		return result != null ? result : "start";
	}	

	public void switchButtons() {
		this.backButtonDisabled = !container.isBackButtonFlag(); 
		this.nextButtonDisabled = !container.isNextButtonFlag(); 
		this.cancelButtonDisabled = !container.isCancelButtonFlag(); 
		this.finishButtonDisabled = !container.isFinishButtonFlag();
	}
	
	
	public void startWizard() {
		ObjectActionControllerBean objectActionController = (ObjectActionControllerBean)BeanNameConstants.OBJECT_ACTION_CONTROLLER.getBoundValue(FacesContext.getCurrentInstance());
		objectActionController.setWizardActive(true);
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
	
	public IWizardBasePanel getCurrentPanel() {
		return currentPanel;
	}
	
	public AbstractBaseCimAdapter getAdapter()
	{
		return getAdapter();
	}
	
	public IPageWizardAdapter getPageWizardAdapter() {
		return adapter;
	}	
	
	public abstract void countAndCreateChilds(DataContainer dataContainer) throws WbemsmtException;

	public WizardStepList getStepList() {
		return container.getStepList();
	}
	
	public void reload() {
		if (keyForTitle != null)
		{
			this.title = bundle.getString(keyForTitle);
		}
	}
	
	public String getTitleText()
	{
		return this.title;
	}
	
	/**
	 * externalized this statement into this method because the handling via JSF EL is too complex
	 * @return
	 */
	public String getCancelJavaScriptConfirmStatement()
	{
		WbemSmtResourceBundle resourceBundle = ResourceBundleManager.getResourceBundle(FacesContext.getCurrentInstance());
		return "if (!showConfirm('" +  resourceBundle.getString("cancelWizard")  +"')) return false;";
	}
	
	/**
	 * return true if the wizard can be executed
	 * thats the case if initializing the wizard created no errors
	 */
	public boolean canBeExecuted() {
		return canBeExecuted;
	}
	
	
	
}
