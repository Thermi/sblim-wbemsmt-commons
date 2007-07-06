/** 
 * CIM_ProtocolEndpoint.java
 *
 * © Copyright IBM Corp. 2005
 *
 * THIS FILE IS PROVIDED UNDER THE TERMS OF THE COMMON PUBLIC LICENSE
 * ("AGREEMENT"). ANY USE, REPRODUCTION OR DISTRIBUTION OF THIS FILE
 * CONSTITUTES RECIPIENTS ACCEPTANCE OF THE AGREEMENT.
 *
 * You can obtain a current copy of the Common Public License from
 * http://www.opensource.org/licenses/cpl1.0.php
 *
 * @author:	ECCG 0.9.7 generated 
 * 			(author should be changed, e.g. First and Last Name <xxx@cc.ibm.com>)
 *
 * Contributors:
 *
 *
 * Description:  A communication point from which data may be sent or received.
 * ProtocolEndpoints link system/computer interfaces to LogicalNetworks.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.Calendar;


/**
 *  A communication point from which data may be sent or received.
 * ProtocolEndpoints link system/computer interfaces to LogicalNetworks.
 */
public class CIM_ProtocolEndpoint extends CIM_ServiceAccessPoint  {
	
	public final static String CIM_CLASS_NAME = "CIM_ProtocolEndpoint"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	
	*/
	public final static String CIM_PROPERTY_DESCRIPTION = "Description"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_ENABLEDSTATE = "EnabledState"; //$NON-NLS-1$
	/**
	*	A string which identifies this ProtocolEndpoint with either a port or an interface on a device. To ensure uniqueness, the Name property should be prepended or appended with information from the Type or OtherTypeDescription properties. The method chosen is described in the NameFormat property of this class.
	*/
	public final static String CIM_PROPERTY_NAME = "Name"; //$NON-NLS-1$
	/**
	*	NameFormat contains the naming heuristic that is chosen to ensure that the value of the Name property is unique. For example, one might choose to prepend the name of the port or interface with the Type of ProtocolEndpoint that this instance is (e.g., IPv4) followed by an underscore.
	*/
	public final static String CIM_PROPERTY_NAMEFORMAT = "NameFormat"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_OPERATIONALSTATUS = "OperationalStatus"; //$NON-NLS-1$
	/**
	*	A string describing the type of ProtocolEndpoint when the Type property of this class (or any of its subclasses) is set to 1 (i.e., "Other"). This property should be set to NULL when the Type property is any value other than 1.
	*/
	public final static String CIM_PROPERTY_OTHERTYPEDESCRIPTION = "OtherTypeDescription"; //$NON-NLS-1$
	/**
	*	ProtocolIFType is an enumeration synchronized with the IANA ifType MIB, maintained at the URL, http: //www.iana.org/assignments/ianaiftype-mib. Also, // // // // additional values defined by the DMTF are included. The property is used to categorize and classify instances of the ProtocolEndpoint class. Note that if the ProtocolIFType is set to 1 ("Other"), then the type information should be provided in the OtherTypeDescription string property.
	*/
	public final static String CIM_PROPERTY_PROTOCOLIFTYPE = "ProtocolIFType"; //$NON-NLS-1$
	/**
	*	ProtocolType is an enumeration providing information to categorize and classify different instances of this class. For most instances, information in this enumeration and the subclass' definition overlap. However, there are several cases where a specific subclass of ProtocolEndpoint is not required (for example, there is no Fibre Channel subclass of ProtocolEndpoint). Hence, this property is needed to define the type of Endpoint. 

This property is deprecated in lieu of the ProtocolIFType enumeration. This is done to have better alignment between the IETF's IF-MIB and this CIM class.
	*/
	public final static String CIM_PROPERTY_PROTOCOLTYPE = "ProtocolType"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_TIMEOFLASTSTATECHANGE = "TimeOfLastStateChange"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_ENABLEDSTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAMEFORMAT);
		CIM_PropertyNameList.add(CIM_PROPERTY_OPERATIONALSTATUS);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERTYPEDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROTOCOLIFTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROTOCOLTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMEOFLASTSTATECHANGE);
				
		for (int i = 0; i < CIM_ServiceAccessPoint.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DESCRIPTION)||
				((String)CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ENABLEDSTATE)||
				((String)CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAME)||
				((String)CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAMEFORMAT)||
				((String)CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OPERATIONALSTATUS)||
				((String)CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERTYPEDESCRIPTION)||
				((String)CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROTOCOLIFTYPE)||
				((String)CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROTOCOLTYPE)||
				((String)CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TIMEOFLASTSTATECHANGE)){
				continue;
			}
			
			CIM_ProtocolEndpoint.CIM_PropertyNameList.add(CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ENABLEDSTATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAMEFORMAT, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OPERATIONALSTATUS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERTYPEDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROTOCOLIFTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROTOCOLTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMEOFLASTSTATECHANGE, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
				
		for (int i = 0; i < CIM_ServiceAccessPoint.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ServiceAccessPoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DESCRIPTION)||
				((CIMProperty)CIM_ServiceAccessPoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ENABLEDSTATE)||
				((CIMProperty)CIM_ServiceAccessPoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAME)||
				((CIMProperty)CIM_ServiceAccessPoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAMEFORMAT)||
				((CIMProperty)CIM_ServiceAccessPoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OPERATIONALSTATUS)||
				((CIMProperty)CIM_ServiceAccessPoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERTYPEDESCRIPTION)||
				((CIMProperty)CIM_ServiceAccessPoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROTOCOLIFTYPE)||
				((CIMProperty)CIM_ServiceAccessPoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROTOCOLTYPE)||
				((CIMProperty)CIM_ServiceAccessPoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TIMEOFLASTSTATECHANGE)){
				continue;
			}
			
			CIM_ProtocolEndpoint.CIM_PropertyList.add(CIM_ServiceAccessPoint.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim_2_14");
				
		String[] parentClassPackageList = CIM_ServiceAccessPoint.getPackages();
		
		for (int i = 0; i < parentClassPackageList.length; i++) {
			Java_Package_List.add(parentClassPackageList[i]);
		}
	};
			
	public final static String[] CIM_VALUEMAP_PROTOCOLIFTYPE = {"Unknown","Other","Regular 1822","HDH 1822","DDN X.25","RFC877 X.25","Ethernet CSMA/CD","ISO 802.3 CSMA/CD","ISO 802.4 Token Bus","ISO 802.5 Token Ring","ISO 802.6 MAN","StarLAN","Proteon 10Mbit","Proteon 80Mbit","HyperChannel","FDDI","LAP-B","SDLC","DS1","E1","Basic ISDN","Primary ISDN","Proprietary Point-to-Point Serial","PPP","Software Loopback","EON","Ethernet 3Mbit","NSIP","SLIP","Ultra","DS3","SIP","Frame Relay","RS-232","Parallel","ARCNet","ARCNet Plus","ATM","MIO X.25","SONET","X.25 PLE","ISO 802.211c","LocalTalk","SMDS DXI","Frame Relay Service","V.35","HSSI","HIPPI","Modem","AAL5","SONET Path","SONET VT","SMDS ICIP","Proprietary Virtual/Internal","Proprietary Multiplexor","IEEE 802.12","Fibre Channel","HIPPI Interface","Frame Relay Interconnect","ATM Emulated LAN for 802.3","ATM Emulated LAN for 802.5","ATM Emulated Circuit","Fast Ethernet (100BaseT)","ISDN","V.11","V.36","G703 at 64K","G703 at 2Mb","QLLC","Fast Ethernet 100BaseFX","Channel","IEEE 802.11","IBM 260/370 OEMI Channel","ESCON","Data Link Switching","ISDN S/T Interface","ISDN U Interface","LAP-D","IP Switch","Remote Source Route Bridging","ATM Logical","DS0","DS0 Bundle","BSC","Async","Combat Net Radio","ISO 802.5r DTR","Ext Pos Loc Report System","AppleTalk Remote Access Protocol","Proprietary Connectionless","ITU X.29 Host PAD","ITU X.3 Terminal PAD","Frame Relay MPI","ITU X.213","ADSL","RADSL","SDSL","VDSL","ISO 802.5 CRFP","Myrinet","Voice Receive and Transmit","Voice Foreign Exchange Office","Voice Foreign Exchange Service","Voice Encapsulation","Voice over IP","ATM DXI","ATM FUNI","ATM IMA","PPP Multilink Bundle","IP over CDLC","IP over CLAW","Stack to Stack","Virtual IP Address","MPC","IP over ATM","ISO 802.5j Fibre Token Ring","TDLC","Gigabit Ethernet","HDLC","LAP-F","V.37","X.25 MLP","X.25 Hunt Group","Transp HDLC","Interleave Channel","FAST Channel","IP (for APPN HPR in IP Networks)","CATV MAC Layer","CATV Downstream","CATV Upstream","Avalon 12MPP Switch","Tunnel","Coffee","Circuit Emulation Service","ATM SubInterface","Layer 2 VLAN using 802.1Q","Layer 3 VLAN using IP","Layer 3 VLAN using IPX","Digital Power Line","Multimedia Mail over IP","DTM","DCN","IP Forwarding","MSDSL","IEEE 1394","IF-GSN/HIPPI-6400","DVB-RCC MAC Layer","DVB-RCC Downstream","DVB-RCC Upstream","ATM Virtual","MPLS Tunnel","SRP","Voice over ATM","Voice over Frame Relay","ISDL","Composite Link","SS7 Signaling Link","Proprietary P2P Wireless","Frame Forward","RFC1483 Multiprotocol over ATM","USB","IEEE 802.3ad Link Aggregate","BGP Policy Accounting","FRF .16 Multilink FR","H.323 Gatekeeper","H.323 Proxy","MPLS","Multi-Frequency Signaling Link","HDSL-2","S-HDSL","DS1 Facility Data Link","Packet over SONET/SDH","DVB-ASI Input","DVB-ASI Output","Power Line","Non Facility Associated Signaling","TR008","GR303 RDT","GR303 IDT","ISUP","Proprietary Wireless MAC Layer","Proprietary Wireless Downstream","Proprietary Wireless Upstream","HIPERLAN Type 2","Proprietary Broadband Wireless Access Point to Mulipoint","SONET Overhead Channel","Digital Wrapper Overhead Channel","ATM Adaptation Layer 2","Radio MAC","ATM Radio","Inter Machine Trunk","MVL DSL","Long Read DSL","Frame Relay DLCI Endpoint","ATM VCI Endpoint","Optical Channel","Optical Transport","Proprietary ATM","Voice over Cable","Infiniband","TE Link","Q.2931","Virtual Trunk Group","SIP Trunk Group","SIP Signaling","CATV Upstream Channel","Econet","FSAN 155Mb PON","FSAN 622Mb PON","Transparent Bridge","Line Group","Voice E&M Feature Group","Voice FGD EANA","Voice DID","MPEG Transport","6To4","GTP","Paradyne EtherLoop 1","Paradyne EtherLoop 2","Optical Channel Group","HomePNA","GFP","ciscoISLvlan","actelisMetaLOOP","Fcip","IANA Reserved","IPv4","IPv6","IPv4/v6","IPX","DECnet","SNA","CONP","CLNP","VINES","XNS","ISDN B Channel Endpoint","ISDN D Channel Endpoint","BGP","OSPF","UDP","TCP","802.11a","802.11b","802.11g","802.11h","DMTF Reserved","Vendor Reserved"};
	public final static String[] CIM_VALUEMAP_PROTOCOLTYPE = {"Unknown","Other","IPv4","IPv6","IPX","AppleTalk","DECnet","SNA","CONP","CLNP","VINES","XNS","ATM","Frame Relay","Ethernet","TokenRing","FDDI","Infiniband","Fibre Channel","ISDN BRI Endpoint","ISDN B Channel Endpoint","ISDN D Channel Endpoint","IPv4/v6","BGP","OSPF","MPLS","UDP","TCP"};
	
	
	public final static String PROTOCOLIFTYPE_UNKNOWN = "0";
	public final static String PROTOCOLIFTYPE_OTHER = "1";
	public final static String PROTOCOLIFTYPE_REGULAR1822 = "2";
	public final static String PROTOCOLIFTYPE_HDH1822 = "3";
	public final static String PROTOCOLIFTYPE_DDNX_25 = "4";
	public final static String PROTOCOLIFTYPE_RFC877X_25 = "5";
	public final static String PROTOCOLIFTYPE_ETHERNETCSMA_CD = "6";
	public final static String PROTOCOLIFTYPE_ISO802_3CSMA_CD = "7";
	public final static String PROTOCOLIFTYPE_ISO802_4TOKENBUS = "8";
	public final static String PROTOCOLIFTYPE_ISO802_5TOKENRING = "9";
	public final static String PROTOCOLIFTYPE_ISO802_6MAN = "10";
	public final static String PROTOCOLIFTYPE_STARLAN = "11";
	public final static String PROTOCOLIFTYPE_PROTEON10MBIT = "12";
	public final static String PROTOCOLIFTYPE_PROTEON80MBIT = "13";
	public final static String PROTOCOLIFTYPE_HYPERCHANNEL = "14";
	public final static String PROTOCOLIFTYPE_FDDI = "15";
	public final static String PROTOCOLIFTYPE_LAP_B = "16";
	public final static String PROTOCOLIFTYPE_SDLC = "17";
	public final static String PROTOCOLIFTYPE_DS1 = "18";
	public final static String PROTOCOLIFTYPE_E1 = "19";
	public final static String PROTOCOLIFTYPE_BASICISDN = "20";
	public final static String PROTOCOLIFTYPE_PRIMARYISDN = "21";
	public final static String PROTOCOLIFTYPE_PROPRIETARYPOINT_TO_POINTSERIAL = "22";
	public final static String PROTOCOLIFTYPE_PPP = "23";
	public final static String PROTOCOLIFTYPE_SOFTWARELOOPBACK = "24";
	public final static String PROTOCOLIFTYPE_EON = "25";
	public final static String PROTOCOLIFTYPE_ETHERNET3MBIT = "26";
	public final static String PROTOCOLIFTYPE_NSIP = "27";
	public final static String PROTOCOLIFTYPE_SLIP = "28";
	public final static String PROTOCOLIFTYPE_ULTRA = "29";
	public final static String PROTOCOLIFTYPE_DS3 = "30";
	public final static String PROTOCOLIFTYPE_SIP = "31";
	public final static String PROTOCOLIFTYPE_FRAMERELAY = "32";
	public final static String PROTOCOLIFTYPE_RS_232 = "33";
	public final static String PROTOCOLIFTYPE_PARALLEL = "34";
	public final static String PROTOCOLIFTYPE_ARCNET = "35";
	public final static String PROTOCOLIFTYPE_ARCNETPLUS = "36";
	public final static String PROTOCOLIFTYPE_ATM = "37";
	public final static String PROTOCOLIFTYPE_MIOX_25 = "38";
	public final static String PROTOCOLIFTYPE_SONET = "39";
	public final static String PROTOCOLIFTYPE_X_25PLE = "40";
	public final static String PROTOCOLIFTYPE_ISO802_211C = "41";
	public final static String PROTOCOLIFTYPE_LOCALTALK = "42";
	public final static String PROTOCOLIFTYPE_SMDSDXI = "43";
	public final static String PROTOCOLIFTYPE_FRAMERELAYSERVICE = "44";
	public final static String PROTOCOLIFTYPE_V_35 = "45";
	public final static String PROTOCOLIFTYPE_HSSI = "46";
	public final static String PROTOCOLIFTYPE_HIPPI = "47";
	public final static String PROTOCOLIFTYPE_MODEM = "48";
	public final static String PROTOCOLIFTYPE_AAL5 = "49";
	public final static String PROTOCOLIFTYPE_SONETPATH = "50";
	public final static String PROTOCOLIFTYPE_SONETVT = "51";
	public final static String PROTOCOLIFTYPE_SMDSICIP = "52";
	public final static String PROTOCOLIFTYPE_PROPRIETARYVIRTUAL_INTERNAL = "53";
	public final static String PROTOCOLIFTYPE_PROPRIETARYMULTIPLEXOR = "54";
	public final static String PROTOCOLIFTYPE_IEEE802_12 = "55";
	public final static String PROTOCOLIFTYPE_FIBRECHANNEL = "56";
	public final static String PROTOCOLIFTYPE_HIPPIINTERFACE = "57";
	public final static String PROTOCOLIFTYPE_FRAMERELAYINTERCONNECT = "58";
	public final static String PROTOCOLIFTYPE_ATMEMULATEDLANFOR802_3 = "59";
	public final static String PROTOCOLIFTYPE_ATMEMULATEDLANFOR802_5 = "60";
	public final static String PROTOCOLIFTYPE_ATMEMULATEDCIRCUIT = "61";
	public final static String PROTOCOLIFTYPE_FASTETHERNET100BASET = "62";
	public final static String PROTOCOLIFTYPE_ISDN = "63";
	public final static String PROTOCOLIFTYPE_V_11 = "64";
	public final static String PROTOCOLIFTYPE_V_36 = "65";
	public final static String PROTOCOLIFTYPE_G703AT64K = "66";
	public final static String PROTOCOLIFTYPE_G703AT2MB = "67";
	public final static String PROTOCOLIFTYPE_QLLC = "68";
	public final static String PROTOCOLIFTYPE_FASTETHERNET100BASEFX = "69";
	public final static String PROTOCOLIFTYPE_CHANNEL = "70";
	public final static String PROTOCOLIFTYPE_IEEE802_11 = "71";
	public final static String PROTOCOLIFTYPE_IBM260_370OEMICHANNEL = "72";
	public final static String PROTOCOLIFTYPE_ESCON = "73";
	public final static String PROTOCOLIFTYPE_DATALINKSWITCHING = "74";
	public final static String PROTOCOLIFTYPE_ISDNS_TINTERFACE = "75";
	public final static String PROTOCOLIFTYPE_ISDNUINTERFACE = "76";
	public final static String PROTOCOLIFTYPE_LAP_D = "77";
	public final static String PROTOCOLIFTYPE_IPSWITCH = "78";
	public final static String PROTOCOLIFTYPE_REMOTESOURCEROUTEBRIDGING = "79";
	public final static String PROTOCOLIFTYPE_ATMLOGICAL = "80";
	public final static String PROTOCOLIFTYPE_DS0 = "81";
	public final static String PROTOCOLIFTYPE_DS0BUNDLE = "82";
	public final static String PROTOCOLIFTYPE_BSC = "83";
	public final static String PROTOCOLIFTYPE_ASYNC = "84";
	public final static String PROTOCOLIFTYPE_COMBATNETRADIO = "85";
	public final static String PROTOCOLIFTYPE_ISO802_5RDTR = "86";
	public final static String PROTOCOLIFTYPE_EXTPOSLOCREPORTSYSTEM = "87";
	public final static String PROTOCOLIFTYPE_APPLETALKREMOTEACCESSPROTOCOL = "88";
	public final static String PROTOCOLIFTYPE_PROPRIETARYCONNECTIONLESS = "89";
	public final static String PROTOCOLIFTYPE_ITUX_29HOSTPAD = "90";
	public final static String PROTOCOLIFTYPE_ITUX_3TERMINALPAD = "91";
	public final static String PROTOCOLIFTYPE_FRAMERELAYMPI = "92";
	public final static String PROTOCOLIFTYPE_ITUX_213 = "93";
	public final static String PROTOCOLIFTYPE_ADSL = "94";
	public final static String PROTOCOLIFTYPE_RADSL = "95";
	public final static String PROTOCOLIFTYPE_SDSL = "96";
	public final static String PROTOCOLIFTYPE_VDSL = "97";
	public final static String PROTOCOLIFTYPE_ISO802_5CRFP = "98";
	public final static String PROTOCOLIFTYPE_MYRINET = "99";
	public final static String PROTOCOLIFTYPE_VOICERECEIVEANDTRANSMIT = "100";
	public final static String PROTOCOLIFTYPE_VOICEFOREIGNEXCHANGEOFFICE = "101";
	public final static String PROTOCOLIFTYPE_VOICEFOREIGNEXCHANGESERVICE = "102";
	public final static String PROTOCOLIFTYPE_VOICEENCAPSULATION = "103";
	public final static String PROTOCOLIFTYPE_VOICEOVERIP = "104";
	public final static String PROTOCOLIFTYPE_ATMDXI = "105";
	public final static String PROTOCOLIFTYPE_ATMFUNI = "106";
	public final static String PROTOCOLIFTYPE_ATMIMA = "107";
	public final static String PROTOCOLIFTYPE_PPPMULTILINKBUNDLE = "108";
	public final static String PROTOCOLIFTYPE_IPOVERCDLC = "109";
	public final static String PROTOCOLIFTYPE_IPOVERCLAW = "110";
	public final static String PROTOCOLIFTYPE_STACKTOSTACK = "111";
	public final static String PROTOCOLIFTYPE_VIRTUALIPADDRESS = "112";
	public final static String PROTOCOLIFTYPE_MPC = "113";
	public final static String PROTOCOLIFTYPE_IPOVERATM = "114";
	public final static String PROTOCOLIFTYPE_ISO802_5JFIBRETOKENRING = "115";
	public final static String PROTOCOLIFTYPE_TDLC = "116";
	public final static String PROTOCOLIFTYPE_GIGABITETHERNET = "117";
	public final static String PROTOCOLIFTYPE_HDLC = "118";
	public final static String PROTOCOLIFTYPE_LAP_F = "119";
	public final static String PROTOCOLIFTYPE_V_37 = "120";
	public final static String PROTOCOLIFTYPE_X_25MLP = "121";
	public final static String PROTOCOLIFTYPE_X_25HUNTGROUP = "122";
	public final static String PROTOCOLIFTYPE_TRANSPHDLC = "123";
	public final static String PROTOCOLIFTYPE_INTERLEAVECHANNEL = "124";
	public final static String PROTOCOLIFTYPE_FASTCHANNEL = "125";
	public final static String PROTOCOLIFTYPE_IPFORAPPNHPRINIPNETWORKS = "126";
	public final static String PROTOCOLIFTYPE_CATVMACLAYER = "127";
	public final static String PROTOCOLIFTYPE_CATVDOWNSTREAM = "128";
	public final static String PROTOCOLIFTYPE_CATVUPSTREAM = "129";
	public final static String PROTOCOLIFTYPE_AVALON12MPPSWITCH = "130";
	public final static String PROTOCOLIFTYPE_TUNNEL = "131";
	public final static String PROTOCOLIFTYPE_COFFEE = "132";
	public final static String PROTOCOLIFTYPE_CIRCUITEMULATIONSERVICE = "133";
	public final static String PROTOCOLIFTYPE_ATMSUBINTERFACE = "134";
	public final static String PROTOCOLIFTYPE_LAYER2VLANUSING802_1Q = "135";
	public final static String PROTOCOLIFTYPE_LAYER3VLANUSINGIP = "136";
	public final static String PROTOCOLIFTYPE_LAYER3VLANUSINGIPX = "137";
	public final static String PROTOCOLIFTYPE_DIGITALPOWERLINE = "138";
	public final static String PROTOCOLIFTYPE_MULTIMEDIAMAILOVERIP = "139";
	public final static String PROTOCOLIFTYPE_DTM = "140";
	public final static String PROTOCOLIFTYPE_DCN = "141";
	public final static String PROTOCOLIFTYPE_IPFORWARDING = "142";
	public final static String PROTOCOLIFTYPE_MSDSL = "143";
	public final static String PROTOCOLIFTYPE_IEEE1394 = "144";
	public final static String PROTOCOLIFTYPE_IF_GSN_HIPPI_6400 = "145";
	public final static String PROTOCOLIFTYPE_DVB_RCCMACLAYER = "146";
	public final static String PROTOCOLIFTYPE_DVB_RCCDOWNSTREAM = "147";
	public final static String PROTOCOLIFTYPE_DVB_RCCUPSTREAM = "148";
	public final static String PROTOCOLIFTYPE_ATMVIRTUAL = "149";
	public final static String PROTOCOLIFTYPE_MPLSTUNNEL = "150";
	public final static String PROTOCOLIFTYPE_SRP = "151";
	public final static String PROTOCOLIFTYPE_VOICEOVERATM = "152";
	public final static String PROTOCOLIFTYPE_VOICEOVERFRAMERELAY = "153";
	public final static String PROTOCOLIFTYPE_ISDL = "154";
	public final static String PROTOCOLIFTYPE_COMPOSITELINK = "155";
	public final static String PROTOCOLIFTYPE_SS7SIGNALINGLINK = "156";
	public final static String PROTOCOLIFTYPE_PROPRIETARYP2PWIRELESS = "157";
	public final static String PROTOCOLIFTYPE_FRAMEFORWARD = "158";
	public final static String PROTOCOLIFTYPE_RFC1483MULTIPROTOCOLOVERATM = "159";
	public final static String PROTOCOLIFTYPE_USB = "160";
	public final static String PROTOCOLIFTYPE_IEEE802_3ADLINKAGGREGATE = "161";
	public final static String PROTOCOLIFTYPE_BGPPOLICYACCOUNTING = "162";
	public final static String PROTOCOLIFTYPE_FRF_16MULTILINKFR = "163";
	public final static String PROTOCOLIFTYPE_H_323GATEKEEPER = "164";
	public final static String PROTOCOLIFTYPE_H_323PROXY = "165";
	public final static String PROTOCOLIFTYPE_MPLS = "166";
	public final static String PROTOCOLIFTYPE_MULTI_FREQUENCYSIGNALINGLINK = "167";
	public final static String PROTOCOLIFTYPE_HDSL_2 = "168";
	public final static String PROTOCOLIFTYPE_S_HDSL = "169";
	public final static String PROTOCOLIFTYPE_DS1FACILITYDATALINK = "170";
	public final static String PROTOCOLIFTYPE_PACKETOVERSONET_SDH = "171";
	public final static String PROTOCOLIFTYPE_DVB_ASIINPUT = "172";
	public final static String PROTOCOLIFTYPE_DVB_ASIOUTPUT = "173";
	public final static String PROTOCOLIFTYPE_POWERLINE = "174";
	public final static String PROTOCOLIFTYPE_NONFACILITYASSOCIATEDSIGNALING = "175";
	public final static String PROTOCOLIFTYPE_TR008 = "176";
	public final static String PROTOCOLIFTYPE_GR303RDT = "177";
	public final static String PROTOCOLIFTYPE_GR303IDT = "178";
	public final static String PROTOCOLIFTYPE_ISUP = "179";
	public final static String PROTOCOLIFTYPE_PROPRIETARYWIRELESSMACLAYER = "180";
	public final static String PROTOCOLIFTYPE_PROPRIETARYWIRELESSDOWNSTREAM = "181";
	public final static String PROTOCOLIFTYPE_PROPRIETARYWIRELESSUPSTREAM = "182";
	public final static String PROTOCOLIFTYPE_HIPERLANTYPE2 = "183";
	public final static String PROTOCOLIFTYPE_PROPRIETARYBROADBANDWIRELESSACCESSPOINTTOMULIPOINT = "184";
	public final static String PROTOCOLIFTYPE_SONETOVERHEADCHANNEL = "185";
	public final static String PROTOCOLIFTYPE_DIGITALWRAPPEROVERHEADCHANNEL = "186";
	public final static String PROTOCOLIFTYPE_ATMADAPTATIONLAYER2 = "187";
	public final static String PROTOCOLIFTYPE_RADIOMAC = "188";
	public final static String PROTOCOLIFTYPE_ATMRADIO = "189";
	public final static String PROTOCOLIFTYPE_INTERMACHINETRUNK = "190";
	public final static String PROTOCOLIFTYPE_MVLDSL = "191";
	public final static String PROTOCOLIFTYPE_LONGREADDSL = "192";
	public final static String PROTOCOLIFTYPE_FRAMERELAYDLCIENDPOINT = "193";
	public final static String PROTOCOLIFTYPE_ATMVCIENDPOINT = "194";
	public final static String PROTOCOLIFTYPE_OPTICALCHANNEL = "195";
	public final static String PROTOCOLIFTYPE_OPTICALTRANSPORT = "196";
	public final static String PROTOCOLIFTYPE_PROPRIETARYATM = "197";
	public final static String PROTOCOLIFTYPE_VOICEOVERCABLE = "198";
	public final static String PROTOCOLIFTYPE_INFINIBAND = "199";
	public final static String PROTOCOLIFTYPE_TELINK = "200";
	public final static String PROTOCOLIFTYPE_Q_2931 = "201";
	public final static String PROTOCOLIFTYPE_VIRTUALTRUNKGROUP = "202";
	public final static String PROTOCOLIFTYPE_SIPTRUNKGROUP = "203";
	public final static String PROTOCOLIFTYPE_SIPSIGNALING = "204";
	public final static String PROTOCOLIFTYPE_CATVUPSTREAMCHANNEL = "205";
	public final static String PROTOCOLIFTYPE_ECONET = "206";
	public final static String PROTOCOLIFTYPE_FSAN155MBPON = "207";
	public final static String PROTOCOLIFTYPE_FSAN622MBPON = "208";
	public final static String PROTOCOLIFTYPE_TRANSPARENTBRIDGE = "209";
	public final static String PROTOCOLIFTYPE_LINEGROUP = "210";
	public final static String PROTOCOLIFTYPE_VOICEE_AND_MFEATUREGROUP = "211";
	public final static String PROTOCOLIFTYPE_VOICEFGDEANA = "212";
	public final static String PROTOCOLIFTYPE_VOICEDID = "213";
	public final static String PROTOCOLIFTYPE_MPEGTRANSPORT = "214";
	public final static String PROTOCOLIFTYPE_6TO4 = "215";
	public final static String PROTOCOLIFTYPE_GTP = "216";
	public final static String PROTOCOLIFTYPE_PARADYNEETHERLOOP1 = "217";
	public final static String PROTOCOLIFTYPE_PARADYNEETHERLOOP2 = "218";
	public final static String PROTOCOLIFTYPE_OPTICALCHANNELGROUP = "219";
	public final static String PROTOCOLIFTYPE_HOMEPNA = "220";
	public final static String PROTOCOLIFTYPE_GFP = "221";
	public final static String PROTOCOLIFTYPE_CISCOISLVLAN = "222";
	public final static String PROTOCOLIFTYPE_ACTELISMETALOOP = "223";
	public final static String PROTOCOLIFTYPE_FCIP = "224";
	public final static String PROTOCOLIFTYPE_IANARESERVED = "..4095";
	public final static String PROTOCOLIFTYPE_IPV4 = "4096";
	public final static String PROTOCOLIFTYPE_IPV6 = "4097";
	public final static String PROTOCOLIFTYPE_IPV4_V6 = "4098";
	public final static String PROTOCOLIFTYPE_IPX = "4099";
	public final static String PROTOCOLIFTYPE_DECNET = "4100";
	public final static String PROTOCOLIFTYPE_SNA = "4101";
	public final static String PROTOCOLIFTYPE_CONP = "4102";
	public final static String PROTOCOLIFTYPE_CLNP = "4103";
	public final static String PROTOCOLIFTYPE_VINES = "4104";
	public final static String PROTOCOLIFTYPE_XNS = "4105";
	public final static String PROTOCOLIFTYPE_ISDNBCHANNELENDPOINT = "4106";
	public final static String PROTOCOLIFTYPE_ISDNDCHANNELENDPOINT = "4107";
	public final static String PROTOCOLIFTYPE_BGP = "4108";
	public final static String PROTOCOLIFTYPE_OSPF = "4109";
	public final static String PROTOCOLIFTYPE_UDP = "4110";
	public final static String PROTOCOLIFTYPE_TCP = "4111";
	public final static String PROTOCOLIFTYPE_802_11A = "4112";
	public final static String PROTOCOLIFTYPE_802_11B = "4113";
	public final static String PROTOCOLIFTYPE_802_11G = "4114";
	public final static String PROTOCOLIFTYPE_802_11H = "4115";
	public final static String PROTOCOLIFTYPE_DMTFRESERVED = "..32767";
	public final static String PROTOCOLIFTYPE_VENDORRESERVED = "32768..";
	
	public final static int PROTOCOLTYPE_UNKNOWN = 0;
	public final static int PROTOCOLTYPE_OTHER = 1;
	public final static int PROTOCOLTYPE_IPV4 = 2;
	public final static int PROTOCOLTYPE_IPV6 = 3;
	public final static int PROTOCOLTYPE_IPX = 4;
	public final static int PROTOCOLTYPE_APPLETALK = 5;
	public final static int PROTOCOLTYPE_DECNET = 6;
	public final static int PROTOCOLTYPE_SNA = 7;
	public final static int PROTOCOLTYPE_CONP = 8;
	public final static int PROTOCOLTYPE_CLNP = 9;
	public final static int PROTOCOLTYPE_VINES = 10;
	public final static int PROTOCOLTYPE_XNS = 11;
	public final static int PROTOCOLTYPE_ATM = 12;
	public final static int PROTOCOLTYPE_FRAMERELAY = 13;
	public final static int PROTOCOLTYPE_ETHERNET = 14;
	public final static int PROTOCOLTYPE_TOKENRING = 15;
	public final static int PROTOCOLTYPE_FDDI = 16;
	public final static int PROTOCOLTYPE_INFINIBAND = 17;
	public final static int PROTOCOLTYPE_FIBRECHANNEL = 18;
	public final static int PROTOCOLTYPE_ISDNBRIENDPOINT = 19;
	public final static int PROTOCOLTYPE_ISDNBCHANNELENDPOINT = 20;
	public final static int PROTOCOLTYPE_ISDNDCHANNELENDPOINT = 21;
	public final static int PROTOCOLTYPE_IPV4_V6 = 22;
	public final static int PROTOCOLTYPE_BGP = 23;
	public final static int PROTOCOLTYPE_OSPF = 24;
	public final static int PROTOCOLTYPE_MPLS = 25;
	public final static int PROTOCOLTYPE_UDP = 26;
	public final static int PROTOCOLTYPE_TCP = 27;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ProtocolEndpoint() {

		this.cimInstance	= new CIMInstance();
		
		for (int i = 0; i < CIM_PropertyList.size(); i++) {
			this.cimInstance.addProperty((CIMProperty)((CIMProperty)CIM_PropertyList.get(i)).clone());
		}
		
		this.cimObjectPath 	= new CIMObjectPath(CIM_CLASS_NAME);
		this.cimInstance.setObjectPath(this.cimObjectPath);

		this.original_cimInstance	= (CIMInstance)this.cimInstance.clone();

		setValidCimInstance(false);
	}


	/**
	*	Class constructor
	*/	
	public CIM_ProtocolEndpoint(Vector keyProperties){ 
		this();
		
		if (keyProperties == null) {
			throw new InvalidParameterException("The keyProperties parameter does not contain a valid reference.");
		
		}
		
		Iterator iter = keyProperties.iterator();
		while (iter.hasNext()) {
			Object property = iter.next();
			
			if (property instanceof CIMProperty) {
				CIMProperty keyProperty = (CIMProperty)property;
				this.cimObjectPath.addKey(keyProperty);
				
				if (this.cimInstance.getProperty(keyProperty.getName()) != null) {
					this.cimInstance.removeProperty(keyProperty.getName());
				}
				this.cimInstance.addProperty(keyProperty);
				
			} else {
				throw new InvalidParameterException("The keyProperties parameter should only contain objects of class CIMProperty.");
				
			}
		}
		
		setValidCimInstance(false);
	}

	
	/**
	*	Class constructor
	*/	
	public CIM_ProtocolEndpoint(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
		if (cimInstance == null) {
			throw new InvalidParameterException("The cimInstance parameter does not contain a valid reference.");
		
		} else if (cimObjectPath == null){
			throw new InvalidParameterException("The cimObjectPath parameter does not contain a valid reference.");		
		
		} else if (!cimObjectPath.getObjectName().equals(cimInstance.getClassName())) {
			throw new InvalidParameterException("The class name of the instance and the ObjectPath are not the same.");
		}
		
		setCimInstance(cimInstance);
		this.original_cimInstance = (CIMInstance)cimInstance.clone();
		this.cimObjectPath        = cimObjectPath;
		setValidCimInstance(true);
	}

	
	/**
	*	The method returns the display name of the class
	*/	
	public String getClassDisplayName(){
		return CIM_CLASS_DISPLAYNAME;
	}
	
	public static void addPackage(String packagename) {
        if (packagename != null) {
            if (!packagename.endsWith(".")) {
                packagename = packagename + ".";
            }
            CIM_ProtocolEndpoint.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_ProtocolEndpoint.Java_Package_List.toArray(new String[CIM_ProtocolEndpoint.Java_Package_List.size()]);
    }
	
	//**********************************************************************
	// Instance methods
	//**********************************************************************

	/**
	*	no description
	*/	
	public boolean isDataValid(Vector invalidProperties) {
		boolean result = true;
		
		if (invalidProperties == null) {
			invalidProperties = new Vector();
		} else {
			invalidProperties.removeAllElements();
		}
		
		return result;
	}
	
	/**
	 * @return Returns the validCimInstance.
	 */
	public boolean isValidCimInstance() {
		return this.validCimInstance;
	}
	
	/**
	 * @param validCimInstance The validCimInstance to set.
	 */
	private void setValidCimInstance(boolean isValidCimInstance) {

		this.validCimInstance = isValidCimInstance;
	}
	
	
	/**
	*	The method returns this CIM instance
	*/
	public CIMInstance getCimInstance() {
		
		return this.cimInstance;
	}
	
	
	/**
	*	The method sets this CIM instance
	*/
	public void setCimInstance(CIMInstance cimInstance) {
		
		this.cimInstance = cimInstance;
	}
	
		
	/**
	*	The method returns this CIM object path
	*/
	public CIMObjectPath getCimObjectPath() {
		return this.cimObjectPath;
	}
	
	
	/**
	*	The method checks if the cimInstance has been modified
	*/
	public boolean isModified() {
	    
	    if (!this.original_cimInstance.equals(this.cimInstance)) 
	        return true;
	    
	    return false;
	}
	
	
	/**
	*	The method resets the values of the cimInstance
	*/	
	public void resetValues() {
	    this.cimInstance = (CIMInstance)this.original_cimInstance.clone();
	}
	
	
	/**
	*	The method checks if the cimInstance equals an other cimInstance
	*/	
	public boolean equals(Object object) {
	    
	    if (!(object instanceof CIM_ProtocolEndpoint)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ProtocolEndpoint)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ProtocolEndpoint)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ProtocolEndpoint)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ProtocolEndpoint)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ProtocolEndpoint)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ProtocolEndpoint)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ProtocolEndpoint)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ProtocolEndpoint)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ProtocolEndpoint)object).cimObjectPath)) {
	        return false;
	        
	    } 
	    
	    return true;
	}
	
	/**
	*	The method return this method as a string
	*/	
	public String toString() {
		return this.cimInstance.toString();
	}

	//*****************************************************
	// Associators methods
	//*****************************************************
	
	
	
	//*****************************************************
	// Attribute methods
	//*****************************************************
	
	// Attribute Description
	
	public String get_Description() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolEndpoint.CIM_PROPERTY_DESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_DESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_DESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Description(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolEndpoint.CIM_PROPERTY_DESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_DESCRIPTION + " could not be found");
    		
		} else if (!CIM_ProtocolEndpointHelper.isValid_Description(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtocolEndpoint.CIM_PROPERTY_DESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_DESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EnabledState
	
	public UnsignedInt16 get_EnabledState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolEndpoint.CIM_PROPERTY_ENABLEDSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_ENABLEDSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_ENABLEDSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EnabledState(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolEndpoint.CIM_PROPERTY_ENABLEDSTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_ENABLEDSTATE + " could not be found");
    		
		} else if (!CIM_ProtocolEndpointHelper.isValid_EnabledState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtocolEndpoint.CIM_PROPERTY_ENABLEDSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_ENABLEDSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Name
	
	public String get_Name() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolEndpoint.CIM_PROPERTY_NAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Name(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolEndpoint.CIM_PROPERTY_NAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (!CIM_ProtocolEndpointHelper.isValid_Name(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtocolEndpoint.CIM_PROPERTY_NAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NameFormat
	
	public String get_NameFormat() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolEndpoint.CIM_PROPERTY_NAMEFORMAT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_NAMEFORMAT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_NAMEFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NameFormat(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolEndpoint.CIM_PROPERTY_NAMEFORMAT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_NAMEFORMAT + " could not be found");
    		
		} else if (!CIM_ProtocolEndpointHelper.isValid_NameFormat(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtocolEndpoint.CIM_PROPERTY_NAMEFORMAT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_NAMEFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OperationalStatus
	
	public UnsignedInt16[] get_OperationalStatus() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolEndpoint.CIM_PROPERTY_OPERATIONALSTATUS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_OPERATIONALSTATUS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_OPERATIONALSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		UnsignedInt16[] resultArray = new UnsignedInt16[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (UnsignedInt16)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_OperationalStatus(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolEndpoint.CIM_PROPERTY_OPERATIONALSTATUS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_OPERATIONALSTATUS + " could not be found");
    		
		} else if (!CIM_ProtocolEndpointHelper.isValid_OperationalStatus(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtocolEndpoint.CIM_PROPERTY_OPERATIONALSTATUS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_OPERATIONALSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherTypeDescription
	
	public String get_OtherTypeDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolEndpoint.CIM_PROPERTY_OTHERTYPEDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_OTHERTYPEDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_OTHERTYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherTypeDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolEndpoint.CIM_PROPERTY_OTHERTYPEDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_OTHERTYPEDESCRIPTION + " could not be found");
    		
		} else if (!CIM_ProtocolEndpointHelper.isValid_OtherTypeDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtocolEndpoint.CIM_PROPERTY_OTHERTYPEDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_OTHERTYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProtocolIFType
	
	public UnsignedInt16 get_ProtocolIFType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProtocolIFType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE + " could not be found");
    		
		} else if (!CIM_ProtocolEndpointHelper.isValid_ProtocolIFType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProtocolType
	
	public UnsignedInt16 get_ProtocolType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolEndpoint.CIM_PROPERTY_PROTOCOLTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_PROTOCOLTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_PROTOCOLTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProtocolType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolEndpoint.CIM_PROPERTY_PROTOCOLTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_PROTOCOLTYPE + " could not be found");
    		
		} else if (!CIM_ProtocolEndpointHelper.isValid_ProtocolType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtocolEndpoint.CIM_PROPERTY_PROTOCOLTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_PROTOCOLTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TimeOfLastStateChange
	
	public Calendar get_TimeOfLastStateChange() {

		CIMProperty property = this.cimInstance.getProperty(CIM_ProtocolEndpoint.CIM_PROPERTY_TIMEOFLASTSTATECHANGE);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_TIMEOFLASTSTATECHANGE + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_TIMEOFLASTSTATECHANGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_TimeOfLastStateChange(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolEndpoint.CIM_PROPERTY_TIMEOFLASTSTATECHANGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_TIMEOFLASTSTATECHANGE + " could not be found");
    		
		} else if (!CIM_ProtocolEndpointHelper.isValid_TimeOfLastStateChange(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtocolEndpoint.CIM_PROPERTY_TIMEOFLASTSTATECHANGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolEndpoint.CIM_PROPERTY_TIMEOFLASTSTATECHANGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
