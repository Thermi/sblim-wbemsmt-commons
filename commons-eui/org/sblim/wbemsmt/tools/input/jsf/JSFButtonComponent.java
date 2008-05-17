/** 
  *LabeledJSFRadioButtonComponent.java
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
		setComponentBindings(btn,id);
	}
	
	
	public static void setComponentBindings(HtmlCommandButton btn, String id) {
		btn.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"LabelText}"));
		btn.setValueBinding("onclick", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"JavaScriptConfirmStatement} " 
				+ JsfUtil.STOP_ALL_AJAX_REQUESTS_TRUE  
				+  "  #{" + id +"JavaScriptWaitStatement}"));
		btn.setStyleClass("submitButton");
		btn.setAction(FacesContext.getCurrentInstance().getApplication().createMethodBinding("#{" + id + "Action" + "}",new Class[]{}));
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
		setComponentBindings(btn,prefix);
	}

		
}
