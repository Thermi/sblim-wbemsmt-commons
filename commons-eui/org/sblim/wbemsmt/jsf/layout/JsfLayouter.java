 /** 
  * JsfLayouter.java
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
  * Description: Layouter baseclass for JSF panels.
  * 
  */

package org.sblim.wbemsmt.jsf.layout;

import javax.faces.component.UIComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.component.html.HtmlPanelGroup;
import javax.faces.context.FacesContext;
import javax.faces.el.ValueBinding;

import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.tools.jsf.BasePanel;
import org.sblim.wbemsmt.webapp.jsf.LocaleManagerBean;

public class JsfLayouter {
	
	public static void addComponent(UIComponentBase parent, LabeledJSFInputComponent component) {
		BasePanel.addComponent(parent, component);
	}

	protected HtmlOutputText getDummyLabel() {
		return (HtmlOutputText) create(HtmlOutputText.COMPONENT_TYPE);
	}

	protected HtmlOutputText getLabel(String text) {
		HtmlOutputText result = (HtmlOutputText) create(HtmlOutputText.COMPONENT_TYPE);
		result.setValue(text);
		return result;
	}

	protected HtmlOutputText getLabel(ValueBinding valueBindingForText) {
		HtmlOutputText result = (HtmlOutputText) create(HtmlOutputText.COMPONENT_TYPE);
		result.setValueBinding("value",valueBindingForText);
		return result;
	}

	protected HtmlOutputText getLabelWithBoundValue(String appName,String key)
	{
		LocaleManagerBean localeManager = (LocaleManagerBean) BeanNameConstants.LOCALE_MANAGER.getBoundValue(FacesContext.getCurrentInstance());
		return getLabel(localeManager.getBinding(appName, key));
		
	}
	
	public UIComponent create(String componentType) {
		UIComponent component = FacesContext.getCurrentInstance().getApplication().createComponent(componentType);
		return component;
	}

	public HtmlPanelGrid createTable(int columns, String cellpadding, String cellspacing) {
		HtmlPanelGrid grid = (HtmlPanelGrid) create(HtmlPanelGrid.COMPONENT_TYPE);
		grid.setColumns(columns);
		grid.setCellpadding(cellpadding);
		grid.setCellspacing(cellspacing);
		return grid;
	}	

	public HtmlPanelGroup createPanelGroup() {
		HtmlPanelGroup group = (HtmlPanelGroup) create(HtmlPanelGroup.COMPONENT_TYPE);
		return group;
	}

	/**
	 * Add the label and the input component of the component ic to the table
	 * first the label is addded and then the component
	 * 
	 * @param grid
	 * @param ic
	 */
	public void addToTable(HtmlPanelGrid grid, LabeledJSFInputComponent ic) {
		grid.getChildren().add(ic.getLabelPanel());
		grid.getChildren().add(ic.getComponentPanel());
	}	

}
