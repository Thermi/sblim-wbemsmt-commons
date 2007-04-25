 /** 
  * SelectionHierarchy.java
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
  * Description: Class for selecting Objects within an adapter class the
  * subclasses can use the push Method to add new Object and to validate if the Object can be added
  * 
  * Wrapper class for java.util.Stack
  * 
  */
package org.sblim.wbemsmt.bl.adapter;

import java.util.Stack;

public class SelectionHierarchy {

	Stack stack = new Stack();

	/**
	 * return the number of elements currently selected
	 * @return
	 */
	public int size() {
		return stack.size();
	}
	

	/**
	 * reset the selectionHierarchy
	 *
	 */
	public void clear() {
		stack.clear();
	}

	/**
	 * Gets the deepest Element of this selectionHierarchy and DOES removes it
	 */
	public Object pop() {
		return stack.pop();
	}

	/**
	 * Gets the deepest Element of this selectionHierarchy and DOESN'T remove it
	 */
	public Object peek() {
		return stack.peek();
	}
	
	/**
	 * add a new Element at the end of the selectionHierarchy
	 * @param o
	 */
	protected void push(Object o)
	{
		stack.push(o);
	}
	
	/**
	 * Get the Object at Position i
	 * @param i
	 * @return
	 */
	public Object get(int i)
	{
		return stack.get(i);
	}
}
