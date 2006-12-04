/** 
  * LabeledJSFCheckboxComponent.java
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
  * Description: Jsf Checkbox with Label which is used to send an event to server on selecting / deselecting the checkbox
  * 
  */

package org.sblim.wbemsmt.tools.input.jsf;

import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlPanelGrid;
import javax.faces.component.html.HtmlSelectBooleanCheckbox;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.exception.ObjectUpdateException;
import org.sblim.wbemsmt.exception.UpdateControlsException;
import org.sblim.wbemsmt.tools.converter.Converter;

public class LabeledJSFCheckboxActionComponent extends LabeledJSFInputComponent {

	protected HtmlSelectBooleanCheckbox checkbox;

	static long idCount = 0;
	
	public LabeledJSFCheckboxActionComponent(DataContainer parent, String labelText,String id, Converter converter, boolean readOnly) {
		super(parent, labelText, id, FacesContext.getCurrentInstance().getApplication().createComponent(HtmlSelectBooleanCheckbox.COMPONENT_TYPE), converter,readOnly);

		HtmlSelectBooleanCheckbox cbox = ((HtmlSelectBooleanCheckbox)getComponent());
		cbox.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"}"));
		String linkId = "LabeledJSFCheckboxActionComponent" + idCount++;
		
		HtmlPanelGrid panel = (HtmlPanelGrid)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGrid.COMPONENT_TYPE);
		panel.setValueBinding("rendered", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"Rendered}"));
		panel.setColumns(2);
		panel.setCellpadding("0");
		panel.setCellspacing("0");
		panel.setBorder(0);
		panel.setWidth("0%");
		
		HtmlCommandButton btn = (HtmlCommandButton)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlCommandButton.COMPONENT_TYPE);
		btn.setValue(linkId);
		btn.setStyle("visibility:hidden;width:0px");
		btn.setActionListener(FacesContext.getCurrentInstance().getApplication().createMethodBinding("#{" + id + "Action" + "}",new Class[]{ActionEvent.class}));
		
		checkbox = ((HtmlSelectBooleanCheckbox)getComponent());
		checkbox.setOnclick("" +
				"for (i=0; i < document.forms.length; i++) {" +
					"for (j=0; j < document.forms[i].length; j++) {" + 
						"if (document.forms[i].elements[j].value == '" + linkId +"') {" +
							"return document.forms[i].elements[j].click();" +
						"}" +
					"}" +
				"}"
		);
		
		panel.getChildren().add(checkbox);
		panel.getChildren().add(btn);
		setComponentPanel(panel);
		
	}

	/**
	 * ActionListenerCalled by JSF Framwork
	 * @param event
	 * @throws ObjectUpdateException 
	 * @throws UpdateControlsException 
	 */
	public void itemAction(ActionEvent event) throws ObjectUpdateException, UpdateControlsException
	{
		if (item == null)
		{
			item = Boolean.TRUE;
		}
		else
		{
			//item = new Boolean(!((Boolean)item).booleanValue());
		}
		
		handleAction();
	}	
}
