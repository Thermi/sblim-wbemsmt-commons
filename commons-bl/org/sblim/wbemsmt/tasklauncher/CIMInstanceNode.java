/**
 *  CIMInstanceNode.java
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

import java.io.Serializable;
import java.util.logging.Level;

import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbemsmt.bl.fco.CIM_ObjectIf;
import org.sblim.wbemsmt.bl.tree.ICIMInstanceNode;
import org.sblim.wbemsmt.exception.InstanceNamingException;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.TreenodeDocument;
import org.sblim.wbemsmt.tasklauncher.customtreeconfig.EventListenerDocument.EventListener;
import org.sblim.wbemsmt.tasklauncher.naming.CIMInstanceNaming;
import org.sblim.wbemsmt.tasklauncher.naming.CIMInstanceNamingFactory;

/**
 * Simple TreeNode to represent an CIM instance.
 * The only propertiy of this node is the concerning CIM instance.
 * This node cannot have subnodes.
 * @author Marius Kreis
 */
public class CIMInstanceNode extends TaskLauncherTreeNode implements Serializable, ICIMInstanceNode
{
	static final long serialVersionUID = 1234l;
    private CIMInstance cimInstance;
    private CIM_ObjectIf cimObject;
    
    public CIMInstanceNode(CIMClient cimClient, TreenodeDocument.Treenode xmlconfigNode, CIMInstance cimInstance)
    {
        this(cimClient, xmlconfigNode, null,cimInstance);
    }
    
    /**
     * @param cimClient
     * @param xmlconfigNode configuration - can be null
     * @param name
     * @param cimInstance
     */
    public CIMInstanceNode(CIMClient cimClient, TreenodeDocument.Treenode xmlconfigNode, String name, CIMInstance cimInstance)
    {
    	super(cimClient, xmlconfigNode, (name != null) ? name : cimInstance.getClassName());
    	this.cimInstance = cimInstance;
    	
    	if (xmlconfigNode != null)
    	{
    		EventListener[] eventListenerArray = xmlconfigNode.getCimclass().getInstanceSubnodes().getEventListenerArray();
    		for (int i = 0; i < eventListenerArray.length; i++) {
    			EventListener listener = eventListenerArray[i];
    			addEventListener(listener);
    		}
    	}
    }    


    public void readSubnodes() {}
    public void readSubnodes(boolean notifyEventListener) {}

    /* (non-Javadoc)
	 * @see org.sblim.wbem.tasklauncher.ICIMInstanceNode#getCimInstance()
	 */
    public CIMInstance getCimInstance()
    {
        return cimInstance;
    }

    public void setCimInstance(CIMInstance cimInstance)
    {
        this.cimInstance = cimInstance;
    }
    
    public TreenodeDocument.Treenode generateXML(TreenodeDocument.Treenode node)
    {
        node = super.generateXML(node);
        // node specific insertion of xmldata would go here
        return node;
    }
    
	public String getInfo() {
		return CIMInstanceNode.class.getName() + name + "; " + cimInstance.getObjectPath();
	}

	public CIM_ObjectIf getCimObject() {
		return cimObject;
	}

	public void setCimObject(CIM_ObjectIf cimObject) {
		this.cimObject = cimObject;
	}
	
	public CIMInstanceNaming cimInstanceNaming;

	/**
	 * returns the Instance responsible for naming a cimInstance
	 * @return
	 * 
	 * @see org.sblim.wbemsmt.tasklauncher.naming.CIMInstanceNamingFactory
	 */
	public CIMInstanceNaming getCimInstanceNaming() {
		return cimInstanceNaming;
	}

	/**
	 * set the Instance responsible for naming a cimInstance
	 * @param cimInstanceNaming
	 * @see CIMInstanceNamingFactory
	 *
	 */
	public void setCimInstanceNaming(CIMInstanceNaming cimInstanceNaming) {
		this.cimInstanceNaming = cimInstanceNaming;
	}

	/**
     * Returns the display name of the current node.
     * @return
     */
    public String getName()
    {
    	if (cimInstanceNaming != null)
    	{
			try {
				if (cimObject != null) {
					return cimInstanceNaming.getDisplayString(cimObject,cimClient);
				} else {
					return cimInstanceNaming.getDisplayString(cimInstance,cimClient);
				}
			} catch (InstanceNamingException e) {
				logger.log(Level.SEVERE, "Cannot get Naming for TreeNode",e);
			}    		
    	}
    	
    	return this.name;
    }
	
    
}
