/** 
 * CIM_PolicySetValidityPeriod.java
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
 * Description: The PolicySetValidityPeriod aggregation represents scheduled activation and deactivation of a PolicySet. A PolicySet is considered "active" if it is both "Enabled" and in a valid time period. 

If a PolicySet is associated with multiple policy time periods via this association, then the Set is in a valid time period if at least one of the time periods evaluates to TRUE. If a PolicySet is contained in another PolicySet via the PolicySetComponent aggregation (e.g., a PolicyRule in a PolicyGroup), then the contained PolicySet (e.g., PolicyRule) is in a valid period if at least one of the aggregate's PolicyTimePeriodCondition instances evaluates to TRUE and at least one of its own PolicyTimePeriodCondition instances also evalutes to TRUE. (In other words, the PolicyTimePeriodConditions are ORed to determine whether the PolicySet is in a valid time period and then ANDed with the ORed PolicyTimePeriodConditions of each of PolicySet instances in the PolicySetComponent hierarchy to determine if the PolicySet is in a valid time period and, if also "Enabled", therefore, active, i.e., the hierachy ANDs the ORed PolicyTimePeriodConditions of the elements of the hierarchy. 

A Time Period may be aggregated by multiple PolicySets. A Set that does not point to a PolicyTimePeriodCondition via this association, from the point of view of scheduling, is always in a valid time period.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_PolicySetValidityPeriod extends CIM_PolicyComponent  {
	
	public final static String CIM_CLASS_NAME = "CIM_PolicySetValidityPeriod";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_PROPERTY_CIM_POLICYSET = "GroupComponent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_POLICYTIMEPERIODCONDITION = "PartComponent"; //$NON-NLS-1$
	
	
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_POLICYSET);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_POLICYTIMEPERIODCONDITION);
				
		for (int i = 0; i < CIM_PolicyComponent.CIM_PropertyNameList.size(); i++) {
			
			CIM_PolicySetValidityPeriod.CIM_PropertyNameList.add(CIM_PolicyComponent.CIM_PropertyNameList.elementAt(i));
		}
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_POLICYSET, new CIMValue(null, new CIMDataType(CIM_PolicySet.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_POLICYTIMEPERIODCONDITION, new CIMValue(null, new CIMDataType(CIM_PolicyTimePeriodCondition.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_PolicyComponent.CIM_PropertyList.size(); i++) {
			
			CIM_PolicySetValidityPeriod.CIM_PropertyList.add(CIM_PolicyComponent.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_PolicyComponent.Java_Package_List.size(); i++) {
			if (((String)CIM_PolicyComponent.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_PolicyComponent.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PolicySetValidityPeriod() {

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
	public CIM_PolicySetValidityPeriod(Vector keyProperties){ 
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
	public CIM_PolicySetValidityPeriod(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_PolicySetValidityPeriod)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PolicySetValidityPeriod)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PolicySetValidityPeriod)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PolicySetValidityPeriod)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PolicySetValidityPeriod)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PolicySetValidityPeriod)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PolicySetValidityPeriod)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PolicySetValidityPeriod)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PolicySetValidityPeriod)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PolicySetValidityPeriod)object).cimObjectPath)) {
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
	
	// Attribute CIM_PolicySet
	
	public CIMObjectPath get_CIM_PolicySet() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicySetValidityPeriod.CIM_PROPERTY_CIM_POLICYSET);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicySetValidityPeriod.CIM_PROPERTY_CIM_POLICYSET + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PolicySet.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicySetValidityPeriod.CIM_PROPERTY_CIM_POLICYSET + " is not of expected type CIM_PolicySet.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_PolicySet(CIM_PolicySet newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicySetValidityPeriod.CIM_PROPERTY_CIM_POLICYSET);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicySetValidityPeriod.CIM_PROPERTY_CIM_POLICYSET + " could not be found");
    		
		} else if (!CIM_PolicySetValidityPeriodHelper.isValid_CIM_PolicySet(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PolicySetValidityPeriod.CIM_PROPERTY_CIM_POLICYSET);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PolicySet.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicySetValidityPeriod.CIM_PROPERTY_CIM_POLICYSET + " is not of expected type CIM_PolicySet.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_PolicySet.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_PolicyTimePeriodCondition
	
	public CIMObjectPath get_CIM_PolicyTimePeriodCondition() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicySetValidityPeriod.CIM_PROPERTY_CIM_POLICYTIMEPERIODCONDITION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicySetValidityPeriod.CIM_PROPERTY_CIM_POLICYTIMEPERIODCONDITION + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PolicyTimePeriodCondition.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicySetValidityPeriod.CIM_PROPERTY_CIM_POLICYTIMEPERIODCONDITION + " is not of expected type CIM_PolicyTimePeriodCondition.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_PolicyTimePeriodCondition(CIM_PolicyTimePeriodCondition newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicySetValidityPeriod.CIM_PROPERTY_CIM_POLICYTIMEPERIODCONDITION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicySetValidityPeriod.CIM_PROPERTY_CIM_POLICYTIMEPERIODCONDITION + " could not be found");
    		
		} else if (!CIM_PolicySetValidityPeriodHelper.isValid_CIM_PolicyTimePeriodCondition(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PolicySetValidityPeriod.CIM_PROPERTY_CIM_POLICYTIMEPERIODCONDITION);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PolicyTimePeriodCondition.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicySetValidityPeriod.CIM_PROPERTY_CIM_POLICYTIMEPERIODCONDITION + " is not of expected type CIM_PolicyTimePeriodCondition.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_PolicyTimePeriodCondition.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
