/** 
  *LabeledJSFPictureComponent.java
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
  * Description: a Pictrue with a label and the tooltip with the label text
  * 
  */

package org.sblim.wbemsmt.tools.input.jsf;

import javax.faces.component.html.HtmlCommandLink;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.sblim.wbemsmt.bl.ErrCodes;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.Message;
import org.sblim.wbemsmt.bl.fielddata.FieldData;
import org.sblim.wbemsmt.bl.fielddata.LinkData;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEvent;
import org.sblim.wbemsmt.exception.ExceptionUtil;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.tasklauncher.TreeSelector;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.converter.Converter;
import org.sblim.wbemsmt.tools.jsf.JsfUtil;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;

public class LabeledJSFLinkComponent extends LabeledJSFInputComponent {

	private String outcome = null;
	
	public LabeledJSFLinkComponent(DataContainer parent, String labelText,String id, Converter converter,boolean readOnly) {
		super(parent, labelText, id, FacesContext.getCurrentInstance().getApplication().createComponent(HtmlCommandLink.COMPONENT_TYPE), converter,readOnly);
		setComponentBindings1(this, id);
	}
	
	public void itemActionListener(ActionEvent event)
	{
		LinkData data = (LinkData) getFieldData();
		
		if (data != null)
		{
			TreeSelector treeSelector = (TreeSelector) BeanNameConstants.TREE_SELECTOR.getBoundValue(FacesContext.getCurrentInstance());
			
			ITaskLauncherTreeNode nodeOfAction = null;
			if (treeSelector.getSelectedTaskLauncherTreeNode() != null)
			{
				nodeOfAction = treeSelector.getSelectedTaskLauncherTreeNode();
			}
			else if (treeSelector.getCurrentTreeFactory().getNodeWithActiveCimomsNodes() != null)
			{
				nodeOfAction = treeSelector.getCurrentTreeFactory().getNodeWithActiveCimomsNodes();
			}
			else if (treeSelector.getCurrentTreeFactory().getNodeWithRootNodes() != null)
			{
				nodeOfAction = treeSelector.getCurrentTreeFactory().getNodeWithRootNodes();
			}			
			
			if (nodeOfAction != null)
			{
				TaskLauncherTreeNodeEvent event1 = new TaskLauncherTreeNodeEvent(this, nodeOfAction ,FacesContext.getCurrentInstance(),TaskLauncherTreeNodeEvent.TYPE_CLICKED);
				try {
					outcome = data.getListener().processEvent(event1);
				} catch (WbemSmtException e) {
					ExceptionUtil.handleException(e);
					outcome = "";
				}
			}
			else
			{
				JsfUtil.addMessage(Message.create(ErrCodes.MSG_CANNOT_EXECUTE_ACTION, Message.ERROR, ResourceBundleManager.getResourceBundle(new String[]{"messages"}, FacesContext.getCurrentInstance().getExternalContext().getRequestLocale()), "cannot.execute.action", new Object[]{getItemLinkText()}));
			}
			 
			
		}
		else
		{
			logger.warning("Link with label " + getItemLabelText() + " was not executed. No Link data found");
			outcome = "";
		}
	}
	
	public String getItemLinkText()
	{
		LinkData data = (LinkData) getFieldData();
		
		if (data == null || data.getLinkText() == null)
		{
			return getItemLabelText();
		}
		else
		{
			return data.getLinkText();
		}
		
	}
	
	public String itemAction()
	{
		return outcome;
	}
	
	public void setFieldData(FieldData fieldData) {
		super.setFieldData(fieldData);
	}
	
	public void installProperties(LabeledJSFInputComponent comp, String prefix) {
		super.installProperties(comp, prefix);
		setComponentBindings1((LabeledJSFLinkComponent) comp,prefix);
	}

	private static void setComponentBindings1(LabeledJSFLinkComponent component, String id) {
		HtmlCommandLink link = ((HtmlCommandLink)component.getComponent());
		link.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"LinkText}"));
		link.setOnclick(JsfUtil.STOP_ALL_AJAX_REQUESTS_TRUE);
		link.setStyleClass("treeLink notselected");
		
		link.setAction(FacesContext.getCurrentInstance().getApplication().createMethodBinding("#{" + id +"Action}",null));
		link.setActionListener(FacesContext.getCurrentInstance().getApplication().createMethodBinding("#{" + id +"ActionListener}",new Class[]{ActionEvent.class}));
	}	
}
