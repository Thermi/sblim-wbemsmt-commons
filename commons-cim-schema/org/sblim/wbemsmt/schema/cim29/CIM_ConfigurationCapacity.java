/** 
 * CIM_ConfigurationCapacity.java
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
 * Description: ConfigurationCapacity provides information on the minimum and maximum numbers of power supplies, fans, disk drives, etc. that can be connected to or placed on/into a PhysicalElement (and the number that must be connected/added/removed at a time). The PhysicalElement whose configuration is described is identified using the ElementCapacity association, inherited from PhysicalCapacity. The object whose capacities are indicated (ie, the power supply or fan) is identified in the ObjectType property of this class. Since the same min/max configurations can apply to multiple instances, this class is not defined as 'weak'. 
Examples of the use of the ConfigurationCapacity class are to describe that a 'control unit' Chassis may be connected to (at most) 4 other I/O chassis, or to describe what a StorageLibrary's cabinet may contain. Continuing the latter example, a particular StorageLibrary's cabinet might hold a minimum of 3 and a maximum of 9 TapeDrives, and a minimum of 88 and a maximum of 264 StorageMediaLocations ("Slots"). This information would be described in two instances of ConfigurationCapacity, both associated to the StorageLibrary's PhysicalPackage. 
This class does NOT represent the tradeoffs that are likely to be required of one resource for another. It simply represents capacities. In the case of the StorageLibrary, there may be only 2 valid configurations - 9 TapeDrives with 88 Slots, or 3 TapeDrives with 264 Slots. This class only conveys that 'up to' 9 Drives and 'up to' 264 slots may be available and are supported.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_ConfigurationCapacity extends CIM_PhysicalCapacity  {
	
	public final static String CIM_CLASS_NAME = "CIM_ConfigurationCapacity";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	
	
	/**
	*	Increment in which Elements must be added or removed.
	*/
	public final static String CIM_PROPERTY_INCREMENT = "Increment"; //$NON-NLS-1$
	/**
	*	Maximum number of Elements of type, ObjectType, that may be installed.
	*/
	public final static String CIM_PROPERTY_MAXIMUMCAPACITY = "MaximumCapacity"; //$NON-NLS-1$
	/**
	*	Minimum number of Elements of type, ObjectType, that must be installed.
	*/
	public final static String CIM_PROPERTY_MINIMUMCAPACITY = "MinimumCapacity"; //$NON-NLS-1$
	/**
	*	The inherited Name serves as a part of the Configuration Capacity object key.
	*/
	public final static String CIM_PROPERTY_NAME = "Name"; //$NON-NLS-1$
	/**
	*	The type of object (power supply, fan, disk drive, ...) whose capacities are indicated. This information is part of the class' key.
	*/
	public final static String CIM_PROPERTY_OBJECTTYPE = "ObjectType"; //$NON-NLS-1$
	/**
	*	A string describing the object type - used when the ObjectType property is set to 0 ("Other"). OtherType Description should be set to NULL when ObjectType is any value other than 0.
	*/
	public final static String CIM_PROPERTY_OTHERTYPEDESCRIPTION = "OtherTypeDescription"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_INCREMENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXIMUMCAPACITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_MINIMUMCAPACITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_OBJECTTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERTYPEDESCRIPTION);
				
		for (int i = 0; i < CIM_PhysicalCapacity.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_PhysicalCapacity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INCREMENT)||
				((String)CIM_PhysicalCapacity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXIMUMCAPACITY)||
				((String)CIM_PhysicalCapacity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MINIMUMCAPACITY)||
				((String)CIM_PhysicalCapacity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAME)||
				((String)CIM_PhysicalCapacity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OBJECTTYPE)||
				((String)CIM_PhysicalCapacity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERTYPEDESCRIPTION)){
				continue;
			}
			
			CIM_ConfigurationCapacity.CIM_PropertyNameList.add(CIM_PhysicalCapacity.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INCREMENT, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXIMUMCAPACITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MINIMUMCAPACITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OBJECTTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERTYPEDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_PhysicalCapacity.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_PhysicalCapacity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INCREMENT)||
				((CIMProperty)CIM_PhysicalCapacity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXIMUMCAPACITY)||
				((CIMProperty)CIM_PhysicalCapacity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MINIMUMCAPACITY)||
				((CIMProperty)CIM_PhysicalCapacity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAME)||
				((CIMProperty)CIM_PhysicalCapacity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OBJECTTYPE)||
				((CIMProperty)CIM_PhysicalCapacity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERTYPEDESCRIPTION)){
				continue;
			}
			
			CIM_ConfigurationCapacity.CIM_PropertyList.add(CIM_PhysicalCapacity.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_PhysicalCapacity.Java_Package_List.size(); i++) {
			if (((String)CIM_PhysicalCapacity.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_PhysicalCapacity.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_OBJECTTYPE = {"Other","Processors","Power Supplies","Fans","Batteries","I/O Slots","Memory Slots","MediaAccessDevices (Drives)","StorageMediaLocation Slots","StorageMediaLocation Magazines","StorageMediaLocation Panels","StorageMediaLocation InterLibrary Ports","StorageMediaLocation Limited Access Ports","Doors","MediaTransferDevice Pickers","MediaTransferDevice Changers","LabelReaders","Contained Chassis","Connected Chassis","Connected Frames","Front Side I/O Slots","Back Side I/O Slots","Cache Memory","NVS Memory","Volatile Memory"};
	
	
	public final static int OBJECTTYPE_OTHER = 0;
	public final static int OBJECTTYPE_PROCESSORS = 1;
	public final static int OBJECTTYPE_POWERSUPPLIES = 2;
	public final static int OBJECTTYPE_FANS = 3;
	public final static int OBJECTTYPE_BATTERIES = 4;
	public final static int OBJECTTYPE_I_OSLOTS = 5;
	public final static int OBJECTTYPE_MEMORYSLOTS = 6;
	public final static int OBJECTTYPE_MEDIAACCESSDEVICESDRIVES = 7;
	public final static int OBJECTTYPE_STORAGEMEDIALOCATIONSLOTS = 8;
	public final static int OBJECTTYPE_STORAGEMEDIALOCATIONMAGAZINES = 9;
	public final static int OBJECTTYPE_STORAGEMEDIALOCATIONPANELS = 10;
	public final static int OBJECTTYPE_STORAGEMEDIALOCATIONINTERLIBRARYPORTS = 11;
	public final static int OBJECTTYPE_STORAGEMEDIALOCATIONLIMITEDACCESSPORTS = 12;
	public final static int OBJECTTYPE_DOORS = 13;
	public final static int OBJECTTYPE_MEDIATRANSFERDEVICEPICKERS = 14;
	public final static int OBJECTTYPE_MEDIATRANSFERDEVICECHANGERS = 15;
	public final static int OBJECTTYPE_LABELREADERS = 16;
	public final static int OBJECTTYPE_CONTAINEDCHASSIS = 17;
	public final static int OBJECTTYPE_CONNECTEDCHASSIS = 18;
	public final static int OBJECTTYPE_CONNECTEDFRAMES = 19;
	public final static int OBJECTTYPE_FRONTSIDEI_OSLOTS = 20;
	public final static int OBJECTTYPE_BACKSIDEI_OSLOTS = 21;
	public final static int OBJECTTYPE_CACHEMEMORY = 22;
	public final static int OBJECTTYPE_NVSMEMORY = 23;
	public final static int OBJECTTYPE_VOLATILEMEMORY = 24;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ConfigurationCapacity() {

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
	public CIM_ConfigurationCapacity(Vector keyProperties){ 
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
	public CIM_ConfigurationCapacity(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_Name = this.cimInstance.getProperty(CIM_PROPERTY_NAME);
		
		if (CIMProperty_Name == null || CIMProperty_Name.getValue().isEmpty() || CIMProperty_Name.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_NAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_ObjectType = this.cimInstance.getProperty(CIM_PROPERTY_OBJECTTYPE);
		
		if (CIMProperty_ObjectType == null || CIMProperty_ObjectType.getValue().isEmpty() || CIMProperty_ObjectType.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_OBJECTTYPE, "Key"});
			result = false;
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
	    
	    if (!(object instanceof CIM_ConfigurationCapacity)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ConfigurationCapacity)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ConfigurationCapacity)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ConfigurationCapacity)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ConfigurationCapacity)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ConfigurationCapacity)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ConfigurationCapacity)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ConfigurationCapacity)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ConfigurationCapacity)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ConfigurationCapacity)object).cimObjectPath)) {
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
	
	// Attribute Increment
	
	public UnsignedInt32 get_Increment() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConfigurationCapacity.CIM_PROPERTY_INCREMENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConfigurationCapacity.CIM_PROPERTY_INCREMENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConfigurationCapacity.CIM_PROPERTY_INCREMENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Increment(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConfigurationCapacity.CIM_PROPERTY_INCREMENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConfigurationCapacity.CIM_PROPERTY_INCREMENT + " could not be found");
    		
		} else if (!CIM_ConfigurationCapacityHelper.isValid_Increment(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ConfigurationCapacity.CIM_PROPERTY_INCREMENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConfigurationCapacity.CIM_PROPERTY_INCREMENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaximumCapacity
	
	public UnsignedInt64 get_MaximumCapacity() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConfigurationCapacity.CIM_PROPERTY_MAXIMUMCAPACITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConfigurationCapacity.CIM_PROPERTY_MAXIMUMCAPACITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConfigurationCapacity.CIM_PROPERTY_MAXIMUMCAPACITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaximumCapacity(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConfigurationCapacity.CIM_PROPERTY_MAXIMUMCAPACITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConfigurationCapacity.CIM_PROPERTY_MAXIMUMCAPACITY + " could not be found");
    		
		} else if (!CIM_ConfigurationCapacityHelper.isValid_MaximumCapacity(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ConfigurationCapacity.CIM_PROPERTY_MAXIMUMCAPACITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConfigurationCapacity.CIM_PROPERTY_MAXIMUMCAPACITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MinimumCapacity
	
	public UnsignedInt64 get_MinimumCapacity() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConfigurationCapacity.CIM_PROPERTY_MINIMUMCAPACITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConfigurationCapacity.CIM_PROPERTY_MINIMUMCAPACITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConfigurationCapacity.CIM_PROPERTY_MINIMUMCAPACITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MinimumCapacity(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConfigurationCapacity.CIM_PROPERTY_MINIMUMCAPACITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConfigurationCapacity.CIM_PROPERTY_MINIMUMCAPACITY + " could not be found");
    		
		} else if (!CIM_ConfigurationCapacityHelper.isValid_MinimumCapacity(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ConfigurationCapacity.CIM_PROPERTY_MINIMUMCAPACITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConfigurationCapacity.CIM_PROPERTY_MINIMUMCAPACITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Name
	
	public String get_Name() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConfigurationCapacity.CIM_PROPERTY_NAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConfigurationCapacity.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConfigurationCapacity.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Name(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConfigurationCapacity.CIM_PROPERTY_NAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_ConfigurationCapacity.CIM_PROPERTY_NAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConfigurationCapacity.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (!CIM_ConfigurationCapacityHelper.isValid_Name(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ConfigurationCapacity.CIM_PROPERTY_NAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConfigurationCapacity.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ObjectType
	
	public UnsignedInt16 get_ObjectType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConfigurationCapacity.CIM_PROPERTY_OBJECTTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConfigurationCapacity.CIM_PROPERTY_OBJECTTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConfigurationCapacity.CIM_PROPERTY_OBJECTTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ObjectType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConfigurationCapacity.CIM_PROPERTY_OBJECTTYPE);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_ConfigurationCapacity.CIM_PROPERTY_OBJECTTYPE + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConfigurationCapacity.CIM_PROPERTY_OBJECTTYPE + " could not be found");
    		
		} else if (!CIM_ConfigurationCapacityHelper.isValid_ObjectType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ConfigurationCapacity.CIM_PROPERTY_OBJECTTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConfigurationCapacity.CIM_PROPERTY_OBJECTTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherTypeDescription
	
	public String get_OtherTypeDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConfigurationCapacity.CIM_PROPERTY_OTHERTYPEDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConfigurationCapacity.CIM_PROPERTY_OTHERTYPEDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConfigurationCapacity.CIM_PROPERTY_OTHERTYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherTypeDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConfigurationCapacity.CIM_PROPERTY_OTHERTYPEDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConfigurationCapacity.CIM_PROPERTY_OTHERTYPEDESCRIPTION + " could not be found");
    		
		} else if (!CIM_ConfigurationCapacityHelper.isValid_OtherTypeDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ConfigurationCapacity.CIM_PROPERTY_OTHERTYPEDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConfigurationCapacity.CIM_PROPERTY_OTHERTYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
