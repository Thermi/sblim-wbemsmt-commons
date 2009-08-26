/** 
  * LabeledJSFCheckboxComponent.java
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
  * Description: Jsf Checkbox with Label
  * 
  */

package org.sblim.wbemsmt.tools.input.jsf;

import javax.faces.component.html.HtmlOutputLabel;
import javax.faces.component.html.HtmlSelectBooleanCheckbox;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.tools.converter.Converter;
import org.sblim.wbemsmt.tools.jsf.JavascriptUtil;

public class LabeledJSFCheckboxComponent extends LabeledJSFInputComponent {

	private HtmlOutputLabel readOnlyLabel;

	public LabeledJSFCheckboxComponent(DataContainer parent, String labelText,String id, Converter converter, boolean readOnly) {
		super(parent, labelText, id, FacesContext.getCurrentInstance().getApplication().createComponent(HtmlSelectBooleanCheckbox.COMPONENT_TYPE), converter,readOnly);
		setComponentBindings(this, id);
	}

	private static void setComponentBindings(LabeledJSFCheckboxComponent comp, String id) {
		HtmlSelectBooleanCheckbox cbox = ((HtmlSelectBooleanCheckbox)comp.getComponent());
		setComponentExpressions(cbox, id);
		
		comp.readOnlyLabel = comp.createReadOnlyCheckbox(id,cbox,comp.readOnlyLabel);
	}

    public static void setComponentExpressions(HtmlSelectBooleanCheckbox cbox, String id) {
        cbox.setStyleClass("checkBox");
		cbox.setOnchange(JavascriptUtil.getInputFieldValueChangedCall());
		cbox.setValueExpression("value", FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(
				FacesContext.getCurrentInstance().getELContext(), 
				"#{" + id +"}", 
				Object.class));
    }

	public void installProperties(LabeledJSFInputComponent comp, String prefix) {
		super.installProperties(comp, prefix);
		LabeledJSFCheckboxComponent checkBoxComp = (LabeledJSFCheckboxComponent) comp;
		setComponentBindings(checkBoxComp,prefix);
	}	
	
	
}
