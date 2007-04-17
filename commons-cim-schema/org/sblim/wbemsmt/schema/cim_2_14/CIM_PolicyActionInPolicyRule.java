/** 
 * CIM_PolicyActionInPolicyRule.java
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
 * Description:  A PolicyRule aggregates zero or more instances of the PolicyAction class, via
 * the PolicyActionInPolicyRule association. A Rule that aggregates zero Actions
 * is not valid--it may, however, be in the process of being entered into a
 * PolicyRepository or being defined for a System. Alternately, the actions of
 * the policy may be explicit in the definition of the PolicyRule. Note that a
 * PolicyRule should have no effect until it is valid. The Actions associated
 * with a PolicyRule may be given a required order, a recommended order, or no
 * order at all. For Actions represented as separate objects, the
 * PolicyActionInPolicyRule aggregation can be used to express an order. This
 * aggregation does not indicate whether a specified action order is required,
 * recommended, or of no significance; the property SequencedActions in the
 * aggregating instance of PolicyRule provides this indication.
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
 *  A PolicyRule aggregates zero or more instances of the PolicyAction class, via
 * the PolicyActionInPolicyRule association. A Rule that aggregates zero Actions
 * is not valid--it may, however, be in the process of being entered into a
 * PolicyRepository or being defined for a System. Alternately, the actions of
 * the policy may be explicit in the definition of the PolicyRule. Note that a
 * PolicyRule should have no effect until it is valid. The Actions associated
 * with a PolicyRule may be given a required order, a recommended order, or no
 * order at all. For Actions represented as separate objects, the
 * PolicyActionInPolicyRule aggregation can be used to express an order. This
 * aggregation does not indicate whether a specified action order is required,
 * recommended, or of no significance; the property SequencedActions in the
 * aggregating instance of PolicyRule provides this indication.
 */
public class CIM_PolicyActionInPolicyRule extends CIM_PolicyActionStructure  {
	
	public final static String CIM_CLASS_NAME = "CIM_PolicyActionInPolicyRule"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_PROPERTY_CIM_POLICYRULE = "GroupComponent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_POLICYACTION = "PartComponent"; //$NON-NLS-1$
	
	
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_POLICYRULE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_POLICYACTION);
				
		for (int i = 0; i < CIM_PolicyActionStructure.CIM_PropertyNameList.size(); i++) {
			
			CIM_PolicyActionInPolicyRule.CIM_PropertyNameList.add(CIM_PolicyActionStructure.CIM_PropertyNameList.elementAt(i));
		}
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_POLICYRULE, new CIMValue(null, new CIMDataType(CIM_PolicyRule.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_POLICYACTION, new CIMValue(null, new CIMDataType(CIM_PolicyAction.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_PolicyActionStructure.CIM_PropertyList.size(); i++) {
			
			CIM_PolicyActionInPolicyRule.CIM_PropertyList.add(CIM_PolicyActionStructure.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_PolicyActionStructure.Java_Package_List.size(); i++) {
			if (((String)CIM_PolicyActionStructure.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_PolicyActionStructure.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PolicyActionInPolicyRule() {

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
	public CIM_PolicyActionInPolicyRule(Vector keyProperties){ 
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
	public CIM_PolicyActionInPolicyRule(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_PolicyActionInPolicyRule)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PolicyActionInPolicyRule)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PolicyActionInPolicyRule)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PolicyActionInPolicyRule)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PolicyActionInPolicyRule)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PolicyActionInPolicyRule)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PolicyActionInPolicyRule)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PolicyActionInPolicyRule)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PolicyActionInPolicyRule)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PolicyActionInPolicyRule)object).cimObjectPath)) {
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
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyActionInPolicyRule.CIM_PROPERTY_CIM_POLICYRULE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyActionInPolicyRule.CIM_PROPERTY_CIM_POLICYRULE + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PolicyRule.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyActionInPolicyRule.CIM_PROPERTY_CIM_POLICYRULE + " is not of expected type CIM_PolicyRule.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_PolicyRule(CIM_PolicyRule newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyActionInPolicyRule.CIM_PROPERTY_CIM_POLICYRULE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyActionInPolicyRule.CIM_PROPERTY_CIM_POLICYRULE + " could not be found");
    		
		} else if (!CIM_PolicyActionInPolicyRuleHelper.isValid_CIM_PolicyRule(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PolicyActionInPolicyRule.CIM_PROPERTY_CIM_POLICYRULE);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PolicyRule.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyActionInPolicyRule.CIM_PROPERTY_CIM_POLICYRULE + " is not of expected type CIM_PolicyRule.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_PolicyRule.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_PolicyAction
	
	public CIMObjectPath get_CIM_PolicyAction() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyActionInPolicyRule.CIM_PROPERTY_CIM_POLICYACTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyActionInPolicyRule.CIM_PROPERTY_CIM_POLICYACTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PolicyAction.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyActionInPolicyRule.CIM_PROPERTY_CIM_POLICYACTION + " is not of expected type CIM_PolicyAction.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_PolicyAction(CIM_PolicyAction newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyActionInPolicyRule.CIM_PROPERTY_CIM_POLICYACTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyActionInPolicyRule.CIM_PROPERTY_CIM_POLICYACTION + " could not be found");
    		
		} else if (!CIM_PolicyActionInPolicyRuleHelper.isValid_CIM_PolicyAction(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PolicyActionInPolicyRule.CIM_PROPERTY_CIM_POLICYACTION);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PolicyAction.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyActionInPolicyRule.CIM_PROPERTY_CIM_POLICYACTION + " is not of expected type CIM_PolicyAction.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_PolicyAction.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
