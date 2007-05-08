/** 
 * MultiLineBasePanel.java
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
 * Description: BasePanel for a table containg one item per row
 * 
 */
package org.sblim.wbemsmt.tools.jsf;

import java.util.List;

import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;
import org.sblim.wbemsmt.webapp.jsf.LocaleManagerBean;

public abstract class MultiLinePanel extends BasePanel {
	protected static final String BINDING_PREFIX_CURRENT_PAGE = "objectActionController.currentEditor.currentEditPage.";
	HtmlPanelGrid panelGrid;
	private HtmlPanelGrid outerPanel;
	private String rowClasses;
	private List list;
	private LabeledJSFInputComponent[] headerFields;

	public MultiLinePanel(AbstractBaseCimAdapter adapter,String bindingPrefix, String bindingPrefixOfContainer, String keyForTitle, int cols) {
		super(adapter, bindingPrefix);

		outerPanel = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
		outerPanel.setWidth("100%");
		outerPanel.setColumns(2);
		outerPanel.setCellpadding("0");
		outerPanel.setCellspacing("0");
		outerPanel.setColumnClasses("fill0,fill100");
		outerPanel.setStyleClass("multiLineOuterTable");
		outerPanel.setHeaderClass("multiLineHeader");
		
		HtmlPanelGrid dummyPanel = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
		dummyPanel.setWidth("100%");
		dummyPanel.setCellpadding("0");
		dummyPanel.setCellspacing("0");
		dummyPanel.setStyleClass("multiLineDummyTable");
		HtmlOutputText label = (HtmlOutputText) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE);
		label.setValue("&nbsp;");
		label.setEscape(false);
		dummyPanel.getChildren().add(label);
		
		panelGrid = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
		
		panelGrid.setColumns(cols);
		panelGrid.setCellpadding("0");
		panelGrid.setCellspacing("0");
		panelGrid.setStyleClass("multiLineTable");
		panelGrid.setHeaderClass("multiLineHeader");
		panelGrid.setValueBinding("rowClasses", FacesContext.getCurrentInstance().getApplication().createValueBinding(bindingPrefixOfContainer + ".rowClasses}"));

		StringBuffer sb = new StringBuffer();
		for (int i=0; i < cols; i++)
		{
			if (sb.length() > 0)
			{
				sb.append(", ");
			}
			if (i==0) sb.append("multiLineContentFirst " + getOrientationOfColumnAsCss(i) );
			else if (i==cols-1) sb.append("multiLineContentLast " + getOrientationOfColumnAsCss(i));
			else sb.append("multiLineContent " + getOrientationOfColumnAsCss(i));
			
		}
		panelGrid.setColumnClasses(sb.toString());
		
		createTitleValueBindingForMultiline(outerPanel,bindingPrefixOfContainer + ".titleText}",keyForTitle);
		
		outerPanel.getChildren().add(panelGrid);
		outerPanel.getChildren().add(dummyPanel);
	}

	public void setHeader(LabeledJSFInputComponent[] inputComponent)
	{
		this.headerFields = inputComponent;
		for (int i = 0; i < inputComponent.length; i++) {
			LabeledJSFInputComponent component = inputComponent[i];
			component.getLabelPanel().setStyleClass("multiLineHeaderContent");
			panelGrid.getChildren().add(component.getLabelPanel());
		}
	}	
	
	public void addComponents(LabeledJSFInputComponent[] inputComponent)
	{
		for (int i = 0; i < inputComponent.length; i++) {
			LabeledJSFInputComponent component = inputComponent[i];
			panelGrid.getChildren().add(component.getComponentPanel());
		}
	}	

	public HtmlPanelGrid getInputFieldContainer()
	{
		return panelGrid;
	}

	public HtmlPanelGrid getOuterPanel()
	{
		return outerPanel;
	}

	public void updateRows() {
		updateRows(0);
	}
	
	public void updateRows(int additionalRowsAfterModel) {
		

		for (int i = 0; i < headerFields.length; i++) {
			LabeledJSFInputComponent field = headerFields[i];
			field.updateFieldIndicatorImage();
		}
		
		
		//if there not at least 3 rows available add this rows
		//see Web application design guidelines (http://w3-03.ibm.com/oid/page/5598) for more
		
		int rows = list.size();
		
		//use 4 because the header is displayed also
		int neededRows = Math.max(4,rows+1) + additionalRowsAfterModel;
		
		if (rows+1 < neededRows)
		{
			int columns = panelGrid.getColumns();
			for (int i=0; i < (3-rows)*columns; i++)
			{
				HtmlOutputText label = (HtmlOutputText) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE);
				
				//i==columns means the first field in the second row
				if (i== columns && rows == 0)
				{
					LocaleManagerBean localeManager = (LocaleManagerBean) BeanNameConstants.LOCALE_MANAGER.getBoundValue(FacesContext.getCurrentInstance());
					label.setValueBinding("value", localeManager.getBinding("no.entries"));	
				} else {
					label.setValue("&nbsp;");
					label.setEscape(false);
				}
				panelGrid.getChildren().add(label);
			}
		}
		
		StringBuffer sb = new StringBuffer();
		for (int i=0; i < neededRows; i++)
		{
			boolean rowHasError = false;
			//the first row in the model is the second in the table so ignore the first
			//and also ignore the manually added rows at the end of the table
			if (i > 0 && i-1 < list.size())
			{
				MultiLineBasePanel2 panel = (MultiLineBasePanel2) list.get(i-1);
				rowHasError = panel.hasErrors();
			}
			
			if (sb.length() > 0)
			{
				sb.append(", ");
			}
			if (i==0) sb.append("multiLineRowHeader");
			else if (i%2 == 1) sb.append(rowHasError ? "multiLineRowError" : "multiLineRowWhite");
			else sb.append(rowHasError ? "multiLineRowError" : "multiLineRowGray");
			
		}
		rowClasses = sb.toString();
	}
	
	

	public String getRowClasses() {
		return rowClasses;
	}

	public void setRowClasses(String rowClasses) {
		this.rowClasses = rowClasses;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	protected abstract String getOrientationOfColumnAsCss(int column);
	
}
