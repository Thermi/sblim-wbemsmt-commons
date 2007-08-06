/** 
 * LabeledJSFInputComponent.java
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
 * @author:	Michael Bauschert <Michael.Bauschert@de.ibm.com>
 *
 * Contributors: 
 *              
 *
 * Description: Base class for labeled Input Components in Swing Context
 * 
 */

package org.sblim.wbemsmt.tools.input.jsf;

import java.util.*;
import java.util.logging.Level;

import javax.faces.component.UIComponent;
import javax.faces.component.html.*;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

import org.apache.commons.lang.StringUtils;
import org.sblim.wbemsmt.bl.adapter.AbstractBaseCimAdapter;
import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.MessageList;
import org.sblim.wbemsmt.bl.fielddata.FieldData;
import org.sblim.wbemsmt.bl.tree.ITaskLauncherTreeNode;
import org.sblim.wbemsmt.bl.tree.ITreeSelector;
import org.sblim.wbemsmt.tasklauncher.TaskLauncherTreeNode;
import org.sblim.wbemsmt.tools.beans.BeanNameConstants;
import org.sblim.wbemsmt.tools.converter.Converter;
import org.sblim.wbemsmt.tools.input.LabeledBaseHeaderComponentIf;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponent;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponentIf;
import org.sblim.wbemsmt.tools.jsf.*;
import org.sblim.wbemsmt.tools.resources.ResourceBundleManager;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;
import org.sblim.wbemsmt.util.StringTokenizer;
import org.sblim.wbemsmt.webapp.jsf.ObjectActionControllerBean;
import org.sblim.wbemsmt.webapp.jsf.style.StyleBean;

