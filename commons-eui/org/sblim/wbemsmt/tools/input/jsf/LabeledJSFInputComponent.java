/** 
 * LabeledJSFInputComponent.java
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
 * @author:	Michael Bauschert <Michael.Bauschert@de.ibm.com>
 *
 * Contributors: 
 *              
 *
 * Description: Base class for labeled Input Components in Swing Context
 * 
 */

package org.sblim.wbemsmt.tools.input.jsf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import javax.faces.component.UIColumn;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlDataTable;
import javax.faces.component.html.HtmlGraphicImage;
import javax.faces.component.html.HtmlInputSecret;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlOutputLabel;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.html.HtmlPanelGroup;
import javax.faces.component.html.HtmlSelectBooleanCheckbox;
import javax.faces.component.html.HtmlSelectManyListbox;
import javax.faces.component.html.HtmlSelectManyMenu;
import javax.faces.component.html.HtmlSelectOneListbox;
import javax.faces.component.html.HtmlSelectOneMenu;
import javax.faces.component.html.HtmlSelectOneRadio;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.converter.Converter;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponent;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.jsf.JsfBase;
import org.sblim.wbemsmt.tools.jsf.JsfUtil;
import org.sblim.wbemsmt.tools.jsf.MultiLineBasePanel;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.util.StringTokenizer;
import org.sblim.wbemsmt.webapp.jsf.style.StyleBean;

public class LabeledJSFInputComponent extends LabeledBaseInputComponent
{

	
	protected List itemValues = new ArrayList();
	UIComponent componentPanel = null;
	
	private HtmlOutputText label;
	private HtmlPanelGroup labelPanel;
	protected UIComponent component;
	protected String id;
	private Map styles = null;
	private String itemStyle = null;
	private boolean disabled = false;

	private boolean rendered = true;
	private boolean itemLabelRendered = true;
	private String[] entries;
	private HtmlGraphicImage fieldIndicator;
	private String fieldIndicatorImage;
	private String itemFieldIndicatorAltText;
	private boolean fieldIndicatorRendered;
	private boolean required;
	protected int orientation;
	private boolean hasErrors;
	private boolean isMultiline;
	
