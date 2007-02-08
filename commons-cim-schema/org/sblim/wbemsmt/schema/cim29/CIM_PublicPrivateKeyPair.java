/** 
 * CIM_PublicPrivateKeyPair.java
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
 * Description: This relationship associates a PublicKeyCertificate with the Principal who has the PrivateKey used with the PublicKey. The PrivateKey is not modeled, since it is not a data element that ever SHOULD be accessible via management applications, other than key recovery services, which are outside our scope. 

Since the UsersAccess class and this association's superclass are deprecated, this association is also deprecated. There is no need to have a special subclass for public-private credentials. This is especially true since the properties of the association describe aspects of the certificate and its handling. The latter is currently out of scope for the model.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_PublicPrivateKeyPair extends CIM_UsersCredential  {
	
	public final static String CIM_CLASS_NAME = "CIM_PublicPrivateKeyPair";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_PROPERTY_CIM_PUBLICKEYCERTIFICATE = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_USERSACCESS = "Dependent"; //$NON-NLS-1$
	
	
	/**
	*	Indicates if the certificate can be backed up.
	*/
	public final static String CIM_PROPERTY_BACKEDUP = "BackedUp"; //$NON-NLS-1$
	/**
	*	Indicates if the certificate canNOT be repudiated.
	*/
	public final static String CIM_PROPERTY_NONREPUDIATION = "NonRepudiation"; //$NON-NLS-1$
	/**
	*	The repository in which the certificate is backed up.
	*/
	public final static String CIM_PROPERTY_REPOSITORY = "Repository"; //$NON-NLS-1$
	/**
	*	The Certificate may be used for signature only or for confidentiality as well as signature.
	*/
	public final static String CIM_PROPERTY_USE = "Use"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_BACKEDUP);
		CIM_PropertyNameList.add(CIM_PROPERTY_NONREPUDIATION);
		CIM_PropertyNameList.add(CIM_PROPERTY_REPOSITORY);
		CIM_PropertyNameList.add(CIM_PROPERTY_USE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_PUBLICKEYCERTIFICATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_USERSACCESS);
				
		for (int i = 0; i < CIM_UsersCredential.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_UsersCredential.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BACKEDUP)||
				((String)CIM_UsersCredential.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NONREPUDIATION)||
				((String)CIM_UsersCredential.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REPOSITORY)||
				((String)CIM_UsersCredential.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_USE)){
				continue;
			}
			
			CIM_PublicPrivateKeyPair.CIM_PropertyNameList.add(CIM_UsersCredential.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BACKEDUP, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NONREPUDIATION, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REPOSITORY, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_USE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_PUBLICKEYCERTIFICATE, new CIMValue(null, new CIMDataType(CIM_PublicKeyCertificate.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_USERSACCESS, new CIMValue(null, new CIMDataType(CIM_UsersAccess.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_UsersCredential.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_UsersCredential.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BACKEDUP)||
				((CIMProperty)CIM_UsersCredential.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NONREPUDIATION)||
				((CIMProperty)CIM_UsersCredential.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REPOSITORY)||
				((CIMProperty)CIM_UsersCredential.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_USE)){
				continue;
			}
			
			CIM_PublicPrivateKeyPair.CIM_PropertyList.add(CIM_UsersCredential.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_UsersCredential.Java_Package_List.size(); i++) {
			if (((String)CIM_UsersCredential.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_UsersCredential.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_USE = {"SignOnly","ConfidentialityOrSignature"};
	
	
	public final static int USE_SIGNONLY = 0;
	public final static int USE_CONFIDENTIALITYORSIGNATURE = 1;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PublicPrivateKeyPair() {

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
	public CIM_PublicPrivateKeyPair(Vector keyProperties){ 
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
	public CIM_PublicPrivateKeyPair(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_PublicPrivateKeyPair)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PublicPrivateKeyPair)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PublicPrivateKeyPair)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PublicPrivateKeyPair)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PublicPrivateKeyPair)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PublicPrivateKeyPair)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PublicPrivateKeyPair)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PublicPrivateKeyPair)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PublicPrivateKeyPair)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PublicPrivateKeyPair)object).cimObjectPath)) {
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
	
	
	
	//*****************************************************
	// Attribute methods
	//*****************************************************
	
	// Attribute BackedUp
	
	public Boolean get_BackedUp() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PublicPrivateKeyPair.CIM_PROPERTY_BACKEDUP);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_BACKEDUP + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_BACKEDUP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BackedUp(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PublicPrivateKeyPair.CIM_PROPERTY_BACKEDUP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_BACKEDUP + " could not be found");
    		
		} else if (!CIM_PublicPrivateKeyPairHelper.isValid_BackedUp(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_BACKEDUP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_BACKEDUP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NonRepudiation
	
	public Boolean get_NonRepudiation() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PublicPrivateKeyPair.CIM_PROPERTY_NONREPUDIATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_NONREPUDIATION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_NONREPUDIATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NonRepudiation(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PublicPrivateKeyPair.CIM_PROPERTY_NONREPUDIATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_NONREPUDIATION + " could not be found");
    		
		} else if (!CIM_PublicPrivateKeyPairHelper.isValid_NonRepudiation(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_NONREPUDIATION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_NONREPUDIATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Repository
	
	public String get_Repository() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PublicPrivateKeyPair.CIM_PROPERTY_REPOSITORY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_REPOSITORY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_REPOSITORY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Repository(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PublicPrivateKeyPair.CIM_PROPERTY_REPOSITORY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_REPOSITORY + " could not be found");
    		
		} else if (!CIM_PublicPrivateKeyPairHelper.isValid_Repository(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_REPOSITORY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_REPOSITORY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Use
	
	public UnsignedInt16 get_Use() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PublicPrivateKeyPair.CIM_PROPERTY_USE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_USE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_USE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Use(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PublicPrivateKeyPair.CIM_PROPERTY_USE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_USE + " could not be found");
    		
		} else if (!CIM_PublicPrivateKeyPairHelper.isValid_Use(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_USE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_USE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_PublicKeyCertificate
	
	public CIMObjectPath get_CIM_PublicKeyCertificate() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PublicPrivateKeyPair.CIM_PROPERTY_CIM_PUBLICKEYCERTIFICATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_CIM_PUBLICKEYCERTIFICATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PublicKeyCertificate.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_CIM_PUBLICKEYCERTIFICATE + " is not of expected type CIM_PublicKeyCertificate.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_PublicKeyCertificate(CIM_PublicKeyCertificate newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PublicPrivateKeyPair.CIM_PROPERTY_CIM_PUBLICKEYCERTIFICATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_CIM_PUBLICKEYCERTIFICATE + " could not be found");
    		
		} else if (!CIM_PublicPrivateKeyPairHelper.isValid_CIM_PublicKeyCertificate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_CIM_PUBLICKEYCERTIFICATE);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PublicKeyCertificate.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_CIM_PUBLICKEYCERTIFICATE + " is not of expected type CIM_PublicKeyCertificate.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_PublicKeyCertificate.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_UsersAccess
	
	public CIMObjectPath get_CIM_UsersAccess() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PublicPrivateKeyPair.CIM_PROPERTY_CIM_USERSACCESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_CIM_USERSACCESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_UsersAccess.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_CIM_USERSACCESS + " is not of expected type CIM_UsersAccess.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_UsersAccess(CIM_UsersAccess newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PublicPrivateKeyPair.CIM_PROPERTY_CIM_USERSACCESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_CIM_USERSACCESS + " could not be found");
    		
		} else if (!CIM_PublicPrivateKeyPairHelper.isValid_CIM_UsersAccess(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_CIM_USERSACCESS);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_UsersAccess.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PublicPrivateKeyPair.CIM_PROPERTY_CIM_USERSACCESS + " is not of expected type CIM_UsersAccess.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_UsersAccess.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
