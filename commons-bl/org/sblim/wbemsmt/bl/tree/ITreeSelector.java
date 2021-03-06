 /** 
  * ITreeSelector.java
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
  * Description: Interface for TreeSelector
  * 
  */

package org.sblim.wbemsmt.bl.tree;

import org.sblim.wbemsmt.tasklauncher.ITaskLauncherUiTreeNode;

/**
 * Interface for TreeSelector
 */
public interface ITreeSelector {

    /**
     * get the current outcome for further navigation
     * @return the current outcome for further navigation
     */
	public abstract String getCurrentOutcome();

	
	public abstract void setCurrentOutcome(String currentOutcome);

	public void setSelectedTaskLauncherTreeNode(ITaskLauncherTreeNode node);
	
	public ITaskLauncherTreeNode getSelectedTaskLauncherTreeNode();

	public abstract void expandAll();

	public abstract ITaskLauncherUiTreeNode getSelectedNode();

	public abstract void setSelectedNode(ITaskLauncherUiTreeNode node);
	
	public TaskLauncherTreeFactory getCurrentTreeFactory();

	public ITreeBacker getCurrentTreeBacker();

}