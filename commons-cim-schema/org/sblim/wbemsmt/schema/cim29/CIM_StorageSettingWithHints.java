/** 
 * CIM_StorageSettingWithHints.java
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
 * Description: This subclass of StorageSetting allows a client to specify 'hint's for optimization of the volume performance. The effect of these hints is implementation dependent.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_StorageSettingWithHints extends CIM_StorageSetting  {
	
	public final static String CIM_CLASS_NAME = "CIM_StorageSettingWithHints";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.1";
	
	
	/**
	*	This hint is an indication from a client of bandwidth prioritization. Values are 0=Don't Care to 10=Very Important.
	*/
	public final static String CIM_PROPERTY_ACCESSBANDWIDTHWEIGHT = "AccessBandwidthWeight"; //$NON-NLS-1$
	/**
	*	This hint is an indication from a client of the direction of accesses. Values are 0=Entirely Read to 10=Entirely Write.
	*/
	public final static String CIM_PROPERTY_ACCESSDIRECTIONHINT = "AccessDirectionHint"; //$NON-NLS-1$
	/**
	*	This hint is an indication from a client how important access latency is. Values are 0=Don't Care to 10=Very Important.
	*/
	public final static String CIM_PROPERTY_ACCESSLATENCYHINT = "AccessLatencyHint"; //$NON-NLS-1$
	/**
	*	This hint is an indication from a client of the randomness of accesses. Values are 0=Entirely Sequential to 10=Entirely Random.
	*/
	public final static String CIM_PROPERTY_ACCESSRANDOMNESSHINT = "AccessRandomnessHint"; //$NON-NLS-1$
	/**
	*	This hint is an indication from a client of the optimal access sizes (in bytes). Since this property is an array, several sizes can be specified.
	*/
	public final static String CIM_PROPERTY_ACCESSSIZEHINT = "AccessSizeHint"; //$NON-NLS-1$
	/**
	*	This hint is an indication from a client of the importance placed on data availability. Values are 0=Don't Care to 10=Very Important.
	*/
	public final static String CIM_PROPERTY_DATAAVAILABILITYHINT = "DataAvailabilityHint"; //$NON-NLS-1$
	/**
	*	This hint is an indication of the importance the client places on the cost of storage. Values are 0=Don't Care to 10=Very Important. A StorageVolume provider might choose to place data on low cost or high cost drives based on this parameter.
	*/
	public final static String CIM_PROPERTY_STORAGECOSTHINT = "StorageCostHint"; //$NON-NLS-1$
	/**
	*	This hint is an indication of the importance placed on storage space efficiency by the client. Values are 0=Don't Care to 10=Very Important. A StorageVolume provider might choose different RAID levels based on this hint.
	*/
	public final static String CIM_PROPERTY_STORAGEEFFICIENCYHINT = "StorageEfficiencyHint"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ACCESSBANDWIDTHWEIGHT);
		CIM_PropertyNameList.add(CIM_PROPERTY_ACCESSDIRECTIONHINT);
		CIM_PropertyNameList.add(CIM_PROPERTY_ACCESSLATENCYHINT);
		CIM_PropertyNameList.add(CIM_PROPERTY_ACCESSRANDOMNESSHINT);
		CIM_PropertyNameList.add(CIM_PROPERTY_ACCESSSIZEHINT);
		CIM_PropertyNameList.add(CIM_PROPERTY_DATAAVAILABILITYHINT);
		CIM_PropertyNameList.add(CIM_PROPERTY_STORAGECOSTHINT);
		CIM_PropertyNameList.add(CIM_PROPERTY_STORAGEEFFICIENCYHINT);
				
		for (int i = 0; i < CIM_StorageSetting.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_StorageSetting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACCESSBANDWIDTHWEIGHT)||
				((String)CIM_StorageSetting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACCESSDIRECTIONHINT)||
				((String)CIM_StorageSetting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACCESSLATENCYHINT)||
				((String)CIM_StorageSetting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACCESSRANDOMNESSHINT)||
				((String)CIM_StorageSetting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACCESSSIZEHINT)||
				((String)CIM_StorageSetting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DATAAVAILABILITYHINT)||
				((String)CIM_StorageSetting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STORAGECOSTHINT)||
				((String)CIM_StorageSetting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STORAGEEFFICIENCYHINT)){
				continue;
			}
			
			CIM_StorageSettingWithHints.CIM_PropertyNameList.add(CIM_StorageSetting.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACCESSBANDWIDTHWEIGHT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACCESSDIRECTIONHINT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACCESSLATENCYHINT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACCESSRANDOMNESSHINT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACCESSSIZEHINT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DATAAVAILABILITYHINT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STORAGECOSTHINT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STORAGEEFFICIENCYHINT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_StorageSetting.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_StorageSetting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACCESSBANDWIDTHWEIGHT)||
				((CIMProperty)CIM_StorageSetting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACCESSDIRECTIONHINT)||
				((CIMProperty)CIM_StorageSetting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACCESSLATENCYHINT)||
				((CIMProperty)CIM_StorageSetting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACCESSRANDOMNESSHINT)||
				((CIMProperty)CIM_StorageSetting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACCESSSIZEHINT)||
				((CIMProperty)CIM_StorageSetting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DATAAVAILABILITYHINT)||
				((CIMProperty)CIM_StorageSetting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STORAGECOSTHINT)||
				((CIMProperty)CIM_StorageSetting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STORAGEEFFICIENCYHINT)){
				continue;
			}
			
			CIM_StorageSettingWithHints.CIM_PropertyList.add(CIM_StorageSetting.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_StorageSetting.Java_Package_List.size(); i++) {
			if (((String)CIM_StorageSetting.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_StorageSetting.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_StorageSettingWithHints() {

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
	public CIM_StorageSettingWithHints(Vector keyProperties){ 
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
	public CIM_StorageSettingWithHints(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_StorageSettingWithHints)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_StorageSettingWithHints)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_StorageSettingWithHints)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_StorageSettingWithHints)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_StorageSettingWithHints)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_StorageSettingWithHints)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_StorageSettingWithHints)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_StorageSettingWithHints)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_StorageSettingWithHints)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_StorageSettingWithHints)object).cimObjectPath)) {
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
	
	// Attribute AccessBandwidthWeight
	
	public UnsignedInt16 get_AccessBandwidthWeight() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSBANDWIDTHWEIGHT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSBANDWIDTHWEIGHT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSBANDWIDTHWEIGHT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AccessBandwidthWeight(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSBANDWIDTHWEIGHT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSBANDWIDTHWEIGHT + " could not be found");
    		
		} else if (!CIM_StorageSettingWithHintsHelper.isValid_AccessBandwidthWeight(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSBANDWIDTHWEIGHT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSBANDWIDTHWEIGHT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AccessDirectionHint
	
	public UnsignedInt16 get_AccessDirectionHint() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSDIRECTIONHINT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSDIRECTIONHINT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSDIRECTIONHINT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AccessDirectionHint(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSDIRECTIONHINT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSDIRECTIONHINT + " could not be found");
    		
		} else if (!CIM_StorageSettingWithHintsHelper.isValid_AccessDirectionHint(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSDIRECTIONHINT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSDIRECTIONHINT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AccessLatencyHint
	
	public UnsignedInt16 get_AccessLatencyHint() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSLATENCYHINT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSLATENCYHINT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSLATENCYHINT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AccessLatencyHint(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSLATENCYHINT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSLATENCYHINT + " could not be found");
    		
		} else if (!CIM_StorageSettingWithHintsHelper.isValid_AccessLatencyHint(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSLATENCYHINT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSLATENCYHINT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AccessRandomnessHint
	
	public UnsignedInt16 get_AccessRandomnessHint() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSRANDOMNESSHINT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSRANDOMNESSHINT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSRANDOMNESSHINT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AccessRandomnessHint(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSRANDOMNESSHINT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSRANDOMNESSHINT + " could not be found");
    		
		} else if (!CIM_StorageSettingWithHintsHelper.isValid_AccessRandomnessHint(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSRANDOMNESSHINT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSRANDOMNESSHINT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AccessSizeHint
	
	public UnsignedInt16[] get_AccessSizeHint() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSSIZEHINT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSSIZEHINT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSSIZEHINT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_AccessSizeHint(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSSIZEHINT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSSIZEHINT + " could not be found");
    		
		} else if (!CIM_StorageSettingWithHintsHelper.isValid_AccessSizeHint(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSSIZEHINT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_ACCESSSIZEHINT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DataAvailabilityHint
	
	public UnsignedInt16 get_DataAvailabilityHint() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSettingWithHints.CIM_PROPERTY_DATAAVAILABILITYHINT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_DATAAVAILABILITYHINT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_DATAAVAILABILITYHINT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DataAvailabilityHint(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSettingWithHints.CIM_PROPERTY_DATAAVAILABILITYHINT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_DATAAVAILABILITYHINT + " could not be found");
    		
		} else if (!CIM_StorageSettingWithHintsHelper.isValid_DataAvailabilityHint(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSettingWithHints.CIM_PROPERTY_DATAAVAILABILITYHINT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_DATAAVAILABILITYHINT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute StorageCostHint
	
	public UnsignedInt16 get_StorageCostHint() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSettingWithHints.CIM_PROPERTY_STORAGECOSTHINT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_STORAGECOSTHINT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_STORAGECOSTHINT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_StorageCostHint(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSettingWithHints.CIM_PROPERTY_STORAGECOSTHINT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_STORAGECOSTHINT + " could not be found");
    		
		} else if (!CIM_StorageSettingWithHintsHelper.isValid_StorageCostHint(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSettingWithHints.CIM_PROPERTY_STORAGECOSTHINT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_STORAGECOSTHINT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute StorageEfficiencyHint
	
	public UnsignedInt16 get_StorageEfficiencyHint() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSettingWithHints.CIM_PROPERTY_STORAGEEFFICIENCYHINT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_STORAGEEFFICIENCYHINT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_STORAGEEFFICIENCYHINT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_StorageEfficiencyHint(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageSettingWithHints.CIM_PROPERTY_STORAGEEFFICIENCYHINT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_STORAGEEFFICIENCYHINT + " could not be found");
    		
		} else if (!CIM_StorageSettingWithHintsHelper.isValid_StorageEfficiencyHint(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageSettingWithHints.CIM_PROPERTY_STORAGEEFFICIENCYHINT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageSettingWithHints.CIM_PROPERTY_STORAGEEFFICIENCYHINT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
