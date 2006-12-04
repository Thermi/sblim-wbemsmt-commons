/** 
 * CIM_SoftwareElementSAPImplementation.java
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
 * Description: An association between a ServiceAccessPoint and how it is implemented by one or more executable SoftwareElements. Note that this association is restricted to 'executable' Elements. In earlier phases of deployment, the Software FeatureSAPImplementation association is adequate and recommended. 
The relationship between this association and Software FeatureSAPImplementation is more fully described here. SoftwareElementSAPImplementation allows the description of greater granularity than SoftwareFeatureSAPImplementation, when a SoftwareFeature is fully deployed and results in several executable Elements. These Elements may implement several different ServiceAccessPoints. 
Since SoftwareFeatures decompose into SoftwareElements, it is possible to describe how software implements a SAP by using either this association or the SoftwareFeatureSAP Implementation relationship. One or the other should be chosen. Both associations should not be used for a particular AccessPoint, since their information is redundant. 
This relationship is especially important when the SoftwareFeature and Product aspects are not described for a SoftwareElement (ie, when the acquisition and deployment of the software is not detailed). In this case, the Software ElementSAPImplementation association is the only one available to describe how an AccessPoint is implemented in software. Since SoftwareFeatures are not instantiated, it is not possible to use the SoftwareFeatureSAP Implementation association. 
The cardinality of this association is many-to-many. A ServiceAccessPoint may be provided by more than one Software Element. (If this is true, it is assumed that the Software Elements operate in conjunction.) And, any SoftwareElement may provide more than one SAP.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_SoftwareElementSAPImplementation extends CIM_Dependency  {
	
	public final static String CIM_CLASS_NAME = "CIM_SoftwareElementSAPImplementation";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_PROPERTY_CIM_SOFTWAREELEMENT = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_SERVICEACCESSPOINT = "Dependent"; //$NON-NLS-1$
	
	
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SOFTWAREELEMENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SERVICEACCESSPOINT);
				
		for (int i = 0; i < CIM_Dependency.CIM_PropertyNameList.size(); i++) {
			
			CIM_SoftwareElementSAPImplementation.CIM_PropertyNameList.add(CIM_Dependency.CIM_PropertyNameList.elementAt(i));
		}
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SOFTWAREELEMENT, new CIMValue(null, new CIMDataType(CIM_SoftwareElement.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SERVICEACCESSPOINT, new CIMValue(null, new CIMDataType(CIM_ServiceAccessPoint.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_Dependency.CIM_PropertyList.size(); i++) {
			
			CIM_SoftwareElementSAPImplementation.CIM_PropertyList.add(CIM_Dependency.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Dependency.Java_Package_List.size(); i++) {
			if (((String)CIM_Dependency.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Dependency.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_SoftwareElementSAPImplementation() {

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
	public CIM_SoftwareElementSAPImplementation(Vector keyProperties){ 
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
	public CIM_SoftwareElementSAPImplementation(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_SoftwareElementSAPImplementation)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_SoftwareElementSAPImplementation)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_SoftwareElementSAPImplementation)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_SoftwareElementSAPImplementation)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_SoftwareElementSAPImplementation)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_SoftwareElementSAPImplementation)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_SoftwareElementSAPImplementation)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_SoftwareElementSAPImplementation)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_SoftwareElementSAPImplementation)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_SoftwareElementSAPImplementation)object).cimObjectPath)) {
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
	
	// Attribute CIM_SoftwareElement
	
	public CIMObjectPath get_CIM_SoftwareElement() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareElementSAPImplementation.CIM_PROPERTY_CIM_SOFTWAREELEMENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareElementSAPImplementation.CIM_PROPERTY_CIM_SOFTWAREELEMENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SoftwareElement.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareElementSAPImplementation.CIM_PROPERTY_CIM_SOFTWAREELEMENT + " is not of expected type CIM_SoftwareElement.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_SoftwareElement(CIM_SoftwareElement newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareElementSAPImplementation.CIM_PROPERTY_CIM_SOFTWAREELEMENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareElementSAPImplementation.CIM_PROPERTY_CIM_SOFTWAREELEMENT + " could not be found");
    		
		} else if (!CIM_SoftwareElementSAPImplementationHelper.isValid_CIM_SoftwareElement(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SoftwareElementSAPImplementation.CIM_PROPERTY_CIM_SOFTWAREELEMENT);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SoftwareElement.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareElementSAPImplementation.CIM_PROPERTY_CIM_SOFTWAREELEMENT + " is not of expected type CIM_SoftwareElement.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_SoftwareElement.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_ServiceAccessPoint
	
	public CIMObjectPath get_CIM_ServiceAccessPoint() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareElementSAPImplementation.CIM_PROPERTY_CIM_SERVICEACCESSPOINT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareElementSAPImplementation.CIM_PROPERTY_CIM_SERVICEACCESSPOINT + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ServiceAccessPoint.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareElementSAPImplementation.CIM_PROPERTY_CIM_SERVICEACCESSPOINT + " is not of expected type CIM_ServiceAccessPoint.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_ServiceAccessPoint(CIM_ServiceAccessPoint newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareElementSAPImplementation.CIM_PROPERTY_CIM_SERVICEACCESSPOINT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareElementSAPImplementation.CIM_PROPERTY_CIM_SERVICEACCESSPOINT + " could not be found");
    		
		} else if (!CIM_SoftwareElementSAPImplementationHelper.isValid_CIM_ServiceAccessPoint(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SoftwareElementSAPImplementation.CIM_PROPERTY_CIM_SERVICEACCESSPOINT);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ServiceAccessPoint.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareElementSAPImplementation.CIM_PROPERTY_CIM_SERVICEACCESSPOINT + " is not of expected type CIM_ServiceAccessPoint.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_ServiceAccessPoint.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
