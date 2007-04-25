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

public abstract class MultiLineBasePanel extends BasePanel {
	protected static final String BINDING_PREFIX_CURRENT_PAGE = "objectActionController.currentEditor.currentEditPage.";
	HtmlPanelGrid panelGrid;
	protected boolean first;
	private HtmlPanelGrid outerPanel;
	private boolean hasErrors;
	private String rowClasses;
	private List list;
	private MultiLineBasePanel firstRow = null;

	public MultiLineBasePanel(AbstractBaseCimAdapter adapter,String bindingPrefix, String bindingPrefixOfContainer, String keyForTitle, int cols, HtmlPanelGrid grid) {
		super(adapter, bindingPrefix);
		//+1 because the last col is a dummy col
//		cols++;
		
		panelGrid = grid;
		first = panelGrid == null;
		if (panelGrid == null)
		{
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
	}

	protected void addComponents(LabeledJSFInputComponent[] inputComponent)
	{
		if (first)
		{
			for (int i = 0; i < inputComponent.length; i++) {
				LabeledJSFInputComponent component = inputComponent[i];
				component.getLabelPanel().setStyleClass("multiLineHeaderContent");
				panelGrid.getChildren().add(component.getLabelPanel());
			}
			//add a dummy column
//			panelGrid.getChildren().add(FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE));
		}
		
		for (int i = 0; i < inputComponent.length; i++) {
			LabeledJSFInputComponent component = inputComponent[i];
			panelGrid.getChildren().add(component.getComponentPanel());
		}
        //add a dummy column
//		panelGrid.getChildren().add(FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE));
		
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
		
		//if there not at least 3 rows available add this rows
		//see Web application design guidelines (http://w3-03.ibm.com/oid/page/5598) for more
		
		int rows = (int) (panelGrid.getChildren().size() / panelGrid.getColumns());
		
		//use 4 because the header is displayed also
		if (rows < 4)
		{
			int columns = panelGrid.getColumns();
			for (int i=0; i < (4-rows)*columns; i++)
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
			rows = 4;
		}
		
		StringBuffer sb = new StringBuffer();
		for (int i=0; i < rows; i++)
		{
			boolean rowHasError = false;
			//the first row in the model is the second in the table so ignore the first
			//and also ignore the manually added rows at the end of the table
			if (i > 0 && i-1 < list.size())
			{
				MultiLineBasePanel panel = (MultiLineBasePanel) list.get(i-1);
				rowHasError = panel.hasErrors;
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

	public void setFirst(MultiLineBasePanel multiLineBasePanel)
	{
		this.firstRow = multiLineBasePanel;
	}
	
	
	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}

	public void setHasErrors(boolean hasErrors) {
		if (this.hasErrors != hasErrors)
		{
			this.hasErrors = hasErrors;
			//the first Row contains the Panel with all the rows
			firstRow.updateRows();
		}
	}

	
	protected abstract String getOrientationOfColumnAsCss(int column);
	
}
