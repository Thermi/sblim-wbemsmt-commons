/** 
 * CIM_Confederation.java
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
 * Description: The BGP speakers in an AS are required to be fully meshed. This can lead to a huge number of TCP connections per router. One way to reduce the peering requirements is to use a confederation. A confederation effectively partitions one AS into a group of 'sub-ASs'. This enables all of the benefits of IBGP to be applied inside the confederation, while enabling EBGP to be run between each confederation. It also enables certain BGP attribute values to be preserved between confederations. However, to the outside world, the AS with its confederations appear to be a single AS.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_Confederation extends CIM_SystemComponent  {
	
	public final static String CIM_CLASS_NAME = "CIM_Confederation";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM_1 = "GroupComponent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM_2 = "PartComponent"; //$NON-NLS-1$
	
	
	/**
	*	A unique identifier of the Confederation within the AutonomousSystem.
	*/
	public final static String CIM_PROPERTY_CHILDASNUMBER = "ChildASNumber"; //$NON-NLS-1$
	/**
	*	A unique identifier of the AutonomousSystem that contains the confederations.
	*/
	public final static String CIM_PROPERTY_PARENTASNUMBER = "ParentASNumber"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CHILDASNUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_PARENTASNUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM_1);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM_2);
				
		for (int i = 0; i < CIM_SystemComponent.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SystemComponent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CHILDASNUMBER)||
				((String)CIM_SystemComponent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PARENTASNUMBER)){
				continue;
			}
			
			CIM_Confederation.CIM_PropertyNameList.add(CIM_SystemComponent.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CHILDASNUMBER, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PARENTASNUMBER, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM_1, new CIMValue(null, new CIMDataType(CIM_AutonomousSystem.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM_2, new CIMValue(null, new CIMDataType(CIM_AutonomousSystem.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_SystemComponent.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SystemComponent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CHILDASNUMBER)||
				((CIMProperty)CIM_SystemComponent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PARENTASNUMBER)){
				continue;
			}
			
			CIM_Confederation.CIM_PropertyList.add(CIM_SystemComponent.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_SystemComponent.Java_Package_List.size(); i++) {
			if (((String)CIM_SystemComponent.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_SystemComponent.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_Confederation() {

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
	public CIM_Confederation(Vector keyProperties){ 
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
	public CIM_Confederation(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_Confederation)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_Confederation)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_Confederation)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_Confederation)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_Confederation)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_Confederation)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_Confederation)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_Confederation)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_Confederation)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_Confederation)object).cimObjectPath)) {
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
	
	// Attribute ChildASNumber
	
	public UnsignedInt32 get_ChildASNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Confederation.CIM_PROPERTY_CHILDASNUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Confederation.CIM_PROPERTY_CHILDASNUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Confederation.CIM_PROPERTY_CHILDASNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ChildASNumber(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Confederation.CIM_PROPERTY_CHILDASNUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Confederation.CIM_PROPERTY_CHILDASNUMBER + " could not be found");
    		
		} else if (!CIM_ConfederationHelper.isValid_ChildASNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Confederation.CIM_PROPERTY_CHILDASNUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Confederation.CIM_PROPERTY_CHILDASNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ParentASNumber
	
	public UnsignedInt32 get_ParentASNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Confederation.CIM_PROPERTY_PARENTASNUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Confederation.CIM_PROPERTY_PARENTASNUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Confederation.CIM_PROPERTY_PARENTASNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ParentASNumber(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Confederation.CIM_PROPERTY_PARENTASNUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Confederation.CIM_PROPERTY_PARENTASNUMBER + " could not be found");
    		
		} else if (!CIM_ConfederationHelper.isValid_ParentASNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Confederation.CIM_PROPERTY_PARENTASNUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Confederation.CIM_PROPERTY_PARENTASNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_AutonomousSystem_1
	
	public CIMObjectPath get_CIM_AutonomousSystem_1() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Confederation.CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM_1);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Confederation.CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM_1 + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_AutonomousSystem.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Confederation.CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM_1 + " is not of expected type CIM_AutonomousSystem.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_AutonomousSystem_1(CIM_AutonomousSystem newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Confederation.CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM_1);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Confederation.CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM_1 + " could not be found");
    		
		} else if (!CIM_ConfederationHelper.isValid_CIM_AutonomousSystem_1(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Confederation.CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM_1);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_AutonomousSystem.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Confederation.CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM_1 + " is not of expected type CIM_AutonomousSystem.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_AutonomousSystem.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_AutonomousSystem_2
	
	public CIMObjectPath get_CIM_AutonomousSystem_2() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Confederation.CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM_2);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Confederation.CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM_2 + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_AutonomousSystem.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Confederation.CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM_2 + " is not of expected type CIM_AutonomousSystem.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_AutonomousSystem_2(CIM_AutonomousSystem newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Confederation.CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM_2);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Confederation.CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM_2 + " could not be found");
    		
		} else if (!CIM_ConfederationHelper.isValid_CIM_AutonomousSystem_2(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Confederation.CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM_2);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_AutonomousSystem.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Confederation.CIM_PROPERTY_CIM_AUTONOMOUSSYSTEM_2 + " is not of expected type CIM_AutonomousSystem.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_AutonomousSystem.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
