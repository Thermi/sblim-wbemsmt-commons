 /** 
  * EmbeddedFilter.java
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
  * Description: Classes to filter the XML-ObjectModel in the EmbeddedMode
  * 
  */
package org.sblim.wbemsmt.filter;

import java.util.logging.Logger;

import org.sblim.wbemsmt.tasklauncher.customtreeconfig.TreenodeDocument.Treenode;

public abstract class EmbeddedFilter {
	
    protected static Logger logger = Logger.getLogger(EmbeddedFilter.class.getName());

	
	/**
	 * Implementors should filter the source and give back the modified version
	 * @param rootNode
	 * @return the filtered model
	 */
	public abstract Treenode filter ( Treenode rootNode );
	

}
