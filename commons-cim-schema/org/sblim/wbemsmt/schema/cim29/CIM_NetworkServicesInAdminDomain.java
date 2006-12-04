/** 
 * CIM_NetworkServicesInAdminDomain.java
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
 * Description: This association establishes the Dependency relationships that exist between an administrative domain and the Network Services that it hosts. It is deprecated since AdminDomains can contain any ManagedSystemElements. There is no special relationship needed for NetworkServices. In addition, the Min (1) cardinality on AdminDomain is not valid - since it may not be possible to define every NetworkService in the context of one or more Domains.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_NetworkServicesInAdminDomain extends CIM_HostedDependency  {
	
	public final static String CIM_CLASS_NAME = "CIM_NetworkServicesInAdminDomain";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_PROPERTY_CIM_ADMINDOMAIN = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_NETWORKSERVICE = "Dependent"; //$NON-NLS-1$
	
	
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_ADMINDOMAIN);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_NETWORKSERVICE);
				
		for (int i = 0; i < CIM_HostedDependency.CIM_PropertyNameList.size(); i++) {
			
			CIM_NetworkServicesInAdminDomain.CIM_PropertyNameList.add(CIM_HostedDependency.CIM_PropertyNameList.elementAt(i));
		}
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_ADMINDOMAIN, new CIMValue(null, new CIMDataType(CIM_AdminDomain.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_NETWORKSERVICE, new CIMValue(null, new CIMDataType(CIM_NetworkService.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_HostedDependency.CIM_PropertyList.size(); i++) {
			
			CIM_NetworkServicesInAdminDomain.CIM_PropertyList.add(CIM_HostedDependency.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_HostedDependency.Java_Package_List.size(); i++) {
			if (((String)CIM_HostedDependency.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_HostedDependency.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_NetworkServicesInAdminDomain() {

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
	public CIM_NetworkServicesInAdminDomain(Vector keyProperties){ 
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
	public CIM_NetworkServicesInAdminDomain(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_NetworkServicesInAdminDomain)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_NetworkServicesInAdminDomain)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_NetworkServicesInAdminDomain)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_NetworkServicesInAdminDomain)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_NetworkServicesInAdminDomain)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_NetworkServicesInAdminDomain)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_NetworkServicesInAdminDomain)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_NetworkServicesInAdminDomain)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_NetworkServicesInAdminDomain)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_NetworkServicesInAdminDomain)object).cimObjectPath)) {
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
	
	// Attribute CIM_AdminDomain
	
	public CIMObjectPath get_CIM_AdminDomain() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkServicesInAdminDomain.CIM_PROPERTY_CIM_ADMINDOMAIN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkServicesInAdminDomain.CIM_PROPERTY_CIM_ADMINDOMAIN + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_AdminDomain.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkServicesInAdminDomain.CIM_PROPERTY_CIM_ADMINDOMAIN + " is not of expected type CIM_AdminDomain.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_AdminDomain(CIM_AdminDomain newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkServicesInAdminDomain.CIM_PROPERTY_CIM_ADMINDOMAIN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkServicesInAdminDomain.CIM_PROPERTY_CIM_ADMINDOMAIN + " could not be found");
    		
		} else if (!CIM_NetworkServicesInAdminDomainHelper.isValid_CIM_AdminDomain(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkServicesInAdminDomain.CIM_PROPERTY_CIM_ADMINDOMAIN);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_AdminDomain.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkServicesInAdminDomain.CIM_PROPERTY_CIM_ADMINDOMAIN + " is not of expected type CIM_AdminDomain.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_AdminDomain.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_NetworkService
	
	public CIMObjectPath get_CIM_NetworkService() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkServicesInAdminDomain.CIM_PROPERTY_CIM_NETWORKSERVICE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkServicesInAdminDomain.CIM_PROPERTY_CIM_NETWORKSERVICE + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_NetworkService.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkServicesInAdminDomain.CIM_PROPERTY_CIM_NETWORKSERVICE + " is not of expected type CIM_NetworkService.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_NetworkService(CIM_NetworkService newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NetworkServicesInAdminDomain.CIM_PROPERTY_CIM_NETWORKSERVICE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NetworkServicesInAdminDomain.CIM_PROPERTY_CIM_NETWORKSERVICE + " could not be found");
    		
		} else if (!CIM_NetworkServicesInAdminDomainHelper.isValid_CIM_NetworkService(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NetworkServicesInAdminDomain.CIM_PROPERTY_CIM_NETWORKSERVICE);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_NetworkService.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NetworkServicesInAdminDomain.CIM_PROPERTY_CIM_NETWORKSERVICE + " is not of expected type CIM_NetworkService.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_NetworkService.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
