/**
 *  TreeSelector.java
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
 * @author: Marius Kreis <mail@nulldevice.org>
 *
 * Contributors: Michael.Bauschert@de.ibm.com
 *
 */

package org.sblim.wbemsmt.bl.tree;

import java.util.HashMap;
import java.util.Vector;

import org.sblim.wbemsmt.exception.ExceptionUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherController;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherConfig.CimomData;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

public abstract class TreeSelector
{
    protected HashMap<String, TaskLauncherTreeFactory> factories;
    protected String currentTreeName;
    protected TaskLauncherController taskLauncherController;
    protected ITaskLauncherTreeNode selectedTasklauncherTreeNode; 
    
    
    public TreeSelector()
    {
        this.factories = new HashMap<String, TaskLauncherTreeFactory>();
    }
    
    public void setFactories(HashMap<String, TaskLauncherTreeFactory> factories)
    {
        this.factories = factories;
    }
    
    public TaskLauncherTreeFactory getCurrentTreeFactory()
    {
        if(this.currentTreeName != null)
        {
            return (TaskLauncherTreeFactory) factories.get(currentTreeName);
        }
        return null;
    }
    
    public void setTaskLauncherController(TaskLauncherController taskLauncherController) throws WbemsmtException
    {
        try {
            this.taskLauncherController = taskLauncherController;
            this.factories = taskLauncherController.getTreeFactories();
        }
        catch (Exception e) {
            ExceptionUtil.handleException(e);
        }
        
    }
    
    public void setCurrentTreeBacker(String name)
    {
        if(this.factories.get(name) != null)
        {
            this.currentTreeName = name;
        }
        else
        {
        	throw new RuntimeException("Cannot set TreeBacker with name " + name);
        }
    }
    
	public void reloadConfig(String runtimeMode) throws WbemsmtException {
		taskLauncherController.getTaskLauncherConfig().reload(runtimeMode);
		Vector<CimomData> cimomData = taskLauncherController.getTaskLauncherConfig().getCimomData();
		if (RuntimeUtil.MODE_SINGLE.equals(runtimeMode))
		{
			getCurrentTreeFactory().updateSingleHost((CimomData[]) cimomData.toArray(new CimomData[cimomData.size()]));
		}
		else if (RuntimeUtil.MODE_MULTI.equals(runtimeMode))
		{
			getCurrentTreeFactory().updateMultiHost((CimomData[]) cimomData.toArray(new CimomData[cimomData.size()]));	
		}
		
	}

	/**
	 * Implementors should care about the synchronisation of the tree
	 * @param node
	 */
	public abstract void setSelectedTaskLauncherTreeNode(ITaskLauncherTreeNode node);
	
	public ITaskLauncherTreeNode getSelectedTaskLauncherTreeNode() {
		return selectedTasklauncherTreeNode;
	}
	
}
