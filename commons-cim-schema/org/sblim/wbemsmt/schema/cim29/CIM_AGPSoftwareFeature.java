/** 
 * CIM_AGPSoftwareFeature.java
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
 * Description: AGPSoftwareFeature adds two attributes to SoftwareFeature to represent the capabilities of an AGP device driver. An instance of this class would be associated with the Driver's SoftwareElement using the SoftwareFeatureSoftware Elements relationship. The driver's SoftwareElement is associated with the AGPVideoController via the Device Software relationship.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_AGPSoftwareFeature extends CIM_SoftwareFeature {

    public final static String CIM_CLASS_NAME = "CIM_AGPSoftwareFeature";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property CharacteristicDescriptions
     * An array of free-form strings providing more detailed explanations for any of the features indicated in the Characteristics array. Each entry in this array is related to the Characteristics array entry located at the same index.
     */
    public static class PROPERTY_CHARACTERISTICDESCRIPTIONS {
        /**
         * name of the property CharacteristicDescriptions
         */
        public final static String NAME = "CharacteristicDescriptions";

    }

    /**
     * Constants of property Characteristics
     * An array of integers indicating various capabilities and characteristics of the AGPVideoController.
     */
    public static class PROPERTY_CHARACTERISTICS {
        /**
         * name of the property Characteristics
         */
        public final static String NAME = "Characteristics";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_OS_support = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry OS support (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_OS_support = "OS support";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Hardware_Acceleration = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Hardware Acceleration (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Hardware_Acceleration = "Hardware Acceleration";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Hardware_Blit = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Hardware Blit (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Hardware_Blit = "Hardware Blit";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_OpenGL_Support = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry OpenGL Support (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_OpenGL_Support = "OpenGL Support";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Cache_Coherency = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Cache Coherency (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Cache_Coherency = "Cache Coherency";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@373a373a
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_OS_support.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_OS_support;
            }

            if (VALUE_ENTRY_Hardware_Acceleration.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Hardware_Acceleration;
            }

            if (VALUE_ENTRY_Hardware_Blit.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Hardware_Blit;
            }

            if (VALUE_ENTRY_OpenGL_Support.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_OpenGL_Support;
            }

            if (VALUE_ENTRY_Cache_Coherency.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Cache_Coherency;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_OS_support.intValue()) {
                return VALUE_ENTRY_OS_support;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Hardware_Acceleration.intValue()) {
                return VALUE_ENTRY_Hardware_Acceleration;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Hardware_Blit.intValue()) {
                return VALUE_ENTRY_Hardware_Blit;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_OpenGL_Support.intValue()) {
                return VALUE_ENTRY_OpenGL_Support;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Cache_Coherency.intValue()) {
                return VALUE_ENTRY_Cache_Coherency;
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
         * Value Map for the property Characteristics   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_OS_support,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Hardware_Acceleration,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Hardware_Blit,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_OpenGL_Support,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Cache_Coherency };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property Characteristics   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_OS_support, VALUE_ENTRY_Hardware_Acceleration,
                VALUE_ENTRY_Hardware_Blit, VALUE_ENTRY_OpenGL_Support, VALUE_ENTRY_Cache_Coherency };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property Characteristics   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_OS_support, VALUE_ENTRY_Hardware_Acceleration,
                VALUE_ENTRY_Hardware_Blit, VALUE_ENTRY_OpenGL_Support, VALUE_ENTRY_Cache_Coherency };

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_SoftwareFeature.getPackages();

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
     *   AGPSoftwareFeature adds two attributes to SoftwareFeature to represent the capabilities of an AGP device driver. An instance of this class would be associated with the Driver's SoftwareElement using the SoftwareFeatureSoftware Elements relationship. The driver's SoftwareElement is associated with the AGPVideoController via the Device Software relationship.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_AGPSoftwareFeature(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   AGPSoftwareFeature adds two attributes to SoftwareFeature to represent the capabilities of an AGP device driver. An instance of this class would be associated with the Driver's SoftwareElement using the SoftwareFeatureSoftware Elements relationship. The driver's SoftwareElement is associated with the AGPVideoController via the Device Software relationship.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_AGPSoftwareFeature(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_AGPSoftwareFeature() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("CharacteristicDescriptions", new CIMProperty(
                "CharacteristicDescriptions", CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("Characteristics", new CIMProperty("Characteristics",
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
     * Get the property CharacteristicDescriptions
     *     * <br>
     * An array of free-form strings providing more detailed explanations for any of the features indicated in the Characteristics array. Each entry in this array is related to the Characteristics array entry located at the same index.
     *     */

    public String[] get_CharacteristicDescriptions() {
        CIMProperty currentProperty = getProperty(PROPERTY_CHARACTERISTICDESCRIPTIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CHARACTERISTICDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property CharacteristicDescriptions
     * <br>
     * An array of free-form strings providing more detailed explanations for any of the features indicated in the Characteristics array. Each entry in this array is related to the Characteristics array entry located at the same index.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CharacteristicDescriptions(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CHARACTERISTICDESCRIPTIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CharacteristicDescriptions(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CHARACTERISTICDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CharacteristicDescriptions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CharacteristicDescriptions(WBEMClient client,
            String namespace, String[] newValue) throws WbemsmtException {
        CIM_AGPSoftwareFeature fco = new CIM_AGPSoftwareFeature(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CHARACTERISTICDESCRIPTIONS.NAME);
        if (property != null) {
            property = setPropertyValue_CharacteristicDescriptions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CHARACTERISTICDESCRIPTIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CharacteristicDescriptions
     * <br>
     * An array of free-form strings providing more detailed explanations for any of the features indicated in the Characteristics array. Each entry in this array is related to the Characteristics array entry located at the same index.
     */

    private static CIMProperty setPropertyValue_CharacteristicDescriptions(
            CIMProperty currentProperty, String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Characteristics
     *     * <br>
     * An array of integers indicating various capabilities and characteristics of the AGPVideoController.
     *     */

    public javax.cim.UnsignedInteger16[] get_Characteristics() {
        CIMProperty currentProperty = getProperty(PROPERTY_CHARACTERISTICS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CHARACTERISTICS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property Characteristics
     * <br>
     * An array of integers indicating various capabilities and characteristics of the AGPVideoController.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Characteristics(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CHARACTERISTICS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Characteristics(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CHARACTERISTICS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Characteristics by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Characteristics(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_AGPSoftwareFeature fco = new CIM_AGPSoftwareFeature(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CHARACTERISTICS.NAME);
        if (property != null) {
            property = setPropertyValue_Characteristics(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CHARACTERISTICS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Characteristics
     * <br>
     * An array of integers indicating various capabilities and characteristics of the AGPVideoController.
     */

    private static CIMProperty setPropertyValue_Characteristics(CIMProperty currentProperty,
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
        return CIM_AGPSoftwareFeature.CIM_CLASS_NAME;
    }

}