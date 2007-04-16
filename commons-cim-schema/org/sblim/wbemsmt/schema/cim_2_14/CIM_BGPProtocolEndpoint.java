/** 
 * CIM_BGPProtocolEndpoint.java
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
 * Description:  A ProtocolEndpoint that is dedicated to running BGP.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.lang.reflect.Constructor;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Enumeration;
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
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.CIMEnumeration;



/**
 *  A ProtocolEndpoint that is dedicated to running BGP.
 */
public class CIM_BGPProtocolEndpoint extends CIM_ProtocolEndpoint  {
	
	public final static String CIM_CLASS_NAME = "CIM_BGPProtocolEndpoint"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ASBGPENDPOINTS = "CIM_ASBGPEndpoints"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ROUTESBGP = "CIM_RoutesBGP"; //$NON-NLS-1$
	
	
	/**
	*	This defines the desired state of the BGP connection. It is equivalent to the RequestedState property (i.e., enabled/disabled status) that is inherited from EnabledLogicalElement. AdminStatus is deprecated in lieu of this inherited property.
	*/
	public final static String CIM_PROPERTY_ADMINSTATUS = "AdminStatus"; //$NON-NLS-1$
	/**
	*	This defines the time interval, in seconds, for the ConnectRetry timer. The suggested value is 120 seconds.
	*/
	public final static String CIM_PROPERTY_CONNECTRETRYINTERVAL = "ConnectRetryInterval"; //$NON-NLS-1$
	/**
	*	This defines the maximum amount of time in seconds that may elapse between the receipt of successive KEEPALIVE or UPDATE messages. This is instrumented as a counter that increments from zero to the value specified in this property. The value of this property is calculated by the BGP speaker by using the smaller of the values of bgpPeerHoldTimeConfigured and the Hold Time received in the OPEN message. This value, if not zero seconds, must be at least three seconds, up to a maximum of 65535 seconds. Receipt of either a KEEPALIVE or an UPDATE message resets this value.
	*/
	public final static String CIM_PROPERTY_HOLDTIME = "HoldTime"; //$NON-NLS-1$
	/**
	*	This defines the time interval in seconds for the Hold Time configured for this BGP speaker with a peer. This value is placed in an OPEN message sent to a peer by this BGP speaker, and is compared with the Hold Time field in the OPEN message received from the peer. It enables this speaker to establish a mutually agreeable Hold Time with the peer. This value must not be less than three seconds. If it is zero, then the Hold Time is NOT to be established with the peer. The suggested value for this timer is 90 seconds.
	*/
	public final static String CIM_PROPERTY_HOLDTIMECONFIGURED = "HoldTimeConfigured"; //$NON-NLS-1$
	/**
	*	A boolean that, when TRUE, signifies that this is an instance of the external version of BGP (FALSE is the internal version).
	*/
	public final static String CIM_PROPERTY_ISEBGP = "IsEBGP"; //$NON-NLS-1$
	/**
	*	Normally, two routers running EBGP must be physically connected. This boolean, when TRUE, denotes a LOGICAL connection between two routers that are running EBGP (e.g., there is an intermediate router or interface between them).
	*/
	public final static String CIM_PROPERTY_ISEBGPMULTIHOP = "IsEBGPMultihop"; //$NON-NLS-1$
	/**
	*	This defines the time interval in seconds for the KeepAlive timer established with the peer. The value of this property is calculated by the speaker such that, when compared with the HoldTime property, it has the same proportion as the KeepAliveConfigured property has with the HoldTimeConfigured property. A value of 0 indicates that the KeepAlive timer has not yet been established. The maximum value of this property is 21845 seconds.
	*/
	public final static String CIM_PROPERTY_KEEPALIVE = "KeepAlive"; //$NON-NLS-1$
	/**
	*	This defines the time interval in seconds for the KeepAlive timer configured for this BGP speaker with a peer. This value will determine the frequency of the KEEPALIVE messages relative to the value of the HoldTimeConfigured property; the actual frequency is specified by the value of the KeepAlive property. A reasonable value is one third of that of the value of the HoldTimeConfigured property. If it is zero, then NO periodic KEEPALIVE messages are sent to the peer. The suggested value for this property is 30 seconds. The maximum value of this property is 21845 seconds.
	*/
	public final static String CIM_PROPERTY_KEEPALIVECONFIGURED = "KeepAliveConfigured"; //$NON-NLS-1$
	/**
	*	This is the local IP address of this router's BGP connection. It is deprecated since a binding should be defined using the CIM_BindsTo association. Ideally the binding is to a TCPProtocolEndpoint which then handles the association to its IPEndpoint.
	*/
	public final static String CIM_PROPERTY_LOCALADDRESS = "LocalAddress"; //$NON-NLS-1$
	/**
	*	This is the unique identifier of the local BGP router. This is often the router ID (e.g., an IP address).
	*/
	public final static String CIM_PROPERTY_LOCALIDENTIFIER = "LocalIdentifier"; //$NON-NLS-1$
	/**
	*	This is the local port number for the TCP connection of this router's BGP connection. It is deprecated since a binding should be defined (to a TCPProtocolEndpoint) using the CIM_BindsTo association.
	*/
	public final static String CIM_PROPERTY_LOCALPORT = "LocalPort"; //$NON-NLS-1$
	/**
	*	This defines the time interval in seconds for the MinASOriginationInterval timer. The suggested value for this property is 15 seconds.
	*/
	public final static String CIM_PROPERTY_MINASORIGINATIONINTERVAL = "MinASOriginationInterval"; //$NON-NLS-1$
	/**
	*	This defines the time interval in seconds for the MinRouteAdvertisementInterval timer. The suggested value for this property is 30 seconds.
	*/
	public final static String CIM_PROPERTY_MINROUTEADVERTISEMENTINTERVAL = "MinRouteAdvertisementInterval"; //$NON-NLS-1$
	/**
	*	This defines the negotiated version of BGP that is running between the two peers.
	*/
	public final static String CIM_PROPERTY_NEGOTIATEDVERSION = "NegotiatedVersion"; //$NON-NLS-1$
	/**
	*	This is the unique identifier of the peer BGP router. This is often the router ID (e.g., an IP address).
	*/
	public final static String CIM_PROPERTY_PEERIDENTIFIER = "PeerIdentifier"; //$NON-NLS-1$
	/**
	*	ProtocolIFType's enumeration is limited to BGP and reserved values for this subclass of ProtocolEndpoint.
	*/
	public final static String CIM_PROPERTY_PROTOCOLIFTYPE = "ProtocolIFType"; //$NON-NLS-1$
	/**
	*	This is the remote AS number for this router's BGP connection.
	*/
	public final static String CIM_PROPERTY_REMOTEAS = "RemoteAS"; //$NON-NLS-1$
	/**
	*	This is the remote IP address of this router's BGP connection. It is deprecated since a binding to a Remote ServiceAccessPoint should be instantiated, using CIM_BindsTo.
	*/
	public final static String CIM_PROPERTY_REMOTEADDRESS = "RemoteAddress"; //$NON-NLS-1$
	/**
	*	This is the remote port number for the TCP connection of this router's BGP connection. It is deprecated since a binding to a RemotePort should be instantiated, using CIM_BindsTo.
	*/
	public final static String CIM_PROPERTY_REMOTEPORT = "RemotePort"; //$NON-NLS-1$
	/**
	*	This defines the current connection state of the BGP Peer.
	*/
	public final static String CIM_PROPERTY_STATE = "State"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ADMINSTATUS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CONNECTRETRYINTERVAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_HOLDTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_HOLDTIMECONFIGURED);
		CIM_PropertyNameList.add(CIM_PROPERTY_ISEBGP);
		CIM_PropertyNameList.add(CIM_PROPERTY_ISEBGPMULTIHOP);
		CIM_PropertyNameList.add(CIM_PROPERTY_KEEPALIVE);
		CIM_PropertyNameList.add(CIM_PROPERTY_KEEPALIVECONFIGURED);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOCALADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOCALIDENTIFIER);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOCALPORT);
		CIM_PropertyNameList.add(CIM_PROPERTY_MINASORIGINATIONINTERVAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_MINROUTEADVERTISEMENTINTERVAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_NEGOTIATEDVERSION);
		CIM_PropertyNameList.add(CIM_PROPERTY_PEERIDENTIFIER);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROTOCOLIFTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_REMOTEAS);
		CIM_PropertyNameList.add(CIM_PROPERTY_REMOTEADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_REMOTEPORT);
		CIM_PropertyNameList.add(CIM_PROPERTY_STATE);
				
		for (int i = 0; i < CIM_ProtocolEndpoint.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ADMINSTATUS)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CONNECTRETRYINTERVAL)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HOLDTIME)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HOLDTIMECONFIGURED)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ISEBGP)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ISEBGPMULTIHOP)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_KEEPALIVE)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_KEEPALIVECONFIGURED)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOCALADDRESS)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOCALIDENTIFIER)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOCALPORT)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MINASORIGINATIONINTERVAL)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MINROUTEADVERTISEMENTINTERVAL)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NEGOTIATEDVERSION)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PEERIDENTIFIER)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROTOCOLIFTYPE)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REMOTEAS)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REMOTEADDRESS)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REMOTEPORT)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STATE)){
				continue;
			}
			
			CIM_BGPProtocolEndpoint.CIM_PropertyNameList.add(CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ADMINSTATUS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CONNECTRETRYINTERVAL, new CIMValue(new UnsignedInt32("120"), new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HOLDTIME, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HOLDTIMECONFIGURED, new CIMValue(new UnsignedInt16("90"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ISEBGP, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ISEBGPMULTIHOP, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_KEEPALIVE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_KEEPALIVECONFIGURED, new CIMValue(new UnsignedInt16("30"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOCALADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOCALIDENTIFIER, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOCALPORT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MINASORIGINATIONINTERVAL, new CIMValue(new UnsignedInt16("15"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MINROUTEADVERTISEMENTINTERVAL, new CIMValue(new UnsignedInt16("30"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NEGOTIATEDVERSION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PEERIDENTIFIER, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROTOCOLIFTYPE, new CIMValue(new UnsignedInt16("4108"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REMOTEAS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REMOTEADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REMOTEPORT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_ProtocolEndpoint.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ADMINSTATUS)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CONNECTRETRYINTERVAL)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HOLDTIME)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HOLDTIMECONFIGURED)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ISEBGP)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ISEBGPMULTIHOP)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_KEEPALIVE)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_KEEPALIVECONFIGURED)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOCALADDRESS)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOCALIDENTIFIER)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOCALPORT)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MINASORIGINATIONINTERVAL)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MINROUTEADVERTISEMENTINTERVAL)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NEGOTIATEDVERSION)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PEERIDENTIFIER)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROTOCOLIFTYPE)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REMOTEAS)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REMOTEADDRESS)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REMOTEPORT)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STATE)){
				continue;
			}
			
			CIM_BGPProtocolEndpoint.CIM_PropertyList.add(CIM_ProtocolEndpoint.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_ProtocolEndpoint.Java_Package_List.size(); i++) {
			if (((String)CIM_ProtocolEndpoint.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_ProtocolEndpoint.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ADMINSTATUS = {"Stop","Start"};
	public final static String[] CIM_VALUEMAP_PROTOCOLIFTYPE = {"Other","IANA Reserved","BGP","DMTF Reserved","Vendor Reserved"};
	public final static String[] CIM_VALUEMAP_STATE = {"Idle","Connect","Active","OpenSet","OpenConfirm","Established"};
	
	
	public final static int ADMINSTATUS_STOP = 1;
	public final static int ADMINSTATUS_START = 2;
	
	public final static String PROTOCOLIFTYPE_OTHER = "1";
	public final static String PROTOCOLIFTYPE_IANARESERVED = "225..4095";
	public final static String PROTOCOLIFTYPE_BGP = "4108";
	public final static String PROTOCOLIFTYPE_DMTFRESERVED = "4301..32767";
	public final static String PROTOCOLIFTYPE_VENDORRESERVED = "32768..";
	
	public final static int STATE_IDLE = 1;
	public final static int STATE_CONNECT = 2;
	public final static int STATE_ACTIVE = 3;
	public final static int STATE_OPENSET = 4;
	public final static int STATE_OPENCONFIRM = 5;
	public final static int STATE_ESTABLISHED = 6;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_BGPProtocolEndpoint() {

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
	public CIM_BGPProtocolEndpoint(Vector keyProperties){ 
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
	public CIM_BGPProtocolEndpoint(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_BGPProtocolEndpoint)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_BGPProtocolEndpoint)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_BGPProtocolEndpoint)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_BGPProtocolEndpoint)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_BGPProtocolEndpoint)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_BGPProtocolEndpoint)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_BGPProtocolEndpoint)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_BGPProtocolEndpoint)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_BGPProtocolEndpoint)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_BGPProtocolEndpoint)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_AutonomousSystem_CIM_ASBGPEndpointss(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ASBGPENDPOINTS, 
					CIM_AutonomousSystem.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_BGPProtocolEndpoint.Java_Package_List.size(); i++) {
						if (!((String)(CIM_BGPProtocolEndpoint.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_BGPProtocolEndpoint.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_BGPProtocolEndpoint.Java_Package_List.setElementAt((String)(CIM_BGPProtocolEndpoint.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_BGPProtocolEndpoint.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_AutonomousSystem(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
					
					Class[] constParams = new Class[2];
					constParams[0] = CIMObjectPath.class;
					constParams[1] = CIMInstance.class;
					Constructor cons = null;
					try {
						cons = clazz.getConstructor(constParams);
						
					} catch(NoSuchMethodException e) {
						System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_AutonomousSystem(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_AutonomousSystem(cimInstance.getObjectPath(), cimInstance));
						continue;
					}

				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	public ArrayList getAssociated_CIM_AutonomousSystem_CIM_ASBGPEndpoints_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ASBGPENDPOINTS, 
					CIM_AutonomousSystem.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_AutonomousSystem.CIM_CLASS_NAME)) {
						resultArrayList.add(obj);
					}
				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	public ArrayList getAssociated_CIM_BGPIPRoute_CIM_RoutesBGPs(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ROUTESBGP, 
					CIM_BGPIPRoute.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_BGPProtocolEndpoint.Java_Package_List.size(); i++) {
						if (!((String)(CIM_BGPProtocolEndpoint.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_BGPProtocolEndpoint.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_BGPProtocolEndpoint.Java_Package_List.setElementAt((String)(CIM_BGPProtocolEndpoint.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_BGPProtocolEndpoint.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BGPIPRoute(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
					
					Class[] constParams = new Class[2];
					constParams[0] = CIMObjectPath.class;
					constParams[1] = CIMInstance.class;
					Constructor cons = null;
					try {
						cons = clazz.getConstructor(constParams);
						
					} catch(NoSuchMethodException e) {
						System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BGPIPRoute(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BGPIPRoute(cimInstance.getObjectPath(), cimInstance));
						continue;
					}

				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	public ArrayList getAssociated_CIM_BGPIPRoute_CIM_RoutesBGP_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ROUTESBGP, 
					CIM_BGPIPRoute.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_BGPIPRoute.CIM_CLASS_NAME)) {
						resultArrayList.add(obj);
					}
				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	
	
	//*****************************************************
	// Attribute methods
	//*****************************************************
	
	// Attribute AdminStatus
	
	public UnsignedInt16 get_AdminStatus() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_ADMINSTATUS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_ADMINSTATUS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_ADMINSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AdminStatus(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_ADMINSTATUS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_ADMINSTATUS + " could not be found");
    		
		} else if (!CIM_BGPProtocolEndpointHelper.isValid_AdminStatus(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_ADMINSTATUS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_ADMINSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ConnectRetryInterval
	
	public UnsignedInt32 get_ConnectRetryInterval() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_CONNECTRETRYINTERVAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_CONNECTRETRYINTERVAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_CONNECTRETRYINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ConnectRetryInterval(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_CONNECTRETRYINTERVAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_CONNECTRETRYINTERVAL + " could not be found");
    		
		} else if (!CIM_BGPProtocolEndpointHelper.isValid_ConnectRetryInterval(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_CONNECTRETRYINTERVAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_CONNECTRETRYINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HoldTime
	
	public UnsignedInt16 get_HoldTime() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_HOLDTIME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_HOLDTIME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_HOLDTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HoldTime(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_HOLDTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_HOLDTIME + " could not be found");
    		
		} else if (!CIM_BGPProtocolEndpointHelper.isValid_HoldTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_HOLDTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_HOLDTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HoldTimeConfigured
	
	public UnsignedInt16 get_HoldTimeConfigured() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_HOLDTIMECONFIGURED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_HOLDTIMECONFIGURED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_HOLDTIMECONFIGURED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HoldTimeConfigured(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_HOLDTIMECONFIGURED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_HOLDTIMECONFIGURED + " could not be found");
    		
		} else if (!CIM_BGPProtocolEndpointHelper.isValid_HoldTimeConfigured(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_HOLDTIMECONFIGURED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_HOLDTIMECONFIGURED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IsEBGP
	
	public Boolean get_IsEBGP() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_ISEBGP);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_ISEBGP + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_ISEBGP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IsEBGP(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_ISEBGP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_ISEBGP + " could not be found");
    		
		} else if (!CIM_BGPProtocolEndpointHelper.isValid_IsEBGP(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_ISEBGP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_ISEBGP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IsEBGPMultihop
	
	public Boolean get_IsEBGPMultihop() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_ISEBGPMULTIHOP);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_ISEBGPMULTIHOP + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_ISEBGPMULTIHOP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IsEBGPMultihop(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_ISEBGPMULTIHOP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_ISEBGPMULTIHOP + " could not be found");
    		
		} else if (!CIM_BGPProtocolEndpointHelper.isValid_IsEBGPMultihop(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_ISEBGPMULTIHOP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_ISEBGPMULTIHOP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute KeepAlive
	
	public UnsignedInt16 get_KeepAlive() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_KEEPALIVE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_KEEPALIVE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_KEEPALIVE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_KeepAlive(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_KEEPALIVE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_KEEPALIVE + " could not be found");
    		
		} else if (!CIM_BGPProtocolEndpointHelper.isValid_KeepAlive(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_KEEPALIVE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_KEEPALIVE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute KeepAliveConfigured
	
	public UnsignedInt16 get_KeepAliveConfigured() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_KEEPALIVECONFIGURED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_KEEPALIVECONFIGURED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_KEEPALIVECONFIGURED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_KeepAliveConfigured(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_KEEPALIVECONFIGURED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_KEEPALIVECONFIGURED + " could not be found");
    		
		} else if (!CIM_BGPProtocolEndpointHelper.isValid_KeepAliveConfigured(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_KEEPALIVECONFIGURED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_KEEPALIVECONFIGURED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LocalAddress
	
	public String get_LocalAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_LOCALADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_LOCALADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_LOCALADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LocalAddress(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_LOCALADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_LOCALADDRESS + " could not be found");
    		
		} else if (!CIM_BGPProtocolEndpointHelper.isValid_LocalAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_LOCALADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_LOCALADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LocalIdentifier
	
	public String get_LocalIdentifier() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_LOCALIDENTIFIER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_LOCALIDENTIFIER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_LOCALIDENTIFIER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LocalIdentifier(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_LOCALIDENTIFIER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_LOCALIDENTIFIER + " could not be found");
    		
		} else if (!CIM_BGPProtocolEndpointHelper.isValid_LocalIdentifier(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_LOCALIDENTIFIER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_LOCALIDENTIFIER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LocalPort
	
	public UnsignedInt16 get_LocalPort() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_LOCALPORT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_LOCALPORT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_LOCALPORT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LocalPort(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_LOCALPORT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_LOCALPORT + " could not be found");
    		
		} else if (!CIM_BGPProtocolEndpointHelper.isValid_LocalPort(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_LOCALPORT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_LOCALPORT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MinASOriginationInterval
	
	public UnsignedInt16 get_MinASOriginationInterval() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_MINASORIGINATIONINTERVAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_MINASORIGINATIONINTERVAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_MINASORIGINATIONINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MinASOriginationInterval(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_MINASORIGINATIONINTERVAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_MINASORIGINATIONINTERVAL + " could not be found");
    		
		} else if (!CIM_BGPProtocolEndpointHelper.isValid_MinASOriginationInterval(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_MINASORIGINATIONINTERVAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_MINASORIGINATIONINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MinRouteAdvertisementInterval
	
	public UnsignedInt16 get_MinRouteAdvertisementInterval() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_MINROUTEADVERTISEMENTINTERVAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_MINROUTEADVERTISEMENTINTERVAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_MINROUTEADVERTISEMENTINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MinRouteAdvertisementInterval(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_MINROUTEADVERTISEMENTINTERVAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_MINROUTEADVERTISEMENTINTERVAL + " could not be found");
    		
		} else if (!CIM_BGPProtocolEndpointHelper.isValid_MinRouteAdvertisementInterval(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_MINROUTEADVERTISEMENTINTERVAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_MINROUTEADVERTISEMENTINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NegotiatedVersion
	
	public String get_NegotiatedVersion() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_NEGOTIATEDVERSION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_NEGOTIATEDVERSION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_NEGOTIATEDVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NegotiatedVersion(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_NEGOTIATEDVERSION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_NEGOTIATEDVERSION + " could not be found");
    		
		} else if (!CIM_BGPProtocolEndpointHelper.isValid_NegotiatedVersion(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_NEGOTIATEDVERSION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_NEGOTIATEDVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PeerIdentifier
	
	public String get_PeerIdentifier() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_PEERIDENTIFIER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_PEERIDENTIFIER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_PEERIDENTIFIER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PeerIdentifier(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_PEERIDENTIFIER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_PEERIDENTIFIER + " could not be found");
    		
		} else if (!CIM_BGPProtocolEndpointHelper.isValid_PeerIdentifier(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_PEERIDENTIFIER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_PEERIDENTIFIER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProtocolIFType
	
	public UnsignedInt16 get_ProtocolIFType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProtocolIFType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE + " could not be found");
    		
		} else if (!CIM_BGPProtocolEndpointHelper.isValid_ProtocolIFType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RemoteAS
	
	public UnsignedInt16 get_RemoteAS() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_REMOTEAS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_REMOTEAS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_REMOTEAS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RemoteAS(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_REMOTEAS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_REMOTEAS + " could not be found");
    		
		} else if (!CIM_BGPProtocolEndpointHelper.isValid_RemoteAS(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_REMOTEAS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_REMOTEAS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RemoteAddress
	
	public String get_RemoteAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_REMOTEADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_REMOTEADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_REMOTEADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RemoteAddress(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_REMOTEADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_REMOTEADDRESS + " could not be found");
    		
		} else if (!CIM_BGPProtocolEndpointHelper.isValid_RemoteAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_REMOTEADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_REMOTEADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RemotePort
	
	public UnsignedInt16 get_RemotePort() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_REMOTEPORT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_REMOTEPORT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_REMOTEPORT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RemotePort(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_REMOTEPORT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_REMOTEPORT + " could not be found");
    		
		} else if (!CIM_BGPProtocolEndpointHelper.isValid_RemotePort(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_REMOTEPORT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_REMOTEPORT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute State
	
	public UnsignedInt16 get_State() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_STATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_STATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_STATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_State(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BGPProtocolEndpoint.CIM_PROPERTY_STATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_STATE + " could not be found");
    		
		} else if (!CIM_BGPProtocolEndpointHelper.isValid_State(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_STATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BGPProtocolEndpoint.CIM_PROPERTY_STATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
