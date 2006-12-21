 /** 
  * TabbedPaneChangeListener.java
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
		ObjectActionControllerBean oac = (ObjectActionControllerBean)BeanNameConstants.OBJECT_ACTION_CONTROLLER.asValueBinding(fc).getValue(fc);
        oac.setSelectedTabIndex(arg0.getNewTabIndex());
	}

}
