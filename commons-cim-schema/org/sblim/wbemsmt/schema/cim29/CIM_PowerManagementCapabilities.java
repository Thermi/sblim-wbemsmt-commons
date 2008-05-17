/** 
 * CIM_PowerManagementCapabilities.java
 *
 * 
 * © Copyright IBM Corp. 2006,2007
 *
 * THIS FILE IS PROVIDED UNDER THE TER	MS OF THE COMMON PUBLIC LICENSE
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
 *
 * You can obtain a current copy of the Common Public License from
 * http://www.opensource.org/licenses/cpl1.0.php
 *
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm
 *
 * Contributors:
 *    michael.bauschert@de.ibm.com 
 * 
 * Description: A class derived from Capabilities that describes the power management aspects of an element (typically a system or device). The element's power management capabilities are decoupled from a PowerManagementService, since a single service could apply to multiple elements, each with specific capabilities.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_PowerManagementCapabilities extends CIM_Capabilities {

    public final static String CIM_CLASS_NAME = "CIM_PowerManagementCapabilities";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property OtherPowerCapabilitiesDescriptions
     * An array of strings describing an element's additional power management capabilities, used when the PowerCapabilities array includes the value 1, "Other".
     */
    public static class PROPERTY_OTHERPOWERCAPABILITIESDESCRIPTIONS {
        /**
         * name of the property OtherPowerCapabilitiesDescriptions
         */
        public final static String NAME = "OtherPowerCapabilitiesDescriptions";

    }

    /**
     * Constants of property PowerCapabilities
     * An enumeration indicating the specific power-related capabilities of a managed element. Since this is an array, multiple values may be specified. The current values in the enumeration are: 
     * 0 = Unknown 
     * 1 = Other 
     * 2 = Power Saving Modes Entered Automatically, describing that a managed element can change its power state based on usage or other criteria 
     * 3 = Power State Settable, indicating that the SetPowerState method is supported 
     * 4 = Power Cycling Supported, indicating that the SetPowerState method can be invoked with the PowerState input variable set to 'Power Cycle' 
     * 5 = Timed Power On Supported, indicating that the SetPowerState method can be invoked with the PowerState input variable set to 'Power Cycle' and the Time parameter set to a specific date and time, or interval, for power-on.
     */
    public static class PROPERTY_POWERCAPABILITIES {
        /**
         * name of the property PowerCapabilities
         */
        public final static String NAME = "PowerCapabilities";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value entry Unknown (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Unknown = "Unknown";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Other (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Other = "Other";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Power_Saving_Modes_Entered_Automatically = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Power Saving Modes Entered Automatically (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Power_Saving_Modes_Entered_Automatically = "Power Saving Modes Entered Automatically";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Power_State_Settable = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Power State Settable (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Power_State_Settable = "Power State Settable";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Power_Cycling_Supported = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Power Cycling Supported (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Power_Cycling_Supported = "Power Cycling Supported";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Timed_Power_On_Supported = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Timed Power On Supported (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Timed_Power_On_Supported = "Timed Power On Supported";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@4580458
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Power_Saving_Modes_Entered_Automatically.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Power_Saving_Modes_Entered_Automatically;
            }

            if (VALUE_ENTRY_Power_State_Settable.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Power_State_Settable;
            }

            if (VALUE_ENTRY_Power_Cycling_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Power_Cycling_Supported;
            }

            if (VALUE_ENTRY_Timed_Power_On_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Timed_Power_On_Supported;
            }
            return null;

        }

        /**
         * uses the element within array VALUE_ENTRIES_FOR_DISPLAY at index indexInPulldown to get the ValueMapEntry
         * @param indexInPulldown the index within the pulldown element, the list etc
         * @return the ValueMap entry from the displayed values
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntryFromDisplayedValue(
                Number indexInPulldown) {
            return getValueMapEntry(VALUE_ENTRIES_FOR_DISPLAY[indexInPulldown.intValue()]);
        }

        /**
         * gets the value for the given valueMap entry (currentValue) and gives back the index of this value within the VALUE_ENTRIES_FOR_DISPLAY array
         *
         * can be used to set the correct selection index for a pulldown field
         *
         * @return -1 if for the currentValue no value within VALUE_ENTRIES_FOR_DISPLAY was found
         * @param currentValue the currentValue to get the index for
         */
        public static int getIndexForDisplay(javax.cim.UnsignedInteger16 currentValue) {
            String valueEntry = getValueEntry(currentValue);
            if (valueEntry != null) {
                for (int i = 0; i < VALUE_ENTRIES_FOR_DISPLAY.length; i++) {
                    if (VALUE_ENTRIES_FOR_DISPLAY[i].equals(valueEntry)) {
                        return i;
                    }
                }
            }
            return -1;

        }

        /**
         * get the ValueEntry of the given valueMapEntry
         * @param valueMapEntry the entry within the valueMap to find the ValueEntry for
         * @return the Value entry or null if not found
         */

        public static String getValueEntry(javax.cim.UnsignedInteger16 value) {
            int iValue = value.intValue();

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown.intValue()) {
                return VALUE_ENTRY_Unknown;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other.intValue()) {
                return VALUE_ENTRY_Other;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Power_Saving_Modes_Entered_Automatically
                    .intValue()) {
                return VALUE_ENTRY_Power_Saving_Modes_Entered_Automatically;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Power_State_Settable.intValue()) {
                return VALUE_ENTRY_Power_State_Settable;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Power_Cycling_Supported.intValue()) {
                return VALUE_ENTRY_Power_Cycling_Supported;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Timed_Power_On_Supported.intValue()) {
                return VALUE_ENTRY_Timed_Power_On_Supported;
            }
            return null;

        }

        /**
         * get the ValueEntries of the given valueMapEntries
         * @param values the values to find the ValueMapEntries for
         * @return the array with ValueMap entries. Some of them may be null to if no valueMap entry was found
         */

        public static javax.cim.UnsignedInteger16[] getValueMapEntries(String[] values) {
            javax.cim.UnsignedInteger16[] result = new javax.cim.UnsignedInteger16[values.length];

            for (int i = 0; i < result.length; i++) {
                result[i] = getValueMapEntry(values[i]);
            }

            return result;
        }

        /**
         * get the ValueMapEntries of the given valueEntries
         * @param valueMapEntries the valueMap entries to find the Values for
         * @return the array with Value entries. Some of them may be null to if no value entry was found
         */

        public static String[] getValueEntries(javax.cim.UnsignedInteger16[] values) {
            String[] result = new String[values.length];

            for (int i = 0; i < result.length; i++) {
                result[i] = getValueEntry(values[i]);
            }

            return result;
        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property PowerCapabilities   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Power_Saving_Modes_Entered_Automatically,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Power_State_Settable,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Power_Cycling_Supported,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Timed_Power_On_Supported };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property PowerCapabilities   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Power_Saving_Modes_Entered_Automatically,
                VALUE_ENTRY_Power_State_Settable, VALUE_ENTRY_Power_Cycling_Supported,
                VALUE_ENTRY_Timed_Power_On_Supported };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property PowerCapabilities   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Power_Saving_Modes_Entered_Automatically,
                VALUE_ENTRY_Power_State_Settable, VALUE_ENTRY_Power_Cycling_Supported,
                VALUE_ENTRY_Timed_Power_On_Supported };

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_Capabilities.getPackages();

        for (int i = 0; i < parentClassPackageList.length; i++) {
            addPackage(parentClassPackageList[i]);
        }

    };

    //**********************************************************************
    // Constructors     
    //**********************************************************************

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A class derived from Capabilities that describes the power management aspects of an element (typically a system or device). The element's power management capabilities are decoupled from a PowerManagementService, since a single service could apply to multiple elements, each with specific capabilities.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_PowerManagementCapabilities(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A class derived from Capabilities that describes the power management aspects of an element (typically a system or device). The element's power management capabilities are decoupled from a PowerManagementService, since a single service could apply to multiple elements, each with specific capabilities.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_PowerManagementCapabilities(CIMInstance cimInstance) throws WbemsmtException {

        if (cimInstance == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimInstance parameter does not contain a valid reference.");
        }
        setFromServer(true);
        init(cimInstance, false);
    }

    /**
     * Default constructor
     */
    protected CIM_PowerManagementCapabilities() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("OtherPowerCapabilitiesDescriptions", new CIMProperty(
                "OtherPowerCapabilitiesDescriptions", CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("PowerCapabilities", new CIMProperty("PowerCapabilities",
                CIMDataType.UINT16_ARRAY_T, null));

        super.init(cimInstance, overwrite);

        //currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient
        //we overwrite the dataType by setting null for every embeddedObject/Instance property
        if (overwrite) {

        }
    }

    //**********************************************************************
    // Properties get/set     
    //**********************************************************************

    /**
     * Get the property OtherPowerCapabilitiesDescriptions
     *     * <br>
     * An array of strings describing an element's additional power management capabilities, used when the PowerCapabilities array includes the value 1, "Other".
     *     */

    public String[] get_OtherPowerCapabilitiesDescriptions() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERPOWERCAPABILITIESDESCRIPTIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERPOWERCAPABILITIESDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property OtherPowerCapabilitiesDescriptions
     * <br>
     * An array of strings describing an element's additional power management capabilities, used when the PowerCapabilities array includes the value 1, "Other".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherPowerCapabilitiesDescriptions(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERPOWERCAPABILITIESDESCRIPTIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherPowerCapabilitiesDescriptions(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERPOWERCAPABILITIESDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherPowerCapabilitiesDescriptions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherPowerCapabilitiesDescriptions(WBEMClient client,
            String namespace, String[] newValue) throws WbemsmtException {
        CIM_PowerManagementCapabilities fco = new CIM_PowerManagementCapabilities(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERPOWERCAPABILITIESDESCRIPTIONS.NAME);
        if (property != null) {
            property = setPropertyValue_OtherPowerCapabilitiesDescriptions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERPOWERCAPABILITIESDESCRIPTIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherPowerCapabilitiesDescriptions
     * <br>
     * An array of strings describing an element's additional power management capabilities, used when the PowerCapabilities array includes the value 1, "Other".
     */

    private static CIMProperty setPropertyValue_OtherPowerCapabilitiesDescriptions(
            CIMProperty currentProperty, String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PowerCapabilities
     *     * <br>
     * An enumeration indicating the specific power-related capabilities of a managed element. Since this is an array, multiple values may be specified. The current values in the enumeration are: 
     * 0 = Unknown 
     * 1 = Other 
     * 2 = Power Saving Modes Entered Automatically, describing that a managed element can change its power state based on usage or other criteria 
     * 3 = Power State Settable, indicating that the SetPowerState method is supported 
     * 4 = Power Cycling Supported, indicating that the SetPowerState method can be invoked with the PowerState input variable set to 'Power Cycle' 
     * 5 = Timed Power On Supported, indicating that the SetPowerState method can be invoked with the PowerState input variable set to 'Power Cycle' and the Time parameter set to a specific date and time, or interval, for power-on.
     *     */

    public javax.cim.UnsignedInteger16[] get_PowerCapabilities() {
        CIMProperty currentProperty = getProperty(PROPERTY_POWERCAPABILITIES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_POWERCAPABILITIES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property PowerCapabilities
     * <br>
     * An enumeration indicating the specific power-related capabilities of a managed element. Since this is an array, multiple values may be specified. The current values in the enumeration are: 
     * 0 = Unknown 
     * 1 = Other 
     * 2 = Power Saving Modes Entered Automatically, describing that a managed element can change its power state based on usage or other criteria 
     * 3 = Power State Settable, indicating that the SetPowerState method is supported 
     * 4 = Power Cycling Supported, indicating that the SetPowerState method can be invoked with the PowerState input variable set to 'Power Cycle' 
     * 5 = Timed Power On Supported, indicating that the SetPowerState method can be invoked with the PowerState input variable set to 'Power Cycle' and the Time parameter set to a specific date and time, or interval, for power-on.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PowerCapabilities(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_POWERCAPABILITIES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PowerCapabilities(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_POWERCAPABILITIES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PowerCapabilities by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PowerCapabilities(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_PowerManagementCapabilities fco = new CIM_PowerManagementCapabilities(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_POWERCAPABILITIES.NAME);
        if (property != null) {
            property = setPropertyValue_PowerCapabilities(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_POWERCAPABILITIES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PowerCapabilities
     * <br>
     * An enumeration indicating the specific power-related capabilities of a managed element. Since this is an array, multiple values may be specified. The current values in the enumeration are: 
     * 0 = Unknown 
     * 1 = Other 
     * 2 = Power Saving Modes Entered Automatically, describing that a managed element can change its power state based on usage or other criteria 
     * 3 = Power State Settable, indicating that the SetPowerState method is supported 
     * 4 = Power Cycling Supported, indicating that the SetPowerState method can be invoked with the PowerState input variable set to 'Power Cycle' 
     * 5 = Timed Power On Supported, indicating that the SetPowerState method can be invoked with the PowerState input variable set to 'Power Cycle' and the Time parameter set to a specific date and time, or interval, for power-on.
     */

    private static CIMProperty setPropertyValue_PowerCapabilities(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    //**********************************************************************
    // Associators methods     
    //**********************************************************************

    //**********************************************************************
    // Extrinsic Method invocations     
    //**********************************************************************                         

    //**********************************************************************
    // utility methods     
    //**********************************************************************                         

    /**
     * return the name of the CIMClass
     * @return
     */
    public String getObjectName() {
        return CIM_PowerManagementCapabilities.CIM_CLASS_NAME;
    }

}