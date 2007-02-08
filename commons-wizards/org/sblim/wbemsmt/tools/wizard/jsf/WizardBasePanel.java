/** 
 * WizardBasePanel.java
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
 * Description: BasePanel for Wizards
 * 
 */
package org.sblim.wbemsmt.tools.wizard.jsf;

import javax.faces.component.UIPanel;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.jsf.BasePanel;
import org.sblim.wbemsmt.tools.wizard.IWizardBasePanel;

public abstract class WizardBasePanel extends BasePanel implements IWizardBasePanel {
	protected static final String BINDING_PREFIX_CURRENT_PAGE = "objectActionController.currentWizard.currentPanel.";
	private HtmlPanelGrid outerPanel;
	private HtmlPanelGrid mainPanel;
	private HtmlPanelGrid childPanel;

	private String subTitle;
	private String keyForSubTitle;
	
	public WizardBasePanel(AbstractBaseCimAdapter adapter, String bindingPrefix, String keyForTitle, String keyForSubTitle, boolean dynamic) {
		super(adapter, bindingPrefix, keyForTitle);

		if (keyForSubTitle != null)
		{
			this.keyForSubTitle = keyForSubTitle;
			this.subTitle = bundle.getString(keyForSubTitle);
		}
		
		
		outerPanel = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
		outerPanel.setStyleClass("wizardPanelOuterPanel");
		outerPanel.setColumnClasses("wizardPanelOuterPanelColumn");
		mainPanel = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
		mainPanel.setStyleClass("wizardPanelMainPanel");
		childPanel = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
		childPanel.setStyleClass("wizardPanelChildPanel");
		
		//setTitle(outerPanel);
		mainPanel.setColumns(1);
		
		outerPanel.setColumns(1);
		outerPanel.getChildren().add(mainPanel);
		outerPanel.getChildren().add(childPanel);
		
		if (dynamic)
		{
			//Currently wizardPanels supporting no ajaxified Panels
			//super.addAjaxPanel(outerPanel);
		}
		
	}
	
	protected void addComponent(LabeledJSFInputComponent inputComponent)
	{
		addComponent(mainPanel,inputComponent);
	}	
	
	public UIPanel getInputFieldContainer()
	{
		return ajaxPanelGroup != null ? (UIPanel) ajaxPanelGroup : (UIPanel) outerPanel;
	}

	public HtmlPanelGrid getPanelForCustomLayout()
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

//	public HtmlPanelGrid getOuterPanel() {
//		return outerPanel;
//	}
	
	public void reload()
	{
		super.reload();
		if (keyForSubTitle != null)
		{
			this.subTitle = bundle.getString(keyForSubTitle);
		}
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tools.wizard.jsf.IWizardBasePanel#getSubTitleText()
	 */
	public String getSubTitleText() {
		subTitle = subTitle.replaceAll("\\n", "<br>");
		subTitle = subTitle.replaceAll("\\r", "");
		return subTitle;
	}
	
    /**
     * Go through all containers and Childs and check if they have required fields
     * @return
     */
    public boolean isRequiredVisible()
    {
    	return DataContainerUtil.havingRequiredFields(this);
    }
    
    /**
     * Go through all containers and Childs and check if they have errors
     * @return
     */
    public boolean isErrorVisible()
    {
    	return DataContainerUtil.havingErrorFields(this);
    }	

}
