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
 * Contributors: Michael.Bauschert@de.ibm.com
 * 
 * Simple TreeNode to represent an CIM instance.
 *
 */

package org.sblim.wbemsmt.bl.tree;

import java.io.Serializable;
import java.util.logging.Level;

import javax.cim.CIMInstance;
import javax.wbem.client.WBEMClient;

import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco;
import org.sblim.wbemsmt.bl.tree.ICIMInstanceNode;
import org.sblim.wbemsmt.exception.WbemsmtException;
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
    /**
     * serial#
     */
	static final long serialVersionUID = 1234L;
    private CIMInstance cimInstance;
    private AbstractWbemsmtFco cimObject;
    
    /**
     * creates a new node
     * @param cimClient the connection
     * @param xmlconfigNode xmlConfig of this node
     * @param cimInstance the cim instance which will be represented by this node
     */
    public CIMInstanceNode(WBEMClient cimClient, TreenodeDocument.Treenode xmlconfigNode, CIMInstance cimInstance)
    {
        this(cimClient, xmlconfigNode, null,cimInstance);
    }
    
    /**
     * creates a new node
     * @param cimClient the connection
     * @param xmlconfigNode xmlConfig of this node
     * @param cimInstance the cim instance which will be represented by this node
     * @param name the name of the node
     */
    public CIMInstanceNode(WBEMClient cimClient, TreenodeDocument.Treenode xmlconfigNode, String name, CIMInstance cimInstance)
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

    /**
     * does nothing because the instance node is having no subnodes
     */
    public void readSubnodes() {}
    
    /**
     * does nothing because the instance node is having no subnodes
     * @param notifyEventListener not used
     */
    public void readSubnodes(boolean notifyEventListener) {}

    /**
     * get {@link CIMInstance}
     * @return the cim instance
     * @see org.sblim.wbem.tasklauncher.ICIMInstanceNode#getCimInstance()
     */
    public CIMInstance getCimInstance()
    {
        return cimInstance;
    }

    /**
     * set the cim instance
     * @param cimInstance the instance
     */
    public void setCimInstance(CIMInstance cimInstance)
    {
        this.cimInstance = cimInstance;
    }
    
    /**
     * Takes a {@link TreenodeDocument.Treenode} and adds all configuration data to it to represent the current node in XML.
     * This method is to be overridden and called by subclasses whereas every subclass adds ifs custom data to the node.
     *
     * @param node to which current configuration data will be added to
     * @return TreenodeDocument.Treenode The modified node
     */
    public TreenodeDocument.Treenode generateXML(TreenodeDocument.Treenode node)
    {
        node = super.generateXML(node);
        // node specific insertion of xmldata would go here
        return node;
    }
    
    /**
     * @return get the name of this class + the node node + the name of {@link #cimClass}
     */
    public String getInfo() {
		return CIMInstanceNode.class.getName() + name + "; " + cimInstance.getObjectPath();
	}

    /**
     * return the FCO
     * @return the fco
     */
	public AbstractWbemsmtFco getCimObject() {
		return cimObject;
	}

    /**
     * set the cim object (for example for later use in the adaoter class)
     * @param cimObject the cim object
     */
	public void setCimObject(AbstractWbemsmtFco cimObject) {
		this.cimObject = cimObject;
	}
	
	
	private CIMInstanceNaming cimInstanceNaming;

    /**
     * returns the Instance responsible for naming a cimInstance
     * @return the instance responsible for naming a cimInstance
     * 
     * @see org.sblim.wbemsmt.tasklauncher.naming.CIMInstanceNamingFactory
     */
	
	public CIMInstanceNaming getCimInstanceNaming() {
		return cimInstanceNaming;
	}

    /**
     * set the Instance responsible for naming a cimInstance
     * @param cimInstanceNaming the Instance responsible for naming a cimInstance
     * @see CIMInstanceNamingFactory
     *
     */
	public void setCimInstanceNaming(CIMInstanceNaming cimInstanceNaming) {
		this.cimInstanceNaming = cimInstanceNaming;
	}

	/**
     * Returns the display name of the current node.
     * @return the display name
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
			} catch (WbemsmtException e) {
				logger.log(Level.SEVERE, "Cannot get Naming for TreeNode",e);
			}    		
    	}
    	
    	return this.name;
    }
	
    
}
