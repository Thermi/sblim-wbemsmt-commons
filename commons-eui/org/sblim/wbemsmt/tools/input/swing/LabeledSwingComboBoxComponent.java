/** 
  * LabeledSwingComboBoxComponent.java
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
  * Description: Swing Combo Box with Label
  * 
  */
package org.sblim.wbemsmt.tools.input.swing;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.tools.converter.StringArrayConverter;
import org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf;

public class LabeledSwingComboBoxComponent extends LabeledSwingInputComponent implements LabeledStringArrayInputComponentIf {

	private final StringArrayConverter stringArrayConverter;

	public LabeledSwingComboBoxComponent(DataContainer parent,String labelText, StringArrayConverter converter, boolean readOnly) {
		super(null, labelText , new JComboBox(), converter);
		setParent(parent);
		stringArrayConverter = converter;
		getComponent().setEnabled(!readOnly);
	}
	
	public void setValues(String[] entries)
	{
		if (entries == null)
		{
			entries = new String[]{};
		}
		JComboBox comboBox = ((JComboBox)getComponent());
		comboBox.setModel(new DefaultComboBoxModel(entries));
		stringArrayConverter.setValues(entries);
	}

	public String[] getValues() {
		return stringArrayConverter.getValues();
	}

	public boolean isShowAllInReadOnlyView() {
		return false;
	}

	public void setShowAllInReadOnlyView(boolean showAllInReadOnlyView) {
	}

}
