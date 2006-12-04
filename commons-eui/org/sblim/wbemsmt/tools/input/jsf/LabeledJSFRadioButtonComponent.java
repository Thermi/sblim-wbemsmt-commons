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
  * Description: Jsf Radio Buttons with Label
  * 
  */

package org.sblim.wbemsmt.tools.input.jsf;

import java.util.logging.Level;

import javax.faces.component.UISelectItems;
import javax.faces.component.html.HtmlSelectOneRadio;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.tools.converter.Converter;
import org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf;

public class LabeledJSFRadioButtonComponent extends LabeledJSFInputComponent implements LabeledStringArrayInputComponentIf {

	public LabeledJSFRadioButtonComponent(DataContainer parent, String labelText, String id, Converter converter, boolean readOnly) {
		super(parent, labelText, id , FacesContext.getCurrentInstance().getApplication().createComponent(HtmlSelectOneRadio.COMPONENT_TYPE), converter,readOnly);
//		super(labelText, id, FacesContext.getCurrentInstance().getApplication().createComponent(HtmlInputText.COMPONENT_TYPE) , converter);
		HtmlSelectOneRadio menu = ((HtmlSelectOneRadio)getComponent());
		
		//prevents the validator to be called
		menu.setRequired(false);
		
		String binding = "#{" + id +"}";
		if (logger.isLoggable(Level.FINE)) {
			logger.fine("Create binding for Element " + id + " : " + binding);
		}
		menu.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding(binding));
		
		UISelectItems items = (UISelectItems) FacesContext.getCurrentInstance().getApplication().createComponent(UISelectItems.COMPONENT_TYPE);
		
		binding = "#{" + id +"Values}";
		if (logger.isLoggable(Level.FINE)) {
			logger.fine("Create binding for Element " + id + " : " + binding);
		}
		items.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding(binding));
		menu.getChildren().add(items);
	}
	
}
