/**
 *  ObjectActionControllerBean.java
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
 * Author:    Michael.Bauschert@de.ibm.com
 *
 * Contributors:
 *
 */

package org.sblim.wbemsmt.webapp.jsf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.component.html.HtmlCommandLink;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.component.html.HtmlPanelGroup;
import javax.faces.context.FacesContext;
import javax.faces.el.ValueBinding;
import javax.faces.event.ActionEvent;
import javax.servlet.http.Cookie;

import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.Cleanup;
import org.sblim.wbemsmt.bl.ErrCodes;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.MessageUtil;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.ITreeSelector;
import org.sblim.wbemsmt.bl.welcome.JsfWelcomeListener;
import org.sblim.wbemsmt.bl.welcome.WelcomeData;
import org.sblim.wbemsmt.bl.welcome.WelcomeListener;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.exception.ObjectDeletionException;
import org.sblim.wbemsmt.exception.ObjectNotFoundException;
import org.sblim.wbemsmt.exception.ObjectUpdateException;
import org.sblim.wbemsmt.exception.ValidationException;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.tasklauncher.CimomTreeNode;
import org.sblim.wbemsmt.tasklauncher.event.jsf.JsfEditListener;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.jsf.EditBean;
import org.sblim.wbemsmt.tools.jsf.TabbedPane;
import org.sblim.wbemsmt.tools.jsf.WbemsmtCookieUtil;
import org.sblim.wbemsmt.tools.wizard.jsf.IWizardController;
import org.sblim.wbemsmt.tools.wizard.jsf.JSFWizardBase;

public class ObjectActionControllerBean implements IWizardController, Cleanup {

    private static final Logger logger = Logger.getLogger(ObjectActionControllerBean.class.getName());

	private String defaultUpdateInterval = "1.0";

    //	private boolean canDelete;
//	private boolean canCreate;
	private ITreeSelector treeSelector;
	private JsfEditListener currentEditListener;
	
	private JSFWizardBase currentWizard;
	private HtmlPanelGrid currentEditor;
	private Map editBeans = new HashMap();
	private Boolean editBeansModified = null;
	private boolean wizardActive = false;
	private Map adapter = new HashMap();
	public String selectedTabId = "undefined";
	public TabbedPane tabbedPane;
	public int selectedTabIndex;
	private String cimomName;
	
	private String updateIntervalKey;
	private String updateIntervalValue;
	
	public final String KEY_VERSION = "wbemsmt-version";
	public ITaskLauncherTreeNode selectedNode;

	private List welcomeContainers = new ArrayList();

	private Map updateInterval = new HashMap();
	
	/**
	 * store all the inactive CimomTreeNodes to do a login
	 * 
	 * Objects:CimomTreeNode
	 * 
	 * @see CimomTreeNode
	 */
	private List cimomTreeNodesForLogin;

	private int updateIntervalCookieMaxAge = WbemsmtCookieUtil.DEFAULT_MAX_AGE;

	public ObjectActionControllerBean() {
		loadUpdateIntervalFromCookies();
		
	}
//	
//	public boolean isCanCreate() {
//		return canCreate;
//	}
//	public void setCanCreate(boolean canCreate) {
//		this.canCreate = canCreate;
//	}
//	public boolean isCanDelete() {
//		return canDelete;
//	}
//	public void setCanDelete(boolean canDelete) {
//		this.canDelete = canDelete;
//	}
	
	public String delete() throws ModelLoadException, ObjectNotFoundException, ObjectDeletionException
	{
		return "start";
	}
	
	public String create() throws ObjectUpdateException, ValidationException, ModelLoadException
	{
		return "start";
	}

	public String edit() throws ModelLoadException, ObjectUpdateException, ValidationException
	{
        return "start";
	}

	public ITreeSelector getTreeSelector() {
		return treeSelector;
	}
	public void setTreeSelector(ITreeSelector treeSelector) {
		this.treeSelector = treeSelector;
	}

	public CIMClient getCIMClient() {
		return treeSelector.getSelectedNode().getTaskLauncherTreeNode().getCimClient();
	}

	public JSFWizardBase getCurrentWizard() {
		return currentWizard;
	}

	public void setCurrentWizard(JSFWizardBase wizard) {
		currentWizard = wizard;
	}

	public HtmlPanelGrid getCurrentEditor() {
		return currentEditor;
	}

	public void setCurrentEditor(HtmlPanelGrid editor) {
		this.currentEditor = editor;
	}
	
	public void clearEditBeans()
	{
		editBeans.clear();
		clearEditBeansModified();
	}
	
	public void clearEditBeansModified()
	{
		editBeansModified = null;
		wizardActive = false;
	}
	
	public void addEditBean(String key, EditBean editBean)
	{
		editBeans.put(key,editBean);
	}
	
	public Map getEditBeans()
	{
		return editBeans;
	}

	public void setTab(ActionEvent event)
	{
		HtmlCommandLink link = ((HtmlCommandLink)event.getSource());
		selectedTabId = tabbedPane.getIdByTabname((String) link.getValue());
	}
	
