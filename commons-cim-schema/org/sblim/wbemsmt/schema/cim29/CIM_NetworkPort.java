/** 
 * CIM_NetworkPort.java
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
 * Description:  NetworkPort is the logical representation of network communications hardware -
 * a physical connector and the setup/operation of the network chips, at the
 * lowest layers of a network stack.
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



/**
 *  NetworkPort is the logical representation of network communications hardware -
 * a physical connector and the setup/operation of the network chips, at the
 * lowest layers of a network stack.
 */
public class CIM_NetworkPort extends CIM_LogicalPort  {
	
	public final static String CIM_CLASS_NAME = "CIM_NetworkPort"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_MODULEPORT = "CIM_ModulePort"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKPORT = "CIM_OOBAlertServiceOnNetworkPort"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTACTIVECONNECTION = "CIM_PortActiveConnection"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKPORT = "CIM_WakeUpServiceOnNetworkPort"; //$NON-NLS-1$
	
	
	/**
	*	The active or negotiated maximum transmission unit (MTU) that can be supported.
	*/
	public final static String CIM_PROPERTY_ACTIVEMAXIMUMTRANSMISSIONUNIT = "ActiveMaximumTransmissionUnit"; //$NON-NLS-1$
	/**
	*	A boolean indicating whether the NetworkPort is capable of automatically determining the speed or other communications characteristics of the attached network media.
	*/
	public final static String CIM_PROPERTY_AUTOSENSE = "AutoSense"; //$NON-NLS-1$
	/**
	*	Boolean indicating that the port is operating in full duplex mode.
	*/
	public final static String CIM_PROPERTY_FULLDUPLEX = "FullDuplex"; //$NON-NLS-1$
	/**
	*	An enumeration of the types of links. When set to 1 ("Other"), the related property OtherLinkTechnology contains a string description of the link's type.
	*/
	public final static String CIM_PROPERTY_LINKTECHNOLOGY = "LinkTechnology"; //$NON-NLS-1$
	/**
	*	An array of strings indicating the network addresses for the port.
	*/
	public final static String CIM_PROPERTY_NETWORKADDRESSES = "NetworkAddresses"; //$NON-NLS-1$
	/**
	*	A string value describing LinkTechnology when it is set to 1, "Other".
	*/
	public final static String CIM_PROPERTY_OTHERLINKTECHNOLOGY = "OtherLinkTechnology"; //$NON-NLS-1$
	/**
	*	Describes the type of module, when PortType is set to 1 ("Other").
	*/
	public final static String CIM_PROPERTY_OTHERNETWORKPORTTYPE = "OtherNetworkPortType"; //$NON-NLS-1$
	/**
	*	PermanentAddress defines the network address hardcoded into a port. This 'hardcoded' address may be changed via firmware upgrade or software configuration. If so, this field should be updated when the change is made. PermanentAddress should be left blank if no 'hardcoded' address exists for the NetworkAdapter.
	*/
	public final static String CIM_PROPERTY_PERMANENTADDRESS = "PermanentAddress"; //$NON-NLS-1$
	/**
	*	NetworkPorts are often numbered relative to either a logical modules or a network element.
	*/
	public final static String CIM_PROPERTY_PORTNUMBER = "PortNumber"; //$NON-NLS-1$
	/**
	*	PortType is defined to force consistent naming of the 'type' property in subclasses and to guarantee unique enum values for all instances of NetworkPort. When set to 1 ("Other"), related property OtherPortType contains a string description the of the port's type. A range of values, DMTF_Reserved, has been defined that allows subclasses to override and define their specific port types.
	*/
	public final static String CIM_PROPERTY_PORTTYPE = "PortType"; //$NON-NLS-1$
	/**
	*	The current bandwidth of the Port in Bits per Second. For ports that vary in bandwidth or for those where no accurate estimation can be made, this property should contain the nominal bandwidth.
	*/
	public final static String CIM_PROPERTY_SPEED = "Speed"; //$NON-NLS-1$
	/**
	*	The maximum transmission unit (MTU) that can be supported.
	*/
	public final static String CIM_PROPERTY_SUPPORTEDMAXIMUMTRANSMISSIONUNIT = "SupportedMaximumTransmissionUnit"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ACTIVEMAXIMUMTRANSMISSIONUNIT);
		CIM_PropertyNameList.add(CIM_PROPERTY_AUTOSENSE);
		CIM_PropertyNameList.add(CIM_PROPERTY_FULLDUPLEX);
		CIM_PropertyNameList.add(CIM_PROPERTY_LINKTECHNOLOGY);
		CIM_PropertyNameList.add(CIM_PROPERTY_NETWORKADDRESSES);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERLINKTECHNOLOGY);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERNETWORKPORTTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PERMANENTADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_PORTNUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_PORTTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SPEED);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTEDMAXIMUMTRANSMISSIONUNIT);
				
		for (int i = 0; i < CIM_LogicalPort.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACTIVEMAXIMUMTRANSMISSIONUNIT)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AUTOSENSE)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FULLDUPLEX)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LINKTECHNOLOGY)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NETWORKADDRESSES)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERLINKTECHNOLOGY)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERNETWORKPORTTYPE)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PERMANENTADDRESS)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PORTNUMBER)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PORTTYPE)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SPEED)||
				((String)CIM_LogicalPort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTEDMAXIMUMTRANSMISSIONUNIT)){
				continue;
			}
			
			CIM_NetworkPort.CIM_PropertyNameList.add(CIM_LogicalPort.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACTIVEMAXIMUMTRANSMISSIONUNIT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AUTOSENSE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FULLDUPLEX, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LINKTECHNOLOGY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NETWORKADDRESSES, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERLINKTECHNOLOGY, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERNETWORKPORTTYPE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PERMANENTADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PORTNUMBER, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PORTTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SPEED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTEDMAXIMUMTRANSMISSIONUNIT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_LogicalPort.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACTIVEMAXIMUMTRANSMISSIONUNIT)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AUTOSENSE)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FULLDUPLEX)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LINKTECHNOLOGY)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NETWORKADDRESSES)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERLINKTECHNOLOGY)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERNETWORKPORTTYPE)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PERMANENTADDRESS)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PORTNUMBER)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PORTTYPE)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SPEED)||
				((CIMProperty)CIM_LogicalPort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTEDMAXIMUMTRANSMISSIONUNIT)){
				continue;
			}
			
			CIM_NetworkPort.CIM_PropertyList.add(CIM_LogicalPort.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_LogicalPort.Java_Package_List.size(); i++) {
			if (((String)CIM_LogicalPort.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_LogicalPort.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_LINKTECHNOLOGY = {"Unknown","Other","Ethernet","IB","FC","FDDI","ATM","Token Ring","Frame Relay","Infrared","BlueTooth","Wireless LAN"};
	public final static String[] CIM_VALUEMAP_PORTTYPE = {"Unknown","Other","Not Applicable","DMTF Reserved","Vendor Reserved"};
	
	
	public final static int LINKTECHNOLOGY_UNKNOWN = 0;
	public final static int LINKTECHNOLOGY_OTHER = 1;
	public final static int LINKTECHNOLOGY_ETHERNET = 2;
	public final static int LINKTECHNOLOGY_IB = 3;
	public final static int LINKTECHNOLOGY_FC = 4;
	public final static int LINKTECHNOLOGY_FDDI = 5;
	public final static int LINKTECHNOLOGY_ATM = 6;
	public final static int LINKTECHNOLOGY_TOKENRING = 7;
	public final static int LINKTECHNOLOGY_FRAMERELAY = 8;
	public final static int LINKTECHNOLOGY_INFRARED = 9;
	public final static int LINKTECHNOLOGY_BLUETOOTH = 10;
	public final static int LINKTECHNOLOGY_WIRELESSLAN = 11;
	
	public final static String PORTTYPE_UNKNOWN = "0";
	public final static String PORTTYPE_OTHER = "1";
	public final static String PORTTYPE_NOTAPPLICABLE = "2";
	public final static String PORTTYPE_DMTFRESERVED = "3..15999";
	public final static String PORTTYPE_VENDORRESERVED = "16000..65535";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_NetworkPort() {

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
	public CIM_NetworkPort(Vector keyProperties){ 
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
	public CIM_NetworkPort(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_NetworkPort)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_NetworkPort)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_NetworkPort)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_NetworkPort)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_NetworkPort)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_NetworkPort)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_NetworkPort)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_NetworkPort)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_NetworkPort)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_NetworkPort)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_LogicalModule_CIM_ModulePorts(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_MODULEPORT, 
					CIM_LogicalModule.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_NetworkPort.Java_Package_List.size(); i++) {
						if (!((String)(CIM_NetworkPort.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_NetworkPort.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_NetworkPort.Java_Package_List.setElementAt((String)(CIM_NetworkPort.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_NetworkPort.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_LogicalModule(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_LogicalModule(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_LogicalModule(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_LogicalModule_CIM_ModulePort_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_MODULEPORT, 
					CIM_LogicalModule.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_LogicalModule.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_OOBAlertService_CIM_OOBAlertServiceOnNetworkPorts(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKPORT, 
					CIM_OOBAlertService.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_NetworkPort.Java_Package_List.size(); i++) {
						if (!((String)(CIM_NetworkPort.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_NetworkPort.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_NetworkPort.Java_Package_List.setElementAt((String)(CIM_NetworkPort.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_NetworkPort.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_OOBAlertService(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_OOBAlertService(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_OOBAlertService(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_OOBAlertService_CIM_OOBAlertServiceOnNetworkPort_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKPORT, 
					CIM_OOBAlertService.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_OOBAlertService.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_PhysicalConnector_CIM_PortActiveConnections(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTACTIVECONNECTION, 
					CIM_PhysicalConnector.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_NetworkPort.Java_Package_List.size(); i++) {
						if (!((String)(CIM_NetworkPort.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_NetworkPort.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_NetworkPort.Java_Package_List.setElementAt((String)(CIM_NetworkPort.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_NetworkPort.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PhysicalConnector(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_PhysicalConnector(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PhysicalConnector(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_PhysicalConnector_CIM_PortActiveConnection_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PORTACTIVECONNECTION, 
					CIM_PhysicalConnector.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_PhysicalConnector.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_WakeUpService_CIM_WakeUpServiceOnNetworkPorts(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKPORT, 
					CIM_WakeUpService.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_NetworkPort.Java_Package_List.size(); i++) {
						if (!((String)(CIM_NetworkPort.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_NetworkPort.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_NetworkPort.Java_Package_List.setElementAt((String)(CIM_NetworkPort.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_NetworkPort.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_WakeUpService(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_WakeUpService(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_WakeUpService(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_WakeUpService_CIM_WakeUpServiceOnNetworkPort_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKPORT, 
					CIM_WakeUpService.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_WakeUpService.CIM_CLASS_NAME)) {
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
	
	// Attribute ActiveMaximumTransmissionUnit
	
	public UnsignedInt64 get_ActiveMaximumTransmissionUnit() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPort.CIM_PROPERTY_ACTIVEMAXIMUMTRANSMISSIONUNIT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPort.CIM_PROPERTY_ACTIVEMAXIMUMTRANSMISSIONUNIT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPort.CIM_PROPERTY_ACTIVEMAXIMUMTRANSMISSIONUNIT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ActiveMaximumTransmissionUnit(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPort.CIM_PROPERTY_ACTIVEMAXIMUMTRANSMISSIONUNIT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPort.CIM_PROPERTY_ACTIVEMAXIMUMTRANSMISSIONUNIT + " could not be found");
    		
		} else if (!CIM_NetworkPortHelper.isValid_ActiveMaximumTransmissionUnit(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkPort.CIM_PROPERTY_ACTIVEMAXIMUMTRANSMISSIONUNIT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPort.CIM_PROPERTY_ACTIVEMAXIMUMTRANSMISSIONUNIT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AutoSense
	
	public Boolean get_AutoSense() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPort.CIM_PROPERTY_AUTOSENSE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPort.CIM_PROPERTY_AUTOSENSE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPort.CIM_PROPERTY_AUTOSENSE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AutoSense(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPort.CIM_PROPERTY_AUTOSENSE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPort.CIM_PROPERTY_AUTOSENSE + " could not be found");
    		
		} else if (!CIM_NetworkPortHelper.isValid_AutoSense(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkPort.CIM_PROPERTY_AUTOSENSE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPort.CIM_PROPERTY_AUTOSENSE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FullDuplex
	
	public Boolean get_FullDuplex() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPort.CIM_PROPERTY_FULLDUPLEX);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPort.CIM_PROPERTY_FULLDUPLEX + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPort.CIM_PROPERTY_FULLDUPLEX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FullDuplex(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPort.CIM_PROPERTY_FULLDUPLEX);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPort.CIM_PROPERTY_FULLDUPLEX + " could not be found");
    		
		} else if (!CIM_NetworkPortHelper.isValid_FullDuplex(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkPort.CIM_PROPERTY_FULLDUPLEX);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPort.CIM_PROPERTY_FULLDUPLEX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LinkTechnology
	
	public UnsignedInt16 get_LinkTechnology() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPort.CIM_PROPERTY_LINKTECHNOLOGY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPort.CIM_PROPERTY_LINKTECHNOLOGY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPort.CIM_PROPERTY_LINKTECHNOLOGY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LinkTechnology(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPort.CIM_PROPERTY_LINKTECHNOLOGY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPort.CIM_PROPERTY_LINKTECHNOLOGY + " could not be found");
    		
		} else if (!CIM_NetworkPortHelper.isValid_LinkTechnology(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkPort.CIM_PROPERTY_LINKTECHNOLOGY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPort.CIM_PROPERTY_LINKTECHNOLOGY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NetworkAddresses
	
	public String[] get_NetworkAddresses() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPort.CIM_PROPERTY_NETWORKADDRESSES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPort.CIM_PROPERTY_NETWORKADDRESSES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPort.CIM_PROPERTY_NETWORKADDRESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPort.CIM_PROPERTY_NETWORKADDRESSES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPort.CIM_PROPERTY_NETWORKADDRESSES + " could not be found");
    		
		} else if (!CIM_NetworkPortHelper.isValid_NetworkAddresses(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkPort.CIM_PROPERTY_NETWORKADDRESSES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPort.CIM_PROPERTY_NETWORKADDRESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherLinkTechnology
	
	public String get_OtherLinkTechnology() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPort.CIM_PROPERTY_OTHERLINKTECHNOLOGY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPort.CIM_PROPERTY_OTHERLINKTECHNOLOGY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPort.CIM_PROPERTY_OTHERLINKTECHNOLOGY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherLinkTechnology(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPort.CIM_PROPERTY_OTHERLINKTECHNOLOGY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPort.CIM_PROPERTY_OTHERLINKTECHNOLOGY + " could not be found");
    		
		} else if (!CIM_NetworkPortHelper.isValid_OtherLinkTechnology(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkPort.CIM_PROPERTY_OTHERLINKTECHNOLOGY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPort.CIM_PROPERTY_OTHERLINKTECHNOLOGY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherNetworkPortType
	
	public String get_OtherNetworkPortType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPort.CIM_PROPERTY_OTHERNETWORKPORTTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPort.CIM_PROPERTY_OTHERNETWORKPORTTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPort.CIM_PROPERTY_OTHERNETWORKPORTTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherNetworkPortType(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPort.CIM_PROPERTY_OTHERNETWORKPORTTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPort.CIM_PROPERTY_OTHERNETWORKPORTTYPE + " could not be found");
    		
		} else if (!CIM_NetworkPortHelper.isValid_OtherNetworkPortType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkPort.CIM_PROPERTY_OTHERNETWORKPORTTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPort.CIM_PROPERTY_OTHERNETWORKPORTTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PermanentAddress
	
	public String get_PermanentAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPort.CIM_PROPERTY_PERMANENTADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPort.CIM_PROPERTY_PERMANENTADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPort.CIM_PROPERTY_PERMANENTADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PermanentAddress(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPort.CIM_PROPERTY_PERMANENTADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPort.CIM_PROPERTY_PERMANENTADDRESS + " could not be found");
    		
		} else if (!CIM_NetworkPortHelper.isValid_PermanentAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkPort.CIM_PROPERTY_PERMANENTADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPort.CIM_PROPERTY_PERMANENTADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PortNumber
	
	public UnsignedInt16 get_PortNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPort.CIM_PROPERTY_PORTNUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPort.CIM_PROPERTY_PORTNUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPort.CIM_PROPERTY_PORTNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PortNumber(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPort.CIM_PROPERTY_PORTNUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPort.CIM_PROPERTY_PORTNUMBER + " could not be found");
    		
		} else if (!CIM_NetworkPortHelper.isValid_PortNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkPort.CIM_PROPERTY_PORTNUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPort.CIM_PROPERTY_PORTNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PortType
	
	public UnsignedInt16 get_PortType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPort.CIM_PROPERTY_PORTTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPort.CIM_PROPERTY_PORTTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPort.CIM_PROPERTY_PORTTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PortType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPort.CIM_PROPERTY_PORTTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPort.CIM_PROPERTY_PORTTYPE + " could not be found");
    		
		} else if (!CIM_NetworkPortHelper.isValid_PortType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkPort.CIM_PROPERTY_PORTTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPort.CIM_PROPERTY_PORTTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Speed
	
	public UnsignedInt64 get_Speed() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPort.CIM_PROPERTY_SPEED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPort.CIM_PROPERTY_SPEED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPort.CIM_PROPERTY_SPEED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Speed(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPort.CIM_PROPERTY_SPEED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPort.CIM_PROPERTY_SPEED + " could not be found");
    		
		} else if (!CIM_NetworkPortHelper.isValid_Speed(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkPort.CIM_PROPERTY_SPEED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPort.CIM_PROPERTY_SPEED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportedMaximumTransmissionUnit
	
	public UnsignedInt64 get_SupportedMaximumTransmissionUnit() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPort.CIM_PROPERTY_SUPPORTEDMAXIMUMTRANSMISSIONUNIT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPort.CIM_PROPERTY_SUPPORTEDMAXIMUMTRANSMISSIONUNIT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPort.CIM_PROPERTY_SUPPORTEDMAXIMUMTRANSMISSIONUNIT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SupportedMaximumTransmissionUnit(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkPort.CIM_PROPERTY_SUPPORTEDMAXIMUMTRANSMISSIONUNIT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkPort.CIM_PROPERTY_SUPPORTEDMAXIMUMTRANSMISSIONUNIT + " could not be found");
    		
		} else if (!CIM_NetworkPortHelper.isValid_SupportedMaximumTransmissionUnit(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkPort.CIM_PROPERTY_SUPPORTEDMAXIMUMTRANSMISSIONUNIT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkPort.CIM_PROPERTY_SUPPORTEDMAXIMUMTRANSMISSIONUNIT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
