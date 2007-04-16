/** 
 * CIM_AlertIndication.java
 *
 * (C) Copyright IBM Corp. 2005
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
 * Description:  A concrete superclass for CIM Alert notifications. An AlertIndication is a
 * specialized type of CIM_Indication that contains information about the
 * severity, cause, recommended actions and other data of a real world event.
 * This event and its data may or may not be modeled in the CIM class hierarchy.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMDateTime;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMSimpleDateTime;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;


/**
 *  A concrete superclass for CIM Alert notifications. An AlertIndication is a
 * specialized type of CIM_Indication that contains information about the
 * severity, cause, recommended actions and other data of a real world event.
 * This event and its data may or may not be modeled in the CIM class hierarchy.
 */
public class CIM_AlertIndication extends CIM_ProcessIndication  {
	
	public final static String CIM_CLASS_NAME = "CIM_AlertIndication"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.10.0";
	
	
	/**
	*	Primary classification of the Indication. The following values are defined: 
1 - Other. The Indication's OtherAlertType property conveys its classification. Use of "Other" in an enumeration is a standard CIM convention. It means that the current Indication does not fit into the categories described by this enumeration. 
2 - Communications Alert. An Indication of this type is principally associated with the procedures and/or processes required to convey information from one point to another. 
3 - Quality of Service Alert. An Indication of this type is principally associated with a degradation or errors in the performance or function of an entity. 
4 - Processing Error. An Indication of this type is principally associated with a software or processing fault. 
5 - Device Alert. An Indication of this type is principally associated with an equipment or hardware fault. 
6 - Environmental Alert. An Indication of this type is principally associated with a condition relating to an enclosure in which the hardware resides, or other environmental considerations. 
7 - Model Change. The Indication addresses changes in the Information Model. For example, it may embed a Lifecycle Indication to convey the specific model change being alerted. 
8 - Security Alert. An Indication of this type is associated with security violations, detection of viruses, and similar issues.
	*/
	public final static String CIM_PROPERTY_ALERTTYPE = "AlertType"; //$NON-NLS-1$
	/**
	*	The format of the AlertingManagedElement property is interpretable based upon the value of this property. Values are defined as: 
0 - Unknown. The format is unknown or not meaningfully interpretable by a CIM client application. 
1 - Other. The format is defined by the value of the OtherAlertingElementFormat property. 
2 - CIMObjectPath. The format is a CIMObjectPath, with format <NamespacePath>:<ClassName>.<Prop1>="<Value1>", <Prop2>="<Value2>", . . . specifying an instance in the CIM Schema.
	*/
	public final static String CIM_PROPERTY_ALERTINGELEMENTFORMAT = "AlertingElementFormat"; //$NON-NLS-1$
	/**
	*	The identifying information of the entity (ie, the instance) for which this Indication is generated. The property contains the path of an instance, encoded as a string parameter - if the instance is modeled in the CIM Schema. If not a CIM instance, the property contains some identifying string that names the entity for which the Alert is generated. The path or identifying string is formatted per the AlertingElementFormat property.
	*/
	public final static String CIM_PROPERTY_ALERTINGMANAGEDELEMENT = "AlertingManagedElement"; //$NON-NLS-1$
	/**
	*	A short description of the Indication.
	*/
	public final static String CIM_PROPERTY_DESCRIPTION = "Description"; //$NON-NLS-1$
	/**
	*	An instrumentation or provider specific value that describes the underlying "real-world" event represented by the Indication. Two Indications with the same, non NULL EventID value are considered, by the creating entity, to represent the same event. The comparison of two EventID values is only defined for Alert Indications with identical, non NULL values of SystemCreateClassName, SystemName and ProviderName.
	*/
	public final static String CIM_PROPERTY_EVENTID = "EventID"; //$NON-NLS-1$
	/**
	*	The time and date the underlying event was first detected. If specified, this property MUST be set to NULL if the creating entity is not capable of providing this information. This value is based on the notion of local date and time of the Managed System Element generating the Indication.
	*/
	public final static String CIM_PROPERTY_EVENTTIME = "EventTime"; //$NON-NLS-1$
	/**
	*	A string describing the Alert type - used when the AlertType property is set to 1, "Other State Change".
	*/
	public final static String CIM_PROPERTY_OTHERALERTTYPE = "OtherAlertType"; //$NON-NLS-1$
	/**
	*	A string defining "Other" values for AlertingElementFormat. This value MUST be set to a non NULL value when AlertingElementFormat is set to a value of 1 ("Other"). For all other values of AlertingElementFormat, the value of this string must be set to NULL.
	*/
	public final static String CIM_PROPERTY_OTHERALERTINGELEMENTFORMAT = "OtherAlertingElementFormat"; //$NON-NLS-1$
	/**
	*	An enumerated value that describes the severity of the Alert Indication from the notifier's point of view: 
1 - Other, by CIM convention, is used to indicate that the Severity's value can be found in the OtherSeverity property. 
3 - Degraded/Warning should be used when its appropriate to let the user decide if action is needed. 
4 - Minor should be used to indicate action is needed, but the situation is not serious at this time. 
5 - Major should be used to indicate action is needed NOW. 
6 - Critical should be used to indicate action is needed NOW and the scope is broad (perhaps an imminent outage to a critical resource will result). 
7 - Fatal/NonRecoverable should be used to indicate an error occurred, but it's too late to take remedial action. 
2 and 0 - Information and Unknown (respectively) follow common usage. Literally, the AlertIndication is purely informational or its severity is simply unknown.
	*/
	public final static String CIM_PROPERTY_PERCEIVEDSEVERITY = "PerceivedSeverity"; //$NON-NLS-1$
	/**
	*	An enumerated value that describes the probable cause of the situation which resulted in the AlertIndication.
	*/
	public final static String CIM_PROPERTY_PROBABLECAUSE = "ProbableCause"; //$NON-NLS-1$
	/**
	*	Provides additional information related to the ProbableCause.
	*/
	public final static String CIM_PROPERTY_PROBABLECAUSEDESCRIPTION = "ProbableCauseDescription"; //$NON-NLS-1$
	/**
	*	The name of the Provider generating this Indication.
	*/
	public final static String CIM_PROPERTY_PROVIDERNAME = "ProviderName"; //$NON-NLS-1$
	/**
	*	Free form descriptions of the recommended actions to take to resolve the cause of the notification.
	*/
	public final static String CIM_PROPERTY_RECOMMENDEDACTIONS = "RecommendedActions"; //$NON-NLS-1$
	/**
	*	The scoping System's CreationClassName for the Provider generating this Indication.
	*/
	public final static String CIM_PROPERTY_SYSTEMCREATIONCLASSNAME = "SystemCreationClassName"; //$NON-NLS-1$
	/**
	*	The scoping System's Name for the Provider generating this Indication.
	*/
	public final static String CIM_PROPERTY_SYSTEMNAME = "SystemName"; //$NON-NLS-1$
	/**
	*	Provides information on trending - trending up, down or no change.
	*/
	public final static String CIM_PROPERTY_TRENDING = "Trending"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ALERTTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ALERTINGELEMENTFORMAT);
		CIM_PropertyNameList.add(CIM_PROPERTY_ALERTINGMANAGEDELEMENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_DESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_EVENTID);
		CIM_PropertyNameList.add(CIM_PROPERTY_EVENTTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERALERTTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERALERTINGELEMENTFORMAT);
		CIM_PropertyNameList.add(CIM_PROPERTY_PERCEIVEDSEVERITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROBABLECAUSE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROBABLECAUSEDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROVIDERNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_RECOMMENDEDACTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYSTEMNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_TRENDING);
				
		for (int i = 0; i < CIM_ProcessIndication.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ProcessIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ALERTTYPE)||
				((String)CIM_ProcessIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ALERTINGELEMENTFORMAT)||
				((String)CIM_ProcessIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ALERTINGMANAGEDELEMENT)||
				((String)CIM_ProcessIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DESCRIPTION)||
				((String)CIM_ProcessIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EVENTID)||
				((String)CIM_ProcessIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EVENTTIME)||
				((String)CIM_ProcessIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERALERTTYPE)||
				((String)CIM_ProcessIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERALERTINGELEMENTFORMAT)||
				((String)CIM_ProcessIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PERCEIVEDSEVERITY)||
				((String)CIM_ProcessIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROBABLECAUSE)||
				((String)CIM_ProcessIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROBABLECAUSEDESCRIPTION)||
				((String)CIM_ProcessIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROVIDERNAME)||
				((String)CIM_ProcessIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RECOMMENDEDACTIONS)||
				((String)CIM_ProcessIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME)||
				((String)CIM_ProcessIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYSTEMNAME)||
				((String)CIM_ProcessIndication.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TRENDING)){
				continue;
			}
			
			CIM_AlertIndication.CIM_PropertyNameList.add(CIM_ProcessIndication.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ALERTTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ALERTINGELEMENTFORMAT, new CIMValue(new UnsignedInt16("0"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ALERTINGMANAGEDELEMENT, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EVENTID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EVENTTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERALERTTYPE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERALERTINGELEMENTFORMAT, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PERCEIVEDSEVERITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROBABLECAUSE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROBABLECAUSEDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROVIDERNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RECOMMENDEDACTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYSTEMNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TRENDING, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_ProcessIndication.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ProcessIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ALERTTYPE)||
				((CIMProperty)CIM_ProcessIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ALERTINGELEMENTFORMAT)||
				((CIMProperty)CIM_ProcessIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ALERTINGMANAGEDELEMENT)||
				((CIMProperty)CIM_ProcessIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DESCRIPTION)||
				((CIMProperty)CIM_ProcessIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EVENTID)||
				((CIMProperty)CIM_ProcessIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EVENTTIME)||
				((CIMProperty)CIM_ProcessIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERALERTTYPE)||
				((CIMProperty)CIM_ProcessIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERALERTINGELEMENTFORMAT)||
				((CIMProperty)CIM_ProcessIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PERCEIVEDSEVERITY)||
				((CIMProperty)CIM_ProcessIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROBABLECAUSE)||
				((CIMProperty)CIM_ProcessIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROBABLECAUSEDESCRIPTION)||
				((CIMProperty)CIM_ProcessIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROVIDERNAME)||
				((CIMProperty)CIM_ProcessIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RECOMMENDEDACTIONS)||
				((CIMProperty)CIM_ProcessIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME)||
				((CIMProperty)CIM_ProcessIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYSTEMNAME)||
				((CIMProperty)CIM_ProcessIndication.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TRENDING)){
				continue;
			}
			
			CIM_AlertIndication.CIM_PropertyList.add(CIM_ProcessIndication.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_ProcessIndication.Java_Package_List.size(); i++) {
			if (((String)CIM_ProcessIndication.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_ProcessIndication.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ALERTTYPE = {"Other","Communications Alert","Quality of Service Alert","Processing Error","Device Alert","Environmental Alert","Model Change","Security Alert"};
	public final static String[] CIM_VALUEMAP_ALERTINGELEMENTFORMAT = {"Unknown","Other","CIMObjectPath"};
	public final static String[] CIM_VALUEMAP_PERCEIVEDSEVERITY = {"Unknown","Other","Information","Degraded/Warning","Minor","Major","Critical","Fatal/NonRecoverable"};
	public final static String[] CIM_VALUEMAP_PROBABLECAUSE = {"Unknown","Other","Adapter/Card Error","Application Subsystem Failure","Bandwidth Reduced","Connection Establishment Error","Communications Protocol Error","Communications Subsystem Failure","Configuration/Customization Error","Congestion","Corrupt Data","CPU Cycles Limit Exceeded","Dataset/Modem Error","Degraded Signal","DTE-DCE Interface Error","Enclosure Door Open","Equipment Malfunction","Excessive Vibration","File Format Error","Fire Detected","Flood Detected","Framing Error","HVAC Problem","Humidity Unacceptable","I/O Device Error","Input Device Error","LAN Error","Non-Toxic Leak Detected","Local Node Transmission Error","Loss of Frame","Loss of Signal","Material Supply Exhausted","Multiplexer Problem","Out of Memory","Output Device Error","Performance Degraded","Power Problem","Pressure Unacceptable","Processor Problem (Internal Machine Error)","Pump Failure","Queue Size Exceeded","Receive Failure","Receiver Failure","Remote Node Transmission Error","Resource at or Nearing Capacity","Response Time Excessive","Retransmission Rate Excessive","Software Error","Software Program Abnormally Terminated","Software Program Error (Incorrect Results)","Storage Capacity Problem","Temperature Unacceptable","Threshold Crossed","Timing Problem","Toxic Leak Detected","Transmit Failure","Transmitter Failure","Underlying Resource Unavailable","Version MisMatch","Previous Alert Cleared","Login Attempts Failed","Software Virus Detected","Hardware Security Breached","Denial of Service Detected","Security Credential MisMatch","Unauthorized Access","Alarm Received","Loss of Pointer","Payload Mismatch","Transmission Error","Excessive Error Rate","Trace Problem","Element Unavailable","Element Missing","Loss of Multi Frame","Broadcast Channel Failure","Invalid Message Received","Routing Failure","Backplane Failure","Identifier Duplication","Protection Path Failure","Sync Loss or Mismatch","Terminal Problem","Real Time Clock Failure","Antenna Failure","Battery Charging Failure","Disk Failure","Frequency Hopping Failure","Loss of Redundancy","Power Supply Failure","Signal Quality Problem","Battery Discharging","Battery Failure","Commercial Power Problem","Fan Failure","Engine Failure","Sensor Failure","Fuse Failure","Generator Failure","Low Battery","Low Fuel","Low Water","Explosive Gas","High Winds","Ice Buildup","Smoke","Memory Mismatch","Out of CPU Cycles","Software Environment Problem","Software Download Failure","Element Reinitialized","Timeout","Logging Problems","Leak Detected","Protection Mechanism Failure","Protecting Resource Failure","Database Inconsistency","Authentication Failure","Breach of Confidentiality","Cable Tamper","Delayed Information","Duplicate Information","Information Missing","Information Modification","Information Out of Sequence","Key Expired","Non-Repudiation Failure","Out of Hours Activity","Out of Service","Procedural Error","Unexpected Information"};
	public final static String[] CIM_VALUEMAP_TRENDING = {"Unknown","Not Applicable","Trending Up","Trending Down","No Change"};
	
	
	public final static int ALERTTYPE_OTHER = 1;
	public final static int ALERTTYPE_COMMUNICATIONSALERT = 2;
	public final static int ALERTTYPE_QUALITYOFSERVICEALERT = 3;
	public final static int ALERTTYPE_PROCESSINGERROR = 4;
	public final static int ALERTTYPE_DEVICEALERT = 5;
	public final static int ALERTTYPE_ENVIRONMENTALALERT = 6;
	public final static int ALERTTYPE_MODELCHANGE = 7;
	public final static int ALERTTYPE_SECURITYALERT = 8;
	
	public final static int ALERTINGELEMENTFORMAT_UNKNOWN = 0;
	public final static int ALERTINGELEMENTFORMAT_OTHER = 1;
	public final static int ALERTINGELEMENTFORMAT_CIMOBJECTPATH = 2;
	
	public final static int PERCEIVEDSEVERITY_UNKNOWN = 0;
	public final static int PERCEIVEDSEVERITY_OTHER = 1;
	public final static int PERCEIVEDSEVERITY_INFORMATION = 2;
	public final static int PERCEIVEDSEVERITY_DEGRADED_WARNING = 3;
	public final static int PERCEIVEDSEVERITY_MINOR = 4;
	public final static int PERCEIVEDSEVERITY_MAJOR = 5;
	public final static int PERCEIVEDSEVERITY_CRITICAL = 6;
	public final static int PERCEIVEDSEVERITY_FATAL_NONRECOVERABLE = 7;
	
	public final static int PROBABLECAUSE_UNKNOWN = 0;
	public final static int PROBABLECAUSE_OTHER = 1;
	public final static int PROBABLECAUSE_ADAPTER_CARDERROR = 2;
	public final static int PROBABLECAUSE_APPLICATIONSUBSYSTEMFAILURE = 3;
	public final static int PROBABLECAUSE_BANDWIDTHREDUCED = 4;
	public final static int PROBABLECAUSE_CONNECTIONESTABLISHMENTERROR = 5;
	public final static int PROBABLECAUSE_COMMUNICATIONSPROTOCOLERROR = 6;
	public final static int PROBABLECAUSE_COMMUNICATIONSSUBSYSTEMFAILURE = 7;
	public final static int PROBABLECAUSE_CONFIGURATION_CUSTOMIZATIONERROR = 8;
	public final static int PROBABLECAUSE_CONGESTION = 9;
	public final static int PROBABLECAUSE_CORRUPTDATA = 10;
	public final static int PROBABLECAUSE_CPUCYCLESLIMITEXCEEDED = 11;
	public final static int PROBABLECAUSE_DATASET_MODEMERROR = 12;
	public final static int PROBABLECAUSE_DEGRADEDSIGNAL = 13;
	public final static int PROBABLECAUSE_DTE_DCEINTERFACEERROR = 14;
	public final static int PROBABLECAUSE_ENCLOSUREDOOROPEN = 15;
	public final static int PROBABLECAUSE_EQUIPMENTMALFUNCTION = 16;
	public final static int PROBABLECAUSE_EXCESSIVEVIBRATION = 17;
	public final static int PROBABLECAUSE_FILEFORMATERROR = 18;
	public final static int PROBABLECAUSE_FIREDETECTED = 19;
	public final static int PROBABLECAUSE_FLOODDETECTED = 20;
	public final static int PROBABLECAUSE_FRAMINGERROR = 21;
	public final static int PROBABLECAUSE_HVACPROBLEM = 22;
	public final static int PROBABLECAUSE_HUMIDITYUNACCEPTABLE = 23;
	public final static int PROBABLECAUSE_I_ODEVICEERROR = 24;
	public final static int PROBABLECAUSE_INPUTDEVICEERROR = 25;
	public final static int PROBABLECAUSE_LANERROR = 26;
	public final static int PROBABLECAUSE_NON_TOXICLEAKDETECTED = 27;
	public final static int PROBABLECAUSE_LOCALNODETRANSMISSIONERROR = 28;
	public final static int PROBABLECAUSE_LOSSOFFRAME = 29;
	public final static int PROBABLECAUSE_LOSSOFSIGNAL = 30;
	public final static int PROBABLECAUSE_MATERIALSUPPLYEXHAUSTED = 31;
	public final static int PROBABLECAUSE_MULTIPLEXERPROBLEM = 32;
	public final static int PROBABLECAUSE_OUTOFMEMORY = 33;
	public final static int PROBABLECAUSE_OUTPUTDEVICEERROR = 34;
	public final static int PROBABLECAUSE_PERFORMANCEDEGRADED = 35;
	public final static int PROBABLECAUSE_POWERPROBLEM = 36;
	public final static int PROBABLECAUSE_PRESSUREUNACCEPTABLE = 37;
	public final static int PROBABLECAUSE_PROCESSORPROBLEMINTERNALMACHINEERROR = 38;
	public final static int PROBABLECAUSE_PUMPFAILURE = 39;
	public final static int PROBABLECAUSE_QUEUESIZEEXCEEDED = 40;
	public final static int PROBABLECAUSE_RECEIVEFAILURE = 41;
	public final static int PROBABLECAUSE_RECEIVERFAILURE = 42;
	public final static int PROBABLECAUSE_REMOTENODETRANSMISSIONERROR = 43;
	public final static int PROBABLECAUSE_RESOURCEATORNEARINGCAPACITY = 44;
	public final static int PROBABLECAUSE_RESPONSETIMEEXCESSIVE = 45;
	public final static int PROBABLECAUSE_RETRANSMISSIONRATEEXCESSIVE = 46;
	public final static int PROBABLECAUSE_SOFTWAREERROR = 47;
	public final static int PROBABLECAUSE_SOFTWAREPROGRAMABNORMALLYTERMINATED = 48;
	public final static int PROBABLECAUSE_SOFTWAREPROGRAMERRORINCORRECTRESULTS = 49;
	public final static int PROBABLECAUSE_STORAGECAPACITYPROBLEM = 50;
	public final static int PROBABLECAUSE_TEMPERATUREUNACCEPTABLE = 51;
	public final static int PROBABLECAUSE_THRESHOLDCROSSED = 52;
	public final static int PROBABLECAUSE_TIMINGPROBLEM = 53;
	public final static int PROBABLECAUSE_TOXICLEAKDETECTED = 54;
	public final static int PROBABLECAUSE_TRANSMITFAILURE = 55;
	public final static int PROBABLECAUSE_TRANSMITTERFAILURE = 56;
	public final static int PROBABLECAUSE_UNDERLYINGRESOURCEUNAVAILABLE = 57;
	public final static int PROBABLECAUSE_VERSIONMISMATCH = 58;
	public final static int PROBABLECAUSE_PREVIOUSALERTCLEARED = 59;
	public final static int PROBABLECAUSE_LOGINATTEMPTSFAILED = 60;
	public final static int PROBABLECAUSE_SOFTWAREVIRUSDETECTED = 61;
	public final static int PROBABLECAUSE_HARDWARESECURITYBREACHED = 62;
	public final static int PROBABLECAUSE_DENIALOFSERVICEDETECTED = 63;
	public final static int PROBABLECAUSE_SECURITYCREDENTIALMISMATCH = 64;
	public final static int PROBABLECAUSE_UNAUTHORIZEDACCESS = 65;
	public final static int PROBABLECAUSE_ALARMRECEIVED = 66;
	public final static int PROBABLECAUSE_LOSSOFPOINTER = 67;
	public final static int PROBABLECAUSE_PAYLOADMISMATCH = 68;
	public final static int PROBABLECAUSE_TRANSMISSIONERROR = 69;
	public final static int PROBABLECAUSE_EXCESSIVEERRORRATE = 70;
	public final static int PROBABLECAUSE_TRACEPROBLEM = 71;
	public final static int PROBABLECAUSE_ELEMENTUNAVAILABLE = 72;
	public final static int PROBABLECAUSE_ELEMENTMISSING = 73;
	public final static int PROBABLECAUSE_LOSSOFMULTIFRAME = 74;
	public final static int PROBABLECAUSE_BROADCASTCHANNELFAILURE = 75;
	public final static int PROBABLECAUSE_INVALIDMESSAGERECEIVED = 76;
	public final static int PROBABLECAUSE_ROUTINGFAILURE = 77;
	public final static int PROBABLECAUSE_BACKPLANEFAILURE = 78;
	public final static int PROBABLECAUSE_IDENTIFIERDUPLICATION = 79;
	public final static int PROBABLECAUSE_PROTECTIONPATHFAILURE = 80;
	public final static int PROBABLECAUSE_SYNCLOSSORMISMATCH = 81;
	public final static int PROBABLECAUSE_TERMINALPROBLEM = 82;
	public final static int PROBABLECAUSE_REALTIMECLOCKFAILURE = 83;
	public final static int PROBABLECAUSE_ANTENNAFAILURE = 84;
	public final static int PROBABLECAUSE_BATTERYCHARGINGFAILURE = 85;
	public final static int PROBABLECAUSE_DISKFAILURE = 86;
	public final static int PROBABLECAUSE_FREQUENCYHOPPINGFAILURE = 87;
	public final static int PROBABLECAUSE_LOSSOFREDUNDANCY = 88;
	public final static int PROBABLECAUSE_POWERSUPPLYFAILURE = 89;
	public final static int PROBABLECAUSE_SIGNALQUALITYPROBLEM = 90;
	public final static int PROBABLECAUSE_BATTERYDISCHARGING = 91;
	public final static int PROBABLECAUSE_BATTERYFAILURE = 92;
	public final static int PROBABLECAUSE_COMMERCIALPOWERPROBLEM = 93;
	public final static int PROBABLECAUSE_FANFAILURE = 94;
	public final static int PROBABLECAUSE_ENGINEFAILURE = 95;
	public final static int PROBABLECAUSE_SENSORFAILURE = 96;
	public final static int PROBABLECAUSE_FUSEFAILURE = 97;
	public final static int PROBABLECAUSE_GENERATORFAILURE = 98;
	public final static int PROBABLECAUSE_LOWBATTERY = 99;
	public final static int PROBABLECAUSE_LOWFUEL = 100;
	public final static int PROBABLECAUSE_LOWWATER = 101;
	public final static int PROBABLECAUSE_EXPLOSIVEGAS = 102;
	public final static int PROBABLECAUSE_HIGHWINDS = 103;
	public final static int PROBABLECAUSE_ICEBUILDUP = 104;
	public final static int PROBABLECAUSE_SMOKE = 105;
	public final static int PROBABLECAUSE_MEMORYMISMATCH = 106;
	public final static int PROBABLECAUSE_OUTOFCPUCYCLES = 107;
	public final static int PROBABLECAUSE_SOFTWAREENVIRONMENTPROBLEM = 108;
	public final static int PROBABLECAUSE_SOFTWAREDOWNLOADFAILURE = 109;
	public final static int PROBABLECAUSE_ELEMENTREINITIALIZED = 110;
	public final static int PROBABLECAUSE_TIMEOUT = 111;
	public final static int PROBABLECAUSE_LOGGINGPROBLEMS = 112;
	public final static int PROBABLECAUSE_LEAKDETECTED = 113;
	public final static int PROBABLECAUSE_PROTECTIONMECHANISMFAILURE = 114;
	public final static int PROBABLECAUSE_PROTECTINGRESOURCEFAILURE = 115;
	public final static int PROBABLECAUSE_DATABASEINCONSISTENCY = 116;
	public final static int PROBABLECAUSE_AUTHENTICATIONFAILURE = 117;
	public final static int PROBABLECAUSE_BREACHOFCONFIDENTIALITY = 118;
	public final static int PROBABLECAUSE_CABLETAMPER = 119;
	public final static int PROBABLECAUSE_DELAYEDINFORMATION = 120;
	public final static int PROBABLECAUSE_DUPLICATEINFORMATION = 121;
	public final static int PROBABLECAUSE_INFORMATIONMISSING = 122;
	public final static int PROBABLECAUSE_INFORMATIONMODIFICATION = 123;
	public final static int PROBABLECAUSE_INFORMATIONOUTOFSEQUENCE = 124;
	public final static int PROBABLECAUSE_KEYEXPIRED = 125;
	public final static int PROBABLECAUSE_NON_REPUDIATIONFAILURE = 126;
	public final static int PROBABLECAUSE_OUTOFHOURSACTIVITY = 127;
	public final static int PROBABLECAUSE_OUTOFSERVICE = 128;
	public final static int PROBABLECAUSE_PROCEDURALERROR = 129;
	public final static int PROBABLECAUSE_UNEXPECTEDINFORMATION = 130;
	
	public final static int TRENDING_UNKNOWN = 0;
	public final static int TRENDING_NOTAPPLICABLE = 1;
	public final static int TRENDING_TRENDINGUP = 2;
	public final static int TRENDING_TRENDINGDOWN = 3;
	public final static int TRENDING_NOCHANGE = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_AlertIndication() {

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
	public CIM_AlertIndication(Vector keyProperties){ 
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
	public CIM_AlertIndication(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_AlertType = this.cimInstance.getProperty(CIM_PROPERTY_ALERTTYPE);
		
		if (CIMProperty_AlertType == null || CIMProperty_AlertType.getValue().isEmpty() || CIMProperty_AlertType.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_ALERTTYPE, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_PerceivedSeverity = this.cimInstance.getProperty(CIM_PROPERTY_PERCEIVEDSEVERITY);
		
		if (CIMProperty_PerceivedSeverity == null || CIMProperty_PerceivedSeverity.getValue().isEmpty() || CIMProperty_PerceivedSeverity.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_PERCEIVEDSEVERITY, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_ProbableCause = this.cimInstance.getProperty(CIM_PROPERTY_PROBABLECAUSE);
		
		if (CIMProperty_ProbableCause == null || CIMProperty_ProbableCause.getValue().isEmpty() || CIMProperty_ProbableCause.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_PROBABLECAUSE, "Required"});
			result = false;
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
	    
	    if (!(object instanceof CIM_AlertIndication)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_AlertIndication)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_AlertIndication)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_AlertIndication)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_AlertIndication)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_AlertIndication)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_AlertIndication)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_AlertIndication)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_AlertIndication)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_AlertIndication)object).cimObjectPath)) {
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
	
	// Attribute AlertType
	
	public UnsignedInt16 get_AlertType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_ALERTTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_ALERTTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_ALERTTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AlertType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_ALERTTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_ALERTTYPE + " could not be found");
    		
		} else if (!CIM_AlertIndicationHelper.isValid_AlertType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AlertIndication.CIM_PROPERTY_ALERTTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_ALERTTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AlertingElementFormat
	
	public UnsignedInt16 get_AlertingElementFormat() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_ALERTINGELEMENTFORMAT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_ALERTINGELEMENTFORMAT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_ALERTINGELEMENTFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AlertingElementFormat(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_ALERTINGELEMENTFORMAT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_ALERTINGELEMENTFORMAT + " could not be found");
    		
		} else if (!CIM_AlertIndicationHelper.isValid_AlertingElementFormat(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AlertIndication.CIM_PROPERTY_ALERTINGELEMENTFORMAT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_ALERTINGELEMENTFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AlertingManagedElement
	
	public String get_AlertingManagedElement() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_ALERTINGMANAGEDELEMENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_ALERTINGMANAGEDELEMENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_ALERTINGMANAGEDELEMENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AlertingManagedElement(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_ALERTINGMANAGEDELEMENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_ALERTINGMANAGEDELEMENT + " could not be found");
    		
		} else if (!CIM_AlertIndicationHelper.isValid_AlertingManagedElement(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AlertIndication.CIM_PROPERTY_ALERTINGMANAGEDELEMENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_ALERTINGMANAGEDELEMENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Description
	
	public String get_Description() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_DESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_DESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_DESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Description(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_DESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_DESCRIPTION + " could not be found");
    		
		} else if (!CIM_AlertIndicationHelper.isValid_Description(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AlertIndication.CIM_PROPERTY_DESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_DESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EventID
	
	public String get_EventID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_EVENTID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_EVENTID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_EVENTID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EventID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_EVENTID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_EVENTID + " could not be found");
    		
		} else if (!CIM_AlertIndicationHelper.isValid_EventID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AlertIndication.CIM_PROPERTY_EVENTID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_EVENTID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EventTime
	
	public Calendar get_EventTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_EVENTTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_EVENTTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_EVENTTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_EventTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_EVENTTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_EVENTTIME + " could not be found");
    		
		} else if (!CIM_AlertIndicationHelper.isValid_EventTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AlertIndication.CIM_PROPERTY_EVENTTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_EVENTTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute OtherAlertType
	
	public String get_OtherAlertType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_OTHERALERTTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_OTHERALERTTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_OTHERALERTTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherAlertType(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_OTHERALERTTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_OTHERALERTTYPE + " could not be found");
    		
		} else if (!CIM_AlertIndicationHelper.isValid_OtherAlertType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AlertIndication.CIM_PROPERTY_OTHERALERTTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_OTHERALERTTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherAlertingElementFormat
	
	public String get_OtherAlertingElementFormat() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_OTHERALERTINGELEMENTFORMAT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_OTHERALERTINGELEMENTFORMAT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_OTHERALERTINGELEMENTFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherAlertingElementFormat(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_OTHERALERTINGELEMENTFORMAT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_OTHERALERTINGELEMENTFORMAT + " could not be found");
    		
		} else if (!CIM_AlertIndicationHelper.isValid_OtherAlertingElementFormat(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AlertIndication.CIM_PROPERTY_OTHERALERTINGELEMENTFORMAT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_OTHERALERTINGELEMENTFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PerceivedSeverity
	
	public UnsignedInt16 get_PerceivedSeverity() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_PERCEIVEDSEVERITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_PERCEIVEDSEVERITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_PERCEIVEDSEVERITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PerceivedSeverity(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_PERCEIVEDSEVERITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_PERCEIVEDSEVERITY + " could not be found");
    		
		} else if (!CIM_AlertIndicationHelper.isValid_PerceivedSeverity(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AlertIndication.CIM_PROPERTY_PERCEIVEDSEVERITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_PERCEIVEDSEVERITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProbableCause
	
	public UnsignedInt16 get_ProbableCause() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_PROBABLECAUSE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_PROBABLECAUSE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_PROBABLECAUSE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProbableCause(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_PROBABLECAUSE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_PROBABLECAUSE + " could not be found");
    		
		} else if (!CIM_AlertIndicationHelper.isValid_ProbableCause(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AlertIndication.CIM_PROPERTY_PROBABLECAUSE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_PROBABLECAUSE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProbableCauseDescription
	
	public String get_ProbableCauseDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_PROBABLECAUSEDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_PROBABLECAUSEDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_PROBABLECAUSEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProbableCauseDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_PROBABLECAUSEDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_PROBABLECAUSEDESCRIPTION + " could not be found");
    		
		} else if (!CIM_AlertIndicationHelper.isValid_ProbableCauseDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AlertIndication.CIM_PROPERTY_PROBABLECAUSEDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_PROBABLECAUSEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProviderName
	
	public String get_ProviderName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_PROVIDERNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_PROVIDERNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_PROVIDERNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProviderName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_PROVIDERNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_PROVIDERNAME + " could not be found");
    		
		} else if (!CIM_AlertIndicationHelper.isValid_ProviderName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AlertIndication.CIM_PROPERTY_PROVIDERNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_PROVIDERNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RecommendedActions
	
	public String[] get_RecommendedActions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_RECOMMENDEDACTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_RECOMMENDEDACTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_RECOMMENDEDACTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_RecommendedActions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_RECOMMENDEDACTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_RECOMMENDEDACTIONS + " could not be found");
    		
		} else if (!CIM_AlertIndicationHelper.isValid_RecommendedActions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AlertIndication.CIM_PROPERTY_RECOMMENDEDACTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_RECOMMENDEDACTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SystemCreationClassName
	
	public String get_SystemCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SystemCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_AlertIndicationHelper.isValid_SystemCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AlertIndication.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SystemName
	
	public String get_SystemName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_SYSTEMNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_SYSTEMNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_SYSTEMNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SystemName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_SYSTEMNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_SYSTEMNAME + " could not be found");
    		
		} else if (!CIM_AlertIndicationHelper.isValid_SystemName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AlertIndication.CIM_PROPERTY_SYSTEMNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_SYSTEMNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Trending
	
	public UnsignedInt16 get_Trending() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_TRENDING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_TRENDING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_TRENDING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Trending(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AlertIndication.CIM_PROPERTY_TRENDING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AlertIndication.CIM_PROPERTY_TRENDING + " could not be found");
    		
		} else if (!CIM_AlertIndicationHelper.isValid_Trending(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AlertIndication.CIM_PROPERTY_TRENDING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AlertIndication.CIM_PROPERTY_TRENDING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
