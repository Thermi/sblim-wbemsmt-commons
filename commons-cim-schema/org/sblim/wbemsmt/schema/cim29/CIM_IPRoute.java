/** 
 * CIM_IPRoute.java
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
 * Description: An IPRoute relates a destination address to the address or interface through which the remote address may be reached. The destination address may be a specific IP endpoint or a subnet, dependent on the mask. An instance of this class represents either static or dynamic routing. Static routes are distinguished by setting the IsStatic boolean property to TRUE. 

Since many routes between endpoints can be defined (using different route calculation algorithms), the CIM_IPRoute class is defined as Abstract. This forces subclassing (for example, see CIM_BGPIPRoute) and allows the instances of its subclasses to be distinguished based on their CreationClassName key property. 

IPRoute is deprecated in lieu of the more general, concrete NextHopIPRoute class. NextHopIPRoute allows the definition of BOTH a next hop address and an interface for transmission of the traffic. Also, it does not mandate the instantiation of a ForwardingService class.
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



public class CIM_IPRoute extends CIM_NextHopRouting  {
	
	public final static String CIM_CLASS_NAME = "CIM_IPRoute";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_CALCULATEDROUTES = "CIM_CalculatedRoutes";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_FORWARDEDROUTES = "CIM_ForwardedRoutes";
	
	
	/**
	*	An enumeration that describes the format of the address property. Addresses that can be formatted in IPv4 format, must be formatted that way to ensure mixed IPv4/IPv6 support. 

AddressType is part of the key so that an IPv4 and an IPv6 route to IP subnets with the same network number but different IP versions (v4/v6) can coexist.
	*/
	public final static String CIM_PROPERTY_ADDRESSTYPE = "AddressType"; //$NON-NLS-1$
	/**
	*	CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	*/
	public final static String CIM_PROPERTY_CREATIONCLASSNAME = "CreationClassName"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_DESTINATIONADDRESS = "DestinationAddress"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_DESTINATIONMASK = "DestinationMask"; //$NON-NLS-1$
	/**
	*	The IP address which serves as the destination of the traffic, formatted according to the appropriate convention as defined in the AddressType property of this class. 

This property has the same semantics as DestinationAddress inherited from the NextHopRouting superclass, but a different property name. This is because this property and class were defined before NextHopRouting and are Key properties. They cannot be removed. ModelCorrespondence indicates that they should be set to equivalent values for consistency and ease of query.
	*/
	public final static String CIM_PROPERTY_IPDESTINATIONADDRESS = "IPDestinationAddress"; //$NON-NLS-1$
	/**
	*	The mask for the destination IP address, formatted according to the appropriate convention as defined in the AddressType property of this class. 

This property has the same semantics as DestinationMask inherited from the NextHopRouting superclass, but a different property name. This is because this property and class were defined before NextHopRouting and are Key properties. They cannot be removed. ModelCorrespondence indicates that they should be set to equivalent values for consistency and ease of query.
	*/
	public final static String CIM_PROPERTY_IPDESTINATIONMASK = "IPDestinationMask"; //$NON-NLS-1$
	/**
	*	The scoping ForwardingService's CreationClassName.
	*/
	public final static String CIM_PROPERTY_SERVICECREATIONCLASSNAME = "ServiceCreationClassName"; //$NON-NLS-1$
	/**
	*	The scoping ForwardingService's Name.
	*/
	public final static String CIM_PROPERTY_SERVICENAME = "ServiceName"; //$NON-NLS-1$
	/**
	*	The scoping ForwardingService's SystemCreationClassName.
	*/
	public final static String CIM_PROPERTY_SYSTEMCREATIONCLASSNAME = "SystemCreationClassName"; //$NON-NLS-1$
	/**
	*	The scoping ForwardingService's SystemName.
	*/
	public final static String CIM_PROPERTY_SYSTEMNAME = "SystemName"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ADDRESSTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_DESTINATIONADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_DESTINATIONMASK);
		CIM_PropertyNameList.add(CIM_PROPERTY_IPDESTINATIONADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_IPDESTINATIONMASK);
		CIM_PropertyNameList.add(CIM_PROPERTY_SERVICECREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_SERVICENAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYSTEMNAME);
				
		for (int i = 0; i < CIM_NextHopRouting.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_NextHopRouting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ADDRESSTYPE)||
				((String)CIM_NextHopRouting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((String)CIM_NextHopRouting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DESTINATIONADDRESS)||
				((String)CIM_NextHopRouting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DESTINATIONMASK)||
				((String)CIM_NextHopRouting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_IPDESTINATIONADDRESS)||
				((String)CIM_NextHopRouting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_IPDESTINATIONMASK)||
				((String)CIM_NextHopRouting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SERVICECREATIONCLASSNAME)||
				((String)CIM_NextHopRouting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SERVICENAME)||
				((String)CIM_NextHopRouting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME)||
				((String)CIM_NextHopRouting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYSTEMNAME)){
				continue;
			}
			
			CIM_IPRoute.CIM_PropertyNameList.add(CIM_NextHopRouting.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ADDRESSTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DESTINATIONADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DESTINATIONMASK, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_IPDESTINATIONADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_IPDESTINATIONMASK, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SERVICECREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SERVICENAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYSTEMNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_NextHopRouting.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_NextHopRouting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ADDRESSTYPE)||
				((CIMProperty)CIM_NextHopRouting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((CIMProperty)CIM_NextHopRouting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DESTINATIONADDRESS)||
				((CIMProperty)CIM_NextHopRouting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DESTINATIONMASK)||
				((CIMProperty)CIM_NextHopRouting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_IPDESTINATIONADDRESS)||
				((CIMProperty)CIM_NextHopRouting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_IPDESTINATIONMASK)||
				((CIMProperty)CIM_NextHopRouting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SERVICECREATIONCLASSNAME)||
				((CIMProperty)CIM_NextHopRouting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SERVICENAME)||
				((CIMProperty)CIM_NextHopRouting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME)||
				((CIMProperty)CIM_NextHopRouting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYSTEMNAME)){
				continue;
			}
			
			CIM_IPRoute.CIM_PropertyList.add(CIM_NextHopRouting.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_NextHopRouting.Java_Package_List.size(); i++) {
			if (((String)CIM_NextHopRouting.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_NextHopRouting.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ADDRESSTYPE = {"Unknown","IPv4","IPv6"};
	
	
	public final static int ADDRESSTYPE_UNKNOWN = 0;
	public final static int ADDRESSTYPE_IPV4 = 1;
	public final static int ADDRESSTYPE_IPV6 = 2;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_IPRoute() {

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
	public CIM_IPRoute(Vector keyProperties){ 
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
	public CIM_IPRoute(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_AddressType = this.cimInstance.getProperty(CIM_PROPERTY_ADDRESSTYPE);
		
		if (CIMProperty_AddressType == null || CIMProperty_AddressType.getValue().isEmpty() || CIMProperty_AddressType.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_ADDRESSTYPE, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_CreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_CREATIONCLASSNAME);
		
		if (CIMProperty_CreationClassName == null || CIMProperty_CreationClassName.getValue().isEmpty() || CIMProperty_CreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_CREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_IPDestinationAddress = this.cimInstance.getProperty(CIM_PROPERTY_IPDESTINATIONADDRESS);
		
		if (CIMProperty_IPDestinationAddress == null || CIMProperty_IPDestinationAddress.getValue().isEmpty() || CIMProperty_IPDestinationAddress.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_IPDESTINATIONADDRESS, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_IPDestinationMask = this.cimInstance.getProperty(CIM_PROPERTY_IPDESTINATIONMASK);
		
		if (CIMProperty_IPDestinationMask == null || CIMProperty_IPDestinationMask.getValue().isEmpty() || CIMProperty_IPDestinationMask.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_IPDESTINATIONMASK, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_ServiceCreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_SERVICECREATIONCLASSNAME);
		
		if (CIMProperty_ServiceCreationClassName == null || CIMProperty_ServiceCreationClassName.getValue().isEmpty() || CIMProperty_ServiceCreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_SERVICECREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_ServiceName = this.cimInstance.getProperty(CIM_PROPERTY_SERVICENAME);
		
		if (CIMProperty_ServiceName == null || CIMProperty_ServiceName.getValue().isEmpty() || CIMProperty_ServiceName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_SERVICENAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_SystemCreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
		
		if (CIMProperty_SystemCreationClassName == null || CIMProperty_SystemCreationClassName.getValue().isEmpty() || CIMProperty_SystemCreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_SYSTEMCREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_SystemName = this.cimInstance.getProperty(CIM_PROPERTY_SYSTEMNAME);
		
		if (CIMProperty_SystemName == null || CIMProperty_SystemName.getValue().isEmpty() || CIMProperty_SystemName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_SYSTEMNAME, "Key"});
			result = false;
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
	    
	    if (!(object instanceof CIM_IPRoute)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_IPRoute)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_IPRoute)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_IPRoute)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_IPRoute)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_IPRoute)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_IPRoute)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_IPRoute)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_IPRoute)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_IPRoute)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_RouteCalculationService_CIM_CalculatedRoutess(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_CALCULATEDROUTES, 
					CIM_RouteCalculationService.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_IPRoute.Java_Package_List.size(); i++) {
						if (!((String)(CIM_IPRoute.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_IPRoute.Java_Package_List.get(i))).endsWith(".")) {
							CIM_IPRoute.Java_Package_List.setElementAt((String)(CIM_IPRoute.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_IPRoute.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_RouteCalculationService(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_RouteCalculationService(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_RouteCalculationService(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_RouteCalculationService_CIM_CalculatedRoutes_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_CALCULATEDROUTES, 
					CIM_RouteCalculationService.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_RouteCalculationService.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_ForwardingService_CIM_ForwardedRoutess(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_FORWARDEDROUTES, 
					CIM_ForwardingService.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_IPRoute.Java_Package_List.size(); i++) {
						if (!((String)(CIM_IPRoute.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_IPRoute.Java_Package_List.get(i))).endsWith(".")) {
							CIM_IPRoute.Java_Package_List.setElementAt((String)(CIM_IPRoute.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_IPRoute.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ForwardingService(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_ForwardingService(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ForwardingService(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_ForwardingService_CIM_ForwardedRoutes_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_FORWARDEDROUTES, 
					CIM_ForwardingService.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ForwardingService.CIM_CLASS_NAME)) {
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
	
	// Attribute AddressType
	
	public UnsignedInt16 get_AddressType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPRoute.CIM_PROPERTY_ADDRESSTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPRoute.CIM_PROPERTY_ADDRESSTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPRoute.CIM_PROPERTY_ADDRESSTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AddressType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPRoute.CIM_PROPERTY_ADDRESSTYPE);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_IPRoute.CIM_PROPERTY_ADDRESSTYPE + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPRoute.CIM_PROPERTY_ADDRESSTYPE + " could not be found");
    		
		} else if (!CIM_IPRouteHelper.isValid_AddressType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPRoute.CIM_PROPERTY_ADDRESSTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPRoute.CIM_PROPERTY_ADDRESSTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CreationClassName
	
	public String get_CreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPRoute.CIM_PROPERTY_CREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPRoute.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPRoute.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPRoute.CIM_PROPERTY_CREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_IPRoute.CIM_PROPERTY_CREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPRoute.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_IPRouteHelper.isValid_CreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPRoute.CIM_PROPERTY_CREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPRoute.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DestinationAddress
	
	public String get_DestinationAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPRoute.CIM_PROPERTY_DESTINATIONADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPRoute.CIM_PROPERTY_DESTINATIONADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPRoute.CIM_PROPERTY_DESTINATIONADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DestinationAddress(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPRoute.CIM_PROPERTY_DESTINATIONADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPRoute.CIM_PROPERTY_DESTINATIONADDRESS + " could not be found");
    		
		} else if (!CIM_IPRouteHelper.isValid_DestinationAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPRoute.CIM_PROPERTY_DESTINATIONADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPRoute.CIM_PROPERTY_DESTINATIONADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DestinationMask
	
	public String get_DestinationMask() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPRoute.CIM_PROPERTY_DESTINATIONMASK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPRoute.CIM_PROPERTY_DESTINATIONMASK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPRoute.CIM_PROPERTY_DESTINATIONMASK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DestinationMask(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPRoute.CIM_PROPERTY_DESTINATIONMASK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPRoute.CIM_PROPERTY_DESTINATIONMASK + " could not be found");
    		
		} else if (!CIM_IPRouteHelper.isValid_DestinationMask(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPRoute.CIM_PROPERTY_DESTINATIONMASK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPRoute.CIM_PROPERTY_DESTINATIONMASK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IPDestinationAddress
	
	public String get_IPDestinationAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPRoute.CIM_PROPERTY_IPDESTINATIONADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPRoute.CIM_PROPERTY_IPDESTINATIONADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPRoute.CIM_PROPERTY_IPDESTINATIONADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IPDestinationAddress(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPRoute.CIM_PROPERTY_IPDESTINATIONADDRESS);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_IPRoute.CIM_PROPERTY_IPDESTINATIONADDRESS + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPRoute.CIM_PROPERTY_IPDESTINATIONADDRESS + " could not be found");
    		
		} else if (!CIM_IPRouteHelper.isValid_IPDestinationAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPRoute.CIM_PROPERTY_IPDESTINATIONADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPRoute.CIM_PROPERTY_IPDESTINATIONADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IPDestinationMask
	
	public String get_IPDestinationMask() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPRoute.CIM_PROPERTY_IPDESTINATIONMASK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPRoute.CIM_PROPERTY_IPDESTINATIONMASK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPRoute.CIM_PROPERTY_IPDESTINATIONMASK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IPDestinationMask(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPRoute.CIM_PROPERTY_IPDESTINATIONMASK);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_IPRoute.CIM_PROPERTY_IPDESTINATIONMASK + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPRoute.CIM_PROPERTY_IPDESTINATIONMASK + " could not be found");
    		
		} else if (!CIM_IPRouteHelper.isValid_IPDestinationMask(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPRoute.CIM_PROPERTY_IPDESTINATIONMASK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPRoute.CIM_PROPERTY_IPDESTINATIONMASK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ServiceCreationClassName
	
	public String get_ServiceCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPRoute.CIM_PROPERTY_SERVICECREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPRoute.CIM_PROPERTY_SERVICECREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPRoute.CIM_PROPERTY_SERVICECREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ServiceCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPRoute.CIM_PROPERTY_SERVICECREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_IPRoute.CIM_PROPERTY_SERVICECREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPRoute.CIM_PROPERTY_SERVICECREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_IPRouteHelper.isValid_ServiceCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPRoute.CIM_PROPERTY_SERVICECREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPRoute.CIM_PROPERTY_SERVICECREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ServiceName
	
	public String get_ServiceName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPRoute.CIM_PROPERTY_SERVICENAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPRoute.CIM_PROPERTY_SERVICENAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPRoute.CIM_PROPERTY_SERVICENAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ServiceName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPRoute.CIM_PROPERTY_SERVICENAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_IPRoute.CIM_PROPERTY_SERVICENAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPRoute.CIM_PROPERTY_SERVICENAME + " could not be found");
    		
		} else if (!CIM_IPRouteHelper.isValid_ServiceName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPRoute.CIM_PROPERTY_SERVICENAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPRoute.CIM_PROPERTY_SERVICENAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SystemCreationClassName
	
	public String get_SystemCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPRoute.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPRoute.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPRoute.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SystemCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPRoute.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_IPRoute.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPRoute.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_IPRouteHelper.isValid_SystemCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPRoute.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPRoute.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SystemName
	
	public String get_SystemName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPRoute.CIM_PROPERTY_SYSTEMNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPRoute.CIM_PROPERTY_SYSTEMNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPRoute.CIM_PROPERTY_SYSTEMNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SystemName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPRoute.CIM_PROPERTY_SYSTEMNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_IPRoute.CIM_PROPERTY_SYSTEMNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPRoute.CIM_PROPERTY_SYSTEMNAME + " could not be found");
    		
		} else if (!CIM_IPRouteHelper.isValid_SystemName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPRoute.CIM_PROPERTY_SYSTEMNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPRoute.CIM_PROPERTY_SYSTEMNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