	public String getSelectedTabId()
	{
		return selectedTabId;
	}
	
	public void setSelectedTabId(String id)
	{
		selectedTabId = id;
	}
	
	public void setTabbedPane(TabbedPane tabbedPane) {
		this.tabbedPane = tabbedPane;
	}

	public TabbedPane getTabbedPane() {
		return tabbedPane;
	}

	public void setSelectedTabIndex(int index) {
		this.selectedTabIndex = index;
	}

	public int getSelectedTabIndex() {
		return selectedTabIndex;
	}

	public String getCimomName() {
		return cimomName;
	}

	public void setCimomName(String cimomName) {
		this.cimomName = cimomName;
	}
	public JsfEditListener getCurrentEditListener() {
		return currentEditListener;
	}
	public void setCurrentEditListener(JsfEditListener currentEditListener) {
		this.currentEditListener = currentEditListener;
	}
	
	public String getCurrentVersion()
	{
		return FacesContext.getCurrentInstance().getExternalContext().getInitParameter(KEY_VERSION);
	}

	public Map getAdapter() {
		return adapter;
	}

	public void setAdapter(Map adapter) {
		this.adapter = adapter;
	}
	
	public void addAdapter(String key, AbstractBaseCimAdapter adapter)
	{
		this.adapter.put(key, adapter);
	}
	public void cleanup() {
		editBeans.clear();
		welcomeContainers.clear();
		adapter.clear();
	}

	public void setSelectedNode(ITaskLauncherTreeNode node) {
		this.selectedNode = node;
	}

	public ITaskLauncherTreeNode getSelectedNode() {
		return selectedNode;
	}

	public boolean isEditBeansModified() {

		if (editBeansModified == null)
		{
			Iterator iterator = editBeans.values().iterator();
			while (iterator.hasNext() && editBeansModified == null) {
				EditBean editBean = (EditBean) iterator.next();
				List containers = editBean.getContainers();
				for (Iterator iter = containers.iterator(); iter.hasNext()  && editBeansModified == null ;) {
					DataContainer container = (DataContainer) iter.next();
					if (container.isModified())
					{
						editBeansModified = new Boolean(true);
					}
				}
			}
			
			if (editBeansModified == null)
			{
				editBeansModified = new Boolean(false);
			}
			
		}
		
		return editBeansModified.booleanValue();
		
	}

	public boolean isWizardActive() {
		return wizardActive;
	}

	public void setWizardActive(boolean wizardActive) {
		this.wizardActive = wizardActive;
		this.editBeansModified = new Boolean(!wizardActive);
	}

	/**
	 * get the panel with all welcome panels for the current used tasks
	 * @return
	 */
	public HtmlPanelGrid getWelcomePanel()
	{
		HtmlPanelGrid parent = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
		parent.setWidth("100%");
		parent.setCellspacing("0");
		parent.setCellpadding("0");
		parent.setStyleClass("editPanelNoTabsOnlyContainers");
		
		WelcomeData[] configs = null;
		ITaskLauncherTreeNode selectedTreeNode = treeSelector.getSelectedTaskLauncherTreeNode();
		if (selectedTreeNode != null)
		{
			try {
				
				while (selectedTreeNode != null && (selectedTreeNode.getCimClient() == null || selectedTreeNode.getTreeConfigData() == null) )
				{
					selectedTreeNode = selectedTreeNode.getParent();
				}
				if (selectedTreeNode != null)
				{
					configs = new WelcomeData[]{new WelcomeData(selectedTreeNode)};
				}
				else
				{
					configs = new WelcomeData[]{};
				}
				
			} catch (WbemSmtException e) {
				if (selectedTreeNode != null)
				{
					logger.log(Level.SEVERE,"Cannot create JsfWelcomeListener for Selected node " + selectedTreeNode.getInfo(),e);
				}
				else
				{
					logger.log(Level.SEVERE,"Cannot create JsfWelcomeListener." ,e);
				}
				configs = new WelcomeData[]{};
			}
		}
		else
		{
			configs = treeSelector.getCurrentTreeFactory().getWelcomeData();
		}
		
		welcomeContainers.clear();
		
		for (int i = 0; i < configs.length; i++) {
			WelcomeData config = configs[i];
			try
			{
				String listenerClass = config.getTreeConfigData().getWelcomeListenerClass();
				if (listenerClass != null)
				{
					WelcomeListener listener = (WelcomeListener)Class.forName(listenerClass).newInstance();
					JsfWelcomeListener jsfListener = (JsfWelcomeListener)listener.getListenerByPlType();
					String bindingPrefix = "objectActionController.welcomeContainers[" + welcomeContainers.size() + "].";
					jsfListener.create(bindingPrefix,config.getCimClient());
					parent.getChildren().add(jsfListener.getPanel());
					welcomeContainers.add(jsfListener.getContainer());
				}
				else
				{
					logger.warning("For  task " + config.getTreeConfigData().getName() + " no WelcomeListener was defined");
				}
			}
			catch (Exception e)
			{
				logger.log(Level.SEVERE,"Cannot crete JsfWelcomeListener for Task " + config.getTreeConfigData().getName(),e);
			}
		}
		
		//if there are new Messages update them
		MessageHandlerBean bean =  (MessageHandlerBean) BeanNameConstants.MESSAGE_HANDLER.getBoundValue(FacesContext.getCurrentInstance());
		bean.updateMessages();
		
		return parent;
	}

