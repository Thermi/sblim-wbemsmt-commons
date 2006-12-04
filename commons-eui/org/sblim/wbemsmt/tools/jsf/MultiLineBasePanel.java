/** 
 * MultiLineBasePanel.java
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
 * Description: BasePanel for a table containg one item per row
 * 
 */
package org.sblim.wbemsmt.tools.jsf;

import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;

public abstract class MultiLineBasePanel extends BasePanel {
	protected static final String BINDING_PREFIX_CURRENT_PAGE = "objectActionController.currentEditor.currentEditPage.";
	HtmlPanelGrid panelGrid;
	protected boolean first;

//	public MultiLineBasePanel(AbstractBaseCimAdapter adapter,String bindingPrefix,String title, int cols)
//	{
//		this(adapter,bindingPrefix,title,cols, null);
//	}
	public MultiLineBasePanel(AbstractBaseCimAdapter adapter,String bindingPrefix, String bindingForTitle, String keyForTitle, int cols, HtmlPanelGrid grid) {
		super(adapter, bindingPrefix);
		panelGrid = grid;
		first = panelGrid == null;
		if (panelGrid == null)
		{
			panelGrid = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
			panelGrid.setColumns(cols);
			StringBuffer sb = new StringBuffer();
			for (int i=0; i < cols; i++)
			{
				if (sb.length() > 0)
				{
					sb.append(", ");
				}
				sb.append("multiLineContent");
			}
			panelGrid.setColumnClasses(sb.toString());
			panelGrid.setRowClasses("multiLineRowOdd,multiLineRowEven");
			
			createTitleValueBindingForMultiline(panelGrid,bindingForTitle,keyForTitle);
		}
	}
	
	protected void addComponents(LabeledJSFInputComponent[] inputComponent)
	{
		if (first)
		{
			for (int i = 0; i < inputComponent.length; i++) {
				LabeledJSFInputComponent component = inputComponent[i];
				component.getLabel().setStyle("font-weight:bold;");
				panelGrid.getChildren().add(component.getLabel());
			}
		}
		
		for (int i = 0; i < inputComponent.length; i++) {
			LabeledJSFInputComponent component = inputComponent[i];
			if (component.getComponentPanel() != null)
			{
				panelGrid.getChildren().add(component.getComponentPanel());
			}
			else
			{
				panelGrid.getChildren().add(component.getComponent());
			}
		}
		
		
		
		

	}	
	
	public HtmlPanelGrid getInputFieldContainer()
	{
		return panelGrid;
	}

	
}
