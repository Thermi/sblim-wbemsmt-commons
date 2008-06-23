 /** 
  * DummyTaskLauncherTreeNodeSelector.java
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
  * Description: DummySelector which is doing nothing
  * 
  */
package org.sblim.wbemsmt.bl.tree;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.CimObjectKey;
import org.sblim.wbemsmt.exception.WbemsmtException;

/**
 * DummySelector which is doing nothing
 */
public class DummyTaskLauncherTreeNodeSelector implements TaskLauncherTreeNodeSelector {

    /**
     * Do nothing
     * @param treeNode the Tree node select (current treeNode)
     * @param adapter the adapter which is responsible for this task
     * @param editPanelId the id of the current edit panel
     * @see AbstractBaseCimAdapter#select(ITaskLauncherTreeNode)
     * @see AbstractBaseCimAdapter#getKeyByTreeNode(ITaskLauncherTreeNode)
     * @see AbstractBaseCimAdapter#select(CimObjectKey)
     * @throws WbemsmtException (never thrown by this subclass)
     */
    public void select(ITaskLauncherTreeNode treeNode, AbstractBaseCimAdapter adapter, String editPanelId) throws WbemsmtException {
		//do nothing
	}

}
