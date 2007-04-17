/** 
 * CIM_ServiceServiceDependency.java
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
 * Description:  CIM_ServiceServiceDependency is an association between a Service and another
 * Service, which indicates that the latter is required to be present, required
 * to have completed, or must be absent for the former Service to provide its
 * functionality. For example, Boot Services might be dependent upon underlying
 * system initialization Services. In the case of the initialization Services,
 * the Boot Service might be dependent on the completion of the init Services.
 * When examining the ServiceServiceDependency class definition, note that its
 * superclass ProvidesServiceToElement is deprecated. Unfortunately,
 * ProvidesServiceToElement cannot be removed from the object hierarchy without
 * a major Schema release. When or if a major release occurs, the
 * ProvidesServiceToElement superclass will be removed, and
 * ServiceServiceDependency will subclass from CIM_Dependency directly.
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
import org.sblim.wbem.cim.UnsignedInt16;


/**
 *  CIM_ServiceServiceDependency is an association between a Service and another
 * Service, which indicates that the latter is required to be present, required
 * to have completed, or must be absent for the former Service to provide its
 * functionality. For example, Boot Services might be dependent upon underlying
 * system initialization Services. In the case of the initialization Services,
 * the Boot Service might be dependent on the completion of the init Services.
 * When examining the ServiceServiceDependency class definition, note that its
 * superclass ProvidesServiceToElement is deprecated. Unfortunately,
 * ProvidesServiceToElement cannot be removed from the object hierarchy without
 * a major Schema release. When or if a major release occurs, the
 * ProvidesServiceToElement superclass will be removed, and
 * ServiceServiceDependency will subclass from CIM_Dependency directly.
 */
