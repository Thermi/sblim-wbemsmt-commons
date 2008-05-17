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
  */

package org.sblim.wbemsmt.tools.input.jsf;

import javax.faces.component.UIComponentBase;
import javax.faces.component.UIInput;
import javax.faces.component.html.*;
import javax.faces.context.FacesContext;

import org.sblim.wbemsmt.bl.adapter.DataContainer;
import org.sblim.wbemsmt.bl.fielddata.GenericFieldData;
import org.sblim.wbemsmt.tools.converter.Converter;
import org.sblim.wbemsmt.tools.converter.test.DummyConverter;
import org.sblim.wbemsmt.tools.converter.test.UnsignedInt16StringConverter;
import org.sblim.wbemsmt.tools.input.ActionComponent;
import org.sblim.wbemsmt.tools.input.LabeledStringArrayInputComponentIf;

/**
 * Description: field to set values for a generic component which can display a textfield, a checkbox etc<br>
 * Example<br>
 * <xmp> 
 *    container.get_VirtualProcessID().setValues(new String[]{"zero","one","two","three"});
 *    container.get_VirtualProcessID().setControlValue(GenericFieldData.createComboBoxField(2));
 * </xmp>
 * <br>uses a combo box for the field VirtualProcessID
 */

public class LabeledJSFGenericComponent extends LabeledJSFInputComponent implements LabeledStringArrayInputComponentIf, ActionComponent {

    /**
     * the read-only field
     */
    private HtmlOutputText readOnly;

    /**
     * The Text field
     */
    private HtmlInputText componentText;

    /**
     * The Label
     */
    private HtmlOutputText componentLabel;
    
    /**
     * The Checkbox
     */
    private HtmlSelectBooleanCheckbox componentCheckbox;
    /**
     * The Comboo Box
     */
    private HtmlSelectOneMenu componentCombobox;
    /**
     * The Password Field
     */
    private HtmlInputSecret componentPassword;
    /**
     * The RadioButtons
     */
    private HtmlSelectOneRadio componentRadiobutton;
    
    /**
     * The Button
     */
    private HtmlCommandButton componentButton;
    
    /**
     * The currently used item
     * 
     * Depends on the GenericFieldData which is used to set the ControlValue
     * 
     * @see GenericFieldData
     */
    private UIComponentBase currentItem;
    
    /**
     * The converter for converting textField, Checkbox, PasswordFields etc
     */
    private Converter dummyConverter = new DummyConverter();
    /**
     * The converter items which are displaying a list like radio buttons, combo Boxes
     */
    private UnsignedInt16StringConverter listConverter = new UnsignedInt16StringConverter(); 
    
    
    /**
     * 
     * @param parent
     * @param labelText
     * @param id The prefix for creating the dataBinding ends with Item so a Binding "#{" + id +"}" will access the method getItem of the Input Component
     * @param converter the converter - currently not used - 
     * @param readOnly indicates if the field is read only
     */
    public LabeledJSFGenericComponent(DataContainer parent, String labelText,String id, Converter converter,boolean readOnly) {
        super(parent, labelText, id, FacesContext.getCurrentInstance().getApplication().createComponent(HtmlPanelGroup.COMPONENT_TYPE), converter,readOnly);
        
        HtmlPanelGroup panel = ((HtmlPanelGroup)getComponent());
        
        
        componentLabel = (HtmlOutputText)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE);
        panel.getChildren().add(componentLabel);

