/** 
 * CIM_TokenRingAdapter.java
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
 * Description: The use of the CIM_TokenRingAdapter class has been deprecated, consistent with NetworkAdapter. Instead use the CIM_TokenRingPort class. This class describes the capabilities and management aspects of a TokenRingAdapter.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_TokenRingAdapter extends CIM_NetworkAdapter  {
	
	public final static String CIM_CLASS_NAME = "CIM_TokenRingAdapter";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	This counter is incremented when a station receives an AMP or SMP frame in which A is equal to C is equal to 0, and then receives another SMP frame with A equal to C equal to 0 without first receiving an AMP frame. It denotes a station that cannot set the AC bits properly.
	*/
	public final static String CIM_PROPERTY_ACERRORS = "ACErrors"; //$NON-NLS-1$
	/**
	*	This counter is incremented when a station transmits an abort delimiter while transmitting data.
	*/
	public final static String CIM_PROPERTY_ABORTTRANSERRORS = "AbortTransErrors"; //$NON-NLS-1$
	/**
	*	This counter is incremented when a station detects the absence of transitions for five half-bit timers (burst-five errors).
	*/
	public final static String CIM_PROPERTY_BURSTERRORS = "BurstErrors"; //$NON-NLS-1$
	/**
	*	Capabilities of the TokenRingAdapter. For example, the Device may support AlertOnLan, WakeOnLan, Load Balancing and/or Failover. If failover or load balancing capabilities are listed, a SpareGroup (failover) or ExtraCapacityGroup (load balancing) should also be defined to completely describe the capability.
	*/
	public final static String CIM_PROPERTY_CAPABILITIES = "Capabilities"; //$NON-NLS-1$
	/**
	*	An array of free-form strings providing more detailed explanations for any of the TokenRingAdapter features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
	*/
	public final static String CIM_PROPERTY_CAPABILITYDESCRIPTIONS = "CapabilityDescriptions"; //$NON-NLS-1$
	/**
	*	Specifies which of the capabilities from the "Capabilities" property are currently enabled.
	*/
	public final static String CIM_PROPERTY_ENABLEDCAPABILITIES = "EnabledCapabilities"; //$NON-NLS-1$
	/**
	*	This counter is incremented when a station recognizes a frame addressed to its specific address and detects that the FS field A bits are set to 1 indicating a possible line hit or duplicate address.
	*/
	public final static String CIM_PROPERTY_FRAMECOPIEDERRORS = "FrameCopiedErrors"; //$NON-NLS-1$
	/**
	*	The number of times the Device has detected that the frequency of the incoming signal differs from the expected frequency by more than that specified by the IEEE 802.5 standard.
	*/
	public final static String CIM_PROPERTY_FREQUENCYERRORS = "FrequencyErrors"; //$NON-NLS-1$
	/**
	*	The number of times this Device has detected an immediately recoverable fatal error. It denotes the number of times this Device is either transmitting or receiving beacon MAC frames.
	*/
	public final static String CIM_PROPERTY_HARDERRORS = "HardErrors"; //$NON-NLS-1$
	/**
	*	This counter is incremented when a station recognizes an internal error.
	*/
	public final static String CIM_PROPERTY_INTERNALERRORS = "InternalErrors"; //$NON-NLS-1$
	/**
	*	The number of times the Device has detected an open or short circuit in the lobe data path. The adapter will be closed and RingState will signify this condition.
	*/
	public final static String CIM_PROPERTY_LOBEWIRES = "LobeWires"; //$NON-NLS-1$
	/**
	*	This counter is incremented when a station is transmitting and its TRR timer expires. This denotes a condition where a transmitting station in strip mode does not receive the trailer of the frame before the TRR timer goes off.
	*/
	public final static String CIM_PROPERTY_LOSTFRAMEERRORS = "LostFrameErrors"; //$NON-NLS-1$
	/**
	*	The maximum size of the INFO (non-MAC) field that will be received or transmitted.
	*/
	public final static String CIM_PROPERTY_MAXDATASIZE = "MaxDataSize"; //$NON-NLS-1$
	/**
	*	Token Ring/802.5 MAC addresses formatted as twelve hexadecimal digits (e.g. "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order. (Thus, the Group address bit is found in the low order bit of the first character of the string.)
	*/
	public final static String CIM_PROPERTY_NETWORKADDRESSES = "NetworkAddresses"; //$NON-NLS-1$
	/**
	*	This counter is incremented when a station recognizes a frame addressed to its specific address, but has no available buffer space - indicating that the station is congested.
	*/
	public final static String CIM_PROPERTY_RECEIVECONGESTIONS = "ReceiveCongestions"; //$NON-NLS-1$
	/**
	*	The number of Claim Token MAC frames received or transmitted after the Device has received a Ring Purge MAC frame. This counter signifies the number of times the ring has been purged and is being recovered back into a normal operating state.
	*/
	public final static String CIM_PROPERTY_RECOVERYS = "Recoverys"; //$NON-NLS-1$
	/**
	*	The number of times the Device has received a Remove Ring Station MAC frame request. When this frame is received, the Device will enter the close state and RingState will signify this condition.
	*/
	public final static String CIM_PROPERTY_REMOVES = "Removes"; //$NON-NLS-1$
	/**
	*	This property indicates the success, or the reason for failure, of the station's most recent attempt to enter the ring.
	*/
	public final static String CIM_PROPERTY_RINGOPENSTATUS = "RingOpenStatus"; //$NON-NLS-1$
	/**
	*	The ring's bandwidth.
	*/
	public final static String CIM_PROPERTY_RINGSPEED = "RingSpeed"; //$NON-NLS-1$
	/**
	*	The current Device state with respect to entering or leaving the ring.
	*/
	public final static String CIM_PROPERTY_RINGSTATE = "RingState"; //$NON-NLS-1$
	/**
	*	The current status which can be used to diagnose fluctuating problems that can occur on token rings, after a station has successfully been added to the ring. Before an open is completed, this object contains the value indicating "no status" (131072). (The RingState and RingOpenStatus properties are also provided for debugging problems when the station can not even enter the ring.) The property's value is a sum of values, one for each currently applicable condition. The following values are defined for various conditions: 
0= No Problems Detected, 32= Ring Recovery, 64= Single Station, 256= Remove Received, 512= Reserved, 1024= Auto-Removal Error, 2048= Lobe Wire Fault, 4096= Transmit Beacon, 8192= Soft Error, 16384= Hard Error, 32768= Signal Loss, 131072= No Status, Open Not Completed.
	*/
	public final static String CIM_PROPERTY_RINGSTATUS = "RingStatus"; //$NON-NLS-1$
	/**
	*	The number of times this Device has detected the loss of signal condition from the ring.
	*/
	public final static String CIM_PROPERTY_SIGNALLOSSCOUNT = "SignalLossCount"; //$NON-NLS-1$
	/**
	*	The number of times the Device has sensed that it is the only station on the ring. This will happen if the Device is the first one up on a ring, or if there is a hardware problem.
	*/
	public final static String CIM_PROPERTY_SINGLES = "Singles"; //$NON-NLS-1$
	/**
	*	The number of Soft Errors that the Device has detected. It directly corresponds to the number of Report Error MAC frames that this Device has transmitted. Soft Errors are those which are recoverable by the MAC layer protocols.
	*/
	public final static String CIM_PROPERTY_SOFTERRORS = "SoftErrors"; //$NON-NLS-1$
	/**
	*	This counter is incremented when a station acting as the active monitor recognizes an error condition that needs a token transmitted.
	*/
	public final static String CIM_PROPERTY_TOKENERRORS = "TokenErrors"; //$NON-NLS-1$
	/**
	*	The number of times this Device has transmitted a beacon frame.
	*/
	public final static String CIM_PROPERTY_TRANSMITTEDBEACONS = "TransmittedBeacons"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ACERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_ABORTTRANSERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_BURSTERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CAPABILITIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_ENABLEDCAPABILITIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_FRAMECOPIEDERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_FREQUENCYERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_HARDERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_INTERNALERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOBEWIRES);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOSTFRAMEERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXDATASIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_NETWORKADDRESSES);
		CIM_PropertyNameList.add(CIM_PROPERTY_RECEIVECONGESTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_RECOVERYS);
		CIM_PropertyNameList.add(CIM_PROPERTY_REMOVES);
		CIM_PropertyNameList.add(CIM_PROPERTY_RINGOPENSTATUS);
		CIM_PropertyNameList.add(CIM_PROPERTY_RINGSPEED);
		CIM_PropertyNameList.add(CIM_PROPERTY_RINGSTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_RINGSTATUS);
		CIM_PropertyNameList.add(CIM_PROPERTY_SIGNALLOSSCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_SINGLES);
		CIM_PropertyNameList.add(CIM_PROPERTY_SOFTERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_TOKENERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_TRANSMITTEDBEACONS);
				
		for (int i = 0; i < CIM_NetworkAdapter.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACERRORS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ABORTTRANSERRORS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BURSTERRORS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CAPABILITIES)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CAPABILITYDESCRIPTIONS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ENABLEDCAPABILITIES)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FRAMECOPIEDERRORS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FREQUENCYERRORS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HARDERRORS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INTERNALERRORS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOBEWIRES)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOSTFRAMEERRORS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXDATASIZE)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NETWORKADDRESSES)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RECEIVECONGESTIONS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RECOVERYS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REMOVES)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RINGOPENSTATUS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RINGSPEED)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RINGSTATE)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RINGSTATUS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SIGNALLOSSCOUNT)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SINGLES)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SOFTERRORS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TOKENERRORS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TRANSMITTEDBEACONS)){
				continue;
			}
			
			CIM_TokenRingAdapter.CIM_PropertyNameList.add(CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ABORTTRANSERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BURSTERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CAPABILITIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CAPABILITYDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ENABLEDCAPABILITIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FRAMECOPIEDERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FREQUENCYERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HARDERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INTERNALERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOBEWIRES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOSTFRAMEERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXDATASIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NETWORKADDRESSES, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RECEIVECONGESTIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RECOVERYS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REMOVES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RINGOPENSTATUS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RINGSPEED, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RINGSTATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RINGSTATUS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SIGNALLOSSCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SINGLES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SOFTERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TOKENERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TRANSMITTEDBEACONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
				
		for (int i = 0; i < CIM_NetworkAdapter.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACERRORS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ABORTTRANSERRORS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BURSTERRORS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CAPABILITIES)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CAPABILITYDESCRIPTIONS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ENABLEDCAPABILITIES)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FRAMECOPIEDERRORS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FREQUENCYERRORS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HARDERRORS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INTERNALERRORS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOBEWIRES)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOSTFRAMEERRORS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXDATASIZE)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NETWORKADDRESSES)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RECEIVECONGESTIONS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RECOVERYS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REMOVES)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RINGOPENSTATUS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RINGSPEED)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RINGSTATE)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RINGSTATUS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SIGNALLOSSCOUNT)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SINGLES)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SOFTERRORS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TOKENERRORS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TRANSMITTEDBEACONS)){
				continue;
			}
			
			CIM_TokenRingAdapter.CIM_PropertyList.add(CIM_NetworkAdapter.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_NetworkAdapter.Java_Package_List.size(); i++) {
			if (((String)CIM_NetworkAdapter.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_NetworkAdapter.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_CAPABILITIES = {"Unknown","Other","AlertOnLan","WakeOnLan","FailOver","LoadBalancing"};
	public final static String[] CIM_VALUEMAP_ENABLEDCAPABILITIES = {"Unknown","Other","AlertOnLan","WakeOnLan","FailOver","LoadBalancing"};
	public final static String[] CIM_VALUEMAP_RINGOPENSTATUS = {"No Open Attempted","Bad Parameter","Lobe Failed","Signal Loss","Insertion Timeout","Ring Failed","Beaconing","Duplicate MAC","Request Failed","Remove Received","Last Open Successful"};
	public final static String[] CIM_VALUEMAP_RINGSPEED = {"Unknown","Other","One Megabit","Four Megabit","Sixteen Megabit"};
	public final static String[] CIM_VALUEMAP_RINGSTATE = {"Opened","Closed","Opening","Closing","Open Failure","Ring Failure"};
	
	
	public final static int CAPABILITIES_UNKNOWN = 0;
	public final static int CAPABILITIES_OTHER = 1;
	public final static int CAPABILITIES_ALERTONLAN = 2;
	public final static int CAPABILITIES_WAKEONLAN = 3;
	public final static int CAPABILITIES_FAILOVER = 4;
	public final static int CAPABILITIES_LOADBALANCING = 5;
	
	public final static int ENABLEDCAPABILITIES_UNKNOWN = 0;
	public final static int ENABLEDCAPABILITIES_OTHER = 1;
	public final static int ENABLEDCAPABILITIES_ALERTONLAN = 2;
	public final static int ENABLEDCAPABILITIES_WAKEONLAN = 3;
	public final static int ENABLEDCAPABILITIES_FAILOVER = 4;
	public final static int ENABLEDCAPABILITIES_LOADBALANCING = 5;
	
	public final static int RINGOPENSTATUS_NOOPENATTEMPTED = 0;
	public final static int RINGOPENSTATUS_BADPARAMETER = 1;
	public final static int RINGOPENSTATUS_LOBEFAILED = 2;
	public final static int RINGOPENSTATUS_SIGNALLOSS = 3;
	public final static int RINGOPENSTATUS_INSERTIONTIMEOUT = 4;
	public final static int RINGOPENSTATUS_RINGFAILED = 5;
	public final static int RINGOPENSTATUS_BEACONING = 6;
	public final static int RINGOPENSTATUS_DUPLICATEMAC = 7;
	public final static int RINGOPENSTATUS_REQUESTFAILED = 8;
	public final static int RINGOPENSTATUS_REMOVERECEIVED = 9;
	public final static int RINGOPENSTATUS_LASTOPENSUCCESSFUL = 10;
	
	public final static int RINGSPEED_UNKNOWN = 0;
	public final static int RINGSPEED_OTHER = 1;
	public final static int RINGSPEED_ONEMEGABIT = 2;
	public final static int RINGSPEED_FOURMEGABIT = 3;
	public final static int RINGSPEED_SIXTEENMEGABIT = 4;
	
	public final static int RINGSTATE_OPENED = 0;
	public final static int RINGSTATE_CLOSED = 1;
	public final static int RINGSTATE_OPENING = 2;
	public final static int RINGSTATE_CLOSING = 3;
	public final static int RINGSTATE_OPENFAILURE = 4;
	public final static int RINGSTATE_RINGFAILURE = 5;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_TokenRingAdapter() {

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
	public CIM_TokenRingAdapter(Vector keyProperties){ 
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
	public CIM_TokenRingAdapter(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_TokenRingAdapter)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_TokenRingAdapter)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_TokenRingAdapter)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_TokenRingAdapter)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_TokenRingAdapter)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_TokenRingAdapter)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_TokenRingAdapter)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_TokenRingAdapter)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_TokenRingAdapter)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_TokenRingAdapter)object).cimObjectPath)) {
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
	
	// Attribute ACErrors
	
	public UnsignedInt32 get_ACErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_ACERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_ACERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_ACERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ACErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_ACERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_ACERRORS + " could not be found");
    		
		} else if (!CIM_TokenRingAdapterHelper.isValid_ACErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingAdapter.CIM_PROPERTY_ACERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_ACERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AbortTransErrors
	
	public UnsignedInt32 get_AbortTransErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_ABORTTRANSERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_ABORTTRANSERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_ABORTTRANSERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AbortTransErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_ABORTTRANSERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_ABORTTRANSERRORS + " could not be found");
    		
		} else if (!CIM_TokenRingAdapterHelper.isValid_AbortTransErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingAdapter.CIM_PROPERTY_ABORTTRANSERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_ABORTTRANSERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BurstErrors
	
	public UnsignedInt32 get_BurstErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_BURSTERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_BURSTERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_BURSTERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BurstErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_BURSTERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_BURSTERRORS + " could not be found");
    		
		} else if (!CIM_TokenRingAdapterHelper.isValid_BurstErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingAdapter.CIM_PROPERTY_BURSTERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_BURSTERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Capabilities
	
	public UnsignedInt16[] get_Capabilities() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_CAPABILITIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_CAPABILITIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_CAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_Capabilities(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_CAPABILITIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_CAPABILITIES + " could not be found");
    		
		} else if (!CIM_TokenRingAdapterHelper.isValid_Capabilities(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingAdapter.CIM_PROPERTY_CAPABILITIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_CAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CapabilityDescriptions
	
	public String[] get_CapabilityDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_CapabilityDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_TokenRingAdapterHelper.isValid_CapabilityDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingAdapter.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EnabledCapabilities
	
	public UnsignedInt16[] get_EnabledCapabilities() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_ENABLEDCAPABILITIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_ENABLEDCAPABILITIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_ENABLEDCAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_EnabledCapabilities(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_ENABLEDCAPABILITIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_ENABLEDCAPABILITIES + " could not be found");
    		
		} else if (!CIM_TokenRingAdapterHelper.isValid_EnabledCapabilities(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingAdapter.CIM_PROPERTY_ENABLEDCAPABILITIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_ENABLEDCAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FrameCopiedErrors
	
	public UnsignedInt32 get_FrameCopiedErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_FRAMECOPIEDERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_FRAMECOPIEDERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_FRAMECOPIEDERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FrameCopiedErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_FRAMECOPIEDERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_FRAMECOPIEDERRORS + " could not be found");
    		
		} else if (!CIM_TokenRingAdapterHelper.isValid_FrameCopiedErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingAdapter.CIM_PROPERTY_FRAMECOPIEDERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_FRAMECOPIEDERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FrequencyErrors
	
	public UnsignedInt32 get_FrequencyErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_FREQUENCYERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_FREQUENCYERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_FREQUENCYERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FrequencyErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_FREQUENCYERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_FREQUENCYERRORS + " could not be found");
    		
		} else if (!CIM_TokenRingAdapterHelper.isValid_FrequencyErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingAdapter.CIM_PROPERTY_FREQUENCYERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_FREQUENCYERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HardErrors
	
	public UnsignedInt32 get_HardErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_HARDERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_HARDERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_HARDERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HardErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_HARDERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_HARDERRORS + " could not be found");
    		
		} else if (!CIM_TokenRingAdapterHelper.isValid_HardErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingAdapter.CIM_PROPERTY_HARDERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_HARDERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InternalErrors
	
	public UnsignedInt32 get_InternalErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_INTERNALERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_INTERNALERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_INTERNALERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InternalErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_INTERNALERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_INTERNALERRORS + " could not be found");
    		
		} else if (!CIM_TokenRingAdapterHelper.isValid_InternalErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingAdapter.CIM_PROPERTY_INTERNALERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_INTERNALERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LobeWires
	
	public UnsignedInt32 get_LobeWires() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_LOBEWIRES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_LOBEWIRES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_LOBEWIRES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LobeWires(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_LOBEWIRES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_LOBEWIRES + " could not be found");
    		
		} else if (!CIM_TokenRingAdapterHelper.isValid_LobeWires(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingAdapter.CIM_PROPERTY_LOBEWIRES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_LOBEWIRES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LostFrameErrors
	
	public UnsignedInt32 get_LostFrameErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_LOSTFRAMEERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_LOSTFRAMEERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_LOSTFRAMEERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LostFrameErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_LOSTFRAMEERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_LOSTFRAMEERRORS + " could not be found");
    		
		} else if (!CIM_TokenRingAdapterHelper.isValid_LostFrameErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingAdapter.CIM_PROPERTY_LOSTFRAMEERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_LOSTFRAMEERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxDataSize
	
	public UnsignedInt32 get_MaxDataSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_MAXDATASIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_MAXDATASIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_MAXDATASIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxDataSize(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_MAXDATASIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_MAXDATASIZE + " could not be found");
    		
		} else if (!CIM_TokenRingAdapterHelper.isValid_MaxDataSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingAdapter.CIM_PROPERTY_MAXDATASIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_MAXDATASIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NetworkAddresses
	
	public String[] get_NetworkAddresses() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_NETWORKADDRESSES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_NETWORKADDRESSES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_NETWORKADDRESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_NetworkAddresses(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_NETWORKADDRESSES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_NETWORKADDRESSES + " could not be found");
    		
		} else if (!CIM_TokenRingAdapterHelper.isValid_NetworkAddresses(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingAdapter.CIM_PROPERTY_NETWORKADDRESSES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_NETWORKADDRESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReceiveCongestions
	
	public UnsignedInt32 get_ReceiveCongestions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_RECEIVECONGESTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_RECEIVECONGESTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_RECEIVECONGESTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReceiveCongestions(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_RECEIVECONGESTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_RECEIVECONGESTIONS + " could not be found");
    		
		} else if (!CIM_TokenRingAdapterHelper.isValid_ReceiveCongestions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingAdapter.CIM_PROPERTY_RECEIVECONGESTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_RECEIVECONGESTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Recoverys
	
	public UnsignedInt32 get_Recoverys() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_RECOVERYS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_RECOVERYS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_RECOVERYS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Recoverys(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_RECOVERYS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_RECOVERYS + " could not be found");
    		
		} else if (!CIM_TokenRingAdapterHelper.isValid_Recoverys(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingAdapter.CIM_PROPERTY_RECOVERYS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_RECOVERYS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Removes
	
	public UnsignedInt32 get_Removes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_REMOVES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_REMOVES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_REMOVES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Removes(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_REMOVES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_REMOVES + " could not be found");
    		
		} else if (!CIM_TokenRingAdapterHelper.isValid_Removes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingAdapter.CIM_PROPERTY_REMOVES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_REMOVES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RingOpenStatus
	
	public UnsignedInt16 get_RingOpenStatus() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_RINGOPENSTATUS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_RINGOPENSTATUS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_RINGOPENSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RingOpenStatus(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_RINGOPENSTATUS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_RINGOPENSTATUS + " could not be found");
    		
		} else if (!CIM_TokenRingAdapterHelper.isValid_RingOpenStatus(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingAdapter.CIM_PROPERTY_RINGOPENSTATUS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_RINGOPENSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RingSpeed
	
	public UnsignedInt16 get_RingSpeed() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_RINGSPEED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_RINGSPEED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_RINGSPEED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RingSpeed(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_RINGSPEED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_RINGSPEED + " could not be found");
    		
		} else if (!CIM_TokenRingAdapterHelper.isValid_RingSpeed(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingAdapter.CIM_PROPERTY_RINGSPEED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_RINGSPEED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RingState
	
	public UnsignedInt16 get_RingState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_RINGSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_RINGSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_RINGSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RingState(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_RINGSTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_RINGSTATE + " could not be found");
    		
		} else if (!CIM_TokenRingAdapterHelper.isValid_RingState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingAdapter.CIM_PROPERTY_RINGSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_RINGSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RingStatus
	
	public UnsignedInt32 get_RingStatus() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_RINGSTATUS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_RINGSTATUS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_RINGSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RingStatus(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_RINGSTATUS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_RINGSTATUS + " could not be found");
    		
		} else if (!CIM_TokenRingAdapterHelper.isValid_RingStatus(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingAdapter.CIM_PROPERTY_RINGSTATUS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_RINGSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SignalLossCount
	
	public UnsignedInt32 get_SignalLossCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_SIGNALLOSSCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_SIGNALLOSSCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_SIGNALLOSSCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SignalLossCount(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_SIGNALLOSSCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_SIGNALLOSSCOUNT + " could not be found");
    		
		} else if (!CIM_TokenRingAdapterHelper.isValid_SignalLossCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingAdapter.CIM_PROPERTY_SIGNALLOSSCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_SIGNALLOSSCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Singles
	
	public UnsignedInt32 get_Singles() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_SINGLES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_SINGLES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_SINGLES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Singles(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_SINGLES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_SINGLES + " could not be found");
    		
		} else if (!CIM_TokenRingAdapterHelper.isValid_Singles(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingAdapter.CIM_PROPERTY_SINGLES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_SINGLES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SoftErrors
	
	public UnsignedInt32 get_SoftErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_SOFTERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_SOFTERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_SOFTERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SoftErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_SOFTERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_SOFTERRORS + " could not be found");
    		
		} else if (!CIM_TokenRingAdapterHelper.isValid_SoftErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingAdapter.CIM_PROPERTY_SOFTERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_SOFTERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TokenErrors
	
	public UnsignedInt32 get_TokenErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_TOKENERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_TOKENERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_TOKENERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TokenErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_TOKENERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_TOKENERRORS + " could not be found");
    		
		} else if (!CIM_TokenRingAdapterHelper.isValid_TokenErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingAdapter.CIM_PROPERTY_TOKENERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_TOKENERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TransmittedBeacons
	
	public UnsignedInt32 get_TransmittedBeacons() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_TRANSMITTEDBEACONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_TRANSMITTEDBEACONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_TRANSMITTEDBEACONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TransmittedBeacons(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TokenRingAdapter.CIM_PROPERTY_TRANSMITTEDBEACONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_TRANSMITTEDBEACONS + " could not be found");
    		
		} else if (!CIM_TokenRingAdapterHelper.isValid_TransmittedBeacons(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TokenRingAdapter.CIM_PROPERTY_TRANSMITTEDBEACONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TokenRingAdapter.CIM_PROPERTY_TRANSMITTEDBEACONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
