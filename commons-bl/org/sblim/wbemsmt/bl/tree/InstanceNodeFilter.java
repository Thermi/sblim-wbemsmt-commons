 /** 
  * InstanceNodeFilter.java
  *
  * © Copyright IBM Corp. 2008
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
  * Description: Class to filter Innstance nodes
  * 
  */
package org.sblim.wbemsmt.bl.tree;

/**
 * lass to filter Innstance nodes
 */
public interface InstanceNodeFilter {
    /**
     * method to define which instance node should be accepted
     * @param node the node to check
     * @return true if the node is okay and should be accepted by the caller
     */
    public boolean accept(ICIMInstanceNode node);
    
}
