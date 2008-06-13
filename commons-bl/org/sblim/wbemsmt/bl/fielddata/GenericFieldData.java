/** 
 *LabeledJSFGenericComponent.java
  *
  * © Copyright IBM Corp. 2008
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
  * Description: a generic component which can display a textfield, a checkbox etc
  * 
  */


package org.sblim.wbemsmt.bl.fielddata;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import javax.cim.*;

import org.apache.commons.lang.StringUtils;
import org.sblim.wbemsmt.tools.input.jsf.LabeledJSFGenericComponent;
import org.sblim.wbemsmt.tools.resources.WbemSmtResourceBundle;

/**
  * Description: field to set values for a generic component which can display a textfield, a checkbox etc<br>
  * Example<br>
  * <xmp> 
  *    container.get_VirtualProcessID().setValues(new String[]{"zero","one","two","three"});
  *    container.get_VirtualProcessID().setControlValue(GenericFieldData.createComboBoxField(2));
  * </xmp>
  * <br>uses a combo box for the field VirtualProcessID
 */
public class GenericFieldData  implements FieldData {

    static Logger logger = Logger.getLogger(GenericFieldData.class.getName());
    
    /**
     * The of the Field<br>
     * One of the constants starting with <b>TYPE_</b>
     * @see #TYPE_CHECKBOX
     * @see #TYPE_COMBOBOX
     * @see #TYPE_RADIOBUTTON
     * @see #TYPE_TEXT
     * @see #TYPE_LABEL
     * @see #TYPE_PASSWORD
     * @see #TYPE_BUTTON
     */
	private final String type;
    
	/**
	 * The data object.<br>
	 * Must be compatible with the type (e.g. type == COMBOBOX, data == UnsginedInteger16
	 */
	private Object data;

	/**
	 * Constant for FieldData creating a Textfield
	 */
    public static final String TYPE_TEXT = "text";
    /**
     * Constant for FieldData creating a Label
     */
    public static final String TYPE_LABEL = "label";
    /**
     * Constant for FieldData creating a Checkbox
     */
    public static final String TYPE_CHECKBOX = "checkbox";
    /**
     * Constant for FieldData creating a ComboBox
     */
    public static final String TYPE_COMBOBOX = "combobox";
    /**
     * Constant for FieldData creating a password field
     */
    public static final String TYPE_PASSWORD = "password";

    /**
     * Constant for FieldData creating a button field
     */
    public static final String TYPE_BUTTON = "button";

    /**
     * Constant for FieldData creating RadioButtons
     */
    public static final String TYPE_RADIOBUTTON = "radiobutton";

    private String[] values;
    
    /**
     * Create a data object for a textField
     * @param s the content of the text field
     * @return the new field data object. can be used for setControlValue of a Generic Component
     * @see LabeledJSFGenericComponent#setControlValue(Object)
     */
    public static GenericFieldData createTextField(String s)
    {
        return new GenericFieldData(TYPE_TEXT,s);
    }
    
    /**
     * Create a data object for a label
     * @param s the content of the label
     * @return the new field data object. can be used for setControlValue of a Generic Component
     * @see LabeledJSFGenericComponent#setControlValue(Object)
     */
    public static GenericFieldData createLabelField(String s)
    {
        return new GenericFieldData(TYPE_LABEL,s);
    }
        
    
    /**
     * Create a data object for a checkbox
     * @param b the content of the checkbox
     * @return the new field data object. can be used for setControlValue of a Generic Component
     * @see LabeledJSFGenericComponent#setControlValue(Object)
     */
    public static GenericFieldData createCheckBoxField(boolean b)
    {
        return new GenericFieldData(TYPE_CHECKBOX,new Boolean(b));
    }
    
    /**
     * Create a data object for a checkbox
     * @param b the content of the checkbox
     * @return the new field data object. can be used for setControlValue of a Generic Component
     * @see LabeledJSFGenericComponent#setControlValue(Object)
     */
    public static GenericFieldData createCheckBoxField(Boolean b)
    {
        return new GenericFieldData(TYPE_CHECKBOX,b);
    }

