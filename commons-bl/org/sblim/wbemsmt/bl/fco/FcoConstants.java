 /** 
  * FcoConstants.java
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
  * Description: Constans for container-prefixes relating to fco-fields 
  * 
  */
package org.sblim.wbemsmt.bl.fco;

/**
 * Constans for container-prefixes relating to fco-fields
 */
public final class FcoConstants {
    
    /**
     * constant class is only having private constructor
     */
    private FcoConstants(){}
    
	/**
	 * This Token is used within a container implementation for variables representing a field
	 * that is userdefined (have no FCO-Relation)
	 */
	public static final String USR_DEFINED_TOKEN = "usr_";

	/**
	 * This Token is used within a container implementation for variables representing a Button for invokign a action
	 */
	public static final String INVOKE_TOKEN = "invoke_";

}
