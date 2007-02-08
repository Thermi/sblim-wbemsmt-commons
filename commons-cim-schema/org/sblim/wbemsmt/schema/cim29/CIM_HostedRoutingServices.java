/** 
 * CIM_HostedRoutingServices.java
 *
 * � Copyright IBM Corp. 2005
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
 * Description: This is a specialization of CIM_HostedService, which is an association between a Service and the System on which the functionality resides. The class, HostedRoutingServices, is deprecated since it provides no additional semantics over HostedService, and unecessarily restricts the Service to a single ComputerSystem, when the Service could reside in a Network or other higher level System.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_HostedRoutingServices extends CIM_HostedService  {
	
	public final static String CIM_CLASS_NAME = "CIM_HostedRoutingServices";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.1";
	public final static String CIM_PROPERTY_CIM_COMPUTERSYSTEM = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE = "Dependent"; //$NON-NLS-1$
	
	
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_COMPUTERSYSTEM);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE);
				
		for (int i = 0; i < CIM_HostedService.CIM_PropertyNameList.size(); i++) {
			
			CIM_HostedRoutingServices.CIM_PropertyNameList.add(CIM_HostedService.CIM_PropertyNameList.elementAt(i));
		}
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_COMPUTERSYSTEM, new CIMValue(null, new CIMDataType(CIM_ComputerSystem.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE, new CIMValue(null, new CIMDataType(CIM_RouteCalculationService.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_HostedService.CIM_PropertyList.size(); i++) {
			
			CIM_HostedRoutingServices.CIM_PropertyList.add(CIM_HostedService.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_HostedService.Java_Package_List.size(); i++) {
			if (((String)CIM_HostedService.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_HostedService.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_HostedRoutingServices() {

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
	public CIM_HostedRoutingServices(Vector keyProperties){ 
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
	public CIM_HostedRoutingServices(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_HostedRoutingServices)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_HostedRoutingServices)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_HostedRoutingServices)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_HostedRoutingServices)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_HostedRoutingServices)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_HostedRoutingServices)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_HostedRoutingServices)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_HostedRoutingServices)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_HostedRoutingServices)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_HostedRoutingServices)object).cimObjectPath)) {
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
	
	// Attribute CIM_ComputerSystem
	
	public CIMObjectPath get_CIM_ComputerSystem() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_HostedRoutingServices.CIM_PROPERTY_CIM_COMPUTERSYSTEM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_HostedRoutingServices.CIM_PROPERTY_CIM_COMPUTERSYSTEM + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ComputerSystem.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_HostedRoutingServices.CIM_PROPERTY_CIM_COMPUTERSYSTEM + " is not of expected type CIM_ComputerSystem.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_ComputerSystem(CIM_ComputerSystem newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_HostedRoutingServices.CIM_PROPERTY_CIM_COMPUTERSYSTEM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_HostedRoutingServices.CIM_PROPERTY_CIM_COMPUTERSYSTEM + " could not be found");
    		
		} else if (!CIM_HostedRoutingServicesHelper.isValid_CIM_ComputerSystem(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_HostedRoutingServices.CIM_PROPERTY_CIM_COMPUTERSYSTEM);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ComputerSystem.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_HostedRoutingServices.CIM_PROPERTY_CIM_COMPUTERSYSTEM + " is not of expected type CIM_ComputerSystem.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_ComputerSystem.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_RouteCalculationService
	
	public CIMObjectPath get_CIM_RouteCalculationService() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_HostedRoutingServices.CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_HostedRoutingServices.CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_RouteCalculationService.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_HostedRoutingServices.CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE + " is not of expected type CIM_RouteCalculationService.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_RouteCalculationService(CIM_RouteCalculationService newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_HostedRoutingServices.CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_HostedRoutingServices.CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE + " could not be found");
    		
		} else if (!CIM_HostedRoutingServicesHelper.isValid_CIM_RouteCalculationService(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_HostedRoutingServices.CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_RouteCalculationService.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_HostedRoutingServices.CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE + " is not of expected type CIM_RouteCalculationService.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_RouteCalculationService.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
