 /** 
  * JsfDeleteListener.java
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
  * Description: Edit Listener for a JSF delete action
  * 
  */
package org.sblim.wbemsmt.tasklauncher.event.jsf;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.tasklauncher.event.TaskLauncherContextMenuEventListenerImpl;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.webapp.jsf.ObjectActionControllerBean;

/**
 * @author Bauschert
 *
 */
public class JsfDeleteListener extends TaskLauncherContextMenuEventListenerImpl  {
    protected void clearEditBeans()
    {
    	ObjectActionControllerBean oac = (ObjectActionControllerBean) BeanNameConstants.OBJECT_ACTION_CONTROLLER.getBoundValue(FacesContext.getCurrentInstance());
    	oac.clearEditBeans();
    }

}
