/** 
 * ITaskLauncherUiTreeNode.java
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
 * Description: Interface for TreeNodes in the TaskLauncher
 * 
 */
package org.sblim.wbemsmt.tasklauncher;

import java.util.ArrayList;
import java.util.List;

import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEventListener;
import org.sblim.wbemsmt.webapp.jsf.JsfTreeNode;

public interface ITaskLauncherUiTreeNode extends TaskLauncherTreeNodeEventListener {

	public abstract ITaskLauncherTreeNode getTaskLauncherTreeNode();

	public abstract void setTaskLauncherTreeNode(ITaskLauncherTreeNode taskLauncherTreeNode);

	public abstract ITaskLauncherUiTreeNode getParent();

	public abstract void setParent(ITaskLauncherUiTreeNode parent);

	public abstract boolean getHasEventListener();

	public abstract void setHasEventListener(boolean flag);

	public abstract boolean getHasCustomEventListener();

	public abstract void setHasCustomEventListener(
			boolean customEventListenerFlag);

	public abstract int getChildCount();

	public abstract List<JsfTreeNode> getChildren();

	public abstract void setChildren(ArrayList<JsfTreeNode> children);

	public abstract TaskLauncherContextMenu getContextMenu();

	public abstract String getContextMenuId();

	public abstract boolean getHasContextMenu();
	
	public String getId();

}