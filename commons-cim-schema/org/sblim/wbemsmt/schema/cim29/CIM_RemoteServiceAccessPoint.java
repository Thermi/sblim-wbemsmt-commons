/** 
 * CIM_RemoteServiceAccessPoint.java
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
 * Description: RemoteServiceAccessPoint describes access and/or addressing information for a remote connection, that is known to a 'local' network element. This information is scoped/contained by the 'local' network element, since this is the context in which it is 'remote'. 

Why the remote access point is relevant and information on its use are described by subclassing RemoteService AccessPoint, or by associating to it.
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



public class CIM_RemoteServiceAccessPoint extends CIM_ServiceAccessPoint  {
	
	public final static String CIM_CLASS_NAME = "CIM_RemoteServiceAccessPoint";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDNEXTHOP = "CIM_AssociatedNextHop";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PEERGATEWAYFORPRECONFIGUREDTUNNEL = "CIM_PeerGatewayForPreconfiguredTunnel";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PEERGATEWAYFORTUNNEL = "CIM_PeerGatewayForTunnel";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PEEROFSAENDPOINT = "CIM_PeerOfSAEndpoint";
	
	
	/**
	*	Access and/or addressing information for a remote connection. This can be a host name, network address or similar information.
	*/
	public final static String CIM_PROPERTY_ACCESSINFO = "AccessInfo"; //$NON-NLS-1$
	/**
	*	An enumerated integer describing the format and interpretation of the AccessInfo property.
	*/
	public final static String CIM_PROPERTY_INFOFORMAT = "InfoFormat"; //$NON-NLS-1$
	/**
	*	Describes the format when the property InfoFormat is set to 1 ("Other").
	*/
	public final static String CIM_PROPERTY_OTHERINFOFORMATDESCRIPTION = "OtherInfoFormatDescription"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ACCESSINFO);
		CIM_PropertyNameList.add(CIM_PROPERTY_INFOFORMAT);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERINFOFORMATDESCRIPTION);
				
		for (int i = 0; i < CIM_ServiceAccessPoint.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACCESSINFO)||
				((String)CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INFOFORMAT)||
				((String)CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERINFOFORMATDESCRIPTION)){
				continue;
			}
			
			CIM_RemoteServiceAccessPoint.CIM_PropertyNameList.add(CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACCESSINFO, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INFOFORMAT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERINFOFORMATDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_ServiceAccessPoint.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ServiceAccessPoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACCESSINFO)||
				((CIMProperty)CIM_ServiceAccessPoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INFOFORMAT)||
				((CIMProperty)CIM_ServiceAccessPoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERINFOFORMATDESCRIPTION)){
				continue;
			}
			
			CIM_RemoteServiceAccessPoint.CIM_PropertyList.add(CIM_ServiceAccessPoint.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_ServiceAccessPoint.Java_Package_List.size(); i++) {
			if (((String)CIM_ServiceAccessPoint.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_ServiceAccessPoint.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_INFOFORMAT = {"Other","Host Name","IPv4 Address","IPv6 Address","IPX Address","DECnet Address","SNA Address","Autonomous System Number","MPLS Label","IPv4 Subnet Address","IPv6 Subnet Address","IPv4 Address Range","IPv6 Address Range","Dial String","Ethernet Address","Token Ring Address","ATM Address","Frame Relay Address","URL","FQDN","User FQDN","DER ASN1 DN","DER ASN1 GN","Key ID","DMTF Reserved","Vendor Reserved"};
	
	
	public final static String INFOFORMAT_OTHER = "1";
	public final static String INFOFORMAT_HOSTNAME = "2";
	public final static String INFOFORMAT_IPV4ADDRESS = "3";
	public final static String INFOFORMAT_IPV6ADDRESS = "4";
	public final static String INFOFORMAT_IPXADDRESS = "5";
	public final static String INFOFORMAT_DECNETADDRESS = "6";
	public final static String INFOFORMAT_SNAADDRESS = "7";
	public final static String INFOFORMAT_AUTONOMOUSSYSTEMNUMBER = "8";
	public final static String INFOFORMAT_MPLSLABEL = "9";
	public final static String INFOFORMAT_IPV4SUBNETADDRESS = "10";
	public final static String INFOFORMAT_IPV6SUBNETADDRESS = "11";
	public final static String INFOFORMAT_IPV4ADDRESSRANGE = "12";
	public final static String INFOFORMAT_IPV6ADDRESSRANGE = "13";
	public final static String INFOFORMAT_DIALSTRING = "100";
	public final static String INFOFORMAT_ETHERNETADDRESS = "101";
	public final static String INFOFORMAT_TOKENRINGADDRESS = "102";
	public final static String INFOFORMAT_ATMADDRESS = "103";
	public final static String INFOFORMAT_FRAMERELAYADDRESS = "104";
	public final static String INFOFORMAT_URL = "200";
	public final static String INFOFORMAT_FQDN = "201";
	public final static String INFOFORMAT_USERFQDN = "202";
	public final static String INFOFORMAT_DERASN1DN = "203";
	public final static String INFOFORMAT_DERASN1GN = "204";
	public final static String INFOFORMAT_KEYID = "205";
	public final static String INFOFORMAT_DMTFRESERVED = "..";
	public final static String INFOFORMAT_VENDORRESERVED = "32768..65535";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_RemoteServiceAccessPoint() {

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
	public CIM_RemoteServiceAccessPoint(Vector keyProperties){ 
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
	public CIM_RemoteServiceAccessPoint(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_RemoteServiceAccessPoint)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_RemoteServiceAccessPoint)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_RemoteServiceAccessPoint)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_RemoteServiceAccessPoint)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_RemoteServiceAccessPoint)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_RemoteServiceAccessPoint)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_RemoteServiceAccessPoint)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_RemoteServiceAccessPoint)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_RemoteServiceAccessPoint)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_RemoteServiceAccessPoint)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_NextHopRoute_CIM_AssociatedNextHops(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDNEXTHOP, 
					CIM_NextHopRoute.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_RemoteServiceAccessPoint.Java_Package_List.size(); i++) {
						if (!((String)(CIM_RemoteServiceAccessPoint.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_RemoteServiceAccessPoint.Java_Package_List.get(i))).endsWith(".")) {
							CIM_RemoteServiceAccessPoint.Java_Package_List.setElementAt((String)(CIM_RemoteServiceAccessPoint.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_RemoteServiceAccessPoint.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_NextHopRoute(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_NextHopRoute(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_NextHopRoute(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_NextHopRoute_CIM_AssociatedNextHop_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDNEXTHOP, 
					CIM_NextHopRoute.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_NextHopRoute.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_PreconfiguredTunnelAction_CIM_PeerGatewayForPreconfiguredTunnels(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PEERGATEWAYFORPRECONFIGUREDTUNNEL, 
					CIM_PreconfiguredTunnelAction.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_RemoteServiceAccessPoint.Java_Package_List.size(); i++) {
						if (!((String)(CIM_RemoteServiceAccessPoint.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_RemoteServiceAccessPoint.Java_Package_List.get(i))).endsWith(".")) {
							CIM_RemoteServiceAccessPoint.Java_Package_List.setElementAt((String)(CIM_RemoteServiceAccessPoint.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_RemoteServiceAccessPoint.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PreconfiguredTunnelAction(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_PreconfiguredTunnelAction(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PreconfiguredTunnelAction(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_PreconfiguredTunnelAction_CIM_PeerGatewayForPreconfiguredTunnel_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PEERGATEWAYFORPRECONFIGUREDTUNNEL, 
					CIM_PreconfiguredTunnelAction.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_PreconfiguredTunnelAction.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_IPsecTunnelAction_CIM_PeerGatewayForTunnels(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PEERGATEWAYFORTUNNEL, 
					CIM_IPsecTunnelAction.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_RemoteServiceAccessPoint.Java_Package_List.size(); i++) {
						if (!((String)(CIM_RemoteServiceAccessPoint.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_RemoteServiceAccessPoint.Java_Package_List.get(i))).endsWith(".")) {
							CIM_RemoteServiceAccessPoint.Java_Package_List.setElementAt((String)(CIM_RemoteServiceAccessPoint.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_RemoteServiceAccessPoint.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_IPsecTunnelAction(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_IPsecTunnelAction(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_IPsecTunnelAction(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_IPsecTunnelAction_CIM_PeerGatewayForTunnel_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PEERGATEWAYFORTUNNEL, 
					CIM_IPsecTunnelAction.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_IPsecTunnelAction.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_IPsecSAEndpoint_CIM_PeerOfSAEndpoints(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PEEROFSAENDPOINT, 
					CIM_IPsecSAEndpoint.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_RemoteServiceAccessPoint.Java_Package_List.size(); i++) {
						if (!((String)(CIM_RemoteServiceAccessPoint.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_RemoteServiceAccessPoint.Java_Package_List.get(i))).endsWith(".")) {
							CIM_RemoteServiceAccessPoint.Java_Package_List.setElementAt((String)(CIM_RemoteServiceAccessPoint.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_RemoteServiceAccessPoint.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_IPsecSAEndpoint(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_IPsecSAEndpoint(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_IPsecSAEndpoint(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_IPsecSAEndpoint_CIM_PeerOfSAEndpoint_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PEEROFSAENDPOINT, 
					CIM_IPsecSAEndpoint.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_IPsecSAEndpoint.CIM_CLASS_NAME)) {
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
	
	// Attribute AccessInfo
	
	public String get_AccessInfo() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RemoteServiceAccessPoint.CIM_PROPERTY_ACCESSINFO);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RemoteServiceAccessPoint.CIM_PROPERTY_ACCESSINFO + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RemoteServiceAccessPoint.CIM_PROPERTY_ACCESSINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AccessInfo(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RemoteServiceAccessPoint.CIM_PROPERTY_ACCESSINFO);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RemoteServiceAccessPoint.CIM_PROPERTY_ACCESSINFO + " could not be found");
    		
		} else if (!CIM_RemoteServiceAccessPointHelper.isValid_AccessInfo(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RemoteServiceAccessPoint.CIM_PROPERTY_ACCESSINFO);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RemoteServiceAccessPoint.CIM_PROPERTY_ACCESSINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InfoFormat
	
	public UnsignedInt16 get_InfoFormat() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RemoteServiceAccessPoint.CIM_PROPERTY_INFOFORMAT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RemoteServiceAccessPoint.CIM_PROPERTY_INFOFORMAT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RemoteServiceAccessPoint.CIM_PROPERTY_INFOFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InfoFormat(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RemoteServiceAccessPoint.CIM_PROPERTY_INFOFORMAT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RemoteServiceAccessPoint.CIM_PROPERTY_INFOFORMAT + " could not be found");
    		
		} else if (!CIM_RemoteServiceAccessPointHelper.isValid_InfoFormat(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RemoteServiceAccessPoint.CIM_PROPERTY_INFOFORMAT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RemoteServiceAccessPoint.CIM_PROPERTY_INFOFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherInfoFormatDescription
	
	public String get_OtherInfoFormatDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RemoteServiceAccessPoint.CIM_PROPERTY_OTHERINFOFORMATDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RemoteServiceAccessPoint.CIM_PROPERTY_OTHERINFOFORMATDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RemoteServiceAccessPoint.CIM_PROPERTY_OTHERINFOFORMATDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherInfoFormatDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RemoteServiceAccessPoint.CIM_PROPERTY_OTHERINFOFORMATDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RemoteServiceAccessPoint.CIM_PROPERTY_OTHERINFOFORMATDESCRIPTION + " could not be found");
    		
		} else if (!CIM_RemoteServiceAccessPointHelper.isValid_OtherInfoFormatDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RemoteServiceAccessPoint.CIM_PROPERTY_OTHERINFOFORMATDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RemoteServiceAccessPoint.CIM_PROPERTY_OTHERINFOFORMATDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
