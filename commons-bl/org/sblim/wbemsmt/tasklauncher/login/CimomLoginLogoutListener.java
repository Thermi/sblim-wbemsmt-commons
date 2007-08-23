 /** 
  * CimomLoginLogoutListener.java
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
  * Description: Listener handling Login/Logout
  * 
  */
package org.sblim.wbemsmt.tasklauncher.login;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEvent;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.tasklauncher.CimomTreeNode;
import org.sblim.wbemsmt.tasklauncher.TreeSelector;
import org.sblim.wbemsmt.tasklauncher.event.TaskLauncherContextMenuEventListenerImpl;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.jsf.WbemsmtCookieUtil;
import org.sblim.wbemsmt.tools.jsf.WbemsmtCookieUtil.MultiHostLoginData;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;
import org.sblim.wbemsmt.webapp.jsf.ObjectActionControllerBean;

public class CimomLoginLogoutListener extends TaskLauncherContextMenuEventListenerImpl {

	public CimomLoginLogoutListener() {
		super();
	}

	public String processEvent(TaskLauncherTreeNodeEvent event) {
		
		if (event.type == TaskLauncherTreeNodeEvent.TYPE_CLICKED)
		{

			if (RuntimeUtil.getInstance().isJSF())
			{
				FacesContext fc = FacesContext.getCurrentInstance();
				
				TreeSelector controller = (TreeSelector) BeanNameConstants.TREE_SELECTOR.getBoundValue(FacesContext.getCurrentInstance());

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
					ITaskLauncherTreeNode nodeWithInactiveCimomsNodes = controller.getCurrentTreeFactory().getNodeWithInactiveCimomsNodes();

					ObjectActionControllerBean oac = (ObjectActionControllerBean) BeanNameConstants.OBJECT_ACTION_CONTROLLER.getBoundValue(FacesContext.getCurrentInstance());
					List nodes = new ArrayList();
					try {
						if (nodeWithInactiveCimomsNodes != null)
						{
							Iterator it = nodeWithInactiveCimomsNodes.getSubnodes().iterator();
							while (it.hasNext())
							{
								CimomTreeNode node = (CimomTreeNode)it.next();
								MultiHostLoginData loginData = WbemsmtCookieUtil.getMultiHostLoginDataFromCookie(node.getCimomData().getUser(), node.getCimomData().getHostname());
								node.setPassword(loginData != null ? loginData.getPassword(): "");
								node.setRemindPassword(loginData != null);
								node.setEmptyPassword(loginData != null ? loginData.isUseEmptyPassword(): false);
								node.setUseSlp(loginData != null ? loginData.isUseSlp(): false);

								//If the user runs in multiHost mode we don't render the slp checkbox
								node.setSlpRendered(!login.isUseSlp());
								node.setUseSlp(login.isUseSlp());
								
							}
							nodes.addAll(nodeWithInactiveCimomsNodes.getSubnodes());
						}
					} catch (WbemSmtException e) {
						logger.log(Level.SEVERE,"Cannot get Inactive CimomTreeNodes",e);
					}
					oac.setCimomTreeNodesForLogin(nodes);
					result = "cimomLogin";
				}
				return result;
			}
			else
			{
				throw new IllegalArgumentException("Runtime mode " + RuntimeUtil.getInstance().getRuntime() + " is not supported" );
			}
			
		}
		return null;
	}

	public boolean isCustomListener() {
		return true;
	}
	
	

	
}
