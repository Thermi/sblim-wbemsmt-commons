/** 
 * CIM_FibreChannelAdapter.java
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
 * Description: The use of the CIM_FibreChannelAdapter class is deprecated, consistent with the deprecation of NetworkAdapter. Instead use CIM_FCPort. This class describes the capabilities and management aspects of a Fibre Channel Adapter.
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

public class CIM_FibreChannelAdapter extends CIM_NetworkAdapter {

    public final static String CIM_CLASS_NAME = "CIM_FibreChannelAdapter";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * The use of FibrePortOnFCAdapter is deprecated since both FibrePort and FibreChannelAdapter have been deprecated. No replacement is needed, since the 2 classes are combined into a single class. FibrePortOnFCAdapter associates a FibrePort with a FibreChannelAdapter.
     */

    public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER = "CIM_FibrePortOnFCAdapter";

    /**
     * Constants of property BufferCreditErrors
     * Number of times that the Device has been without a buffer credit for a time longer than ErrorDetectTimeout.
     */
    public static class PROPERTY_BUFFERCREDITERRORS {
        /**
         * name of the property BufferCreditErrors
         */
        public final static String NAME = "BufferCreditErrors";

    }

    /**
     * Constants of property Capabilities
     * A list of the Capabilities of the Fibre Channel Adapter. For example, that the Adapter utilizes the Directory Server, or that it generates State Change Notifications can be indicated using the values 2 and 12, respectively.
     */
    public static class PROPERTY_CAPABILITIES {
        /**
         * name of the property Capabilities
         */
        public final static String NAME = "Capabilities";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Utilizes_the_Directory_Server = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Utilizes the Directory Server (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Utilizes_the_Directory_Server = "Utilizes the Directory Server";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Utilizes_the_Time_Server = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Utilizes the Time Server (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Utilizes_the_Time_Server = "Utilizes the Time Server";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Utilizes_the_Management_Server = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Utilizes the Management Server (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Utilizes_the_Management_Server = "Utilizes the Management Server";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Utilizes_the_Alias_Server = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Utilizes the Alias Server (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Utilizes_the_Alias_Server = "Utilizes the Alias Server";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Utilizes_the_Security_Key_Distribution_Server = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Utilizes the Security Key Distribution Server (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Utilizes_the_Security_Key_Distribution_Server = "Utilizes the Security Key Distribution Server";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Utilizes_the_Clock_Synchronization_Server = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Utilizes the Clock Synchronization Server (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Utilizes_the_Clock_Synchronization_Server = "Utilizes the Clock Synchronization Server";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Utilizes_the_Multicast_Server = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Utilizes the Multicast Server (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Utilizes_the_Multicast_Server = "Utilizes the Multicast Server";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Utilizes_QoS_Facilitator = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Utilizes QoS Facilitator (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Utilizes_QoS_Facilitator = "Utilizes QoS Facilitator";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Utilizes_Broadcast_Services = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry Utilizes Broadcast Services (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_Utilizes_Broadcast_Services = "Utilizes Broadcast Services";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Supports_Fabric_Login_Server = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry Supports Fabric Login Server (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_Supports_Fabric_Login_Server = "Supports Fabric Login Server";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Generates_State_Change_Notifications = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry Generates State Change Notifications (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_Generates_State_Change_Notifications = "Generates State Change Notifications";

        /**
         * constant for value map entry 13
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Registers_for_State_Change_Notifications = new javax.cim.UnsignedInteger16(
                "13");

        /**
         * constant for value entry Registers for State Change Notifications (corresponds to mapEntry 13 )
         */
        public final static String VALUE_ENTRY_Registers_for_State_Change_Notifications = "Registers for State Change Notifications";

        /**
         * constant for value map entry 14
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Responds_to_Read_Connection_Status = new javax.cim.UnsignedInteger16(
                "14");

        /**
         * constant for value entry Responds to Read Connection Status (corresponds to mapEntry 14 )
         */
        public final static String VALUE_ENTRY_Responds_to_Read_Connection_Status = "Responds to Read Connection Status";

        /**
         * constant for value map entry 15
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Supports_Third_Party_Process_Logout = new javax.cim.UnsignedInteger16(
                "15");

        /**
         * constant for value entry Supports Third Party Process Logout (corresponds to mapEntry 15 )
         */
        public final static String VALUE_ENTRY_Supports_Third_Party_Process_Logout = "Supports Third Party Process Logout";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@1d681d68
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Utilizes_the_Directory_Server.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Utilizes_the_Directory_Server;
            }

            if (VALUE_ENTRY_Utilizes_the_Time_Server.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Utilizes_the_Time_Server;
            }

            if (VALUE_ENTRY_Utilizes_the_Management_Server.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Utilizes_the_Management_Server;
            }

            if (VALUE_ENTRY_Utilizes_the_Alias_Server.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Utilizes_the_Alias_Server;
            }

            if (VALUE_ENTRY_Utilizes_the_Security_Key_Distribution_Server.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Utilizes_the_Security_Key_Distribution_Server;
            }

            if (VALUE_ENTRY_Utilizes_the_Clock_Synchronization_Server.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Utilizes_the_Clock_Synchronization_Server;
            }

            if (VALUE_ENTRY_Utilizes_the_Multicast_Server.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Utilizes_the_Multicast_Server;
            }

            if (VALUE_ENTRY_Utilizes_QoS_Facilitator.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Utilizes_QoS_Facilitator;
            }

            if (VALUE_ENTRY_Utilizes_Broadcast_Services.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Utilizes_Broadcast_Services;
            }

            if (VALUE_ENTRY_Supports_Fabric_Login_Server.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Supports_Fabric_Login_Server;
            }

            if (VALUE_ENTRY_Generates_State_Change_Notifications.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Generates_State_Change_Notifications;
            }

            if (VALUE_ENTRY_Registers_for_State_Change_Notifications.equals(value)) {
                return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Registers_for_State_Change_Notifications;
            }

            if (VALUE_ENTRY_Responds_to_Read_Connection_Status.equals(value)) {
                return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Responds_to_Read_Connection_Status;
            }

            if (VALUE_ENTRY_Supports_Third_Party_Process_Logout.equals(value)) {
                return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Supports_Third_Party_Process_Logout;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Utilizes_the_Directory_Server
                    .intValue()) {
                return VALUE_ENTRY_Utilizes_the_Directory_Server;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Utilizes_the_Time_Server.intValue()) {
                return VALUE_ENTRY_Utilizes_the_Time_Server;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Utilizes_the_Management_Server
                    .intValue()) {
                return VALUE_ENTRY_Utilizes_the_Management_Server;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Utilizes_the_Alias_Server.intValue()) {
                return VALUE_ENTRY_Utilizes_the_Alias_Server;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Utilizes_the_Security_Key_Distribution_Server
                    .intValue()) {
                return VALUE_ENTRY_Utilizes_the_Security_Key_Distribution_Server;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Utilizes_the_Clock_Synchronization_Server
                    .intValue()) {
                return VALUE_ENTRY_Utilizes_the_Clock_Synchronization_Server;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Utilizes_the_Multicast_Server
                    .intValue()) {
                return VALUE_ENTRY_Utilizes_the_Multicast_Server;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Utilizes_QoS_Facilitator.intValue()) {
                return VALUE_ENTRY_Utilizes_QoS_Facilitator;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Utilizes_Broadcast_Services.intValue()) {
                return VALUE_ENTRY_Utilizes_Broadcast_Services;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Supports_Fabric_Login_Server
                    .intValue()) {
                return VALUE_ENTRY_Supports_Fabric_Login_Server;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Generates_State_Change_Notifications
                    .intValue()) {
                return VALUE_ENTRY_Generates_State_Change_Notifications;
            }

            if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Registers_for_State_Change_Notifications
                    .intValue()) {
                return VALUE_ENTRY_Registers_for_State_Change_Notifications;
            }

            if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Responds_to_Read_Connection_Status
                    .intValue()) {
                return VALUE_ENTRY_Responds_to_Read_Connection_Status;
            }

            if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Supports_Third_Party_Process_Logout
                    .intValue()) {
                return VALUE_ENTRY_Supports_Third_Party_Process_Logout;
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
         * Value Map for the property Capabilities   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Utilizes_the_Directory_Server,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Utilizes_the_Time_Server,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Utilizes_the_Management_Server,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Utilizes_the_Alias_Server,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Utilizes_the_Security_Key_Distribution_Server,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Utilizes_the_Clock_Synchronization_Server,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Utilizes_the_Multicast_Server,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Utilizes_QoS_Facilitator,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Utilizes_Broadcast_Services,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_Supports_Fabric_Login_Server,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Generates_State_Change_Notifications,
                VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Registers_for_State_Change_Notifications,
                VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Responds_to_Read_Connection_Status,
                VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_Supports_Third_Party_Process_Logout };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property Capabilities   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Utilizes_the_Directory_Server, VALUE_ENTRY_Utilizes_the_Time_Server,
                VALUE_ENTRY_Utilizes_the_Management_Server, VALUE_ENTRY_Utilizes_the_Alias_Server,
                VALUE_ENTRY_Utilizes_the_Security_Key_Distribution_Server,
                VALUE_ENTRY_Utilizes_the_Clock_Synchronization_Server,
                VALUE_ENTRY_Utilizes_the_Multicast_Server, VALUE_ENTRY_Utilizes_QoS_Facilitator,
                VALUE_ENTRY_Utilizes_Broadcast_Services, VALUE_ENTRY_Supports_Fabric_Login_Server,
                VALUE_ENTRY_Generates_State_Change_Notifications,
                VALUE_ENTRY_Registers_for_State_Change_Notifications,
                VALUE_ENTRY_Responds_to_Read_Connection_Status,
                VALUE_ENTRY_Supports_Third_Party_Process_Logout };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property Capabilities   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Utilizes_the_Directory_Server,
                VALUE_ENTRY_Utilizes_the_Time_Server, VALUE_ENTRY_Utilizes_the_Management_Server,
                VALUE_ENTRY_Utilizes_the_Alias_Server,
                VALUE_ENTRY_Utilizes_the_Security_Key_Distribution_Server,
                VALUE_ENTRY_Utilizes_the_Clock_Synchronization_Server,
                VALUE_ENTRY_Utilizes_the_Multicast_Server, VALUE_ENTRY_Utilizes_QoS_Facilitator,
                VALUE_ENTRY_Utilizes_Broadcast_Services, VALUE_ENTRY_Supports_Fabric_Login_Server,
                VALUE_ENTRY_Generates_State_Change_Notifications,
                VALUE_ENTRY_Registers_for_State_Change_Notifications,
                VALUE_ENTRY_Responds_to_Read_Connection_Status,
                VALUE_ENTRY_Supports_Third_Party_Process_Logout };

    }

    /**
     * Constants of property CapabilityDescriptions
     * An array of free-form strings providing more detailed explanations for any of the Adapter features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
     */
    public static class PROPERTY_CAPABILITYDESCRIPTIONS {
        /**
         * name of the property CapabilityDescriptions
         */
        public final static String NAME = "CapabilityDescriptions";

    }

    /**
     * Constants of property Class1SequencesSent
     * Number of Class 1 sequences sent since last reset of the Device.
     */
    public static class PROPERTY_CLASS1SEQUENCESSENT {
        /**
         * name of the property Class1SequencesSent
         */
        public final static String NAME = "Class1SequencesSent";

    }

    /**
     * Constants of property Class2DiscardFrames
     * Number of frames discarded by the Adapter when running Class 2 service.
     */
    public static class PROPERTY_CLASS2DISCARDFRAMES {
        /**
         * name of the property Class2DiscardFrames
         */
        public final static String NAME = "Class2DiscardFrames";

    }

    /**
     * Constants of property Class2FramesReceived
     * Number of frames received by the Adapter when running Class 2 service.
     */
    public static class PROPERTY_CLASS2FRAMESRECEIVED {
        /**
         * name of the property Class2FramesReceived
         */
        public final static String NAME = "Class2FramesReceived";

    }

    /**
     * Constants of property Class2FramesTransmitted
     * Number of frames transmitted by the Adapter when running Class 2 service.
     */
    public static class PROPERTY_CLASS2FRAMESTRANSMITTED {
        /**
         * name of the property Class2FramesTransmitted
         */
        public final static String NAME = "Class2FramesTransmitted";

    }

    /**
     * Constants of property Class2OctetsReceived
     * Number of octets received by the Adapter when running Class 2 service.
     */
    public static class PROPERTY_CLASS2OCTETSRECEIVED {
        /**
         * name of the property Class2OctetsReceived
         */
        public final static String NAME = "Class2OctetsReceived";

    }

    /**
     * Constants of property Class2OctetsTransmitted
     * Number of octets transmitted by the Adapter when running Class 2 service.
     */
    public static class PROPERTY_CLASS2OCTETSTRANSMITTED {
        /**
         * name of the property Class2OctetsTransmitted
         */
        public final static String NAME = "Class2OctetsTransmitted";

    }

    /**
     * Constants of property Class2SequencesSent
     * Number of Class 2 sequences sent since last reset of the Device.
     */
    public static class PROPERTY_CLASS2SEQUENCESSENT {
        /**
         * name of the property Class2SequencesSent
         */
        public final static String NAME = "Class2SequencesSent";

    }

    /**
     * Constants of property Class3DiscardFrames
     * Number of frames discarded by the Adapter when running Class 3 service.
     */
    public static class PROPERTY_CLASS3DISCARDFRAMES {
        /**
         * name of the property Class3DiscardFrames
         */
        public final static String NAME = "Class3DiscardFrames";

    }

    /**
     * Constants of property Class3FramesReceived
     * Number of frames received by the Adapter when running Class 3 service.
     */
    public static class PROPERTY_CLASS3FRAMESRECEIVED {
        /**
         * name of the property Class3FramesReceived
         */
        public final static String NAME = "Class3FramesReceived";

    }

    /**
     * Constants of property Class3FramesTransmitted
     * Number of frames transmitted by the Adapter when running Class 3 service.
     */
    public static class PROPERTY_CLASS3FRAMESTRANSMITTED {
        /**
         * name of the property Class3FramesTransmitted
         */
        public final static String NAME = "Class3FramesTransmitted";

    }

    /**
     * Constants of property Class3OctetsReceived
     * Number of octets received by the Adapter when running Class 3 service.
     */
    public static class PROPERTY_CLASS3OCTETSRECEIVED {
        /**
         * name of the property Class3OctetsReceived
         */
        public final static String NAME = "Class3OctetsReceived";

    }

    /**
     * Constants of property Class3OctetsTransmitted
     * Number of octets transmitted by the Adapter when running Class 3 service.
     */
    public static class PROPERTY_CLASS3OCTETSTRANSMITTED {
        /**
         * name of the property Class3OctetsTransmitted
         */
        public final static String NAME = "Class3OctetsTransmitted";

    }

    /**
     * Constants of property Class3SequencesSent
     * Number of Class 3 sequences sent since last reset of the Device.
     */
    public static class PROPERTY_CLASS3SEQUENCESSENT {
        /**
         * name of the property Class3SequencesSent
         */
        public final static String NAME = "Class3SequencesSent";

    }

    /**
     * Constants of property Class4SequencesSent
     * Number of Class 4 sequences sent since last reset of the Device.
     */
    public static class PROPERTY_CLASS4SEQUENCESSENT {
        /**
         * name of the property Class4SequencesSent
         */
        public final static String NAME = "Class4SequencesSent";

    }

    /**
     * Constants of property CurrentFC4Types
     * An array of integers indicating the Fibre Channel FC-4 protocols currently running on the Adapter. A list of all protocols supported by the Adapter is indicated in the FC4TypesSupported property. The values used in this array are taken from the FC-GS2 (bitmapped) field defined in Table 11 of the standard. Also, FC-SB-2 codes are included from the T11 document, 236V0. If the FC4 Type is "Vendor Unique" (value=255), then the specific vendor values (in the range, 0xE0 to 0xFF) that are currently running should be listed in the CurrentFC4VendorTypes property.
     */
    public static class PROPERTY_CURRENTFC4TYPES {
        /**
         * name of the property CurrentFC4Types
         */
        public final static String NAME = "CurrentFC4Types";

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
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ISO_IEC_8802___2_LLC = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry ISO/IEC 8802 - 2 LLC (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_ISO_IEC_8802___2_LLC = "ISO/IEC 8802 - 2 LLC";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_IP_over_FC = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry IP over FC (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_IP_over_FC = "IP over FC";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SCSI___FCP = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry SCSI - FCP (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_SCSI___FCP = "SCSI - FCP";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_SCSI___GPP = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry SCSI - GPP (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_SCSI___GPP = "SCSI - GPP";

        /**
         * constant for value map entry 17
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_IPI___3_Master = new javax.cim.UnsignedInteger16(
                "17");

        /**
         * constant for value entry IPI - 3 Master (corresponds to mapEntry 17 )
         */
        public final static String VALUE_ENTRY_IPI___3_Master = "IPI - 3 Master";

        /**
         * constant for value map entry 18
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_IPI___3_Slave = new javax.cim.UnsignedInteger16(
                "18");

        /**
         * constant for value entry IPI - 3 Slave (corresponds to mapEntry 18 )
         */
        public final static String VALUE_ENTRY_IPI___3_Slave = "IPI - 3 Slave";

        /**
         * constant for value map entry 19
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_IPI___3_Peer = new javax.cim.UnsignedInteger16(
                "19");

        /**
         * constant for value entry IPI - 3 Peer (corresponds to mapEntry 19 )
         */
        public final static String VALUE_ENTRY_IPI___3_Peer = "IPI - 3 Peer";

        /**
         * constant for value map entry 21
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_CP_IPI___3_Master = new javax.cim.UnsignedInteger16(
                "21");

        /**
         * constant for value entry CP IPI - 3 Master (corresponds to mapEntry 21 )
         */
        public final static String VALUE_ENTRY_CP_IPI___3_Master = "CP IPI - 3 Master";

        /**
         * constant for value map entry 22
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_CP_IPI___3_Slave = new javax.cim.UnsignedInteger16(
                "22");

        /**
         * constant for value entry CP IPI - 3 Slave (corresponds to mapEntry 22 )
         */
        public final static String VALUE_ENTRY_CP_IPI___3_Slave = "CP IPI - 3 Slave";

        /**
         * constant for value map entry 23
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_CP_IPI___3_Peer = new javax.cim.UnsignedInteger16(
                "23");

        /**
         * constant for value entry CP IPI - 3 Peer (corresponds to mapEntry 23 )
         */
        public final static String VALUE_ENTRY_CP_IPI___3_Peer = "CP IPI - 3 Peer";

        /**
         * constant for value map entry 25
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_SBCCS_Channel = new javax.cim.UnsignedInteger16(
                "25");

        /**
         * constant for value entry SBCCS Channel (corresponds to mapEntry 25 )
         */
        public final static String VALUE_ENTRY_SBCCS_Channel = "SBCCS Channel";

        /**
         * constant for value map entry 26
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_SBCCS_Control_Unit = new javax.cim.UnsignedInteger16(
                "26");

        /**
         * constant for value entry SBCCS Control Unit (corresponds to mapEntry 26 )
         */
        public final static String VALUE_ENTRY_SBCCS_Control_Unit = "SBCCS Control Unit";

        /**
         * constant for value map entry 27
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_FC_SB_2_Channel = new javax.cim.UnsignedInteger16(
                "27");

        /**
         * constant for value entry FC-SB-2 Channel (corresponds to mapEntry 27 )
         */
        public final static String VALUE_ENTRY_FC_SB_2_Channel = "FC-SB-2 Channel";

        /**
         * constant for value map entry 28
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_FC_SB_2_Control_Unit = new javax.cim.UnsignedInteger16(
                "28");

        /**
         * constant for value entry FC-SB-2 Control Unit (corresponds to mapEntry 28 )
         */
        public final static String VALUE_ENTRY_FC_SB_2_Control_Unit = "FC-SB-2 Control Unit";

        /**
         * constant for value map entry 32
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Fibre_Channel_Services__FC_GS = new javax.cim.UnsignedInteger16(
                "32");

        /**
         * constant for value entry Fibre Channel Services (FC-GS (corresponds to mapEntry 32 )
         */
        public final static String VALUE_ENTRY_Fibre_Channel_Services__FC_GS = "Fibre Channel Services (FC-GS";

        /**
         * constant for value map entry 34
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_FC_GS_2 = new javax.cim.UnsignedInteger16(
                "34");

        /**
         * constant for value entry FC-GS-2 (corresponds to mapEntry 34 )
         */
        public final static String VALUE_ENTRY_FC_GS_2 = "FC-GS-2";

        /**
         * constant for value map entry 36
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_FC_GS_3_ = new javax.cim.UnsignedInteger16(
                "36");

        /**
         * constant for value entry FC-GS-3) (corresponds to mapEntry 36 )
         */
        public final static String VALUE_ENTRY_FC_GS_3_ = "FC-GS-3)";

        /**
         * constant for value map entry 64
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_FC_SW = new javax.cim.UnsignedInteger16(
                "64");

        /**
         * constant for value entry FC-SW (corresponds to mapEntry 64 )
         */
        public final static String VALUE_ENTRY_FC_SW = "FC-SW";

        /**
         * constant for value map entry 80
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_FC___SNMP = new javax.cim.UnsignedInteger16(
                "80");

        /**
         * constant for value entry FC - SNMP (corresponds to mapEntry 80 )
         */
        public final static String VALUE_ENTRY_FC___SNMP = "FC - SNMP";

        /**
         * constant for value map entry 81
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_HIPPI___FP = new javax.cim.UnsignedInteger16(
                "81");

        /**
         * constant for value entry HIPPI - FP (corresponds to mapEntry 81 )
         */
        public final static String VALUE_ENTRY_HIPPI___FP = "HIPPI - FP";

        /**
         * constant for value map entry 82
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_BBL_Control = new javax.cim.UnsignedInteger16(
                "82");

        /**
         * constant for value entry BBL Control (corresponds to mapEntry 82 )
         */
        public final static String VALUE_ENTRY_BBL_Control = "BBL Control";

        /**
         * constant for value map entry 88
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_BBL_FDDI_Encapsulated_LAN_PDU = new javax.cim.UnsignedInteger16(
                "88");

        /**
         * constant for value entry BBL FDDI Encapsulated LAN PDU (corresponds to mapEntry 88 )
         */
        public final static String VALUE_ENTRY_BBL_FDDI_Encapsulated_LAN_PDU = "BBL FDDI Encapsulated LAN PDU";

        /**
         * constant for value map entry 96
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_BBL_802_3_Encapsulated_LAN_PDU = new javax.cim.UnsignedInteger16(
                "96");

        /**
         * constant for value entry BBL 802.3 Encapsulated LAN PDU (corresponds to mapEntry 96 )
         */
        public final static String VALUE_ENTRY_BBL_802_3_Encapsulated_LAN_PDU = "BBL 802.3 Encapsulated LAN PDU";

        /**
         * constant for value map entry 255
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_255_FOR_VALUE_ENTRY_FC___VI = new javax.cim.UnsignedInteger16(
                "255");

        /**
         * constant for value entry FC - VI (corresponds to mapEntry 255 )
         */
        public final static String VALUE_ENTRY_FC___VI = "FC - VI";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@317c317c
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_ISO_IEC_8802___2_LLC.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ISO_IEC_8802___2_LLC;
            }

            if (VALUE_ENTRY_IP_over_FC.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_IP_over_FC;
            }

            if (VALUE_ENTRY_SCSI___FCP.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SCSI___FCP;
            }

            if (VALUE_ENTRY_SCSI___GPP.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_SCSI___GPP;
            }

            if (VALUE_ENTRY_IPI___3_Master.equals(value)) {
                return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_IPI___3_Master;
            }

            if (VALUE_ENTRY_IPI___3_Slave.equals(value)) {
                return VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_IPI___3_Slave;
            }

            if (VALUE_ENTRY_IPI___3_Peer.equals(value)) {
                return VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_IPI___3_Peer;
            }

            if (VALUE_ENTRY_CP_IPI___3_Master.equals(value)) {
                return VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_CP_IPI___3_Master;
            }

            if (VALUE_ENTRY_CP_IPI___3_Slave.equals(value)) {
                return VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_CP_IPI___3_Slave;
            }

            if (VALUE_ENTRY_CP_IPI___3_Peer.equals(value)) {
                return VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_CP_IPI___3_Peer;
            }

            if (VALUE_ENTRY_SBCCS_Channel.equals(value)) {
                return VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_SBCCS_Channel;
            }

            if (VALUE_ENTRY_SBCCS_Control_Unit.equals(value)) {
                return VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_SBCCS_Control_Unit;
            }

            if (VALUE_ENTRY_FC_SB_2_Channel.equals(value)) {
                return VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_FC_SB_2_Channel;
            }

            if (VALUE_ENTRY_FC_SB_2_Control_Unit.equals(value)) {
                return VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_FC_SB_2_Control_Unit;
            }

            if (VALUE_ENTRY_Fibre_Channel_Services__FC_GS.equals(value)) {
                return VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Fibre_Channel_Services__FC_GS;
            }

            if (VALUE_ENTRY_FC_GS_2.equals(value)) {
                return VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_FC_GS_2;
            }

            if (VALUE_ENTRY_FC_GS_3_.equals(value)) {
                return VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_FC_GS_3_;
            }

            if (VALUE_ENTRY_FC_SW.equals(value)) {
                return VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_FC_SW;
            }

            if (VALUE_ENTRY_FC___SNMP.equals(value)) {
                return VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_FC___SNMP;
            }

            if (VALUE_ENTRY_HIPPI___FP.equals(value)) {
                return VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_HIPPI___FP;
            }

            if (VALUE_ENTRY_BBL_Control.equals(value)) {
                return VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_BBL_Control;
            }

            if (VALUE_ENTRY_BBL_FDDI_Encapsulated_LAN_PDU.equals(value)) {
                return VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_BBL_FDDI_Encapsulated_LAN_PDU;
            }

            if (VALUE_ENTRY_BBL_802_3_Encapsulated_LAN_PDU.equals(value)) {
                return VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_BBL_802_3_Encapsulated_LAN_PDU;
            }

            if (VALUE_ENTRY_FC___VI.equals(value)) {
                return VALUE_MAP_ENTRY_255_FOR_VALUE_ENTRY_FC___VI;
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

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ISO_IEC_8802___2_LLC.intValue()) {
                return VALUE_ENTRY_ISO_IEC_8802___2_LLC;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_IP_over_FC.intValue()) {
                return VALUE_ENTRY_IP_over_FC;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SCSI___FCP.intValue()) {
                return VALUE_ENTRY_SCSI___FCP;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_SCSI___GPP.intValue()) {
                return VALUE_ENTRY_SCSI___GPP;
            }

            if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_IPI___3_Master.intValue()) {
                return VALUE_ENTRY_IPI___3_Master;
            }

            if (iValue == VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_IPI___3_Slave.intValue()) {
                return VALUE_ENTRY_IPI___3_Slave;
            }

            if (iValue == VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_IPI___3_Peer.intValue()) {
                return VALUE_ENTRY_IPI___3_Peer;
            }

            if (iValue == VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_CP_IPI___3_Master.intValue()) {
                return VALUE_ENTRY_CP_IPI___3_Master;
            }

            if (iValue == VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_CP_IPI___3_Slave.intValue()) {
                return VALUE_ENTRY_CP_IPI___3_Slave;
            }

            if (iValue == VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_CP_IPI___3_Peer.intValue()) {
                return VALUE_ENTRY_CP_IPI___3_Peer;
            }

            if (iValue == VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_SBCCS_Channel.intValue()) {
                return VALUE_ENTRY_SBCCS_Channel;
            }

            if (iValue == VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_SBCCS_Control_Unit.intValue()) {
                return VALUE_ENTRY_SBCCS_Control_Unit;
            }

            if (iValue == VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_FC_SB_2_Channel.intValue()) {
                return VALUE_ENTRY_FC_SB_2_Channel;
            }

            if (iValue == VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_FC_SB_2_Control_Unit.intValue()) {
                return VALUE_ENTRY_FC_SB_2_Control_Unit;
            }

            if (iValue == VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Fibre_Channel_Services__FC_GS
                    .intValue()) {
                return VALUE_ENTRY_Fibre_Channel_Services__FC_GS;
            }

            if (iValue == VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_FC_GS_2.intValue()) {
                return VALUE_ENTRY_FC_GS_2;
            }

            if (iValue == VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_FC_GS_3_.intValue()) {
                return VALUE_ENTRY_FC_GS_3_;
            }

            if (iValue == VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_FC_SW.intValue()) {
                return VALUE_ENTRY_FC_SW;
            }

            if (iValue == VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_FC___SNMP.intValue()) {
                return VALUE_ENTRY_FC___SNMP;
            }

            if (iValue == VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_HIPPI___FP.intValue()) {
                return VALUE_ENTRY_HIPPI___FP;
            }

            if (iValue == VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_BBL_Control.intValue()) {
                return VALUE_ENTRY_BBL_Control;
            }

            if (iValue == VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_BBL_FDDI_Encapsulated_LAN_PDU
                    .intValue()) {
                return VALUE_ENTRY_BBL_FDDI_Encapsulated_LAN_PDU;
            }

            if (iValue == VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_BBL_802_3_Encapsulated_LAN_PDU
                    .intValue()) {
                return VALUE_ENTRY_BBL_802_3_Encapsulated_LAN_PDU;
            }

            if (iValue == VALUE_MAP_ENTRY_255_FOR_VALUE_ENTRY_FC___VI.intValue()) {
                return VALUE_ENTRY_FC___VI;
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
         * Value Map for the property CurrentFC4Types   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ISO_IEC_8802___2_LLC,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_IP_over_FC,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SCSI___FCP,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_SCSI___GPP,
                VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_IPI___3_Master,
                VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_IPI___3_Slave,
                VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_IPI___3_Peer,
                VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_CP_IPI___3_Master,
                VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_CP_IPI___3_Slave,
                VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_CP_IPI___3_Peer,
                VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_SBCCS_Channel,
                VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_SBCCS_Control_Unit,
                VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_FC_SB_2_Channel,
                VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_FC_SB_2_Control_Unit,
                VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Fibre_Channel_Services__FC_GS,
                VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_FC_GS_2,
                VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_FC_GS_3_,
                VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_FC_SW,
                VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_FC___SNMP,
                VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_HIPPI___FP,
                VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_BBL_Control,
                VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_BBL_FDDI_Encapsulated_LAN_PDU,
                VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_BBL_802_3_Encapsulated_LAN_PDU,
                VALUE_MAP_ENTRY_255_FOR_VALUE_ENTRY_FC___VI };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property CurrentFC4Types   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_ISO_IEC_8802___2_LLC, VALUE_ENTRY_IP_over_FC, VALUE_ENTRY_SCSI___FCP,
                VALUE_ENTRY_SCSI___GPP, VALUE_ENTRY_IPI___3_Master, VALUE_ENTRY_IPI___3_Slave,
                VALUE_ENTRY_IPI___3_Peer, VALUE_ENTRY_CP_IPI___3_Master,
                VALUE_ENTRY_CP_IPI___3_Slave, VALUE_ENTRY_CP_IPI___3_Peer,
                VALUE_ENTRY_SBCCS_Channel, VALUE_ENTRY_SBCCS_Control_Unit,
                VALUE_ENTRY_FC_SB_2_Channel, VALUE_ENTRY_FC_SB_2_Control_Unit,
                VALUE_ENTRY_Fibre_Channel_Services__FC_GS, VALUE_ENTRY_FC_GS_2,
                VALUE_ENTRY_FC_GS_3_, VALUE_ENTRY_FC_SW, VALUE_ENTRY_FC___SNMP,
                VALUE_ENTRY_HIPPI___FP, VALUE_ENTRY_BBL_Control,
                VALUE_ENTRY_BBL_FDDI_Encapsulated_LAN_PDU,
                VALUE_ENTRY_BBL_802_3_Encapsulated_LAN_PDU, VALUE_ENTRY_FC___VI };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property CurrentFC4Types   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_ISO_IEC_8802___2_LLC, VALUE_ENTRY_IP_over_FC,
                VALUE_ENTRY_SCSI___FCP, VALUE_ENTRY_SCSI___GPP, VALUE_ENTRY_IPI___3_Master,
                VALUE_ENTRY_IPI___3_Slave, VALUE_ENTRY_IPI___3_Peer, VALUE_ENTRY_CP_IPI___3_Master,
                VALUE_ENTRY_CP_IPI___3_Slave, VALUE_ENTRY_CP_IPI___3_Peer,
                VALUE_ENTRY_SBCCS_Channel, VALUE_ENTRY_SBCCS_Control_Unit,
                VALUE_ENTRY_FC_SB_2_Channel, VALUE_ENTRY_FC_SB_2_Control_Unit,
                VALUE_ENTRY_Fibre_Channel_Services__FC_GS, VALUE_ENTRY_FC_GS_2,
                VALUE_ENTRY_FC_GS_3_, VALUE_ENTRY_FC_SW, VALUE_ENTRY_FC___SNMP,
                VALUE_ENTRY_HIPPI___FP, VALUE_ENTRY_BBL_Control,
                VALUE_ENTRY_BBL_FDDI_Encapsulated_LAN_PDU,
                VALUE_ENTRY_BBL_802_3_Encapsulated_LAN_PDU, VALUE_ENTRY_FC___VI };

    }

    /**
     * Constants of property CurrentFC4VendorTypes
     * When the CurrentFC4Types array contains the value 255 ("Vendor Unique"), then the property, CurrentFC4 VendorTypes, lists all the vendor specific protocols running on the Adapter. These values are in the range, 0xE0 to 0xFF.
     */
    public static class PROPERTY_CURRENTFC4VENDORTYPES {
        /**
         * name of the property CurrentFC4VendorTypes
         */
        public final static String NAME = "CurrentFC4VendorTypes";

    }

    /**
     * Constants of property EndCreditErrors
     * Number of times that the Device has been without an end credit for a time longer than ErrorDetectTimeout.
     */
    public static class PROPERTY_ENDCREDITERRORS {
        /**
         * name of the property EndCreditErrors
         */
        public final static String NAME = "EndCreditErrors";

    }

    /**
     * Constants of property ErrorDetectTimeout
     * A 'short' timeout value (in milliseconds) for determining that an error has occurred. The default value is 10 seconds (10000 milliseconds).
     */
    public static class PROPERTY_ERRORDETECTTIMEOUT {
        /**
         * name of the property ErrorDetectTimeout
         */
        public final static String NAME = "ErrorDetectTimeout";

    }

    /**
     * Constants of property FC4TypesSupported
     * An array of integers indicating the Fibre Channel FC-4 protocols supported by the Adapter. The protocols that are active and running are indicated in the CurrentFC4Types property. The values used in this array are taken from the FC-GS2 (bitmapped) field defined in Table 11 of the standard. Also, FC-SB-2 codes are included from the T11 document, 236V0. If the FC4 Type is "Vendor Unique" (value=255), then the specific vendor values (in the range, 0xE0 to 0xFF) should be listed in the FC4VendorUniqueTypes property.
     */
    public static class PROPERTY_FC4TYPESSUPPORTED {
        /**
         * name of the property FC4TypesSupported
         */
        public final static String NAME = "FC4TypesSupported";

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
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ISO_IEC_8802___2_LLC = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry ISO/IEC 8802 - 2 LLC (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_ISO_IEC_8802___2_LLC = "ISO/IEC 8802 - 2 LLC";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_IP_over_FC = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry IP over FC (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_IP_over_FC = "IP over FC";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SCSI___FCP = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry SCSI - FCP (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_SCSI___FCP = "SCSI - FCP";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_SCSI___GPP = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry SCSI - GPP (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_SCSI___GPP = "SCSI - GPP";

        /**
         * constant for value map entry 17
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_IPI___3_Master = new javax.cim.UnsignedInteger16(
                "17");

        /**
         * constant for value entry IPI - 3 Master (corresponds to mapEntry 17 )
         */
        public final static String VALUE_ENTRY_IPI___3_Master = "IPI - 3 Master";

        /**
         * constant for value map entry 18
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_IPI___3_Slave = new javax.cim.UnsignedInteger16(
                "18");

        /**
         * constant for value entry IPI - 3 Slave (corresponds to mapEntry 18 )
         */
        public final static String VALUE_ENTRY_IPI___3_Slave = "IPI - 3 Slave";

        /**
         * constant for value map entry 19
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_IPI___3_Peer = new javax.cim.UnsignedInteger16(
                "19");

        /**
         * constant for value entry IPI - 3 Peer (corresponds to mapEntry 19 )
         */
        public final static String VALUE_ENTRY_IPI___3_Peer = "IPI - 3 Peer";

        /**
         * constant for value map entry 21
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_CP_IPI___3_Master = new javax.cim.UnsignedInteger16(
                "21");

        /**
         * constant for value entry CP IPI - 3 Master (corresponds to mapEntry 21 )
         */
        public final static String VALUE_ENTRY_CP_IPI___3_Master = "CP IPI - 3 Master";

        /**
         * constant for value map entry 22
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_CP_IPI___3_Slave = new javax.cim.UnsignedInteger16(
                "22");

        /**
         * constant for value entry CP IPI - 3 Slave (corresponds to mapEntry 22 )
         */
        public final static String VALUE_ENTRY_CP_IPI___3_Slave = "CP IPI - 3 Slave";

        /**
         * constant for value map entry 23
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_CP_IPI___3_Peer = new javax.cim.UnsignedInteger16(
                "23");

        /**
         * constant for value entry CP IPI - 3 Peer (corresponds to mapEntry 23 )
         */
        public final static String VALUE_ENTRY_CP_IPI___3_Peer = "CP IPI - 3 Peer";

        /**
         * constant for value map entry 25
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_SBCCS_Channel = new javax.cim.UnsignedInteger16(
                "25");

        /**
         * constant for value entry SBCCS Channel (corresponds to mapEntry 25 )
         */
        public final static String VALUE_ENTRY_SBCCS_Channel = "SBCCS Channel";

        /**
         * constant for value map entry 26
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_SBCCS_Control_Unit = new javax.cim.UnsignedInteger16(
                "26");

        /**
         * constant for value entry SBCCS Control Unit (corresponds to mapEntry 26 )
         */
        public final static String VALUE_ENTRY_SBCCS_Control_Unit = "SBCCS Control Unit";

        /**
         * constant for value map entry 27
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_FC_SB_2_Channel = new javax.cim.UnsignedInteger16(
                "27");

        /**
         * constant for value entry FC-SB-2 Channel (corresponds to mapEntry 27 )
         */
        public final static String VALUE_ENTRY_FC_SB_2_Channel = "FC-SB-2 Channel";

        /**
         * constant for value map entry 28
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_FC_SB_2_Control_Unit = new javax.cim.UnsignedInteger16(
                "28");

        /**
         * constant for value entry FC-SB-2 Control Unit (corresponds to mapEntry 28 )
         */
        public final static String VALUE_ENTRY_FC_SB_2_Control_Unit = "FC-SB-2 Control Unit";

        /**
         * constant for value map entry 32
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Fibre_Channel_Services__FC_GS = new javax.cim.UnsignedInteger16(
                "32");

        /**
         * constant for value entry Fibre Channel Services (FC-GS (corresponds to mapEntry 32 )
         */
        public final static String VALUE_ENTRY_Fibre_Channel_Services__FC_GS = "Fibre Channel Services (FC-GS";

        /**
         * constant for value map entry 34
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_FC_GS_2 = new javax.cim.UnsignedInteger16(
                "34");

        /**
         * constant for value entry FC-GS-2 (corresponds to mapEntry 34 )
         */
        public final static String VALUE_ENTRY_FC_GS_2 = "FC-GS-2";

        /**
         * constant for value map entry 36
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_FC_GS_3_ = new javax.cim.UnsignedInteger16(
                "36");

        /**
         * constant for value entry FC-GS-3) (corresponds to mapEntry 36 )
         */
        public final static String VALUE_ENTRY_FC_GS_3_ = "FC-GS-3)";

        /**
         * constant for value map entry 64
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_FC_SW = new javax.cim.UnsignedInteger16(
                "64");

        /**
         * constant for value entry FC-SW (corresponds to mapEntry 64 )
         */
        public final static String VALUE_ENTRY_FC_SW = "FC-SW";

        /**
         * constant for value map entry 80
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_FC___SNMP = new javax.cim.UnsignedInteger16(
                "80");

        /**
         * constant for value entry FC - SNMP (corresponds to mapEntry 80 )
         */
        public final static String VALUE_ENTRY_FC___SNMP = "FC - SNMP";

        /**
         * constant for value map entry 81
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_HIPPI___FP = new javax.cim.UnsignedInteger16(
                "81");

        /**
         * constant for value entry HIPPI - FP (corresponds to mapEntry 81 )
         */
        public final static String VALUE_ENTRY_HIPPI___FP = "HIPPI - FP";

        /**
         * constant for value map entry 82
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_BBL_Control = new javax.cim.UnsignedInteger16(
                "82");

        /**
         * constant for value entry BBL Control (corresponds to mapEntry 82 )
         */
        public final static String VALUE_ENTRY_BBL_Control = "BBL Control";

        /**
         * constant for value map entry 88
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_BBL_FDDI_Encapsulated_LAN_PDU = new javax.cim.UnsignedInteger16(
                "88");

        /**
         * constant for value entry BBL FDDI Encapsulated LAN PDU (corresponds to mapEntry 88 )
         */
        public final static String VALUE_ENTRY_BBL_FDDI_Encapsulated_LAN_PDU = "BBL FDDI Encapsulated LAN PDU";

        /**
         * constant for value map entry 96
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_BBL_802_3_Encapsulated_LAN_PDU = new javax.cim.UnsignedInteger16(
                "96");

        /**
         * constant for value entry BBL 802.3 Encapsulated LAN PDU (corresponds to mapEntry 96 )
         */
        public final static String VALUE_ENTRY_BBL_802_3_Encapsulated_LAN_PDU = "BBL 802.3 Encapsulated LAN PDU";

        /**
         * constant for value map entry 255
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_255_FOR_VALUE_ENTRY_FC___VI = new javax.cim.UnsignedInteger16(
                "255");

        /**
         * constant for value entry FC - VI (corresponds to mapEntry 255 )
         */
        public final static String VALUE_ENTRY_FC___VI = "FC - VI";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@746c746c
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_ISO_IEC_8802___2_LLC.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ISO_IEC_8802___2_LLC;
            }

            if (VALUE_ENTRY_IP_over_FC.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_IP_over_FC;
            }

            if (VALUE_ENTRY_SCSI___FCP.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SCSI___FCP;
            }

            if (VALUE_ENTRY_SCSI___GPP.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_SCSI___GPP;
            }

            if (VALUE_ENTRY_IPI___3_Master.equals(value)) {
                return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_IPI___3_Master;
            }

            if (VALUE_ENTRY_IPI___3_Slave.equals(value)) {
                return VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_IPI___3_Slave;
            }

            if (VALUE_ENTRY_IPI___3_Peer.equals(value)) {
                return VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_IPI___3_Peer;
            }

            if (VALUE_ENTRY_CP_IPI___3_Master.equals(value)) {
                return VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_CP_IPI___3_Master;
            }

            if (VALUE_ENTRY_CP_IPI___3_Slave.equals(value)) {
                return VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_CP_IPI___3_Slave;
            }

            if (VALUE_ENTRY_CP_IPI___3_Peer.equals(value)) {
                return VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_CP_IPI___3_Peer;
            }

            if (VALUE_ENTRY_SBCCS_Channel.equals(value)) {
                return VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_SBCCS_Channel;
            }

            if (VALUE_ENTRY_SBCCS_Control_Unit.equals(value)) {
                return VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_SBCCS_Control_Unit;
            }

            if (VALUE_ENTRY_FC_SB_2_Channel.equals(value)) {
                return VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_FC_SB_2_Channel;
            }

            if (VALUE_ENTRY_FC_SB_2_Control_Unit.equals(value)) {
                return VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_FC_SB_2_Control_Unit;
            }

            if (VALUE_ENTRY_Fibre_Channel_Services__FC_GS.equals(value)) {
                return VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Fibre_Channel_Services__FC_GS;
            }

            if (VALUE_ENTRY_FC_GS_2.equals(value)) {
                return VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_FC_GS_2;
            }

            if (VALUE_ENTRY_FC_GS_3_.equals(value)) {
                return VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_FC_GS_3_;
            }

            if (VALUE_ENTRY_FC_SW.equals(value)) {
                return VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_FC_SW;
            }

            if (VALUE_ENTRY_FC___SNMP.equals(value)) {
                return VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_FC___SNMP;
            }

            if (VALUE_ENTRY_HIPPI___FP.equals(value)) {
                return VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_HIPPI___FP;
            }

            if (VALUE_ENTRY_BBL_Control.equals(value)) {
                return VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_BBL_Control;
            }

            if (VALUE_ENTRY_BBL_FDDI_Encapsulated_LAN_PDU.equals(value)) {
                return VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_BBL_FDDI_Encapsulated_LAN_PDU;
            }

            if (VALUE_ENTRY_BBL_802_3_Encapsulated_LAN_PDU.equals(value)) {
                return VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_BBL_802_3_Encapsulated_LAN_PDU;
            }

            if (VALUE_ENTRY_FC___VI.equals(value)) {
                return VALUE_MAP_ENTRY_255_FOR_VALUE_ENTRY_FC___VI;
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

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ISO_IEC_8802___2_LLC.intValue()) {
                return VALUE_ENTRY_ISO_IEC_8802___2_LLC;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_IP_over_FC.intValue()) {
                return VALUE_ENTRY_IP_over_FC;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SCSI___FCP.intValue()) {
                return VALUE_ENTRY_SCSI___FCP;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_SCSI___GPP.intValue()) {
                return VALUE_ENTRY_SCSI___GPP;
            }

            if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_IPI___3_Master.intValue()) {
                return VALUE_ENTRY_IPI___3_Master;
            }

            if (iValue == VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_IPI___3_Slave.intValue()) {
                return VALUE_ENTRY_IPI___3_Slave;
            }

            if (iValue == VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_IPI___3_Peer.intValue()) {
                return VALUE_ENTRY_IPI___3_Peer;
            }

            if (iValue == VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_CP_IPI___3_Master.intValue()) {
                return VALUE_ENTRY_CP_IPI___3_Master;
            }

            if (iValue == VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_CP_IPI___3_Slave.intValue()) {
                return VALUE_ENTRY_CP_IPI___3_Slave;
            }

            if (iValue == VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_CP_IPI___3_Peer.intValue()) {
                return VALUE_ENTRY_CP_IPI___3_Peer;
            }

            if (iValue == VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_SBCCS_Channel.intValue()) {
                return VALUE_ENTRY_SBCCS_Channel;
            }

            if (iValue == VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_SBCCS_Control_Unit.intValue()) {
                return VALUE_ENTRY_SBCCS_Control_Unit;
            }

            if (iValue == VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_FC_SB_2_Channel.intValue()) {
                return VALUE_ENTRY_FC_SB_2_Channel;
            }

            if (iValue == VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_FC_SB_2_Control_Unit.intValue()) {
                return VALUE_ENTRY_FC_SB_2_Control_Unit;
            }

            if (iValue == VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Fibre_Channel_Services__FC_GS
                    .intValue()) {
                return VALUE_ENTRY_Fibre_Channel_Services__FC_GS;
            }

            if (iValue == VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_FC_GS_2.intValue()) {
                return VALUE_ENTRY_FC_GS_2;
            }

            if (iValue == VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_FC_GS_3_.intValue()) {
                return VALUE_ENTRY_FC_GS_3_;
            }

            if (iValue == VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_FC_SW.intValue()) {
                return VALUE_ENTRY_FC_SW;
            }

            if (iValue == VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_FC___SNMP.intValue()) {
                return VALUE_ENTRY_FC___SNMP;
            }

            if (iValue == VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_HIPPI___FP.intValue()) {
                return VALUE_ENTRY_HIPPI___FP;
            }

            if (iValue == VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_BBL_Control.intValue()) {
                return VALUE_ENTRY_BBL_Control;
            }

            if (iValue == VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_BBL_FDDI_Encapsulated_LAN_PDU
                    .intValue()) {
                return VALUE_ENTRY_BBL_FDDI_Encapsulated_LAN_PDU;
            }

            if (iValue == VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_BBL_802_3_Encapsulated_LAN_PDU
                    .intValue()) {
                return VALUE_ENTRY_BBL_802_3_Encapsulated_LAN_PDU;
            }

            if (iValue == VALUE_MAP_ENTRY_255_FOR_VALUE_ENTRY_FC___VI.intValue()) {
                return VALUE_ENTRY_FC___VI;
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
         * Value Map for the property FC4TypesSupported   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_ISO_IEC_8802___2_LLC,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_IP_over_FC,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_SCSI___FCP,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_SCSI___GPP,
                VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_IPI___3_Master,
                VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_IPI___3_Slave,
                VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_IPI___3_Peer,
                VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_CP_IPI___3_Master,
                VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_CP_IPI___3_Slave,
                VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_CP_IPI___3_Peer,
                VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_SBCCS_Channel,
                VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_SBCCS_Control_Unit,
                VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_FC_SB_2_Channel,
                VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_FC_SB_2_Control_Unit,
                VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Fibre_Channel_Services__FC_GS,
                VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_FC_GS_2,
                VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_FC_GS_3_,
                VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_FC_SW,
                VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_FC___SNMP,
                VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_HIPPI___FP,
                VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_BBL_Control,
                VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_BBL_FDDI_Encapsulated_LAN_PDU,
                VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_BBL_802_3_Encapsulated_LAN_PDU,
                VALUE_MAP_ENTRY_255_FOR_VALUE_ENTRY_FC___VI };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property FC4TypesSupported   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_ISO_IEC_8802___2_LLC, VALUE_ENTRY_IP_over_FC, VALUE_ENTRY_SCSI___FCP,
                VALUE_ENTRY_SCSI___GPP, VALUE_ENTRY_IPI___3_Master, VALUE_ENTRY_IPI___3_Slave,
                VALUE_ENTRY_IPI___3_Peer, VALUE_ENTRY_CP_IPI___3_Master,
                VALUE_ENTRY_CP_IPI___3_Slave, VALUE_ENTRY_CP_IPI___3_Peer,
                VALUE_ENTRY_SBCCS_Channel, VALUE_ENTRY_SBCCS_Control_Unit,
                VALUE_ENTRY_FC_SB_2_Channel, VALUE_ENTRY_FC_SB_2_Control_Unit,
                VALUE_ENTRY_Fibre_Channel_Services__FC_GS, VALUE_ENTRY_FC_GS_2,
                VALUE_ENTRY_FC_GS_3_, VALUE_ENTRY_FC_SW, VALUE_ENTRY_FC___SNMP,
                VALUE_ENTRY_HIPPI___FP, VALUE_ENTRY_BBL_Control,
                VALUE_ENTRY_BBL_FDDI_Encapsulated_LAN_PDU,
                VALUE_ENTRY_BBL_802_3_Encapsulated_LAN_PDU, VALUE_ENTRY_FC___VI };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property FC4TypesSupported   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_ISO_IEC_8802___2_LLC, VALUE_ENTRY_IP_over_FC,
                VALUE_ENTRY_SCSI___FCP, VALUE_ENTRY_SCSI___GPP, VALUE_ENTRY_IPI___3_Master,
                VALUE_ENTRY_IPI___3_Slave, VALUE_ENTRY_IPI___3_Peer, VALUE_ENTRY_CP_IPI___3_Master,
                VALUE_ENTRY_CP_IPI___3_Slave, VALUE_ENTRY_CP_IPI___3_Peer,
                VALUE_ENTRY_SBCCS_Channel, VALUE_ENTRY_SBCCS_Control_Unit,
                VALUE_ENTRY_FC_SB_2_Channel, VALUE_ENTRY_FC_SB_2_Control_Unit,
                VALUE_ENTRY_Fibre_Channel_Services__FC_GS, VALUE_ENTRY_FC_GS_2,
                VALUE_ENTRY_FC_GS_3_, VALUE_ENTRY_FC_SW, VALUE_ENTRY_FC___SNMP,
                VALUE_ENTRY_HIPPI___FP, VALUE_ENTRY_BBL_Control,
                VALUE_ENTRY_BBL_FDDI_Encapsulated_LAN_PDU,
                VALUE_ENTRY_BBL_802_3_Encapsulated_LAN_PDU, VALUE_ENTRY_FC___VI };

    }

    /**
     * Constants of property FC4VendorUniqueTypes
     * When the FC4TypesSupported array contains the value 255 ("Vendor Unique"), then the property, FC4Vendor UniqueTypes, lists of all the vendor specific protocols supported by the Adapter. These values are in the range, 0xE0 to 0xFF.
     */
    public static class PROPERTY_FC4VENDORUNIQUETYPES {
        /**
         * name of the property FC4VendorUniqueTypes
         */
        public final static String NAME = "FC4VendorUniqueTypes";

    }

    /**
     * Constants of property FrameTimeouts
     * Number of Class 1 or 2 frames that are not ACKed within the time indicated by ErrorDetectTimeout.
     */
    public static class PROPERTY_FRAMETIMEOUTS {
        /**
         * name of the property FrameTimeouts
         */
        public final static String NAME = "FrameTimeouts";

    }

    /**
     * Constants of property MaxFrameSize
     * The maximum frame size, in bytes, supported by the Adapter.
     */
    public static class PROPERTY_MAXFRAMESIZE {
        /**
         * name of the property MaxFrameSize
         */
        public final static String NAME = "MaxFrameSize";

    }

    /**
     * Constants of property OutOfOrderFramesReceived
     * Number of frames received out of order.
     */
    public static class PROPERTY_OUTOFORDERFRAMESRECEIVED {
        /**
         * name of the property OutOfOrderFramesReceived
         */
        public final static String NAME = "OutOfOrderFramesReceived";

    }

    /**
     * Constants of property ParityErrors
     * Number of parity errors detected somewhere in the data path.
     */
    public static class PROPERTY_PARITYERRORS {
        /**
         * name of the property ParityErrors
         */
        public final static String NAME = "ParityErrors";

    }

    /**
     * Constants of property ReceiveBufferErrors
     * The number of times that a frame was received but no buffer was available.
     */
    public static class PROPERTY_RECEIVEBUFFERERRORS {
        /**
         * name of the property ReceiveBufferErrors
         */
        public final static String NAME = "ReceiveBufferErrors";

    }

    /**
     * Constants of property ReceiveEndErrors
     * The number of times that a frame was received but no end-to-end credit was available.
     */
    public static class PROPERTY_RECEIVEENDERRORS {
        /**
         * name of the property ReceiveEndErrors
         */
        public final static String NAME = "ReceiveEndErrors";

    }

    /**
     * Constants of property ResourceAllocationTimeout
     * A 'long' timeout value (in milliseconds) for determining when to reinstate a Recovery_Qualifier. The default value is 120 seconds (120000 milliseconds). It is typically set to the ErrorDetectTimeout value + 2*(fabric delay time).
     */
    public static class PROPERTY_RESOURCEALLOCATIONTIMEOUT {
        /**
         * name of the property ResourceAllocationTimeout
         */
        public final static String NAME = "ResourceAllocationTimeout";

    }

    /**
     * Constants of property SupportedCOS
     * The Fibre Channel Classes of Service that are supported by the Adapter, on its Ports. The currently negotiated COS for a connection is a property (NegotiatedCOS) on the FibrePort ActiveLogin association.
     */
    public static class PROPERTY_SUPPORTEDCOS {
        /**
         * name of the property SupportedCOS
         */
        public final static String NAME = "SupportedCOS";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_1 = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry 1 (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_1 = "1";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_2 = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry 2 (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_2 = "2";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_3 = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry 3 (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_3 = "3";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_4 = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry 4 (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_4 = "4";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_6 = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry 6 (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_6 = "6";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_F = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry F (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_F = "F";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@1d041d04
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_1.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_1;
            }

            if (VALUE_ENTRY_2.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_2;
            }

            if (VALUE_ENTRY_3.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_3;
            }

            if (VALUE_ENTRY_4.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_4;
            }

            if (VALUE_ENTRY_6.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_6;
            }

            if (VALUE_ENTRY_F.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_F;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_1.intValue()) {
                return VALUE_ENTRY_1;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_2.intValue()) {
                return VALUE_ENTRY_2;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_3.intValue()) {
                return VALUE_ENTRY_3;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_4.intValue()) {
                return VALUE_ENTRY_4;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_6.intValue()) {
                return VALUE_ENTRY_6;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_F.intValue()) {
                return VALUE_ENTRY_F;
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
         * Value Map for the property SupportedCOS   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_1,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_2, VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_3,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_4, VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_6,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_F };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property SupportedCOS   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_1,
                VALUE_ENTRY_2, VALUE_ENTRY_3, VALUE_ENTRY_4, VALUE_ENTRY_6, VALUE_ENTRY_F };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property SupportedCOS   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_1, VALUE_ENTRY_2, VALUE_ENTRY_3, VALUE_ENTRY_4, VALUE_ENTRY_6,
                VALUE_ENTRY_F };

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_NetworkAdapter.getPackages();

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
     *   The use of the CIM_FibreChannelAdapter class is deprecated, consistent with the deprecation of NetworkAdapter. Instead use CIM_FCPort. This class describes the capabilities and management aspects of a Fibre Channel Adapter.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_FibreChannelAdapter(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The use of the CIM_FibreChannelAdapter class is deprecated, consistent with the deprecation of NetworkAdapter. Instead use CIM_FCPort. This class describes the capabilities and management aspects of a Fibre Channel Adapter.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_FibreChannelAdapter(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_FibreChannelAdapter() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("BufferCreditErrors", new CIMProperty("BufferCreditErrors",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("Capabilities", new CIMProperty("Capabilities",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("CapabilityDescriptions", new CIMProperty("CapabilityDescriptions",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("Class1SequencesSent", new CIMProperty("Class1SequencesSent",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("Class2DiscardFrames", new CIMProperty("Class2DiscardFrames",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("Class2FramesReceived", new CIMProperty("Class2FramesReceived",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("Class2FramesTransmitted", new CIMProperty("Class2FramesTransmitted",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("Class2OctetsReceived", new CIMProperty("Class2OctetsReceived",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("Class2OctetsTransmitted", new CIMProperty("Class2OctetsTransmitted",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("Class2SequencesSent", new CIMProperty("Class2SequencesSent",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("Class3DiscardFrames", new CIMProperty("Class3DiscardFrames",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("Class3FramesReceived", new CIMProperty("Class3FramesReceived",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("Class3FramesTransmitted", new CIMProperty("Class3FramesTransmitted",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("Class3OctetsReceived", new CIMProperty("Class3OctetsReceived",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("Class3OctetsTransmitted", new CIMProperty("Class3OctetsTransmitted",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("Class3SequencesSent", new CIMProperty("Class3SequencesSent",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("Class4SequencesSent", new CIMProperty("Class4SequencesSent",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("CurrentFC4Types", new CIMProperty("CurrentFC4Types",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("CurrentFC4VendorTypes", new CIMProperty("CurrentFC4VendorTypes",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("EndCreditErrors", new CIMProperty("EndCreditErrors",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("ErrorDetectTimeout", new CIMProperty("ErrorDetectTimeout",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("FC4TypesSupported", new CIMProperty("FC4TypesSupported",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("FC4VendorUniqueTypes", new CIMProperty("FC4VendorUniqueTypes",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("FrameTimeouts", new CIMProperty("FrameTimeouts",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("MaxFrameSize", new CIMProperty("MaxFrameSize", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("OutOfOrderFramesReceived", new CIMProperty(
                "OutOfOrderFramesReceived", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("ParityErrors", new CIMProperty("ParityErrors", CIMDataType.UINT64_T,
                null));
        propertiesToCheck.put("ReceiveBufferErrors", new CIMProperty("ReceiveBufferErrors",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("ReceiveEndErrors", new CIMProperty("ReceiveEndErrors",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("ResourceAllocationTimeout", new CIMProperty(
                "ResourceAllocationTimeout", CIMDataType.UINT64_T, null));
        propertiesToCheck.put("SupportedCOS", new CIMProperty("SupportedCOS",
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
     * Get the property BufferCreditErrors
     *     * <br>
     * Number of times that the Device has been without a buffer credit for a time longer than ErrorDetectTimeout.
     *     */

    public javax.cim.UnsignedInteger64 get_BufferCreditErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_BUFFERCREDITERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_BUFFERCREDITERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property BufferCreditErrors
     * <br>
     * Number of times that the Device has been without a buffer credit for a time longer than ErrorDetectTimeout.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_BufferCreditErrors(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_BUFFERCREDITERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_BufferCreditErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_BUFFERCREDITERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property BufferCreditErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_BufferCreditErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_BUFFERCREDITERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_BufferCreditErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_BUFFERCREDITERRORS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property BufferCreditErrors
     * <br>
     * Number of times that the Device has been without a buffer credit for a time longer than ErrorDetectTimeout.
     */

    private static CIMProperty setPropertyValue_BufferCreditErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Capabilities
     *     * <br>
     * A list of the Capabilities of the Fibre Channel Adapter. For example, that the Adapter utilizes the Directory Server, or that it generates State Change Notifications can be indicated using the values 2 and 12, respectively.
     *     */

    public javax.cim.UnsignedInteger16[] get_Capabilities() {
        CIMProperty currentProperty = getProperty(PROPERTY_CAPABILITIES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CAPABILITIES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property Capabilities
     * <br>
     * A list of the Capabilities of the Fibre Channel Adapter. For example, that the Adapter utilizes the Directory Server, or that it generates State Change Notifications can be indicated using the values 2 and 12, respectively.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Capabilities(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CAPABILITIES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Capabilities(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CAPABILITIES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Capabilities by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Capabilities(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CAPABILITIES.NAME);
        if (property != null) {
            property = setPropertyValue_Capabilities(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CAPABILITIES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Capabilities
     * <br>
     * A list of the Capabilities of the Fibre Channel Adapter. For example, that the Adapter utilizes the Directory Server, or that it generates State Change Notifications can be indicated using the values 2 and 12, respectively.
     */

    private static CIMProperty setPropertyValue_Capabilities(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CapabilityDescriptions
     *     * <br>
     * An array of free-form strings providing more detailed explanations for any of the Adapter features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
     *     */

    public String[] get_CapabilityDescriptions() {
        CIMProperty currentProperty = getProperty(PROPERTY_CAPABILITYDESCRIPTIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CAPABILITYDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property CapabilityDescriptions
     * <br>
     * An array of free-form strings providing more detailed explanations for any of the Adapter features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CapabilityDescriptions(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CAPABILITYDESCRIPTIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CapabilityDescriptions(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CAPABILITYDESCRIPTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CapabilityDescriptions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CapabilityDescriptions(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CAPABILITYDESCRIPTIONS.NAME);
        if (property != null) {
            property = setPropertyValue_CapabilityDescriptions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CAPABILITYDESCRIPTIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CapabilityDescriptions
     * <br>
     * An array of free-form strings providing more detailed explanations for any of the Adapter features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
     */

    private static CIMProperty setPropertyValue_CapabilityDescriptions(CIMProperty currentProperty,
            String[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Class1SequencesSent
     *     * <br>
     * Number of Class 1 sequences sent since last reset of the Device.
     *     */

    public javax.cim.UnsignedInteger64 get_Class1SequencesSent() {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS1SEQUENCESSENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CLASS1SEQUENCESSENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property Class1SequencesSent
     * <br>
     * Number of Class 1 sequences sent since last reset of the Device.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Class1SequencesSent(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS1SEQUENCESSENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Class1SequencesSent(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS1SEQUENCESSENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Class1SequencesSent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Class1SequencesSent(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CLASS1SEQUENCESSENT.NAME);
        if (property != null) {
            property = setPropertyValue_Class1SequencesSent(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS1SEQUENCESSENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Class1SequencesSent
     * <br>
     * Number of Class 1 sequences sent since last reset of the Device.
     */

    private static CIMProperty setPropertyValue_Class1SequencesSent(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Class2DiscardFrames
     *     * <br>
     * Number of frames discarded by the Adapter when running Class 2 service.
     *     */

    public javax.cim.UnsignedInteger64 get_Class2DiscardFrames() {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS2DISCARDFRAMES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CLASS2DISCARDFRAMES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property Class2DiscardFrames
     * <br>
     * Number of frames discarded by the Adapter when running Class 2 service.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Class2DiscardFrames(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS2DISCARDFRAMES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Class2DiscardFrames(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS2DISCARDFRAMES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Class2DiscardFrames by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Class2DiscardFrames(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CLASS2DISCARDFRAMES.NAME);
        if (property != null) {
            property = setPropertyValue_Class2DiscardFrames(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS2DISCARDFRAMES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Class2DiscardFrames
     * <br>
     * Number of frames discarded by the Adapter when running Class 2 service.
     */

    private static CIMProperty setPropertyValue_Class2DiscardFrames(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Class2FramesReceived
     *     * <br>
     * Number of frames received by the Adapter when running Class 2 service.
     *     */

    public javax.cim.UnsignedInteger64 get_Class2FramesReceived() {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS2FRAMESRECEIVED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CLASS2FRAMESRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property Class2FramesReceived
     * <br>
     * Number of frames received by the Adapter when running Class 2 service.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Class2FramesReceived(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS2FRAMESRECEIVED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Class2FramesReceived(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS2FRAMESRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Class2FramesReceived by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Class2FramesReceived(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CLASS2FRAMESRECEIVED.NAME);
        if (property != null) {
            property = setPropertyValue_Class2FramesReceived(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS2FRAMESRECEIVED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Class2FramesReceived
     * <br>
     * Number of frames received by the Adapter when running Class 2 service.
     */

    private static CIMProperty setPropertyValue_Class2FramesReceived(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Class2FramesTransmitted
     *     * <br>
     * Number of frames transmitted by the Adapter when running Class 2 service.
     *     */

    public javax.cim.UnsignedInteger64 get_Class2FramesTransmitted() {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS2FRAMESTRANSMITTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CLASS2FRAMESTRANSMITTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property Class2FramesTransmitted
     * <br>
     * Number of frames transmitted by the Adapter when running Class 2 service.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Class2FramesTransmitted(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS2FRAMESTRANSMITTED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Class2FramesTransmitted(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS2FRAMESTRANSMITTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Class2FramesTransmitted by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Class2FramesTransmitted(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CLASS2FRAMESTRANSMITTED.NAME);
        if (property != null) {
            property = setPropertyValue_Class2FramesTransmitted(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS2FRAMESTRANSMITTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Class2FramesTransmitted
     * <br>
     * Number of frames transmitted by the Adapter when running Class 2 service.
     */

    private static CIMProperty setPropertyValue_Class2FramesTransmitted(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Class2OctetsReceived
     *     * <br>
     * Number of octets received by the Adapter when running Class 2 service.
     *     */

    public javax.cim.UnsignedInteger64 get_Class2OctetsReceived() {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS2OCTETSRECEIVED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CLASS2OCTETSRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property Class2OctetsReceived
     * <br>
     * Number of octets received by the Adapter when running Class 2 service.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Class2OctetsReceived(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS2OCTETSRECEIVED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Class2OctetsReceived(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS2OCTETSRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Class2OctetsReceived by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Class2OctetsReceived(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CLASS2OCTETSRECEIVED.NAME);
        if (property != null) {
            property = setPropertyValue_Class2OctetsReceived(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS2OCTETSRECEIVED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Class2OctetsReceived
     * <br>
     * Number of octets received by the Adapter when running Class 2 service.
     */

    private static CIMProperty setPropertyValue_Class2OctetsReceived(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Class2OctetsTransmitted
     *     * <br>
     * Number of octets transmitted by the Adapter when running Class 2 service.
     *     */

    public javax.cim.UnsignedInteger64 get_Class2OctetsTransmitted() {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS2OCTETSTRANSMITTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CLASS2OCTETSTRANSMITTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property Class2OctetsTransmitted
     * <br>
     * Number of octets transmitted by the Adapter when running Class 2 service.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Class2OctetsTransmitted(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS2OCTETSTRANSMITTED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Class2OctetsTransmitted(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS2OCTETSTRANSMITTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Class2OctetsTransmitted by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Class2OctetsTransmitted(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CLASS2OCTETSTRANSMITTED.NAME);
        if (property != null) {
            property = setPropertyValue_Class2OctetsTransmitted(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS2OCTETSTRANSMITTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Class2OctetsTransmitted
     * <br>
     * Number of octets transmitted by the Adapter when running Class 2 service.
     */

    private static CIMProperty setPropertyValue_Class2OctetsTransmitted(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Class2SequencesSent
     *     * <br>
     * Number of Class 2 sequences sent since last reset of the Device.
     *     */

    public javax.cim.UnsignedInteger64 get_Class2SequencesSent() {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS2SEQUENCESSENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CLASS2SEQUENCESSENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property Class2SequencesSent
     * <br>
     * Number of Class 2 sequences sent since last reset of the Device.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Class2SequencesSent(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS2SEQUENCESSENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Class2SequencesSent(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS2SEQUENCESSENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Class2SequencesSent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Class2SequencesSent(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CLASS2SEQUENCESSENT.NAME);
        if (property != null) {
            property = setPropertyValue_Class2SequencesSent(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS2SEQUENCESSENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Class2SequencesSent
     * <br>
     * Number of Class 2 sequences sent since last reset of the Device.
     */

    private static CIMProperty setPropertyValue_Class2SequencesSent(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Class3DiscardFrames
     *     * <br>
     * Number of frames discarded by the Adapter when running Class 3 service.
     *     */

    public javax.cim.UnsignedInteger64 get_Class3DiscardFrames() {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS3DISCARDFRAMES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CLASS3DISCARDFRAMES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property Class3DiscardFrames
     * <br>
     * Number of frames discarded by the Adapter when running Class 3 service.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Class3DiscardFrames(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS3DISCARDFRAMES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Class3DiscardFrames(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS3DISCARDFRAMES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Class3DiscardFrames by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Class3DiscardFrames(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CLASS3DISCARDFRAMES.NAME);
        if (property != null) {
            property = setPropertyValue_Class3DiscardFrames(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS3DISCARDFRAMES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Class3DiscardFrames
     * <br>
     * Number of frames discarded by the Adapter when running Class 3 service.
     */

    private static CIMProperty setPropertyValue_Class3DiscardFrames(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Class3FramesReceived
     *     * <br>
     * Number of frames received by the Adapter when running Class 3 service.
     *     */

    public javax.cim.UnsignedInteger64 get_Class3FramesReceived() {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS3FRAMESRECEIVED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CLASS3FRAMESRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property Class3FramesReceived
     * <br>
     * Number of frames received by the Adapter when running Class 3 service.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Class3FramesReceived(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS3FRAMESRECEIVED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Class3FramesReceived(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS3FRAMESRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Class3FramesReceived by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Class3FramesReceived(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CLASS3FRAMESRECEIVED.NAME);
        if (property != null) {
            property = setPropertyValue_Class3FramesReceived(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS3FRAMESRECEIVED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Class3FramesReceived
     * <br>
     * Number of frames received by the Adapter when running Class 3 service.
     */

    private static CIMProperty setPropertyValue_Class3FramesReceived(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Class3FramesTransmitted
     *     * <br>
     * Number of frames transmitted by the Adapter when running Class 3 service.
     *     */

    public javax.cim.UnsignedInteger64 get_Class3FramesTransmitted() {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS3FRAMESTRANSMITTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CLASS3FRAMESTRANSMITTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property Class3FramesTransmitted
     * <br>
     * Number of frames transmitted by the Adapter when running Class 3 service.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Class3FramesTransmitted(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS3FRAMESTRANSMITTED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Class3FramesTransmitted(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS3FRAMESTRANSMITTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Class3FramesTransmitted by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Class3FramesTransmitted(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CLASS3FRAMESTRANSMITTED.NAME);
        if (property != null) {
            property = setPropertyValue_Class3FramesTransmitted(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS3FRAMESTRANSMITTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Class3FramesTransmitted
     * <br>
     * Number of frames transmitted by the Adapter when running Class 3 service.
     */

    private static CIMProperty setPropertyValue_Class3FramesTransmitted(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Class3OctetsReceived
     *     * <br>
     * Number of octets received by the Adapter when running Class 3 service.
     *     */

    public javax.cim.UnsignedInteger64 get_Class3OctetsReceived() {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS3OCTETSRECEIVED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CLASS3OCTETSRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property Class3OctetsReceived
     * <br>
     * Number of octets received by the Adapter when running Class 3 service.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Class3OctetsReceived(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS3OCTETSRECEIVED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Class3OctetsReceived(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS3OCTETSRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Class3OctetsReceived by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Class3OctetsReceived(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CLASS3OCTETSRECEIVED.NAME);
        if (property != null) {
            property = setPropertyValue_Class3OctetsReceived(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS3OCTETSRECEIVED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Class3OctetsReceived
     * <br>
     * Number of octets received by the Adapter when running Class 3 service.
     */

    private static CIMProperty setPropertyValue_Class3OctetsReceived(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Class3OctetsTransmitted
     *     * <br>
     * Number of octets transmitted by the Adapter when running Class 3 service.
     *     */

    public javax.cim.UnsignedInteger64 get_Class3OctetsTransmitted() {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS3OCTETSTRANSMITTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CLASS3OCTETSTRANSMITTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property Class3OctetsTransmitted
     * <br>
     * Number of octets transmitted by the Adapter when running Class 3 service.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Class3OctetsTransmitted(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS3OCTETSTRANSMITTED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Class3OctetsTransmitted(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS3OCTETSTRANSMITTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Class3OctetsTransmitted by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Class3OctetsTransmitted(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CLASS3OCTETSTRANSMITTED.NAME);
        if (property != null) {
            property = setPropertyValue_Class3OctetsTransmitted(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS3OCTETSTRANSMITTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Class3OctetsTransmitted
     * <br>
     * Number of octets transmitted by the Adapter when running Class 3 service.
     */

    private static CIMProperty setPropertyValue_Class3OctetsTransmitted(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Class3SequencesSent
     *     * <br>
     * Number of Class 3 sequences sent since last reset of the Device.
     *     */

    public javax.cim.UnsignedInteger64 get_Class3SequencesSent() {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS3SEQUENCESSENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CLASS3SEQUENCESSENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property Class3SequencesSent
     * <br>
     * Number of Class 3 sequences sent since last reset of the Device.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Class3SequencesSent(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS3SEQUENCESSENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Class3SequencesSent(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS3SEQUENCESSENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Class3SequencesSent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Class3SequencesSent(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CLASS3SEQUENCESSENT.NAME);
        if (property != null) {
            property = setPropertyValue_Class3SequencesSent(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS3SEQUENCESSENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Class3SequencesSent
     * <br>
     * Number of Class 3 sequences sent since last reset of the Device.
     */

    private static CIMProperty setPropertyValue_Class3SequencesSent(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Class4SequencesSent
     *     * <br>
     * Number of Class 4 sequences sent since last reset of the Device.
     *     */

    public javax.cim.UnsignedInteger64 get_Class4SequencesSent() {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS4SEQUENCESSENT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CLASS4SEQUENCESSENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property Class4SequencesSent
     * <br>
     * Number of Class 4 sequences sent since last reset of the Device.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Class4SequencesSent(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CLASS4SEQUENCESSENT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Class4SequencesSent(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS4SEQUENCESSENT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Class4SequencesSent by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Class4SequencesSent(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CLASS4SEQUENCESSENT.NAME);
        if (property != null) {
            property = setPropertyValue_Class4SequencesSent(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CLASS4SEQUENCESSENT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Class4SequencesSent
     * <br>
     * Number of Class 4 sequences sent since last reset of the Device.
     */

    private static CIMProperty setPropertyValue_Class4SequencesSent(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CurrentFC4Types
     *     * <br>
     * An array of integers indicating the Fibre Channel FC-4 protocols currently running on the Adapter. A list of all protocols supported by the Adapter is indicated in the FC4TypesSupported property. The values used in this array are taken from the FC-GS2 (bitmapped) field defined in Table 11 of the standard. Also, FC-SB-2 codes are included from the T11 document, 236V0. If the FC4 Type is "Vendor Unique" (value=255), then the specific vendor values (in the range, 0xE0 to 0xFF) that are currently running should be listed in the CurrentFC4VendorTypes property.
     *     */

    public javax.cim.UnsignedInteger16[] get_CurrentFC4Types() {
        CIMProperty currentProperty = getProperty(PROPERTY_CURRENTFC4TYPES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CURRENTFC4TYPES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property CurrentFC4Types
     * <br>
     * An array of integers indicating the Fibre Channel FC-4 protocols currently running on the Adapter. A list of all protocols supported by the Adapter is indicated in the FC4TypesSupported property. The values used in this array are taken from the FC-GS2 (bitmapped) field defined in Table 11 of the standard. Also, FC-SB-2 codes are included from the T11 document, 236V0. If the FC4 Type is "Vendor Unique" (value=255), then the specific vendor values (in the range, 0xE0 to 0xFF) that are currently running should be listed in the CurrentFC4VendorTypes property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CurrentFC4Types(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CURRENTFC4TYPES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CurrentFC4Types(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CURRENTFC4TYPES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CurrentFC4Types by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CurrentFC4Types(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CURRENTFC4TYPES.NAME);
        if (property != null) {
            property = setPropertyValue_CurrentFC4Types(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CURRENTFC4TYPES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CurrentFC4Types
     * <br>
     * An array of integers indicating the Fibre Channel FC-4 protocols currently running on the Adapter. A list of all protocols supported by the Adapter is indicated in the FC4TypesSupported property. The values used in this array are taken from the FC-GS2 (bitmapped) field defined in Table 11 of the standard. Also, FC-SB-2 codes are included from the T11 document, 236V0. If the FC4 Type is "Vendor Unique" (value=255), then the specific vendor values (in the range, 0xE0 to 0xFF) that are currently running should be listed in the CurrentFC4VendorTypes property.
     */

    private static CIMProperty setPropertyValue_CurrentFC4Types(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property CurrentFC4VendorTypes
     *     * <br>
     * When the CurrentFC4Types array contains the value 255 ("Vendor Unique"), then the property, CurrentFC4 VendorTypes, lists all the vendor specific protocols running on the Adapter. These values are in the range, 0xE0 to 0xFF.
     *     */

    public javax.cim.UnsignedInteger16[] get_CurrentFC4VendorTypes() {
        CIMProperty currentProperty = getProperty(PROPERTY_CURRENTFC4VENDORTYPES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CURRENTFC4VENDORTYPES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property CurrentFC4VendorTypes
     * <br>
     * When the CurrentFC4Types array contains the value 255 ("Vendor Unique"), then the property, CurrentFC4 VendorTypes, lists all the vendor specific protocols running on the Adapter. These values are in the range, 0xE0 to 0xFF.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CurrentFC4VendorTypes(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CURRENTFC4VENDORTYPES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CurrentFC4VendorTypes(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CURRENTFC4VENDORTYPES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CurrentFC4VendorTypes by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CurrentFC4VendorTypes(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CURRENTFC4VENDORTYPES.NAME);
        if (property != null) {
            property = setPropertyValue_CurrentFC4VendorTypes(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CURRENTFC4VENDORTYPES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CurrentFC4VendorTypes
     * <br>
     * When the CurrentFC4Types array contains the value 255 ("Vendor Unique"), then the property, CurrentFC4 VendorTypes, lists all the vendor specific protocols running on the Adapter. These values are in the range, 0xE0 to 0xFF.
     */

    private static CIMProperty setPropertyValue_CurrentFC4VendorTypes(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property EndCreditErrors
     *     * <br>
     * Number of times that the Device has been without an end credit for a time longer than ErrorDetectTimeout.
     *     */

    public javax.cim.UnsignedInteger64 get_EndCreditErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_ENDCREDITERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ENDCREDITERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property EndCreditErrors
     * <br>
     * Number of times that the Device has been without an end credit for a time longer than ErrorDetectTimeout.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_EndCreditErrors(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ENDCREDITERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_EndCreditErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ENDCREDITERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property EndCreditErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_EndCreditErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ENDCREDITERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_EndCreditErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ENDCREDITERRORS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property EndCreditErrors
     * <br>
     * Number of times that the Device has been without an end credit for a time longer than ErrorDetectTimeout.
     */

    private static CIMProperty setPropertyValue_EndCreditErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ErrorDetectTimeout
     *     * <br>
     * A 'short' timeout value (in milliseconds) for determining that an error has occurred. The default value is 10 seconds (10000 milliseconds).
     *     */

    public javax.cim.UnsignedInteger64 get_ErrorDetectTimeout() {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORDETECTTIMEOUT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ERRORDETECTTIMEOUT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ErrorDetectTimeout
     * <br>
     * A 'short' timeout value (in milliseconds) for determining that an error has occurred. The default value is 10 seconds (10000 milliseconds).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ErrorDetectTimeout(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ERRORDETECTTIMEOUT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ErrorDetectTimeout(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORDETECTTIMEOUT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ErrorDetectTimeout by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ErrorDetectTimeout(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ERRORDETECTTIMEOUT.NAME);
        if (property != null) {
            property = setPropertyValue_ErrorDetectTimeout(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ERRORDETECTTIMEOUT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ErrorDetectTimeout
     * <br>
     * A 'short' timeout value (in milliseconds) for determining that an error has occurred. The default value is 10 seconds (10000 milliseconds).
     */

    private static CIMProperty setPropertyValue_ErrorDetectTimeout(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property FC4TypesSupported
     *     * <br>
     * An array of integers indicating the Fibre Channel FC-4 protocols supported by the Adapter. The protocols that are active and running are indicated in the CurrentFC4Types property. The values used in this array are taken from the FC-GS2 (bitmapped) field defined in Table 11 of the standard. Also, FC-SB-2 codes are included from the T11 document, 236V0. If the FC4 Type is "Vendor Unique" (value=255), then the specific vendor values (in the range, 0xE0 to 0xFF) should be listed in the FC4VendorUniqueTypes property.
     *     */

    public javax.cim.UnsignedInteger16[] get_FC4TypesSupported() {
        CIMProperty currentProperty = getProperty(PROPERTY_FC4TYPESSUPPORTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FC4TYPESSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property FC4TypesSupported
     * <br>
     * An array of integers indicating the Fibre Channel FC-4 protocols supported by the Adapter. The protocols that are active and running are indicated in the CurrentFC4Types property. The values used in this array are taken from the FC-GS2 (bitmapped) field defined in Table 11 of the standard. Also, FC-SB-2 codes are included from the T11 document, 236V0. If the FC4 Type is "Vendor Unique" (value=255), then the specific vendor values (in the range, 0xE0 to 0xFF) should be listed in the FC4VendorUniqueTypes property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FC4TypesSupported(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FC4TYPESSUPPORTED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FC4TypesSupported(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FC4TYPESSUPPORTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FC4TypesSupported by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FC4TypesSupported(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FC4TYPESSUPPORTED.NAME);
        if (property != null) {
            property = setPropertyValue_FC4TypesSupported(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FC4TYPESSUPPORTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FC4TypesSupported
     * <br>
     * An array of integers indicating the Fibre Channel FC-4 protocols supported by the Adapter. The protocols that are active and running are indicated in the CurrentFC4Types property. The values used in this array are taken from the FC-GS2 (bitmapped) field defined in Table 11 of the standard. Also, FC-SB-2 codes are included from the T11 document, 236V0. If the FC4 Type is "Vendor Unique" (value=255), then the specific vendor values (in the range, 0xE0 to 0xFF) should be listed in the FC4VendorUniqueTypes property.
     */

    private static CIMProperty setPropertyValue_FC4TypesSupported(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property FC4VendorUniqueTypes
     *     * <br>
     * When the FC4TypesSupported array contains the value 255 ("Vendor Unique"), then the property, FC4Vendor UniqueTypes, lists of all the vendor specific protocols supported by the Adapter. These values are in the range, 0xE0 to 0xFF.
     *     */

    public javax.cim.UnsignedInteger16[] get_FC4VendorUniqueTypes() {
        CIMProperty currentProperty = getProperty(PROPERTY_FC4VENDORUNIQUETYPES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FC4VENDORUNIQUETYPES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property FC4VendorUniqueTypes
     * <br>
     * When the FC4TypesSupported array contains the value 255 ("Vendor Unique"), then the property, FC4Vendor UniqueTypes, lists of all the vendor specific protocols supported by the Adapter. These values are in the range, 0xE0 to 0xFF.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FC4VendorUniqueTypes(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FC4VENDORUNIQUETYPES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FC4VendorUniqueTypes(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FC4VENDORUNIQUETYPES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FC4VendorUniqueTypes by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FC4VendorUniqueTypes(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FC4VENDORUNIQUETYPES.NAME);
        if (property != null) {
            property = setPropertyValue_FC4VendorUniqueTypes(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FC4VENDORUNIQUETYPES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FC4VendorUniqueTypes
     * <br>
     * When the FC4TypesSupported array contains the value 255 ("Vendor Unique"), then the property, FC4Vendor UniqueTypes, lists of all the vendor specific protocols supported by the Adapter. These values are in the range, 0xE0 to 0xFF.
     */

    private static CIMProperty setPropertyValue_FC4VendorUniqueTypes(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property FrameTimeouts
     *     * <br>
     * Number of Class 1 or 2 frames that are not ACKed within the time indicated by ErrorDetectTimeout.
     *     */

    public javax.cim.UnsignedInteger64 get_FrameTimeouts() {
        CIMProperty currentProperty = getProperty(PROPERTY_FRAMETIMEOUTS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FRAMETIMEOUTS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property FrameTimeouts
     * <br>
     * Number of Class 1 or 2 frames that are not ACKed within the time indicated by ErrorDetectTimeout.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FrameTimeouts(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FRAMETIMEOUTS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FrameTimeouts(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FRAMETIMEOUTS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FrameTimeouts by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FrameTimeouts(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FRAMETIMEOUTS.NAME);
        if (property != null) {
            property = setPropertyValue_FrameTimeouts(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FRAMETIMEOUTS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FrameTimeouts
     * <br>
     * Number of Class 1 or 2 frames that are not ACKed within the time indicated by ErrorDetectTimeout.
     */

    private static CIMProperty setPropertyValue_FrameTimeouts(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property MaxFrameSize
     *     * <br>
     * The maximum frame size, in bytes, supported by the Adapter.
     *     */

    public javax.cim.UnsignedInteger64 get_MaxFrameSize() {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXFRAMESIZE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MAXFRAMESIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property MaxFrameSize
     * <br>
     * The maximum frame size, in bytes, supported by the Adapter.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MaxFrameSize(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXFRAMESIZE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MaxFrameSize(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MAXFRAMESIZE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MaxFrameSize by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MaxFrameSize(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MAXFRAMESIZE.NAME);
        if (property != null) {
            property = setPropertyValue_MaxFrameSize(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MAXFRAMESIZE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MaxFrameSize
     * <br>
     * The maximum frame size, in bytes, supported by the Adapter.
     */

    private static CIMProperty setPropertyValue_MaxFrameSize(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OutOfOrderFramesReceived
     *     * <br>
     * Number of frames received out of order.
     *     */

    public javax.cim.UnsignedInteger64 get_OutOfOrderFramesReceived() {
        CIMProperty currentProperty = getProperty(PROPERTY_OUTOFORDERFRAMESRECEIVED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OUTOFORDERFRAMESRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property OutOfOrderFramesReceived
     * <br>
     * Number of frames received out of order.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OutOfOrderFramesReceived(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OUTOFORDERFRAMESRECEIVED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OutOfOrderFramesReceived(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OUTOFORDERFRAMESRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OutOfOrderFramesReceived by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OutOfOrderFramesReceived(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OUTOFORDERFRAMESRECEIVED.NAME);
        if (property != null) {
            property = setPropertyValue_OutOfOrderFramesReceived(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OUTOFORDERFRAMESRECEIVED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OutOfOrderFramesReceived
     * <br>
     * Number of frames received out of order.
     */

    private static CIMProperty setPropertyValue_OutOfOrderFramesReceived(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ParityErrors
     *     * <br>
     * Number of parity errors detected somewhere in the data path.
     *     */

    public javax.cim.UnsignedInteger64 get_ParityErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_PARITYERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PARITYERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ParityErrors
     * <br>
     * Number of parity errors detected somewhere in the data path.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ParityErrors(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PARITYERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ParityErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PARITYERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ParityErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ParityErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PARITYERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_ParityErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PARITYERRORS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ParityErrors
     * <br>
     * Number of parity errors detected somewhere in the data path.
     */

    private static CIMProperty setPropertyValue_ParityErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ReceiveBufferErrors
     *     * <br>
     * The number of times that a frame was received but no buffer was available.
     *     */

    public javax.cim.UnsignedInteger64 get_ReceiveBufferErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_RECEIVEBUFFERERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RECEIVEBUFFERERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ReceiveBufferErrors
     * <br>
     * The number of times that a frame was received but no buffer was available.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ReceiveBufferErrors(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RECEIVEBUFFERERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ReceiveBufferErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RECEIVEBUFFERERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ReceiveBufferErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ReceiveBufferErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RECEIVEBUFFERERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_ReceiveBufferErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RECEIVEBUFFERERRORS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ReceiveBufferErrors
     * <br>
     * The number of times that a frame was received but no buffer was available.
     */

    private static CIMProperty setPropertyValue_ReceiveBufferErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ReceiveEndErrors
     *     * <br>
     * The number of times that a frame was received but no end-to-end credit was available.
     *     */

    public javax.cim.UnsignedInteger64 get_ReceiveEndErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_RECEIVEENDERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RECEIVEENDERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ReceiveEndErrors
     * <br>
     * The number of times that a frame was received but no end-to-end credit was available.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ReceiveEndErrors(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RECEIVEENDERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ReceiveEndErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RECEIVEENDERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ReceiveEndErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ReceiveEndErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RECEIVEENDERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_ReceiveEndErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RECEIVEENDERRORS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ReceiveEndErrors
     * <br>
     * The number of times that a frame was received but no end-to-end credit was available.
     */

    private static CIMProperty setPropertyValue_ReceiveEndErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ResourceAllocationTimeout
     *     * <br>
     * A 'long' timeout value (in milliseconds) for determining when to reinstate a Recovery_Qualifier. The default value is 120 seconds (120000 milliseconds). It is typically set to the ErrorDetectTimeout value + 2*(fabric delay time).
     *     */

    public javax.cim.UnsignedInteger64 get_ResourceAllocationTimeout() {
        CIMProperty currentProperty = getProperty(PROPERTY_RESOURCEALLOCATIONTIMEOUT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RESOURCEALLOCATIONTIMEOUT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property ResourceAllocationTimeout
     * <br>
     * A 'long' timeout value (in milliseconds) for determining when to reinstate a Recovery_Qualifier. The default value is 120 seconds (120000 milliseconds). It is typically set to the ErrorDetectTimeout value + 2*(fabric delay time).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ResourceAllocationTimeout(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RESOURCEALLOCATIONTIMEOUT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ResourceAllocationTimeout(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RESOURCEALLOCATIONTIMEOUT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ResourceAllocationTimeout by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ResourceAllocationTimeout(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RESOURCEALLOCATIONTIMEOUT.NAME);
        if (property != null) {
            property = setPropertyValue_ResourceAllocationTimeout(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RESOURCEALLOCATIONTIMEOUT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ResourceAllocationTimeout
     * <br>
     * A 'long' timeout value (in milliseconds) for determining when to reinstate a Recovery_Qualifier. The default value is 120 seconds (120000 milliseconds). It is typically set to the ErrorDetectTimeout value + 2*(fabric delay time).
     */

    private static CIMProperty setPropertyValue_ResourceAllocationTimeout(
            CIMProperty currentProperty, javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SupportedCOS
     *     * <br>
     * The Fibre Channel Classes of Service that are supported by the Adapter, on its Ports. The currently negotiated COS for a connection is a property (NegotiatedCOS) on the FibrePort ActiveLogin association.
     *     */

    public javax.cim.UnsignedInteger16[] get_SupportedCOS() {
        CIMProperty currentProperty = getProperty(PROPERTY_SUPPORTEDCOS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SUPPORTEDCOS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property SupportedCOS
     * <br>
     * The Fibre Channel Classes of Service that are supported by the Adapter, on its Ports. The currently negotiated COS for a connection is a property (NegotiatedCOS) on the FibrePort ActiveLogin association.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SupportedCOS(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SUPPORTEDCOS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SupportedCOS(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SUPPORTEDCOS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SupportedCOS by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SupportedCOS(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_FibreChannelAdapter fco = new CIM_FibreChannelAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SUPPORTEDCOS.NAME);
        if (property != null) {
            property = setPropertyValue_SupportedCOS(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SUPPORTEDCOS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SupportedCOS
     * <br>
     * The Fibre Channel Classes of Service that are supported by the Adapter, on its Ports. The currently negotiated COS for a connection is a property (NegotiatedCOS) on the FibrePort ActiveLogin association.
     */

    private static CIMProperty setPropertyValue_SupportedCOS(CIMProperty currentProperty,
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

    /**
     * Get the list with CIM_FibrePort objects associated by the association CIM_FibrePortOnFCAdapter
     * 
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_FibrePort_CIM_FibrePortOnFCAdapters(WBEMClient cimClient)
            throws WbemsmtException {

        return getAssociated_CIM_FibrePort_CIM_FibrePortOnFCAdapters(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER, CIM_FibrePort.CIM_CLASS_NAME,
                null, null, false, false, null);

    }

    /**
     * Get the list with CIM_FibrePort objects associated by the association CIM_FibrePortOnFCAdapter
     * 
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_FibrePort_CIM_FibrePortOnFCAdapters(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_FibrePort_CIM_FibrePortOnFCAdapters(cimClient,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER, resultClass, role, resultRole,
                false, false, null);

    }

    /**
     * Get the list with CIM_FibrePort objects associated by the association CIM_FibrePortOnFCAdapter
     * 
     * @param cimClient the WBEMClient for the communication
     * @param associationClass This string MUST either contain a valid CIM Association class name or be null. It filters the Objects returned to contain only Objects associated to the source Object via this CIM Association class or one of its subclasses.
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#associators(CIMObjectPath, String, String, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociated_CIM_FibrePort_CIM_FibrePortOnFCAdapters(
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
                CIM_FibreChannelAdapterHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_FibreChannelAdapterHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_FibreChannelAdapterHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_FibrePort(cimInstance));
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
                        result.add(new CIM_FibrePort(cimInstance));
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
                        result.add(new CIM_FibrePort(cimInstance));
                        continue;
                    }
                }
            }
            CIM_FibreChannelAdapterHelper.checkException(enumeration);
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
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_FibrePortOnFCAdapter
     * @param cimClient the WBEMClient for the communication
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_FibrePort_CIM_FibrePortOnFCAdapterNames(
            WBEMClient cimClient) throws WbemsmtException {

        return getAssociated_CIM_FibrePort_CIM_FibrePortOnFCAdapterNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER, CIM_FibrePort.CIM_CLASS_NAME,
                null, null);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_FibrePortOnFCAdapter
     * @param cimClient the WBEMClient for the communication
     * @param resultClass This string MUST either contain a valid CIM Class name or be null. It filters the Objects returned to contain only the Objects of this Class name or one of its subclasses. The resultClass should be CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER or a subclass 
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the source Object plays the specified role. (i.e. the Property name in the Association class that refers to the source Object matches this value) If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are examined.
     * @param resultRole This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects associated to the source Object via an Association class in which the Object returned plays the specified role. (i.e. the Property name in the Association class that refers to the Object returned matches this value) If "Dependent" is specified, then only Associations in which the Object returned is the "Dependent" reference are examined. 
     *
     * uses CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER as associationClass<br>
     * uses false for includeQualifiers and includeClassOrigin <br>
     * uses null for resultClass, role, resultRole<br>
     * <br>
     
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_FibrePort_CIM_FibrePortOnFCAdapterNames(
            WBEMClient cimClient, String resultClass, String role, String resultRole)
            throws WbemsmtException {

        return getAssociated_CIM_FibrePort_CIM_FibrePortOnFCAdapterNames(cimClient, true,
                CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER, resultClass, role, resultRole);
    }

    /**
     * Get the list of CIMObjectPath items of the objects associated by the association CIM_FibrePortOnFCAdapter
     * @param cimClient the WBEMClient for the communication
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#associatorNames(CIMObjectPath, String, String, String, String)
     **/

    public java.util.List getAssociated_CIM_FibrePort_CIM_FibrePortOnFCAdapterNames(
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
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER,
                    CIM_FibrePort.CIM_CLASS_NAME, null, null));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_FibreChannelAdapterHelper.checkException(enumeration);

                Object obj = enumeration.next();
                CIM_FibreChannelAdapterHelper.checkException(enumeration);
                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_FibrePort.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_FibreChannelAdapterHelper.checkException(enumeration);
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
     * Get the list with CIM_FibrePortOnFCAdapter associations
     *
     * @param cimClient the WBEMClient for the communication
     * @param includeQualifiers If true, all Qualifiers for each Object (including Qualifiers on the Object and on any returned Properties) MUST be included in the Objects returned. If false, no Qualifiers are present in each Object returned.
     * @param includeClassOrigin If true, the CLASSORIGIN attribute will be present on all appropriate elements in the Objects returned. If false, no CLASSORIGIN attributes are present in the Objects returned. CLASSORIGIN is attached to an element (properties, methods, references) to indicate the class in which it was first defined.
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param propertyList An array of property names used to filter what is contained in the Objects returned. Each CIMClass or CIMInstance returned only contains elements for the properties of the names specified. Duplicate and invalid property names are ignored and the request is otherwise processed normally. An empty array indicates that no properties should be included in the Objects returned. A null value indicates that all properties should be contained in the Objects returned. NOTE: Properties should not be specified in this parameter unless a non-null value is specified in the resultClass  parameter.
     *
     * @see javax.wbem.client.WBEMClient#references(CIMObjectPath, String, String, boolean, boolean, String[])
     **/

    public java.util.List getAssociations_CIM_FibrePortOnFCAdapter(WBEMClient cimClient,
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
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER, role, includeQualifiers,
                    includeClassOrigin, propertyList);
        }
        catch (WBEMException e) {
            throw new ReferencesException(e, new ReferencesUserObject(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER, role, includeQualifiers,
                    includeClassOrigin, propertyList));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_FibreChannelAdapterHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_FibreChannelAdapterHelper.checkException(enumeration);

                if (obj instanceof CIMInstance) {
                    CIMInstance cimInstance = (CIMInstance) obj;
                    Class clazz = CIM_FibrePortOnFCAdapterHelper.findClass(cimClient, cimInstance);

                    if (clazz == null) {
                        System.err.println("The class " + cimInstance.getClassName()
                                + " was not found. Constructing instance of the base class.");
                        result.add(new CIM_FibrePortOnFCAdapter(cimInstance));
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
                        result.add(new CIM_FibrePortOnFCAdapter(cimInstance));
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
                        result.add(new CIM_FibrePortOnFCAdapter(cimInstance));
                        continue;
                    }
                }
            }
            CIM_FibreChannelAdapterHelper.checkException(enumeration);
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
     * Get a list of CIMObjectPath items of the associations CIM_FibrePortOnFCAdapter
     *
     * @param cimClient the WBEMClient for the communication
     * @param role This string MUST either contain a valid Property name or be null. It filters the Objects returned to contain only Objects referring to the source Object via a Property with the specified name. If "Antecedent" is specified, then only Associations in which the source Object is the "Antecedent" reference are returned.
     * @param deep if true the subclasses returned also
     *
     * @see javax.wbem.client.WBEMClient#referenceNames(CIMObjectPath, String, String)
     **/

    public java.util.List getAssociationNames_CIM_FibrePortOnFCAdapter(WBEMClient cimClient,
            String role, boolean deep) throws WbemsmtException {

        if (cimClient == null) {
            throw new WbemsmtException(WbemsmtException.ERR_INVALID_PARAMETER,
                    "The cimClient parameter does not contain a valid reference.");
        }

        java.util.List result = new java.util.ArrayList();
        CloseableIterator enumeration = null;

        try {
            enumeration = cimClient.referenceNames(this.getCimObjectPath(),
                    CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER, role);
        }
        catch (WBEMException e) {
            throw new ReferenceNamesException(e, new ReferenceNamesUserObject(this
                    .getCimObjectPath(), CIM_ASSOCIATOR_CLASS_NAME_CIM_FIBREPORTONFCADAPTER, role));
        }

        try {
            while (enumeration.hasNext()) {
                CIM_FibreChannelAdapterHelper.checkException(enumeration);
                Object obj = enumeration.next();
                CIM_FibreChannelAdapterHelper.checkException(enumeration);

                if (obj instanceof CIMObjectPath) {
                    if (deep
                            || ((CIMObjectPath) obj).getObjectName().equals(
                                    CIM_FibrePortOnFCAdapter.CIM_CLASS_NAME)) {
                        result.add(obj);
                    }
                }
            }
            CIM_FibreChannelAdapterHelper.checkException(enumeration);
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
        return CIM_FibreChannelAdapter.CIM_CLASS_NAME;
    }

}