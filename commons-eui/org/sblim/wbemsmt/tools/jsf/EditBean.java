/** 
 * EditBean.java
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
 * Description: BaseClass for EditorBackingBeans
 * 
 */
package org.sblim.wbemsmt.tools.jsf;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import javax.faces.component.UIComponentBase;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.component.html.HtmlPanelGroup;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.ErrCodes;
import org.sblim.wbemsmt.bl.MessageNumber;
import org.sblim.wbemsmt.bl.adapter.*;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.ITreeSelector;
import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherTreeNode;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.webapp.jsf.ObjectActionControllerBean;
import org.sblim.wbemsmt.webapp.jsf.style.StyleBean;

public abstract class EditBean extends JsfBase{

	
	/**
	 * The name of the form where the editbeans are added to
	 */
	public static final String MAIN_FORM = "mainForm";


	public EditBean(WbemSmtResourceBundle bundle) {
		super(bundle);
	}
	
	protected List containers = new ArrayList();
	protected List ajaxPanels = new ArrayList();
	
	public static final String PAGE_START = "start";
	public static final String PAGE_EDIT = "edit";
	
	protected HtmlCommandButton btnRevert, btnOK = null;
	protected MessageList saveResult = null;

	protected static Logger logger = Logger.getLogger(EditBean.class.getName());
	
	   
	public String revert() throws ObjectRevertException
	{
		return revert(false);
	}
	
	public String revert(boolean silent) throws ObjectRevertException
	{
		return revert(true,silent);
	}

	public String revert(boolean doUpdateControls, boolean silent) throws ObjectRevertException {
		EditBean.revert(containers,bundle,doUpdateControls,silent);
		return EditBean.PAGE_EDIT;
	}
	
	public static MessageList revert(List containers, WbemSmtResourceBundle bundle, boolean doUpdateControls, boolean silent) throws ObjectRevertException {

		DataContainerUtil.clearContainerMessages(containers);
		
		for (Iterator iter = containers.iterator(); iter.hasNext();) {
			DataContainer dataContainer = (DataContainer) iter.next();
			dataContainer.getAdapter().revert(dataContainer);
			if (MessageList.init(dataContainer).hasErrors())
			{
				return DataContainerUtil.getContainerMessages(containers);
			}
		}

		if (doUpdateControls)
		{
			for (Iterator iter = containers.iterator(); iter.hasNext();) {
				DataContainer dataContainer = (DataContainer) iter.next();
				try {
					dataContainer.getAdapter().updateControls(dataContainer);
					if (MessageList.init(dataContainer).hasErrors())
					{
						return DataContainerUtil.getContainerMessages(containers);
					}
				} catch (UpdateControlsException e) {
					throw new ObjectRevertException("Cannot updateControls after Reverting the changes",e);
				}
			}
		}
		
		
		MessageList messages = DataContainerUtil.getContainerMessages(containers);
		if (!silent)
		{
			handleRevertResult(bundle,messages);
		}
		return messages;
	}

	public abstract String save() throws ValidationException, ObjectSaveException,UpdateControlsException;
	public abstract void edit(ITaskLauncherTreeNode treeNode) throws ObjectNotFoundException, UpdateControlsException, CountException, InitContainerException;
	public abstract HtmlPanelGrid getPanel();
	public List getContainers() {
		return containers;
	}
	
	
	
	public void setContainers(List containers) {
		this.containers = containers;
	}
	public void addOKRevert(UIComponentBase parent, String methodBindingPrefix) {
		btnOK = (HtmlCommandButton) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlCommandButton.COMPONENT_TYPE);
		btnOK.setValueBinding("value",FacesContext.getCurrentInstance().getApplication().createValueBinding("#{messages.ok}"));
		String binding = "#{" + methodBindingPrefix + "save" + "}";
		btnOK.setAction(FacesContext.getCurrentInstance().getApplication().createMethodBinding(binding,null));
		btnOK.setOnclick(JavascriptUtil.getShowWaitCall(bundle.getString("saving.data")));
		btnOK.setId("editok");
		