public class CIM_ServiceServiceDependency extends CIM_ProvidesServiceToElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_ServiceServiceDependency"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.10.0";
	public final static String CIM_PROPERTY_CIM_SERVICE_1 = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_SERVICE_2 = "Dependent"; //$NON-NLS-1$
	
	
	/**
	*	This property describes that the Antecedent Service must be restarted after the Dependent operation is complete.
	*/
	public final static String CIM_PROPERTY_RESTARTSERVICE = "RestartService"; //$NON-NLS-1$
	/**
	*	The nature of the Service-to-Service dependency. This property describes that the associated Service must have completed (value=2), must be started (value=3) or must not be started (value=4) for the Service to function.
	*/
	public final static String CIM_PROPERTY_TYPEOFDEPENDENCY = "TypeOfDependency"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_RESTARTSERVICE);
		CIM_PropertyNameList.add(CIM_PROPERTY_TYPEOFDEPENDENCY);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SERVICE_1);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SERVICE_2);
				
		for (int i = 0; i < CIM_ProvidesServiceToElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ProvidesServiceToElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RESTARTSERVICE)||
				((String)CIM_ProvidesServiceToElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TYPEOFDEPENDENCY)){
				continue;
			}
			
			CIM_ServiceServiceDependency.CIM_PropertyNameList.add(CIM_ProvidesServiceToElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RESTARTSERVICE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TYPEOFDEPENDENCY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SERVICE_1, new CIMValue(null, new CIMDataType(CIM_Service.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SERVICE_2, new CIMValue(null, new CIMDataType(CIM_Service.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_ProvidesServiceToElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ProvidesServiceToElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RESTARTSERVICE)||
				((CIMProperty)CIM_ProvidesServiceToElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TYPEOFDEPENDENCY)){
				continue;
			}
			
			CIM_ServiceServiceDependency.CIM_PropertyList.add(CIM_ProvidesServiceToElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_ProvidesServiceToElement.Java_Package_List.size(); i++) {
			if (((String)CIM_ProvidesServiceToElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_ProvidesServiceToElement.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_TYPEOFDEPENDENCY = {"Unknown","Other","Service Must Have Completed","Service Must Be Started","Service Must Not Be Started"};
	
	
	public final static int TYPEOFDEPENDENCY_UNKNOWN = 0;
	public final static int TYPEOFDEPENDENCY_OTHER = 1;
	public final static int TYPEOFDEPENDENCY_SERVICEMUSTHAVECOMPLETED = 2;
	public final static int TYPEOFDEPENDENCY_SERVICEMUSTBESTARTED = 3;
	public final static int TYPEOFDEPENDENCY_SERVICEMUSTNOTBESTARTED = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ServiceServiceDependency() {

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
	public CIM_ServiceServiceDependency(Vector keyProperties){ 
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
	public CIM_ServiceServiceDependency(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_ServiceServiceDependency)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ServiceServiceDependency)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ServiceServiceDependency)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ServiceServiceDependency)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ServiceServiceDependency)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ServiceServiceDependency)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ServiceServiceDependency)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ServiceServiceDependency)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ServiceServiceDependency)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ServiceServiceDependency)object).cimObjectPath)) {
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
	
	// Attribute RestartService
	
	public Boolean get_RestartService() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceServiceDependency.CIM_PROPERTY_RESTARTSERVICE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceServiceDependency.CIM_PROPERTY_RESTARTSERVICE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceServiceDependency.CIM_PROPERTY_RESTARTSERVICE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RestartService(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceServiceDependency.CIM_PROPERTY_RESTARTSERVICE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceServiceDependency.CIM_PROPERTY_RESTARTSERVICE + " could not be found");
    		
		} else if (!CIM_ServiceServiceDependencyHelper.isValid_RestartService(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ServiceServiceDependency.CIM_PROPERTY_RESTARTSERVICE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceServiceDependency.CIM_PROPERTY_RESTARTSERVICE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TypeOfDependency
	
	public UnsignedInt16 get_TypeOfDependency() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceServiceDependency.CIM_PROPERTY_TYPEOFDEPENDENCY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceServiceDependency.CIM_PROPERTY_TYPEOFDEPENDENCY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceServiceDependency.CIM_PROPERTY_TYPEOFDEPENDENCY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TypeOfDependency(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceServiceDependency.CIM_PROPERTY_TYPEOFDEPENDENCY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceServiceDependency.CIM_PROPERTY_TYPEOFDEPENDENCY + " could not be found");
    		
		} else if (!CIM_ServiceServiceDependencyHelper.isValid_TypeOfDependency(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ServiceServiceDependency.CIM_PROPERTY_TYPEOFDEPENDENCY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceServiceDependency.CIM_PROPERTY_TYPEOFDEPENDENCY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_Service_1
	
	public CIMObjectPath get_CIM_Service_1() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceServiceDependency.CIM_PROPERTY_CIM_SERVICE_1);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceServiceDependency.CIM_PROPERTY_CIM_SERVICE_1 + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Service.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceServiceDependency.CIM_PROPERTY_CIM_SERVICE_1 + " is not of expected type CIM_Service.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_Service_1(CIM_Service newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceServiceDependency.CIM_PROPERTY_CIM_SERVICE_1);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceServiceDependency.CIM_PROPERTY_CIM_SERVICE_1 + " could not be found");
    		
		} else if (!CIM_ServiceServiceDependencyHelper.isValid_CIM_Service_1(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ServiceServiceDependency.CIM_PROPERTY_CIM_SERVICE_1);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Service.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceServiceDependency.CIM_PROPERTY_CIM_SERVICE_1 + " is not of expected type CIM_Service.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_Service.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_Service_2
	
	public CIMObjectPath get_CIM_Service_2() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceServiceDependency.CIM_PROPERTY_CIM_SERVICE_2);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceServiceDependency.CIM_PROPERTY_CIM_SERVICE_2 + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Service.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceServiceDependency.CIM_PROPERTY_CIM_SERVICE_2 + " is not of expected type CIM_Service.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_Service_2(CIM_Service newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceServiceDependency.CIM_PROPERTY_CIM_SERVICE_2);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceServiceDependency.CIM_PROPERTY_CIM_SERVICE_2 + " could not be found");
    		
		} else if (!CIM_ServiceServiceDependencyHelper.isValid_CIM_Service_2(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ServiceServiceDependency.CIM_PROPERTY_CIM_SERVICE_2);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Service.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceServiceDependency.CIM_PROPERTY_CIM_SERVICE_2 + " is not of expected type CIM_Service.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_Service.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
