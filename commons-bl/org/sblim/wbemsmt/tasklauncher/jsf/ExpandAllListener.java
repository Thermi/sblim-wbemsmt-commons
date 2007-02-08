 /** 
  * ExpandAllListener.java
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
  * Description: Listener for expanding all Trees
  * 
  */


package org.sblim.wbemsmt.tasklauncher.jsf;


import java.util.logging.Logger;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.tree.ITreeSelector;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEvent;
import org.sblim.wbemsmt.bl.tree.TaskLauncherTreeNodeEventListenerImpl;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.runtime.RuntimeUtil;

public class ExpandAllListener extends TaskLauncherTreeNodeEventListenerImpl {

    private static final Logger logger = Logger.getLogger(ExpandAllListener.class.getName());

    public String processEvent(TaskLauncherTreeNodeEvent event) {

		if ((event.getType() & TaskLauncherTreeNodeEvent.TYPE_REFRESHED) > 0)
		{
			try {
				if (RuntimeUtil.getInstance().isJSF())
				{
					FacesContext context = (FacesContext) event.getContext();
					ITreeSelector treeSelector = (ITreeSelector) BeanNameConstants.TREE_SELECTOR.getBoundValue(context);
					treeSelector.expandAll();
				}
				else if (RuntimeUtil.getInstance().isSwing())
				{
				}
				logger.info("Adapter initialized");
			} catch (Exception e) {
				e.printStackTrace();
			} 
		
			return null;
		}
		
		return null;
	}

	public boolean isCustomListener() {
		return false;
	}

}