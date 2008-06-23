/** 
 * LabeledBaseInputComponentIf.java
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
 * Description: Interface for InputComponents within a DataContainer
 * 
 */

package org.sblim.wbemsmt.tools.input;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.tools.converter.Converter;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponent.Size;

/**
 * Interface for InputComponents within a DataContainer<br>
 * Every field consists of a Label and of a input component
 */
public interface LabeledBaseInputComponentIf {

    /**
     * left alignment for the component
     */
	public static final int LEFT = 0; 
    /**
     * center alignment for the component
     */
	public static final int CENTER = 1; 
    /**
     * right alignment for the component
     */
	public static final int RIGHT = 2; 

	/**
	 * small size for the component
	 */
	public static final Size SIZE_S = new Size(25);
    /**
     * medium size for the component
     */
	public static final Size SIZE_M = new Size(50);
    /**
     * large size for the component
     */
	public static final Size SIZE_L = new Size(100);
	
	
	/**
	 * return the the value of the field
	 * @return the value of the field
	 */
	public abstract Object getItem();

	/**
	 * set the value of the field
	 * @param item the value
	 */
	public abstract void setItem(Object item);

	/**
	 * get the text of the label of the field
	 * @return the label text
	 */
	public abstract String getLabelText();

	/**
	 * set the text of the the label
	 * @param labelText the text of the label
	 */
	public abstract void setLabelText(String labelText);

	/**
	 * returns true if the field value is empty
	 * @return true if the field value is empty
	 */
	public abstract boolean isEmpty();

	/**
	 * returns true if the value can be converted.
	 * 
	 * if the value is not set set this Method should return false.
	 * 
	 * @return true if the value can be converted.
	 */
	public abstract boolean isConvertible();

	/**
	 * retrieves the value of the control for setting it to the Model
	 * Implementors should use this method with a converter using the converter.convertForModel Method
	 * @see Converter#convertForModel(Object)
	 * @return the converted value
	 */
	public abstract Object getConvertedControlValue();

	/**
	 * Sets the value of the control
	 * Implementors should use this method with a converter using the converter.convertForGui Method
	 * @param value the value for the conversion
	 * @see Converter#convertForGui(Object)
	 */
	public abstract void setControlValue(Object value);

	/**
	 * Used to set the Value direct, without converter, should be used only
	 * if you know what you doing e.g. for the tests to set the values
	 * @param value the value
	 */
	public abstract void setValue(Object value);
	
	/**
	 * Used to get the Value direct, without converter, should be used only
	 * if you know what you doing e.g. for the tests to set the values
	 * @return the value without conversion
	 */
	public abstract Object getValue();

	/**
	 * Sets the parent DataContainer
	 * @param dataContainer the parent
	 */
	public void setParent(DataContainer dataContainer);
	
	/**
	 * Gets the data Container
	 * @return the parent
	 */
	public DataContainer getParent();
	
	/**
	 * Gets the ComponentProperties of the InputField
	 * If values are changed in the ComponentProperties the ComponentProperties 
	 * calls all his registered ComponentPropertyChangListener 
	 * @return the properties of the field
	 */
	public ComponentProperties getProperties();
	
	/**
	 * Gets the converter
	 * @return the converter
	 */
	public Converter getConverter();
	
	/**
	 * visibility State of field and the label
	 * @return true if the field is visible 
	 */
	public boolean isVisible();

	
	/**
	 * Is the field required
	 * @param b set to true if the field is required
	 */
	public void setRequired(boolean b);
	
	/**
	 * check if the field is required
	 * @return true if the field is required
	 */
	public boolean isRequired();

	/**
	 * Set to true if the field have an error
	 * @param b true if the field have an error
	 */
	public void setHasErrors(boolean b);
	
	/**
	 * return true if the field have an error
	 * @return true if the field have an error
	 */
	public boolean hasErrors();
	
	/**
	 * Returns true if the field is modified
	 * @return true if the field is modified
	 */
	public boolean isModified();
	
	/**
	 * Set modified-Flag
	 * @param modified set to true if the field is modified
	 */
	public void setModified(boolean modified);

	/**
	 * get the size of the field
	 * @return the size of the field. Implementations should decide by the type of the size ({@link #SIZE_S}, {@link #SIZE_M} or {@link #SIZE_L}) how to size the controls 
	 */
	public Size getSize();

	/**
	 * Set the size of the field
	 * @param size the size of the field. Implementations should decide by the type of the size ({@link #SIZE_S}, {@link #SIZE_M} or {@link #SIZE_L}) how to size the controls
	 */
	public void setSize(Size size);
	
	/**
	 * Can be used to copy field content from on field to another
	 * @param source the source to copy data from  
	 */
	public void copyFrom(LabeledBaseInputComponentIf source);
	
}
