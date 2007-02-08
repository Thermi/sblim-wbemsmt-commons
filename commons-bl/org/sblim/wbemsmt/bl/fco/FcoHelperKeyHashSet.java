/** 
 * FcoHelperKeyHashSet.java
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
 * Description: HashSet with ability to add keys in a easy way
 * 
 */
package org.sblim.wbemsmt.bl.fco;

import java.util.HashSet;

public class FcoHelperKeyHashSet extends HashSet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4907568922896224927L;

	/**
	 * ConvenienceMethod for adding Keys to ignore them later if a obvject is updated
	 * Prepends "_get" to the fieldname (Thats the method name to compare later)
	 * 
	 * The keys is stored and compare in lowerCase
	 *  
	 * @param fieldName
	 * @return
	 * @see FcoHelper#updateFcoContent(Object, DataContainer, FcoHelperKeyHashSet)
	 */
	public FcoHelperKeyHashSet addKey(String fieldName)
	{
		add("get_" + fieldName.toLowerCase());
		return this;
	}
	
}
