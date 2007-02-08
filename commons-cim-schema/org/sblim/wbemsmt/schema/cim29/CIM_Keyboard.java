/** 
 * CIM_Keyboard.java
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
 * Description: Capabilities and management of the Keyboard LogicalDevice.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_Keyboard extends CIM_UserDevice  {
	
	public final static String CIM_CLASS_NAME = "CIM_Keyboard";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	A free-form string indicating the format and layout of the Keyboard.
	*/
	public final static String CIM_PROPERTY_LAYOUT = "Layout"; //$NON-NLS-1$
	/**
	*	Number of function keys on the Keyboard.
	*/
	public final static String CIM_PROPERTY_NUMBEROFFUNCTIONKEYS = "NumberOfFunctionKeys"; //$NON-NLS-1$
	/**
	*	An integer indicating whether a hardware-level password is enabled at the keyboard (value=4), preventing local input. Other values are: "Disabled" (3), "Not Implemented" (5), "Other" (1) and "Unknown" (2).
	*/
	public final static String CIM_PROPERTY_PASSWORD = "Password"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_LAYOUT);
		CIM_PropertyNameList.add(CIM_PROPERTY_NUMBEROFFUNCTIONKEYS);
		CIM_PropertyNameList.add(CIM_PROPERTY_PASSWORD);
				
		for (int i = 0; i < CIM_UserDevice.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_UserDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LAYOUT)||
				((String)CIM_UserDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NUMBEROFFUNCTIONKEYS)||
				((String)CIM_UserDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PASSWORD)){
				continue;
			}
			
			CIM_Keyboard.CIM_PropertyNameList.add(CIM_UserDevice.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LAYOUT, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NUMBEROFFUNCTIONKEYS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PASSWORD, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_UserDevice.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_UserDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LAYOUT)||
				((CIMProperty)CIM_UserDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NUMBEROFFUNCTIONKEYS)||
				((CIMProperty)CIM_UserDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PASSWORD)){
				continue;
			}
			
			CIM_Keyboard.CIM_PropertyList.add(CIM_UserDevice.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_UserDevice.Java_Package_List.size(); i++) {
			if (((String)CIM_UserDevice.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_UserDevice.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_PASSWORD = {"Other","Unknown","Disabled","Enabled","Not Implemented"};
	
	
	public final static int PASSWORD_OTHER = 1;
	public final static int PASSWORD_UNKNOWN = 2;
	public final static int PASSWORD_DISABLED = 3;
	public final static int PASSWORD_ENABLED = 4;
	public final static int PASSWORD_NOTIMPLEMENTED = 5;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_Keyboard() {

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
	public CIM_Keyboard(Vector keyProperties){ 
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
	public CIM_Keyboard(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_Keyboard)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_Keyboard)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_Keyboard)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_Keyboard)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_Keyboard)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_Keyboard)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_Keyboard)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_Keyboard)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_Keyboard)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_Keyboard)object).cimObjectPath)) {
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
	
	// Attribute Layout
	
	public String get_Layout() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Keyboard.CIM_PROPERTY_LAYOUT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Keyboard.CIM_PROPERTY_LAYOUT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Keyboard.CIM_PROPERTY_LAYOUT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Layout(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Keyboard.CIM_PROPERTY_LAYOUT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Keyboard.CIM_PROPERTY_LAYOUT + " could not be found");
    		
		} else if (!CIM_KeyboardHelper.isValid_Layout(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Keyboard.CIM_PROPERTY_LAYOUT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Keyboard.CIM_PROPERTY_LAYOUT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NumberOfFunctionKeys
	
	public UnsignedInt16 get_NumberOfFunctionKeys() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Keyboard.CIM_PROPERTY_NUMBEROFFUNCTIONKEYS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Keyboard.CIM_PROPERTY_NUMBEROFFUNCTIONKEYS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Keyboard.CIM_PROPERTY_NUMBEROFFUNCTIONKEYS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NumberOfFunctionKeys(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Keyboard.CIM_PROPERTY_NUMBEROFFUNCTIONKEYS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Keyboard.CIM_PROPERTY_NUMBEROFFUNCTIONKEYS + " could not be found");
    		
		} else if (!CIM_KeyboardHelper.isValid_NumberOfFunctionKeys(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Keyboard.CIM_PROPERTY_NUMBEROFFUNCTIONKEYS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Keyboard.CIM_PROPERTY_NUMBEROFFUNCTIONKEYS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Password
	
	public UnsignedInt16 get_Password() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Keyboard.CIM_PROPERTY_PASSWORD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Keyboard.CIM_PROPERTY_PASSWORD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Keyboard.CIM_PROPERTY_PASSWORD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Password(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Keyboard.CIM_PROPERTY_PASSWORD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Keyboard.CIM_PROPERTY_PASSWORD + " could not be found");
    		
		} else if (!CIM_KeyboardHelper.isValid_Password(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Keyboard.CIM_PROPERTY_PASSWORD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Keyboard.CIM_PROPERTY_PASSWORD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
