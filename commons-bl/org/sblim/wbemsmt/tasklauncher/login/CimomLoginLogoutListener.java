 /** 
  * CimomLoginLogoutListener.java
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
  * Description: Listener handling Login/Logout
  * 
  */
package org.sblim.wbemsmt.tasklauncher.login;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEvent;
import org.sblim.wbemsmt.tasklauncher.CimomTreeNode;
import org.sblim.wbemsmt.tasklauncher.event.TaskLauncherContextMenuEventListenerImpl;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;

public class CimomLoginLogoutListener extends TaskLauncherContextMenuEventListenerImpl {

	public CimomLoginLogoutListener() {
		super();
	}

	public String processEvent(TaskLauncherTreeNodeEvent event) {
		
		if (event.type == TaskLauncherTreeNodeEvent.TYPE_CLICKED)
		{
			
			FacesContext fc = FacesContext.getCurrentInstance();

			CimomTreeNode cimomTreeNode = (CimomTreeNode) event.getTreeNode();
			
			LoginCheck login = (LoginCheck)BeanNameConstants.LOGIN_CHECK.asValueBinding(fc).getValue(fc);
			login.setCimomData(cimomTreeNode.getCimomData());
			String result;
			if (cimomTreeNode.hasCimClient())
			{
				result = "cimomLogout";
			}
			else
			{
				result = "cimomLogin";
			}
			return result;
		}
		return null;
	}

	public boolean isCustomListener() {
		return true;
	}
	
	

	
}