    /**
     * Create a data object for a combo box
     * @param idx the content of the combo box
     * @return the new field data object. can be used for setControlValue of a Generic Component
     * @see LabeledJSFGenericComponent#setControlValue(Object)
     */

    public static GenericFieldData createComboBoxField(int idx)
    {
        return new GenericFieldData(TYPE_COMBOBOX,new UnsignedInteger16(idx));
    }

    /**
     * Create a data object for a combo box
     * @param idx the content of the combo box
     * @return the new field data object. can be used for setControlValue of a Generic Component
     * @see LabeledJSFGenericComponent#setControlValue(Object)
     */
    public static GenericFieldData createComboBoxField(UnsignedInteger16 idx)
    {
        return new GenericFieldData(TYPE_COMBOBOX,idx);
    }
    
    /**
     * Create a data object for a combo box
     * @param idx the content of the combo box
     * @return the new field data object. can be used for setControlValue of a Generic Component
     * @see LabeledJSFGenericComponent#setControlValue(Object)
     */

    public static GenericFieldData createComboBoxField(int idx, String[] values)
    {
        GenericFieldData genericFieldData = new GenericFieldData(TYPE_COMBOBOX,new UnsignedInteger16(idx));
        genericFieldData.setValues(values);
        return genericFieldData;
    }

    /**
     * Create a data object for a combo box
     * @param idx the content of the combo box
     * @return the new field data object. can be used for setControlValue of a Generic Component
     * @see LabeledJSFGenericComponent#setControlValue(Object)
     */
    public static GenericFieldData createComboBoxField(UnsignedInteger16 idx, String[] values)
    {
        GenericFieldData genericFieldData = new GenericFieldData(TYPE_COMBOBOX,idx);
        genericFieldData.setValues(values);
        return genericFieldData;
    }

    /**
     * Create a data object for a password Field
     * @param p the content of the password field
     * @return the new field data object. can be used for setControlValue of a Generic Component
     * @see LabeledJSFGenericComponent#setControlValue(Object)
     */
    public static GenericFieldData createPasswordField(String p)
    {
        return new GenericFieldData(TYPE_PASSWORD,p);
    }

    /**
     * Create a data object for radio buttons
     * @param idx the selected index of the radio buttons
     * @return the new field data object. can be used for setControlValue of a Generic Component
     * @see LabeledJSFGenericComponent#setControlValue(Object)
     */
    
    public static GenericFieldData createRadioButtonField(int idx)
    {
        return new GenericFieldData(TYPE_RADIOBUTTON,new UnsignedInteger16(idx));
    }
    
    /**
     * Create a data object for radio buttons
     * @param idx the selected index of the radio buttons
     * @return the new field data object. can be used for setControlValue of a Generic Component
     * @see LabeledJSFGenericComponent#setControlValue(Object)
     */

    public static GenericFieldData createRadioButtonField(UnsignedInteger16 idx)
    {
        return new GenericFieldData(TYPE_RADIOBUTTON,idx);
    }

    /**
     * Create a data object for a combo box
     * @param label the Label of the button
     * @return the new field data object. can be used for setControlValue of a Generic Component
     * @see LabeledJSFGenericComponent#setControlValue(Object)
     */

    public static GenericFieldData createButtonField(String label)
    {
        return new GenericFieldData(TYPE_BUTTON,label);
    }
    
