/** 
 * LabeledBaseInputComponentIf.java
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
 * Description: Interface for InputComponents
 * 
 */

package org.sblim.wbemsmt.tools.input;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.tools.converter.Converter;

public interface LabeledBaseInputComponentIf {

	public static final int LEFT = 0; 
	public static final int CENTER = 1; 
	public static final int RIGHT = 2; 
	
	public abstract Object getItem();

	public abstract void setItem(Object item);

	public abstract String getLabelText();

	public abstract void setLabelText(String labelText);

	/**
	 * returns true if the field value is empty
	 * @return
	 */
	public abstract boolean isEmpty();

	/**
	 * returns true if the value can be converted.
	 * 
	 * if the value is not set set this Method should return false.
	 * 
	 * @return
	 */
	public abstract boolean isConvertible();

	/**
	 * retrieves the value of the control for setting it to the Model
	 * Implementors should use this method with a converter using the converter.convertForModel Method
	 * @param value
	 * @see Converter#convertForModel(Object)
	 */
	public abstract Object getConvertedControlValue();

	/**
	 * Sets the value of the control
	 * Implementors should use this method with a converter using the converter.convertForGui Method
	 * @param value
	 * @see Converter#convertForGui(Object)
	 */
	public abstract void setControlValue(Object value);

	/**
	 * Used to set the Value direct, without converter, should be used only
	 * if you know what you doing e.g. for the tests to set the values
	 * @param value
	 */
	public abstract void setValue(Object value);
	
	/**
	 * Used to get the Value direct, without converter, should be used only
	 * if you know what you doing e.g. for the tests to set the values
	 * @param value
	 */
	public abstract Object getValue();

	/**
	 * Sets the parent DataContainer
	 * @param dataContainer
	 */
	public void setParent(DataContainer dataContainer);
	
	/**
	 * Gets the data Container
	 * @return
	 */
	public DataContainer getParent();
	
	/**
	 * Gets the ComponentProperties of the InputField
	 * If values are changed in the ComponentProperties the ComponentProperties 
	 * calls all his registered ComponentPropertyChangListener 
	 * @return
	 */
	public ComponentProperties getProperties();
	
	/**
	 * Gets the converter
	 * @return
	 */
	public Converter getConverter();
	
	/**
	 * visibility State
	 * @return
	 */
	public boolean isVisible();

	
	/**
	 * Is the field required
	 * @param b
	 */
	public void setRequired(boolean b);
	
	public boolean isRequired();

	/**
	 * Set to trur if the field have an error
	 * @param b
	 */
	public void setHasErrors(boolean b);
	
	public boolean hasErrors();

}
