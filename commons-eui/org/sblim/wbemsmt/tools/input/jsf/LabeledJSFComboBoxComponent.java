/** 
  * LabeledJSFComboBoxComponent.java
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
  * Description: Jsf Combox Box with Label
  * 
  */


package org.sblim.wbemsmt.tools.input.jsf;

import javax.faces.component.UISelectItems;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.tools.converter.Converter;
import org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf;
import org.sblim.wbemsmt.tools.jsf.JavascriptUtil;

public class LabeledJSFComboBoxComponent extends LabeledJSFInputComponent implements LabeledStringArrayInputComponentIf {

	private HtmlOutputText readOnlyText;

	public LabeledJSFComboBoxComponent(DataContainer parent, String labelText, String id, Converter converter, boolean readOnly) {
		super(parent, labelText, id , FacesContext.getCurrentInstance().getApplication().createComponent(HtmlSelectOneMenu.COMPONENT_TYPE), converter,readOnly);
		setComponentBindings1(this,id);
	}

	private static void setComponentBindings1(LabeledJSFComboBoxComponent component, String id) {

		HtmlSelectOneMenu menu = ((HtmlSelectOneMenu)component.getComponent());
		setComponentBindings(menu, id);
		
		component.readOnlyText = component.createLabelForMultipleValues(id, menu,component.readOnlyText);	
	}

    public static void setComponentBindings(HtmlSelectOneMenu menu, String id) {
		menu.setStyleClass("comboBox");
		menu.setOnchange(JavascriptUtil.getInputFieldValueChangedCall());
		menu.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"}"));
		UISelectItems items = (UISelectItems) FacesContext.getCurrentInstance().getApplication().createComponent(UISelectItems.COMPONENT_TYPE);
		items.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"Values}"));
		menu.getChildren().add(items);
	}
	
	public void installProperties(LabeledJSFInputComponent comp, String prefix) {
		super.installProperties(comp, prefix);
		setComponentBindings1((LabeledJSFComboBoxComponent) comp,prefix);
	}	
	
	

}
