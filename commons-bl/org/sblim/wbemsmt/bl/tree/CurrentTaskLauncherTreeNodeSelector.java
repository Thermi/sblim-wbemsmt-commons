 /** 
  * CurrentTaskLauncherTreeNodeSelector.java
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
  * Description: Uses the currentTreeNode to select the right element on the adapter
  * 
  */
package org.sblim.wbemsmt.bl.tree;

import java.util.logging.Logger;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.exception.WbemsmtException;

/**
 * Uses the currentTreeNode to select the right element on the adapter
 */
public class CurrentTaskLauncherTreeNodeSelector implements TaskLauncherTreeNodeSelector, TaskLauncherTreeNodeSelectorForCreate {

	private AbstractBaseCimAdapter adapter;

	/**
	 * Uses the currentTreeNode to select the right element on the adapter<br>
	 * First calls {@link AbstractBaseCimAdapter#select(ITaskLauncherTreeNode)}<br>
	 * if this method returns null an exception is thrwown with {@link WbemsmtException#ERR_OBJECT_NOT_FOUND}
	 * @param treeNode the Tree node select (current treeNode)
	 * @param adapter the adapter which is responsible for this task
	 * @param editPanelId the id of the current edit panel
	 * @see AbstractBaseCimAdapter#select(ITaskLauncherTreeNode)
	 * @see AbstractBaseCimAdapter#getKeyByTreeNode(ITaskLauncherTreeNode)
	 * @see AbstractBaseCimAdapter#select(CimObjectKey)
	 * @throws WbemsmtException if the {@link AbstractBaseCimAdapter#select(ITaskLauncherTreeNode)} returned null
	 */
	public void select(ITaskLauncherTreeNode treeNode, AbstractBaseCimAdapter adapter, String editPanelId) throws WbemsmtException {
		CimObjectKey key = adapter.select(treeNode);
		if (key == null)
		{
			Logger logger = Logger.getLogger(CurrentTaskLauncherTreeNodeSelector.class.getName());
			logger.severe("Cannot select with adapter " + adapter + " and treeNode " + treeNode);
			throw new WbemsmtException(WbemsmtException.ERR_OBJECT_NOT_FOUND,"Cannot select with adapter " + adapter + " and treeNode " + treeNode.getName());
		}
		this.adapter = adapter;
	}

	/**
	 * @return true if the select was scucessful
	 */
	public boolean execute() {
		return adapter != null;
	}

	/**
	 * @return the adaper for further processing
	 */
	public AbstractBaseCimAdapter getAdapter() {
		return adapter;
	}

}