	public LabeledJSFInputComponent(DataContainer parent, String labelText, String pId, UIComponent component, Converter converter,boolean readOnly)
	{
		super(parent,labelText, converter);
		
		this.isMultiline = parent instanceof MultiLineBasePanel; 
		
		this.id = asJsfId(pId);
		this.component = component;
		this.component.setId(id);
		this.component.setValueBinding("disabled", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + pId +"Disabled}"));
		this.component.setValueBinding("rendered", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + pId +"Rendered}"));
		this.component.setValueBinding("style", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + pId +"Style}"));

		componentPanel = (HtmlPanelGroup)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGroup.COMPONENT_TYPE);
		componentPanel.getChildren().add(component);
		
		this.labelPanel = (HtmlPanelGroup) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGroup.COMPONENT_TYPE);
		this.labelPanel.setStyle("white-space: nowrap; vertical-align:bottom");

		this.label = (HtmlOutputText) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE);
		label.setValueBinding("rendered", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + pId +"LabelRendered}"));
		label.setEscape(false);
		
		
		String suffix = component instanceof HtmlSelectBooleanCheckbox ? "" : ": ";
		if (!(component instanceof HtmlCommandButton))
		{
			label.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + pId +"LabelText}" + suffix));
		}
		else
		{
			this.label.setValue("");
		}
		
		setItemDisabled(readOnly);
		
		this.fieldIndicator = (HtmlGraphicImage) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlGraphicImage.COMPONENT_TYPE);
		this.fieldIndicator.setValueBinding("alt", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + pId +"FieldIndicatorAltText}"));
		this.fieldIndicator.setValueBinding("title", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + pId +"FieldIndicatorAltText}"));
		this.fieldIndicator.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + pId +"FieldIndicator}"));
		this.fieldIndicator.setValueBinding("rendered", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + pId +"FieldIndicatorRendered}"));

		labelPanel.getChildren().add(fieldIndicator);
		labelPanel.getChildren().add(label);
		
		updateFieldIndicatorImage();
		
	}

	public HtmlPanelGroup getLabelPanel() {
		return labelPanel;
	}

	public HtmlOutputText getLabel() {
		return label;
	}

	public void setLabelText(String text) {
		super.setLabelText(text);
		//this.label.setTitle(text);
	}

	public String getItemLabelText()
	{
		return "<nobr>" + getLabelText() + "</nobr>";
	}
	
	
	public boolean getItemDisabled() {
		return disabled;
	}

	public void setItemDisabled(boolean disabled) {
		this.disabled = disabled;
	}

	public boolean getItemRendered() {
		return rendered;
	}

	public void setItemRendered(boolean rendered) {
		this.rendered = rendered;
	}

	public boolean isItemLabelRendered() {
		return itemLabelRendered;
	}

	public void setItemLabelRendered(boolean itemLabelRendered) {
		this.itemLabelRendered = itemLabelRendered;
	}

	public String getItemStyle() {
		return itemStyle;
	}

	public void setItemStyle(String itemStyle) {
		this.itemStyle = itemStyle;
	}

	public String getItemFieldIndicator() {
		return fieldIndicatorImage;
	}

	public void setItemFieldIndicator(String fieldIndicatorImage) {
		this.fieldIndicatorImage = fieldIndicatorImage;
	}
	
	public String getItemFieldIndicatorAltText() {
		return itemFieldIndicatorAltText;
	}

	public void setItemFieldIndicatorAltText(String itemFieldIndicatorAltText) {
		this.itemFieldIndicatorAltText = itemFieldIndicatorAltText;
	}

	public boolean isItemFieldIndicatorRendered() {
		return fieldIndicatorRendered;
	}

	public void setItemFieldIndicatorRendered(boolean fieldIndicatorRendered) {
		this.fieldIndicatorRendered = fieldIndicatorRendered;
	}

	/**
	 * gets and converts the Values from the control
	 * for Validation use the getRawControlValue
	 */
	public Object getConvertedControlValue() {
		
		if (component instanceof HtmlInputText
			|| component instanceof HtmlInputSecret
			|| component instanceof HtmlOutputText
			)
		{
			return converter.convertForModel(item);
		}
		else if (component instanceof HtmlSelectBooleanCheckbox)
		{
			return converter.convertForModel(item);
		}
		else if (component instanceof HtmlSelectOneListbox)
		{
			return converter.convertForModel(item);
		}		
		else if (component instanceof HtmlSelectManyListbox)
		{
			return converter.convertForModel(itemList);
		}		
		else if (component instanceof HtmlSelectOneMenu)
		{
			return converter.convertForModel(item);
		}		
		else if (component instanceof HtmlSelectManyMenu)
		{
			return converter.convertForModel(itemList);
		}		
		else if (component instanceof HtmlSelectOneRadio)
		{
			return converter.convertForModel(item);
		}		
		else if (component instanceof HtmlCommandButton)
		{
			return converter.convertForModel(item);
		}		
		else
		{
			throw new IllegalArgumentException("Controls wth Type " + component.getClass().getName() + " are not supported.");
		}
	}

	/**
	 * gets the Values direct from the control
	 * for Validation use the getRawControlValue
	 */
	public Object getValue()
	{
		return item;
	}

	public boolean isEmpty()
	{
		if (component instanceof HtmlInputText
			|| component instanceof HtmlInputSecret	
			|| component instanceof HtmlOutputText	
		    )
		{
			return item == null || ((String)item).length() == 0;
		}
		else if (component instanceof HtmlSelectBooleanCheckbox)
		{
//			checkboxes are always set
			return false;
		}
		else if (component instanceof HtmlSelectOneListbox)
		{
			return item == null;
		}		
		else if (component instanceof HtmlSelectOneRadio)
		{
			return item == null;
		}		
		else if (component instanceof HtmlSelectOneMenu)
		{
			return item == null;
		}		
		else if (component instanceof HtmlSelectManyMenu)
		{
			return itemList == null || itemList.size() == 0 ;
		}		
		else if (component instanceof HtmlSelectManyListbox)
		{
			return itemList == null || itemList.size() == 0 ;
		}		
		else if (component instanceof HtmlCommandButton)
		{
			return item == null;
		}		
		else
		{
			throw new IllegalArgumentException("Controls wth Type " + component.getClass().getName() + " are not supported.");
		}
	}
	
	public boolean isConvertible()
	{
		return !isEmpty() && converter.canConvert(item);
	}
	
	public void setControlValue(Object controlValue) {
		if (component instanceof HtmlInputText)
		{
			item =  converter.convertForGui(controlValue);
		}
		else if (component instanceof HtmlInputSecret)
		{
			item =  converter.convertForGui(controlValue);
		}
		else if (component instanceof HtmlOutputText)
		{
			item =  converter.convertForGui(controlValue);
		}
		else if (component instanceof HtmlSelectBooleanCheckbox)
		{
			Boolean b = (Boolean)converter.convertForGui(controlValue);
			item = b;
		}
		else if (component instanceof HtmlSelectOneListbox)
		{
			Object object  = converter.convertForGui(controlValue);
			item = object;
		}		
		else if (component instanceof HtmlSelectOneRadio)
		{
			Object object  = converter.convertForGui(controlValue);
			item = object;
		}		
		else if (component instanceof HtmlSelectOneMenu)
		{
			Object object  = converter.convertForGui(controlValue);
			item = object;
		}		
		else if (component instanceof HtmlSelectManyListbox)
		{
			itemList = (List) converter.convertForGui(controlValue);
		}		
		else if (component instanceof HtmlSelectManyMenu)
		{
			itemList = (List) converter.convertForGui(controlValue);
		}		
		else if (component instanceof HtmlCommandButton)
		{
			Object object  = converter.convertForGui(controlValue);
			item = object;
		}		
		else
		{
			throw new IllegalArgumentException("Controls wth Type " + component.getClass().getName() + " are not supported.");
		}			
	}

	public void setValue(Object object)
	{
		item = object;
	}

	public void addEntries(List list, String[] entries) {
		
		this.entries = entries;
		
		list.clear();
		
		for (int i = 0; entries != null && i < entries.length; i++) {
			String entry = entries[i];
			list.add(new SelectItem("" + i,entry));
		}
	}
	
	public static String asJsfId(String id)
	{
		id = id.replace('?','_');
		id = id.replace('.','_');
		id = id.replace('[','_');
		id = id.replace(']','_');
		id = id.replace('\'','_');
		return id;
	}

	public void readOnlyChanged(Boolean readOnly) {
		setItemDisabled(readOnly.booleanValue());
	}

	public void visibilityChanged(Boolean readOnly) {
		setItemRendered(readOnly.booleanValue());
		if (! (parent instanceof MultiLineBasePanel))
		{
			setItemLabelRendered(readOnly.booleanValue());
		}
	}

	public void bgColorChanged(String bgColor) {
		itemStyle = addToStyle("background-color",bgColor); 
	}

	public void colorChanged(String color) {
		itemStyle = addToStyle("color",color); 
	}
	
	public void addStyleSheetElement(String styleName, String styleValue)
	{
		itemStyle = addToStyle(styleName,styleValue);	
	}

	/**
	 * expects as styleInfo a css format string like name1:value1; name2:value2 ...
	 * @param styleInfo
	 */
	public void addStyleSheetElement(String styleInfo) {
		String[] styles = new StringTokenizer(styleInfo,";").asArray(true, false);
		for (int i = 0; i < styles.length; i++) {
			String style = styles[i];
			String[] nameValue = new StringTokenizer(style,":").asArray(true, false);
			if (nameValue.length == 2)
			{
				addStyleSheetElement(nameValue[0], nameValue[1]);
			}
			else
			{
				throw new IllegalArgumentException("Format of String " + styleInfo + " is not correct. Use name1:value1; name2:value2 ...");
			}
		}
		
	}

	/**
	 * adds the css key-value pair to the current css settings. if the key exists already in the css-setting the 
	 * value is overwritten
	 * @param key
	 * @param value
	 * @return
	 */
	private String addToStyle(String key, String value) {
		
		if (styles == null)
		{
			styles = new HashMap();
		}
		styles.put(key,value);
		StringBuffer sb = new StringBuffer();
		
		Iterator iterator = styles.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry entry = (Map.Entry) iterator.next();
			if(sb.length() > 0)
			{
				sb.append(";");
			}
			sb.append(entry.getKey()).append(":").append(entry.getValue());
		}
		return sb.toString();
	}
	
	public List getItemValues()
	{
		return itemValues;
	}

	public void sizeChanged(int size) {
		
		
	}

	public UIComponent getComponentPanel() {
		return componentPanel;
	}

	public boolean isVisible() {
		return rendered;
	}

	protected void handleAction()
	{
		MessageList.init(parent).clear();
		try {
			parent.getAdapter().updateModel(parent,this);
			parent.getAdapter().updateControls(parent);
			JsfBase.addMessages(parent.getMessagesList());
		} catch (Exception e) {
			JsfUtil.handleException(e);
		}
	}

	public void setValues(String[] entries)
	{
		addEntries(itemValues,entries);
	}

	public String[] getValues() {
		return this.entries;
	}
	
	public void setRequired(boolean required)
	{
		this.required = required;
		updateFieldIndicatorImage();
	}
	
	public boolean isRequired() {
		return required;
	}
	
	public void setHasErrors(boolean hasErrors)
	{
		this.hasErrors = hasErrors;
		updateFieldIndicatorImage();
	}

	public boolean hasErrors()
	{
		return this.hasErrors;
	}

	private void updateFieldIndicatorImage() {
	
		StyleBean style = (StyleBean) BeanNameConstants.STYLE.getBoundValue(FacesContext.getCurrentInstance());
		if (hasErrors && !isMultiline)
		{
			//errors are not shown in Label if field is multiline (because there is only one label (column header) for all fields
			if (!isMultiline)
			{
				fieldIndicatorImage = style.getResourceDir() + "/images/fieldIndicatorError.png";
				fieldIndicatorRendered = true;
				itemFieldIndicatorAltText = ResourceBundleManager.getResourceBundle(FacesContext.getCurrentInstance()).getString("fieldError");
			}
		}
		else if (required)
		{
			fieldIndicatorImage = style.getResourceDir() + "/images/fieldIndicatorRequired.png";
			fieldIndicatorRendered = true;
			itemFieldIndicatorAltText = ResourceBundleManager.getResourceBundle(FacesContext.getCurrentInstance()).getString("fieldRequired");
		}
		else
		{
			fieldIndicatorRendered = false;
			fieldIndicatorImage = style.getResourceDir() + "/images/fieldIndicatorEmpty.png";
		}
		
		if (isMultiline)
		{
			((MultiLineBasePanel)parent).setHasErrors(hasErrors);		
		}
	}


	/**
	 * externalized this statement into this method because the handling via JSF EL is too complex
	 * @return
	 */
	public String getItemJavaScriptConfirmStatement()
	{
		if (isNeedConfirmation())
		{
			WbemSmtResourceBundle resourceBundle = ResourceBundleManager.getResourceBundle(FacesContext.getCurrentInstance());
			return "if (!showConfirm('" +  resourceBundle.getString("continue")  +"')) return false;";
		}
		else
		{
			return "";
		}
	}

	/**
	 * externalized this statement into this method because the handling via JSF EL is too complex
	 * @return
	 */
	public String getItemJavaScriptWaitStatement()
	{
		if (isNeedConfirmation())
		{
			return "showWait();";
		}
		else
		{
			return "";
		}
	}

	/**
	 * Get the orientation of the component
	 * @return
	 * @see LabeledBaseInputComponentIf#LEFT
	 * @see LabeledBaseInputComponentIf#RIGHT
	 * @see LabeledBaseInputComponentIf#CENTER
	 */
	public int getOrientation() {
		return orientation;
	}

	/**
	 * Set the orientation
	 * @param orientation
	 * @see LabeledBaseInputComponentIf#LEFT
	 * @see LabeledBaseInputComponentIf#RIGHT
	 * @see LabeledBaseInputComponentIf#CENTER
	 * 
	 */
	public void setOrientation(int orientation) {
		this.orientation = orientation;
	}

	/**
	 * Create a table as readOnly representation for multiple values
	 * @param id
	 * @param writeableComponent
	 */

	protected void createReadOnlyTable(String id, UIComponent writeableComponent) {

		//overwrite the rendered State of the component
		writeableComponent.setValueBinding("rendered", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"Rendered" + " && !" + id +"Disabled}"));

		
		//we create a table which is used if the List is readOnly
		HtmlDataTable table = (HtmlDataTable)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlDataTable.COMPONENT_TYPE);
		table.setStyleClass("tableAsReadOnlyList");
		table.setCellspacing("0");
		table.setCellpadding("0");
		table.setVar("tableItem");
		table.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"Values}"));
		table.setValueBinding("rendered", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"Rendered" + " && " + id +"Disabled}"));

		//Add the col
		UIColumn col = (UIColumn)FacesContext.getCurrentInstance().getApplication().createComponent(UIColumn.COMPONENT_TYPE);
		table.getChildren().add(col);
		
		//Add the label to the col
		HtmlOutputLabel label = (HtmlOutputLabel)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputLabel.COMPONENT_TYPE);
		label.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{tableItem.label}"));
		col.getChildren().add(label);

		//add the table to ComponentPanel.If the ComponentPanel not exists - create one and add the writableComponent first 
		UIComponent panel = getComponentPanel();
		panel.getChildren().add(table);
	}
	
	/**
	 * Create a lable as readOnly representation for a checkbox
	 * @param id
	 * @param writeableComponent
	 */

	protected void createReadOnlyCheckbox(String id, HtmlSelectBooleanCheckbox writeableComponent) {
		
		//overwrite the rendered State of the component
		writeableComponent.setValueBinding("rendered", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"Rendered" + " && !" + id +"Disabled}"));
		
		//Add the label to the col
		HtmlOutputLabel label = (HtmlOutputLabel)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputLabel.COMPONENT_TYPE);
		label.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"SelectedReadOnlyCheckboxValue}"));
		label.setValueBinding("rendered", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"Rendered" + " && " + id +"Disabled}"));

		//add the table to ComponentPanel.If the ComponentPanel not exists - create one and add the writableComponent first 
		UIComponent panel = getComponentPanel();
		if (panel == null)
		{
			panel = (HtmlPanelGroup)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGroup.COMPONENT_TYPE);			
			panel.getChildren().add(writeableComponent);
		}
		
		boolean multiLine = getParent() instanceof MultiLineBasePanel;
		
		if (multiLine)
		{
			getComponentPanel().getChildren().add(label);
		}
		else
		{
			getLabelPanel().getChildren().add(label);
		}
		
	}		
	
	public String getItemSelectedReadOnlyCheckboxValue()
	{
		if (item != null)
		{
			boolean multiLine = getParent() instanceof MultiLineBasePanel;
			
			if (item instanceof Boolean) 	{
				Boolean idx = (Boolean) item;
				String key = idx.booleanValue() ?  "checkbox.readonly.yes" : "checkbox.readonly.no";
				//normally the label is having no colon so prepend one
				//only do that for ! MultiLineEntries
				return
					(!multiLine ? ": " : "") + 
				    ResourceBundleManager
					.getResourceBundle(new String[]{"messages"}, FacesContext.getCurrentInstance().getApplication().getDefaultLocale())
					.getString(key);
			} else
			{
				logger.log(Level.SEVERE,"Cannot parse as boolean: " + item);
			}
		}
		return "-";
	}	
	
}

