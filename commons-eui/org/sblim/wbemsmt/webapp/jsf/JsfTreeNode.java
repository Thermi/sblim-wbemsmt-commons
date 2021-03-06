/**
 *  JsfTreeNode.java
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
 * Contributors:
 *
 */

package org.sblim.wbemsmt.webapp.jsf;


import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.apache.myfaces.custom.tree2.HtmlTree;
import org.sblim.wbemsmt.bl.tree.*;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tasklauncher.ITaskLauncherUiTreeNode;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherContextMenu;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherUiTreeNode;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.jsf.JavascriptUtil;
import org.sblim.wbemsmt.tools.jsf.JsfUtil;
import org.sblim.wbemsmt.tools.resources.ILocaleManager;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

/**
 * TreeNode for the JSF specific presentation of the taskLauncher tree.
 * @author Marius Kreis
 *
 */
public class JsfTreeNode extends TaskLauncherUiTreeNode
{
	private static final String[] DEFAULT_BUNDLES = new String[]{"messages","org.sblim.wbemsmt.webapp.jsf.webapp_messages"};

	public static final String FACET_TREENODE = "treenode";
	
    static final long serialVersionUID = 457634609347534L;
    private static final Logger logger = Logger.getLogger(JsfTreeNode.class.getName());
    
    private boolean leaf;
    private String description,
                   type,
                   id;
    
    private ArrayList<JsfTreeNode> children;
    
    private JsfTreeNode parent;
    private ITaskLauncherTreeNode taskLauncherTreeNode;
    private boolean eventListenerFlag = false;
    private boolean customEventListenerFlag = false;

    /**
     * Contains the information if the Node was translated - thats the case for all nodes containing a static text
     * like for example the CIMClassNode
     */
	private boolean translated = false;

    public JsfTreeNode()
    {
        this.children = new ArrayList<JsfTreeNode>();
    }

    public JsfTreeNode(String type, String description, boolean leaf)
    {
        this();
        this.type = type;
        this.description = description;
        this.leaf = leaf;
    }
    
    public JsfTreeNode(String type, String description, boolean leaf, ITaskLauncherTreeNode treeNode)
    {
        this(type, description, leaf);
        this.setTaskLauncherTreeNode(treeNode);
        setHasEventListener(treeNode.hasEventListener());
        setHasCustomEventListener(treeNode.hasCustomEventListener());
        
        ILocaleManager manager = (ILocaleManager) BeanNameConstants.LOCALE_MANAGER.getBoundValue(FacesContext.getCurrentInstance());
        manager.addLocaleChangeListener(this);
//        localeChanged(manager.getCurrentLocale());
    }
    
    // clone() always returns an Object and _must_ be caste to a specific class
	public void readSubnodes() throws WbemsmtException
    {
    	description = taskLauncherTreeNode.getName(); 
        ILocaleManager manager = (ILocaleManager) BeanNameConstants.LOCALE_MANAGER.getBoundValue(FacesContext.getCurrentInstance());
        localeChanged(manager.getCurrentLocale());

        logger.log(Level.FINE, "Reading subnodes of node " + this.description);
    	
    	
        // clone the data we use to avoid concurrent modify exceptions
        Vector<TaskLauncherTreeNode> subnodes = (Vector<TaskLauncherTreeNode>) taskLauncherTreeNode.getSubnodes().clone();
        Iterator<TaskLauncherTreeNode> iter = subnodes.iterator();
        
        this.children.clear();
        logger.log(Level.FINER, "Size before adding Childs to " + this.description + " " + this.children.size() + " Adding " + subnodes.size() + " childs");
        while(iter != null && iter.hasNext())
        {
            TaskLauncherTreeNode node = iter.next();
            logger.log(Level.FINER, "Adding JsfTreeNode " + node.getName() + " childs before adding " + this.children.size());
            
            JsfTreeNode jsfNode = new JsfTreeNode(FACET_TREENODE, node.getName(), false, node);
            jsfNode.setParent(this);
            this.children.add(jsfNode);
            jsfNode.readSubnodes();
        }    	
    }

    
    /* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tasklauncher.jsf.ITaskLauncherUiTreeNode#getTaskLauncherTreeNode()
	 */
    public ITaskLauncherTreeNode getTaskLauncherTreeNode()
    {
        return taskLauncherTreeNode;
    }

