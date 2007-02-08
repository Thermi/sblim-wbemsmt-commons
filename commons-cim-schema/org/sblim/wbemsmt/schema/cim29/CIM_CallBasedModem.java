/** 
 * CIM_CallBasedModem.java
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
 * Description: CIM_CallBasedModem is the superclass for grouping the numerous types of call-based modems. The POTSModem is a type of call- based Modem.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.Calendar;


public class CIM_CallBasedModem extends CIM_Modem  {
	
	public final static String CIM_CLASS_NAME = "CIM_CallBasedModem";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	
	
	/**
	*	Total number of block errors seen by the Device on the last or current call. That a call is in-progress is indicated by the CallStatus property.
	*/
	public final static String CIM_PROPERTY_BLOCKERRORS = "BlockErrors"; //$NON-NLS-1$
	/**
	*	Total number of blocks received by the Device on the last or current call. That a call is in-progress is indicated by the CallStatus property.
	*/
	public final static String CIM_PROPERTY_BLOCKSRECEIVED = "BlocksReceived"; //$NON-NLS-1$
	/**
	*	Total number of blocks resent by the Device on the last or current call. That a call is in-progress is indicated by the CallStatus property.
	*/
	public final static String CIM_PROPERTY_BLOCKSRESENT = "BlocksResent"; //$NON-NLS-1$
	/**
	*	Total number of blocks sent by the Device on the last or current call. That a call is in-progress is indicated by the CallStatus property.
	*/
	public final static String CIM_PROPERTY_BLOCKSSENT = "BlocksSent"; //$NON-NLS-1$
	/**
	*	Length of the last or current call. That a call is in-progress is indicated by the CallStatus property. The 'interval' format of the datetime data type should be used for the property value.
	*/
	public final static String CIM_PROPERTY_CALLLENGTH = "CallLength"; //$NON-NLS-1$
	/**
	*	The rate at which the receiver and transmitter are or were last cooperating, on a call, before disconnection.
	*/
	public final static String CIM_PROPERTY_CALLSPEED = "CallSpeed"; //$NON-NLS-1$
	/**
	*	Status of the Modem. For example, information regarding modem negotiation or whether the modem is connected (values 8 and 9, respectively) can be conveyed in this property.
	*/
	public final static String CIM_PROPERTY_CALLSTATUS = "CallStatus"; //$NON-NLS-1$
	/**
	*	Total number of characters lost by the Device on the last or current call. That a call is in-progress is indicated by the CallStatus property.
	*/
	public final static String CIM_PROPERTY_CHARSLOST = "CharsLost"; //$NON-NLS-1$
	/**
	*	Total number of characters received by the Device on the last or current call. That a call is in-progress is indicated by the CallStatus property.
	*/
	public final static String CIM_PROPERTY_CHARSRECEIVED = "CharsReceived"; //$NON-NLS-1$
	/**
	*	Total number of characters sent by the Device on the last or current call. That a call is in-progress is indicated by the CallStatus property.
	*/
	public final static String CIM_PROPERTY_CHARSSENT = "CharsSent"; //$NON-NLS-1$
	/**
	*	Describes the current data compression characteristics of the Modem.
	*/
	public final static String CIM_PROPERTY_COMPRESSIONINFO = "CompressionInfo"; //$NON-NLS-1$
	/**
	*	An array enumerating all the compression protocols supported by the Modem.
	*/
	public final static String CIM_PROPERTY_COMPRESSIONSUPPORTED = "CompressionSupported"; //$NON-NLS-1$
	/**
	*	Describes the current error correction characteristics of the Modem.
	*/
	public final static String CIM_PROPERTY_ERRORCONTROLINFO = "ErrorControlInfo"; //$NON-NLS-1$
	/**
	*	An array enumerating the error control protocols supported by the Modem. The beginning entries in the Values qualifier array are mapped from the CIM_POTSModem ErrorControlInfo property.
	*/
	public final static String CIM_PROPERTY_ERRORCONTROLSUPPORTED = "ErrorControlSupported"; //$NON-NLS-1$
	/**
	*	Indicates whether online fallback is enabled, to be negotiated by the Modem.
	*/
	public final static String CIM_PROPERTY_FALLBACKENABLED = "FallbackEnabled"; //$NON-NLS-1$
	/**
	*	Describes the current modulation scheme of the Modem.
	*/
	public final static String CIM_PROPERTY_MODULATIONSCHEME = "ModulationScheme"; //$NON-NLS-1$
	/**
	*	An array enumerating all the modulation protocols supported by the Modem. The beginning entries in the Values qualifier array are mapped from the CIM_POTSModem ModulationScheme property.
	*/
	public final static String CIM_PROPERTY_MODULATIONSUPPORTED = "ModulationSupported"; //$NON-NLS-1$
	/**
	*	Last or current number dialed to which the statistics apply, or NULL if the call was incoming.
	*/
	public final static String CIM_PROPERTY_NUMBERDIALED = "NumberDialed"; //$NON-NLS-1$
	/**
	*	Description of the compression type when "Other " (value=1) is defined in the CompressionSupported array. If there are multiple "Other" types, then combine their descriptions into a single string.
	*/
	public final static String CIM_PROPERTY_OTHERCOMPRESSIONDESCRIPTION = "OtherCompressionDescription"; //$NON-NLS-1$
	/**
	*	Description of the current compression type when "Other" (value=1) is specified in the CompressionInfo property.
	*/
	public final static String CIM_PROPERTY_OTHERCOMPRESSIONINFODESCRIPTION = "OtherCompressionInfoDescription"; //$NON-NLS-1$
	/**
	*	Description of the error control type when "Other" (value= 1) is specified in the ErrorControlSupported property. If there are multiple "Other" types, then combine their descriptions into a single string.
	*/
	public final static String CIM_PROPERTY_OTHERERRORCONTROLDESCRIPTION = "OtherErrorControlDescription"; //$NON-NLS-1$
	/**
	*	Description of the error control when "Other" (value=1) is defined as the value of the ErrorControlInfo property.
	*/
	public final static String CIM_PROPERTY_OTHERERRORCONTROLINFODESCRIPTION = "OtherErrorControlInfoDescription"; //$NON-NLS-1$
	/**
	*	Description of the current modulation type when "Other" (value=1) is specified in the ModulationSupported property. If there are multiple "Other" types, then combine their descriptions into a single string.
	*/
	public final static String CIM_PROPERTY_OTHERMODULATIONDESCRIPTION = "OtherModulationDescription"; //$NON-NLS-1$
	/**
	*	Description of the current modulation type when "Other" (value=1) is specified in the ModulationScheme property.
	*/
	public final static String CIM_PROPERTY_OTHERSCHEMEDESCRIPTION = "OtherSchemeDescription"; //$NON-NLS-1$
	/**
	*	Time of last reset of the Modem.
	*/
	public final static String CIM_PROPERTY_TIMEOFLASTRESET = "TimeOfLastReset"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_BLOCKERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_BLOCKSRECEIVED);
		CIM_PropertyNameList.add(CIM_PROPERTY_BLOCKSRESENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_BLOCKSSENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CALLLENGTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_CALLSPEED);
		CIM_PropertyNameList.add(CIM_PROPERTY_CALLSTATUS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CHARSLOST);
		CIM_PropertyNameList.add(CIM_PROPERTY_CHARSRECEIVED);
		CIM_PropertyNameList.add(CIM_PROPERTY_CHARSSENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_COMPRESSIONINFO);
		CIM_PropertyNameList.add(CIM_PROPERTY_COMPRESSIONSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_ERRORCONTROLINFO);
		CIM_PropertyNameList.add(CIM_PROPERTY_ERRORCONTROLSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_FALLBACKENABLED);
		CIM_PropertyNameList.add(CIM_PROPERTY_MODULATIONSCHEME);
		CIM_PropertyNameList.add(CIM_PROPERTY_MODULATIONSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_NUMBERDIALED);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERCOMPRESSIONDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERCOMPRESSIONINFODESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERERRORCONTROLDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERERRORCONTROLINFODESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERMODULATIONDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERSCHEMEDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMEOFLASTRESET);
				
		for (int i = 0; i < CIM_Modem.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Modem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BLOCKERRORS)||
				((String)CIM_Modem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BLOCKSRECEIVED)||
				((String)CIM_Modem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BLOCKSRESENT)||
				((String)CIM_Modem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BLOCKSSENT)||
				((String)CIM_Modem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CALLLENGTH)||
				((String)CIM_Modem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CALLSPEED)||
				((String)CIM_Modem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CALLSTATUS)||
				((String)CIM_Modem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CHARSLOST)||
				((String)CIM_Modem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CHARSRECEIVED)||
				((String)CIM_Modem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CHARSSENT)||
				((String)CIM_Modem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_COMPRESSIONINFO)||
				((String)CIM_Modem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_COMPRESSIONSUPPORTED)||
				((String)CIM_Modem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ERRORCONTROLINFO)||
				((String)CIM_Modem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ERRORCONTROLSUPPORTED)||
				((String)CIM_Modem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FALLBACKENABLED)||
				((String)CIM_Modem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MODULATIONSCHEME)||
				((String)CIM_Modem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MODULATIONSUPPORTED)||
				((String)CIM_Modem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NUMBERDIALED)||
				((String)CIM_Modem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERCOMPRESSIONDESCRIPTION)||
				((String)CIM_Modem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERCOMPRESSIONINFODESCRIPTION)||
				((String)CIM_Modem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERERRORCONTROLDESCRIPTION)||
				((String)CIM_Modem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERERRORCONTROLINFODESCRIPTION)||
				((String)CIM_Modem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERMODULATIONDESCRIPTION)||
				((String)CIM_Modem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERSCHEMEDESCRIPTION)||
				((String)CIM_Modem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TIMEOFLASTRESET)){
				continue;
			}
			
			CIM_CallBasedModem.CIM_PropertyNameList.add(CIM_Modem.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BLOCKERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BLOCKSRECEIVED, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BLOCKSRESENT, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BLOCKSSENT, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CALLLENGTH, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CALLSPEED, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CALLSTATUS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CHARSLOST, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CHARSRECEIVED, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CHARSSENT, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_COMPRESSIONINFO, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_COMPRESSIONSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ERRORCONTROLINFO, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ERRORCONTROLSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FALLBACKENABLED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MODULATIONSCHEME, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MODULATIONSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NUMBERDIALED, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERCOMPRESSIONDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERCOMPRESSIONINFODESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERERRORCONTROLDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERERRORCONTROLINFODESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERMODULATIONDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERSCHEMEDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMEOFLASTRESET, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
				
		for (int i = 0; i < CIM_Modem.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Modem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BLOCKERRORS)||
				((CIMProperty)CIM_Modem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BLOCKSRECEIVED)||
				((CIMProperty)CIM_Modem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BLOCKSRESENT)||
				((CIMProperty)CIM_Modem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BLOCKSSENT)||
				((CIMProperty)CIM_Modem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CALLLENGTH)||
				((CIMProperty)CIM_Modem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CALLSPEED)||
				((CIMProperty)CIM_Modem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CALLSTATUS)||
				((CIMProperty)CIM_Modem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CHARSLOST)||
				((CIMProperty)CIM_Modem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CHARSRECEIVED)||
				((CIMProperty)CIM_Modem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CHARSSENT)||
				((CIMProperty)CIM_Modem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_COMPRESSIONINFO)||
				((CIMProperty)CIM_Modem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_COMPRESSIONSUPPORTED)||
				((CIMProperty)CIM_Modem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ERRORCONTROLINFO)||
				((CIMProperty)CIM_Modem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ERRORCONTROLSUPPORTED)||
				((CIMProperty)CIM_Modem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FALLBACKENABLED)||
				((CIMProperty)CIM_Modem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MODULATIONSCHEME)||
				((CIMProperty)CIM_Modem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MODULATIONSUPPORTED)||
				((CIMProperty)CIM_Modem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NUMBERDIALED)||
				((CIMProperty)CIM_Modem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERCOMPRESSIONDESCRIPTION)||
				((CIMProperty)CIM_Modem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERCOMPRESSIONINFODESCRIPTION)||
				((CIMProperty)CIM_Modem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERERRORCONTROLDESCRIPTION)||
				((CIMProperty)CIM_Modem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERERRORCONTROLINFODESCRIPTION)||
				((CIMProperty)CIM_Modem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERMODULATIONDESCRIPTION)||
				((CIMProperty)CIM_Modem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERSCHEMEDESCRIPTION)||
				((CIMProperty)CIM_Modem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TIMEOFLASTRESET)){
				continue;
			}
			
			CIM_CallBasedModem.CIM_PropertyList.add(CIM_Modem.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Modem.Java_Package_List.size(); i++) {
			if (((String)CIM_Modem.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Modem.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_CALLSTATUS = {"Unknown","Other","Offline","On Hook","Dialing","Waiting for Answer","Ringing","Modem Detected","Negotiating","Online","Error"};
	public final static String[] CIM_VALUEMAP_COMPRESSIONINFO = {"Unknown","Other","No Compression","MNP 5","V.42bis","MNP 3","MNP 4","V.58","PEP","HST"};
	public final static String[] CIM_VALUEMAP_COMPRESSIONSUPPORTED = {"Unknown","Other","No Compression","MNP 5","V.42bis","MNP 3","MNP 4","V.58","PEP","HST"};
	public final static String[] CIM_VALUEMAP_ERRORCONTROLINFO = {"Unknown","Other","No Error Correction","MNP 4","LAPM","V.58","ECP Enhanced Cellular Protocol","ETC Enhanced Throughput Cellular","MNP 1","MNP 2","MNP 3","MNP10","PEP","HST"};
	public final static String[] CIM_VALUEMAP_ERRORCONTROLSUPPORTED = {"Unknown","Other","No Error Correction","MNP 4","LAPM","V.58","ECP Enhanced Cellular Protocol","ETC Enhanced Throughput Cellular","MNP 1","MNP 2","MNP 3","MNP10","PEP","HST"};
	public final static String[] CIM_VALUEMAP_MODULATIONSCHEME = {"Unknown","Other","Not Supported","Bell 103","Bell 212A","V.22bis","V.32","V.32bis","V.terbo","V.FC","V.34","V.34bis","V.17 (G3 Fax Call)","V.21","V.22","V.23 Constant Carrier (1200/75)","V.23 Switched Carrier (Half Duplex)","V.26bis","V.26ter","V.27ter (G3 Fax Call)","V.29 HD (G3 Fax Call)","V.34 HD (G3 Fax Call)","V.90 Issue 1 (Asymmetric)","V.90 Issue 2 (Symmetric)","V.58","X2","K56FLEX","V.Fast","PEP","HST"};
	public final static String[] CIM_VALUEMAP_MODULATIONSUPPORTED = {"Unknown","Other","Not Supported","Bell 103","Bell 212A","V.22bis","V.32","V.32bis","V.terbo","V.FC","V.34","V.34bis","V.17 (G3 Fax Call)","V.21","V.22","V.23 Constant Carrier (1200/75)","V.23 Switched Carrier (Half Duplex)","V.26bis","V.26ter","V.27ter (G3 Fax Call)","V.29 HD (G3 Fax Call)","V.34 HD (G3 Fax Call)","V.90 Issue 1 (Asymmetric)","V.90 Issue 2 (Symmetric)","V.58","X2","K56FLEX","V.Fast","PEP","HST"};
	
	
	public final static int CALLSTATUS_UNKNOWN = 0;
	public final static int CALLSTATUS_OTHER = 1;
	public final static int CALLSTATUS_OFFLINE = 2;
	public final static int CALLSTATUS_ONHOOK = 3;
	public final static int CALLSTATUS_DIALING = 4;
	public final static int CALLSTATUS_WAITINGFORANSWER = 5;
	public final static int CALLSTATUS_RINGING = 6;
	public final static int CALLSTATUS_MODEMDETECTED = 7;
	public final static int CALLSTATUS_NEGOTIATING = 8;
	public final static int CALLSTATUS_ONLINE = 9;
	public final static int CALLSTATUS_ERROR = 10;
	
	public final static int COMPRESSIONINFO_UNKNOWN = 0;
	public final static int COMPRESSIONINFO_OTHER = 1;
	public final static int COMPRESSIONINFO_NOCOMPRESSION = 2;
	public final static int COMPRESSIONINFO_MNP5 = 3;
	public final static int COMPRESSIONINFO_V_42BIS = 4;
	public final static int COMPRESSIONINFO_MNP3 = 5;
	public final static int COMPRESSIONINFO_MNP4 = 6;
	public final static int COMPRESSIONINFO_V_58 = 7;
	public final static int COMPRESSIONINFO_PEP = 8;
	public final static int COMPRESSIONINFO_HST = 9;
	
	public final static int COMPRESSIONSUPPORTED_UNKNOWN = 0;
	public final static int COMPRESSIONSUPPORTED_OTHER = 1;
	public final static int COMPRESSIONSUPPORTED_NOCOMPRESSION = 2;
	public final static int COMPRESSIONSUPPORTED_MNP5 = 3;
	public final static int COMPRESSIONSUPPORTED_V_42BIS = 4;
	public final static int COMPRESSIONSUPPORTED_MNP3 = 5;
	public final static int COMPRESSIONSUPPORTED_MNP4 = 6;
	public final static int COMPRESSIONSUPPORTED_V_58 = 7;
	public final static int COMPRESSIONSUPPORTED_PEP = 8;
	public final static int COMPRESSIONSUPPORTED_HST = 9;
	
	public final static int ERRORCONTROLINFO_UNKNOWN = 0;
	public final static int ERRORCONTROLINFO_OTHER = 1;
	public final static int ERRORCONTROLINFO_NOERRORCORRECTION = 2;
	public final static int ERRORCONTROLINFO_MNP4 = 3;
	public final static int ERRORCONTROLINFO_LAPM = 4;
	public final static int ERRORCONTROLINFO_V_58 = 5;
	public final static int ERRORCONTROLINFO_ECPENHANCEDCELLULARPROTOCOL = 6;
	public final static int ERRORCONTROLINFO_ETCENHANCEDTHROUGHPUTCELLULAR = 7;
	public final static int ERRORCONTROLINFO_MNP1 = 8;
	public final static int ERRORCONTROLINFO_MNP2 = 9;
	public final static int ERRORCONTROLINFO_MNP3 = 10;
	public final static int ERRORCONTROLINFO_MNP10 = 11;
	public final static int ERRORCONTROLINFO_PEP = 12;
	public final static int ERRORCONTROLINFO_HST = 13;
	
	public final static int ERRORCONTROLSUPPORTED_UNKNOWN = 0;
	public final static int ERRORCONTROLSUPPORTED_OTHER = 1;
	public final static int ERRORCONTROLSUPPORTED_NOERRORCORRECTION = 2;
	public final static int ERRORCONTROLSUPPORTED_MNP4 = 3;
	public final static int ERRORCONTROLSUPPORTED_LAPM = 4;
	public final static int ERRORCONTROLSUPPORTED_V_58 = 5;
	public final static int ERRORCONTROLSUPPORTED_ECPENHANCEDCELLULARPROTOCOL = 6;
	public final static int ERRORCONTROLSUPPORTED_ETCENHANCEDTHROUGHPUTCELLULAR = 7;
	public final static int ERRORCONTROLSUPPORTED_MNP1 = 8;
	public final static int ERRORCONTROLSUPPORTED_MNP2 = 9;
	public final static int ERRORCONTROLSUPPORTED_MNP3 = 10;
	public final static int ERRORCONTROLSUPPORTED_MNP10 = 11;
	public final static int ERRORCONTROLSUPPORTED_PEP = 12;
	public final static int ERRORCONTROLSUPPORTED_HST = 13;
	
	public final static int MODULATIONSCHEME_UNKNOWN = 0;
	public final static int MODULATIONSCHEME_OTHER = 1;
	public final static int MODULATIONSCHEME_NOTSUPPORTED = 2;
	public final static int MODULATIONSCHEME_BELL103 = 3;
	public final static int MODULATIONSCHEME_BELL212A = 4;
	public final static int MODULATIONSCHEME_V_22BIS = 5;
	public final static int MODULATIONSCHEME_V_32 = 6;
	public final static int MODULATIONSCHEME_V_32BIS = 7;
	public final static int MODULATIONSCHEME_V_TERBO = 8;
	public final static int MODULATIONSCHEME_V_FC = 9;
	public final static int MODULATIONSCHEME_V_34 = 10;
	public final static int MODULATIONSCHEME_V_34BIS = 11;
	public final static int MODULATIONSCHEME_V_17G3FAXCALL = 12;
	public final static int MODULATIONSCHEME_V_21 = 13;
	public final static int MODULATIONSCHEME_V_22 = 14;
	public final static int MODULATIONSCHEME_V_23CONSTANTCARRIER1200_75 = 15;
	public final static int MODULATIONSCHEME_V_23SWITCHEDCARRIERHALFDUPLEX = 16;
	public final static int MODULATIONSCHEME_V_26BIS = 17;
	public final static int MODULATIONSCHEME_V_26TER = 18;
	public final static int MODULATIONSCHEME_V_27TERG3FAXCALL = 19;
	public final static int MODULATIONSCHEME_V_29HDG3FAXCALL = 20;
	public final static int MODULATIONSCHEME_V_34HDG3FAXCALL = 21;
	public final static int MODULATIONSCHEME_V_90ISSUE1ASYMMETRIC = 22;
	public final static int MODULATIONSCHEME_V_90ISSUE2SYMMETRIC = 23;
	public final static int MODULATIONSCHEME_V_58 = 24;
	public final static int MODULATIONSCHEME_X2 = 25;
	public final static int MODULATIONSCHEME_K56FLEX = 26;
	public final static int MODULATIONSCHEME_V_FAST = 27;
	public final static int MODULATIONSCHEME_PEP = 28;
	public final static int MODULATIONSCHEME_HST = 29;
	
	public final static int MODULATIONSUPPORTED_UNKNOWN = 0;
	public final static int MODULATIONSUPPORTED_OTHER = 1;
	public final static int MODULATIONSUPPORTED_NOTSUPPORTED = 2;
	public final static int MODULATIONSUPPORTED_BELL103 = 3;
	public final static int MODULATIONSUPPORTED_BELL212A = 4;
	public final static int MODULATIONSUPPORTED_V_22BIS = 5;
	public final static int MODULATIONSUPPORTED_V_32 = 6;
	public final static int MODULATIONSUPPORTED_V_32BIS = 7;
	public final static int MODULATIONSUPPORTED_V_TERBO = 8;
	public final static int MODULATIONSUPPORTED_V_FC = 9;
	public final static int MODULATIONSUPPORTED_V_34 = 10;
	public final static int MODULATIONSUPPORTED_V_34BIS = 11;
	public final static int MODULATIONSUPPORTED_V_17G3FAXCALL = 12;
	public final static int MODULATIONSUPPORTED_V_21 = 13;
	public final static int MODULATIONSUPPORTED_V_22 = 14;
	public final static int MODULATIONSUPPORTED_V_23CONSTANTCARRIER1200_75 = 15;
	public final static int MODULATIONSUPPORTED_V_23SWITCHEDCARRIERHALFDUPLEX = 16;
	public final static int MODULATIONSUPPORTED_V_26BIS = 17;
	public final static int MODULATIONSUPPORTED_V_26TER = 18;
	public final static int MODULATIONSUPPORTED_V_27TERG3FAXCALL = 19;
	public final static int MODULATIONSUPPORTED_V_29HDG3FAXCALL = 20;
	public final static int MODULATIONSUPPORTED_V_34HDG3FAXCALL = 21;
	public final static int MODULATIONSUPPORTED_V_90ISSUE1ASYMMETRIC = 22;
	public final static int MODULATIONSUPPORTED_V_90ISSUE2SYMMETRIC = 23;
	public final static int MODULATIONSUPPORTED_V_58 = 24;
	public final static int MODULATIONSUPPORTED_X2 = 25;
	public final static int MODULATIONSUPPORTED_K56FLEX = 26;
	public final static int MODULATIONSUPPORTED_V_FAST = 27;
	public final static int MODULATIONSUPPORTED_PEP = 28;
	public final static int MODULATIONSUPPORTED_HST = 29;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_CallBasedModem() {

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
	public CIM_CallBasedModem(Vector keyProperties){ 
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
	public CIM_CallBasedModem(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
		if (cimInstance == null) {
			throw new InvalidParameterException("The cimInstance parameter does not contain a valid reference.");
		
		} else if (cimObjectPath == null){
			throw new InvalidParameterException("The cimObjectPath parameter does not contain a valid reference.");		
		
		} else if (!CIM_CLASS_NAME.equals(cimInstance.getClassName())) {
			throw new InvalidParameterException("The class of the cimInstance must be of type " + CIM_CLASS_NAME + ".");
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
		return validCimInstance;
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
	    
	    if (!(object instanceof CIM_CallBasedModem)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_CallBasedModem)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_CallBasedModem)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_CallBasedModem)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_CallBasedModem)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_CallBasedModem)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_CallBasedModem)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_CallBasedModem)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_CallBasedModem)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_CallBasedModem)object).cimObjectPath)) {
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
	
	// Attribute BlockErrors
	
	public UnsignedInt32 get_BlockErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_BLOCKERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_BLOCKERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_BLOCKERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BlockErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_BLOCKERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_BLOCKERRORS + " could not be found");
    		
		} else if (!CIM_CallBasedModemHelper.isValid_BlockErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CallBasedModem.CIM_PROPERTY_BLOCKERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_BLOCKERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BlocksReceived
	
	public UnsignedInt32 get_BlocksReceived() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_BLOCKSRECEIVED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_BLOCKSRECEIVED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_BLOCKSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BlocksReceived(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_BLOCKSRECEIVED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_BLOCKSRECEIVED + " could not be found");
    		
		} else if (!CIM_CallBasedModemHelper.isValid_BlocksReceived(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CallBasedModem.CIM_PROPERTY_BLOCKSRECEIVED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_BLOCKSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BlocksResent
	
	public UnsignedInt32 get_BlocksResent() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_BLOCKSRESENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_BLOCKSRESENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_BLOCKSRESENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BlocksResent(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_BLOCKSRESENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_BLOCKSRESENT + " could not be found");
    		
		} else if (!CIM_CallBasedModemHelper.isValid_BlocksResent(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CallBasedModem.CIM_PROPERTY_BLOCKSRESENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_BLOCKSRESENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BlocksSent
	
	public UnsignedInt32 get_BlocksSent() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_BLOCKSSENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_BLOCKSSENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_BLOCKSSENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BlocksSent(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_BLOCKSSENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_BLOCKSSENT + " could not be found");
    		
		} else if (!CIM_CallBasedModemHelper.isValid_BlocksSent(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CallBasedModem.CIM_PROPERTY_BLOCKSSENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_BLOCKSSENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CallLength
	
	public Calendar get_CallLength() {

		CIMProperty property = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_CALLLENGTH);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_CALLLENGTH + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_CALLLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_CallLength(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_CALLLENGTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_CALLLENGTH + " could not be found");
    		
		} else if (!CIM_CallBasedModemHelper.isValid_CallLength(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CallBasedModem.CIM_PROPERTY_CALLLENGTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_CALLLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute CallSpeed
	
	public UnsignedInt32 get_CallSpeed() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_CALLSPEED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_CALLSPEED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_CALLSPEED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CallSpeed(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_CALLSPEED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_CALLSPEED + " could not be found");
    		
		} else if (!CIM_CallBasedModemHelper.isValid_CallSpeed(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CallBasedModem.CIM_PROPERTY_CALLSPEED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_CALLSPEED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CallStatus
	
	public UnsignedInt16 get_CallStatus() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_CALLSTATUS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_CALLSTATUS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_CALLSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CallStatus(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_CALLSTATUS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_CALLSTATUS + " could not be found");
    		
		} else if (!CIM_CallBasedModemHelper.isValid_CallStatus(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CallBasedModem.CIM_PROPERTY_CALLSTATUS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_CALLSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CharsLost
	
	public UnsignedInt32 get_CharsLost() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_CHARSLOST);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_CHARSLOST + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_CHARSLOST + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CharsLost(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_CHARSLOST);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_CHARSLOST + " could not be found");
    		
		} else if (!CIM_CallBasedModemHelper.isValid_CharsLost(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CallBasedModem.CIM_PROPERTY_CHARSLOST);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_CHARSLOST + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CharsReceived
	
	public UnsignedInt32 get_CharsReceived() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_CHARSRECEIVED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_CHARSRECEIVED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_CHARSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CharsReceived(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_CHARSRECEIVED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_CHARSRECEIVED + " could not be found");
    		
		} else if (!CIM_CallBasedModemHelper.isValid_CharsReceived(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CallBasedModem.CIM_PROPERTY_CHARSRECEIVED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_CHARSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CharsSent
	
	public UnsignedInt32 get_CharsSent() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_CHARSSENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_CHARSSENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_CHARSSENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CharsSent(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_CHARSSENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_CHARSSENT + " could not be found");
    		
		} else if (!CIM_CallBasedModemHelper.isValid_CharsSent(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CallBasedModem.CIM_PROPERTY_CHARSSENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_CHARSSENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CompressionInfo
	
	public UnsignedInt16 get_CompressionInfo() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_COMPRESSIONINFO);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_COMPRESSIONINFO + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_COMPRESSIONINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CompressionInfo(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_COMPRESSIONINFO);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_COMPRESSIONINFO + " could not be found");
    		
		} else if (!CIM_CallBasedModemHelper.isValid_CompressionInfo(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CallBasedModem.CIM_PROPERTY_COMPRESSIONINFO);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_COMPRESSIONINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CompressionSupported
	
	public UnsignedInt16[] get_CompressionSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_COMPRESSIONSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_COMPRESSIONSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_COMPRESSIONSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_CompressionSupported(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_COMPRESSIONSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_COMPRESSIONSUPPORTED + " could not be found");
    		
		} else if (!CIM_CallBasedModemHelper.isValid_CompressionSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CallBasedModem.CIM_PROPERTY_COMPRESSIONSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_COMPRESSIONSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ErrorControlInfo
	
	public UnsignedInt16 get_ErrorControlInfo() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_ERRORCONTROLINFO);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_ERRORCONTROLINFO + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_ERRORCONTROLINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ErrorControlInfo(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_ERRORCONTROLINFO);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_ERRORCONTROLINFO + " could not be found");
    		
		} else if (!CIM_CallBasedModemHelper.isValid_ErrorControlInfo(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CallBasedModem.CIM_PROPERTY_ERRORCONTROLINFO);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_ERRORCONTROLINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ErrorControlSupported
	
	public UnsignedInt16[] get_ErrorControlSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_ERRORCONTROLSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_ERRORCONTROLSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_ERRORCONTROLSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_ErrorControlSupported(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_ERRORCONTROLSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_ERRORCONTROLSUPPORTED + " could not be found");
    		
		} else if (!CIM_CallBasedModemHelper.isValid_ErrorControlSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CallBasedModem.CIM_PROPERTY_ERRORCONTROLSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_ERRORCONTROLSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FallbackEnabled
	
	public Boolean get_FallbackEnabled() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_FALLBACKENABLED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_FALLBACKENABLED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_FALLBACKENABLED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FallbackEnabled(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_FALLBACKENABLED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_FALLBACKENABLED + " could not be found");
    		
		} else if (!CIM_CallBasedModemHelper.isValid_FallbackEnabled(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CallBasedModem.CIM_PROPERTY_FALLBACKENABLED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_FALLBACKENABLED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ModulationScheme
	
	public UnsignedInt16 get_ModulationScheme() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_MODULATIONSCHEME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_MODULATIONSCHEME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_MODULATIONSCHEME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ModulationScheme(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_MODULATIONSCHEME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_MODULATIONSCHEME + " could not be found");
    		
		} else if (!CIM_CallBasedModemHelper.isValid_ModulationScheme(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CallBasedModem.CIM_PROPERTY_MODULATIONSCHEME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_MODULATIONSCHEME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ModulationSupported
	
	public UnsignedInt16[] get_ModulationSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_MODULATIONSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_MODULATIONSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_MODULATIONSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_ModulationSupported(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_MODULATIONSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_MODULATIONSUPPORTED + " could not be found");
    		
		} else if (!CIM_CallBasedModemHelper.isValid_ModulationSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CallBasedModem.CIM_PROPERTY_MODULATIONSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_MODULATIONSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NumberDialed
	
	public String get_NumberDialed() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_NUMBERDIALED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_NUMBERDIALED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_NUMBERDIALED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NumberDialed(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_NUMBERDIALED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_NUMBERDIALED + " could not be found");
    		
		} else if (!CIM_CallBasedModemHelper.isValid_NumberDialed(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CallBasedModem.CIM_PROPERTY_NUMBERDIALED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_NUMBERDIALED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherCompressionDescription
	
	public String get_OtherCompressionDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_OTHERCOMPRESSIONDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERCOMPRESSIONDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERCOMPRESSIONDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherCompressionDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_OTHERCOMPRESSIONDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERCOMPRESSIONDESCRIPTION + " could not be found");
    		
		} else if (!CIM_CallBasedModemHelper.isValid_OtherCompressionDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERCOMPRESSIONDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERCOMPRESSIONDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherCompressionInfoDescription
	
	public String get_OtherCompressionInfoDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_OTHERCOMPRESSIONINFODESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERCOMPRESSIONINFODESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERCOMPRESSIONINFODESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherCompressionInfoDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_OTHERCOMPRESSIONINFODESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERCOMPRESSIONINFODESCRIPTION + " could not be found");
    		
		} else if (!CIM_CallBasedModemHelper.isValid_OtherCompressionInfoDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERCOMPRESSIONINFODESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERCOMPRESSIONINFODESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherErrorControlDescription
	
	public String get_OtherErrorControlDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_OTHERERRORCONTROLDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERERRORCONTROLDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERERRORCONTROLDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherErrorControlDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_OTHERERRORCONTROLDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERERRORCONTROLDESCRIPTION + " could not be found");
    		
		} else if (!CIM_CallBasedModemHelper.isValid_OtherErrorControlDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERERRORCONTROLDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERERRORCONTROLDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherErrorControlInfoDescription
	
	public String get_OtherErrorControlInfoDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_OTHERERRORCONTROLINFODESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERERRORCONTROLINFODESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERERRORCONTROLINFODESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherErrorControlInfoDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_OTHERERRORCONTROLINFODESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERERRORCONTROLINFODESCRIPTION + " could not be found");
    		
		} else if (!CIM_CallBasedModemHelper.isValid_OtherErrorControlInfoDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERERRORCONTROLINFODESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERERRORCONTROLINFODESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherModulationDescription
	
	public String get_OtherModulationDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_OTHERMODULATIONDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERMODULATIONDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERMODULATIONDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherModulationDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_OTHERMODULATIONDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERMODULATIONDESCRIPTION + " could not be found");
    		
		} else if (!CIM_CallBasedModemHelper.isValid_OtherModulationDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERMODULATIONDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERMODULATIONDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherSchemeDescription
	
	public String get_OtherSchemeDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_OTHERSCHEMEDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERSCHEMEDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERSCHEMEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherSchemeDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_OTHERSCHEMEDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERSCHEMEDESCRIPTION + " could not be found");
    		
		} else if (!CIM_CallBasedModemHelper.isValid_OtherSchemeDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERSCHEMEDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_OTHERSCHEMEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TimeOfLastReset
	
	public Calendar get_TimeOfLastReset() {

		CIMProperty property = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_TIMEOFLASTRESET);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_TIMEOFLASTRESET + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_TIMEOFLASTRESET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_TimeOfLastReset(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CallBasedModem.CIM_PROPERTY_TIMEOFLASTRESET);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CallBasedModem.CIM_PROPERTY_TIMEOFLASTRESET + " could not be found");
    		
		} else if (!CIM_CallBasedModemHelper.isValid_TimeOfLastReset(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CallBasedModem.CIM_PROPERTY_TIMEOFLASTRESET);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CallBasedModem.CIM_PROPERTY_TIMEOFLASTRESET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
