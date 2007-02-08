/** 
 * CIM_AvailableDiagnosticService.java
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
 * Description: This is an association class that relates a DiagnosticService to a ManagedElement. Consumers wishing to 'diagnose' a particular Element could query this association to determine what services are available.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_AvailableDiagnosticService extends CIM_ServiceAvailableToElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_AvailableDiagnosticService";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.9.0";
	public final static String CIM_PROPERTY_CIM_DIAGNOSTICSERVICE = "ServiceProvided"; //$NON-NLS-1$
	
	
	/**
	*	Estimated magnitude of time to perform the referenced DiagnosticService on the referenced ManagedElement. 
Since the processing speed of a system can vary immensely due to a variety of factors (e.g., processor speed), this property takes on values that are a statement of magnitude, not absolute time. If greater accuracy can be provided, a quantification may be specified in the corresponding integer property, EstimatedDurationQualifier. 
Since execution times could vary by Element, this property is located in the association between the two entities.
	*/
	public final static String CIM_PROPERTY_ESTIMATEDDURATIONOFSERVICE = "EstimatedDurationOfService"; //$NON-NLS-1$
	/**
	*	EstimatedDurationQualifier can be used to further quantify the magnitude of time to perform the service.
	*/
	public final static String CIM_PROPERTY_ESTIMATEDDURATIONQUALIFIER = "EstimatedDurationQualifier"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ESTIMATEDDURATIONOFSERVICE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ESTIMATEDDURATIONQUALIFIER);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_DIAGNOSTICSERVICE);
				
		for (int i = 0; i < CIM_ServiceAvailableToElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ServiceAvailableToElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ESTIMATEDDURATIONOFSERVICE)||
				((String)CIM_ServiceAvailableToElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ESTIMATEDDURATIONQUALIFIER)){
				continue;
			}
			
			CIM_AvailableDiagnosticService.CIM_PropertyNameList.add(CIM_ServiceAvailableToElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ESTIMATEDDURATIONOFSERVICE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ESTIMATEDDURATIONQUALIFIER, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_DIAGNOSTICSERVICE, new CIMValue(null, new CIMDataType(CIM_DiagnosticService.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_ServiceAvailableToElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ServiceAvailableToElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ESTIMATEDDURATIONOFSERVICE)||
				((CIMProperty)CIM_ServiceAvailableToElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ESTIMATEDDURATIONQUALIFIER)){
				continue;
			}
			
			CIM_AvailableDiagnosticService.CIM_PropertyList.add(CIM_ServiceAvailableToElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_ServiceAvailableToElement.Java_Package_List.size(); i++) {
			if (((String)CIM_ServiceAvailableToElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_ServiceAvailableToElement.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ESTIMATEDDURATIONOFSERVICE = {"Unknown","Milliseconds","Seconds","Minutes","Hours","Days"};
	
	
	public final static int ESTIMATEDDURATIONOFSERVICE_UNKNOWN = 0;
	public final static int ESTIMATEDDURATIONOFSERVICE_MILLISECONDS = 2;
	public final static int ESTIMATEDDURATIONOFSERVICE_SECONDS = 3;
	public final static int ESTIMATEDDURATIONOFSERVICE_MINUTES = 4;
	public final static int ESTIMATEDDURATIONOFSERVICE_HOURS = 5;
	public final static int ESTIMATEDDURATIONOFSERVICE_DAYS = 6;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_AvailableDiagnosticService() {

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
	public CIM_AvailableDiagnosticService(Vector keyProperties){ 
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
	public CIM_AvailableDiagnosticService(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_AvailableDiagnosticService)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_AvailableDiagnosticService)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_AvailableDiagnosticService)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_AvailableDiagnosticService)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_AvailableDiagnosticService)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_AvailableDiagnosticService)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_AvailableDiagnosticService)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_AvailableDiagnosticService)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_AvailableDiagnosticService)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_AvailableDiagnosticService)object).cimObjectPath)) {
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
	
	// Attribute EstimatedDurationOfService
	
	public UnsignedInt16 get_EstimatedDurationOfService() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AvailableDiagnosticService.CIM_PROPERTY_ESTIMATEDDURATIONOFSERVICE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AvailableDiagnosticService.CIM_PROPERTY_ESTIMATEDDURATIONOFSERVICE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AvailableDiagnosticService.CIM_PROPERTY_ESTIMATEDDURATIONOFSERVICE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EstimatedDurationOfService(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AvailableDiagnosticService.CIM_PROPERTY_ESTIMATEDDURATIONOFSERVICE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AvailableDiagnosticService.CIM_PROPERTY_ESTIMATEDDURATIONOFSERVICE + " could not be found");
    		
		} else if (!CIM_AvailableDiagnosticServiceHelper.isValid_EstimatedDurationOfService(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AvailableDiagnosticService.CIM_PROPERTY_ESTIMATEDDURATIONOFSERVICE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AvailableDiagnosticService.CIM_PROPERTY_ESTIMATEDDURATIONOFSERVICE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EstimatedDurationQualifier
	
	public UnsignedInt32 get_EstimatedDurationQualifier() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AvailableDiagnosticService.CIM_PROPERTY_ESTIMATEDDURATIONQUALIFIER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AvailableDiagnosticService.CIM_PROPERTY_ESTIMATEDDURATIONQUALIFIER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AvailableDiagnosticService.CIM_PROPERTY_ESTIMATEDDURATIONQUALIFIER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EstimatedDurationQualifier(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AvailableDiagnosticService.CIM_PROPERTY_ESTIMATEDDURATIONQUALIFIER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AvailableDiagnosticService.CIM_PROPERTY_ESTIMATEDDURATIONQUALIFIER + " could not be found");
    		
		} else if (!CIM_AvailableDiagnosticServiceHelper.isValid_EstimatedDurationQualifier(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AvailableDiagnosticService.CIM_PROPERTY_ESTIMATEDDURATIONQUALIFIER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AvailableDiagnosticService.CIM_PROPERTY_ESTIMATEDDURATIONQUALIFIER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_DiagnosticService
	
	public CIMObjectPath get_CIM_DiagnosticService() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AvailableDiagnosticService.CIM_PROPERTY_CIM_DIAGNOSTICSERVICE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AvailableDiagnosticService.CIM_PROPERTY_CIM_DIAGNOSTICSERVICE + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_DiagnosticService.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AvailableDiagnosticService.CIM_PROPERTY_CIM_DIAGNOSTICSERVICE + " is not of expected type CIM_DiagnosticService.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_DiagnosticService(CIM_DiagnosticService newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_AvailableDiagnosticService.CIM_PROPERTY_CIM_DIAGNOSTICSERVICE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_AvailableDiagnosticService.CIM_PROPERTY_CIM_DIAGNOSTICSERVICE + " could not be found");
    		
		} else if (!CIM_AvailableDiagnosticServiceHelper.isValid_CIM_DiagnosticService(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_AvailableDiagnosticService.CIM_PROPERTY_CIM_DIAGNOSTICSERVICE);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_DiagnosticService.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_AvailableDiagnosticService.CIM_PROPERTY_CIM_DIAGNOSTICSERVICE + " is not of expected type CIM_DiagnosticService.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_DiagnosticService.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
