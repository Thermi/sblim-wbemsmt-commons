/** 
  *LabeledJSFListComponent.java
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
  * Description: Jsf List with Label
  * 
  */

package org.sblim.wbemsmt.tools.input.jsf;

import javax.faces.component.UISelectItems;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.component.html.HtmlSelectOneListbox;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.tools.converter.Converter;
import org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf;
import org.sblim.wbemsmt.tools.jsf.JavascriptUtil;

public class LabeledJSFListComponent extends LabeledJSFInputComponent implements LabeledStringArrayInputComponentIf {

	private HtmlDataTable readOnlyTable;

	public LabeledJSFListComponent(DataContainer parent, String labelText, String id, Converter converter, boolean readOnly) {
		super(parent, labelText, id , FacesContext.getCurrentInstance().getApplication().createComponent(HtmlSelectOneListbox.COMPONENT_TYPE), converter,readOnly);

		setComponentBindings1(this, id);
	}
	
	public void installProperties(LabeledJSFInputComponent comp, String prefix) {
		super.installProperties(comp, prefix);
		setComponentBindings1((LabeledJSFListComponent) comp,prefix);
	}

	private static void setComponentBindings1(LabeledJSFListComponent component, String id) {
		HtmlSelectOneListbox menu = ((HtmlSelectOneListbox)component.getComponent());
		menu.setStyleClass("listBox");
		menu.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"}"));
		menu.setOnchange(JavascriptUtil.getInputFieldValueChangedCall());
		UISelectItems items = (UISelectItems) FacesContext.getCurrentInstance().getApplication().createComponent(UISelectItems.COMPONENT_TYPE);
		items.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"Values}"));
		menu.getChildren().add(items);
		menu.setValueBinding("rendered", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"Rendered" + " && !" + id +"Disabled}"));
		component.readOnlyTable = component.createReadOnlyTable(id, menu,component.readOnlyTable);	
	}
}
