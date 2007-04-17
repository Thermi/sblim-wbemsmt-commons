/** 
 * CIM_EthernetAdapter.java
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
 * Description:  Note: The use of the CIM_EthernetAdapter class has been deprecated, consistent
 * with NetworkAdapter. Instead use the CIM_EthernetPort class. Deprecated
 * description: This class describes the capabilities and management aspects of
 * an EthernetAdapter.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.cim.UnsignedInt32;
import org.sblim.wbem.cim.UnsignedInt64;


/**
 *  Note: The use of the CIM_EthernetAdapter class has been deprecated, consistent
 * with NetworkAdapter. Instead use the CIM_EthernetPort class. Deprecated
 * description: This class describes the capabilities and management aspects of
 * an EthernetAdapter.
 */
public class CIM_EthernetAdapter extends CIM_NetworkAdapter  {
	
	public final static String CIM_CLASS_NAME = "CIM_EthernetAdapter"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.10.0";
	
	
	/**
	*	Note: The use of this method has been deprecated. 
Deprecated description: A count of frames that were received on a particular interface, are not an integral number of octets in length, and do not pass the FCS check. The count that is represented by an instance of this object is incremented when the alignment Error status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error conditions obtained are, according to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status presented to the LLC.
	*/
	public final static String CIM_PROPERTY_ALIGNMENTERRORS = "AlignmentErrors"; //$NON-NLS-1$
	/**
	*	Note: The use of this method has been deprecated. 
Deprecated description: Capabilities of the EthernetAdapter. For example, the Device might support AlertOnLan, WakeOnLan, Load Balancing, or FailOver. If failover or load balancing capabilities are listed, a SpareGroup (failover) or ExtraCapacityGroup (load balancing) should also be defined to completely describe the capability.
	*/
	public final static String CIM_PROPERTY_CAPABILITIES = "Capabilities"; //$NON-NLS-1$
	/**
	*	Note: The use of this method has been deprecated. 
Deprecated description: An array of free-form strings that provides more detailed explanations for any of the EthernetAdapter features that are indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
	*/
	public final static String CIM_PROPERTY_CAPABILITYDESCRIPTIONS = "CapabilityDescriptions"; //$NON-NLS-1$
	/**
	*	Note: The use of this method has been deprecated. 
Deprecated description: The number of times that the carrier sense condition was lost or never asserted when attempting to transmit a frame on a particular interface. The count represented by an instance of this object is incremented, at most, once per transmission attempt, even if the carrier sense condition fluctuates during a transmission attempt.
	*/
	public final static String CIM_PROPERTY_CARRIERSENSEERRORS = "CarrierSenseErrors"; //$NON-NLS-1$
	/**
	*	Note: The use of this method has been deprecated. 
Deprecated description: A count of frames for which the first transmission attempt on a particular interface is delayed because the medium is busy. The count represented by an instance of this object does not include the frames that are involved in collisions.
	*/
	public final static String CIM_PROPERTY_DEFERREDTRANSMISSIONS = "DeferredTransmissions"; //$NON-NLS-1$
	/**
	*	Note: The use of this method has been deprecated. 
Deprecated description: Specifies which capabilities are enabled from the list of all supported ones, which are defined in the Capabilities array.
	*/
	public final static String CIM_PROPERTY_ENABLEDCAPABILITIES = "EnabledCapabilities"; //$NON-NLS-1$
	/**
	*	Note: The use of this method has been deprecated. 
Deprecated description: A count of frames for which transmission on a particular interface fails due to excessive collisions.
	*/
	public final static String CIM_PROPERTY_EXCESSIVECOLLISIONS = "ExcessiveCollisions"; //$NON-NLS-1$
	/**
	*	Note: The use of this method has been deprecated. 
Deprecated description: A count of frames that were received on a particular interface and are an integral number of octets in length, but do not pass the FCS check. The count represented by an instance of this object is incremented when the frame CheckError status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error conditions obtained are, according to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status presented to the LLC.
	*/
	public final static String CIM_PROPERTY_FCSERRORS = "FCSErrors"; //$NON-NLS-1$
	/**
	*	Note: The use of this method has been deprecated. 
Deprecated description: A count of frames that are received on a particular interface that exceeds the maximum permitted frame size. The count that is represented by an instance of this object is incremented when the FrameTooLong status is returned by the MAC layer to the LLC (or other MAC user). Received frames for which multiple error conditions obtained are, according to the conventions of IEEE 802.3 Layer Management, counted exclusively according to the error status presented to the LLC.
	*/
	public final static String CIM_PROPERTY_FRAMETOOLONGS = "FrameTooLongs"; //$NON-NLS-1$
	/**
	*	Note: The use of this method has been deprecated. 
Deprecated description: A count of frames for which reception on a particular interface fails due to an internal MAC sublayer receive error. A frame is counted by an instance of this object only if it is not counted by the corresponding instance of the FrameTooLongs property the AlignmentErrors property, or the FCSErrors property. The precise meaning of the count that is represented by an instance of this object is implementation-specific. In particular, an instance of this object might represent a count of receive errors on a particular interface that are not otherwise counted.
	*/
	public final static String CIM_PROPERTY_INTERNALMACRECEIVEERRORS = "InternalMACReceiveErrors"; //$NON-NLS-1$
	/**
	*	Note: The use of this method has been deprecated. 
Deprecated description: A count of frames for which transmission on a particular interface fails due to an internal MAC sublayer transmit error. A frame is counted by an instance of this object only if it is not counted by the corresponding instance of the LateCollisions property, the Excessive Collisions property, or the CarrierSenseErrors property. The precise meaning of the count represented by an instance of this object is implementation-specific. In particular, an instance of this object might represent a count of transmission errors on a particular interface that are not otherwise counted.
	*/
	public final static String CIM_PROPERTY_INTERNALMACTRANSMITERRORS = "InternalMACTransmitErrors"; //$NON-NLS-1$
	/**
	*	Note: The use of this method has been deprecated. 
Deprecated description: The number of times that a collision is detected on a particular interface later than 512 bit-times into the transmission of a packet. Five hundred and twelve bit-times corresponds to 51.2 microseconds on a 10 Mbit/s system. A late collision included in a count that is represented by an instance of this object is also considered to be a generic collision for purposes of other collision-related statistics.
	*/
	public final static String CIM_PROPERTY_LATECOLLISIONS = "LateCollisions"; //$NON-NLS-1$
	/**
	*	Note: The use of this method has been deprecated. 
Deprecated description: The maximum size of the INFO (non-MAC) field that will be received or transmitted.
	*/
	public final static String CIM_PROPERTY_MAXDATASIZE = "MaxDataSize"; //$NON-NLS-1$
	/**
	*	Note: The use of this method has been deprecated. 
Deprecated description: A count of successfully transmitted frames on a particular interface for which transmission is inhibited by more than one collision. A frame that is counted by an instance of this object is not counted by the corresponding instance of the SingleCollisionFrames property.
	*/
	public final static String CIM_PROPERTY_MULTIPLECOLLISIONFRAMES = "MultipleCollisionFrames"; //$NON-NLS-1$
	/**
	*	Note: The use of this method has been deprecated. 
Deprecated description: Ethernet/802.3 MAC addresses formatted as twelve hexadecimal digits (for example, "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order. (Therefore, the Group address bit is found in the low order bit of the first character of the string.)
	*/
	public final static String CIM_PROPERTY_NETWORKADDRESSES = "NetworkAddresses"; //$NON-NLS-1$
	/**
	*	Note: The use of this method has been deprecated. 
Deprecated description: A count of times that the SQE TEST ERROR message is generated by the PLS sublayer for a particular interface. The SQE TEST ERROR message is defined in section 7.2.2.2.4 of ANSI/IEEE 802.3-1985 and its generation is described in section 7.2.4.6 of the same document.
	*/
	public final static String CIM_PROPERTY_SQETESTERRORS = "SQETestErrors"; //$NON-NLS-1$
	/**
	*	Note: The use of this method has been deprecated. 
Deprecated description: A count of successfully transmitted frames on a particular interface for which transmission is inhibited by exactly one collision. A frame that is counted by an instance of this object is not counted by the corresponding instance of the MultipleCollisionFrames property.
	*/
	public final static String CIM_PROPERTY_SINGLECOLLISIONFRAMES = "SingleCollisionFrames"; //$NON-NLS-1$
	/**
	*	Note: The use of this method has been deprecated. 
Deprecated description: The number of times there was an invalid data symbol when a valid carrier was present. The count is incremented at most once per carrier event, even if multiple symbol errors occur during the carrier event.
	*/
	public final static String CIM_PROPERTY_SYMBOLERRORS = "SymbolErrors"; //$NON-NLS-1$
	/**
	*	Note: The use of this method has been deprecated. 
Deprecated description: The total number of packets that are received.
	*/
	public final static String CIM_PROPERTY_TOTALPACKETSRECEIVED = "TotalPacketsReceived"; //$NON-NLS-1$
	/**
	*	Note: The use of this method has been deprecated. 
Deprecated description: The total number of packets that are transmitted.
	*/
	public final static String CIM_PROPERTY_TOTALPACKETSTRANSMITTED = "TotalPacketsTransmitted"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ALIGNMENTERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CAPABILITIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CARRIERSENSEERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_DEFERREDTRANSMISSIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_ENABLEDCAPABILITIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_EXCESSIVECOLLISIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_FCSERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_FRAMETOOLONGS);
		CIM_PropertyNameList.add(CIM_PROPERTY_INTERNALMACRECEIVEERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_INTERNALMACTRANSMITERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_LATECOLLISIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXDATASIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MULTIPLECOLLISIONFRAMES);
		CIM_PropertyNameList.add(CIM_PROPERTY_NETWORKADDRESSES);
		CIM_PropertyNameList.add(CIM_PROPERTY_SQETESTERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_SINGLECOLLISIONFRAMES);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYMBOLERRORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_TOTALPACKETSRECEIVED);
		CIM_PropertyNameList.add(CIM_PROPERTY_TOTALPACKETSTRANSMITTED);
				
		for (int i = 0; i < CIM_NetworkAdapter.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ALIGNMENTERRORS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CAPABILITIES)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CAPABILITYDESCRIPTIONS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CARRIERSENSEERRORS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEFERREDTRANSMISSIONS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ENABLEDCAPABILITIES)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EXCESSIVECOLLISIONS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FCSERRORS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FRAMETOOLONGS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INTERNALMACRECEIVEERRORS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INTERNALMACTRANSMITERRORS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LATECOLLISIONS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXDATASIZE)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MULTIPLECOLLISIONFRAMES)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NETWORKADDRESSES)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SQETESTERRORS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SINGLECOLLISIONFRAMES)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYMBOLERRORS)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TOTALPACKETSRECEIVED)||
				((String)CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TOTALPACKETSTRANSMITTED)){
				continue;
			}
			
			CIM_EthernetAdapter.CIM_PropertyNameList.add(CIM_NetworkAdapter.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ALIGNMENTERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CAPABILITIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CAPABILITYDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CARRIERSENSEERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEFERREDTRANSMISSIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ENABLEDCAPABILITIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EXCESSIVECOLLISIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FCSERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FRAMETOOLONGS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INTERNALMACRECEIVEERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INTERNALMACTRANSMITERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LATECOLLISIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXDATASIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MULTIPLECOLLISIONFRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NETWORKADDRESSES, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SQETESTERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SINGLECOLLISIONFRAMES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYMBOLERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TOTALPACKETSRECEIVED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TOTALPACKETSTRANSMITTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_NetworkAdapter.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ALIGNMENTERRORS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CAPABILITIES)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CAPABILITYDESCRIPTIONS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CARRIERSENSEERRORS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEFERREDTRANSMISSIONS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ENABLEDCAPABILITIES)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EXCESSIVECOLLISIONS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FCSERRORS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FRAMETOOLONGS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INTERNALMACRECEIVEERRORS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INTERNALMACTRANSMITERRORS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LATECOLLISIONS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXDATASIZE)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MULTIPLECOLLISIONFRAMES)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NETWORKADDRESSES)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SQETESTERRORS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SINGLECOLLISIONFRAMES)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYMBOLERRORS)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TOTALPACKETSRECEIVED)||
				((CIMProperty)CIM_NetworkAdapter.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TOTALPACKETSTRANSMITTED)){
				continue;
			}
			
			CIM_EthernetAdapter.CIM_PropertyList.add(CIM_NetworkAdapter.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_NetworkAdapter.Java_Package_List.size(); i++) {
			if (((String)CIM_NetworkAdapter.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_NetworkAdapter.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_CAPABILITIES = {"Unknown","Other","AlertOnLan","WakeOnLan","FailOver","LoadBalancing"};
	public final static String[] CIM_VALUEMAP_ENABLEDCAPABILITIES = {"Unknown","Other","AlertOnLan","WakeOnLan","FailOver","LoadBalancing"};
	
	
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
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_EthernetAdapter() {

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
	public CIM_EthernetAdapter(Vector keyProperties){ 
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
	public CIM_EthernetAdapter(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_EthernetAdapter)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_EthernetAdapter)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_EthernetAdapter)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_EthernetAdapter)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_EthernetAdapter)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_EthernetAdapter)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_EthernetAdapter)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_EthernetAdapter)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_EthernetAdapter)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_EthernetAdapter)object).cimObjectPath)) {
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
	
	// Attribute AlignmentErrors
	
	public UnsignedInt32 get_AlignmentErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_ALIGNMENTERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_ALIGNMENTERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_ALIGNMENTERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AlignmentErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_ALIGNMENTERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_ALIGNMENTERRORS + " could not be found");
    		
		} else if (!CIM_EthernetAdapterHelper.isValid_AlignmentErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetAdapter.CIM_PROPERTY_ALIGNMENTERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_ALIGNMENTERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Capabilities
	
	public UnsignedInt16[] get_Capabilities() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_CAPABILITIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_CAPABILITIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_CAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_CAPABILITIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_CAPABILITIES + " could not be found");
    		
		} else if (!CIM_EthernetAdapterHelper.isValid_Capabilities(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetAdapter.CIM_PROPERTY_CAPABILITIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_CAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CapabilityDescriptions
	
	public String[] get_CapabilityDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_EthernetAdapterHelper.isValid_CapabilityDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetAdapter.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CarrierSenseErrors
	
	public UnsignedInt32 get_CarrierSenseErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_CARRIERSENSEERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_CARRIERSENSEERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_CARRIERSENSEERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CarrierSenseErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_CARRIERSENSEERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_CARRIERSENSEERRORS + " could not be found");
    		
		} else if (!CIM_EthernetAdapterHelper.isValid_CarrierSenseErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetAdapter.CIM_PROPERTY_CARRIERSENSEERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_CARRIERSENSEERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DeferredTransmissions
	
	public UnsignedInt32 get_DeferredTransmissions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_DEFERREDTRANSMISSIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_DEFERREDTRANSMISSIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_DEFERREDTRANSMISSIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DeferredTransmissions(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_DEFERREDTRANSMISSIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_DEFERREDTRANSMISSIONS + " could not be found");
    		
		} else if (!CIM_EthernetAdapterHelper.isValid_DeferredTransmissions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetAdapter.CIM_PROPERTY_DEFERREDTRANSMISSIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_DEFERREDTRANSMISSIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EnabledCapabilities
	
	public UnsignedInt16[] get_EnabledCapabilities() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_ENABLEDCAPABILITIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_ENABLEDCAPABILITIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_ENABLEDCAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_ENABLEDCAPABILITIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_ENABLEDCAPABILITIES + " could not be found");
    		
		} else if (!CIM_EthernetAdapterHelper.isValid_EnabledCapabilities(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetAdapter.CIM_PROPERTY_ENABLEDCAPABILITIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_ENABLEDCAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ExcessiveCollisions
	
	public UnsignedInt32 get_ExcessiveCollisions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_EXCESSIVECOLLISIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_EXCESSIVECOLLISIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_EXCESSIVECOLLISIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ExcessiveCollisions(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_EXCESSIVECOLLISIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_EXCESSIVECOLLISIONS + " could not be found");
    		
		} else if (!CIM_EthernetAdapterHelper.isValid_ExcessiveCollisions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetAdapter.CIM_PROPERTY_EXCESSIVECOLLISIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_EXCESSIVECOLLISIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FCSErrors
	
	public UnsignedInt32 get_FCSErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_FCSERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_FCSERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_FCSERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FCSErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_FCSERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_FCSERRORS + " could not be found");
    		
		} else if (!CIM_EthernetAdapterHelper.isValid_FCSErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetAdapter.CIM_PROPERTY_FCSERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_FCSERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FrameTooLongs
	
	public UnsignedInt32 get_FrameTooLongs() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_FRAMETOOLONGS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_FRAMETOOLONGS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_FRAMETOOLONGS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FrameTooLongs(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_FRAMETOOLONGS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_FRAMETOOLONGS + " could not be found");
    		
		} else if (!CIM_EthernetAdapterHelper.isValid_FrameTooLongs(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetAdapter.CIM_PROPERTY_FRAMETOOLONGS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_FRAMETOOLONGS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InternalMACReceiveErrors
	
	public UnsignedInt32 get_InternalMACReceiveErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_INTERNALMACRECEIVEERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_INTERNALMACRECEIVEERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_INTERNALMACRECEIVEERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InternalMACReceiveErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_INTERNALMACRECEIVEERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_INTERNALMACRECEIVEERRORS + " could not be found");
    		
		} else if (!CIM_EthernetAdapterHelper.isValid_InternalMACReceiveErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetAdapter.CIM_PROPERTY_INTERNALMACRECEIVEERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_INTERNALMACRECEIVEERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InternalMACTransmitErrors
	
	public UnsignedInt32 get_InternalMACTransmitErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_INTERNALMACTRANSMITERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_INTERNALMACTRANSMITERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_INTERNALMACTRANSMITERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InternalMACTransmitErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_INTERNALMACTRANSMITERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_INTERNALMACTRANSMITERRORS + " could not be found");
    		
		} else if (!CIM_EthernetAdapterHelper.isValid_InternalMACTransmitErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetAdapter.CIM_PROPERTY_INTERNALMACTRANSMITERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_INTERNALMACTRANSMITERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LateCollisions
	
	public UnsignedInt32 get_LateCollisions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_LATECOLLISIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_LATECOLLISIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_LATECOLLISIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LateCollisions(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_LATECOLLISIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_LATECOLLISIONS + " could not be found");
    		
		} else if (!CIM_EthernetAdapterHelper.isValid_LateCollisions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetAdapter.CIM_PROPERTY_LATECOLLISIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_LATECOLLISIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxDataSize
	
	public UnsignedInt32 get_MaxDataSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_MAXDATASIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_MAXDATASIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_MAXDATASIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxDataSize(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_MAXDATASIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_MAXDATASIZE + " could not be found");
    		
		} else if (!CIM_EthernetAdapterHelper.isValid_MaxDataSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetAdapter.CIM_PROPERTY_MAXDATASIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_MAXDATASIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MultipleCollisionFrames
	
	public UnsignedInt32 get_MultipleCollisionFrames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_MULTIPLECOLLISIONFRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_MULTIPLECOLLISIONFRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_MULTIPLECOLLISIONFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MultipleCollisionFrames(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_MULTIPLECOLLISIONFRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_MULTIPLECOLLISIONFRAMES + " could not be found");
    		
		} else if (!CIM_EthernetAdapterHelper.isValid_MultipleCollisionFrames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetAdapter.CIM_PROPERTY_MULTIPLECOLLISIONFRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_MULTIPLECOLLISIONFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NetworkAddresses
	
	public String[] get_NetworkAddresses() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_NETWORKADDRESSES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_NETWORKADDRESSES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_NETWORKADDRESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_NETWORKADDRESSES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_NETWORKADDRESSES + " could not be found");
    		
		} else if (!CIM_EthernetAdapterHelper.isValid_NetworkAddresses(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetAdapter.CIM_PROPERTY_NETWORKADDRESSES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_NETWORKADDRESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SQETestErrors
	
	public UnsignedInt32 get_SQETestErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_SQETESTERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_SQETESTERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_SQETESTERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SQETestErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_SQETESTERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_SQETESTERRORS + " could not be found");
    		
		} else if (!CIM_EthernetAdapterHelper.isValid_SQETestErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetAdapter.CIM_PROPERTY_SQETESTERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_SQETESTERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SingleCollisionFrames
	
	public UnsignedInt32 get_SingleCollisionFrames() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_SINGLECOLLISIONFRAMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_SINGLECOLLISIONFRAMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_SINGLECOLLISIONFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SingleCollisionFrames(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_SINGLECOLLISIONFRAMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_SINGLECOLLISIONFRAMES + " could not be found");
    		
		} else if (!CIM_EthernetAdapterHelper.isValid_SingleCollisionFrames(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetAdapter.CIM_PROPERTY_SINGLECOLLISIONFRAMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_SINGLECOLLISIONFRAMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SymbolErrors
	
	public UnsignedInt32 get_SymbolErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_SYMBOLERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_SYMBOLERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_SYMBOLERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SymbolErrors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_SYMBOLERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_SYMBOLERRORS + " could not be found");
    		
		} else if (!CIM_EthernetAdapterHelper.isValid_SymbolErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetAdapter.CIM_PROPERTY_SYMBOLERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_SYMBOLERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TotalPacketsReceived
	
	public UnsignedInt64 get_TotalPacketsReceived() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_TOTALPACKETSRECEIVED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_TOTALPACKETSRECEIVED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_TOTALPACKETSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TotalPacketsReceived(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_TOTALPACKETSRECEIVED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_TOTALPACKETSRECEIVED + " could not be found");
    		
		} else if (!CIM_EthernetAdapterHelper.isValid_TotalPacketsReceived(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetAdapter.CIM_PROPERTY_TOTALPACKETSRECEIVED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_TOTALPACKETSRECEIVED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TotalPacketsTransmitted
	
	public UnsignedInt64 get_TotalPacketsTransmitted() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_TOTALPACKETSTRANSMITTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_TOTALPACKETSTRANSMITTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_TOTALPACKETSTRANSMITTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TotalPacketsTransmitted(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EthernetAdapter.CIM_PROPERTY_TOTALPACKETSTRANSMITTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_TOTALPACKETSTRANSMITTED + " could not be found");
    		
		} else if (!CIM_EthernetAdapterHelper.isValid_TotalPacketsTransmitted(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EthernetAdapter.CIM_PROPERTY_TOTALPACKETSTRANSMITTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EthernetAdapter.CIM_PROPERTY_TOTALPACKETSTRANSMITTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
