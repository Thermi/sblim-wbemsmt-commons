/** 
  * LabeledJSFCheckboxComponent.java
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
  * Description: Jsf Checkbox with Label which is used to send an event to server on selecting / deselecting the checkbox
  * 
  */

package org.sblim.wbemsmt.tools.input.jsf;

import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlOutputLabel;
import javax.faces.component.html.HtmlSelectBooleanCheckbox;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.exception.ObjectUpdateException;
import org.sblim.wbemsmt.exception.UpdateControlsException;
import org.sblim.wbemsmt.tools.converter.Converter;
import org.sblim.wbemsmt.tools.input.ActionComponent;

public class LabeledJSFCheckboxActionComponent extends LabeledJSFInputComponent implements ActionComponent {

	protected HtmlSelectBooleanCheckbox checkbox;

	private HtmlOutputLabel readOnlyLabel;

	static long idCount = 0;
	
	public LabeledJSFCheckboxActionComponent(DataContainer parent, String labelText,String id, Converter converter, boolean readOnly) {
		super(parent, labelText, id, FacesContext.getCurrentInstance().getApplication().createComponent(HtmlSelectBooleanCheckbox.COMPONENT_TYPE), converter,readOnly);
		setComponentBindings(this, id);
	}

	private static void setComponentBindings(LabeledJSFCheckboxActionComponent actionComponent, String id) {
		HtmlSelectBooleanCheckbox cbox = ((HtmlSelectBooleanCheckbox)actionComponent.getComponent());
		cbox.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"}"));
		cbox.setValueBinding("onclick", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"JavaScriptConfirmStatement} #{" + id +"JavaScriptWaitStatement}"));
		cbox.setStyleClass("checkBox");
		String linkId = "LabeledJSFCheckboxActionComponent" + idCount++;
		
		HtmlCommandButton btn = (HtmlCommandButton)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlCommandButton.COMPONENT_TYPE);
		btn.setValue(linkId);
		btn.setStyleClass("invisibleButton");
		btn.setAction(FacesContext.getCurrentInstance().getApplication().createMethodBinding("#{" + id + "Action" + "}",new Class[]{}));
		
		cbox.setOnclick("" +
				"for (i=0; i < document.forms.length; i++) {" +
					"for (j=0; j < document.forms[i].length; j++) {" + 
						"if (document.forms[i].elements[j].value == '" + linkId +"') {" +
							"return document.forms[i].elements[j].click();" +
						"}" +
					"}" +
				"}"
		);

		// because the checkbox is rendered in front of the text add the invisible button after the text
		// so the way to display is: checkbox - label - invisible button
		// if the space of the invisible is still used by the browser's renderer the layout is not messed up
		if (actionComponent.isMultiline())
		{
			actionComponent.getComponentPanel().getChildren().add(btn);
		}
		else
		{
			actionComponent.getLabelPanel().getChildren().add(btn);
		}
		
		actionComponent.readOnlyLabel = actionComponent.createReadOnlyCheckbox(id,cbox,actionComponent.readOnlyLabel);
	}

	/**
	 * ActionListenerCalled by JSF Framwork
	 * @throws ObjectUpdateException 
	 * @throws UpdateControlsException 
	 */
	public String itemAction() throws ObjectUpdateException, UpdateControlsException
	{
		if (item == null)
		{
			item = Boolean.TRUE;
		}
		else
		{
			//item = new Boolean(!((Boolean)item).booleanValue());
		}
		
		return handleAction();
	}
	
	public void installProperties(LabeledJSFInputComponent comp, String prefix) {
		super.installProperties(comp, prefix);
		setComponentBindings((LabeledJSFCheckboxActionComponent) comp,prefix);
	}	
}
