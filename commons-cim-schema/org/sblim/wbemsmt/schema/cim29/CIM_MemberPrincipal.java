/** 
 * CIM_MemberPrincipal.java
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
 * Description: CIM_MemberPrincipal is an aggregation used to establish membership of principals (i.e., users) in a Collection. That membership can be established either directly or indirectly as indicated in the UsersAccessBy property. For example, a user may be identified directly by their userid (i.e., Account object instance) or the user may be identified indirectly by realm from which a ticket was issued (i.e., CredentialManagementService object instance). 

This association is deprecated in lieu of its superclass. Usage feedback on the class has indicated confusion regarding defining the members of the collection. Also, the UsersAccess aspects of this association have been deprecated.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_MemberPrincipal extends CIM_MemberOfCollection  {
	
	public final static String CIM_CLASS_NAME = "CIM_MemberPrincipal";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_PROPERTY_CIM_COLLECTION = "Collection"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_MANAGEDELEMENT = "Member"; //$NON-NLS-1$
	
	
	/**
	*	A MemberPrincipal may be identifed in several ways that may be either direct or indirect membership in the collection. 
-A 'UsersAccess' membership directly identifies the user by the UsersAccess object instance. 
- An 'Account' membership directly identifies the user by the Account object class instance. 
- A 'UsingElement' membership indirectly identifies the user by the ManagedElement object instance that has ElementAsUser associations to UsersAccess object instances. Hence, all UsersAccess instances are indirectly included in the collection.
	*/
	public final static String CIM_PROPERTY_USERACCESSBY = "UserAccessBy"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_USERACCESSBY);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_COLLECTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_MANAGEDELEMENT);
				
		for (int i = 0; i < CIM_MemberOfCollection.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_MemberOfCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_USERACCESSBY)){
				continue;
			}
			
			CIM_MemberPrincipal.CIM_PropertyNameList.add(CIM_MemberOfCollection.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_USERACCESSBY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_COLLECTION, new CIMValue(null, new CIMDataType(CIM_Collection.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_MANAGEDELEMENT, new CIMValue(null, new CIMDataType(CIM_ManagedElement.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_MemberOfCollection.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_MemberOfCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_USERACCESSBY)){
				continue;
			}
			
			CIM_MemberPrincipal.CIM_PropertyList.add(CIM_MemberOfCollection.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_MemberOfCollection.Java_Package_List.size(); i++) {
			if (((String)CIM_MemberOfCollection.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_MemberOfCollection.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_USERACCESSBY = {"UsersAccess","Account","UsingElement","CredentialManagementService"};
	
	
	public final static int USERACCESSBY_USERSACCESS = 1;
	public final static int USERACCESSBY_ACCOUNT = 2;
	public final static int USERACCESSBY_USINGELEMENT = 3;
	public final static int USERACCESSBY_CREDENTIALMANAGEMENTSERVICE = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_MemberPrincipal() {

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
	public CIM_MemberPrincipal(Vector keyProperties){ 
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
	public CIM_MemberPrincipal(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_MemberPrincipal)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_MemberPrincipal)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_MemberPrincipal)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_MemberPrincipal)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_MemberPrincipal)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_MemberPrincipal)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_MemberPrincipal)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_MemberPrincipal)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_MemberPrincipal)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_MemberPrincipal)object).cimObjectPath)) {
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
	
	// Attribute UserAccessBy
	
	public UnsignedInt16 get_UserAccessBy() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MemberPrincipal.CIM_PROPERTY_USERACCESSBY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MemberPrincipal.CIM_PROPERTY_USERACCESSBY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MemberPrincipal.CIM_PROPERTY_USERACCESSBY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UserAccessBy(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MemberPrincipal.CIM_PROPERTY_USERACCESSBY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MemberPrincipal.CIM_PROPERTY_USERACCESSBY + " could not be found");
    		
		} else if (!CIM_MemberPrincipalHelper.isValid_UserAccessBy(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MemberPrincipal.CIM_PROPERTY_USERACCESSBY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MemberPrincipal.CIM_PROPERTY_USERACCESSBY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_Collection
	
	public CIMObjectPath get_CIM_Collection() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MemberPrincipal.CIM_PROPERTY_CIM_COLLECTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MemberPrincipal.CIM_PROPERTY_CIM_COLLECTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Collection.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MemberPrincipal.CIM_PROPERTY_CIM_COLLECTION + " is not of expected type CIM_Collection.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_Collection(CIM_Collection newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MemberPrincipal.CIM_PROPERTY_CIM_COLLECTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MemberPrincipal.CIM_PROPERTY_CIM_COLLECTION + " could not be found");
    		
		} else if (!CIM_MemberPrincipalHelper.isValid_CIM_Collection(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MemberPrincipal.CIM_PROPERTY_CIM_COLLECTION);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Collection.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MemberPrincipal.CIM_PROPERTY_CIM_COLLECTION + " is not of expected type CIM_Collection.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_Collection.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_ManagedElement
	
	public CIMObjectPath get_CIM_ManagedElement() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MemberPrincipal.CIM_PROPERTY_CIM_MANAGEDELEMENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MemberPrincipal.CIM_PROPERTY_CIM_MANAGEDELEMENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ManagedElement.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MemberPrincipal.CIM_PROPERTY_CIM_MANAGEDELEMENT + " is not of expected type CIM_ManagedElement.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_ManagedElement(CIM_ManagedElement newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MemberPrincipal.CIM_PROPERTY_CIM_MANAGEDELEMENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MemberPrincipal.CIM_PROPERTY_CIM_MANAGEDELEMENT + " could not be found");
    		
		} else if (!CIM_MemberPrincipalHelper.isValid_CIM_ManagedElement(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MemberPrincipal.CIM_PROPERTY_CIM_MANAGEDELEMENT);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ManagedElement.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MemberPrincipal.CIM_PROPERTY_CIM_MANAGEDELEMENT + " is not of expected type CIM_ManagedElement.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_ManagedElement.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
