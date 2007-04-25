 /** 
  * TaskLauncherTreeNodeSelectorForCreate.java
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
  * Description: The selector class for create actions
  * 
  * These actiions can be invoked within a common context menue and it's possible that the current selection includes 
  * more than on adapter.
  * 
  * The selector implementation should examine the nodes, decide which adapter to use and give that adapter back.
  * 
  * If selecting the correct adapter is not possible the implementation should cerate a message and return false for the execute-Method
  * 
  */
package org.sblim.wbemsmt.bl.adapter;

/**
 * @author Bauschert
 *
 */
public interface TaskLauncherTreeNodeSelectorForCreate extends
		TaskLauncherTreeNodeSelector {

	public AbstractBaseCimAdapter getAdapter();
	public boolean execute();
	
}