    /**
     * Create a GenericFieldData by checking the type of the property
     * @param property
     * @param cls cam be null
     * @param clsProperty can be null
     * @return the fieldData - if the dataType is not supported a FieldDasta for a Label is returned
     */
    public static GenericFieldData create(CIMProperty property, CIMClass cls, CIMClassProperty clsProperty, WbemSmtResourceBundle bundle) {
        if (property.getDataType() == CIMDataType.BOOLEAN_T)
        {
            Boolean value = (Boolean) property.getValue();
            if (value == null && clsProperty != null)
            {
                value = (Boolean) clsProperty.getValue(); 
            }
            
            boolean b = value != null && value.booleanValue();
            return createCheckBoxField(b);
        }
        else if (property.getDataType() == CIMDataType.UINT8_T 
            || property.getDataType() == CIMDataType.UINT16_T 
            || property.getDataType() == CIMDataType.UINT32_T
            || property.getDataType() == CIMDataType.UINT64_T)
        {
            Object value = (Object) property.getValue();
            if (value == null && clsProperty != null)
            {
                value = (Object) clsProperty.getValue(); 
            }
            
            String[] valueMap = (String[]) clsProperty.getQualifierValue("ValueMap");
            String[] values = (String[]) clsProperty.getQualifierValue("Values");
            
            if (clsProperty != null && (valueMap != null || values != null))
            {

                String[][] result = removeRanges(values,valueMap);
                if (result != null)
                {
                    values = result[0];
                    valueMap = result[1];
                }
                
                int idx = 0;
                if (value != null)
                {
                    idx = ((Number)value).intValue();
                }
                if (values != null)
                {
                    return createComboBoxField(idx,values);
                }
                else //having only the valueMap entries
                {
                    return createComboBoxField(idx,valueMap);
                }
                
            }
            else
            {
                
                String s = "0";
                if (value != null)
                {
                    s = "" +  ((Number)value).longValue();
                }
                return createTextField(s);
            }
        }
        else if (property.getDataType() == CIMDataType.STRING_T)
        {
            String value = (String) property.getValue();
            if (value == null && clsProperty != null)
            {
                value = (String) clsProperty.getValue(); 
            }
            
            String s =  value != null ? value : "";
            return createTextField(s);
        }
        else
        {
            if (cls != null)
            {
                logger.warning("CIMProperty " + cls.getName() + "." + property.getName() + " with type " + property.getDataType().toString() + " cannot be used for a GenericField");
            }
            else
            {
                logger.warning("CIMProperty " + property.getName() + " with type " + property.getDataType().toString() + " cannot be used for a GenericField");
            }
            return createLabelField(bundle.getString("type.not.supported"));
        }
    }

    /**
     * Create a GenericFieldData by checking the type of the property
     * @param property
     * @param cls cam be null
     * @param clsProperty can be null
     * @return the fieldData - if the dataType is not supported a FieldDasta for a Label is returned
     */
    public static GenericFieldData create(CIMProperty property, CIMClass cls, CIMClassProperty clsProperty, WbemSmtResourceBundle bundle, String valueToSet) {
        if (property.getDataType() == CIMDataType.BOOLEAN_T)
        {
            return createCheckBoxField(Boolean.getBoolean(valueToSet));
        }
        else if (property.getDataType() == CIMDataType.UINT8_T 
            || property.getDataType() == CIMDataType.UINT16_T 
            || property.getDataType() == CIMDataType.UINT32_T
            || property.getDataType() == CIMDataType.UINT64_T)
        {
            String[] valueMap = (String[]) clsProperty.getQualifierValue("ValueMap");
            String[] values = (String[]) clsProperty.getQualifierValue("Values");
            
            if (clsProperty != null && (valueMap != null || values != null))
            {

                String[][] result = removeRanges(values,valueMap);
                if (result != null)
                {
                    values = result[0];
                    valueMap = result[1];
                }
                
                UnsignedInteger16 idx = StringUtils.isNotEmpty(valueToSet) ? new UnsignedInteger16(valueToSet) : null;
                if (values != null)
                {
                    return createComboBoxField(idx,values);
                }
                else //having only the valueMap entries
                {
                    return createComboBoxField(idx,valueMap);
                }
                
            }
            else
            {
                return createTextField(valueToSet);
            }
        }
        else if (property.getDataType() == CIMDataType.STRING_T)
        {
            return createTextField(valueToSet);
        }
        else
        {
            if (cls != null)
            {
                logger.warning("CIMProperty " + cls.getName() + "." + property.getName() + " with type " + property.getDataType().toString() + " cannot be used for a GenericField");
            }
            else
            {
                logger.warning("CIMProperty " + property.getName() + " with type " + property.getDataType().toString() + " cannot be used for a GenericField");
            }
            return createLabelField(bundle.getString("type.not.supported"));
        }
        
        
    }

