/** 
 * CIM_SCSIController.java
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
 * Description:  Note: The use of this class is deprecated in lieu of SCSIProtocolController.
 * The latter reflects the protocol- related issues of SCSI interfaces, because
 * these are not bus master-type Controllers." Deprecated description:
 * Capabilities and management of the SCSIController.
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
import org.sblim.wbem.cim.UnsignedInt32;
import org.sblim.wbem.cim.UnsignedInt64;


/**
 *  Note: The use of this class is deprecated in lieu of SCSIProtocolController.
 * The latter reflects the protocol- related issues of SCSI interfaces, because
 * these are not bus master-type Controllers." Deprecated description:
 * Capabilities and management of the SCSIController.
 */
public class CIM_SCSIController extends CIM_Controller  {
	
	public final static String CIM_CLASS_NAME = "CIM_SCSIController"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.10.0";
	
	
	/**
	*	Note: The use of this method is deprecated. 
Deprecated description: Number of SCSIController timeouts that have occurred since the TimeOfLastReset.
	*/
	public final static String CIM_PROPERTY_CONTROLLERTIMEOUTS = "ControllerTimeouts"; //$NON-NLS-1$
	/**
	*	Note: The use of this method is deprecated. 
Deprecated description: Maximum data width (in bits) supported by the SCSIController.
	*/
	public final static String CIM_PROPERTY_MAXDATAWIDTH = "MaxDataWidth"; //$NON-NLS-1$
	/**
	*	Note: The use of this method is deprecated. 
Deprecated description: Maximum transfer rate (in Bits per Second) supported by the SCSIController.
	*/
	public final static String CIM_PROPERTY_MAXTRANSFERRATE = "MaxTransferRate"; //$NON-NLS-1$
	/**
	*	Note: The use of this method is deprecated. 
Deprecated description: An integer enumeration that indicates whether or not the SCSIController provides redundancy or protection against device failures.
	*/
	public final static String CIM_PROPERTY_PROTECTIONMANAGEMENT = "ProtectionManagement"; //$NON-NLS-1$
	/**
	*	Note: The use of this method is deprecated. 
Deprecated description: Signal capabilities that can be supported by the SCSIController. For example, the Controller can support "Single Ended" and "Differential". In this case, the values 3 and 4 would be written to the Signal Capabilities array.
	*/
	public final static String CIM_PROPERTY_SIGNALCAPABILITIES = "SignalCapabilities"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CONTROLLERTIMEOUTS);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXDATAWIDTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXTRANSFERRATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROTECTIONMANAGEMENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_SIGNALCAPABILITIES);
				
		for (int i = 0; i < CIM_Controller.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CONTROLLERTIMEOUTS)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXDATAWIDTH)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXTRANSFERRATE)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROTECTIONMANAGEMENT)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SIGNALCAPABILITIES)){
				continue;
			}
			
			CIM_SCSIController.CIM_PropertyNameList.add(CIM_Controller.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CONTROLLERTIMEOUTS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXDATAWIDTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXTRANSFERRATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROTECTIONMANAGEMENT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SIGNALCAPABILITIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
				
		for (int i = 0; i < CIM_Controller.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CONTROLLERTIMEOUTS)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXDATAWIDTH)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXTRANSFERRATE)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROTECTIONMANAGEMENT)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SIGNALCAPABILITIES)){
				continue;
			}
			
			CIM_SCSIController.CIM_PropertyList.add(CIM_Controller.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_Controller.Java_Package_List.size(); i++) {
			if (((String)CIM_Controller.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_Controller.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_PROTECTIONMANAGEMENT = {"Other","Unknown","Unprotected","Protected","Protected through SCC (SCSI-3 Controller Command)","Protected through SCC-2 (SCSI-3 Controller Command)"};
	public final static String[] CIM_VALUEMAP_SIGNALCAPABILITIES = {"Other","Unknown","Single Ended","Differential","Low Voltage Differential","Optical"};
	
	
	public final static int PROTECTIONMANAGEMENT_OTHER = 1;
	public final static int PROTECTIONMANAGEMENT_UNKNOWN = 2;
	public final static int PROTECTIONMANAGEMENT_UNPROTECTED = 3;
	public final static int PROTECTIONMANAGEMENT_PROTECTED = 4;
	public final static int PROTECTIONMANAGEMENT_PROTECTEDTHROUGHSCCSCSI_3CONTROLLERCOMMAND = 5;
	public final static int PROTECTIONMANAGEMENT_PROTECTEDTHROUGHSCC_2SCSI_3CONTROLLERCOMMAND = 6;
	
	public final static int SIGNALCAPABILITIES_OTHER = 1;
	public final static int SIGNALCAPABILITIES_UNKNOWN = 2;
	public final static int SIGNALCAPABILITIES_SINGLEENDED = 3;
	public final static int SIGNALCAPABILITIES_DIFFERENTIAL = 4;
	public final static int SIGNALCAPABILITIES_LOWVOLTAGEDIFFERENTIAL = 5;
	public final static int SIGNALCAPABILITIES_OPTICAL = 6;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_SCSIController() {

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
	public CIM_SCSIController(Vector keyProperties){ 
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
	public CIM_SCSIController(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_SCSIController)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_SCSIController)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_SCSIController)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_SCSIController)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_SCSIController)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_SCSIController)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_SCSIController)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_SCSIController)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_SCSIController)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_SCSIController)object).cimObjectPath)) {
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
	
	// Attribute ControllerTimeouts
	
	public UnsignedInt32 get_ControllerTimeouts() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIController.CIM_PROPERTY_CONTROLLERTIMEOUTS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIController.CIM_PROPERTY_CONTROLLERTIMEOUTS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIController.CIM_PROPERTY_CONTROLLERTIMEOUTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ControllerTimeouts(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIController.CIM_PROPERTY_CONTROLLERTIMEOUTS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIController.CIM_PROPERTY_CONTROLLERTIMEOUTS + " could not be found");
    		
		} else if (!CIM_SCSIControllerHelper.isValid_ControllerTimeouts(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SCSIController.CIM_PROPERTY_CONTROLLERTIMEOUTS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIController.CIM_PROPERTY_CONTROLLERTIMEOUTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxDataWidth
	
	public UnsignedInt32 get_MaxDataWidth() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIController.CIM_PROPERTY_MAXDATAWIDTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIController.CIM_PROPERTY_MAXDATAWIDTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIController.CIM_PROPERTY_MAXDATAWIDTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxDataWidth(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIController.CIM_PROPERTY_MAXDATAWIDTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIController.CIM_PROPERTY_MAXDATAWIDTH + " could not be found");
    		
		} else if (!CIM_SCSIControllerHelper.isValid_MaxDataWidth(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SCSIController.CIM_PROPERTY_MAXDATAWIDTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIController.CIM_PROPERTY_MAXDATAWIDTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxTransferRate
	
	public UnsignedInt64 get_MaxTransferRate() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIController.CIM_PROPERTY_MAXTRANSFERRATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIController.CIM_PROPERTY_MAXTRANSFERRATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIController.CIM_PROPERTY_MAXTRANSFERRATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxTransferRate(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIController.CIM_PROPERTY_MAXTRANSFERRATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIController.CIM_PROPERTY_MAXTRANSFERRATE + " could not be found");
    		
		} else if (!CIM_SCSIControllerHelper.isValid_MaxTransferRate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SCSIController.CIM_PROPERTY_MAXTRANSFERRATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIController.CIM_PROPERTY_MAXTRANSFERRATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProtectionManagement
	
	public UnsignedInt16 get_ProtectionManagement() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIController.CIM_PROPERTY_PROTECTIONMANAGEMENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIController.CIM_PROPERTY_PROTECTIONMANAGEMENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIController.CIM_PROPERTY_PROTECTIONMANAGEMENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProtectionManagement(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIController.CIM_PROPERTY_PROTECTIONMANAGEMENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIController.CIM_PROPERTY_PROTECTIONMANAGEMENT + " could not be found");
    		
		} else if (!CIM_SCSIControllerHelper.isValid_ProtectionManagement(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SCSIController.CIM_PROPERTY_PROTECTIONMANAGEMENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIController.CIM_PROPERTY_PROTECTIONMANAGEMENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SignalCapabilities
	
	public UnsignedInt16[] get_SignalCapabilities() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIController.CIM_PROPERTY_SIGNALCAPABILITIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIController.CIM_PROPERTY_SIGNALCAPABILITIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIController.CIM_PROPERTY_SIGNALCAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		UnsignedInt16[] resultArray = new UnsignedInt16[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (UnsignedInt16)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_SignalCapabilities(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIController.CIM_PROPERTY_SIGNALCAPABILITIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIController.CIM_PROPERTY_SIGNALCAPABILITIES + " could not be found");
    		
		} else if (!CIM_SCSIControllerHelper.isValid_SignalCapabilities(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SCSIController.CIM_PROPERTY_SIGNALCAPABILITIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIController.CIM_PROPERTY_SIGNALCAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
