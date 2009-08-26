/** 
  *LabeledJSFRadioButtonComponent.java
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
  * Description: Jsf Button with Label
  * 
  */


package org.sblim.wbemsmt.tools.input.jsf;

import javax.faces.component.html.HtmlCommandButton;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.exception.WbemsmtException;
import org.sblim.wbemsmt.tools.converter.Converter;
import org.sblim.wbemsmt.tools.input.ActionComponent;
import org.sblim.wbemsmt.tools.jsf.JsfUtil;

public class JSFButtonComponent extends LabeledJSFInputComponent implements ActionComponent {

	public JSFButtonComponent(DataContainer parent, String labelText, String id, Converter converter, boolean readOnly) {
		super(parent, labelText, id , FacesContext.getCurrentInstance().getApplication().createComponent(HtmlCommandButton.COMPONENT_TYPE), converter,readOnly);
		HtmlCommandButton btn = ((HtmlCommandButton)component);
		setComponentExpressions(btn,id);
	}
	
	
	public static void setComponentExpressions(HtmlCommandButton btn, String id) {
		btn.setValueExpression("value", FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), ("#{" + id +"LabelText}"), Object.class));
		btn.setValueExpression("onclick", FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), 
					"#{" + id +"JavaScriptConfirmStatement} " + JsfUtil.STOP_ALL_AJAX_REQUESTS_TRUE +  "  #{" + id +"JavaScriptWaitStatement}", 
						Object.class));
		btn.setStyleClass("submitButton");
		btn.setActionExpression(FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createMethodExpression(FacesContext.getCurrentInstance().getELContext(), 
					"#{" + id + "Action" + "}",
					Object.class,
					new Class[]{}));
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

	public String getItemLabelText()
	{
		return getLabelText();
	}
	
	public void installProperties(LabeledJSFInputComponent comp, String prefix) {
		super.installProperties(comp, prefix);
		HtmlCommandButton btn = (HtmlCommandButton) comp.getComponent();
		setComponentExpressions(btn,prefix);
	}

		
}