		btnRevert = (HtmlCommandButton) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlCommandButton.COMPONENT_TYPE);
		btnRevert.setValueBinding("value",FacesContext.getCurrentInstance().getApplication().createValueBinding("#{messages.revert}"));
		binding = "#{" + methodBindingPrefix + "revert" + "}";
		btnRevert.setAction(FacesContext.getCurrentInstance().getApplication().createMethodBinding(binding,null));
		btnRevert.setOnclick(JsfUtil.getRevertEditActionJavaScriptConfirmStatement() +  JavascriptUtil.getShowWaitCall(bundle.getString("undo.data")));
		btnRevert.setId("editrevert");

		HtmlPanelGroup buttonGroup = (HtmlPanelGroup) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGroup.COMPONENT_TYPE);
		HtmlOutputText text1 = (HtmlOutputText) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE);
		text1.setEscape(false);
		text1.setValue("<br>");
		HtmlOutputText text2 = (HtmlOutputText) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE);
		text2.setEscape(false);
		text2.setValue("&nbsp;&nbsp;");
		
		buttonGroup.getChildren().add(text1);
		buttonGroup.getChildren().add(btnOK);
		buttonGroup.getChildren().add(text2);
		buttonGroup.getChildren().add(btnRevert);

		parent.getChildren().add(buttonGroup);
	}

    public void reload()
    {
    }
    
   public MessageList getSaveResult()
   {
	  return saveResult;
   }
    
   public static void handleSaveResult(WbemSmtResourceBundle bundle, MessageList messages)
   {
	   
	    if (messages.hasInfo())
	    {
	    	messages.addMessage(Message.create(ErrCodes.MSG_SAVE_INFO, Message.INFO,bundle,"save.info"));
	    }

	    if (messages.hasErrors())
		{
			JsfBase.addMessages(Message.create(ErrCodes.MSG_SAVE_ERROR, Message.ERROR,bundle,"save.error"),messages, true);
		}
		else if (messages.hasWarning())
		{
			JsfBase.addMessages(Message.create(ErrCodes.MSG_SAVE_WARNING, Message.WARNING,bundle,"save.warning"),messages, true);
		}
		else
		{
			
			JsfBase.addMessages(Message.create(ErrCodes.MSG_SAVE_SUCCESS, Message.SUCCESS,bundle,"save.success"),messages,true);
		}
   }

   public static void handleRevertResult(WbemSmtResourceBundle bundle, MessageList messages)
   {
		if (messages.hasErrors())
		{
			JsfBase.addMessages(Message.create(ErrCodes.MSG_CANCEL_ERROR, Message.ERROR,bundle,"revert.error"),messages, true);
		}
		else
		{
			if (messages.hasWarning())
			{
				JsfBase.addMessages(Message.create(ErrCodes.MSG_CANCEL_WARNING, Message.WARNING,bundle,"revert.warning"),messages, true);
			}
			else if (messages.hasInfo())
			{
				JsfBase.addMessages(Message.create(ErrCodes.MSG_CANCEL_INFO, Message.INFO,bundle,"revert.info"),messages, true);
			}
			else
			{
				JsfBase.addMessage(Message.create(ErrCodes.MSG_CANCEL_SUCCESS, Message.INFO,bundle,"revert.success"));
			}
		}
   }

   /**
    * Checks the adapters bound to the containers in the editBeans and triggers a reload
    * for those adapters marked for reload
    * @param editBeans
    * @see org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter#markedForReload
    */
   public static void reloadAdapters(List editBeans) {

		try {
			AbstractBaseCimAdapter adapterForReload = null;

			for (int i = 0; i < editBeans.size() && adapterForReload == null; i++) {
				EditBean bean = (EditBean) editBeans.get(i);
				List containers = bean.getContainers();
				for (Iterator iter = containers.iterator(); iter.hasNext();) {
					DataContainer container = (DataContainer) iter.next();
					if (container.getAdapter().isMarkedForReload()) {
						adapterForReload = container.getAdapter();
					}
				}
			}
			if (adapterForReload != null) {
				FacesContext facesContext = FacesContext.getCurrentInstance();
				ITreeSelector treeSelectorBean = (ITreeSelector) BeanNameConstants.TREE_SELECTOR.getBoundValue(facesContext);
				ObjectActionControllerBean objectActionController = (ObjectActionControllerBean) BeanNameConstants.OBJECT_ACTION_CONTROLLER.getBoundValue(facesContext);
				treeSelectorBean.getCurrentTreeBacker().updateTree();
				
				if (adapterForReload.getPathOfTreeNode() != null)
				{
					TaskLauncherTreeNode node = adapterForReload.getRootNode().findInstanceNode(adapterForReload.getPathOfTreeNode());
					if (node != null)
					{
				        treeSelectorBean.setSelectedTaskLauncherTreeNode(node);
				        objectActionController.setSelectedNode(node);
					}
					else
					{
						logger.warning("Node with path " + adapterForReload.getPathOfTreeNode() + " was not found in tree");						
					}
					adapterForReload.setPathOfTreeNode(null);
				}
				objectActionController.reloadSelectedNode();
			}
		} catch (Exception e) {
			JsfUtil.handleException(e);
		}
	}
  
   protected void addValidationErrors(MessageList list, WbemSmtResourceBundle bundle)
   {
	   if (list.hasErrors())
	   {
		   addSaveResult(ErrCodes.MSG_VALIDATION_ERROR,Message.ERROR, bundle,"validation.error",list);
	   }
   }

   protected void addSaveError(MessageList list, WbemSmtResourceBundle bundle)
    {
	   if (list.hasErrors())
	   {
		   addSaveResult(ErrCodes.MSG_SAVE_ERROR,Message.ERROR, bundle,"save.error",list);
	   }
    }
	
	protected void addSaveWarning(MessageList list, WbemSmtResourceBundle bundle)
    {
    	addSaveResult(ErrCodes.MSG_SAVE_WARNING,Message.WARNING,bundle,"save.warning",list);
    }
    
    protected void addSaveInfo(MessageList list, WbemSmtResourceBundle bundle)
    {
    	addSaveResult(ErrCodes.MSG_SAVE_INFO,Message.INFO,bundle,"save.info",list);
    }
    
    protected void addSaveSuccess(MessageList list, WbemSmtResourceBundle bundle)
    {
    	addSaveResult(ErrCodes.MSG_SAVE_SUCCESS,Message.SUCCESS,bundle,"save.success",list);
    }

    protected void addSaveSuccess(WbemSmtResourceBundle bundle)
    {
    	addSaveResult(ErrCodes.MSG_SAVE_SUCCESS,Message.SUCCESS,bundle,"save.success",null);
    }
    
    private void addSaveResult(MessageNumber msgNumber, String severity, WbemSmtResourceBundle bundle, String key, MessageList list) {
		
    	Message message = new Message(msgNumber,severity,bundle.getString(msgNumber, key));
    	addMessages(message, list, true);
	}
    
    protected void addFooter(HtmlPanelGrid containerPanel, String bindingPrefix)
    {
    	StyleBean style = (StyleBean) BeanNameConstants.STYLE.getBoundValue(FacesContext.getCurrentInstance());    	
    	
		HtmlPanelGrid table = (HtmlPanelGrid)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
		table.setStyleClass("tableFooter");
		table.setCellpadding("0");
		table.setCellspacing("0");
		table.setColumns(2);
		table.setColumnClasses("tableFooterIcon,tableFooter");
		
		BasePanel.addRequiredIconLegend(style, table, "#{" + bindingPrefix + "requiredVisible}");
		BasePanel.addErrorIconLegend(style, table, "#{" + bindingPrefix + "errorVisible}");
		
		containerPanel.getFacets().put("footer", table);

    }
    
    /**
     * Go through all containers and Childs and check if they have required fields
     * @return
     */
    public boolean isRequiredVisible()
    {
    	return DataContainerUtil.havingRequiredFields(containers);
    }
    
    /**
     * Go through all containers and Childs and check if they have errors
     * @return
     */
    public boolean isErrorVisible()
    {
    	return DataContainerUtil.havingErrorFields(containers);
    }
    
    public void clearEditBeansModified()
    {
    	ObjectActionControllerBean oac = (ObjectActionControllerBean) BeanNameConstants.OBJECT_ACTION_CONTROLLER.getBoundValue(FacesContext.getCurrentInstance());
    	oac.clearEditBeansModified();
    }



}
