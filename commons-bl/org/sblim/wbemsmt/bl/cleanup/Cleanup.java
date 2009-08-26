 /** 
  * Cleanup.java
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
  * Description: Marker Interface for Object that manage their own cleanup
  * 
  */
package org.sblim.wbemsmt.bl.cleanup;

/**
 * Marker Interface for Object that manage their own cleanup
 */
public interface Cleanup {
    
    /**
     * method which is called during cleanup<br>
     * <br>
     * Implementors can cleanup some object to free memory for the garbage collector. For example if the object contains static 
     * references that are not collected by the gc
     * 
     */
	public void cleanup();
}
