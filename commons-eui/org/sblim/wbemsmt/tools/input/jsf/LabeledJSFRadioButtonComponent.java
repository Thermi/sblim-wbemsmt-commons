/** 
  *LabeledJSFRadioButtonComponent.java
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
import javax.faces.model.SelectItem;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.tools.converter.Converter;
import org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf;
import org.sblim.wbemsmt.tools.jsf.JavascriptUtil;

public class LabeledJSFRadioButtonComponent extends LabeledJSFInputComponent implements LabeledStringArrayInputComponentIf {

	public LabeledJSFRadioButtonComponent(DataContainer parent, String labelText, String id, Converter converter, boolean readOnly) {
		super(parent, labelText, id , FacesContext.getCurrentInstance().getApplication().createComponent(HtmlSelectOneRadio.COMPONENT_TYPE), converter,readOnly);
//		super(labelText, id, FacesContext.getCurrentInstance().getApplication().createComponent(HtmlInputText.COMPONENT_TYPE) , converter);
		HtmlSelectOneRadio menu = ((HtmlSelectOneRadio)component);
		
		//prevents the validator to be called
		menu.setRequired(false);
		
		menu.setOnchange(JavascriptUtil.getInputFieldValueChangedCall());
		
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
		
		createReadOnlyRadioButton(id, menu);	
		
	}
	
	/**
	 * Create a lable as readOnly representation for a radio button
	 * @param id
	 * @param writeableComponent
	 */

	protected void createReadOnlyRadioButton(String id, HtmlSelectOneRadio writeableComponent) {
		
		//overwrite the rendered State of the component
		writeableComponent.setValueBinding("rendered", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"Rendered" + " && !" + id +"Disabled}"));
		
		//Add the label to the col
		HtmlOutputLabel label = (HtmlOutputLabel)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputLabel.COMPONENT_TYPE);
		label.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"SelectedReadOnlyRadioButtonValue}"));
		label.setValueBinding("rendered", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"Rendered" + " && " + id +"Disabled}"));

		//add the table to ComponentPanel.If the ComponentPanel not exists - create one and add the writableComponent first 
		UIComponent panel = getComponentPanel();
		if (panel == null)
		{
			panel = (HtmlPanelGroup)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGroup.COMPONENT_TYPE);			
			panel.getChildren().add(writeableComponent);
		}
		getComponentPanel().getChildren().add(label);
	}		
	
	public String getItemSelectedReadOnlyRadioButtonValue()
	{
		if (item != null)
		{
			if (item instanceof String) {
				String idx = (String) item;
				try {
					if (idx.length() == 0)
					{
						return "-";
					}
					else
					{
						return  ((SelectItem)itemValues.get(Integer.parseInt(idx))).getLabel();
					}
				} catch (NumberFormatException e) {
					logger.log(Level.SEVERE,"Cannot parse as int", e);
				}
				
			} else if (item instanceof Number)
			{
				Number idx = (Number) item;
				return  ((SelectItem)itemValues.get(idx.intValue())).getLabel();
			} else
			{
				logger.log(Level.SEVERE,"Cannot parse as int: " + item);
			}
		}
		return "-";
	}
	
}
