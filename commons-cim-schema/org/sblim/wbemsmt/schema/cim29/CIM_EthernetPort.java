/** 
 * CIM_EthernetPort.java
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
 * Description: Capabilities and management of an EthernetPort.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_EthernetPort extends CIM_NetworkPort {

    public final static String CIM_CLASS_NAME = "CIM_EthernetPort";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Capabilities
     * Capabilities of the EthernetPort. For example, the Device may support AlertOnLan, WakeOnLan, Load Balancing and/or FailOver. If failover or load balancing capabilities are listed, a SpareGroup (failover) or ExtraCapacityGroup (load balancing) should also be defined to completely describe the capability.
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
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@5f745f74
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
     * An array of free-form strings providing more detailed explanations for any of the EthernetPort features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
     */
    public static class PROPERTY_CAPABILITYDESCRIPTIONS {
        /**
         * name of the property CapabilityDescriptions
         */
        public final static String NAME = "CapabilityDescriptions";

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
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@1eda1eda
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
     * Ethernet/802.3 MAC addresses formatted as twelve hexadecimal digits (e.g. "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order. (Thus, the Group address bit is found in the low order bit of the first character of the string.)
     */
    public static class PROPERTY_NETWORKADDRESSES {
        /**
         * name of the property NetworkAddresses
         */
        public final static String NAME = "NetworkAddresses";

    }

    /**
     * Constants of property OtherEnabledCapabilities
     * An array of free-form strings providing more detailed explanations for any of the enabled capabilities that are specified as 'Other'.
     */
    public static class PROPERTY_OTHERENABLEDCAPABILITIES {
        /**
         * name of the property OtherEnabledCapabilities
         */
        public final static String NAME = "OtherEnabledCapabilities";

    }

    /**
     * Constants of property PortType
     * The specific mode currently enabled for the Port. When set to 1 ("Other"), the related property OtherPortType contains a string description of the port's type.
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
         * constant for value map entry 50
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_10BaseT = new javax.cim.UnsignedInteger16(
                "50");

        /**
         * constant for value entry 10BaseT (corresponds to mapEntry 50 )
         */
        public final static String VALUE_ENTRY_10BaseT = "10BaseT";

        /**
         * constant for value map entry 51
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_10_100BaseT = new javax.cim.UnsignedInteger16(
                "51");

        /**
         * constant for value entry 10-100BaseT (corresponds to mapEntry 51 )
         */
        public final static String VALUE_ENTRY_10_100BaseT = "10-100BaseT";

        /**
         * constant for value map entry 52
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_100BaseT = new javax.cim.UnsignedInteger16(
                "52");

        /**
         * constant for value entry 100BaseT (corresponds to mapEntry 52 )
         */
        public final static String VALUE_ENTRY_100BaseT = "100BaseT";

        /**
         * constant for value map entry 53
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_1000BaseT = new javax.cim.UnsignedInteger16(
                "53");

        /**
         * constant for value entry 1000BaseT (corresponds to mapEntry 53 )
         */
        public final static String VALUE_ENTRY_1000BaseT = "1000BaseT";

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
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@712a712a
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_10BaseT.equals(value)) {
                return VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_10BaseT;
            }

            if (VALUE_ENTRY_10_100BaseT.equals(value)) {
                return VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_10_100BaseT;
            }

            if (VALUE_ENTRY_100BaseT.equals(value)) {
                return VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_100BaseT;
            }

            if (VALUE_ENTRY_1000BaseT.equals(value)) {
                return VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_1000BaseT;
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

            if (iValue == VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_10BaseT.intValue()) {
                return VALUE_ENTRY_10BaseT;
            }

            if (iValue == VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_10_100BaseT.intValue()) {
                return VALUE_ENTRY_10_100BaseT;
            }

            if (iValue == VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_100BaseT.intValue()) {
                return VALUE_ENTRY_100BaseT;
            }

            if (iValue == VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_1000BaseT.intValue()) {
                return VALUE_ENTRY_1000BaseT;
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
                VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_10BaseT,
                VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_10_100BaseT,
                VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_100BaseT,
                VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_1000BaseT };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property PortType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_10BaseT, VALUE_ENTRY_10_100BaseT, VALUE_ENTRY_100BaseT,
                VALUE_ENTRY_1000BaseT, VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property PortType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_10BaseT, VALUE_ENTRY_10_100BaseT,
                VALUE_ENTRY_100BaseT, VALUE_ENTRY_1000BaseT };

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_NetworkPort.getPackages();

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
     *   Capabilities and management of an EthernetPort.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_EthernetPort(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   Capabilities and management of an EthernetPort.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_EthernetPort(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_EthernetPort() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Capabilities", new CIMProperty("Capabilities",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("CapabilityDescriptions", new CIMProperty("CapabilityDescriptions",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("EnabledCapabilities", new CIMProperty("EnabledCapabilities",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("MaxDataSize", new CIMProperty("MaxDataSize", CIMDataType.UINT32_T,
                null));
        propertiesToCheck.put("NetworkAddresses", new CIMProperty("NetworkAddresses",
                CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("OtherEnabledCapabilities", new CIMProperty(
                "OtherEnabledCapabilities", CIMDataType.STRING_ARRAY_T, null));
        propertiesToCheck.put("PortType", new CIMProperty("PortType", CIMDataType.UINT16_T, null));

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
     * Get the property Capabilities
     *     * <br>
     * Capabilities of the EthernetPort. For example, the Device may support AlertOnLan, WakeOnLan, Load Balancing and/or FailOver. If failover or load balancing capabilities are listed, a SpareGroup (failover) or ExtraCapacityGroup (load balancing) should also be defined to completely describe the capability.
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
     * Capabilities of the EthernetPort. For example, the Device may support AlertOnLan, WakeOnLan, Load Balancing and/or FailOver. If failover or load balancing capabilities are listed, a SpareGroup (failover) or ExtraCapacityGroup (load balancing) should also be defined to completely describe the capability.
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
        CIM_EthernetPort fco = new CIM_EthernetPort(client, namespace);
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
     * Capabilities of the EthernetPort. For example, the Device may support AlertOnLan, WakeOnLan, Load Balancing and/or FailOver. If failover or load balancing capabilities are listed, a SpareGroup (failover) or ExtraCapacityGroup (load balancing) should also be defined to completely describe the capability.
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
     * An array of free-form strings providing more detailed explanations for any of the EthernetPort features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
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
     * An array of free-form strings providing more detailed explanations for any of the EthernetPort features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
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
        CIM_EthernetPort fco = new CIM_EthernetPort(client, namespace);
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
     * An array of free-form strings providing more detailed explanations for any of the EthernetPort features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
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
        CIM_EthernetPort fco = new CIM_EthernetPort(client, namespace);
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
        CIM_EthernetPort fco = new CIM_EthernetPort(client, namespace);
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
        CIM_EthernetPort fco = new CIM_EthernetPort(client, namespace);
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
     * Get the property OtherEnabledCapabilities
     *     * <br>
     * An array of free-form strings providing more detailed explanations for any of the enabled capabilities that are specified as 'Other'.
     *     */

    public String[] get_OtherEnabledCapabilities() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERENABLEDCAPABILITIES.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERENABLEDCAPABILITIES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String[]) currentProperty.getValue();

    }

    /**
     * Set the property OtherEnabledCapabilities
     * <br>
     * An array of free-form strings providing more detailed explanations for any of the enabled capabilities that are specified as 'Other'.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherEnabledCapabilities(String[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERENABLEDCAPABILITIES.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherEnabledCapabilities(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERENABLEDCAPABILITIES.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherEnabledCapabilities by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherEnabledCapabilities(WBEMClient client, String namespace,
            String[] newValue) throws WbemsmtException {
        CIM_EthernetPort fco = new CIM_EthernetPort(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERENABLEDCAPABILITIES.NAME);
        if (property != null) {
            property = setPropertyValue_OtherEnabledCapabilities(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERENABLEDCAPABILITIES.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherEnabledCapabilities
     * <br>
     * An array of free-form strings providing more detailed explanations for any of the enabled capabilities that are specified as 'Other'.
     */

    private static CIMProperty setPropertyValue_OtherEnabledCapabilities(
            CIMProperty currentProperty, String[] newValue) {
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
     * The specific mode currently enabled for the Port. When set to 1 ("Other"), the related property OtherPortType contains a string description of the port's type.
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
     * The specific mode currently enabled for the Port. When set to 1 ("Other"), the related property OtherPortType contains a string description of the port's type.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PortType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PORTTYPE.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_PortType(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
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
        CIM_EthernetPort fco = new CIM_EthernetPort(client, namespace);
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
     * The specific mode currently enabled for the Port. When set to 1 ("Other"), the related property OtherPortType contains a string description of the port's type.
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
        return CIM_EthernetPort.CIM_CLASS_NAME;
    }

}