/** 
  *LabeledJSFPasswordFieldComponent.java
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
  * Description: Jsf Password Field with Label
  * 
  */

package org.sblim.wbemsmt.tools.input.jsf;

import javax.faces.component.html.HtmlInputSecret;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.tools.converter.Converter;
import org.sblim.wbemsmt.tools.jsf.JavascriptUtil;

public class LabeledJSFPasswordFieldComponent extends LabeledJSFInputComponent {

	public LabeledJSFPasswordFieldComponent(DataContainer parent, String labelText,String id, Converter converter, boolean readOnly) {
		super(parent, labelText, id, FacesContext.getCurrentInstance().getApplication().createComponent(HtmlInputSecret.COMPONENT_TYPE), converter,readOnly);
		setComponentExpressions1(this, id);
	}
	
	public void sizeChanged(Size size) {
		setSize(size);
	}
	
	public void installProperties(LabeledJSFInputComponent comp, String prefix) {
		super.installProperties(comp, prefix);
		setComponentExpressions1((LabeledJSFPasswordFieldComponent) comp,prefix);
	}

	private static void setComponentExpressions1(LabeledJSFPasswordFieldComponent component, String id) {
		HtmlInputSecret txt = ((HtmlInputSecret)component.getComponent());
		setComponentExpressions(txt, id);
	}

    public static void setComponentExpressions(HtmlInputSecret txt, String id) {
        txt.setValueExpression("value", FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), "#{" + id +"}", Object.class));
		txt.setValueExpression("size", FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), "#{" + id +"Size}", Object.class));
		txt.setRedisplay(true);
		txt.setOnchange(JavascriptUtil.getInputFieldValueChangedCall());
    }
	
}
