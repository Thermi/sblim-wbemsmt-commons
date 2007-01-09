/** 
 * LabeledBaseInputComponent.java
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
 * @author: Michael Bauschert <Michael.Bauschert@de.ibm.com>
 *
 * Contributors: 
 * 
 * Description: baseClass for alle components contained in a DataContainer
 * 
 */
package org.sblim.wbemsmt.tools.input;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.tools.converter.Converter;

public abstract class LabeledBaseInputComponent implements LabeledBaseInputComponentIf, ComponentPropertyChangListener {

	protected String labelText;
	/**
	 * itemList is set if the component supports the selection of one value (for example a textfield)
	 */
	protected Object item;
	/**
	 * itemList is set if the component supports the selectionof multiple values (for example a combobox with multiple selection enabled)
	 */
	protected List itemList = new ArrayList();
	protected Object controlValue;
	protected Converter converter;
	protected DataContainer parent;
	protected ComponentProperties componentProperties;
	
	/**
	 * Property is Accessed through ActionComponent Interface which is implemented by the subclasses
	 * @see ActionComponent#isNeedConfirmation()
	 * @see ActionComponent#setNeedConfirmation(boolean)
	 */
	private boolean needConfirmation = false;
	/**
	 * Property is Accessed through ActionComponent Interface which is implemented by the subclasses
	 * @see ActionComponent#isShowWait()
	 * @see ActionComponent#setShowWait(boolean)
	 */
	private boolean showWait = false;
		
	
	protected Logger logger = Logger.getLogger("org.sblim.wbemsmt.tools.input");
	
	public LabeledBaseInputComponent(DataContainer parent, String labelText, Converter converter) {
		this.parent = parent;
		this.labelText = labelText;
		this.converter = converter;
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponent#getItem()
	 */
	public Object getItem() {
		return item;
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponent#setItem(java.lang.Object)
	 */
	public void setItem(Object item) {
		this.item = item;
	}

	
	public List getItemList() {
		return itemList;
	}

	public void setItemList(List itemList) {
		this.itemList = itemList;
	}

	public DataContainer getParent() {
		return parent;
	}

	public void setParent(DataContainer parent) {
		this.parent = parent;
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponent#getLabelText()
	 */
	public String getLabelText() {
		return labelText;
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponent#setLabelText(java.lang.String)
	 */
	public void setLabelText(String labelText) {
		this.labelText = labelText;
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponent#isEmpty()
	 */
	public abstract boolean isEmpty();
	
	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponent#isConvertible()
	 */
	public abstract boolean isConvertible();

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponent#getConvertedControlValue()
	 */
	public abstract Object getConvertedControlValue();
	
	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponent#setControlValue(java.lang.Object)
	 */
	public abstract void setControlValue(Object value);

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponent#setValue(java.lang.Object)
	 */
	public abstract void setValue(Object value);
	
	/**
	 * Gets the ComponentProperties of the InputField
	 * @return
	 */
	public ComponentProperties getProperties()
	{
		if (componentProperties == null)
		{
			componentProperties = new ComponentProperties();
			componentProperties.addComponentPropertyChangListener(this);
		}
		return componentProperties;
	}

	public Converter getConverter() {
		return converter;
	}
	
	/**
	 * Property is Accessed through ActionComponent Interface which is implemented by the subclasses
	 * @see ActionComponent#isNeedConfirmation()
	 * @see ActionComponent#setNeedConfirmation(boolean)
	 */
	public boolean isNeedConfirmation() {
		return needConfirmation;
	}
	/**
	 * Property is Accessed through ActionComponent Interface which is implemented by the subclasses
	 * @see ActionComponent#isNeedConfirmation()
	 * @see ActionComponent#setNeedConfirmation(boolean)
	 */
	public void setNeedConfirmation(boolean needConfirmation) {
		this.needConfirmation = needConfirmation;
	}
	/**
	 * Property is Accessed through ActionComponent Interface which is implemented by the subclasses
	 * @see ActionComponent#isShowWait()
	 * @see ActionComponent#setShowWait(boolean)
	 */
	public boolean isShowWait() {
		return showWait;
	}
	/**
	 * Property is Accessed through ActionComponent Interface which is implemented by the subclasses
	 * @see ActionComponent#isShowWait()
	 * @see ActionComponent#setShowWait(boolean)
	 */
	public void setShowWait(boolean showWait) {
		this.showWait = showWait;
	}		
	
}
