/**
 * CIM_ProtocolEndpoint.java Â© Copyright IBM Corp. 2006,2007 THIS FILE IS PROVIDED UNDER THE TER MS
 * OF THE COMMON PUBLIC LICENSE ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT. You can obtain a current copy of the Common
 * Public License from http://www.opensource.org/licenses/cpl1.0.php
 * 
 * @author: org.sblim.wbemsmt.dcg.generator.fco.jsr48.FcoGenerator
 * @template: org/sblim/wbemsmt/dcg/templates/fco/jsr48/fco.vm Contributors: Prashanth
 *            Karnam<prkarnam@in.ibm.com> Description: A communication point from which data can be
 *            sent or received. ProtocolEndpoints link system or computer interfaces to
 *            LogicalNetworks. generated Class
 */

package org.sblim.wbemsmt.schema.cim221;

import javax.cim.*;
import javax.wbem.client.*;

import org.sblim.wbemsmt.exception.*;

public class CIM_ProtocolEndpoint extends CIM_ServiceAccessPoint {

    public final static String CIM_CLASS_NAME = "CIM_ProtocolEndpoint";
    public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

    /**
     * Constants of property Description
     * 
     */
    public static class PROPERTY_DESCRIPTION {
        /**
         * name of the property Description
         */
        public final static String NAME = "Description";

    }

    /**
     * Constants of property EnabledState
     * 
     */
    public static class PROPERTY_ENABLEDSTATE {
        /**
         * name of the property EnabledState
         */
        public final static String NAME = "EnabledState";

    }

    /**
     * Constants of property Name
     * A string that identifies this ProtocolEndpoint with either a port or an interface on a device. To ensure uniqueness, the Name property should be prepended or appended with information from the Type or OtherTypeDescription properties. The method selected is described in the NameFormat property of this class.
     */
    public static class PROPERTY_NAME {
        /**
         * name of the property Name
         */
        public final static String NAME = "Name";

    }

    /**
     * Constants of property NameFormat
     * NameFormat contains the naming heuristic that is selected to ensure that the value of the Name property is unique. For example, you might choose to prepend the name of the port or interface with the Type of ProtocolEndpoint (for example, IPv4) of this instance followed by an underscore.
     */
    public static class PROPERTY_NAMEFORMAT {
        /**
         * name of the property NameFormat
         */
        public final static String NAME = "NameFormat";

    }

    /**
     * Constants of property OperationalStatus
     * 
     */
    public static class PROPERTY_OPERATIONALSTATUS {
        /**
         * name of the property OperationalStatus
         */
        public final static String NAME = "OperationalStatus";

    }

    /**
     * Constants of property OtherTypeDescription
     * A string that describes the type of ProtocolEndpoint when the Type property of this class (or any of its subclasses) is set to 1 (Other). This property should be set to null when the Type property is any value other than 1.
     */
    public static class PROPERTY_OTHERTYPEDESCRIPTION {
        /**
         * name of the property OtherTypeDescription
         */
        public final static String NAME = "OtherTypeDescription";

    }

    /**
     * Constants of property ProtocolIFType
     * ProtocolIFType is an enumeration that is synchronized with the IANA ifType MIB. The ifType MIB is maintained at the URL, http://www.iana.org/assignments/ianaiftype-mib. Also, additional values defined by the DMTF are included. The property is used to categorize and classify instances of the ProtocolEndpoint class. Note that if the ProtocolIFType is set to 1 (Other), then the type information should be provided in the OtherTypeDescription string property.
     */
    public static class PROPERTY_PROTOCOLIFTYPE {
        /**
         * name of the property ProtocolIFType
         */
        public final static String NAME = "ProtocolIFType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Regular_1822 = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry Regular 1822 (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_Regular_1822 = "Regular 1822";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_HDH_1822 = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry HDH 1822 (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_HDH_1822 = "HDH 1822";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DDN_X_25 = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry DDN X.25 (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_DDN_X_25 = "DDN X.25";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_RFC877_X_25 = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry RFC877 X.25 (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_RFC877_X_25 = "RFC877 X.25";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Ethernet_CSMA_CD = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry Ethernet CSMA/CD (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_Ethernet_CSMA_CD = "Ethernet CSMA/CD";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_ISO_802_3_CSMA_CD = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry ISO 802.3 CSMA/CD (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_ISO_802_3_CSMA_CD = "ISO 802.3 CSMA/CD";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_ISO_802_4_Token_Bus = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry ISO 802.4 Token Bus (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_ISO_802_4_Token_Bus = "ISO 802.4 Token Bus";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_ISO_802_5_Token_Ring = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry ISO 802.5 Token Ring (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_ISO_802_5_Token_Ring = "ISO 802.5 Token Ring";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_ISO_802_6_MAN = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry ISO 802.6 MAN (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_ISO_802_6_MAN = "ISO 802.6 MAN";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_StarLAN = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry StarLAN (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_StarLAN = "StarLAN";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Proteon_10Mbit = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry Proteon 10Mbit (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_Proteon_10Mbit = "Proteon 10Mbit";

        /**
         * constant for value map entry 13
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Proteon_80Mbit = new javax.cim.UnsignedInteger16(
                "13");

        /**
         * constant for value entry Proteon 80Mbit (corresponds to mapEntry 13 )
         */
        public final static String VALUE_ENTRY_Proteon_80Mbit = "Proteon 80Mbit";

        /**
         * constant for value map entry 14
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_HyperChannel = new javax.cim.UnsignedInteger16(
                "14");

        /**
         * constant for value entry HyperChannel (corresponds to mapEntry 14 )
         */
        public final static String VALUE_ENTRY_HyperChannel = "HyperChannel";

        /**
         * constant for value map entry 15
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_FDDI = new javax.cim.UnsignedInteger16(
                "15");

        /**
         * constant for value entry FDDI (corresponds to mapEntry 15 )
         */
        public final static String VALUE_ENTRY_FDDI = "FDDI";

        /**
         * constant for value map entry 16
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_LAP_B = new javax.cim.UnsignedInteger16(
                "16");

        /**
         * constant for value entry LAP-B (corresponds to mapEntry 16 )
         */
        public final static String VALUE_ENTRY_LAP_B = "LAP-B";

        /**
         * constant for value map entry 17
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_SDLC = new javax.cim.UnsignedInteger16(
                "17");

        /**
         * constant for value entry SDLC (corresponds to mapEntry 17 )
         */
        public final static String VALUE_ENTRY_SDLC = "SDLC";

        /**
         * constant for value map entry 18
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_DS1 = new javax.cim.UnsignedInteger16(
                "18");

        /**
         * constant for value entry DS1 (corresponds to mapEntry 18 )
         */
        public final static String VALUE_ENTRY_DS1 = "DS1";

        /**
         * constant for value map entry 19
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_E1 = new javax.cim.UnsignedInteger16(
                "19");

        /**
         * constant for value entry E1 (corresponds to mapEntry 19 )
         */
        public final static String VALUE_ENTRY_E1 = "E1";

        /**
         * constant for value map entry 20
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Basic_ISDN = new javax.cim.UnsignedInteger16(
                "20");

        /**
         * constant for value entry Basic ISDN (corresponds to mapEntry 20 )
         */
        public final static String VALUE_ENTRY_Basic_ISDN = "Basic ISDN";

        /**
         * constant for value map entry 21
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Primary_ISDN = new javax.cim.UnsignedInteger16(
                "21");

        /**
         * constant for value entry Primary ISDN (corresponds to mapEntry 21 )
         */
        public final static String VALUE_ENTRY_Primary_ISDN = "Primary ISDN";

        /**
         * constant for value map entry 22
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_Proprietary_Point_to_Point_Serial = new javax.cim.UnsignedInteger16(
                "22");

        /**
         * constant for value entry Proprietary Point-to-Point Serial (corresponds to mapEntry 22 )
         */
        public final static String VALUE_ENTRY_Proprietary_Point_to_Point_Serial = "Proprietary Point-to-Point Serial";

        /**
         * constant for value map entry 23
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_PPP = new javax.cim.UnsignedInteger16(
                "23");

        /**
         * constant for value entry PPP (corresponds to mapEntry 23 )
         */
        public final static String VALUE_ENTRY_PPP = "PPP";

        /**
         * constant for value map entry 24
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Software_Loopback = new javax.cim.UnsignedInteger16(
                "24");

        /**
         * constant for value entry Software Loopback (corresponds to mapEntry 24 )
         */
        public final static String VALUE_ENTRY_Software_Loopback = "Software Loopback";

        /**
         * constant for value map entry 25
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_EON = new javax.cim.UnsignedInteger16(
                "25");

        /**
         * constant for value entry EON (corresponds to mapEntry 25 )
         */
        public final static String VALUE_ENTRY_EON = "EON";

        /**
         * constant for value map entry 26
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_Ethernet_3Mbit = new javax.cim.UnsignedInteger16(
                "26");

        /**
         * constant for value entry Ethernet 3Mbit (corresponds to mapEntry 26 )
         */
        public final static String VALUE_ENTRY_Ethernet_3Mbit = "Ethernet 3Mbit";

        /**
         * constant for value map entry 27
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_NSIP = new javax.cim.UnsignedInteger16(
                "27");

        /**
         * constant for value entry NSIP (corresponds to mapEntry 27 )
         */
        public final static String VALUE_ENTRY_NSIP = "NSIP";

        /**
         * constant for value map entry 28
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_SLIP = new javax.cim.UnsignedInteger16(
                "28");

        /**
         * constant for value entry SLIP (corresponds to mapEntry 28 )
         */
        public final static String VALUE_ENTRY_SLIP = "SLIP";

        /**
         * constant for value map entry 29
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Ultra = new javax.cim.UnsignedInteger16(
                "29");

        /**
         * constant for value entry Ultra (corresponds to mapEntry 29 )
         */
        public final static String VALUE_ENTRY_Ultra = "Ultra";

        /**
         * constant for value map entry 30
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_DS3 = new javax.cim.UnsignedInteger16(
                "30");

        /**
         * constant for value entry DS3 (corresponds to mapEntry 30 )
         */
        public final static String VALUE_ENTRY_DS3 = "DS3";

        /**
         * constant for value map entry 31
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_SIP = new javax.cim.UnsignedInteger16(
                "31");

        /**
         * constant for value entry SIP (corresponds to mapEntry 31 )
         */
        public final static String VALUE_ENTRY_SIP = "SIP";

        /**
         * constant for value map entry 32
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Frame_Relay = new javax.cim.UnsignedInteger16(
                "32");

        /**
         * constant for value entry Frame Relay (corresponds to mapEntry 32 )
         */
        public final static String VALUE_ENTRY_Frame_Relay = "Frame Relay";

        /**
         * constant for value map entry 33
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_RS_232 = new javax.cim.UnsignedInteger16(
                "33");

        /**
         * constant for value entry RS-232 (corresponds to mapEntry 33 )
         */
        public final static String VALUE_ENTRY_RS_232 = "RS-232";

        /**
         * constant for value map entry 34
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_Parallel = new javax.cim.UnsignedInteger16(
                "34");

        /**
         * constant for value entry Parallel (corresponds to mapEntry 34 )
         */
        public final static String VALUE_ENTRY_Parallel = "Parallel";

        /**
         * constant for value map entry 35
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_ARCNet = new javax.cim.UnsignedInteger16(
                "35");

        /**
         * constant for value entry ARCNet (corresponds to mapEntry 35 )
         */
        public final static String VALUE_ENTRY_ARCNet = "ARCNet";

        /**
         * constant for value map entry 36
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_ARCNet_Plus = new javax.cim.UnsignedInteger16(
                "36");

        /**
         * constant for value entry ARCNet Plus (corresponds to mapEntry 36 )
         */
        public final static String VALUE_ENTRY_ARCNet_Plus = "ARCNet Plus";

        /**
         * constant for value map entry 37
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_ATM = new javax.cim.UnsignedInteger16(
                "37");

        /**
         * constant for value entry ATM (corresponds to mapEntry 37 )
         */
        public final static String VALUE_ENTRY_ATM = "ATM";

        /**
         * constant for value map entry 38
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_MIO_X_25 = new javax.cim.UnsignedInteger16(
                "38");

        /**
         * constant for value entry MIO X.25 (corresponds to mapEntry 38 )
         */
        public final static String VALUE_ENTRY_MIO_X_25 = "MIO X.25";

        /**
         * constant for value map entry 39
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_SONET = new javax.cim.UnsignedInteger16(
                "39");

        /**
         * constant for value entry SONET (corresponds to mapEntry 39 )
         */
        public final static String VALUE_ENTRY_SONET = "SONET";

        /**
         * constant for value map entry 40
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_X_25_PLE = new javax.cim.UnsignedInteger16(
                "40");

        /**
         * constant for value entry X.25 PLE (corresponds to mapEntry 40 )
         */
        public final static String VALUE_ENTRY_X_25_PLE = "X.25 PLE";

        /**
         * constant for value map entry 41
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_ISO_802_211c = new javax.cim.UnsignedInteger16(
                "41");

        /**
         * constant for value entry ISO 802.211c (corresponds to mapEntry 41 )
         */
        public final static String VALUE_ENTRY_ISO_802_211c = "ISO 802.211c";

        /**
         * constant for value map entry 42
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_LocalTalk = new javax.cim.UnsignedInteger16(
                "42");

        /**
         * constant for value entry LocalTalk (corresponds to mapEntry 42 )
         */
        public final static String VALUE_ENTRY_LocalTalk = "LocalTalk";

        /**
         * constant for value map entry 43
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_SMDS_DXI = new javax.cim.UnsignedInteger16(
                "43");

        /**
         * constant for value entry SMDS DXI (corresponds to mapEntry 43 )
         */
        public final static String VALUE_ENTRY_SMDS_DXI = "SMDS DXI";

        /**
         * constant for value map entry 44
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_Frame_Relay_Service = new javax.cim.UnsignedInteger16(
                "44");

        /**
         * constant for value entry Frame Relay Service (corresponds to mapEntry 44 )
         */
        public final static String VALUE_ENTRY_Frame_Relay_Service = "Frame Relay Service";

        /**
         * constant for value map entry 45
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_V_35 = new javax.cim.UnsignedInteger16(
                "45");

        /**
         * constant for value entry V.35 (corresponds to mapEntry 45 )
         */
        public final static String VALUE_ENTRY_V_35 = "V.35";

        /**
         * constant for value map entry 46
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_HSSI = new javax.cim.UnsignedInteger16(
                "46");

        /**
         * constant for value entry HSSI (corresponds to mapEntry 46 )
         */
        public final static String VALUE_ENTRY_HSSI = "HSSI";

        /**
         * constant for value map entry 47
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_HIPPI = new javax.cim.UnsignedInteger16(
                "47");

        /**
         * constant for value entry HIPPI (corresponds to mapEntry 47 )
         */
        public final static String VALUE_ENTRY_HIPPI = "HIPPI";

        /**
         * constant for value map entry 48
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_Modem = new javax.cim.UnsignedInteger16(
                "48");

        /**
         * constant for value entry Modem (corresponds to mapEntry 48 )
         */
        public final static String VALUE_ENTRY_Modem = "Modem";

        /**
         * constant for value map entry 49
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_AAL5 = new javax.cim.UnsignedInteger16(
                "49");

        /**
         * constant for value entry AAL5 (corresponds to mapEntry 49 )
         */
        public final static String VALUE_ENTRY_AAL5 = "AAL5";

        /**
         * constant for value map entry 50
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_SONET_Path = new javax.cim.UnsignedInteger16(
                "50");

        /**
         * constant for value entry SONET Path (corresponds to mapEntry 50 )
         */
        public final static String VALUE_ENTRY_SONET_Path = "SONET Path";

        /**
         * constant for value map entry 51
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_SONET_VT = new javax.cim.UnsignedInteger16(
                "51");

        /**
         * constant for value entry SONET VT (corresponds to mapEntry 51 )
         */
        public final static String VALUE_ENTRY_SONET_VT = "SONET VT";

        /**
         * constant for value map entry 52
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_SMDS_ICIP = new javax.cim.UnsignedInteger16(
                "52");

        /**
         * constant for value entry SMDS ICIP (corresponds to mapEntry 52 )
         */
        public final static String VALUE_ENTRY_SMDS_ICIP = "SMDS ICIP";

        /**
         * constant for value map entry 53
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_Proprietary_Virtual_Internal = new javax.cim.UnsignedInteger16(
                "53");

        /**
         * constant for value entry Proprietary Virtual/Internal (corresponds to mapEntry 53 )
         */
        public final static String VALUE_ENTRY_Proprietary_Virtual_Internal = "Proprietary Virtual/Internal";

        /**
         * constant for value map entry 54
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_Proprietary_Multiplexor = new javax.cim.UnsignedInteger16(
                "54");

        /**
         * constant for value entry Proprietary Multiplexor (corresponds to mapEntry 54 )
         */
        public final static String VALUE_ENTRY_Proprietary_Multiplexor = "Proprietary Multiplexor";

        /**
         * constant for value map entry 55
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_IEEE_802_12 = new javax.cim.UnsignedInteger16(
                "55");

        /**
         * constant for value entry IEEE 802.12 (corresponds to mapEntry 55 )
         */
        public final static String VALUE_ENTRY_IEEE_802_12 = "IEEE 802.12";

        /**
         * constant for value map entry 56
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_Fibre_Channel = new javax.cim.UnsignedInteger16(
                "56");

        /**
         * constant for value entry Fibre Channel (corresponds to mapEntry 56 )
         */
        public final static String VALUE_ENTRY_Fibre_Channel = "Fibre Channel";

        /**
         * constant for value map entry 57
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_HIPPI_Interface = new javax.cim.UnsignedInteger16(
                "57");

        /**
         * constant for value entry HIPPI Interface (corresponds to mapEntry 57 )
         */
        public final static String VALUE_ENTRY_HIPPI_Interface = "HIPPI Interface";

        /**
         * constant for value map entry 58
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_Frame_Relay_Interconnect = new javax.cim.UnsignedInteger16(
                "58");

        /**
         * constant for value entry Frame Relay Interconnect (corresponds to mapEntry 58 )
         */
        public final static String VALUE_ENTRY_Frame_Relay_Interconnect = "Frame Relay Interconnect";

        /**
         * constant for value map entry 59
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_ATM_Emulated_LAN_for_802_3 = new javax.cim.UnsignedInteger16(
                "59");

        /**
         * constant for value entry ATM Emulated LAN for 802.3 (corresponds to mapEntry 59 )
         */
        public final static String VALUE_ENTRY_ATM_Emulated_LAN_for_802_3 = "ATM Emulated LAN for 802.3";

        /**
         * constant for value map entry 60
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_ATM_Emulated_LAN_for_802_5 = new javax.cim.UnsignedInteger16(
                "60");

        /**
         * constant for value entry ATM Emulated LAN for 802.5 (corresponds to mapEntry 60 )
         */
        public final static String VALUE_ENTRY_ATM_Emulated_LAN_for_802_5 = "ATM Emulated LAN for 802.5";

        /**
         * constant for value map entry 61
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_ATM_Emulated_Circuit = new javax.cim.UnsignedInteger16(
                "61");

        /**
         * constant for value entry ATM Emulated Circuit (corresponds to mapEntry 61 )
         */
        public final static String VALUE_ENTRY_ATM_Emulated_Circuit = "ATM Emulated Circuit";

        /**
         * constant for value map entry 62
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_Fast_Ethernet__100BaseT_ = new javax.cim.UnsignedInteger16(
                "62");

        /**
         * constant for value entry Fast Ethernet (100BaseT) (corresponds to mapEntry 62 )
         */
        public final static String VALUE_ENTRY_Fast_Ethernet__100BaseT_ = "Fast Ethernet (100BaseT)";

        /**
         * constant for value map entry 63
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_ISDN = new javax.cim.UnsignedInteger16(
                "63");

        /**
         * constant for value entry ISDN (corresponds to mapEntry 63 )
         */
        public final static String VALUE_ENTRY_ISDN = "ISDN";

        /**
         * constant for value map entry 64
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_V_11 = new javax.cim.UnsignedInteger16(
                "64");

        /**
         * constant for value entry V.11 (corresponds to mapEntry 64 )
         */
        public final static String VALUE_ENTRY_V_11 = "V.11";

        /**
         * constant for value map entry 65
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_V_36 = new javax.cim.UnsignedInteger16(
                "65");

        /**
         * constant for value entry V.36 (corresponds to mapEntry 65 )
         */
        public final static String VALUE_ENTRY_V_36 = "V.36";

        /**
         * constant for value map entry 66
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_G703_at_64K = new javax.cim.UnsignedInteger16(
                "66");

        /**
         * constant for value entry G703 at 64K (corresponds to mapEntry 66 )
         */
        public final static String VALUE_ENTRY_G703_at_64K = "G703 at 64K";

        /**
         * constant for value map entry 67
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_G703_at_2Mb = new javax.cim.UnsignedInteger16(
                "67");

        /**
         * constant for value entry G703 at 2Mb (corresponds to mapEntry 67 )
         */
        public final static String VALUE_ENTRY_G703_at_2Mb = "G703 at 2Mb";

        /**
         * constant for value map entry 68
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_QLLC = new javax.cim.UnsignedInteger16(
                "68");

        /**
         * constant for value entry QLLC (corresponds to mapEntry 68 )
         */
        public final static String VALUE_ENTRY_QLLC = "QLLC";

        /**
         * constant for value map entry 69
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_69_FOR_VALUE_ENTRY_Fast_Ethernet_100BaseFX = new javax.cim.UnsignedInteger16(
                "69");

        /**
         * constant for value entry Fast Ethernet 100BaseFX (corresponds to mapEntry 69 )
         */
        public final static String VALUE_ENTRY_Fast_Ethernet_100BaseFX = "Fast Ethernet 100BaseFX";

        /**
         * constant for value map entry 70
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_70_FOR_VALUE_ENTRY_Channel = new javax.cim.UnsignedInteger16(
                "70");

        /**
         * constant for value entry Channel (corresponds to mapEntry 70 )
         */
        public final static String VALUE_ENTRY_Channel = "Channel";

        /**
         * constant for value map entry 71
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_71_FOR_VALUE_ENTRY_IEEE_802_11 = new javax.cim.UnsignedInteger16(
                "71");

        /**
         * constant for value entry IEEE 802.11 (corresponds to mapEntry 71 )
         */
        public final static String VALUE_ENTRY_IEEE_802_11 = "IEEE 802.11";

        /**
         * constant for value map entry 72
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_72_FOR_VALUE_ENTRY_IBM_260_370_OEMI_Channel = new javax.cim.UnsignedInteger16(
                "72");

        /**
         * constant for value entry IBM 260/370 OEMI Channel (corresponds to mapEntry 72 )
         */
        public final static String VALUE_ENTRY_IBM_260_370_OEMI_Channel = "IBM 260/370 OEMI Channel";

        /**
         * constant for value map entry 73
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_73_FOR_VALUE_ENTRY_ESCON = new javax.cim.UnsignedInteger16(
                "73");

        /**
         * constant for value entry ESCON (corresponds to mapEntry 73 )
         */
        public final static String VALUE_ENTRY_ESCON = "ESCON";

        /**
         * constant for value map entry 74
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_74_FOR_VALUE_ENTRY_Data_Link_Switching = new javax.cim.UnsignedInteger16(
                "74");

        /**
         * constant for value entry Data Link Switching (corresponds to mapEntry 74 )
         */
        public final static String VALUE_ENTRY_Data_Link_Switching = "Data Link Switching";

        /**
         * constant for value map entry 75
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_75_FOR_VALUE_ENTRY_ISDN_S_T_Interface = new javax.cim.UnsignedInteger16(
                "75");

        /**
         * constant for value entry ISDN S/T Interface (corresponds to mapEntry 75 )
         */
        public final static String VALUE_ENTRY_ISDN_S_T_Interface = "ISDN S/T Interface";

        /**
         * constant for value map entry 76
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_76_FOR_VALUE_ENTRY_ISDN_U_Interface = new javax.cim.UnsignedInteger16(
                "76");

        /**
         * constant for value entry ISDN U Interface (corresponds to mapEntry 76 )
         */
        public final static String VALUE_ENTRY_ISDN_U_Interface = "ISDN U Interface";

        /**
         * constant for value map entry 77
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_77_FOR_VALUE_ENTRY_LAP_D = new javax.cim.UnsignedInteger16(
                "77");

        /**
         * constant for value entry LAP-D (corresponds to mapEntry 77 )
         */
        public final static String VALUE_ENTRY_LAP_D = "LAP-D";

        /**
         * constant for value map entry 78
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_78_FOR_VALUE_ENTRY_IP_Switch = new javax.cim.UnsignedInteger16(
                "78");

        /**
         * constant for value entry IP Switch (corresponds to mapEntry 78 )
         */
        public final static String VALUE_ENTRY_IP_Switch = "IP Switch";

        /**
         * constant for value map entry 79
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_79_FOR_VALUE_ENTRY_Remote_Source_Route_Bridging = new javax.cim.UnsignedInteger16(
                "79");

        /**
         * constant for value entry Remote Source Route Bridging (corresponds to mapEntry 79 )
         */
        public final static String VALUE_ENTRY_Remote_Source_Route_Bridging = "Remote Source Route Bridging";

        /**
         * constant for value map entry 80
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_ATM_Logical = new javax.cim.UnsignedInteger16(
                "80");

        /**
         * constant for value entry ATM Logical (corresponds to mapEntry 80 )
         */
        public final static String VALUE_ENTRY_ATM_Logical = "ATM Logical";

        /**
         * constant for value map entry 81
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_DS0 = new javax.cim.UnsignedInteger16(
                "81");

        /**
         * constant for value entry DS0 (corresponds to mapEntry 81 )
         */
        public final static String VALUE_ENTRY_DS0 = "DS0";

        /**
         * constant for value map entry 82
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_DS0_Bundle = new javax.cim.UnsignedInteger16(
                "82");

        /**
         * constant for value entry DS0 Bundle (corresponds to mapEntry 82 )
         */
        public final static String VALUE_ENTRY_DS0_Bundle = "DS0 Bundle";

        /**
         * constant for value map entry 83
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_BSC = new javax.cim.UnsignedInteger16(
                "83");

        /**
         * constant for value entry BSC (corresponds to mapEntry 83 )
         */
        public final static String VALUE_ENTRY_BSC = "BSC";

        /**
         * constant for value map entry 84
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_Async = new javax.cim.UnsignedInteger16(
                "84");

        /**
         * constant for value entry Async (corresponds to mapEntry 84 )
         */
        public final static String VALUE_ENTRY_Async = "Async";

        /**
         * constant for value map entry 85
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_Combat_Net_Radio = new javax.cim.UnsignedInteger16(
                "85");

        /**
         * constant for value entry Combat Net Radio (corresponds to mapEntry 85 )
         */
        public final static String VALUE_ENTRY_Combat_Net_Radio = "Combat Net Radio";

        /**
         * constant for value map entry 86
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_ISO_802_5r_DTR = new javax.cim.UnsignedInteger16(
                "86");

        /**
         * constant for value entry ISO 802.5r DTR (corresponds to mapEntry 86 )
         */
        public final static String VALUE_ENTRY_ISO_802_5r_DTR = "ISO 802.5r DTR";

        /**
         * constant for value map entry 87
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_Ext_Pos_Loc_Report_System = new javax.cim.UnsignedInteger16(
                "87");

        /**
         * constant for value entry Ext Pos Loc Report System (corresponds to mapEntry 87 )
         */
        public final static String VALUE_ENTRY_Ext_Pos_Loc_Report_System = "Ext Pos Loc Report System";

        /**
         * constant for value map entry 88
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_AppleTalk_Remote_Access_Protocol = new javax.cim.UnsignedInteger16(
                "88");

        /**
         * constant for value entry AppleTalk Remote Access Protocol (corresponds to mapEntry 88 )
         */
        public final static String VALUE_ENTRY_AppleTalk_Remote_Access_Protocol = "AppleTalk Remote Access Protocol";

        /**
         * constant for value map entry 89
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_89_FOR_VALUE_ENTRY_Proprietary_Connectionless = new javax.cim.UnsignedInteger16(
                "89");

        /**
         * constant for value entry Proprietary Connectionless (corresponds to mapEntry 89 )
         */
        public final static String VALUE_ENTRY_Proprietary_Connectionless = "Proprietary Connectionless";

        /**
         * constant for value map entry 90
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_90_FOR_VALUE_ENTRY_ITU_X_29_Host_PAD = new javax.cim.UnsignedInteger16(
                "90");

        /**
         * constant for value entry ITU X.29 Host PAD (corresponds to mapEntry 90 )
         */
        public final static String VALUE_ENTRY_ITU_X_29_Host_PAD = "ITU X.29 Host PAD";

        /**
         * constant for value map entry 91
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_91_FOR_VALUE_ENTRY_ITU_X_3_Terminal_PAD = new javax.cim.UnsignedInteger16(
                "91");

        /**
         * constant for value entry ITU X.3 Terminal PAD (corresponds to mapEntry 91 )
         */
        public final static String VALUE_ENTRY_ITU_X_3_Terminal_PAD = "ITU X.3 Terminal PAD";

        /**
         * constant for value map entry 92
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_92_FOR_VALUE_ENTRY_Frame_Relay_MPI = new javax.cim.UnsignedInteger16(
                "92");

        /**
         * constant for value entry Frame Relay MPI (corresponds to mapEntry 92 )
         */
        public final static String VALUE_ENTRY_Frame_Relay_MPI = "Frame Relay MPI";

        /**
         * constant for value map entry 93
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_93_FOR_VALUE_ENTRY_ITU_X_213 = new javax.cim.UnsignedInteger16(
                "93");

        /**
         * constant for value entry ITU X.213 (corresponds to mapEntry 93 )
         */
        public final static String VALUE_ENTRY_ITU_X_213 = "ITU X.213";

        /**
         * constant for value map entry 94
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_94_FOR_VALUE_ENTRY_ADSL = new javax.cim.UnsignedInteger16(
                "94");

        /**
         * constant for value entry ADSL (corresponds to mapEntry 94 )
         */
        public final static String VALUE_ENTRY_ADSL = "ADSL";

        /**
         * constant for value map entry 95
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_95_FOR_VALUE_ENTRY_RADSL = new javax.cim.UnsignedInteger16(
                "95");

        /**
         * constant for value entry RADSL (corresponds to mapEntry 95 )
         */
        public final static String VALUE_ENTRY_RADSL = "RADSL";

        /**
         * constant for value map entry 96
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_SDSL = new javax.cim.UnsignedInteger16(
                "96");

        /**
         * constant for value entry SDSL (corresponds to mapEntry 96 )
         */
        public final static String VALUE_ENTRY_SDSL = "SDSL";

        /**
         * constant for value map entry 97
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_VDSL = new javax.cim.UnsignedInteger16(
                "97");

        /**
         * constant for value entry VDSL (corresponds to mapEntry 97 )
         */
        public final static String VALUE_ENTRY_VDSL = "VDSL";

        /**
         * constant for value map entry 98
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_ISO_802_5_CRFP = new javax.cim.UnsignedInteger16(
                "98");

        /**
         * constant for value entry ISO 802.5 CRFP (corresponds to mapEntry 98 )
         */
        public final static String VALUE_ENTRY_ISO_802_5_CRFP = "ISO 802.5 CRFP";

        /**
         * constant for value map entry 99
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_Myrinet = new javax.cim.UnsignedInteger16(
                "99");

        /**
         * constant for value entry Myrinet (corresponds to mapEntry 99 )
         */
        public final static String VALUE_ENTRY_Myrinet = "Myrinet";

        /**
         * constant for value map entry 100
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Voice_Receive_and_Transmit = new javax.cim.UnsignedInteger16(
                "100");

        /**
         * constant for value entry Voice Receive and Transmit (corresponds to mapEntry 100 )
         */
        public final static String VALUE_ENTRY_Voice_Receive_and_Transmit = "Voice Receive and Transmit";

        /**
         * constant for value map entry 101
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Voice_Foreign_Exchange_Office = new javax.cim.UnsignedInteger16(
                "101");

        /**
         * constant for value entry Voice Foreign Exchange Office (corresponds to mapEntry 101 )
         */
        public final static String VALUE_ENTRY_Voice_Foreign_Exchange_Office = "Voice Foreign Exchange Office";

