/**
 *  TaskLauncherContextMenuItem.java
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
 * @author: Marius Kreis <mail@nulldevice.org>
 *
 * Contributors:
 *
 */

package org.sblim.wbemsmt.tasklauncher;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Locale;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.messages.ErrCodes;
import org.sblim.wbemsmt.bl.messages.Message;
import org.sblim.wbemsmt.bl.messages.MessageUtil;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.ITreeSelector;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEvent;
import org.sblim.wbemsmt.exception.ExceptionUtil;
import org.sblim.wbemsmt.tasklauncher.event.CreateListener;
import org.sblim.wbemsmt.tasklauncher.event.DeleteListener;
import org.sblim.wbemsmt.tasklauncher.event.EditListener;
import org.sblim.wbemsmt.tasklauncher.event.TaskLauncherContextMenuEventListener;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.jsf.JavascriptUtil;
import org.sblim.wbemsmt.tools.jsf.JsfUtil;
import org.sblim.wbemsmt.tools.resources.ILocaleManager;
import org.sblim.wbemsmt.tools.resources.LocaleChangeListener;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.webapp.jsf.ObjectActionControllerBean;

public class TaskLauncherContextMenuItem implements Cloneable, LocaleChangeListener
{
	private static final Logger logger = Logger.getLogger(TaskLauncherContextMenuItem.class.getName());
	
	private String description;
	private TaskLauncherContextMenuEventListener eventListener;
	private Properties parameters;
	private String outcome = ""; // next navigation target as result of eventlistener processing event
	
	private TaskLauncherContextMenu parent;

	private String bundleKey;
	
	
	public TaskLauncherContextMenuItem(String description)
	{
		this.bundleKey = description;
		this.description = null;
	}
	
	public TaskLauncherContextMenuItem(String description, TaskLauncherContextMenuEventListener eventListener, Properties parameters)
	{
		this(description);
		this.eventListener = eventListener;
	}
	
	public TaskLauncherContextMenuItem(String description, String eventListenerClass, Properties parameters)
	{
		this(description);
		this.addEventListener(eventListenerClass);
		this.parameters = parameters;
	}
	
	public String getDescription()
	{
		return this.description;
	}
	
	/**
	 * Set from outside beauce LocaleManager is part of presentationLayer (because we need a session or something else to get the current one)
	 * and this session is normally bound to to the peresentationLayer
	 * @param localeManager
	 */
	public void initI18n(ILocaleManager localeManager)
	{
		localeManager.addLocaleChangeListener(this);
		localeChanged(localeManager.getCurrentLocale());
	}
	
	public TaskLauncherContextMenuEventListener getEventListener()
	{
		return this.eventListener;
	}
	
    private void addEventListener(String eventListenerClass)
    {
    	logger.log(Level.FINE, "Adding Event Listener " + eventListenerClass + " to ContextMenuItem");
        try
        {
            Class listenerClass = Class.forName(eventListenerClass);
            TaskLauncherContextMenuEventListener listener = (TaskLauncherContextMenuEventListener) listenerClass.newInstance();
            if(parameters != null) listener.setParameters(parameters);
            this.eventListener = listener;
        }
        catch(ClassNotFoundException e)
        {
            logger.log(Level.SEVERE, "EventListener of class " + eventListenerClass + " not found.");
        }
        catch(IllegalAccessException e)
        {
            logger.log(Level.SEVERE, "Illegal Access while instantiating EventListener of class " + eventListenerClass);
        }
        catch(InstantiationException e)
        {
            logger.log(Level.SEVERE, "Error while instantiating EventListener of class " + eventListenerClass);
        }
        catch(ClassCastException e)
        {
            logger.log(Level.SEVERE, "Error while casting class " + eventListenerClass + " to an EventListener.");
        }
        catch(Exception e)
        {
        	logger.log(Level.SEVERE, "Error while adding EventListener of class " + eventListenerClass);
            e.printStackTrace();
        }
    }
    
