/** 
 * CIM_WakeUpService.java
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
 * Description: WakeUpService allows a UnitaryComputerSystem to be woken up from a low power sleep state. This Service is implemented by a LogicalDevice (e.g. NetworkAdapter or Modem) that is capable of receiving wakeup messages, and notifying the System.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;
import org.sblim.wbemsmt.exception.impl.*;
import org.sblim.wbemsmt.exception.impl.userobject.*;

import java.lang.reflect.*;
import javax.wbem.*;

public class CIM_WakeUpService extends CIM_Service {

    public final static String CIM_CLASS_NAME = "CIM_WakeUpService";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * The use of the CIM_WakeUpServiceOnNetworkAdapter class has been deprecated, since NetworkAdapter is deprecated. Instead use the CIM_WakeUpServiceOnNetworkPort class. WakeUpServiceOnNetworkAdapter defines where the WakeUpService is implemented.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKADAPTER = "CIM_WakeUpServiceOnNetworkAdapter";

    /**
     * WakeUpServiceOnNetworkPort defines where the WakeUpService is implemented. Currently, the Service can either employ a Modem or a NetworkPort for wakeup.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKPORT = "CIM_WakeUpServiceOnNetworkPort";

    /**
     * Constants of property FilterData
     * The binary data that is used to compare the contents of the received packet. This is used when the FilterType is set to "Binary Match" (value=7). This could also be used when the FilterType is set to "Other" (value=1).
     */
    public static class PROPERTY_FILTERDATA {
        /**
         * name of the property FilterData
         */
        public final static String NAME = "FilterData";

    }

    /**
     * Constants of property FilterType
     * The filter type on the packets/messages that trigger the WakeUpService. This field is only used when the WakeUp Type is set to "Wake On LAN - Packet Filtering" (value =3).
     */
    public static class PROPERTY_FILTERTYPE {
        /**
         * name of the property FilterType
         */
        public final static String NAME = "FilterType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_ARP_Broadcast = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry ARP Broadcast (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_ARP_Broadcast = "ARP Broadcast";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Neighbor_Discovery_Multicast = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Neighbor Discovery Multicast (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Neighbor_Discovery_Multicast = "Neighbor Discovery Multicast";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_IP_Packet_with_Directed_MAC_Address = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry IP Packet with Directed MAC Address (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_IP_Packet_with_Directed_MAC_Address = "IP Packet with Directed MAC Address";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_IPX_Diagnostic_Responder = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry IPX Diagnostic Responder (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_IPX_Diagnostic_Responder = "IPX Diagnostic Responder";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_NBT_Name_Query = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry NBT Name Query (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_NBT_Name_Query = "NBT Name Query";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Binary_Match = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Binary Match (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Binary_Match = "Binary Match";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@100e100e
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_ARP_Broadcast.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_ARP_Broadcast;
            }

            if (VALUE_ENTRY_Neighbor_Discovery_Multicast.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Neighbor_Discovery_Multicast;
            }

            if (VALUE_ENTRY_IP_Packet_with_Directed_MAC_Address.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_IP_Packet_with_Directed_MAC_Address;
            }

            if (VALUE_ENTRY_IPX_Diagnostic_Responder.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_IPX_Diagnostic_Responder;
            }

            if (VALUE_ENTRY_NBT_Name_Query.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_NBT_Name_Query;
            }

            if (VALUE_ENTRY_Binary_Match.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Binary_Match;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_ARP_Broadcast.intValue()) {
                return VALUE_ENTRY_ARP_Broadcast;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Neighbor_Discovery_Multicast.intValue()) {
                return VALUE_ENTRY_Neighbor_Discovery_Multicast;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_IP_Packet_with_Directed_MAC_Address
                    .intValue()) {
                return VALUE_ENTRY_IP_Packet_with_Directed_MAC_Address;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_IPX_Diagnostic_Responder.intValue()) {
                return VALUE_ENTRY_IPX_Diagnostic_Responder;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_NBT_Name_Query.intValue()) {
                return VALUE_ENTRY_NBT_Name_Query;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Binary_Match.intValue()) {
                return VALUE_ENTRY_Binary_Match;
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
         * Value Map for the property FilterType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_ARP_Broadcast,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Neighbor_Discovery_Multicast,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_IP_Packet_with_Directed_MAC_Address,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_IPX_Diagnostic_Responder,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_NBT_Name_Query,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Binary_Match };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property FilterType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_ARP_Broadcast, VALUE_ENTRY_Neighbor_Discovery_Multicast,
                VALUE_ENTRY_IP_Packet_with_Directed_MAC_Address,
                VALUE_ENTRY_IPX_Diagnostic_Responder, VALUE_ENTRY_NBT_Name_Query,
                VALUE_ENTRY_Binary_Match };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property FilterType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_ARP_Broadcast,
                VALUE_ENTRY_Neighbor_Discovery_Multicast,
                VALUE_ENTRY_IP_Packet_with_Directed_MAC_Address,
                VALUE_ENTRY_IPX_Diagnostic_Responder, VALUE_ENTRY_NBT_Name_Query,
                VALUE_ENTRY_Binary_Match };

    }

    /**
     * Constants of property OtherFilterTypeDescription
     * The description of the format of the FilterType used by the Service when the FilterType is set to "Other" (value=1).
     */
    public static class PROPERTY_OTHERFILTERTYPEDESCRIPTION {
        /**
         * name of the property OtherFilterTypeDescription
         */
        public final static String NAME = "OtherFilterTypeDescription";

    }

    /**
     * Constants of property OtherWakeUpTypeDescription
     * A description of the type of WakeUpService used when WakeUpType is set to "Other" (value=1).
     */
    public static class PROPERTY_OTHERWAKEUPTYPEDESCRIPTION {
        /**
         * name of the property OtherWakeUpTypeDescription
         */
        public final static String NAME = "OtherWakeUpTypeDescription";

    }

    /**
     * Constants of property WakeUpType
     * The Type of the WakeUp Service.
     */
    public static class PROPERTY_WAKEUPTYPE {
        /**
         * name of the property WakeUpType
         */
        public final static String NAME = "WakeUpType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Wake_On_LAN___Magic_Packet = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Wake On LAN - Magic Packet (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Wake_On_LAN___Magic_Packet = "Wake On LAN - Magic Packet";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Wake_on_LAN___Packet_Filtering = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Wake on LAN - Packet Filtering (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Wake_on_LAN___Packet_Filtering = "Wake on LAN - Packet Filtering";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Wake_On_Ring = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Wake On Ring (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Wake_On_Ring = "Wake On Ring";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@27ee27ee
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Wake_On_LAN___Magic_Packet.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Wake_On_LAN___Magic_Packet;
            }

            if (VALUE_ENTRY_Wake_on_LAN___Packet_Filtering.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Wake_on_LAN___Packet_Filtering;
            }

            if (VALUE_ENTRY_Wake_On_Ring.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Wake_On_Ring;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Wake_On_LAN___Magic_Packet.intValue()) {
                return VALUE_ENTRY_Wake_On_LAN___Magic_Packet;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Wake_on_LAN___Packet_Filtering
                    .intValue()) {
                return VALUE_ENTRY_Wake_on_LAN___Packet_Filtering;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Wake_On_Ring.intValue()) {
                return VALUE_ENTRY_Wake_On_Ring;
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
         * Value Map for the property WakeUpType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Wake_On_LAN___Magic_Packet,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Wake_on_LAN___Packet_Filtering,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Wake_On_Ring };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property WakeUpType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Wake_On_LAN___Magic_Packet, VALUE_ENTRY_Wake_on_LAN___Packet_Filtering,
                VALUE_ENTRY_Wake_On_Ring };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property WakeUpType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Wake_On_LAN___Magic_Packet,
                VALUE_ENTRY_Wake_on_LAN___Packet_Filtering, VALUE_ENTRY_Wake_On_Ring };

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_Service.getPackages();

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
     *   WakeUpService allows a UnitaryComputerSystem to be woken up from a low power sleep state. This Service is implemented by a LogicalDevice (e.g. NetworkAdapter or Modem) that is capable of receiving wakeup messages, and notifying the System.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_WakeUpService(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   WakeUpService allows a UnitaryComputerSystem to be woken up from a low power sleep state. This Service is implemented by a LogicalDevice (e.g. NetworkAdapter or Modem) that is capable of receiving wakeup messages, and notifying the System.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_WakeUpService(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_WakeUpService() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("FilterData", new CIMProperty("FilterData",
                CIMDataType.UINT8_ARRAY_T, null));
        propertiesToCheck.put("FilterType", new CIMProperty("FilterType", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("OtherFilterTypeDescription", new CIMProperty(
                "OtherFilterTypeDescription", CIMDataType.STRING_T, null));
        propertiesToCheck.put("OtherWakeUpTypeDescription", new CIMProperty(
                "OtherWakeUpTypeDescription", CIMDataType.STRING_T, null));
        propertiesToCheck.put("WakeUpType", new CIMProperty("WakeUpType", CIMDataType.UINT16_T,
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
     * Get the property FilterData
     *     * <br>
     * The binary data that is used to compare the contents of the received packet. This is used when the FilterType is set to "Binary Match" (value=7). This could also be used when the FilterType is set to "Other" (value=1).
     *     */

    public javax.cim.UnsignedInteger8[] get_FilterData() {
        CIMProperty currentProperty = getProperty(PROPERTY_FILTERDATA.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FILTERDATA.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger8[]) currentProperty.getValue();

    }

    /**
     * Set the property FilterData
     * <br>
     * The binary data that is used to compare the contents of the received packet. This is used when the FilterType is set to "Binary Match" (value=7). This could also be used when the FilterType is set to "Other" (value=1).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FilterData(javax.cim.UnsignedInteger8[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FILTERDATA.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FilterData(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FILTERDATA.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FilterData by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FilterData(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger8[] newValue) throws WbemsmtException {
        CIM_WakeUpService fco = new CIM_WakeUpService(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FILTERDATA.NAME);
        if (property != null) {
            property = setPropertyValue_FilterData(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FILTERDATA.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FilterData
     * <br>
     * The binary data that is used to compare the contents of the received packet. This is used when the FilterType is set to "Binary Match" (value=7). This could also be used when the FilterType is set to "Other" (value=1).
     */

    private static CIMProperty setPropertyValue_FilterData(CIMProperty currentProperty,
            javax.cim.UnsignedInteger8[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property FilterType
     *     * <br>
     * The filter type on the packets/messages that trigger the WakeUpService. This field is only used when the WakeUp Type is set to "Wake On LAN - Packet Filtering" (value =3).
     *     */

    public javax.cim.UnsignedInteger16 get_FilterType() {
        CIMProperty currentProperty = getProperty(PROPERTY_FILTERTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FILTERTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property FilterType
     * <br>
     * The filter type on the packets/messages that trigger the WakeUpService. This field is only used when the WakeUp Type is set to "Wake On LAN - Packet Filtering" (value =3).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FilterType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FILTERTYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FilterType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FILTERTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FilterType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FilterType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_WakeUpService fco = new CIM_WakeUpService(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FILTERTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_FilterType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FILTERTYPE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FilterType
     * <br>
     * The filter type on the packets/messages that trigger the WakeUpService. This field is only used when the WakeUp Type is set to "Wake On LAN - Packet Filtering" (value =3).
     */

    private static CIMProperty setPropertyValue_FilterType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherFilterTypeDescription
     *     * <br>
     * The description of the format of the FilterType used by the Service when the FilterType is set to "Other" (value=1).
     *     */

    public String get_OtherFilterTypeDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERFILTERTYPEDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERFILTERTYPEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherFilterTypeDescription
     * <br>
     * The description of the format of the FilterType used by the Service when the FilterType is set to "Other" (value=1).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherFilterTypeDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERFILTERTYPEDESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherFilterTypeDescription(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERFILTERTYPEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherFilterTypeDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherFilterTypeDescription(WBEMClient client,
            String namespace, String newValue) throws WbemsmtException {
        CIM_WakeUpService fco = new CIM_WakeUpService(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERFILTERTYPEDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_OtherFilterTypeDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERFILTERTYPEDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherFilterTypeDescription
     * <br>
     * The description of the format of the FilterType used by the Service when the FilterType is set to "Other" (value=1).
     */

    private static CIMProperty setPropertyValue_OtherFilterTypeDescription(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherWakeUpTypeDescription
     *     * <br>
     * A description of the type of WakeUpService used when WakeUpType is set to "Other" (value=1).
     *     */

    public String get_OtherWakeUpTypeDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERWAKEUPTYPEDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERWAKEUPTYPEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherWakeUpTypeDescription
     * <br>
     * A description of the type of WakeUpService used when WakeUpType is set to "Other" (value=1).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherWakeUpTypeDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERWAKEUPTYPEDESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherWakeUpTypeDescription(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERWAKEUPTYPEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherWakeUpTypeDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherWakeUpTypeDescription(WBEMClient client,
            String namespace, String newValue) throws WbemsmtException {
        CIM_WakeUpService fco = new CIM_WakeUpService(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERWAKEUPTYPEDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_OtherWakeUpTypeDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERWAKEUPTYPEDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherWakeUpTypeDescription
     * <br>
     * A description of the type of WakeUpService used when WakeUpType is set to "Other" (value=1).
     */

    private static CIMProperty setPropertyValue_OtherWakeUpTypeDescription(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property WakeUpType
     *     * <br>
     * The Type of the WakeUp Service.
     *     */

    public javax.cim.UnsignedInteger16 get_WakeUpType() {
        CIMProperty currentProperty = getProperty(PROPERTY_WAKEUPTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_WAKEUPTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property WakeUpType
     * <br>
     * The Type of the WakeUp Service.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_WakeUpType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_WAKEUPTYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_WakeUpType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_WAKEUPTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property WakeUpType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_WakeUpType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_WakeUpService fco = new CIM_WakeUpService(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_WAKEUPTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_WakeUpType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_WAKEUPTYPE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property WakeUpType
     * <br>
     * The Type of the WakeUp Service.
     */

    private static CIMProperty setPropertyValue_WakeUpType(CIMProperty currentProperty,
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

    /**
     * Get the list with CIM_NetworkAdapter objects associated by the association CIM_WakeUpServiceOnNetworkAdapter
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_NetworkAdapter_CIM_WakeUpServiceOnNetworkAdapters(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_NetworkAdapter_CIM_WakeUpServiceOnNetworkAdapters(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKADAPTER,
                CIM_NetworkAdapter.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_NetworkAdapter objects associated by the association CIM_WakeUpServiceOnNetworkAdapter
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKADAPTER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_NetworkAdapter_CIM_WakeUpServiceOnNetworkAdapters(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_NetworkAdapter_CIM_WakeUpServiceOnNetworkAdapters(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKADAPTER, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_NetworkAdapter objects associated by the association CIM_WakeUpServiceOnNetworkAdapter
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKADAPTER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_NetworkAdapter_CIM_WakeUpServiceOnNetworkAdapters(
            WBEMClient cimClient, String associationClass, String resultClass, String role,
            String resultRole, boolean includeQualifiers, boolean includeClassOrigin,
            java.lang.String[] propertyList) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associators(this.getCimObjectPath(), associationClass,
                    resultClass, role, resultRole, includeQualifiers, includeClassOrigin,
                    propertyList);
        }
        catch (WBEMException e) {
            throw new AssociatorException(e, new AssociatorUserObject(this.getCimObjectPath(),
                    associationClass, resultClass, role, resultRole, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_WakeUpServiceHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_WakeUpServiceHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_WakeUpServiceHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_NetworkAdapter(cimInstance));
                        continue;
                    }

                    Class[] constParams = new Class[1];
                    constParams[0] = CIMInstance.class;
                    Constructor cons = null;
                    try {
                        cons = clazz.getConstructor(constParams);
                    }
                    catch (NoSuchMethodException e) {
                        System.err.println("The required constructor of class "
                                + cimInstance.getClassName()
                                + " could not be found. Constructing instance of the base class.");
                        result.add(new CIM_NetworkAdapter(cimInstance));
                        continue;
                    }

                    try {
                        Object[] actargs = new Object[] { cimInstance };
                        Object dataObj = cons.newInstance(actargs);
                        result.add(dataObj);
                    }
                    catch (Exception e) {
                        System.err
                                .println("The instance of class "
                                        + cimInstance.getClassName()
                                        + " could not be created successful. Constructing instance of the base class.");
                        result.add(new CIM_NetworkAdapter(cimInstance));
                        continue;
                    }
                }
            }
            CIM_WakeUpServiceHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }

        return result;
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_WakeUpServiceOnNetworkAdapter
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_NetworkAdapter_CIM_WakeUpServiceOnNetworkAdapterNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_NetworkAdapter_CIM_WakeUpServiceOnNetworkAdapterNames(cimClient,
                true, CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKADAPTER,
                CIM_NetworkAdapter.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_WakeUpServiceOnNetworkAdapter
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKADAPTER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_NetworkAdapter_CIM_WakeUpServiceOnNetworkAdapterNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_NetworkAdapter_CIM_WakeUpServiceOnNetworkAdapterNames(cimClient,
                true, CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKADAPTER, resultClass,
                role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_WakeUpServiceOnNetworkAdapter
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_NetworkAdapter_CIM_WakeUpServiceOnNetworkAdapterNames(
            WBEMClient cimClient, boolean deep, String associationClass, String resultClass,
            String role, String resultRole) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associatorNames(this.getCimObjectPath(), associationClass,
                    resultClass, role, resultRole);

        }
        catch (WBEMException e) {
            throw new AssociatorNamesException(e, new AssociatorNamesUserObject(this
                    .getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKADAPTER,
                    CIM_NetworkAdapter.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_WakeUpServiceHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_WakeUpServiceHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_NetworkAdapter.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_WakeUpServiceHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }
        return result;
    }

    /**
     * Get the list with CIM_WakeUpServiceOnNetworkAdapter associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_WakeUpServiceOnNetworkAdapter(WBEMClient cimClient,
            boolean includeQualifiers, boolean includeClassOrigin, String role,
            java.lang.String[] propertyList) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.references(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKADAPTER, role,
                    includeQualifiers, includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKADAPTER, role,
                    includeQualifiers, includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_WakeUpServiceHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_WakeUpServiceHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_WakeUpServiceOnNetworkAdapterHelper.findClass(cimClient,
                            cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_WakeUpServiceOnNetworkAdapter(cimInstance));
                        continue;
                    }

                    Class[] constParams = new Class[1];
                    constParams[0] = CIMInstance.class;
                    Constructor cons = null;
                    try {
                        cons = clazz.getConstructor(constParams);
                    }
                    catch (NoSuchMethodException e) {
                        System.err.println("The required constructor of class "
                                + cimInstance.getClassName()
                                + " could not be found. Constructing instance of the base class.");
                        result.add(new CIM_WakeUpServiceOnNetworkAdapter(cimInstance));
                        continue;
                    }

                    try {
                        Object[] actargs = new Object[] { cimInstance };
                        Object dataObj = cons.newInstance(actargs);
                        result.add(dataObj);
                    }
                    catch (Exception e) {
                        System.err
                                .println("The instance of class "
                                        + cimInstance.getClassName()
                                        + " could not be created successful. Constructing instance of the base class.");
                        result.add(new CIM_WakeUpServiceOnNetworkAdapter(cimInstance));
                        continue;
                    }
                }
            }
            CIM_WakeUpServiceHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }

        return result;
    }

    /**
     * Get a list of CIMObjectPath items of the associations CIM_WakeUpServiceOnNetworkAdapter
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_WakeUpServiceOnNetworkAdapter(
            WBEMClient cimClient, String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKADAPTER, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKADAPTER, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_WakeUpServiceHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_WakeUpServiceHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_WakeUpServiceOnNetworkAdapter.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_WakeUpServiceHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }
        return result;
    }

    /**
     * Get the list with CIM_NetworkPort objects associated by the association CIM_WakeUpServiceOnNetworkPort
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKPORT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_NetworkPort_CIM_WakeUpServiceOnNetworkPorts(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_NetworkPort_CIM_WakeUpServiceOnNetworkPorts(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKPORT,
                CIM_NetworkPort.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_NetworkPort objects associated by the association CIM_WakeUpServiceOnNetworkPort
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKPORT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKPORT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_NetworkPort_CIM_WakeUpServiceOnNetworkPorts(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_NetworkPort_CIM_WakeUpServiceOnNetworkPorts(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKPORT, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_NetworkPort objects associated by the association CIM_WakeUpServiceOnNetworkPort
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKPORT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_NetworkPort_CIM_WakeUpServiceOnNetworkPorts(
            WBEMClient cimClient, String associationClass, String resultClass, String role,
            String resultRole, boolean includeQualifiers, boolean includeClassOrigin,
            java.lang.String[] propertyList) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associators(this.getCimObjectPath(), associationClass,
                    resultClass, role, resultRole, includeQualifiers, includeClassOrigin,
                    propertyList);
        }
        catch (WBEMException e) {
            throw new AssociatorException(e, new AssociatorUserObject(this.getCimObjectPath(),
                    associationClass, resultClass, role, resultRole, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_WakeUpServiceHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_WakeUpServiceHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_WakeUpServiceHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_NetworkPort(cimInstance));
                        continue;
                    }

                    Class[] constParams = new Class[1];
                    constParams[0] = CIMInstance.class;
                    Constructor cons = null;
                    try {
                        cons = clazz.getConstructor(constParams);
                    }
                    catch (NoSuchMethodException e) {
                        System.err.println("The required constructor of class "
                                + cimInstance.getClassName()
                                + " could not be found. Constructing instance of the base class.");
                        result.add(new CIM_NetworkPort(cimInstance));
                        continue;
                    }

                    try {
                        Object[] actargs = new Object[] { cimInstance };
                        Object dataObj = cons.newInstance(actargs);
                        result.add(dataObj);
                    }
                    catch (Exception e) {
                        System.err
                                .println("The instance of class "
                                        + cimInstance.getClassName()
                                        + " could not be created successful. Constructing instance of the base class.");
                        result.add(new CIM_NetworkPort(cimInstance));
                        continue;
                    }
                }
            }
            CIM_WakeUpServiceHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }

        return result;
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_WakeUpServiceOnNetworkPort
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKPORT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_NetworkPort_CIM_WakeUpServiceOnNetworkPortNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_NetworkPort_CIM_WakeUpServiceOnNetworkPortNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKPORT,
                CIM_NetworkPort.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_WakeUpServiceOnNetworkPort
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKPORT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKPORT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_NetworkPort_CIM_WakeUpServiceOnNetworkPortNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_NetworkPort_CIM_WakeUpServiceOnNetworkPortNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKPORT, resultClass, role,
                resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_WakeUpServiceOnNetworkPort
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_NetworkPort_CIM_WakeUpServiceOnNetworkPortNames(
            WBEMClient cimClient, boolean deep, String associationClass, String resultClass,
            String role, String resultRole) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.associatorNames(this.getCimObjectPath(), associationClass,
                    resultClass, role, resultRole);

        }
        catch (WBEMException e) {
            throw new AssociatorNamesException(e, new AssociatorNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKPORT,
                    CIM_NetworkPort.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_WakeUpServiceHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_WakeUpServiceHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_NetworkPort.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_WakeUpServiceHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }
        return result;
    }

    /**
     * Get the list with CIM_WakeUpServiceOnNetworkPort associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_WakeUpServiceOnNetworkPort(WBEMClient cimClient,
            boolean includeQualifiers, boolean includeClassOrigin, String role,
            java.lang.String[] propertyList) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.references(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKPORT, role,
                    includeQualifiers, includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKPORT, role,
                    includeQualifiers, includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_WakeUpServiceHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_WakeUpServiceHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_WakeUpServiceOnNetworkPortHelper.findClass(cimClient,
                            cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_WakeUpServiceOnNetworkPort(cimInstance));
                        continue;
                    }

                    Class[] constParams = new Class[1];
                    constParams[0] = CIMInstance.class;
                    Constructor cons = null;
                    try {
                        cons = clazz.getConstructor(constParams);
                    }
                    catch (NoSuchMethodException e) {
                        System.err.println("The required constructor of class "
                                + cimInstance.getClassName()
                                + " could not be found. Constructing instance of the base class.");
                        result.add(new CIM_WakeUpServiceOnNetworkPort(cimInstance));
                        continue;
                    }

                    try {
                        Object[] actargs = new Object[] { cimInstance };
                        Object dataObj = cons.newInstance(actargs);
                        result.add(dataObj);
                    }
                    catch (Exception e) {
                        System.err
                                .println("The instance of class "
                                        + cimInstance.getClassName()
                                        + " could not be created successful. Constructing instance of the base class.");
                        result.add(new CIM_WakeUpServiceOnNetworkPort(cimInstance));
                        continue;
                    }
                }
            }
            CIM_WakeUpServiceHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }

        return result;
    }

    /**
     * Get a list of CIMObjectPath items of the associations CIM_WakeUpServiceOnNetworkPort
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_WakeUpServiceOnNetworkPort(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKPORT, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKPORT,
                    role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_WakeUpServiceHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_WakeUpServiceHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_WakeUpServiceOnNetworkPort.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_WakeUpServiceHelper.checkException(enumeration);
        }
        finally {
            try {
                if (enumeration != null) {
                    enumeration.close();
                }
            }
            catch (Exception e) {
                throw new WbemsmtException(WbemsmtException.ERR_FAILED,
                        "The socket of the result could not be closed properly.");
            }
        }
        return result;
    }

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
        return CIM_WakeUpService.CIM_CLASS_NAME;
    }

}