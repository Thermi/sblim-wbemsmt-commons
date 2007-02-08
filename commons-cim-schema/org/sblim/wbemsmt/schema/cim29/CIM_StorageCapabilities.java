/** 
 * CIM_StorageCapabilities.java
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
 * Description: A subclass of Capabilities that defines the Capabilities of a StorageService or StoragePool. For example, an instance of StorageCapabilities could be associated with either a StorageConfigurationService or StoragePool by using ElementCapabilities.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import org.sblim.wbem.client.*;



public class CIM_StorageCapabilities extends CIM_Capabilities  {
	
	public final static String CIM_CLASS_NAME = "CIM_StorageCapabilities";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	DataRedundancyDefault describes the default number of complete copies of data that can be maintained. Examples would be RAID 5 where 1 copy is maintained and RAID 1 where 2 or more copies are maintained. Possible values are 1 to n. The bounds for the redundancy (max and min) are defined by DataRedundancyMax and DataRedundancyMin.
	*/
	public final static String CIM_PROPERTY_DATAREDUNDANCYDEFAULT = "DataRedundancyDefault"; //$NON-NLS-1$
	/**
	*	DataRedundancyMax describes the maximum number of complete copies of data that can be maintained. Examples would be RAID 5 (where 1 copy is maintained) and RAID 1 (where 2 or more copies are maintained). Possible values are 1 to n. The default redundancy is specified using DataRedundancyDefault, while the minimum is defined by DataRedundancyMin.
	*/
	public final static String CIM_PROPERTY_DATAREDUNDANCYMAX = "DataRedundancyMax"; //$NON-NLS-1$
	/**
	*	DataRedundancyMin describes the minimum number of complete copies of data that can be maintained. Examples would be RAID 5 where 1 copy is maintained and RAID 1 where 2 or more copies are maintained). Possible values are 1 to n. The default redundancy is specified using DataRedundancyDefault, while the maximum is defined by DataRedundancyMax.
	*/
	public final static String CIM_PROPERTY_DATAREDUNDANCYMIN = "DataRedundancyMin"; //$NON-NLS-1$
	/**
	*	Delta reservation is a number between 1 (1%) and a 100 (100%) that specifies how much space should be reserved by default in a replica for caching changes. For a complete copy this would be 100%, but it can be lower in some implementations. This parameter sets the default value, while DeletaReservationMax and DeltReservationMin set the upper and lower bounds.
	*/
	public final static String CIM_PROPERTY_DELTARESERVATIONDEFAULT = "DeltaReservationDefault"; //$NON-NLS-1$
	/**
	*	DeltaReservatioMax is a number between 1 (1%) and a 100 (100%) that specifies the maximum amount of space reserved in a replica for caching changes. For a complete copy this would be 100%, but it can be lower in some implementations. This parameter sets the upper limit, while DeltaReservationMin sets the lower limit.
	*/
	public final static String CIM_PROPERTY_DELTARESERVATIONMAX = "DeltaReservationMax"; //$NON-NLS-1$
	/**
	*	DeltaReservationMin is a number between 1 (1%) and a 100 (100%) that specifies the minimum amount of space that should be reserved in a replica for caching changes. For a complete copy this would be 100%, but it can be lower in some implementations. This parameter sets the lower limit, while DeltaReservationMax sets the upper limit.
	*/
	public final static String CIM_PROPERTY_DELTARESERVATIONMIN = "DeltaReservationMin"; //$NON-NLS-1$
	/**
	*	Enumeration indicating the type of element to which this StorageCapabilities applies.
	*/
	public final static String CIM_PROPERTY_ELEMENTTYPE = "ElementType"; //$NON-NLS-1$
	/**
	*	Indicates whether or not the associated element supports no single point of failure. Values are: FALSE = does not support no single point of failure, and TRUE = supports no single point of failure.
	*/
	public final static String CIM_PROPERTY_NOSINGLEPOINTOFFAILURE = "NoSinglePointOfFailure"; //$NON-NLS-1$
	/**
	*	Indicates the default value for the NoSinglePointOfFailure property.
	*/
	public final static String CIM_PROPERTY_NOSINGLEPOINTOFFAILUREDEFAULT = "NoSinglePointOfFailureDefault"; //$NON-NLS-1$
	/**
	*	PackageRedundancyDefault describes the default number of redundant packages that will be used. For example, in the storage domain, package redundancy describes how many disk spindles can fail without data loss including, at most, one spare. An example would be RAID5 with a spare disk which would have a PackageRedundancy of 2. Possible values are 0 to n. The bounds for redundancy are specified using the properties, PackageRedundancyMax and PackageRedundancyMin.
	*/
	public final static String CIM_PROPERTY_PACKAGEREDUNDANCYDEFAULT = "PackageRedundancyDefault"; //$NON-NLS-1$
	/**
	*	PackageRedundancyMax describes the maximum number of redundant packages that can be used. For example, in the storage domain, package redundancy describes how many disk spindles can fail without data loss including, at most, one spare. An example would be RAID5 with a spare disk which would have a PackageRedundancy of 2. Possible values are 0 to n. The default redundancy is specified using PackageRedundancyDefault, while the maximum is defined by PackageRedundancyMax.
	*/
	public final static String CIM_PROPERTY_PACKAGEREDUNDANCYMAX = "PackageRedundancyMax"; //$NON-NLS-1$
	/**
	*	PackageRedundancyMin describes the minimum number of redundant packages that can be used. For example, in the storage domain, package redundancy describes how many disk spindles can fail without data loss including, at most, one spare. An example would be RAID5 with a spare disk which would have a PackageRedundancy of 2. Possible values are 0 to n. The default redundancy is specified using PackageRedundancyDefault, while the minimum is defined by PackageRedundancyMin.
	*/
	public final static String CIM_PROPERTY_PACKAGEREDUNDANCYMIN = "PackageRedundancyMin"; //$NON-NLS-1$
	
	
	/**
	*	Method to create and populate a StorageSetting instance from a StorageCapability instance. This removes the need to populate default settings and other settings in the context of each StorageCapabilities (which could be numerous). If the underlying instrumentation supports the StorageSettingWithHints subclass, then an instance of that class will be created instead.
	*/
	public final static String CIM_METHOD_CREATESETTING = "CreateSetting";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DATAREDUNDANCYDEFAULT);
		CIM_PropertyNameList.add(CIM_PROPERTY_DATAREDUNDANCYMAX);
		CIM_PropertyNameList.add(CIM_PROPERTY_DATAREDUNDANCYMIN);
		CIM_PropertyNameList.add(CIM_PROPERTY_DELTARESERVATIONDEFAULT);
		CIM_PropertyNameList.add(CIM_PROPERTY_DELTARESERVATIONMAX);
		CIM_PropertyNameList.add(CIM_PROPERTY_DELTARESERVATIONMIN);
		CIM_PropertyNameList.add(CIM_PROPERTY_ELEMENTTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_NOSINGLEPOINTOFFAILURE);
		CIM_PropertyNameList.add(CIM_PROPERTY_NOSINGLEPOINTOFFAILUREDEFAULT);
		CIM_PropertyNameList.add(CIM_PROPERTY_PACKAGEREDUNDANCYDEFAULT);
		CIM_PropertyNameList.add(CIM_PROPERTY_PACKAGEREDUNDANCYMAX);
		CIM_PropertyNameList.add(CIM_PROPERTY_PACKAGEREDUNDANCYMIN);
				
		for (int i = 0; i < CIM_Capabilities.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DATAREDUNDANCYDEFAULT)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DATAREDUNDANCYMAX)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DATAREDUNDANCYMIN)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DELTARESERVATIONDEFAULT)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DELTARESERVATIONMAX)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DELTARESERVATIONMIN)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ELEMENTTYPE)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NOSINGLEPOINTOFFAILURE)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NOSINGLEPOINTOFFAILUREDEFAULT)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PACKAGEREDUNDANCYDEFAULT)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PACKAGEREDUNDANCYMAX)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PACKAGEREDUNDANCYMIN)){
				continue;
			}
			
			CIM_StorageCapabilities.CIM_PropertyNameList.add(CIM_Capabilities.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DATAREDUNDANCYDEFAULT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DATAREDUNDANCYMAX, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DATAREDUNDANCYMIN, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DELTARESERVATIONDEFAULT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DELTARESERVATIONMAX, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DELTARESERVATIONMIN, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ELEMENTTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NOSINGLEPOINTOFFAILURE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NOSINGLEPOINTOFFAILUREDEFAULT, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PACKAGEREDUNDANCYDEFAULT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PACKAGEREDUNDANCYMAX, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PACKAGEREDUNDANCYMIN, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_Capabilities.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DATAREDUNDANCYDEFAULT)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DATAREDUNDANCYMAX)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DATAREDUNDANCYMIN)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DELTARESERVATIONDEFAULT)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DELTARESERVATIONMAX)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DELTARESERVATIONMIN)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ELEMENTTYPE)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NOSINGLEPOINTOFFAILURE)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NOSINGLEPOINTOFFAILUREDEFAULT)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PACKAGEREDUNDANCYDEFAULT)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PACKAGEREDUNDANCYMAX)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PACKAGEREDUNDANCYMIN)){
				continue;
			}
			
			CIM_StorageCapabilities.CIM_PropertyList.add(CIM_Capabilities.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Capabilities.Java_Package_List.size(); i++) {
			if (((String)CIM_Capabilities.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Capabilities.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ELEMENTTYPE = {"Unknown","Reserved","Any Type","StorageVolume","StorageExtent","StoragePool","StorageConfigurationService"};
	
	
	public final static int ELEMENTTYPE_UNKNOWN = 0;
	public final static int ELEMENTTYPE_RESERVED = 1;
	public final static int ELEMENTTYPE_ANYTYPE = 2;
	public final static int ELEMENTTYPE_STORAGEVOLUME = 3;
	public final static int ELEMENTTYPE_STORAGEEXTENT = 4;
	public final static int ELEMENTTYPE_STORAGEPOOL = 5;
	public final static int ELEMENTTYPE_STORAGECONFIGURATIONSERVICE = 6;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_StorageCapabilities() {

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
	public CIM_StorageCapabilities(Vector keyProperties){ 
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
	public CIM_StorageCapabilities(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_StorageCapabilities)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_StorageCapabilities)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_StorageCapabilities)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_StorageCapabilities)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_StorageCapabilities)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_StorageCapabilities)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_StorageCapabilities)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_StorageCapabilities)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_StorageCapabilities)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_StorageCapabilities)object).cimObjectPath)) {
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
	
	// Attribute DataRedundancyDefault
	
	public UnsignedInt16 get_DataRedundancyDefault() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageCapabilities.CIM_PROPERTY_DATAREDUNDANCYDEFAULT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_DATAREDUNDANCYDEFAULT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_DATAREDUNDANCYDEFAULT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DataRedundancyDefault(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageCapabilities.CIM_PROPERTY_DATAREDUNDANCYDEFAULT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_DATAREDUNDANCYDEFAULT + " could not be found");
    		
		} else if (!CIM_StorageCapabilitiesHelper.isValid_DataRedundancyDefault(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageCapabilities.CIM_PROPERTY_DATAREDUNDANCYDEFAULT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_DATAREDUNDANCYDEFAULT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DataRedundancyMax
	
	public UnsignedInt16 get_DataRedundancyMax() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageCapabilities.CIM_PROPERTY_DATAREDUNDANCYMAX);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_DATAREDUNDANCYMAX + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_DATAREDUNDANCYMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DataRedundancyMax(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageCapabilities.CIM_PROPERTY_DATAREDUNDANCYMAX);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_DATAREDUNDANCYMAX + " could not be found");
    		
		} else if (!CIM_StorageCapabilitiesHelper.isValid_DataRedundancyMax(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageCapabilities.CIM_PROPERTY_DATAREDUNDANCYMAX);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_DATAREDUNDANCYMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DataRedundancyMin
	
	public UnsignedInt16 get_DataRedundancyMin() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageCapabilities.CIM_PROPERTY_DATAREDUNDANCYMIN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_DATAREDUNDANCYMIN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_DATAREDUNDANCYMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DataRedundancyMin(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageCapabilities.CIM_PROPERTY_DATAREDUNDANCYMIN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_DATAREDUNDANCYMIN + " could not be found");
    		
		} else if (!CIM_StorageCapabilitiesHelper.isValid_DataRedundancyMin(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageCapabilities.CIM_PROPERTY_DATAREDUNDANCYMIN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_DATAREDUNDANCYMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DeltaReservationDefault
	
	public UnsignedInt16 get_DeltaReservationDefault() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageCapabilities.CIM_PROPERTY_DELTARESERVATIONDEFAULT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_DELTARESERVATIONDEFAULT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_DELTARESERVATIONDEFAULT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DeltaReservationDefault(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageCapabilities.CIM_PROPERTY_DELTARESERVATIONDEFAULT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_DELTARESERVATIONDEFAULT + " could not be found");
    		
		} else if (!CIM_StorageCapabilitiesHelper.isValid_DeltaReservationDefault(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageCapabilities.CIM_PROPERTY_DELTARESERVATIONDEFAULT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_DELTARESERVATIONDEFAULT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DeltaReservationMax
	
	public UnsignedInt16 get_DeltaReservationMax() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageCapabilities.CIM_PROPERTY_DELTARESERVATIONMAX);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_DELTARESERVATIONMAX + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_DELTARESERVATIONMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DeltaReservationMax(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageCapabilities.CIM_PROPERTY_DELTARESERVATIONMAX);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_DELTARESERVATIONMAX + " could not be found");
    		
		} else if (!CIM_StorageCapabilitiesHelper.isValid_DeltaReservationMax(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageCapabilities.CIM_PROPERTY_DELTARESERVATIONMAX);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_DELTARESERVATIONMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DeltaReservationMin
	
	public UnsignedInt16 get_DeltaReservationMin() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageCapabilities.CIM_PROPERTY_DELTARESERVATIONMIN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_DELTARESERVATIONMIN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_DELTARESERVATIONMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DeltaReservationMin(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageCapabilities.CIM_PROPERTY_DELTARESERVATIONMIN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_DELTARESERVATIONMIN + " could not be found");
    		
		} else if (!CIM_StorageCapabilitiesHelper.isValid_DeltaReservationMin(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageCapabilities.CIM_PROPERTY_DELTARESERVATIONMIN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_DELTARESERVATIONMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ElementType
	
	public UnsignedInt16 get_ElementType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageCapabilities.CIM_PROPERTY_ELEMENTTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_ELEMENTTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_ELEMENTTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ElementType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageCapabilities.CIM_PROPERTY_ELEMENTTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_ELEMENTTYPE + " could not be found");
    		
		} else if (!CIM_StorageCapabilitiesHelper.isValid_ElementType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageCapabilities.CIM_PROPERTY_ELEMENTTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_ELEMENTTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NoSinglePointOfFailure
	
	public Boolean get_NoSinglePointOfFailure() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageCapabilities.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NoSinglePointOfFailure(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageCapabilities.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE + " could not be found");
    		
		} else if (!CIM_StorageCapabilitiesHelper.isValid_NoSinglePointOfFailure(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageCapabilities.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NoSinglePointOfFailureDefault
	
	public Boolean get_NoSinglePointOfFailureDefault() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageCapabilities.CIM_PROPERTY_NOSINGLEPOINTOFFAILUREDEFAULT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_NOSINGLEPOINTOFFAILUREDEFAULT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_NOSINGLEPOINTOFFAILUREDEFAULT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NoSinglePointOfFailureDefault(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageCapabilities.CIM_PROPERTY_NOSINGLEPOINTOFFAILUREDEFAULT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_NOSINGLEPOINTOFFAILUREDEFAULT + " could not be found");
    		
		} else if (!CIM_StorageCapabilitiesHelper.isValid_NoSinglePointOfFailureDefault(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageCapabilities.CIM_PROPERTY_NOSINGLEPOINTOFFAILUREDEFAULT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_NOSINGLEPOINTOFFAILUREDEFAULT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PackageRedundancyDefault
	
	public UnsignedInt16 get_PackageRedundancyDefault() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageCapabilities.CIM_PROPERTY_PACKAGEREDUNDANCYDEFAULT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_PACKAGEREDUNDANCYDEFAULT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_PACKAGEREDUNDANCYDEFAULT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PackageRedundancyDefault(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageCapabilities.CIM_PROPERTY_PACKAGEREDUNDANCYDEFAULT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_PACKAGEREDUNDANCYDEFAULT + " could not be found");
    		
		} else if (!CIM_StorageCapabilitiesHelper.isValid_PackageRedundancyDefault(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageCapabilities.CIM_PROPERTY_PACKAGEREDUNDANCYDEFAULT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_PACKAGEREDUNDANCYDEFAULT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PackageRedundancyMax
	
	public UnsignedInt16 get_PackageRedundancyMax() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageCapabilities.CIM_PROPERTY_PACKAGEREDUNDANCYMAX);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_PACKAGEREDUNDANCYMAX + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_PACKAGEREDUNDANCYMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PackageRedundancyMax(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageCapabilities.CIM_PROPERTY_PACKAGEREDUNDANCYMAX);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_PACKAGEREDUNDANCYMAX + " could not be found");
    		
		} else if (!CIM_StorageCapabilitiesHelper.isValid_PackageRedundancyMax(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageCapabilities.CIM_PROPERTY_PACKAGEREDUNDANCYMAX);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_PACKAGEREDUNDANCYMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PackageRedundancyMin
	
	public UnsignedInt16 get_PackageRedundancyMin() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageCapabilities.CIM_PROPERTY_PACKAGEREDUNDANCYMIN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_PACKAGEREDUNDANCYMIN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_PACKAGEREDUNDANCYMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PackageRedundancyMin(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageCapabilities.CIM_PROPERTY_PACKAGEREDUNDANCYMIN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_PACKAGEREDUNDANCYMIN + " could not be found");
    		
		} else if (!CIM_StorageCapabilitiesHelper.isValid_PackageRedundancyMin(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageCapabilities.CIM_PROPERTY_PACKAGEREDUNDANCYMIN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageCapabilities.CIM_PROPERTY_PACKAGEREDUNDANCYMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt32 invoke_createSetting(CIMClient cimClient, UnsignedInt16 SettingType, CIM_StorageSetting NewSetting) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_StorageCapabilities.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_SettingType = new CIMValue(SettingType, new CIMDataType(CIMDataType.UINT16));
		CIMValue cimValue_NewSetting = new CIMValue(NewSetting.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("SettingType", cimValue_SettingType));
		inParameter.add(new CIMArgument("NewSetting", cimValue_NewSetting));
		
	  	outParameter.add(new CIMArgument("NewSetting", cimValue_NewSetting));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_CREATESETTING,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_StorageCapabilities.CIM_METHOD_CREATESETTING + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_StorageCapabilities.CIM_METHOD_CREATESETTING + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_StorageCapabilities.CIM_METHOD_CREATESETTING + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
