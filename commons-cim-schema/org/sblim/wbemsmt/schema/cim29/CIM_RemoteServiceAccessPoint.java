/** 
 * CIM_RemoteServiceAccessPoint.java
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
 * Description: RemoteServiceAccessPoint describes access and/or addressing information for a remote connection, that is known to a 'local' network element. This information is scoped/contained by the 'local' network element, since this is the context in which it is 'remote'. 
 * 
 * Why the remote access point is relevant and information on its use are described by subclassing RemoteService AccessPoint, or by associating to it.
 * 
 * generated Class
 */

package org.sblim.wbemsmt.schema.cim29;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_RemoteServiceAccessPoint extends CIM_ServiceAccessPoint {

    public final static String CIM_CLASS_NAME = "CIM_RemoteServiceAccessPoint";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property AccessInfo
     * Access and/or addressing information for a remote connection. This can be a host name, network address or similar information.
     */
    public static class PROPERTY_ACCESSINFO {
        /**
         * name of the property AccessInfo
         */
        public final static String NAME = "AccessInfo";

    }

    /**
     * Constants of property InfoFormat
     * An enumerated integer describing the format and interpretation of the AccessInfo property.
     */
    public static class PROPERTY_INFOFORMAT {
        /**
         * name of the property InfoFormat
         */
        public final static String NAME = "InfoFormat";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Host_Name = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Host Name (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Host_Name = "Host Name";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_IPv4_Address = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry IPv4 Address (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_IPv4_Address = "IPv4 Address";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_IPv6_Address = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry IPv6 Address (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_IPv6_Address = "IPv6 Address";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_IPX_Address = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry IPX Address (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_IPX_Address = "IPX Address";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_DECnet_Address = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry DECnet Address (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_DECnet_Address = "DECnet Address";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SNA_Address = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry SNA Address (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_SNA_Address = "SNA Address";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Autonomous_System_Number = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry Autonomous System Number (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_Autonomous_System_Number = "Autonomous System Number";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_MPLS_Label = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry MPLS Label (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_MPLS_Label = "MPLS Label";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_IPv4_Subnet_Address = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry IPv4 Subnet Address (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_IPv4_Subnet_Address = "IPv4 Subnet Address";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_IPv6_Subnet_Address = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry IPv6 Subnet Address (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_IPv6_Subnet_Address = "IPv6 Subnet Address";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_IPv4_Address_Range = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry IPv4 Address Range (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_IPv4_Address_Range = "IPv4 Address Range";

        /**
         * constant for value map entry 13
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_IPv6_Address_Range = new javax.cim.UnsignedInteger16(
                "13");

        /**
         * constant for value entry IPv6 Address Range (corresponds to mapEntry 13 )
         */
        public final static String VALUE_ENTRY_IPv6_Address_Range = "IPv6 Address Range";

        /**
         * constant for value map entry 100
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Dial_String = new javax.cim.UnsignedInteger16(
                "100");

        /**
         * constant for value entry Dial String (corresponds to mapEntry 100 )
         */
        public final static String VALUE_ENTRY_Dial_String = "Dial String";

        /**
         * constant for value map entry 101
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Ethernet_Address = new javax.cim.UnsignedInteger16(
                "101");

        /**
         * constant for value entry Ethernet Address (corresponds to mapEntry 101 )
         */
        public final static String VALUE_ENTRY_Ethernet_Address = "Ethernet Address";

        /**
         * constant for value map entry 102
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_Token_Ring_Address = new javax.cim.UnsignedInteger16(
                "102");

        /**
         * constant for value entry Token Ring Address (corresponds to mapEntry 102 )
         */
        public final static String VALUE_ENTRY_Token_Ring_Address = "Token Ring Address";

        /**
         * constant for value map entry 103
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_ATM_Address = new javax.cim.UnsignedInteger16(
                "103");

        /**
         * constant for value entry ATM Address (corresponds to mapEntry 103 )
         */
        public final static String VALUE_ENTRY_ATM_Address = "ATM Address";

        /**
         * constant for value map entry 104
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_Frame_Relay_Address = new javax.cim.UnsignedInteger16(
                "104");

        /**
         * constant for value entry Frame Relay Address (corresponds to mapEntry 104 )
         */
        public final static String VALUE_ENTRY_Frame_Relay_Address = "Frame Relay Address";

        /**
         * constant for value map entry 200
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_200_FOR_VALUE_ENTRY_URL = new javax.cim.UnsignedInteger16(
                "200");

        /**
         * constant for value entry URL (corresponds to mapEntry 200 )
         */
        public final static String VALUE_ENTRY_URL = "URL";

        /**
         * constant for value map entry 201
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_201_FOR_VALUE_ENTRY_FQDN = new javax.cim.UnsignedInteger16(
                "201");

        /**
         * constant for value entry FQDN (corresponds to mapEntry 201 )
         */
        public final static String VALUE_ENTRY_FQDN = "FQDN";

        /**
         * constant for value map entry 202
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_202_FOR_VALUE_ENTRY_User_FQDN = new javax.cim.UnsignedInteger16(
                "202");

        /**
         * constant for value entry User FQDN (corresponds to mapEntry 202 )
         */
        public final static String VALUE_ENTRY_User_FQDN = "User FQDN";

        /**
         * constant for value map entry 203
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_203_FOR_VALUE_ENTRY_DER_ASN1_DN = new javax.cim.UnsignedInteger16(
                "203");

        /**
         * constant for value entry DER ASN1 DN (corresponds to mapEntry 203 )
         */
        public final static String VALUE_ENTRY_DER_ASN1_DN = "DER ASN1 DN";

        /**
         * constant for value map entry 204
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_204_FOR_VALUE_ENTRY_DER_ASN1_GN = new javax.cim.UnsignedInteger16(
                "204");

        /**
         * constant for value entry DER ASN1 GN (corresponds to mapEntry 204 )
         */
        public final static String VALUE_ENTRY_DER_ASN1_GN = "DER ASN1 GN";

        /**
         * constant for value map entry 205
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_205_FOR_VALUE_ENTRY_Key_ID = new javax.cim.UnsignedInteger16(
                "205");

        /**
         * constant for value entry Key ID (corresponds to mapEntry 205 )
         */
        public final static String VALUE_ENTRY_Key_ID = "Key ID";

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
        //org.sblim.wbemsmt.dcg.generator.DCGContextUtil$Wrapper@7db67db6
        public static javax.cim.UnsignedInteger16 getValueMapEntry(String value) {

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Host_Name.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Host_Name;
            }

            if (VALUE_ENTRY_IPv4_Address.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_IPv4_Address;
            }

            if (VALUE_ENTRY_IPv6_Address.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_IPv6_Address;
            }

            if (VALUE_ENTRY_IPX_Address.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_IPX_Address;
            }

            if (VALUE_ENTRY_DECnet_Address.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_DECnet_Address;
            }

            if (VALUE_ENTRY_SNA_Address.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SNA_Address;
            }

            if (VALUE_ENTRY_Autonomous_System_Number.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Autonomous_System_Number;
            }

            if (VALUE_ENTRY_MPLS_Label.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_MPLS_Label;
            }

            if (VALUE_ENTRY_IPv4_Subnet_Address.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_IPv4_Subnet_Address;
            }

            if (VALUE_ENTRY_IPv6_Subnet_Address.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_IPv6_Subnet_Address;
            }

            if (VALUE_ENTRY_IPv4_Address_Range.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_IPv4_Address_Range;
            }

            if (VALUE_ENTRY_IPv6_Address_Range.equals(value)) {
                return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_IPv6_Address_Range;
            }

            if (VALUE_ENTRY_Dial_String.equals(value)) {
                return VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Dial_String;
            }

            if (VALUE_ENTRY_Ethernet_Address.equals(value)) {
                return VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Ethernet_Address;
            }

            if (VALUE_ENTRY_Token_Ring_Address.equals(value)) {
                return VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_Token_Ring_Address;
            }

            if (VALUE_ENTRY_ATM_Address.equals(value)) {
                return VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_ATM_Address;
            }

            if (VALUE_ENTRY_Frame_Relay_Address.equals(value)) {
                return VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_Frame_Relay_Address;
            }

            if (VALUE_ENTRY_URL.equals(value)) {
                return VALUE_MAP_ENTRY_200_FOR_VALUE_ENTRY_URL;
            }

            if (VALUE_ENTRY_FQDN.equals(value)) {
                return VALUE_MAP_ENTRY_201_FOR_VALUE_ENTRY_FQDN;
            }

            if (VALUE_ENTRY_User_FQDN.equals(value)) {
                return VALUE_MAP_ENTRY_202_FOR_VALUE_ENTRY_User_FQDN;
            }

            if (VALUE_ENTRY_DER_ASN1_DN.equals(value)) {
                return VALUE_MAP_ENTRY_203_FOR_VALUE_ENTRY_DER_ASN1_DN;
            }

            if (VALUE_ENTRY_DER_ASN1_GN.equals(value)) {
                return VALUE_MAP_ENTRY_204_FOR_VALUE_ENTRY_DER_ASN1_GN;
            }

            if (VALUE_ENTRY_Key_ID.equals(value)) {
                return VALUE_MAP_ENTRY_205_FOR_VALUE_ENTRY_Key_ID;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Host_Name.intValue()) {
                return VALUE_ENTRY_Host_Name;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_IPv4_Address.intValue()) {
                return VALUE_ENTRY_IPv4_Address;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_IPv6_Address.intValue()) {
                return VALUE_ENTRY_IPv6_Address;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_IPX_Address.intValue()) {
                return VALUE_ENTRY_IPX_Address;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_DECnet_Address.intValue()) {
                return VALUE_ENTRY_DECnet_Address;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SNA_Address.intValue()) {
                return VALUE_ENTRY_SNA_Address;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Autonomous_System_Number.intValue()) {
                return VALUE_ENTRY_Autonomous_System_Number;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_MPLS_Label.intValue()) {
                return VALUE_ENTRY_MPLS_Label;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_IPv4_Subnet_Address.intValue()) {
                return VALUE_ENTRY_IPv4_Subnet_Address;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_IPv6_Subnet_Address.intValue()) {
                return VALUE_ENTRY_IPv6_Subnet_Address;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_IPv4_Address_Range.intValue()) {
                return VALUE_ENTRY_IPv4_Address_Range;
            }

            if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_IPv6_Address_Range.intValue()) {
                return VALUE_ENTRY_IPv6_Address_Range;
            }

            if (iValue == VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Dial_String.intValue()) {
                return VALUE_ENTRY_Dial_String;
            }

            if (iValue == VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Ethernet_Address.intValue()) {
                return VALUE_ENTRY_Ethernet_Address;
            }

            if (iValue == VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_Token_Ring_Address.intValue()) {
                return VALUE_ENTRY_Token_Ring_Address;
            }

            if (iValue == VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_ATM_Address.intValue()) {
                return VALUE_ENTRY_ATM_Address;
            }

            if (iValue == VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_Frame_Relay_Address.intValue()) {
                return VALUE_ENTRY_Frame_Relay_Address;
            }

            if (iValue == VALUE_MAP_ENTRY_200_FOR_VALUE_ENTRY_URL.intValue()) {
                return VALUE_ENTRY_URL;
            }

            if (iValue == VALUE_MAP_ENTRY_201_FOR_VALUE_ENTRY_FQDN.intValue()) {
                return VALUE_ENTRY_FQDN;
            }

            if (iValue == VALUE_MAP_ENTRY_202_FOR_VALUE_ENTRY_User_FQDN.intValue()) {
                return VALUE_ENTRY_User_FQDN;
            }

            if (iValue == VALUE_MAP_ENTRY_203_FOR_VALUE_ENTRY_DER_ASN1_DN.intValue()) {
                return VALUE_ENTRY_DER_ASN1_DN;
            }

            if (iValue == VALUE_MAP_ENTRY_204_FOR_VALUE_ENTRY_DER_ASN1_GN.intValue()) {
                return VALUE_ENTRY_DER_ASN1_GN;
            }

            if (iValue == VALUE_MAP_ENTRY_205_FOR_VALUE_ENTRY_Key_ID.intValue()) {
                return VALUE_ENTRY_Key_ID;
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
         * Value Map for the property InfoFormat   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Host_Name,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_IPv4_Address,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_IPv6_Address,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_IPX_Address,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_DECnet_Address,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SNA_Address,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_Autonomous_System_Number,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_MPLS_Label,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_IPv4_Subnet_Address,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_IPv6_Subnet_Address,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_IPv4_Address_Range,
                VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_IPv6_Address_Range,
                VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Dial_String,
                VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Ethernet_Address,
                VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_Token_Ring_Address,
                VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_ATM_Address,
                VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_Frame_Relay_Address,
                VALUE_MAP_ENTRY_200_FOR_VALUE_ENTRY_URL, VALUE_MAP_ENTRY_201_FOR_VALUE_ENTRY_FQDN,
                VALUE_MAP_ENTRY_202_FOR_VALUE_ENTRY_User_FQDN,
                VALUE_MAP_ENTRY_203_FOR_VALUE_ENTRY_DER_ASN1_DN,
                VALUE_MAP_ENTRY_204_FOR_VALUE_ENTRY_DER_ASN1_GN,
                VALUE_MAP_ENTRY_205_FOR_VALUE_ENTRY_Key_ID };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property InfoFormat   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Other, VALUE_ENTRY_Host_Name,
                VALUE_ENTRY_IPv4_Address, VALUE_ENTRY_IPv6_Address, VALUE_ENTRY_IPX_Address,
                VALUE_ENTRY_DECnet_Address, VALUE_ENTRY_SNA_Address,
                VALUE_ENTRY_Autonomous_System_Number, VALUE_ENTRY_MPLS_Label,
                VALUE_ENTRY_IPv4_Subnet_Address, VALUE_ENTRY_IPv6_Subnet_Address,
                VALUE_ENTRY_IPv4_Address_Range, VALUE_ENTRY_IPv6_Address_Range,
                VALUE_ENTRY_Dial_String, VALUE_ENTRY_Ethernet_Address,
                VALUE_ENTRY_Token_Ring_Address, VALUE_ENTRY_ATM_Address,
                VALUE_ENTRY_Frame_Relay_Address, VALUE_ENTRY_URL, VALUE_ENTRY_FQDN,
                VALUE_ENTRY_User_FQDN, VALUE_ENTRY_DER_ASN1_DN, VALUE_ENTRY_DER_ASN1_GN,
                VALUE_ENTRY_Key_ID, VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property InfoFormat   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Other,
                VALUE_ENTRY_Host_Name, VALUE_ENTRY_IPv4_Address, VALUE_ENTRY_IPv6_Address,
                VALUE_ENTRY_IPX_Address, VALUE_ENTRY_DECnet_Address, VALUE_ENTRY_SNA_Address,
                VALUE_ENTRY_Autonomous_System_Number, VALUE_ENTRY_MPLS_Label,
                VALUE_ENTRY_IPv4_Subnet_Address, VALUE_ENTRY_IPv6_Subnet_Address,
                VALUE_ENTRY_IPv4_Address_Range, VALUE_ENTRY_IPv6_Address_Range,
                VALUE_ENTRY_Dial_String, VALUE_ENTRY_Ethernet_Address,
                VALUE_ENTRY_Token_Ring_Address, VALUE_ENTRY_ATM_Address,
                VALUE_ENTRY_Frame_Relay_Address, VALUE_ENTRY_URL, VALUE_ENTRY_FQDN,
                VALUE_ENTRY_User_FQDN, VALUE_ENTRY_DER_ASN1_DN, VALUE_ENTRY_DER_ASN1_GN,
                VALUE_ENTRY_Key_ID };

    }

    /**
     * Constants of property OtherInfoFormatDescription
     * Describes the format when the property InfoFormat is set to 1 ("Other").
     */
    public static class PROPERTY_OTHERINFOFORMATDESCRIPTION {
        /**
         * name of the property OtherInfoFormatDescription
         */
        public final static String NAME = "OtherInfoFormatDescription";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim29");
        String[] parentClassPackageList = CIM_ServiceAccessPoint.getPackages();

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
     *   RemoteServiceAccessPoint describes access and/or addressing information for a remote connection, that is known to a 'local' network element. This information is scoped/contained by the 'local' network element, since this is the context in which it is 'remote'. 
     * 
     * Why the remote access point is relevant and information on its use are described by subclassing RemoteService AccessPoint, or by associating to it.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_RemoteServiceAccessPoint(WBEMClient client, String namespace)
            throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   RemoteServiceAccessPoint describes access and/or addressing information for a remote connection, that is known to a 'local' network element. This information is scoped/contained by the 'local' network element, since this is the context in which it is 'remote'. 
     * 
     * Why the remote access point is relevant and information on its use are described by subclassing RemoteService AccessPoint, or by associating to it.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_RemoteServiceAccessPoint(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_RemoteServiceAccessPoint() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("AccessInfo", new CIMProperty("AccessInfo", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("InfoFormat", new CIMProperty("InfoFormat", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("OtherInfoFormatDescription", new CIMProperty(
                "OtherInfoFormatDescription", CIMDataType.STRING_T, null));

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
     * Get the property AccessInfo
     *     * <br>
     * Access and/or addressing information for a remote connection. This can be a host name, network address or similar information.
     *     */

    public String get_AccessInfo() {
        CIMProperty currentProperty = getProperty(PROPERTY_ACCESSINFO.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ACCESSINFO.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property AccessInfo
     * <br>
     * Access and/or addressing information for a remote connection. This can be a host name, network address or similar information.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_AccessInfo(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ACCESSINFO.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_AccessInfo(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ACCESSINFO.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property AccessInfo by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_AccessInfo(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_RemoteServiceAccessPoint fco = new CIM_RemoteServiceAccessPoint(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ACCESSINFO.NAME);
        if (property != null) {
            property = setPropertyValue_AccessInfo(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ACCESSINFO.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property AccessInfo
     * <br>
     * Access and/or addressing information for a remote connection. This can be a host name, network address or similar information.
     */

    private static CIMProperty setPropertyValue_AccessInfo(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property InfoFormat
     *     * <br>
     * An enumerated integer describing the format and interpretation of the AccessInfo property.
     *     */

    public javax.cim.UnsignedInteger16 get_InfoFormat() {
        CIMProperty currentProperty = getProperty(PROPERTY_INFOFORMAT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_INFOFORMAT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property InfoFormat
     * <br>
     * An enumerated integer describing the format and interpretation of the AccessInfo property.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_InfoFormat(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_INFOFORMAT.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_InfoFormat(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_INFOFORMAT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property InfoFormat by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_InfoFormat(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_RemoteServiceAccessPoint fco = new CIM_RemoteServiceAccessPoint(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_INFOFORMAT.NAME);
        if (property != null) {
            property = setPropertyValue_InfoFormat(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_INFOFORMAT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property InfoFormat
     * <br>
     * An enumerated integer describing the format and interpretation of the AccessInfo property.
     */

    private static CIMProperty setPropertyValue_InfoFormat(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherInfoFormatDescription
     *     * <br>
     * Describes the format when the property InfoFormat is set to 1 ("Other").
     *     */

    public String get_OtherInfoFormatDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERINFOFORMATDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERINFOFORMATDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherInfoFormatDescription
     * <br>
     * Describes the format when the property InfoFormat is set to 1 ("Other").
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherInfoFormatDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERINFOFORMATDESCRIPTION.NAME);
        if (currentProperty != null) {
            currentProperty = setPropertyValue_OtherInfoFormatDescription(currentProperty, newValue);
            this.instance = this.instance.deriveInstance(new CIMProperty[] { currentProperty });
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERINFOFORMATDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherInfoFormatDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherInfoFormatDescription(WBEMClient client,
            String namespace, String newValue) throws WbemsmtException {
        CIM_RemoteServiceAccessPoint fco = new CIM_RemoteServiceAccessPoint(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERINFOFORMATDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_OtherInfoFormatDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERINFOFORMATDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherInfoFormatDescription
     * <br>
     * Describes the format when the property InfoFormat is set to 1 ("Other").
     */

    private static CIMProperty setPropertyValue_OtherInfoFormatDescription(
            CIMProperty currentProperty, String newValue) {
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
        return CIM_RemoteServiceAccessPoint.CIM_CLASS_NAME;
    }

}