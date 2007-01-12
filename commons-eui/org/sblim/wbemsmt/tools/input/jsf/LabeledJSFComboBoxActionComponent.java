/** 
  * LabeledJSFComboBoxActionComponent.java
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
  * Description: Jsf Combox Box with Label and on Change action
  * 
  */


package org.sblim.wbemsmt.tools.input.jsf;

import javax.faces.component.UISelectItems;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.exception.ObjectUpdateException;
import org.sblim.wbemsmt.exception.UpdateControlsException;
import org.sblim.wbemsmt.tools.converter.Converter;
import org.sblim.wbemsmt.tools.input.ActionComponent;
import org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf;

public class LabeledJSFComboBoxActionComponent extends LabeledJSFInputComponent implements LabeledStringArrayInputComponentIf, ActionComponent {

	static long idCount = 0;
	
	public LabeledJSFComboBoxActionComponent(DataContainer parent, String labelText, String id, Converter converter, boolean readOnly) {
		super(parent, labelText, id , FacesContext.getCurrentInstance().getApplication().createComponent(HtmlSelectOneMenu.COMPONENT_TYPE), converter,readOnly);
		
		String linkId = "LabeledJSFComboBoxActionComponent" + idCount++;
		
		HtmlCommandButton btn = (HtmlCommandButton)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlCommandButton.COMPONENT_TYPE);
		btn.setValue(linkId);
		btn.setStyle("visibility:hidden;width:0px");
		btn.setActionListener(FacesContext.getCurrentInstance().getApplication().createMethodBinding("#{" + id + "Action" + "}",new Class[]{ActionEvent.class}));

		HtmlSelectOneMenu menu = ((HtmlSelectOneMenu)component);
		menu.setStyleClass("comboBox");
		menu.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"}"));
		menu.setValueBinding("onchange", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"JavaScriptConfirmStatement} #{" + id +"JavaScriptWaitStatement}"));
		UISelectItems items = (UISelectItems) FacesContext.getCurrentInstance().getApplication().createComponent(UISelectItems.COMPONENT_TYPE);
		items.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"Values}"));
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
		
		getComponentPanel().getChildren().add(btn);
		createReadOnlyTable(id, menu);	
		
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

}
