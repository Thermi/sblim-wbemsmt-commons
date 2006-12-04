 /** 
  * IObjectActionController.java
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
  * Description: Controll the objects on which are currently actions invoked
  * 
  */
package org.sblim.wbemsmt.tools.jsf;

import javax.faces.component.html.HtmlPanelGrid;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.tasklauncher.event.EditListener;

public interface IObjectActionController {

	public void setCurrentEditor(HtmlPanelGrid editor);
	
	public void addEditBean(String key, EditBean editBean);

	public void setTabbedPane(TabbedPane tabbedPane);
	
	public void setSelectedTabId(String id);
	
	public void setSelectedTabIndex(int index);
	
	public void setCurrentEditListener(EditListener editListener);
	
	public void addAdapter(String key, AbstractBaseCimAdapter adapter);
}