        /**
         * constant for value map entry 102
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_Voice_Foreign_Exchange_Service = new javax.cim.UnsignedInteger16(
                "102");

        /**
         * constant for value entry Voice Foreign Exchange Service (corresponds to mapEntry 102 )
         */
        public final static String VALUE_ENTRY_Voice_Foreign_Exchange_Service = "Voice Foreign Exchange Service";

        /**
         * constant for value map entry 103
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_Voice_Encapsulation = new javax.cim.UnsignedInteger16(
                "103");

        /**
         * constant for value entry Voice Encapsulation (corresponds to mapEntry 103 )
         */
        public final static String VALUE_ENTRY_Voice_Encapsulation = "Voice Encapsulation";

        /**
         * constant for value map entry 104
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_Voice_over_IP = new javax.cim.UnsignedInteger16(
                "104");

        /**
         * constant for value entry Voice over IP (corresponds to mapEntry 104 )
         */
        public final static String VALUE_ENTRY_Voice_over_IP = "Voice over IP";

        /**
         * constant for value map entry 105
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_105_FOR_VALUE_ENTRY_ATM_DXI = new javax.cim.UnsignedInteger16(
                "105");

        /**
         * constant for value entry ATM DXI (corresponds to mapEntry 105 )
         */
        public final static String VALUE_ENTRY_ATM_DXI = "ATM DXI";

        /**
         * constant for value map entry 106
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_106_FOR_VALUE_ENTRY_ATM_FUNI = new javax.cim.UnsignedInteger16(
                "106");

        /**
         * constant for value entry ATM FUNI (corresponds to mapEntry 106 )
         */
        public final static String VALUE_ENTRY_ATM_FUNI = "ATM FUNI";

        /**
         * constant for value map entry 107
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_107_FOR_VALUE_ENTRY_ATM_IMA = new javax.cim.UnsignedInteger16(
                "107");

        /**
         * constant for value entry ATM IMA (corresponds to mapEntry 107 )
         */
        public final static String VALUE_ENTRY_ATM_IMA = "ATM IMA";

        /**
         * constant for value map entry 108
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_108_FOR_VALUE_ENTRY_PPP_Multilink_Bundle = new javax.cim.UnsignedInteger16(
                "108");

        /**
         * constant for value entry PPP Multilink Bundle (corresponds to mapEntry 108 )
         */
        public final static String VALUE_ENTRY_PPP_Multilink_Bundle = "PPP Multilink Bundle";

        /**
         * constant for value map entry 109
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_109_FOR_VALUE_ENTRY_IP_over_CDLC = new javax.cim.UnsignedInteger16(
                "109");

        /**
         * constant for value entry IP over CDLC (corresponds to mapEntry 109 )
         */
        public final static String VALUE_ENTRY_IP_over_CDLC = "IP over CDLC";

        /**
         * constant for value map entry 110
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_110_FOR_VALUE_ENTRY_IP_over_CLAW = new javax.cim.UnsignedInteger16(
                "110");

        /**
         * constant for value entry IP over CLAW (corresponds to mapEntry 110 )
         */
        public final static String VALUE_ENTRY_IP_over_CLAW = "IP over CLAW";

        /**
         * constant for value map entry 111
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_111_FOR_VALUE_ENTRY_Stack_to_Stack = new javax.cim.UnsignedInteger16(
                "111");

        /**
         * constant for value entry Stack to Stack (corresponds to mapEntry 111 )
         */
        public final static String VALUE_ENTRY_Stack_to_Stack = "Stack to Stack";

        /**
         * constant for value map entry 112
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_112_FOR_VALUE_ENTRY_Virtual_IP_Address = new javax.cim.UnsignedInteger16(
                "112");

        /**
         * constant for value entry Virtual IP Address (corresponds to mapEntry 112 )
         */
        public final static String VALUE_ENTRY_Virtual_IP_Address = "Virtual IP Address";

        /**
         * constant for value map entry 113
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_113_FOR_VALUE_ENTRY_MPC = new javax.cim.UnsignedInteger16(
                "113");

        /**
         * constant for value entry MPC (corresponds to mapEntry 113 )
         */
        public final static String VALUE_ENTRY_MPC = "MPC";

        /**
         * constant for value map entry 114
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_114_FOR_VALUE_ENTRY_IP_over_ATM = new javax.cim.UnsignedInteger16(
                "114");

        /**
         * constant for value entry IP over ATM (corresponds to mapEntry 114 )
         */
        public final static String VALUE_ENTRY_IP_over_ATM = "IP over ATM";

        /**
         * constant for value map entry 115
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_115_FOR_VALUE_ENTRY_ISO_802_5j_Fibre_Token_Ring = new javax.cim.UnsignedInteger16(
                "115");

        /**
         * constant for value entry ISO 802.5j Fibre Token Ring (corresponds to mapEntry 115 )
         */
        public final static String VALUE_ENTRY_ISO_802_5j_Fibre_Token_Ring = "ISO 802.5j Fibre Token Ring";

        /**
         * constant for value map entry 116
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_116_FOR_VALUE_ENTRY_TDLC = new javax.cim.UnsignedInteger16(
                "116");

        /**
         * constant for value entry TDLC (corresponds to mapEntry 116 )
         */
        public final static String VALUE_ENTRY_TDLC = "TDLC";

        /**
         * constant for value map entry 117
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_117_FOR_VALUE_ENTRY_Gigabit_Ethernet = new javax.cim.UnsignedInteger16(
                "117");

        /**
         * constant for value entry Gigabit Ethernet (corresponds to mapEntry 117 )
         */
        public final static String VALUE_ENTRY_Gigabit_Ethernet = "Gigabit Ethernet";

        /**
         * constant for value map entry 118
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_118_FOR_VALUE_ENTRY_HDLC = new javax.cim.UnsignedInteger16(
                "118");

        /**
         * constant for value entry HDLC (corresponds to mapEntry 118 )
         */
        public final static String VALUE_ENTRY_HDLC = "HDLC";

        /**
         * constant for value map entry 119
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_119_FOR_VALUE_ENTRY_LAP_F = new javax.cim.UnsignedInteger16(
                "119");

        /**
         * constant for value entry LAP-F (corresponds to mapEntry 119 )
         */
        public final static String VALUE_ENTRY_LAP_F = "LAP-F";

        /**
         * constant for value map entry 120
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_120_FOR_VALUE_ENTRY_V_37 = new javax.cim.UnsignedInteger16(
                "120");

        /**
         * constant for value entry V.37 (corresponds to mapEntry 120 )
         */
        public final static String VALUE_ENTRY_V_37 = "V.37";

        /**
         * constant for value map entry 121
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_121_FOR_VALUE_ENTRY_X_25_MLP = new javax.cim.UnsignedInteger16(
                "121");

        /**
         * constant for value entry X.25 MLP (corresponds to mapEntry 121 )
         */
        public final static String VALUE_ENTRY_X_25_MLP = "X.25 MLP";

        /**
         * constant for value map entry 122
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_122_FOR_VALUE_ENTRY_X_25_Hunt_Group = new javax.cim.UnsignedInteger16(
                "122");

        /**
         * constant for value entry X.25 Hunt Group (corresponds to mapEntry 122 )
         */
        public final static String VALUE_ENTRY_X_25_Hunt_Group = "X.25 Hunt Group";

        /**
         * constant for value map entry 123
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_123_FOR_VALUE_ENTRY_Transp_HDLC = new javax.cim.UnsignedInteger16(
                "123");

        /**
         * constant for value entry Transp HDLC (corresponds to mapEntry 123 )
         */
        public final static String VALUE_ENTRY_Transp_HDLC = "Transp HDLC";

        /**
         * constant for value map entry 124
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_124_FOR_VALUE_ENTRY_Interleave_Channel = new javax.cim.UnsignedInteger16(
                "124");

        /**
         * constant for value entry Interleave Channel (corresponds to mapEntry 124 )
         */
        public final static String VALUE_ENTRY_Interleave_Channel = "Interleave Channel";

        /**
         * constant for value map entry 125
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_125_FOR_VALUE_ENTRY_FAST_Channel = new javax.cim.UnsignedInteger16(
                "125");

        /**
         * constant for value entry FAST Channel (corresponds to mapEntry 125 )
         */
        public final static String VALUE_ENTRY_FAST_Channel = "FAST Channel";

        /**
         * constant for value map entry 126
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_126_FOR_VALUE_ENTRY_IP__for_APPN_HPR_in_IP_Networks_ = new javax.cim.UnsignedInteger16(
                "126");

        /**
         * constant for value entry IP (for APPN HPR in IP Networks) (corresponds to mapEntry 126 )
         */
        public final static String VALUE_ENTRY_IP__for_APPN_HPR_in_IP_Networks_ = "IP (for APPN HPR in IP Networks)";

        /**
         * constant for value map entry 127
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_127_FOR_VALUE_ENTRY_CATV_MAC_Layer = new javax.cim.UnsignedInteger16(
                "127");

        /**
         * constant for value entry CATV MAC Layer (corresponds to mapEntry 127 )
         */
        public final static String VALUE_ENTRY_CATV_MAC_Layer = "CATV MAC Layer";

        /**
         * constant for value map entry 128
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_128_FOR_VALUE_ENTRY_CATV_Downstream = new javax.cim.UnsignedInteger16(
                "128");

        /**
         * constant for value entry CATV Downstream (corresponds to mapEntry 128 )
         */
        public final static String VALUE_ENTRY_CATV_Downstream = "CATV Downstream";

        /**
         * constant for value map entry 129
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_129_FOR_VALUE_ENTRY_CATV_Upstream = new javax.cim.UnsignedInteger16(
                "129");

        /**
         * constant for value entry CATV Upstream (corresponds to mapEntry 129 )
         */
        public final static String VALUE_ENTRY_CATV_Upstream = "CATV Upstream";

        /**
         * constant for value map entry 130
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_130_FOR_VALUE_ENTRY_Avalon_12MPP_Switch = new javax.cim.UnsignedInteger16(
                "130");

        /**
         * constant for value entry Avalon 12MPP Switch (corresponds to mapEntry 130 )
         */
        public final static String VALUE_ENTRY_Avalon_12MPP_Switch = "Avalon 12MPP Switch";

        /**
         * constant for value map entry 131
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_131_FOR_VALUE_ENTRY_Tunnel = new javax.cim.UnsignedInteger16(
                "131");

        /**
         * constant for value entry Tunnel (corresponds to mapEntry 131 )
         */
        public final static String VALUE_ENTRY_Tunnel = "Tunnel";

        /**
         * constant for value map entry 132
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_132_FOR_VALUE_ENTRY_Coffee = new javax.cim.UnsignedInteger16(
                "132");

        /**
         * constant for value entry Coffee (corresponds to mapEntry 132 )
         */
        public final static String VALUE_ENTRY_Coffee = "Coffee";

        /**
         * constant for value map entry 133
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_133_FOR_VALUE_ENTRY_Circuit_Emulation_Service = new javax.cim.UnsignedInteger16(
                "133");

        /**
         * constant for value entry Circuit Emulation Service (corresponds to mapEntry 133 )
         */
        public final static String VALUE_ENTRY_Circuit_Emulation_Service = "Circuit Emulation Service";

        /**
         * constant for value map entry 134
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_134_FOR_VALUE_ENTRY_ATM_SubInterface = new javax.cim.UnsignedInteger16(
                "134");

        /**
         * constant for value entry ATM SubInterface (corresponds to mapEntry 134 )
         */
        public final static String VALUE_ENTRY_ATM_SubInterface = "ATM SubInterface";

        /**
         * constant for value map entry 135
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_135_FOR_VALUE_ENTRY_Layer_2_VLAN_using_802_1Q = new javax.cim.UnsignedInteger16(
                "135");

        /**
         * constant for value entry Layer 2 VLAN using 802.1Q (corresponds to mapEntry 135 )
         */
        public final static String VALUE_ENTRY_Layer_2_VLAN_using_802_1Q = "Layer 2 VLAN using 802.1Q";

        /**
         * constant for value map entry 136
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_136_FOR_VALUE_ENTRY_Layer_3_VLAN_using_IP = new javax.cim.UnsignedInteger16(
                "136");

        /**
         * constant for value entry Layer 3 VLAN using IP (corresponds to mapEntry 136 )
         */
        public final static String VALUE_ENTRY_Layer_3_VLAN_using_IP = "Layer 3 VLAN using IP";

        /**
         * constant for value map entry 137
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_137_FOR_VALUE_ENTRY_Layer_3_VLAN_using_IPX = new javax.cim.UnsignedInteger16(
                "137");

        /**
         * constant for value entry Layer 3 VLAN using IPX (corresponds to mapEntry 137 )
         */
        public final static String VALUE_ENTRY_Layer_3_VLAN_using_IPX = "Layer 3 VLAN using IPX";

        /**
         * constant for value map entry 138
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_138_FOR_VALUE_ENTRY_Digital_Power_Line = new javax.cim.UnsignedInteger16(
                "138");

        /**
         * constant for value entry Digital Power Line (corresponds to mapEntry 138 )
         */
        public final static String VALUE_ENTRY_Digital_Power_Line = "Digital Power Line";

        /**
         * constant for value map entry 139
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_139_FOR_VALUE_ENTRY_Multimedia_Mail_over_IP = new javax.cim.UnsignedInteger16(
                "139");

        /**
         * constant for value entry Multimedia Mail over IP (corresponds to mapEntry 139 )
         */
        public final static String VALUE_ENTRY_Multimedia_Mail_over_IP = "Multimedia Mail over IP";

        /**
         * constant for value map entry 140
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_140_FOR_VALUE_ENTRY_DTM = new javax.cim.UnsignedInteger16(
                "140");

        /**
         * constant for value entry DTM (corresponds to mapEntry 140 )
         */
        public final static String VALUE_ENTRY_DTM = "DTM";

        /**
         * constant for value map entry 141
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_141_FOR_VALUE_ENTRY_DCN = new javax.cim.UnsignedInteger16(
                "141");

        /**
         * constant for value entry DCN (corresponds to mapEntry 141 )
         */
        public final static String VALUE_ENTRY_DCN = "DCN";

        /**
         * constant for value map entry 142
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_142_FOR_VALUE_ENTRY_IP_Forwarding = new javax.cim.UnsignedInteger16(
                "142");

        /**
         * constant for value entry IP Forwarding (corresponds to mapEntry 142 )
         */
        public final static String VALUE_ENTRY_IP_Forwarding = "IP Forwarding";

        /**
         * constant for value map entry 143
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_143_FOR_VALUE_ENTRY_MSDSL = new javax.cim.UnsignedInteger16(
                "143");

        /**
         * constant for value entry MSDSL (corresponds to mapEntry 143 )
         */
        public final static String VALUE_ENTRY_MSDSL = "MSDSL";

        /**
         * constant for value map entry 144
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_144_FOR_VALUE_ENTRY_IEEE_1394 = new javax.cim.UnsignedInteger16(
                "144");

        /**
         * constant for value entry IEEE 1394 (corresponds to mapEntry 144 )
         */
        public final static String VALUE_ENTRY_IEEE_1394 = "IEEE 1394";

        /**
         * constant for value map entry 145
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_145_FOR_VALUE_ENTRY_IF_GSN_HIPPI_6400 = new javax.cim.UnsignedInteger16(
                "145");

        /**
         * constant for value entry IF-GSN/HIPPI-6400 (corresponds to mapEntry 145 )
         */
        public final static String VALUE_ENTRY_IF_GSN_HIPPI_6400 = "IF-GSN/HIPPI-6400";

        /**
         * constant for value map entry 146
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_146_FOR_VALUE_ENTRY_DVB_RCC_MAC_Layer = new javax.cim.UnsignedInteger16(
                "146");

        /**
         * constant for value entry DVB-RCC MAC Layer (corresponds to mapEntry 146 )
         */
        public final static String VALUE_ENTRY_DVB_RCC_MAC_Layer = "DVB-RCC MAC Layer";

        /**
         * constant for value map entry 147
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_147_FOR_VALUE_ENTRY_DVB_RCC_Downstream = new javax.cim.UnsignedInteger16(
                "147");

        /**
         * constant for value entry DVB-RCC Downstream (corresponds to mapEntry 147 )
         */
        public final static String VALUE_ENTRY_DVB_RCC_Downstream = "DVB-RCC Downstream";

        /**
         * constant for value map entry 148
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_148_FOR_VALUE_ENTRY_DVB_RCC_Upstream = new javax.cim.UnsignedInteger16(
                "148");

        /**
         * constant for value entry DVB-RCC Upstream (corresponds to mapEntry 148 )
         */
        public final static String VALUE_ENTRY_DVB_RCC_Upstream = "DVB-RCC Upstream";

        /**
         * constant for value map entry 149
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_149_FOR_VALUE_ENTRY_ATM_Virtual = new javax.cim.UnsignedInteger16(
                "149");

        /**
         * constant for value entry ATM Virtual (corresponds to mapEntry 149 )
         */
        public final static String VALUE_ENTRY_ATM_Virtual = "ATM Virtual";

        /**
         * constant for value map entry 150
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_150_FOR_VALUE_ENTRY_MPLS_Tunnel = new javax.cim.UnsignedInteger16(
                "150");

        /**
         * constant for value entry MPLS Tunnel (corresponds to mapEntry 150 )
         */
        public final static String VALUE_ENTRY_MPLS_Tunnel = "MPLS Tunnel";

        /**
         * constant for value map entry 151
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_151_FOR_VALUE_ENTRY_SRP = new javax.cim.UnsignedInteger16(
                "151");

        /**
         * constant for value entry SRP (corresponds to mapEntry 151 )
         */
        public final static String VALUE_ENTRY_SRP = "SRP";

        /**
         * constant for value map entry 152
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_152_FOR_VALUE_ENTRY_Voice_over_ATM = new javax.cim.UnsignedInteger16(
                "152");

        /**
         * constant for value entry Voice over ATM (corresponds to mapEntry 152 )
         */
        public final static String VALUE_ENTRY_Voice_over_ATM = "Voice over ATM";

        /**
         * constant for value map entry 153
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_153_FOR_VALUE_ENTRY_Voice_over_Frame_Relay = new javax.cim.UnsignedInteger16(
                "153");

        /**
         * constant for value entry Voice over Frame Relay (corresponds to mapEntry 153 )
         */
        public final static String VALUE_ENTRY_Voice_over_Frame_Relay = "Voice over Frame Relay";

        /**
         * constant for value map entry 154
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_154_FOR_VALUE_ENTRY_ISDL = new javax.cim.UnsignedInteger16(
                "154");

        /**
         * constant for value entry ISDL (corresponds to mapEntry 154 )
         */
        public final static String VALUE_ENTRY_ISDL = "ISDL";

        /**
         * constant for value map entry 155
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_155_FOR_VALUE_ENTRY_Composite_Link = new javax.cim.UnsignedInteger16(
                "155");

        /**
         * constant for value entry Composite Link (corresponds to mapEntry 155 )
         */
        public final static String VALUE_ENTRY_Composite_Link = "Composite Link";

        /**
         * constant for value map entry 156
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_156_FOR_VALUE_ENTRY_SS7_Signaling_Link = new javax.cim.UnsignedInteger16(
                "156");

        /**
         * constant for value entry SS7 Signaling Link (corresponds to mapEntry 156 )
         */
        public final static String VALUE_ENTRY_SS7_Signaling_Link = "SS7 Signaling Link";

        /**
         * constant for value map entry 157
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_157_FOR_VALUE_ENTRY_Proprietary_P2P_Wireless = new javax.cim.UnsignedInteger16(
                "157");

        /**
         * constant for value entry Proprietary P2P Wireless (corresponds to mapEntry 157 )
         */
        public final static String VALUE_ENTRY_Proprietary_P2P_Wireless = "Proprietary P2P Wireless";

        /**
         * constant for value map entry 158
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_158_FOR_VALUE_ENTRY_Frame_Forward = new javax.cim.UnsignedInteger16(
                "158");

        /**
         * constant for value entry Frame Forward (corresponds to mapEntry 158 )
         */
        public final static String VALUE_ENTRY_Frame_Forward = "Frame Forward";

        /**
         * constant for value map entry 159
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_159_FOR_VALUE_ENTRY_RFC1483_Multiprotocol_over_ATM = new javax.cim.UnsignedInteger16(
                "159");

        /**
         * constant for value entry RFC1483 Multiprotocol over ATM (corresponds to mapEntry 159 )
         */
        public final static String VALUE_ENTRY_RFC1483_Multiprotocol_over_ATM = "RFC1483 Multiprotocol over ATM";

        /**
         * constant for value map entry 160
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_160_FOR_VALUE_ENTRY_USB = new javax.cim.UnsignedInteger16(
                "160");

        /**
         * constant for value entry USB (corresponds to mapEntry 160 )
         */
        public final static String VALUE_ENTRY_USB = "USB";

        /**
         * constant for value map entry 161
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_161_FOR_VALUE_ENTRY_IEEE_802_3ad_Link_Aggregate = new javax.cim.UnsignedInteger16(
                "161");

        /**
         * constant for value entry IEEE 802.3ad Link Aggregate (corresponds to mapEntry 161 )
         */
        public final static String VALUE_ENTRY_IEEE_802_3ad_Link_Aggregate = "IEEE 802.3ad Link Aggregate";

        /**
         * constant for value map entry 162
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_162_FOR_VALUE_ENTRY_BGP_Policy_Accounting = new javax.cim.UnsignedInteger16(
                "162");

        /**
         * constant for value entry BGP Policy Accounting (corresponds to mapEntry 162 )
         */
        public final static String VALUE_ENTRY_BGP_Policy_Accounting = "BGP Policy Accounting";

        /**
         * constant for value map entry 163
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_163_FOR_VALUE_ENTRY_FRF__16_Multilink_FR = new javax.cim.UnsignedInteger16(
                "163");

        /**
         * constant for value entry FRF .16 Multilink FR (corresponds to mapEntry 163 )
         */
        public final static String VALUE_ENTRY_FRF__16_Multilink_FR = "FRF .16 Multilink FR";

        /**
         * constant for value map entry 164
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_164_FOR_VALUE_ENTRY_H_323_Gatekeeper = new javax.cim.UnsignedInteger16(
                "164");

        /**
         * constant for value entry H.323 Gatekeeper (corresponds to mapEntry 164 )
         */
        public final static String VALUE_ENTRY_H_323_Gatekeeper = "H.323 Gatekeeper";

        /**
         * constant for value map entry 165
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_165_FOR_VALUE_ENTRY_H_323_Proxy = new javax.cim.UnsignedInteger16(
                "165");

        /**
         * constant for value entry H.323 Proxy (corresponds to mapEntry 165 )
         */
        public final static String VALUE_ENTRY_H_323_Proxy = "H.323 Proxy";

        /**
         * constant for value map entry 166
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_166_FOR_VALUE_ENTRY_MPLS = new javax.cim.UnsignedInteger16(
                "166");

        /**
         * constant for value entry MPLS (corresponds to mapEntry 166 )
         */
        public final static String VALUE_ENTRY_MPLS = "MPLS";

        /**
         * constant for value map entry 167
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_167_FOR_VALUE_ENTRY_Multi_Frequency_Signaling_Link = new javax.cim.UnsignedInteger16(
                "167");

        /**
         * constant for value entry Multi-Frequency Signaling Link (corresponds to mapEntry 167 )
         */
        public final static String VALUE_ENTRY_Multi_Frequency_Signaling_Link = "Multi-Frequency Signaling Link";

        /**
         * constant for value map entry 168
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_168_FOR_VALUE_ENTRY_HDSL_2 = new javax.cim.UnsignedInteger16(
                "168");

        /**
         * constant for value entry HDSL-2 (corresponds to mapEntry 168 )
         */
        public final static String VALUE_ENTRY_HDSL_2 = "HDSL-2";

        /**
         * constant for value map entry 169
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_169_FOR_VALUE_ENTRY_S_HDSL = new javax.cim.UnsignedInteger16(
                "169");

        /**
         * constant for value entry S-HDSL (corresponds to mapEntry 169 )
         */
        public final static String VALUE_ENTRY_S_HDSL = "S-HDSL";

        /**
         * constant for value map entry 170
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_170_FOR_VALUE_ENTRY_DS1_Facility_Data_Link = new javax.cim.UnsignedInteger16(
                "170");

        /**
         * constant for value entry DS1 Facility Data Link (corresponds to mapEntry 170 )
         */
        public final static String VALUE_ENTRY_DS1_Facility_Data_Link = "DS1 Facility Data Link";

        /**
         * constant for value map entry 171
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_171_FOR_VALUE_ENTRY_Packet_over_SONET_SDH = new javax.cim.UnsignedInteger16(
                "171");

        /**
         * constant for value entry Packet over SONET/SDH (corresponds to mapEntry 171 )
         */
        public final static String VALUE_ENTRY_Packet_over_SONET_SDH = "Packet over SONET/SDH";

        /**
         * constant for value map entry 172
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_172_FOR_VALUE_ENTRY_DVB_ASI_Input = new javax.cim.UnsignedInteger16(
                "172");

        /**
         * constant for value entry DVB-ASI Input (corresponds to mapEntry 172 )
         */
        public final static String VALUE_ENTRY_DVB_ASI_Input = "DVB-ASI Input";

        /**
         * constant for value map entry 173
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_173_FOR_VALUE_ENTRY_DVB_ASI_Output = new javax.cim.UnsignedInteger16(
                "173");

        /**
         * constant for value entry DVB-ASI Output (corresponds to mapEntry 173 )
         */
        public final static String VALUE_ENTRY_DVB_ASI_Output = "DVB-ASI Output";

        /**
         * constant for value map entry 174
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_174_FOR_VALUE_ENTRY_Power_Line = new javax.cim.UnsignedInteger16(
                "174");

        /**
         * constant for value entry Power Line (corresponds to mapEntry 174 )
         */
        public final static String VALUE_ENTRY_Power_Line = "Power Line";

        /**
         * constant for value map entry 175
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_175_FOR_VALUE_ENTRY_Non_Facility_Associated_Signaling = new javax.cim.UnsignedInteger16(
                "175");

        /**
         * constant for value entry Non Facility Associated Signaling (corresponds to mapEntry 175 )
         */
        public final static String VALUE_ENTRY_Non_Facility_Associated_Signaling = "Non Facility Associated Signaling";

        /**
         * constant for value map entry 176
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_176_FOR_VALUE_ENTRY_TR008 = new javax.cim.UnsignedInteger16(
                "176");

        /**
         * constant for value entry TR008 (corresponds to mapEntry 176 )
         */
        public final static String VALUE_ENTRY_TR008 = "TR008";

        /**
         * constant for value map entry 177
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_177_FOR_VALUE_ENTRY_GR303_RDT = new javax.cim.UnsignedInteger16(
                "177");

        /**
         * constant for value entry GR303 RDT (corresponds to mapEntry 177 )
         */
        public final static String VALUE_ENTRY_GR303_RDT = "GR303 RDT";

        /**
         * constant for value map entry 178
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_178_FOR_VALUE_ENTRY_GR303_IDT = new javax.cim.UnsignedInteger16(
                "178");

        /**
         * constant for value entry GR303 IDT (corresponds to mapEntry 178 )
         */
        public final static String VALUE_ENTRY_GR303_IDT = "GR303 IDT";

        /**
         * constant for value map entry 179
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_179_FOR_VALUE_ENTRY_ISUP = new javax.cim.UnsignedInteger16(
                "179");

        /**
         * constant for value entry ISUP (corresponds to mapEntry 179 )
         */
        public final static String VALUE_ENTRY_ISUP = "ISUP";

        /**
         * constant for value map entry 180
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_180_FOR_VALUE_ENTRY_Proprietary_Wireless_MAC_Layer = new javax.cim.UnsignedInteger16(
                "180");

        /**
         * constant for value entry Proprietary Wireless MAC Layer (corresponds to mapEntry 180 )
         */
        public final static String VALUE_ENTRY_Proprietary_Wireless_MAC_Layer = "Proprietary Wireless MAC Layer";

        /**
         * constant for value map entry 181
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_181_FOR_VALUE_ENTRY_Proprietary_Wireless_Downstream = new javax.cim.UnsignedInteger16(
                "181");

        /**
         * constant for value entry Proprietary Wireless Downstream (corresponds to mapEntry 181 )
         */
        public final static String VALUE_ENTRY_Proprietary_Wireless_Downstream = "Proprietary Wireless Downstream";

        /**
         * constant for value map entry 182
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_182_FOR_VALUE_ENTRY_Proprietary_Wireless_Upstream = new javax.cim.UnsignedInteger16(
                "182");

        /**
         * constant for value entry Proprietary Wireless Upstream (corresponds to mapEntry 182 )
         */
        public final static String VALUE_ENTRY_Proprietary_Wireless_Upstream = "Proprietary Wireless Upstream";

        /**
         * constant for value map entry 183
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_183_FOR_VALUE_ENTRY_HIPERLAN_Type_2 = new javax.cim.UnsignedInteger16(
                "183");

        /**
         * constant for value entry HIPERLAN Type 2 (corresponds to mapEntry 183 )
         */
        public final static String VALUE_ENTRY_HIPERLAN_Type_2 = "HIPERLAN Type 2";

        /**
         * constant for value map entry 184
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_184_FOR_VALUE_ENTRY_Proprietary_Broadband_Wireless_Access_Point_to_Mulipoint = new javax.cim.UnsignedInteger16(
                "184");

        /**
         * constant for value entry Proprietary Broadband Wireless Access Point to Mulipoint (corresponds to mapEntry 184 )
         */
        public final static String VALUE_ENTRY_Proprietary_Broadband_Wireless_Access_Point_to_Mulipoint = "Proprietary Broadband Wireless Access Point to Mulipoint";

        /**
         * constant for value map entry 185
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_185_FOR_VALUE_ENTRY_SONET_Overhead_Channel = new javax.cim.UnsignedInteger16(
                "185");

        /**
         * constant for value entry SONET Overhead Channel (corresponds to mapEntry 185 )
         */
        public final static String VALUE_ENTRY_SONET_Overhead_Channel = "SONET Overhead Channel";

        /**
         * constant for value map entry 186
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_186_FOR_VALUE_ENTRY_Digital_Wrapper_Overhead_Channel = new javax.cim.UnsignedInteger16(
                "186");

        /**
         * constant for value entry Digital Wrapper Overhead Channel (corresponds to mapEntry 186 )
         */
        public final static String VALUE_ENTRY_Digital_Wrapper_Overhead_Channel = "Digital Wrapper Overhead Channel";

        /**
         * constant for value map entry 187
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_187_FOR_VALUE_ENTRY_ATM_Adaptation_Layer_2 = new javax.cim.UnsignedInteger16(
                "187");

        /**
         * constant for value entry ATM Adaptation Layer 2 (corresponds to mapEntry 187 )
         */
        public final static String VALUE_ENTRY_ATM_Adaptation_Layer_2 = "ATM Adaptation Layer 2";

        /**
         * constant for value map entry 188
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_188_FOR_VALUE_ENTRY_Radio_MAC = new javax.cim.UnsignedInteger16(
                "188");

        /**
         * constant for value entry Radio MAC (corresponds to mapEntry 188 )
         */
        public final static String VALUE_ENTRY_Radio_MAC = "Radio MAC";

        /**
         * constant for value map entry 189
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_189_FOR_VALUE_ENTRY_ATM_Radio = new javax.cim.UnsignedInteger16(
                "189");

        /**
         * constant for value entry ATM Radio (corresponds to mapEntry 189 )
         */
        public final static String VALUE_ENTRY_ATM_Radio = "ATM Radio";

        /**
         * constant for value map entry 190
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_190_FOR_VALUE_ENTRY_Inter_Machine_Trunk = new javax.cim.UnsignedInteger16(
                "190");

        /**
         * constant for value entry Inter Machine Trunk (corresponds to mapEntry 190 )
         */
        public final static String VALUE_ENTRY_Inter_Machine_Trunk = "Inter Machine Trunk";

        /**
         * constant for value map entry 191
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_191_FOR_VALUE_ENTRY_MVL_DSL = new javax.cim.UnsignedInteger16(
                "191");

        /**
         * constant for value entry MVL DSL (corresponds to mapEntry 191 )
         */
        public final static String VALUE_ENTRY_MVL_DSL = "MVL DSL";

        /**
         * constant for value map entry 192
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_192_FOR_VALUE_ENTRY_Long_Read_DSL = new javax.cim.UnsignedInteger16(
                "192");

        /**
         * constant for value entry Long Read DSL (corresponds to mapEntry 192 )
         */
        public final static String VALUE_ENTRY_Long_Read_DSL = "Long Read DSL";

