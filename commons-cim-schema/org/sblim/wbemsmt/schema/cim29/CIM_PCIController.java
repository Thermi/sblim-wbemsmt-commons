/** 
 * CIM_PCIController.java
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
 * Description: PCIController is a superclass for the PCIBridge and PCIDevice classes. These classes model adapters and bridges on a PCI bus. The properties in PCIController and its subclasses are defined in the various PCI Specifications published by the PCI SIG.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import org.sblim.wbem.client.*;



public class CIM_PCIController extends CIM_Controller  {
	
	public final static String CIM_CLASS_NAME = "CIM_PCIController";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	
	
	/**
	*	Specifies the system cache line size in doubleword increments (e.g., a 486-based system would store the value 04h, indicating a cache line size of four doublewords.
	*/
	public final static String CIM_PROPERTY_CACHELINESIZE = "CacheLineSize"; //$NON-NLS-1$
	/**
	*	An array of integers indicating controller capabilities. Information such as "Supports 66MHz" (value=2) is specified in this property. The data in the Capabilities array is gathered from the PCI Status Register and the PCI Capabilities List as defined in the PCI Specification.
	*/
	public final static String CIM_PROPERTY_CAPABILITIES = "Capabilities"; //$NON-NLS-1$
	/**
	*	An array of free-form strings providing more detailed explanations for any of the PCIController features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
	*/
	public final static String CIM_PROPERTY_CAPABILITYDESCRIPTIONS = "CapabilityDescriptions"; //$NON-NLS-1$
	/**
	*	Register of 8 bits that identifies the basic function of the PCI device. This is only the upper byte (offset 0Bh) of the 3 byte ClassCode field. Note that the property's ValueMap array specifies the decimal representation of this information.
	*/
	public final static String CIM_PROPERTY_CLASSCODE = "ClassCode"; //$NON-NLS-1$
	/**
	*	Current contents of the register that provides basic control over the device's ability to respond to, and/or perform PCI accesses.
	*/
	public final static String CIM_PROPERTY_COMMANDREGISTER = "CommandRegister"; //$NON-NLS-1$
	/**
	*	The slowest device select timing for a target device.
	*/
	public final static String CIM_PROPERTY_DEVICESELECTTIMING = "DeviceSelectTiming"; //$NON-NLS-1$
	/**
	*	Doubleword Expansion ROM base memory address.
	*/
	public final static String CIM_PROPERTY_EXPANSIONROMBASEADDRESS = "ExpansionROMBaseAddress"; //$NON-NLS-1$
	/**
	*	Defines the PCI interrupt request pin (INTA# to INTD#) to which a PCI functional device is connected.
	*/
	public final static String CIM_PROPERTY_INTERRUPTPIN = "InterruptPin"; //$NON-NLS-1$
	/**
	*	Defines the minimum amount of time, in PCI clock cycles, that the bus master can retain ownership of the bus.
	*/
	public final static String CIM_PROPERTY_LATENCYTIMER = "LatencyTimer"; //$NON-NLS-1$
	/**
	*	Reports if the PCI device can perform the self test function. Returns bit 7 of the BIST register as a boolean.
	*/
	public final static String CIM_PROPERTY_SELFTESTENABLED = "SelfTestEnabled"; //$NON-NLS-1$
	
	
	/**
	*	Method to invoke PCI device self-test. This method sets bit 6 of the BIST register. The return result is the lower four bits of the BIST register where 0 indicates success and non-zero is a device dependent failure. Support for this method is optional in the PCI Specification.
	*/
	public final static String CIM_METHOD_BISTEXECUTION = "BISTExecution";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CACHELINESIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CAPABILITIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASSCODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_COMMANDREGISTER);
		CIM_PropertyNameList.add(CIM_PROPERTY_DEVICESELECTTIMING);
		CIM_PropertyNameList.add(CIM_PROPERTY_EXPANSIONROMBASEADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_INTERRUPTPIN);
		CIM_PropertyNameList.add(CIM_PROPERTY_LATENCYTIMER);
		CIM_PropertyNameList.add(CIM_PROPERTY_SELFTESTENABLED);
				
		for (int i = 0; i < CIM_Controller.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CACHELINESIZE)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CAPABILITIES)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CAPABILITYDESCRIPTIONS)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASSCODE)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_COMMANDREGISTER)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEVICESELECTTIMING)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EXPANSIONROMBASEADDRESS)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INTERRUPTPIN)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LATENCYTIMER)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SELFTESTENABLED)){
				continue;
			}
			
			CIM_PCIController.CIM_PropertyNameList.add(CIM_Controller.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CACHELINESIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CAPABILITIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CAPABILITYDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASSCODE, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_COMMANDREGISTER, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEVICESELECTTIMING, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EXPANSIONROMBASEADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INTERRUPTPIN, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LATENCYTIMER, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SELFTESTENABLED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
				
		for (int i = 0; i < CIM_Controller.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CACHELINESIZE)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CAPABILITIES)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CAPABILITYDESCRIPTIONS)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASSCODE)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_COMMANDREGISTER)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEVICESELECTTIMING)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EXPANSIONROMBASEADDRESS)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INTERRUPTPIN)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LATENCYTIMER)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SELFTESTENABLED)){
				continue;
			}
			
			CIM_PCIController.CIM_PropertyList.add(CIM_Controller.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Controller.Java_Package_List.size(); i++) {
			if (((String)CIM_Controller.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Controller.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_CAPABILITIES = {"Unknown","Other","Supports 66MHz","Supports User Definable Features","Supports Fast Back-to-Back Transactions","PCI-X Capable","PCI Power Management Supported","Message Signaled Interrupts Supported","Parity Error Recovery Capable","AGP Supported","Vital Product Data Supported","Provides Slot Identification","Hot Swap Supported"};
	public final static String[] CIM_VALUEMAP_CLASSCODE = {"Pre 2.0","Mass Storage","Network","Display","Multimedia","Memory","Bridge","Simple Communications","Base Peripheral","Input","Docking Station","Processor","Serial Bus","Wireless","Intelligent I/O","Satellite Communication","Encryption/Decryption","Data Acquisition and Signal Processing","PCI Reserved","Other"};
	public final static String[] CIM_VALUEMAP_DEVICESELECTTIMING = {"Unknown","Other","Fast","Medium","Slow","Reserved"};
	public final static String[] CIM_VALUEMAP_INTERRUPTPIN = {"None","INTA#","INTB#","INTC#","INTD#","Unknown"};
	
	
	public final static int CAPABILITIES_UNKNOWN = 0;
	public final static int CAPABILITIES_OTHER = 1;
	public final static int CAPABILITIES_SUPPORTS66MHZ = 2;
	public final static int CAPABILITIES_SUPPORTSUSERDEFINABLEFEATURES = 3;
	public final static int CAPABILITIES_SUPPORTSFASTBACK_TO_BACKTRANSACTIONS = 4;
	public final static int CAPABILITIES_PCI_XCAPABLE = 5;
	public final static int CAPABILITIES_PCIPOWERMANAGEMENTSUPPORTED = 6;
	public final static int CAPABILITIES_MESSAGESIGNALEDINTERRUPTSSUPPORTED = 7;
	public final static int CAPABILITIES_PARITYERRORRECOVERYCAPABLE = 8;
	public final static int CAPABILITIES_AGPSUPPORTED = 9;
	public final static int CAPABILITIES_VITALPRODUCTDATASUPPORTED = 10;
	public final static int CAPABILITIES_PROVIDESSLOTIDENTIFICATION = 11;
	public final static int CAPABILITIES_HOTSWAPSUPPORTED = 12;
	
	public final static String CLASSCODE_PRE2_0 = "0";
	public final static String CLASSCODE_MASSSTORAGE = "1";
	public final static String CLASSCODE_NETWORK = "2";
	public final static String CLASSCODE_DISPLAY = "3";
	public final static String CLASSCODE_MULTIMEDIA = "4";
	public final static String CLASSCODE_MEMORY = "5";
	public final static String CLASSCODE_BRIDGE = "6";
	public final static String CLASSCODE_SIMPLECOMMUNICATIONS = "7";
	public final static String CLASSCODE_BASEPERIPHERAL = "8";
	public final static String CLASSCODE_INPUT = "9";
	public final static String CLASSCODE_DOCKINGSTATION = "10";
	public final static String CLASSCODE_PROCESSOR = "11";
	public final static String CLASSCODE_SERIALBUS = "12";
	public final static String CLASSCODE_WIRELESS = "13";
	public final static String CLASSCODE_INTELLIGENTI_O = "14";
	public final static String CLASSCODE_SATELLITECOMMUNICATION = "15";
	public final static String CLASSCODE_ENCRYPTION_DECRYPTION = "16";
	public final static String CLASSCODE_DATAACQUISITIONANDSIGNALPROCESSING = "17";
	public final static String CLASSCODE_PCIRESERVED = "18..254";
	public final static String CLASSCODE_OTHER = "255";
	
	public final static int DEVICESELECTTIMING_UNKNOWN = 0;
	public final static int DEVICESELECTTIMING_OTHER = 1;
	public final static int DEVICESELECTTIMING_FAST = 2;
	public final static int DEVICESELECTTIMING_MEDIUM = 3;
	public final static int DEVICESELECTTIMING_SLOW = 4;
	public final static int DEVICESELECTTIMING_RESERVED = 5;
	
	public final static int INTERRUPTPIN_NONE = 0;
	public final static int INTERRUPTPIN_INTA = 1;
	public final static int INTERRUPTPIN_INTB = 2;
	public final static int INTERRUPTPIN_INTC = 3;
	public final static int INTERRUPTPIN_INTD = 4;
	public final static int INTERRUPTPIN_UNKNOWN = 5;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PCIController() {

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
	public CIM_PCIController(Vector keyProperties){ 
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
	public CIM_PCIController(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_PCIController)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PCIController)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PCIController)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PCIController)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PCIController)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PCIController)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PCIController)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PCIController)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PCIController)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PCIController)object).cimObjectPath)) {
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
	
	// Attribute CacheLineSize
	
	public UnsignedInt8 get_CacheLineSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIController.CIM_PROPERTY_CACHELINESIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIController.CIM_PROPERTY_CACHELINESIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIController.CIM_PROPERTY_CACHELINESIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CacheLineSize(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIController.CIM_PROPERTY_CACHELINESIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIController.CIM_PROPERTY_CACHELINESIZE + " could not be found");
    		
		} else if (!CIM_PCIControllerHelper.isValid_CacheLineSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIController.CIM_PROPERTY_CACHELINESIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIController.CIM_PROPERTY_CACHELINESIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Capabilities
	
	public UnsignedInt16[] get_Capabilities() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIController.CIM_PROPERTY_CAPABILITIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIController.CIM_PROPERTY_CAPABILITIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIController.CIM_PROPERTY_CAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_Capabilities(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIController.CIM_PROPERTY_CAPABILITIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIController.CIM_PROPERTY_CAPABILITIES + " could not be found");
    		
		} else if (!CIM_PCIControllerHelper.isValid_Capabilities(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIController.CIM_PROPERTY_CAPABILITIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIController.CIM_PROPERTY_CAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CapabilityDescriptions
	
	public String[] get_CapabilityDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIController.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIController.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIController.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_CapabilityDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIController.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIController.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_PCIControllerHelper.isValid_CapabilityDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIController.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIController.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ClassCode
	
	public UnsignedInt8 get_ClassCode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIController.CIM_PROPERTY_CLASSCODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIController.CIM_PROPERTY_CLASSCODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIController.CIM_PROPERTY_CLASSCODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ClassCode(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIController.CIM_PROPERTY_CLASSCODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIController.CIM_PROPERTY_CLASSCODE + " could not be found");
    		
		} else if (!CIM_PCIControllerHelper.isValid_ClassCode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIController.CIM_PROPERTY_CLASSCODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIController.CIM_PROPERTY_CLASSCODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CommandRegister
	
	public UnsignedInt16 get_CommandRegister() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIController.CIM_PROPERTY_COMMANDREGISTER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIController.CIM_PROPERTY_COMMANDREGISTER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIController.CIM_PROPERTY_COMMANDREGISTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CommandRegister(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIController.CIM_PROPERTY_COMMANDREGISTER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIController.CIM_PROPERTY_COMMANDREGISTER + " could not be found");
    		
		} else if (!CIM_PCIControllerHelper.isValid_CommandRegister(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIController.CIM_PROPERTY_COMMANDREGISTER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIController.CIM_PROPERTY_COMMANDREGISTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DeviceSelectTiming
	
	public UnsignedInt16 get_DeviceSelectTiming() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIController.CIM_PROPERTY_DEVICESELECTTIMING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIController.CIM_PROPERTY_DEVICESELECTTIMING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIController.CIM_PROPERTY_DEVICESELECTTIMING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DeviceSelectTiming(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIController.CIM_PROPERTY_DEVICESELECTTIMING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIController.CIM_PROPERTY_DEVICESELECTTIMING + " could not be found");
    		
		} else if (!CIM_PCIControllerHelper.isValid_DeviceSelectTiming(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIController.CIM_PROPERTY_DEVICESELECTTIMING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIController.CIM_PROPERTY_DEVICESELECTTIMING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ExpansionROMBaseAddress
	
	public UnsignedInt32 get_ExpansionROMBaseAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIController.CIM_PROPERTY_EXPANSIONROMBASEADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIController.CIM_PROPERTY_EXPANSIONROMBASEADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIController.CIM_PROPERTY_EXPANSIONROMBASEADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ExpansionROMBaseAddress(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIController.CIM_PROPERTY_EXPANSIONROMBASEADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIController.CIM_PROPERTY_EXPANSIONROMBASEADDRESS + " could not be found");
    		
		} else if (!CIM_PCIControllerHelper.isValid_ExpansionROMBaseAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIController.CIM_PROPERTY_EXPANSIONROMBASEADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIController.CIM_PROPERTY_EXPANSIONROMBASEADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InterruptPin
	
	public UnsignedInt16 get_InterruptPin() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIController.CIM_PROPERTY_INTERRUPTPIN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIController.CIM_PROPERTY_INTERRUPTPIN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIController.CIM_PROPERTY_INTERRUPTPIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InterruptPin(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIController.CIM_PROPERTY_INTERRUPTPIN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIController.CIM_PROPERTY_INTERRUPTPIN + " could not be found");
    		
		} else if (!CIM_PCIControllerHelper.isValid_InterruptPin(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIController.CIM_PROPERTY_INTERRUPTPIN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIController.CIM_PROPERTY_INTERRUPTPIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LatencyTimer
	
	public UnsignedInt8 get_LatencyTimer() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIController.CIM_PROPERTY_LATENCYTIMER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIController.CIM_PROPERTY_LATENCYTIMER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIController.CIM_PROPERTY_LATENCYTIMER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LatencyTimer(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIController.CIM_PROPERTY_LATENCYTIMER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIController.CIM_PROPERTY_LATENCYTIMER + " could not be found");
    		
		} else if (!CIM_PCIControllerHelper.isValid_LatencyTimer(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIController.CIM_PROPERTY_LATENCYTIMER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIController.CIM_PROPERTY_LATENCYTIMER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SelfTestEnabled
	
	public Boolean get_SelfTestEnabled() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIController.CIM_PROPERTY_SELFTESTENABLED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIController.CIM_PROPERTY_SELFTESTENABLED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIController.CIM_PROPERTY_SELFTESTENABLED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SelfTestEnabled(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIController.CIM_PROPERTY_SELFTESTENABLED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIController.CIM_PROPERTY_SELFTESTENABLED + " could not be found");
    		
		} else if (!CIM_PCIControllerHelper.isValid_SelfTestEnabled(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIController.CIM_PROPERTY_SELFTESTENABLED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIController.CIM_PROPERTY_SELFTESTENABLED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt8 invoke_bistExecution(CIMClient cimClient) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_PCIController.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	
	  	
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_BISTEXECUTION,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_PCIController.CIM_METHOD_BISTEXECUTION + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_PCIController.CIM_METHOD_BISTEXECUTION + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_PCIController.CIM_METHOD_BISTEXECUTION + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");		
		}

		return (UnsignedInt8)returnValue.getValue(); 		  	
	  }

	

}
