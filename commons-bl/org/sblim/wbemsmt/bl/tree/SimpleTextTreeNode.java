 /** 
  * SimpleTextTreeNode.java
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
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: TextNode for displaying a Simple Text
  * 
  */
package org.sblim.wbemsmt.bl.tree;

import java.util.Vector;

import org.sblim.wbemsmt.exception.WbemsmtException;

public class SimpleTextTreeNode extends TaskLauncherTreeNode {


	//private static Logger logger = Logger.getLogger(SimpleTextTreeNode.class.getName());

    public SimpleTextTreeNode(String nodeName) {
		super(null,null,nodeName);
		subnodes = new Vector<ITaskLauncherTreeNode>();
    }

	public void clearSubnodes() {
		// do nothing
	}

	public Vector<ITaskLauncherTreeNode> getSubnodes() throws WbemsmtException {
		return subnodes;
	}

	public Vector<ITaskLauncherTreeNode> getSubnodes(boolean notifyEventListeners) throws WbemsmtException {
		return subnodes;
	}

	public void readSubnodes() throws WbemsmtException {
		//do nothing
	}

	public void readSubnodes(boolean notifyEventListener) throws WbemsmtException {
		//do nothing
	}
    
	public String getInfo() {
		return SimpleTextTreeNode.class.getName() + name;
	}
	
    
    
}
