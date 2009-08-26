/** 
 * MultiLineBasePanel.java
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
 * Description: BasePanel for a table containg one item per row
 * 
 */
package org.sblim.wbemsmt.tools.jsf;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;

public abstract class MultiLineBasePanel2 extends BasePanel {
	protected final int index;
	private boolean hasErrors;

	public MultiLineBasePanel2(AbstractBaseCimAdapter adapter,String bindingPrefix, int index) {
		super(adapter, bindingPrefix);
		this.index = index;
	}
	
	public void setHasErrors(boolean hasErrors) {
		this.hasErrors = hasErrors;
	}

	public boolean hasErrors()
	{
		return hasErrors;
	}
    
	/**
     * MultinePanels are displaying already children and so there is no need to count and create children
     * because currently children cannot have children
     */
    public void countAndCreateChildren()
    {}	
}
