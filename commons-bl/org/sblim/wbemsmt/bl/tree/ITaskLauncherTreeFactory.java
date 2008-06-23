 /** 
  * ITaskLauncherTreeFactory.java
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
  * Description: Interface of a TaskLauncherTreeFactory
  * 
  */

package org.sblim.wbemsmt.bl.tree;

import java.util.List;


/**
 * Interface of a TaskLauncherTreeFactory
 */
public interface ITaskLauncherTreeFactory {

	/**
	 * Returns the rootnode of the Tree
	 * @return {@link List} with {@link ITaskLauncherTreeNode} objects
	 */
	public abstract List getRootNodes();

}