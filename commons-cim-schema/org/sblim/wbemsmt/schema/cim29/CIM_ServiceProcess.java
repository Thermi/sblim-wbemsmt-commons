/** 
 * CIM_ServiceProcess.java
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
 * Description:  CIM_ServiceProcess is an association used to establish relationships between
 * Services and Processes. It is used to indicate if a Service is running in a
 * particular Process. It is also used to indicate, via the ExecutionType
 * property, if the Service started and is wholly responsible for the Process,
 * or if the Service is running in an existing Process, perhaps with other
 * unrelated Services, which is owned or started by a different entity. This
 * association relates a Service with an externally visible system signature.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


/**
 *  CIM_ServiceProcess is an association used to establish relationships between
 * Services and Processes. It is used to indicate if a Service is running in a
 * particular Process. It is also used to indicate, via the ExecutionType
 * property, if the Service started and is wholly responsible for the Process,
 * or if the Service is running in an existing Process, perhaps with other
 * unrelated Services, which is owned or started by a different entity. This
 * association relates a Service with an externally visible system signature.
 */
public class CIM_ServiceProcess  {
	
	protected CIMInstance cimInstance			= new CIMInstance();
	protected CIMInstance original_cimInstance	= null;
	protected CIMObjectPath cimObjectPath		= null; 
	
	public final static String CIM_CLASS_NAME = "CIM_ServiceProcess"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_PROPERTY_CIM_SERVICE = "Service"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_PROCESS = "Process"; //$NON-NLS-1$
	
	
	/**
	*	Enumeration indicating how the Service runs in the context of, or owns the Process. "Unknown" indicates that the ExecutionType is not known. "Other" indicates that the ExecutionType does not match any of the values in the ExecutionType enumeration. "Executes in Existing Process" indicates that the Service is hosted in a Process that already exists in the system. The lifecycle of the Service is separate from that of the Process. "Exeutes as Independent Process" indicates that the Service is responsible for the lifecycle of the Process. When the Service is started, the Process is created. For example, ServletEngines can run "InProcess" within the existing Apache processes or "OutOfProcess" in its own servlet engine process. In this case the Apache process would communicate with the servlet engine process based on the content of the request. The association may be many to many.
	*/
	public final static String CIM_PROPERTY_EXECUTIONTYPE = "ExecutionType"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_EXECUTIONTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SERVICE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_PROCESS);
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EXECUTIONTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SERVICE, new CIMValue(null, new CIMDataType(CIM_Service.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_PROCESS, new CIMValue(null, new CIMDataType(CIM_Process.CIM_CLASS_NAME))));
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
		};
			
	public final static String[] CIM_VALUEMAP_EXECUTIONTYPE = {"Unknown","Other","Executes in Existing Process","Executes as Independent Process"};
	
	
	public final static int EXECUTIONTYPE_UNKNOWN = 0;
	public final static int EXECUTIONTYPE_OTHER = 1;
	public final static int EXECUTIONTYPE_EXECUTESINEXISTINGPROCESS = 2;
	public final static int EXECUTIONTYPE_EXECUTESASINDEPENDENTPROCESS = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ServiceProcess() {

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
	public CIM_ServiceProcess(Vector keyProperties){ 
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
	public CIM_ServiceProcess(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_ServiceProcess)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ServiceProcess)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ServiceProcess)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ServiceProcess)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ServiceProcess)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ServiceProcess)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ServiceProcess)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ServiceProcess)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ServiceProcess)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ServiceProcess)object).cimObjectPath)) {
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
	
	// Attribute ExecutionType
	
	public UnsignedInt16 get_ExecutionType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceProcess.CIM_PROPERTY_EXECUTIONTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceProcess.CIM_PROPERTY_EXECUTIONTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceProcess.CIM_PROPERTY_EXECUTIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ExecutionType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceProcess.CIM_PROPERTY_EXECUTIONTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceProcess.CIM_PROPERTY_EXECUTIONTYPE + " could not be found");
    		
		} else if (!CIM_ServiceProcessHelper.isValid_ExecutionType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ServiceProcess.CIM_PROPERTY_EXECUTIONTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceProcess.CIM_PROPERTY_EXECUTIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_Service
	
	public CIMObjectPath get_CIM_Service() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceProcess.CIM_PROPERTY_CIM_SERVICE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceProcess.CIM_PROPERTY_CIM_SERVICE + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Service.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceProcess.CIM_PROPERTY_CIM_SERVICE + " is not of expected type CIM_Service.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_Service(CIM_Service newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceProcess.CIM_PROPERTY_CIM_SERVICE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceProcess.CIM_PROPERTY_CIM_SERVICE + " could not be found");
    		
		} else if (!CIM_ServiceProcessHelper.isValid_CIM_Service(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ServiceProcess.CIM_PROPERTY_CIM_SERVICE);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Service.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceProcess.CIM_PROPERTY_CIM_SERVICE + " is not of expected type CIM_Service.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_Service.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_Process
	
	public CIMObjectPath get_CIM_Process() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceProcess.CIM_PROPERTY_CIM_PROCESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceProcess.CIM_PROPERTY_CIM_PROCESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Process.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceProcess.CIM_PROPERTY_CIM_PROCESS + " is not of expected type CIM_Process.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_Process(CIM_Process newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceProcess.CIM_PROPERTY_CIM_PROCESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceProcess.CIM_PROPERTY_CIM_PROCESS + " could not be found");
    		
		} else if (!CIM_ServiceProcessHelper.isValid_CIM_Process(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ServiceProcess.CIM_PROPERTY_CIM_PROCESS);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Process.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceProcess.CIM_PROPERTY_CIM_PROCESS + " is not of expected type CIM_Process.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_Process.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
