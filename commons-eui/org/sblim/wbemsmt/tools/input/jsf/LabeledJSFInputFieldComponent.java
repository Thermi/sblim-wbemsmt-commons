/** 
  *LabeledJSFInputFieldComponent.java
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
  * Description: Jsf Input Field with Label
  * 
  */


package org.sblim.wbemsmt.tools.input.jsf;

import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.tools.converter.Converter;

public class LabeledJSFInputFieldComponent extends LabeledJSFInputComponent {

	public LabeledJSFInputFieldComponent(DataContainer parent, String labelText,String id, Converter converter, boolean readOnly) {
		super(parent, labelText, id, FacesContext.getCurrentInstance().getApplication().createComponent(HtmlInputText.COMPONENT_TYPE), converter,readOnly);
		HtmlInputText txt = ((HtmlInputText)getComponent());
		txt.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"}"));
	}

}
