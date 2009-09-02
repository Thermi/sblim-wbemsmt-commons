/**
 * CIM_LANEndpoint.java Â© Copyright IBM Corp.  2009,2005 THIS FILE IS PROVIDED UNDER THE TERMS OF
 * THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Eclipse
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: A communication endpoint which, when its
 *            associated interface device is connected to a LAN, may send and receive data frames.
 *            LANEndpoints include Ethernet, Token Ring and FDDI interfaces. generated Class
 */

package org.sblim.wbemsmt.schema.cim221;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_LANEndpoint extends CIM_ProtocolEndpoint {

    public final static String CIM_CLASS_NAME = "CIM_LANEndpoint";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property AliasAddresses
     * Other unicast addresses that may be used to communicate with the LANEndpoint.
     */
    public static class PROPERTY_ALIASADDRESSES {
        /**
         * name of the property AliasAddresses
         */
        public final static String NAME = "AliasAddresses";

    }

    /**
     * Constants of property GroupAddresses
     * Multicast addresses to which the LANEndpoint listens.
     */
    public static class PROPERTY_GROUPADDRESSES {
        /**
         * name of the property GroupAddresses
         */
        public final static String NAME = "GroupAddresses";

    }

    /**
     * Constants of property LANID
     * A label or identifier for the LAN Segment to which the Endpoint is connected. If the Endpoint is not currently active/connected or this information is not known, then LANID is NULL.
     */
    public static class PROPERTY_LANID {
        /**
         * name of the property LANID
         */
        public final static String NAME = "LANID";

    }

    /**
     * Constants of property LANType
     * An indication of the kind of technology used on the LAN. This property is deprecated in lieu of ProtocolType, which is an enumeration inherited from ProtocolEndpoint and which includes the Values specified here.
     */
    public static class PROPERTY_LANTYPE {
        /**
         * name of the property LANType
         */
        public final static String NAME = "LANType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Ethernet = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Ethernet (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Ethernet = "Ethernet";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_TokenRing = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry TokenRing (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_TokenRing = "TokenRing";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_FDDI = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry FDDI (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_FDDI = "FDDI";

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

            if (VALUE_ENTRY_Ethernet.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Ethernet;
            }

            if (VALUE_ENTRY_TokenRing.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_TokenRing;
            }

            if (VALUE_ENTRY_FDDI.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_FDDI;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Ethernet.intValue()) {
                return VALUE_ENTRY_Ethernet;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_TokenRing.intValue()) {
                return VALUE_ENTRY_TokenRing;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_FDDI.intValue()) {
                return VALUE_ENTRY_FDDI;
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
         * Value Map for the property LANType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Ethernet,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_TokenRing, VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_FDDI };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property LANType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Ethernet, VALUE_ENTRY_TokenRing, VALUE_ENTRY_FDDI };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property LANType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Ethernet, VALUE_ENTRY_TokenRing, VALUE_ENTRY_FDDI };

    }

    /**
     * Constants of property MACAddress
     * The principal unicast address used in communication with the LANEndpoint. The MAC address is formatted as twelve hexadecimal digits (e.g., "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order according to RFC 2469.
     */
    public static class PROPERTY_MACADDRESS {
        /**
         * name of the property MACAddress
         */
        public final static String NAME = "MACAddress";

    }

    /**
     * Constants of property MaxDataSize
     * The largest information field that may be sent or received by the LANEndpoint.
     */
    public static class PROPERTY_MAXDATASIZE {
        /**
         * name of the property MaxDataSize
         */
        public final static String NAME = "MaxDataSize";

    }

    /**
     * Constants of property OtherLANType
     * A free-form string that describes the type of technology used on the LAN when the value of the LANType property is equal to 1 (i.e., "Other"). This property is deprecated since its purpose overlaps with OtherTypeDescription, which which is inherited from ProtocolEndpoint.
     */
    public static class PROPERTY_OTHERLANTYPE {
        /**
         * name of the property OtherLANType
         */
        public final static String NAME = "OtherLANType";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim221");
        String[] parentClassPackageList = CIM_ProtocolEndpoint.getPackages();

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
     *   A communication endpoint which, when its associated interface device is connected to a LAN, may send and receive data frames. LANEndpoints include Ethernet, Token Ring and FDDI interfaces.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_LANEndpoint(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A communication endpoint which, when its associated interface device is connected to a LAN, may send and receive data frames. LANEndpoints include Ethernet, Token Ring and FDDI interfaces.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_LANEndpoint(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_LANEndpoint() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("AliasAddresses", new CIMProperty("AliasAddresses",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("GroupAddresses", new CIMProperty("GroupAddresses",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("LANID", new CIMProperty("LANID", CIMDataType.STRING_T, null));
        propertiesToCheck.put("LANType", new CIMProperty("LANType", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("MACAddress", new CIMProperty("MACAddress", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("MaxDataSize", new CIMProperty("MaxDataSize", CIMDataType.UINT32_T,
                null));
        propertiesToCheck.put("OtherLANType", new CIMProperty("OtherLANType", CIMDataType.STRING_T,
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
     * Get the property AliasAddresses
     *     * <br>
     * Other unicast addresses that may be used to communicate with the LANEndpoint.
     *     */

    public String[] get_AliasAddresses() {
        CIMProperty currentProperty = getProperty(PROPERTY_ALIASADDRESSES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ALIASADDRESSES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property AliasAddresses
     * <br>
     * Other unicast addresses that may be used to communicate with the LANEndpoint.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AliasAddresses(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ALIASADDRESSES.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_AliasAddresses(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ALIASADDRESSES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AliasAddresses by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AliasAddresses(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_LANEndpoint fco = new CIM_LANEndpoint(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ALIASADDRESSES.NAME);
        if (property != null) {
            property = setPropertyValue_AliasAddresses(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ALIASADDRESSES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AliasAddresses
     * <br>
     * Other unicast addresses that may be used to communicate with the LANEndpoint.
     */

    private static CIMProperty setPropertyValue_AliasAddresses(CIMProperty currentProperty,
            String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property GroupAddresses
     *     * <br>
     * Multicast addresses to which the LANEndpoint listens.
     *     */

    public String[] get_GroupAddresses() {
        CIMProperty currentProperty = getProperty(PROPERTY_GROUPADDRESSES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_GROUPADDRESSES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property GroupAddresses
     * <br>
     * Multicast addresses to which the LANEndpoint listens.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_GroupAddresses(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_GROUPADDRESSES.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_GroupAddresses(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_GROUPADDRESSES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property GroupAddresses by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_GroupAddresses(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_LANEndpoint fco = new CIM_LANEndpoint(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_GROUPADDRESSES.NAME);
        if (property != null) {
            property = setPropertyValue_GroupAddresses(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_GROUPADDRESSES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property GroupAddresses
     * <br>
     * Multicast addresses to which the LANEndpoint listens.
     */

    private static CIMProperty setPropertyValue_GroupAddresses(CIMProperty currentProperty,
            String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LANID
     *     * <br>
     * A label or identifier for the LAN Segment to which the Endpoint is connected. If the Endpoint is not currently active/connected or this information is not known, then LANID is NULL.
     *     */

    public String get_LANID() {
        CIMProperty currentProperty = getProperty(PROPERTY_LANID.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LANID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property LANID
     * <br>
     * A label or identifier for the LAN Segment to which the Endpoint is connected. If the Endpoint is not currently active/connected or this information is not known, then LANID is NULL.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LANID(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LANID.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_LANID(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LANID.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LANID by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LANID(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_LANEndpoint fco = new CIM_LANEndpoint(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LANID.NAME);
        if (property != null) {
            property = setPropertyValue_LANID(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LANID.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LANID
     * <br>
     * A label or identifier for the LAN Segment to which the Endpoint is connected. If the Endpoint is not currently active/connected or this information is not known, then LANID is NULL.
     */

    private static CIMProperty setPropertyValue_LANID(CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LANType
     *     * <br>
     * An indication of the kind of technology used on the LAN. This property is deprecated in lieu of ProtocolType, which is an enumeration inherited from ProtocolEndpoint and which includes the Values specified here.
     *     */

    public javax.cim.UnsignedInteger16 get_LANType() {
        CIMProperty currentProperty = getProperty(PROPERTY_LANTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LANTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property LANType
     * <br>
     * An indication of the kind of technology used on the LAN. This property is deprecated in lieu of ProtocolType, which is an enumeration inherited from ProtocolEndpoint and which includes the Values specified here.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LANType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LANTYPE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_LANType(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LANTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LANType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LANType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_LANEndpoint fco = new CIM_LANEndpoint(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LANTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_LANType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LANTYPE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LANType
     * <br>
     * An indication of the kind of technology used on the LAN. This property is deprecated in lieu of ProtocolType, which is an enumeration inherited from ProtocolEndpoint and which includes the Values specified here.
     */

    private static CIMProperty setPropertyValue_LANType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MACAddress
     *     * <br>
     * The principal unicast address used in communication with the LANEndpoint. The MAC address is formatted as twelve hexadecimal digits (e.g., "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order according to RFC 2469.
     *     */

    public String get_MACAddress() {
        CIMProperty currentProperty = getProperty(PROPERTY_MACADDRESS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MACADDRESS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property MACAddress
     * <br>
     * The principal unicast address used in communication with the LANEndpoint. The MAC address is formatted as twelve hexadecimal digits (e.g., "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order according to RFC 2469.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MACAddress(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MACADDRESS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_MACAddress(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MACADDRESS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MACAddress by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MACAddress(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_LANEndpoint fco = new CIM_LANEndpoint(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MACADDRESS.NAME);
        if (property != null) {
            property = setPropertyValue_MACAddress(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MACADDRESS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MACAddress
     * <br>
     * The principal unicast address used in communication with the LANEndpoint. The MAC address is formatted as twelve hexadecimal digits (e.g., "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order according to RFC 2469.
     */

    private static CIMProperty setPropertyValue_MACAddress(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MaxDataSize
     *     * <br>
     * The largest information field that may be sent or received by the LANEndpoint.
     *     */

    public javax.cim.UnsignedInteger32 get_MaxDataSize() {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXDATASIZE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MAXDATASIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property MaxDataSize
     * <br>
     * The largest information field that may be sent or received by the LANEndpoint.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MaxDataSize(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXDATASIZE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_MaxDataSize(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MAXDATASIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MaxDataSize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MaxDataSize(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_LANEndpoint fco = new CIM_LANEndpoint(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MAXDATASIZE.NAME);
        if (property != null) {
            property = setPropertyValue_MaxDataSize(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MAXDATASIZE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MaxDataSize
     * <br>
     * The largest information field that may be sent or received by the LANEndpoint.
     */

    private static CIMProperty setPropertyValue_MaxDataSize(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherLANType
     *     * <br>
     * A free-form string that describes the type of technology used on the LAN when the value of the LANType property is equal to 1 (i.e., "Other"). This property is deprecated since its purpose overlaps with OtherTypeDescription, which which is inherited from ProtocolEndpoint.
     *     */

    public String get_OtherLANType() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERLANTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERLANTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherLANType
     * <br>
     * A free-form string that describes the type of technology used on the LAN when the value of the LANType property is equal to 1 (i.e., "Other"). This property is deprecated since its purpose overlaps with OtherTypeDescription, which which is inherited from ProtocolEndpoint.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherLANType(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERLANTYPE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_OtherLANType(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERLANTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherLANType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherLANType(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_LANEndpoint fco = new CIM_LANEndpoint(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERLANTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_OtherLANType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERLANTYPE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherLANType
     * <br>
     * A free-form string that describes the type of technology used on the LAN when the value of the LANType property is equal to 1 (i.e., "Other"). This property is deprecated since its purpose overlaps with OtherTypeDescription, which which is inherited from ProtocolEndpoint.
     */

    private static CIMProperty setPropertyValue_OtherLANType(CIMProperty currentProperty,
            String newValue) {
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
        return CIM_LANEndpoint.CIM_CLASS_NAME;
    }

}