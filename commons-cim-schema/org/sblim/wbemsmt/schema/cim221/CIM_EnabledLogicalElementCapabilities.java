/**
 * CIM_EnabledLogicalElementCapabilities.java Â© Copyright IBM Corp. 2006,2007 THIS FILE IS PROVIDED
 * UNDER THE TER MS OF THE COMMON PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR
 * DISTRIBUTION OF THIS FILE CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a
 * current copy of the Common Public License from http://www.opensource.org/licenses/cpl1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: EnabledLogicalElementCapabilities describes
 *            the capabilities supported for changing the state of the associated
 *            EnabledLogicalElement. generated Class
 */

package org.sblim.wbemsmt.schema.cim221;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_EnabledLogicalElementCapabilities extends CIM_Capabilities {

    public final static String CIM_CLASS_NAME = "CIM_EnabledLogicalElementCapabilities";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property ElementNameEditSupported
     * Boolean indicating whether the ElementName can be modified.
     */
    public static class PROPERTY_ELEMENTNAMEEDITSUPPORTED {
        /**
         * name of the property ElementNameEditSupported
         */
        public final static String NAME = "ElementNameEditSupported";

    }

    /**
     * Constants of property MaxElementNameLen
     * Maximum supported ElementName length.
     */
    public static class PROPERTY_MAXELEMENTNAMELEN {
        /**
         * name of the property MaxElementNameLen
         */
        public final static String NAME = "MaxElementNameLen";

    }

    /**
     * Constants of property RequestedStatesSupported
     * RequestedStatesSupported indicates the possible states that can be requested when using the method RequestStateChange on the EnabledLogicalElement.
     */
    public static class PROPERTY_REQUESTEDSTATESSUPPORTED {
        /**
         * name of the property RequestedStatesSupported
         */
        public final static String NAME = "RequestedStatesSupported";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Enabled (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Enabled = "Enabled";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Disabled (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Disabled = "Disabled";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shut_Down = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Shut Down (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Shut_Down = "Shut Down";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Offline = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Offline (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Offline = "Offline";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Test = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Test (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Test = "Test";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Defer = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Defer (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Defer = "Defer";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Quiesce (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Quiesce = "Quiesce";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Reboot = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry Reboot (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_Reboot = "Reboot";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Reset = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry Reset (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_Reset = "Reset";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Enabled.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled;
            }

            if (VALUE_ENTRY_Disabled.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled;
            }

            if (VALUE_ENTRY_Shut_Down.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shut_Down;
            }

            if (VALUE_ENTRY_Offline.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Offline;
            }

            if (VALUE_ENTRY_Test.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Test;
            }

            if (VALUE_ENTRY_Defer.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Defer;
            }

            if (VALUE_ENTRY_Quiesce.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce;
            }

            if (VALUE_ENTRY_Reboot.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Reboot;
            }

            if (VALUE_ENTRY_Reset.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Reset;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled.intValue()) {
                return VALUE_ENTRY_Enabled;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled.intValue()) {
                return VALUE_ENTRY_Disabled;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shut_Down.intValue()) {
                return VALUE_ENTRY_Shut_Down;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Offline.intValue()) {
                return VALUE_ENTRY_Offline;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Test.intValue()) {
                return VALUE_ENTRY_Test;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Defer.intValue()) {
                return VALUE_ENTRY_Defer;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce.intValue()) {
                return VALUE_ENTRY_Quiesce;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Reboot.intValue()) {
                return VALUE_ENTRY_Reboot;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Reset.intValue()) {
                return VALUE_ENTRY_Reset;
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
         * Value Map for the property RequestedStatesSupported   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Enabled,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Disabled,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Shut_Down,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Offline, VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Test,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Defer, VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Quiesce,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Reboot, VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Reset };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property RequestedStatesSupported   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Enabled, VALUE_ENTRY_Disabled,
                VALUE_ENTRY_Shut_Down, VALUE_ENTRY_Offline, VALUE_ENTRY_Test, VALUE_ENTRY_Defer,
                VALUE_ENTRY_Quiesce, VALUE_ENTRY_Reboot, VALUE_ENTRY_Reset };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property RequestedStatesSupported   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Enabled,
                VALUE_ENTRY_Disabled, VALUE_ENTRY_Shut_Down, VALUE_ENTRY_Offline, VALUE_ENTRY_Test,
                VALUE_ENTRY_Defer, VALUE_ENTRY_Quiesce, VALUE_ENTRY_Reboot, VALUE_ENTRY_Reset };

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim221");
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
     *   EnabledLogicalElementCapabilities describes the capabilities supported for changing the state of the associated EnabledLogicalElement.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_EnabledLogicalElementCapabilities(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   EnabledLogicalElementCapabilities describes the capabilities supported for changing the state of the associated EnabledLogicalElement.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_EnabledLogicalElementCapabilities(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_EnabledLogicalElementCapabilities() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ElementNameEditSupported", new CIMProperty(
                "ElementNameEditSupported", CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("MaxElementNameLen", new CIMProperty("MaxElementNameLen",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("RequestedStatesSupported", new CIMProperty(
                "RequestedStatesSupported", CIMDataType.UINT16_ARRAY_T, null));

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
     * Get the property ElementNameEditSupported
     *     * <br>
     * Boolean indicating whether the ElementName can be modified.
     *     */

    public Boolean get_ElementNameEditSupported() {
        CIMProperty currentProperty = getProperty(PROPERTY_ELEMENTNAMEEDITSUPPORTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ELEMENTNAMEEDITSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property ElementNameEditSupported
     * <br>
     * Boolean indicating whether the ElementName can be modified.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ElementNameEditSupported(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ELEMENTNAMEEDITSUPPORTED.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ElementNameEditSupported(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ELEMENTNAMEEDITSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ElementNameEditSupported by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ElementNameEditSupported(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_EnabledLogicalElementCapabilities fco = new CIM_EnabledLogicalElementCapabilities(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ELEMENTNAMEEDITSUPPORTED.NAME);
        if (property != null) {
            property = setPropertyValue_ElementNameEditSupported(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ELEMENTNAMEEDITSUPPORTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ElementNameEditSupported
     * <br>
     * Boolean indicating whether the ElementName can be modified.
     */

    private static CIMProperty setPropertyValue_ElementNameEditSupported(
            CIMProperty currentProperty, Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MaxElementNameLen
     *     * <br>
     * Maximum supported ElementName length.
     *     */

    public javax.cim.UnsignedInteger16 get_MaxElementNameLen() {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXELEMENTNAMELEN.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MAXELEMENTNAMELEN.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property MaxElementNameLen
     * <br>
     * Maximum supported ElementName length.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MaxElementNameLen(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXELEMENTNAMELEN.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_MaxElementNameLen(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MAXELEMENTNAMELEN.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MaxElementNameLen by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MaxElementNameLen(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_EnabledLogicalElementCapabilities fco = new CIM_EnabledLogicalElementCapabilities(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MAXELEMENTNAMELEN.NAME);
        if (property != null) {
            property = setPropertyValue_MaxElementNameLen(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MAXELEMENTNAMELEN.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MaxElementNameLen
     * <br>
     * Maximum supported ElementName length.
     */

    private static CIMProperty setPropertyValue_MaxElementNameLen(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RequestedStatesSupported
     *     * <br>
     * RequestedStatesSupported indicates the possible states that can be requested when using the method RequestStateChange on the EnabledLogicalElement.
     *     */

    public javax.cim.UnsignedInteger16[] get_RequestedStatesSupported() {
        CIMProperty currentProperty = getProperty(PROPERTY_REQUESTEDSTATESSUPPORTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_REQUESTEDSTATESSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property RequestedStatesSupported
     * <br>
     * RequestedStatesSupported indicates the possible states that can be requested when using the method RequestStateChange on the EnabledLogicalElement.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RequestedStatesSupported(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_REQUESTEDSTATESSUPPORTED.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_RequestedStatesSupported(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_REQUESTEDSTATESSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RequestedStatesSupported by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RequestedStatesSupported(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_EnabledLogicalElementCapabilities fco = new CIM_EnabledLogicalElementCapabilities(
                client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REQUESTEDSTATESSUPPORTED.NAME);
        if (property != null) {
            property = setPropertyValue_RequestedStatesSupported(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_REQUESTEDSTATESSUPPORTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RequestedStatesSupported
     * <br>
     * RequestedStatesSupported indicates the possible states that can be requested when using the method RequestStateChange on the EnabledLogicalElement.
     */

    private static CIMProperty setPropertyValue_RequestedStatesSupported(
            CIMProperty currentProperty, javax.cim.UnsignedInteger16[] newValue) {
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
        return CIM_EnabledLogicalElementCapabilities.CIM_CLASS_NAME;
    }

}