/** 
 * PRS_ServiceResolutionSolution.java
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
 * Description: Associates PRS_ServiceIncident to PRS_Solution to describe the Resolutions proposed by the Service Provider.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class PRS_ServiceResolutionSolution extends CIM_Dependency  {
	
	public final static String CIM_CLASS_NAME = "PRS_ServiceResolutionSolution";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_PROPERTY_PRS_SERVICEINCIDENT = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_PRS_SOLUTION = "Dependent"; //$NON-NLS-1$
	
	
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_PRS_SERVICEINCIDENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRS_SOLUTION);
				
		for (int i = 0; i < CIM_Dependency.CIM_PropertyNameList.size(); i++) {
			
			PRS_ServiceResolutionSolution.CIM_PropertyNameList.add(CIM_Dependency.CIM_PropertyNameList.elementAt(i));
		}
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRS_SERVICEINCIDENT, new CIMValue(null, new CIMDataType(PRS_ServiceIncident.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRS_SOLUTION, new CIMValue(null, new CIMDataType(PRS_Solution.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_Dependency.CIM_PropertyList.size(); i++) {
			
			PRS_ServiceResolutionSolution.CIM_PropertyList.add(CIM_Dependency.CIM_PropertyList.elementAt(i));
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
	public PRS_ServiceResolutionSolution() {

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
	public PRS_ServiceResolutionSolution(Vector keyProperties){ 
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
	public PRS_ServiceResolutionSolution(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof PRS_ServiceResolutionSolution)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((PRS_ServiceResolutionSolution)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((PRS_ServiceResolutionSolution)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((PRS_ServiceResolutionSolution)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((PRS_ServiceResolutionSolution)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((PRS_ServiceResolutionSolution)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((PRS_ServiceResolutionSolution)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((PRS_ServiceResolutionSolution)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((PRS_ServiceResolutionSolution)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((PRS_ServiceResolutionSolution)object).cimObjectPath)) {
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
	
	// Attribute PRS_ServiceIncident
	
	public CIMObjectPath get_PRS_ServiceIncident() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_ServiceResolutionSolution.CIM_PROPERTY_PRS_SERVICEINCIDENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceResolutionSolution.CIM_PROPERTY_PRS_SERVICEINCIDENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(PRS_ServiceIncident.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceResolutionSolution.CIM_PROPERTY_PRS_SERVICEINCIDENT + " is not of expected type PRS_ServiceIncident.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PRS_ServiceIncident(PRS_ServiceIncident newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_ServiceResolutionSolution.CIM_PROPERTY_PRS_SERVICEINCIDENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceResolutionSolution.CIM_PROPERTY_PRS_SERVICEINCIDENT + " could not be found");
    		
		} else if (!PRS_ServiceResolutionSolutionHelper.isValid_PRS_ServiceIncident(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_ServiceResolutionSolution.CIM_PROPERTY_PRS_SERVICEINCIDENT);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(PRS_ServiceIncident.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceResolutionSolution.CIM_PROPERTY_PRS_SERVICEINCIDENT + " is not of expected type PRS_ServiceIncident.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(PRS_ServiceIncident.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PRS_Solution
	
	public CIMObjectPath get_PRS_Solution() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_ServiceResolutionSolution.CIM_PROPERTY_PRS_SOLUTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceResolutionSolution.CIM_PROPERTY_PRS_SOLUTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(PRS_Solution.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceResolutionSolution.CIM_PROPERTY_PRS_SOLUTION + " is not of expected type PRS_Solution.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PRS_Solution(PRS_Solution newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_ServiceResolutionSolution.CIM_PROPERTY_PRS_SOLUTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_ServiceResolutionSolution.CIM_PROPERTY_PRS_SOLUTION + " could not be found");
    		
		} else if (!PRS_ServiceResolutionSolutionHelper.isValid_PRS_Solution(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_ServiceResolutionSolution.CIM_PROPERTY_PRS_SOLUTION);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(PRS_Solution.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_ServiceResolutionSolution.CIM_PROPERTY_PRS_SOLUTION + " is not of expected type PRS_Solution.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(PRS_Solution.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
