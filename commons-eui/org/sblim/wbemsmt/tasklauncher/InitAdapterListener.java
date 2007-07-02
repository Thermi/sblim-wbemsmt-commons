/** 
  * InitAdapterListener.java
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
  * Contributors: 
  * 
  * Description: 
  * 
  * Initialization of the Adapter-Class
  */

package org.sblim.wbemsmt.tasklauncher;

import java.util.logging.Logger;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimAdapterFactory;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEvent;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEventListener;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEventListenerImpl;
import org.sblim.wbemsmt.exception.ModelLoadException;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.jsf.JsfUtil;
import org.sblim.wbemsmt.tools.resources.ILocaleManager;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;
import org.sblim.wbemsmt.webapp.jsf.ObjectActionControllerBean;

public class InitAdapterListener extends TaskLauncherTreeNodeEventListenerImpl {

    private static final String TASK_NAME = "taskName";
	private static final String ADAPTER_CLASS_NAME = "adapterClassName";
	private static final Logger logger = Logger.getLogger(InitAdapterListener.class.getName());

	
	
    public InitAdapterListener() {
		super();
	}

	public String processEvent(TaskLauncherTreeNodeEvent event) {

    	
    	checkParameter(TASK_NAME);
    	checkParameter(ADAPTER_CLASS_NAME);
    	
		if ((event.getType() & TaskLauncherTreeNodeEvent.TYPE_REFRESHED) > 0)
		{
			String adapterClass = getParameters().getProperty(InitAdapterListener.ADAPTER_CLASS_NAME);
			String taskname = getParameters().getProperty(InitAdapterListener.TASK_NAME);
			logger.info("Init Adapter " + adapterClass);
			
			try {
				if (RuntimeUtil.getInstance().isJSF())
				{
					FacesContext context = (FacesContext) event.getContext();
					ILocaleManager localeManager = (ILocaleManager) BeanNameConstants.LOCALE_MANAGER.asValueBinding(context).getValue(context);

					ITaskLauncherTreeNode node = (ITaskLauncherTreeNode) event.getSource();
					final AbstractBaseCimAdapter adapter = CimAdapterFactory.getInstance().getAdapter(Class.forName(adapterClass),context,node.getCimClient());
					
					adapter.setCimClient(node.getCimClient());
					adapter.setCustomTreeConfig(node.getCustomTreeConfig());
					adapter.reLoad(node);
					adapter.setLocaleManager(localeManager);

					if (!adapter.isLoaded())
					{
						CimAdapterFactory.getInstance().removeAdapter(adapter);
						logger.warning("The adapter " + adapter.getClass().getName() + " for client " + node.getCimClient().getNameSpace().toString() + " was marked as not loaded and is removed from CimAdapterFactory");
					}
					else
					{
						CimAdapterFactory.getInstance().setAdapter(taskname,context,node.getCimClient(),adapter);
						ObjectActionControllerBean objectActionController = (ObjectActionControllerBean) BeanNameConstants.OBJECT_ACTION_CONTROLLER.asValueBinding(context).getValue(context);
						objectActionController.addAdapter(getParameters().getProperty(InitAdapterListener.TASK_NAME), adapter);
					}
				}
				else if (RuntimeUtil.getInstance().isSwing())
				{
				}
				logger.info("Adapter initialized");
			} catch (Exception e) {
				ModelLoadException modelLoadException = new ModelLoadException(e);
				modelLoadException.setCimIdentifier(adapterClass);
				if (RuntimeUtil.getInstance().isJSF())
				{
					JsfUtil.handleException(modelLoadException);
				}
				else if (RuntimeUtil.getInstance().isSwing())
				{
				}
			} 
		
			return null;
		}
		
		return null;
	}

	public boolean isCustomListener() {
		return false;
	}

	public Priority getPriority() {
		return TaskLauncherTreeNodeEventListener.PRIO_LOW;
	}
	
	
}