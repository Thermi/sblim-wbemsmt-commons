 /** 
  * ITreeBacker.java
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
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Interface for all TreeBackers
  * 
  */
package org.sblim.wbemsmt.bl.tree;

import org.sblim.wbemsmt.exception.WbemsmtException;

/**
 * Interface for all TreeBackers
 */
public interface ITreeBacker {

    /**
     * update a tree
     * @return the outcome for further navigation
     * @throws WbemsmtException if the update failed
     */
	public String updateTree()  throws WbemsmtException;

}
