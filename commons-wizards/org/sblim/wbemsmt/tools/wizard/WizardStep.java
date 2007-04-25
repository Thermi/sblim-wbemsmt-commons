 /** 
  * WizardStep.java
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
  * Description: DataObject for one WizardStep
  * 
  */
package org.sblim.wbemsmt.tools.wizard;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.exception.WbemSmtException;
import org.sblim.wbemsmt.tools.wizard.container.IWizardContainer;

/**
 * @author Bauschert
 *
 */
public class WizardStep {

	private static final int DEFAULT_LEVEL = 1;
	
	private boolean current = false;
	private boolean visited = false;
	private String pageName = "";
	private IWizardContainer container;
	private int level;
	private AbstractBaseCimAdapter adapter;
	private String bundleKey;
	/**
	 * userdefined steps should not be selectable
	 */
	private boolean userdefined;

	/**
	 * Default level is 1 and text for step is taken from container referenced by pageName
	 * @param container
	 * @param pageName
	 */
	public WizardStep(IWizardContainer container, String pageName) {
		this(container,DEFAULT_LEVEL,pageName,null,null);
	}
	
	/**
	 * Create a Wizardstep for the container referenced by pageName at the given level
	 * @param container
	 * @param level
	 * @param pageName
	 */
	public WizardStep(IWizardContainer container, int level, String pageName) {
		this(container,level,pageName,null,null);
	}

	/**
	 * Default Level is 1
	 * @param container
	 * @param pageName
	 * @param adapter
	 * @param bundleKey
	 */
	public WizardStep(IWizardContainer container, String pageName, AbstractBaseCimAdapter adapter, String bundleKey) {
		this(container,DEFAULT_LEVEL,pageName,adapter,bundleKey);
	}

	public WizardStep(IWizardContainer container, int level, String pageName, AbstractBaseCimAdapter adapter, String bundleKey)
	{
		this.container = container;
		this.pageName = pageName;
		this.level = level;
		this.adapter = adapter;
		this.bundleKey = bundleKey;
		this.userdefined = adapter != null && bundleKey != null;
	}
	
	public boolean isCurrent() {
		return current;
	}
	public void setCurrent(boolean current) {
		this.current = current;
		if (current)
		{
			this.visited = true;
		}
	}
	
	/**
	 * If adapter and bundleKey is set the resovled bundleKey is returned
	 * Otrherwise the caption (getTitleText) of the via pageName referenced container is returned
	 * @return
	 * @throws WbemSmtException
	 */
	public String getText() throws WbemSmtException {
		if (userdefined)
		{
			return adapter.getBundle().getString(bundleKey);
		}
		else
		{
			return ((IWizardBasePanel)container.getPage(pageName)).getTitleText();
		}
	}
	
	public boolean isVisited() {
		return visited;
	}
	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	public String getPageName() {
		return pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public boolean isUserdefined() {
		return userdefined;
	}

	public int getLevel() {
		return level;
	}
	
}