        componentText = (HtmlInputText)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlInputText.COMPONENT_TYPE);
        panel.getChildren().add(componentText);

        componentCheckbox = (HtmlSelectBooleanCheckbox)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlSelectBooleanCheckbox.COMPONENT_TYPE);
        panel.getChildren().add(componentCheckbox);

        componentCombobox = (HtmlSelectOneMenu)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlSelectOneMenu.COMPONENT_TYPE);
        panel.getChildren().add(componentCombobox);

        componentPassword = (HtmlInputSecret)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlInputSecret.COMPONENT_TYPE);
        panel.getChildren().add(componentPassword);

        componentRadiobutton = (HtmlSelectOneRadio)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlSelectOneRadio.COMPONENT_TYPE);
        panel.getChildren().add(componentRadiobutton);
        
        componentButton = (HtmlCommandButton)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlCommandButton.COMPONENT_TYPE);
        panel.getChildren().add(componentButton);

        setComponentBindings1(this,id);
    }
    
    /**
     * Creates the bindings for the components
     */
    public void installProperties(LabeledJSFInputComponent comp, String prefix) {
        super.installProperties(comp, prefix);
        setComponentBindings1((LabeledJSFGenericComponent) comp,prefix);
    }

    /**
     * Creates the bindings for the components and creates the read only label
     * @param component
     * @param id
     */
    private static void setComponentBindings1(LabeledJSFGenericComponent component, String id) {
        //((HtmlPanelGroup)component.getComponent()).setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"}"));
        
        ((HtmlPanelGroup)component.getComponent()).setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"}"));
        ((HtmlPanelGroup)component.getComponent()).setValueBinding("rendered", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id + "Rendered}"));
        
        setComponentBindings("Text",id,component.getComponentText());
        setComponentBindings("Checkbox",id,component.getComponentCheckbox());
        setComponentBindings("Combobox",id,component.getComponentCombobox());
        setComponentBindings("Password",id,component.getComponentPassword());
        setComponentBindings("Radiobutton",id,component.getComponentRadiobutton());
        setComponentBindings("ValueAsLabel",id,component.getComponentLabel());
        setComponentBindings("Button",id,component.getComponentButton());
        
        createReadOnly(id, component);
        
        LabeledJSFInputFieldComponent.setComponentBindings(component.getComponentText(),id);
        LabeledJSFLabelComponent.setComponentBindings(component.getComponentLabel(), id);
        LabeledJSFCheckboxComponent.setComponentBindings(component.getComponentCheckbox(),id);
        LabeledJSFComboBoxComponent.setComponentBindings(component.getComponentCombobox(),id);
        LabeledJSFPasswordFieldComponent.setComponentBindings(component.getComponentPassword(),id);
        LabeledJSFRadioButtonComponent.setComponentBindings(component.getComponentRadiobutton(),id);
        JSFButtonComponent.setComponentBindings(component.getComponentButton(),id);
        //overwrite the value binding from the button class
        component.getComponentButton().setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id + "}"));
 
        
    }

    /**
     * Create common bindings
     * @param type for the should be a term used like Text, Checkbox etc.
     *      This creates a Binding with the prefix &ltid&gt;&lt;Type&gt;Rendered. id ends with Item.
     *      So one method which is needed for the value binding would be getItemTextRendered
     * @param id
     * @param control
     */
    private static void setComponentBindings(String type, String id, UIComponentBase control) {
        
        //expects a method called getItem<type>Rendered
        control.setValueBinding("rendered", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id + type + "Rendered" + " && !" + id +"Disabled}"));
    }

    /**
     * Get the TextField
     * @return
     */
    public HtmlInputText getComponentText() {
        return componentText;
    }

    /**
     * Get the Label
     * @return
     */
    public HtmlOutputText getComponentLabel() {
        return componentLabel;
    }

    /**
     * Is the TextField rendered ?
     * @return
     */
    
    public boolean getItemTextRendered()
    {
        boolean rendered = componentText == currentItem;
        return rendered;
    }
    
    /**
     * Is the Label rendered ?
     * @return
     */
    
    public boolean getItemValueAsLabelRendered()
    {
        boolean rendered = componentLabel == currentItem;
        return rendered;
    }
    
    /**
     * Is the Öaneö rendered ?
     * @return
     */
    
    public boolean getItemLabelRendered()
    {
        boolean rendered = !getItemButtonRendered() || isMultiline(); 
        return rendered;
    }
    
    /**
     * Get the Checkbox
     * @return
     */
    public HtmlSelectBooleanCheckbox getComponentCheckbox() {
        return componentCheckbox;
    }

    /**
     * Is the CheckBox rendered ?
     * @return
     */
    
    public boolean getItemCheckboxRendered()
    {
        boolean rendered = componentCheckbox == currentItem;
        return rendered;
    }

    
    public String getTest()
    {
        return "test";
    }
    
    /**
     * Get the ComboBox
     * @return
     */
    public HtmlSelectOneMenu getComponentCombobox() {
        return componentCombobox;
    }

    /**
     * Is the ComboBox rendered ?
     * @return
     */
    public boolean getItemComboboxRendered()
    {
        boolean rendered = componentCombobox == currentItem;
        return rendered;
    }

    /**
     * Get the PasswordField
     * @return
     */

    public HtmlInputSecret getComponentPassword() {
        return componentPassword;
    }

    /**
     * Is the PasswordField rendered ?
     * @return
     */
    public boolean getItemPasswordRendered()
    {
        boolean rendered = componentPassword == currentItem;
        return rendered;
    }
    
    /**
     * Get the RadioButtons
     * @return
     */

    public HtmlSelectOneRadio getComponentRadiobutton() {
        return componentRadiobutton;
    }

    /**
     * Are the RadioButtons rendered ?
     * @return
     */
    public boolean getItemRadiobuttonRendered()
    {
        boolean rendered = componentRadiobutton == currentItem;
        return rendered;
    }

    /**
     * Get the Button
     * @return
     */

    public HtmlCommandButton getComponentButton() {
        return componentButton;
    }

    /**
     * Are the RadioButtons rendered ?
     * @return
     */
    public boolean getItemButtonRendered()
    {
        boolean rendered = componentButton == currentItem;
        return rendered;
    }
    
    /**
     * Get the currently used control (Textfield, PasswordField etc)
     * @return null if currently no control is used
     */
    public UIComponentBase getCurrentItem() {
        return currentItem;
    }

    /**
     * set the currently used control (Textfield, PasswordField etc)
     * @param currentItem
     */
    public void setCurrentItem(UIInput currentItem) {
        this.currentItem = currentItem;
    }

    /**
     * Get the converter for converting textField, Checkbox, PasswordFields etc
     * @return
     */
    public Converter getDummyConverter() {
        return dummyConverter;
    }
    
    /**
     * Get the converter items which are displaying a list like radio buttons, combo Boxes
     * @return
     */
    public UnsignedInt16StringConverter getListConverter() {
        return listConverter;
    }

    /**
     * Set the control Value
     * @param controlValue should be an instance of GenericFieldData, can be null 
     * @throws ClassCastException if controlValue is not an instance of GenericFieldData
     * 
     */
    public void setControlValue(Object controlValue) {
        
        if (controlValue != null)
        {
            GenericFieldData fd = (GenericFieldData)controlValue;
            
            if (fd.getType() == GenericFieldData.TYPE_TEXT)
                currentItem = componentText;
            if (fd.getType() == GenericFieldData.TYPE_LABEL)
                currentItem = componentLabel;
            if (fd.getType() == GenericFieldData.TYPE_CHECKBOX)
                currentItem = componentCheckbox;
            if (fd.getType() == GenericFieldData.TYPE_COMBOBOX)
            {
                currentItem = componentCombobox;
                setValues(fd);
            }
            if (fd.getType() == GenericFieldData.TYPE_PASSWORD)
                currentItem = componentPassword;
            if (fd.getType() == GenericFieldData.TYPE_RADIOBUTTON)
            {
                currentItem = componentRadiobutton;
                setValues(fd);
            }
            if (fd.getType() == GenericFieldData.TYPE_BUTTON)
                currentItem = componentButton;
            
            super.setControlValue(fd.getData());
        }
        else
        {
            currentItem = null;
        }
    }

    /**
     * set the values of the GenericField data (if the GenericfieldData contains values)
     * @param fd
     */
    private void setValues(GenericFieldData fd) {
        if (fd.getValues() != null)
        {
            setValues(fd.getValues());
        }
    }
	
    /**
     * Get the read only label
     * @return
     */
    public HtmlOutputText getReadOnly() {
        return readOnly;
    }

    /**
     * Set the read only label
     * @param readOnly
     */
    public void setReadOnly(HtmlOutputText readOnly) {
        this.readOnly = readOnly;
    }


    /**
     * Get the read only text
     * @return null if no item is used or the items value is null
     */
    public Object getItemReadOnlyText()
    {
        if (currentItem == componentCombobox)
        {
            return getItemMultipleValues();
        }
        else if (currentItem == componentRadiobutton)
        {
            return getItemSelectedReadOnlyRadioButtonValue();
        }
        else if (currentItem == componentPassword)
        {
            return getItemSelectedReadOnlyCheckboxValue();
        }
        else
        {
            return getItem();
        }
        
    }
    
    /**
     * Create a lable as readOnly representation for a checkbox
     * @param id
     * @param writeableComponent
     */

    protected static void createReadOnly(String id, LabeledJSFGenericComponent genericComponent) {
        
        //Add the label to the col
        HtmlOutputText label = null;
        boolean isNew = genericComponent.getReadOnly() == null;
        if (isNew)
        {
            label = (HtmlOutputText)FacesContext.getCurrentInstance().getApplication().createComponent(HtmlOutputText.COMPONENT_TYPE);
            genericComponent.getComponent().getChildren().add(label);
//            if (genericComponent.isMultiline())
//            {
//                genericComponent.getComponentPanel().getChildren().add(label);
//            }
//            else
//            {
//                genericComponent.getLabelPanel().getChildren().add(label);
//            }
            genericComponent.setReadOnly(label);
        }
        
        label = genericComponent.getReadOnly();
        label.setValueBinding("value", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id +"ReadOnlyText}"));
        label.setValueBinding("rendered", FacesContext.getCurrentInstance().getApplication().createValueBinding("#{" + id + "Disabled}"));
        
    }

    public Object getItem() {
        if (currentItem == componentRadiobutton)
        {
            Object i = super.getItem();
            return i;
        }
        Object i = super.getItem();
        return i;
    }
    
    
    
    
}
