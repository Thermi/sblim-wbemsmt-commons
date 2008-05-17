/** 
 * CIM_OOBAlertService.java
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
 * Description: This Service is implemented by a LogicalDevice (e.g. a NetworkAdapter or Modem) that is capable of sending alert messages to a remote destination. The alert messages reflect the state of one or more ManagedSystemElements. The Elements for which alert messages are forwarded, are defined by enumerating the ProvidesServiceToElement association for the Service. Out of Band (OOB) refers to the mechanisms in use when normal OS-based management mechanisms are not possible. This occurs when the OS is down or not functioning properly.
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

public class CIM_OOBAlertService extends CIM_Service {

    public final static String CIM_CLASS_NAME = "CIM_OOBAlertService";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * The use of the CIM_OOBAlertServiceOnNetworkAdapter class has been deprecated, since NetworkAdapter has been deprecated. Instead use the CIM_OOBAlertServiceOnNetworkPort class. OOBAlertServiceOnNetworkAdapter defines where the out of band alerting Service is implemented.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKADAPTER = "CIM_OOBAlertServiceOnNetworkAdapter";

    /**
     * OOBAlertServiceOnNetworkPort defines where the out of band alerting Service is implemented. Currently, the Service can either employ a Modem or a NetworkPort to send alerts.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKPORT = "CIM_OOBAlertServiceOnNetworkPort";

    /**
     * Constants of property DestinationAddress
     * The address where this Service sends the alerts. The format of this address depends on the DestinationType. For example, if the DestinationType is a UDP Port (value=4), then this property contains a string identifying the IP address of the Port (for example, 111.222.333.444:4567). If DestinationType is a pager (value=2), then the address is a Pager number (for example, 18002257654).
     */
    public static class PROPERTY_DESTINATIONADDRESS {
        /**
         * name of the property DestinationAddress
         */
        public final static String NAME = "DestinationAddress";

    }

    /**
     * Constants of property DestinationIsAckCapable
     * If the destination is capable of sending an acknowledgement to the alert, then this flag is set to TRUE. The format of the acknowledgement is determined by the DestinationType and the MessageFormat.
     */
    public static class PROPERTY_DESTINATIONISACKCAPABLE {
        /**
         * name of the property DestinationIsAckCapable
         */
        public final static String NAME = "DestinationIsAckCapable";

    }

    /**
     * Constants of property DestinationType
     * The type of the alert destination. For example, the alert may be received by an application listening on a UDP Port on a remote destination, or could be sent to a pager (values 4 or 2, respectively).
     */
    public static class PROPERTY_DESTINATIONTYPE {
        /**
         * name of the property DestinationType
         */
        public final static String NAME = "DestinationType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Pager = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Pager (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Pager = "Pager";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_TCP_Port = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry TCP Port (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_TCP_Port = "TCP Port";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_UDP_Port = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry UDP Port (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_UDP_Port = "UDP Port";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@2ed02ed0
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Pager.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Pager;
            }

            if (VALUE_ENTRY_TCP_Port.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_TCP_Port;
            }

            if (VALUE_ENTRY_UDP_Port.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_UDP_Port;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Pager.intValue()) {
                return VALUE_ENTRY_Pager;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_TCP_Port.intValue()) {
                return VALUE_ENTRY_TCP_Port;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_UDP_Port.intValue()) {
                return VALUE_ENTRY_UDP_Port;
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
         * Value Map for the property DestinationType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Pager,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_TCP_Port,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_UDP_Port };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property DestinationType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Pager, VALUE_ENTRY_TCP_Port, VALUE_ENTRY_UDP_Port };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property DestinationType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Pager, VALUE_ENTRY_TCP_Port, VALUE_ENTRY_UDP_Port };

    }

    /**
     * Constants of property EnablePresenceHeartbeats
     * When set to true causes the OOBAlertService to send Presence heart beat messages.
     */
    public static class PROPERTY_ENABLEPRESENCEHEARTBEATS {
        /**
         * name of the property EnablePresenceHeartbeats
         */
        public final static String NAME = "EnablePresenceHeartbeats";

    }

    /**
     * Constants of property FixedPartOfMessage
     * The AlertService may require some fixed data to send as part of the message. This may include things like the address or name of the System. This string contains the complete message when the property, OnlySendsFixedMessage, is set to TRUE.
     */
    public static class PROPERTY_FIXEDPARTOFMESSAGE {
        /**
         * name of the property FixedPartOfMessage
         */
        public final static String NAME = "FixedPartOfMessage";

    }

    /**
     * Constants of property MessageFormat
     * The format of the Alert Message sent by the Service.
     */
    public static class PROPERTY_MESSAGEFORMAT {
        /**
         * name of the property MessageFormat
         */
        public final static String NAME = "MessageFormat";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Numeric = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Numeric (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Numeric = "Numeric";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_AlphaNumeric = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry AlphaNumeric (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_AlphaNumeric = "AlphaNumeric";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Free_Form_Text = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Free Form Text (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Free_Form_Text = "Free Form Text";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Platform_Event_Trap = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Platform Event Trap (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Platform_Event_Trap = "Platform Event Trap";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@776a776a
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Numeric.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Numeric;
            }

            if (VALUE_ENTRY_AlphaNumeric.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_AlphaNumeric;
            }

            if (VALUE_ENTRY_Free_Form_Text.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Free_Form_Text;
            }

            if (VALUE_ENTRY_Platform_Event_Trap.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Platform_Event_Trap;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Numeric.intValue()) {
                return VALUE_ENTRY_Numeric;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_AlphaNumeric.intValue()) {
                return VALUE_ENTRY_AlphaNumeric;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Free_Form_Text.intValue()) {
                return VALUE_ENTRY_Free_Form_Text;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Platform_Event_Trap.intValue()) {
                return VALUE_ENTRY_Platform_Event_Trap;
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
         * Value Map for the property MessageFormat   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Numeric,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_AlphaNumeric,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Free_Form_Text,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Platform_Event_Trap };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property MessageFormat   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Numeric, VALUE_ENTRY_AlphaNumeric, VALUE_ENTRY_Free_Form_Text,
                VALUE_ENTRY_Platform_Event_Trap };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property MessageFormat   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Numeric, VALUE_ENTRY_AlphaNumeric,
                VALUE_ENTRY_Free_Form_Text, VALUE_ENTRY_Platform_Event_Trap };

    }

    /**
     * Constants of property OnlySendsFixedMessage
     * If the AlertService only uses a fixed message to send an alert, then this flag should be set to TRUE.
     */
    public static class PROPERTY_ONLYSENDSFIXEDMESSAGE {
        /**
         * name of the property OnlySendsFixedMessage
         */
        public final static String NAME = "OnlySendsFixedMessage";

    }

    /**
     * Constants of property OtherDestinationTypeDescription
     * The description of the alert DestinationType. This is used when the DestinationType is set to "Other" (value=1).
     */
    public static class PROPERTY_OTHERDESTINATIONTYPEDESCRIPTION {
        /**
         * name of the property OtherDestinationTypeDescription
         */
        public final static String NAME = "OtherDestinationTypeDescription";

    }

    /**
     * Constants of property OtherMessageFormatDescription
     * The description of the format of the alert message used by the Service when the AlertMessageFormat property is set to "Other" (value=1).
     */
    public static class PROPERTY_OTHERMESSAGEFORMATDESCRIPTION {
        /**
         * name of the property OtherMessageFormatDescription
         */
        public final static String NAME = "OtherMessageFormatDescription";

    }

    /**
     * Constants of property PresenceHeartbeatCapable
     * If the OOB Alerting service is capable of sending Presence heart beat messages.
     */
    public static class PROPERTY_PRESENCEHEARTBEATCAPABLE {
        /**
         * name of the property PresenceHeartbeatCapable
         */
        public final static String NAME = "PresenceHeartbeatCapable";

    }

    /**
     * Constants of property RetryCount
     * The AlertService may retry and send an alert more than once. The RetryCount identifies how often the operation will be repeated. If DestinationIsAckCapable is set to TRUE, then the retry will only be done if an Ack is not received. Otherwise, the retries are done unconditionally.
     */
    public static class PROPERTY_RETRYCOUNT {
        /**
         * name of the property RetryCount
         */
        public final static String NAME = "RetryCount";

    }

    /**
     * Constants of property RetryInterval
     * The interval between each successive retry, in seconds. If DestinationIsAckCapable is set to TRUE, then this interval is used as a timeout interval, before the next retry is done.
     */
    public static class PROPERTY_RETRYINTERVAL {
        /**
         * name of the property RetryInterval
         */
        public final static String NAME = "RetryInterval";

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
     *   This Service is implemented by a LogicalDevice (e.g. a NetworkAdapter or Modem) that is capable of sending alert messages to a remote destination. The alert messages reflect the state of one or more ManagedSystemElements. The Elements for which alert messages are forwarded, are defined by enumerating the ProvidesServiceToElement association for the Service. Out of Band (OOB) refers to the mechanisms in use when normal OS-based management mechanisms are not possible. This occurs when the OS is down or not functioning properly.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_OOBAlertService(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   This Service is implemented by a LogicalDevice (e.g. a NetworkAdapter or Modem) that is capable of sending alert messages to a remote destination. The alert messages reflect the state of one or more ManagedSystemElements. The Elements for which alert messages are forwarded, are defined by enumerating the ProvidesServiceToElement association for the Service. Out of Band (OOB) refers to the mechanisms in use when normal OS-based management mechanisms are not possible. This occurs when the OS is down or not functioning properly.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_OOBAlertService(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_OOBAlertService() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("DestinationAddress", new CIMProperty("DestinationAddress",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("DestinationIsAckCapable", new CIMProperty("DestinationIsAckCapable",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("DestinationType", new CIMProperty("DestinationType",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("EnablePresenceHeartbeats", new CIMProperty(
                "EnablePresenceHeartbeats", CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("FixedPartOfMessage", new CIMProperty("FixedPartOfMessage",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("MessageFormat", new CIMProperty("MessageFormat",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("OnlySendsFixedMessage", new CIMProperty("OnlySendsFixedMessage",
                CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("OtherDestinationTypeDescription", new CIMProperty(
                "OtherDestinationTypeDescription", CIMDataType.STRING_T, null));
        propertiesToCheck.put("OtherMessageFormatDescription", new CIMProperty(
                "OtherMessageFormatDescription", CIMDataType.STRING_T, null));
        propertiesToCheck.put("PresenceHeartbeatCapable", new CIMProperty(
                "PresenceHeartbeatCapable", CIMDataType.BOOLEAN_T, null));
        propertiesToCheck.put("RetryCount", new CIMProperty("RetryCount", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("RetryInterval", new CIMProperty("RetryInterval",
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
     * Get the property DestinationAddress
     *     * <br>
     * The address where this Service sends the alerts. The format of this address depends on the DestinationType. For example, if the DestinationType is a UDP Port (value=4), then this property contains a string identifying the IP address of the Port (for example, 111.222.333.444:4567). If DestinationType is a pager (value=2), then the address is a Pager number (for example, 18002257654).
     *     */

    public String get_DestinationAddress() {
        CIMProperty currentProperty = getProperty(PROPERTY_DESTINATIONADDRESS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DESTINATIONADDRESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property DestinationAddress
     * <br>
     * The address where this Service sends the alerts. The format of this address depends on the DestinationType. For example, if the DestinationType is a UDP Port (value=4), then this property contains a string identifying the IP address of the Port (for example, 111.222.333.444:4567). If DestinationType is a pager (value=2), then the address is a Pager number (for example, 18002257654).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_DestinationAddress(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DESTINATIONADDRESS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_DestinationAddress(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DESTINATIONADDRESS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property DestinationAddress by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DestinationAddress(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_OOBAlertService fco = new CIM_OOBAlertService(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DESTINATIONADDRESS.NAME);
        if (property != null) {
            property = setPropertyValue_DestinationAddress(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DESTINATIONADDRESS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property DestinationAddress
     * <br>
     * The address where this Service sends the alerts. The format of this address depends on the DestinationType. For example, if the DestinationType is a UDP Port (value=4), then this property contains a string identifying the IP address of the Port (for example, 111.222.333.444:4567). If DestinationType is a pager (value=2), then the address is a Pager number (for example, 18002257654).
     */

    private static CIMProperty setPropertyValue_DestinationAddress(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property DestinationIsAckCapable
     *     * <br>
     * If the destination is capable of sending an acknowledgement to the alert, then this flag is set to TRUE. The format of the acknowledgement is determined by the DestinationType and the MessageFormat.
     *     */

    public Boolean get_DestinationIsAckCapable() {
        CIMProperty currentProperty = getProperty(PROPERTY_DESTINATIONISACKCAPABLE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DESTINATIONISACKCAPABLE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property DestinationIsAckCapable
     * <br>
     * If the destination is capable of sending an acknowledgement to the alert, then this flag is set to TRUE. The format of the acknowledgement is determined by the DestinationType and the MessageFormat.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_DestinationIsAckCapable(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DESTINATIONISACKCAPABLE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_DestinationIsAckCapable(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DESTINATIONISACKCAPABLE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property DestinationIsAckCapable by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DestinationIsAckCapable(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_OOBAlertService fco = new CIM_OOBAlertService(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DESTINATIONISACKCAPABLE.NAME);
        if (property != null) {
            property = setPropertyValue_DestinationIsAckCapable(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DESTINATIONISACKCAPABLE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property DestinationIsAckCapable
     * <br>
     * If the destination is capable of sending an acknowledgement to the alert, then this flag is set to TRUE. The format of the acknowledgement is determined by the DestinationType and the MessageFormat.
     */

    private static CIMProperty setPropertyValue_DestinationIsAckCapable(
            CIMProperty currentProperty, Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property DestinationType
     *     * <br>
     * The type of the alert destination. For example, the alert may be received by an application listening on a UDP Port on a remote destination, or could be sent to a pager (values 4 or 2, respectively).
     *     */

    public javax.cim.UnsignedInteger16 get_DestinationType() {
        CIMProperty currentProperty = getProperty(PROPERTY_DESTINATIONTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DESTINATIONTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property DestinationType
     * <br>
     * The type of the alert destination. For example, the alert may be received by an application listening on a UDP Port on a remote destination, or could be sent to a pager (values 4 or 2, respectively).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_DestinationType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DESTINATIONTYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_DestinationType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DESTINATIONTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property DestinationType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DestinationType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_OOBAlertService fco = new CIM_OOBAlertService(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DESTINATIONTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_DestinationType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DESTINATIONTYPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property DestinationType
     * <br>
     * The type of the alert destination. For example, the alert may be received by an application listening on a UDP Port on a remote destination, or could be sent to a pager (values 4 or 2, respectively).
     */

    private static CIMProperty setPropertyValue_DestinationType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property EnablePresenceHeartbeats
     *     * <br>
     * When set to true causes the OOBAlertService to send Presence heart beat messages.
     *     */

    public Boolean get_EnablePresenceHeartbeats() {
        CIMProperty currentProperty = getProperty(PROPERTY_ENABLEPRESENCEHEARTBEATS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ENABLEPRESENCEHEARTBEATS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property EnablePresenceHeartbeats
     * <br>
     * When set to true causes the OOBAlertService to send Presence heart beat messages.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_EnablePresenceHeartbeats(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ENABLEPRESENCEHEARTBEATS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_EnablePresenceHeartbeats(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ENABLEPRESENCEHEARTBEATS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property EnablePresenceHeartbeats by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_EnablePresenceHeartbeats(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_OOBAlertService fco = new CIM_OOBAlertService(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ENABLEPRESENCEHEARTBEATS.NAME);
        if (property != null) {
            property = setPropertyValue_EnablePresenceHeartbeats(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ENABLEPRESENCEHEARTBEATS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property EnablePresenceHeartbeats
     * <br>
     * When set to true causes the OOBAlertService to send Presence heart beat messages.
     */

    private static CIMProperty setPropertyValue_EnablePresenceHeartbeats(
            CIMProperty currentProperty, Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property FixedPartOfMessage
     *     * <br>
     * The AlertService may require some fixed data to send as part of the message. This may include things like the address or name of the System. This string contains the complete message when the property, OnlySendsFixedMessage, is set to TRUE.
     *     */

    public String get_FixedPartOfMessage() {
        CIMProperty currentProperty = getProperty(PROPERTY_FIXEDPARTOFMESSAGE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FIXEDPARTOFMESSAGE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property FixedPartOfMessage
     * <br>
     * The AlertService may require some fixed data to send as part of the message. This may include things like the address or name of the System. This string contains the complete message when the property, OnlySendsFixedMessage, is set to TRUE.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FixedPartOfMessage(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FIXEDPARTOFMESSAGE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FixedPartOfMessage(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FIXEDPARTOFMESSAGE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FixedPartOfMessage by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FixedPartOfMessage(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_OOBAlertService fco = new CIM_OOBAlertService(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FIXEDPARTOFMESSAGE.NAME);
        if (property != null) {
            property = setPropertyValue_FixedPartOfMessage(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FIXEDPARTOFMESSAGE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FixedPartOfMessage
     * <br>
     * The AlertService may require some fixed data to send as part of the message. This may include things like the address or name of the System. This string contains the complete message when the property, OnlySendsFixedMessage, is set to TRUE.
     */

    private static CIMProperty setPropertyValue_FixedPartOfMessage(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MessageFormat
     *     * <br>
     * The format of the Alert Message sent by the Service.
     *     */

    public javax.cim.UnsignedInteger16 get_MessageFormat() {
        CIMProperty currentProperty = getProperty(PROPERTY_MESSAGEFORMAT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MESSAGEFORMAT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property MessageFormat
     * <br>
     * The format of the Alert Message sent by the Service.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MessageFormat(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MESSAGEFORMAT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MessageFormat(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MESSAGEFORMAT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MessageFormat by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MessageFormat(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_OOBAlertService fco = new CIM_OOBAlertService(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MESSAGEFORMAT.NAME);
        if (property != null) {
            property = setPropertyValue_MessageFormat(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MESSAGEFORMAT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MessageFormat
     * <br>
     * The format of the Alert Message sent by the Service.
     */

    private static CIMProperty setPropertyValue_MessageFormat(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OnlySendsFixedMessage
     *     * <br>
     * If the AlertService only uses a fixed message to send an alert, then this flag should be set to TRUE.
     *     */

    public Boolean get_OnlySendsFixedMessage() {
        CIMProperty currentProperty = getProperty(PROPERTY_ONLYSENDSFIXEDMESSAGE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ONLYSENDSFIXEDMESSAGE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property OnlySendsFixedMessage
     * <br>
     * If the AlertService only uses a fixed message to send an alert, then this flag should be set to TRUE.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OnlySendsFixedMessage(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ONLYSENDSFIXEDMESSAGE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OnlySendsFixedMessage(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ONLYSENDSFIXEDMESSAGE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OnlySendsFixedMessage by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OnlySendsFixedMessage(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_OOBAlertService fco = new CIM_OOBAlertService(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ONLYSENDSFIXEDMESSAGE.NAME);
        if (property != null) {
            property = setPropertyValue_OnlySendsFixedMessage(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ONLYSENDSFIXEDMESSAGE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OnlySendsFixedMessage
     * <br>
     * If the AlertService only uses a fixed message to send an alert, then this flag should be set to TRUE.
     */

    private static CIMProperty setPropertyValue_OnlySendsFixedMessage(CIMProperty currentProperty,
            Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherDestinationTypeDescription
     *     * <br>
     * The description of the alert DestinationType. This is used when the DestinationType is set to "Other" (value=1).
     *     */

    public String get_OtherDestinationTypeDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERDESTINATIONTYPEDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERDESTINATIONTYPEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherDestinationTypeDescription
     * <br>
     * The description of the alert DestinationType. This is used when the DestinationType is set to "Other" (value=1).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherDestinationTypeDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERDESTINATIONTYPEDESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherDestinationTypeDescription(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERDESTINATIONTYPEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherDestinationTypeDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherDestinationTypeDescription(WBEMClient client,
            String namespace, String newValue) throws WbemsmtException {
        CIM_OOBAlertService fco = new CIM_OOBAlertService(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERDESTINATIONTYPEDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_OtherDestinationTypeDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERDESTINATIONTYPEDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherDestinationTypeDescription
     * <br>
     * The description of the alert DestinationType. This is used when the DestinationType is set to "Other" (value=1).
     */

    private static CIMProperty setPropertyValue_OtherDestinationTypeDescription(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherMessageFormatDescription
     *     * <br>
     * The description of the format of the alert message used by the Service when the AlertMessageFormat property is set to "Other" (value=1).
     *     */

    public String get_OtherMessageFormatDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERMESSAGEFORMATDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERMESSAGEFORMATDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherMessageFormatDescription
     * <br>
     * The description of the format of the alert message used by the Service when the AlertMessageFormat property is set to "Other" (value=1).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherMessageFormatDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERMESSAGEFORMATDESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherMessageFormatDescription(currentProperty,
                    newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERMESSAGEFORMATDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherMessageFormatDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherMessageFormatDescription(WBEMClient client,
            String namespace, String newValue) throws WbemsmtException {
        CIM_OOBAlertService fco = new CIM_OOBAlertService(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERMESSAGEFORMATDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_OtherMessageFormatDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERMESSAGEFORMATDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherMessageFormatDescription
     * <br>
     * The description of the format of the alert message used by the Service when the AlertMessageFormat property is set to "Other" (value=1).
     */

    private static CIMProperty setPropertyValue_OtherMessageFormatDescription(
            CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PresenceHeartbeatCapable
     *     * <br>
     * If the OOB Alerting service is capable of sending Presence heart beat messages.
     *     */

    public Boolean get_PresenceHeartbeatCapable() {
        CIMProperty currentProperty = getProperty(PROPERTY_PRESENCEHEARTBEATCAPABLE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PRESENCEHEARTBEATCAPABLE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (Boolean) currentProperty.getValue();

    }

    /**
     * Set the property PresenceHeartbeatCapable
     * <br>
     * If the OOB Alerting service is capable of sending Presence heart beat messages.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PresenceHeartbeatCapable(Boolean newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PRESENCEHEARTBEATCAPABLE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PresenceHeartbeatCapable(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PRESENCEHEARTBEATCAPABLE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PresenceHeartbeatCapable by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PresenceHeartbeatCapable(WBEMClient client, String namespace,
            Boolean newValue) throws WbemsmtException {
        CIM_OOBAlertService fco = new CIM_OOBAlertService(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PRESENCEHEARTBEATCAPABLE.NAME);
        if (property != null) {
            property = setPropertyValue_PresenceHeartbeatCapable(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PRESENCEHEARTBEATCAPABLE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PresenceHeartbeatCapable
     * <br>
     * If the OOB Alerting service is capable of sending Presence heart beat messages.
     */

    private static CIMProperty setPropertyValue_PresenceHeartbeatCapable(
            CIMProperty currentProperty, Boolean newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RetryCount
     *     * <br>
     * The AlertService may retry and send an alert more than once. The RetryCount identifies how often the operation will be repeated. If DestinationIsAckCapable is set to TRUE, then the retry will only be done if an Ack is not received. Otherwise, the retries are done unconditionally.
     *     */

    public javax.cim.UnsignedInteger16 get_RetryCount() {
        CIMProperty currentProperty = getProperty(PROPERTY_RETRYCOUNT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RETRYCOUNT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property RetryCount
     * <br>
     * The AlertService may retry and send an alert more than once. The RetryCount identifies how often the operation will be repeated. If DestinationIsAckCapable is set to TRUE, then the retry will only be done if an Ack is not received. Otherwise, the retries are done unconditionally.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RetryCount(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RETRYCOUNT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RetryCount(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RETRYCOUNT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RetryCount by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RetryCount(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_OOBAlertService fco = new CIM_OOBAlertService(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RETRYCOUNT.NAME);
        if (property != null) {
            property = setPropertyValue_RetryCount(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RETRYCOUNT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RetryCount
     * <br>
     * The AlertService may retry and send an alert more than once. The RetryCount identifies how often the operation will be repeated. If DestinationIsAckCapable is set to TRUE, then the retry will only be done if an Ack is not received. Otherwise, the retries are done unconditionally.
     */

    private static CIMProperty setPropertyValue_RetryCount(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RetryInterval
     *     * <br>
     * The interval between each successive retry, in seconds. If DestinationIsAckCapable is set to TRUE, then this interval is used as a timeout interval, before the next retry is done.
     *     */

    public javax.cim.UnsignedInteger16 get_RetryInterval() {
        CIMProperty currentProperty = getProperty(PROPERTY_RETRYINTERVAL.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RETRYINTERVAL.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property RetryInterval
     * <br>
     * The interval between each successive retry, in seconds. If DestinationIsAckCapable is set to TRUE, then this interval is used as a timeout interval, before the next retry is done.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RetryInterval(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RETRYINTERVAL.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RetryInterval(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RETRYINTERVAL.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RetryInterval by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RetryInterval(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_OOBAlertService fco = new CIM_OOBAlertService(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RETRYINTERVAL.NAME);
        if (property != null) {
            property = setPropertyValue_RetryInterval(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RETRYINTERVAL.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RetryInterval
     * <br>
     * The interval between each successive retry, in seconds. If DestinationIsAckCapable is set to TRUE, then this interval is used as a timeout interval, before the next retry is done.
     */

    private static CIMProperty setPropertyValue_RetryInterval(CIMProperty currentProperty,
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
     * Get the list with CIM_NetworkAdapter objects associated by the association CIM_OOBAlertServiceOnNetworkAdapter
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_NetworkAdapter_CIM_OOBAlertServiceOnNetworkAdapters(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_NetworkAdapter_CIM_OOBAlertServiceOnNetworkAdapters(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKADAPTER,
                CIM_NetworkAdapter.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_NetworkAdapter objects associated by the association CIM_OOBAlertServiceOnNetworkAdapter
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKADAPTER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_NetworkAdapter_CIM_OOBAlertServiceOnNetworkAdapters(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_NetworkAdapter_CIM_OOBAlertServiceOnNetworkAdapters(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKADAPTER, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_NetworkAdapter objects associated by the association CIM_OOBAlertServiceOnNetworkAdapter
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKADAPTER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_NetworkAdapter_CIM_OOBAlertServiceOnNetworkAdapters(
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
                CIM_OOBAlertServiceHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_OOBAlertServiceHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_OOBAlertServiceHelper.findClass(cimClient, cimInstance);

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
            CIM_OOBAlertServiceHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_OOBAlertServiceOnNetworkAdapter
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_NetworkAdapter_CIM_OOBAlertServiceOnNetworkAdapterNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_NetworkAdapter_CIM_OOBAlertServiceOnNetworkAdapterNames(cimClient,
                true, CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKADAPTER,
                CIM_NetworkAdapter.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_OOBAlertServiceOnNetworkAdapter
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKADAPTER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_NetworkAdapter_CIM_OOBAlertServiceOnNetworkAdapterNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_NetworkAdapter_CIM_OOBAlertServiceOnNetworkAdapterNames(cimClient,
                true, CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKADAPTER, resultClass,
                role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_OOBAlertServiceOnNetworkAdapter
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_NetworkAdapter_CIM_OOBAlertServiceOnNetworkAdapterNames(
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKADAPTER,
                    CIM_NetworkAdapter.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_OOBAlertServiceHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_OOBAlertServiceHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_NetworkAdapter.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_OOBAlertServiceHelper.checkException(enumeration);
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
     * Get the list with CIM_OOBAlertServiceOnNetworkAdapter associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_OOBAlertServiceOnNetworkAdapter(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKADAPTER, role,
                    includeQualifiers, includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKADAPTER, role,
                    includeQualifiers, includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_OOBAlertServiceHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_OOBAlertServiceHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_OOBAlertServiceOnNetworkAdapterHelper.findClass(cimClient,
                            cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_OOBAlertServiceOnNetworkAdapter(cimInstance));
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
                        result.add(new CIM_OOBAlertServiceOnNetworkAdapter(cimInstance));
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
                        result.add(new CIM_OOBAlertServiceOnNetworkAdapter(cimInstance));
                        continue;
                    }
                }
            }
            CIM_OOBAlertServiceHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_OOBAlertServiceOnNetworkAdapter
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_OOBAlertServiceOnNetworkAdapter(
            WBEMClient cimClient, String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKADAPTER, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKADAPTER, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_OOBAlertServiceHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_OOBAlertServiceHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_OOBAlertServiceOnNetworkAdapter.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_OOBAlertServiceHelper.checkException(enumeration);
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
     * Get the list with CIM_NetworkPort objects associated by the association CIM_OOBAlertServiceOnNetworkPort
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKPORT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_NetworkPort_CIM_OOBAlertServiceOnNetworkPorts(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_NetworkPort_CIM_OOBAlertServiceOnNetworkPorts(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKPORT,
                CIM_NetworkPort.CIM_CLASS_NAME, null, null, false, false, null);

    }

    /**
     * Get the list with CIM_NetworkPort objects associated by the association CIM_OOBAlertServiceOnNetworkPort
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKPORT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKPORT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_NetworkPort_CIM_OOBAlertServiceOnNetworkPorts(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_NetworkPort_CIM_OOBAlertServiceOnNetworkPorts(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKPORT, resultClass, role,
                resultRole, false, false, null);

    }

    /**
     * Get the list with CIM_NetworkPort objects associated by the association CIM_OOBAlertServiceOnNetworkPort
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKPORT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_NetworkPort_CIM_OOBAlertServiceOnNetworkPorts(
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
                CIM_OOBAlertServiceHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_OOBAlertServiceHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_OOBAlertServiceHelper.findClass(cimClient, cimInstance);

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
            CIM_OOBAlertServiceHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_OOBAlertServiceOnNetworkPort
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKPORT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_NetworkPort_CIM_OOBAlertServiceOnNetworkPortNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_NetworkPort_CIM_OOBAlertServiceOnNetworkPortNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKPORT,
                CIM_NetworkPort.CIM_CLASS_NAME, null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_OOBAlertServiceOnNetworkPort
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKPORT or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKPORT as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_NetworkPort_CIM_OOBAlertServiceOnNetworkPortNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_NetworkPort_CIM_OOBAlertServiceOnNetworkPortNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKPORT, resultClass, role,
                resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_OOBAlertServiceOnNetworkPort
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_NetworkPort_CIM_OOBAlertServiceOnNetworkPortNames(
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKPORT,
                    CIM_NetworkPort.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_OOBAlertServiceHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_OOBAlertServiceHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_NetworkPort.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_OOBAlertServiceHelper.checkException(enumeration);
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
     * Get the list with CIM_OOBAlertServiceOnNetworkPort associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_OOBAlertServiceOnNetworkPort(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKPORT, role,
                    includeQualifiers, includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKPORT, role,
                    includeQualifiers, includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_OOBAlertServiceHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_OOBAlertServiceHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_OOBAlertServiceOnNetworkPortHelper.findClass(cimClient,
                            cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_OOBAlertServiceOnNetworkPort(cimInstance));
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
                        result.add(new CIM_OOBAlertServiceOnNetworkPort(cimInstance));
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
                        result.add(new CIM_OOBAlertServiceOnNetworkPort(cimInstance));
                        continue;
                    }
                }
            }
            CIM_OOBAlertServiceHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_OOBAlertServiceOnNetworkPort
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_OOBAlertServiceOnNetworkPort(
            WBEMClient cimClient, String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKPORT, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKPORT, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_OOBAlertServiceHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_OOBAlertServiceHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_OOBAlertServiceOnNetworkPort.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_OOBAlertServiceHelper.checkException(enumeration);
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
        return CIM_OOBAlertService.CIM_CLASS_NAME;
    }

}