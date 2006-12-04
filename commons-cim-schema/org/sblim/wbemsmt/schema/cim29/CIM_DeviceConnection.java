/** 
 * CIM_DeviceConnection.java
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
 * Description: The DeviceConnection relationship indicates that two or more Device are connected together.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_DeviceConnection extends CIM_Dependency  {
	
	public final static String CIM_CLASS_NAME = "CIM_DeviceConnection";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_PROPERTY_CIM_LOGICALDEVICE_1 = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_LOGICALDEVICE_2 = "Dependent"; //$NON-NLS-1$
	
	
	/**
	*	When several bus and/or connection data widths are possible, the NegotiatedDataWidth property defines the one in use between the Devices. Data width is specified in bits. If data width is not negotiated, or if this information is not available/important to Device management, the property should be set to 0.
	*/
	public final static String CIM_PROPERTY_NEGOTIATEDDATAWIDTH = "NegotiatedDataWidth"; //$NON-NLS-1$
	/**
	*	When several bus and/or connection speeds are possible, the NegotiatedSpeed property defines the one in use between the Devices. Speed is specified in bits per second. If connection or bus speeds are not negotiated, or if this information is not available/important to Device management, the property should be set to 0.
	*/
	public final static String CIM_PROPERTY_NEGOTIATEDSPEED = "NegotiatedSpeed"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_NEGOTIATEDDATAWIDTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_NEGOTIATEDSPEED);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_LOGICALDEVICE_1);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_LOGICALDEVICE_2);
				
		for (int i = 0; i < CIM_Dependency.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Dependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NEGOTIATEDDATAWIDTH)||
				((String)CIM_Dependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NEGOTIATEDSPEED)){
				continue;
			}
			
			CIM_DeviceConnection.CIM_PropertyNameList.add(CIM_Dependency.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NEGOTIATEDDATAWIDTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NEGOTIATEDSPEED, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_LOGICALDEVICE_1, new CIMValue(null, new CIMDataType(CIM_LogicalDevice.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_LOGICALDEVICE_2, new CIMValue(null, new CIMDataType(CIM_LogicalDevice.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_Dependency.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Dependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NEGOTIATEDDATAWIDTH)||
				((CIMProperty)CIM_Dependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NEGOTIATEDSPEED)){
				continue;
			}
			
			CIM_DeviceConnection.CIM_PropertyList.add(CIM_Dependency.CIM_PropertyList.elementAt(i));
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
	public CIM_DeviceConnection() {

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
	public CIM_DeviceConnection(Vector keyProperties){ 
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
	public CIM_DeviceConnection(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_DeviceConnection)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_DeviceConnection)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_DeviceConnection)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_DeviceConnection)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_DeviceConnection)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_DeviceConnection)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_DeviceConnection)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_DeviceConnection)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_DeviceConnection)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_DeviceConnection)object).cimObjectPath)) {
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
	
	// Attribute NegotiatedDataWidth
	
	public UnsignedInt32 get_NegotiatedDataWidth() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceConnection.CIM_PROPERTY_NEGOTIATEDDATAWIDTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceConnection.CIM_PROPERTY_NEGOTIATEDDATAWIDTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceConnection.CIM_PROPERTY_NEGOTIATEDDATAWIDTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NegotiatedDataWidth(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceConnection.CIM_PROPERTY_NEGOTIATEDDATAWIDTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceConnection.CIM_PROPERTY_NEGOTIATEDDATAWIDTH + " could not be found");
    		
		} else if (!CIM_DeviceConnectionHelper.isValid_NegotiatedDataWidth(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceConnection.CIM_PROPERTY_NEGOTIATEDDATAWIDTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceConnection.CIM_PROPERTY_NEGOTIATEDDATAWIDTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NegotiatedSpeed
	
	public UnsignedInt64 get_NegotiatedSpeed() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceConnection.CIM_PROPERTY_NEGOTIATEDSPEED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceConnection.CIM_PROPERTY_NEGOTIATEDSPEED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceConnection.CIM_PROPERTY_NEGOTIATEDSPEED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NegotiatedSpeed(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceConnection.CIM_PROPERTY_NEGOTIATEDSPEED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceConnection.CIM_PROPERTY_NEGOTIATEDSPEED + " could not be found");
    		
		} else if (!CIM_DeviceConnectionHelper.isValid_NegotiatedSpeed(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceConnection.CIM_PROPERTY_NEGOTIATEDSPEED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceConnection.CIM_PROPERTY_NEGOTIATEDSPEED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_LogicalDevice_1
	
	public CIMObjectPath get_CIM_LogicalDevice_1() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceConnection.CIM_PROPERTY_CIM_LOGICALDEVICE_1);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceConnection.CIM_PROPERTY_CIM_LOGICALDEVICE_1 + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_LogicalDevice.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceConnection.CIM_PROPERTY_CIM_LOGICALDEVICE_1 + " is not of expected type CIM_LogicalDevice.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_LogicalDevice_1(CIM_LogicalDevice newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceConnection.CIM_PROPERTY_CIM_LOGICALDEVICE_1);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceConnection.CIM_PROPERTY_CIM_LOGICALDEVICE_1 + " could not be found");
    		
		} else if (!CIM_DeviceConnectionHelper.isValid_CIM_LogicalDevice_1(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceConnection.CIM_PROPERTY_CIM_LOGICALDEVICE_1);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_LogicalDevice.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceConnection.CIM_PROPERTY_CIM_LOGICALDEVICE_1 + " is not of expected type CIM_LogicalDevice.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_LogicalDevice.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_LogicalDevice_2
	
	public CIMObjectPath get_CIM_LogicalDevice_2() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceConnection.CIM_PROPERTY_CIM_LOGICALDEVICE_2);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceConnection.CIM_PROPERTY_CIM_LOGICALDEVICE_2 + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_LogicalDevice.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceConnection.CIM_PROPERTY_CIM_LOGICALDEVICE_2 + " is not of expected type CIM_LogicalDevice.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_LogicalDevice_2(CIM_LogicalDevice newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceConnection.CIM_PROPERTY_CIM_LOGICALDEVICE_2);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceConnection.CIM_PROPERTY_CIM_LOGICALDEVICE_2 + " could not be found");
    		
		} else if (!CIM_DeviceConnectionHelper.isValid_CIM_LogicalDevice_2(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceConnection.CIM_PROPERTY_CIM_LOGICALDEVICE_2);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_LogicalDevice.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceConnection.CIM_PROPERTY_CIM_LOGICALDEVICE_2 + " is not of expected type CIM_LogicalDevice.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_LogicalDevice.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
