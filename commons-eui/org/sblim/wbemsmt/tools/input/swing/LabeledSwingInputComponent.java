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
 * @author:	Michael Bauschert <Michael.Bauschert@de.ibm.com>
 *
 * Contributors: 
 *              
 *
 * Description: Base class for labeled Input Components in Swing Context
 * 
 */

package org.sblim.wbemsmt.tools.input.swing;

import java.awt.Color;
import java.awt.Component;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.tools.converter.ComboBoxIndexConverter;
import org.sblim.wbemsmt.tools.converter.ComboBoxValueConverter;
import org.sblim.wbemsmt.tools.converter.Converter;
import org.sblim.wbemsmt.tools.input.LabeledBaseInputComponent;

public class LabeledSwingInputComponent extends LabeledBaseInputComponent
{

	private JLabel label;
	private Component component;
	private boolean required;
	private boolean hasErrors;
	private static Map colors = new HashMap();
	
	static
	{
		colors.put("red",Color.RED);
		colors.put("green",Color.GREEN);
		colors.put("white",Color.WHITE);
		colors.put("yellow",Color.YELLOW);
	}

	public LabeledSwingInputComponent(DataContainer parent, String labelText, Component component, Converter converter)
	{
		super(null,labelText, converter);
		setParent(parent);
		this.component = component;
		this.label = new JLabel(labelText);
	}

	public JLabel getLabel() {
		return label;
	}

	public void setLabelText(String text) {
		super.setLabelText(text);
		this.label.setText(text);
	}

	/**
	 * gets and converts the Values from the control
	 * for Validation use the getRawControlValue
	 */
	public Object getConvertedControlValue() {
		
		if (component instanceof JTextField)
		{
			return converter.convertForModel(component);
		}
		else if (component instanceof JLabel)
		{
			return converter.convertForModel(component);
		}
		else if (component instanceof JCheckBox)
		{
			return converter.convertForModel(component);
		}
		else if (component instanceof JComboBox)
		{
			return converter.convertForModel(component);
		}		
		else
		{
			throw new IllegalArgumentException("Controls wth Type " + component.getClass().getName() + " are not supported.");
		}
	}

	/**
	 * gets Values direct from the control
	 * for Validation use the getRawControlValue
	 */
	public Object getValue() {
		
		if (component instanceof JTextField)
		{
			return ((JTextField)component).getText();
		}
		else if (component instanceof JLabel)
		{
			return ((JLabel)component).getText();
		}
		else if (component instanceof JCheckBox)
		{
			return new Boolean(((JCheckBox)component).isSelected());
		}
		else if (component instanceof JComboBox)
		{
			return new Integer(((JComboBox)converter.convertForModel(component)).getSelectedIndex());
		}		
		else
		{
			throw new IllegalArgumentException("Controls wth Type " + component.getClass().getName() + " are not supported.");
		}
	}

	public boolean isEmpty()
	{
		if (component instanceof JTextField)
		{
			return ((JTextField)component).getText() == null || ((JTextField)component).getText().length() == 0;
		}
		else if (component instanceof JLabel)
		{
			return ((JLabel)component).getText() == null || ((JLabel)component).getText().length() == 0;
		}
		else if (component instanceof JCheckBox)
		{
			//checkboxes are always set
			return false;
		}
		else if (component instanceof JComboBox)
		{
			return ((JComboBox)component).getSelectedItem() == null;
		}		
		else
		{
			throw new IllegalArgumentException("Controls wth Type " + component.getClass().getName() + " are not supported.");
		}		
	}
	
	public boolean isConvertible()
	{
		return !isEmpty() && converter.canConvert(component);
	}
	
	
	public void setControlValue(Object controlValue) {
		if (component instanceof JTextField)
		{
			((JTextField)component).setText((String)converter.convertForGui(controlValue));
		}
		else if (component instanceof JLabel)
		{
			((JLabel)component).setText((String)converter.convertForGui(controlValue));
		}
		else if (component instanceof JCheckBox)
		{
			Boolean b = (Boolean)converter.convertForGui(controlValue);
			((JCheckBox)component).setSelected(b.booleanValue());
		}
		else if (component instanceof JComboBox)
		{
			if (converter instanceof ComboBoxIndexConverter)
			{
				Integer index = (Integer)converter.convertForGui(controlValue);
				((JComboBox)component).setSelectedIndex(index.intValue());
			}
			else if (converter instanceof ComboBoxValueConverter)
			{
				Object object  = converter.convertForGui(controlValue);
				((JComboBox)component).getModel().setSelectedItem(object);
			}
		}		
		else
		{
			throw new IllegalArgumentException("Controls wth Type " + component.getClass().getName() + " are not supported.");
		}			
	}

	public Component getComponent() {
		return component;
	}	
	
	public void setValue(Object object)
	{
		throw new IllegalArgumentException("Only for Tests - Not Implemented");
	}

	public void readOnlyChanged(Boolean readOnly)
	{
		component.setEnabled(!readOnly.booleanValue());
	}

	public void bgColorChanged(String bgColor)
	{
		Color color = (Color)colors.get(bgColor.toLowerCase());
		if (color == null)
		{
			System.err.println("SwingColor for String " + bgColor + " is not defined");
		}
		else
		{
			component.setBackground(color);
		}
	}

	public void colorChanged(String bgColor)
	{
		Color color = (Color)colors.get(bgColor.toLowerCase());
		if (color == null)
		{
			System.err.println("SwingColor for String " + bgColor + " is not defined");
		}
		else
		{
			component.setForeground(color);
		}
	}

	public void sizeChanged(int size) {
		
		
	}

	public void visibilityChanged(Boolean visible) {
		component.setVisible(visible.booleanValue());
		label.setVisible(visible.booleanValue());
	}

	public boolean isVisible() {
		return component.isVisible();
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
