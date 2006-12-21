/** 
 * EditBasePanel.java
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
 * Description: BasePanel for Editor Panels
 * 
 */
package org.sblim.wbemsmt.tools.jsf;

import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFInputComponent;

public abstract class EditBasePanel extends BasePanel implements DataContainer {

	protected static final String BINDING_PREFIX_CURRENT_PAGE = "objectActionController.currentEditor.currentEditPage.";
	private HtmlPanelGrid panelGrid;

	public EditBasePanel(AbstractBaseCimAdapter adapter, String bindingPrefix, String keyForTitle) {
		this(adapter,bindingPrefix,keyForTitle, 1);
	}
	
	public EditBasePanel(AbstractBaseCimAdapter adapter, String bindingPrefix, String keyForTitle, int cols) {
		super(adapter, bindingPrefix, keyForTitle );
		panelGrid = (HtmlPanelGrid) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
		panelGrid.setColumns(cols);
		panelGrid.setWidth("100%");
		panelGrid.setCellpadding("0");
		panelGrid.setCellspacing("0");
		setTitle(panelGrid);
	}
	
	protected HtmlPanelGrid getPanelForCustomLayout()
	{
		return getInputFieldContainer();
	}

	protected void addComponent(LabeledJSFInputComponent inputComponent)
	{
		addComponent(panelGrid,inputComponent);
	}

	public HtmlPanelGrid getInputFieldContainer()
	{
		return panelGrid;
	}
	
}
