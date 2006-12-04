/** 
 * CIM_PolicyActionStructure.java
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
 * Description: PolicyActions may be aggregated into rules and into compound actions. PolicyActionStructure is the abstract aggregation class for the structuring of policy actions.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_PolicyActionStructure extends CIM_PolicyComponent  {
	
	public final static String CIM_CLASS_NAME = "CIM_PolicyActionStructure";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_PROPERTY_CIM_POLICY = "GroupComponent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_POLICYACTION = "PartComponent"; //$NON-NLS-1$
	
	
	/**
	*	ActionOrder is an unsigned integer 'n' that indicates the relative position of a PolicyAction in the sequence of actions associated with a PolicyRule or CompoundPolicyAction. When 'n' is a positive integer, it indicates a place in the sequence of actions to be performed, with smaller integers indicating earlier positions in the sequence. The special value '0' indicates 'don't care'. If two or more PolicyActions have the same non-zero sequence number, they may be performed in any order, but they must all be performed at the appropriate place in the overall action sequence. 

A series of examples will make ordering of PolicyActions clearer: 
o If all actions have the same sequence number, regardless of whether it is '0' or non-zero, any order is acceptable. 
o The values: 
1:ACTION A 
2:ACTION B 
1:ACTION C 
3:ACTION D 
indicate two acceptable orders: A,C,B,D or C,A,B,D, 
since A and C can be performed in either order, but only at the '1' position. 
o The values: 
0:ACTION A 
2:ACTION B 
3:ACTION C 
3:ACTION D 
require that B,C, and D occur either as B,C,D or as B,D,C. Action A may appear at any point relative to B, C, and D. Thus the complete set of acceptable orders is: A,B,C,D; B,A,C,D; B,C,A,D; B,C,D,A; A,B,D,C; B,A,D,C; B,D,A,C; B,D,C,A. 

Note that the non-zero sequence numbers need not start with '1', and they need not be consecutive. All that matters is their relative magnitude.
	*/
	public final static String CIM_PROPERTY_ACTIONORDER = "ActionOrder"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ACTIONORDER);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_POLICY);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_POLICYACTION);
				
		for (int i = 0; i < CIM_PolicyComponent.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_PolicyComponent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACTIONORDER)){
				continue;
			}
			
			CIM_PolicyActionStructure.CIM_PropertyNameList.add(CIM_PolicyComponent.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACTIONORDER, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_POLICY, new CIMValue(null, new CIMDataType(CIM_Policy.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_POLICYACTION, new CIMValue(null, new CIMDataType(CIM_PolicyAction.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_PolicyComponent.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_PolicyComponent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACTIONORDER)){
				continue;
			}
			
			CIM_PolicyActionStructure.CIM_PropertyList.add(CIM_PolicyComponent.CIM_PropertyList.elementAt(i));
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
	public CIM_PolicyActionStructure() {

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
	public CIM_PolicyActionStructure(Vector keyProperties){ 
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
	public CIM_PolicyActionStructure(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_PolicyActionStructure)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PolicyActionStructure)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PolicyActionStructure)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PolicyActionStructure)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PolicyActionStructure)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PolicyActionStructure)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PolicyActionStructure)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PolicyActionStructure)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PolicyActionStructure)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PolicyActionStructure)object).cimObjectPath)) {
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
	
	// Attribute ActionOrder
	
	public UnsignedInt16 get_ActionOrder() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyActionStructure.CIM_PROPERTY_ACTIONORDER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyActionStructure.CIM_PROPERTY_ACTIONORDER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyActionStructure.CIM_PROPERTY_ACTIONORDER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ActionOrder(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyActionStructure.CIM_PROPERTY_ACTIONORDER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyActionStructure.CIM_PROPERTY_ACTIONORDER + " could not be found");
    		
		} else if (!CIM_PolicyActionStructureHelper.isValid_ActionOrder(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PolicyActionStructure.CIM_PROPERTY_ACTIONORDER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyActionStructure.CIM_PROPERTY_ACTIONORDER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_Policy
	
	public CIMObjectPath get_CIM_Policy() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyActionStructure.CIM_PROPERTY_CIM_POLICY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyActionStructure.CIM_PROPERTY_CIM_POLICY + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Policy.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyActionStructure.CIM_PROPERTY_CIM_POLICY + " is not of expected type CIM_Policy.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_Policy(CIM_Policy newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyActionStructure.CIM_PROPERTY_CIM_POLICY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyActionStructure.CIM_PROPERTY_CIM_POLICY + " could not be found");
    		
		} else if (!CIM_PolicyActionStructureHelper.isValid_CIM_Policy(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PolicyActionStructure.CIM_PROPERTY_CIM_POLICY);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Policy.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyActionStructure.CIM_PROPERTY_CIM_POLICY + " is not of expected type CIM_Policy.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_Policy.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_PolicyAction
	
	public CIMObjectPath get_CIM_PolicyAction() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyActionStructure.CIM_PROPERTY_CIM_POLICYACTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyActionStructure.CIM_PROPERTY_CIM_POLICYACTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PolicyAction.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyActionStructure.CIM_PROPERTY_CIM_POLICYACTION + " is not of expected type CIM_PolicyAction.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_PolicyAction(CIM_PolicyAction newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyActionStructure.CIM_PROPERTY_CIM_POLICYACTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyActionStructure.CIM_PROPERTY_CIM_POLICYACTION + " could not be found");
    		
		} else if (!CIM_PolicyActionStructureHelper.isValid_CIM_PolicyAction(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PolicyActionStructure.CIM_PROPERTY_CIM_POLICYACTION);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PolicyAction.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyActionStructure.CIM_PROPERTY_CIM_POLICYACTION + " is not of expected type CIM_PolicyAction.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_PolicyAction.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
