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
  * Description: DataObject for Links
  * 
  */
package org.sblim.wbemsmt.bl.fielddata;

import org.sblim.wbemsmt.tasklauncher.event.TaskLauncherContextMenuEventListener;

/**
 * DataObject for Links
 */
public class LinkData implements FieldData {
	
	private TaskLauncherContextMenuEventListener listener;
	private String linkText;


	/**
	 * create a new link
	 * @param listener the listener (should be the presentation layer independent version)
	 * @param linkText the translated text of the link
	 */
	
	public LinkData(TaskLauncherContextMenuEventListener listener, String linkText) {
		super();
		this.listener = listener;
		this.linkText = linkText;
	}


	/**
	 * @return the listener
	 */

	public TaskLauncherContextMenuEventListener getListener() {
		return listener;
	}

	/**
	 * set the listener
	 * @param listener the listener
	 */
	public void setListener(TaskLauncherContextMenuEventListener listener) {
		this.listener = listener;
	}

	/**
	 * get the translated link text
	 * @return the text
	 */
	public String getLinkText() {
		return linkText;
	}

	/**
	 * set the translated link text
	 * @param linkText the text
	 */
	public void setLinkText(String linkText) {
		this.linkText = linkText;
	}

	
	

}
