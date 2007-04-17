/** 
 * CIM_ProcessOfJob.java
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
 * Description:  ProcessOfJob describes that the referenced Process is the result of the
 * execution of the Job. A Job may cause multiple Processes to run, perhaps on
 * different operating systems. This is allowed by the '*' cardinality of the
 * Process reference. Note that a Process can result from only one Job - hence,
 * the '0..1' cardinality on Job.
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
 *  ProcessOfJob describes that the referenced Process is the result of the
 * execution of the Job. A Job may cause multiple Processes to run, perhaps on
 * different operating systems. This is allowed by the '*' cardinality of the
 * Process reference. Note that a Process can result from only one Job - hence,
 * the '0..1' cardinality on Job.
 */
public class CIM_ProcessOfJob extends CIM_Component  {
	
	public final static String CIM_CLASS_NAME = "CIM_ProcessOfJob"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_PROPERTY_CIM_JOB = "GroupComponent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_PROCESS = "PartComponent"; //$NON-NLS-1$
	
	
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_JOB);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_PROCESS);
				
		for (int i = 0; i < CIM_Component.CIM_PropertyNameList.size(); i++) {
			
			CIM_ProcessOfJob.CIM_PropertyNameList.add(CIM_Component.CIM_PropertyNameList.elementAt(i));
		}
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_JOB, new CIMValue(null, new CIMDataType(CIM_Job.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_PROCESS, new CIMValue(null, new CIMDataType(CIM_Process.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_Component.CIM_PropertyList.size(); i++) {
			
			CIM_ProcessOfJob.CIM_PropertyList.add(CIM_Component.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_Component.Java_Package_List.size(); i++) {
			if (((String)CIM_Component.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_Component.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ProcessOfJob() {

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
	public CIM_ProcessOfJob(Vector keyProperties){ 
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
	public CIM_ProcessOfJob(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_ProcessOfJob)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ProcessOfJob)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ProcessOfJob)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ProcessOfJob)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ProcessOfJob)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ProcessOfJob)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ProcessOfJob)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ProcessOfJob)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ProcessOfJob)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ProcessOfJob)object).cimObjectPath)) {
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
	
	// Attribute CIM_Job
	
	public CIMObjectPath get_CIM_Job() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProcessOfJob.CIM_PROPERTY_CIM_JOB);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProcessOfJob.CIM_PROPERTY_CIM_JOB + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Job.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProcessOfJob.CIM_PROPERTY_CIM_JOB + " is not of expected type CIM_Job.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_Job(CIM_Job newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProcessOfJob.CIM_PROPERTY_CIM_JOB);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProcessOfJob.CIM_PROPERTY_CIM_JOB + " could not be found");
    		
		} else if (!CIM_ProcessOfJobHelper.isValid_CIM_Job(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProcessOfJob.CIM_PROPERTY_CIM_JOB);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Job.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProcessOfJob.CIM_PROPERTY_CIM_JOB + " is not of expected type CIM_Job.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_Job.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_Process
	
	public CIMObjectPath get_CIM_Process() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProcessOfJob.CIM_PROPERTY_CIM_PROCESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProcessOfJob.CIM_PROPERTY_CIM_PROCESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Process.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProcessOfJob.CIM_PROPERTY_CIM_PROCESS + " is not of expected type CIM_Process.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_Process(CIM_Process newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProcessOfJob.CIM_PROPERTY_CIM_PROCESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProcessOfJob.CIM_PROPERTY_CIM_PROCESS + " could not be found");
    		
		} else if (!CIM_ProcessOfJobHelper.isValid_CIM_Process(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProcessOfJob.CIM_PROPERTY_CIM_PROCESS);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Process.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProcessOfJob.CIM_PROPERTY_CIM_PROCESS + " is not of expected type CIM_Process.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_Process.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}