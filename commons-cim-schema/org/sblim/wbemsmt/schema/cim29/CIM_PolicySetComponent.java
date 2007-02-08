/** 
 * CIM_PolicySetComponent.java
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
 * Description: PolicySetComponent is a concrete aggregation that collects instances of the subclasses of PolicySet (i.e., PolicyGroups and PolicyRules). Instances are collected in sets that use the same decision strategy. They are prioritized relative to each other, within the set, using the Priority property of this aggregation. 

Together, the PolicySet.PolicyDecisionStrategy and PolicySet Component.Priority properties determine the processing for the groups and rules contained in a PolicySet. A larger priority value represents a higher priority. Note that the Priority property MUST have a unique value when compared with others defined for the same aggregating PolicySet. Thus, the evaluation of rules within a set is deterministically specified.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_PolicySetComponent extends CIM_PolicyComponent  {
	
	public final static String CIM_CLASS_NAME = "CIM_PolicySetComponent";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_PROPERTY_CIM_POLICYSET_1 = "GroupComponent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_POLICYSET_2 = "PartComponent"; //$NON-NLS-1$
	
	
	/**
	*	A non-negative integer for prioritizing this PolicySet component relative to other elements of the same PolicySet. A larger value indicates a higher priority. The Priority property MUST have a unique value when compared with others defined for the same aggregating PolicySet.
	*/
	public final static String CIM_PROPERTY_PRIORITY = "Priority"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_PRIORITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_POLICYSET_1);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_POLICYSET_2);
				
		for (int i = 0; i < CIM_PolicyComponent.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_PolicyComponent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRIORITY)){
				continue;
			}
			
			CIM_PolicySetComponent.CIM_PropertyNameList.add(CIM_PolicyComponent.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRIORITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_POLICYSET_1, new CIMValue(null, new CIMDataType(CIM_PolicySet.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_POLICYSET_2, new CIMValue(null, new CIMDataType(CIM_PolicySet.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_PolicyComponent.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_PolicyComponent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRIORITY)){
				continue;
			}
			
			CIM_PolicySetComponent.CIM_PropertyList.add(CIM_PolicyComponent.CIM_PropertyList.elementAt(i));
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
	public CIM_PolicySetComponent() {

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
	public CIM_PolicySetComponent(Vector keyProperties){ 
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
	public CIM_PolicySetComponent(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_PolicySetComponent)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PolicySetComponent)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PolicySetComponent)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PolicySetComponent)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PolicySetComponent)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PolicySetComponent)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PolicySetComponent)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PolicySetComponent)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PolicySetComponent)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PolicySetComponent)object).cimObjectPath)) {
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
	
	// Attribute Priority
	
	public UnsignedInt16 get_Priority() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicySetComponent.CIM_PROPERTY_PRIORITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicySetComponent.CIM_PROPERTY_PRIORITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicySetComponent.CIM_PROPERTY_PRIORITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Priority(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicySetComponent.CIM_PROPERTY_PRIORITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicySetComponent.CIM_PROPERTY_PRIORITY + " could not be found");
    		
		} else if (!CIM_PolicySetComponentHelper.isValid_Priority(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PolicySetComponent.CIM_PROPERTY_PRIORITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicySetComponent.CIM_PROPERTY_PRIORITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_PolicySet_1
	
	public CIMObjectPath get_CIM_PolicySet_1() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicySetComponent.CIM_PROPERTY_CIM_POLICYSET_1);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicySetComponent.CIM_PROPERTY_CIM_POLICYSET_1 + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PolicySet.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicySetComponent.CIM_PROPERTY_CIM_POLICYSET_1 + " is not of expected type CIM_PolicySet.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_PolicySet_1(CIM_PolicySet newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicySetComponent.CIM_PROPERTY_CIM_POLICYSET_1);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicySetComponent.CIM_PROPERTY_CIM_POLICYSET_1 + " could not be found");
    		
		} else if (!CIM_PolicySetComponentHelper.isValid_CIM_PolicySet_1(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PolicySetComponent.CIM_PROPERTY_CIM_POLICYSET_1);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PolicySet.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicySetComponent.CIM_PROPERTY_CIM_POLICYSET_1 + " is not of expected type CIM_PolicySet.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_PolicySet.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_PolicySet_2
	
	public CIMObjectPath get_CIM_PolicySet_2() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicySetComponent.CIM_PROPERTY_CIM_POLICYSET_2);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicySetComponent.CIM_PROPERTY_CIM_POLICYSET_2 + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PolicySet.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicySetComponent.CIM_PROPERTY_CIM_POLICYSET_2 + " is not of expected type CIM_PolicySet.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_PolicySet_2(CIM_PolicySet newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicySetComponent.CIM_PROPERTY_CIM_POLICYSET_2);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicySetComponent.CIM_PROPERTY_CIM_POLICYSET_2 + " could not be found");
    		
		} else if (!CIM_PolicySetComponentHelper.isValid_CIM_PolicySet_2(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PolicySetComponent.CIM_PROPERTY_CIM_POLICYSET_2);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_PolicySet.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicySetComponent.CIM_PROPERTY_CIM_POLICYSET_2 + " is not of expected type CIM_PolicySet.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_PolicySet.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
