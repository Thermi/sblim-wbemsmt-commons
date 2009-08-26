/**
 *  TaskLauncherContextMenuEventListenerImpl.java
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
 * Author:     Marius Kreis
 *
 * Contributors:
 *
 */

package org.sblim.wbemsmt.tasklauncher.event;

import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEventListener;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEventListenerImpl;

public abstract class TaskLauncherContextMenuEventListenerImpl extends TaskLauncherTreeNodeEventListenerImpl implements TaskLauncherContextMenuEventListener
{
	public boolean isCustomListener() {
		return true;
	}

	/**
	 * ContextMenueListeners having Low priority
	 */
	public Priority getPriority() {
		return TaskLauncherTreeNodeEventListener.PRIO_LOWEST;
	}
	
	
}