        /**
         * constant for value map entry 193
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_193_FOR_VALUE_ENTRY_Frame_Relay_DLCI_Endpoint = new javax.cim.UnsignedInteger16(
                "193");

        /**
         * constant for value entry Frame Relay DLCI Endpoint (corresponds to mapEntry 193 )
         */
        public final static String VALUE_ENTRY_Frame_Relay_DLCI_Endpoint = "Frame Relay DLCI Endpoint";

        /**
         * constant for value map entry 194
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_194_FOR_VALUE_ENTRY_ATM_VCI_Endpoint = new javax.cim.UnsignedInteger16(
                "194");

        /**
         * constant for value entry ATM VCI Endpoint (corresponds to mapEntry 194 )
         */
        public final static String VALUE_ENTRY_ATM_VCI_Endpoint = "ATM VCI Endpoint";

        /**
         * constant for value map entry 195
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_195_FOR_VALUE_ENTRY_Optical_Channel = new javax.cim.UnsignedInteger16(
                "195");

        /**
         * constant for value entry Optical Channel (corresponds to mapEntry 195 )
         */
        public final static String VALUE_ENTRY_Optical_Channel = "Optical Channel";

        /**
         * constant for value map entry 196
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_196_FOR_VALUE_ENTRY_Optical_Transport = new javax.cim.UnsignedInteger16(
                "196");

        /**
         * constant for value entry Optical Transport (corresponds to mapEntry 196 )
         */
        public final static String VALUE_ENTRY_Optical_Transport = "Optical Transport";

        /**
         * constant for value map entry 197
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_197_FOR_VALUE_ENTRY_Proprietary_ATM = new javax.cim.UnsignedInteger16(
                "197");

        /**
         * constant for value entry Proprietary ATM (corresponds to mapEntry 197 )
         */
        public final static String VALUE_ENTRY_Proprietary_ATM = "Proprietary ATM";

        /**
         * constant for value map entry 198
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_198_FOR_VALUE_ENTRY_Voice_over_Cable = new javax.cim.UnsignedInteger16(
                "198");

        /**
         * constant for value entry Voice over Cable (corresponds to mapEntry 198 )
         */
        public final static String VALUE_ENTRY_Voice_over_Cable = "Voice over Cable";

        /**
         * constant for value map entry 199
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_199_FOR_VALUE_ENTRY_Infiniband = new javax.cim.UnsignedInteger16(
                "199");

        /**
         * constant for value entry Infiniband (corresponds to mapEntry 199 )
         */
        public final static String VALUE_ENTRY_Infiniband = "Infiniband";

        /**
         * constant for value map entry 200
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_200_FOR_VALUE_ENTRY_TE_Link = new javax.cim.UnsignedInteger16(
                "200");

        /**
         * constant for value entry TE Link (corresponds to mapEntry 200 )
         */
        public final static String VALUE_ENTRY_TE_Link = "TE Link";

        /**
         * constant for value map entry 201
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_201_FOR_VALUE_ENTRY_Q_2931 = new javax.cim.UnsignedInteger16(
                "201");

        /**
         * constant for value entry Q.2931 (corresponds to mapEntry 201 )
         */
        public final static String VALUE_ENTRY_Q_2931 = "Q.2931";

        /**
         * constant for value map entry 202
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_202_FOR_VALUE_ENTRY_Virtual_Trunk_Group = new javax.cim.UnsignedInteger16(
                "202");

        /**
         * constant for value entry Virtual Trunk Group (corresponds to mapEntry 202 )
         */
        public final static String VALUE_ENTRY_Virtual_Trunk_Group = "Virtual Trunk Group";

        /**
         * constant for value map entry 203
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_203_FOR_VALUE_ENTRY_SIP_Trunk_Group = new javax.cim.UnsignedInteger16(
                "203");

        /**
         * constant for value entry SIP Trunk Group (corresponds to mapEntry 203 )
         */
        public final static String VALUE_ENTRY_SIP_Trunk_Group = "SIP Trunk Group";

        /**
         * constant for value map entry 204
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_204_FOR_VALUE_ENTRY_SIP_Signaling = new javax.cim.UnsignedInteger16(
                "204");

        /**
         * constant for value entry SIP Signaling (corresponds to mapEntry 204 )
         */
        public final static String VALUE_ENTRY_SIP_Signaling = "SIP Signaling";

        /**
         * constant for value map entry 205
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_205_FOR_VALUE_ENTRY_CATV_Upstream_Channel = new javax.cim.UnsignedInteger16(
                "205");

        /**
         * constant for value entry CATV Upstream Channel (corresponds to mapEntry 205 )
         */
        public final static String VALUE_ENTRY_CATV_Upstream_Channel = "CATV Upstream Channel";

        /**
         * constant for value map entry 206
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_206_FOR_VALUE_ENTRY_Econet = new javax.cim.UnsignedInteger16(
                "206");

        /**
         * constant for value entry Econet (corresponds to mapEntry 206 )
         */
        public final static String VALUE_ENTRY_Econet = "Econet";

        /**
         * constant for value map entry 207
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_207_FOR_VALUE_ENTRY_FSAN_155Mb_PON = new javax.cim.UnsignedInteger16(
                "207");

        /**
         * constant for value entry FSAN 155Mb PON (corresponds to mapEntry 207 )
         */
        public final static String VALUE_ENTRY_FSAN_155Mb_PON = "FSAN 155Mb PON";

        /**
         * constant for value map entry 208
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_208_FOR_VALUE_ENTRY_FSAN_622Mb_PON = new javax.cim.UnsignedInteger16(
                "208");

        /**
         * constant for value entry FSAN 622Mb PON (corresponds to mapEntry 208 )
         */
        public final static String VALUE_ENTRY_FSAN_622Mb_PON = "FSAN 622Mb PON";

        /**
         * constant for value map entry 209
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_209_FOR_VALUE_ENTRY_Transparent_Bridge = new javax.cim.UnsignedInteger16(
                "209");

        /**
         * constant for value entry Transparent Bridge (corresponds to mapEntry 209 )
         */
        public final static String VALUE_ENTRY_Transparent_Bridge = "Transparent Bridge";

        /**
         * constant for value map entry 210
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_210_FOR_VALUE_ENTRY_Line_Group = new javax.cim.UnsignedInteger16(
                "210");

        /**
         * constant for value entry Line Group (corresponds to mapEntry 210 )
         */
        public final static String VALUE_ENTRY_Line_Group = "Line Group";

        /**
         * constant for value map entry 211
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_211_FOR_VALUE_ENTRY_Voice_E_M_Feature_Group = new javax.cim.UnsignedInteger16(
                "211");

        /**
         * constant for value entry Voice E&M Feature Group (corresponds to mapEntry 211 )
         */
        public final static String VALUE_ENTRY_Voice_E_M_Feature_Group = "Voice E&M Feature Group";

        /**
         * constant for value map entry 212
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_212_FOR_VALUE_ENTRY_Voice_FGD_EANA = new javax.cim.UnsignedInteger16(
                "212");

        /**
         * constant for value entry Voice FGD EANA (corresponds to mapEntry 212 )
         */
        public final static String VALUE_ENTRY_Voice_FGD_EANA = "Voice FGD EANA";

        /**
         * constant for value map entry 213
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_213_FOR_VALUE_ENTRY_Voice_DID = new javax.cim.UnsignedInteger16(
                "213");

        /**
         * constant for value entry Voice DID (corresponds to mapEntry 213 )
         */
        public final static String VALUE_ENTRY_Voice_DID = "Voice DID";

        /**
         * constant for value map entry 214
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_214_FOR_VALUE_ENTRY_MPEG_Transport = new javax.cim.UnsignedInteger16(
                "214");

        /**
         * constant for value entry MPEG Transport (corresponds to mapEntry 214 )
         */
        public final static String VALUE_ENTRY_MPEG_Transport = "MPEG Transport";

        /**
         * constant for value map entry 215
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_215_FOR_VALUE_ENTRY_6To4 = new javax.cim.UnsignedInteger16(
                "215");

        /**
         * constant for value entry 6To4 (corresponds to mapEntry 215 )
         */
        public final static String VALUE_ENTRY_6To4 = "6To4";

        /**
         * constant for value map entry 216
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_216_FOR_VALUE_ENTRY_GTP = new javax.cim.UnsignedInteger16(
                "216");

        /**
         * constant for value entry GTP (corresponds to mapEntry 216 )
         */
        public final static String VALUE_ENTRY_GTP = "GTP";

        /**
         * constant for value map entry 217
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_217_FOR_VALUE_ENTRY_Paradyne_EtherLoop_1 = new javax.cim.UnsignedInteger16(
                "217");

        /**
         * constant for value entry Paradyne EtherLoop 1 (corresponds to mapEntry 217 )
         */
        public final static String VALUE_ENTRY_Paradyne_EtherLoop_1 = "Paradyne EtherLoop 1";

        /**
         * constant for value map entry 218
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_218_FOR_VALUE_ENTRY_Paradyne_EtherLoop_2 = new javax.cim.UnsignedInteger16(
                "218");

        /**
         * constant for value entry Paradyne EtherLoop 2 (corresponds to mapEntry 218 )
         */
        public final static String VALUE_ENTRY_Paradyne_EtherLoop_2 = "Paradyne EtherLoop 2";

        /**
         * constant for value map entry 219
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_219_FOR_VALUE_ENTRY_Optical_Channel_Group = new javax.cim.UnsignedInteger16(
                "219");

        /**
         * constant for value entry Optical Channel Group (corresponds to mapEntry 219 )
         */
        public final static String VALUE_ENTRY_Optical_Channel_Group = "Optical Channel Group";

        /**
         * constant for value map entry 220
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_220_FOR_VALUE_ENTRY_HomePNA = new javax.cim.UnsignedInteger16(
                "220");

        /**
         * constant for value entry HomePNA (corresponds to mapEntry 220 )
         */
        public final static String VALUE_ENTRY_HomePNA = "HomePNA";

        /**
         * constant for value map entry 221
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_221_FOR_VALUE_ENTRY_GFP = new javax.cim.UnsignedInteger16(
                "221");

        /**
         * constant for value entry GFP (corresponds to mapEntry 221 )
         */
        public final static String VALUE_ENTRY_GFP = "GFP";

        /**
         * constant for value map entry 222
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_222_FOR_VALUE_ENTRY_ciscoISLvlan = new javax.cim.UnsignedInteger16(
                "222");

        /**
         * constant for value entry ciscoISLvlan (corresponds to mapEntry 222 )
         */
        public final static String VALUE_ENTRY_ciscoISLvlan = "ciscoISLvlan";

        /**
         * constant for value map entry 223
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_223_FOR_VALUE_ENTRY_actelisMetaLOOP = new javax.cim.UnsignedInteger16(
                "223");

        /**
         * constant for value entry actelisMetaLOOP (corresponds to mapEntry 223 )
         */
        public final static String VALUE_ENTRY_actelisMetaLOOP = "actelisMetaLOOP";

        /**
         * constant for value map entry 224
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_224_FOR_VALUE_ENTRY_Fcip = new javax.cim.UnsignedInteger16(
                "224");

        /**
         * constant for value entry Fcip (corresponds to mapEntry 224 )
         */
        public final static String VALUE_ENTRY_Fcip = "Fcip";

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
         * constant for value map entry 4099
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4099_FOR_VALUE_ENTRY_IPX = new javax.cim.UnsignedInteger16(
                "4099");

        /**
         * constant for value entry IPX (corresponds to mapEntry 4099 )
         */
        public final static String VALUE_ENTRY_IPX = "IPX";

        /**
         * constant for value map entry 4100
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4100_FOR_VALUE_ENTRY_DECnet = new javax.cim.UnsignedInteger16(
                "4100");

        /**
         * constant for value entry DECnet (corresponds to mapEntry 4100 )
         */
        public final static String VALUE_ENTRY_DECnet = "DECnet";

        /**
         * constant for value map entry 4101
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4101_FOR_VALUE_ENTRY_SNA = new javax.cim.UnsignedInteger16(
                "4101");

        /**
         * constant for value entry SNA (corresponds to mapEntry 4101 )
         */
        public final static String VALUE_ENTRY_SNA = "SNA";

        /**
         * constant for value map entry 4102
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4102_FOR_VALUE_ENTRY_CONP = new javax.cim.UnsignedInteger16(
                "4102");

        /**
         * constant for value entry CONP (corresponds to mapEntry 4102 )
         */
        public final static String VALUE_ENTRY_CONP = "CONP";

        /**
         * constant for value map entry 4103
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4103_FOR_VALUE_ENTRY_CLNP = new javax.cim.UnsignedInteger16(
                "4103");

        /**
         * constant for value entry CLNP (corresponds to mapEntry 4103 )
         */
        public final static String VALUE_ENTRY_CLNP = "CLNP";

        /**
         * constant for value map entry 4104
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4104_FOR_VALUE_ENTRY_VINES = new javax.cim.UnsignedInteger16(
                "4104");

        /**
         * constant for value entry VINES (corresponds to mapEntry 4104 )
         */
        public final static String VALUE_ENTRY_VINES = "VINES";

        /**
         * constant for value map entry 4105
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4105_FOR_VALUE_ENTRY_XNS = new javax.cim.UnsignedInteger16(
                "4105");

        /**
         * constant for value entry XNS (corresponds to mapEntry 4105 )
         */
        public final static String VALUE_ENTRY_XNS = "XNS";

        /**
         * constant for value map entry 4106
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4106_FOR_VALUE_ENTRY_ISDN_B_Channel_Endpoint = new javax.cim.UnsignedInteger16(
                "4106");

        /**
         * constant for value entry ISDN B Channel Endpoint (corresponds to mapEntry 4106 )
         */
        public final static String VALUE_ENTRY_ISDN_B_Channel_Endpoint = "ISDN B Channel Endpoint";

        /**
         * constant for value map entry 4107
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4107_FOR_VALUE_ENTRY_ISDN_D_Channel_Endpoint = new javax.cim.UnsignedInteger16(
                "4107");

        /**
         * constant for value entry ISDN D Channel Endpoint (corresponds to mapEntry 4107 )
         */
        public final static String VALUE_ENTRY_ISDN_D_Channel_Endpoint = "ISDN D Channel Endpoint";

        /**
         * constant for value map entry 4108
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4108_FOR_VALUE_ENTRY_BGP = new javax.cim.UnsignedInteger16(
                "4108");

        /**
         * constant for value entry BGP (corresponds to mapEntry 4108 )
         */
        public final static String VALUE_ENTRY_BGP = "BGP";

        /**
         * constant for value map entry 4109
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4109_FOR_VALUE_ENTRY_OSPF = new javax.cim.UnsignedInteger16(
                "4109");

        /**
         * constant for value entry OSPF (corresponds to mapEntry 4109 )
         */
        public final static String VALUE_ENTRY_OSPF = "OSPF";

        /**
         * constant for value map entry 4110
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4110_FOR_VALUE_ENTRY_UDP = new javax.cim.UnsignedInteger16(
                "4110");

        /**
         * constant for value entry UDP (corresponds to mapEntry 4110 )
         */
        public final static String VALUE_ENTRY_UDP = "UDP";

        /**
         * constant for value map entry 4111
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4111_FOR_VALUE_ENTRY_TCP = new javax.cim.UnsignedInteger16(
                "4111");

        /**
         * constant for value entry TCP (corresponds to mapEntry 4111 )
         */
        public final static String VALUE_ENTRY_TCP = "TCP";

        /**
         * constant for value map entry 4112
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4112_FOR_VALUE_ENTRY_802_11a = new javax.cim.UnsignedInteger16(
                "4112");

        /**
         * constant for value entry 802.11a (corresponds to mapEntry 4112 )
         */
        public final static String VALUE_ENTRY_802_11a = "802.11a";

        /**
         * constant for value map entry 4113
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4113_FOR_VALUE_ENTRY_802_11b = new javax.cim.UnsignedInteger16(
                "4113");

        /**
         * constant for value entry 802.11b (corresponds to mapEntry 4113 )
         */
        public final static String VALUE_ENTRY_802_11b = "802.11b";

        /**
         * constant for value map entry 4114
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4114_FOR_VALUE_ENTRY_802_11g = new javax.cim.UnsignedInteger16(
                "4114");

        /**
         * constant for value entry 802.11g (corresponds to mapEntry 4114 )
         */
        public final static String VALUE_ENTRY_802_11g = "802.11g";

        /**
         * constant for value map entry 4115
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4115_FOR_VALUE_ENTRY_802_11h = new javax.cim.UnsignedInteger16(
                "4115");

        /**
         * constant for value entry 802.11h (corresponds to mapEntry 4115 )
         */
        public final static String VALUE_ENTRY_802_11h = "802.11h";

        /**
         * constant for value map entry 4200
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4200_FOR_VALUE_ENTRY_NFS = new javax.cim.UnsignedInteger16(
                "4200");

        /**
         * constant for value entry NFS (corresponds to mapEntry 4200 )
         */
        public final static String VALUE_ENTRY_NFS = "NFS";

        /**
         * constant for value map entry 4201
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4201_FOR_VALUE_ENTRY_CIFS = new javax.cim.UnsignedInteger16(
                "4201");

        /**
         * constant for value entry CIFS (corresponds to mapEntry 4201 )
         */
        public final static String VALUE_ENTRY_CIFS = "CIFS";

        /**
         * constant for value map entry 4202
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4202_FOR_VALUE_ENTRY_DAFS = new javax.cim.UnsignedInteger16(
                "4202");

        /**
         * constant for value entry DAFS (corresponds to mapEntry 4202 )
         */
        public final static String VALUE_ENTRY_DAFS = "DAFS";

        /**
         * constant for value map entry 4203
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4203_FOR_VALUE_ENTRY_WebDAV = new javax.cim.UnsignedInteger16(
                "4203");

        /**
         * constant for value entry WebDAV (corresponds to mapEntry 4203 )
         */
        public final static String VALUE_ENTRY_WebDAV = "WebDAV";

        /**
         * constant for value map entry 4204
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4204_FOR_VALUE_ENTRY_HTTP = new javax.cim.UnsignedInteger16(
                "4204");

        /**
         * constant for value entry HTTP (corresponds to mapEntry 4204 )
         */
        public final static String VALUE_ENTRY_HTTP = "HTTP";

        /**
         * constant for value map entry 4205
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4205_FOR_VALUE_ENTRY_FTP = new javax.cim.UnsignedInteger16(
                "4205");

        /**
         * constant for value entry FTP (corresponds to mapEntry 4205 )
         */
        public final static String VALUE_ENTRY_FTP = "FTP";

        /**
         * constant for value map entry 4300
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4300_FOR_VALUE_ENTRY_NDMP = new javax.cim.UnsignedInteger16(
                "4300");

        /**
         * constant for value entry NDMP (corresponds to mapEntry 4300 )
         */
        public final static String VALUE_ENTRY_NDMP = "NDMP";

        /**
         * constant for value map entry 4400
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4400_FOR_VALUE_ENTRY_Telnet = new javax.cim.UnsignedInteger16(
                "4400");

        /**
         * constant for value entry Telnet (corresponds to mapEntry 4400 )
         */
        public final static String VALUE_ENTRY_Telnet = "Telnet";

        /**
         * constant for value map entry 4401
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4401_FOR_VALUE_ENTRY_SSH = new javax.cim.UnsignedInteger16(
                "4401");

        /**
         * constant for value entry SSH (corresponds to mapEntry 4401 )
         */
        public final static String VALUE_ENTRY_SSH = "SSH";

        /**
         * constant for value map entry 4402
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4402_FOR_VALUE_ENTRY_SM_CLP = new javax.cim.UnsignedInteger16(
                "4402");

        /**
         * constant for value entry SM CLP (corresponds to mapEntry 4402 )
         */
        public final static String VALUE_ENTRY_SM_CLP = "SM CLP";

        /**
         * constant for value map entry 4403
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4403_FOR_VALUE_ENTRY_SMTP = new javax.cim.UnsignedInteger16(
                "4403");

        /**
         * constant for value entry SMTP (corresponds to mapEntry 4403 )
         */
        public final static String VALUE_ENTRY_SMTP = "SMTP";

        /**
         * constant for value map entry 4404
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4404_FOR_VALUE_ENTRY_LDAP = new javax.cim.UnsignedInteger16(
                "4404");

        /**
         * constant for value entry LDAP (corresponds to mapEntry 4404 )
         */
        public final static String VALUE_ENTRY_LDAP = "LDAP";

        /**
         * constant for value map entry 4405
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4405_FOR_VALUE_ENTRY_RDP = new javax.cim.UnsignedInteger16(
                "4405");

        /**
         * constant for value entry RDP (corresponds to mapEntry 4405 )
         */
        public final static String VALUE_ENTRY_RDP = "RDP";

        /**
         * constant for value map entry 4406
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4406_FOR_VALUE_ENTRY_HTTPS = new javax.cim.UnsignedInteger16(
                "4406");

        /**
         * constant for value entry HTTPS (corresponds to mapEntry 4406 )
         */
        public final static String VALUE_ENTRY_HTTPS = "HTTPS";

        /**
         * constant for value map entry ..
         */

