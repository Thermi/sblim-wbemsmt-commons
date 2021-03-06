 /** 
  * TaskLauncherTreeNodeSelector.java
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
  * Description: Selects a TreeNode (Used by the UI to keep the Adapter in sync with the user's selections )
  * 
  */
package org.sblim.wbemsmt.bl.tree;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.exception.WbemsmtException;

/**
 * Selects a TreeNode (Used by the UI to keep the Adapter in sync with the user's selections )
 */
public interface TaskLauncherTreeNodeSelector {
	
	/**
	 * Select the correct element by using the current clicked treeNode
	 * @param treeNode the clicked treeNode
	 * @param adapter the adapter to keep in sync
	 * @param editPanelId the id for exception messages
	 * @throws WbemsmtException of the selection failed
	 */
	public void select(ITaskLauncherTreeNode treeNode, AbstractBaseCimAdapter adapter, String editPanelId) throws WbemsmtException;

}
