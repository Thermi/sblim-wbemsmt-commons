/** 
 * CIM_EGPRouteCalcDependency.java
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
 * Description: This is a specialization of ServiceServiceDependency, and captures the dependency that external gateway protocols (such as BGP) have on interior gateway protocols (such as OSPF).
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_EGPRouteCalcDependency extends CIM_ServiceServiceDependency  {
	
	public final static String CIM_CLASS_NAME = "CIM_EGPRouteCalcDependency";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE_1 = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE_2 = "Dependent"; //$NON-NLS-1$
	
	
	/**
	*	Sometimes it is necessary to inject EGP information, such as that from BGP, into IGPs. This attribute defines whether this should be done for the two routing protocols that are defined by this association. The values below mean that no, partial, and full EGP information is injected into the IGP, respectively.
	*/
	public final static String CIM_PROPERTY_IGPINJECTION = "IGPInjection"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_IGPINJECTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE_1);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE_2);
				
		for (int i = 0; i < CIM_ServiceServiceDependency.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ServiceServiceDependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_IGPINJECTION)){
				continue;
			}
			
			CIM_EGPRouteCalcDependency.CIM_PropertyNameList.add(CIM_ServiceServiceDependency.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_IGPINJECTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE_1, new CIMValue(null, new CIMDataType(CIM_RouteCalculationService.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE_2, new CIMValue(null, new CIMDataType(CIM_RouteCalculationService.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_ServiceServiceDependency.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ServiceServiceDependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_IGPINJECTION)){
				continue;
			}
			
			CIM_EGPRouteCalcDependency.CIM_PropertyList.add(CIM_ServiceServiceDependency.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_ServiceServiceDependency.Java_Package_List.size(); i++) {
			if (((String)CIM_ServiceServiceDependency.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_ServiceServiceDependency.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_IGPINJECTION = {"None","Partial","Full"};
	
	
	public final static int IGPINJECTION_NONE = 1;
	public final static int IGPINJECTION_PARTIAL = 2;
	public final static int IGPINJECTION_FULL = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_EGPRouteCalcDependency() {

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
	public CIM_EGPRouteCalcDependency(Vector keyProperties){ 
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
	public CIM_EGPRouteCalcDependency(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_EGPRouteCalcDependency)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_EGPRouteCalcDependency)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_EGPRouteCalcDependency)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_EGPRouteCalcDependency)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_EGPRouteCalcDependency)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_EGPRouteCalcDependency)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_EGPRouteCalcDependency)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_EGPRouteCalcDependency)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_EGPRouteCalcDependency)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_EGPRouteCalcDependency)object).cimObjectPath)) {
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
	
	// Attribute IGPInjection
	
	public UnsignedInt16 get_IGPInjection() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EGPRouteCalcDependency.CIM_PROPERTY_IGPINJECTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EGPRouteCalcDependency.CIM_PROPERTY_IGPINJECTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EGPRouteCalcDependency.CIM_PROPERTY_IGPINJECTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IGPInjection(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EGPRouteCalcDependency.CIM_PROPERTY_IGPINJECTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EGPRouteCalcDependency.CIM_PROPERTY_IGPINJECTION + " could not be found");
    		
		} else if (!CIM_EGPRouteCalcDependencyHelper.isValid_IGPInjection(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EGPRouteCalcDependency.CIM_PROPERTY_IGPINJECTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EGPRouteCalcDependency.CIM_PROPERTY_IGPINJECTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_RouteCalculationService_1
	
	public CIMObjectPath get_CIM_RouteCalculationService_1() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EGPRouteCalcDependency.CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE_1);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EGPRouteCalcDependency.CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE_1 + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_RouteCalculationService.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EGPRouteCalcDependency.CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE_1 + " is not of expected type CIM_RouteCalculationService.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_RouteCalculationService_1(CIM_RouteCalculationService newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EGPRouteCalcDependency.CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE_1);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EGPRouteCalcDependency.CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE_1 + " could not be found");
    		
		} else if (!CIM_EGPRouteCalcDependencyHelper.isValid_CIM_RouteCalculationService_1(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EGPRouteCalcDependency.CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE_1);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_RouteCalculationService.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EGPRouteCalcDependency.CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE_1 + " is not of expected type CIM_RouteCalculationService.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_RouteCalculationService.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_RouteCalculationService_2
	
	public CIMObjectPath get_CIM_RouteCalculationService_2() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EGPRouteCalcDependency.CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE_2);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EGPRouteCalcDependency.CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE_2 + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_RouteCalculationService.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EGPRouteCalcDependency.CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE_2 + " is not of expected type CIM_RouteCalculationService.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_RouteCalculationService_2(CIM_RouteCalculationService newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EGPRouteCalcDependency.CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE_2);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EGPRouteCalcDependency.CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE_2 + " could not be found");
    		
		} else if (!CIM_EGPRouteCalcDependencyHelper.isValid_CIM_RouteCalculationService_2(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EGPRouteCalcDependency.CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE_2);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_RouteCalculationService.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EGPRouteCalcDependency.CIM_PROPERTY_CIM_ROUTECALCULATIONSERVICE_2 + " is not of expected type CIM_RouteCalculationService.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_RouteCalculationService.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