        /**
         * constant for value entry DMTF Reserved (corresponds to mapEntry .. )
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

            if (VALUE_ENTRY_Unknown.equals(value)) {
                return VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown;
            }

            if (VALUE_ENTRY_Other.equals(value)) {
                return VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other;
            }

            if (VALUE_ENTRY_Regular_1822.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Regular_1822;
            }

            if (VALUE_ENTRY_HDH_1822.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_HDH_1822;
            }

            if (VALUE_ENTRY_DDN_X_25.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DDN_X_25;
            }

            if (VALUE_ENTRY_RFC877_X_25.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_RFC877_X_25;
            }

            if (VALUE_ENTRY_Ethernet_CSMA_CD.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Ethernet_CSMA_CD;
            }

            if (VALUE_ENTRY_ISO_802_3_CSMA_CD.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_ISO_802_3_CSMA_CD;
            }

            if (VALUE_ENTRY_ISO_802_4_Token_Bus.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_ISO_802_4_Token_Bus;
            }

            if (VALUE_ENTRY_ISO_802_5_Token_Ring.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_ISO_802_5_Token_Ring;
            }

            if (VALUE_ENTRY_ISO_802_6_MAN.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_ISO_802_6_MAN;
            }

            if (VALUE_ENTRY_StarLAN.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_StarLAN;
            }

            if (VALUE_ENTRY_Proteon_10Mbit.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Proteon_10Mbit;
            }

            if (VALUE_ENTRY_Proteon_80Mbit.equals(value)) {
                return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Proteon_80Mbit;
            }

            if (VALUE_ENTRY_HyperChannel.equals(value)) {
                return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_HyperChannel;
            }

            if (VALUE_ENTRY_FDDI.equals(value)) {
                return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_FDDI;
            }

            if (VALUE_ENTRY_LAP_B.equals(value)) {
                return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_LAP_B;
            }

            if (VALUE_ENTRY_SDLC.equals(value)) {
                return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_SDLC;
            }

            if (VALUE_ENTRY_DS1.equals(value)) {
                return VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_DS1;
            }

            if (VALUE_ENTRY_E1.equals(value)) {
                return VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_E1;
            }

            if (VALUE_ENTRY_Basic_ISDN.equals(value)) {
                return VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Basic_ISDN;
            }

            if (VALUE_ENTRY_Primary_ISDN.equals(value)) {
                return VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Primary_ISDN;
            }

            if (VALUE_ENTRY_Proprietary_Point_to_Point_Serial.equals(value)) {
                return VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_Proprietary_Point_to_Point_Serial;
            }

            if (VALUE_ENTRY_PPP.equals(value)) {
                return VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_PPP;
            }

            if (VALUE_ENTRY_Software_Loopback.equals(value)) {
                return VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Software_Loopback;
            }

            if (VALUE_ENTRY_EON.equals(value)) {
                return VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_EON;
            }

            if (VALUE_ENTRY_Ethernet_3Mbit.equals(value)) {
                return VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_Ethernet_3Mbit;
            }

            if (VALUE_ENTRY_NSIP.equals(value)) {
                return VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_NSIP;
            }

            if (VALUE_ENTRY_SLIP.equals(value)) {
                return VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_SLIP;
            }

            if (VALUE_ENTRY_Ultra.equals(value)) {
                return VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Ultra;
            }

            if (VALUE_ENTRY_DS3.equals(value)) {
                return VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_DS3;
            }

            if (VALUE_ENTRY_SIP.equals(value)) {
                return VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_SIP;
            }

            if (VALUE_ENTRY_Frame_Relay.equals(value)) {
                return VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Frame_Relay;
            }

            if (VALUE_ENTRY_RS_232.equals(value)) {
                return VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_RS_232;
            }

            if (VALUE_ENTRY_Parallel.equals(value)) {
                return VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_Parallel;
            }

            if (VALUE_ENTRY_ARCNet.equals(value)) {
                return VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_ARCNet;
            }

            if (VALUE_ENTRY_ARCNet_Plus.equals(value)) {
                return VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_ARCNet_Plus;
            }

            if (VALUE_ENTRY_ATM.equals(value)) {
                return VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_ATM;
            }

            if (VALUE_ENTRY_MIO_X_25.equals(value)) {
                return VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_MIO_X_25;
            }

            if (VALUE_ENTRY_SONET.equals(value)) {
                return VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_SONET;
            }

            if (VALUE_ENTRY_X_25_PLE.equals(value)) {
                return VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_X_25_PLE;
            }

            if (VALUE_ENTRY_ISO_802_211c.equals(value)) {
                return VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_ISO_802_211c;
            }

            if (VALUE_ENTRY_LocalTalk.equals(value)) {
                return VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_LocalTalk;
            }

            if (VALUE_ENTRY_SMDS_DXI.equals(value)) {
                return VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_SMDS_DXI;
            }

            if (VALUE_ENTRY_Frame_Relay_Service.equals(value)) {
                return VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_Frame_Relay_Service;
            }

            if (VALUE_ENTRY_V_35.equals(value)) {
                return VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_V_35;
            }

            if (VALUE_ENTRY_HSSI.equals(value)) {
                return VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_HSSI;
            }

            if (VALUE_ENTRY_HIPPI.equals(value)) {
                return VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_HIPPI;
            }

            if (VALUE_ENTRY_Modem.equals(value)) {
                return VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_Modem;
            }

            if (VALUE_ENTRY_AAL5.equals(value)) {
                return VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_AAL5;
            }

            if (VALUE_ENTRY_SONET_Path.equals(value)) {
                return VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_SONET_Path;
            }

            if (VALUE_ENTRY_SONET_VT.equals(value)) {
                return VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_SONET_VT;
            }

            if (VALUE_ENTRY_SMDS_ICIP.equals(value)) {
                return VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_SMDS_ICIP;
            }

            if (VALUE_ENTRY_Proprietary_Virtual_Internal.equals(value)) {
                return VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_Proprietary_Virtual_Internal;
            }

            if (VALUE_ENTRY_Proprietary_Multiplexor.equals(value)) {
                return VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_Proprietary_Multiplexor;
            }

            if (VALUE_ENTRY_IEEE_802_12.equals(value)) {
                return VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_IEEE_802_12;
            }

            if (VALUE_ENTRY_Fibre_Channel.equals(value)) {
                return VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_Fibre_Channel;
            }

            if (VALUE_ENTRY_HIPPI_Interface.equals(value)) {
                return VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_HIPPI_Interface;
            }

            if (VALUE_ENTRY_Frame_Relay_Interconnect.equals(value)) {
                return VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_Frame_Relay_Interconnect;
            }

            if (VALUE_ENTRY_ATM_Emulated_LAN_for_802_3.equals(value)) {
                return VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_ATM_Emulated_LAN_for_802_3;
            }

            if (VALUE_ENTRY_ATM_Emulated_LAN_for_802_5.equals(value)) {
                return VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_ATM_Emulated_LAN_for_802_5;
            }

            if (VALUE_ENTRY_ATM_Emulated_Circuit.equals(value)) {
                return VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_ATM_Emulated_Circuit;
            }

            if (VALUE_ENTRY_Fast_Ethernet__100BaseT_.equals(value)) {
                return VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_Fast_Ethernet__100BaseT_;
            }

            if (VALUE_ENTRY_ISDN.equals(value)) {
                return VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_ISDN;
            }

            if (VALUE_ENTRY_V_11.equals(value)) {
                return VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_V_11;
            }

            if (VALUE_ENTRY_V_36.equals(value)) {
                return VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_V_36;
            }

            if (VALUE_ENTRY_G703_at_64K.equals(value)) {
                return VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_G703_at_64K;
            }

            if (VALUE_ENTRY_G703_at_2Mb.equals(value)) {
                return VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_G703_at_2Mb;
            }

            if (VALUE_ENTRY_QLLC.equals(value)) {
                return VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_QLLC;
            }

            if (VALUE_ENTRY_Fast_Ethernet_100BaseFX.equals(value)) {
                return VALUE_MAP_ENTRY_69_FOR_VALUE_ENTRY_Fast_Ethernet_100BaseFX;
            }

            if (VALUE_ENTRY_Channel.equals(value)) {
                return VALUE_MAP_ENTRY_70_FOR_VALUE_ENTRY_Channel;
            }

            if (VALUE_ENTRY_IEEE_802_11.equals(value)) {
                return VALUE_MAP_ENTRY_71_FOR_VALUE_ENTRY_IEEE_802_11;
            }

            if (VALUE_ENTRY_IBM_260_370_OEMI_Channel.equals(value)) {
                return VALUE_MAP_ENTRY_72_FOR_VALUE_ENTRY_IBM_260_370_OEMI_Channel;
            }

            if (VALUE_ENTRY_ESCON.equals(value)) {
                return VALUE_MAP_ENTRY_73_FOR_VALUE_ENTRY_ESCON;
            }

            if (VALUE_ENTRY_Data_Link_Switching.equals(value)) {
                return VALUE_MAP_ENTRY_74_FOR_VALUE_ENTRY_Data_Link_Switching;
            }

            if (VALUE_ENTRY_ISDN_S_T_Interface.equals(value)) {
                return VALUE_MAP_ENTRY_75_FOR_VALUE_ENTRY_ISDN_S_T_Interface;
            }

            if (VALUE_ENTRY_ISDN_U_Interface.equals(value)) {
                return VALUE_MAP_ENTRY_76_FOR_VALUE_ENTRY_ISDN_U_Interface;
            }

            if (VALUE_ENTRY_LAP_D.equals(value)) {
                return VALUE_MAP_ENTRY_77_FOR_VALUE_ENTRY_LAP_D;
            }

            if (VALUE_ENTRY_IP_Switch.equals(value)) {
                return VALUE_MAP_ENTRY_78_FOR_VALUE_ENTRY_IP_Switch;
            }

            if (VALUE_ENTRY_Remote_Source_Route_Bridging.equals(value)) {
                return VALUE_MAP_ENTRY_79_FOR_VALUE_ENTRY_Remote_Source_Route_Bridging;
            }

            if (VALUE_ENTRY_ATM_Logical.equals(value)) {
                return VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_ATM_Logical;
            }

            if (VALUE_ENTRY_DS0.equals(value)) {
                return VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_DS0;
            }

            if (VALUE_ENTRY_DS0_Bundle.equals(value)) {
                return VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_DS0_Bundle;
            }

            if (VALUE_ENTRY_BSC.equals(value)) {
                return VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_BSC;
            }

            if (VALUE_ENTRY_Async.equals(value)) {
                return VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_Async;
            }

            if (VALUE_ENTRY_Combat_Net_Radio.equals(value)) {
                return VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_Combat_Net_Radio;
            }

            if (VALUE_ENTRY_ISO_802_5r_DTR.equals(value)) {
                return VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_ISO_802_5r_DTR;
            }

            if (VALUE_ENTRY_Ext_Pos_Loc_Report_System.equals(value)) {
                return VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_Ext_Pos_Loc_Report_System;
            }

            if (VALUE_ENTRY_AppleTalk_Remote_Access_Protocol.equals(value)) {
                return VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_AppleTalk_Remote_Access_Protocol;
            }

            if (VALUE_ENTRY_Proprietary_Connectionless.equals(value)) {
                return VALUE_MAP_ENTRY_89_FOR_VALUE_ENTRY_Proprietary_Connectionless;
            }

            if (VALUE_ENTRY_ITU_X_29_Host_PAD.equals(value)) {
                return VALUE_MAP_ENTRY_90_FOR_VALUE_ENTRY_ITU_X_29_Host_PAD;
            }

            if (VALUE_ENTRY_ITU_X_3_Terminal_PAD.equals(value)) {
                return VALUE_MAP_ENTRY_91_FOR_VALUE_ENTRY_ITU_X_3_Terminal_PAD;
            }

            if (VALUE_ENTRY_Frame_Relay_MPI.equals(value)) {
                return VALUE_MAP_ENTRY_92_FOR_VALUE_ENTRY_Frame_Relay_MPI;
            }

            if (VALUE_ENTRY_ITU_X_213.equals(value)) {
                return VALUE_MAP_ENTRY_93_FOR_VALUE_ENTRY_ITU_X_213;
            }

            if (VALUE_ENTRY_ADSL.equals(value)) {
                return VALUE_MAP_ENTRY_94_FOR_VALUE_ENTRY_ADSL;
            }

            if (VALUE_ENTRY_RADSL.equals(value)) {
                return VALUE_MAP_ENTRY_95_FOR_VALUE_ENTRY_RADSL;
            }

            if (VALUE_ENTRY_SDSL.equals(value)) {
                return VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_SDSL;
            }

            if (VALUE_ENTRY_VDSL.equals(value)) {
                return VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_VDSL;
            }

            if (VALUE_ENTRY_ISO_802_5_CRFP.equals(value)) {
                return VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_ISO_802_5_CRFP;
            }

            if (VALUE_ENTRY_Myrinet.equals(value)) {
                return VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_Myrinet;
            }

            if (VALUE_ENTRY_Voice_Receive_and_Transmit.equals(value)) {
                return VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Voice_Receive_and_Transmit;
            }

            if (VALUE_ENTRY_Voice_Foreign_Exchange_Office.equals(value)) {
                return VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Voice_Foreign_Exchange_Office;
            }

            if (VALUE_ENTRY_Voice_Foreign_Exchange_Service.equals(value)) {
                return VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_Voice_Foreign_Exchange_Service;
            }

            if (VALUE_ENTRY_Voice_Encapsulation.equals(value)) {
                return VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_Voice_Encapsulation;
            }

            if (VALUE_ENTRY_Voice_over_IP.equals(value)) {
                return VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_Voice_over_IP;
            }

            if (VALUE_ENTRY_ATM_DXI.equals(value)) {
                return VALUE_MAP_ENTRY_105_FOR_VALUE_ENTRY_ATM_DXI;
            }

            if (VALUE_ENTRY_ATM_FUNI.equals(value)) {
                return VALUE_MAP_ENTRY_106_FOR_VALUE_ENTRY_ATM_FUNI;
            }

            if (VALUE_ENTRY_ATM_IMA.equals(value)) {
                return VALUE_MAP_ENTRY_107_FOR_VALUE_ENTRY_ATM_IMA;
            }

            if (VALUE_ENTRY_PPP_Multilink_Bundle.equals(value)) {
                return VALUE_MAP_ENTRY_108_FOR_VALUE_ENTRY_PPP_Multilink_Bundle;
            }

            if (VALUE_ENTRY_IP_over_CDLC.equals(value)) {
                return VALUE_MAP_ENTRY_109_FOR_VALUE_ENTRY_IP_over_CDLC;
            }

            if (VALUE_ENTRY_IP_over_CLAW.equals(value)) {
                return VALUE_MAP_ENTRY_110_FOR_VALUE_ENTRY_IP_over_CLAW;
            }

            if (VALUE_ENTRY_Stack_to_Stack.equals(value)) {
                return VALUE_MAP_ENTRY_111_FOR_VALUE_ENTRY_Stack_to_Stack;
            }

            if (VALUE_ENTRY_Virtual_IP_Address.equals(value)) {
                return VALUE_MAP_ENTRY_112_FOR_VALUE_ENTRY_Virtual_IP_Address;
            }

            if (VALUE_ENTRY_MPC.equals(value)) {
                return VALUE_MAP_ENTRY_113_FOR_VALUE_ENTRY_MPC;
            }

            if (VALUE_ENTRY_IP_over_ATM.equals(value)) {
                return VALUE_MAP_ENTRY_114_FOR_VALUE_ENTRY_IP_over_ATM;
            }

            if (VALUE_ENTRY_ISO_802_5j_Fibre_Token_Ring.equals(value)) {
                return VALUE_MAP_ENTRY_115_FOR_VALUE_ENTRY_ISO_802_5j_Fibre_Token_Ring;
            }

            if (VALUE_ENTRY_TDLC.equals(value)) {
                return VALUE_MAP_ENTRY_116_FOR_VALUE_ENTRY_TDLC;
            }

            if (VALUE_ENTRY_Gigabit_Ethernet.equals(value)) {
                return VALUE_MAP_ENTRY_117_FOR_VALUE_ENTRY_Gigabit_Ethernet;
            }

            if (VALUE_ENTRY_HDLC.equals(value)) {
                return VALUE_MAP_ENTRY_118_FOR_VALUE_ENTRY_HDLC;
            }

            if (VALUE_ENTRY_LAP_F.equals(value)) {
                return VALUE_MAP_ENTRY_119_FOR_VALUE_ENTRY_LAP_F;
            }

            if (VALUE_ENTRY_V_37.equals(value)) {
                return VALUE_MAP_ENTRY_120_FOR_VALUE_ENTRY_V_37;
            }

            if (VALUE_ENTRY_X_25_MLP.equals(value)) {
                return VALUE_MAP_ENTRY_121_FOR_VALUE_ENTRY_X_25_MLP;
            }

            if (VALUE_ENTRY_X_25_Hunt_Group.equals(value)) {
                return VALUE_MAP_ENTRY_122_FOR_VALUE_ENTRY_X_25_Hunt_Group;
            }

            if (VALUE_ENTRY_Transp_HDLC.equals(value)) {
                return VALUE_MAP_ENTRY_123_FOR_VALUE_ENTRY_Transp_HDLC;
            }

            if (VALUE_ENTRY_Interleave_Channel.equals(value)) {
                return VALUE_MAP_ENTRY_124_FOR_VALUE_ENTRY_Interleave_Channel;
            }

            if (VALUE_ENTRY_FAST_Channel.equals(value)) {
                return VALUE_MAP_ENTRY_125_FOR_VALUE_ENTRY_FAST_Channel;
            }

            if (VALUE_ENTRY_IP__for_APPN_HPR_in_IP_Networks_.equals(value)) {
                return VALUE_MAP_ENTRY_126_FOR_VALUE_ENTRY_IP__for_APPN_HPR_in_IP_Networks_;
            }

            if (VALUE_ENTRY_CATV_MAC_Layer.equals(value)) {
                return VALUE_MAP_ENTRY_127_FOR_VALUE_ENTRY_CATV_MAC_Layer;
            }

            if (VALUE_ENTRY_CATV_Downstream.equals(value)) {
                return VALUE_MAP_ENTRY_128_FOR_VALUE_ENTRY_CATV_Downstream;
            }

            if (VALUE_ENTRY_CATV_Upstream.equals(value)) {
                return VALUE_MAP_ENTRY_129_FOR_VALUE_ENTRY_CATV_Upstream;
            }

            if (VALUE_ENTRY_Avalon_12MPP_Switch.equals(value)) {
                return VALUE_MAP_ENTRY_130_FOR_VALUE_ENTRY_Avalon_12MPP_Switch;
            }

            if (VALUE_ENTRY_Tunnel.equals(value)) {
                return VALUE_MAP_ENTRY_131_FOR_VALUE_ENTRY_Tunnel;
            }

            if (VALUE_ENTRY_Coffee.equals(value)) {
                return VALUE_MAP_ENTRY_132_FOR_VALUE_ENTRY_Coffee;
            }

            if (VALUE_ENTRY_Circuit_Emulation_Service.equals(value)) {
                return VALUE_MAP_ENTRY_133_FOR_VALUE_ENTRY_Circuit_Emulation_Service;
            }

            if (VALUE_ENTRY_ATM_SubInterface.equals(value)) {
                return VALUE_MAP_ENTRY_134_FOR_VALUE_ENTRY_ATM_SubInterface;
            }

            if (VALUE_ENTRY_Layer_2_VLAN_using_802_1Q.equals(value)) {
                return VALUE_MAP_ENTRY_135_FOR_VALUE_ENTRY_Layer_2_VLAN_using_802_1Q;
            }

            if (VALUE_ENTRY_Layer_3_VLAN_using_IP.equals(value)) {
                return VALUE_MAP_ENTRY_136_FOR_VALUE_ENTRY_Layer_3_VLAN_using_IP;
            }

            if (VALUE_ENTRY_Layer_3_VLAN_using_IPX.equals(value)) {
                return VALUE_MAP_ENTRY_137_FOR_VALUE_ENTRY_Layer_3_VLAN_using_IPX;
            }

            if (VALUE_ENTRY_Digital_Power_Line.equals(value)) {
                return VALUE_MAP_ENTRY_138_FOR_VALUE_ENTRY_Digital_Power_Line;
            }

            if (VALUE_ENTRY_Multimedia_Mail_over_IP.equals(value)) {
                return VALUE_MAP_ENTRY_139_FOR_VALUE_ENTRY_Multimedia_Mail_over_IP;
            }

            if (VALUE_ENTRY_DTM.equals(value)) {
                return VALUE_MAP_ENTRY_140_FOR_VALUE_ENTRY_DTM;
            }

            if (VALUE_ENTRY_DCN.equals(value)) {
                return VALUE_MAP_ENTRY_141_FOR_VALUE_ENTRY_DCN;
            }

            if (VALUE_ENTRY_IP_Forwarding.equals(value)) {
                return VALUE_MAP_ENTRY_142_FOR_VALUE_ENTRY_IP_Forwarding;
            }

            if (VALUE_ENTRY_MSDSL.equals(value)) {
                return VALUE_MAP_ENTRY_143_FOR_VALUE_ENTRY_MSDSL;
            }

            if (VALUE_ENTRY_IEEE_1394.equals(value)) {
                return VALUE_MAP_ENTRY_144_FOR_VALUE_ENTRY_IEEE_1394;
            }

            if (VALUE_ENTRY_IF_GSN_HIPPI_6400.equals(value)) {
                return VALUE_MAP_ENTRY_145_FOR_VALUE_ENTRY_IF_GSN_HIPPI_6400;
            }

            if (VALUE_ENTRY_DVB_RCC_MAC_Layer.equals(value)) {
                return VALUE_MAP_ENTRY_146_FOR_VALUE_ENTRY_DVB_RCC_MAC_Layer;
            }

            if (VALUE_ENTRY_DVB_RCC_Downstream.equals(value)) {
                return VALUE_MAP_ENTRY_147_FOR_VALUE_ENTRY_DVB_RCC_Downstream;
            }

            if (VALUE_ENTRY_DVB_RCC_Upstream.equals(value)) {
                return VALUE_MAP_ENTRY_148_FOR_VALUE_ENTRY_DVB_RCC_Upstream;
            }

            if (VALUE_ENTRY_ATM_Virtual.equals(value)) {
                return VALUE_MAP_ENTRY_149_FOR_VALUE_ENTRY_ATM_Virtual;
            }

            if (VALUE_ENTRY_MPLS_Tunnel.equals(value)) {
                return VALUE_MAP_ENTRY_150_FOR_VALUE_ENTRY_MPLS_Tunnel;
            }

            if (VALUE_ENTRY_SRP.equals(value)) {
                return VALUE_MAP_ENTRY_151_FOR_VALUE_ENTRY_SRP;
            }

            if (VALUE_ENTRY_Voice_over_ATM.equals(value)) {
                return VALUE_MAP_ENTRY_152_FOR_VALUE_ENTRY_Voice_over_ATM;
            }

            if (VALUE_ENTRY_Voice_over_Frame_Relay.equals(value)) {
                return VALUE_MAP_ENTRY_153_FOR_VALUE_ENTRY_Voice_over_Frame_Relay;
            }

            if (VALUE_ENTRY_ISDL.equals(value)) {
                return VALUE_MAP_ENTRY_154_FOR_VALUE_ENTRY_ISDL;
            }

            if (VALUE_ENTRY_Composite_Link.equals(value)) {
                return VALUE_MAP_ENTRY_155_FOR_VALUE_ENTRY_Composite_Link;
            }

            if (VALUE_ENTRY_SS7_Signaling_Link.equals(value)) {
                return VALUE_MAP_ENTRY_156_FOR_VALUE_ENTRY_SS7_Signaling_Link;
            }

            if (VALUE_ENTRY_Proprietary_P2P_Wireless.equals(value)) {
                return VALUE_MAP_ENTRY_157_FOR_VALUE_ENTRY_Proprietary_P2P_Wireless;
            }

            if (VALUE_ENTRY_Frame_Forward.equals(value)) {
                return VALUE_MAP_ENTRY_158_FOR_VALUE_ENTRY_Frame_Forward;
            }

            if (VALUE_ENTRY_RFC1483_Multiprotocol_over_ATM.equals(value)) {
                return VALUE_MAP_ENTRY_159_FOR_VALUE_ENTRY_RFC1483_Multiprotocol_over_ATM;
            }

            if (VALUE_ENTRY_USB.equals(value)) {
                return VALUE_MAP_ENTRY_160_FOR_VALUE_ENTRY_USB;
            }

            if (VALUE_ENTRY_IEEE_802_3ad_Link_Aggregate.equals(value)) {
                return VALUE_MAP_ENTRY_161_FOR_VALUE_ENTRY_IEEE_802_3ad_Link_Aggregate;
            }

            if (VALUE_ENTRY_BGP_Policy_Accounting.equals(value)) {
                return VALUE_MAP_ENTRY_162_FOR_VALUE_ENTRY_BGP_Policy_Accounting;
            }

            if (VALUE_ENTRY_FRF__16_Multilink_FR.equals(value)) {
                return VALUE_MAP_ENTRY_163_FOR_VALUE_ENTRY_FRF__16_Multilink_FR;
            }

            if (VALUE_ENTRY_H_323_Gatekeeper.equals(value)) {
                return VALUE_MAP_ENTRY_164_FOR_VALUE_ENTRY_H_323_Gatekeeper;
            }

            if (VALUE_ENTRY_H_323_Proxy.equals(value)) {
                return VALUE_MAP_ENTRY_165_FOR_VALUE_ENTRY_H_323_Proxy;
            }

            if (VALUE_ENTRY_MPLS.equals(value)) {
                return VALUE_MAP_ENTRY_166_FOR_VALUE_ENTRY_MPLS;
            }

            if (VALUE_ENTRY_Multi_Frequency_Signaling_Link.equals(value)) {
                return VALUE_MAP_ENTRY_167_FOR_VALUE_ENTRY_Multi_Frequency_Signaling_Link;
            }

            if (VALUE_ENTRY_HDSL_2.equals(value)) {
                return VALUE_MAP_ENTRY_168_FOR_VALUE_ENTRY_HDSL_2;
            }

            if (VALUE_ENTRY_S_HDSL.equals(value)) {
                return VALUE_MAP_ENTRY_169_FOR_VALUE_ENTRY_S_HDSL;
            }

            if (VALUE_ENTRY_DS1_Facility_Data_Link.equals(value)) {
                return VALUE_MAP_ENTRY_170_FOR_VALUE_ENTRY_DS1_Facility_Data_Link;
            }

            if (VALUE_ENTRY_Packet_over_SONET_SDH.equals(value)) {
                return VALUE_MAP_ENTRY_171_FOR_VALUE_ENTRY_Packet_over_SONET_SDH;
            }

            if (VALUE_ENTRY_DVB_ASI_Input.equals(value)) {
                return VALUE_MAP_ENTRY_172_FOR_VALUE_ENTRY_DVB_ASI_Input;
            }

            if (VALUE_ENTRY_DVB_ASI_Output.equals(value)) {
                return VALUE_MAP_ENTRY_173_FOR_VALUE_ENTRY_DVB_ASI_Output;
            }

            if (VALUE_ENTRY_Power_Line.equals(value)) {
                return VALUE_MAP_ENTRY_174_FOR_VALUE_ENTRY_Power_Line;
            }

            if (VALUE_ENTRY_Non_Facility_Associated_Signaling.equals(value)) {
                return VALUE_MAP_ENTRY_175_FOR_VALUE_ENTRY_Non_Facility_Associated_Signaling;
            }

            if (VALUE_ENTRY_TR008.equals(value)) {
                return VALUE_MAP_ENTRY_176_FOR_VALUE_ENTRY_TR008;
            }

            if (VALUE_ENTRY_GR303_RDT.equals(value)) {
                return VALUE_MAP_ENTRY_177_FOR_VALUE_ENTRY_GR303_RDT;
            }

            if (VALUE_ENTRY_GR303_IDT.equals(value)) {
                return VALUE_MAP_ENTRY_178_FOR_VALUE_ENTRY_GR303_IDT;
            }

            if (VALUE_ENTRY_ISUP.equals(value)) {
                return VALUE_MAP_ENTRY_179_FOR_VALUE_ENTRY_ISUP;
            }

            if (VALUE_ENTRY_Proprietary_Wireless_MAC_Layer.equals(value)) {
                return VALUE_MAP_ENTRY_180_FOR_VALUE_ENTRY_Proprietary_Wireless_MAC_Layer;
            }

            if (VALUE_ENTRY_Proprietary_Wireless_Downstream.equals(value)) {
                return VALUE_MAP_ENTRY_181_FOR_VALUE_ENTRY_Proprietary_Wireless_Downstream;
            }

            if (VALUE_ENTRY_Proprietary_Wireless_Upstream.equals(value)) {
                return VALUE_MAP_ENTRY_182_FOR_VALUE_ENTRY_Proprietary_Wireless_Upstream;
            }

            if (VALUE_ENTRY_HIPERLAN_Type_2.equals(value)) {
                return VALUE_MAP_ENTRY_183_FOR_VALUE_ENTRY_HIPERLAN_Type_2;
            }

            if (VALUE_ENTRY_Proprietary_Broadband_Wireless_Access_Point_to_Mulipoint.equals(value)) {
                return VALUE_MAP_ENTRY_184_FOR_VALUE_ENTRY_Proprietary_Broadband_Wireless_Access_Point_to_Mulipoint;
            }

            if (VALUE_ENTRY_SONET_Overhead_Channel.equals(value)) {
                return VALUE_MAP_ENTRY_185_FOR_VALUE_ENTRY_SONET_Overhead_Channel;
            }

            if (VALUE_ENTRY_Digital_Wrapper_Overhead_Channel.equals(value)) {
                return VALUE_MAP_ENTRY_186_FOR_VALUE_ENTRY_Digital_Wrapper_Overhead_Channel;
            }

            if (VALUE_ENTRY_ATM_Adaptation_Layer_2.equals(value)) {
                return VALUE_MAP_ENTRY_187_FOR_VALUE_ENTRY_ATM_Adaptation_Layer_2;
            }

            if (VALUE_ENTRY_Radio_MAC.equals(value)) {
                return VALUE_MAP_ENTRY_188_FOR_VALUE_ENTRY_Radio_MAC;
            }

            if (VALUE_ENTRY_ATM_Radio.equals(value)) {
                return VALUE_MAP_ENTRY_189_FOR_VALUE_ENTRY_ATM_Radio;
            }

            if (VALUE_ENTRY_Inter_Machine_Trunk.equals(value)) {
                return VALUE_MAP_ENTRY_190_FOR_VALUE_ENTRY_Inter_Machine_Trunk;
            }

            if (VALUE_ENTRY_MVL_DSL.equals(value)) {
                return VALUE_MAP_ENTRY_191_FOR_VALUE_ENTRY_MVL_DSL;
            }

            if (VALUE_ENTRY_Long_Read_DSL.equals(value)) {
                return VALUE_MAP_ENTRY_192_FOR_VALUE_ENTRY_Long_Read_DSL;
            }

            if (VALUE_ENTRY_Frame_Relay_DLCI_Endpoint.equals(value)) {
                return VALUE_MAP_ENTRY_193_FOR_VALUE_ENTRY_Frame_Relay_DLCI_Endpoint;
            }

            if (VALUE_ENTRY_ATM_VCI_Endpoint.equals(value)) {
                return VALUE_MAP_ENTRY_194_FOR_VALUE_ENTRY_ATM_VCI_Endpoint;
            }

            if (VALUE_ENTRY_Optical_Channel.equals(value)) {
                return VALUE_MAP_ENTRY_195_FOR_VALUE_ENTRY_Optical_Channel;
            }

            if (VALUE_ENTRY_Optical_Transport.equals(value)) {
                return VALUE_MAP_ENTRY_196_FOR_VALUE_ENTRY_Optical_Transport;
            }

            if (VALUE_ENTRY_Proprietary_ATM.equals(value)) {
                return VALUE_MAP_ENTRY_197_FOR_VALUE_ENTRY_Proprietary_ATM;
            }

            if (VALUE_ENTRY_Voice_over_Cable.equals(value)) {
                return VALUE_MAP_ENTRY_198_FOR_VALUE_ENTRY_Voice_over_Cable;
            }

            if (VALUE_ENTRY_Infiniband.equals(value)) {
                return VALUE_MAP_ENTRY_199_FOR_VALUE_ENTRY_Infiniband;
            }

            if (VALUE_ENTRY_TE_Link.equals(value)) {
                return VALUE_MAP_ENTRY_200_FOR_VALUE_ENTRY_TE_Link;
            }

            if (VALUE_ENTRY_Q_2931.equals(value)) {
                return VALUE_MAP_ENTRY_201_FOR_VALUE_ENTRY_Q_2931;
            }

            if (VALUE_ENTRY_Virtual_Trunk_Group.equals(value)) {
                return VALUE_MAP_ENTRY_202_FOR_VALUE_ENTRY_Virtual_Trunk_Group;
            }

            if (VALUE_ENTRY_SIP_Trunk_Group.equals(value)) {
                return VALUE_MAP_ENTRY_203_FOR_VALUE_ENTRY_SIP_Trunk_Group;
            }

            if (VALUE_ENTRY_SIP_Signaling.equals(value)) {
                return VALUE_MAP_ENTRY_204_FOR_VALUE_ENTRY_SIP_Signaling;
            }

            if (VALUE_ENTRY_CATV_Upstream_Channel.equals(value)) {
                return VALUE_MAP_ENTRY_205_FOR_VALUE_ENTRY_CATV_Upstream_Channel;
            }

            if (VALUE_ENTRY_Econet.equals(value)) {
                return VALUE_MAP_ENTRY_206_FOR_VALUE_ENTRY_Econet;
            }

            if (VALUE_ENTRY_FSAN_155Mb_PON.equals(value)) {
                return VALUE_MAP_ENTRY_207_FOR_VALUE_ENTRY_FSAN_155Mb_PON;
            }

            if (VALUE_ENTRY_FSAN_622Mb_PON.equals(value)) {
                return VALUE_MAP_ENTRY_208_FOR_VALUE_ENTRY_FSAN_622Mb_PON;
            }

            if (VALUE_ENTRY_Transparent_Bridge.equals(value)) {
                return VALUE_MAP_ENTRY_209_FOR_VALUE_ENTRY_Transparent_Bridge;
            }

            if (VALUE_ENTRY_Line_Group.equals(value)) {
                return VALUE_MAP_ENTRY_210_FOR_VALUE_ENTRY_Line_Group;
            }

            if (VALUE_ENTRY_Voice_E_M_Feature_Group.equals(value)) {
                return VALUE_MAP_ENTRY_211_FOR_VALUE_ENTRY_Voice_E_M_Feature_Group;
            }

            if (VALUE_ENTRY_Voice_FGD_EANA.equals(value)) {
                return VALUE_MAP_ENTRY_212_FOR_VALUE_ENTRY_Voice_FGD_EANA;
            }

            if (VALUE_ENTRY_Voice_DID.equals(value)) {
                return VALUE_MAP_ENTRY_213_FOR_VALUE_ENTRY_Voice_DID;
            }

            if (VALUE_ENTRY_MPEG_Transport.equals(value)) {
                return VALUE_MAP_ENTRY_214_FOR_VALUE_ENTRY_MPEG_Transport;
            }

            if (VALUE_ENTRY_6To4.equals(value)) {
                return VALUE_MAP_ENTRY_215_FOR_VALUE_ENTRY_6To4;
            }

            if (VALUE_ENTRY_GTP.equals(value)) {
                return VALUE_MAP_ENTRY_216_FOR_VALUE_ENTRY_GTP;
            }

            if (VALUE_ENTRY_Paradyne_EtherLoop_1.equals(value)) {
                return VALUE_MAP_ENTRY_217_FOR_VALUE_ENTRY_Paradyne_EtherLoop_1;
            }

            if (VALUE_ENTRY_Paradyne_EtherLoop_2.equals(value)) {
                return VALUE_MAP_ENTRY_218_FOR_VALUE_ENTRY_Paradyne_EtherLoop_2;
            }

            if (VALUE_ENTRY_Optical_Channel_Group.equals(value)) {
                return VALUE_MAP_ENTRY_219_FOR_VALUE_ENTRY_Optical_Channel_Group;
            }

            if (VALUE_ENTRY_HomePNA.equals(value)) {
                return VALUE_MAP_ENTRY_220_FOR_VALUE_ENTRY_HomePNA;
            }

            if (VALUE_ENTRY_GFP.equals(value)) {
                return VALUE_MAP_ENTRY_221_FOR_VALUE_ENTRY_GFP;
            }

            if (VALUE_ENTRY_ciscoISLvlan.equals(value)) {
                return VALUE_MAP_ENTRY_222_FOR_VALUE_ENTRY_ciscoISLvlan;
            }

            if (VALUE_ENTRY_actelisMetaLOOP.equals(value)) {
                return VALUE_MAP_ENTRY_223_FOR_VALUE_ENTRY_actelisMetaLOOP;
            }

            if (VALUE_ENTRY_Fcip.equals(value)) {
                return VALUE_MAP_ENTRY_224_FOR_VALUE_ENTRY_Fcip;
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

            if (VALUE_ENTRY_IPX.equals(value)) {
                return VALUE_MAP_ENTRY_4099_FOR_VALUE_ENTRY_IPX;
            }

            if (VALUE_ENTRY_DECnet.equals(value)) {
                return VALUE_MAP_ENTRY_4100_FOR_VALUE_ENTRY_DECnet;
            }

            if (VALUE_ENTRY_SNA.equals(value)) {
                return VALUE_MAP_ENTRY_4101_FOR_VALUE_ENTRY_SNA;
            }

            if (VALUE_ENTRY_CONP.equals(value)) {
                return VALUE_MAP_ENTRY_4102_FOR_VALUE_ENTRY_CONP;
            }

            if (VALUE_ENTRY_CLNP.equals(value)) {
                return VALUE_MAP_ENTRY_4103_FOR_VALUE_ENTRY_CLNP;
            }

            if (VALUE_ENTRY_VINES.equals(value)) {
                return VALUE_MAP_ENTRY_4104_FOR_VALUE_ENTRY_VINES;
            }

            if (VALUE_ENTRY_XNS.equals(value)) {
                return VALUE_MAP_ENTRY_4105_FOR_VALUE_ENTRY_XNS;
            }

            if (VALUE_ENTRY_ISDN_B_Channel_Endpoint.equals(value)) {
                return VALUE_MAP_ENTRY_4106_FOR_VALUE_ENTRY_ISDN_B_Channel_Endpoint;
            }

            if (VALUE_ENTRY_ISDN_D_Channel_Endpoint.equals(value)) {
                return VALUE_MAP_ENTRY_4107_FOR_VALUE_ENTRY_ISDN_D_Channel_Endpoint;
            }

            if (VALUE_ENTRY_BGP.equals(value)) {
                return VALUE_MAP_ENTRY_4108_FOR_VALUE_ENTRY_BGP;
            }

            if (VALUE_ENTRY_OSPF.equals(value)) {
                return VALUE_MAP_ENTRY_4109_FOR_VALUE_ENTRY_OSPF;
            }

            if (VALUE_ENTRY_UDP.equals(value)) {
                return VALUE_MAP_ENTRY_4110_FOR_VALUE_ENTRY_UDP;
            }

            if (VALUE_ENTRY_TCP.equals(value)) {
                return VALUE_MAP_ENTRY_4111_FOR_VALUE_ENTRY_TCP;
            }

            if (VALUE_ENTRY_802_11a.equals(value)) {
                return VALUE_MAP_ENTRY_4112_FOR_VALUE_ENTRY_802_11a;
            }

            if (VALUE_ENTRY_802_11b.equals(value)) {
                return VALUE_MAP_ENTRY_4113_FOR_VALUE_ENTRY_802_11b;
            }

            if (VALUE_ENTRY_802_11g.equals(value)) {
                return VALUE_MAP_ENTRY_4114_FOR_VALUE_ENTRY_802_11g;
            }

            if (VALUE_ENTRY_802_11h.equals(value)) {
                return VALUE_MAP_ENTRY_4115_FOR_VALUE_ENTRY_802_11h;
            }

            if (VALUE_ENTRY_NFS.equals(value)) {
                return VALUE_MAP_ENTRY_4200_FOR_VALUE_ENTRY_NFS;
            }

            if (VALUE_ENTRY_CIFS.equals(value)) {
                return VALUE_MAP_ENTRY_4201_FOR_VALUE_ENTRY_CIFS;
            }

            if (VALUE_ENTRY_DAFS.equals(value)) {
                return VALUE_MAP_ENTRY_4202_FOR_VALUE_ENTRY_DAFS;
            }

            if (VALUE_ENTRY_WebDAV.equals(value)) {
                return VALUE_MAP_ENTRY_4203_FOR_VALUE_ENTRY_WebDAV;
            }

            if (VALUE_ENTRY_HTTP.equals(value)) {
                return VALUE_MAP_ENTRY_4204_FOR_VALUE_ENTRY_HTTP;
            }

            if (VALUE_ENTRY_FTP.equals(value)) {
                return VALUE_MAP_ENTRY_4205_FOR_VALUE_ENTRY_FTP;
            }

            if (VALUE_ENTRY_NDMP.equals(value)) {
                return VALUE_MAP_ENTRY_4300_FOR_VALUE_ENTRY_NDMP;
            }

            if (VALUE_ENTRY_Telnet.equals(value)) {
                return VALUE_MAP_ENTRY_4400_FOR_VALUE_ENTRY_Telnet;
            }

            if (VALUE_ENTRY_SSH.equals(value)) {
                return VALUE_MAP_ENTRY_4401_FOR_VALUE_ENTRY_SSH;
            }

            if (VALUE_ENTRY_SM_CLP.equals(value)) {
                return VALUE_MAP_ENTRY_4402_FOR_VALUE_ENTRY_SM_CLP;
            }

            if (VALUE_ENTRY_SMTP.equals(value)) {
                return VALUE_MAP_ENTRY_4403_FOR_VALUE_ENTRY_SMTP;
            }

            if (VALUE_ENTRY_LDAP.equals(value)) {
                return VALUE_MAP_ENTRY_4404_FOR_VALUE_ENTRY_LDAP;
            }

            if (VALUE_ENTRY_RDP.equals(value)) {
                return VALUE_MAP_ENTRY_4405_FOR_VALUE_ENTRY_RDP;
            }

            if (VALUE_ENTRY_HTTPS.equals(value)) {
                return VALUE_MAP_ENTRY_4406_FOR_VALUE_ENTRY_HTTPS;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Regular_1822.intValue()) {
                return VALUE_ENTRY_Regular_1822;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_HDH_1822.intValue()) {
                return VALUE_ENTRY_HDH_1822;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DDN_X_25.intValue()) {
                return VALUE_ENTRY_DDN_X_25;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_RFC877_X_25.intValue()) {
                return VALUE_ENTRY_RFC877_X_25;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Ethernet_CSMA_CD.intValue()) {
                return VALUE_ENTRY_Ethernet_CSMA_CD;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_ISO_802_3_CSMA_CD.intValue()) {
                return VALUE_ENTRY_ISO_802_3_CSMA_CD;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_ISO_802_4_Token_Bus.intValue()) {
                return VALUE_ENTRY_ISO_802_4_Token_Bus;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_ISO_802_5_Token_Ring.intValue()) {
                return VALUE_ENTRY_ISO_802_5_Token_Ring;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_ISO_802_6_MAN.intValue()) {
                return VALUE_ENTRY_ISO_802_6_MAN;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_StarLAN.intValue()) {
                return VALUE_ENTRY_StarLAN;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Proteon_10Mbit.intValue()) {
                return VALUE_ENTRY_Proteon_10Mbit;
            }

            if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Proteon_80Mbit.intValue()) {
                return VALUE_ENTRY_Proteon_80Mbit;
            }

            if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_HyperChannel.intValue()) {
                return VALUE_ENTRY_HyperChannel;
            }

            if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_FDDI.intValue()) {
                return VALUE_ENTRY_FDDI;
            }

            if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_LAP_B.intValue()) {
                return VALUE_ENTRY_LAP_B;
            }

            if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_SDLC.intValue()) {
                return VALUE_ENTRY_SDLC;
            }

            if (iValue == VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_DS1.intValue()) {
                return VALUE_ENTRY_DS1;
            }

            if (iValue == VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_E1.intValue()) {
                return VALUE_ENTRY_E1;
            }

            if (iValue == VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Basic_ISDN.intValue()) {
                return VALUE_ENTRY_Basic_ISDN;
            }

            if (iValue == VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Primary_ISDN.intValue()) {
                return VALUE_ENTRY_Primary_ISDN;
            }

            if (iValue == VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_Proprietary_Point_to_Point_Serial
                    .intValue()) {
                return VALUE_ENTRY_Proprietary_Point_to_Point_Serial;
            }

            if (iValue == VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_PPP.intValue()) {
                return VALUE_ENTRY_PPP;
            }

            if (iValue == VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Software_Loopback.intValue()) {
                return VALUE_ENTRY_Software_Loopback;
            }

            if (iValue == VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_EON.intValue()) {
                return VALUE_ENTRY_EON;
            }

            if (iValue == VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_Ethernet_3Mbit.intValue()) {
                return VALUE_ENTRY_Ethernet_3Mbit;
            }

            if (iValue == VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_NSIP.intValue()) {
                return VALUE_ENTRY_NSIP;
            }

            if (iValue == VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_SLIP.intValue()) {
                return VALUE_ENTRY_SLIP;
            }

            if (iValue == VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Ultra.intValue()) {
                return VALUE_ENTRY_Ultra;
            }

            if (iValue == VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_DS3.intValue()) {
                return VALUE_ENTRY_DS3;
            }

            if (iValue == VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_SIP.intValue()) {
                return VALUE_ENTRY_SIP;
            }

            if (iValue == VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Frame_Relay.intValue()) {
                return VALUE_ENTRY_Frame_Relay;
            }

            if (iValue == VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_RS_232.intValue()) {
                return VALUE_ENTRY_RS_232;
            }

            if (iValue == VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_Parallel.intValue()) {
                return VALUE_ENTRY_Parallel;
            }

            if (iValue == VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_ARCNet.intValue()) {
                return VALUE_ENTRY_ARCNet;
            }

            if (iValue == VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_ARCNet_Plus.intValue()) {
                return VALUE_ENTRY_ARCNet_Plus;
            }

            if (iValue == VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_ATM.intValue()) {
                return VALUE_ENTRY_ATM;
            }

            if (iValue == VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_MIO_X_25.intValue()) {
                return VALUE_ENTRY_MIO_X_25;
            }

            if (iValue == VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_SONET.intValue()) {
                return VALUE_ENTRY_SONET;
            }

            if (iValue == VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_X_25_PLE.intValue()) {
                return VALUE_ENTRY_X_25_PLE;
            }

            if (iValue == VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_ISO_802_211c.intValue()) {
                return VALUE_ENTRY_ISO_802_211c;
            }

            if (iValue == VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_LocalTalk.intValue()) {
                return VALUE_ENTRY_LocalTalk;
            }

            if (iValue == VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_SMDS_DXI.intValue()) {
                return VALUE_ENTRY_SMDS_DXI;
            }

            if (iValue == VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_Frame_Relay_Service.intValue()) {
                return VALUE_ENTRY_Frame_Relay_Service;
            }

            if (iValue == VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_V_35.intValue()) {
                return VALUE_ENTRY_V_35;
            }

            if (iValue == VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_HSSI.intValue()) {
                return VALUE_ENTRY_HSSI;
            }

            if (iValue == VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_HIPPI.intValue()) {
                return VALUE_ENTRY_HIPPI;
            }

            if (iValue == VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_Modem.intValue()) {
                return VALUE_ENTRY_Modem;
            }

            if (iValue == VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_AAL5.intValue()) {
                return VALUE_ENTRY_AAL5;
            }

            if (iValue == VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_SONET_Path.intValue()) {
                return VALUE_ENTRY_SONET_Path;
            }

            if (iValue == VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_SONET_VT.intValue()) {
                return VALUE_ENTRY_SONET_VT;
            }

            if (iValue == VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_SMDS_ICIP.intValue()) {
                return VALUE_ENTRY_SMDS_ICIP;
            }

            if (iValue == VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_Proprietary_Virtual_Internal
                    .intValue()) {
                return VALUE_ENTRY_Proprietary_Virtual_Internal;
            }

            if (iValue == VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_Proprietary_Multiplexor.intValue()) {
                return VALUE_ENTRY_Proprietary_Multiplexor;
            }

            if (iValue == VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_IEEE_802_12.intValue()) {
                return VALUE_ENTRY_IEEE_802_12;
            }

            if (iValue == VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_Fibre_Channel.intValue()) {
                return VALUE_ENTRY_Fibre_Channel;
            }

            if (iValue == VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_HIPPI_Interface.intValue()) {
                return VALUE_ENTRY_HIPPI_Interface;
            }

            if (iValue == VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_Frame_Relay_Interconnect.intValue()) {
                return VALUE_ENTRY_Frame_Relay_Interconnect;
            }

            if (iValue == VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_ATM_Emulated_LAN_for_802_3.intValue()) {
                return VALUE_ENTRY_ATM_Emulated_LAN_for_802_3;
            }

            if (iValue == VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_ATM_Emulated_LAN_for_802_5.intValue()) {
                return VALUE_ENTRY_ATM_Emulated_LAN_for_802_5;
            }

            if (iValue == VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_ATM_Emulated_Circuit.intValue()) {
                return VALUE_ENTRY_ATM_Emulated_Circuit;
            }

            if (iValue == VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_Fast_Ethernet__100BaseT_.intValue()) {
                return VALUE_ENTRY_Fast_Ethernet__100BaseT_;
            }

            if (iValue == VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_ISDN.intValue()) {
                return VALUE_ENTRY_ISDN;
            }

            if (iValue == VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_V_11.intValue()) {
                return VALUE_ENTRY_V_11;
            }

            if (iValue == VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_V_36.intValue()) {
                return VALUE_ENTRY_V_36;
            }

            if (iValue == VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_G703_at_64K.intValue()) {
                return VALUE_ENTRY_G703_at_64K;
            }

            if (iValue == VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_G703_at_2Mb.intValue()) {
                return VALUE_ENTRY_G703_at_2Mb;
            }

            if (iValue == VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_QLLC.intValue()) {
                return VALUE_ENTRY_QLLC;
            }

            if (iValue == VALUE_MAP_ENTRY_69_FOR_VALUE_ENTRY_Fast_Ethernet_100BaseFX.intValue()) {
                return VALUE_ENTRY_Fast_Ethernet_100BaseFX;
            }

            if (iValue == VALUE_MAP_ENTRY_70_FOR_VALUE_ENTRY_Channel.intValue()) {
                return VALUE_ENTRY_Channel;
            }

            if (iValue == VALUE_MAP_ENTRY_71_FOR_VALUE_ENTRY_IEEE_802_11.intValue()) {
                return VALUE_ENTRY_IEEE_802_11;
            }

            if (iValue == VALUE_MAP_ENTRY_72_FOR_VALUE_ENTRY_IBM_260_370_OEMI_Channel.intValue()) {
                return VALUE_ENTRY_IBM_260_370_OEMI_Channel;
            }

            if (iValue == VALUE_MAP_ENTRY_73_FOR_VALUE_ENTRY_ESCON.intValue()) {
                return VALUE_ENTRY_ESCON;
            }

            if (iValue == VALUE_MAP_ENTRY_74_FOR_VALUE_ENTRY_Data_Link_Switching.intValue()) {
                return VALUE_ENTRY_Data_Link_Switching;
            }

            if (iValue == VALUE_MAP_ENTRY_75_FOR_VALUE_ENTRY_ISDN_S_T_Interface.intValue()) {
                return VALUE_ENTRY_ISDN_S_T_Interface;
            }

            if (iValue == VALUE_MAP_ENTRY_76_FOR_VALUE_ENTRY_ISDN_U_Interface.intValue()) {
                return VALUE_ENTRY_ISDN_U_Interface;
            }

            if (iValue == VALUE_MAP_ENTRY_77_FOR_VALUE_ENTRY_LAP_D.intValue()) {
                return VALUE_ENTRY_LAP_D;
            }

            if (iValue == VALUE_MAP_ENTRY_78_FOR_VALUE_ENTRY_IP_Switch.intValue()) {
                return VALUE_ENTRY_IP_Switch;
            }

            if (iValue == VALUE_MAP_ENTRY_79_FOR_VALUE_ENTRY_Remote_Source_Route_Bridging
                    .intValue()) {
                return VALUE_ENTRY_Remote_Source_Route_Bridging;
            }

            if (iValue == VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_ATM_Logical.intValue()) {
                return VALUE_ENTRY_ATM_Logical;
            }

            if (iValue == VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_DS0.intValue()) {
                return VALUE_ENTRY_DS0;
            }

            if (iValue == VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_DS0_Bundle.intValue()) {
                return VALUE_ENTRY_DS0_Bundle;
            }

            if (iValue == VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_BSC.intValue()) {
                return VALUE_ENTRY_BSC;
            }

            if (iValue == VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_Async.intValue()) {
                return VALUE_ENTRY_Async;
            }

            if (iValue == VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_Combat_Net_Radio.intValue()) {
                return VALUE_ENTRY_Combat_Net_Radio;
            }

            if (iValue == VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_ISO_802_5r_DTR.intValue()) {
                return VALUE_ENTRY_ISO_802_5r_DTR;
            }

            if (iValue == VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_Ext_Pos_Loc_Report_System.intValue()) {
                return VALUE_ENTRY_Ext_Pos_Loc_Report_System;
            }

            if (iValue == VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_AppleTalk_Remote_Access_Protocol
                    .intValue()) {
                return VALUE_ENTRY_AppleTalk_Remote_Access_Protocol;
            }

            if (iValue == VALUE_MAP_ENTRY_89_FOR_VALUE_ENTRY_Proprietary_Connectionless.intValue()) {
                return VALUE_ENTRY_Proprietary_Connectionless;
            }

            if (iValue == VALUE_MAP_ENTRY_90_FOR_VALUE_ENTRY_ITU_X_29_Host_PAD.intValue()) {
                return VALUE_ENTRY_ITU_X_29_Host_PAD;
            }

            if (iValue == VALUE_MAP_ENTRY_91_FOR_VALUE_ENTRY_ITU_X_3_Terminal_PAD.intValue()) {
                return VALUE_ENTRY_ITU_X_3_Terminal_PAD;
            }

            if (iValue == VALUE_MAP_ENTRY_92_FOR_VALUE_ENTRY_Frame_Relay_MPI.intValue()) {
                return VALUE_ENTRY_Frame_Relay_MPI;
            }

            if (iValue == VALUE_MAP_ENTRY_93_FOR_VALUE_ENTRY_ITU_X_213.intValue()) {
                return VALUE_ENTRY_ITU_X_213;
            }

            if (iValue == VALUE_MAP_ENTRY_94_FOR_VALUE_ENTRY_ADSL.intValue()) {
                return VALUE_ENTRY_ADSL;
            }

            if (iValue == VALUE_MAP_ENTRY_95_FOR_VALUE_ENTRY_RADSL.intValue()) {
                return VALUE_ENTRY_RADSL;
            }

            if (iValue == VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_SDSL.intValue()) {
                return VALUE_ENTRY_SDSL;
            }

            if (iValue == VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_VDSL.intValue()) {
                return VALUE_ENTRY_VDSL;
            }

            if (iValue == VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_ISO_802_5_CRFP.intValue()) {
                return VALUE_ENTRY_ISO_802_5_CRFP;
            }

            if (iValue == VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_Myrinet.intValue()) {
                return VALUE_ENTRY_Myrinet;
            }

            if (iValue == VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Voice_Receive_and_Transmit.intValue()) {
                return VALUE_ENTRY_Voice_Receive_and_Transmit;
            }

            if (iValue == VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Voice_Foreign_Exchange_Office
                    .intValue()) {
                return VALUE_ENTRY_Voice_Foreign_Exchange_Office;
            }

            if (iValue == VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_Voice_Foreign_Exchange_Service
                    .intValue()) {
                return VALUE_ENTRY_Voice_Foreign_Exchange_Service;
            }

            if (iValue == VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_Voice_Encapsulation.intValue()) {
                return VALUE_ENTRY_Voice_Encapsulation;
            }

            if (iValue == VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_Voice_over_IP.intValue()) {
                return VALUE_ENTRY_Voice_over_IP;
            }

            if (iValue == VALUE_MAP_ENTRY_105_FOR_VALUE_ENTRY_ATM_DXI.intValue()) {
                return VALUE_ENTRY_ATM_DXI;
            }

            if (iValue == VALUE_MAP_ENTRY_106_FOR_VALUE_ENTRY_ATM_FUNI.intValue()) {
                return VALUE_ENTRY_ATM_FUNI;
            }

            if (iValue == VALUE_MAP_ENTRY_107_FOR_VALUE_ENTRY_ATM_IMA.intValue()) {
                return VALUE_ENTRY_ATM_IMA;
            }

            if (iValue == VALUE_MAP_ENTRY_108_FOR_VALUE_ENTRY_PPP_Multilink_Bundle.intValue()) {
                return VALUE_ENTRY_PPP_Multilink_Bundle;
            }

            if (iValue == VALUE_MAP_ENTRY_109_FOR_VALUE_ENTRY_IP_over_CDLC.intValue()) {
                return VALUE_ENTRY_IP_over_CDLC;
            }

            if (iValue == VALUE_MAP_ENTRY_110_FOR_VALUE_ENTRY_IP_over_CLAW.intValue()) {
                return VALUE_ENTRY_IP_over_CLAW;
            }

            if (iValue == VALUE_MAP_ENTRY_111_FOR_VALUE_ENTRY_Stack_to_Stack.intValue()) {
                return VALUE_ENTRY_Stack_to_Stack;
            }

            if (iValue == VALUE_MAP_ENTRY_112_FOR_VALUE_ENTRY_Virtual_IP_Address.intValue()) {
                return VALUE_ENTRY_Virtual_IP_Address;
            }

            if (iValue == VALUE_MAP_ENTRY_113_FOR_VALUE_ENTRY_MPC.intValue()) {
                return VALUE_ENTRY_MPC;
            }

            if (iValue == VALUE_MAP_ENTRY_114_FOR_VALUE_ENTRY_IP_over_ATM.intValue()) {
                return VALUE_ENTRY_IP_over_ATM;
            }

            if (iValue == VALUE_MAP_ENTRY_115_FOR_VALUE_ENTRY_ISO_802_5j_Fibre_Token_Ring
                    .intValue()) {
                return VALUE_ENTRY_ISO_802_5j_Fibre_Token_Ring;
            }

            if (iValue == VALUE_MAP_ENTRY_116_FOR_VALUE_ENTRY_TDLC.intValue()) {
                return VALUE_ENTRY_TDLC;
            }

            if (iValue == VALUE_MAP_ENTRY_117_FOR_VALUE_ENTRY_Gigabit_Ethernet.intValue()) {
                return VALUE_ENTRY_Gigabit_Ethernet;
            }

            if (iValue == VALUE_MAP_ENTRY_118_FOR_VALUE_ENTRY_HDLC.intValue()) {
                return VALUE_ENTRY_HDLC;
            }

            if (iValue == VALUE_MAP_ENTRY_119_FOR_VALUE_ENTRY_LAP_F.intValue()) {
                return VALUE_ENTRY_LAP_F;
            }

            if (iValue == VALUE_MAP_ENTRY_120_FOR_VALUE_ENTRY_V_37.intValue()) {
                return VALUE_ENTRY_V_37;
            }

            if (iValue == VALUE_MAP_ENTRY_121_FOR_VALUE_ENTRY_X_25_MLP.intValue()) {
                return VALUE_ENTRY_X_25_MLP;
            }

            if (iValue == VALUE_MAP_ENTRY_122_FOR_VALUE_ENTRY_X_25_Hunt_Group.intValue()) {
                return VALUE_ENTRY_X_25_Hunt_Group;
            }

            if (iValue == VALUE_MAP_ENTRY_123_FOR_VALUE_ENTRY_Transp_HDLC.intValue()) {
                return VALUE_ENTRY_Transp_HDLC;
            }

            if (iValue == VALUE_MAP_ENTRY_124_FOR_VALUE_ENTRY_Interleave_Channel.intValue()) {
                return VALUE_ENTRY_Interleave_Channel;
            }

            if (iValue == VALUE_MAP_ENTRY_125_FOR_VALUE_ENTRY_FAST_Channel.intValue()) {
                return VALUE_ENTRY_FAST_Channel;
            }

            if (iValue == VALUE_MAP_ENTRY_126_FOR_VALUE_ENTRY_IP__for_APPN_HPR_in_IP_Networks_
                    .intValue()) {
                return VALUE_ENTRY_IP__for_APPN_HPR_in_IP_Networks_;
            }

            if (iValue == VALUE_MAP_ENTRY_127_FOR_VALUE_ENTRY_CATV_MAC_Layer.intValue()) {
                return VALUE_ENTRY_CATV_MAC_Layer;
            }

            if (iValue == VALUE_MAP_ENTRY_128_FOR_VALUE_ENTRY_CATV_Downstream.intValue()) {
                return VALUE_ENTRY_CATV_Downstream;
            }

            if (iValue == VALUE_MAP_ENTRY_129_FOR_VALUE_ENTRY_CATV_Upstream.intValue()) {
                return VALUE_ENTRY_CATV_Upstream;
            }

            if (iValue == VALUE_MAP_ENTRY_130_FOR_VALUE_ENTRY_Avalon_12MPP_Switch.intValue()) {
                return VALUE_ENTRY_Avalon_12MPP_Switch;
            }

            if (iValue == VALUE_MAP_ENTRY_131_FOR_VALUE_ENTRY_Tunnel.intValue()) {
                return VALUE_ENTRY_Tunnel;
            }

            if (iValue == VALUE_MAP_ENTRY_132_FOR_VALUE_ENTRY_Coffee.intValue()) {
                return VALUE_ENTRY_Coffee;
            }

            if (iValue == VALUE_MAP_ENTRY_133_FOR_VALUE_ENTRY_Circuit_Emulation_Service.intValue()) {
                return VALUE_ENTRY_Circuit_Emulation_Service;
            }

            if (iValue == VALUE_MAP_ENTRY_134_FOR_VALUE_ENTRY_ATM_SubInterface.intValue()) {
                return VALUE_ENTRY_ATM_SubInterface;
            }

            if (iValue == VALUE_MAP_ENTRY_135_FOR_VALUE_ENTRY_Layer_2_VLAN_using_802_1Q.intValue()) {
                return VALUE_ENTRY_Layer_2_VLAN_using_802_1Q;
            }

            if (iValue == VALUE_MAP_ENTRY_136_FOR_VALUE_ENTRY_Layer_3_VLAN_using_IP.intValue()) {
                return VALUE_ENTRY_Layer_3_VLAN_using_IP;
            }

            if (iValue == VALUE_MAP_ENTRY_137_FOR_VALUE_ENTRY_Layer_3_VLAN_using_IPX.intValue()) {
                return VALUE_ENTRY_Layer_3_VLAN_using_IPX;
            }

            if (iValue == VALUE_MAP_ENTRY_138_FOR_VALUE_ENTRY_Digital_Power_Line.intValue()) {
                return VALUE_ENTRY_Digital_Power_Line;
            }

            if (iValue == VALUE_MAP_ENTRY_139_FOR_VALUE_ENTRY_Multimedia_Mail_over_IP.intValue()) {
                return VALUE_ENTRY_Multimedia_Mail_over_IP;
            }

            if (iValue == VALUE_MAP_ENTRY_140_FOR_VALUE_ENTRY_DTM.intValue()) {
                return VALUE_ENTRY_DTM;
            }

            if (iValue == VALUE_MAP_ENTRY_141_FOR_VALUE_ENTRY_DCN.intValue()) {
                return VALUE_ENTRY_DCN;
            }

            if (iValue == VALUE_MAP_ENTRY_142_FOR_VALUE_ENTRY_IP_Forwarding.intValue()) {
                return VALUE_ENTRY_IP_Forwarding;
            }

            if (iValue == VALUE_MAP_ENTRY_143_FOR_VALUE_ENTRY_MSDSL.intValue()) {
                return VALUE_ENTRY_MSDSL;
            }

            if (iValue == VALUE_MAP_ENTRY_144_FOR_VALUE_ENTRY_IEEE_1394.intValue()) {
                return VALUE_ENTRY_IEEE_1394;
            }

            if (iValue == VALUE_MAP_ENTRY_145_FOR_VALUE_ENTRY_IF_GSN_HIPPI_6400.intValue()) {
                return VALUE_ENTRY_IF_GSN_HIPPI_6400;
            }

            if (iValue == VALUE_MAP_ENTRY_146_FOR_VALUE_ENTRY_DVB_RCC_MAC_Layer.intValue()) {
                return VALUE_ENTRY_DVB_RCC_MAC_Layer;
            }

            if (iValue == VALUE_MAP_ENTRY_147_FOR_VALUE_ENTRY_DVB_RCC_Downstream.intValue()) {
                return VALUE_ENTRY_DVB_RCC_Downstream;
            }

            if (iValue == VALUE_MAP_ENTRY_148_FOR_VALUE_ENTRY_DVB_RCC_Upstream.intValue()) {
                return VALUE_ENTRY_DVB_RCC_Upstream;
            }

            if (iValue == VALUE_MAP_ENTRY_149_FOR_VALUE_ENTRY_ATM_Virtual.intValue()) {
                return VALUE_ENTRY_ATM_Virtual;
            }

            if (iValue == VALUE_MAP_ENTRY_150_FOR_VALUE_ENTRY_MPLS_Tunnel.intValue()) {
                return VALUE_ENTRY_MPLS_Tunnel;
            }

            if (iValue == VALUE_MAP_ENTRY_151_FOR_VALUE_ENTRY_SRP.intValue()) {
                return VALUE_ENTRY_SRP;
            }

            if (iValue == VALUE_MAP_ENTRY_152_FOR_VALUE_ENTRY_Voice_over_ATM.intValue()) {
                return VALUE_ENTRY_Voice_over_ATM;
            }

            if (iValue == VALUE_MAP_ENTRY_153_FOR_VALUE_ENTRY_Voice_over_Frame_Relay.intValue()) {
                return VALUE_ENTRY_Voice_over_Frame_Relay;
            }

            if (iValue == VALUE_MAP_ENTRY_154_FOR_VALUE_ENTRY_ISDL.intValue()) {
                return VALUE_ENTRY_ISDL;
            }

            if (iValue == VALUE_MAP_ENTRY_155_FOR_VALUE_ENTRY_Composite_Link.intValue()) {
                return VALUE_ENTRY_Composite_Link;
            }

            if (iValue == VALUE_MAP_ENTRY_156_FOR_VALUE_ENTRY_SS7_Signaling_Link.intValue()) {
                return VALUE_ENTRY_SS7_Signaling_Link;
            }

            if (iValue == VALUE_MAP_ENTRY_157_FOR_VALUE_ENTRY_Proprietary_P2P_Wireless.intValue()) {
                return VALUE_ENTRY_Proprietary_P2P_Wireless;
            }

            if (iValue == VALUE_MAP_ENTRY_158_FOR_VALUE_ENTRY_Frame_Forward.intValue()) {
                return VALUE_ENTRY_Frame_Forward;
            }

            if (iValue == VALUE_MAP_ENTRY_159_FOR_VALUE_ENTRY_RFC1483_Multiprotocol_over_ATM
                    .intValue()) {
                return VALUE_ENTRY_RFC1483_Multiprotocol_over_ATM;
            }

            if (iValue == VALUE_MAP_ENTRY_160_FOR_VALUE_ENTRY_USB.intValue()) {
                return VALUE_ENTRY_USB;
            }

            if (iValue == VALUE_MAP_ENTRY_161_FOR_VALUE_ENTRY_IEEE_802_3ad_Link_Aggregate
                    .intValue()) {
                return VALUE_ENTRY_IEEE_802_3ad_Link_Aggregate;
            }

            if (iValue == VALUE_MAP_ENTRY_162_FOR_VALUE_ENTRY_BGP_Policy_Accounting.intValue()) {
                return VALUE_ENTRY_BGP_Policy_Accounting;
            }

            if (iValue == VALUE_MAP_ENTRY_163_FOR_VALUE_ENTRY_FRF__16_Multilink_FR.intValue()) {
                return VALUE_ENTRY_FRF__16_Multilink_FR;
            }

            if (iValue == VALUE_MAP_ENTRY_164_FOR_VALUE_ENTRY_H_323_Gatekeeper.intValue()) {
                return VALUE_ENTRY_H_323_Gatekeeper;
            }

            if (iValue == VALUE_MAP_ENTRY_165_FOR_VALUE_ENTRY_H_323_Proxy.intValue()) {
                return VALUE_ENTRY_H_323_Proxy;
            }

            if (iValue == VALUE_MAP_ENTRY_166_FOR_VALUE_ENTRY_MPLS.intValue()) {
                return VALUE_ENTRY_MPLS;
            }

            if (iValue == VALUE_MAP_ENTRY_167_FOR_VALUE_ENTRY_Multi_Frequency_Signaling_Link
                    .intValue()) {
                return VALUE_ENTRY_Multi_Frequency_Signaling_Link;
            }

            if (iValue == VALUE_MAP_ENTRY_168_FOR_VALUE_ENTRY_HDSL_2.intValue()) {
                return VALUE_ENTRY_HDSL_2;
            }

            if (iValue == VALUE_MAP_ENTRY_169_FOR_VALUE_ENTRY_S_HDSL.intValue()) {
                return VALUE_ENTRY_S_HDSL;
            }

            if (iValue == VALUE_MAP_ENTRY_170_FOR_VALUE_ENTRY_DS1_Facility_Data_Link.intValue()) {
                return VALUE_ENTRY_DS1_Facility_Data_Link;
            }

            if (iValue == VALUE_MAP_ENTRY_171_FOR_VALUE_ENTRY_Packet_over_SONET_SDH.intValue()) {
                return VALUE_ENTRY_Packet_over_SONET_SDH;
            }

            if (iValue == VALUE_MAP_ENTRY_172_FOR_VALUE_ENTRY_DVB_ASI_Input.intValue()) {
                return VALUE_ENTRY_DVB_ASI_Input;
            }

            if (iValue == VALUE_MAP_ENTRY_173_FOR_VALUE_ENTRY_DVB_ASI_Output.intValue()) {
                return VALUE_ENTRY_DVB_ASI_Output;
            }

            if (iValue == VALUE_MAP_ENTRY_174_FOR_VALUE_ENTRY_Power_Line.intValue()) {
                return VALUE_ENTRY_Power_Line;
            }

            if (iValue == VALUE_MAP_ENTRY_175_FOR_VALUE_ENTRY_Non_Facility_Associated_Signaling
                    .intValue()) {
                return VALUE_ENTRY_Non_Facility_Associated_Signaling;
            }

            if (iValue == VALUE_MAP_ENTRY_176_FOR_VALUE_ENTRY_TR008.intValue()) {
                return VALUE_ENTRY_TR008;
            }

            if (iValue == VALUE_MAP_ENTRY_177_FOR_VALUE_ENTRY_GR303_RDT.intValue()) {
                return VALUE_ENTRY_GR303_RDT;
            }

            if (iValue == VALUE_MAP_ENTRY_178_FOR_VALUE_ENTRY_GR303_IDT.intValue()) {
                return VALUE_ENTRY_GR303_IDT;
            }

            if (iValue == VALUE_MAP_ENTRY_179_FOR_VALUE_ENTRY_ISUP.intValue()) {
                return VALUE_ENTRY_ISUP;
            }

            if (iValue == VALUE_MAP_ENTRY_180_FOR_VALUE_ENTRY_Proprietary_Wireless_MAC_Layer
                    .intValue()) {
                return VALUE_ENTRY_Proprietary_Wireless_MAC_Layer;
            }

            if (iValue == VALUE_MAP_ENTRY_181_FOR_VALUE_ENTRY_Proprietary_Wireless_Downstream
                    .intValue()) {
                return VALUE_ENTRY_Proprietary_Wireless_Downstream;
            }

            if (iValue == VALUE_MAP_ENTRY_182_FOR_VALUE_ENTRY_Proprietary_Wireless_Upstream
                    .intValue()) {
                return VALUE_ENTRY_Proprietary_Wireless_Upstream;
            }

            if (iValue == VALUE_MAP_ENTRY_183_FOR_VALUE_ENTRY_HIPERLAN_Type_2.intValue()) {
                return VALUE_ENTRY_HIPERLAN_Type_2;
            }

            if (iValue == VALUE_MAP_ENTRY_184_FOR_VALUE_ENTRY_Proprietary_Broadband_Wireless_Access_Point_to_Mulipoint
                    .intValue()) {
                return VALUE_ENTRY_Proprietary_Broadband_Wireless_Access_Point_to_Mulipoint;
            }

            if (iValue == VALUE_MAP_ENTRY_185_FOR_VALUE_ENTRY_SONET_Overhead_Channel.intValue()) {
                return VALUE_ENTRY_SONET_Overhead_Channel;
            }

            if (iValue == VALUE_MAP_ENTRY_186_FOR_VALUE_ENTRY_Digital_Wrapper_Overhead_Channel
                    .intValue()) {
                return VALUE_ENTRY_Digital_Wrapper_Overhead_Channel;
            }

            if (iValue == VALUE_MAP_ENTRY_187_FOR_VALUE_ENTRY_ATM_Adaptation_Layer_2.intValue()) {
                return VALUE_ENTRY_ATM_Adaptation_Layer_2;
            }

            if (iValue == VALUE_MAP_ENTRY_188_FOR_VALUE_ENTRY_Radio_MAC.intValue()) {
                return VALUE_ENTRY_Radio_MAC;
            }

            if (iValue == VALUE_MAP_ENTRY_189_FOR_VALUE_ENTRY_ATM_Radio.intValue()) {
                return VALUE_ENTRY_ATM_Radio;
            }

            if (iValue == VALUE_MAP_ENTRY_190_FOR_VALUE_ENTRY_Inter_Machine_Trunk.intValue()) {
                return VALUE_ENTRY_Inter_Machine_Trunk;
            }

            if (iValue == VALUE_MAP_ENTRY_191_FOR_VALUE_ENTRY_MVL_DSL.intValue()) {
                return VALUE_ENTRY_MVL_DSL;
            }

            if (iValue == VALUE_MAP_ENTRY_192_FOR_VALUE_ENTRY_Long_Read_DSL.intValue()) {
                return VALUE_ENTRY_Long_Read_DSL;
            }

            if (iValue == VALUE_MAP_ENTRY_193_FOR_VALUE_ENTRY_Frame_Relay_DLCI_Endpoint.intValue()) {
                return VALUE_ENTRY_Frame_Relay_DLCI_Endpoint;
            }

            if (iValue == VALUE_MAP_ENTRY_194_FOR_VALUE_ENTRY_ATM_VCI_Endpoint.intValue()) {
                return VALUE_ENTRY_ATM_VCI_Endpoint;
            }

            if (iValue == VALUE_MAP_ENTRY_195_FOR_VALUE_ENTRY_Optical_Channel.intValue()) {
                return VALUE_ENTRY_Optical_Channel;
            }

            if (iValue == VALUE_MAP_ENTRY_196_FOR_VALUE_ENTRY_Optical_Transport.intValue()) {
                return VALUE_ENTRY_Optical_Transport;
            }

            if (iValue == VALUE_MAP_ENTRY_197_FOR_VALUE_ENTRY_Proprietary_ATM.intValue()) {
                return VALUE_ENTRY_Proprietary_ATM;
            }

            if (iValue == VALUE_MAP_ENTRY_198_FOR_VALUE_ENTRY_Voice_over_Cable.intValue()) {
                return VALUE_ENTRY_Voice_over_Cable;
            }

            if (iValue == VALUE_MAP_ENTRY_199_FOR_VALUE_ENTRY_Infiniband.intValue()) {
                return VALUE_ENTRY_Infiniband;
            }

            if (iValue == VALUE_MAP_ENTRY_200_FOR_VALUE_ENTRY_TE_Link.intValue()) {
                return VALUE_ENTRY_TE_Link;
            }

            if (iValue == VALUE_MAP_ENTRY_201_FOR_VALUE_ENTRY_Q_2931.intValue()) {
                return VALUE_ENTRY_Q_2931;
            }

            if (iValue == VALUE_MAP_ENTRY_202_FOR_VALUE_ENTRY_Virtual_Trunk_Group.intValue()) {
                return VALUE_ENTRY_Virtual_Trunk_Group;
            }

            if (iValue == VALUE_MAP_ENTRY_203_FOR_VALUE_ENTRY_SIP_Trunk_Group.intValue()) {
                return VALUE_ENTRY_SIP_Trunk_Group;
            }

            if (iValue == VALUE_MAP_ENTRY_204_FOR_VALUE_ENTRY_SIP_Signaling.intValue()) {
                return VALUE_ENTRY_SIP_Signaling;
            }

            if (iValue == VALUE_MAP_ENTRY_205_FOR_VALUE_ENTRY_CATV_Upstream_Channel.intValue()) {
                return VALUE_ENTRY_CATV_Upstream_Channel;
            }

            if (iValue == VALUE_MAP_ENTRY_206_FOR_VALUE_ENTRY_Econet.intValue()) {
                return VALUE_ENTRY_Econet;
            }

            if (iValue == VALUE_MAP_ENTRY_207_FOR_VALUE_ENTRY_FSAN_155Mb_PON.intValue()) {
                return VALUE_ENTRY_FSAN_155Mb_PON;
            }

            if (iValue == VALUE_MAP_ENTRY_208_FOR_VALUE_ENTRY_FSAN_622Mb_PON.intValue()) {
                return VALUE_ENTRY_FSAN_622Mb_PON;
            }

            if (iValue == VALUE_MAP_ENTRY_209_FOR_VALUE_ENTRY_Transparent_Bridge.intValue()) {
                return VALUE_ENTRY_Transparent_Bridge;
            }

            if (iValue == VALUE_MAP_ENTRY_210_FOR_VALUE_ENTRY_Line_Group.intValue()) {
                return VALUE_ENTRY_Line_Group;
            }

            if (iValue == VALUE_MAP_ENTRY_211_FOR_VALUE_ENTRY_Voice_E_M_Feature_Group.intValue()) {
                return VALUE_ENTRY_Voice_E_M_Feature_Group;
            }

            if (iValue == VALUE_MAP_ENTRY_212_FOR_VALUE_ENTRY_Voice_FGD_EANA.intValue()) {
                return VALUE_ENTRY_Voice_FGD_EANA;
            }

            if (iValue == VALUE_MAP_ENTRY_213_FOR_VALUE_ENTRY_Voice_DID.intValue()) {
                return VALUE_ENTRY_Voice_DID;
            }

            if (iValue == VALUE_MAP_ENTRY_214_FOR_VALUE_ENTRY_MPEG_Transport.intValue()) {
                return VALUE_ENTRY_MPEG_Transport;
            }

            if (iValue == VALUE_MAP_ENTRY_215_FOR_VALUE_ENTRY_6To4.intValue()) {
                return VALUE_ENTRY_6To4;
            }

            if (iValue == VALUE_MAP_ENTRY_216_FOR_VALUE_ENTRY_GTP.intValue()) {
                return VALUE_ENTRY_GTP;
            }

            if (iValue == VALUE_MAP_ENTRY_217_FOR_VALUE_ENTRY_Paradyne_EtherLoop_1.intValue()) {
                return VALUE_ENTRY_Paradyne_EtherLoop_1;
            }

            if (iValue == VALUE_MAP_ENTRY_218_FOR_VALUE_ENTRY_Paradyne_EtherLoop_2.intValue()) {
                return VALUE_ENTRY_Paradyne_EtherLoop_2;
            }

            if (iValue == VALUE_MAP_ENTRY_219_FOR_VALUE_ENTRY_Optical_Channel_Group.intValue()) {
                return VALUE_ENTRY_Optical_Channel_Group;
            }

            if (iValue == VALUE_MAP_ENTRY_220_FOR_VALUE_ENTRY_HomePNA.intValue()) {
                return VALUE_ENTRY_HomePNA;
            }

            if (iValue == VALUE_MAP_ENTRY_221_FOR_VALUE_ENTRY_GFP.intValue()) {
                return VALUE_ENTRY_GFP;
            }

            if (iValue == VALUE_MAP_ENTRY_222_FOR_VALUE_ENTRY_ciscoISLvlan.intValue()) {
                return VALUE_ENTRY_ciscoISLvlan;
            }

            if (iValue == VALUE_MAP_ENTRY_223_FOR_VALUE_ENTRY_actelisMetaLOOP.intValue()) {
                return VALUE_ENTRY_actelisMetaLOOP;
            }

            if (iValue == VALUE_MAP_ENTRY_224_FOR_VALUE_ENTRY_Fcip.intValue()) {
                return VALUE_ENTRY_Fcip;
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

            if (iValue == VALUE_MAP_ENTRY_4099_FOR_VALUE_ENTRY_IPX.intValue()) {
                return VALUE_ENTRY_IPX;
            }

            if (iValue == VALUE_MAP_ENTRY_4100_FOR_VALUE_ENTRY_DECnet.intValue()) {
                return VALUE_ENTRY_DECnet;
            }

            if (iValue == VALUE_MAP_ENTRY_4101_FOR_VALUE_ENTRY_SNA.intValue()) {
                return VALUE_ENTRY_SNA;
            }

            if (iValue == VALUE_MAP_ENTRY_4102_FOR_VALUE_ENTRY_CONP.intValue()) {
                return VALUE_ENTRY_CONP;
            }

            if (iValue == VALUE_MAP_ENTRY_4103_FOR_VALUE_ENTRY_CLNP.intValue()) {
                return VALUE_ENTRY_CLNP;
            }

            if (iValue == VALUE_MAP_ENTRY_4104_FOR_VALUE_ENTRY_VINES.intValue()) {
                return VALUE_ENTRY_VINES;
            }

            if (iValue == VALUE_MAP_ENTRY_4105_FOR_VALUE_ENTRY_XNS.intValue()) {
                return VALUE_ENTRY_XNS;
            }

            if (iValue == VALUE_MAP_ENTRY_4106_FOR_VALUE_ENTRY_ISDN_B_Channel_Endpoint.intValue()) {
                return VALUE_ENTRY_ISDN_B_Channel_Endpoint;
            }

            if (iValue == VALUE_MAP_ENTRY_4107_FOR_VALUE_ENTRY_ISDN_D_Channel_Endpoint.intValue()) {
                return VALUE_ENTRY_ISDN_D_Channel_Endpoint;
            }

            if (iValue == VALUE_MAP_ENTRY_4108_FOR_VALUE_ENTRY_BGP.intValue()) {
                return VALUE_ENTRY_BGP;
            }

            if (iValue == VALUE_MAP_ENTRY_4109_FOR_VALUE_ENTRY_OSPF.intValue()) {
                return VALUE_ENTRY_OSPF;
            }

            if (iValue == VALUE_MAP_ENTRY_4110_FOR_VALUE_ENTRY_UDP.intValue()) {
                return VALUE_ENTRY_UDP;
            }

            if (iValue == VALUE_MAP_ENTRY_4111_FOR_VALUE_ENTRY_TCP.intValue()) {
                return VALUE_ENTRY_TCP;
            }

            if (iValue == VALUE_MAP_ENTRY_4112_FOR_VALUE_ENTRY_802_11a.intValue()) {
                return VALUE_ENTRY_802_11a;
            }

            if (iValue == VALUE_MAP_ENTRY_4113_FOR_VALUE_ENTRY_802_11b.intValue()) {
                return VALUE_ENTRY_802_11b;
            }

            if (iValue == VALUE_MAP_ENTRY_4114_FOR_VALUE_ENTRY_802_11g.intValue()) {
                return VALUE_ENTRY_802_11g;
            }

            if (iValue == VALUE_MAP_ENTRY_4115_FOR_VALUE_ENTRY_802_11h.intValue()) {
                return VALUE_ENTRY_802_11h;
            }

            if (iValue == VALUE_MAP_ENTRY_4200_FOR_VALUE_ENTRY_NFS.intValue()) {
                return VALUE_ENTRY_NFS;
            }

            if (iValue == VALUE_MAP_ENTRY_4201_FOR_VALUE_ENTRY_CIFS.intValue()) {
                return VALUE_ENTRY_CIFS;
            }

            if (iValue == VALUE_MAP_ENTRY_4202_FOR_VALUE_ENTRY_DAFS.intValue()) {
                return VALUE_ENTRY_DAFS;
            }

            if (iValue == VALUE_MAP_ENTRY_4203_FOR_VALUE_ENTRY_WebDAV.intValue()) {
                return VALUE_ENTRY_WebDAV;
            }

            if (iValue == VALUE_MAP_ENTRY_4204_FOR_VALUE_ENTRY_HTTP.intValue()) {
                return VALUE_ENTRY_HTTP;
            }

            if (iValue == VALUE_MAP_ENTRY_4205_FOR_VALUE_ENTRY_FTP.intValue()) {
                return VALUE_ENTRY_FTP;
            }

            if (iValue == VALUE_MAP_ENTRY_4300_FOR_VALUE_ENTRY_NDMP.intValue()) {
                return VALUE_ENTRY_NDMP;
            }

            if (iValue == VALUE_MAP_ENTRY_4400_FOR_VALUE_ENTRY_Telnet.intValue()) {
                return VALUE_ENTRY_Telnet;
            }

            if (iValue == VALUE_MAP_ENTRY_4401_FOR_VALUE_ENTRY_SSH.intValue()) {
                return VALUE_ENTRY_SSH;
            }

            if (iValue == VALUE_MAP_ENTRY_4402_FOR_VALUE_ENTRY_SM_CLP.intValue()) {
                return VALUE_ENTRY_SM_CLP;
            }

            if (iValue == VALUE_MAP_ENTRY_4403_FOR_VALUE_ENTRY_SMTP.intValue()) {
                return VALUE_ENTRY_SMTP;
            }

            if (iValue == VALUE_MAP_ENTRY_4404_FOR_VALUE_ENTRY_LDAP.intValue()) {
                return VALUE_ENTRY_LDAP;
            }

            if (iValue == VALUE_MAP_ENTRY_4405_FOR_VALUE_ENTRY_RDP.intValue()) {
                return VALUE_ENTRY_RDP;
            }

            if (iValue == VALUE_MAP_ENTRY_4406_FOR_VALUE_ENTRY_HTTPS.intValue()) {
                return VALUE_ENTRY_HTTPS;
            }

            if (iValue >= 32768) {
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
         * Value Map for the property ProtocolIFType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown,
                VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_Regular_1822,
                VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_HDH_1822,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_DDN_X_25,
                VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_RFC877_X_25,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_Ethernet_CSMA_CD,
                VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_ISO_802_3_CSMA_CD,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_ISO_802_4_Token_Bus,
                VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_ISO_802_5_Token_Ring,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_ISO_802_6_MAN,
                VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_StarLAN,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_Proteon_10Mbit,
                VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Proteon_80Mbit,
                VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_HyperChannel,
                VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_FDDI,
                VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_LAP_B,
                VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_SDLC,
                VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_DS1,
                VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_E1,
                VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_Basic_ISDN,
                VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_Primary_ISDN,
                VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_Proprietary_Point_to_Point_Serial,
                VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_PPP,
                VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_Software_Loopback,
                VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_EON,
                VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_Ethernet_3Mbit,
                VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_NSIP,
                VALUE_MAP_ENTRY_28_FOR_VALUE_ENTRY_SLIP,
                VALUE_MAP_ENTRY_29_FOR_VALUE_ENTRY_Ultra,
                VALUE_MAP_ENTRY_30_FOR_VALUE_ENTRY_DS3,
                VALUE_MAP_ENTRY_31_FOR_VALUE_ENTRY_SIP,
                VALUE_MAP_ENTRY_32_FOR_VALUE_ENTRY_Frame_Relay,
                VALUE_MAP_ENTRY_33_FOR_VALUE_ENTRY_RS_232,
                VALUE_MAP_ENTRY_34_FOR_VALUE_ENTRY_Parallel,
                VALUE_MAP_ENTRY_35_FOR_VALUE_ENTRY_ARCNet,
                VALUE_MAP_ENTRY_36_FOR_VALUE_ENTRY_ARCNet_Plus,
                VALUE_MAP_ENTRY_37_FOR_VALUE_ENTRY_ATM,
                VALUE_MAP_ENTRY_38_FOR_VALUE_ENTRY_MIO_X_25,
                VALUE_MAP_ENTRY_39_FOR_VALUE_ENTRY_SONET,
                VALUE_MAP_ENTRY_40_FOR_VALUE_ENTRY_X_25_PLE,
                VALUE_MAP_ENTRY_41_FOR_VALUE_ENTRY_ISO_802_211c,
                VALUE_MAP_ENTRY_42_FOR_VALUE_ENTRY_LocalTalk,
                VALUE_MAP_ENTRY_43_FOR_VALUE_ENTRY_SMDS_DXI,
                VALUE_MAP_ENTRY_44_FOR_VALUE_ENTRY_Frame_Relay_Service,
                VALUE_MAP_ENTRY_45_FOR_VALUE_ENTRY_V_35,
                VALUE_MAP_ENTRY_46_FOR_VALUE_ENTRY_HSSI,
                VALUE_MAP_ENTRY_47_FOR_VALUE_ENTRY_HIPPI,
                VALUE_MAP_ENTRY_48_FOR_VALUE_ENTRY_Modem,
                VALUE_MAP_ENTRY_49_FOR_VALUE_ENTRY_AAL5,
                VALUE_MAP_ENTRY_50_FOR_VALUE_ENTRY_SONET_Path,
                VALUE_MAP_ENTRY_51_FOR_VALUE_ENTRY_SONET_VT,
                VALUE_MAP_ENTRY_52_FOR_VALUE_ENTRY_SMDS_ICIP,
                VALUE_MAP_ENTRY_53_FOR_VALUE_ENTRY_Proprietary_Virtual_Internal,
                VALUE_MAP_ENTRY_54_FOR_VALUE_ENTRY_Proprietary_Multiplexor,
                VALUE_MAP_ENTRY_55_FOR_VALUE_ENTRY_IEEE_802_12,
                VALUE_MAP_ENTRY_56_FOR_VALUE_ENTRY_Fibre_Channel,
                VALUE_MAP_ENTRY_57_FOR_VALUE_ENTRY_HIPPI_Interface,
                VALUE_MAP_ENTRY_58_FOR_VALUE_ENTRY_Frame_Relay_Interconnect,
                VALUE_MAP_ENTRY_59_FOR_VALUE_ENTRY_ATM_Emulated_LAN_for_802_3,
                VALUE_MAP_ENTRY_60_FOR_VALUE_ENTRY_ATM_Emulated_LAN_for_802_5,
                VALUE_MAP_ENTRY_61_FOR_VALUE_ENTRY_ATM_Emulated_Circuit,
                VALUE_MAP_ENTRY_62_FOR_VALUE_ENTRY_Fast_Ethernet__100BaseT_,
                VALUE_MAP_ENTRY_63_FOR_VALUE_ENTRY_ISDN,
                VALUE_MAP_ENTRY_64_FOR_VALUE_ENTRY_V_11,
                VALUE_MAP_ENTRY_65_FOR_VALUE_ENTRY_V_36,
                VALUE_MAP_ENTRY_66_FOR_VALUE_ENTRY_G703_at_64K,
                VALUE_MAP_ENTRY_67_FOR_VALUE_ENTRY_G703_at_2Mb,
                VALUE_MAP_ENTRY_68_FOR_VALUE_ENTRY_QLLC,
                VALUE_MAP_ENTRY_69_FOR_VALUE_ENTRY_Fast_Ethernet_100BaseFX,
                VALUE_MAP_ENTRY_70_FOR_VALUE_ENTRY_Channel,
                VALUE_MAP_ENTRY_71_FOR_VALUE_ENTRY_IEEE_802_11,
                VALUE_MAP_ENTRY_72_FOR_VALUE_ENTRY_IBM_260_370_OEMI_Channel,
                VALUE_MAP_ENTRY_73_FOR_VALUE_ENTRY_ESCON,
                VALUE_MAP_ENTRY_74_FOR_VALUE_ENTRY_Data_Link_Switching,
                VALUE_MAP_ENTRY_75_FOR_VALUE_ENTRY_ISDN_S_T_Interface,
                VALUE_MAP_ENTRY_76_FOR_VALUE_ENTRY_ISDN_U_Interface,
                VALUE_MAP_ENTRY_77_FOR_VALUE_ENTRY_LAP_D,
                VALUE_MAP_ENTRY_78_FOR_VALUE_ENTRY_IP_Switch,
                VALUE_MAP_ENTRY_79_FOR_VALUE_ENTRY_Remote_Source_Route_Bridging,
                VALUE_MAP_ENTRY_80_FOR_VALUE_ENTRY_ATM_Logical,
                VALUE_MAP_ENTRY_81_FOR_VALUE_ENTRY_DS0,
                VALUE_MAP_ENTRY_82_FOR_VALUE_ENTRY_DS0_Bundle,
                VALUE_MAP_ENTRY_83_FOR_VALUE_ENTRY_BSC,
                VALUE_MAP_ENTRY_84_FOR_VALUE_ENTRY_Async,
                VALUE_MAP_ENTRY_85_FOR_VALUE_ENTRY_Combat_Net_Radio,
                VALUE_MAP_ENTRY_86_FOR_VALUE_ENTRY_ISO_802_5r_DTR,
                VALUE_MAP_ENTRY_87_FOR_VALUE_ENTRY_Ext_Pos_Loc_Report_System,
                VALUE_MAP_ENTRY_88_FOR_VALUE_ENTRY_AppleTalk_Remote_Access_Protocol,
                VALUE_MAP_ENTRY_89_FOR_VALUE_ENTRY_Proprietary_Connectionless,
                VALUE_MAP_ENTRY_90_FOR_VALUE_ENTRY_ITU_X_29_Host_PAD,
                VALUE_MAP_ENTRY_91_FOR_VALUE_ENTRY_ITU_X_3_Terminal_PAD,
                VALUE_MAP_ENTRY_92_FOR_VALUE_ENTRY_Frame_Relay_MPI,
                VALUE_MAP_ENTRY_93_FOR_VALUE_ENTRY_ITU_X_213,
                VALUE_MAP_ENTRY_94_FOR_VALUE_ENTRY_ADSL,
                VALUE_MAP_ENTRY_95_FOR_VALUE_ENTRY_RADSL,
                VALUE_MAP_ENTRY_96_FOR_VALUE_ENTRY_SDSL,
                VALUE_MAP_ENTRY_97_FOR_VALUE_ENTRY_VDSL,
                VALUE_MAP_ENTRY_98_FOR_VALUE_ENTRY_ISO_802_5_CRFP,
                VALUE_MAP_ENTRY_99_FOR_VALUE_ENTRY_Myrinet,
                VALUE_MAP_ENTRY_100_FOR_VALUE_ENTRY_Voice_Receive_and_Transmit,
                VALUE_MAP_ENTRY_101_FOR_VALUE_ENTRY_Voice_Foreign_Exchange_Office,
                VALUE_MAP_ENTRY_102_FOR_VALUE_ENTRY_Voice_Foreign_Exchange_Service,
                VALUE_MAP_ENTRY_103_FOR_VALUE_ENTRY_Voice_Encapsulation,
                VALUE_MAP_ENTRY_104_FOR_VALUE_ENTRY_Voice_over_IP,
                VALUE_MAP_ENTRY_105_FOR_VALUE_ENTRY_ATM_DXI,
                VALUE_MAP_ENTRY_106_FOR_VALUE_ENTRY_ATM_FUNI,
                VALUE_MAP_ENTRY_107_FOR_VALUE_ENTRY_ATM_IMA,
                VALUE_MAP_ENTRY_108_FOR_VALUE_ENTRY_PPP_Multilink_Bundle,
                VALUE_MAP_ENTRY_109_FOR_VALUE_ENTRY_IP_over_CDLC,
                VALUE_MAP_ENTRY_110_FOR_VALUE_ENTRY_IP_over_CLAW,
                VALUE_MAP_ENTRY_111_FOR_VALUE_ENTRY_Stack_to_Stack,
                VALUE_MAP_ENTRY_112_FOR_VALUE_ENTRY_Virtual_IP_Address,
                VALUE_MAP_ENTRY_113_FOR_VALUE_ENTRY_MPC,
                VALUE_MAP_ENTRY_114_FOR_VALUE_ENTRY_IP_over_ATM,
                VALUE_MAP_ENTRY_115_FOR_VALUE_ENTRY_ISO_802_5j_Fibre_Token_Ring,
                VALUE_MAP_ENTRY_116_FOR_VALUE_ENTRY_TDLC,
                VALUE_MAP_ENTRY_117_FOR_VALUE_ENTRY_Gigabit_Ethernet,
                VALUE_MAP_ENTRY_118_FOR_VALUE_ENTRY_HDLC,
                VALUE_MAP_ENTRY_119_FOR_VALUE_ENTRY_LAP_F,
                VALUE_MAP_ENTRY_120_FOR_VALUE_ENTRY_V_37,
                VALUE_MAP_ENTRY_121_FOR_VALUE_ENTRY_X_25_MLP,
                VALUE_MAP_ENTRY_122_FOR_VALUE_ENTRY_X_25_Hunt_Group,
                VALUE_MAP_ENTRY_123_FOR_VALUE_ENTRY_Transp_HDLC,
                VALUE_MAP_ENTRY_124_FOR_VALUE_ENTRY_Interleave_Channel,
                VALUE_MAP_ENTRY_125_FOR_VALUE_ENTRY_FAST_Channel,
                VALUE_MAP_ENTRY_126_FOR_VALUE_ENTRY_IP__for_APPN_HPR_in_IP_Networks_,
                VALUE_MAP_ENTRY_127_FOR_VALUE_ENTRY_CATV_MAC_Layer,
                VALUE_MAP_ENTRY_128_FOR_VALUE_ENTRY_CATV_Downstream,
                VALUE_MAP_ENTRY_129_FOR_VALUE_ENTRY_CATV_Upstream,
                VALUE_MAP_ENTRY_130_FOR_VALUE_ENTRY_Avalon_12MPP_Switch,
                VALUE_MAP_ENTRY_131_FOR_VALUE_ENTRY_Tunnel,
                VALUE_MAP_ENTRY_132_FOR_VALUE_ENTRY_Coffee,
                VALUE_MAP_ENTRY_133_FOR_VALUE_ENTRY_Circuit_Emulation_Service,
                VALUE_MAP_ENTRY_134_FOR_VALUE_ENTRY_ATM_SubInterface,
                VALUE_MAP_ENTRY_135_FOR_VALUE_ENTRY_Layer_2_VLAN_using_802_1Q,
                VALUE_MAP_ENTRY_136_FOR_VALUE_ENTRY_Layer_3_VLAN_using_IP,
                VALUE_MAP_ENTRY_137_FOR_VALUE_ENTRY_Layer_3_VLAN_using_IPX,
                VALUE_MAP_ENTRY_138_FOR_VALUE_ENTRY_Digital_Power_Line,
                VALUE_MAP_ENTRY_139_FOR_VALUE_ENTRY_Multimedia_Mail_over_IP,
                VALUE_MAP_ENTRY_140_FOR_VALUE_ENTRY_DTM,
                VALUE_MAP_ENTRY_141_FOR_VALUE_ENTRY_DCN,
                VALUE_MAP_ENTRY_142_FOR_VALUE_ENTRY_IP_Forwarding,
                VALUE_MAP_ENTRY_143_FOR_VALUE_ENTRY_MSDSL,
                VALUE_MAP_ENTRY_144_FOR_VALUE_ENTRY_IEEE_1394,
                VALUE_MAP_ENTRY_145_FOR_VALUE_ENTRY_IF_GSN_HIPPI_6400,
                VALUE_MAP_ENTRY_146_FOR_VALUE_ENTRY_DVB_RCC_MAC_Layer,
                VALUE_MAP_ENTRY_147_FOR_VALUE_ENTRY_DVB_RCC_Downstream,
                VALUE_MAP_ENTRY_148_FOR_VALUE_ENTRY_DVB_RCC_Upstream,
                VALUE_MAP_ENTRY_149_FOR_VALUE_ENTRY_ATM_Virtual,
                VALUE_MAP_ENTRY_150_FOR_VALUE_ENTRY_MPLS_Tunnel,
                VALUE_MAP_ENTRY_151_FOR_VALUE_ENTRY_SRP,
                VALUE_MAP_ENTRY_152_FOR_VALUE_ENTRY_Voice_over_ATM,
                VALUE_MAP_ENTRY_153_FOR_VALUE_ENTRY_Voice_over_Frame_Relay,
                VALUE_MAP_ENTRY_154_FOR_VALUE_ENTRY_ISDL,
                VALUE_MAP_ENTRY_155_FOR_VALUE_ENTRY_Composite_Link,
                VALUE_MAP_ENTRY_156_FOR_VALUE_ENTRY_SS7_Signaling_Link,
                VALUE_MAP_ENTRY_157_FOR_VALUE_ENTRY_Proprietary_P2P_Wireless,
                VALUE_MAP_ENTRY_158_FOR_VALUE_ENTRY_Frame_Forward,
                VALUE_MAP_ENTRY_159_FOR_VALUE_ENTRY_RFC1483_Multiprotocol_over_ATM,
                VALUE_MAP_ENTRY_160_FOR_VALUE_ENTRY_USB,
                VALUE_MAP_ENTRY_161_FOR_VALUE_ENTRY_IEEE_802_3ad_Link_Aggregate,
                VALUE_MAP_ENTRY_162_FOR_VALUE_ENTRY_BGP_Policy_Accounting,
                VALUE_MAP_ENTRY_163_FOR_VALUE_ENTRY_FRF__16_Multilink_FR,
                VALUE_MAP_ENTRY_164_FOR_VALUE_ENTRY_H_323_Gatekeeper,
                VALUE_MAP_ENTRY_165_FOR_VALUE_ENTRY_H_323_Proxy,
                VALUE_MAP_ENTRY_166_FOR_VALUE_ENTRY_MPLS,
                VALUE_MAP_ENTRY_167_FOR_VALUE_ENTRY_Multi_Frequency_Signaling_Link,
                VALUE_MAP_ENTRY_168_FOR_VALUE_ENTRY_HDSL_2,
                VALUE_MAP_ENTRY_169_FOR_VALUE_ENTRY_S_HDSL,
                VALUE_MAP_ENTRY_170_FOR_VALUE_ENTRY_DS1_Facility_Data_Link,
                VALUE_MAP_ENTRY_171_FOR_VALUE_ENTRY_Packet_over_SONET_SDH,
                VALUE_MAP_ENTRY_172_FOR_VALUE_ENTRY_DVB_ASI_Input,
                VALUE_MAP_ENTRY_173_FOR_VALUE_ENTRY_DVB_ASI_Output,
                VALUE_MAP_ENTRY_174_FOR_VALUE_ENTRY_Power_Line,
                VALUE_MAP_ENTRY_175_FOR_VALUE_ENTRY_Non_Facility_Associated_Signaling,
                VALUE_MAP_ENTRY_176_FOR_VALUE_ENTRY_TR008,
                VALUE_MAP_ENTRY_177_FOR_VALUE_ENTRY_GR303_RDT,
                VALUE_MAP_ENTRY_178_FOR_VALUE_ENTRY_GR303_IDT,
                VALUE_MAP_ENTRY_179_FOR_VALUE_ENTRY_ISUP,
                VALUE_MAP_ENTRY_180_FOR_VALUE_ENTRY_Proprietary_Wireless_MAC_Layer,
                VALUE_MAP_ENTRY_181_FOR_VALUE_ENTRY_Proprietary_Wireless_Downstream,
                VALUE_MAP_ENTRY_182_FOR_VALUE_ENTRY_Proprietary_Wireless_Upstream,
                VALUE_MAP_ENTRY_183_FOR_VALUE_ENTRY_HIPERLAN_Type_2,
                VALUE_MAP_ENTRY_184_FOR_VALUE_ENTRY_Proprietary_Broadband_Wireless_Access_Point_to_Mulipoint,
                VALUE_MAP_ENTRY_185_FOR_VALUE_ENTRY_SONET_Overhead_Channel,
                VALUE_MAP_ENTRY_186_FOR_VALUE_ENTRY_Digital_Wrapper_Overhead_Channel,
                VALUE_MAP_ENTRY_187_FOR_VALUE_ENTRY_ATM_Adaptation_Layer_2,
                VALUE_MAP_ENTRY_188_FOR_VALUE_ENTRY_Radio_MAC,
                VALUE_MAP_ENTRY_189_FOR_VALUE_ENTRY_ATM_Radio,
                VALUE_MAP_ENTRY_190_FOR_VALUE_ENTRY_Inter_Machine_Trunk,
                VALUE_MAP_ENTRY_191_FOR_VALUE_ENTRY_MVL_DSL,
                VALUE_MAP_ENTRY_192_FOR_VALUE_ENTRY_Long_Read_DSL,
                VALUE_MAP_ENTRY_193_FOR_VALUE_ENTRY_Frame_Relay_DLCI_Endpoint,
                VALUE_MAP_ENTRY_194_FOR_VALUE_ENTRY_ATM_VCI_Endpoint,
                VALUE_MAP_ENTRY_195_FOR_VALUE_ENTRY_Optical_Channel,
                VALUE_MAP_ENTRY_196_FOR_VALUE_ENTRY_Optical_Transport,
                VALUE_MAP_ENTRY_197_FOR_VALUE_ENTRY_Proprietary_ATM,
                VALUE_MAP_ENTRY_198_FOR_VALUE_ENTRY_Voice_over_Cable,
                VALUE_MAP_ENTRY_199_FOR_VALUE_ENTRY_Infiniband,
                VALUE_MAP_ENTRY_200_FOR_VALUE_ENTRY_TE_Link,
                VALUE_MAP_ENTRY_201_FOR_VALUE_ENTRY_Q_2931,
                VALUE_MAP_ENTRY_202_FOR_VALUE_ENTRY_Virtual_Trunk_Group,
                VALUE_MAP_ENTRY_203_FOR_VALUE_ENTRY_SIP_Trunk_Group,
                VALUE_MAP_ENTRY_204_FOR_VALUE_ENTRY_SIP_Signaling,
                VALUE_MAP_ENTRY_205_FOR_VALUE_ENTRY_CATV_Upstream_Channel,
                VALUE_MAP_ENTRY_206_FOR_VALUE_ENTRY_Econet,
                VALUE_MAP_ENTRY_207_FOR_VALUE_ENTRY_FSAN_155Mb_PON,
                VALUE_MAP_ENTRY_208_FOR_VALUE_ENTRY_FSAN_622Mb_PON,
                VALUE_MAP_ENTRY_209_FOR_VALUE_ENTRY_Transparent_Bridge,
                VALUE_MAP_ENTRY_210_FOR_VALUE_ENTRY_Line_Group,
                VALUE_MAP_ENTRY_211_FOR_VALUE_ENTRY_Voice_E_M_Feature_Group,
                VALUE_MAP_ENTRY_212_FOR_VALUE_ENTRY_Voice_FGD_EANA,
                VALUE_MAP_ENTRY_213_FOR_VALUE_ENTRY_Voice_DID,
                VALUE_MAP_ENTRY_214_FOR_VALUE_ENTRY_MPEG_Transport,
                VALUE_MAP_ENTRY_215_FOR_VALUE_ENTRY_6To4, VALUE_MAP_ENTRY_216_FOR_VALUE_ENTRY_GTP,
                VALUE_MAP_ENTRY_217_FOR_VALUE_ENTRY_Paradyne_EtherLoop_1,
                VALUE_MAP_ENTRY_218_FOR_VALUE_ENTRY_Paradyne_EtherLoop_2,
                VALUE_MAP_ENTRY_219_FOR_VALUE_ENTRY_Optical_Channel_Group,
                VALUE_MAP_ENTRY_220_FOR_VALUE_ENTRY_HomePNA,
                VALUE_MAP_ENTRY_221_FOR_VALUE_ENTRY_GFP,
                VALUE_MAP_ENTRY_222_FOR_VALUE_ENTRY_ciscoISLvlan,
                VALUE_MAP_ENTRY_223_FOR_VALUE_ENTRY_actelisMetaLOOP,
                VALUE_MAP_ENTRY_224_FOR_VALUE_ENTRY_Fcip,
                VALUE_MAP_ENTRY_4096_FOR_VALUE_ENTRY_IPv4,
                VALUE_MAP_ENTRY_4097_FOR_VALUE_ENTRY_IPv6,
                VALUE_MAP_ENTRY_4098_FOR_VALUE_ENTRY_IPv4_v6,
                VALUE_MAP_ENTRY_4099_FOR_VALUE_ENTRY_IPX,
                VALUE_MAP_ENTRY_4100_FOR_VALUE_ENTRY_DECnet,
                VALUE_MAP_ENTRY_4101_FOR_VALUE_ENTRY_SNA,
                VALUE_MAP_ENTRY_4102_FOR_VALUE_ENTRY_CONP,
                VALUE_MAP_ENTRY_4103_FOR_VALUE_ENTRY_CLNP,
                VALUE_MAP_ENTRY_4104_FOR_VALUE_ENTRY_VINES,
                VALUE_MAP_ENTRY_4105_FOR_VALUE_ENTRY_XNS,
                VALUE_MAP_ENTRY_4106_FOR_VALUE_ENTRY_ISDN_B_Channel_Endpoint,
                VALUE_MAP_ENTRY_4107_FOR_VALUE_ENTRY_ISDN_D_Channel_Endpoint,
                VALUE_MAP_ENTRY_4108_FOR_VALUE_ENTRY_BGP,
                VALUE_MAP_ENTRY_4109_FOR_VALUE_ENTRY_OSPF,
                VALUE_MAP_ENTRY_4110_FOR_VALUE_ENTRY_UDP, VALUE_MAP_ENTRY_4111_FOR_VALUE_ENTRY_TCP,
                VALUE_MAP_ENTRY_4112_FOR_VALUE_ENTRY_802_11a,
                VALUE_MAP_ENTRY_4113_FOR_VALUE_ENTRY_802_11b,
                VALUE_MAP_ENTRY_4114_FOR_VALUE_ENTRY_802_11g,
                VALUE_MAP_ENTRY_4115_FOR_VALUE_ENTRY_802_11h,
                VALUE_MAP_ENTRY_4200_FOR_VALUE_ENTRY_NFS,
                VALUE_MAP_ENTRY_4201_FOR_VALUE_ENTRY_CIFS,
                VALUE_MAP_ENTRY_4202_FOR_VALUE_ENTRY_DAFS,
                VALUE_MAP_ENTRY_4203_FOR_VALUE_ENTRY_WebDAV,
                VALUE_MAP_ENTRY_4204_FOR_VALUE_ENTRY_HTTP,
                VALUE_MAP_ENTRY_4205_FOR_VALUE_ENTRY_FTP,
                VALUE_MAP_ENTRY_4300_FOR_VALUE_ENTRY_NDMP,
                VALUE_MAP_ENTRY_4400_FOR_VALUE_ENTRY_Telnet,
                VALUE_MAP_ENTRY_4401_FOR_VALUE_ENTRY_SSH,
                VALUE_MAP_ENTRY_4402_FOR_VALUE_ENTRY_SM_CLP,
                VALUE_MAP_ENTRY_4403_FOR_VALUE_ENTRY_SMTP,
                VALUE_MAP_ENTRY_4404_FOR_VALUE_ENTRY_LDAP,
                VALUE_MAP_ENTRY_4405_FOR_VALUE_ENTRY_RDP,
                VALUE_MAP_ENTRY_4406_FOR_VALUE_ENTRY_HTTPS };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ProtocolIFType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_Regular_1822, VALUE_ENTRY_HDH_1822, VALUE_ENTRY_DDN_X_25,
                VALUE_ENTRY_RFC877_X_25, VALUE_ENTRY_Ethernet_CSMA_CD,
                VALUE_ENTRY_ISO_802_3_CSMA_CD, VALUE_ENTRY_ISO_802_4_Token_Bus,
                VALUE_ENTRY_ISO_802_5_Token_Ring, VALUE_ENTRY_ISO_802_6_MAN, VALUE_ENTRY_StarLAN,
                VALUE_ENTRY_Proteon_10Mbit, VALUE_ENTRY_Proteon_80Mbit, VALUE_ENTRY_HyperChannel,
                VALUE_ENTRY_FDDI, VALUE_ENTRY_LAP_B, VALUE_ENTRY_SDLC, VALUE_ENTRY_DS1,
                VALUE_ENTRY_E1, VALUE_ENTRY_Basic_ISDN, VALUE_ENTRY_Primary_ISDN,
                VALUE_ENTRY_Proprietary_Point_to_Point_Serial, VALUE_ENTRY_PPP,
                VALUE_ENTRY_Software_Loopback, VALUE_ENTRY_EON, VALUE_ENTRY_Ethernet_3Mbit,
                VALUE_ENTRY_NSIP, VALUE_ENTRY_SLIP, VALUE_ENTRY_Ultra, VALUE_ENTRY_DS3,
                VALUE_ENTRY_SIP, VALUE_ENTRY_Frame_Relay, VALUE_ENTRY_RS_232, VALUE_ENTRY_Parallel,
                VALUE_ENTRY_ARCNet, VALUE_ENTRY_ARCNet_Plus, VALUE_ENTRY_ATM, VALUE_ENTRY_MIO_X_25,
                VALUE_ENTRY_SONET, VALUE_ENTRY_X_25_PLE, VALUE_ENTRY_ISO_802_211c,
                VALUE_ENTRY_LocalTalk, VALUE_ENTRY_SMDS_DXI, VALUE_ENTRY_Frame_Relay_Service,
                VALUE_ENTRY_V_35, VALUE_ENTRY_HSSI, VALUE_ENTRY_HIPPI, VALUE_ENTRY_Modem,
                VALUE_ENTRY_AAL5, VALUE_ENTRY_SONET_Path, VALUE_ENTRY_SONET_VT,
                VALUE_ENTRY_SMDS_ICIP, VALUE_ENTRY_Proprietary_Virtual_Internal,
                VALUE_ENTRY_Proprietary_Multiplexor, VALUE_ENTRY_IEEE_802_12,
                VALUE_ENTRY_Fibre_Channel, VALUE_ENTRY_HIPPI_Interface,
                VALUE_ENTRY_Frame_Relay_Interconnect, VALUE_ENTRY_ATM_Emulated_LAN_for_802_3,
                VALUE_ENTRY_ATM_Emulated_LAN_for_802_5, VALUE_ENTRY_ATM_Emulated_Circuit,
                VALUE_ENTRY_Fast_Ethernet__100BaseT_, VALUE_ENTRY_ISDN, VALUE_ENTRY_V_11,
                VALUE_ENTRY_V_36, VALUE_ENTRY_G703_at_64K, VALUE_ENTRY_G703_at_2Mb,
                VALUE_ENTRY_QLLC, VALUE_ENTRY_Fast_Ethernet_100BaseFX, VALUE_ENTRY_Channel,
                VALUE_ENTRY_IEEE_802_11, VALUE_ENTRY_IBM_260_370_OEMI_Channel, VALUE_ENTRY_ESCON,
                VALUE_ENTRY_Data_Link_Switching, VALUE_ENTRY_ISDN_S_T_Interface,
                VALUE_ENTRY_ISDN_U_Interface, VALUE_ENTRY_LAP_D, VALUE_ENTRY_IP_Switch,
                VALUE_ENTRY_Remote_Source_Route_Bridging, VALUE_ENTRY_ATM_Logical, VALUE_ENTRY_DS0,
                VALUE_ENTRY_DS0_Bundle, VALUE_ENTRY_BSC, VALUE_ENTRY_Async,
                VALUE_ENTRY_Combat_Net_Radio, VALUE_ENTRY_ISO_802_5r_DTR,
                VALUE_ENTRY_Ext_Pos_Loc_Report_System,
                VALUE_ENTRY_AppleTalk_Remote_Access_Protocol,
                VALUE_ENTRY_Proprietary_Connectionless, VALUE_ENTRY_ITU_X_29_Host_PAD,
                VALUE_ENTRY_ITU_X_3_Terminal_PAD, VALUE_ENTRY_Frame_Relay_MPI,
                VALUE_ENTRY_ITU_X_213, VALUE_ENTRY_ADSL, VALUE_ENTRY_RADSL, VALUE_ENTRY_SDSL,
                VALUE_ENTRY_VDSL, VALUE_ENTRY_ISO_802_5_CRFP, VALUE_ENTRY_Myrinet,
                VALUE_ENTRY_Voice_Receive_and_Transmit, VALUE_ENTRY_Voice_Foreign_Exchange_Office,
                VALUE_ENTRY_Voice_Foreign_Exchange_Service, VALUE_ENTRY_Voice_Encapsulation,
                VALUE_ENTRY_Voice_over_IP, VALUE_ENTRY_ATM_DXI, VALUE_ENTRY_ATM_FUNI,
                VALUE_ENTRY_ATM_IMA, VALUE_ENTRY_PPP_Multilink_Bundle, VALUE_ENTRY_IP_over_CDLC,
                VALUE_ENTRY_IP_over_CLAW, VALUE_ENTRY_Stack_to_Stack,
                VALUE_ENTRY_Virtual_IP_Address, VALUE_ENTRY_MPC, VALUE_ENTRY_IP_over_ATM,
                VALUE_ENTRY_ISO_802_5j_Fibre_Token_Ring, VALUE_ENTRY_TDLC,
                VALUE_ENTRY_Gigabit_Ethernet, VALUE_ENTRY_HDLC, VALUE_ENTRY_LAP_F,
                VALUE_ENTRY_V_37, VALUE_ENTRY_X_25_MLP, VALUE_ENTRY_X_25_Hunt_Group,
                VALUE_ENTRY_Transp_HDLC, VALUE_ENTRY_Interleave_Channel, VALUE_ENTRY_FAST_Channel,
                VALUE_ENTRY_IP__for_APPN_HPR_in_IP_Networks_, VALUE_ENTRY_CATV_MAC_Layer,
                VALUE_ENTRY_CATV_Downstream, VALUE_ENTRY_CATV_Upstream,
                VALUE_ENTRY_Avalon_12MPP_Switch, VALUE_ENTRY_Tunnel, VALUE_ENTRY_Coffee,
                VALUE_ENTRY_Circuit_Emulation_Service, VALUE_ENTRY_ATM_SubInterface,
                VALUE_ENTRY_Layer_2_VLAN_using_802_1Q, VALUE_ENTRY_Layer_3_VLAN_using_IP,
                VALUE_ENTRY_Layer_3_VLAN_using_IPX, VALUE_ENTRY_Digital_Power_Line,
                VALUE_ENTRY_Multimedia_Mail_over_IP, VALUE_ENTRY_DTM, VALUE_ENTRY_DCN,
                VALUE_ENTRY_IP_Forwarding, VALUE_ENTRY_MSDSL, VALUE_ENTRY_IEEE_1394,
                VALUE_ENTRY_IF_GSN_HIPPI_6400, VALUE_ENTRY_DVB_RCC_MAC_Layer,
                VALUE_ENTRY_DVB_RCC_Downstream, VALUE_ENTRY_DVB_RCC_Upstream,
                VALUE_ENTRY_ATM_Virtual, VALUE_ENTRY_MPLS_Tunnel, VALUE_ENTRY_SRP,
                VALUE_ENTRY_Voice_over_ATM, VALUE_ENTRY_Voice_over_Frame_Relay, VALUE_ENTRY_ISDL,
                VALUE_ENTRY_Composite_Link, VALUE_ENTRY_SS7_Signaling_Link,
                VALUE_ENTRY_Proprietary_P2P_Wireless, VALUE_ENTRY_Frame_Forward,
                VALUE_ENTRY_RFC1483_Multiprotocol_over_ATM, VALUE_ENTRY_USB,
                VALUE_ENTRY_IEEE_802_3ad_Link_Aggregate, VALUE_ENTRY_BGP_Policy_Accounting,
                VALUE_ENTRY_FRF__16_Multilink_FR, VALUE_ENTRY_H_323_Gatekeeper,
                VALUE_ENTRY_H_323_Proxy, VALUE_ENTRY_MPLS,
                VALUE_ENTRY_Multi_Frequency_Signaling_Link, VALUE_ENTRY_HDSL_2, VALUE_ENTRY_S_HDSL,
                VALUE_ENTRY_DS1_Facility_Data_Link, VALUE_ENTRY_Packet_over_SONET_SDH,
                VALUE_ENTRY_DVB_ASI_Input, VALUE_ENTRY_DVB_ASI_Output, VALUE_ENTRY_Power_Line,
                VALUE_ENTRY_Non_Facility_Associated_Signaling, VALUE_ENTRY_TR008,
                VALUE_ENTRY_GR303_RDT, VALUE_ENTRY_GR303_IDT, VALUE_ENTRY_ISUP,
                VALUE_ENTRY_Proprietary_Wireless_MAC_Layer,
                VALUE_ENTRY_Proprietary_Wireless_Downstream,
                VALUE_ENTRY_Proprietary_Wireless_Upstream, VALUE_ENTRY_HIPERLAN_Type_2,
                VALUE_ENTRY_Proprietary_Broadband_Wireless_Access_Point_to_Mulipoint,
                VALUE_ENTRY_SONET_Overhead_Channel, VALUE_ENTRY_Digital_Wrapper_Overhead_Channel,
                VALUE_ENTRY_ATM_Adaptation_Layer_2, VALUE_ENTRY_Radio_MAC, VALUE_ENTRY_ATM_Radio,
                VALUE_ENTRY_Inter_Machine_Trunk, VALUE_ENTRY_MVL_DSL, VALUE_ENTRY_Long_Read_DSL,
                VALUE_ENTRY_Frame_Relay_DLCI_Endpoint, VALUE_ENTRY_ATM_VCI_Endpoint,
                VALUE_ENTRY_Optical_Channel, VALUE_ENTRY_Optical_Transport,
                VALUE_ENTRY_Proprietary_ATM, VALUE_ENTRY_Voice_over_Cable, VALUE_ENTRY_Infiniband,
                VALUE_ENTRY_TE_Link, VALUE_ENTRY_Q_2931, VALUE_ENTRY_Virtual_Trunk_Group,
                VALUE_ENTRY_SIP_Trunk_Group, VALUE_ENTRY_SIP_Signaling,
                VALUE_ENTRY_CATV_Upstream_Channel, VALUE_ENTRY_Econet, VALUE_ENTRY_FSAN_155Mb_PON,
                VALUE_ENTRY_FSAN_622Mb_PON, VALUE_ENTRY_Transparent_Bridge, VALUE_ENTRY_Line_Group,
                VALUE_ENTRY_Voice_E_M_Feature_Group, VALUE_ENTRY_Voice_FGD_EANA,
                VALUE_ENTRY_Voice_DID, VALUE_ENTRY_MPEG_Transport, VALUE_ENTRY_6To4,
                VALUE_ENTRY_GTP, VALUE_ENTRY_Paradyne_EtherLoop_1,
                VALUE_ENTRY_Paradyne_EtherLoop_2, VALUE_ENTRY_Optical_Channel_Group,
                VALUE_ENTRY_HomePNA, VALUE_ENTRY_GFP, VALUE_ENTRY_ciscoISLvlan,
                VALUE_ENTRY_actelisMetaLOOP, VALUE_ENTRY_Fcip, VALUE_ENTRY_IANA_Reserved,
                VALUE_ENTRY_IPv4, VALUE_ENTRY_IPv6, VALUE_ENTRY_IPv4_v6, VALUE_ENTRY_IPX,
                VALUE_ENTRY_DECnet, VALUE_ENTRY_SNA, VALUE_ENTRY_CONP, VALUE_ENTRY_CLNP,
                VALUE_ENTRY_VINES, VALUE_ENTRY_XNS, VALUE_ENTRY_ISDN_B_Channel_Endpoint,
                VALUE_ENTRY_ISDN_D_Channel_Endpoint, VALUE_ENTRY_BGP, VALUE_ENTRY_OSPF,
                VALUE_ENTRY_UDP, VALUE_ENTRY_TCP, VALUE_ENTRY_802_11a, VALUE_ENTRY_802_11b,
                VALUE_ENTRY_802_11g, VALUE_ENTRY_802_11h, VALUE_ENTRY_NFS, VALUE_ENTRY_CIFS,
                VALUE_ENTRY_DAFS, VALUE_ENTRY_WebDAV, VALUE_ENTRY_HTTP, VALUE_ENTRY_FTP,
                VALUE_ENTRY_NDMP, VALUE_ENTRY_Telnet, VALUE_ENTRY_SSH, VALUE_ENTRY_SM_CLP,
                VALUE_ENTRY_SMTP, VALUE_ENTRY_LDAP, VALUE_ENTRY_RDP, VALUE_ENTRY_HTTPS,
                VALUE_ENTRY_DMTF_Reserved, VALUE_ENTRY_Vendor_Reserved };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ProtocolIFType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_Regular_1822, VALUE_ENTRY_HDH_1822,
                VALUE_ENTRY_DDN_X_25, VALUE_ENTRY_RFC877_X_25, VALUE_ENTRY_Ethernet_CSMA_CD,
                VALUE_ENTRY_ISO_802_3_CSMA_CD, VALUE_ENTRY_ISO_802_4_Token_Bus,
                VALUE_ENTRY_ISO_802_5_Token_Ring, VALUE_ENTRY_ISO_802_6_MAN, VALUE_ENTRY_StarLAN,
                VALUE_ENTRY_Proteon_10Mbit, VALUE_ENTRY_Proteon_80Mbit, VALUE_ENTRY_HyperChannel,
                VALUE_ENTRY_FDDI, VALUE_ENTRY_LAP_B, VALUE_ENTRY_SDLC, VALUE_ENTRY_DS1,
                VALUE_ENTRY_E1, VALUE_ENTRY_Basic_ISDN, VALUE_ENTRY_Primary_ISDN,
                VALUE_ENTRY_Proprietary_Point_to_Point_Serial, VALUE_ENTRY_PPP,
                VALUE_ENTRY_Software_Loopback, VALUE_ENTRY_EON, VALUE_ENTRY_Ethernet_3Mbit,
                VALUE_ENTRY_NSIP, VALUE_ENTRY_SLIP, VALUE_ENTRY_Ultra, VALUE_ENTRY_DS3,
                VALUE_ENTRY_SIP, VALUE_ENTRY_Frame_Relay, VALUE_ENTRY_RS_232, VALUE_ENTRY_Parallel,
                VALUE_ENTRY_ARCNet, VALUE_ENTRY_ARCNet_Plus, VALUE_ENTRY_ATM, VALUE_ENTRY_MIO_X_25,
                VALUE_ENTRY_SONET, VALUE_ENTRY_X_25_PLE, VALUE_ENTRY_ISO_802_211c,
                VALUE_ENTRY_LocalTalk, VALUE_ENTRY_SMDS_DXI, VALUE_ENTRY_Frame_Relay_Service,
                VALUE_ENTRY_V_35, VALUE_ENTRY_HSSI, VALUE_ENTRY_HIPPI, VALUE_ENTRY_Modem,
                VALUE_ENTRY_AAL5, VALUE_ENTRY_SONET_Path, VALUE_ENTRY_SONET_VT,
                VALUE_ENTRY_SMDS_ICIP, VALUE_ENTRY_Proprietary_Virtual_Internal,
                VALUE_ENTRY_Proprietary_Multiplexor, VALUE_ENTRY_IEEE_802_12,
                VALUE_ENTRY_Fibre_Channel, VALUE_ENTRY_HIPPI_Interface,
                VALUE_ENTRY_Frame_Relay_Interconnect, VALUE_ENTRY_ATM_Emulated_LAN_for_802_3,
                VALUE_ENTRY_ATM_Emulated_LAN_for_802_5, VALUE_ENTRY_ATM_Emulated_Circuit,
                VALUE_ENTRY_Fast_Ethernet__100BaseT_, VALUE_ENTRY_ISDN, VALUE_ENTRY_V_11,
                VALUE_ENTRY_V_36, VALUE_ENTRY_G703_at_64K, VALUE_ENTRY_G703_at_2Mb,
                VALUE_ENTRY_QLLC, VALUE_ENTRY_Fast_Ethernet_100BaseFX, VALUE_ENTRY_Channel,
                VALUE_ENTRY_IEEE_802_11, VALUE_ENTRY_IBM_260_370_OEMI_Channel, VALUE_ENTRY_ESCON,
                VALUE_ENTRY_Data_Link_Switching, VALUE_ENTRY_ISDN_S_T_Interface,
                VALUE_ENTRY_ISDN_U_Interface, VALUE_ENTRY_LAP_D, VALUE_ENTRY_IP_Switch,
                VALUE_ENTRY_Remote_Source_Route_Bridging, VALUE_ENTRY_ATM_Logical, VALUE_ENTRY_DS0,
                VALUE_ENTRY_DS0_Bundle, VALUE_ENTRY_BSC, VALUE_ENTRY_Async,
                VALUE_ENTRY_Combat_Net_Radio, VALUE_ENTRY_ISO_802_5r_DTR,
                VALUE_ENTRY_Ext_Pos_Loc_Report_System,
                VALUE_ENTRY_AppleTalk_Remote_Access_Protocol,
                VALUE_ENTRY_Proprietary_Connectionless, VALUE_ENTRY_ITU_X_29_Host_PAD,
                VALUE_ENTRY_ITU_X_3_Terminal_PAD, VALUE_ENTRY_Frame_Relay_MPI,
                VALUE_ENTRY_ITU_X_213, VALUE_ENTRY_ADSL, VALUE_ENTRY_RADSL, VALUE_ENTRY_SDSL,
                VALUE_ENTRY_VDSL, VALUE_ENTRY_ISO_802_5_CRFP, VALUE_ENTRY_Myrinet,
                VALUE_ENTRY_Voice_Receive_and_Transmit, VALUE_ENTRY_Voice_Foreign_Exchange_Office,
                VALUE_ENTRY_Voice_Foreign_Exchange_Service, VALUE_ENTRY_Voice_Encapsulation,
                VALUE_ENTRY_Voice_over_IP, VALUE_ENTRY_ATM_DXI, VALUE_ENTRY_ATM_FUNI,
                VALUE_ENTRY_ATM_IMA, VALUE_ENTRY_PPP_Multilink_Bundle, VALUE_ENTRY_IP_over_CDLC,
                VALUE_ENTRY_IP_over_CLAW, VALUE_ENTRY_Stack_to_Stack,
                VALUE_ENTRY_Virtual_IP_Address, VALUE_ENTRY_MPC, VALUE_ENTRY_IP_over_ATM,
                VALUE_ENTRY_ISO_802_5j_Fibre_Token_Ring, VALUE_ENTRY_TDLC,
                VALUE_ENTRY_Gigabit_Ethernet, VALUE_ENTRY_HDLC, VALUE_ENTRY_LAP_F,
                VALUE_ENTRY_V_37, VALUE_ENTRY_X_25_MLP, VALUE_ENTRY_X_25_Hunt_Group,
                VALUE_ENTRY_Transp_HDLC, VALUE_ENTRY_Interleave_Channel, VALUE_ENTRY_FAST_Channel,
                VALUE_ENTRY_IP__for_APPN_HPR_in_IP_Networks_, VALUE_ENTRY_CATV_MAC_Layer,
                VALUE_ENTRY_CATV_Downstream, VALUE_ENTRY_CATV_Upstream,
                VALUE_ENTRY_Avalon_12MPP_Switch, VALUE_ENTRY_Tunnel, VALUE_ENTRY_Coffee,
                VALUE_ENTRY_Circuit_Emulation_Service, VALUE_ENTRY_ATM_SubInterface,
                VALUE_ENTRY_Layer_2_VLAN_using_802_1Q, VALUE_ENTRY_Layer_3_VLAN_using_IP,
                VALUE_ENTRY_Layer_3_VLAN_using_IPX, VALUE_ENTRY_Digital_Power_Line,
                VALUE_ENTRY_Multimedia_Mail_over_IP, VALUE_ENTRY_DTM, VALUE_ENTRY_DCN,
                VALUE_ENTRY_IP_Forwarding, VALUE_ENTRY_MSDSL, VALUE_ENTRY_IEEE_1394,
                VALUE_ENTRY_IF_GSN_HIPPI_6400, VALUE_ENTRY_DVB_RCC_MAC_Layer,
                VALUE_ENTRY_DVB_RCC_Downstream, VALUE_ENTRY_DVB_RCC_Upstream,
                VALUE_ENTRY_ATM_Virtual, VALUE_ENTRY_MPLS_Tunnel, VALUE_ENTRY_SRP,
                VALUE_ENTRY_Voice_over_ATM, VALUE_ENTRY_Voice_over_Frame_Relay, VALUE_ENTRY_ISDL,
                VALUE_ENTRY_Composite_Link, VALUE_ENTRY_SS7_Signaling_Link,
                VALUE_ENTRY_Proprietary_P2P_Wireless, VALUE_ENTRY_Frame_Forward,
                VALUE_ENTRY_RFC1483_Multiprotocol_over_ATM, VALUE_ENTRY_USB,
                VALUE_ENTRY_IEEE_802_3ad_Link_Aggregate, VALUE_ENTRY_BGP_Policy_Accounting,
                VALUE_ENTRY_FRF__16_Multilink_FR, VALUE_ENTRY_H_323_Gatekeeper,
                VALUE_ENTRY_H_323_Proxy, VALUE_ENTRY_MPLS,
                VALUE_ENTRY_Multi_Frequency_Signaling_Link, VALUE_ENTRY_HDSL_2, VALUE_ENTRY_S_HDSL,
                VALUE_ENTRY_DS1_Facility_Data_Link, VALUE_ENTRY_Packet_over_SONET_SDH,
                VALUE_ENTRY_DVB_ASI_Input, VALUE_ENTRY_DVB_ASI_Output, VALUE_ENTRY_Power_Line,
                VALUE_ENTRY_Non_Facility_Associated_Signaling, VALUE_ENTRY_TR008,
                VALUE_ENTRY_GR303_RDT, VALUE_ENTRY_GR303_IDT, VALUE_ENTRY_ISUP,
                VALUE_ENTRY_Proprietary_Wireless_MAC_Layer,
                VALUE_ENTRY_Proprietary_Wireless_Downstream,
                VALUE_ENTRY_Proprietary_Wireless_Upstream, VALUE_ENTRY_HIPERLAN_Type_2,
                VALUE_ENTRY_Proprietary_Broadband_Wireless_Access_Point_to_Mulipoint,
                VALUE_ENTRY_SONET_Overhead_Channel, VALUE_ENTRY_Digital_Wrapper_Overhead_Channel,
                VALUE_ENTRY_ATM_Adaptation_Layer_2, VALUE_ENTRY_Radio_MAC, VALUE_ENTRY_ATM_Radio,
                VALUE_ENTRY_Inter_Machine_Trunk, VALUE_ENTRY_MVL_DSL, VALUE_ENTRY_Long_Read_DSL,
                VALUE_ENTRY_Frame_Relay_DLCI_Endpoint, VALUE_ENTRY_ATM_VCI_Endpoint,
                VALUE_ENTRY_Optical_Channel, VALUE_ENTRY_Optical_Transport,
                VALUE_ENTRY_Proprietary_ATM, VALUE_ENTRY_Voice_over_Cable, VALUE_ENTRY_Infiniband,
                VALUE_ENTRY_TE_Link, VALUE_ENTRY_Q_2931, VALUE_ENTRY_Virtual_Trunk_Group,
                VALUE_ENTRY_SIP_Trunk_Group, VALUE_ENTRY_SIP_Signaling,
                VALUE_ENTRY_CATV_Upstream_Channel, VALUE_ENTRY_Econet, VALUE_ENTRY_FSAN_155Mb_PON,
                VALUE_ENTRY_FSAN_622Mb_PON, VALUE_ENTRY_Transparent_Bridge, VALUE_ENTRY_Line_Group,
                VALUE_ENTRY_Voice_E_M_Feature_Group, VALUE_ENTRY_Voice_FGD_EANA,
                VALUE_ENTRY_Voice_DID, VALUE_ENTRY_MPEG_Transport, VALUE_ENTRY_6To4,
                VALUE_ENTRY_GTP, VALUE_ENTRY_Paradyne_EtherLoop_1,
                VALUE_ENTRY_Paradyne_EtherLoop_2, VALUE_ENTRY_Optical_Channel_Group,
                VALUE_ENTRY_HomePNA, VALUE_ENTRY_GFP, VALUE_ENTRY_ciscoISLvlan,
                VALUE_ENTRY_actelisMetaLOOP, VALUE_ENTRY_Fcip, VALUE_ENTRY_IPv4, VALUE_ENTRY_IPv6,
                VALUE_ENTRY_IPv4_v6, VALUE_ENTRY_IPX, VALUE_ENTRY_DECnet, VALUE_ENTRY_SNA,
                VALUE_ENTRY_CONP, VALUE_ENTRY_CLNP, VALUE_ENTRY_VINES, VALUE_ENTRY_XNS,
                VALUE_ENTRY_ISDN_B_Channel_Endpoint, VALUE_ENTRY_ISDN_D_Channel_Endpoint,
                VALUE_ENTRY_BGP, VALUE_ENTRY_OSPF, VALUE_ENTRY_UDP, VALUE_ENTRY_TCP,
                VALUE_ENTRY_802_11a, VALUE_ENTRY_802_11b, VALUE_ENTRY_802_11g, VALUE_ENTRY_802_11h,
                VALUE_ENTRY_NFS, VALUE_ENTRY_CIFS, VALUE_ENTRY_DAFS, VALUE_ENTRY_WebDAV,
                VALUE_ENTRY_HTTP, VALUE_ENTRY_FTP, VALUE_ENTRY_NDMP, VALUE_ENTRY_Telnet,
                VALUE_ENTRY_SSH, VALUE_ENTRY_SM_CLP, VALUE_ENTRY_SMTP, VALUE_ENTRY_LDAP,
                VALUE_ENTRY_RDP, VALUE_ENTRY_HTTPS };

    }

    /**
     * Constants of property ProtocolType
     * Note: This property is deprecated in lieu of the ProtocolIFType enumeration. This deprecation was done to have better alignment between the IF-MIB of the IETF and this CIM class. 
     * Deprecated description: ProtocolType is an enumeration that provides information to categorize and classify different instances of this class. For most instances, information in this enumeration and the definition of the subclass overlap. However, there are several cases where a specific subclass of ProtocolEndpoint is not required (for example, there is no Fibre Channel subclass of ProtocolEndpoint). Therefore, this property is needed to define the type of Endpoint.
     */
    public static class PROPERTY_PROTOCOLTYPE {
        /**
         * name of the property ProtocolType
         */
        public final static String NAME = "ProtocolType";

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

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_IPv4 = new javax.cim.UnsignedInteger16(
                "2");

