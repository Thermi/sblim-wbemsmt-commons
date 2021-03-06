/** 
 * LabeledBaseInputComponent.java
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
 * Description: baseClass for alle components contained in a DataContainer
 * 
 */
package org.sblim.wbemsmt.tools.input;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.adapter.DataContainerUtil;
import org.sblim.wbemsmt.tools.converter.Converter;

public abstract class LabeledBaseInputComponent implements LabeledBaseInputComponentIf, ComponentPropertyChangListener {


	
	
	protected String labelText;

	protected boolean modified;
	
	/**
	 * itemList is set if the component supports the selection of one value (for example a textfield)
	 */
	protected Object item;
	/**
	 * itemList is set if the component supports the selectionof multiple values (for example a combobox with multiple selection enabled)
	 */
	protected List<Object> itemList = new ArrayList<Object>();
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
	 * @see ActionComponent#isShowWait()	 * @see ActionComponent#setShowWait(boolean)
	 */
	private boolean showWait = false;
	
	private String waitText = null;
		
	
	protected static Logger logger = Logger.getLogger("org.sblim.wbemsmt.tools.input");

	protected Size size = LabeledBaseInputComponentIf.SIZE_M;
	
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

	
	public List<Object> getItemList() {
		return itemList;
	}

	public void setItemList(List<Object> itemList) {
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

	/**
	 * Set The text for displaying if while showing the wait indicator
	 * @return
	 */
	public String getWaitText() {
		return waitText;
	}

	/**
	 * get the Text for displaying while showing the wait indicator
	 * @param waitText
	 */
	public void setWaitText(String waitText) {
		this.waitText = waitText;
	}

	/**
	 * return true if the field is modified
	 */
	public boolean isModified() {
		return modified;
	}

	/**
	 * Set modified to true or false
	 * @param modified
	 */
	public void setModified(boolean modified) {
		this.modified = modified;
	}		

	/**
	 * Wrapper class for the size
	 * @author Bauschert
	 *
	 */
	public static class Size
	{
		private final int value;

		Size(int value)
		{
			this.value = value;
		}

		public int getValue() {
			return this.value;
		}
	}

	public Size getSize() {
		return size ;
	}

	public void setSize(Size size) {
		this.size = size;
	}
	
    public void copyFrom(LabeledBaseInputComponentIf source)
    {
        DataContainerUtil.copyValues(source,this);
    }
    
	

	
}
