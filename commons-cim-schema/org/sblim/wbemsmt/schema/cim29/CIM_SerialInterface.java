/** 
 * CIM_SerialInterface.java
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
 * Description: SerialInterface is a ControlledBy relationship indicating which Devices are accessed through the SerialController and the characteristics of this access.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_SerialInterface extends CIM_ControlledBy  {
	
	public final static String CIM_CLASS_NAME = "CIM_SerialInterface";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_PROPERTY_CIM_SERIALCONTROLLER = "Antecedent"; //$NON-NLS-1$
	
	
	/**
	*	An integer enumeration indicating the flow control (Xon-Xoff and/or RTS/CTS) for transmitted data.
	*/
	public final static String CIM_PROPERTY_FLOWCONTROLINFO = "FlowControlInfo"; //$NON-NLS-1$
	/**
	*	For the SerialInterface, NegotiatedDataWidth is the number of data bits to be transmitted, without stop bits or parity.
	*/
	public final static String CIM_PROPERTY_NEGOTIATEDDATAWIDTH = "NegotiatedDataWidth"; //$NON-NLS-1$
	/**
	*	Number of stop bits to be transmitted.
	*/
	public final static String CIM_PROPERTY_NUMBEROFSTOPBITS = "NumberOfStopBits"; //$NON-NLS-1$
	/**
	*	Information on the parity setting for transmitted data. No parity (value=1), even (2) or odd (3) can be specified.
	*/
	public final static String CIM_PROPERTY_PARITYINFO = "ParityInfo"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_FLOWCONTROLINFO);
		CIM_PropertyNameList.add(CIM_PROPERTY_NEGOTIATEDDATAWIDTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_NUMBEROFSTOPBITS);
		CIM_PropertyNameList.add(CIM_PROPERTY_PARITYINFO);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SERIALCONTROLLER);
				
		for (int i = 0; i < CIM_ControlledBy.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ControlledBy.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FLOWCONTROLINFO)||
				((String)CIM_ControlledBy.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NEGOTIATEDDATAWIDTH)||
				((String)CIM_ControlledBy.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NUMBEROFSTOPBITS)||
				((String)CIM_ControlledBy.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PARITYINFO)){
				continue;
			}
			
			CIM_SerialInterface.CIM_PropertyNameList.add(CIM_ControlledBy.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FLOWCONTROLINFO, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NEGOTIATEDDATAWIDTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NUMBEROFSTOPBITS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PARITYINFO, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SERIALCONTROLLER, new CIMValue(null, new CIMDataType(CIM_SerialController.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_ControlledBy.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ControlledBy.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FLOWCONTROLINFO)||
				((CIMProperty)CIM_ControlledBy.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NEGOTIATEDDATAWIDTH)||
				((CIMProperty)CIM_ControlledBy.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NUMBEROFSTOPBITS)||
				((CIMProperty)CIM_ControlledBy.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PARITYINFO)){
				continue;
			}
			
			CIM_SerialInterface.CIM_PropertyList.add(CIM_ControlledBy.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_ControlledBy.Java_Package_List.size(); i++) {
			if (((String)CIM_ControlledBy.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_ControlledBy.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_FLOWCONTROLINFO = {"Unknown","Not Supported","None","XonXoff","RTS/CTS","Both XonXoff and RTS/CTS"};
	public final static String[] CIM_VALUEMAP_PARITYINFO = {"Unknown","None","Even","Odd"};
	
	
	public final static int FLOWCONTROLINFO_UNKNOWN = 0;
	public final static int FLOWCONTROLINFO_NOTSUPPORTED = 1;
	public final static int FLOWCONTROLINFO_NONE = 2;
	public final static int FLOWCONTROLINFO_XONXOFF = 3;
	public final static int FLOWCONTROLINFO_RTS_CTS = 4;
	public final static int FLOWCONTROLINFO_BOTHXONXOFFANDRTS_CTS = 5;
	
	public final static int PARITYINFO_UNKNOWN = 0;
	public final static int PARITYINFO_NONE = 1;
	public final static int PARITYINFO_EVEN = 2;
	public final static int PARITYINFO_ODD = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_SerialInterface() {

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
	public CIM_SerialInterface(Vector keyProperties){ 
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
	public CIM_SerialInterface(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_SerialInterface)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_SerialInterface)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_SerialInterface)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_SerialInterface)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_SerialInterface)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_SerialInterface)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_SerialInterface)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_SerialInterface)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_SerialInterface)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_SerialInterface)object).cimObjectPath)) {
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
	
	// Attribute FlowControlInfo
	
	public UnsignedInt16 get_FlowControlInfo() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SerialInterface.CIM_PROPERTY_FLOWCONTROLINFO);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SerialInterface.CIM_PROPERTY_FLOWCONTROLINFO + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SerialInterface.CIM_PROPERTY_FLOWCONTROLINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FlowControlInfo(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SerialInterface.CIM_PROPERTY_FLOWCONTROLINFO);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SerialInterface.CIM_PROPERTY_FLOWCONTROLINFO + " could not be found");
    		
		} else if (!CIM_SerialInterfaceHelper.isValid_FlowControlInfo(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SerialInterface.CIM_PROPERTY_FLOWCONTROLINFO);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SerialInterface.CIM_PROPERTY_FLOWCONTROLINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NegotiatedDataWidth
	
	public UnsignedInt32 get_NegotiatedDataWidth() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SerialInterface.CIM_PROPERTY_NEGOTIATEDDATAWIDTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SerialInterface.CIM_PROPERTY_NEGOTIATEDDATAWIDTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SerialInterface.CIM_PROPERTY_NEGOTIATEDDATAWIDTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NegotiatedDataWidth(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SerialInterface.CIM_PROPERTY_NEGOTIATEDDATAWIDTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SerialInterface.CIM_PROPERTY_NEGOTIATEDDATAWIDTH + " could not be found");
    		
		} else if (!CIM_SerialInterfaceHelper.isValid_NegotiatedDataWidth(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SerialInterface.CIM_PROPERTY_NEGOTIATEDDATAWIDTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SerialInterface.CIM_PROPERTY_NEGOTIATEDDATAWIDTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NumberOfStopBits
	
	public UnsignedInt16 get_NumberOfStopBits() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SerialInterface.CIM_PROPERTY_NUMBEROFSTOPBITS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SerialInterface.CIM_PROPERTY_NUMBEROFSTOPBITS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SerialInterface.CIM_PROPERTY_NUMBEROFSTOPBITS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NumberOfStopBits(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SerialInterface.CIM_PROPERTY_NUMBEROFSTOPBITS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SerialInterface.CIM_PROPERTY_NUMBEROFSTOPBITS + " could not be found");
    		
		} else if (!CIM_SerialInterfaceHelper.isValid_NumberOfStopBits(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SerialInterface.CIM_PROPERTY_NUMBEROFSTOPBITS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SerialInterface.CIM_PROPERTY_NUMBEROFSTOPBITS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ParityInfo
	
	public UnsignedInt16 get_ParityInfo() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SerialInterface.CIM_PROPERTY_PARITYINFO);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SerialInterface.CIM_PROPERTY_PARITYINFO + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SerialInterface.CIM_PROPERTY_PARITYINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ParityInfo(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SerialInterface.CIM_PROPERTY_PARITYINFO);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SerialInterface.CIM_PROPERTY_PARITYINFO + " could not be found");
    		
		} else if (!CIM_SerialInterfaceHelper.isValid_ParityInfo(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SerialInterface.CIM_PROPERTY_PARITYINFO);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SerialInterface.CIM_PROPERTY_PARITYINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_SerialController
	
	public CIMObjectPath get_CIM_SerialController() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SerialInterface.CIM_PROPERTY_CIM_SERIALCONTROLLER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SerialInterface.CIM_PROPERTY_CIM_SERIALCONTROLLER + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SerialController.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SerialInterface.CIM_PROPERTY_CIM_SERIALCONTROLLER + " is not of expected type CIM_SerialController.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_SerialController(CIM_SerialController newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SerialInterface.CIM_PROPERTY_CIM_SERIALCONTROLLER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SerialInterface.CIM_PROPERTY_CIM_SERIALCONTROLLER + " could not be found");
    		
		} else if (!CIM_SerialInterfaceHelper.isValid_CIM_SerialController(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SerialInterface.CIM_PROPERTY_CIM_SERIALCONTROLLER);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SerialController.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SerialInterface.CIM_PROPERTY_CIM_SERIALCONTROLLER + " is not of expected type CIM_SerialController.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_SerialController.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
