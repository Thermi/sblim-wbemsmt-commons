/** 
  *LabeledJSFMemoComponent.java
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
  * Description: a Memo Field with a label
  * 
  */

package org.sblim.wbemsmt.tools.input.jsf;

import javax.faces.component.html.HtmlOutputText;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.fielddata.FieldData;
import org.sblim.wbemsmt.bl.fielddata.MemoData;
import org.sblim.wbemsmt.tools.converter.Converter;

public class LabeledJSFMemoComponent extends LabeledJSFInputComponent {

	public LabeledJSFMemoComponent(DataContainer parent, String labelText,String id, Converter converter,boolean readOnly) {
		super(parent, labelText, id, FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE), converter,readOnly);
		setComponentExpressions1(this, id);
	}

	public Object getItem() {
		
		MemoData data = (MemoData) getFieldData();
		
		if (data != null)
		{
			item = data.getText();
		}
		else
		{
			logger.warning("No MemoData set for  " + getItemLabelText());
			item = "";
		}
		return item;
		
	}

	public void setFieldData(FieldData fieldData) {
		super.setFieldData(fieldData);
	}
	
	public void installProperties(LabeledJSFInputComponent comp, String prefix) {
		super.installProperties(comp, prefix);
		setComponentExpressions1((LabeledJSFMemoComponent) comp,prefix);
	}

	private static void setComponentExpressions1(LabeledJSFMemoComponent component, String id) {
		HtmlOutputText txt = ((HtmlOutputText)component.getComponent());
		txt.setValueExpression("value", FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), "#{" + id +"}", Object.class));
		txt.setEscape(false);
	}
	
	
	
	
	
}
