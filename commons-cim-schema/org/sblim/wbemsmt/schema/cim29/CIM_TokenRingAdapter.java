/** 
 * CIM_TokenRingAdapter.java
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
 * Description: The use of the CIM_TokenRingAdapter class has been deprecated, consistent with NetworkAdapter. Instead use the CIM_TokenRingPort class. This class describes the capabilities and management aspects of a TokenRingAdapter.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_TokenRingAdapter extends CIM_NetworkAdapter {

    public final static String CIM_CLASS_NAME = "CIM_TokenRingAdapter";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property ACErrors
     * This counter is incremented when a station receives an AMP or SMP frame in which A is equal to C is equal to 0, and then receives another SMP frame with A equal to C equal to 0 without first receiving an AMP frame. It denotes a station that cannot set the AC bits properly.
     */
    public static class PROPERTY_ACERRORS {
        /**
         * name of the property ACErrors
         */
        public final static String NAME = "ACErrors";

    }

    /**
     * Constants of property AbortTransErrors
     * This counter is incremented when a station transmits an abort delimiter while transmitting data.
     */
    public static class PROPERTY_ABORTTRANSERRORS {
        /**
         * name of the property AbortTransErrors
         */
        public final static String NAME = "AbortTransErrors";

    }

    /**
     * Constants of property BurstErrors
     * This counter is incremented when a station detects the absence of transitions for five half-bit timers (burst-five errors).
     */
    public static class PROPERTY_BURSTERRORS {
        /**
         * name of the property BurstErrors
         */
        public final static String NAME = "BurstErrors";

    }

    /**
     * Constants of property Capabilities
     * Capabilities of the TokenRingAdapter. For example, the Device may support AlertOnLan, WakeOnLan, Load Balancing and/or Failover. If failover or load balancing capabilities are listed, a SpareGroup (failover) or ExtraCapacityGroup (load balancing) should also be defined to completely describe the capability.
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
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@30ee30ee
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
     * An array of free-form strings providing more detailed explanations for any of the TokenRingAdapter features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
     */
    public static class PROPERTY_CAPABILITYDESCRIPTIONS {
        /**
         * name of the property CapabilityDescriptions
         */
        public final static String NAME = "CapabilityDescriptions";

    }

    /**
     * Constants of property EnabledCapabilities
     * Specifies which of the capabilities from the "Capabilities" property are currently enabled.
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
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@682c682c
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
     * Constants of property FrameCopiedErrors
     * This counter is incremented when a station recognizes a frame addressed to its specific address and detects that the FS field A bits are set to 1 indicating a possible line hit or duplicate address.
     */
    public static class PROPERTY_FRAMECOPIEDERRORS {
        /**
         * name of the property FrameCopiedErrors
         */
        public final static String NAME = "FrameCopiedErrors";

    }

    /**
     * Constants of property FrequencyErrors
     * The number of times the Device has detected that the frequency of the incoming signal differs from the expected frequency by more than that specified by the IEEE 802.5 standard.
     */
    public static class PROPERTY_FREQUENCYERRORS {
        /**
         * name of the property FrequencyErrors
         */
        public final static String NAME = "FrequencyErrors";

    }

    /**
     * Constants of property HardErrors
     * The number of times this Device has detected an immediately recoverable fatal error. It denotes the number of times this Device is either transmitting or receiving beacon MAC frames.
     */
    public static class PROPERTY_HARDERRORS {
        /**
         * name of the property HardErrors
         */
        public final static String NAME = "HardErrors";

    }

    /**
     * Constants of property InternalErrors
     * This counter is incremented when a station recognizes an internal error.
     */
    public static class PROPERTY_INTERNALERRORS {
        /**
         * name of the property InternalErrors
         */
        public final static String NAME = "InternalErrors";

    }

    /**
     * Constants of property LobeWires
     * The number of times the Device has detected an open or short circuit in the lobe data path. The adapter will be closed and RingState will signify this condition.
     */
    public static class PROPERTY_LOBEWIRES {
        /**
         * name of the property LobeWires
         */
        public final static String NAME = "LobeWires";

    }

    /**
     * Constants of property LostFrameErrors
     * This counter is incremented when a station is transmitting and its TRR timer expires. This denotes a condition where a transmitting station in strip mode does not receive the trailer of the frame before the TRR timer goes off.
     */
    public static class PROPERTY_LOSTFRAMEERRORS {
        /**
         * name of the property LostFrameErrors
         */
        public final static String NAME = "LostFrameErrors";

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
     * Constants of property NetworkAddresses
     * Token Ring/802.5 MAC addresses formatted as twelve hexadecimal digits (e.g. "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order. (Thus, the Group address bit is found in the low order bit of the first character of the string.)
     */
    public static class PROPERTY_NETWORKADDRESSES {
        /**
         * name of the property NetworkAddresses
         */
        public final static String NAME = "NetworkAddresses";

    }

    /**
     * Constants of property ReceiveCongestions
     * This counter is incremented when a station recognizes a frame addressed to its specific address, but has no available buffer space - indicating that the station is congested.
     */
    public static class PROPERTY_RECEIVECONGESTIONS {
        /**
         * name of the property ReceiveCongestions
         */
        public final static String NAME = "ReceiveCongestions";

    }

    /**
     * Constants of property Recoverys
     * The number of Claim Token MAC frames received or transmitted after the Device has received a Ring Purge MAC frame. This counter signifies the number of times the ring has been purged and is being recovered back into a normal operating state.
     */
    public static class PROPERTY_RECOVERYS {
        /**
         * name of the property Recoverys
         */
        public final static String NAME = "Recoverys";

    }

    /**
     * Constants of property Removes
     * The number of times the Device has received a Remove Ring Station MAC frame request. When this frame is received, the Device will enter the close state and RingState will signify this condition.
     */
    public static class PROPERTY_REMOVES {
        /**
         * name of the property Removes
         */
        public final static String NAME = "Removes";

    }

    /**
     * Constants of property RingOpenStatus
     * This property indicates the success, or the reason for failure, of the station's most recent attempt to enter the ring.
     */
    public static class PROPERTY_RINGOPENSTATUS {
        /**
         * name of the property RingOpenStatus
         */
        public final static String NAME = "RingOpenStatus";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_No_Open_Attempted = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value entry No Open Attempted (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_No_Open_Attempted = "No Open Attempted";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Bad_Parameter = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Bad Parameter (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Bad_Parameter = "Bad Parameter";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Lobe_Failed = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Lobe Failed (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Lobe_Failed = "Lobe Failed";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Signal_Loss = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Signal Loss (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Signal_Loss = "Signal Loss";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Insertion_Timeout = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Insertion Timeout (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Insertion_Timeout = "Insertion Timeout";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Ring_Failed = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Ring Failed (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Ring_Failed = "Ring Failed";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Beaconing = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Beaconing (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Beaconing = "Beaconing";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Duplicate_MAC = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry Duplicate MAC (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_Duplicate_MAC = "Duplicate MAC";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Request_Failed = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Request Failed (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Request_Failed = "Request Failed";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Remove_Received = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry Remove Received (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_Remove_Received = "Remove Received";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Last_Open_Successful = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry Last Open Successful (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_Last_Open_Successful = "Last Open Successful";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@458c458c
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_No_Open_Attempted.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_No_Open_Attempted;
            }

            if (VALUE_ENTRY_Bad_Parameter.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Bad_Parameter;
            }

            if (VALUE_ENTRY_Lobe_Failed.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Lobe_Failed;
            }

            if (VALUE_ENTRY_Signal_Loss.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Signal_Loss;
            }

            if (VALUE_ENTRY_Insertion_Timeout.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Insertion_Timeout;
            }

            if (VALUE_ENTRY_Ring_Failed.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Ring_Failed;
            }

            if (VALUE_ENTRY_Beaconing.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Beaconing;
            }

            if (VALUE_ENTRY_Duplicate_MAC.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Duplicate_MAC;
            }

            if (VALUE_ENTRY_Request_Failed.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Request_Failed;
            }

            if (VALUE_ENTRY_Remove_Received.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Remove_Received;
            }

            if (VALUE_ENTRY_Last_Open_Successful.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Last_Open_Successful;
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

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_No_Open_Attempted.intValue()) {
                return VALUE_ENTRY_No_Open_Attempted;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Bad_Parameter.intValue()) {
                return VALUE_ENTRY_Bad_Parameter;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Lobe_Failed.intValue()) {
                return VALUE_ENTRY_Lobe_Failed;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Signal_Loss.intValue()) {
                return VALUE_ENTRY_Signal_Loss;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Insertion_Timeout.intValue()) {
                return VALUE_ENTRY_Insertion_Timeout;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Ring_Failed.intValue()) {
                return VALUE_ENTRY_Ring_Failed;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Beaconing.intValue()) {
                return VALUE_ENTRY_Beaconing;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Duplicate_MAC.intValue()) {
                return VALUE_ENTRY_Duplicate_MAC;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Request_Failed.intValue()) {
                return VALUE_ENTRY_Request_Failed;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Remove_Received.intValue()) {
                return VALUE_ENTRY_Remove_Received;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Last_Open_Successful.intValue()) {
                return VALUE_ENTRY_Last_Open_Successful;
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
         * Value Map for the property RingOpenStatus   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_No_Open_Attempted,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Bad_Parameter,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Lobe_Failed,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Signal_Loss,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Insertion_Timeout,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Ring_Failed,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Beaconing,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_Duplicate_MAC,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Request_Failed,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_Remove_Received,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_Last_Open_Successful };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property RingOpenStatus   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_No_Open_Attempted,
                VALUE_ENTRY_Bad_Parameter, VALUE_ENTRY_Lobe_Failed, VALUE_ENTRY_Signal_Loss,
                VALUE_ENTRY_Insertion_Timeout, VALUE_ENTRY_Ring_Failed, VALUE_ENTRY_Beaconing,
                VALUE_ENTRY_Duplicate_MAC, VALUE_ENTRY_Request_Failed, VALUE_ENTRY_Remove_Received,
                VALUE_ENTRY_Last_Open_Successful };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property RingOpenStatus   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_No_Open_Attempted,
                VALUE_ENTRY_Bad_Parameter, VALUE_ENTRY_Lobe_Failed, VALUE_ENTRY_Signal_Loss,
                VALUE_ENTRY_Insertion_Timeout, VALUE_ENTRY_Ring_Failed, VALUE_ENTRY_Beaconing,
                VALUE_ENTRY_Duplicate_MAC, VALUE_ENTRY_Request_Failed, VALUE_ENTRY_Remove_Received,
                VALUE_ENTRY_Last_Open_Successful };

    }

    /**
     * Constants of property RingSpeed
     * The ring's bandwidth.
     */
    public static class PROPERTY_RINGSPEED {
        /**
         * name of the property RingSpeed
         */
        public final static String NAME = "RingSpeed";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_One_Megabit = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry One Megabit (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_One_Megabit = "One Megabit";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Four_Megabit = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Four Megabit (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Four_Megabit = "Four Megabit";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Sixteen_Megabit = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Sixteen Megabit (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Sixteen_Megabit = "Sixteen Megabit";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@18ca18ca
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_One_Megabit.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_One_Megabit;
            }

            if (VALUE_ENTRY_Four_Megabit.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Four_Megabit;
            }

            if (VALUE_ENTRY_Sixteen_Megabit.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Sixteen_Megabit;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_One_Megabit.intValue()) {
                return VALUE_ENTRY_One_Megabit;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Four_Megabit.intValue()) {
                return VALUE_ENTRY_Four_Megabit;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Sixteen_Megabit.intValue()) {
                return VALUE_ENTRY_Sixteen_Megabit;
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
         * Value Map for the property RingSpeed   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_One_Megabit,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Four_Megabit,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Sixteen_Megabit };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property RingSpeed   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_One_Megabit, VALUE_ENTRY_Four_Megabit, VALUE_ENTRY_Sixteen_Megabit };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property RingSpeed   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_One_Megabit, VALUE_ENTRY_Four_Megabit,
                VALUE_ENTRY_Sixteen_Megabit };

    }

    /**
     * Constants of property RingState
     * The current Device state with respect to entering or leaving the ring.
     */
    public static class PROPERTY_RINGSTATE {
        /**
         * name of the property RingState
         */
        public final static String NAME = "RingState";

        /**
         * constant for value map entry 0
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Opened = new javax.cim.UnsignedInteger16(
                "0");

        /**
         * constant for value entry Opened (corresponds to mapEntry 0 )
         */
        public final static String VALUE_ENTRY_Opened = "Opened";

        /**
         * constant for value map entry 1
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Closed = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry Closed (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_Closed = "Closed";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Opening = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Opening (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Opening = "Opening";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Closing = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Closing (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Closing = "Closing";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Open_Failure = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry Open Failure (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_Open_Failure = "Open Failure";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Ring_Failure = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry Ring Failure (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_Ring_Failure = "Ring Failure";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@530a530a
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Opened.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Opened;
            }

            if (VALUE_ENTRY_Closed.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Closed;
            }

            if (VALUE_ENTRY_Opening.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Opening;
            }

            if (VALUE_ENTRY_Closing.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Closing;
            }

            if (VALUE_ENTRY_Open_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Open_Failure;
            }

            if (VALUE_ENTRY_Ring_Failure.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Ring_Failure;
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

            if (iValue == VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Opened.intValue()) {
                return VALUE_ENTRY_Opened;
            }

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Closed.intValue()) {
                return VALUE_ENTRY_Closed;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Opening.intValue()) {
                return VALUE_ENTRY_Opening;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Closing.intValue()) {
                return VALUE_ENTRY_Closing;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Open_Failure.intValue()) {
                return VALUE_ENTRY_Open_Failure;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Ring_Failure.intValue()) {
                return VALUE_ENTRY_Ring_Failure;
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
         * Value Map for the property RingState   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Opened, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Closed,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Opening,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Closing,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_Open_Failure,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_Ring_Failure };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property RingState   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Opened, VALUE_ENTRY_Closed,
                VALUE_ENTRY_Opening, VALUE_ENTRY_Closing, VALUE_ENTRY_Open_Failure,
                VALUE_ENTRY_Ring_Failure };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property RingState   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Opened,
                VALUE_ENTRY_Closed, VALUE_ENTRY_Opening, VALUE_ENTRY_Closing,
                VALUE_ENTRY_Open_Failure, VALUE_ENTRY_Ring_Failure };

    }

    /**
     * Constants of property RingStatus
     * The current status which can be used to diagnose fluctuating problems that can occur on token rings, after a station has successfully been added to the ring. Before an open is completed, this object contains the value indicating "no status" (131072). (The RingState and RingOpenStatus properties are also provided for debugging problems when the station can not even enter the ring.) The property's value is a sum of values, one for each currently applicable condition. The following values are defined for various conditions: 
     * 0= No Problems Detected, 32= Ring Recovery, 64= Single Station, 256= Remove Received, 512= Reserved, 1024= Auto-Removal Error, 2048= Lobe Wire Fault, 4096= Transmit Beacon, 8192= Soft Error, 16384= Hard Error, 32768= Signal Loss, 131072= No Status, Open Not Completed.
     */
    public static class PROPERTY_RINGSTATUS {
        /**
         * name of the property RingStatus
         */
        public final static String NAME = "RingStatus";

    }

    /**
     * Constants of property SignalLossCount
     * The number of times this Device has detected the loss of signal condition from the ring.
     */
    public static class PROPERTY_SIGNALLOSSCOUNT {
        /**
         * name of the property SignalLossCount
         */
        public final static String NAME = "SignalLossCount";

    }

    /**
     * Constants of property Singles
     * The number of times the Device has sensed that it is the only station on the ring. This will happen if the Device is the first one up on a ring, or if there is a hardware problem.
     */
    public static class PROPERTY_SINGLES {
        /**
         * name of the property Singles
         */
        public final static String NAME = "Singles";

    }

    /**
     * Constants of property SoftErrors
     * The number of Soft Errors that the Device has detected. It directly corresponds to the number of Report Error MAC frames that this Device has transmitted. Soft Errors are those which are recoverable by the MAC layer protocols.
     */
    public static class PROPERTY_SOFTERRORS {
        /**
         * name of the property SoftErrors
         */
        public final static String NAME = "SoftErrors";

    }

    /**
     * Constants of property TokenErrors
     * This counter is incremented when a station acting as the active monitor recognizes an error condition that needs a token transmitted.
     */
    public static class PROPERTY_TOKENERRORS {
        /**
         * name of the property TokenErrors
         */
        public final static String NAME = "TokenErrors";

    }

    /**
     * Constants of property TransmittedBeacons
     * The number of times this Device has transmitted a beacon frame.
     */
    public static class PROPERTY_TRANSMITTEDBEACONS {
        /**
         * name of the property TransmittedBeacons
         */
        public final static String NAME = "TransmittedBeacons";

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
     *   The use of the CIM_TokenRingAdapter class has been deprecated, consistent with NetworkAdapter. Instead use the CIM_TokenRingPort class. This class describes the capabilities and management aspects of a TokenRingAdapter.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_TokenRingAdapter(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   The use of the CIM_TokenRingAdapter class has been deprecated, consistent with NetworkAdapter. Instead use the CIM_TokenRingPort class. This class describes the capabilities and management aspects of a TokenRingAdapter.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_TokenRingAdapter(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_TokenRingAdapter() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("ACErrors", new CIMProperty("ACErrors", CIMDataType.UINT32_T, null));
        propertiesToCheck.put("AbortTransErrors", new CIMProperty("AbortTransErrors",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("BurstErrors", new CIMProperty("BurstErrors", CIMDataType.UINT32_T,
                null));
        propertiesToCheck.put("Capabilities", new CIMProperty("Capabilities",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("CapabilityDescriptions", new CIMProperty("CapabilityDescriptions",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("EnabledCapabilities", new CIMProperty("EnabledCapabilities",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("FrameCopiedErrors", new CIMProperty("FrameCopiedErrors",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("FrequencyErrors", new CIMProperty("FrequencyErrors",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("HardErrors", new CIMProperty("HardErrors", CIMDataType.UINT32_T,
                null));
        propertiesToCheck.put("InternalErrors", new CIMProperty("InternalErrors",
                CIMDataType.UINT32_T, null));
        propertiesToCheck
                .put("LobeWires", new CIMProperty("LobeWires", CIMDataType.UINT32_T, null));
        propertiesToCheck.put("LostFrameErrors", new CIMProperty("LostFrameErrors",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("MaxDataSize", new CIMProperty("MaxDataSize", CIMDataType.UINT32_T,
                null));
        propertiesToCheck.put("NetworkAddresses", new CIMProperty("NetworkAddresses",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("ReceiveCongestions", new CIMProperty("ReceiveCongestions",
                CIMDataType.UINT32_T, null));
        propertiesToCheck
                .put("Recoverys", new CIMProperty("Recoverys", CIMDataType.UINT32_T, null));
        propertiesToCheck.put("Removes", new CIMProperty("Removes", CIMDataType.UINT32_T, null));
        propertiesToCheck.put("RingOpenStatus", new CIMProperty("RingOpenStatus",
                CIMDataType.UINT16_T, null));
        propertiesToCheck
                .put("RingSpeed", new CIMProperty("RingSpeed", CIMDataType.UINT16_T, null));
        propertiesToCheck
                .put("RingState", new CIMProperty("RingState", CIMDataType.UINT16_T, null));
        propertiesToCheck.put("RingStatus", new CIMProperty("RingStatus", CIMDataType.UINT32_T,
                null));
        propertiesToCheck.put("SignalLossCount", new CIMProperty("SignalLossCount",
                CIMDataType.UINT32_T, null));
        propertiesToCheck.put("Singles", new CIMProperty("Singles", CIMDataType.UINT32_T, null));
        propertiesToCheck.put("SoftErrors", new CIMProperty("SoftErrors", CIMDataType.UINT32_T,
                null));
        propertiesToCheck.put("TokenErrors", new CIMProperty("TokenErrors", CIMDataType.UINT32_T,
                null));
        propertiesToCheck.put("TransmittedBeacons", new CIMProperty("TransmittedBeacons",
                CIMDataType.UINT32_T, null));

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
     * Get the property ACErrors
     *     * <br>
     * This counter is incremented when a station receives an AMP or SMP frame in which A is equal to C is equal to 0, and then receives another SMP frame with A equal to C equal to 0 without first receiving an AMP frame. It denotes a station that cannot set the AC bits properly.
     *     */

    public javax.cim.UnsignedInteger32 get_ACErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_ACERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ACERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property ACErrors
     * <br>
     * This counter is incremented when a station receives an AMP or SMP frame in which A is equal to C is equal to 0, and then receives another SMP frame with A equal to C equal to 0 without first receiving an AMP frame. It denotes a station that cannot set the AC bits properly.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ACErrors(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ACERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ACErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ACERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ACErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ACErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingAdapter fco = new CIM_TokenRingAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ACERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_ACErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ACERRORS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ACErrors
     * <br>
     * This counter is incremented when a station receives an AMP or SMP frame in which A is equal to C is equal to 0, and then receives another SMP frame with A equal to C equal to 0 without first receiving an AMP frame. It denotes a station that cannot set the AC bits properly.
     */

    private static CIMProperty setPropertyValue_ACErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property AbortTransErrors
     *     * <br>
     * This counter is incremented when a station transmits an abort delimiter while transmitting data.
     *     */

    public javax.cim.UnsignedInteger32 get_AbortTransErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_ABORTTRANSERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ABORTTRANSERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property AbortTransErrors
     * <br>
     * This counter is incremented when a station transmits an abort delimiter while transmitting data.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AbortTransErrors(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ABORTTRANSERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_AbortTransErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ABORTTRANSERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AbortTransErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AbortTransErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingAdapter fco = new CIM_TokenRingAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ABORTTRANSERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_AbortTransErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ABORTTRANSERRORS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AbortTransErrors
     * <br>
     * This counter is incremented when a station transmits an abort delimiter while transmitting data.
     */

    private static CIMProperty setPropertyValue_AbortTransErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property BurstErrors
     *     * <br>
     * This counter is incremented when a station detects the absence of transitions for five half-bit timers (burst-five errors).
     *     */

    public javax.cim.UnsignedInteger32 get_BurstErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_BURSTERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_BURSTERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property BurstErrors
     * <br>
     * This counter is incremented when a station detects the absence of transitions for five half-bit timers (burst-five errors).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_BurstErrors(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_BURSTERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_BurstErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_BURSTERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property BurstErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_BurstErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingAdapter fco = new CIM_TokenRingAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_BURSTERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_BurstErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_BURSTERRORS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property BurstErrors
     * <br>
     * This counter is incremented when a station detects the absence of transitions for five half-bit timers (burst-five errors).
     */

    private static CIMProperty setPropertyValue_BurstErrors(CIMProperty currentProperty,
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
     * Capabilities of the TokenRingAdapter. For example, the Device may support AlertOnLan, WakeOnLan, Load Balancing and/or Failover. If failover or load balancing capabilities are listed, a SpareGroup (failover) or ExtraCapacityGroup (load balancing) should also be defined to completely describe the capability.
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
     * Capabilities of the TokenRingAdapter. For example, the Device may support AlertOnLan, WakeOnLan, Load Balancing and/or Failover. If failover or load balancing capabilities are listed, a SpareGroup (failover) or ExtraCapacityGroup (load balancing) should also be defined to completely describe the capability.
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
        CIM_TokenRingAdapter fco = new CIM_TokenRingAdapter(client, namespace);
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
     * Capabilities of the TokenRingAdapter. For example, the Device may support AlertOnLan, WakeOnLan, Load Balancing and/or Failover. If failover or load balancing capabilities are listed, a SpareGroup (failover) or ExtraCapacityGroup (load balancing) should also be defined to completely describe the capability.
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
     * An array of free-form strings providing more detailed explanations for any of the TokenRingAdapter features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
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
     * An array of free-form strings providing more detailed explanations for any of the TokenRingAdapter features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
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
        CIM_TokenRingAdapter fco = new CIM_TokenRingAdapter(client, namespace);
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
     * An array of free-form strings providing more detailed explanations for any of the TokenRingAdapter features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
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
     * Get the property EnabledCapabilities
     *     * <br>
     * Specifies which of the capabilities from the "Capabilities" property are currently enabled.
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
     * Specifies which of the capabilities from the "Capabilities" property are currently enabled.
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
        CIM_TokenRingAdapter fco = new CIM_TokenRingAdapter(client, namespace);
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
     * Specifies which of the capabilities from the "Capabilities" property are currently enabled.
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
     * Get the property FrameCopiedErrors
     *     * <br>
     * This counter is incremented when a station recognizes a frame addressed to its specific address and detects that the FS field A bits are set to 1 indicating a possible line hit or duplicate address.
     *     */

    public javax.cim.UnsignedInteger32 get_FrameCopiedErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_FRAMECOPIEDERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FRAMECOPIEDERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property FrameCopiedErrors
     * <br>
     * This counter is incremented when a station recognizes a frame addressed to its specific address and detects that the FS field A bits are set to 1 indicating a possible line hit or duplicate address.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FrameCopiedErrors(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FRAMECOPIEDERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FrameCopiedErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FRAMECOPIEDERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FrameCopiedErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FrameCopiedErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingAdapter fco = new CIM_TokenRingAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FRAMECOPIEDERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_FrameCopiedErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FRAMECOPIEDERRORS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FrameCopiedErrors
     * <br>
     * This counter is incremented when a station recognizes a frame addressed to its specific address and detects that the FS field A bits are set to 1 indicating a possible line hit or duplicate address.
     */

    private static CIMProperty setPropertyValue_FrameCopiedErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property FrequencyErrors
     *     * <br>
     * The number of times the Device has detected that the frequency of the incoming signal differs from the expected frequency by more than that specified by the IEEE 802.5 standard.
     *     */

    public javax.cim.UnsignedInteger32 get_FrequencyErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_FREQUENCYERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_FREQUENCYERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property FrequencyErrors
     * <br>
     * The number of times the Device has detected that the frequency of the incoming signal differs from the expected frequency by more than that specified by the IEEE 802.5 standard.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_FrequencyErrors(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_FREQUENCYERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_FrequencyErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_FREQUENCYERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property FrequencyErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_FrequencyErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingAdapter fco = new CIM_TokenRingAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_FREQUENCYERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_FrequencyErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_FREQUENCYERRORS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property FrequencyErrors
     * <br>
     * The number of times the Device has detected that the frequency of the incoming signal differs from the expected frequency by more than that specified by the IEEE 802.5 standard.
     */

    private static CIMProperty setPropertyValue_FrequencyErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property HardErrors
     *     * <br>
     * The number of times this Device has detected an immediately recoverable fatal error. It denotes the number of times this Device is either transmitting or receiving beacon MAC frames.
     *     */

    public javax.cim.UnsignedInteger32 get_HardErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_HARDERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_HARDERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property HardErrors
     * <br>
     * The number of times this Device has detected an immediately recoverable fatal error. It denotes the number of times this Device is either transmitting or receiving beacon MAC frames.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_HardErrors(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_HARDERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_HardErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_HARDERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property HardErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_HardErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingAdapter fco = new CIM_TokenRingAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_HARDERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_HardErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_HARDERRORS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property HardErrors
     * <br>
     * The number of times this Device has detected an immediately recoverable fatal error. It denotes the number of times this Device is either transmitting or receiving beacon MAC frames.
     */

    private static CIMProperty setPropertyValue_HardErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property InternalErrors
     *     * <br>
     * This counter is incremented when a station recognizes an internal error.
     *     */

    public javax.cim.UnsignedInteger32 get_InternalErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_INTERNALERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_INTERNALERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property InternalErrors
     * <br>
     * This counter is incremented when a station recognizes an internal error.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_InternalErrors(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_INTERNALERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_InternalErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_INTERNALERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property InternalErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_InternalErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingAdapter fco = new CIM_TokenRingAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_INTERNALERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_InternalErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_INTERNALERRORS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property InternalErrors
     * <br>
     * This counter is incremented when a station recognizes an internal error.
     */

    private static CIMProperty setPropertyValue_InternalErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LobeWires
     *     * <br>
     * The number of times the Device has detected an open or short circuit in the lobe data path. The adapter will be closed and RingState will signify this condition.
     *     */

    public javax.cim.UnsignedInteger32 get_LobeWires() {
        CIMProperty currentProperty = getProperty(PROPERTY_LOBEWIRES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LOBEWIRES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property LobeWires
     * <br>
     * The number of times the Device has detected an open or short circuit in the lobe data path. The adapter will be closed and RingState will signify this condition.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LobeWires(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LOBEWIRES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LobeWires(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LOBEWIRES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LobeWires by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LobeWires(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingAdapter fco = new CIM_TokenRingAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LOBEWIRES.NAME);
        if (property != null) {
            property = setPropertyValue_LobeWires(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LOBEWIRES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LobeWires
     * <br>
     * The number of times the Device has detected an open or short circuit in the lobe data path. The adapter will be closed and RingState will signify this condition.
     */

    private static CIMProperty setPropertyValue_LobeWires(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property LostFrameErrors
     *     * <br>
     * This counter is incremented when a station is transmitting and its TRR timer expires. This denotes a condition where a transmitting station in strip mode does not receive the trailer of the frame before the TRR timer goes off.
     *     */

    public javax.cim.UnsignedInteger32 get_LostFrameErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_LOSTFRAMEERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_LOSTFRAMEERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property LostFrameErrors
     * <br>
     * This counter is incremented when a station is transmitting and its TRR timer expires. This denotes a condition where a transmitting station in strip mode does not receive the trailer of the frame before the TRR timer goes off.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_LostFrameErrors(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_LOSTFRAMEERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_LostFrameErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_LOSTFRAMEERRORS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property LostFrameErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_LostFrameErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingAdapter fco = new CIM_TokenRingAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_LOSTFRAMEERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_LostFrameErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_LOSTFRAMEERRORS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property LostFrameErrors
     * <br>
     * This counter is incremented when a station is transmitting and its TRR timer expires. This denotes a condition where a transmitting station in strip mode does not receive the trailer of the frame before the TRR timer goes off.
     */

    private static CIMProperty setPropertyValue_LostFrameErrors(CIMProperty currentProperty,
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
        CIM_TokenRingAdapter fco = new CIM_TokenRingAdapter(client, namespace);
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
     * Get the property NetworkAddresses
     *     * <br>
     * Token Ring/802.5 MAC addresses formatted as twelve hexadecimal digits (e.g. "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order. (Thus, the Group address bit is found in the low order bit of the first character of the string.)
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
     * Token Ring/802.5 MAC addresses formatted as twelve hexadecimal digits (e.g. "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order. (Thus, the Group address bit is found in the low order bit of the first character of the string.)
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
        CIM_TokenRingAdapter fco = new CIM_TokenRingAdapter(client, namespace);
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
     * Token Ring/802.5 MAC addresses formatted as twelve hexadecimal digits (e.g. "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order. (Thus, the Group address bit is found in the low order bit of the first character of the string.)
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
     * Get the property ReceiveCongestions
     *     * <br>
     * This counter is incremented when a station recognizes a frame addressed to its specific address, but has no available buffer space - indicating that the station is congested.
     *     */

    public javax.cim.UnsignedInteger32 get_ReceiveCongestions() {
        CIMProperty currentProperty = getProperty(PROPERTY_RECEIVECONGESTIONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RECEIVECONGESTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property ReceiveCongestions
     * <br>
     * This counter is incremented when a station recognizes a frame addressed to its specific address, but has no available buffer space - indicating that the station is congested.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ReceiveCongestions(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RECEIVECONGESTIONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_ReceiveCongestions(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RECEIVECONGESTIONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ReceiveCongestions by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ReceiveCongestions(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingAdapter fco = new CIM_TokenRingAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RECEIVECONGESTIONS.NAME);
        if (property != null) {
            property = setPropertyValue_ReceiveCongestions(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RECEIVECONGESTIONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ReceiveCongestions
     * <br>
     * This counter is incremented when a station recognizes a frame addressed to its specific address, but has no available buffer space - indicating that the station is congested.
     */

    private static CIMProperty setPropertyValue_ReceiveCongestions(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Recoverys
     *     * <br>
     * The number of Claim Token MAC frames received or transmitted after the Device has received a Ring Purge MAC frame. This counter signifies the number of times the ring has been purged and is being recovered back into a normal operating state.
     *     */

    public javax.cim.UnsignedInteger32 get_Recoverys() {
        CIMProperty currentProperty = getProperty(PROPERTY_RECOVERYS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RECOVERYS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property Recoverys
     * <br>
     * The number of Claim Token MAC frames received or transmitted after the Device has received a Ring Purge MAC frame. This counter signifies the number of times the ring has been purged and is being recovered back into a normal operating state.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Recoverys(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RECOVERYS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Recoverys(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RECOVERYS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Recoverys by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Recoverys(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingAdapter fco = new CIM_TokenRingAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RECOVERYS.NAME);
        if (property != null) {
            property = setPropertyValue_Recoverys(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RECOVERYS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Recoverys
     * <br>
     * The number of Claim Token MAC frames received or transmitted after the Device has received a Ring Purge MAC frame. This counter signifies the number of times the ring has been purged and is being recovered back into a normal operating state.
     */

    private static CIMProperty setPropertyValue_Recoverys(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Removes
     *     * <br>
     * The number of times the Device has received a Remove Ring Station MAC frame request. When this frame is received, the Device will enter the close state and RingState will signify this condition.
     *     */

    public javax.cim.UnsignedInteger32 get_Removes() {
        CIMProperty currentProperty = getProperty(PROPERTY_REMOVES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_REMOVES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property Removes
     * <br>
     * The number of times the Device has received a Remove Ring Station MAC frame request. When this frame is received, the Device will enter the close state and RingState will signify this condition.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Removes(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_REMOVES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Removes(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_REMOVES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Removes by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Removes(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingAdapter fco = new CIM_TokenRingAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_REMOVES.NAME);
        if (property != null) {
            property = setPropertyValue_Removes(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_REMOVES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Removes
     * <br>
     * The number of times the Device has received a Remove Ring Station MAC frame request. When this frame is received, the Device will enter the close state and RingState will signify this condition.
     */

    private static CIMProperty setPropertyValue_Removes(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RingOpenStatus
     *     * <br>
     * This property indicates the success, or the reason for failure, of the station's most recent attempt to enter the ring.
     *     */

    public javax.cim.UnsignedInteger16 get_RingOpenStatus() {
        CIMProperty currentProperty = getProperty(PROPERTY_RINGOPENSTATUS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RINGOPENSTATUS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property RingOpenStatus
     * <br>
     * This property indicates the success, or the reason for failure, of the station's most recent attempt to enter the ring.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RingOpenStatus(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RINGOPENSTATUS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RingOpenStatus(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RINGOPENSTATUS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RingOpenStatus by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RingOpenStatus(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_TokenRingAdapter fco = new CIM_TokenRingAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RINGOPENSTATUS.NAME);
        if (property != null) {
            property = setPropertyValue_RingOpenStatus(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RINGOPENSTATUS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RingOpenStatus
     * <br>
     * This property indicates the success, or the reason for failure, of the station's most recent attempt to enter the ring.
     */

    private static CIMProperty setPropertyValue_RingOpenStatus(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RingSpeed
     *     * <br>
     * The ring's bandwidth.
     *     */

    public javax.cim.UnsignedInteger16 get_RingSpeed() {
        CIMProperty currentProperty = getProperty(PROPERTY_RINGSPEED.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RINGSPEED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property RingSpeed
     * <br>
     * The ring's bandwidth.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RingSpeed(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RINGSPEED.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RingSpeed(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RINGSPEED.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RingSpeed by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RingSpeed(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_TokenRingAdapter fco = new CIM_TokenRingAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RINGSPEED.NAME);
        if (property != null) {
            property = setPropertyValue_RingSpeed(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RINGSPEED.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RingSpeed
     * <br>
     * The ring's bandwidth.
     */

    private static CIMProperty setPropertyValue_RingSpeed(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RingState
     *     * <br>
     * The current Device state with respect to entering or leaving the ring.
     *     */

    public javax.cim.UnsignedInteger16 get_RingState() {
        CIMProperty currentProperty = getProperty(PROPERTY_RINGSTATE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RINGSTATE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property RingState
     * <br>
     * The current Device state with respect to entering or leaving the ring.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RingState(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RINGSTATE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RingState(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RINGSTATE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RingState by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RingState(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_TokenRingAdapter fco = new CIM_TokenRingAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RINGSTATE.NAME);
        if (property != null) {
            property = setPropertyValue_RingState(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RINGSTATE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RingState
     * <br>
     * The current Device state with respect to entering or leaving the ring.
     */

    private static CIMProperty setPropertyValue_RingState(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property RingStatus
     *     * <br>
     * The current status which can be used to diagnose fluctuating problems that can occur on token rings, after a station has successfully been added to the ring. Before an open is completed, this object contains the value indicating "no status" (131072). (The RingState and RingOpenStatus properties are also provided for debugging problems when the station can not even enter the ring.) The property's value is a sum of values, one for each currently applicable condition. The following values are defined for various conditions: 
     * 0= No Problems Detected, 32= Ring Recovery, 64= Single Station, 256= Remove Received, 512= Reserved, 1024= Auto-Removal Error, 2048= Lobe Wire Fault, 4096= Transmit Beacon, 8192= Soft Error, 16384= Hard Error, 32768= Signal Loss, 131072= No Status, Open Not Completed.
     *     */

    public javax.cim.UnsignedInteger32 get_RingStatus() {
        CIMProperty currentProperty = getProperty(PROPERTY_RINGSTATUS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_RINGSTATUS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property RingStatus
     * <br>
     * The current status which can be used to diagnose fluctuating problems that can occur on token rings, after a station has successfully been added to the ring. Before an open is completed, this object contains the value indicating "no status" (131072). (The RingState and RingOpenStatus properties are also provided for debugging problems when the station can not even enter the ring.) The property's value is a sum of values, one for each currently applicable condition. The following values are defined for various conditions: 
     * 0= No Problems Detected, 32= Ring Recovery, 64= Single Station, 256= Remove Received, 512= Reserved, 1024= Auto-Removal Error, 2048= Lobe Wire Fault, 4096= Transmit Beacon, 8192= Soft Error, 16384= Hard Error, 32768= Signal Loss, 131072= No Status, Open Not Completed.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_RingStatus(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_RINGSTATUS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_RingStatus(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_RINGSTATUS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property RingStatus by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_RingStatus(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingAdapter fco = new CIM_TokenRingAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_RINGSTATUS.NAME);
        if (property != null) {
            property = setPropertyValue_RingStatus(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_RINGSTATUS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property RingStatus
     * <br>
     * The current status which can be used to diagnose fluctuating problems that can occur on token rings, after a station has successfully been added to the ring. Before an open is completed, this object contains the value indicating "no status" (131072). (The RingState and RingOpenStatus properties are also provided for debugging problems when the station can not even enter the ring.) The property's value is a sum of values, one for each currently applicable condition. The following values are defined for various conditions: 
     * 0= No Problems Detected, 32= Ring Recovery, 64= Single Station, 256= Remove Received, 512= Reserved, 1024= Auto-Removal Error, 2048= Lobe Wire Fault, 4096= Transmit Beacon, 8192= Soft Error, 16384= Hard Error, 32768= Signal Loss, 131072= No Status, Open Not Completed.
     */

    private static CIMProperty setPropertyValue_RingStatus(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SignalLossCount
     *     * <br>
     * The number of times this Device has detected the loss of signal condition from the ring.
     *     */

    public javax.cim.UnsignedInteger32 get_SignalLossCount() {
        CIMProperty currentProperty = getProperty(PROPERTY_SIGNALLOSSCOUNT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SIGNALLOSSCOUNT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property SignalLossCount
     * <br>
     * The number of times this Device has detected the loss of signal condition from the ring.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SignalLossCount(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SIGNALLOSSCOUNT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SignalLossCount(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SIGNALLOSSCOUNT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SignalLossCount by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SignalLossCount(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingAdapter fco = new CIM_TokenRingAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SIGNALLOSSCOUNT.NAME);
        if (property != null) {
            property = setPropertyValue_SignalLossCount(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SIGNALLOSSCOUNT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SignalLossCount
     * <br>
     * The number of times this Device has detected the loss of signal condition from the ring.
     */

    private static CIMProperty setPropertyValue_SignalLossCount(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Singles
     *     * <br>
     * The number of times the Device has sensed that it is the only station on the ring. This will happen if the Device is the first one up on a ring, or if there is a hardware problem.
     *     */

    public javax.cim.UnsignedInteger32 get_Singles() {
        CIMProperty currentProperty = getProperty(PROPERTY_SINGLES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SINGLES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property Singles
     * <br>
     * The number of times the Device has sensed that it is the only station on the ring. This will happen if the Device is the first one up on a ring, or if there is a hardware problem.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Singles(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SINGLES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_Singles(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SINGLES.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Singles by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Singles(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingAdapter fco = new CIM_TokenRingAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SINGLES.NAME);
        if (property != null) {
            property = setPropertyValue_Singles(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SINGLES.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Singles
     * <br>
     * The number of times the Device has sensed that it is the only station on the ring. This will happen if the Device is the first one up on a ring, or if there is a hardware problem.
     */

    private static CIMProperty setPropertyValue_Singles(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SoftErrors
     *     * <br>
     * The number of Soft Errors that the Device has detected. It directly corresponds to the number of Report Error MAC frames that this Device has transmitted. Soft Errors are those which are recoverable by the MAC layer protocols.
     *     */

    public javax.cim.UnsignedInteger32 get_SoftErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_SOFTERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SOFTERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property SoftErrors
     * <br>
     * The number of Soft Errors that the Device has detected. It directly corresponds to the number of Report Error MAC frames that this Device has transmitted. Soft Errors are those which are recoverable by the MAC layer protocols.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SoftErrors(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SOFTERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_SoftErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SOFTERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SoftErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SoftErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingAdapter fco = new CIM_TokenRingAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SOFTERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_SoftErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SOFTERRORS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SoftErrors
     * <br>
     * The number of Soft Errors that the Device has detected. It directly corresponds to the number of Report Error MAC frames that this Device has transmitted. Soft Errors are those which are recoverable by the MAC layer protocols.
     */

    private static CIMProperty setPropertyValue_SoftErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TokenErrors
     *     * <br>
     * This counter is incremented when a station acting as the active monitor recognizes an error condition that needs a token transmitted.
     *     */

    public javax.cim.UnsignedInteger32 get_TokenErrors() {
        CIMProperty currentProperty = getProperty(PROPERTY_TOKENERRORS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TOKENERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property TokenErrors
     * <br>
     * This counter is incremented when a station acting as the active monitor recognizes an error condition that needs a token transmitted.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TokenErrors(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TOKENERRORS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_TokenErrors(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TOKENERRORS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TokenErrors by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TokenErrors(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingAdapter fco = new CIM_TokenRingAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TOKENERRORS.NAME);
        if (property != null) {
            property = setPropertyValue_TokenErrors(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TOKENERRORS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TokenErrors
     * <br>
     * This counter is incremented when a station acting as the active monitor recognizes an error condition that needs a token transmitted.
     */

    private static CIMProperty setPropertyValue_TokenErrors(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TransmittedBeacons
     *     * <br>
     * The number of times this Device has transmitted a beacon frame.
     *     */

    public javax.cim.UnsignedInteger32 get_TransmittedBeacons() {
        CIMProperty currentProperty = getProperty(PROPERTY_TRANSMITTEDBEACONS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TRANSMITTEDBEACONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger32) currentProperty.getValue();

    }

    /**
     * Set the property TransmittedBeacons
     * <br>
     * The number of times this Device has transmitted a beacon frame.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TransmittedBeacons(javax.cim.UnsignedInteger32 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TRANSMITTEDBEACONS.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_TransmittedBeacons(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TRANSMITTEDBEACONS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TransmittedBeacons by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TransmittedBeacons(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger32 newValue) throws WbemsmtException {
        CIM_TokenRingAdapter fco = new CIM_TokenRingAdapter(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TRANSMITTEDBEACONS.NAME);
        if (property != null) {
            property = setPropertyValue_TransmittedBeacons(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TRANSMITTEDBEACONS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TransmittedBeacons
     * <br>
     * The number of times this Device has transmitted a beacon frame.
     */

    private static CIMProperty setPropertyValue_TransmittedBeacons(CIMProperty currentProperty,
            javax.cim.UnsignedInteger32 newValue) {
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
        return CIM_TokenRingAdapter.CIM_CLASS_NAME;
    }

}