/** 
 * WizardBasePanel.java
 *
 * (C) Copyright IBM Corp. 2005
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
 * Description: BasePanel for Wizards
 * 
 */
package org.sblim.wbemsmt.tools.wizard.jsf;

import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.jsf.BasePanel;

public abstract class WizardBasePanel extends BasePanel {
	protected static final String BINDING_PREFIX_CURRENT_PAGE = "objectActionController.currentWizard.currentPanel.";
	private HtmlPanelGrid outerPanel;
	private HtmlPanelGrid mainPanel;
	private HtmlPanelGrid childPanel;

	
	
	public WizardBasePanel(AbstractBaseCimAdapter adapter, String bindingPrefix, String keyForTitle) {
		super(adapter, bindingPrefix, keyForTitle);
		outerPanel = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
		mainPanel = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
		childPanel = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
		
		setTitle(outerPanel);
		mainPanel.setColumns(2);
		
		outerPanel.setColumns(1);
		outerPanel.getChildren().add(mainPanel);
		outerPanel.getChildren().add(childPanel);
	}
	
	protected void addComponent(LabeledJSFInputComponent inputComponent)
	{
		addComponent(mainPanel,inputComponent);
	}	
	
	public HtmlPanelGrid getInputFieldContainer()
	{
		return outerPanel;
	}

	protected HtmlPanelGrid getPanelForCustomLayout()
	{
		return mainPanel;
	}

	//do nothing but to fullfill the java beans properties convention
	public void setInputFieldContainer(HtmlPanelGrid grid)
	{
	}

	public HtmlPanelGrid getChildPanel() {
		return childPanel;
	}

	public HtmlPanelGrid getMainPanel() {
		return mainPanel;
	}

	public HtmlPanelGrid getOuterPanel() {
		return outerPanel;
	}
	
	

}