    /**
     * Remove the value map entries with ".." marking a less than, larger than or else ranges
     * @param values
     * @param valueMap
     * @return the arrays: idx 0 the modified values, idx 1 the modified valueMap - or null if values or valueMap was null
     */
    private static String[][] removeRanges(String[] values, String[] valueMap) {
        if (values != null && valueMap != null)
        {
            
            
            List valueMapList = new ArrayList();
            valueMapList.addAll(Arrays.asList(valueMap));
            
            List valueList = new ArrayList();
            valueList.addAll(Arrays.asList(values));
            
            for (int i=valueMapList.size()-1; i >= 0; i--)
            {
                String s = (String) valueMapList.get(i);
                if (s.indexOf("..") > -1)
                {
                    valueMapList.remove(i);
                    valueList.remove(i);
                }
            }
            
            valueMap = (String[]) valueMapList.toArray(new String[valueMapList.size()]);
            values = (String[]) valueList.toArray(new String[valueList.size()]);
            
            return new String[][]{values,valueMap};
        }
        return null;
    }

    /**
     * Create a GenericFieldData by checking the type of the property
     * @param property
     * @param cls cam be null
     * @param clsProperty can be null
     * @return the fieldData - if the dataType is not supported a FieldDasta for a Label is returned
     */
    public static CIMProperty setPropertyValue(CIMProperty property, CIMClass cls, CIMClassProperty clsProperty, GenericFieldData data, WbemSmtResourceBundle bundle) {

        logger.info("Setting value of Property " + property.getName() + (cls != null ? "in class " + cls.getName() : ""));
        
        if (property.getDataType() == CIMDataType.BOOLEAN_T)
        {
            return setValue(property, data.getData());
        }
        else if (property.getDataType() == CIMDataType.UINT8_T 
            || property.getDataType() == CIMDataType.UINT16_T 
            || property.getDataType() == CIMDataType.UINT32_T
            || property.getDataType() == CIMDataType.UINT64_T)
        {
            Object value = (Object) property.getValue();
            if (value == null && clsProperty != null)
            {
                value = clsProperty.getValue(); 
            }
            
            String[] valueMap = (String[]) clsProperty.getQualifierValue("ValueMap");
            String[] values = (String[]) clsProperty.getQualifierValue("Values");

            if (clsProperty != null && (valueMap != null || values != null))
            {
                String[][] result = removeRanges(values,valueMap);
                if (result != null)
                {
                    values = result[0];
                    valueMap = result[1];
                }
                
                if (valueMap == null)
                {
                    valueMap = new String[values.length];
                    for (int i = 0; i < valueMap.length; i++) {
                        valueMap[i] = ""+i;
                    }
                }
                return setValue(property, getIdxFromComboBoxField(data,valueMap));
            }
            else
            {
                if (data.getData() instanceof String)
                {
                    String dataValue = (String)data.getData();
                    if (property.getDataType() == CIMDataType.UINT8_T)
                    {
                        return setValue(property, StringUtils.isNotEmpty(dataValue) ? new UnsignedInteger8(dataValue) : null);
                    }
                    if (property.getDataType() == CIMDataType.UINT16_T)
                    {
                        return setValue(property, StringUtils.isNotEmpty(dataValue) ? new UnsignedInteger16(dataValue) : null);
                    }
                    if (property.getDataType() == CIMDataType.UINT32_T)
                    {
                        return setValue(property, StringUtils.isNotEmpty(dataValue) ? new UnsignedInteger32(dataValue) : null);
                    }
                    if (property.getDataType() == CIMDataType.UINT64_T)
                    {
                        return setValue(property, StringUtils.isNotEmpty(dataValue) ? new UnsignedInteger64(dataValue) : null);
                    }
                    return null;
                }
                else
                {
                    return setValue(property, data.getData());
                }
            }
        }
        else if (property.getDataType() == CIMDataType.STRING_T)
        {
            return setValue(property, data.getData());
        }
        else
        {
            if (cls != null)
            {
                logger.warning("CIMProperty " + cls.getName() + "." + property.getName() + " with type " + property.getDataType().toString() + " cannot be used for a GenericField");
            }
            else
            {
                logger.warning("CIMProperty " + property.getName() + " with type " + property.getDataType().toString() + " cannot be used for a GenericField");
            }
            return property;
        }
        
        
    }
    
