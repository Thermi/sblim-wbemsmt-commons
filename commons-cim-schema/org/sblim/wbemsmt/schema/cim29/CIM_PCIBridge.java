/** 
 * CIM_PCIBridge.java
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
 * Description: Capabilities and management of a PCI controller providing bridge to bridge capability.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_PCIBridge extends CIM_PCIController  {
	
	public final static String CIM_CLASS_NAME = "CIM_PCIBridge";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	
	
	/**
	*	Array of doubleword base memory addresses.
	*/
	public final static String CIM_PROPERTY_BASEADDRESS = "BaseAddress"; //$NON-NLS-1$
	/**
	*	The type of bridge. Except for "Host" (value=0), the type of bridge is PCI to <value>. For type "Host", the device is a Host to PCI bridge.
	*/
	public final static String CIM_PROPERTY_BRIDGETYPE = "BridgeType"; //$NON-NLS-1$
	/**
	*	Base address of I/O addresses supported by the bus. The upper four bits of this property specify the address bits, AD[15::12], of the I/O address. The remaining 12 bits of the I/O address are assumed to be 0.
	*/
	public final static String CIM_PROPERTY_IOBASE = "IOBase"; //$NON-NLS-1$
	/**
	*	Upper 16 bits of the supported I/O base address when 32-bit I/O addressing is used. The lower 16 bits are assumed to be 0.
	*/
	public final static String CIM_PROPERTY_IOBASEUPPER16 = "IOBaseUpper16"; //$NON-NLS-1$
	/**
	*	End address of the I/O addresses supported by the bus. The upper four bits of this property specify the address bits, AD[15::12], of the I/O address. The remaining 12 bits of the I/O address are assumed to be all 1's.
	*/
	public final static String CIM_PROPERTY_IOLIMIT = "IOLimit"; //$NON-NLS-1$
	/**
	*	Upper 16 bits of the supported I/O end address when 32-bit I/O addressing is used. The lower 16 bits are assumed to be all 1's.
	*/
	public final static String CIM_PROPERTY_IOLIMITUPPER16 = "IOLimitUpper16"; //$NON-NLS-1$
	/**
	*	Base address of the memory supported by the bus. The upper twelve bits of this property specify the address bits, AD[31::20], of a 32-bit memory address. The remaining 20 bits of the address are assumed to be 0.
	*/
	public final static String CIM_PROPERTY_MEMORYBASE = "MemoryBase"; //$NON-NLS-1$
	/**
	*	End address of the memory supported by the bus. The upper twelve bits of this property specify the address bits, AD[31::20], of a 32-bit memory address. The remaining 20 bits of the address are assumed to be all 1's.
	*/
	public final static String CIM_PROPERTY_MEMORYLIMIT = "MemoryLimit"; //$NON-NLS-1$
	/**
	*	Upper 32 bits of the supported prefetch base address when 64-bit addressing is used. The lower 32 bits are assumed to be 0.
	*/
	public final static String CIM_PROPERTY_PREFETCHBASEUPPER32 = "PrefetchBaseUpper32"; //$NON-NLS-1$
	/**
	*	Upper 32 bits of the supported prefetch end address when 64-bit addressing is used. The lower 32 bits are assumed to be all 1's.
	*/
	public final static String CIM_PROPERTY_PREFETCHLIMITUPPER32 = "PrefetchLimitUpper32"; //$NON-NLS-1$
	/**
	*	Base address of the memory that can be prefetched by the bus. The upper twelve bits of this property specify the address bits, AD[31::20], of a 32-bit memory address. The remaining 20 bits of the address are assumed to be 0.
	*/
	public final static String CIM_PROPERTY_PREFETCHMEMORYBASE = "PrefetchMemoryBase"; //$NON-NLS-1$
	/**
	*	End address of the memory that can be prefetched by the bus. The upper twelve bits of this property specify the address bits, AD[31::20], of a 32-bit memory address. The remaining 20 bits of the address are assumed to be all 1's.
	*/
	public final static String CIM_PROPERTY_PREFETCHMEMORYLIMIT = "PrefetchMemoryLimit"; //$NON-NLS-1$
	/**
	*	The number of the PCI bus segment to which the primary interface of the bridge is connected.
	*/
	public final static String CIM_PROPERTY_PRIMARYBUSNUMBER = "PrimaryBusNumber"; //$NON-NLS-1$
	/**
	*	The slowest device select timing for a target device on the secondary bus.
	*/
	public final static String CIM_PROPERTY_SECONDARYBUSDEVICESELECTTIMING = "SecondaryBusDeviceSelectTiming"; //$NON-NLS-1$
	/**
	*	The timeslice for the secondary interface when the bridge is acting as an initiator. A zero value indicates no requirement.
	*/
	public final static String CIM_PROPERTY_SECONDARYLATENCYTIMER = "SecondaryLatencyTimer"; //$NON-NLS-1$
	/**
	*	The contents of the Bridge's SecondaryStatusRegister. For more information on the contents of this register, refer to the PCI-to-PCI Bridge Architecture Specification.
	*/
	public final static String CIM_PROPERTY_SECONDARYSTATUSREGISTER = "SecondaryStatusRegister"; //$NON-NLS-1$
	/**
	*	The number of the PCI bus segment to which the secondary interface of the bridge is connected.
	*/
	public final static String CIM_PROPERTY_SECONDAYBUSNUMBER = "SecondayBusNumber"; //$NON-NLS-1$
	/**
	*	The number of the highest numbered bus that exists behind the bridge.
	*/
	public final static String CIM_PROPERTY_SUBORDINATEBUSNUMBER = "SubordinateBusNumber"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_BASEADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_BRIDGETYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_IOBASE);
		CIM_PropertyNameList.add(CIM_PROPERTY_IOBASEUPPER16);
		CIM_PropertyNameList.add(CIM_PROPERTY_IOLIMIT);
		CIM_PropertyNameList.add(CIM_PROPERTY_IOLIMITUPPER16);
		CIM_PropertyNameList.add(CIM_PROPERTY_MEMORYBASE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MEMORYLIMIT);
		CIM_PropertyNameList.add(CIM_PROPERTY_PREFETCHBASEUPPER32);
		CIM_PropertyNameList.add(CIM_PROPERTY_PREFETCHLIMITUPPER32);
		CIM_PropertyNameList.add(CIM_PROPERTY_PREFETCHMEMORYBASE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PREFETCHMEMORYLIMIT);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRIMARYBUSNUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_SECONDARYBUSDEVICESELECTTIMING);
		CIM_PropertyNameList.add(CIM_PROPERTY_SECONDARYLATENCYTIMER);
		CIM_PropertyNameList.add(CIM_PROPERTY_SECONDARYSTATUSREGISTER);
		CIM_PropertyNameList.add(CIM_PROPERTY_SECONDAYBUSNUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUBORDINATEBUSNUMBER);
				
		for (int i = 0; i < CIM_PCIController.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_PCIController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BASEADDRESS)||
				((String)CIM_PCIController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BRIDGETYPE)||
				((String)CIM_PCIController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_IOBASE)||
				((String)CIM_PCIController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_IOBASEUPPER16)||
				((String)CIM_PCIController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_IOLIMIT)||
				((String)CIM_PCIController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_IOLIMITUPPER16)||
				((String)CIM_PCIController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MEMORYBASE)||
				((String)CIM_PCIController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MEMORYLIMIT)||
				((String)CIM_PCIController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PREFETCHBASEUPPER32)||
				((String)CIM_PCIController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PREFETCHLIMITUPPER32)||
				((String)CIM_PCIController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PREFETCHMEMORYBASE)||
				((String)CIM_PCIController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PREFETCHMEMORYLIMIT)||
				((String)CIM_PCIController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRIMARYBUSNUMBER)||
				((String)CIM_PCIController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SECONDARYBUSDEVICESELECTTIMING)||
				((String)CIM_PCIController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SECONDARYLATENCYTIMER)||
				((String)CIM_PCIController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SECONDARYSTATUSREGISTER)||
				((String)CIM_PCIController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SECONDAYBUSNUMBER)||
				((String)CIM_PCIController.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUBORDINATEBUSNUMBER)){
				continue;
			}
			
			CIM_PCIBridge.CIM_PropertyNameList.add(CIM_PCIController.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BASEADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BRIDGETYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_IOBASE, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_IOBASEUPPER16, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_IOLIMIT, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_IOLIMITUPPER16, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MEMORYBASE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MEMORYLIMIT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PREFETCHBASEUPPER32, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PREFETCHLIMITUPPER32, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PREFETCHMEMORYBASE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PREFETCHMEMORYLIMIT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRIMARYBUSNUMBER, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SECONDARYBUSDEVICESELECTTIMING, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SECONDARYLATENCYTIMER, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SECONDARYSTATUSREGISTER, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SECONDAYBUSNUMBER, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUBORDINATEBUSNUMBER, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
				
		for (int i = 0; i < CIM_PCIController.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_PCIController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BASEADDRESS)||
				((CIMProperty)CIM_PCIController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BRIDGETYPE)||
				((CIMProperty)CIM_PCIController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_IOBASE)||
				((CIMProperty)CIM_PCIController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_IOBASEUPPER16)||
				((CIMProperty)CIM_PCIController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_IOLIMIT)||
				((CIMProperty)CIM_PCIController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_IOLIMITUPPER16)||
				((CIMProperty)CIM_PCIController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MEMORYBASE)||
				((CIMProperty)CIM_PCIController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MEMORYLIMIT)||
				((CIMProperty)CIM_PCIController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PREFETCHBASEUPPER32)||
				((CIMProperty)CIM_PCIController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PREFETCHLIMITUPPER32)||
				((CIMProperty)CIM_PCIController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PREFETCHMEMORYBASE)||
				((CIMProperty)CIM_PCIController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PREFETCHMEMORYLIMIT)||
				((CIMProperty)CIM_PCIController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRIMARYBUSNUMBER)||
				((CIMProperty)CIM_PCIController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SECONDARYBUSDEVICESELECTTIMING)||
				((CIMProperty)CIM_PCIController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SECONDARYLATENCYTIMER)||
				((CIMProperty)CIM_PCIController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SECONDARYSTATUSREGISTER)||
				((CIMProperty)CIM_PCIController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SECONDAYBUSNUMBER)||
				((CIMProperty)CIM_PCIController.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUBORDINATEBUSNUMBER)){
				continue;
			}
			
			CIM_PCIBridge.CIM_PropertyList.add(CIM_PCIController.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_PCIController.Java_Package_List.size(); i++) {
			if (((String)CIM_PCIController.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_PCIController.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_BRIDGETYPE = {"Host","ISA","EISA","Micro Channel","PCI","PCMCIA","NuBus","CardBus","RACEway","Other"};
	public final static String[] CIM_VALUEMAP_SECONDARYBUSDEVICESELECTTIMING = {"Unknown","Other","Fast","Medium","Slow","Reserved"};
	
	
	public final static int BRIDGETYPE_HOST = 0;
	public final static int BRIDGETYPE_ISA = 1;
	public final static int BRIDGETYPE_EISA = 2;
	public final static int BRIDGETYPE_MICROCHANNEL = 3;
	public final static int BRIDGETYPE_PCI = 4;
	public final static int BRIDGETYPE_PCMCIA = 5;
	public final static int BRIDGETYPE_NUBUS = 6;
	public final static int BRIDGETYPE_CARDBUS = 7;
	public final static int BRIDGETYPE_RACEWAY = 8;
	public final static int BRIDGETYPE_OTHER = 128;
	
	public final static int SECONDARYBUSDEVICESELECTTIMING_UNKNOWN = 0;
	public final static int SECONDARYBUSDEVICESELECTTIMING_OTHER = 1;
	public final static int SECONDARYBUSDEVICESELECTTIMING_FAST = 2;
	public final static int SECONDARYBUSDEVICESELECTTIMING_MEDIUM = 3;
	public final static int SECONDARYBUSDEVICESELECTTIMING_SLOW = 4;
	public final static int SECONDARYBUSDEVICESELECTTIMING_RESERVED = 5;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PCIBridge() {

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
	public CIM_PCIBridge(Vector keyProperties){ 
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
	public CIM_PCIBridge(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_PCIBridge)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PCIBridge)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PCIBridge)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PCIBridge)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PCIBridge)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PCIBridge)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PCIBridge)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PCIBridge)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PCIBridge)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PCIBridge)object).cimObjectPath)) {
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
	
	// Attribute BaseAddress
	
	public UnsignedInt32 get_BaseAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_BASEADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_BASEADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_BASEADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BaseAddress(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_BASEADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_BASEADDRESS + " could not be found");
    		
		} else if (!CIM_PCIBridgeHelper.isValid_BaseAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIBridge.CIM_PROPERTY_BASEADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_BASEADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BridgeType
	
	public UnsignedInt16 get_BridgeType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_BRIDGETYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_BRIDGETYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_BRIDGETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BridgeType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_BRIDGETYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_BRIDGETYPE + " could not be found");
    		
		} else if (!CIM_PCIBridgeHelper.isValid_BridgeType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIBridge.CIM_PROPERTY_BRIDGETYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_BRIDGETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IOBase
	
	public UnsignedInt8 get_IOBase() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_IOBASE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_IOBASE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_IOBASE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IOBase(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_IOBASE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_IOBASE + " could not be found");
    		
		} else if (!CIM_PCIBridgeHelper.isValid_IOBase(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIBridge.CIM_PROPERTY_IOBASE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_IOBASE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IOBaseUpper16
	
	public UnsignedInt16 get_IOBaseUpper16() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_IOBASEUPPER16);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_IOBASEUPPER16 + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_IOBASEUPPER16 + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IOBaseUpper16(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_IOBASEUPPER16);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_IOBASEUPPER16 + " could not be found");
    		
		} else if (!CIM_PCIBridgeHelper.isValid_IOBaseUpper16(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIBridge.CIM_PROPERTY_IOBASEUPPER16);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_IOBASEUPPER16 + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IOLimit
	
	public UnsignedInt8 get_IOLimit() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_IOLIMIT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_IOLIMIT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_IOLIMIT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IOLimit(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_IOLIMIT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_IOLIMIT + " could not be found");
    		
		} else if (!CIM_PCIBridgeHelper.isValid_IOLimit(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIBridge.CIM_PROPERTY_IOLIMIT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_IOLIMIT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IOLimitUpper16
	
	public UnsignedInt16 get_IOLimitUpper16() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_IOLIMITUPPER16);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_IOLIMITUPPER16 + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_IOLIMITUPPER16 + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IOLimitUpper16(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_IOLIMITUPPER16);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_IOLIMITUPPER16 + " could not be found");
    		
		} else if (!CIM_PCIBridgeHelper.isValid_IOLimitUpper16(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIBridge.CIM_PROPERTY_IOLIMITUPPER16);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_IOLIMITUPPER16 + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MemoryBase
	
	public UnsignedInt16 get_MemoryBase() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_MEMORYBASE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_MEMORYBASE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_MEMORYBASE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MemoryBase(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_MEMORYBASE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_MEMORYBASE + " could not be found");
    		
		} else if (!CIM_PCIBridgeHelper.isValid_MemoryBase(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIBridge.CIM_PROPERTY_MEMORYBASE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_MEMORYBASE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MemoryLimit
	
	public UnsignedInt16 get_MemoryLimit() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_MEMORYLIMIT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_MEMORYLIMIT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_MEMORYLIMIT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MemoryLimit(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_MEMORYLIMIT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_MEMORYLIMIT + " could not be found");
    		
		} else if (!CIM_PCIBridgeHelper.isValid_MemoryLimit(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIBridge.CIM_PROPERTY_MEMORYLIMIT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_MEMORYLIMIT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PrefetchBaseUpper32
	
	public UnsignedInt32 get_PrefetchBaseUpper32() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_PREFETCHBASEUPPER32);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_PREFETCHBASEUPPER32 + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_PREFETCHBASEUPPER32 + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PrefetchBaseUpper32(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_PREFETCHBASEUPPER32);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_PREFETCHBASEUPPER32 + " could not be found");
    		
		} else if (!CIM_PCIBridgeHelper.isValid_PrefetchBaseUpper32(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIBridge.CIM_PROPERTY_PREFETCHBASEUPPER32);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_PREFETCHBASEUPPER32 + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PrefetchLimitUpper32
	
	public UnsignedInt32 get_PrefetchLimitUpper32() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_PREFETCHLIMITUPPER32);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_PREFETCHLIMITUPPER32 + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_PREFETCHLIMITUPPER32 + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PrefetchLimitUpper32(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_PREFETCHLIMITUPPER32);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_PREFETCHLIMITUPPER32 + " could not be found");
    		
		} else if (!CIM_PCIBridgeHelper.isValid_PrefetchLimitUpper32(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIBridge.CIM_PROPERTY_PREFETCHLIMITUPPER32);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_PREFETCHLIMITUPPER32 + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PrefetchMemoryBase
	
	public UnsignedInt16 get_PrefetchMemoryBase() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_PREFETCHMEMORYBASE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_PREFETCHMEMORYBASE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_PREFETCHMEMORYBASE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PrefetchMemoryBase(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_PREFETCHMEMORYBASE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_PREFETCHMEMORYBASE + " could not be found");
    		
		} else if (!CIM_PCIBridgeHelper.isValid_PrefetchMemoryBase(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIBridge.CIM_PROPERTY_PREFETCHMEMORYBASE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_PREFETCHMEMORYBASE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PrefetchMemoryLimit
	
	public UnsignedInt16 get_PrefetchMemoryLimit() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_PREFETCHMEMORYLIMIT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_PREFETCHMEMORYLIMIT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_PREFETCHMEMORYLIMIT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PrefetchMemoryLimit(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_PREFETCHMEMORYLIMIT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_PREFETCHMEMORYLIMIT + " could not be found");
    		
		} else if (!CIM_PCIBridgeHelper.isValid_PrefetchMemoryLimit(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIBridge.CIM_PROPERTY_PREFETCHMEMORYLIMIT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_PREFETCHMEMORYLIMIT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PrimaryBusNumber
	
	public UnsignedInt8 get_PrimaryBusNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_PRIMARYBUSNUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_PRIMARYBUSNUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_PRIMARYBUSNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PrimaryBusNumber(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_PRIMARYBUSNUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_PRIMARYBUSNUMBER + " could not be found");
    		
		} else if (!CIM_PCIBridgeHelper.isValid_PrimaryBusNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIBridge.CIM_PROPERTY_PRIMARYBUSNUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_PRIMARYBUSNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SecondaryBusDeviceSelectTiming
	
	public UnsignedInt16 get_SecondaryBusDeviceSelectTiming() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_SECONDARYBUSDEVICESELECTTIMING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_SECONDARYBUSDEVICESELECTTIMING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_SECONDARYBUSDEVICESELECTTIMING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SecondaryBusDeviceSelectTiming(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_SECONDARYBUSDEVICESELECTTIMING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_SECONDARYBUSDEVICESELECTTIMING + " could not be found");
    		
		} else if (!CIM_PCIBridgeHelper.isValid_SecondaryBusDeviceSelectTiming(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIBridge.CIM_PROPERTY_SECONDARYBUSDEVICESELECTTIMING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_SECONDARYBUSDEVICESELECTTIMING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SecondaryLatencyTimer
	
	public UnsignedInt8 get_SecondaryLatencyTimer() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_SECONDARYLATENCYTIMER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_SECONDARYLATENCYTIMER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_SECONDARYLATENCYTIMER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SecondaryLatencyTimer(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_SECONDARYLATENCYTIMER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_SECONDARYLATENCYTIMER + " could not be found");
    		
		} else if (!CIM_PCIBridgeHelper.isValid_SecondaryLatencyTimer(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIBridge.CIM_PROPERTY_SECONDARYLATENCYTIMER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_SECONDARYLATENCYTIMER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SecondaryStatusRegister
	
	public UnsignedInt16 get_SecondaryStatusRegister() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_SECONDARYSTATUSREGISTER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_SECONDARYSTATUSREGISTER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_SECONDARYSTATUSREGISTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SecondaryStatusRegister(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_SECONDARYSTATUSREGISTER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_SECONDARYSTATUSREGISTER + " could not be found");
    		
		} else if (!CIM_PCIBridgeHelper.isValid_SecondaryStatusRegister(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIBridge.CIM_PROPERTY_SECONDARYSTATUSREGISTER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_SECONDARYSTATUSREGISTER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SecondayBusNumber
	
	public UnsignedInt8 get_SecondayBusNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_SECONDAYBUSNUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_SECONDAYBUSNUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_SECONDAYBUSNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SecondayBusNumber(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_SECONDAYBUSNUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_SECONDAYBUSNUMBER + " could not be found");
    		
		} else if (!CIM_PCIBridgeHelper.isValid_SecondayBusNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIBridge.CIM_PROPERTY_SECONDAYBUSNUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_SECONDAYBUSNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SubordinateBusNumber
	
	public UnsignedInt8 get_SubordinateBusNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_SUBORDINATEBUSNUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_SUBORDINATEBUSNUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_SUBORDINATEBUSNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SubordinateBusNumber(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PCIBridge.CIM_PROPERTY_SUBORDINATEBUSNUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PCIBridge.CIM_PROPERTY_SUBORDINATEBUSNUMBER + " could not be found");
    		
		} else if (!CIM_PCIBridgeHelper.isValid_SubordinateBusNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PCIBridge.CIM_PROPERTY_SUBORDINATEBUSNUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PCIBridge.CIM_PROPERTY_SUBORDINATEBUSNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