    /* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tasklauncher.jsf.ITaskLauncherUiTreeNode#setTaskLauncherTreeNode(org.sblim.wbemsmt.tasklauncher.TaskLauncherTreeNode)
	 */
    public void setTaskLauncherTreeNode(ITaskLauncherTreeNode treeNode)
    {
        this.taskLauncherTreeNode = treeNode;
        this.taskLauncherTreeNode.addEventListener(this);
    }

    /* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tasklauncher.jsf.ITaskLauncherUiTreeNode#getParent()
	 */
    public ITaskLauncherUiTreeNode getParent()
    {
        return parent;
    }

    /* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tasklauncher.jsf.ITaskLauncherUiTreeNode#setParent(org.sblim.wbemsmt.tasklauncher.jsf.JsfTreeNode)
	 */
    public void setParent(ITaskLauncherUiTreeNode parent)
    {
        this.parent = (JsfTreeNode)parent;
    }

    /* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tasklauncher.jsf.ITaskLauncherUiTreeNode#getHasEventListener()
	 */
    public boolean getHasEventListener()
    {
    	return this.eventListenerFlag;
    }
    
    /* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tasklauncher.jsf.ITaskLauncherUiTreeNode#setHasEventListener(boolean)
	 */
    public void setHasEventListener(boolean flag)
    {
    	this.eventListenerFlag = flag;
    }

