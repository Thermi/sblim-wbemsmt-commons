/** 
 * CIM_PolicyRuleValidityPeriod.java
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
 * Description:  The PolicyRuleValidityPeriod aggregation represents scheduled activation and
 * deactivation of a PolicyRule. If a PolicyRule is associated with multiple
 * policy time periods via this association, then the Rule is active if at least
 * one of the time periods indicates that it is active. (In other words, the
 * PolicyTimePeriodConditions are ORed to determine whether the Rule is active.)
 * A Time Period may be aggregated by multiple PolicyRules. A Rule that does not
 * point to a PolicyTimePeriodCondition via this association is, from the point
 * of view of scheduling, always active. It may, however, be inactive for other
 * reasons. For example, the Rule's Enabled property may be set to "disabled"
 * (value=2).
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
 *  The PolicyRuleValidityPeriod aggregation represents scheduled activation and
 * deactivation of a PolicyRule. If a PolicyRule is associated with multiple
 * policy time periods via this association, then the Rule is active if at least
 * one of the time periods indicates that it is active. (In other words, the
 * PolicyTimePeriodConditions are ORed to determine whether the Rule is active.)
 * A Time Period may be aggregated by multiple PolicyRules. A Rule that does not
 * point to a PolicyTimePeriodCondition via this association is, from the point
 * of view of scheduling, always active. It may, however, be inactive for other
 * reasons. For example, the Rule's Enabled property may be set to "disabled"
 * (value=2).
 */
public class CIM_PolicyRuleValidityPeriod extends CIM_PolicyComponent  {
	
	public final static String CIM_CLASS_NAME = "CIM_PolicyRuleValidityPeriod"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_PROPERTY_CIM_POLICYRULE = "GroupComponent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_POLICYTIMEPERIODCONDITION = "PartComponent"; //$NON-NLS-1$
	
	
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_POLICYRULE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_POLICYTIMEPERIODCONDITION);
				
		for (int i = 0; i < CIM_PolicyComponent.CIM_PropertyNameList.size(); i++) {
			
			CIM_PolicyRuleValidityPeriod.CIM_PropertyNameList.add(CIM_PolicyComponent.CIM_PropertyNameList.elementAt(i));
		}
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_POLICYRULE, new CIMValue(null, new CIMDataType(CIM_PolicyRule.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_POLICYTIMEPERIODCONDITION, new CIMValue(null, new CIMDataType(CIM_PolicyTimePeriodCondition.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_PolicyComponent.CIM_PropertyList.size(); i++) {
			
			CIM_PolicyRuleValidityPeriod.CIM_PropertyList.add(CIM_PolicyComponent.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_PolicyComponent.Java_Package_List.size(); i++) {
			if (((String)CIM_PolicyComponent.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
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
	public CIM_PolicyRuleValidityPeriod() {

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
	public CIM_PolicyRuleValidityPeriod(Vector keyProperties){ 
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
	public CIM_PolicyRuleValidityPeriod(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_PolicyRuleValidityPeriod)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PolicyRuleValidityPeriod)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PolicyRuleValidityPeriod)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PolicyRuleValidityPeriod)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PolicyRuleValidityPeriod)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PolicyRuleValidityPeriod)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PolicyRuleValidityPeriod)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PolicyRuleValidityPeriod)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PolicyRuleValidityPeriod)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PolicyRuleValidityPeriod)object).cimObjectPath)) {
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
	
	// Attribute CIM_PolicyRule
	
	public CIMObjectPath get_CIM_PolicyRule() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyRuleValidityPeriod.CIM_PROPERTY_CIM_POLICYRULE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyRuleValidityPeriod.CIM_PROPERTY_CIM_POLICYRULE + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PolicyRule.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyRuleValidityPeriod.CIM_PROPERTY_CIM_POLICYRULE + " is not of expected type CIM_PolicyRule.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_PolicyRule(CIM_PolicyRule newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyRuleValidityPeriod.CIM_PROPERTY_CIM_POLICYRULE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyRuleValidityPeriod.CIM_PROPERTY_CIM_POLICYRULE + " could not be found");
    		
		} else if (!CIM_PolicyRuleValidityPeriodHelper.isValid_CIM_PolicyRule(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PolicyRuleValidityPeriod.CIM_PROPERTY_CIM_POLICYRULE);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PolicyRule.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyRuleValidityPeriod.CIM_PROPERTY_CIM_POLICYRULE + " is not of expected type CIM_PolicyRule.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_PolicyRule.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_PolicyTimePeriodCondition
	
	public CIMObjectPath get_CIM_PolicyTimePeriodCondition() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyRuleValidityPeriod.CIM_PROPERTY_CIM_POLICYTIMEPERIODCONDITION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyRuleValidityPeriod.CIM_PROPERTY_CIM_POLICYTIMEPERIODCONDITION + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PolicyTimePeriodCondition.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyRuleValidityPeriod.CIM_PROPERTY_CIM_POLICYTIMEPERIODCONDITION + " is not of expected type CIM_PolicyTimePeriodCondition.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_PolicyTimePeriodCondition(CIM_PolicyTimePeriodCondition newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyRuleValidityPeriod.CIM_PROPERTY_CIM_POLICYTIMEPERIODCONDITION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyRuleValidityPeriod.CIM_PROPERTY_CIM_POLICYTIMEPERIODCONDITION + " could not be found");
    		
		} else if (!CIM_PolicyRuleValidityPeriodHelper.isValid_CIM_PolicyTimePeriodCondition(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PolicyRuleValidityPeriod.CIM_PROPERTY_CIM_POLICYTIMEPERIODCONDITION);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PolicyTimePeriodCondition.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyRuleValidityPeriod.CIM_PROPERTY_CIM_POLICYTIMEPERIODCONDITION + " is not of expected type CIM_PolicyTimePeriodCondition.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_PolicyTimePeriodCondition.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