        /**
         * constant for value entry IPv4 (corresponds to mapEntry 2 )
         */
        public final static String VALUE_ENTRY_IPv4 = "IPv4";

        /**
         * constant for value map entry 3
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_IPv6 = new javax.cim.UnsignedInteger16(
                "3");

        /**
         * constant for value entry IPv6 (corresponds to mapEntry 3 )
         */
        public final static String VALUE_ENTRY_IPv6 = "IPv6";

        /**
         * constant for value map entry 4
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_IPX = new javax.cim.UnsignedInteger16(
                "4");

        /**
         * constant for value entry IPX (corresponds to mapEntry 4 )
         */
        public final static String VALUE_ENTRY_IPX = "IPX";

        /**
         * constant for value map entry 5
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_AppleTalk = new javax.cim.UnsignedInteger16(
                "5");

        /**
         * constant for value entry AppleTalk (corresponds to mapEntry 5 )
         */
        public final static String VALUE_ENTRY_AppleTalk = "AppleTalk";

        /**
         * constant for value map entry 6
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_DECnet = new javax.cim.UnsignedInteger16(
                "6");

        /**
         * constant for value entry DECnet (corresponds to mapEntry 6 )
         */
        public final static String VALUE_ENTRY_DECnet = "DECnet";

        /**
         * constant for value map entry 7
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SNA = new javax.cim.UnsignedInteger16(
                "7");

        /**
         * constant for value entry SNA (corresponds to mapEntry 7 )
         */
        public final static String VALUE_ENTRY_SNA = "SNA";

