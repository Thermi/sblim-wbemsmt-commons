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

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.faces.component.html.HtmlCommandLink;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.Cleanup;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.tree.ITreeSelector;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.exception.ObjectDeletionException;
import org.sblim.wbemsmt.exception.ObjectNotFoundException;
import org.sblim.wbemsmt.exception.ObjectUpdateException;
import org.sblim.wbemsmt.exception.ValidationException;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherTreeNode;
import org.sblim.wbemsmt.tasklauncher.event.jsf.JsfEditListener;
import org.sblim.wbemsmt.tools.jsf.EditBean;
import org.sblim.wbemsmt.tools.jsf.TabbedPane;
import org.sblim.wbemsmt.tools.wizard.jsf.IWizardController;
import org.sblim.wbemsmt.tools.wizard.jsf.JSFWizardBase;

public class ObjectActionControllerBean  implements IWizardController, Cleanup {

//	private boolean canDelete;
//	private boolean canCreate;
	private ITreeSelector treeSelector;
	private FacesContext facesContext;
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
	
	public final String KEY_VERSION = "wbemsmt-version";
	public TaskLauncherTreeNode selectedNode; 
	
	public ObjectActionControllerBean() {
		this.facesContext = FacesContext.getCurrentInstance();	
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
	
	public FacesContext getFacesContext() {
		return facesContext;
	}

	public void setFacesContext(FacesContext facesContext) {
		this.facesContext = facesContext;
	}

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
		editBeansModified = null;
	}
	
	public void clearEditBeansModified()
	{
		editBeansModified = null;
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
		adapter.clear();
	}

	public void setSelectedNode(TaskLauncherTreeNode node) {
		this.selectedNode = node;
	}

	public TaskLauncherTreeNode getSelectedNode() {
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
	}

	
	
}
