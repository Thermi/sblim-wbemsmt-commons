 /** 
  * CurrentTreeNodeRetriever.java
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
  * Description: does no selection
  * 
  */
package org.sblim.wbemsmt.bl.tree;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.TaskLauncherTreeNodeSelector;
import org.sblim.wbemsmt.exception.ObjectNotFoundException;

public class DummyTaskLauncherTreeNodeSelector implements TaskLauncherTreeNodeSelector {

	public void select(ITaskLauncherTreeNode treeNode, AbstractBaseCimAdapter adapter, String editPanelId) throws ObjectNotFoundException {
		//do nothing
	}

}
