 /** 
  * JsfEditListener.java
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
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Edit Listener for a JSF edit action
  * 
  */
package org.sblim.wbemsmt.tasklauncher.event.jsf;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;
import org.sblim.wbemsmt.bl.messages.MessageList;
import org.sblim.wbemsmt.tasklauncher.event.EditListener;
import org.sblim.wbemsmt.tasklauncher.event.TaskLauncherContextMenuEventListenerImpl;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.jsf.EditBean;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.webapp.jsf.ObjectActionControllerBean;

/**
 * @author Bauschert
 *
 */
public class JsfEditListener extends TaskLauncherContextMenuEventListenerImpl implements EditListener {
	protected List<EditBean> editBeans = new ArrayList<EditBean>();
	
    protected static final Logger logger = Logger.getLogger(JsfEditListener.class.getPackage().getName());

	protected WbemSmtResourceBundle bundle = null;
	

    /**
	 * revert the action of 
	 * 
	 * @param doUpdateControls do update controls for all editPanels after reverting
	 * @param silent if true no messages are addded
	 **/
	public String revert(boolean doUpdateControls)
	{
		revert(doUpdateControls,true);
		return EditBean.PAGE_EDIT;
	}

	/**
	 * revert the action of 
	 * 
	 * @param doUpdateControls do update controls for all editPanels after reverting
	 * @param silent if true no messages are addded
	 **/
	public String revert(boolean doUpdateControls, boolean silent)
	{
		boolean foundErrors = false;
		
		//stop if the first editBean reports errors
		for (int i=0; i < editBeans.size() && !foundErrors; i++)
		{
			try
			{
    			EditBean bean = (EditBean)editBeans.get(i);
    			bean.revert(doUpdateControls,silent);
    			foundErrors = DataContainerUtil.getContainerMessages(bean.getContainers()).hasErrors();
			}
			catch (Exception e)
			{
				logger.log(Level.SEVERE,"Cannot Revert",e);
				org.sblim.wbemsmt.tools.jsf.JsfUtil.handleException(e);
				return EditBean.PAGE_EDIT;
			}
			
		}

		if (!foundErrors)
		{
			ObjectActionControllerBean oac = (ObjectActionControllerBean) BeanNameConstants.OBJECT_ACTION_CONTROLLER.getBoundValue(FacesContext.getCurrentInstance());
			oac.clearEditBeansModified();
		}
		return EditBean.PAGE_EDIT;
	}
    /**
	 * revert the action
	 * calles directly from the jsf context 
	 **/
	public String revert()
	{
		return revert(true,false);
	}

	public String save()
	{
		boolean foundErrors = false;

		MessageList messages = new MessageList();
		
		//stop if the first editBean reports errors
		for (int i=0; i < editBeans.size() && !foundErrors; i++)
		{
			try
			{
    			EditBean bean = (EditBean)editBeans.get(i);
    			bean.save();
				messages.addAll(bean.getSaveResult());
    			foundErrors = messages.hasErrors();
			}
			catch (Exception e)
			{
				logger.log(Level.SEVERE,"Cannot save",e);
				org.sblim.wbemsmt.tools.jsf.JsfUtil.handleException(e);
				return EditBean.PAGE_EDIT;
			}
		}

		if (!foundErrors)
		{
			ObjectActionControllerBean oac = (ObjectActionControllerBean) BeanNameConstants.OBJECT_ACTION_CONTROLLER.getBoundValue(FacesContext.getCurrentInstance());
			oac.clearEditBeansModified();
		}
		
		EditBean.handleSaveResult(bundle,messages);
		EditBean.reloadAdapters(editBeans);
						
		return EditBean.PAGE_EDIT;
		
	}	
}
