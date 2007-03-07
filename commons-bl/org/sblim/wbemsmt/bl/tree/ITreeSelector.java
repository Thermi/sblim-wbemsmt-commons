 /** 
  * ITreeSelector.java
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
  * Description: Interface for TreeSelector
  * 
  */

package org.sblim.wbemsmt.bl.tree;

import org.sblim.wbemsmt.tasklauncher.ITaskLauncherUiTreeNode;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherTreeFactory;





public interface ITreeSelector {

	public abstract String getCurrentOutcome();

	public abstract void setCurrentOutcome(String currentOutcome);

	public void setSelectedTaskLauncherTreeNode(ITaskLauncherTreeNode node);
	
	public ITaskLauncherTreeNode getSelectedTaskLauncherTreeNode();

	public abstract void expandAll();

	public abstract ITaskLauncherUiTreeNode getSelectedNode();

	public abstract void setSelectedNode(ITaskLauncherUiTreeNode node);
	
	public TaskLauncherTreeFactory getCurrentTreeFactory();

}