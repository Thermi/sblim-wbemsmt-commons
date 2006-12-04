/** 
 * ITaskLauncherUiTreeNode.java
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
 * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
 *
 * Contributors: 
 * 
 * Description: Interface for TreeNodes in the TaskLauncher
 * 
 */
package org.sblim.wbemsmt.tasklauncher;

import java.util.ArrayList;
import java.util.List;

import org.sblim.wbemsmt.tasklauncher.TaskLauncherContextMenu;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherTreeNode;

public interface ITaskLauncherUiTreeNode {

	public abstract TaskLauncherTreeNode getTaskLauncherTreeNode();

	public abstract void setTaskLauncherTreeNode(TaskLauncherTreeNode taskLauncherTreeNode);

	public abstract ITaskLauncherUiTreeNode getParent();

	public abstract void setParent(ITaskLauncherUiTreeNode parent);

	public abstract boolean getHasEventListener();

	public abstract void setHasEventListener(boolean flag);

	public abstract boolean getHasCustomEventListener();

	public abstract void setHasCustomEventListener(
			boolean customEventListenerFlag);

	public abstract int getChildCount();

	public abstract List getChildren();

	public abstract void setChildren(ArrayList children);

	public abstract TaskLauncherContextMenu getContextMenu();

	public abstract String getContextMenuId();

	public abstract boolean getHasContextMenu();

}