        /**
         * constant for value map entry 8
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_CONP = new javax.cim.UnsignedInteger16(
                "8");

        /**
         * constant for value entry CONP (corresponds to mapEntry 8 )
         */
        public final static String VALUE_ENTRY_CONP = "CONP";

        /**
         * constant for value map entry 9
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_CLNP = new javax.cim.UnsignedInteger16(
                "9");

        /**
         * constant for value entry CLNP (corresponds to mapEntry 9 )
         */
        public final static String VALUE_ENTRY_CLNP = "CLNP";

        /**
         * constant for value map entry 10
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_VINES = new javax.cim.UnsignedInteger16(
                "10");

        /**
         * constant for value entry VINES (corresponds to mapEntry 10 )
         */
        public final static String VALUE_ENTRY_VINES = "VINES";

        /**
         * constant for value map entry 11
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_XNS = new javax.cim.UnsignedInteger16(
                "11");

        /**
         * constant for value entry XNS (corresponds to mapEntry 11 )
         */
        public final static String VALUE_ENTRY_XNS = "XNS";

        /**
         * constant for value map entry 12
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_ATM = new javax.cim.UnsignedInteger16(
                "12");

        /**
         * constant for value entry ATM (corresponds to mapEntry 12 )
         */
        public final static String VALUE_ENTRY_ATM = "ATM";

