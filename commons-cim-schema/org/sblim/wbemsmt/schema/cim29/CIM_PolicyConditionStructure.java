/** 
 * CIM_PolicyConditionStructure.java
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
 * Description: PolicyConditions may be aggregated into rules and into compound conditions. PolicyConditionStructure is the abstract aggregation class for the structuring of policy conditions. 

The Conditions aggregated by a PolicyRule or CompoundPolicyCondition are grouped into two levels of lists: either an ORed set of ANDed sets of conditions (DNF, the default) or an ANDed set of ORed sets of conditions (CNF). Individual PolicyConditions in these lists may be negated. The property ConditionListType specifies which of these two grouping schemes applies to a particular PolicyRule or CompoundPolicyCondition instance. 

One or more PolicyTimePeriodConditions may be among the conditions associated with a PolicyRule or CompoundPolicyCondition via the PolicyConditionStructure subclass association. In this case, the time periods are simply additional Conditions to be evaluated along with any others that are specified.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_PolicyConditionStructure extends CIM_PolicyComponent  {
	
	public final static String CIM_CLASS_NAME = "CIM_PolicyConditionStructure";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_PROPERTY_CIM_POLICY = "GroupComponent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_POLICYCONDITION = "PartComponent"; //$NON-NLS-1$
	
	
	/**
	*	Indication of whether the contained PolicyCondition is negated. TRUE indicates that the PolicyCondition IS negated, FALSE indicates that it IS NOT negated.
	*/
	public final static String CIM_PROPERTY_CONDITIONNEGATED = "ConditionNegated"; //$NON-NLS-1$
	/**
	*	Unsigned integer indicating the group to which the contained PolicyCondition belongs. This integer segments the Conditions into the ANDed sets (when the ConditionListType is "DNF") or, similarly, into the ORed sets (when the ConditionListType is "CNF").
	*/
	public final static String CIM_PROPERTY_GROUPNUMBER = "GroupNumber"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CONDITIONNEGATED);
		CIM_PropertyNameList.add(CIM_PROPERTY_GROUPNUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_POLICY);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_POLICYCONDITION);
				
		for (int i = 0; i < CIM_PolicyComponent.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_PolicyComponent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CONDITIONNEGATED)||
				((String)CIM_PolicyComponent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_GROUPNUMBER)){
				continue;
			}
			
			CIM_PolicyConditionStructure.CIM_PropertyNameList.add(CIM_PolicyComponent.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CONDITIONNEGATED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_GROUPNUMBER, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_POLICY, new CIMValue(null, new CIMDataType(CIM_Policy.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_POLICYCONDITION, new CIMValue(null, new CIMDataType(CIM_PolicyCondition.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_PolicyComponent.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_PolicyComponent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CONDITIONNEGATED)||
				((CIMProperty)CIM_PolicyComponent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_GROUPNUMBER)){
				continue;
			}
			
			CIM_PolicyConditionStructure.CIM_PropertyList.add(CIM_PolicyComponent.CIM_PropertyList.elementAt(i));
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
	public CIM_PolicyConditionStructure() {

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
	public CIM_PolicyConditionStructure(Vector keyProperties){ 
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
	public CIM_PolicyConditionStructure(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_PolicyConditionStructure)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PolicyConditionStructure)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PolicyConditionStructure)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PolicyConditionStructure)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PolicyConditionStructure)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PolicyConditionStructure)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PolicyConditionStructure)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PolicyConditionStructure)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PolicyConditionStructure)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PolicyConditionStructure)object).cimObjectPath)) {
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
	
	// Attribute ConditionNegated
	
	public Boolean get_ConditionNegated() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyConditionStructure.CIM_PROPERTY_CONDITIONNEGATED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyConditionStructure.CIM_PROPERTY_CONDITIONNEGATED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyConditionStructure.CIM_PROPERTY_CONDITIONNEGATED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ConditionNegated(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyConditionStructure.CIM_PROPERTY_CONDITIONNEGATED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyConditionStructure.CIM_PROPERTY_CONDITIONNEGATED + " could not be found");
    		
		} else if (!CIM_PolicyConditionStructureHelper.isValid_ConditionNegated(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PolicyConditionStructure.CIM_PROPERTY_CONDITIONNEGATED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyConditionStructure.CIM_PROPERTY_CONDITIONNEGATED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute GroupNumber
	
	public UnsignedInt16 get_GroupNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyConditionStructure.CIM_PROPERTY_GROUPNUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyConditionStructure.CIM_PROPERTY_GROUPNUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyConditionStructure.CIM_PROPERTY_GROUPNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_GroupNumber(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyConditionStructure.CIM_PROPERTY_GROUPNUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyConditionStructure.CIM_PROPERTY_GROUPNUMBER + " could not be found");
    		
		} else if (!CIM_PolicyConditionStructureHelper.isValid_GroupNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PolicyConditionStructure.CIM_PROPERTY_GROUPNUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyConditionStructure.CIM_PROPERTY_GROUPNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_Policy
	
	public CIMObjectPath get_CIM_Policy() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyConditionStructure.CIM_PROPERTY_CIM_POLICY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyConditionStructure.CIM_PROPERTY_CIM_POLICY + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Policy.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyConditionStructure.CIM_PROPERTY_CIM_POLICY + " is not of expected type CIM_Policy.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_Policy(CIM_Policy newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyConditionStructure.CIM_PROPERTY_CIM_POLICY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyConditionStructure.CIM_PROPERTY_CIM_POLICY + " could not be found");
    		
		} else if (!CIM_PolicyConditionStructureHelper.isValid_CIM_Policy(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PolicyConditionStructure.CIM_PROPERTY_CIM_POLICY);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Policy.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyConditionStructure.CIM_PROPERTY_CIM_POLICY + " is not of expected type CIM_Policy.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_Policy.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_PolicyCondition
	
	public CIMObjectPath get_CIM_PolicyCondition() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyConditionStructure.CIM_PROPERTY_CIM_POLICYCONDITION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyConditionStructure.CIM_PROPERTY_CIM_POLICYCONDITION + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PolicyCondition.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyConditionStructure.CIM_PROPERTY_CIM_POLICYCONDITION + " is not of expected type CIM_PolicyCondition.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_PolicyCondition(CIM_PolicyCondition newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyConditionStructure.CIM_PROPERTY_CIM_POLICYCONDITION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyConditionStructure.CIM_PROPERTY_CIM_POLICYCONDITION + " could not be found");
    		
		} else if (!CIM_PolicyConditionStructureHelper.isValid_CIM_PolicyCondition(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PolicyConditionStructure.CIM_PROPERTY_CIM_POLICYCONDITION);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PolicyCondition.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyConditionStructure.CIM_PROPERTY_CIM_POLICYCONDITION + " is not of expected type CIM_PolicyCondition.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_PolicyCondition.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
