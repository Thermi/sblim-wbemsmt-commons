 /** 
  * SimpleTextTreeNode.java
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
  * Description: TextNode for displaying a Simple Text
  * 
  */
package org.sblim.wbemsmt.tasklauncher;

import java.util.Vector;

import org.sblim.wbemsmt.exception.WbemSmtException;

public class SimpleTextTreeNode extends TaskLauncherTreeNode {


	//private static Logger logger = Logger.getLogger(SimpleTextTreeNode.class.getName());

    public SimpleTextTreeNode(String nodeName) {
		super(null,null,nodeName);
		subnodes = new Vector();
    }

	public void clearSubnodes() {
		// do nothing
	}

	public Vector getSubnodes() throws WbemSmtException {
		return subnodes;
	}

	public Vector getSubnodes(boolean notifyEventListeners) throws WbemSmtException {
		return subnodes;
	}

	public void readSubnodes() throws WbemSmtException {
		//do nothing
	}

	public void readSubnodes(boolean notifyEventListener) throws WbemSmtException {
		//do nothing
	}
    
	public String getInfo() {
		return SimpleTextTreeNode.class.getName() + name;
	}
	
    
    
}
