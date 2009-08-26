/**
 * CIM_LogicalPort.java Â© Copyright IBM Corp. 2006,2007 THIS FILE IS PROVIDED UNDER THE TER MS OF
 * THE COMMON PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/cpl1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: The abstraction of a port or connection point
 *            of a Device. This object should be instantiated when the Port has independent
 *            management characteristics from the Device that includes it. Examples are a Fibre
 *            Channel Port and a USB Port. generated Class
 */

package org.sblim.wbemsmt.schema.cim221;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_LogicalPort extends CIM_LogicalDevice {

    public final static String CIM_CLASS_NAME = "CIM_LogicalPort";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property MaxSpeed
     * The maximum bandwidth of the Port in Bits per Second.
     */
    public static class PROPERTY_MAXSPEED {
        /**
         * name of the property MaxSpeed
         */
        public final static String NAME = "MaxSpeed";

    }

    /**
     * Constants of property OtherPortType
     * Describes the type of module, when PortType is set to 1 ("Other").
     */
    public static class PROPERTY_OTHERPORTTYPE {
        /**
         * name of the property OtherPortType
         */
        public final static String NAME = "OtherPortType";

    }

    /**
     * Constants of property PortType
     * PortType is defined to force consistent naming of the 'type' property in subclasses and to guarantee unique enum values for all instances of NetworkPort. When set to 1 ("Other"), related property OtherPortType contains a string description of the type of port. A range of values, DMTF_Reserved, has been defined that allows subclasses to override and define their specific types of ports.
     */
    public static class PROPERTY_PORTTYPE {
        /**
         * name of the property PortType
         */
        public final static String NAME = "PortType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Not_Applicable = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Not Applicable (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Not_Applicable = "Not Applicable";

        /**
         * constant for value map entry 3..15999
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry 3..15999 )
         */
        public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

        /**
         * constant for value map entry 16000..65535
         */

        /**
         * constant for value entry Vendor Reserved (corresponds to mapEntry 16000..65535 )
         */
        public final static String VALUE_ENTRY_Vendor_Reserved = "Vendor Reserved";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Not_Applicable.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Not_Applicable;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Not_Applicable.intValue()) {
                return VALUE_ENTRY_Not_Applicable;
            }

            if (iValue >= 3 || iValue <= 15999) {
                return VALUE_ENTRY_DMTF_Reserved;
            }

            if (iValue >= 16000 || iValue <= 65535) {
                return VALUE_ENTRY_Vendor_Reserved;
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
         * Value Map for the property PortType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Not_Applicable };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property PortType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Not_Applicable, VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property PortType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Not_Applicable };

    }

    /**
     * Constants of property RequestedSpeed
     * The requested bandwidth of the Port in Bits per Second. The actual bandwidth is reported in LogicalPort.Speed.
     */
    public static class PROPERTY_REQUESTEDSPEED {
        /**
         * name of the property RequestedSpeed
         */
        public final static String NAME = "RequestedSpeed";

    }

    /**
     * Constants of property Speed
     * The bandwidth of the Port in Bits per Second.
     */
    public static class PROPERTY_SPEED {
        /**
         * name of the property Speed
         */
        public final static String NAME = "Speed";

    }

    /**
     * Constants of property UsageRestriction
     * In some circumstances, a LogicalPort might be identifiable as a front end or back end port. An example of this situation would be a storage array that might have back end ports to communicate with disk drives and front end ports to communicate with hosts. If there is no restriction on the use of the port, then the value should be set to 'not restricted'.
     */
    public static class PROPERTY_USAGERESTRICTION {
        /**
         * name of the property UsageRestriction
         */
        public final static String NAME = "UsageRestriction";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Front_end_only = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Front-end only (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Front_end_only = "Front-end only";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Back_end_only = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Back-end only (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Back_end_only = "Back-end only";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Not_restricted = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Not restricted (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Not_restricted = "Not restricted";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Front_end_only.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Front_end_only;
            }

            if (VALUE_ENTRY_Back_end_only.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Back_end_only;
            }

            if (VALUE_ENTRY_Not_restricted.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Not_restricted;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Front_end_only.intValue()) {
                return VALUE_ENTRY_Front_end_only;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Back_end_only.intValue()) {
                return VALUE_ENTRY_Back_end_only;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Not_restricted.intValue()) {
                return VALUE_ENTRY_Not_restricted;
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
         * Value Map for the property UsageRestriction   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Front_end_only,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Back_end_only,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Not_restricted };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property UsageRestriction   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Front_end_only, VALUE_ENTRY_Back_end_only, VALUE_ENTRY_Not_restricted };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property UsageRestriction   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Front_end_only, VALUE_ENTRY_Back_end_only, VALUE_ENTRY_Not_restricted };

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim221");
        String[] parentClassPackageList = CIM_LogicalDevice.getPackages();

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
     *   The abstraction of a port or connection point of a Device. This object should be instantiated when the Port has independent management characteristics from the Device that includes it. Examples are a Fibre Channel Port and a USB Port.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_LogicalPort(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The abstraction of a port or connection point of a Device. This object should be instantiated when the Port has independent management characteristics from the Device that includes it. Examples are a Fibre Channel Port and a USB Port.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_LogicalPort(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_LogicalPort() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("MaxSpeed", new CIMProperty("MaxSpeed", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("OtherPortType", new CIMProperty("OtherPortType",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("PortType", new CIMProperty("PortType", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("RequestedSpeed", new CIMProperty("RequestedSpeed",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("Speed", new CIMProperty("Speed", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("UsageRestriction", new CIMProperty("UsageRestriction",
                CIMDataType.UINT16_T, null));

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
     * Get the property MaxSpeed
     *     * <br>
     * The maximum bandwidth of the Port in Bits per Second.
     *     */

    public javax.cim.UnsignedInteger64 get_MaxSpeed() {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXSPEED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MAXSPEED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property MaxSpeed
     * <br>
     * The maximum bandwidth of the Port in Bits per Second.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MaxSpeed(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXSPEED.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_MaxSpeed(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MAXSPEED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MaxSpeed by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MaxSpeed(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_LogicalPort fco = new CIM_LogicalPort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MAXSPEED.NAME);
        if (property != null) {
            property = setPropertyValue_MaxSpeed(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MAXSPEED.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MaxSpeed
     * <br>
     * The maximum bandwidth of the Port in Bits per Second.
     */

    private static CIMProperty setPropertyValue_MaxSpeed(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherPortType
     *     * <br>
     * Describes the type of module, when PortType is set to 1 ("Other").
     *     */

    public String get_OtherPortType() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERPORTTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERPORTTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherPortType
     * <br>
     * Describes the type of module, when PortType is set to 1 ("Other").
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherPortType(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERPORTTYPE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_OtherPortType(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERPORTTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherPortType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherPortType(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_LogicalPort fco = new CIM_LogicalPort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERPORTTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_OtherPortType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERPORTTYPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherPortType
     * <br>
     * Describes the type of module, when PortType is set to 1 ("Other").
     */

    private static CIMProperty setPropertyValue_OtherPortType(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PortType
     *     * <br>
     * PortType is defined to force consistent naming of the 'type' property in subclasses and to guarantee unique enum values for all instances of NetworkPort. When set to 1 ("Other"), related property OtherPortType contains a string description of the type of port. A range of values, DMTF_Reserved, has been defined that allows subclasses to override and define their specific types of ports.
     *     */

    public javax.cim.UnsignedInteger16 get_PortType() {
        CIMProperty currentProperty = getProperty(PROPERTY_PORTTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PORTTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property PortType
     * <br>
     * PortType is defined to force consistent naming of the 'type' property in subclasses and to guarantee unique enum values for all instances of NetworkPort. When set to 1 ("Other"), related property OtherPortType contains a string description of the type of port. A range of values, DMTF_Reserved, has been defined that allows subclasses to override and define their specific types of ports.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PortType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PORTTYPE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_PortType(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PORTTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PortType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PortType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_LogicalPort fco = new CIM_LogicalPort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PORTTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_PortType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PORTTYPE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PortType
     * <br>
     * PortType is defined to force consistent naming of the 'type' property in subclasses and to guarantee unique enum values for all instances of NetworkPort. When set to 1 ("Other"), related property OtherPortType contains a string description of the type of port. A range of values, DMTF_Reserved, has been defined that allows subclasses to override and define their specific types of ports.
     */

    private static CIMProperty setPropertyValue_PortType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RequestedSpeed
     *     * <br>
     * The requested bandwidth of the Port in Bits per Second. The actual bandwidth is reported in LogicalPort.Speed.
     *     */

    public javax.cim.UnsignedInteger64 get_RequestedSpeed() {
        CIMProperty currentProperty = getProperty(PROPERTY_REQUESTEDSPEED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_REQUESTEDSPEED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property RequestedSpeed
     * <br>
     * The requested bandwidth of the Port in Bits per Second. The actual bandwidth is reported in LogicalPort.Speed.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RequestedSpeed(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_REQUESTEDSPEED.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_RequestedSpeed(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_REQUESTEDSPEED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RequestedSpeed by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RequestedSpeed(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_LogicalPort fco = new CIM_LogicalPort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REQUESTEDSPEED.NAME);
        if (property != null) {
            property = setPropertyValue_RequestedSpeed(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_REQUESTEDSPEED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RequestedSpeed
     * <br>
     * The requested bandwidth of the Port in Bits per Second. The actual bandwidth is reported in LogicalPort.Speed.
     */

    private static CIMProperty setPropertyValue_RequestedSpeed(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Speed
     *     * <br>
     * The bandwidth of the Port in Bits per Second.
     *     */

    public javax.cim.UnsignedInteger64 get_Speed() {
        CIMProperty currentProperty = getProperty(PROPERTY_SPEED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SPEED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property Speed
     * <br>
     * The bandwidth of the Port in Bits per Second.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Speed(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SPEED.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Speed(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SPEED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Speed by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Speed(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_LogicalPort fco = new CIM_LogicalPort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SPEED.NAME);
        if (property != null) {
            property = setPropertyValue_Speed(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SPEED.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Speed
     * <br>
     * The bandwidth of the Port in Bits per Second.
     */

    private static CIMProperty setPropertyValue_Speed(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property UsageRestriction
     *     * <br>
     * In some circumstances, a LogicalPort might be identifiable as a front end or back end port. An example of this situation would be a storage array that might have back end ports to communicate with disk drives and front end ports to communicate with hosts. If there is no restriction on the use of the port, then the value should be set to 'not restricted'.
     *     */

    public javax.cim.UnsignedInteger16 get_UsageRestriction() {
        CIMProperty currentProperty = getProperty(PROPERTY_USAGERESTRICTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_USAGERESTRICTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property UsageRestriction
     * <br>
     * In some circumstances, a LogicalPort might be identifiable as a front end or back end port. An example of this situation would be a storage array that might have back end ports to communicate with disk drives and front end ports to communicate with hosts. If there is no restriction on the use of the port, then the value should be set to 'not restricted'.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_UsageRestriction(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_USAGERESTRICTION.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_UsageRestriction(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_USAGERESTRICTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property UsageRestriction by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_UsageRestriction(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_LogicalPort fco = new CIM_LogicalPort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_USAGERESTRICTION.NAME);
        if (property != null) {
            property = setPropertyValue_UsageRestriction(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_USAGERESTRICTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property UsageRestriction
     * <br>
     * In some circumstances, a LogicalPort might be identifiable as a front end or back end port. An example of this situation would be a storage array that might have back end ports to communicate with disk drives and front end ports to communicate with hosts. If there is no restriction on the use of the port, then the value should be set to 'not restricted'.
     */

    private static CIMProperty setPropertyValue_UsageRestriction(CIMProperty currentProperty,
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
        return CIM_LogicalPort.CIM_CLASS_NAME;
    }

}