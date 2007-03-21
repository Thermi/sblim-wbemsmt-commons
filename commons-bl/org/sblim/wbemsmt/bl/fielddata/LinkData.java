 /** 
  * LinkData.java
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
  * Description: TODO
  * 
  */
package org.sblim.wbemsmt.bl.fielddata;

import org.sblim.wbemsmt.tasklauncher.event.TaskLauncherContextMenuEventListener;

/**
 * @author Bauschert
 *
 */
public class LinkData implements FieldData {
	
	private TaskLauncherContextMenuEventListener listener;
	private String linkText;


	
	public LinkData(TaskLauncherContextMenuEventListener listener, String linkText) {
		super();
		this.listener = listener;
		this.linkText = linkText;
	}



	public TaskLauncherContextMenuEventListener getListener() {
		return listener;
	}

	public void setListener(TaskLauncherContextMenuEventListener listener) {
		this.listener = listener;
	}

	public String getLinkText() {
		return linkText;
	}

	public void setLinkText(String linkText) {
		this.linkText = linkText;
	}

	
	

}