        /**
         * constant for value map entry 13
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Frame_Relay = new javax.cim.UnsignedInteger16(
                "13");

        /**
         * constant for value entry Frame Relay (corresponds to mapEntry 13 )
         */
        public final static String VALUE_ENTRY_Frame_Relay = "Frame Relay";

        /**
         * constant for value map entry 14
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Ethernet = new javax.cim.UnsignedInteger16(
                "14");

        /**
         * constant for value entry Ethernet (corresponds to mapEntry 14 )
         */
        public final static String VALUE_ENTRY_Ethernet = "Ethernet";

        /**
         * constant for value map entry 15
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_TokenRing = new javax.cim.UnsignedInteger16(
                "15");

        /**
         * constant for value entry TokenRing (corresponds to mapEntry 15 )
         */
        public final static String VALUE_ENTRY_TokenRing = "TokenRing";

        /**
         * constant for value map entry 16
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_FDDI = new javax.cim.UnsignedInteger16(
                "16");

        /**
         * constant for value entry FDDI (corresponds to mapEntry 16 )
         */
        public final static String VALUE_ENTRY_FDDI = "FDDI";

        /**
         * constant for value map entry 17
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Infiniband = new javax.cim.UnsignedInteger16(
                "17");

        /**
         * constant for value entry Infiniband (corresponds to mapEntry 17 )
         */
        public final static String VALUE_ENTRY_Infiniband = "Infiniband";

