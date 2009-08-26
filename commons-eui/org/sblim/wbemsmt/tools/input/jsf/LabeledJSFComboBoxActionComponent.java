/** 
  * LabeledJSFComboBoxActionComponent.java
  *
  * © Copyright IBM Corp.  2009,2005
  *
  * THIS FILE IS PROVIDED UNDER THE TERMS OF THE ECLIPSE PUBLIC LICENSE
  * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
  * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
  *
  * You can obtain a current copy of the Eclipse Public License from
  * http://www.opensource.org/licenses/eclipse-1.0.php
  *
  * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
  *
  * Contributors: 
  * 
  * Description: Jsf Combox Box with Label and on Change action
  * 
  */


package org.sblim.wbemsmt.tools.input.jsf;

import javax.faces.component.UISelectItems;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.converter.Converter;
import org.sblim.wbemsmt.tools.input.ActionComponent;
import org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf;
import org.sblim.wbemsmt.tools.jsf.JsfUtil;

public class LabeledJSFComboBoxActionComponent extends LabeledJSFInputComponent implements LabeledStringArrayInputComponentIf, ActionComponent {

	static long idCount = 0;
	private HtmlOutputText readOnlyText;
	
	public LabeledJSFComboBoxActionComponent(DataContainer parent, String labelText, String id, Converter converter, boolean readOnly) {
		super(parent, labelText, id , FacesContext.getCurrentInstance().getApplication().createComponent(HtmlSelectOneMenu.COMPONENT_TYPE), converter,readOnly);
		
		setComponentBindings1(this,id);
	}

	private static void setComponentBindings1(LabeledJSFComboBoxActionComponent component, String id) {

		String linkId = "LabeledJSFComboBoxActionComponent" + idCount++;
		
		HtmlCommandButton btn = (HtmlCommandButton)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlCommandButton.COMPONENT_TYPE);
		btn.setValue(linkId);
		btn.setStyle("visibility:hidden;width:0px");
		btn.setActionExpression(FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createMethodExpression(FacesContext.getCurrentInstance().getELContext(), "#{" + id + "Action" + "}", Object.class, new Class[]{}));

		HtmlSelectOneMenu menu = ((HtmlSelectOneMenu)component.getComponent());
		menu.setStyleClass("comboBox");
		menu.setValueExpression("value", FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), "#{" + id +"}", Object.class));
		menu.setValueExpression("onchange", FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), "#{" + id +"JavaScriptConfirmStatement} " +
				JsfUtil.STOP_ALL_AJAX_REQUESTS_TRUE + 
				" #{" + id +"JavaScriptWaitStatement}",
				Object.class));
		UISelectItems items = (UISelectItems) FacesContext.getCurrentInstance().getApplication().createComponent(UISelectItems.COMPONENT_TYPE);
		items.setValueExpression("value", FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), "#{" + id +"Values}", Object.class));
		menu.getChildren().add(items);
		
		menu.setOnchange("" +
				"for (i=0; i < document.forms.length; i++) {" +
					"for (j=0; j < document.forms[i].length; j++) {" + 
						"if (document.forms[i].elements[j].value == '" + linkId +"') {" +
							"return document.forms[i].elements[j].click();" +
						"}" +
					"}" +
				"}"
		);		
		
		component.getComponentPanel().getChildren().add(btn);
		component.readOnlyText = component.createLabelForMultipleValues(id, menu,component.readOnlyText);	
		
	}

	/**
	 * ActionListenerCalled by JSF Framwork
	 * @param event
	 * @throws WbemsmtException 
	 * @throws WbemsmtException 
	 */
	public String itemAction() throws WbemsmtException
	{
		return handleAction();
	}

	
	public void installProperties(LabeledJSFInputComponent comp, String prefix) {
		super.installProperties(comp, prefix);
		setComponentBindings1((LabeledJSFComboBoxActionComponent) comp,prefix);
	}	

	
}
