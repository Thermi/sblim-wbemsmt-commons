/**
 *  TaskLauncherTreeNodeEventListenerImpl.java
 *
 * Â© Copyright IBM Corp.  2009,2005
 *
 * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
 *
 * You can obtain a current copy of the Eclipse Public License from
 * http://www.opensource.org/licenses/eclipse-1.0.php
 *
 * Author:     Marius Kreis
 *
 * Contributors:
 *
 */

package org.sblim.wbemsmt.bl.tree;

import java.util.Properties;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherContextMenu;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.ContextmenuDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.ContextmenuDocument.Contextmenu;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.EventListenerDocument.EventListener;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.MenuitemDocument.Menuitem;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;
import org.sblim.wbemsmt.webapp.jsf.JsfTreeNode;


public abstract class TaskLauncherTreeNodeEventListenerImpl implements TaskLauncherTreeNodeEventListener
{
    protected Properties parameters;

    protected Logger logger = Logger.getLogger(TaskLauncherTreeNodeEventListenerImpl.class.getName());
    
    public TaskLauncherTreeNodeEventListenerImpl()
    {
        this.parameters = new Properties();
    }

    public String processEvent(TaskLauncherTreeNodeEvent event) throws WbemsmtException
    {
    	return "";
    }

    public void setParameters(Properties parameters)
    {
        this.parameters = parameters;
    }
    
    public Properties getParameters()
    {
        return this.parameters;
    }
    
    public boolean processesEvent(int eventType)
    {
    	return true;
    }
    
    public void checkParameter(String parameterName)
    {
    	if (!parameters.containsKey(parameterName))
    	{
    		throw new RuntimeException("Parameter " + parameterName + " was not defined for class " + getClass().getName());
    	}
    }
    
	protected WbemSmtResourceBundle getBundle()
	{
		if (RuntimeUtil.getInstance().isJSF())
		{
			return ResourceBundleManager.getResourceBundle(FacesContext.getCurrentInstance());
		}
		throw new RuntimeException("Init Bundle for swing first");
	}

	public void addNode(ITaskLauncherTreeNode parent, ITaskLauncherTreeNode child, boolean leaf) {
		if (RuntimeUtil.getInstance().isJSF())
		{
			new JsfTreeNode(JsfTreeNode.FACET_TREENODE, child.getName(), false, child);
		}
		else
		{
			throw new IllegalArgumentException("Runtime " + RuntimeUtil.getInstance().getRuntime() +  " is not supported");
		}
		parent.addSubnode(child);
	}


	public SimpleTextTreeNode getTextNode(String nodeName) {
		SimpleTextTreeNode node = new SimpleTextTreeNode(nodeName);				
		return node;
	}

	public CIMInstanceNode getInstanceNode(WBEMClient cimClient, String nodeName, AbstractWbemsmtFco fco) {

		CIMInstanceNode ciNode = new CIMInstanceNode(cimClient, null, nodeName, fco.getCimInstance());	
		ciNode.setCimObject(fco);
		
		return ciNode;
	}

	public Contextmenu getContextMenu(CIMInstanceNode ciNode, String[] resourceBundleNames) {
		Contextmenu contextmenu = ContextmenuDocument.Factory.newInstance().addNewContextmenu();
		ciNode.setContextMenu( new TaskLauncherContextMenu(contextmenu, resourceBundleNames) );
		return contextmenu;
	}

	public Menuitem getContextMenuItem(Contextmenu contextmenu, String menuItemName, String listenerClassName) {
		Menuitem menuitem = contextmenu.addNewMenuitem();
		menuitem.setDescription(menuItemName);
		EventListener listener = menuitem.addNewEventListener();
		listener.setClassname(listenerClassName);
		return menuitem;
	}
    
}
