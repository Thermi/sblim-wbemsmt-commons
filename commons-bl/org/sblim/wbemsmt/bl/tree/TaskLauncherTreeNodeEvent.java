/**
 *  TaskLauncherTreeNodeEvent.java
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
 * @author: Marius Kreis <mail@nulldevice.org>
 *
 * Contributors: event targeted on a TreeNode
 *
 */

package org.sblim.wbemsmt.bl.tree;

import java.util.EventObject;
import java.util.HashMap;
import java.util.Map;

import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFLinkComponent;

/**
 * event targeted on a TreeNode
 */
public class TaskLauncherTreeNodeEvent extends EventObject
{
	/**
	 * the serial id 
	 */
	private static final long serialVersionUID = 648615132158890359L;

	/**
	 * mask for all events
	 */
	public static final int TYPE_ALL = 255;
	
	/**
	 * click event
	 */
	public static final int TYPE_CLICKED = 1;
	
	/**
	 * node is refreshed
	 */
	public static final int TYPE_REFRESHED = 2;
	
	/**
	 * node is expanded
	 */
	public static final int TYPE_EXPANDED = 4;
	
	/**
	 * node is collapsed
	 */
	public static final int TYPE_COLLAPSED = 8;
	
	/**
	 * key to indicate Revert actions
	 */
	public static final String PARAM_REVERT = "revert";
	
	/**
	 * the type of the event; Default: {@link #TYPE_ALL}
	 */
	private int type = TYPE_ALL;

	/**
	 * the context of the event
	 */
	private final Object context;

	/**
	 * the node on which the event was triggered
	 */
	private ITaskLauncherTreeNode treeNode;

	/**
	 * the parameters of the event
	 * Parameters can be integer, boolean, or string
	 */
	private Map<String, Object> parameters = new HashMap<String, Object>(); 
	
	/**
	 * creates a new event
	 * @param source the source of the event. Can be the LoginCheckBean, a ContextMenueItem, a TreeNode or {@link LabeledJSFLinkComponent}
	 * @param treeNode the node to which the event belong
	 * @param context the runtime specific context (For JSF an instance of {@link FacesContext}
	 * @param eventType the type. See variables prefixed with TYPE_
	 */
	public TaskLauncherTreeNodeEvent(Object source, ITaskLauncherTreeNode treeNode, Object context, int eventType)
	{
		this(source,treeNode, context);
		this.type = eventType;
	}

    /**
     * creates a new event
     * @param source the source of the event. Can be the LoginCheckBean, a ContextMenueItem, a TreeNode or {@link LabeledJSFLinkComponent}
     * @param treeNode the node to which the event belong
     * @param context the runtime specific context (For JSF an instance of {@link FacesContext}
     */
    public TaskLauncherTreeNodeEvent(Object source, ITaskLauncherTreeNode treeNode, Object context)
    {
        super(source);
		this.treeNode = treeNode;
		this.context = context;
    }
    
    /**
     * See variables prefixed with TYPE_
     * @return variables prefixed with TYPE_
     */
    public int getType()
    {
    	return this.type;
    }
    
    /**
     * set the type (See variables prefixed with TYPE_)
     * @param type the type
     */
    public void setType(int type)
    {
    	this.type = type;
    }

    /**
     * return the runtime specific context (For JSF an instance of {@link FacesContext}
     * @return the runtime specific context (For JSF an instance of {@link FacesContext}
     */
	public Object getContext() {
		return context;
	}

	/**
	 * get the node to which the event belong
	 * @return the node to which the event belong
	 */
	public ITaskLauncherTreeNode getTreeNode() {
		return treeNode;
	}
    
	/**
	 * add a parameter to the event
	 * @param key name of the parameter
	 * @param value value
	 */
	public void addParameter(String key, Object value)
	{
		parameters.put(key, value);
	}
	
	
    /**
     * add a boolean parameter to the event
     * @param key name of the parameter
     * @param value value
     */
	public void addParameter(String key, boolean value)
	{
		parameters.put(key, new Boolean(value));
	}
    
    /**
     * add an int parameter to the event
     * @param key name of the parameter
     * @param value value
     */
	public void addParameter(String key, int value)
	{
		parameters.put(key, new Integer(value));
	}
	
	/**
	 * get a parameter object
	 * @param key name of the parameter
	 * @return the parameter value as object
	 */
	public Object getParameter(String key)
	{
		return parameters.get(key);
	}

    /**
     * get a parameter object as {@link Boolean}
     * @param key name of the parameter
     * @return the parameter value as {@link Boolean}
     */
	public Boolean getBooleanParameter(String key)
	{
		return (Boolean)parameters.get(key);
	}

    /**
     * get a parameter object as {@link Integer}
     * @param key name of the parameter
     * @return the parameter value as {@link Integer}
     */
	public Integer getIntegerParameter(String key)
	{
		return (Integer)parameters.get(key);
	}
}
