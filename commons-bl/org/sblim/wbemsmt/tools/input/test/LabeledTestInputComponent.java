 /** 
  * LabeledTestInputComponent.java
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
  * Description: InputComponent for TestClasses
  * 
  */
package org.sblim.wbemsmt.tools.input.test;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.tools.converter.Converter;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponent;

public class LabeledTestInputComponent extends LabeledBaseInputComponent implements TestInputComponentIf {

	private String value;
	private boolean visible= true;
	private boolean required;
	private boolean hasErrors;

	/**
	 * @param parent
	 * @param labelText
	 * @param converter
	 */
	public LabeledTestInputComponent(DataContainer parent, String labelText, String value, Converter converter) {
		super(parent, labelText, converter);
		this.value = value;
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tools.input.LabeledBaseInputComponent#getConvertedControlValue()
	 */
	public Object getConvertedControlValue() {
		return converter.convertForModel(value);
	}

	public boolean isEmpty()
	{
		return value == null;
	}
	
	public boolean isConvertible()
	{
		return !isEmpty() && converter.canConvert(value);
	}

	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tools.input.LabeledBaseInputComponent#setControlValue(java.lang.Object)
	 */
	public void setControlValue(Object value) {
		this.value = (String) converter.convertForGui(value);
	}

	public void setValue(Object value) {
		this.value = ""+value;
	}
	
	/* (non-Javadoc)
	 * @see org.sblim.wbemsmt.tools.input.test.TestInputComponentIf#getValue()
	 */
	public Object getValue() {
		return this.value;
	}

	public void readOnlyChanged(Boolean readOnly) {
		
		
	}

	public void bgColorChanged(String bgColor) {
		
		
	}

	public void colorChanged(String bgColor) {
		
		
	}

	public void sizeChanged(int size) {
		
		
	}

	public void visibilityChanged(Boolean visible) {
		this.visible  = visible.booleanValue();
	}

	public boolean isVisible() {
		return visible;
	}	

	public void setRequired(boolean required)
	{
		this.required = required;
	}
	
	public boolean isRequired() {
		return required;
	}
	
	public void setHasErrors(boolean hasErrors)
	{
		this.hasErrors = hasErrors;
	}

	public boolean hasErrors()
	{
		return this.hasErrors;
	}	
	
}
