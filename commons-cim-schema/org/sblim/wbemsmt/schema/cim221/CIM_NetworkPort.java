/**
 * CIM_NetworkPort.java Â© Copyright IBM Corp.  2009,2005 THIS FILE IS PROVIDED UNDER THE TERMS OF
 * THE ECLIPSE PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Eclipse
 * Public License from http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: NetworkPort is the logical representation of
 *            network communications hardware such as a physical connector and the setup or
 *            operation of the network chips, at the lowest layers of a network stack. generated
 *            Class
 */

package org.sblim.wbemsmt.schema.cim221;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_NetworkPort extends CIM_LogicalPort {

    public final static String CIM_CLASS_NAME = "CIM_NetworkPort";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property ActiveMaximumTransmissionUnit
     * The active or negotiated maximum transmission unit (MTU) that can be supported.
     */
    public static class PROPERTY_ACTIVEMAXIMUMTRANSMISSIONUNIT {
        /**
         * name of the property ActiveMaximumTransmissionUnit
         */
        public final static String NAME = "ActiveMaximumTransmissionUnit";

    }

    /**
     * Constants of property AutoSense
     * A Boolean that indicates whether the NetworkPort is capable of automatically determining the speed or other communications characteristics of the attached network media.
     */
    public static class PROPERTY_AUTOSENSE {
        /**
         * name of the property AutoSense
         */
        public final static String NAME = "AutoSense";

    }

    /**
     * Constants of property FullDuplex
     * Boolean that indicates that the port is operating in full duplex mode.
     */
    public static class PROPERTY_FULLDUPLEX {
        /**
         * name of the property FullDuplex
         */
        public final static String NAME = "FullDuplex";

    }

    /**
     * Constants of property LinkTechnology
     * An enumeration of the types of links. When set to 1 ("Other"), the related property OtherLinkTechnology contains a string description of the type of link.
     */
    public static class PROPERTY_LINKTECHNOLOGY {
        /**
         * name of the property LinkTechnology
         */
        public final static String NAME = "LinkTechnology";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_IB = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry IB (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_IB = "IB";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_FC = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry FC (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_FC = "FC";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_FDDI = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry FDDI (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_FDDI = "FDDI";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_ATM = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry ATM (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_ATM = "ATM";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Token_Ring = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Token Ring (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Token_Ring = "Token Ring";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Frame_Relay = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Frame Relay (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Frame_Relay = "Frame Relay";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Infrared = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Infrared (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Infrared = "Infrared";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_BlueTooth = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry BlueTooth (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_BlueTooth = "BlueTooth";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Wireless_LAN = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry Wireless LAN (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_Wireless_LAN = "Wireless LAN";

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

            if (VALUE_ENTRY_IB.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_IB;
            }

            if (VALUE_ENTRY_FC.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_FC;
            }

            if (VALUE_ENTRY_FDDI.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_FDDI;
            }

            if (VALUE_ENTRY_ATM.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_ATM;
            }

            if (VALUE_ENTRY_Token_Ring.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Token_Ring;
            }

            if (VALUE_ENTRY_Frame_Relay.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Frame_Relay;
            }

            if (VALUE_ENTRY_Infrared.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Infrared;
            }

            if (VALUE_ENTRY_BlueTooth.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_BlueTooth;
            }

            if (VALUE_ENTRY_Wireless_LAN.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Wireless_LAN;
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

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_IB.intValue()) {
                return VALUE_ENTRY_IB;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_FC.intValue()) {
                return VALUE_ENTRY_FC;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_FDDI.intValue()) {
                return VALUE_ENTRY_FDDI;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_ATM.intValue()) {
                return VALUE_ENTRY_ATM;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Token_Ring.intValue()) {
                return VALUE_ENTRY_Token_Ring;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Frame_Relay.intValue()) {
                return VALUE_ENTRY_Frame_Relay;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Infrared.intValue()) {
                return VALUE_ENTRY_Infrared;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_BlueTooth.intValue()) {
                return VALUE_ENTRY_BlueTooth;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Wireless_LAN.intValue()) {
                return VALUE_ENTRY_Wireless_LAN;
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
         * Value Map for the property LinkTechnology   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Ethernet, VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_IB,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_FC, VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_FDDI,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_ATM,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Token_Ring,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Frame_Relay,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Infrared,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_BlueTooth,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Wireless_LAN };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property LinkTechnology   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Ethernet, VALUE_ENTRY_IB, VALUE_ENTRY_FC, VALUE_ENTRY_FDDI,
                VALUE_ENTRY_ATM, VALUE_ENTRY_Token_Ring, VALUE_ENTRY_Frame_Relay,
                VALUE_ENTRY_Infrared, VALUE_ENTRY_BlueTooth, VALUE_ENTRY_Wireless_LAN };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property LinkTechnology   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Ethernet, VALUE_ENTRY_IB, VALUE_ENTRY_FC,
                VALUE_ENTRY_FDDI, VALUE_ENTRY_ATM, VALUE_ENTRY_Token_Ring, VALUE_ENTRY_Frame_Relay,
                VALUE_ENTRY_Infrared, VALUE_ENTRY_BlueTooth, VALUE_ENTRY_Wireless_LAN };

    }

    /**
     * Constants of property NetworkAddresses
     * An array of strings that indicates the network addresses for the port.
     */
    public static class PROPERTY_NETWORKADDRESSES {
        /**
         * name of the property NetworkAddresses
         */
        public final static String NAME = "NetworkAddresses";

    }

    /**
     * Constants of property OtherLinkTechnology
     * A string value that describes LinkTechnology when it is set to 1, "Other".
     */
    public static class PROPERTY_OTHERLINKTECHNOLOGY {
        /**
         * name of the property OtherLinkTechnology
         */
        public final static String NAME = "OtherLinkTechnology";

    }

    /**
     * Constants of property OtherNetworkPortType
     * Note: The use of this property is deprecated in lieu of CIM_LogicalPort.PortType. 
     * Deprecated description: The type of module, when PortType is set to 1 ("Other".)
     */
    public static class PROPERTY_OTHERNETWORKPORTTYPE {
        /**
         * name of the property OtherNetworkPortType
         */
        public final static String NAME = "OtherNetworkPortType";

    }

    /**
     * Constants of property PermanentAddress
     * PermanentAddress defines the network address that is hardcoded into a port. This 'hardcoded' address can be changed using a firmware upgrade or a software configuration. When this change is made, the field should be updated at the same time. PermanentAddress should be left blank if no 'hardcoded' address exists for the NetworkAdapter.
     */
    public static class PROPERTY_PERMANENTADDRESS {
        /**
         * name of the property PermanentAddress
         */
        public final static String NAME = "PermanentAddress";

    }

    /**
     * Constants of property PortNumber
     * NetworkPorts are often numbered relative to either a logical module or a network element.
     */
    public static class PROPERTY_PORTNUMBER {
        /**
         * name of the property PortNumber
         */
        public final static String NAME = "PortNumber";

    }

    /**
     * Constants of property Speed
     * The current bandwidth of the Port in Bits per Second. For ports that vary in bandwidth or for those where no accurate estimation can be made, this property should contain the nominal bandwidth.
     */
    public static class PROPERTY_SPEED {
        /**
         * name of the property Speed
         */
        public final static String NAME = "Speed";

    }

    /**
     * Constants of property SupportedMaximumTransmissionUnit
     * The maximum transmission unit (MTU) that can be supported.
     */
    public static class PROPERTY_SUPPORTEDMAXIMUMTRANSMISSIONUNIT {
        /**
         * name of the property SupportedMaximumTransmissionUnit
         */
        public final static String NAME = "SupportedMaximumTransmissionUnit";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim221");
        String[] parentClassPackageList = CIM_LogicalPort.getPackages();

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
     *   NetworkPort is the logical representation of network communications hardware such as a physical connector and the setup or operation of the network chips, at the lowest layers of a network stack.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_NetworkPort(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   NetworkPort is the logical representation of network communications hardware such as a physical connector and the setup or operation of the network chips, at the lowest layers of a network stack.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_NetworkPort(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_NetworkPort() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ActiveMaximumTransmissionUnit", new CIMProperty(
                "ActiveMaximumTransmissionUnit", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("AutoSense",
                new CIMProperty("AutoSense", CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("FullDuplex", new CIMProperty("FullDuplex", CIMDataType.BOOLEAN_T,
                null));
        propertiesToCheck.put("LinkTechnology", new CIMProperty("LinkTechnology",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("NetworkAddresses", new CIMProperty("NetworkAddresses",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("OtherLinkTechnology", new CIMProperty("OtherLinkTechnology",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("OtherNetworkPortType", new CIMProperty("OtherNetworkPortType",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("PermanentAddress", new CIMProperty("PermanentAddress",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("PortNumber", new CIMProperty("PortNumber", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("Speed", new CIMProperty("Speed", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("SupportedMaximumTransmissionUnit", new CIMProperty(
                "SupportedMaximumTransmissionUnit", CIMDataType.UINT64_T, null));

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
     * Get the property ActiveMaximumTransmissionUnit
     *     * <br>
     * The active or negotiated maximum transmission unit (MTU) that can be supported.
     *     */

    public javax.cim.UnsignedInteger64 get_ActiveMaximumTransmissionUnit() {
        CIMProperty currentProperty = getProperty(PROPERTY_ACTIVEMAXIMUMTRANSMISSIONUNIT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ACTIVEMAXIMUMTRANSMISSIONUNIT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ActiveMaximumTransmissionUnit
     * <br>
     * The active or negotiated maximum transmission unit (MTU) that can be supported.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ActiveMaximumTransmissionUnit(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ACTIVEMAXIMUMTRANSMISSIONUNIT.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ActiveMaximumTransmissionUnit(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ACTIVEMAXIMUMTRANSMISSIONUNIT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ActiveMaximumTransmissionUnit by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ActiveMaximumTransmissionUnit(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_NetworkPort fco = new CIM_NetworkPort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ACTIVEMAXIMUMTRANSMISSIONUNIT.NAME);
        if (property != null) {
            property = setPropertyValue_ActiveMaximumTransmissionUnit(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ACTIVEMAXIMUMTRANSMISSIONUNIT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ActiveMaximumTransmissionUnit
     * <br>
     * The active or negotiated maximum transmission unit (MTU) that can be supported.
     */

    private static CIMProperty setPropertyValue_ActiveMaximumTransmissionUnit(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property AutoSense
     *     * <br>
     * A Boolean that indicates whether the NetworkPort is capable of automatically determining the speed or other communications characteristics of the attached network media.
     *     */

    public Boolean get_AutoSense() {
        CIMProperty currentProperty = getProperty(PROPERTY_AUTOSENSE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_AUTOSENSE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property AutoSense
     * <br>
     * A Boolean that indicates whether the NetworkPort is capable of automatically determining the speed or other communications characteristics of the attached network media.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AutoSense(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_AUTOSENSE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_AutoSense(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_AUTOSENSE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AutoSense by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AutoSense(WBEMClient client, String namespace, Boolean newValue)
            throws WbemsmtException {
        CIM_NetworkPort fco = new CIM_NetworkPort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_AUTOSENSE.NAME);
        if (property != null) {
            property = setPropertyValue_AutoSense(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_AUTOSENSE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AutoSense
     * <br>
     * A Boolean that indicates whether the NetworkPort is capable of automatically determining the speed or other communications characteristics of the attached network media.
     */

    private static CIMProperty setPropertyValue_AutoSense(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property FullDuplex
     *     * <br>
     * Boolean that indicates that the port is operating in full duplex mode.
     *     */

    public Boolean get_FullDuplex() {
        CIMProperty currentProperty = getProperty(PROPERTY_FULLDUPLEX.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FULLDUPLEX.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property FullDuplex
     * <br>
     * Boolean that indicates that the port is operating in full duplex mode.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FullDuplex(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FULLDUPLEX.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_FullDuplex(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FULLDUPLEX.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FullDuplex by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FullDuplex(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_NetworkPort fco = new CIM_NetworkPort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FULLDUPLEX.NAME);
        if (property != null) {
            property = setPropertyValue_FullDuplex(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FULLDUPLEX.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FullDuplex
     * <br>
     * Boolean that indicates that the port is operating in full duplex mode.
     */

    private static CIMProperty setPropertyValue_FullDuplex(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LinkTechnology
     *     * <br>
     * An enumeration of the types of links. When set to 1 ("Other"), the related property OtherLinkTechnology contains a string description of the type of link.
     *     */

    public javax.cim.UnsignedInteger16 get_LinkTechnology() {
        CIMProperty currentProperty = getProperty(PROPERTY_LINKTECHNOLOGY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LINKTECHNOLOGY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property LinkTechnology
     * <br>
     * An enumeration of the types of links. When set to 1 ("Other"), the related property OtherLinkTechnology contains a string description of the type of link.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LinkTechnology(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LINKTECHNOLOGY.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_LinkTechnology(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LINKTECHNOLOGY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LinkTechnology by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LinkTechnology(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_NetworkPort fco = new CIM_NetworkPort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LINKTECHNOLOGY.NAME);
        if (property != null) {
            property = setPropertyValue_LinkTechnology(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LINKTECHNOLOGY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LinkTechnology
     * <br>
     * An enumeration of the types of links. When set to 1 ("Other"), the related property OtherLinkTechnology contains a string description of the type of link.
     */

    private static CIMProperty setPropertyValue_LinkTechnology(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property NetworkAddresses
     *     * <br>
     * An array of strings that indicates the network addresses for the port.
     *     */

    public String[] get_NetworkAddresses() {
        CIMProperty currentProperty = getProperty(PROPERTY_NETWORKADDRESSES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NETWORKADDRESSES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property NetworkAddresses
     * <br>
     * An array of strings that indicates the network addresses for the port.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_NetworkAddresses(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NETWORKADDRESSES.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_NetworkAddresses(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NETWORKADDRESSES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property NetworkAddresses by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NetworkAddresses(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_NetworkPort fco = new CIM_NetworkPort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NETWORKADDRESSES.NAME);
        if (property != null) {
            property = setPropertyValue_NetworkAddresses(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NETWORKADDRESSES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property NetworkAddresses
     * <br>
     * An array of strings that indicates the network addresses for the port.
     */

    private static CIMProperty setPropertyValue_NetworkAddresses(CIMProperty currentProperty,
            String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherLinkTechnology
     *     * <br>
     * A string value that describes LinkTechnology when it is set to 1, "Other".
     *     */

    public String get_OtherLinkTechnology() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERLINKTECHNOLOGY.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERLINKTECHNOLOGY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherLinkTechnology
     * <br>
     * A string value that describes LinkTechnology when it is set to 1, "Other".
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherLinkTechnology(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERLINKTECHNOLOGY.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_OtherLinkTechnology(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERLINKTECHNOLOGY.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherLinkTechnology by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherLinkTechnology(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_NetworkPort fco = new CIM_NetworkPort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERLINKTECHNOLOGY.NAME);
        if (property != null) {
            property = setPropertyValue_OtherLinkTechnology(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERLINKTECHNOLOGY.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherLinkTechnology
     * <br>
     * A string value that describes LinkTechnology when it is set to 1, "Other".
     */

    private static CIMProperty setPropertyValue_OtherLinkTechnology(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherNetworkPortType
     *     * <br>
     * Note: The use of this property is deprecated in lieu of CIM_LogicalPort.PortType. 
     * Deprecated description: The type of module, when PortType is set to 1 ("Other".)
     *     */

    public String get_OtherNetworkPortType() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERNETWORKPORTTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERNETWORKPORTTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherNetworkPortType
     * <br>
     * Note: The use of this property is deprecated in lieu of CIM_LogicalPort.PortType. 
     * Deprecated description: The type of module, when PortType is set to 1 ("Other".)
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherNetworkPortType(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERNETWORKPORTTYPE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_OtherNetworkPortType(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERNETWORKPORTTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherNetworkPortType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherNetworkPortType(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_NetworkPort fco = new CIM_NetworkPort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERNETWORKPORTTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_OtherNetworkPortType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERNETWORKPORTTYPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherNetworkPortType
     * <br>
     * Note: The use of this property is deprecated in lieu of CIM_LogicalPort.PortType. 
     * Deprecated description: The type of module, when PortType is set to 1 ("Other".)
     */

    private static CIMProperty setPropertyValue_OtherNetworkPortType(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PermanentAddress
     *     * <br>
     * PermanentAddress defines the network address that is hardcoded into a port. This 'hardcoded' address can be changed using a firmware upgrade or a software configuration. When this change is made, the field should be updated at the same time. PermanentAddress should be left blank if no 'hardcoded' address exists for the NetworkAdapter.
     *     */

    public String get_PermanentAddress() {
        CIMProperty currentProperty = getProperty(PROPERTY_PERMANENTADDRESS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PERMANENTADDRESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property PermanentAddress
     * <br>
     * PermanentAddress defines the network address that is hardcoded into a port. This 'hardcoded' address can be changed using a firmware upgrade or a software configuration. When this change is made, the field should be updated at the same time. PermanentAddress should be left blank if no 'hardcoded' address exists for the NetworkAdapter.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PermanentAddress(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PERMANENTADDRESS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_PermanentAddress(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PERMANENTADDRESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PermanentAddress by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PermanentAddress(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_NetworkPort fco = new CIM_NetworkPort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PERMANENTADDRESS.NAME);
        if (property != null) {
            property = setPropertyValue_PermanentAddress(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PERMANENTADDRESS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PermanentAddress
     * <br>
     * PermanentAddress defines the network address that is hardcoded into a port. This 'hardcoded' address can be changed using a firmware upgrade or a software configuration. When this change is made, the field should be updated at the same time. PermanentAddress should be left blank if no 'hardcoded' address exists for the NetworkAdapter.
     */

    private static CIMProperty setPropertyValue_PermanentAddress(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PortNumber
     *     * <br>
     * NetworkPorts are often numbered relative to either a logical module or a network element.
     *     */

    public javax.cim.UnsignedInteger16 get_PortNumber() {
        CIMProperty currentProperty = getProperty(PROPERTY_PORTNUMBER.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PORTNUMBER.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property PortNumber
     * <br>
     * NetworkPorts are often numbered relative to either a logical module or a network element.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PortNumber(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PORTNUMBER.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_PortNumber(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PORTNUMBER.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PortNumber by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PortNumber(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_NetworkPort fco = new CIM_NetworkPort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PORTNUMBER.NAME);
        if (property != null) {
            property = setPropertyValue_PortNumber(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PORTNUMBER.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PortNumber
     * <br>
     * NetworkPorts are often numbered relative to either a logical module or a network element.
     */

    private static CIMProperty setPropertyValue_PortNumber(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
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
     * The current bandwidth of the Port in Bits per Second. For ports that vary in bandwidth or for those where no accurate estimation can be made, this property should contain the nominal bandwidth.
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
     * The current bandwidth of the Port in Bits per Second. For ports that vary in bandwidth or for those where no accurate estimation can be made, this property should contain the nominal bandwidth.
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
        CIM_NetworkPort fco = new CIM_NetworkPort(client, namespace);
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
     * The current bandwidth of the Port in Bits per Second. For ports that vary in bandwidth or for those where no accurate estimation can be made, this property should contain the nominal bandwidth.
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
     * Get the property SupportedMaximumTransmissionUnit
     *     * <br>
     * The maximum transmission unit (MTU) that can be supported.
     *     */

    public javax.cim.UnsignedInteger64 get_SupportedMaximumTransmissionUnit() {
        CIMProperty currentProperty = getProperty(PROPERTY_SUPPORTEDMAXIMUMTRANSMISSIONUNIT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SUPPORTEDMAXIMUMTRANSMISSIONUNIT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property SupportedMaximumTransmissionUnit
     * <br>
     * The maximum transmission unit (MTU) that can be supported.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SupportedMaximumTransmissionUnit(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SUPPORTEDMAXIMUMTRANSMISSIONUNIT.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_SupportedMaximumTransmissionUnit(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SUPPORTEDMAXIMUMTRANSMISSIONUNIT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SupportedMaximumTransmissionUnit by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SupportedMaximumTransmissionUnit(WBEMClient client,
            String namespace, javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_NetworkPort fco = new CIM_NetworkPort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SUPPORTEDMAXIMUMTRANSMISSIONUNIT.NAME);
        if (property != null) {
            property = setPropertyValue_SupportedMaximumTransmissionUnit(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SUPPORTEDMAXIMUMTRANSMISSIONUNIT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SupportedMaximumTransmissionUnit
     * <br>
     * The maximum transmission unit (MTU) that can be supported.
     */

    private static CIMProperty setPropertyValue_SupportedMaximumTransmissionUnit(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
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
        return CIM_NetworkPort.CIM_CLASS_NAME;
    }

}