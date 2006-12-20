/** 
 * EditBean.java
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
 * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
 *
 * Contributors: 
 * 
 * Description: BaseClass for EditorBackingBeans
 * 
 */
package org.sblim.wbemsmt.tools.jsf;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.faces.component.UIComponentBase;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.component.html.HtmlPanelGroup;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.ErrCodes;
import org.sblim.wbemsmt.bl.MessageNumber;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.Message;
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.exception.CountException;
import org.sblim.wbemsmt.exception.InitContainerException;
import org.sblim.wbemsmt.exception.ObjectNotFoundException;
import org.sblim.wbemsmt.exception.ObjectSaveException;
import org.sblim.wbemsmt.exception.UpdateControlsException;
import org.sblim.wbemsmt.exception.ValidationException;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

public abstract class EditBean extends JsfBase{

	public EditBean(WbemSmtResourceBundle bundle) {
		super(bundle);
	}
	
	protected List containers = new ArrayList();
	
	public static final String PAGE_START = "start";
	public static final String PAGE_EDIT = "edit";
	
	protected HtmlCommandButton btnCancel, btnOK = null;
	protected MessageList saveResult = null;

	   
	public String cancel() {
		return PAGE_START;
	}
	public abstract String save() throws ValidationException, ObjectSaveException;
	public abstract void edit(ITaskLauncherTreeNode treeNode) throws ObjectNotFoundException, UpdateControlsException, CountException, InitContainerException;
	public abstract HtmlPanelGrid getPanel();
	public List getContainers() {
		return containers;
	}
	public void setContainers(List containers) {
		this.containers = containers;
	}
	public void addOKCancel(UIComponentBase parent, String methodBindingPrefix) {
		btnOK = (HtmlCommandButton) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlCommandButton.COMPONENT_TYPE);
		btnOK.setValueBinding("value",FacesContext.getCurrentInstance().getApplication().createValueBinding("#{messages.ok}"));
		String binding = "#{" + methodBindingPrefix + "save" + "}";
		btnOK.setAction(FacesContext.getCurrentInstance().getApplication().createMethodBinding(binding,null));
		btnOK.setId("editok");
		
		btnCancel = (HtmlCommandButton) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlCommandButton.COMPONENT_TYPE);
		btnCancel.setValueBinding("value",FacesContext.getCurrentInstance().getApplication().createValueBinding("#{messages.cancel}"));
		binding = "#{" + methodBindingPrefix + "cancel" + "}";
		btnCancel.setAction(FacesContext.getCurrentInstance().getApplication().createMethodBinding(binding,null));
		btnCancel.setId("editcancel");

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
		buttonGroup.getChildren().add(btnCancel);

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
		if (messages.hasErrors())
		{
			JsfBase.addMessages(new Message(ErrCodes.MSG_SAVE_ERROR, Message.ERROR,bundle.getString(ErrCodes.MSG_SAVE_ERROR,"save.error")),messages, true);
		}
		else
		{
			if (messages.hasWarning())
			{
				JsfBase.addMessages(new Message(ErrCodes.MSG_SAVE_WARNING, Message.WARNING,bundle.getString(ErrCodes.MSG_SAVE_WARNING,"save.warning")),messages, true);
			}
			else if (messages.hasInfo())
			{
				JsfBase.addMessages(new Message(ErrCodes.MSG_SAVE_INFO, Message.INFO,bundle.getString(ErrCodes.MSG_SAVE_INFO,"save.info")),messages, true);
			}
			else
			{
				JsfBase.addMessage(new Message(ErrCodes.MSG_SAVE_SUCCESS, Message.SUCCESS,bundle.getString(ErrCodes.MSG_SAVE_SUCCESS,"save.success")));
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
		Set reloadedAdapters = new HashSet();

		for (int i=0; i < editBeans.size(); i++)
		{
			try
			{
    			EditBean bean = (EditBean)editBeans.get(i);
    			List containers = bean.getContainers();
    			for (Iterator iter = containers.iterator(); iter.hasNext();) {
					DataContainer container = (DataContainer) iter.next();
					if (container.getAdapter().isMarkedForReload() && !reloadedAdapters.contains(container.getAdapter()))
					{
						container.getAdapter().reload();
						reloadedAdapters.add(container.getAdapter());
					}
				}
			}
			catch (Exception e)
			{
				JsfUtil.handleException(e);
			}
		}
		
		
		
	}
  
   /**
    * Checks the adapters bound to the containers in the editBeans and triggers a reload
    * for those adapters marked for reload
    * @param editBeans
    * @see org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter#markedForReload
    */
   public void reloadAdapters() {
		Set reloadedAdapters = new HashSet();

			try
			{
    			for (Iterator iter = containers.iterator(); iter.hasNext();) {
					DataContainer container = (DataContainer) iter.next();
					if (container.getAdapter().isMarkedForReload() && !reloadedAdapters.contains(container.getAdapter()))
					{
						container.getAdapter().reload();
						reloadedAdapters.add(container.getAdapter());
					}
				}
			}
			catch (Exception e)
			{
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
    
    protected void addSaveSuccess(WbemSmtResourceBundle bundle)
    {
    	addSaveResult(ErrCodes.MSG_SAVE_SUCCESS,Message.SUCCESS,bundle,"save.success",null);
    }
    
    private void addSaveResult(MessageNumber msgNumber, String severity, WbemSmtResourceBundle bundle, String key, MessageList list) {
		
    	Message message = new Message(msgNumber,severity,bundle.getString(msgNumber, key));
    	addMessages(message, list, true);
		
	}
    
}
