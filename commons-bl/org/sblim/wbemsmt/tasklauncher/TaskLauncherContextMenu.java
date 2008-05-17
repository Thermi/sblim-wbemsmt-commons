/**
 *  TaskLauncherContextMenu.java
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
 * @author: Marius Kreis <mail@nulldevice.org>
 *
 * Contributors:
 *
 */
 
package org.sblim.wbemsmt.tasklauncher;

import java.util.Iterator;
import java.util.Properties;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.ContextmenuDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.EventListenerDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.MenuitemDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.ParamDocument;
import org.sblim.wbemsmt.tools.resources.ILocaleManager;

public class TaskLauncherContextMenu implements Cloneable
{
	private static final Logger logger = Logger.getLogger(TaskLauncherContextMenu.class.getName());
	private Vector menuItems;
	private static int currentCount = 0;
	private int id = currentCount++;
	
	private ITaskLauncherTreeNode node;
	private final String[] bundles;
	private boolean common = false;
	
	
	public TaskLauncherContextMenu(ContextmenuDocument.Contextmenu contextMenu, String[] bundles)
	{
		this.bundles = bundles;
		this.menuItems = new Vector();
		
		if(contextMenu != null)
		{
			MenuitemDocument.Menuitem[] menuItems = contextMenu.getMenuitemArray();
			
	    	for (int i = 0; i < menuItems.length; i++) {
	    		
	    		MenuitemDocument.Menuitem menuItem = menuItems[i];
	        	
	        	if(menuItem.getEventListener() != null)
	        	{
	        		EventListenerDocument.EventListener eventListener = menuItem.getEventListener();
	        		logger.log(Level.INFO, "ContextMenuItem \"" + menuItem.getDescription() + "\" pointing to " + eventListener.getClassname());
	        		
	        		// get param subelements an put them in a Properties list
	        		Properties parameters = new Properties();
	        		for (int j = 0; j < eventListener.getParamArray().length; j++) {
						ParamDocument.Param param = eventListener.getParamArray()[j];
	        			parameters.setProperty(param.getParamName(), param.getParamValue());
	        		}
	        		TaskLauncherContextMenuItem contextMenuItem = new TaskLauncherContextMenuItem(menuItem.getDescription(), eventListener.getClassname(), parameters);
	        		contextMenuItem.setParent(this);
					this.menuItems.add(contextMenuItem);
	        	}
	        	else
	        	{
	        		TaskLauncherContextMenuItem contextMenuItem = new TaskLauncherContextMenuItem(menuItem.getDescription());
	        		contextMenuItem.setParent(this);
					this.menuItems.add(contextMenuItem);
	        	}
	        }
		}

	}
	
	/**
	 * Set from outside beauce LocaleManager is part of presentationLayer (because we need a session or something else to get the current one)
	 * and this session is normally bound to to the peresentationLayer
	 * @param localeManager
	 */
	public void initI18n(ILocaleManager localeManager)
	{
		for (Iterator iter = menuItems.iterator(); iter.hasNext();) {
			TaskLauncherContextMenuItem item = (TaskLauncherContextMenuItem) iter.next();
			item.initI18n(localeManager);
		}
	}
	
	
	public void addMenuItem(TaskLauncherContextMenuItem item)
	{
		item.setParent(this);
		this.menuItems.add(item);
	}
	
	public void removeMenuItem(TaskLauncherContextMenuItem item)
	{
		item.setParent(null);
		menuItems.remove(item);
	}
	
	public Vector getMenuItems()
	{
		return this.menuItems;
	}
	
	public void setMenuItems(Vector items)
	{
		this.menuItems = items;
	}	
	
	public Object clone() throws CloneNotSupportedException
	{
		TaskLauncherContextMenu menu = (TaskLauncherContextMenu) super.clone(); 
		menu.setId(currentCount++);
		menu.setMenuItems(new Vector());
		
		for (int i=0; i < menuItems.size(); i++) {
			TaskLauncherContextMenuItem item = (TaskLauncherContextMenuItem) menuItems.get(i);
			menu.addMenuItem((TaskLauncherContextMenuItem) item.clone());
		}
		return menu;
	}

	public String getId() {
		return "ContextMenue_" + id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ITaskLauncherTreeNode getNode() {
		return node;
	}

	public void setNode(ITaskLauncherTreeNode node) {
		this.node = node;
	}

	public String[] getBundles() {
		return bundles;
	}
	
	public int getItemCount()
	{
		return getMenuItems().size();
	}

	public TaskLauncherContextMenuItem getItem(int i) {
		return (TaskLauncherContextMenuItem) getMenuItems().get(i);
	}

	public boolean isCommon() {
		return common;
	}

	public void setCommon(boolean common) {
		this.common = common;
	}
	
	
	
}
