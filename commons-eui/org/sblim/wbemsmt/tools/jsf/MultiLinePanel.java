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

import javax.faces.component.UIColumn;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.component.html.HtmlPanelGroup;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;

public abstract class MultiLinePanel extends BasePanel {
	protected static final String BINDING_PREFIX_CURRENT_PAGE = "objectActionController.currentEditor.currentEditPage.";
	HtmlDataTable dataTable;
	private HtmlPanelGrid outerPanel;
	private String rowClasses = "multiLineRowWhite,multiLineRowGray";
	private List list;
	private LabeledJSFInputComponent[] headerFields;
	protected int cols;
	
	HtmlPanelGroup customFooterPanel;
	private final String rolename;

	/**
	 * @param adapter
	 * @param bindingPrefix
	 * @param bindingPrefixOfContainer
	 * @param keyForTitle
	 * @param rolename
	 * @param cols
	 */
	public MultiLinePanel(AbstractBaseCimAdapter adapter,String bindingPrefix, String bindingPrefixOfContainer, String keyForTitle, String rolename, int cols) {
		super(adapter, bindingPrefix);
		this.rolename = rolename;
		this.cols = cols;

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
		
		dataTable = (HtmlDataTable) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlDataTable.COMPONENT_TYPE);
		dataTable.setVar("item");
		dataTable.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + bindingPrefix +  rolename + "ForUI}"));
		dataTable.setHeaderClass("multiLineRowHeader left");
		//TODO add the same orientation for the header like for the cells
		dataTable.setValueBinding("rowClasses", FacesContext.getCurrentInstance().getApplication().createValueBinding(bindingPrefixOfContainer +  ".rowClasses}"));
		dataTable.setCellpadding("0");
		dataTable.setCellspacing("0");
		dataTable.setStyleClass("multiLineTable");
		
		customFooterPanel = (HtmlPanelGroup) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGroup.COMPONENT_TYPE);

		HtmlPanelGroup outerFooterPanel = (HtmlPanelGroup) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGroup.COMPONENT_TYPE);
		outerFooterPanel.getChildren().add(customFooterPanel);
		
		
		HtmlOutputText noEntriesFooter = (HtmlOutputText) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE);
		noEntriesFooter.setValueBinding("value",FacesContext.getCurrentInstance().getApplication().createValueBinding("#{messages.noEntries}") );
		noEntriesFooter.setValueBinding("styleClass",FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + bindingPrefix +  rolename +  "AvailableFooterClass}") );
		noEntriesFooter.setStyle("width:200px;white-space: nowrap;");
		outerFooterPanel.getChildren().add(noEntriesFooter);
		
		dataTable.getFacets().put("footer", outerFooterPanel);
		dataTable.setValueBinding("footerClass",FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + bindingPrefix +  rolename +  "FooterClass}") );

		
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
		dataTable.setColumnClasses(sb.toString());
		
		createTitleValueBindingForMultiline(outerPanel,bindingPrefixOfContainer + ".titleText}",keyForTitle);
		
		outerPanel.getChildren().add(dataTable);
		outerPanel.getChildren().add(dummyPanel);
	}

	public void setHeader(LabeledJSFInputComponent[] inputComponent)
	{
		setHeader(inputComponent,null);
	}

	//TODO rename to setFields
	public void setHeader(LabeledJSFInputComponent[] inputComponent, String[] names)
	{
		this.headerFields = inputComponent;
		for (int i = 0; i < inputComponent.length; i++) {
			LabeledJSFInputComponent node = inputComponent[i];

			if (names != null)
			{
				//ensure that the Component know that it's a multiline component
				node.setMultiline(true);
				node.installProperties(node,"item." + names[i] +".item");
			}

			UIColumn column = (UIColumn) FacesContext.getCurrentInstance().getApplication().createComponent(UIColumn.COMPONENT_TYPE);
			
			String expr = "#{" + bindingPrefix + rolename + "Panel.headerVisible[" + i + "]}";
			column.setValueBinding("rendered", FacesContext.getCurrentInstance().getApplication().createValueBinding(expr));
			
			
			
			//TODO set orientation of LabelPanel WelcomeItemDataContainer_AsItems_InWelcomeDataContainerImpl.orientationOfColumnAsCss[0]
			column.getFacets().put("header", node.getLabelPanel());
			column.getChildren().add(node.getComponentPanel());
			addDummy(column);
			dataTable.getChildren().add(column);

			
		}
	}	
	
	
	public boolean[] getHeaderVisible()
	{
		boolean[] result = new boolean[headerFields.length];
		for (int i = 0; i < result.length; i++) {
			result[i] = headerFields[i].isVisible();
		}
		return result;
	}
	
	   private void addDummy(UIColumn column) {
			HtmlOutputText dummy = (HtmlOutputText) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE);
			dummy.setValue("&nbsp;");
			dummy.setEscape(false);
			column.getChildren().add(dummy);
		}
	
	
	public void addComponents(LabeledJSFInputComponent[] inputComponent)
	{
	}	

	public HtmlDataTable getInputFieldContainer()
	{
		return dataTable;
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
			boolean error = getDependentFieldsHavingError(i);
			field.updateFieldIndicatorImage(error);
		}
		
		StringBuffer sb = new StringBuffer();
		for (int i=0; i < list.size() || i < 3; i++)
		{
			MultiLineBasePanel2 panel = i < list.size() ? (MultiLineBasePanel2) list.get(i) : null;
			boolean rowHasError = panel != null && panel.hasErrors();
			
			if (sb.length() > 0)
			{
				sb.append(", ");
			}
			if (i%2 == 0) sb.append(rowHasError ? "multiLineRowError" : "multiLineRowWhite");
			else sb.append(rowHasError ? "multiLineRowError" : "multiLineRowGray");
			
		}
		rowClasses = sb.toString();
	}
	
	

	private boolean getDependentFieldsHavingError(int fieldidx) {
		
		for (int containerCount=0; containerCount < list.size(); containerCount++)
		{
			DataContainer dataContainer = (DataContainer) list.get(containerCount);
			LabeledBaseInputComponentIf comp =(LabeledBaseInputComponentIf) dataContainer.getFields().get(fieldidx);
			if (comp.hasErrors())
			{
				return true;
			}
		}
		return false;
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

	public HtmlPanelGroup getCustomFooter() {
		return customFooterPanel;
	}

	public boolean isHavingCustomFooter() {
		return getCustomFooter().getChildren().size() > 0;
	}
	
	
	
}
