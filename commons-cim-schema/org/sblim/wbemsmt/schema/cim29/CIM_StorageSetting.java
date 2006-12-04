/** 
 * CIM_StorageSetting.java
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
 * Description: StorageSetting is roughly equivalent to a Service Level Agreement (SLA) It defines the characteristics, qualities of service and goals when used in a CreateOrModifyElement FromStoragePool or CreateOrModifyStoragePool method in the StorageConfigurationService. It specifies a series of properties with Maximum and Minimum values that define the (inclusive) bounds that the object should maintain. Note that the setting is associated to a StorageVolume, using ElementSetting.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_StorageSetting extends CIM_SettingData  {
	
	public final static String CIM_CLASS_NAME = "CIM_StorageSetting";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	DataRedundancyGoal describes the desired number of complete copies of data to be maintained. Examples would be RAID 5 where 1 copy is maintained and RAID 1 where 2 or more copies are maintained. Possible values are 1 to n. The bounds (max and min) for redundancy are defined using the properties, DataRedundancyMax and DataRedundancyMin.
	*/
	public final static String CIM_PROPERTY_DATAREDUNDANCYGOAL = "DataRedundancyGoal"; //$NON-NLS-1$
	/**
	*	DataRedundancyMax describes the maximum number of complete copies of data to be maintained. Examples would be RAID 5 where 1 copy is maintained and RAID 1 where 2 or more copies are maintained. Possible values are 1 to n. The desired redundancy is specified using DataRedundancyGoal, while the minimum is defined by DataRedundancyMin.
	*/
	public final static String CIM_PROPERTY_DATAREDUNDANCYMAX = "DataRedundancyMax"; //$NON-NLS-1$
	/**
	*	DataRedundancyMin describes the minimum number of complete copies of data to be maintained. Examples would be RAID 5 where 1 copy is maintained and RAID 1 where 2 or more copies are maintained. Possible values are 1 to n. The desired redundancy is specified using DataRedundancyGoal, while the maximum is defined by DataRedundancyMax.
	*/
	public final static String CIM_PROPERTY_DATAREDUNDANCYMIN = "DataRedundancyMin"; //$NON-NLS-1$
	/**
	*	DeltaReservationGoal is a number between 1 (1%) and a 100 (100%) which specifies the desired amount of space that should be reserved in a replica for caching changes. For a complete copy this would be 100%. The bounds (max and min) for the reservation are defined using the properties, DeltaReservationMax and DeltaReservationMin.
	*/
	public final static String CIM_PROPERTY_DELTARESERVATIONGOAL = "DeltaReservationGoal"; //$NON-NLS-1$
	/**
	*	DeltaReservationMax is a number between 1 (1%) and a 100 (100%) which specifies the maximum amount of space that should be reserved in a replica for caching changes. For a complete copy this would be 100%. The desired reservation is specified using DeltaReservationGoal, while the minimum is defined by DeltaReservationMin.
	*/
	public final static String CIM_PROPERTY_DELTARESERVATIONMAX = "DeltaReservationMax"; //$NON-NLS-1$
	/**
	*	DeltaReservationMin is a number between 1 (1%) and a 100 (100%) which specifies the minimum amount of space that should be reserved in a replica for caching changes. For a complete copy this would be 100%. The desired reservation is specified using DeltaReservationGoal, while the maximum is defined by DeltaReservationMax.
	*/
	public final static String CIM_PROPERTY_DELTARESERVATIONMIN = "DeltaReservationMin"; //$NON-NLS-1$
	/**
	*	Indicates the desired value for No Single Point of Failure. Possible values are false = single point of failure, and true = no single point of failure.
	*/
	public final static String CIM_PROPERTY_NOSINGLEPOINTOFFAILURE = "NoSinglePointOfFailure"; //$NON-NLS-1$
	/**
	*	PackageRedundancyGoal describes the desired number of redundant packages to be used. For example, in the storage domain, package redundancy describes how many disk spindles can fail without data loss including, at most, one spare. An example would be RAID5 with a spare disk which would have a PackageRedundancy of 2. Possible values are 0 to n. The bounds (max and min) for redundancy are defined using the properties, PackageRedundancyMax and PackageRedundancyMin.
	*/
	public final static String CIM_PROPERTY_PACKAGEREDUNDANCYGOAL = "PackageRedundancyGoal"; //$NON-NLS-1$
	/**
	*	PackageRedundancyMax describes the maximum number of redundant packages to be used. For example, in the storage domain, package redundancy describes how many disk spindles can fail without data loss including, at most, one spare. An example would be RAID5 with a spare disk which would have a PackageRedundancy of 2. Possible values are 0 to n. The desired redundancy is specified using PackageRedundancyGoal, while the minimum is defined by PackageRedundancyMin.
	*/
	public final static String CIM_PROPERTY_PACKAGEREDUNDANCYMAX = "PackageRedundancyMax"; //$NON-NLS-1$
	/**
	*	PackageRedundancyMin describes the minimum number of redundant packages to be used. For example, in the storage domain, package redundancy describes how many disk spindles can fail without data loss including, at most, one spare. An example would be RAID5 with a spare disk which would have a PackageRedundancy of 2. Possible values are 0 to n. The desired redundancy is specified using PackageRedundancyGoal, while the maximum is defined by PackageRedundancyMax.
	*/
	public final static String CIM_PROPERTY_PACKAGEREDUNDANCYMIN = "PackageRedundancyMin"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DATAREDUNDANCYGOAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_DATAREDUNDANCYMAX);
		CIM_PropertyNameList.add(CIM_PROPERTY_DATAREDUNDANCYMIN);
		CIM_PropertyNameList.add(CIM_PROPERTY_DELTARESERVATIONGOAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_DELTARESERVATIONMAX);
		CIM_PropertyNameList.add(CIM_PROPERTY_DELTARESERVATIONMIN);
		CIM_PropertyNameList.add(CIM_PROPERTY_NOSINGLEPOINTOFFAILURE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PACKAGEREDUNDANCYGOAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_PACKAGEREDUNDANCYMAX);
		CIM_PropertyNameList.add(CIM_PROPERTY_PACKAGEREDUNDANCYMIN);
				
		for (int i = 0; i < CIM_SettingData.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DATAREDUNDANCYGOAL)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DATAREDUNDANCYMAX)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DATAREDUNDANCYMIN)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DELTARESERVATIONGOAL)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DELTARESERVATIONMAX)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DELTARESERVATIONMIN)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NOSINGLEPOINTOFFAILURE)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PACKAGEREDUNDANCYGOAL)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PACKAGEREDUNDANCYMAX)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PACKAGEREDUNDANCYMIN)){
				continue;
			}
			
			CIM_StorageSetting.CIM_PropertyNameList.add(CIM_SettingData.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DATAREDUNDANCYGOAL, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DATAREDUNDANCYMAX, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DATAREDUNDANCYMIN, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DELTARESERVATIONGOAL, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DELTARESERVATIONMAX, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DELTARESERVATIONMIN, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NOSINGLEPOINTOFFAILURE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PACKAGEREDUNDANCYGOAL, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PACKAGEREDUNDANCYMAX, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PACKAGEREDUNDANCYMIN, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_SettingData.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DATAREDUNDANCYGOAL)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DATAREDUNDANCYMAX)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DATAREDUNDANCYMIN)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DELTARESERVATIONGOAL)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DELTARESERVATIONMAX)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DELTARESERVATIONMIN)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NOSINGLEPOINTOFFAILURE)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PACKAGEREDUNDANCYGOAL)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PACKAGEREDUNDANCYMAX)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PACKAGEREDUNDANCYMIN)){
				continue;
			}
			
			CIM_StorageSetting.CIM_PropertyList.add(CIM_SettingData.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_SettingData.Java_Package_List.size(); i++) {
			if (((String)CIM_SettingData.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_SettingData.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_StorageSetting() {

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
	public CIM_StorageSetting(Vector keyProperties){ 
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
	public CIM_StorageSetting(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_StorageSetting)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_StorageSetting)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_StorageSetting)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_StorageSetting)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_StorageSetting)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_StorageSetting)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_StorageSetting)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_StorageSetting)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_StorageSetting)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_StorageSetting)object).cimObjectPath)) {
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
	
	// Attribute DataRedundancyGoal
	
	public UnsignedInt16 get_DataRedundancyGoal() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYGOAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYGOAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYGOAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DataRedundancyGoal(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYGOAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYGOAL + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_DataRedundancyGoal(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYGOAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYGOAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DataRedundancyMax
	
	public UnsignedInt16 get_DataRedundancyMax() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMAX);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMAX + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DataRedundancyMax(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMAX);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMAX + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_DataRedundancyMax(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMAX);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DataRedundancyMin
	
	public UnsignedInt16 get_DataRedundancyMin() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMIN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMIN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DataRedundancyMin(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMIN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMIN + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_DataRedundancyMin(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMIN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_DATAREDUNDANCYMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DeltaReservationGoal
	
	public UnsignedInt8 get_DeltaReservationGoal() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONGOAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONGOAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONGOAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DeltaReservationGoal(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONGOAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONGOAL + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_DeltaReservationGoal(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONGOAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONGOAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DeltaReservationMax
	
	public UnsignedInt8 get_DeltaReservationMax() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMAX);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMAX + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DeltaReservationMax(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMAX);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMAX + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_DeltaReservationMax(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMAX);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DeltaReservationMin
	
	public UnsignedInt8 get_DeltaReservationMin() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMIN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMIN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DeltaReservationMin(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMIN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMIN + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_DeltaReservationMin(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMIN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_DELTARESERVATIONMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NoSinglePointOfFailure
	
	public Boolean get_NoSinglePointOfFailure() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NoSinglePointOfFailure(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_NoSinglePointOfFailure(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_NOSINGLEPOINTOFFAILURE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PackageRedundancyGoal
	
	public UnsignedInt16 get_PackageRedundancyGoal() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYGOAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYGOAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYGOAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PackageRedundancyGoal(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYGOAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYGOAL + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_PackageRedundancyGoal(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYGOAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYGOAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PackageRedundancyMax
	
	public UnsignedInt16 get_PackageRedundancyMax() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMAX);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMAX + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PackageRedundancyMax(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMAX);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMAX + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_PackageRedundancyMax(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMAX);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMAX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PackageRedundancyMin
	
	public UnsignedInt16 get_PackageRedundancyMin() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMIN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMIN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PackageRedundancyMin(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMIN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMIN + " could not be found");
    		
		} else if (!CIM_StorageSettingHelper.isValid_PackageRedundancyMin(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMIN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSetting.CIM_PROPERTY_PACKAGEREDUNDANCYMIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
