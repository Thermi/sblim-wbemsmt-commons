 /** 
  * TaskLauncherUiTreeNode.java
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

	/**
	 * 
	 */
	private static final long serialVersionUID = 4140731824921428412L;

	public Priority getPriority() {
		return TaskLauncherTreeNodeEventListener.PRIO_LOWEST;
	}

	
	
}
