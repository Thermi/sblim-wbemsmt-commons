/** 
 * CIM_DatabaseSegmentSettingData.java
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
 * Description: This class defines the attributes that affect the growth of a DatabaseSegment. The attributes are tied to the DatabaseSegment through an ElementSettingData association. This class may also be used to specify the default settings for all DatabaseSegment instances created within a CommonDatabase through an ElementSettingData association to the CommonDatabase. Processes that create new instances of DatabaseSegment and the associated setting data should check for a DatabaseSegmentSettingData instance associated with the CommonDatabase and should only create a new instance of DatabaseSegmentSettingData specific to the DatabaseSegment if the default settings need to be overridden or frozen for the specific DatabaseSegment instance.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_DatabaseSegmentSettingData extends CIM_ScopedSettingData  {
	
	public final static String CIM_CLASS_NAME = "CIM_DatabaseSegmentSettingData";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	The size, in bytes, of the first extent to be allocated when a database segment is created.
	*/
	public final static String CIM_PROPERTY_INITIALEXTENTSIZE = "InitialExtentSize"; //$NON-NLS-1$
	/**
	*	The upper limit on the number of extents that can be allocated for the segment.
	*/
	public final static String CIM_PROPERTY_MAXIMUMEXTENTS = "MaximumExtents"; //$NON-NLS-1$
	/**
	*	The total number of extents to be allocated when the database segment is created. This setting allows for a large initial segment allocation at creation time, even if contiguous space is not available.
	*/
	public final static String CIM_PROPERTY_MINIMUMEXTENTS = "MinimumExtents"; //$NON-NLS-1$
	/**
	*	The size, in bytes, to be allocated for the next incremental extent for the segment. A NextExtentSize of 0 indicates that the size of incremental extents will be determined based on the value of PercentIncrease.
	*/
	public final static String CIM_PROPERTY_NEXTEXTENTSIZE = "NextExtentSize"; //$NON-NLS-1$
	/**
	*	A freelist is a list of the free blocks that are associated with a database segment. The freelist is used to determine which segments are eligible for accepting data when a new insert or update request is processed. The NumberOfFreeLists setting identifies the number of freelists that are defined for the database segment. This value is typically set to the expected number of concurrent inserts for the segment.
	*/
	public final static String CIM_PROPERTY_NUMBEROFFREELISTS = "NumberOfFreeLists"; //$NON-NLS-1$
	/**
	*	The percentage by which the next incremental extent will grow over the previously allocated size of all extents for the segment. A PercentIncrease of 0 indicates that all incremental extents will be the same size, as specified by NextExtentSize. This value is ignored and should be set to 0 if NextExtentSize has a value other than 0.
	*/
	public final static String CIM_PROPERTY_PERCENTINCREASE = "PercentIncrease"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_INITIALEXTENTSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXIMUMEXTENTS);
		CIM_PropertyNameList.add(CIM_PROPERTY_MINIMUMEXTENTS);
		CIM_PropertyNameList.add(CIM_PROPERTY_NEXTEXTENTSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_NUMBEROFFREELISTS);
		CIM_PropertyNameList.add(CIM_PROPERTY_PERCENTINCREASE);
				
		for (int i = 0; i < CIM_ScopedSettingData.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ScopedSettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INITIALEXTENTSIZE)||
				((String)CIM_ScopedSettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXIMUMEXTENTS)||
				((String)CIM_ScopedSettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MINIMUMEXTENTS)||
				((String)CIM_ScopedSettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NEXTEXTENTSIZE)||
				((String)CIM_ScopedSettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NUMBEROFFREELISTS)||
				((String)CIM_ScopedSettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PERCENTINCREASE)){
				continue;
			}
			
			CIM_DatabaseSegmentSettingData.CIM_PropertyNameList.add(CIM_ScopedSettingData.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INITIALEXTENTSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXIMUMEXTENTS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MINIMUMEXTENTS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NEXTEXTENTSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NUMBEROFFREELISTS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PERCENTINCREASE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_ScopedSettingData.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ScopedSettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INITIALEXTENTSIZE)||
				((CIMProperty)CIM_ScopedSettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXIMUMEXTENTS)||
				((CIMProperty)CIM_ScopedSettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MINIMUMEXTENTS)||
				((CIMProperty)CIM_ScopedSettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NEXTEXTENTSIZE)||
				((CIMProperty)CIM_ScopedSettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NUMBEROFFREELISTS)||
				((CIMProperty)CIM_ScopedSettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PERCENTINCREASE)){
				continue;
			}
			
			CIM_DatabaseSegmentSettingData.CIM_PropertyList.add(CIM_ScopedSettingData.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_ScopedSettingData.Java_Package_List.size(); i++) {
			if (((String)CIM_ScopedSettingData.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_ScopedSettingData.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_DatabaseSegmentSettingData() {

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
	public CIM_DatabaseSegmentSettingData(Vector keyProperties){ 
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
	public CIM_DatabaseSegmentSettingData(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_DatabaseSegmentSettingData)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_DatabaseSegmentSettingData)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_DatabaseSegmentSettingData)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_DatabaseSegmentSettingData)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_DatabaseSegmentSettingData)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_DatabaseSegmentSettingData)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_DatabaseSegmentSettingData)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_DatabaseSegmentSettingData)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_DatabaseSegmentSettingData)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_DatabaseSegmentSettingData)object).cimObjectPath)) {
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
	
	// Attribute InitialExtentSize
	
	public UnsignedInt64 get_InitialExtentSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseSegmentSettingData.CIM_PROPERTY_INITIALEXTENTSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_INITIALEXTENTSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_INITIALEXTENTSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InitialExtentSize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseSegmentSettingData.CIM_PROPERTY_INITIALEXTENTSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_INITIALEXTENTSIZE + " could not be found");
    		
		} else if (!CIM_DatabaseSegmentSettingDataHelper.isValid_InitialExtentSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_INITIALEXTENTSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_INITIALEXTENTSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaximumExtents
	
	public UnsignedInt64 get_MaximumExtents() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseSegmentSettingData.CIM_PROPERTY_MAXIMUMEXTENTS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_MAXIMUMEXTENTS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_MAXIMUMEXTENTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaximumExtents(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseSegmentSettingData.CIM_PROPERTY_MAXIMUMEXTENTS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_MAXIMUMEXTENTS + " could not be found");
    		
		} else if (!CIM_DatabaseSegmentSettingDataHelper.isValid_MaximumExtents(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_MAXIMUMEXTENTS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_MAXIMUMEXTENTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MinimumExtents
	
	public UnsignedInt64 get_MinimumExtents() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseSegmentSettingData.CIM_PROPERTY_MINIMUMEXTENTS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_MINIMUMEXTENTS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_MINIMUMEXTENTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MinimumExtents(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseSegmentSettingData.CIM_PROPERTY_MINIMUMEXTENTS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_MINIMUMEXTENTS + " could not be found");
    		
		} else if (!CIM_DatabaseSegmentSettingDataHelper.isValid_MinimumExtents(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_MINIMUMEXTENTS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_MINIMUMEXTENTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NextExtentSize
	
	public UnsignedInt64 get_NextExtentSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseSegmentSettingData.CIM_PROPERTY_NEXTEXTENTSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_NEXTEXTENTSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_NEXTEXTENTSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NextExtentSize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseSegmentSettingData.CIM_PROPERTY_NEXTEXTENTSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_NEXTEXTENTSIZE + " could not be found");
    		
		} else if (!CIM_DatabaseSegmentSettingDataHelper.isValid_NextExtentSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_NEXTEXTENTSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_NEXTEXTENTSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NumberOfFreeLists
	
	public UnsignedInt32 get_NumberOfFreeLists() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseSegmentSettingData.CIM_PROPERTY_NUMBEROFFREELISTS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_NUMBEROFFREELISTS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_NUMBEROFFREELISTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NumberOfFreeLists(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseSegmentSettingData.CIM_PROPERTY_NUMBEROFFREELISTS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_NUMBEROFFREELISTS + " could not be found");
    		
		} else if (!CIM_DatabaseSegmentSettingDataHelper.isValid_NumberOfFreeLists(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_NUMBEROFFREELISTS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_NUMBEROFFREELISTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PercentIncrease
	
	public UnsignedInt16 get_PercentIncrease() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseSegmentSettingData.CIM_PROPERTY_PERCENTINCREASE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_PERCENTINCREASE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_PERCENTINCREASE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PercentIncrease(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DatabaseSegmentSettingData.CIM_PROPERTY_PERCENTINCREASE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_PERCENTINCREASE + " could not be found");
    		
		} else if (!CIM_DatabaseSegmentSettingDataHelper.isValid_PercentIncrease(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_PERCENTINCREASE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DatabaseSegmentSettingData.CIM_PROPERTY_PERCENTINCREASE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
