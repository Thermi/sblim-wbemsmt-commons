 /** 
  * TabbedPaneChangeListener.java
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
  * Description: Listener for changing a tab of a edit panel
  * 
  */
package org.sblim.wbemsmt.tools.jsf;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;

import org.apache.myfaces.custom.tabbedpane.TabChangeEvent;
import org.apache.myfaces.custom.tabbedpane.TabChangeListener;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.webapp.jsf.ObjectActionControllerBean;

public class TabbedPaneChangeListener implements TabChangeListener {

	public void processTabChange(TabChangeEvent arg0) throws AbortProcessingException
	{
		FacesContext fc = FacesContext.getCurrentInstance();
		ObjectActionControllerBean oac = (ObjectActionControllerBean)BeanNameConstants.OBJECT_ACTION_CONTROLLER.asValueExpression(fc).getValue(fc.getELContext());
        oac.setSelectedTabIndex(arg0.getNewTabIndex());
        oac.clearEditBeansModified();
	}

}
