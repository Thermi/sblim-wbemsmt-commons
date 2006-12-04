 /** 
  * TaskLauncherTreeNodeSelector.java
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
  * Description: Selects a TreeNode (Used by the UI to keep the Adapter in sync with itself )
  * 
  */
package org.sblim.wbemsmt.bl.adapter;

import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.exception.ObjectNotFoundException;

public interface TaskLauncherTreeNodeSelector {
	
	/**
	 * Select the correct element by using the current clicked treeNode
	 * @param treeNode the clicked treeNode
	 * @param adapter the adapter to keep in sync
	 * @param editPanelId the id for exception messages
	 * @throws ObjectNotFoundException
	 */
	public void select(ITaskLauncherTreeNode treeNode, AbstractBaseCimAdapter adapter, String editPanelId) throws ObjectNotFoundException;

}
