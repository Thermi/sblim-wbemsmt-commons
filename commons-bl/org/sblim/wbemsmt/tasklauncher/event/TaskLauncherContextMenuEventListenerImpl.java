/**
 *  TaskLauncherContextMenuEventListenerImpl.java
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
 * Author:     Marius Kreis
 *
 * Contributors:
 *
 */

package org.sblim.wbemsmt.tasklauncher.event;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEventListenerImpl;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

public abstract class TaskLauncherContextMenuEventListenerImpl extends TaskLauncherTreeNodeEventListenerImpl implements TaskLauncherContextMenuEventListener
{
	public boolean isCustomListener() {
		return true;
	}
	
	protected WbemSmtResourceBundle getBundle()
	{
		if (RuntimeUtil.getInstance().isJSF())
		{
			return ResourceBundleManager.getResourceBundle(FacesContext.getCurrentInstance());
		}
		throw new RuntimeException("Init Bundle for swing first");
	}
	
}