    /**
     * Copies the property into a new property and uses the value as new value
     * @param p the property to copy
     * @param value the new value
     * @return
     */
    
    private static CIMProperty setValue(CIMProperty p, Object value) {
        CIMProperty result = new CIMProperty(p.getName(),p.getDataType(), value, p.isKey(), p.isPropagated(), p.getOriginClass());
        return result;
    }

    private static UnsignedInteger16 getIdxFromComboBoxField(GenericFieldData data, String[] idxValues) {
        
        UnsignedInteger16 selectedIdx = (UnsignedInteger16) data.getData();
        
        if (selectedIdx != null && idxValues != null)
        {
            if (selectedIdx.intValue() < idxValues.length)
            {
                int idx = Integer.parseInt(idxValues[selectedIdx.intValue()]); 
                return new UnsignedInteger16(idx);
            }
            else
            {
                logger.warning("Index " + selectedIdx.intValue() + " is larger than size of values: " + idxValues.length);
                return null;
            }
            
        }
        else
        {
            return null;
        }
        
    }

    /**
     * Creates the objects<br>
     * use the methods starting with <B>create_</B> to create objects<br> 
     * can be used for setControlValue of a Generic Component
     * @see LabeledJSFGenericComponent#setControlValue(Object)
     * @param type the Type 
     * @param data the data object
     * @see #createTextField(String)
     * @see #createCheckBoxField(Boolean)
     * @see #createCheckBoxField(boolean)
     * @see #createRadioButtonField(int)
     * @see #createRadioButtonField(UnsignedInteger16)
     * @see #createComboBoxField(int)
     * @see #createComboBoxField(UnsignedInteger16)
     * @see #createPasswordField(String)
     */
    private GenericFieldData(String type, Object data) {
		super();
        this.type = type;
        this.data = data;
	}

    /**
     * Return the type
     * @return the type 
     * @see #TYPE_CHECKBOX
     * @see #TYPE_COMBOBOX
     * @see #TYPE_RADIOBUTTON
     * @see #TYPE_TEXT
     * @see #TYPE_LABEL
     * @see #TYPE_PASSWORD
     */
    public String getType() {
        return type;
    }
    
    /**
     * return the DataObject<br>
     * is compatible with the type (e.g. type == COMBOBOX, data == UnsginedInteger16<br>
     * see the create method for the relation ship between type and data object
     * @return the dataObject
     * @see #createTextField(String)
     * @see #createLabelField(String)
     * @see #createCheckBoxField(Boolean)
     * @see #createRadioButtonField(UnsignedInteger16)
     * @see #createComboBoxField(UnsignedInteger16)
     * @see #createPasswordField(String)
     * */
    public Object getData() {
        return data;
    }

    /**
     * Set the data field
     * @param data
     */
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * Only used for ComoboxBoxes (and in future for ListBoxes etc) to set the possible Values
     * @param values
     */
    private void setValues(String[] values) {
        this.values = values;
    }

    /**
     * return the possible values for ComoboxBoxes (and in future for ListBoxes etc)
     * @return the possible values for ComoboxBoxes (and in future for ListBoxes etc)
     */
    public String[] getValues() {
        return values;
    }
    
    
    
    
}
