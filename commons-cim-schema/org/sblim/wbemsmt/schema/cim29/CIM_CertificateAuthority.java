/** 
 * CIM_CertificateAuthority.java
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
 * Description: A Certificate Authority (CA) is a credential management service that issues and cryptographically signs certificates. It acts as an trusted third-party intermediary in establishing trust relationships. The CA authenticates the identity of the holder of the 'private' key, related to the certificate's 'public' key.
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



public class CIM_CertificateAuthority extends CIM_CredentialManagementService  {
	
	public final static String CIM_CLASS_NAME = "CIM_CertificateAuthority";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_CAHASPUBLICCERTIFICATE = "CIM_CAHasPublicCertificate";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_CASIGNSPUBLICKEYCERTIFICATE = "CIM_CASignsPublicKeyCertificate";
	
	
	/**
	*	Certificates refer to their issuing CA by its Distinguished Name (as defined in X.501).
	*/
	public final static String CIM_PROPERTY_CADISTINGUISHEDNAME = "CADistinguishedName"; //$NON-NLS-1$
	/**
	*	The CAPolicyStatement describes what care is taken by the CertificateAuthority when signing a new certificate. The CAPolicyStatment may be a dot-delimited ASN.1 OID string which identifies to the formal policy statement.
	*/
	public final static String CIM_PROPERTY_CAPOLICYSTATEMENT = "CAPolicyStatement"; //$NON-NLS-1$
	/**
	*	Certificate revocation lists may be available from a number of distribution points. CRLDistributionPoint array values provide URIs for those distribution points.
	*/
	public final static String CIM_PROPERTY_CRLDISTRIBUTIONPOINT = "CRLDistributionPoint"; //$NON-NLS-1$
	/**
	*	The frequency, expressed in hours, at which the CA will update its Certificate Revocation List. Zero implies that the refresh frequency is unknown.
	*/
	public final static String CIM_PROPERTY_CRLREFRESHFREQUENCY = "CRLRefreshFrequency"; //$NON-NLS-1$
	/**
	*	A CRL, or CertificateRevocationList, is a list of certificates which the CertificateAuthority has revoked and which are not yet expired. Revocation is necessary when the private key associated with the public key of a certificate is lost or compromised, or when the person for whom the certificate is signed no longer is entitled to use the certificate.
	*/
	public final static String CIM_PROPERTY_CRL = "CRL"; //$NON-NLS-1$
	/**
	*	The maximum number of certificates in a certificate chain permitted for credentials issued by this certificate authority or it's subordinate CAs. 
The MaxChainLength of a superior CA in the trust hierarchy should be greater than this value and the MaxChainLength of a subordinate CA in the trust hierarchy should be less than this value.
	*/
	public final static String CIM_PROPERTY_MAXCHAINLENGTH = "MaxChainLength"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CADISTINGUISHEDNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_CAPOLICYSTATEMENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CRLDISTRIBUTIONPOINT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CRLREFRESHFREQUENCY);
		CIM_PropertyNameList.add(CIM_PROPERTY_CRL);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXCHAINLENGTH);
				
		for (int i = 0; i < CIM_CredentialManagementService.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_CredentialManagementService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CADISTINGUISHEDNAME)||
				((String)CIM_CredentialManagementService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CAPOLICYSTATEMENT)||
				((String)CIM_CredentialManagementService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CRLDISTRIBUTIONPOINT)||
				((String)CIM_CredentialManagementService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CRLREFRESHFREQUENCY)||
				((String)CIM_CredentialManagementService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CRL)||
				((String)CIM_CredentialManagementService.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXCHAINLENGTH)){
				continue;
			}
			
			CIM_CertificateAuthority.CIM_PropertyNameList.add(CIM_CredentialManagementService.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CADISTINGUISHEDNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CAPOLICYSTATEMENT, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CRLDISTRIBUTIONPOINT, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CRLREFRESHFREQUENCY, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CRL, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXCHAINLENGTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
				
		for (int i = 0; i < CIM_CredentialManagementService.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_CredentialManagementService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CADISTINGUISHEDNAME)||
				((CIMProperty)CIM_CredentialManagementService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CAPOLICYSTATEMENT)||
				((CIMProperty)CIM_CredentialManagementService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CRLDISTRIBUTIONPOINT)||
				((CIMProperty)CIM_CredentialManagementService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CRLREFRESHFREQUENCY)||
				((CIMProperty)CIM_CredentialManagementService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CRL)||
				((CIMProperty)CIM_CredentialManagementService.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXCHAINLENGTH)){
				continue;
			}
			
			CIM_CertificateAuthority.CIM_PropertyList.add(CIM_CredentialManagementService.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_CredentialManagementService.Java_Package_List.size(); i++) {
			if (((String)CIM_CredentialManagementService.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_CredentialManagementService.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_CertificateAuthority() {

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
	public CIM_CertificateAuthority(Vector keyProperties){ 
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
	public CIM_CertificateAuthority(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_CertificateAuthority)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_CertificateAuthority)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_CertificateAuthority)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_CertificateAuthority)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_CertificateAuthority)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_CertificateAuthority)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_CertificateAuthority)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_CertificateAuthority)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_CertificateAuthority)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_CertificateAuthority)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_PublicKeyCertificate_CIM_CAHasPublicCertificates(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_CAHASPUBLICCERTIFICATE, 
					CIM_PublicKeyCertificate.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_CertificateAuthority.Java_Package_List.size(); i++) {
						if (!((String)(CIM_CertificateAuthority.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_CertificateAuthority.Java_Package_List.get(i))).endsWith(".")) {
							CIM_CertificateAuthority.Java_Package_List.setElementAt((String)(CIM_CertificateAuthority.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_CertificateAuthority.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PublicKeyCertificate(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_PublicKeyCertificate(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PublicKeyCertificate(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_PublicKeyCertificate_CIM_CAHasPublicCertificate_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_CAHASPUBLICCERTIFICATE, 
					CIM_PublicKeyCertificate.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_PublicKeyCertificate.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_PublicKeyCertificate_CIM_CASignsPublicKeyCertificates(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_CASIGNSPUBLICKEYCERTIFICATE, 
					CIM_PublicKeyCertificate.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_CertificateAuthority.Java_Package_List.size(); i++) {
						if (!((String)(CIM_CertificateAuthority.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_CertificateAuthority.Java_Package_List.get(i))).endsWith(".")) {
							CIM_CertificateAuthority.Java_Package_List.setElementAt((String)(CIM_CertificateAuthority.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_CertificateAuthority.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PublicKeyCertificate(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_PublicKeyCertificate(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PublicKeyCertificate(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_PublicKeyCertificate_CIM_CASignsPublicKeyCertificate_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_CASIGNSPUBLICKEYCERTIFICATE, 
					CIM_PublicKeyCertificate.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_PublicKeyCertificate.CIM_CLASS_NAME)) {
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
	
	// Attribute CADistinguishedName
	
	public String get_CADistinguishedName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CertificateAuthority.CIM_PROPERTY_CADISTINGUISHEDNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CertificateAuthority.CIM_PROPERTY_CADISTINGUISHEDNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CertificateAuthority.CIM_PROPERTY_CADISTINGUISHEDNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CADistinguishedName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CertificateAuthority.CIM_PROPERTY_CADISTINGUISHEDNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CertificateAuthority.CIM_PROPERTY_CADISTINGUISHEDNAME + " could not be found");
    		
		} else if (!CIM_CertificateAuthorityHelper.isValid_CADistinguishedName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CertificateAuthority.CIM_PROPERTY_CADISTINGUISHEDNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CertificateAuthority.CIM_PROPERTY_CADISTINGUISHEDNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CAPolicyStatement
	
	public String get_CAPolicyStatement() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CertificateAuthority.CIM_PROPERTY_CAPOLICYSTATEMENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CertificateAuthority.CIM_PROPERTY_CAPOLICYSTATEMENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CertificateAuthority.CIM_PROPERTY_CAPOLICYSTATEMENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CAPolicyStatement(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CertificateAuthority.CIM_PROPERTY_CAPOLICYSTATEMENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CertificateAuthority.CIM_PROPERTY_CAPOLICYSTATEMENT + " could not be found");
    		
		} else if (!CIM_CertificateAuthorityHelper.isValid_CAPolicyStatement(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CertificateAuthority.CIM_PROPERTY_CAPOLICYSTATEMENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CertificateAuthority.CIM_PROPERTY_CAPOLICYSTATEMENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CRLDistributionPoint
	
	public String[] get_CRLDistributionPoint() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CertificateAuthority.CIM_PROPERTY_CRLDISTRIBUTIONPOINT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CertificateAuthority.CIM_PROPERTY_CRLDISTRIBUTIONPOINT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CertificateAuthority.CIM_PROPERTY_CRLDISTRIBUTIONPOINT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_CRLDistributionPoint(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CertificateAuthority.CIM_PROPERTY_CRLDISTRIBUTIONPOINT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CertificateAuthority.CIM_PROPERTY_CRLDISTRIBUTIONPOINT + " could not be found");
    		
		} else if (!CIM_CertificateAuthorityHelper.isValid_CRLDistributionPoint(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CertificateAuthority.CIM_PROPERTY_CRLDISTRIBUTIONPOINT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CertificateAuthority.CIM_PROPERTY_CRLDISTRIBUTIONPOINT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CRLRefreshFrequency
	
	public UnsignedInt8 get_CRLRefreshFrequency() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CertificateAuthority.CIM_PROPERTY_CRLREFRESHFREQUENCY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CertificateAuthority.CIM_PROPERTY_CRLREFRESHFREQUENCY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CertificateAuthority.CIM_PROPERTY_CRLREFRESHFREQUENCY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CRLRefreshFrequency(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CertificateAuthority.CIM_PROPERTY_CRLREFRESHFREQUENCY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CertificateAuthority.CIM_PROPERTY_CRLREFRESHFREQUENCY + " could not be found");
    		
		} else if (!CIM_CertificateAuthorityHelper.isValid_CRLRefreshFrequency(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CertificateAuthority.CIM_PROPERTY_CRLREFRESHFREQUENCY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CertificateAuthority.CIM_PROPERTY_CRLREFRESHFREQUENCY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CRL
	
	public String[] get_CRL() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CertificateAuthority.CIM_PROPERTY_CRL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CertificateAuthority.CIM_PROPERTY_CRL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CertificateAuthority.CIM_PROPERTY_CRL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_CRL(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CertificateAuthority.CIM_PROPERTY_CRL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CertificateAuthority.CIM_PROPERTY_CRL + " could not be found");
    		
		} else if (!CIM_CertificateAuthorityHelper.isValid_CRL(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CertificateAuthority.CIM_PROPERTY_CRL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CertificateAuthority.CIM_PROPERTY_CRL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxChainLength
	
	public UnsignedInt8 get_MaxChainLength() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CertificateAuthority.CIM_PROPERTY_MAXCHAINLENGTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CertificateAuthority.CIM_PROPERTY_MAXCHAINLENGTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CertificateAuthority.CIM_PROPERTY_MAXCHAINLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxChainLength(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CertificateAuthority.CIM_PROPERTY_MAXCHAINLENGTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CertificateAuthority.CIM_PROPERTY_MAXCHAINLENGTH + " could not be found");
    		
		} else if (!CIM_CertificateAuthorityHelper.isValid_MaxChainLength(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CertificateAuthority.CIM_PROPERTY_MAXCHAINLENGTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CertificateAuthority.CIM_PROPERTY_MAXCHAINLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
