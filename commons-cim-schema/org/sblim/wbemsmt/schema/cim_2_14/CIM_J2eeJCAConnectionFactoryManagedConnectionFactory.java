/** 
 * CIM_J2eeJCAConnectionFactoryManagedConnectionFactory.java
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
 * Description:  CIM_J2eeJCAConnectionFactoryManagedConnectionFactory identifies the JCA managed
 * connection factory associated with the corresponding JCA connection factory .
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;


/**
 *  CIM_J2eeJCAConnectionFactoryManagedConnectionFactory identifies the JCA managed
 * connection factory associated with the corresponding JCA connection factory .
 */
public class CIM_J2eeJCAConnectionFactoryManagedConnectionFactory extends CIM_HostedDependency  {
	
	public final static String CIM_CLASS_NAME = "CIM_J2eeJCAConnectionFactoryManagedConnectionFactory"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_PROPERTY_CIM_J2EEJCACONNECTIONFACTORY = "Dependent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_J2EEJCAMANAGEDCONNECTIONFACTORY = "Antecedent"; //$NON-NLS-1$
	
	
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_J2EEJCACONNECTIONFACTORY);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_J2EEJCAMANAGEDCONNECTIONFACTORY);
				
		for (int i = 0; i < CIM_HostedDependency.CIM_PropertyNameList.size(); i++) {
			
			CIM_J2eeJCAConnectionFactoryManagedConnectionFactory.CIM_PropertyNameList.add(CIM_HostedDependency.CIM_PropertyNameList.elementAt(i));
		}
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_J2EEJCACONNECTIONFACTORY, new CIMValue(null, new CIMDataType(CIM_J2eeJCAConnectionFactory.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_J2EEJCAMANAGEDCONNECTIONFACTORY, new CIMValue(null, new CIMDataType(CIM_J2eeJCAManagedConnectionFactory.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_HostedDependency.CIM_PropertyList.size(); i++) {
			
			CIM_J2eeJCAConnectionFactoryManagedConnectionFactory.CIM_PropertyList.add(CIM_HostedDependency.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_HostedDependency.Java_Package_List.size(); i++) {
			if (((String)CIM_HostedDependency.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
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
	public CIM_J2eeJCAConnectionFactoryManagedConnectionFactory() {

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
	public CIM_J2eeJCAConnectionFactoryManagedConnectionFactory(Vector keyProperties){ 
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
	public CIM_J2eeJCAConnectionFactoryManagedConnectionFactory(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_J2eeJCAConnectionFactoryManagedConnectionFactory)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_J2eeJCAConnectionFactoryManagedConnectionFactory)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_J2eeJCAConnectionFactoryManagedConnectionFactory)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_J2eeJCAConnectionFactoryManagedConnectionFactory)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_J2eeJCAConnectionFactoryManagedConnectionFactory)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_J2eeJCAConnectionFactoryManagedConnectionFactory)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_J2eeJCAConnectionFactoryManagedConnectionFactory)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_J2eeJCAConnectionFactoryManagedConnectionFactory)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_J2eeJCAConnectionFactoryManagedConnectionFactory)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_J2eeJCAConnectionFactoryManagedConnectionFactory)object).cimObjectPath)) {
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
	
	// Attribute CIM_J2eeJCAConnectionFactory
	
	public CIMObjectPath get_CIM_J2eeJCAConnectionFactory() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJCAConnectionFactoryManagedConnectionFactory.CIM_PROPERTY_CIM_J2EEJCACONNECTIONFACTORY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJCAConnectionFactoryManagedConnectionFactory.CIM_PROPERTY_CIM_J2EEJCACONNECTIONFACTORY + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_J2eeJCAConnectionFactory.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJCAConnectionFactoryManagedConnectionFactory.CIM_PROPERTY_CIM_J2EEJCACONNECTIONFACTORY + " is not of expected type CIM_J2eeJCAConnectionFactory.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_J2eeJCAConnectionFactory(CIM_J2eeJCAConnectionFactory newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJCAConnectionFactoryManagedConnectionFactory.CIM_PROPERTY_CIM_J2EEJCACONNECTIONFACTORY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJCAConnectionFactoryManagedConnectionFactory.CIM_PROPERTY_CIM_J2EEJCACONNECTIONFACTORY + " could not be found");
    		
		} else if (!CIM_J2eeJCAConnectionFactoryManagedConnectionFactoryHelper.isValid_CIM_J2eeJCAConnectionFactory(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeJCAConnectionFactoryManagedConnectionFactory.CIM_PROPERTY_CIM_J2EEJCACONNECTIONFACTORY);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_J2eeJCAConnectionFactory.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJCAConnectionFactoryManagedConnectionFactory.CIM_PROPERTY_CIM_J2EEJCACONNECTIONFACTORY + " is not of expected type CIM_J2eeJCAConnectionFactory.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_J2eeJCAConnectionFactory.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_J2eeJCAManagedConnectionFactory
	
	public CIMObjectPath get_CIM_J2eeJCAManagedConnectionFactory() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJCAConnectionFactoryManagedConnectionFactory.CIM_PROPERTY_CIM_J2EEJCAMANAGEDCONNECTIONFACTORY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJCAConnectionFactoryManagedConnectionFactory.CIM_PROPERTY_CIM_J2EEJCAMANAGEDCONNECTIONFACTORY + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_J2eeJCAManagedConnectionFactory.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJCAConnectionFactoryManagedConnectionFactory.CIM_PROPERTY_CIM_J2EEJCAMANAGEDCONNECTIONFACTORY + " is not of expected type CIM_J2eeJCAManagedConnectionFactory.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_J2eeJCAManagedConnectionFactory(CIM_J2eeJCAManagedConnectionFactory newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJCAConnectionFactoryManagedConnectionFactory.CIM_PROPERTY_CIM_J2EEJCAMANAGEDCONNECTIONFACTORY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJCAConnectionFactoryManagedConnectionFactory.CIM_PROPERTY_CIM_J2EEJCAMANAGEDCONNECTIONFACTORY + " could not be found");
    		
		} else if (!CIM_J2eeJCAConnectionFactoryManagedConnectionFactoryHelper.isValid_CIM_J2eeJCAManagedConnectionFactory(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeJCAConnectionFactoryManagedConnectionFactory.CIM_PROPERTY_CIM_J2EEJCAMANAGEDCONNECTIONFACTORY);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_J2eeJCAManagedConnectionFactory.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJCAConnectionFactoryManagedConnectionFactory.CIM_PROPERTY_CIM_J2EEJCAMANAGEDCONNECTIONFACTORY + " is not of expected type CIM_J2eeJCAManagedConnectionFactory.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_J2eeJCAManagedConnectionFactory.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
