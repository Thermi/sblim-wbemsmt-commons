/** 
  *LabeledJSFRadioButtonComponent.java
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
  * Description: Jsf Button with Label
  * 
  */


package org.sblim.wbemsmt.tools.input.jsf;

import javax.faces.component.html.HtmlCommandButton;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.exception.ObjectUpdateException;
import org.sblim.wbemsmt.exception.UpdateControlsException;
import org.sblim.wbemsmt.tools.converter.Converter;
import org.sblim.wbemsmt.tools.input.ActionComponent;

public class JSFButtonComponent extends LabeledJSFInputComponent implements ActionComponent {

	public JSFButtonComponent(DataContainer parent, String labelText, String id, Converter converter, boolean readOnly) {
		super(parent, labelText, id , FacesContext.getCurrentInstance().getApplication().createComponent(HtmlCommandButton.COMPONENT_TYPE), converter,readOnly);
		HtmlCommandButton btn = ((HtmlCommandButton)component);
		btn.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"LabelText}"));
		btn.setValueBinding("onclick", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"JavaScriptConfirmStatement} #{" + id +"JavaScriptWaitStatement}"));
		btn.setStyleClass("submitButton");

		btn.setActionListener(FacesContext.getCurrentInstance().getApplication().createMethodBinding("#{" + id + "Action" + "}",new Class[]{ActionEvent.class}));
	}
	
	/**
	 * ActionListenerCalled by JSF Framwork
	 * @param event
	 * @throws ObjectUpdateException 
	 * @throws UpdateControlsException 
	 */
	public void itemAction(ActionEvent event) throws ObjectUpdateException, UpdateControlsException
	{
		handleAction();
	}

	public String getItemLabelText()
	{
		return getLabelText();
	}

		
}
