/**
 *  TaskLauncherTreeNodeEvent.java
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

package org.sblim.wbemsmt.bl.tree;

import java.util.EventObject;
import java.util.HashMap;
import java.util.Map;

public class TaskLauncherTreeNodeEvent extends EventObject
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 648615132158890359L;

	public static int TYPE_ALL = 255,
					  TYPE_CLICKED = 1,
					  TYPE_REFRESHED = 2,
					  TYPE_EXPANDED = 4,
					  TYPE_COLLAPSED = 8;
	
	public static final String PARAM_REVERT = "revert";
	
	public int type = TYPE_ALL;

	private final Object context;

	private ITaskLauncherTreeNode treeNode;

	private Map parameters = new HashMap(); 
	
	public TaskLauncherTreeNodeEvent(Object source, ITaskLauncherTreeNode treeNode, Object context, int eventType)
	{
		this(source,treeNode, context);
		this.type = eventType;
	}

    public TaskLauncherTreeNodeEvent(Object source, ITaskLauncherTreeNode treeNode, Object context)
    {
        super(source);
		this.treeNode = treeNode;
		this.context = context;
    }
    
    public int getType()
    {
    	return this.type;
    }
    
    public void setType(int type)
    {
    	this.type = type;
    }

	public Object getContext() {
		return context;
	}

	public ITaskLauncherTreeNode getTreeNode() {
		return treeNode;
	}
    
	public void addParameter(String key, Object value)
	{
		parameters.put(key, value);
	}
	
	public void addParameter(String key, boolean value)
	{
		parameters.put(key, new Boolean(value));
	}
    
	public void addParameter(String key, int value)
	{
		parameters.put(key, new Integer(value));
	}
	
	public Object getParameter(String key)
	{
		return parameters.get(key);
	}

	public Boolean getBooleanParameter(String key)
	{
		return (Boolean)parameters.get(key);
	}

	public Integer getIntegerParameter(String key)
	{
		return (Integer)parameters.get(key);
	}
}
