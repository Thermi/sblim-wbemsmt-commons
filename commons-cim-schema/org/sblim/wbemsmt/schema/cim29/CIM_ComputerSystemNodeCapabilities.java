/** 
 * CIM_ComputerSystemNodeCapabilities.java
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
 * Description: Indicates general capabilities of a ComputerSystem node, such as the ability to support a battery (and be portable), and ECC memory. To tie these capabilities to a ComputerSystem instance, the ElementCapabilities association is used.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_ComputerSystemNodeCapabilities extends CIM_Capabilities {

    public final static String CIM_CLASS_NAME = "CIM_ComputerSystemNodeCapabilities";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property BatterySupported
     * Enumeration indicating whether a battery is installable/ supportable on this System. This is independent of whether one is currently installed. The latter is indicated by an instance of the CIM_Battery class associated using the SystemDevice relationship.
     */
    public static class PROPERTY_BATTERYSUPPORTED {
        /**
         * name of the property BatterySupported
         */
        public final static String NAME = "BatterySupported";

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
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Battery_Supported = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Battery Supported (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Battery_Supported = "Battery Supported";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Battery_Not_Supported = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Battery Not Supported (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Battery_Not_Supported = "Battery Not Supported";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@f3c0f3c
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Battery_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Battery_Supported;
            }

            if (VALUE_ENTRY_Battery_Not_Supported.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Battery_Not_Supported;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Battery_Supported.intValue()) {
                return VALUE_ENTRY_Battery_Supported;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Battery_Not_Supported.intValue()) {
                return VALUE_ENTRY_Battery_Not_Supported;
            }
            return null;

        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property BatterySupported   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Battery_Supported,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Battery_Not_Supported };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property BatterySupported   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Battery_Supported, VALUE_ENTRY_Battery_Not_Supported };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property BatterySupported   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Battery_Supported, VALUE_ENTRY_Battery_Not_Supported };

    }

    /**
     * Constants of property ECCSupported
     * Enumeration indicating whether ECC single or multi-bit memory is supported on this node. This is independent of whether ECC memory is actually installed. The latter is indicated by an instance of CIM_PhysicalMemory that 'Realizes' the CIM_Memory of the System (associated using SystemDevice).
     */
    public static class PROPERTY_ECCSUPPORTED {
        /**
         * name of the property ECCSupported
         */
        public final static String NAME = "ECCSupported";

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
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Single_bit_ECC = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Single-bit ECC (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Single_bit_ECC = "Single-bit ECC";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Multi_bit_ECC = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Multi-bit ECC (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Multi_bit_ECC = "Multi-bit ECC";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@3baa3baa
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Single_bit_ECC.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Single_bit_ECC;
            }

            if (VALUE_ENTRY_Multi_bit_ECC.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Multi_bit_ECC;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Single_bit_ECC.intValue()) {
                return VALUE_ENTRY_Single_bit_ECC;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Multi_bit_ECC.intValue()) {
                return VALUE_ENTRY_Multi_bit_ECC;
            }
            return null;

        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property ECCSupported   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Single_bit_ECC,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Multi_bit_ECC };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ECCSupported   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Single_bit_ECC, VALUE_ENTRY_Multi_bit_ECC };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ECCSupported   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Single_bit_ECC, VALUE_ENTRY_Multi_bit_ECC };

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
     *   Indicates general capabilities of a ComputerSystem node, such as the ability to support a battery (and be portable), and ECC memory. To tie these capabilities to a ComputerSystem instance, the ElementCapabilities association is used.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ComputerSystemNodeCapabilities(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Indicates general capabilities of a ComputerSystem node, such as the ability to support a battery (and be portable), and ECC memory. To tie these capabilities to a ComputerSystem instance, the ElementCapabilities association is used.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ComputerSystemNodeCapabilities(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ComputerSystemNodeCapabilities() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("BatterySupported", new CIMProperty("BatterySupported",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("ECCSupported", new CIMProperty("ECCSupported", CIMDataType.UINT16_T,
                null));

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
     * Get the property BatterySupported
     *     * <br>
     * Enumeration indicating whether a battery is installable/ supportable on this System. This is independent of whether one is currently installed. The latter is indicated by an instance of the CIM_Battery class associated using the SystemDevice relationship.
     *     */

    public javax.cim.UnsignedInteger16 get_BatterySupported() {
        CIMProperty currentProperty = getProperty(PROPERTY_BATTERYSUPPORTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_BATTERYSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property BatterySupported
     * <br>
     * Enumeration indicating whether a battery is installable/ supportable on this System. This is independent of whether one is currently installed. The latter is indicated by an instance of the CIM_Battery class associated using the SystemDevice relationship.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_BatterySupported(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_BATTERYSUPPORTED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_BatterySupported(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_BATTERYSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property BatterySupported by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_BatterySupported(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ComputerSystemNodeCapabilities fco = new CIM_ComputerSystemNodeCapabilities(client,
                namespace);
        CIMProperty property = fco.getProperty(PROPERTY_BATTERYSUPPORTED.NAME);
        if (property != null) {
            property = setPropertyValue_BatterySupported(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_BATTERYSUPPORTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property BatterySupported
     * <br>
     * Enumeration indicating whether a battery is installable/ supportable on this System. This is independent of whether one is currently installed. The latter is indicated by an instance of the CIM_Battery class associated using the SystemDevice relationship.
     */

    private static CIMProperty setPropertyValue_BatterySupported(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ECCSupported
     *     * <br>
     * Enumeration indicating whether ECC single or multi-bit memory is supported on this node. This is independent of whether ECC memory is actually installed. The latter is indicated by an instance of CIM_PhysicalMemory that 'Realizes' the CIM_Memory of the System (associated using SystemDevice).
     *     */

    public javax.cim.UnsignedInteger16 get_ECCSupported() {
        CIMProperty currentProperty = getProperty(PROPERTY_ECCSUPPORTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ECCSUPPORTED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ECCSupported
     * <br>
     * Enumeration indicating whether ECC single or multi-bit memory is supported on this node. This is independent of whether ECC memory is actually installed. The latter is indicated by an instance of CIM_PhysicalMemory that 'Realizes' the CIM_Memory of the System (associated using SystemDevice).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ECCSupported(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ECCSUPPORTED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ECCSupported(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ECCSUPPORTED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ECCSupported by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ECCSupported(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ComputerSystemNodeCapabilities fco = new CIM_ComputerSystemNodeCapabilities(client,
                namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ECCSUPPORTED.NAME);
        if (property != null) {
            property = setPropertyValue_ECCSupported(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ECCSUPPORTED.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ECCSupported
     * <br>
     * Enumeration indicating whether ECC single or multi-bit memory is supported on this node. This is independent of whether ECC memory is actually installed. The latter is indicated by an instance of CIM_PhysicalMemory that 'Realizes' the CIM_Memory of the System (associated using SystemDevice).
     */

    private static CIMProperty setPropertyValue_ECCSupported(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
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
        return CIM_ComputerSystemNodeCapabilities.CIM_CLASS_NAME;
    }

}