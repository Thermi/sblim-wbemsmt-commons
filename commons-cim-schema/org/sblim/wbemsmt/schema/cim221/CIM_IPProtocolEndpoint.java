/**
 * CIM_IPProtocolEndpoint.java Â© Copyright IBM Corp. 2006,2007 THIS FILE IS PROVIDED UNDER THE TER
 * MS OF THE COMMON PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/cpl1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: A ProtocolEndpoint that is dedicated to
 *            running IP. generated Class
 */

package org.sblim.wbemsmt.schema.cim221;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_IPProtocolEndpoint extends CIM_ProtocolEndpoint {

    public final static String CIM_CLASS_NAME = "CIM_IPProtocolEndpoint";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Address
     * The IP address that this ProtocolEndpoint represents, formatted according to the appropriate convention as defined in the AddressType property of this class (e.g., 171.79.6.40). This single property is deprecated to replace it by specific IPv4 and v6 addresses.
     */
    public static class PROPERTY_ADDRESS {
        /**
         * name of the property Address
         */
        public final static String NAME = "Address";

    }

    /**
     * Constants of property AddressOrigin
     * AddressOrigin identifies the method by which the IP Address, Subnet Mask, and Gateway were assigned to the IPProtocolEndpoint.A value of 3 "Static" shall indicate the values were assigned manually. A value of 4 "DHCP" shall indicate the values were assigned utilizing the Dynamic Host Configuration Protocol. See RFC 2131 and related. 
     * A value of 5 "BOOTP" shall indicate the values were assigned utilizing BOOTP. See RFC 951 and related. 
     * A value of 6 "IPv4 Link Local" shall indicate the values were assigned using the IPv4 Link Local protocol. See RFC 3927.
     * A value of 7 "DHCPv6" shall indicate the values were assigned using DHCPv6. See RFC 3315. 
     * A value of 8 "IPv6 AutoConfig" shall indicate the values were assinged using the IPv6 AutoConfig Protocol. See RFC 4862.
     */
    public static class PROPERTY_ADDRESSORIGIN {
        /**
         * name of the property AddressOrigin
         */
        public final static String NAME = "AddressOrigin";

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
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Static = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Static (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Static = "Static";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DHCP = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry DHCP (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_DHCP = "DHCP";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_BOOTP = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry BOOTP (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_BOOTP = "BOOTP";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_IPv4_Link_Local = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry IPv4 Link Local (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_IPv4_Link_Local = "IPv4 Link Local";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_DHCPv6 = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry DHCPv6 (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_DHCPv6 = "DHCPv6";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_IPv6AutoConfig = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry IPv6AutoConfig (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_IPv6AutoConfig = "IPv6AutoConfig";

        /**
         * constant for value map entry ..
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
         */
        public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

        /**
         * constant for value map entry 32768..65535
         */

        /**
         * constant for value entry Vendor Reserved (corresponds to mapEntry 32768..65535 )
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

            if (VALUE_ENTRY_Static.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Static;
            }

            if (VALUE_ENTRY_DHCP.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DHCP;
            }

            if (VALUE_ENTRY_BOOTP.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_BOOTP;
            }

            if (VALUE_ENTRY_IPv4_Link_Local.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_IPv4_Link_Local;
            }

            if (VALUE_ENTRY_DHCPv6.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_DHCPv6;
            }

            if (VALUE_ENTRY_IPv6AutoConfig.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_IPv6AutoConfig;
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

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Static.intValue()) {
                return VALUE_ENTRY_Static;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DHCP.intValue()) {
                return VALUE_ENTRY_DHCP;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_BOOTP.intValue()) {
                return VALUE_ENTRY_BOOTP;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_IPv4_Link_Local.intValue()) {
                return VALUE_ENTRY_IPv4_Link_Local;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_DHCPv6.intValue()) {
                return VALUE_ENTRY_DHCPv6;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_IPv6AutoConfig.intValue()) {
                return VALUE_ENTRY_IPv6AutoConfig;
            }

            if (iValue >= 32768 || iValue <= 65535) {
                return VALUE_ENTRY_Vendor_Reserved;
            }
            return VALUE_ENTRY_DMTF_Reserved;

        }

        /**
         * ValueMap entries
         * Contains no entries that having an integer value range representation
         * 
         * The couterpart for the value entries is returned by VALUE_ENTRIES_FOR_DISPLAY
         *
         * @see \#VALUE_ENTRIES_FOR_DISPLAY
         * 
         * Value Map for the property AddressOrigin   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Not_Applicable,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Static, VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DHCP,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_BOOTP,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_IPv4_Link_Local,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_DHCPv6,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_IPv6AutoConfig };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property AddressOrigin   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Not_Applicable, VALUE_ENTRY_Static, VALUE_ENTRY_DHCP,
                VALUE_ENTRY_BOOTP, VALUE_ENTRY_IPv4_Link_Local, VALUE_ENTRY_DHCPv6,
                VALUE_ENTRY_IPv6AutoConfig, VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property AddressOrigin   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Not_Applicable, VALUE_ENTRY_Static,
                VALUE_ENTRY_DHCP, VALUE_ENTRY_BOOTP, VALUE_ENTRY_IPv4_Link_Local,
                VALUE_ENTRY_DHCPv6, VALUE_ENTRY_IPv6AutoConfig };

    }

    /**
     * Constants of property AddressType
     * An enumeration that describes the format of the Address property. It is deprecated since it is not needed, as the class contains both IPv4 and v6 addresses).
     */
    public static class PROPERTY_ADDRESSTYPE {
        /**
         * name of the property AddressType
         */
        public final static String NAME = "AddressType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_IPv4 = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry IPv4 (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_IPv4 = "IPv4";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_IPv6 = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry IPv6 (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_IPv6 = "IPv6";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_IPv4.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_IPv4;
            }

            if (VALUE_ENTRY_IPv6.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_IPv6;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_IPv4.intValue()) {
                return VALUE_ENTRY_IPv4;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_IPv6.intValue()) {
                return VALUE_ENTRY_IPv6;
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
         * Value Map for the property AddressType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_IPv4,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_IPv6 };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property AddressType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_IPv4,
                VALUE_ENTRY_IPv6 };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property AddressType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_IPv4, VALUE_ENTRY_IPv6 };

    }

    /**
     * Constants of property IPVersionSupport
     * This property explicitly defines support for different versions of the IP protocol, for this Endpoint. It is deprecated since the ProtocolIFType also provides this functionality by describing an endpoint as IPv4 only (value=4096), IPv6 only (value=4097), or IPv4/v6 (value=4098).
     */
    public static class PROPERTY_IPVERSIONSUPPORT {
        /**
         * name of the property IPVersionSupport
         */
        public final static String NAME = "IPVersionSupport";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_IPv4_Only = new javax.cim.UnsignedInteger16(
                "1");

        /**
         * constant for value entry IPv4 Only (corresponds to mapEntry 1 )
         */
        public final static String VALUE_ENTRY_IPv4_Only = "IPv4 Only";

        /**
         * constant for value map entry 2
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_IPv6_Only = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry IPv6 Only (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_IPv6_Only = "IPv6 Only";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Both_IPv4_and_IPv6 = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry Both IPv4 and IPv6 (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_Both_IPv4_and_IPv6 = "Both IPv4 and IPv6";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_IPv4_Only.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_IPv4_Only;
            }

            if (VALUE_ENTRY_IPv6_Only.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_IPv6_Only;
            }

            if (VALUE_ENTRY_Both_IPv4_and_IPv6.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Both_IPv4_and_IPv6;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_IPv4_Only.intValue()) {
                return VALUE_ENTRY_IPv4_Only;
            }

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_IPv6_Only.intValue()) {
                return VALUE_ENTRY_IPv6_Only;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Both_IPv4_and_IPv6.intValue()) {
                return VALUE_ENTRY_Both_IPv4_and_IPv6;
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
         * Value Map for the property IPVersionSupport   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_IPv4_Only,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_IPv6_Only,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_Both_IPv4_and_IPv6 };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property IPVersionSupport   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_IPv4_Only,
                VALUE_ENTRY_IPv6_Only, VALUE_ENTRY_Both_IPv4_and_IPv6 };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property IPVersionSupport   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_IPv4_Only, VALUE_ENTRY_IPv6_Only, VALUE_ENTRY_Both_IPv4_and_IPv6 };

    }

    /**
     * Constants of property IPv4Address
     * The IPv4 address that this ProtocolEndpoint represents.
     */
    public static class PROPERTY_IPV4ADDRESS {
        /**
         * name of the property IPv4Address
         */
        public final static String NAME = "IPv4Address";

    }

    /**
     * Constants of property IPv6Address
     * The IPv6 address that this ProtocolEndpoint represents.
     */
    public static class PROPERTY_IPV6ADDRESS {
        /**
         * name of the property IPv6Address
         */
        public final static String NAME = "IPv6Address";

    }

    /**
     * Constants of property PrefixLength
     * The prefix length for the IPv6 address of this Protocol Endpoint, if one is defined.
     */
    public static class PROPERTY_PREFIXLENGTH {
        /**
         * name of the property PrefixLength
         */
        public final static String NAME = "PrefixLength";

    }

    /**
     * Constants of property ProtocolIFType
     * ProtocolIFType's enumeration is limited to IP-related and reserved values for this subclass of ProtocolEndpoint.
     */
    public static class PROPERTY_PROTOCOLIFTYPE {
        /**
         * name of the property ProtocolIFType
         */
        public final static String NAME = "ProtocolIFType";

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
         * constant for value map entry 225..4095
         */

        /**
         * constant for value entry IANA Reserved (corresponds to mapEntry 225..4095 )
         */
        public final static String VALUE_ENTRY_IANA_Reserved = "IANA Reserved";

        /**
         * constant for value map entry 4096
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_IPv4 = new javax.cim.UnsignedInteger16(
                "4096");

        /**
         * constant for value entry IPv4 (corresponds to mapEntry 4096 )
         */
        public final static String VALUE_ENTRY_IPv4 = "IPv4";

        /**
         * constant for value map entry 4097
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_IPv6 = new javax.cim.UnsignedInteger16(
                "4097");

        /**
         * constant for value entry IPv6 (corresponds to mapEntry 4097 )
         */
        public final static String VALUE_ENTRY_IPv6 = "IPv6";

        /**
         * constant for value map entry 4098
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4098_FOR_VALUE_ENTRY_IPv4_v6 = new javax.cim.UnsignedInteger16(
                "4098");

        /**
         * constant for value entry IPv4/v6 (corresponds to mapEntry 4098 )
         */
        public final static String VALUE_ENTRY_IPv4_v6 = "IPv4/v6";

        /**
         * constant for value map entry 4301..32767
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry 4301..32767 )
         */
        public final static String VALUE_ENTRY_DMTF_Reserved = "DMTF Reserved";

        /**
         * constant for value map entry 32768..
         */

        /**
         * constant for value entry Vendor Reserved (corresponds to mapEntry 32768.. )
         */
        public final static String VALUE_ENTRY_Vendor_Reserved = "Vendor Reserved";

        /**
         * get the ValueMapEntry of the given value
         * @param value the value to find the ValueMapEntry for
         * @return the ValueMap entry or null if not found
         */
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_IPv4.equals(value)) {
                return VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_IPv4;
            }

            if (VALUE_ENTRY_IPv6.equals(value)) {
                return VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_IPv6;
            }

            if (VALUE_ENTRY_IPv4_v6.equals(value)) {
                return VALUE_MAP_ENTRY_4098_FOR_VALUE_ENTRY_IPv4_v6;
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

            if (iValue == VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other.intValue()) {
                return VALUE_ENTRY_Other;
            }

            if (iValue >= 225 || iValue <= 4095) {
                return VALUE_ENTRY_IANA_Reserved;
            }

            if (iValue == VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_IPv4.intValue()) {
                return VALUE_ENTRY_IPv4;
            }

            if (iValue == VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_IPv6.intValue()) {
                return VALUE_ENTRY_IPv6;
            }

            if (iValue == VALUE_MAP_ENTRY_4098_FOR_VALUE_ENTRY_IPv4_v6.intValue()) {
                return VALUE_ENTRY_IPv4_v6;
            }

            if (iValue >= 4301 || iValue <= 32767) {
                return VALUE_ENTRY_DMTF_Reserved;
            }

            if (iValue >= 32768) {
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
         * Value Map for the property ProtocolIFType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other, VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_IPv4,
                VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_IPv6,
                VALUE_MAP_ENTRY_4098_FOR_VALUE_ENTRY_IPv4_v6 };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ProtocolIFType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other,
                VALUE_ENTRY_IANA_Reserved, VALUE_ENTRY_IPv4, VALUE_ENTRY_IPv6, VALUE_ENTRY_IPv4_v6,
                VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ProtocolIFType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_IPv4, VALUE_ENTRY_IPv6, VALUE_ENTRY_IPv4_v6 };

    }

    /**
     * Constants of property SubnetMask
     * The mask for the IPv4 address of this ProtocolEndpoint, if one is defined.
     */
    public static class PROPERTY_SUBNETMASK {
        /**
         * name of the property SubnetMask
         */
        public final static String NAME = "SubnetMask";

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
     *   A ProtocolEndpoint that is dedicated to running IP.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_IPProtocolEndpoint(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A ProtocolEndpoint that is dedicated to running IP.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_IPProtocolEndpoint(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_IPProtocolEndpoint() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Address", new CIMProperty("Address", CIMDataType.STRING_T, null));
        propertiesToCheck.put("AddressOrigin", new CIMProperty("AddressOrigin",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("AddressType", new CIMProperty("AddressType", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("IPVersionSupport", new CIMProperty("IPVersionSupport",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("IPv4Address", new CIMProperty("IPv4Address", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("IPv6Address", new CIMProperty("IPv6Address", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("PrefixLength", new CIMProperty("PrefixLength", CIMDataType.UINT8_T,
                null));
        propertiesToCheck.put("ProtocolIFType", new CIMProperty("ProtocolIFType",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("SubnetMask", new CIMProperty("SubnetMask", CIMDataType.STRING_T,
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
     * Get the property Address
     *     * <br>
     * The IP address that this ProtocolEndpoint represents, formatted according to the appropriate convention as defined in the AddressType property of this class (e.g., 171.79.6.40). This single property is deprecated to replace it by specific IPv4 and v6 addresses.
     *     */

    public String get_Address() {
        CIMProperty currentProperty = getProperty(PROPERTY_ADDRESS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ADDRESS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Address
     * <br>
     * The IP address that this ProtocolEndpoint represents, formatted according to the appropriate convention as defined in the AddressType property of this class (e.g., 171.79.6.40). This single property is deprecated to replace it by specific IPv4 and v6 addresses.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Address(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ADDRESS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Address(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ADDRESS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Address by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Address(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_IPProtocolEndpoint fco = new CIM_IPProtocolEndpoint(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ADDRESS.NAME);
        if (property != null) {
            property = setPropertyValue_Address(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ADDRESS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Address
     * <br>
     * The IP address that this ProtocolEndpoint represents, formatted according to the appropriate convention as defined in the AddressType property of this class (e.g., 171.79.6.40). This single property is deprecated to replace it by specific IPv4 and v6 addresses.
     */

    private static CIMProperty setPropertyValue_Address(CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property AddressOrigin
     *     * <br>
     * AddressOrigin identifies the method by which the IP Address, Subnet Mask, and Gateway were assigned to the IPProtocolEndpoint.A value of 3 "Static" shall indicate the values were assigned manually. A value of 4 "DHCP" shall indicate the values were assigned utilizing the Dynamic Host Configuration Protocol. See RFC 2131 and related. 
     * A value of 5 "BOOTP" shall indicate the values were assigned utilizing BOOTP. See RFC 951 and related. 
     * A value of 6 "IPv4 Link Local" shall indicate the values were assigned using the IPv4 Link Local protocol. See RFC 3927.
     * A value of 7 "DHCPv6" shall indicate the values were assigned using DHCPv6. See RFC 3315. 
     * A value of 8 "IPv6 AutoConfig" shall indicate the values were assinged using the IPv6 AutoConfig Protocol. See RFC 4862.
     *     */

    public javax.cim.UnsignedInteger16 get_AddressOrigin() {
        CIMProperty currentProperty = getProperty(PROPERTY_ADDRESSORIGIN.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ADDRESSORIGIN.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property AddressOrigin
     * <br>
     * AddressOrigin identifies the method by which the IP Address, Subnet Mask, and Gateway were assigned to the IPProtocolEndpoint.A value of 3 "Static" shall indicate the values were assigned manually. A value of 4 "DHCP" shall indicate the values were assigned utilizing the Dynamic Host Configuration Protocol. See RFC 2131 and related. 
     * A value of 5 "BOOTP" shall indicate the values were assigned utilizing BOOTP. See RFC 951 and related. 
     * A value of 6 "IPv4 Link Local" shall indicate the values were assigned using the IPv4 Link Local protocol. See RFC 3927.
     * A value of 7 "DHCPv6" shall indicate the values were assigned using DHCPv6. See RFC 3315. 
     * A value of 8 "IPv6 AutoConfig" shall indicate the values were assinged using the IPv6 AutoConfig Protocol. See RFC 4862.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AddressOrigin(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ADDRESSORIGIN.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_AddressOrigin(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ADDRESSORIGIN.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AddressOrigin by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AddressOrigin(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_IPProtocolEndpoint fco = new CIM_IPProtocolEndpoint(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ADDRESSORIGIN.NAME);
        if (property != null) {
            property = setPropertyValue_AddressOrigin(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ADDRESSORIGIN.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AddressOrigin
     * <br>
     * AddressOrigin identifies the method by which the IP Address, Subnet Mask, and Gateway were assigned to the IPProtocolEndpoint.A value of 3 "Static" shall indicate the values were assigned manually. A value of 4 "DHCP" shall indicate the values were assigned utilizing the Dynamic Host Configuration Protocol. See RFC 2131 and related. 
     * A value of 5 "BOOTP" shall indicate the values were assigned utilizing BOOTP. See RFC 951 and related. 
     * A value of 6 "IPv4 Link Local" shall indicate the values were assigned using the IPv4 Link Local protocol. See RFC 3927.
     * A value of 7 "DHCPv6" shall indicate the values were assigned using DHCPv6. See RFC 3315. 
     * A value of 8 "IPv6 AutoConfig" shall indicate the values were assinged using the IPv6 AutoConfig Protocol. See RFC 4862.
     */

    private static CIMProperty setPropertyValue_AddressOrigin(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property AddressType
     *     * <br>
     * An enumeration that describes the format of the Address property. It is deprecated since it is not needed, as the class contains both IPv4 and v6 addresses).
     *     */

    public javax.cim.UnsignedInteger16 get_AddressType() {
        CIMProperty currentProperty = getProperty(PROPERTY_ADDRESSTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ADDRESSTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property AddressType
     * <br>
     * An enumeration that describes the format of the Address property. It is deprecated since it is not needed, as the class contains both IPv4 and v6 addresses).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AddressType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ADDRESSTYPE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_AddressType(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ADDRESSTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AddressType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AddressType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_IPProtocolEndpoint fco = new CIM_IPProtocolEndpoint(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ADDRESSTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_AddressType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ADDRESSTYPE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AddressType
     * <br>
     * An enumeration that describes the format of the Address property. It is deprecated since it is not needed, as the class contains both IPv4 and v6 addresses).
     */

    private static CIMProperty setPropertyValue_AddressType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property IPVersionSupport
     *     * <br>
     * This property explicitly defines support for different versions of the IP protocol, for this Endpoint. It is deprecated since the ProtocolIFType also provides this functionality by describing an endpoint as IPv4 only (value=4096), IPv6 only (value=4097), or IPv4/v6 (value=4098).
     *     */

    public javax.cim.UnsignedInteger16 get_IPVersionSupport() {
        CIMProperty currentProperty = getProperty(PROPERTY_IPVERSIONSUPPORT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_IPVERSIONSUPPORT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property IPVersionSupport
     * <br>
     * This property explicitly defines support for different versions of the IP protocol, for this Endpoint. It is deprecated since the ProtocolIFType also provides this functionality by describing an endpoint as IPv4 only (value=4096), IPv6 only (value=4097), or IPv4/v6 (value=4098).
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_IPVersionSupport(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_IPVERSIONSUPPORT.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_IPVersionSupport(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_IPVERSIONSUPPORT.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property IPVersionSupport by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IPVersionSupport(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_IPProtocolEndpoint fco = new CIM_IPProtocolEndpoint(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_IPVERSIONSUPPORT.NAME);
        if (property != null) {
            property = setPropertyValue_IPVersionSupport(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_IPVERSIONSUPPORT.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property IPVersionSupport
     * <br>
     * This property explicitly defines support for different versions of the IP protocol, for this Endpoint. It is deprecated since the ProtocolIFType also provides this functionality by describing an endpoint as IPv4 only (value=4096), IPv6 only (value=4097), or IPv4/v6 (value=4098).
     */

    private static CIMProperty setPropertyValue_IPVersionSupport(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property IPv4Address
     *     * <br>
     * The IPv4 address that this ProtocolEndpoint represents.
     *     */

    public String get_IPv4Address() {
        CIMProperty currentProperty = getProperty(PROPERTY_IPV4ADDRESS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_IPV4ADDRESS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property IPv4Address
     * <br>
     * The IPv4 address that this ProtocolEndpoint represents.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_IPv4Address(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_IPV4ADDRESS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_IPv4Address(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_IPV4ADDRESS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property IPv4Address by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IPv4Address(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_IPProtocolEndpoint fco = new CIM_IPProtocolEndpoint(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_IPV4ADDRESS.NAME);
        if (property != null) {
            property = setPropertyValue_IPv4Address(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_IPV4ADDRESS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property IPv4Address
     * <br>
     * The IPv4 address that this ProtocolEndpoint represents.
     */

    private static CIMProperty setPropertyValue_IPv4Address(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property IPv6Address
     *     * <br>
     * The IPv6 address that this ProtocolEndpoint represents.
     *     */

    public String get_IPv6Address() {
        CIMProperty currentProperty = getProperty(PROPERTY_IPV6ADDRESS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_IPV6ADDRESS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property IPv6Address
     * <br>
     * The IPv6 address that this ProtocolEndpoint represents.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_IPv6Address(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_IPV6ADDRESS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_IPv6Address(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_IPV6ADDRESS.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property IPv6Address by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_IPv6Address(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_IPProtocolEndpoint fco = new CIM_IPProtocolEndpoint(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_IPV6ADDRESS.NAME);
        if (property != null) {
            property = setPropertyValue_IPv6Address(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_IPV6ADDRESS.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property IPv6Address
     * <br>
     * The IPv6 address that this ProtocolEndpoint represents.
     */

    private static CIMProperty setPropertyValue_IPv6Address(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property PrefixLength
     *     * <br>
     * The prefix length for the IPv6 address of this Protocol Endpoint, if one is defined.
     *     */

    public javax.cim.UnsignedInteger8 get_PrefixLength() {
        CIMProperty currentProperty = getProperty(PROPERTY_PREFIXLENGTH.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PREFIXLENGTH.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger8) currentProperty.getValue();

    }

    /**
     * Set the property PrefixLength
     * <br>
     * The prefix length for the IPv6 address of this Protocol Endpoint, if one is defined.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_PrefixLength(javax.cim.UnsignedInteger8 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PREFIXLENGTH.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_PrefixLength(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PREFIXLENGTH.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property PrefixLength by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_PrefixLength(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger8 newValue) throws WbemsmtException {
        CIM_IPProtocolEndpoint fco = new CIM_IPProtocolEndpoint(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PREFIXLENGTH.NAME);
        if (property != null) {
            property = setPropertyValue_PrefixLength(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PREFIXLENGTH.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property PrefixLength
     * <br>
     * The prefix length for the IPv6 address of this Protocol Endpoint, if one is defined.
     */

    private static CIMProperty setPropertyValue_PrefixLength(CIMProperty currentProperty,
            javax.cim.UnsignedInteger8 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property ProtocolIFType
     *     * <br>
     * ProtocolIFType's enumeration is limited to IP-related and reserved values for this subclass of ProtocolEndpoint.
     *     */

    public javax.cim.UnsignedInteger16 get_ProtocolIFType() {
        CIMProperty currentProperty = getProperty(PROPERTY_PROTOCOLIFTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PROTOCOLIFTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ProtocolIFType
     * <br>
     * ProtocolIFType's enumeration is limited to IP-related and reserved values for this subclass of ProtocolEndpoint.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ProtocolIFType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PROTOCOLIFTYPE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ProtocolIFType(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PROTOCOLIFTYPE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ProtocolIFType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ProtocolIFType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_IPProtocolEndpoint fco = new CIM_IPProtocolEndpoint(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PROTOCOLIFTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_ProtocolIFType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PROTOCOLIFTYPE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ProtocolIFType
     * <br>
     * ProtocolIFType's enumeration is limited to IP-related and reserved values for this subclass of ProtocolEndpoint.
     */

    private static CIMProperty setPropertyValue_ProtocolIFType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property SubnetMask
     *     * <br>
     * The mask for the IPv4 address of this ProtocolEndpoint, if one is defined.
     *     */

    public String get_SubnetMask() {
        CIMProperty currentProperty = getProperty(PROPERTY_SUBNETMASK.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_SUBNETMASK.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property SubnetMask
     * <br>
     * The mask for the IPv4 address of this ProtocolEndpoint, if one is defined.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_SubnetMask(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_SUBNETMASK.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_SubnetMask(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_SUBNETMASK.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property SubnetMask by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_SubnetMask(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_IPProtocolEndpoint fco = new CIM_IPProtocolEndpoint(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_SUBNETMASK.NAME);
        if (property != null) {
            property = setPropertyValue_SubnetMask(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_SUBNETMASK.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property SubnetMask
     * <br>
     * The mask for the IPv4 address of this ProtocolEndpoint, if one is defined.
     */

    private static CIMProperty setPropertyValue_SubnetMask(CIMProperty currentProperty,
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
        return CIM_IPProtocolEndpoint.CIM_CLASS_NAME;
    }

}