/**
 *  TreeSelector.java
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
 * @author: Marius Kreis <mail@nulldevice.org>
 *
 * Contributors:
 *
 */

package org.sblim.wbemsmt.tasklauncher;

import java.util.HashMap;
import java.util.Vector;

import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherConfig.CimomData;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

public class TreeSelector
{
    protected HashMap factories;
    protected String currentTreeName;
    protected TaskLauncherController taskLauncherController;
    private ITaskLauncherTreeNode selectedNode; 
    
    
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
    
    public void setTaskLauncherController(TaskLauncherController taskLauncherController) throws WbemSmtException
    {
        this.taskLauncherController = taskLauncherController;
        this.factories = taskLauncherController.getTreeFactories();
        
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
    
    public void saveCurrentTreeConfig()
    {
        if(currentTreeName != null)
        {
            getCurrentTreeFactory().saveTreeConfig();
        }
    }

	public void reloadConfig(String runtimeMode) throws WbemSmtException {
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

	public void setSelectedTaskLauncherTreeNode(ITaskLauncherTreeNode node) {
		selectedNode = node;
	}
	
	public ITaskLauncherTreeNode getSelectedTaskLauncherTreeNode() {
		return selectedNode;
	}
	
}
