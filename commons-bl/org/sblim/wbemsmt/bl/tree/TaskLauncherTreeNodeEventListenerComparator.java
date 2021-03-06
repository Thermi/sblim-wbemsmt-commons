 /** 
  * TaskLauncherTreeNodeEventListenerComparator.java
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
  * Description: Compares the listeners
  * 
  * Returns the correct order so that the user defined listeners are invoked first and after them the listener representing
  * a ui node.
  * 
  * The userdefinded listeners can have a priority value. Listeners with higher priority values are executed first 
  * 
  */
package org.sblim.wbemsmt.bl.tree;

import java.util.Comparator;

import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEventListener;

/**
 * @author Bauschert
 *
 */
public class TaskLauncherTreeNodeEventListenerComparator implements Comparator<TaskLauncherTreeNodeEventListener> {

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(TaskLauncherTreeNodeEventListener o1, TaskLauncherTreeNodeEventListener o2) {
		
		if (o1 instanceof TaskLauncherTreeNodeEventListener && o2 instanceof TaskLauncherTreeNodeEventListener)
		{
			return  ((TaskLauncherTreeNodeEventListener)o2).getPriority().value
			      - ((TaskLauncherTreeNodeEventListener)o1).getPriority().value;
		}
		throw new IllegalArgumentException("Can only compare TaskLauncherTreeNodeEventListener objects . Found " + o1.getClass().getName() + " and " + o2.getClass().getName());
	}

}