public abstract class LabeledJSFInputComponent extends LabeledBaseInputComponent implements LabeledBaseHeaderComponentIf
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
	private FieldData fieldData = null;
	
	private boolean rendered = true;
	private boolean itemLabelRendered = true;
	private String[] entries;
	private boolean showAllInReadOnlyView = false;
	private HtmlGraphicImage fieldIndicator;
	private String fieldIndicatorImage;
	private String itemFieldIndicatorAltText;
	private boolean fieldIndicatorRendered;
	private boolean required;
	protected int orientation;
	private boolean hasErrors;
	private boolean isMultiline;
	private boolean isHeader;
	private boolean dependendFieldsHavingErrors;
	
	/**
	 * The suffix of a field label
	 */
	private String suffix;

	public LabeledJSFInputComponent(DataContainer parent, String labelText, String pId, UIComponent component, Converter converter,boolean readOnly)
	{
		super(parent,labelText, converter);
		
		this.isMultiline = parent instanceof MultiLineBasePanel2; 
		
		this.id = asJsfId(pId);
		this.component = component;
		this.component.setId(id);
		
		setComponentBindings(this.component,pId);
		

		componentPanel = (HtmlPanelGroup)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGroup.COMPONENT_TYPE);
		componentPanel.setValueBinding("rendered", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + pId +"Rendered}"));
		componentPanel.getChildren().add(component);
		
		this.labelPanel = (HtmlPanelGroup) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGroup.COMPONENT_TYPE);
		this.labelPanel.setStyle("white-space: nowrap; vertical-align:bottom; padding-top:3px;");
		this.labelPanel.setValueBinding("rendered", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + pId +"LabelRendered}"));

		this.label = (HtmlOutputText) FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE);
		label.setValueBinding("rendered", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + pId +"LabelRendered}"));
		label.setEscape(false);
		
		
		suffix = component instanceof HtmlSelectBooleanCheckbox ? "" : ": ";
		if (!(component instanceof HtmlCommandButton))
		{
			label.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + pId +"LabelText}"));
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
		
		updateFieldIndicatorImage(dependendFieldsHavingErrors);
		
	}

	private void setComponentBindings(UIComponent comp, String binding) {
		comp.setValueBinding("disabled", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + binding +"Disabled}"));
		comp.setValueBinding("rendered", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + binding +"Rendered}"));
		comp.setValueBinding("style", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + binding +"Style}"));
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
	
	public String getItemPlainLabelText()
	{
		return getLabelText();
	}
		
	public String getLabelText() {
		String s = super.getLabelText();
		if (StringUtils.isEmpty(s))
		{
			return s;
		}
		else
		{
			return s + suffix;
		}
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
	 * Returns all the selected values of a multiple value component like a ComboBox as a String
	 * @return
	 */
	public String getItemMultipleValues() {
		
		if (showAllInReadOnlyView)
		{
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < entries.length; i++) {
				String entry = entries[i];
				if (sb.length() > 0)
				{
					sb.append(", ");
				}
				sb.append(entry);
			}
			return sb.toString();
		}
		else
		{
			Object obj = getConvertedControlValue();
			
			if (obj instanceof List) {
				List values = (List) obj;
				StringBuffer sb = new StringBuffer();
				for (Iterator iter = values.iterator(); iter.hasNext();) {
					Number n = (Number) iter.next();
					if (n != null && n.intValue() > 0 && n.intValue() <  getValues().length)
					{
						if (sb.length() > 0)
						{
							sb.append(", ");
						}
						sb.append(getValues()[n.intValue()]);
					}
					else
					{
						return "";
					}
					
				}
			}
			else if (obj instanceof Number) {
				Number n = (Number)obj;
				if (n != null && n.intValue() > 0 && n.intValue() <  getValues().length)
				{
					return getValues()[n.intValue()];
				}
				else
				{
					return "";
				}
			}
			return "";
		}
		
	}
	
	
	/**
	 * gets and converts the Values from the control
	 * for Validation use the getRawControlValue
	 */
	public Object getConvertedControlValue() {
		
		if (component instanceof HtmlInputText
			|| component instanceof HtmlInputSecret
			|| component instanceof HtmlOutputText && !( this instanceof LabeledJSFMemoComponent)
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
		else if (component instanceof HtmlGraphicImage
				 || component instanceof HtmlCommandLink
				 || this instanceof LabeledJSFMemoComponent
				)
		{
			return converter.convertForModel(this);
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
			|| component instanceof HtmlOutputText && !( this instanceof LabeledJSFMemoComponent)	
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
		else if (component instanceof HtmlGraphicImage
				 || component instanceof HtmlCommandLink
				 || this instanceof LabeledJSFMemoComponent
				)
		{
			return false;
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
		else if (component instanceof HtmlOutputText && !( this instanceof LabeledJSFMemoComponent))
		{
			Object o = converter.convertForGui(controlValue);
			item =  o;
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
		else if (component instanceof HtmlGraphicImage
				 || component instanceof HtmlCommandLink
				 || this instanceof LabeledJSFMemoComponent
				)
		{
			Object object  = converter.convertForGui(controlValue);
			setFieldData((FieldData) object);
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
		id = id.replace('/','_');
		return id;
	}

	public void readOnlyChanged(Boolean readOnly) {
		setItemDisabled(readOnly.booleanValue());
	}

	public void visibilityChanged(Boolean readOnly) {
		setItemRendered(readOnly.booleanValue());
		if (! (parent instanceof MultiLineBasePanel2))
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

	public UIComponent getComponentPanel() {
		return componentPanel;
	}

	public UIComponent getComponent() {
		return component;
	}

	public boolean isVisible() {
		return rendered;
	}

	protected String handleAction()
	{
		String result = "";
		
		MessageList.init(parent).clear();
		AbstractBaseCimAdapter adapter = parent.getAdapter();
		try {
			adapter.updateModel(parent,this);

			FacesContext facesContext = FacesContext.getCurrentInstance();
			ObjectActionControllerBean objectActionController = (ObjectActionControllerBean)BeanNameConstants.OBJECT_ACTION_CONTROLLER.getBoundValue(facesContext);
        	ITreeSelector treeSelectorBean = (ITreeSelector)BeanNameConstants.TREE_SELECTOR.getBoundValue(facesContext);
			//force a re-checking of the modified state of the current panel
			objectActionController.clearEditBeansModified();
			
			if (adapter.getActiveModule() == AbstractBaseCimAdapter.ACTIVE_EDIT)
			{
				ITaskLauncherTreeNode selectedNode = objectActionController.getSelectedNode();
				int selectTabIndex = objectActionController.getSelectedTabIndex();
				String selectTabId = objectActionController.getSelectedTabId();

				boolean reloaded = false;
				
				if (adapter.isMarkedForReload())
				{
					adapter.reload();	
					reloaded = true;
				}

				if (adapter.isEditObjectMarkedForReload())
				{
					//reload the node
					adapter.setEditObjectMarkedForReload(false);
					reloaded = true;
				}

				/**
				 * If the business logic set the path to a node try 
				 */
				if (adapter.getPathOfTreeNode() != null)
				{
					TaskLauncherTreeNode node = adapter.getRootNode().findInstanceNode(adapter.getPathOfTreeNode());
					if (node != null)
					{
						
				        treeSelectorBean.setSelectedTaskLauncherTreeNode(node);

				        objectActionController.setSelectedNode(node);
				        
				        //don't revert the changes becuse we entering a new node
				        boolean revert = false;
				        result = node.click(revert);
				        
				        //if after finishing the wizard the same node is active, switch the tabs
				        if (selectedNode != null && selectedNode.getInfo().equals(node.getInfo()))
				        {
				        	objectActionController.setSelectedTabIndex(selectTabIndex);
				        	objectActionController.setSelectedTabId(selectTabId);
				        }
				        selectedNode = node;
						result = result != null ? result : "";
					}
					else
					{
						logger.warning("Node with path " + adapter.getPathOfTreeNode() + " was not found in tree");
					}
					adapter.setPathOfTreeNode(null);
				} 
				
				else if (reloaded)
				{
					result = objectActionController.getSelectedNode().click(false);
					objectActionController.setSelectedNode(selectedNode);
					objectActionController.setSelectedTabIndex(selectTabIndex);
					objectActionController.setSelectedTabId(selectTabId);
				}
				else
				{
					adapter.updateControls(parent);
				}
			}
			else
			{
				adapter.updateControls(parent);
			}
			
			JsfBase.addMessages(parent.getMessagesList());
			
		} catch (Exception e) {
			JsfUtil.handleException(e);
		}
		
		if (StringUtils.isEmpty(result))
		{
			if (adapter.getActiveModule() == AbstractBaseCimAdapter.ACTIVE_EDIT)
			{
				result = EditBean.PAGE_EDIT;
			}
			else if (adapter.getActiveModule() == AbstractBaseCimAdapter.ACTIVE_WIZARD)
			{
				result = "";
			}
			
		}
		
		return result;
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
		updateFieldIndicatorImage(dependendFieldsHavingErrors);
	}
	
	public boolean isRequired() {
		return required;
	}
	
	public void setHasErrors(boolean hasErrors)
	{
		if (this.hasErrors != hasErrors)
		{
			this.hasErrors = hasErrors;
			updateFieldIndicatorImage(dependendFieldsHavingErrors);
		}
	}

	public boolean hasErrors()
	{
		return this.hasErrors;
	}

	public void updateFieldIndicatorImage(boolean dependendFieldsHavingErrors) {
	
		this.dependendFieldsHavingErrors = dependendFieldsHavingErrors;
		if (!isMultiline || isHeader)
		{
			StyleBean style = (StyleBean) BeanNameConstants.STYLE.getBoundValue(FacesContext.getCurrentInstance());
			if (!isMultiline && hasErrors || isHeader && dependendFieldsHavingErrors)
			{
				//errors are not shown in Label if field is multiline (because there is only one label (column header) for all fields
				fieldIndicatorImage = style.getResourceDir() + "/images/fieldIndicatorError.png";
				fieldIndicatorRendered = true;
				itemFieldIndicatorAltText = ResourceBundleManager.getResourceBundle(FacesContext.getCurrentInstance()).getString("fieldError");
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
			
		}
		if (isMultiline)
		{
			if (parent instanceof MultiLineBasePanel2) {
				MultiLineBasePanel2 panel = (MultiLineBasePanel2) parent;
				panel.setHasErrors(hasErrors);
			}
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
		if (isShowWait())
		{
			return JavascriptUtil.getShowWaitCall(getWaitText());
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
	 * Create a label as readOnly representation for multiple values
	 * @param id
	 * @param writeableComponent
	 */

	protected HtmlOutputText createLabelForMultipleValues(String id, UIComponent writeableComponent,HtmlOutputText label1) {

		//overwrite the rendered State of the component
		writeableComponent.setValueBinding("rendered", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"Rendered" + " && !" + id +"Disabled}"));

		
		//we create a table which is used if the List is readOnly
		boolean newLabel = label1 == null;
		if (newLabel)
		{
			label1 = (HtmlOutputText)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE);
			label1.setValueBinding("rendered", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"Rendered" + " && " + id +"Disabled}"));
		}
		label1.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id + "MultipleValues}"));

		

		if (isMultiline())
		{
			if (!getComponentPanel().getChildren().contains(label1))
				getComponentPanel().getChildren().add(label1);
		}
		else
		{
			if (!getLabelPanel().getChildren().contains(label1))
				getLabelPanel().getChildren().add(label1);
		}		
		return label1;
	}
	
	/**
	 * Create a lable as readOnly representation for a checkbox
	 * @param id
	 * @param writeableComponent
	 */

	protected HtmlOutputLabel createReadOnlyCheckbox(String id, HtmlSelectBooleanCheckbox writeableComponent, HtmlOutputLabel label) {
		
		//overwrite the rendered State of the component
		writeableComponent.setValueBinding("rendered", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"Rendered" + " && !" + id +"Disabled}"));
		
		//Add the label to the col
		boolean isNew = label == null;
		if (isNew)
		{
			label = (HtmlOutputLabel)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputLabel.COMPONENT_TYPE);
			//add the table to ComponentPanel.If the ComponentPanel not exists - create one and add the writableComponent first 
			UIComponent panel = getComponentPanel();
			if (panel == null)
			{
				componentPanel = (HtmlPanelGroup)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGroup.COMPONENT_TYPE);			
				getComponentPanel().getChildren().add(writeableComponent);
			}
		}


		if (isMultiline())
		{
			if (!getComponentPanel().getChildren().contains(label))
				getComponentPanel().getChildren().add(label);
		}
		else
		{
			if (!getLabelPanel().getChildren().contains(label))
				getLabelPanel().getChildren().add(label);
		}
		
		label.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"SelectedReadOnlyCheckboxValue}"));
		label.setValueBinding("rendered", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"Rendered" + " && " + id +"Disabled}"));

		return label;
		
	}

	public boolean isMultiline() {
		return this.isMultiline;
	}		
	
	public void setMultiline(boolean isMultiline) {
		this.isMultiline = isMultiline;
	}
	
	public String getItemSelectedReadOnlyCheckboxValue()
	{
		if (item != null)
		{
			boolean multiLine = getParent() instanceof MultiLineBasePanel2;
			
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

	/**
	 * Overwritten so that we can check if the field was modified
	 */
	public void setItem(Object newItem) {
		if (item != null && !item.equals(newItem)
			|| item == null && newItem != null	
			)
			setModified(true);
		
		this.item = newItem;
	}

	public FieldData getFieldData() {
		return fieldData;
	}

	public void setFieldData(FieldData fieldData) {
		this.fieldData = fieldData;
	}

	public int getItemSize() {
		return size.getValue();
	}
	
	public void sizeChanged(Size size) {
		setCssWith(size);
	}

	/**
	 * is called by the subclasses if the subclasses component is having no size attribuet, like label for example
	 * @param size
	 * @see LabeledJSFLabelComponent#sizeChanged(Size)
	 */
	public void setCssWith(Size size) {
		addStyleSheetElement("width", ""+size.getValue() * 4);
	}

	public void setHeader(boolean isHeader) {
		this.isHeader = isHeader;
	}

	public void installProperties(LabeledJSFInputComponent comp, String prefix) {
		//comp.getComponent().setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + prefix +"}"));
		setComponentBindings(comp.getComponent(), prefix);
	}

	/**
	 * Show only selected items in the read only view or all items
	 * Default value is false (show only the selected items)
	 * @return
	 */
	public boolean isShowAllInReadOnlyView() {
		return showAllInReadOnlyView;
	}

	/**
	 * Show only selected items in the read only view or all items
	 * @param showAllInReadOnlyView false = show only the selected items, true show all items
	 */
	public void setShowAllInReadOnlyView(boolean showAllInReadOnlyView) {
		this.showAllInReadOnlyView = showAllInReadOnlyView;
	}


	
	
}

