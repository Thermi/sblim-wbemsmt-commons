 /** 
  * CurrentTreeNodeRetriever.java
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
  * Description: Uses the currentTreeNode to select the right element on the adapter
  * 
  */
package org.sblim.wbemsmt.bl.tree;

import java.util.logging.Logger;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.bl.adapter.TaskLauncherTreeNodeSelector;
import org.sblim.wbemsmt.bl.adapter.TaskLauncherTreeNodeSelectorForCreate;
import org.sblim.wbemsmt.exception.WbemsmtException;

public class CurrentTaskLauncherTreeNodeSelector implements TaskLauncherTreeNodeSelector, TaskLauncherTreeNodeSelectorForCreate {

	private AbstractBaseCimAdapter adapter;

	/**
	 * Uses the currentTreeNode to select the right element on the adapter
	 * @see AbstractBaseCimAdapter#select(ITaskLauncherTreeNode)
	 * @see AbstractBaseCimAdapter#getKeyByTreeNode(ITaskLauncherTreeNode)
	 * @see AbstractBaseCimAdapter#select(CimObjectKey)
	 */
	public void select(ITaskLauncherTreeNode treeNode, AbstractBaseCimAdapter adapter, String editPanelId) throws WbemsmtException {
		this.adapter = adapter;
		CimObjectKey key = adapter.select(treeNode);
		if (key == null)
		{
			Logger logger = Logger.getLogger(CurrentTaskLauncherTreeNodeSelector.class.getName());
			logger.severe("Cannot select with adapter " + adapter + " and treeNode " + treeNode);
			throw new WbemsmtException(WbemsmtException.ERR_OBJECT_NOT_FOUND,"Cannot select with adapter " + adapter + " and treeNode " + treeNode.getName());
		}
	}

	public boolean execute() {
		return true;
	}

	public AbstractBaseCimAdapter getAdapter() {
		return adapter;
	}

}
