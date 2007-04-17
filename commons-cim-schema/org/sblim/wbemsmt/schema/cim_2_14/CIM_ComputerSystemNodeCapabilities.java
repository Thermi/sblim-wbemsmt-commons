/** 
 * CIM_ComputerSystemNodeCapabilities.java
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
 * Description:  Indicates general capabilities of a ComputerSystem node, such as the ability to
 * support a battery (and be portable), and ECC memory. To tie these
 * capabilities to a ComputerSystem instance, the ElementCapabilities
 * association is used.
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
import org.sblim.wbem.cim.UnsignedInt16;


/**
 *  Indicates general capabilities of a ComputerSystem node, such as the ability to
 * support a battery (and be portable), and ECC memory. To tie these
 * capabilities to a ComputerSystem instance, the ElementCapabilities
 * association is used.
 */
public class CIM_ComputerSystemNodeCapabilities extends CIM_Capabilities  {
	
	public final static String CIM_CLASS_NAME = "CIM_ComputerSystemNodeCapabilities"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.2";
	
	
	/**
	*	Enumeration indicating whether a battery is installable/ supportable on this System. This is independent of whether one is currently installed. The latter is indicated by an instance of the CIM_Battery class associated using the SystemDevice relationship.
	*/
	public final static String CIM_PROPERTY_BATTERYSUPPORTED = "BatterySupported"; //$NON-NLS-1$
	/**
	*	Enumeration indicating whether ECC single or multi-bit memory is supported on this node. This is independent of whether ECC memory is actually installed. The latter is indicated by an instance of CIM_PhysicalMemory that 'Realizes' the CIM_Memory of the System (associated using SystemDevice).
	*/
	public final static String CIM_PROPERTY_ECCSUPPORTED = "ECCSupported"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_BATTERYSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_ECCSUPPORTED);
				
		for (int i = 0; i < CIM_Capabilities.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BATTERYSUPPORTED)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ECCSUPPORTED)){
				continue;
			}
			
			CIM_ComputerSystemNodeCapabilities.CIM_PropertyNameList.add(CIM_Capabilities.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BATTERYSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ECCSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_Capabilities.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BATTERYSUPPORTED)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ECCSUPPORTED)){
				continue;
			}
			
			CIM_ComputerSystemNodeCapabilities.CIM_PropertyList.add(CIM_Capabilities.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_Capabilities.Java_Package_List.size(); i++) {
			if (((String)CIM_Capabilities.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_Capabilities.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_BATTERYSUPPORTED = {"Unknown","Battery Supported","Battery Not Supported"};
	public final static String[] CIM_VALUEMAP_ECCSUPPORTED = {"Unknown","Single-bit ECC","Multi-bit ECC"};
	
	
	public final static int BATTERYSUPPORTED_UNKNOWN = 0;
	public final static int BATTERYSUPPORTED_BATTERYSUPPORTED = 2;
	public final static int BATTERYSUPPORTED_BATTERYNOTSUPPORTED = 3;
	
	public final static int ECCSUPPORTED_UNKNOWN = 0;
	public final static int ECCSUPPORTED_SINGLE_BITECC = 2;
	public final static int ECCSUPPORTED_MULTI_BITECC = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ComputerSystemNodeCapabilities() {

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
	public CIM_ComputerSystemNodeCapabilities(Vector keyProperties){ 
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
	public CIM_ComputerSystemNodeCapabilities(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_BatterySupported = this.cimInstance.getProperty(CIM_PROPERTY_BATTERYSUPPORTED);
		
		if (CIMProperty_BatterySupported == null || CIMProperty_BatterySupported.getValue().isEmpty() || CIMProperty_BatterySupported.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_BATTERYSUPPORTED, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_ECCSupported = this.cimInstance.getProperty(CIM_PROPERTY_ECCSUPPORTED);
		
		if (CIMProperty_ECCSupported == null || CIMProperty_ECCSupported.getValue().isEmpty() || CIMProperty_ECCSupported.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_ECCSUPPORTED, "Required"});
			result = false;
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
	    
	    if (!(object instanceof CIM_ComputerSystemNodeCapabilities)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ComputerSystemNodeCapabilities)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ComputerSystemNodeCapabilities)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ComputerSystemNodeCapabilities)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ComputerSystemNodeCapabilities)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ComputerSystemNodeCapabilities)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ComputerSystemNodeCapabilities)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ComputerSystemNodeCapabilities)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ComputerSystemNodeCapabilities)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ComputerSystemNodeCapabilities)object).cimObjectPath)) {
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
	
	// Attribute BatterySupported
	
	public UnsignedInt16 get_BatterySupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ComputerSystemNodeCapabilities.CIM_PROPERTY_BATTERYSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ComputerSystemNodeCapabilities.CIM_PROPERTY_BATTERYSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ComputerSystemNodeCapabilities.CIM_PROPERTY_BATTERYSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BatterySupported(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ComputerSystemNodeCapabilities.CIM_PROPERTY_BATTERYSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ComputerSystemNodeCapabilities.CIM_PROPERTY_BATTERYSUPPORTED + " could not be found");
    		
		} else if (!CIM_ComputerSystemNodeCapabilitiesHelper.isValid_BatterySupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ComputerSystemNodeCapabilities.CIM_PROPERTY_BATTERYSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ComputerSystemNodeCapabilities.CIM_PROPERTY_BATTERYSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ECCSupported
	
	public UnsignedInt16 get_ECCSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ComputerSystemNodeCapabilities.CIM_PROPERTY_ECCSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ComputerSystemNodeCapabilities.CIM_PROPERTY_ECCSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ComputerSystemNodeCapabilities.CIM_PROPERTY_ECCSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ECCSupported(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ComputerSystemNodeCapabilities.CIM_PROPERTY_ECCSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ComputerSystemNodeCapabilities.CIM_PROPERTY_ECCSUPPORTED + " could not be found");
    		
		} else if (!CIM_ComputerSystemNodeCapabilitiesHelper.isValid_ECCSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ComputerSystemNodeCapabilities.CIM_PROPERTY_ECCSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ComputerSystemNodeCapabilities.CIM_PROPERTY_ECCSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}