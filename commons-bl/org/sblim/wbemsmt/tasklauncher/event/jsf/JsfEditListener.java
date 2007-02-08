 /** 
  * JsfEditListener.java
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
  * Description: Edit Listener for a JSF edit action
  * 
  */
package org.sblim.wbemsmt.tasklauncher.event.jsf;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.MessageList;
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
	protected List editBeans = new ArrayList();
	
    protected static final Logger logger = Logger.getLogger(JsfEditListener.class.getPackage().getName());

	protected WbemSmtResourceBundle bundle = null;
	

    /**
	 * revert the action of 
	 * 
	 * @param doUpdateControls do update controls for all editPanels after reverting
	 **/
	public String revert(boolean doUpdateControls)
	{
		boolean foundErrors = false;

		//stop if the first editBean reports errors
		for (int i=0; i < editBeans.size() && !foundErrors; i++)
		{
			try
			{
    			EditBean bean = (EditBean)editBeans.get(i);
    			bean.revert();
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
	 * revert the action of 
	 **/
	public String revert()
	{
		return revert(true);
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
