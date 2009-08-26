 /** 
  * TaskLauncherTreeNodeSelectorForCreate.java
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
  * Description: The selector class for create actions
  */
package org.sblim.wbemsmt.bl.tree;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;

/**
 * Description: The selector class for create actions<br>
 * <br>
 * These actiions can be invoked within a common context menue and it's possible that the current selection includes<br> 
 * more than on adapter.<br>
 * <br>
 * The selector implementation should examine the nodes, decide which adapter to use and give that adapter back.<br>
 * <br>
 * If selecting the correct adapter is not possible the implementation should cerate a message and return false for the execute-Method<br>
 */
public interface TaskLauncherTreeNodeSelectorForCreate extends
		TaskLauncherTreeNodeSelector {

    /**
     * get the adapter<br>
     * if {@link #execute()} is true {@link #getAdapter()} must be != null
     * @return the adapter
     */
	public AbstractBaseCimAdapter getAdapter();
	
	/**
	 * indicates if the create action (calling a wizard) should be executed<br>
	 * if {@link #execute()} is true {@link #getAdapter()} must be != null
	 * @return true if the wizard can be started
	 */
	public boolean execute();
	
}