    public void processEvent(javax.faces.event.ActionEvent e)
    {
    	
    	if (logger.isLoggable(Level.FINE))
    	{
    		StringWriter sw = new StringWriter();
    		PrintWriter pw = new PrintWriter(sw);
    		JsfUtil.traceComponentTree(FacesContext.getCurrentInstance().getViewRoot(),pw);
    		pw.flush();
    		pw.close();
    		logger.fine(sw.toString());
    	}
    	
    	try {
			ITreeSelector treeSelectorBean = (ITreeSelector)BeanNameConstants.TREE_SELECTOR.asValueBinding(FacesContext.getCurrentInstance()).getValue(FacesContext.getCurrentInstance());
			ITaskLauncherTreeNode nodeOfAction = getParent().getNode();
			
			 
			if (getParent().isCommon())
			{
				//if it's a common context menue then get the last selected node
				//...if there is one
				if (treeSelectorBean.getSelectedTaskLauncherTreeNode() != null)
				{
					nodeOfAction = treeSelectorBean.getSelectedTaskLauncherTreeNode();
				}
				else if (treeSelectorBean.getCurrentTreeFactory().getNodeWithActiveCimomsNodes() != null)
				{
					nodeOfAction = treeSelectorBean.getCurrentTreeFactory().getNodeWithActiveCimomsNodes();
				}
				else if (treeSelectorBean.getCurrentTreeFactory().getNodeWithRootNodes() != null)
				{
					nodeOfAction = treeSelectorBean.getCurrentTreeFactory().getNodeWithRootNodes();
				}
			} else {
				treeSelectorBean.setSelectedTaskLauncherTreeNode(getParent().getNode());
			}
			
			if (nodeOfAction == null)
			{
				MessageUtil.addMessage(ErrCodes.MSG_NO_NODE_SELECTED, Message.ERROR, parent.getBundles(), "no.node.selected");
				treeSelectorBean.setCurrentOutcome("");
			}
			else
			{
				logger.log(Level.INFO, "ContextMenuItem " + this.bundleKey + " received Action for listener " + this.eventListener + " with node " + nodeOfAction.getName());
				TaskLauncherTreeNodeEvent event = new TaskLauncherTreeNodeEvent(this,nodeOfAction ,FacesContext.getCurrentInstance(),TaskLauncherTreeNodeEvent.TYPE_CLICKED);
				this.outcome = this.eventListener.processEvent(event);
				treeSelectorBean.setCurrentOutcome(outcome);
			}
    	} catch (Exception ex) {
			ExceptionUtil.handleException(ex);
		}
    }

	public String navigate()
    {
    	logger.log(Level.INFO, "returning outcome = " + this.outcome);
    	return outcome;
    }

	public TaskLauncherContextMenu getParent() {
		return parent;
	}

	public void setParent(TaskLauncherContextMenu newParent) {
		this.parent = newParent;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		TaskLauncherContextMenuItem item = (TaskLauncherContextMenuItem) super.clone(); 
		item.setParent(null);
		return item;
	}

	public void localeChanged(Locale newLocale) {
		WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(getParent().getBundles(),newLocale);
		this.description = bundle.getString(bundleKey);
		
	}

	public boolean isShowWait() {
		return eventListener instanceof DeleteListener || eventListener instanceof EditListener;
	}

	public boolean isShowConfirm() {
		return eventListener instanceof DeleteListener;
	}
	
	public boolean isCheckIfInEditAction() {
		return eventListener instanceof CreateListener;
	}

	/**
	 * externalized this statement into this method because the handling via JSF EL is too complex
	 * @return
	 */
	public String getJavaScriptConfirmStatement()
	{
		StringBuffer sb = new StringBuffer();
		
		if (isCheckIfInEditAction())
		{
			ObjectActionControllerBean oac = (ObjectActionControllerBean) BeanNameConstants.OBJECT_ACTION_CONTROLLER.getBoundValue(FacesContext.getCurrentInstance());
			if (oac.isEditBeansModified() || oac.isWizardActive())
			{
				sb.append(JavascriptUtil.getInputFieldValueChangedCall());
			}
			sb.append(JavascriptUtil.getCheckModificationsCall());
		}
		if (isShowConfirm())
		{
			WbemSmtResourceBundle resourceBundle = ResourceBundleManager.getResourceBundle(FacesContext.getCurrentInstance());
			sb.append("if (!showConfirm('" +  resourceBundle.getString("continue")  +"')) return false;");
		}
		
		return sb.toString();
	}
	
	/**
	 * externalized this statement into this method because the handling via JSF EL is too complex
	 * @return
	 */
	public String getJavaScriptWaitStatement()
	{
		if (isShowWait())
		{
			WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(FacesContext.getCurrentInstance());
			bundle.add(ResourceBundleManager.getResourceBundle(new String[]{"message"},bundle.getLocale()));
			String text = bundle.getString("execute.contextmenue.wait.msg",new Object[]{description});
			return JavascriptUtil.getShowWaitCall(text);
		}
		else
		{
			return "";
		}
	}
	
	
}
