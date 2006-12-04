/** 
  * LabeledJSFMultiComboBoxComponent.java
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
  * Description: Jsf Combox Box with Label
  * 
  */


package org.sblim.wbemsmt.tools.input.jsf;

import javax.faces.component.UISelectItems;
import javax.faces.component.html.HtmlSelectManyMenu;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.tools.converter.Converter;
import org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf;

public class LabeledJSFMultiComboBoxComponent extends LabeledJSFInputComponent implements LabeledStringArrayInputComponentIf {

	public LabeledJSFMultiComboBoxComponent(DataContainer parent, String labelText, String id, Converter converter, boolean readOnly) {
		super(parent, labelText, id , FacesContext.getCurrentInstance().getApplication().createComponent(HtmlSelectManyMenu.COMPONENT_TYPE), converter,readOnly);
//		super(labelText, id, FacesContext.getCurrentInstance().getApplication().createComponent(HtmlInputText.COMPONENT_TYPE) , converter);
		HtmlSelectManyMenu menu = ((HtmlSelectManyMenu)getComponent());
		menu.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"List}"));
		UISelectItems items = (UISelectItems) FacesContext.getCurrentInstance().getApplication().createComponent(UISelectItems.COMPONENT_TYPE);
		items.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"Values}"));
		menu.getChildren().add(items);
	}

}