	/**
	 * return a list with all containers of the welcome page
	 * @return
	 */
	public List getWelcomeContainers() {
		return welcomeContainers;
	}
	
	public HtmlPanelGrid getTest()
	{
		HtmlPanelGrid component = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);

		HtmlInputText text = (HtmlInputText) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlInputText.COMPONENT_TYPE);
		text.setSize(30);
		text.setValue("Test");
		component.getChildren().add(text);
		
		ValueBinding binding = FacesContext.getCurrentInstance().getApplication().createValueBinding("#{objectActionController.test1}");
		HtmlPanelGroup grid = (HtmlPanelGroup) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGroup.COMPONENT_TYPE);
		grid.setValueBinding("binding", binding);
		component.getChildren().add(grid);
		return component;
	}

	public HtmlPanelGroup getTest1()
	{
		HtmlPanelGroup component = (HtmlPanelGroup) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
		HtmlInputText text = (HtmlInputText) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlInputText.COMPONENT_TYPE);
		text.setValue("Test1");
		text.setSize(60);
		component.getChildren().add(text);
		return component;
		
		
	}

	/**
	 *****************************************
	 *****************************************
	 * Methods for Managing the update intervals of the AjaxPanels
	 *****************************************
	 *****************************************
	 */
	
	public Map getUpdateInterval() {
		return updateInterval ;
	}
	
	public void setDefaultUpdateInterval(String interval)
	{
		defaultUpdateInterval = interval;
	}
	
	public String getDefaultUpdateInterval()
	{
		return defaultUpdateInterval;
	}

	public String getUpdateIntervalKey() {
		return updateIntervalKey;
	}

	public void setUpdateIntervalKey(String updateIntervalKey) {
		this.updateIntervalKey = updateIntervalKey;
	}

	public String getUpdateIntervalValue() {
		return updateIntervalValue;
	}

	public void setUpdateIntervalValue(String updateIntervalValue) {
		this.updateIntervalValue = updateIntervalValue;
	}
	
	public String setInterval()
	{
		String sNew = setValue(updateIntervalKey,updateIntervalValue,false);
		
		try {
			WbemsmtCookieUtil.addCookie(
					WbemsmtCookieUtil.COOKIE_PREFIX_UPDATE_INTERVAL + updateIntervalKey, 
					sNew,
					updateIntervalCookieMaxAge);
		} catch (RuntimeException e) {
			logger.log(Level.SEVERE,"cannot set cookies for update interval ",e);
		}
		
		return "";
	}

	/**
	 * set the updateInterval. If the value cannot be converted "0.0" is used
	 * @param s
	 * @return
	 */
	private String setValue(String key, String s, boolean silent) {
		String sNew = s.replaceAll(",", ".");
		try {
			Double.parseDouble(sNew);
		} catch (Exception e) {
			if (!silent)
			{
				MessageUtil.addMessage(ErrCodes.MSGDEF_INVALID_UPDATE_INTERVAL, new String[]{"messages"}, new Object[]{s});
			}
			sNew = "0.0";
		}
		
		updateInterval.put(key, sNew);
		return sNew;
	}
	
	private void loadUpdateIntervalFromCookies() {
		
		Iterator iter = WbemsmtCookieUtil.getCookiesWithPrefix(WbemsmtCookieUtil.COOKIE_PREFIX_UPDATE_INTERVAL);
		while (iter.hasNext()) {
			Cookie cookie = (Cookie) iter.next();
			//remove the prefix for the key
			String key = cookie.getName().substring(WbemsmtCookieUtil.COOKIE_PREFIX_UPDATE_INTERVAL.length());
			setValue(key,cookie.getValue(),true);
		}

		
	}

	/**
	 * @see updateIntervalCookieMaxAge
	 * @return
	 */
	public int getUpdateIntervalCookieMaxAge() {
		return updateIntervalCookieMaxAge ;
	}

	/**
	 * @see updateIntervalCookieMaxAge
	 * @param updateIntervalCookieMaxAge
	 */
	public void setUpdateIntervalCookieMaxAge(int updateIntervalCookieMaxAge) {
		this.updateIntervalCookieMaxAge = updateIntervalCookieMaxAge;
	}

	public List getCimomTreeNodesForLogin() {
		return cimomTreeNodesForLogin;
	}

	public void setCimomTreeNodesForLogin(List cimomTreeNodesForLogin) {
		this.cimomTreeNodesForLogin = cimomTreeNodesForLogin;
	}

	
	
}
