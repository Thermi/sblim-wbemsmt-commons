/** 
  *LabeledJSFLabelComponent.java
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
  * Description: two Jsf Labels
  * 
  */

package org.sblim.wbemsmt.tools.input.jsf;

import javax.faces.component.html.HtmlOutputText;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.tools.converter.Converter;

public class LabeledJSFLabelComponent extends LabeledJSFInputComponent {

	public LabeledJSFLabelComponent(DataContainer parent, String labelText,String id, Converter converter,boolean readOnly) {
		super(parent, labelText, id, FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE), converter,readOnly);
		setComponentExpressions1(this,id);
	}
	
	public void installProperties(LabeledJSFInputComponent comp, String prefix) {
		super.installProperties(comp, prefix);
		setComponentExpressions1((LabeledJSFLabelComponent) comp,prefix);
	}

	public static void setComponentExpressions1(LabeledJSFLabelComponent component, String id) {
		HtmlOutputText htmlOutputText = ((HtmlOutputText)component.getComponent());
        setComponentExpressions(htmlOutputText, id);
	}

    public static void setComponentExpressions(HtmlOutputText htmlOutputText, String id) {
        htmlOutputText.setValueExpression("value", FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), "#{" + id +"}", Object.class));
    }
	

}
