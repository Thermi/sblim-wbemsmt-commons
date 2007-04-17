/** 
 * CIM_SharedSecret.java
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
 * Description:  CIM_SharedSecret is a secret (such as a password or the response to a challenge
 * question) that is shared between a principal and a particular SharedSecret
 * security service. Secrets may be in the form of a password used for initial
 * authentication, or as with a session key, used as part of a message to verify
 * the originator of the message. It is important to note that SharedSecret is
 * not just a password, but rather is the password used with a particular
 * security service.
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
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.CIMEnumeration;



/**
 *  CIM_SharedSecret is a secret (such as a password or the response to a challenge
 * question) that is shared between a principal and a particular SharedSecret
 * security service. Secrets may be in the form of a password used for initial
 * authentication, or as with a session key, used as part of a message to verify
 * the originator of the message. It is important to note that SharedSecret is
 * not just a password, but rather is the password used with a particular
 * security service.
 */
public class CIM_SharedSecret extends CIM_Credential  {
	
	public final static String CIM_CLASS_NAME = "CIM_SharedSecret"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_SHAREDSECRETISSHARED = "CIM_SharedSecretIsShared"; //$NON-NLS-1$
	
	
	/**
	*	The transformation algorithm, if any, used to protect passwords before use in the protocol. For instance, Kerberos doesn't store passwords as the shared secret, but rather, a hash of the password.
	*/
	public final static String CIM_PROPERTY_ALGORITHM = "Algorithm"; //$NON-NLS-1$
	/**
	*	The protocol with which the SharedSecret is used.
	*/
	public final static String CIM_PROPERTY_PROTOCOL = "Protocol"; //$NON-NLS-1$
	/**
	*	RemoteID is the name by which the principal is known at the remote secret key authentication service.
	*/
	public final static String CIM_PROPERTY_REMOTEID = "RemoteID"; //$NON-NLS-1$
	/**
	*	The secret known by the principal.
	*/
	public final static String CIM_PROPERTY_SECRET = "Secret"; //$NON-NLS-1$
	/**
	*	The scoping Service's CCN.
	*/
	public final static String CIM_PROPERTY_SERVICECREATIONCLASSNAME = "ServiceCreationClassName"; //$NON-NLS-1$
	/**
	*	The scoping Service's Name.
	*/
	public final static String CIM_PROPERTY_SERVICENAME = "ServiceName"; //$NON-NLS-1$
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
		CIM_PropertyNameList.add(CIM_PROPERTY_ALGORITHM);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROTOCOL);
		CIM_PropertyNameList.add(CIM_PROPERTY_REMOTEID);
		CIM_PropertyNameList.add(CIM_PROPERTY_SECRET);
		CIM_PropertyNameList.add(CIM_PROPERTY_SERVICECREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_SERVICENAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYSTEMNAME);
				
		for (int i = 0; i < CIM_Credential.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Credential.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ALGORITHM)||
				((String)CIM_Credential.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROTOCOL)||
				((String)CIM_Credential.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REMOTEID)||
				((String)CIM_Credential.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SECRET)||
				((String)CIM_Credential.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SERVICECREATIONCLASSNAME)||
				((String)CIM_Credential.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SERVICENAME)||
				((String)CIM_Credential.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME)||
				((String)CIM_Credential.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYSTEMNAME)){
				continue;
			}
			
			CIM_SharedSecret.CIM_PropertyNameList.add(CIM_Credential.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ALGORITHM, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROTOCOL, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REMOTEID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SECRET, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SERVICECREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SERVICENAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYSTEMNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_Credential.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Credential.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ALGORITHM)||
				((CIMProperty)CIM_Credential.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROTOCOL)||
				((CIMProperty)CIM_Credential.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REMOTEID)||
				((CIMProperty)CIM_Credential.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SECRET)||
				((CIMProperty)CIM_Credential.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SERVICECREATIONCLASSNAME)||
				((CIMProperty)CIM_Credential.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SERVICENAME)||
				((CIMProperty)CIM_Credential.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME)||
				((CIMProperty)CIM_Credential.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYSTEMNAME)){
				continue;
			}
			
			CIM_SharedSecret.CIM_PropertyList.add(CIM_Credential.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_Credential.Java_Package_List.size(); i++) {
			if (((String)CIM_Credential.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_Credential.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_SharedSecret() {

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
	public CIM_SharedSecret(Vector keyProperties){ 
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
	public CIM_SharedSecret(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_RemoteID = this.cimInstance.getProperty(CIM_PROPERTY_REMOTEID);
		
		if (CIMProperty_RemoteID == null || CIMProperty_RemoteID.getValue().isEmpty() || CIMProperty_RemoteID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_REMOTEID, "Key"});
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
	    
	    if (!(object instanceof CIM_SharedSecret)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_SharedSecret)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_SharedSecret)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_SharedSecret)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_SharedSecret)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_SharedSecret)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_SharedSecret)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_SharedSecret)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_SharedSecret)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_SharedSecret)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_SharedSecretService_CIM_SharedSecretIsShareds(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_SHAREDSECRETISSHARED, 
					CIM_SharedSecretService.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_SharedSecret.Java_Package_List.size(); i++) {
						if (!((String)(CIM_SharedSecret.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_SharedSecret.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_SharedSecret.Java_Package_List.setElementAt((String)(CIM_SharedSecret.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_SharedSecret.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_SharedSecretService_CIM_SharedSecretIsShared_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_SHAREDSECRETISSHARED, 
					CIM_SharedSecretService.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent"); //$NON-NLS-1$
		
		
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
	
	// Attribute Algorithm
	
	public String get_Algorithm() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SharedSecret.CIM_PROPERTY_ALGORITHM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SharedSecret.CIM_PROPERTY_ALGORITHM + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SharedSecret.CIM_PROPERTY_ALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Algorithm(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SharedSecret.CIM_PROPERTY_ALGORITHM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SharedSecret.CIM_PROPERTY_ALGORITHM + " could not be found");
    		
		} else if (!CIM_SharedSecretHelper.isValid_Algorithm(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SharedSecret.CIM_PROPERTY_ALGORITHM);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SharedSecret.CIM_PROPERTY_ALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Protocol
	
	public String get_Protocol() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SharedSecret.CIM_PROPERTY_PROTOCOL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SharedSecret.CIM_PROPERTY_PROTOCOL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SharedSecret.CIM_PROPERTY_PROTOCOL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Protocol(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SharedSecret.CIM_PROPERTY_PROTOCOL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SharedSecret.CIM_PROPERTY_PROTOCOL + " could not be found");
    		
		} else if (!CIM_SharedSecretHelper.isValid_Protocol(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SharedSecret.CIM_PROPERTY_PROTOCOL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SharedSecret.CIM_PROPERTY_PROTOCOL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RemoteID
	
	public String get_RemoteID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SharedSecret.CIM_PROPERTY_REMOTEID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SharedSecret.CIM_PROPERTY_REMOTEID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SharedSecret.CIM_PROPERTY_REMOTEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RemoteID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SharedSecret.CIM_PROPERTY_REMOTEID);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_SharedSecret.CIM_PROPERTY_REMOTEID + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SharedSecret.CIM_PROPERTY_REMOTEID + " could not be found");
    		
		} else if (!CIM_SharedSecretHelper.isValid_RemoteID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SharedSecret.CIM_PROPERTY_REMOTEID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SharedSecret.CIM_PROPERTY_REMOTEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Secret
	
	public String get_Secret() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SharedSecret.CIM_PROPERTY_SECRET);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SharedSecret.CIM_PROPERTY_SECRET + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SharedSecret.CIM_PROPERTY_SECRET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Secret(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SharedSecret.CIM_PROPERTY_SECRET);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SharedSecret.CIM_PROPERTY_SECRET + " could not be found");
    		
		} else if (!CIM_SharedSecretHelper.isValid_Secret(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SharedSecret.CIM_PROPERTY_SECRET);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SharedSecret.CIM_PROPERTY_SECRET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ServiceCreationClassName
	
	public String get_ServiceCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SharedSecret.CIM_PROPERTY_SERVICECREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SharedSecret.CIM_PROPERTY_SERVICECREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SharedSecret.CIM_PROPERTY_SERVICECREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ServiceCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SharedSecret.CIM_PROPERTY_SERVICECREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_SharedSecret.CIM_PROPERTY_SERVICECREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SharedSecret.CIM_PROPERTY_SERVICECREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_SharedSecretHelper.isValid_ServiceCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SharedSecret.CIM_PROPERTY_SERVICECREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SharedSecret.CIM_PROPERTY_SERVICECREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ServiceName
	
	public String get_ServiceName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SharedSecret.CIM_PROPERTY_SERVICENAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SharedSecret.CIM_PROPERTY_SERVICENAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SharedSecret.CIM_PROPERTY_SERVICENAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ServiceName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SharedSecret.CIM_PROPERTY_SERVICENAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_SharedSecret.CIM_PROPERTY_SERVICENAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SharedSecret.CIM_PROPERTY_SERVICENAME + " could not be found");
    		
		} else if (!CIM_SharedSecretHelper.isValid_ServiceName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SharedSecret.CIM_PROPERTY_SERVICENAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SharedSecret.CIM_PROPERTY_SERVICENAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SystemCreationClassName
	
	public String get_SystemCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SharedSecret.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SharedSecret.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SharedSecret.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SystemCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SharedSecret.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_SharedSecret.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SharedSecret.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_SharedSecretHelper.isValid_SystemCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SharedSecret.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SharedSecret.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SystemName
	
	public String get_SystemName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SharedSecret.CIM_PROPERTY_SYSTEMNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SharedSecret.CIM_PROPERTY_SYSTEMNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SharedSecret.CIM_PROPERTY_SYSTEMNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SystemName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SharedSecret.CIM_PROPERTY_SYSTEMNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_SharedSecret.CIM_PROPERTY_SYSTEMNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SharedSecret.CIM_PROPERTY_SYSTEMNAME + " could not be found");
    		
		} else if (!CIM_SharedSecretHelper.isValid_SystemName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SharedSecret.CIM_PROPERTY_SYSTEMNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SharedSecret.CIM_PROPERTY_SYSTEMNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}