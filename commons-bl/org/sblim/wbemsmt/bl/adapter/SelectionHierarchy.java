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

import org.sblim.wbemsmt.bl.fco.AbstractWbemsmtFco;

/**
  * Description: Class for selecting Objects within an adapter class the
  * subclasses can use the push Method to add new Object and to validate if the Object can be added
  * 
  * Wrapper class for java.util.Stack
  */
public class SelectionHierarchy {

    /**
     * the internal used stack
     */
	Stack stack = new Stack();

	/**
	 * return the number of elements currently selected
	 * @return the number of elements currently selected
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
	 * Gets the element at the top of this selectionHierarchy and DOES removes it
	 * @return the element at at the top 
	 * @see Stack#pop()
	 */
	public Object pop() {
		return stack.pop();
	}

	/**
	 * Gets the element at the top of this selectionHierarchy and DOESN'T remove it
     * @return the element at at the top 
     * @see Stack#peek()
	 */
	public Object peek() {
		return stack.peek();
	}
	
	/**
	 * add a new Element at the top of the selectionHierarchy
	 * @param fco the object to add
	 * @
	 * 
	 */
	protected void push(AbstractWbemsmtFco fco)
	{
		stack.push(fco);
	}
	
	/**
	 * Get the Object at Position i
	 * @param i the position (from 0 to {@link #size()} -1
	 * @return the object
	 */
	public Object get(int i)
	{
		return stack.get(i);
	}
}
