/** 
 * CIM_AdministrativeDistance.java
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
 * Description: Information in this class affects the choice of one protocol over another, when two protocols learn the same route. Properties define the preference of a protocol, called its distance. The lower the distance, the higher the preference for that protocol. This class affects ALL routes and contains the default distances. Specific administrative distances relative to an individual route and Forwarding Service are defined in the NextHopForwardedByService association, its AdminDistance property. 

AdministrativeDistance, being a global object, is weak to the AdminDomain that contains it. Hence, the AdminDomain keys are propagated to this class.
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



public class CIM_AdministrativeDistance extends CIM_LogicalElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_AdministrativeDistance";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_BGPADMINDISTANCE = "CIM_BGPAdminDistance";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDADMINDISTANCE = "CIM_HostedAdminDistance";
	
	
	/**
	*	The distance for peers using BGP locally. It has a default value of 200.
	*/
	public final static String CIM_PROPERTY_BGPLOCAL = "BGPLocal"; //$NON-NLS-1$
	/**
	*	CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	*/
	public final static String CIM_PROPERTY_CREATIONCLASSNAME = "CreationClassName"; //$NON-NLS-1$
	/**
	*	The distance for directly connected peers. It has a default value of 0.
	*/
	public final static String CIM_PROPERTY_DIRECTCONNECT = "DirectConnect"; //$NON-NLS-1$
	/**
	*	The distance for peers using EBGP. It has a default value of 20.
	*/
	public final static String CIM_PROPERTY_EBGP = "EBGP"; //$NON-NLS-1$
	/**
	*	The distance for peers using EGP. It has a default value of 140.
	*/
	public final static String CIM_PROPERTY_EGP = "EGP"; //$NON-NLS-1$
	/**
	*	The distance for peers using external EIGRP. It has a default value of 170.
	*/
	public final static String CIM_PROPERTY_EIGRPEXTERNAL = "EIGRPExternal"; //$NON-NLS-1$
	/**
	*	The distance for peers using internal EIGRP. It has a default value of 90.
	*/
	public final static String CIM_PROPERTY_EIGRPINTERNAL = "EIGRPInternal"; //$NON-NLS-1$
	/**
	*	The distance for peers using IBGP. It has a default value of 200.
	*/
	public final static String CIM_PROPERTY_IBGP = "IBGP"; //$NON-NLS-1$
	/**
	*	The distance for peers using IGRP. It has a default value of 100.
	*/
	public final static String CIM_PROPERTY_IGRP = "IGRP"; //$NON-NLS-1$
	/**
	*	The distance for peers using ISIS. It has a default value of 115.
	*/
	public final static String CIM_PROPERTY_ISIS = "ISIS"; //$NON-NLS-1$
	/**
	*	This is the name of the AdministrativeDistance class.
	*/
	public final static String CIM_PROPERTY_NAME = "Name"; //$NON-NLS-1$
	/**
	*	The distance for peers using OSPF. It has a default value of 110.
	*/
	public final static String CIM_PROPERTY_OSPF = "OSPF"; //$NON-NLS-1$
	/**
	*	The distance for peers using RIP. It has a default value of 120.
	*/
	public final static String CIM_PROPERTY_RIP = "RIP"; //$NON-NLS-1$
	/**
	*	The distance for staticly connected peers. It has a default value of 1.
	*/
	public final static String CIM_PROPERTY_STATIC = "Static"; //$NON-NLS-1$
	/**
	*	The scoping AdminDomain's CreationClassName.
	*/
	public final static String CIM_PROPERTY_SYSTEMCREATIONCLASSNAME = "SystemCreationClassName"; //$NON-NLS-1$
	/**
	*	The scoping AdminDomain's Name.
	*/
	public final static String CIM_PROPERTY_SYSTEMNAME = "SystemName"; //$NON-NLS-1$
	/**
	*	The distance for peers using an unknown protocol. It has a default value of 255.
	*/
	public final static String CIM_PROPERTY_UNKNOWN = "Unknown"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_BGPLOCAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_CREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_DIRECTCONNECT);
		CIM_PropertyNameList.add(CIM_PROPERTY_EBGP);
		CIM_PropertyNameList.add(CIM_PROPERTY_EGP);
		CIM_PropertyNameList.add(CIM_PROPERTY_EIGRPEXTERNAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_EIGRPINTERNAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_IBGP);
		CIM_PropertyNameList.add(CIM_PROPERTY_IGRP);
		CIM_PropertyNameList.add(CIM_PROPERTY_ISIS);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_OSPF);
		CIM_PropertyNameList.add(CIM_PROPERTY_RIP);
		CIM_PropertyNameList.add(CIM_PROPERTY_STATIC);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYSTEMNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_UNKNOWN);
				
		for (int i = 0; i < CIM_LogicalElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BGPLOCAL)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DIRECTCONNECT)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EBGP)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EGP)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EIGRPEXTERNAL)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EIGRPINTERNAL)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_IBGP)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_IGRP)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ISIS)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAME)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OSPF)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RIP)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STATIC)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYSTEMNAME)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UNKNOWN)){
				continue;
			}
			
			CIM_AdministrativeDistance.CIM_PropertyNameList.add(CIM_LogicalElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BGPLOCAL, new CIMValue(new UnsignedInt8("200"), new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DIRECTCONNECT, new CIMValue(new UnsignedInt8("0"), new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EBGP, new CIMValue(new UnsignedInt8("20"), new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EGP, new CIMValue(new UnsignedInt8("140"), new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EIGRPEXTERNAL, new CIMValue(new UnsignedInt8("170"), new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EIGRPINTERNAL, new CIMValue(new UnsignedInt8("90"), new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_IBGP, new CIMValue(new UnsignedInt8("200"), new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_IGRP, new CIMValue(new UnsignedInt8("100"), new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ISIS, new CIMValue(new UnsignedInt8("115"), new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OSPF, new CIMValue(new UnsignedInt8("110"), new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RIP, new CIMValue(new UnsignedInt8("120"), new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STATIC, new CIMValue(new UnsignedInt8("1"), new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYSTEMNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UNKNOWN, new CIMValue(new UnsignedInt8("255"), new CIMDataType(CIMDataType.UINT8))));
				
		for (int i = 0; i < CIM_LogicalElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BGPLOCAL)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DIRECTCONNECT)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EBGP)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EGP)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EIGRPEXTERNAL)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EIGRPINTERNAL)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_IBGP)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_IGRP)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ISIS)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAME)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OSPF)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RIP)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STATIC)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYSTEMNAME)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UNKNOWN)){
				continue;
			}
			
			CIM_AdministrativeDistance.CIM_PropertyList.add(CIM_LogicalElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_LogicalElement.Java_Package_List.size(); i++) {
			if (((String)CIM_LogicalElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_LogicalElement.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_AdministrativeDistance() {

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
	public CIM_AdministrativeDistance(Vector keyProperties){ 
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
	public CIM_AdministrativeDistance(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_CreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_CREATIONCLASSNAME);
		
		if (CIMProperty_CreationClassName == null || CIMProperty_CreationClassName.getValue().isEmpty() || CIMProperty_CreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_CREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_Name = this.cimInstance.getProperty(CIM_PROPERTY_NAME);
		
		if (CIMProperty_Name == null || CIMProperty_Name.getValue().isEmpty() || CIMProperty_Name.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_NAME, "Key"});
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
	    
	    if (!(object instanceof CIM_AdministrativeDistance)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_AdministrativeDistance)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_AdministrativeDistance)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_AdministrativeDistance)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_AdministrativeDistance)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_AdministrativeDistance)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_AdministrativeDistance)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_AdministrativeDistance)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_AdministrativeDistance)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_AdministrativeDistance)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_BGPService_CIM_BGPAdminDistances(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_BGPADMINDISTANCE, 
					CIM_BGPService.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_AdministrativeDistance.Java_Package_List.size(); i++) {
						if (!((String)(CIM_AdministrativeDistance.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_AdministrativeDistance.Java_Package_List.get(i))).endsWith(".")) {
							CIM_AdministrativeDistance.Java_Package_List.setElementAt((String)(CIM_AdministrativeDistance.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_AdministrativeDistance.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BGPService(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_BGPService(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BGPService(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_BGPService_CIM_BGPAdminDistance_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_BGPADMINDISTANCE, 
					CIM_BGPService.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_BGPService.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_AdminDomain_CIM_HostedAdminDistances(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDADMINDISTANCE, 
					CIM_AdminDomain.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_AdministrativeDistance.Java_Package_List.size(); i++) {
						if (!((String)(CIM_AdministrativeDistance.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_AdministrativeDistance.Java_Package_List.get(i))).endsWith(".")) {
							CIM_AdministrativeDistance.Java_Package_List.setElementAt((String)(CIM_AdministrativeDistance.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_AdministrativeDistance.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_AdminDomain(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_AdminDomain(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_AdminDomain(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_AdminDomain_CIM_HostedAdminDistance_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_HOSTEDADMINDISTANCE, 
					CIM_AdminDomain.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_AdminDomain.CIM_CLASS_NAME)) {
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
	
	// Attribute BGPLocal
	
	public UnsignedInt8 get_BGPLocal() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_BGPLOCAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_BGPLOCAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_BGPLOCAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BGPLocal(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_BGPLOCAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_BGPLOCAL + " could not be found");
    		
		} else if (!CIM_AdministrativeDistanceHelper.isValid_BGPLocal(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AdministrativeDistance.CIM_PROPERTY_BGPLOCAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_BGPLOCAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CreationClassName
	
	public String get_CreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_CREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_CREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_AdministrativeDistance.CIM_PROPERTY_CREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_AdministrativeDistanceHelper.isValid_CreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AdministrativeDistance.CIM_PROPERTY_CREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DirectConnect
	
	public UnsignedInt8 get_DirectConnect() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_DIRECTCONNECT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_DIRECTCONNECT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_DIRECTCONNECT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DirectConnect(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_DIRECTCONNECT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_DIRECTCONNECT + " could not be found");
    		
		} else if (!CIM_AdministrativeDistanceHelper.isValid_DirectConnect(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AdministrativeDistance.CIM_PROPERTY_DIRECTCONNECT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_DIRECTCONNECT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EBGP
	
	public UnsignedInt8 get_EBGP() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_EBGP);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_EBGP + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_EBGP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EBGP(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_EBGP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_EBGP + " could not be found");
    		
		} else if (!CIM_AdministrativeDistanceHelper.isValid_EBGP(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AdministrativeDistance.CIM_PROPERTY_EBGP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_EBGP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EGP
	
	public UnsignedInt8 get_EGP() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_EGP);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_EGP + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_EGP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EGP(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_EGP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_EGP + " could not be found");
    		
		} else if (!CIM_AdministrativeDistanceHelper.isValid_EGP(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AdministrativeDistance.CIM_PROPERTY_EGP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_EGP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EIGRPExternal
	
	public UnsignedInt8 get_EIGRPExternal() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_EIGRPEXTERNAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_EIGRPEXTERNAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_EIGRPEXTERNAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EIGRPExternal(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_EIGRPEXTERNAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_EIGRPEXTERNAL + " could not be found");
    		
		} else if (!CIM_AdministrativeDistanceHelper.isValid_EIGRPExternal(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AdministrativeDistance.CIM_PROPERTY_EIGRPEXTERNAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_EIGRPEXTERNAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EIGRPInternal
	
	public UnsignedInt8 get_EIGRPInternal() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_EIGRPINTERNAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_EIGRPINTERNAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_EIGRPINTERNAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EIGRPInternal(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_EIGRPINTERNAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_EIGRPINTERNAL + " could not be found");
    		
		} else if (!CIM_AdministrativeDistanceHelper.isValid_EIGRPInternal(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AdministrativeDistance.CIM_PROPERTY_EIGRPINTERNAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_EIGRPINTERNAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IBGP
	
	public UnsignedInt8 get_IBGP() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_IBGP);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_IBGP + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_IBGP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IBGP(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_IBGP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_IBGP + " could not be found");
    		
		} else if (!CIM_AdministrativeDistanceHelper.isValid_IBGP(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AdministrativeDistance.CIM_PROPERTY_IBGP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_IBGP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IGRP
	
	public UnsignedInt8 get_IGRP() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_IGRP);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_IGRP + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_IGRP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IGRP(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_IGRP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_IGRP + " could not be found");
    		
		} else if (!CIM_AdministrativeDistanceHelper.isValid_IGRP(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AdministrativeDistance.CIM_PROPERTY_IGRP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_IGRP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ISIS
	
	public UnsignedInt8 get_ISIS() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_ISIS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_ISIS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_ISIS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ISIS(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_ISIS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_ISIS + " could not be found");
    		
		} else if (!CIM_AdministrativeDistanceHelper.isValid_ISIS(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AdministrativeDistance.CIM_PROPERTY_ISIS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_ISIS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Name
	
	public String get_Name() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_NAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Name(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_NAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_AdministrativeDistance.CIM_PROPERTY_NAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (!CIM_AdministrativeDistanceHelper.isValid_Name(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AdministrativeDistance.CIM_PROPERTY_NAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OSPF
	
	public UnsignedInt8 get_OSPF() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_OSPF);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_OSPF + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_OSPF + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OSPF(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_OSPF);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_OSPF + " could not be found");
    		
		} else if (!CIM_AdministrativeDistanceHelper.isValid_OSPF(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AdministrativeDistance.CIM_PROPERTY_OSPF);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_OSPF + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RIP
	
	public UnsignedInt8 get_RIP() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_RIP);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_RIP + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_RIP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RIP(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_RIP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_RIP + " could not be found");
    		
		} else if (!CIM_AdministrativeDistanceHelper.isValid_RIP(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AdministrativeDistance.CIM_PROPERTY_RIP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_RIP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Static
	
	public UnsignedInt8 get_Static() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_STATIC);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_STATIC + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_STATIC + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Static(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_STATIC);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_STATIC + " could not be found");
    		
		} else if (!CIM_AdministrativeDistanceHelper.isValid_Static(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AdministrativeDistance.CIM_PROPERTY_STATIC);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_STATIC + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SystemCreationClassName
	
	public String get_SystemCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SystemCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_AdministrativeDistance.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_AdministrativeDistanceHelper.isValid_SystemCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AdministrativeDistance.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SystemName
	
	public String get_SystemName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_SYSTEMNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_SYSTEMNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_SYSTEMNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SystemName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_SYSTEMNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_AdministrativeDistance.CIM_PROPERTY_SYSTEMNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_SYSTEMNAME + " could not be found");
    		
		} else if (!CIM_AdministrativeDistanceHelper.isValid_SystemName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AdministrativeDistance.CIM_PROPERTY_SYSTEMNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_SYSTEMNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Unknown
	
	public UnsignedInt8 get_Unknown() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_UNKNOWN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_UNKNOWN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_UNKNOWN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Unknown(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AdministrativeDistance.CIM_PROPERTY_UNKNOWN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_UNKNOWN + " could not be found");
    		
		} else if (!CIM_AdministrativeDistanceHelper.isValid_Unknown(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AdministrativeDistance.CIM_PROPERTY_UNKNOWN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AdministrativeDistance.CIM_PROPERTY_UNKNOWN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
