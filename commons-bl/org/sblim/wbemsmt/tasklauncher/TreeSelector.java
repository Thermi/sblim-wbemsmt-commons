/**
 *  TreeSelector.java
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
 * Contributors: Michael.Bauschert@de.ibm.com
 *
 */

package org.sblim.wbemsmt.tasklauncher;

import java.util.HashMap;
import java.util.Vector;

import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.exception.ExceptionUtil;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherConfig.CimomData;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

public abstract class TreeSelector
{
    protected HashMap factories;
    protected String currentTreeName;
    protected TaskLauncherController taskLauncherController;
    protected ITaskLauncherTreeNode selectedTasklauncherTreeNode; 
    
    
    public TreeSelector()
    {
        this.factories = new HashMap();
    }
    
    public void setFactories(HashMap factories)
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
		Vector cimomData = taskLauncherController.getTaskLauncherConfig().getCimomData();
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
