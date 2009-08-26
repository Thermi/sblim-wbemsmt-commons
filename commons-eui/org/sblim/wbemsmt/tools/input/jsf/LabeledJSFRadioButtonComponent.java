/** 
  *LabeledJSFRadioButtonComponent.java
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
  * Description: Jsf Radio Buttons with Label
  * 
  */

package org.sblim.wbemsmt.tools.input.jsf;

import java.util.logging.Level;

import javax.faces.component.UIComponent;
import javax.faces.component.UISelectItems;
import javax.faces.component.html.HtmlOutputLabel;
import javax.faces.component.html.HtmlPanelGroup;
import javax.faces.component.html.HtmlSelectOneRadio;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.tools.converter.Converter;
import org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf;
import org.sblim.wbemsmt.tools.jsf.JavascriptUtil;

public class LabeledJSFRadioButtonComponent extends LabeledJSFInputComponent implements LabeledStringArrayInputComponentIf {

	private HtmlOutputLabel readOnlyLabel;

	public LabeledJSFRadioButtonComponent(DataContainer parent, String labelText, String id, Converter converter, boolean readOnly) {
		super(parent, labelText, id , FacesContext.getCurrentInstance().getApplication().createComponent(HtmlSelectOneRadio.COMPONENT_TYPE), converter,readOnly);
		setComponentExpressions1(this, id);
	}
	
	/**
	 * Create a lable as readOnly representation for a radio button
	 * @param id
	 * @param writeableComponent
	 */

	protected void createReadOnlyRadioButton(String id, HtmlSelectOneRadio writeableComponent) {
		
		//overwrite the rendered State of the component
		writeableComponent.setValueExpression("rendered", FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), "#{" + id +"Rendered" + " && !" + id +"Disabled}", Object.class));
		

		//add the table to ComponentPanel.If the ComponentPanel not exists - create one and add the writableComponent first 
		UIComponent panel = getComponentPanel();
		if (panel == null)
		{
			panel = (HtmlPanelGroup)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGroup.COMPONENT_TYPE);			
			panel.getChildren().add(writeableComponent);
		}

		//Add the label to the col
		boolean newLabel = readOnlyLabel == null;
		if (readOnlyLabel == null)
		{
			readOnlyLabel = (HtmlOutputLabel)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputLabel.COMPONENT_TYPE);			
		}
		readOnlyLabel.setValueExpression("value", FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), "#{" + id +"SelectedReadOnlyRadioButtonValue}", Object.class));
		readOnlyLabel.setValueExpression("rendered", FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), "#{" + id +"Rendered" + " && " + id +"Disabled}", Object.class));
		
		if (newLabel)
		{
			getComponentPanel().getChildren().add(readOnlyLabel);
		}
	}		
	
	public void installProperties(LabeledJSFInputComponent comp, String prefix) {
		super.installProperties(comp, prefix);
		setComponentExpressions1((LabeledJSFRadioButtonComponent) comp,prefix);
	}

	private static void setComponentExpressions1(LabeledJSFRadioButtonComponent component, String id) {
		HtmlSelectOneRadio menu = ((HtmlSelectOneRadio)component.getComponent());
		
		setComponentExpressions(menu, id);
		
		component.createReadOnlyRadioButton(id, menu);	
	}

    public static void setComponentExpressions(HtmlSelectOneRadio menu, String id) {
        //prevents the validator to be called
		menu.setRequired(false);
		
		menu.setOnchange(JavascriptUtil.getInputFieldValueChangedCall());
		
		String expression = "#{" + id +"}";
		if (logger.isLoggable(Level.FINE)) {
			logger.fine("Create expression for Element " + id + " : " + expression);
		}
		menu.setValueExpression("value", FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), expression, Object.class));
		
		UISelectItems items = (UISelectItems) FacesContext.getCurrentInstance().getApplication().createComponent(UISelectItems.COMPONENT_TYPE);
		
		expression = "#{" + id +"Values}";
		if (logger.isLoggable(Level.FINE)) {
			logger.fine("Create expression for Element " + id + " : " + expression);
		}
		items.setValueExpression("value", FacesContext.getCurrentInstance().getApplication().getExpressionFactory().createValueExpression(FacesContext.getCurrentInstance().getELContext(), expression, Object.class));
		menu.getChildren().add(items);
    }
	
	
}
