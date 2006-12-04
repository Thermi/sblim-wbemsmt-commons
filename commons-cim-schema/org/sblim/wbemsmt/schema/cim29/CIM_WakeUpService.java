/** 
 * CIM_WakeUpService.java
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
 * Description: WakeUpService allows a UnitaryComputerSystem to be woken up from a low power sleep state. This Service is implemented by a LogicalDevice (e.g. NetworkAdapter or Modem) that is capable of receiving wakeup messages, and notifying the System.
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



public class CIM_WakeUpService extends CIM_Service  {
	
	public final static String CIM_CLASS_NAME = "CIM_WakeUpService";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONMODEM = "CIM_WakeUpServiceOnModem";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKADAPTER = "CIM_WakeUpServiceOnNetworkAdapter";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKPORT = "CIM_WakeUpServiceOnNetworkPort";
	
	
	/**
	*	The binary data that is used to compare the contents of the received packet. This is used when the FilterType is set to "Binary Match" (value=7). This could also be used when the FilterType is set to "Other" (value=1).
	*/
	public final static String CIM_PROPERTY_FILTERDATA = "FilterData"; //$NON-NLS-1$
	/**
	*	The filter type on the packets/messages that trigger the WakeUpService. This field is only used when the WakeUp Type is set to "Wake On LAN - Packet Filtering" (value =3).
	*/
	public final static String CIM_PROPERTY_FILTERTYPE = "FilterType"; //$NON-NLS-1$
	/**
	*	The description of the format of the FilterType used by the Service when the FilterType is set to "Other" (value=1).
	*/
	public final static String CIM_PROPERTY_OTHERFILTERTYPEDESCRIPTION = "OtherFilterTypeDescription"; //$NON-NLS-1$
	/**
	*	A description of the type of WakeUpService used when WakeUpType is set to "Other" (value=1).
	*/
	public final static String CIM_PROPERTY_OTHERWAKEUPTYPEDESCRIPTION = "OtherWakeUpTypeDescription"; //$NON-NLS-1$
	/**
	*	The Type of the WakeUp Service.
	*/
	public final static String CIM_PROPERTY_WAKEUPTYPE = "WakeUpType"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_FILTERDATA);
		CIM_PropertyNameList.add(CIM_PROPERTY_FILTERTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERFILTERTYPEDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERWAKEUPTYPEDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_WAKEUPTYPE);
				
		for (int i = 0; i < CIM_Service.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FILTERDATA)||
				((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FILTERTYPE)||
				((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERFILTERTYPEDESCRIPTION)||
				((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERWAKEUPTYPEDESCRIPTION)||
				((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WAKEUPTYPE)){
				continue;
			}
			
			CIM_WakeUpService.CIM_PropertyNameList.add(CIM_Service.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FILTERDATA, new CIMValue(null, new CIMDataType(CIMDataType.UINT8_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FILTERTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERFILTERTYPEDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERWAKEUPTYPEDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WAKEUPTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_Service.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FILTERDATA)||
				((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FILTERTYPE)||
				((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERFILTERTYPEDESCRIPTION)||
				((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERWAKEUPTYPEDESCRIPTION)||
				((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WAKEUPTYPE)){
				continue;
			}
			
			CIM_WakeUpService.CIM_PropertyList.add(CIM_Service.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Service.Java_Package_List.size(); i++) {
			if (((String)CIM_Service.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Service.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_FILTERTYPE = {"Unknown","Other","ARP Broadcast","Neighbor Discovery Multicast","IP Packet with Directed MAC Address","IPX Diagnostic Responder","NBT Name Query","Binary Match"};
	public final static String[] CIM_VALUEMAP_WAKEUPTYPE = {"Unknown","Other","Wake On LAN - Magic Packet","Wake on LAN - Packet Filtering","Wake On Ring"};
	
	
	public final static int FILTERTYPE_UNKNOWN = 0;
	public final static int FILTERTYPE_OTHER = 1;
	public final static int FILTERTYPE_ARPBROADCAST = 2;
	public final static int FILTERTYPE_NEIGHBORDISCOVERYMULTICAST = 3;
	public final static int FILTERTYPE_IPPACKETWITHDIRECTEDMACADDRESS = 4;
	public final static int FILTERTYPE_IPXDIAGNOSTICRESPONDER = 5;
	public final static int FILTERTYPE_NBTNAMEQUERY = 6;
	public final static int FILTERTYPE_BINARYMATCH = 7;
	
	public final static int WAKEUPTYPE_UNKNOWN = 0;
	public final static int WAKEUPTYPE_OTHER = 1;
	public final static int WAKEUPTYPE_WAKEONLAN_MAGICPACKET = 2;
	public final static int WAKEUPTYPE_WAKEONLAN_PACKETFILTERING = 3;
	public final static int WAKEUPTYPE_WAKEONRING = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_WakeUpService() {

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
	public CIM_WakeUpService(Vector keyProperties){ 
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
	public CIM_WakeUpService(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_WakeUpService)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_WakeUpService)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_WakeUpService)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_WakeUpService)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_WakeUpService)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_WakeUpService)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_WakeUpService)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_WakeUpService)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_WakeUpService)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_WakeUpService)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_Modem_CIM_WakeUpServiceOnModems(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONMODEM, 
					CIM_Modem.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_WakeUpService.Java_Package_List.size(); i++) {
						if (!((String)(CIM_WakeUpService.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_WakeUpService.Java_Package_List.get(i))).endsWith(".")) {
							CIM_WakeUpService.Java_Package_List.setElementAt((String)(CIM_WakeUpService.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_WakeUpService.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Modem(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_Modem(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Modem(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_Modem_CIM_WakeUpServiceOnModem_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONMODEM, 
					CIM_Modem.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_Modem.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_NetworkAdapter_CIM_WakeUpServiceOnNetworkAdapters(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKADAPTER, 
					CIM_NetworkAdapter.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_WakeUpService.Java_Package_List.size(); i++) {
						if (!((String)(CIM_WakeUpService.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_WakeUpService.Java_Package_List.get(i))).endsWith(".")) {
							CIM_WakeUpService.Java_Package_List.setElementAt((String)(CIM_WakeUpService.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_WakeUpService.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_NetworkAdapter(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_NetworkAdapter(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_NetworkAdapter(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_NetworkAdapter_CIM_WakeUpServiceOnNetworkAdapter_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKADAPTER, 
					CIM_NetworkAdapter.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_NetworkAdapter.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_NetworkPort_CIM_WakeUpServiceOnNetworkPorts(CIMClient cimClient,
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
					CIM_NetworkPort.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_WakeUpService.Java_Package_List.size(); i++) {
						if (!((String)(CIM_WakeUpService.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_WakeUpService.Java_Package_List.get(i))).endsWith(".")) {
							CIM_WakeUpService.Java_Package_List.setElementAt((String)(CIM_WakeUpService.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_WakeUpService.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_NetworkPort(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_NetworkPort(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_NetworkPort(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_NetworkPort_CIM_WakeUpServiceOnNetworkPort_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_WAKEUPSERVICEONNETWORKPORT, 
					CIM_NetworkPort.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_NetworkPort.CIM_CLASS_NAME)) {
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
	
	// Attribute FilterData
	
	public UnsignedInt8[] get_FilterData() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_WakeUpService.CIM_PROPERTY_FILTERDATA);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_WakeUpService.CIM_PROPERTY_FILTERDATA + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_WakeUpService.CIM_PROPERTY_FILTERDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		UnsignedInt8[] resultArray = new UnsignedInt8[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (UnsignedInt8)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_FilterData(UnsignedInt8[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_WakeUpService.CIM_PROPERTY_FILTERDATA);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_WakeUpService.CIM_PROPERTY_FILTERDATA + " could not be found");
    		
		} else if (!CIM_WakeUpServiceHelper.isValid_FilterData(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_WakeUpService.CIM_PROPERTY_FILTERDATA);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_WakeUpService.CIM_PROPERTY_FILTERDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FilterType
	
	public UnsignedInt16 get_FilterType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_WakeUpService.CIM_PROPERTY_FILTERTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_WakeUpService.CIM_PROPERTY_FILTERTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_WakeUpService.CIM_PROPERTY_FILTERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FilterType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_WakeUpService.CIM_PROPERTY_FILTERTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_WakeUpService.CIM_PROPERTY_FILTERTYPE + " could not be found");
    		
		} else if (!CIM_WakeUpServiceHelper.isValid_FilterType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_WakeUpService.CIM_PROPERTY_FILTERTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_WakeUpService.CIM_PROPERTY_FILTERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherFilterTypeDescription
	
	public String get_OtherFilterTypeDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_WakeUpService.CIM_PROPERTY_OTHERFILTERTYPEDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_WakeUpService.CIM_PROPERTY_OTHERFILTERTYPEDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_WakeUpService.CIM_PROPERTY_OTHERFILTERTYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherFilterTypeDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_WakeUpService.CIM_PROPERTY_OTHERFILTERTYPEDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_WakeUpService.CIM_PROPERTY_OTHERFILTERTYPEDESCRIPTION + " could not be found");
    		
		} else if (!CIM_WakeUpServiceHelper.isValid_OtherFilterTypeDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_WakeUpService.CIM_PROPERTY_OTHERFILTERTYPEDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_WakeUpService.CIM_PROPERTY_OTHERFILTERTYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherWakeUpTypeDescription
	
	public String get_OtherWakeUpTypeDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_WakeUpService.CIM_PROPERTY_OTHERWAKEUPTYPEDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_WakeUpService.CIM_PROPERTY_OTHERWAKEUPTYPEDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_WakeUpService.CIM_PROPERTY_OTHERWAKEUPTYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherWakeUpTypeDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_WakeUpService.CIM_PROPERTY_OTHERWAKEUPTYPEDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_WakeUpService.CIM_PROPERTY_OTHERWAKEUPTYPEDESCRIPTION + " could not be found");
    		
		} else if (!CIM_WakeUpServiceHelper.isValid_OtherWakeUpTypeDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_WakeUpService.CIM_PROPERTY_OTHERWAKEUPTYPEDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_WakeUpService.CIM_PROPERTY_OTHERWAKEUPTYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute WakeUpType
	
	public UnsignedInt16 get_WakeUpType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_WakeUpService.CIM_PROPERTY_WAKEUPTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_WakeUpService.CIM_PROPERTY_WAKEUPTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_WakeUpService.CIM_PROPERTY_WAKEUPTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_WakeUpType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_WakeUpService.CIM_PROPERTY_WAKEUPTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_WakeUpService.CIM_PROPERTY_WAKEUPTYPE + " could not be found");
    		
		} else if (!CIM_WakeUpServiceHelper.isValid_WakeUpType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_WakeUpService.CIM_PROPERTY_WAKEUPTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_WakeUpService.CIM_PROPERTY_WAKEUPTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
