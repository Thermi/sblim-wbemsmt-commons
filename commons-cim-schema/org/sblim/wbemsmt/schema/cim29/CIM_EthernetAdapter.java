/** 
 * CIM_EthernetAdapter.java
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
 * Description: The use of the CIM_EthernetAdapter class has been deprecated, consistent with NetworkAdapter. Instead use the CIM_ EthernetPort class. This class describes the capabilities and management aspects of an EthernetAdapter.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_EthernetAdapter extends CIM_NetworkAdapter {

    public final static String CIM_CLASS_NAME = "CIM_EthernetAdapter";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property AlignmentErrors
     * A count of frames received on a particular interface that are not an integral number of octets in length and do not pass the FCS check. The count represented by an instance of this object is incremented when the alignment Error status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error conditions obtain are, according to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status presented to the LLC.
     */
    public static class PROPERTY_ALIGNMENTERRORS {
        /**
         * name of the property AlignmentErrors
         */
        public final static String NAME = "AlignmentErrors";

    }

    /**
     * Constants of property Capabilities
     * Capabilities of the EthernetAdapter. For example, the Device may support AlertOnLan, WakeOnLan, Load Balancing and/or FailOver. If failover or load balancing capabilities are listed, a SpareGroup (failover) or ExtraCapacityGroup (load balancing) should also be defined to completely describe the capability.
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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_AlertOnLan = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry AlertOnLan (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_AlertOnLan = "AlertOnLan";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_WakeOnLan = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry WakeOnLan (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_WakeOnLan = "WakeOnLan";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_FailOver = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry FailOver (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_FailOver = "FailOver";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_LoadBalancing = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry LoadBalancing (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_LoadBalancing = "LoadBalancing";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@4a304a30
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_AlertOnLan.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_AlertOnLan;
            }

            if (VALUE_ENTRY_WakeOnLan.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_WakeOnLan;
            }

            if (VALUE_ENTRY_FailOver.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_FailOver;
            }

            if (VALUE_ENTRY_LoadBalancing.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_LoadBalancing;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_AlertOnLan.intValue()) {
                return VALUE_ENTRY_AlertOnLan;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_WakeOnLan.intValue()) {
                return VALUE_ENTRY_WakeOnLan;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_FailOver.intValue()) {
                return VALUE_ENTRY_FailOver;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_LoadBalancing.intValue()) {
                return VALUE_ENTRY_LoadBalancing;
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
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_AlertOnLan,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_WakeOnLan,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_FailOver,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_LoadBalancing };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property Capabilities   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_AlertOnLan, VALUE_ENTRY_WakeOnLan, VALUE_ENTRY_FailOver,
                VALUE_ENTRY_LoadBalancing };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property Capabilities   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_AlertOnLan, VALUE_ENTRY_WakeOnLan,
                VALUE_ENTRY_FailOver, VALUE_ENTRY_LoadBalancing };

    }

    /**
     * Constants of property CapabilityDescriptions
     * An array of free-form strings providing more detailed explanations for any of the EthernetAdapter features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
     */
    public static class PROPERTY_CAPABILITYDESCRIPTIONS {
        /**
         * name of the property CapabilityDescriptions
         */
        public final static String NAME = "CapabilityDescriptions";

    }

    /**
     * Constants of property CarrierSenseErrors
     * The number of times that the carrier sense condition was lost or never asserted when attempting to transmit a frame on a particular interface. The count represented by an instance of this object is incremented at most once per transmission attempt, even if the carrier sense condition fluctuates during a transmission attempt.
     */
    public static class PROPERTY_CARRIERSENSEERRORS {
        /**
         * name of the property CarrierSenseErrors
         */
        public final static String NAME = "CarrierSenseErrors";

    }

    /**
     * Constants of property DeferredTransmissions
     * A count of frames for which the first transmission attempt on a particular interface is delayed because the medium is busy. The count represented by an instance of this object does not include frames involved in collisions.
     */
    public static class PROPERTY_DEFERREDTRANSMISSIONS {
        /**
         * name of the property DeferredTransmissions
         */
        public final static String NAME = "DeferredTransmissions";

    }

    /**
     * Constants of property EnabledCapabilities
     * Specifies which capabilities are enabled from the list of all supported ones, defined in the Capabilities array.
     */
    public static class PROPERTY_ENABLEDCAPABILITIES {
        /**
         * name of the property EnabledCapabilities
         */
        public final static String NAME = "EnabledCapabilities";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_AlertOnLan = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry AlertOnLan (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_AlertOnLan = "AlertOnLan";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_WakeOnLan = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry WakeOnLan (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_WakeOnLan = "WakeOnLan";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_FailOver = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry FailOver (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_FailOver = "FailOver";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_LoadBalancing = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry LoadBalancing (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_LoadBalancing = "LoadBalancing";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@8fe08fe
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_AlertOnLan.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_AlertOnLan;
            }

            if (VALUE_ENTRY_WakeOnLan.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_WakeOnLan;
            }

            if (VALUE_ENTRY_FailOver.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_FailOver;
            }

            if (VALUE_ENTRY_LoadBalancing.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_LoadBalancing;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_AlertOnLan.intValue()) {
                return VALUE_ENTRY_AlertOnLan;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_WakeOnLan.intValue()) {
                return VALUE_ENTRY_WakeOnLan;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_FailOver.intValue()) {
                return VALUE_ENTRY_FailOver;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_LoadBalancing.intValue()) {
                return VALUE_ENTRY_LoadBalancing;
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
         * Value Map for the property EnabledCapabilities   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_AlertOnLan,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_WakeOnLan,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_FailOver,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_LoadBalancing };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property EnabledCapabilities   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_AlertOnLan, VALUE_ENTRY_WakeOnLan, VALUE_ENTRY_FailOver,
                VALUE_ENTRY_LoadBalancing };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property EnabledCapabilities   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_AlertOnLan, VALUE_ENTRY_WakeOnLan,
                VALUE_ENTRY_FailOver, VALUE_ENTRY_LoadBalancing };

    }

    /**
     * Constants of property ExcessiveCollisions
     * A count of frames for which transmission on a particular interface fails due to excessive collisions.
     */
    public static class PROPERTY_EXCESSIVECOLLISIONS {
        /**
         * name of the property ExcessiveCollisions
         */
        public final static String NAME = "ExcessiveCollisions";

    }

    /**
     * Constants of property FCSErrors
     * A count of frames received on a particular interface that are an integral number of octets in length but do not pass the FCS check. The count represented by an instance of this object is incremented when the frame CheckError status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error conditions obtain are, according to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status presented to the LLC.
     */
    public static class PROPERTY_FCSERRORS {
        /**
         * name of the property FCSErrors
         */
        public final static String NAME = "FCSErrors";

    }

    /**
     * Constants of property FrameTooLongs
     * A count of frames received on a particular interface that exceed the maximum permitted frame size. The count represented by an instance of this object is incremented when the FrameTooLong status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error conditions obtain are, according to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status presented to the LLC.
     */
    public static class PROPERTY_FRAMETOOLONGS {
        /**
         * name of the property FrameTooLongs
         */
        public final static String NAME = "FrameTooLongs";

    }

    /**
     * Constants of property InternalMACReceiveErrors
     * A count of frames for which reception on a particular interface fails due to an internal MAC sublayer receive error. A frame is only counted by an instance of this object if it is not counted by the corresponding instance of either the FrameTooLongs property, the AlignmentErrors property, or the FCSErrors property. The precise meaning of the count represented by an instance of this object is implementation-specific. In particular, an instance of this object may represent a count of receive errors on a particular interface that are not otherwise counted.
     */
    public static class PROPERTY_INTERNALMACRECEIVEERRORS {
        /**
         * name of the property InternalMACReceiveErrors
         */
        public final static String NAME = "InternalMACReceiveErrors";

    }

    /**
     * Constants of property InternalMACTransmitErrors
     * A count of frames for which transmission on a particular interface fails due to an internal MAC sublayer transmit error. A frame is only counted by an instance of this object if it is not counted by the corresponding instance of either the LateCollisions property, the Excessive Collisions property, or the CarrierSenseErrors property. The precise meaning of the count represented by an instance of this object is implementation-specific. In particular, an instance of this object may represent a count of transmission errors on a particular interface that are not otherwise counted.
     */
    public static class PROPERTY_INTERNALMACTRANSMITERRORS {
        /**
         * name of the property InternalMACTransmitErrors
         */
        public final static String NAME = "InternalMACTransmitErrors";

    }

    /**
     * Constants of property LateCollisions
     * The number of times that a collision is detected on a particular interface later than 512 bit-times into the transmission of a packet. Five hundred and twelve bit- times corresponds to 51.2 microseconds on a 10 Mbit/s system. A (late) collision included in a count represented by an instance of this object is also considered as a (generic) collision for purposes of other collision-related statistics.
     */
    public static class PROPERTY_LATECOLLISIONS {
        /**
         * name of the property LateCollisions
         */
        public final static String NAME = "LateCollisions";

    }

    /**
     * Constants of property MaxDataSize
     * The maximum size of the INFO (non-MAC) field that will be received or transmitted.
     */
    public static class PROPERTY_MAXDATASIZE {
        /**
         * name of the property MaxDataSize
         */
        public final static String NAME = "MaxDataSize";

    }

    /**
     * Constants of property MultipleCollisionFrames
     * A count of successfully transmitted frames on a particular interface for which transmission is inhibited by more than one collision. A frame that is counted by an instance of this object is not counted by the corresponding instance of the SingleCollisionFrames property.
     */
    public static class PROPERTY_MULTIPLECOLLISIONFRAMES {
        /**
         * name of the property MultipleCollisionFrames
         */
        public final static String NAME = "MultipleCollisionFrames";

    }

    /**
     * Constants of property NetworkAddresses
     * Ethernet/802.3 MAC addresses formatted as twelve hexadecimal digits (e.g. "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order. (Thus, the Group address bit is found in the low order bit of the first character of the string.)
     */
    public static class PROPERTY_NETWORKADDRESSES {
        /**
         * name of the property NetworkAddresses
         */
        public final static String NAME = "NetworkAddresses";

    }

    /**
     * Constants of property SQETestErrors
     * A count of times that the SQE TEST ERROR message is generated by the PLS sublayer for a particular interface. The SQE TEST ERROR message is defined in section 7.2.2.2.4 of ANSI/IEEE 802.3-1985 and its generation is described in section 7.2.4.6 of the same document.
     */
    public static class PROPERTY_SQETESTERRORS {
        /**
         * name of the property SQETestErrors
         */
        public final static String NAME = "SQETestErrors";

    }

    /**
     * Constants of property SingleCollisionFrames
     * A count of successfully transmitted frames on a particular interface for which transmission is inhibited by exactly one collision. A frame that is counted by an instance of this object is not counted by the corresponding instance of the MultipleCollisionFrames property.
     */
    public static class PROPERTY_SINGLECOLLISIONFRAMES {
        /**
         * name of the property SingleCollisionFrames
         */
        public final static String NAME = "SingleCollisionFrames";

    }

    /**
     * Constants of property SymbolErrors
     * The number of times there was an invalid data symbol when a valid carrier was present. The count is incremented at most once per carrier event, even if multiple symbol errors occur during the carrier event.
     */
    public static class PROPERTY_SYMBOLERRORS {
        /**
         * name of the property SymbolErrors
         */
        public final static String NAME = "SymbolErrors";

    }

    /**
     * Constants of property TotalPacketsReceived
     * The total number of packets received.
     */
    public static class PROPERTY_TOTALPACKETSRECEIVED {
        /**
         * name of the property TotalPacketsReceived
         */
        public final static String NAME = "TotalPacketsReceived";

    }

    /**
     * Constants of property TotalPacketsTransmitted
     * The total number of packets transmitted.
     */
    public static class PROPERTY_TOTALPACKETSTRANSMITTED {
        /**
         * name of the property TotalPacketsTransmitted
         */
        public final static String NAME = "TotalPacketsTransmitted";

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
     *   The use of the CIM_EthernetAdapter class has been deprecated, consistent with NetworkAdapter. Instead use the CIM_ EthernetPort class. This class describes the capabilities and management aspects of an EthernetAdapter.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_EthernetAdapter(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The use of the CIM_EthernetAdapter class has been deprecated, consistent with NetworkAdapter. Instead use the CIM_ EthernetPort class. This class describes the capabilities and management aspects of an EthernetAdapter.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_EthernetAdapter(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_EthernetAdapter() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("AlignmentErrors", new CIMProperty("AlignmentErrors",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("Capabilities", new CIMProperty("Capabilities",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("CapabilityDescriptions", new CIMProperty("CapabilityDescriptions",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("CarrierSenseErrors", new CIMProperty("CarrierSenseErrors",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("DeferredTransmissions", new CIMProperty("DeferredTransmissions",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("EnabledCapabilities", new CIMProperty("EnabledCapabilities",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("ExcessiveCollisions", new CIMProperty("ExcessiveCollisions",
                CIMDataType.UINT32_T, null));
        propertiesToCheck
                .put("FCSErrors", new CIMProperty("FCSErrors", CIMDataType.UINT32_T, null));
        propertiesToCheck.put("FrameTooLongs", new CIMProperty("FrameTooLongs",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("InternalMACReceiveErrors", new CIMProperty(
                "InternalMACReceiveErrors", CIMDataType.UINT32_T, null));
        propertiesToCheck.put("InternalMACTransmitErrors", new CIMProperty(
                "InternalMACTransmitErrors", CIMDataType.UINT32_T, null));
        propertiesToCheck.put("LateCollisions", new CIMProperty("LateCollisions",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("MaxDataSize", new CIMProperty("MaxDataSize", CIMDataType.UINT32_T,
                null));
        propertiesToCheck.put("MultipleCollisionFrames", new CIMProperty("MultipleCollisionFrames",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("NetworkAddresses", new CIMProperty("NetworkAddresses",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("SQETestErrors", new CIMProperty("SQETestErrors",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("SingleCollisionFrames", new CIMProperty("SingleCollisionFrames",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("SymbolErrors", new CIMProperty("SymbolErrors", CIMDataType.UINT32_T,
                null));
        propertiesToCheck.put("TotalPacketsReceived", new CIMProperty("TotalPacketsReceived",
                CIMDataType.UINT64_T, null));
        propertiesToCheck.put("TotalPacketsTransmitted", new CIMProperty("TotalPacketsTransmitted",
                CIMDataType.UINT64_T, null));

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
     * Get the property AlignmentErrors
     *     * <br>
     * A count of frames received on a particular interface that are not an integral number of octets in length and do not pass the FCS check. The count represented by an instance of this object is incremented when the alignment Error status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error conditions obtain are, according to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status presented to the LLC.
     *     */

    public javax.cim.UnsignedInteger32 get_AlignmentErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_ALIGNMENTERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ALIGNMENTERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property AlignmentErrors
     * <br>
     * A count of frames received on a particular interface that are not an integral number of octets in length and do not pass the FCS check. The count represented by an instance of this object is incremented when the alignment Error status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error conditions obtain are, according to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status presented to the LLC.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AlignmentErrors(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ALIGNMENTERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_AlignmentErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ALIGNMENTERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AlignmentErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AlignmentErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_EthernetAdapter fco = new CIM_EthernetAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ALIGNMENTERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_AlignmentErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ALIGNMENTERRORS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AlignmentErrors
     * <br>
     * A count of frames received on a particular interface that are not an integral number of octets in length and do not pass the FCS check. The count represented by an instance of this object is incremented when the alignment Error status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error conditions obtain are, according to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status presented to the LLC.
     */

    private static CIMProperty setPropertyValue_AlignmentErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
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
     * Capabilities of the EthernetAdapter. For example, the Device may support AlertOnLan, WakeOnLan, Load Balancing and/or FailOver. If failover or load balancing capabilities are listed, a SpareGroup (failover) or ExtraCapacityGroup (load balancing) should also be defined to completely describe the capability.
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
     * Capabilities of the EthernetAdapter. For example, the Device may support AlertOnLan, WakeOnLan, Load Balancing and/or FailOver. If failover or load balancing capabilities are listed, a SpareGroup (failover) or ExtraCapacityGroup (load balancing) should also be defined to completely describe the capability.
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
        CIM_EthernetAdapter fco = new CIM_EthernetAdapter(client, namespace);
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
     * Capabilities of the EthernetAdapter. For example, the Device may support AlertOnLan, WakeOnLan, Load Balancing and/or FailOver. If failover or load balancing capabilities are listed, a SpareGroup (failover) or ExtraCapacityGroup (load balancing) should also be defined to completely describe the capability.
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
     * An array of free-form strings providing more detailed explanations for any of the EthernetAdapter features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
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
     * An array of free-form strings providing more detailed explanations for any of the EthernetAdapter features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
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
        CIM_EthernetAdapter fco = new CIM_EthernetAdapter(client, namespace);
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
     * An array of free-form strings providing more detailed explanations for any of the EthernetAdapter features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
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
     * Get the property CarrierSenseErrors
     *     * <br>
     * The number of times that the carrier sense condition was lost or never asserted when attempting to transmit a frame on a particular interface. The count represented by an instance of this object is incremented at most once per transmission attempt, even if the carrier sense condition fluctuates during a transmission attempt.
     *     */

    public javax.cim.UnsignedInteger32 get_CarrierSenseErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_CARRIERSENSEERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_CARRIERSENSEERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property CarrierSenseErrors
     * <br>
     * The number of times that the carrier sense condition was lost or never asserted when attempting to transmit a frame on a particular interface. The count represented by an instance of this object is incremented at most once per transmission attempt, even if the carrier sense condition fluctuates during a transmission attempt.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_CarrierSenseErrors(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_CARRIERSENSEERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_CarrierSenseErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_CARRIERSENSEERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property CarrierSenseErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_CarrierSenseErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_EthernetAdapter fco = new CIM_EthernetAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_CARRIERSENSEERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_CarrierSenseErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_CARRIERSENSEERRORS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property CarrierSenseErrors
     * <br>
     * The number of times that the carrier sense condition was lost or never asserted when attempting to transmit a frame on a particular interface. The count represented by an instance of this object is incremented at most once per transmission attempt, even if the carrier sense condition fluctuates during a transmission attempt.
     */

    private static CIMProperty setPropertyValue_CarrierSenseErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property DeferredTransmissions
     *     * <br>
     * A count of frames for which the first transmission attempt on a particular interface is delayed because the medium is busy. The count represented by an instance of this object does not include frames involved in collisions.
     *     */

    public javax.cim.UnsignedInteger32 get_DeferredTransmissions() {
        CIMProperty currentProperty = getProperty(PROPERTY_DEFERREDTRANSMISSIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DEFERREDTRANSMISSIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property DeferredTransmissions
     * <br>
     * A count of frames for which the first transmission attempt on a particular interface is delayed because the medium is busy. The count represented by an instance of this object does not include frames involved in collisions.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_DeferredTransmissions(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DEFERREDTRANSMISSIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_DeferredTransmissions(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DEFERREDTRANSMISSIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property DeferredTransmissions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_DeferredTransmissions(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_EthernetAdapter fco = new CIM_EthernetAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DEFERREDTRANSMISSIONS.NAME);
        if (property != null) {
            property = setPropertyValue_DeferredTransmissions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DEFERREDTRANSMISSIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property DeferredTransmissions
     * <br>
     * A count of frames for which the first transmission attempt on a particular interface is delayed because the medium is busy. The count represented by an instance of this object does not include frames involved in collisions.
     */

    private static CIMProperty setPropertyValue_DeferredTransmissions(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property EnabledCapabilities
     *     * <br>
     * Specifies which capabilities are enabled from the list of all supported ones, defined in the Capabilities array.
     *     */

    public javax.cim.UnsignedInteger16[] get_EnabledCapabilities() {
        CIMProperty currentProperty = getProperty(PROPERTY_ENABLEDCAPABILITIES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ENABLEDCAPABILITIES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property EnabledCapabilities
     * <br>
     * Specifies which capabilities are enabled from the list of all supported ones, defined in the Capabilities array.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_EnabledCapabilities(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ENABLEDCAPABILITIES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_EnabledCapabilities(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ENABLEDCAPABILITIES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property EnabledCapabilities by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_EnabledCapabilities(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_EthernetAdapter fco = new CIM_EthernetAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ENABLEDCAPABILITIES.NAME);
        if (property != null) {
            property = setPropertyValue_EnabledCapabilities(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ENABLEDCAPABILITIES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property EnabledCapabilities
     * <br>
     * Specifies which capabilities are enabled from the list of all supported ones, defined in the Capabilities array.
     */

    private static CIMProperty setPropertyValue_EnabledCapabilities(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ExcessiveCollisions
     *     * <br>
     * A count of frames for which transmission on a particular interface fails due to excessive collisions.
     *     */

    public javax.cim.UnsignedInteger32 get_ExcessiveCollisions() {
        CIMProperty currentProperty = getProperty(PROPERTY_EXCESSIVECOLLISIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_EXCESSIVECOLLISIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property ExcessiveCollisions
     * <br>
     * A count of frames for which transmission on a particular interface fails due to excessive collisions.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ExcessiveCollisions(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_EXCESSIVECOLLISIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ExcessiveCollisions(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_EXCESSIVECOLLISIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ExcessiveCollisions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ExcessiveCollisions(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_EthernetAdapter fco = new CIM_EthernetAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_EXCESSIVECOLLISIONS.NAME);
        if (property != null) {
            property = setPropertyValue_ExcessiveCollisions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_EXCESSIVECOLLISIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ExcessiveCollisions
     * <br>
     * A count of frames for which transmission on a particular interface fails due to excessive collisions.
     */

    private static CIMProperty setPropertyValue_ExcessiveCollisions(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property FCSErrors
     *     * <br>
     * A count of frames received on a particular interface that are an integral number of octets in length but do not pass the FCS check. The count represented by an instance of this object is incremented when the frame CheckError status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error conditions obtain are, according to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status presented to the LLC.
     *     */

    public javax.cim.UnsignedInteger32 get_FCSErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_FCSERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FCSERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property FCSErrors
     * <br>
     * A count of frames received on a particular interface that are an integral number of octets in length but do not pass the FCS check. The count represented by an instance of this object is incremented when the frame CheckError status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error conditions obtain are, according to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status presented to the LLC.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FCSErrors(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FCSERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FCSErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FCSERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FCSErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FCSErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_EthernetAdapter fco = new CIM_EthernetAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FCSERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_FCSErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FCSERRORS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FCSErrors
     * <br>
     * A count of frames received on a particular interface that are an integral number of octets in length but do not pass the FCS check. The count represented by an instance of this object is incremented when the frame CheckError status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error conditions obtain are, according to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status presented to the LLC.
     */

    private static CIMProperty setPropertyValue_FCSErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property FrameTooLongs
     *     * <br>
     * A count of frames received on a particular interface that exceed the maximum permitted frame size. The count represented by an instance of this object is incremented when the FrameTooLong status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error conditions obtain are, according to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status presented to the LLC.
     *     */

    public javax.cim.UnsignedInteger32 get_FrameTooLongs() {
        CIMProperty currentProperty = getProperty(PROPERTY_FRAMETOOLONGS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FRAMETOOLONGS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property FrameTooLongs
     * <br>
     * A count of frames received on a particular interface that exceed the maximum permitted frame size. The count represented by an instance of this object is incremented when the FrameTooLong status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error conditions obtain are, according to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status presented to the LLC.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FrameTooLongs(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FRAMETOOLONGS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FrameTooLongs(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FRAMETOOLONGS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FrameTooLongs by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FrameTooLongs(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_EthernetAdapter fco = new CIM_EthernetAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FRAMETOOLONGS.NAME);
        if (property != null) {
            property = setPropertyValue_FrameTooLongs(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FRAMETOOLONGS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FrameTooLongs
     * <br>
     * A count of frames received on a particular interface that exceed the maximum permitted frame size. The count represented by an instance of this object is incremented when the FrameTooLong status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error conditions obtain are, according to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status presented to the LLC.
     */

    private static CIMProperty setPropertyValue_FrameTooLongs(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property InternalMACReceiveErrors
     *     * <br>
     * A count of frames for which reception on a particular interface fails due to an internal MAC sublayer receive error. A frame is only counted by an instance of this object if it is not counted by the corresponding instance of either the FrameTooLongs property, the AlignmentErrors property, or the FCSErrors property. The precise meaning of the count represented by an instance of this object is implementation-specific. In particular, an instance of this object may represent a count of receive errors on a particular interface that are not otherwise counted.
     *     */

    public javax.cim.UnsignedInteger32 get_InternalMACReceiveErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_INTERNALMACRECEIVEERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_INTERNALMACRECEIVEERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property InternalMACReceiveErrors
     * <br>
     * A count of frames for which reception on a particular interface fails due to an internal MAC sublayer receive error. A frame is only counted by an instance of this object if it is not counted by the corresponding instance of either the FrameTooLongs property, the AlignmentErrors property, or the FCSErrors property. The precise meaning of the count represented by an instance of this object is implementation-specific. In particular, an instance of this object may represent a count of receive errors on a particular interface that are not otherwise counted.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_InternalMACReceiveErrors(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_INTERNALMACRECEIVEERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_InternalMACReceiveErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_INTERNALMACRECEIVEERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property InternalMACReceiveErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_InternalMACReceiveErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_EthernetAdapter fco = new CIM_EthernetAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_INTERNALMACRECEIVEERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_InternalMACReceiveErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_INTERNALMACRECEIVEERRORS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property InternalMACReceiveErrors
     * <br>
     * A count of frames for which reception on a particular interface fails due to an internal MAC sublayer receive error. A frame is only counted by an instance of this object if it is not counted by the corresponding instance of either the FrameTooLongs property, the AlignmentErrors property, or the FCSErrors property. The precise meaning of the count represented by an instance of this object is implementation-specific. In particular, an instance of this object may represent a count of receive errors on a particular interface that are not otherwise counted.
     */

    private static CIMProperty setPropertyValue_InternalMACReceiveErrors(
            CIMProperty currentProperty, javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property InternalMACTransmitErrors
     *     * <br>
     * A count of frames for which transmission on a particular interface fails due to an internal MAC sublayer transmit error. A frame is only counted by an instance of this object if it is not counted by the corresponding instance of either the LateCollisions property, the Excessive Collisions property, or the CarrierSenseErrors property. The precise meaning of the count represented by an instance of this object is implementation-specific. In particular, an instance of this object may represent a count of transmission errors on a particular interface that are not otherwise counted.
     *     */

    public javax.cim.UnsignedInteger32 get_InternalMACTransmitErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_INTERNALMACTRANSMITERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_INTERNALMACTRANSMITERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property InternalMACTransmitErrors
     * <br>
     * A count of frames for which transmission on a particular interface fails due to an internal MAC sublayer transmit error. A frame is only counted by an instance of this object if it is not counted by the corresponding instance of either the LateCollisions property, the Excessive Collisions property, or the CarrierSenseErrors property. The precise meaning of the count represented by an instance of this object is implementation-specific. In particular, an instance of this object may represent a count of transmission errors on a particular interface that are not otherwise counted.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_InternalMACTransmitErrors(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_INTERNALMACTRANSMITERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_InternalMACTransmitErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_INTERNALMACTRANSMITERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property InternalMACTransmitErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_InternalMACTransmitErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_EthernetAdapter fco = new CIM_EthernetAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_INTERNALMACTRANSMITERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_InternalMACTransmitErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_INTERNALMACTRANSMITERRORS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property InternalMACTransmitErrors
     * <br>
     * A count of frames for which transmission on a particular interface fails due to an internal MAC sublayer transmit error. A frame is only counted by an instance of this object if it is not counted by the corresponding instance of either the LateCollisions property, the Excessive Collisions property, or the CarrierSenseErrors property. The precise meaning of the count represented by an instance of this object is implementation-specific. In particular, an instance of this object may represent a count of transmission errors on a particular interface that are not otherwise counted.
     */

    private static CIMProperty setPropertyValue_InternalMACTransmitErrors(
            CIMProperty currentProperty, javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LateCollisions
     *     * <br>
     * The number of times that a collision is detected on a particular interface later than 512 bit-times into the transmission of a packet. Five hundred and twelve bit- times corresponds to 51.2 microseconds on a 10 Mbit/s system. A (late) collision included in a count represented by an instance of this object is also considered as a (generic) collision for purposes of other collision-related statistics.
     *     */

    public javax.cim.UnsignedInteger32 get_LateCollisions() {
        CIMProperty currentProperty = getProperty(PROPERTY_LATECOLLISIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LATECOLLISIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property LateCollisions
     * <br>
     * The number of times that a collision is detected on a particular interface later than 512 bit-times into the transmission of a packet. Five hundred and twelve bit- times corresponds to 51.2 microseconds on a 10 Mbit/s system. A (late) collision included in a count represented by an instance of this object is also considered as a (generic) collision for purposes of other collision-related statistics.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LateCollisions(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LATECOLLISIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LateCollisions(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LATECOLLISIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LateCollisions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LateCollisions(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_EthernetAdapter fco = new CIM_EthernetAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LATECOLLISIONS.NAME);
        if (property != null) {
            property = setPropertyValue_LateCollisions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LATECOLLISIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LateCollisions
     * <br>
     * The number of times that a collision is detected on a particular interface later than 512 bit-times into the transmission of a packet. Five hundred and twelve bit- times corresponds to 51.2 microseconds on a 10 Mbit/s system. A (late) collision included in a count represented by an instance of this object is also considered as a (generic) collision for purposes of other collision-related statistics.
     */

    private static CIMProperty setPropertyValue_LateCollisions(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
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
     * The maximum size of the INFO (non-MAC) field that will be received or transmitted.
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
     * The maximum size of the INFO (non-MAC) field that will be received or transmitted.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MaxDataSize(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MAXDATASIZE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MaxDataSize(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
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
        CIM_EthernetAdapter fco = new CIM_EthernetAdapter(client, namespace);
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
     * The maximum size of the INFO (non-MAC) field that will be received or transmitted.
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
     * Get the property MultipleCollisionFrames
     *     * <br>
     * A count of successfully transmitted frames on a particular interface for which transmission is inhibited by more than one collision. A frame that is counted by an instance of this object is not counted by the corresponding instance of the SingleCollisionFrames property.
     *     */

    public javax.cim.UnsignedInteger32 get_MultipleCollisionFrames() {
        CIMProperty currentProperty = getProperty(PROPERTY_MULTIPLECOLLISIONFRAMES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_MULTIPLECOLLISIONFRAMES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property MultipleCollisionFrames
     * <br>
     * A count of successfully transmitted frames on a particular interface for which transmission is inhibited by more than one collision. A frame that is counted by an instance of this object is not counted by the corresponding instance of the SingleCollisionFrames property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_MultipleCollisionFrames(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_MULTIPLECOLLISIONFRAMES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_MultipleCollisionFrames(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_MULTIPLECOLLISIONFRAMES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property MultipleCollisionFrames by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_MultipleCollisionFrames(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_EthernetAdapter fco = new CIM_EthernetAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_MULTIPLECOLLISIONFRAMES.NAME);
        if (property != null) {
            property = setPropertyValue_MultipleCollisionFrames(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_MULTIPLECOLLISIONFRAMES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property MultipleCollisionFrames
     * <br>
     * A count of successfully transmitted frames on a particular interface for which transmission is inhibited by more than one collision. A frame that is counted by an instance of this object is not counted by the corresponding instance of the SingleCollisionFrames property.
     */

    private static CIMProperty setPropertyValue_MultipleCollisionFrames(
            CIMProperty currentProperty, javax.cim.UnsignedInteger32 newValue) {
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
     * Ethernet/802.3 MAC addresses formatted as twelve hexadecimal digits (e.g. "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order. (Thus, the Group address bit is found in the low order bit of the first character of the string.)
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
     * Ethernet/802.3 MAC addresses formatted as twelve hexadecimal digits (e.g. "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order. (Thus, the Group address bit is found in the low order bit of the first character of the string.)
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_NetworkAddresses(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NETWORKADDRESSES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_NetworkAddresses(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
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
        CIM_EthernetAdapter fco = new CIM_EthernetAdapter(client, namespace);
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
     * Ethernet/802.3 MAC addresses formatted as twelve hexadecimal digits (e.g. "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order. (Thus, the Group address bit is found in the low order bit of the first character of the string.)
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
     * Get the property SQETestErrors
     *     * <br>
     * A count of times that the SQE TEST ERROR message is generated by the PLS sublayer for a particular interface. The SQE TEST ERROR message is defined in section 7.2.2.2.4 of ANSI/IEEE 802.3-1985 and its generation is described in section 7.2.4.6 of the same document.
     *     */

    public javax.cim.UnsignedInteger32 get_SQETestErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_SQETESTERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SQETESTERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property SQETestErrors
     * <br>
     * A count of times that the SQE TEST ERROR message is generated by the PLS sublayer for a particular interface. The SQE TEST ERROR message is defined in section 7.2.2.2.4 of ANSI/IEEE 802.3-1985 and its generation is described in section 7.2.4.6 of the same document.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SQETestErrors(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SQETESTERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SQETestErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SQETESTERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SQETestErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SQETestErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_EthernetAdapter fco = new CIM_EthernetAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SQETESTERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_SQETestErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SQETESTERRORS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SQETestErrors
     * <br>
     * A count of times that the SQE TEST ERROR message is generated by the PLS sublayer for a particular interface. The SQE TEST ERROR message is defined in section 7.2.2.2.4 of ANSI/IEEE 802.3-1985 and its generation is described in section 7.2.4.6 of the same document.
     */

    private static CIMProperty setPropertyValue_SQETestErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SingleCollisionFrames
     *     * <br>
     * A count of successfully transmitted frames on a particular interface for which transmission is inhibited by exactly one collision. A frame that is counted by an instance of this object is not counted by the corresponding instance of the MultipleCollisionFrames property.
     *     */

    public javax.cim.UnsignedInteger32 get_SingleCollisionFrames() {
        CIMProperty currentProperty = getProperty(PROPERTY_SINGLECOLLISIONFRAMES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SINGLECOLLISIONFRAMES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property SingleCollisionFrames
     * <br>
     * A count of successfully transmitted frames on a particular interface for which transmission is inhibited by exactly one collision. A frame that is counted by an instance of this object is not counted by the corresponding instance of the MultipleCollisionFrames property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SingleCollisionFrames(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SINGLECOLLISIONFRAMES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SingleCollisionFrames(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SINGLECOLLISIONFRAMES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SingleCollisionFrames by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SingleCollisionFrames(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_EthernetAdapter fco = new CIM_EthernetAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SINGLECOLLISIONFRAMES.NAME);
        if (property != null) {
            property = setPropertyValue_SingleCollisionFrames(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SINGLECOLLISIONFRAMES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SingleCollisionFrames
     * <br>
     * A count of successfully transmitted frames on a particular interface for which transmission is inhibited by exactly one collision. A frame that is counted by an instance of this object is not counted by the corresponding instance of the MultipleCollisionFrames property.
     */

    private static CIMProperty setPropertyValue_SingleCollisionFrames(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SymbolErrors
     *     * <br>
     * The number of times there was an invalid data symbol when a valid carrier was present. The count is incremented at most once per carrier event, even if multiple symbol errors occur during the carrier event.
     *     */

    public javax.cim.UnsignedInteger32 get_SymbolErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_SYMBOLERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SYMBOLERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property SymbolErrors
     * <br>
     * The number of times there was an invalid data symbol when a valid carrier was present. The count is incremented at most once per carrier event, even if multiple symbol errors occur during the carrier event.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SymbolErrors(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SYMBOLERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SymbolErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SYMBOLERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SymbolErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SymbolErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_EthernetAdapter fco = new CIM_EthernetAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SYMBOLERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_SymbolErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SYMBOLERRORS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SymbolErrors
     * <br>
     * The number of times there was an invalid data symbol when a valid carrier was present. The count is incremented at most once per carrier event, even if multiple symbol errors occur during the carrier event.
     */

    private static CIMProperty setPropertyValue_SymbolErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TotalPacketsReceived
     *     * <br>
     * The total number of packets received.
     *     */

    public javax.cim.UnsignedInteger64 get_TotalPacketsReceived() {
        CIMProperty currentProperty = getProperty(PROPERTY_TOTALPACKETSRECEIVED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TOTALPACKETSRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property TotalPacketsReceived
     * <br>
     * The total number of packets received.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TotalPacketsReceived(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TOTALPACKETSRECEIVED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_TotalPacketsReceived(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TOTALPACKETSRECEIVED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TotalPacketsReceived by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TotalPacketsReceived(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_EthernetAdapter fco = new CIM_EthernetAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TOTALPACKETSRECEIVED.NAME);
        if (property != null) {
            property = setPropertyValue_TotalPacketsReceived(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TOTALPACKETSRECEIVED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TotalPacketsReceived
     * <br>
     * The total number of packets received.
     */

    private static CIMProperty setPropertyValue_TotalPacketsReceived(CIMProperty currentProperty,
            javax.cim.UnsignedInteger64 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TotalPacketsTransmitted
     *     * <br>
     * The total number of packets transmitted.
     *     */

    public javax.cim.UnsignedInteger64 get_TotalPacketsTransmitted() {
        CIMProperty currentProperty = getProperty(PROPERTY_TOTALPACKETSTRANSMITTED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TOTALPACKETSTRANSMITTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger64) currentProperty.getValue();

    }

    /**
     * Set the property TotalPacketsTransmitted
     * <br>
     * The total number of packets transmitted.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TotalPacketsTransmitted(javax.cim.UnsignedInteger64 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TOTALPACKETSTRANSMITTED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_TotalPacketsTransmitted(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TOTALPACKETSTRANSMITTED.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TotalPacketsTransmitted by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TotalPacketsTransmitted(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger64 newValue) throws WbemsmtException {
        CIM_EthernetAdapter fco = new CIM_EthernetAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TOTALPACKETSTRANSMITTED.NAME);
        if (property != null) {
            property = setPropertyValue_TotalPacketsTransmitted(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TOTALPACKETSTRANSMITTED.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TotalPacketsTransmitted
     * <br>
     * The total number of packets transmitted.
     */

    private static CIMProperty setPropertyValue_TotalPacketsTransmitted(
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
        return CIM_EthernetAdapter.CIM_CLASS_NAME;
    }

}