        /**
         * constant for value map entry 18
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Fibre_Channel = new javax.cim.UnsignedInteger16(
                "18");

        /**
         * constant for value entry Fibre Channel (corresponds to mapEntry 18 )
         */
        public final static String VALUE_ENTRY_Fibre_Channel = "Fibre Channel";

        /**
         * constant for value map entry 19
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_ISDN_BRI_Endpoint = new javax.cim.UnsignedInteger16(
                "19");

        /**
         * constant for value entry ISDN BRI Endpoint (corresponds to mapEntry 19 )
         */
        public final static String VALUE_ENTRY_ISDN_BRI_Endpoint = "ISDN BRI Endpoint";

        /**
         * constant for value map entry 20
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_ISDN_B_Channel_Endpoint = new javax.cim.UnsignedInteger16(
                "20");

        /**
         * constant for value entry ISDN B Channel Endpoint (corresponds to mapEntry 20 )
         */
        public final static String VALUE_ENTRY_ISDN_B_Channel_Endpoint = "ISDN B Channel Endpoint";

        /**
         * constant for value map entry 21
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_ISDN_D_Channel_Endpoint = new javax.cim.UnsignedInteger16(
                "21");

        /**
         * constant for value entry ISDN D Channel Endpoint (corresponds to mapEntry 21 )
         */
        public final static String VALUE_ENTRY_ISDN_D_Channel_Endpoint = "ISDN D Channel Endpoint";

        /**
         * constant for value map entry 22
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_IPv4_v6 = new javax.cim.UnsignedInteger16(
                "22");

        /**
         * constant for value entry IPv4/v6 (corresponds to mapEntry 22 )
         */
        public final static String VALUE_ENTRY_IPv4_v6 = "IPv4/v6";

        /**
         * constant for value map entry 23
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_BGP = new javax.cim.UnsignedInteger16(
                "23");

        /**
         * constant for value entry BGP (corresponds to mapEntry 23 )
         */
        public final static String VALUE_ENTRY_BGP = "BGP";

        /**
         * constant for value map entry 24
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_OSPF = new javax.cim.UnsignedInteger16(
                "24");

        /**
         * constant for value entry OSPF (corresponds to mapEntry 24 )
         */
        public final static String VALUE_ENTRY_OSPF = "OSPF";

        /**
         * constant for value map entry 25
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_MPLS = new javax.cim.UnsignedInteger16(
                "25");

        /**
         * constant for value entry MPLS (corresponds to mapEntry 25 )
         */
        public final static String VALUE_ENTRY_MPLS = "MPLS";

        /**
         * constant for value map entry 26
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_UDP = new javax.cim.UnsignedInteger16(
                "26");

        /**
         * constant for value entry UDP (corresponds to mapEntry 26 )
         */
        public final static String VALUE_ENTRY_UDP = "UDP";

        /**
         * constant for value map entry 27
         */

        public final static javax.cim.UnsignedInteger16 VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_TCP = new javax.cim.UnsignedInteger16(
                "27");

        /**
         * constant for value entry TCP (corresponds to mapEntry 27 )
         */
        public final static String VALUE_ENTRY_TCP = "TCP";

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

            if (VALUE_ENTRY_IPv4.equals(value)) {
                return VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_IPv4;
            }

            if (VALUE_ENTRY_IPv6.equals(value)) {
                return VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_IPv6;
            }

            if (VALUE_ENTRY_IPX.equals(value)) {
                return VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_IPX;
            }

            if (VALUE_ENTRY_AppleTalk.equals(value)) {
                return VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_AppleTalk;
            }

            if (VALUE_ENTRY_DECnet.equals(value)) {
                return VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_DECnet;
            }

            if (VALUE_ENTRY_SNA.equals(value)) {
                return VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SNA;
            }

            if (VALUE_ENTRY_CONP.equals(value)) {
                return VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_CONP;
            }

            if (VALUE_ENTRY_CLNP.equals(value)) {
                return VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_CLNP;
            }

            if (VALUE_ENTRY_VINES.equals(value)) {
                return VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_VINES;
            }

            if (VALUE_ENTRY_XNS.equals(value)) {
                return VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_XNS;
            }

            if (VALUE_ENTRY_ATM.equals(value)) {
                return VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_ATM;
            }

            if (VALUE_ENTRY_Frame_Relay.equals(value)) {
                return VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Frame_Relay;
            }

            if (VALUE_ENTRY_Ethernet.equals(value)) {
                return VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Ethernet;
            }

            if (VALUE_ENTRY_TokenRing.equals(value)) {
                return VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_TokenRing;
            }

            if (VALUE_ENTRY_FDDI.equals(value)) {
                return VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_FDDI;
            }

            if (VALUE_ENTRY_Infiniband.equals(value)) {
                return VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Infiniband;
            }

            if (VALUE_ENTRY_Fibre_Channel.equals(value)) {
                return VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Fibre_Channel;
            }

            if (VALUE_ENTRY_ISDN_BRI_Endpoint.equals(value)) {
                return VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_ISDN_BRI_Endpoint;
            }

            if (VALUE_ENTRY_ISDN_B_Channel_Endpoint.equals(value)) {
                return VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_ISDN_B_Channel_Endpoint;
            }

            if (VALUE_ENTRY_ISDN_D_Channel_Endpoint.equals(value)) {
                return VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_ISDN_D_Channel_Endpoint;
            }

            if (VALUE_ENTRY_IPv4_v6.equals(value)) {
                return VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_IPv4_v6;
            }

            if (VALUE_ENTRY_BGP.equals(value)) {
                return VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_BGP;
            }

            if (VALUE_ENTRY_OSPF.equals(value)) {
                return VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_OSPF;
            }

            if (VALUE_ENTRY_MPLS.equals(value)) {
                return VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_MPLS;
            }

            if (VALUE_ENTRY_UDP.equals(value)) {
                return VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_UDP;
            }

            if (VALUE_ENTRY_TCP.equals(value)) {
                return VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_TCP;
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

            if (iValue == VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_IPv4.intValue()) {
                return VALUE_ENTRY_IPv4;
            }

            if (iValue == VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_IPv6.intValue()) {
                return VALUE_ENTRY_IPv6;
            }

            if (iValue == VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_IPX.intValue()) {
                return VALUE_ENTRY_IPX;
            }

            if (iValue == VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_AppleTalk.intValue()) {
                return VALUE_ENTRY_AppleTalk;
            }

            if (iValue == VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_DECnet.intValue()) {
                return VALUE_ENTRY_DECnet;
            }

            if (iValue == VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SNA.intValue()) {
                return VALUE_ENTRY_SNA;
            }

            if (iValue == VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_CONP.intValue()) {
                return VALUE_ENTRY_CONP;
            }

            if (iValue == VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_CLNP.intValue()) {
                return VALUE_ENTRY_CLNP;
            }

            if (iValue == VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_VINES.intValue()) {
                return VALUE_ENTRY_VINES;
            }

            if (iValue == VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_XNS.intValue()) {
                return VALUE_ENTRY_XNS;
            }

            if (iValue == VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_ATM.intValue()) {
                return VALUE_ENTRY_ATM;
            }

            if (iValue == VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Frame_Relay.intValue()) {
                return VALUE_ENTRY_Frame_Relay;
            }

            if (iValue == VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Ethernet.intValue()) {
                return VALUE_ENTRY_Ethernet;
            }

            if (iValue == VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_TokenRing.intValue()) {
                return VALUE_ENTRY_TokenRing;
            }

            if (iValue == VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_FDDI.intValue()) {
                return VALUE_ENTRY_FDDI;
            }

            if (iValue == VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Infiniband.intValue()) {
                return VALUE_ENTRY_Infiniband;
            }

            if (iValue == VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Fibre_Channel.intValue()) {
                return VALUE_ENTRY_Fibre_Channel;
            }

            if (iValue == VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_ISDN_BRI_Endpoint.intValue()) {
                return VALUE_ENTRY_ISDN_BRI_Endpoint;
            }

            if (iValue == VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_ISDN_B_Channel_Endpoint.intValue()) {
                return VALUE_ENTRY_ISDN_B_Channel_Endpoint;
            }

            if (iValue == VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_ISDN_D_Channel_Endpoint.intValue()) {
                return VALUE_ENTRY_ISDN_D_Channel_Endpoint;
            }

            if (iValue == VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_IPv4_v6.intValue()) {
                return VALUE_ENTRY_IPv4_v6;
            }

            if (iValue == VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_BGP.intValue()) {
                return VALUE_ENTRY_BGP;
            }

            if (iValue == VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_OSPF.intValue()) {
                return VALUE_ENTRY_OSPF;
            }

            if (iValue == VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_MPLS.intValue()) {
                return VALUE_ENTRY_MPLS;
            }

            if (iValue == VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_UDP.intValue()) {
                return VALUE_ENTRY_UDP;
            }

            if (iValue == VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_TCP.intValue()) {
                return VALUE_ENTRY_TCP;
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
         * Value Map for the property ProtocolType   
         */
        public final static javax.cim.UnsignedInteger16[] VALUE_MAP_ENTRIES = {
                VALUE_MAP_ENTRY_0_FOR_VALUE_ENTRY_Unknown, VALUE_MAP_ENTRY_1_FOR_VALUE_ENTRY_Other,
                VALUE_MAP_ENTRY_2_FOR_VALUE_ENTRY_IPv4, VALUE_MAP_ENTRY_3_FOR_VALUE_ENTRY_IPv6,
                VALUE_MAP_ENTRY_4_FOR_VALUE_ENTRY_IPX, VALUE_MAP_ENTRY_5_FOR_VALUE_ENTRY_AppleTalk,
                VALUE_MAP_ENTRY_6_FOR_VALUE_ENTRY_DECnet, VALUE_MAP_ENTRY_7_FOR_VALUE_ENTRY_SNA,
                VALUE_MAP_ENTRY_8_FOR_VALUE_ENTRY_CONP, VALUE_MAP_ENTRY_9_FOR_VALUE_ENTRY_CLNP,
                VALUE_MAP_ENTRY_10_FOR_VALUE_ENTRY_VINES, VALUE_MAP_ENTRY_11_FOR_VALUE_ENTRY_XNS,
                VALUE_MAP_ENTRY_12_FOR_VALUE_ENTRY_ATM,
                VALUE_MAP_ENTRY_13_FOR_VALUE_ENTRY_Frame_Relay,
                VALUE_MAP_ENTRY_14_FOR_VALUE_ENTRY_Ethernet,
                VALUE_MAP_ENTRY_15_FOR_VALUE_ENTRY_TokenRing,
                VALUE_MAP_ENTRY_16_FOR_VALUE_ENTRY_FDDI,
                VALUE_MAP_ENTRY_17_FOR_VALUE_ENTRY_Infiniband,
                VALUE_MAP_ENTRY_18_FOR_VALUE_ENTRY_Fibre_Channel,
                VALUE_MAP_ENTRY_19_FOR_VALUE_ENTRY_ISDN_BRI_Endpoint,
                VALUE_MAP_ENTRY_20_FOR_VALUE_ENTRY_ISDN_B_Channel_Endpoint,
                VALUE_MAP_ENTRY_21_FOR_VALUE_ENTRY_ISDN_D_Channel_Endpoint,
                VALUE_MAP_ENTRY_22_FOR_VALUE_ENTRY_IPv4_v6, VALUE_MAP_ENTRY_23_FOR_VALUE_ENTRY_BGP,
                VALUE_MAP_ENTRY_24_FOR_VALUE_ENTRY_OSPF, VALUE_MAP_ENTRY_25_FOR_VALUE_ENTRY_MPLS,
                VALUE_MAP_ENTRY_26_FOR_VALUE_ENTRY_UDP, VALUE_MAP_ENTRY_27_FOR_VALUE_ENTRY_TCP };

        /**
         * Values
         * Contains all values even those having an integer value range representation within the valueMap
         * Value Map for the property ProtocolType   
         */
        public final static String[] VALUE_ENTRIES = { VALUE_ENTRY_Unknown, VALUE_ENTRY_Other,
                VALUE_ENTRY_IPv4, VALUE_ENTRY_IPv6, VALUE_ENTRY_IPX, VALUE_ENTRY_AppleTalk,
                VALUE_ENTRY_DECnet, VALUE_ENTRY_SNA, VALUE_ENTRY_CONP, VALUE_ENTRY_CLNP,
                VALUE_ENTRY_VINES, VALUE_ENTRY_XNS, VALUE_ENTRY_ATM, VALUE_ENTRY_Frame_Relay,
                VALUE_ENTRY_Ethernet, VALUE_ENTRY_TokenRing, VALUE_ENTRY_FDDI,
                VALUE_ENTRY_Infiniband, VALUE_ENTRY_Fibre_Channel, VALUE_ENTRY_ISDN_BRI_Endpoint,
                VALUE_ENTRY_ISDN_B_Channel_Endpoint, VALUE_ENTRY_ISDN_D_Channel_Endpoint,
                VALUE_ENTRY_IPv4_v6, VALUE_ENTRY_BGP, VALUE_ENTRY_OSPF, VALUE_ENTRY_MPLS,
                VALUE_ENTRY_UDP, VALUE_ENTRY_TCP };

        /**
         * Values for displaying within pulldown elements, lists, radio buttons etc
         * Contains no values that having an integer value range representation within the valueMap
         * 
         * Value Map for the property ProtocolType   
         */
        public final static String[] VALUE_ENTRIES_FOR_DISPLAY = { VALUE_ENTRY_Unknown,
                VALUE_ENTRY_Other, VALUE_ENTRY_IPv4, VALUE_ENTRY_IPv6, VALUE_ENTRY_IPX,
                VALUE_ENTRY_AppleTalk, VALUE_ENTRY_DECnet, VALUE_ENTRY_SNA, VALUE_ENTRY_CONP,
                VALUE_ENTRY_CLNP, VALUE_ENTRY_VINES, VALUE_ENTRY_XNS, VALUE_ENTRY_ATM,
                VALUE_ENTRY_Frame_Relay, VALUE_ENTRY_Ethernet, VALUE_ENTRY_TokenRing,
                VALUE_ENTRY_FDDI, VALUE_ENTRY_Infiniband, VALUE_ENTRY_Fibre_Channel,
                VALUE_ENTRY_ISDN_BRI_Endpoint, VALUE_ENTRY_ISDN_B_Channel_Endpoint,
                VALUE_ENTRY_ISDN_D_Channel_Endpoint, VALUE_ENTRY_IPv4_v6, VALUE_ENTRY_BGP,
                VALUE_ENTRY_OSPF, VALUE_ENTRY_MPLS, VALUE_ENTRY_UDP, VALUE_ENTRY_TCP };

    }

    /**
     * Constants of property TimeOfLastStateChange
     * 
     */
    public static class PROPERTY_TIMEOFLASTSTATECHANGE {
        /**
         * name of the property TimeOfLastStateChange
         */
        public final static String NAME = "TimeOfLastStateChange";

    }

    static {
        addPackage("org.sblim.wbemsmt.schema.cim221");
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
     *   A communication point from which data can be sent or received. ProtocolEndpoints link system or computer interfaces to LogicalNetworks.
     *   @param client the CIM Client
     *   @param namespace the target namespace
     */

    public CIM_ProtocolEndpoint(WBEMClient client, String namespace) throws WbemsmtException {
        CIMClass cls = getClass(client, namespace);
        setFromServer(false);
        init(cls.newInstance(), true);
    }

    /**
     *   Class constructor
     * 
     *       *   <br>
     *   A communication point from which data can be sent or received. ProtocolEndpoints link system or computer interfaces to LogicalNetworks.
     *   @param cimInstance the instance that is used to create the Object
     */

    public CIM_ProtocolEndpoint(CIMInstance cimInstance) throws WbemsmtException {

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
    protected CIM_ProtocolEndpoint() {
    }

    /**
     * initializes the FCO
     *
     *   @param cimInstance the instance that is used to create the Object
     *   @param overwrite currently the dataType of embeddedObject/Instance properties is not set correct by the cimClient. This flags decides if to overwrite thos properties
     */
    protected void init(CIMInstance cimInstance, boolean overwrite) throws WbemsmtException {
        propertiesToCheck.put("Description", new CIMProperty("Description", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("EnabledState", new CIMProperty("EnabledState", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("Name", new CIMProperty("Name", CIMDataType.STRING_T, null));
        propertiesToCheck.put("NameFormat", new CIMProperty("NameFormat", CIMDataType.STRING_T,
                null));
        propertiesToCheck.put("OperationalStatus", new CIMProperty("OperationalStatus",
                CIMDataType.UINT16_ARRAY_T, null));
        propertiesToCheck.put("OtherTypeDescription", new CIMProperty("OtherTypeDescription",
                CIMDataType.STRING_T, null));
        propertiesToCheck.put("ProtocolIFType", new CIMProperty("ProtocolIFType",
                CIMDataType.UINT16_T, null));
        propertiesToCheck.put("ProtocolType", new CIMProperty("ProtocolType", CIMDataType.UINT16_T,
                null));
        propertiesToCheck.put("TimeOfLastStateChange", new CIMProperty("TimeOfLastStateChange",
                CIMDataType.DATETIME_T, null));

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
     * Get the property Description
     *     * <br>
     * 
     *     */

    public String get_Description() {
        CIMProperty currentProperty = getProperty(PROPERTY_DESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_DESCRIPTION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Description
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Description(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_DESCRIPTION.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Description(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_DESCRIPTION.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Description by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Description(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_ProtocolEndpoint fco = new CIM_ProtocolEndpoint(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_DESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_Description(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_DESCRIPTION.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Description
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_Description(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property EnabledState
     *     * <br>
     * 
     *     */

    public javax.cim.UnsignedInteger16 get_EnabledState() {
        CIMProperty currentProperty = getProperty(PROPERTY_ENABLEDSTATE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_ENABLEDSTATE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property EnabledState
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_EnabledState(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_ENABLEDSTATE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_EnabledState(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_ENABLEDSTATE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property EnabledState by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_EnabledState(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ProtocolEndpoint fco = new CIM_ProtocolEndpoint(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_ENABLEDSTATE.NAME);
        if (property != null) {
            property = setPropertyValue_EnabledState(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_ENABLEDSTATE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property EnabledState
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_EnabledState(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property Name
     *     * <br>
     * A string that identifies this ProtocolEndpoint with either a port or an interface on a device. To ensure uniqueness, the Name property should be prepended or appended with information from the Type or OtherTypeDescription properties. The method selected is described in the NameFormat property of this class.
     *     */

    public String get_Name() {
        CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property Name
     * <br>
     * A string that identifies this ProtocolEndpoint with either a port or an interface on a device. To ensure uniqueness, the Name property should be prepended or appended with information from the Type or OtherTypeDescription properties. The method selected is described in the NameFormat property of this class.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_Name(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NAME.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_Name(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property Name by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_Name(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_ProtocolEndpoint fco = new CIM_ProtocolEndpoint(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAME.NAME);
        if (property != null) {
            property = setPropertyValue_Name(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NAME.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property Name
     * <br>
     * A string that identifies this ProtocolEndpoint with either a port or an interface on a device. To ensure uniqueness, the Name property should be prepended or appended with information from the Type or OtherTypeDescription properties. The method selected is described in the NameFormat property of this class.
     */

    private static CIMProperty setPropertyValue_Name(CIMProperty currentProperty, String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property NameFormat
     *     * <br>
     * NameFormat contains the naming heuristic that is selected to ensure that the value of the Name property is unique. For example, you might choose to prepend the name of the port or interface with the Type of ProtocolEndpoint (for example, IPv4) of this instance followed by an underscore.
     *     */

    public String get_NameFormat() {
        CIMProperty currentProperty = getProperty(PROPERTY_NAMEFORMAT.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_NAMEFORMAT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property NameFormat
     * <br>
     * NameFormat contains the naming heuristic that is selected to ensure that the value of the Name property is unique. For example, you might choose to prepend the name of the port or interface with the Type of ProtocolEndpoint (for example, IPv4) of this instance followed by an underscore.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_NameFormat(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_NAMEFORMAT.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_NameFormat(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_NAMEFORMAT.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property NameFormat by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_NameFormat(WBEMClient client, String namespace, String newValue)
            throws WbemsmtException {
        CIM_ProtocolEndpoint fco = new CIM_ProtocolEndpoint(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_NAMEFORMAT.NAME);
        if (property != null) {
            property = setPropertyValue_NameFormat(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_NAMEFORMAT.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property NameFormat
     * <br>
     * NameFormat contains the naming heuristic that is selected to ensure that the value of the Name property is unique. For example, you might choose to prepend the name of the port or interface with the Type of ProtocolEndpoint (for example, IPv4) of this instance followed by an underscore.
     */

    private static CIMProperty setPropertyValue_NameFormat(CIMProperty currentProperty,
            String newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OperationalStatus
     *     * <br>
     * 
     *     */

    public javax.cim.UnsignedInteger16[] get_OperationalStatus() {
        CIMProperty currentProperty = getProperty(PROPERTY_OPERATIONALSTATUS.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OPERATIONALSTATUS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16[]) currentProperty.getValue();

    }

    /**
     * Set the property OperationalStatus
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OperationalStatus(javax.cim.UnsignedInteger16[] newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OPERATIONALSTATUS.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_OperationalStatus(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OPERATIONALSTATUS.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OperationalStatus by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OperationalStatus(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16[] newValue) throws WbemsmtException {
        CIM_ProtocolEndpoint fco = new CIM_ProtocolEndpoint(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OPERATIONALSTATUS.NAME);
        if (property != null) {
            property = setPropertyValue_OperationalStatus(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OPERATIONALSTATUS.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OperationalStatus
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_OperationalStatus(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16[] newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property OtherTypeDescription
     *     * <br>
     * A string that describes the type of ProtocolEndpoint when the Type property of this class (or any of its subclasses) is set to 1 (Other). This property should be set to null when the Type property is any value other than 1.
     *     */

    public String get_OtherTypeDescription() {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERTYPEDESCRIPTION.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_OTHERTYPEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (String) currentProperty.getValue();

    }

    /**
     * Set the property OtherTypeDescription
     * <br>
     * A string that describes the type of ProtocolEndpoint when the Type property of this class (or any of its subclasses) is set to 1 (Other). This property should be set to null when the Type property is any value other than 1.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_OtherTypeDescription(String newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_OTHERTYPEDESCRIPTION.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_OtherTypeDescription(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERTYPEDESCRIPTION.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property OtherTypeDescription by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_OtherTypeDescription(WBEMClient client, String namespace,
            String newValue) throws WbemsmtException {
        CIM_ProtocolEndpoint fco = new CIM_ProtocolEndpoint(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_OTHERTYPEDESCRIPTION.NAME);
        if (property != null) {
            property = setPropertyValue_OtherTypeDescription(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_OTHERTYPEDESCRIPTION.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property OtherTypeDescription
     * <br>
     * A string that describes the type of ProtocolEndpoint when the Type property of this class (or any of its subclasses) is set to 1 (Other). This property should be set to null when the Type property is any value other than 1.
     */

    private static CIMProperty setPropertyValue_OtherTypeDescription(CIMProperty currentProperty,
            String newValue) {
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
     * ProtocolIFType is an enumeration that is synchronized with the IANA ifType MIB. The ifType MIB is maintained at the URL, http://www.iana.org/assignments/ianaiftype-mib. Also, additional values defined by the DMTF are included. The property is used to categorize and classify instances of the ProtocolEndpoint class. Note that if the ProtocolIFType is set to 1 (Other), then the type information should be provided in the OtherTypeDescription string property.
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
     * ProtocolIFType is an enumeration that is synchronized with the IANA ifType MIB. The ifType MIB is maintained at the URL, http://www.iana.org/assignments/ianaiftype-mib. Also, additional values defined by the DMTF are included. The property is used to categorize and classify instances of the ProtocolEndpoint class. Note that if the ProtocolIFType is set to 1 (Other), then the type information should be provided in the OtherTypeDescription string property.
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
        CIM_ProtocolEndpoint fco = new CIM_ProtocolEndpoint(client, namespace);
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
     * ProtocolIFType is an enumeration that is synchronized with the IANA ifType MIB. The ifType MIB is maintained at the URL, http://www.iana.org/assignments/ianaiftype-mib. Also, additional values defined by the DMTF are included. The property is used to categorize and classify instances of the ProtocolEndpoint class. Note that if the ProtocolIFType is set to 1 (Other), then the type information should be provided in the OtherTypeDescription string property.
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
     * Get the property ProtocolType
     *     * <br>
     * Note: This property is deprecated in lieu of the ProtocolIFType enumeration. This deprecation was done to have better alignment between the IF-MIB of the IETF and this CIM class. 
     * Deprecated description: ProtocolType is an enumeration that provides information to categorize and classify different instances of this class. For most instances, information in this enumeration and the definition of the subclass overlap. However, there are several cases where a specific subclass of ProtocolEndpoint is not required (for example, there is no Fibre Channel subclass of ProtocolEndpoint). Therefore, this property is needed to define the type of Endpoint.
     *     */

    public javax.cim.UnsignedInteger16 get_ProtocolType() {
        CIMProperty currentProperty = getProperty(PROPERTY_PROTOCOLTYPE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_PROTOCOLTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return null;
        }

        return (javax.cim.UnsignedInteger16) currentProperty.getValue();

    }

    /**
     * Set the property ProtocolType
     * <br>
     * Note: This property is deprecated in lieu of the ProtocolIFType enumeration. This deprecation was done to have better alignment between the IF-MIB of the IETF and this CIM class. 
     * Deprecated description: ProtocolType is an enumeration that provides information to categorize and classify different instances of this class. For most instances, information in this enumeration and the definition of the subclass overlap. However, there are several cases where a specific subclass of ProtocolEndpoint is not required (for example, there is no Fibre Channel subclass of ProtocolEndpoint). Therefore, this property is needed to define the type of Endpoint.
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_ProtocolType(javax.cim.UnsignedInteger16 newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_PROTOCOLTYPE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_ProtocolType(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_PROTOCOLTYPE.NAME + " was not found in instance "
                    + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property ProtocolType by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_ProtocolType(WBEMClient client, String namespace,
            javax.cim.UnsignedInteger16 newValue) throws WbemsmtException {
        CIM_ProtocolEndpoint fco = new CIM_ProtocolEndpoint(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_PROTOCOLTYPE.NAME);
        if (property != null) {
            property = setPropertyValue_ProtocolType(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_PROTOCOLTYPE.NAME + " was not found in instance "
                    + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property ProtocolType
     * <br>
     * Note: This property is deprecated in lieu of the ProtocolIFType enumeration. This deprecation was done to have better alignment between the IF-MIB of the IETF and this CIM class. 
     * Deprecated description: ProtocolType is an enumeration that provides information to categorize and classify different instances of this class. For most instances, information in this enumeration and the definition of the subclass overlap. However, there are several cases where a specific subclass of ProtocolEndpoint is not required (for example, there is no Fibre Channel subclass of ProtocolEndpoint). Therefore, this property is needed to define the type of Endpoint.
     */

    private static CIMProperty setPropertyValue_ProtocolType(CIMProperty currentProperty,
            javax.cim.UnsignedInteger16 newValue) {
        Object setThis = null;

        setThis = newValue;

        CIMProperty newProperty = new CIMProperty(currentProperty.getName(), currentProperty
                .getDataType(), setThis, currentProperty.isKey(), currentProperty.isPropagated(),
                currentProperty.getOriginClass());

        return newProperty;
    }

    /**
     * Get the property TimeOfLastStateChange
     *     * <br>
     * 
     *     */

    public javax.cim.CIMDateTime get_TimeOfLastStateChange() {
        CIMProperty currentProperty = getProperty(PROPERTY_TIMEOFLASTSTATECHANGE.NAME);

        if (currentProperty == null || currentProperty.getValue() == null) {
            logger.warning("Property " + PROPERTY_TIMEOFLASTSTATECHANGE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return null;
        }

        return (javax.cim.CIMDateTime) currentProperty.getValue();

    }

    /**
     * Set the property TimeOfLastStateChange
     * <br>
     * 
     *
     * @return true if the property was found, false if the property was not found and the value was not set
     */

    public boolean set_TimeOfLastStateChange(javax.cim.CIMDateTime newValue) {
        CIMProperty currentProperty = getProperty(PROPERTY_TIMEOFLASTSTATECHANGE.NAME);
        if (currentProperty != null) {
            setProperty(setPropertyValue_TimeOfLastStateChange(currentProperty, newValue));
            return true;
        }
        else {
            logger.warning("Property " + PROPERTY_TIMEOFLASTSTATECHANGE.NAME
                    + " was not found in instance " + getCimObjectPath());
            return false;
        }

    }

    /**
     * Get the property TimeOfLastStateChange by getting the class from the server<br>
     * and retrieving the property from it
     * After that the value is set to this property and the property is returned
     * @return null if the property cannot be found in the instance from the server
     * @throws WbemsmtException 
     */

    public static CIMProperty create_TimeOfLastStateChange(WBEMClient client, String namespace,
            javax.cim.CIMDateTime newValue) throws WbemsmtException {
        CIM_ProtocolEndpoint fco = new CIM_ProtocolEndpoint(client, namespace);
        CIMProperty property = fco.getProperty(PROPERTY_TIMEOFLASTSTATECHANGE.NAME);
        if (property != null) {
            property = setPropertyValue_TimeOfLastStateChange(property, newValue);
        }
        else {
            logger.warning("Property " + PROPERTY_TIMEOFLASTSTATECHANGE.NAME
                    + " was not found in instance " + fco.getCimObjectPath());
        }
        return property;
    }

    /**
     * Set the property TimeOfLastStateChange
     * <br>
     * 
     */

    private static CIMProperty setPropertyValue_TimeOfLastStateChange(CIMProperty currentProperty,
            javax.cim.CIMDateTime newValue) {
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
        return CIM_ProtocolEndpoint.CIM_CLASS_NAME;
    }

}