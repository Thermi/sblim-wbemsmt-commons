 /** 
  * TaskLauncherUiTreeNode.java
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
  * Description: Base class for UI Tree nodes
  * 
  */
package org.sblim.wbemsmt.tasklauncher;

import org.apache.myfaces.custom.tree2.TreeNode;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEventListener;
import org.sblim.wbemsmt.tools.resources.LocaleChangeListener;

/**
 * @author Bauschert
 *
 */
public abstract class TaskLauncherUiTreeNode implements TreeNode, Cloneable, LocaleChangeListener, ITaskLauncherUiTreeNode{

	public Priority getPriority() {
		return TaskLauncherTreeNodeEventListener.PRIO_LOWEST;
	}

	
	
}
