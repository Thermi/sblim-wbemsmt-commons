/** 
 * CIM_NamedSharedIKESecret.java
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
 * Description: CIM_NamedSharedIKESecret indirectly represents a shared secret credential. The local identity, IKEIdentity, and the remote peer identity share the secret that is named by the SharedSecretName. The SharedSecretName is used by the SharedSecretService to reference the secret.
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



public class CIM_NamedSharedIKESecret extends CIM_Credential  {
	
	public final static String CIM_CLASS_NAME = "CIM_NamedSharedIKESecret";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_IKESECRETISNAMED = "CIM_IKESecretIsNamed";
	
	
	/**
	*	The local Identity with whom the direct trust relationship exists.
	*/
	public final static String CIM_PROPERTY_LOCALIDENTITY = "LocalIdentity"; //$NON-NLS-1$
	/**
	*	LocalIdentityType is used to describe the type of the LocalIdentity.
	*/
	public final static String CIM_PROPERTY_LOCALIDENTITYTYPE = "LocalIdentityType"; //$NON-NLS-1$
	/**
	*	The peer identity with whom the direct trust relationship exists.
	*/
	public final static String CIM_PROPERTY_PEERIDENTITY = "PeerIdentity"; //$NON-NLS-1$
	/**
	*	PeerIdentityType is used to describe the type of the PeerIdentity.
	*/
	public final static String CIM_PROPERTY_PEERIDENTITYTYPE = "PeerIdentityType"; //$NON-NLS-1$
	/**
	*	The scoping Service's CCN.
	*/
	public final static String CIM_PROPERTY_SERVICECREATIONCLASSNAME = "ServiceCreationClassName"; //$NON-NLS-1$
	/**
	*	The scoping Service's Name.
	*/
	public final static String CIM_PROPERTY_SERVICENAME = "ServiceName"; //$NON-NLS-1$
	/**
	*	SharedSecretName is an indirect reference to a shared secret. The SecretService does not expose the actual secret but rather provides access to the secret via a name.
	*/
	public final static String CIM_PROPERTY_SHAREDSECRETNAME = "SharedSecretName"; //$NON-NLS-1$
	/**
	*	The scoping System's CCN.
	*/
	public final static String CIM_PROPERTY_SYSTEMCREATIONCLASSNAME = "SystemCreationClassName"; //$NON-NLS-1$
	/**
	*	The scoping System's Name.
	*/
	public final static String CIM_PROPERTY_SYSTEMNAME = "SystemName"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_LOCALIDENTITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOCALIDENTITYTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PEERIDENTITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_PEERIDENTITYTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SERVICECREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_SERVICENAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_SHAREDSECRETNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYSTEMNAME);
				
		for (int i = 0; i < CIM_Credential.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Credential.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOCALIDENTITY)||
				((String)CIM_Credential.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOCALIDENTITYTYPE)||
				((String)CIM_Credential.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PEERIDENTITY)||
				((String)CIM_Credential.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PEERIDENTITYTYPE)||
				((String)CIM_Credential.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SERVICECREATIONCLASSNAME)||
				((String)CIM_Credential.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SERVICENAME)||
				((String)CIM_Credential.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SHAREDSECRETNAME)||
				((String)CIM_Credential.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME)||
				((String)CIM_Credential.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYSTEMNAME)){
				continue;
			}
			
			CIM_NamedSharedIKESecret.CIM_PropertyNameList.add(CIM_Credential.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOCALIDENTITY, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOCALIDENTITYTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PEERIDENTITY, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PEERIDENTITYTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SERVICECREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SERVICENAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SHAREDSECRETNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYSTEMNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_Credential.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Credential.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOCALIDENTITY)||
				((CIMProperty)CIM_Credential.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOCALIDENTITYTYPE)||
				((CIMProperty)CIM_Credential.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PEERIDENTITY)||
				((CIMProperty)CIM_Credential.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PEERIDENTITYTYPE)||
				((CIMProperty)CIM_Credential.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SERVICECREATIONCLASSNAME)||
				((CIMProperty)CIM_Credential.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SERVICENAME)||
				((CIMProperty)CIM_Credential.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SHAREDSECRETNAME)||
				((CIMProperty)CIM_Credential.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME)||
				((CIMProperty)CIM_Credential.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYSTEMNAME)){
				continue;
			}
			
			CIM_NamedSharedIKESecret.CIM_PropertyList.add(CIM_Credential.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Credential.Java_Package_List.size(); i++) {
			if (((String)CIM_Credential.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Credential.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_LOCALIDENTITYTYPE = {"IPV4_ADDR","FQDN","USER_FQDN","IPV4_ADDR_SUBNET","IPV6_ADDR","IPV6_ADDR_SUBNET","IPV4_ADDR_RANGE","IPV6_ADDR_RANGE","DER_ASN1_DN","DER_ASN1_GN","KEY_ID"};
	public final static String[] CIM_VALUEMAP_PEERIDENTITYTYPE = {"IPV4_ADDR","FQDN","USER_FQDN","IPV4_ADDR_SUBNET","IPV6_ADDR","IPV6_ADDR_SUBNET","IPV4_ADDR_RANGE","IPV6_ADDR_RANGE","DER_ASN1_DN","DER_ASN1_GN","KEY_ID"};
	
	
	public final static int LOCALIDENTITYTYPE_IPV4_ADDR = 1;
	public final static int LOCALIDENTITYTYPE_FQDN = 2;
	public final static int LOCALIDENTITYTYPE_USER_FQDN = 3;
	public final static int LOCALIDENTITYTYPE_IPV4_ADDR_SUBNET = 4;
	public final static int LOCALIDENTITYTYPE_IPV6_ADDR = 5;
	public final static int LOCALIDENTITYTYPE_IPV6_ADDR_SUBNET = 6;
	public final static int LOCALIDENTITYTYPE_IPV4_ADDR_RANGE = 7;
	public final static int LOCALIDENTITYTYPE_IPV6_ADDR_RANGE = 8;
	public final static int LOCALIDENTITYTYPE_DER_ASN1_DN = 9;
	public final static int LOCALIDENTITYTYPE_DER_ASN1_GN = 10;
	public final static int LOCALIDENTITYTYPE_KEY_ID = 11;
	
	public final static int PEERIDENTITYTYPE_IPV4_ADDR = 1;
	public final static int PEERIDENTITYTYPE_FQDN = 2;
	public final static int PEERIDENTITYTYPE_USER_FQDN = 3;
	public final static int PEERIDENTITYTYPE_IPV4_ADDR_SUBNET = 4;
	public final static int PEERIDENTITYTYPE_IPV6_ADDR = 5;
	public final static int PEERIDENTITYTYPE_IPV6_ADDR_SUBNET = 6;
	public final static int PEERIDENTITYTYPE_IPV4_ADDR_RANGE = 7;
	public final static int PEERIDENTITYTYPE_IPV6_ADDR_RANGE = 8;
	public final static int PEERIDENTITYTYPE_DER_ASN1_DN = 9;
	public final static int PEERIDENTITYTYPE_DER_ASN1_GN = 10;
	public final static int PEERIDENTITYTYPE_KEY_ID = 11;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_NamedSharedIKESecret() {

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
	public CIM_NamedSharedIKESecret(Vector keyProperties){ 
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
	public CIM_NamedSharedIKESecret(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_LocalIdentity = this.cimInstance.getProperty(CIM_PROPERTY_LOCALIDENTITY);
		
		if (CIMProperty_LocalIdentity == null || CIMProperty_LocalIdentity.getValue().isEmpty() || CIMProperty_LocalIdentity.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_LOCALIDENTITY, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_LocalIdentityType = this.cimInstance.getProperty(CIM_PROPERTY_LOCALIDENTITYTYPE);
		
		if (CIMProperty_LocalIdentityType == null || CIMProperty_LocalIdentityType.getValue().isEmpty() || CIMProperty_LocalIdentityType.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_LOCALIDENTITYTYPE, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_PeerIdentity = this.cimInstance.getProperty(CIM_PROPERTY_PEERIDENTITY);
		
		if (CIMProperty_PeerIdentity == null || CIMProperty_PeerIdentity.getValue().isEmpty() || CIMProperty_PeerIdentity.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_PEERIDENTITY, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_PeerIdentityType = this.cimInstance.getProperty(CIM_PROPERTY_PEERIDENTITYTYPE);
		
		if (CIMProperty_PeerIdentityType == null || CIMProperty_PeerIdentityType.getValue().isEmpty() || CIMProperty_PeerIdentityType.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_PEERIDENTITYTYPE, "Key"});
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
	    
	    if (!(object instanceof CIM_NamedSharedIKESecret)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_NamedSharedIKESecret)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_NamedSharedIKESecret)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_NamedSharedIKESecret)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_NamedSharedIKESecret)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_NamedSharedIKESecret)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_NamedSharedIKESecret)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_NamedSharedIKESecret)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_NamedSharedIKESecret)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_NamedSharedIKESecret)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_SharedSecretService_CIM_IKESecretIsNameds(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_IKESECRETISNAMED, 
					CIM_SharedSecretService.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_NamedSharedIKESecret.Java_Package_List.size(); i++) {
						if (!((String)(CIM_NamedSharedIKESecret.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_NamedSharedIKESecret.Java_Package_List.get(i))).endsWith(".")) {
							CIM_NamedSharedIKESecret.Java_Package_List.setElementAt((String)(CIM_NamedSharedIKESecret.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_NamedSharedIKESecret.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_SharedSecretService(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_SharedSecretService(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_SharedSecretService(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_SharedSecretService_CIM_IKESecretIsNamed_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_IKESECRETISNAMED, 
					CIM_SharedSecretService.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_SharedSecretService.CIM_CLASS_NAME)) {
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
	
	// Attribute LocalIdentity
	
	public String get_LocalIdentity() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NamedSharedIKESecret.CIM_PROPERTY_LOCALIDENTITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_LOCALIDENTITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_LOCALIDENTITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LocalIdentity(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NamedSharedIKESecret.CIM_PROPERTY_LOCALIDENTITY);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_LOCALIDENTITY + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_LOCALIDENTITY + " could not be found");
    		
		} else if (!CIM_NamedSharedIKESecretHelper.isValid_LocalIdentity(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_LOCALIDENTITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_LOCALIDENTITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LocalIdentityType
	
	public UnsignedInt16 get_LocalIdentityType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NamedSharedIKESecret.CIM_PROPERTY_LOCALIDENTITYTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_LOCALIDENTITYTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_LOCALIDENTITYTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LocalIdentityType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NamedSharedIKESecret.CIM_PROPERTY_LOCALIDENTITYTYPE);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_LOCALIDENTITYTYPE + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_LOCALIDENTITYTYPE + " could not be found");
    		
		} else if (!CIM_NamedSharedIKESecretHelper.isValid_LocalIdentityType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_LOCALIDENTITYTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_LOCALIDENTITYTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PeerIdentity
	
	public String get_PeerIdentity() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NamedSharedIKESecret.CIM_PROPERTY_PEERIDENTITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_PEERIDENTITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_PEERIDENTITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PeerIdentity(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NamedSharedIKESecret.CIM_PROPERTY_PEERIDENTITY);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_PEERIDENTITY + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_PEERIDENTITY + " could not be found");
    		
		} else if (!CIM_NamedSharedIKESecretHelper.isValid_PeerIdentity(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_PEERIDENTITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_PEERIDENTITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PeerIdentityType
	
	public UnsignedInt16 get_PeerIdentityType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NamedSharedIKESecret.CIM_PROPERTY_PEERIDENTITYTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_PEERIDENTITYTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_PEERIDENTITYTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PeerIdentityType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NamedSharedIKESecret.CIM_PROPERTY_PEERIDENTITYTYPE);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_PEERIDENTITYTYPE + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_PEERIDENTITYTYPE + " could not be found");
    		
		} else if (!CIM_NamedSharedIKESecretHelper.isValid_PeerIdentityType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_PEERIDENTITYTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_PEERIDENTITYTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ServiceCreationClassName
	
	public String get_ServiceCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NamedSharedIKESecret.CIM_PROPERTY_SERVICECREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SERVICECREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SERVICECREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ServiceCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NamedSharedIKESecret.CIM_PROPERTY_SERVICECREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SERVICECREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SERVICECREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_NamedSharedIKESecretHelper.isValid_ServiceCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SERVICECREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SERVICECREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ServiceName
	
	public String get_ServiceName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NamedSharedIKESecret.CIM_PROPERTY_SERVICENAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SERVICENAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SERVICENAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ServiceName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NamedSharedIKESecret.CIM_PROPERTY_SERVICENAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SERVICENAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SERVICENAME + " could not be found");
    		
		} else if (!CIM_NamedSharedIKESecretHelper.isValid_ServiceName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SERVICENAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SERVICENAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SharedSecretName
	
	public String get_SharedSecretName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NamedSharedIKESecret.CIM_PROPERTY_SHAREDSECRETNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SHAREDSECRETNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SHAREDSECRETNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SharedSecretName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NamedSharedIKESecret.CIM_PROPERTY_SHAREDSECRETNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SHAREDSECRETNAME + " could not be found");
    		
		} else if (!CIM_NamedSharedIKESecretHelper.isValid_SharedSecretName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SHAREDSECRETNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SHAREDSECRETNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SystemCreationClassName
	
	public String get_SystemCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NamedSharedIKESecret.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SystemCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NamedSharedIKESecret.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_NamedSharedIKESecretHelper.isValid_SystemCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SystemName
	
	public String get_SystemName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NamedSharedIKESecret.CIM_PROPERTY_SYSTEMNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SYSTEMNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SYSTEMNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SystemName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NamedSharedIKESecret.CIM_PROPERTY_SYSTEMNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SYSTEMNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SYSTEMNAME + " could not be found");
    		
		} else if (!CIM_NamedSharedIKESecretHelper.isValid_SystemName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SYSTEMNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NamedSharedIKESecret.CIM_PROPERTY_SYSTEMNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
