/** 
 * CIM_SpanningTreeService.java
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
 * Description: This service class represents the capability of a switch to participate in the distributed construction of a spanning tree.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.lang.reflect.Constructor;
import org.sblim.wbem.client.*;



public class CIM_SpanningTreeService extends CIM_ForwardingService  {
	
	public final static String CIM_CLASS_NAME = "CIM_SpanningTreeService";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_RELATEDSPANNINGTREE = "CIM_RelatedSpanningTree";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_SWITCHPORTSPANNINGTREE = "CIM_SwitchPortSpanningTree";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_SWITCHSERVICESPANNINGTREE = "CIM_SwitchServiceSpanningTree";
	
	
	/**
	*	The ForwardDelay parameter to be used by all switches in the network if this switch becomes the root.
	*/
	public final static String CIM_PROPERTY_BRIDGEFORWARDDELAY = "BridgeForwardDelay"; //$NON-NLS-1$
	/**
	*	The HelloTime parameter to be used by all switches in the network if this switch becomes the root.
	*/
	public final static String CIM_PROPERTY_BRIDGEHELLOTIME = "BridgeHelloTime"; //$NON-NLS-1$
	/**
	*	The MaxAge parameter to be used by all switches in the network if this switch becomes the root.
	*/
	public final static String CIM_PROPERTY_BRIDGEMAXAGE = "BridgeMaxAge"; //$NON-NLS-1$
	/**
	*	The complete Bridge ID (Priority + MAC Address) of the root bridge. The format of the priority bits are the first two octets of the 8-octet long Bridge ID. Note that the MAC address is formatted as twelve hexadecimal digits (e.g., "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order according to RFC 2469.
	*/
	public final static String CIM_PROPERTY_DESIGNATEDROOT = "DesignatedRoot"; //$NON-NLS-1$
	/**
	*	The time spent by a port in the listening state before transitioning to the learning state, and in the learning state before transitioning to the forwarding state, as learned from the network. This value is also used during the period of a topology change as the maximum age of Spanning Tree information before discard.
	*/
	public final static String CIM_PROPERTY_FORWARDDELAY = "ForwardDelay"; //$NON-NLS-1$
	/**
	*	The current value of the interval between transmission of bridge PDUs by the switch, on any port for which it is the spanning tree root or trying to become so, as learned from the network.
	*/
	public final static String CIM_PROPERTY_HELLOTIME = "HelloTime"; //$NON-NLS-1$
	/**
	*	The minimum interval between transmission of bridge PDUs through a given port, as learned from the network.
	*/
	public final static String CIM_PROPERTY_HOLDTIME = "HoldTime"; //$NON-NLS-1$
	/**
	*	The current value for the maximum age of Spanning Tree information before discard, as learned from the network.
	*/
	public final static String CIM_PROPERTY_MAXAGE = "MaxAge"; //$NON-NLS-1$
	/**
	*	The format of the priority bits are the first two octets of the 8-octet long Bridge ID. The other (last) 6 octets of the Bridge ID are given by the value of the Bridge Address. 

A priority that can be assigned to the switch for use in constructing the spanning tree. The unique identifier for a switch is constructed by concatenating the MAC address associated with the switch for spanning tree operations to the two-byte priority. Choice of the priority value influences election of the root bridge.
	*/
	public final static String CIM_PROPERTY_PRIORITY = "Priority"; //$NON-NLS-1$
	/**
	*	The version of the spanning tree protocol used by the switch.
	*/
	public final static String CIM_PROPERTY_PROTOCOLSPEC = "ProtocolSpec"; //$NON-NLS-1$
	/**
	*	The cost of the path from the switch to the root.
	*/
	public final static String CIM_PROPERTY_ROOTCOST = "RootCost"; //$NON-NLS-1$
	/**
	*	The port number of the port having the lowest cost path to the root bridge.
	*/
	public final static String CIM_PROPERTY_ROOTPORT = "RootPort"; //$NON-NLS-1$
	/**
	*	MAC address used by the spanning tree service when it must be uniquely identified. When concatenated with a SpanningTreeService Priority, a unique bridge identifier results. This property is defined for use of switches supporting multiple spanning tree services. 

Note that the MAC address is formatted as twelve hexadecimal digits (e.g., "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order according to RFC 2469.
	*/
	public final static String CIM_PROPERTY_SPANNINGTREEBRIDGEADDRESS = "SpanningTreeBridgeAddress"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_BRIDGEFORWARDDELAY);
		CIM_PropertyNameList.add(CIM_PROPERTY_BRIDGEHELLOTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_BRIDGEMAXAGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_DESIGNATEDROOT);
		CIM_PropertyNameList.add(CIM_PROPERTY_FORWARDDELAY);
		CIM_PropertyNameList.add(CIM_PROPERTY_HELLOTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_HOLDTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXAGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRIORITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROTOCOLSPEC);
		CIM_PropertyNameList.add(CIM_PROPERTY_ROOTCOST);
		CIM_PropertyNameList.add(CIM_PROPERTY_ROOTPORT);
		CIM_PropertyNameList.add(CIM_PROPERTY_SPANNINGTREEBRIDGEADDRESS);
				
		for (int i = 0; i < CIM_ForwardingService.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ForwardingService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BRIDGEFORWARDDELAY)||
				((String)CIM_ForwardingService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BRIDGEHELLOTIME)||
				((String)CIM_ForwardingService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BRIDGEMAXAGE)||
				((String)CIM_ForwardingService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DESIGNATEDROOT)||
				((String)CIM_ForwardingService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FORWARDDELAY)||
				((String)CIM_ForwardingService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HELLOTIME)||
				((String)CIM_ForwardingService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HOLDTIME)||
				((String)CIM_ForwardingService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXAGE)||
				((String)CIM_ForwardingService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRIORITY)||
				((String)CIM_ForwardingService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROTOCOLSPEC)||
				((String)CIM_ForwardingService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ROOTCOST)||
				((String)CIM_ForwardingService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ROOTPORT)||
				((String)CIM_ForwardingService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SPANNINGTREEBRIDGEADDRESS)){
				continue;
			}
			
			CIM_SpanningTreeService.CIM_PropertyNameList.add(CIM_ForwardingService.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BRIDGEFORWARDDELAY, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BRIDGEHELLOTIME, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BRIDGEMAXAGE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DESIGNATEDROOT, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FORWARDDELAY, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HELLOTIME, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HOLDTIME, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXAGE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRIORITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROTOCOLSPEC, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ROOTCOST, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ROOTPORT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SPANNINGTREEBRIDGEADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_ForwardingService.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ForwardingService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BRIDGEFORWARDDELAY)||
				((CIMProperty)CIM_ForwardingService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BRIDGEHELLOTIME)||
				((CIMProperty)CIM_ForwardingService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BRIDGEMAXAGE)||
				((CIMProperty)CIM_ForwardingService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DESIGNATEDROOT)||
				((CIMProperty)CIM_ForwardingService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FORWARDDELAY)||
				((CIMProperty)CIM_ForwardingService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HELLOTIME)||
				((CIMProperty)CIM_ForwardingService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HOLDTIME)||
				((CIMProperty)CIM_ForwardingService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXAGE)||
				((CIMProperty)CIM_ForwardingService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRIORITY)||
				((CIMProperty)CIM_ForwardingService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROTOCOLSPEC)||
				((CIMProperty)CIM_ForwardingService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ROOTCOST)||
				((CIMProperty)CIM_ForwardingService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ROOTPORT)||
				((CIMProperty)CIM_ForwardingService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SPANNINGTREEBRIDGEADDRESS)){
				continue;
			}
			
			CIM_SpanningTreeService.CIM_PropertyList.add(CIM_ForwardingService.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_ForwardingService.Java_Package_List.size(); i++) {
			if (((String)CIM_ForwardingService.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_ForwardingService.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_PROTOCOLSPEC = {"Unknown","DEC LB100","IEEE 802d"};
	
	
	public final static int PROTOCOLSPEC_UNKNOWN = 1;
	public final static int PROTOCOLSPEC_DECLB100 = 2;
	public final static int PROTOCOLSPEC_IEEE802D = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_SpanningTreeService() {

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
	public CIM_SpanningTreeService(Vector keyProperties){ 
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
	public CIM_SpanningTreeService(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_SpanningTreeService)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_SpanningTreeService)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_SpanningTreeService)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_SpanningTreeService)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_SpanningTreeService)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_SpanningTreeService)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_SpanningTreeService)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_SpanningTreeService)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_SpanningTreeService)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_SpanningTreeService)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_TransparentBridgingService_CIM_RelatedSpanningTrees(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_RELATEDSPANNINGTREE, 
					CIM_TransparentBridgingService.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_SpanningTreeService.Java_Package_List.size(); i++) {
						if (!((String)(CIM_SpanningTreeService.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_SpanningTreeService.Java_Package_List.get(i))).endsWith(".")) {
							CIM_SpanningTreeService.Java_Package_List.setElementAt((String)(CIM_SpanningTreeService.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_SpanningTreeService.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_TransparentBridgingService(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_TransparentBridgingService(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_TransparentBridgingService(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_TransparentBridgingService_CIM_RelatedSpanningTree_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_RELATEDSPANNINGTREE, 
					CIM_TransparentBridgingService.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_TransparentBridgingService.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_SwitchPort_CIM_SwitchPortSpanningTrees(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_SWITCHPORTSPANNINGTREE, 
					CIM_SwitchPort.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_SpanningTreeService.Java_Package_List.size(); i++) {
						if (!((String)(CIM_SpanningTreeService.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_SpanningTreeService.Java_Package_List.get(i))).endsWith(".")) {
							CIM_SpanningTreeService.Java_Package_List.setElementAt((String)(CIM_SpanningTreeService.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_SpanningTreeService.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_SwitchPort(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_SwitchPort(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_SwitchPort(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_SwitchPort_CIM_SwitchPortSpanningTree_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_SWITCHPORTSPANNINGTREE, 
					CIM_SwitchPort.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_SwitchPort.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_SwitchService_CIM_SwitchServiceSpanningTrees(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_SWITCHSERVICESPANNINGTREE, 
					CIM_SwitchService.CIM_CLASS_NAME, 
					"PartComponent",
					"GroupComponent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_SpanningTreeService.Java_Package_List.size(); i++) {
						if (!((String)(CIM_SpanningTreeService.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_SpanningTreeService.Java_Package_List.get(i))).endsWith(".")) {
							CIM_SpanningTreeService.Java_Package_List.setElementAt((String)(CIM_SpanningTreeService.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_SpanningTreeService.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_SwitchService(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_SwitchService(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_SwitchService(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_SwitchService_CIM_SwitchServiceSpanningTree_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_SWITCHSERVICESPANNINGTREE, 
					CIM_SwitchService.CIM_CLASS_NAME, 
					"PartComponent",
					"GroupComponent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_SwitchService.CIM_CLASS_NAME)) {
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
	
	// Attribute BridgeForwardDelay
	
	public UnsignedInt32 get_BridgeForwardDelay() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SpanningTreeService.CIM_PROPERTY_BRIDGEFORWARDDELAY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_BRIDGEFORWARDDELAY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_BRIDGEFORWARDDELAY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BridgeForwardDelay(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SpanningTreeService.CIM_PROPERTY_BRIDGEFORWARDDELAY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_BRIDGEFORWARDDELAY + " could not be found");
    		
		} else if (!CIM_SpanningTreeServiceHelper.isValid_BridgeForwardDelay(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SpanningTreeService.CIM_PROPERTY_BRIDGEFORWARDDELAY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_BRIDGEFORWARDDELAY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BridgeHelloTime
	
	public UnsignedInt32 get_BridgeHelloTime() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SpanningTreeService.CIM_PROPERTY_BRIDGEHELLOTIME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_BRIDGEHELLOTIME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_BRIDGEHELLOTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BridgeHelloTime(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SpanningTreeService.CIM_PROPERTY_BRIDGEHELLOTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_BRIDGEHELLOTIME + " could not be found");
    		
		} else if (!CIM_SpanningTreeServiceHelper.isValid_BridgeHelloTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SpanningTreeService.CIM_PROPERTY_BRIDGEHELLOTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_BRIDGEHELLOTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BridgeMaxAge
	
	public UnsignedInt32 get_BridgeMaxAge() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SpanningTreeService.CIM_PROPERTY_BRIDGEMAXAGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_BRIDGEMAXAGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_BRIDGEMAXAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BridgeMaxAge(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SpanningTreeService.CIM_PROPERTY_BRIDGEMAXAGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_BRIDGEMAXAGE + " could not be found");
    		
		} else if (!CIM_SpanningTreeServiceHelper.isValid_BridgeMaxAge(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SpanningTreeService.CIM_PROPERTY_BRIDGEMAXAGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_BRIDGEMAXAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DesignatedRoot
	
	public String get_DesignatedRoot() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SpanningTreeService.CIM_PROPERTY_DESIGNATEDROOT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_DESIGNATEDROOT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_DESIGNATEDROOT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DesignatedRoot(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SpanningTreeService.CIM_PROPERTY_DESIGNATEDROOT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_DESIGNATEDROOT + " could not be found");
    		
		} else if (!CIM_SpanningTreeServiceHelper.isValid_DesignatedRoot(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SpanningTreeService.CIM_PROPERTY_DESIGNATEDROOT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_DESIGNATEDROOT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ForwardDelay
	
	public UnsignedInt32 get_ForwardDelay() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SpanningTreeService.CIM_PROPERTY_FORWARDDELAY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_FORWARDDELAY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_FORWARDDELAY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ForwardDelay(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SpanningTreeService.CIM_PROPERTY_FORWARDDELAY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_FORWARDDELAY + " could not be found");
    		
		} else if (!CIM_SpanningTreeServiceHelper.isValid_ForwardDelay(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SpanningTreeService.CIM_PROPERTY_FORWARDDELAY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_FORWARDDELAY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HelloTime
	
	public UnsignedInt32 get_HelloTime() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SpanningTreeService.CIM_PROPERTY_HELLOTIME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_HELLOTIME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_HELLOTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HelloTime(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SpanningTreeService.CIM_PROPERTY_HELLOTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_HELLOTIME + " could not be found");
    		
		} else if (!CIM_SpanningTreeServiceHelper.isValid_HelloTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SpanningTreeService.CIM_PROPERTY_HELLOTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_HELLOTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HoldTime
	
	public UnsignedInt32 get_HoldTime() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SpanningTreeService.CIM_PROPERTY_HOLDTIME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_HOLDTIME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_HOLDTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HoldTime(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SpanningTreeService.CIM_PROPERTY_HOLDTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_HOLDTIME + " could not be found");
    		
		} else if (!CIM_SpanningTreeServiceHelper.isValid_HoldTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SpanningTreeService.CIM_PROPERTY_HOLDTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_HOLDTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxAge
	
	public UnsignedInt32 get_MaxAge() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SpanningTreeService.CIM_PROPERTY_MAXAGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_MAXAGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_MAXAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxAge(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SpanningTreeService.CIM_PROPERTY_MAXAGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_MAXAGE + " could not be found");
    		
		} else if (!CIM_SpanningTreeServiceHelper.isValid_MaxAge(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SpanningTreeService.CIM_PROPERTY_MAXAGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_MAXAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Priority
	
	public UnsignedInt16 get_Priority() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SpanningTreeService.CIM_PROPERTY_PRIORITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_PRIORITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_PRIORITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Priority(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SpanningTreeService.CIM_PROPERTY_PRIORITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_PRIORITY + " could not be found");
    		
		} else if (!CIM_SpanningTreeServiceHelper.isValid_Priority(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SpanningTreeService.CIM_PROPERTY_PRIORITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_PRIORITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProtocolSpec
	
	public UnsignedInt16 get_ProtocolSpec() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SpanningTreeService.CIM_PROPERTY_PROTOCOLSPEC);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_PROTOCOLSPEC + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_PROTOCOLSPEC + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProtocolSpec(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SpanningTreeService.CIM_PROPERTY_PROTOCOLSPEC);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_PROTOCOLSPEC + " could not be found");
    		
		} else if (!CIM_SpanningTreeServiceHelper.isValid_ProtocolSpec(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SpanningTreeService.CIM_PROPERTY_PROTOCOLSPEC);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_PROTOCOLSPEC + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RootCost
	
	public UnsignedInt16 get_RootCost() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SpanningTreeService.CIM_PROPERTY_ROOTCOST);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_ROOTCOST + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_ROOTCOST + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RootCost(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SpanningTreeService.CIM_PROPERTY_ROOTCOST);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_ROOTCOST + " could not be found");
    		
		} else if (!CIM_SpanningTreeServiceHelper.isValid_RootCost(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SpanningTreeService.CIM_PROPERTY_ROOTCOST);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_ROOTCOST + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RootPort
	
	public UnsignedInt16 get_RootPort() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SpanningTreeService.CIM_PROPERTY_ROOTPORT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_ROOTPORT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_ROOTPORT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RootPort(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SpanningTreeService.CIM_PROPERTY_ROOTPORT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_ROOTPORT + " could not be found");
    		
		} else if (!CIM_SpanningTreeServiceHelper.isValid_RootPort(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SpanningTreeService.CIM_PROPERTY_ROOTPORT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_ROOTPORT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SpanningTreeBridgeAddress
	
	public String get_SpanningTreeBridgeAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SpanningTreeService.CIM_PROPERTY_SPANNINGTREEBRIDGEADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_SPANNINGTREEBRIDGEADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_SPANNINGTREEBRIDGEADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SpanningTreeBridgeAddress(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SpanningTreeService.CIM_PROPERTY_SPANNINGTREEBRIDGEADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_SPANNINGTREEBRIDGEADDRESS + " could not be found");
    		
		} else if (!CIM_SpanningTreeServiceHelper.isValid_SpanningTreeBridgeAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SpanningTreeService.CIM_PROPERTY_SPANNINGTREEBRIDGEADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SpanningTreeService.CIM_PROPERTY_SPANNINGTREEBRIDGEADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