    /* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tasklauncher.jsf.ITaskLauncherUiTreeNode#getHasCustomEventListener()
	 */
    public boolean getHasCustomEventListener() {
		return customEventListenerFlag;
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tasklauncher.jsf.ITaskLauncherUiTreeNode#setHasCustomEventListener(boolean)
	 */
	public void setHasCustomEventListener(boolean customEventListenerFlag) {
		this.customEventListenerFlag = customEventListenerFlag;
	}

	public void pasteBelow(JsfTreeNode sibling)
    {
        parent.pasteSubnode(this, sibling, 1);
    }
    
    public void pasteAbove(JsfTreeNode sibling)
    {
        parent.pasteSubnode(this, sibling, 0);
    }
    
    public void pasteSubnode(JsfTreeNode subnode)
    {
        this.pasteSubnode(this, subnode, 0);
    }
    
    public void delete()
    {
        parent.deleteSubnode(this);
    }
    
    public void deleteSubnode(JsfTreeNode subnode)
    {
        if(subnode.getTaskLauncherTreeNode() != null) this.taskLauncherTreeNode.deleteSubnode(subnode.getTaskLauncherTreeNode());
        this.children.remove(subnode);
    }
        
    private void pasteSubnode(JsfTreeNode reference, JsfTreeNode nodeToPaste, int offset)
    {
        int referenceID = this.children.indexOf(reference);
        if(referenceID >= 0)
        {
            children.add(referenceID + offset, nodeToPaste);
        }
        
        if(nodeToPaste.getTaskLauncherTreeNode() != null)
        {
            this.taskLauncherTreeNode.insertSubnode(reference.getTaskLauncherTreeNode(), nodeToPaste.getTaskLauncherTreeNode(), offset);
        }

    }
    
    public void setId(String id)
    {
        this.id = id;
    }
    
	public String getId() {
		return id;
	}

    public void setIdentifier(String id)
    {
        this.id = id;
    }

    public String getIdentifier() {
		return id;
	}

	public void setDescription(String description)
    {
        this.description = description;
    }
    
    public String getDescription()
    {
    	if (! (taskLauncherTreeNode instanceof ICIMInstanceNode))
    	{
    		return "<nobr>" + this.description + "</nobr>";
    	}
    	else
    	{
    		return this.description;
    	}
    }
    
    public String getPlainDescription()
    {
		String nodeName = getDescription();
		//If the node is translated the getDescription method
		//returns already the translated not formatted Description
		if (taskLauncherTreeNode != null && !translated)
		{
			nodeName = taskLauncherTreeNode.getPlainName();
		}
		return nodeName;
    }

    public void setType(String type)
    {
        this.type = type;
    }
    
    public String getType()
    {
        return this.type;
    }
    
    public void setLeaf(boolean leaf)
    {
        this.leaf = leaf;
    }
    
    public boolean isLeaf()
    {
        return leaf || (getChildCount() == 0);
    }
    
    /* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tasklauncher.jsf.ITaskLauncherUiTreeNode#getChildCount()
	 */
    public int getChildCount()
    {
        return this.children.size();
    }
    
    /* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tasklauncher.jsf.ITaskLauncherUiTreeNode#getChildren()
	 */
    public List<JsfTreeNode> getChildren()
    {
        return children;
    }
    
    /* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tasklauncher.jsf.ITaskLauncherUiTreeNode#setChildren(java.util.ArrayList)
	 */
    public void setChildren(ArrayList<JsfTreeNode> children)
    {
        this.children = children;
    }
    
    /* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tasklauncher.jsf.ITaskLauncherUiTreeNode#getContextMenu()
	 */
    public TaskLauncherContextMenu getContextMenu()
    {
		TaskLauncherContextMenu menu = this.taskLauncherTreeNode.getContextMenu();
		if (menu != null && menu.getItemCount() > 0 && menu.getItem(0).getDescription() == null)
		{
	    	ILocaleManager manager = (ILocaleManager) BeanNameConstants.LOCALE_MANAGER.getBoundValue(FacesContext.getCurrentInstance());
			menu.initI18n(manager);
		}
		return menu;
    }
    
    /* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tasklauncher.jsf.ITaskLauncherUiTreeNode#getContextMenuId()
	 */
    public String getContextMenuId()
    {
    	if (getHasContextMenu())
    	{
    		TaskLauncherContextMenu menu = this.taskLauncherTreeNode.getContextMenu();
    		return menu.getId();
    	}
    	else
    	{
    		return "";
    	}
    }

    
    /* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tasklauncher.jsf.ITaskLauncherUiTreeNode#getHasContextMenu()
	 */
    public boolean getHasContextMenu()
    {
    	TaskLauncherContextMenu menu = this.taskLauncherTreeNode.getContextMenu();
    	return (menu != null) && menu.getMenuItems().size() > 0;
    }
    
    // clone() will only return an Object, which must then be caste.
	public Object clone()
    {
        try
        {
            JsfTreeNode cloned = (JsfTreeNode) super.clone();
            cloned.setChildren((ArrayList<JsfTreeNode>) this.children.clone());
            cloned.setTaskLauncherTreeNode((TaskLauncherTreeNode) this.taskLauncherTreeNode.clone());
            return cloned;
        }
        catch(CloneNotSupportedException e)
        {
            logger.log(Level.SEVERE, "CloneNotSupportedException while cloning " + this.getClass().getName() + " named " + this.getDescription());
            return null;
        }
        catch(Exception e)
        {
            logger.log(Level.SEVERE, "Error while cloning " + this.getClass().getName() + " named " + this.getDescription());
            return null;
        }
    }
    
    public void setParameters(Properties para) {}
    public Properties getParameters() { return null; }
    
    public boolean processesEvent(int type)
    {
    	return (type & TaskLauncherTreeNodeEvent.TYPE_REFRESHED) > 0;
    }
    
    public String processEvent(TaskLauncherTreeNodeEvent event) throws WbemsmtException
    {
    	logger.log(Level.FINEST, "Processing Event");
        ObjectActionControllerBean objectActionController = (ObjectActionControllerBean)BeanNameConstants.OBJECT_ACTION_CONTROLLER.getBoundValue(FacesContext.getCurrentInstance());
        objectActionController.clearEditBeansModified();
    	readSubnodes();
    	return null;
    }

    public void processMenueItemEvent(ActionEvent event)
    {
    	System.err.println("processMenueItem");
    }


	public String getPopupTrigger()
	{
		if (getHasContextMenu())
		{
			return "enablePopup(this,'" + this.taskLauncherTreeNode.getContextMenu().getId() + "')";
		}
		else
		{
			return "";
		}
	}

	public boolean isCustomListener() {
		return false;
	}

	public void localeChanged(Locale newLocale) {
		
		boolean translate = false;

		/**
		 * decide which types of nodes are translated
		 */
		
		if (getTaskLauncherTreeNode() instanceof CIMClassNode) { translate = true; }
		else if (getTaskLauncherTreeNode() instanceof CIMInstanceNode) {/*do nothing */}
		else if (getTaskLauncherTreeNode() instanceof TaskLauncherTreeConfigTreeNode) {/*do nothing */}
		else if (getTaskLauncherTreeNode() instanceof TaskLauncherDelegaterTreeNode) {/*do nothing */}
		else if (getTaskLauncherTreeNode() instanceof CimomTreeNode) {/*do nothing */}
		else if (getTaskLauncherTreeNode() instanceof SimpleTextTreeNode) {/*do nothing */}
		else if (getTaskLauncherTreeNode() instanceof TaskLauncherTreeNode) { translate = true; }
		
		if (translate)
		{
			String[] bundles = getTaskLauncherTreeNode().getCustomTreeConfig() != null 
			                   && getTaskLauncherTreeNode().getCustomTreeConfig().getTreeConfigData() != null
			                   ? getTaskLauncherTreeNode().getCustomTreeConfig().getTreeConfigData().getBundles() : JsfTreeNode.DEFAULT_BUNDLES;
			WbemSmtResourceBundle bundle = ResourceBundleManager.getResourceBundle(bundles,newLocale);
			description = bundle.getString(getTaskLauncherTreeNode().getName());
			translated = true;
		}
	}

	public String[] getPath(HtmlTree tree) {

		List<ITaskLauncherUiTreeNode> parents = new ArrayList<ITaskLauncherUiTreeNode>();
		ITaskLauncherUiTreeNode parent = getParent();
		ITaskLauncherUiTreeNode child = null;
		
		parents.add(this);
		
		while (parent != null)
		{
			parents.add(0,parent);
			parent = parent.getParent();
		}
		
		String[] result = new String[parents.size()];
		
		int index = 0;
		String currentPath = "" + index;
		result[0] = currentPath;
		
		for (int i=1; i < parents.size();i++)
		{
			parent = (ITaskLauncherUiTreeNode) parents.get(i-1);
			child = (ITaskLauncherUiTreeNode) parents.get(i);
			index = getChildIndex(parent.getChildren(), child);
			currentPath = currentPath + ":" + index;
			result[i] = currentPath;
		}
		
		return result;
		
	}

	public static int getChildIndex(List<JsfTreeNode> childrenList, ITaskLauncherUiTreeNode child) {
		
		for (int i=0; i < childrenList.size();i++)
		{
			ITaskLauncherUiTreeNode childInList = (ITaskLauncherUiTreeNode) childrenList.get(i);
			if (childInList.equals(child))
			{
				return i; 
			}
		}
		return -1;
	}

	public boolean isEnabled() {
		return taskLauncherTreeNode.isEnabled();
	}

	public void setEnabled(boolean enabled) {
		taskLauncherTreeNode.setEnabled(enabled);
	}

	public JsfTreeNode find(ITaskLauncherTreeNode taskLauncherTreeNode) {
		if (this.taskLauncherTreeNode.getInfo().equals(taskLauncherTreeNode.getInfo()))
		{
			return this;
		}
		else
		{
			for (Iterator<JsfTreeNode> iter = children.iterator(); iter.hasNext();) {
				JsfTreeNode jsfTreeNode = (JsfTreeNode) iter.next();
				JsfTreeNode node = jsfTreeNode.find(taskLauncherTreeNode);
				if (node != null)
				{
					return node;
				}
			}
		}
		return null;
	}

	public boolean isShowWaitOnClick() {
		return taskLauncherTreeNode.hasEventListenerWithLongrunningActions();
	}
	
	/**
	 * Called by the tree component by the on click Attribute
	 * @return
	 */
	public String getOnClickJavaScript()
	{
		
		ObjectActionControllerBean oac = (ObjectActionControllerBean) BeanNameConstants.OBJECT_ACTION_CONTROLLER.getBoundValue(FacesContext.getCurrentInstance());
		
		StringBuffer result = new StringBuffer();
		
		if (oac.isEditBeansModified() || oac.isWizardActive())
		{
			result.append(JavascriptUtil.getInputFieldValueChangedCall());
		}
		
		result.append(JavascriptUtil.getCheckModificationsCall());
		
		//before we click on a node we should stop all Ajax requests to avoid race conditions
		result.append(JsfUtil.STOP_ALL_AJAX_REQUESTS_TRUE);
		
		if (isShowWaitOnClick())
		{
			String nodeName = getPlainDescription();
			String text = ResourceBundleManager.getResourceBundle(FacesContext.getCurrentInstance()).getString("loading.treenode",new Object[]{nodeName});
			result.append(JavascriptUtil.getShowWaitCall(text));
		}
		
		return result.toString();
	}
	
}
