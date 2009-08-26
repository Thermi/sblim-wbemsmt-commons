/** 
  *LabeledJSFMultiListComponent.java
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
  * Description: Jsf List with Label and multiple selections
  * 
  */

package org.sblim.wbemsmt.tools.input.jsf;

import javax.faces.component.UISelectItems;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.html.HtmlSelectManyListbox;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.tools.converter.Converter;
import org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf;
import org.sblim.wbemsmt.tools.jsf.JavascriptUtil;

public class LabeledJSFMultiListComponent extends LabeledJSFInputComponent implements LabeledStringArrayInputComponentIf {

	private int itemSize;
	private HtmlOutputText readOnlyText;
	
	public LabeledJSFMultiListComponent(DataContainer parent, String labelText, String id, Converter converter, boolean readOnly) {
		super(parent, labelText, id , FacesContext.getCurrentInstance().getApplication().createComponent(HtmlSelectManyListbox.COMPONENT_TYPE), converter,readOnly);
		setComponentExpressions1(this,id);
	}
	
	public int getItemSize() {
		return itemSize;
	}

	public void setItemSize(int itemSize) {
		this.itemSize = itemSize;
	}

	public void installProperties(LabeledJSFInputComponent comp, String prefix) {
		super.installProperties(comp, prefix);
		setComponentExpressions1((LabeledJSFMultiListComponent) comp,prefix);
	}

	private static void setComponentExpressions1(LabeledJSFMultiListComponent component, String id) {
		HtmlSelectManyListbox menu = ((HtmlSelectManyListbox)component.getComponent());
		menu.setStyleClass("listBox");
		menu.setValueExpression("value", FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), "#{" + id +"List}", Object.class));
		menu.setValueExpression("size", FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), "#{" + id +"Size}", Object.class));
		menu.setOnchange(JavascriptUtil.getInputFieldValueChangedCall());
		UISelectItems items = (UISelectItems) FacesContext.getCurrentInstance().getApplication().createComponent(UISelectItems.COMPONENT_TYPE);
		items.setValueExpression("value", FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), "#{" + id +"Values}", Object.class));
		menu.getChildren().add(items);
		
		component.readOnlyText = component.createLabelForMultipleValues(id, menu,component.readOnlyText);	
	}
	
	
}
