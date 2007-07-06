/** 
 * CIM_ProtectedExtentBasedOn.java
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
 * Description:  Protected StorageExtents map to an underlying StorageExtent. This mapping
 * includes information about the placement of check data on the underlying
 * extent. The mapping is made explicit in this association.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


/**
 *  Protected StorageExtents map to an underlying StorageExtent. This mapping
 * includes information about the placement of check data on the underlying
 * extent. The mapping is made explicit in this association.
 */
public class CIM_ProtectedExtentBasedOn extends CIM_BasedOn  {
	
	public final static String CIM_CLASS_NAME = "CIM_ProtectedExtentBasedOn"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_PROPERTY_CIM_STORAGEEXTENT_1 = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_STORAGEEXTENT_2 = "Dependent"; //$NON-NLS-1$
	
	
	/**
	*	The block size of the protected space. Note that this is limited by the Antecedent->BlockSize. In SCC, this is equivalent to the NUMBER OF BYTES PER LBA_P field in the Redundancy Group P_Extent Descriptor.
	*/
	public final static String CIM_PROPERTY_BLOCKSIZE = "BlockSize"; //$NON-NLS-1$
	/**
	*	The size of the protected space. Note that this is limited by the Antecedent->NumberOfBlocks, but is included explicitly to provide for the DMTF MIF mapping. In SCC, this is equivalent to the NUMBER OF LBA_P(s) field in the Redundancy Group P_Extent Descriptor.
	*/
	public final static String CIM_PROPERTY_NUMBEROFBLOCKS = "NumberOfBlocks"; //$NON-NLS-1$
	/**
	*	The starting logical block address of the underlying StorageExtent from which this protected StorageExtent is derived. In SCC, this is equivalent to the START LBA_P field in the Redundancy Group P_Extent Descriptor.
	*/
	public final static String CIM_PROPERTY_STARTINGADDRESS = "StartingAddress"; //$NON-NLS-1$
	/**
	*	Number of bytes of user data to skip before starting the check data interleave.
	*/
	public final static String CIM_PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE = "UnitsBeforeCheckDataInterleave"; //$NON-NLS-1$
	/**
	*	Number of bytes to be reserved for check data.
	*/
	public final static String CIM_PROPERTY_UNITSOFCHECKDATA = "UnitsOfCheckData"; //$NON-NLS-1$
	/**
	*	Number of bytes to be reserved for user data.
	*/
	public final static String CIM_PROPERTY_UNITSOFUSERDATA = "UnitsOfUserData"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_BLOCKSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_NUMBEROFBLOCKS);
		CIM_PropertyNameList.add(CIM_PROPERTY_STARTINGADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE);
		CIM_PropertyNameList.add(CIM_PROPERTY_UNITSOFCHECKDATA);
		CIM_PropertyNameList.add(CIM_PROPERTY_UNITSOFUSERDATA);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_STORAGEEXTENT_1);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_STORAGEEXTENT_2);
				
		for (int i = 0; i < CIM_BasedOn.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_BasedOn.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BLOCKSIZE)||
				((String)CIM_BasedOn.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NUMBEROFBLOCKS)||
				((String)CIM_BasedOn.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STARTINGADDRESS)||
				((String)CIM_BasedOn.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE)||
				((String)CIM_BasedOn.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UNITSOFCHECKDATA)||
				((String)CIM_BasedOn.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UNITSOFUSERDATA)){
				continue;
			}
			
			CIM_ProtectedExtentBasedOn.CIM_PropertyNameList.add(CIM_BasedOn.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BLOCKSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NUMBEROFBLOCKS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STARTINGADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UNITSOFCHECKDATA, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UNITSOFUSERDATA, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_STORAGEEXTENT_1, new CIMValue(null, new CIMDataType(CIM_StorageExtent.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_STORAGEEXTENT_2, new CIMValue(null, new CIMDataType(CIM_StorageExtent.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_BasedOn.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_BasedOn.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BLOCKSIZE)||
				((CIMProperty)CIM_BasedOn.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NUMBEROFBLOCKS)||
				((CIMProperty)CIM_BasedOn.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STARTINGADDRESS)||
				((CIMProperty)CIM_BasedOn.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE)||
				((CIMProperty)CIM_BasedOn.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UNITSOFCHECKDATA)||
				((CIMProperty)CIM_BasedOn.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UNITSOFUSERDATA)){
				continue;
			}
			
			CIM_ProtectedExtentBasedOn.CIM_PropertyList.add(CIM_BasedOn.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim29");
				
		String[] parentClassPackageList = CIM_BasedOn.getPackages();
		
		for (int i = 0; i < parentClassPackageList.length; i++) {
			Java_Package_List.add(parentClassPackageList[i]);
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ProtectedExtentBasedOn() {

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
	public CIM_ProtectedExtentBasedOn(Vector keyProperties){ 
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
	public CIM_ProtectedExtentBasedOn(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
		if (cimInstance == null) {
			throw new InvalidParameterException("The cimInstance parameter does not contain a valid reference.");
		
		} else if (cimObjectPath == null){
			throw new InvalidParameterException("The cimObjectPath parameter does not contain a valid reference.");		
		
		} else if (!cimObjectPath.getObjectName().equals(cimInstance.getClassName())) {
			throw new InvalidParameterException("The class name of the instance and the ObjectPath are not the same.");
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
	
	public static void addPackage(String packagename) {
        if (packagename != null) {
            if (!packagename.endsWith(".")) {
                packagename = packagename + ".";
            }
            CIM_ProtectedExtentBasedOn.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_ProtectedExtentBasedOn.Java_Package_List.toArray(new String[CIM_ProtectedExtentBasedOn.Java_Package_List.size()]);
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
	    
	    if (!(object instanceof CIM_ProtectedExtentBasedOn)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ProtectedExtentBasedOn)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ProtectedExtentBasedOn)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ProtectedExtentBasedOn)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ProtectedExtentBasedOn)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ProtectedExtentBasedOn)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ProtectedExtentBasedOn)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ProtectedExtentBasedOn)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ProtectedExtentBasedOn)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ProtectedExtentBasedOn)object).cimObjectPath)) {
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
	
	// Attribute BlockSize
	
	public UnsignedInt64 get_BlockSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtectedExtentBasedOn.CIM_PROPERTY_BLOCKSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_BLOCKSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_BLOCKSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BlockSize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtectedExtentBasedOn.CIM_PROPERTY_BLOCKSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_BLOCKSIZE + " could not be found");
    		
		} else if (!CIM_ProtectedExtentBasedOnHelper.isValid_BlockSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_BLOCKSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_BLOCKSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NumberOfBlocks
	
	public UnsignedInt64 get_NumberOfBlocks() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtectedExtentBasedOn.CIM_PROPERTY_NUMBEROFBLOCKS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_NUMBEROFBLOCKS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_NUMBEROFBLOCKS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NumberOfBlocks(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtectedExtentBasedOn.CIM_PROPERTY_NUMBEROFBLOCKS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_NUMBEROFBLOCKS + " could not be found");
    		
		} else if (!CIM_ProtectedExtentBasedOnHelper.isValid_NumberOfBlocks(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_NUMBEROFBLOCKS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_NUMBEROFBLOCKS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute StartingAddress
	
	public UnsignedInt64 get_StartingAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtectedExtentBasedOn.CIM_PROPERTY_STARTINGADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_STARTINGADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_STARTINGADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_StartingAddress(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtectedExtentBasedOn.CIM_PROPERTY_STARTINGADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_STARTINGADDRESS + " could not be found");
    		
		} else if (!CIM_ProtectedExtentBasedOnHelper.isValid_StartingAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_STARTINGADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_STARTINGADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UnitsBeforeCheckDataInterleave
	
	public UnsignedInt64 get_UnitsBeforeCheckDataInterleave() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtectedExtentBasedOn.CIM_PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UnitsBeforeCheckDataInterleave(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtectedExtentBasedOn.CIM_PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE + " could not be found");
    		
		} else if (!CIM_ProtectedExtentBasedOnHelper.isValid_UnitsBeforeCheckDataInterleave(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UnitsOfCheckData
	
	public UnsignedInt64 get_UnitsOfCheckData() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtectedExtentBasedOn.CIM_PROPERTY_UNITSOFCHECKDATA);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_UNITSOFCHECKDATA + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_UNITSOFCHECKDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UnitsOfCheckData(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtectedExtentBasedOn.CIM_PROPERTY_UNITSOFCHECKDATA);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_UNITSOFCHECKDATA + " could not be found");
    		
		} else if (!CIM_ProtectedExtentBasedOnHelper.isValid_UnitsOfCheckData(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_UNITSOFCHECKDATA);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_UNITSOFCHECKDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UnitsOfUserData
	
	public UnsignedInt64 get_UnitsOfUserData() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtectedExtentBasedOn.CIM_PROPERTY_UNITSOFUSERDATA);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_UNITSOFUSERDATA + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_UNITSOFUSERDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UnitsOfUserData(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtectedExtentBasedOn.CIM_PROPERTY_UNITSOFUSERDATA);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_UNITSOFUSERDATA + " could not be found");
    		
		} else if (!CIM_ProtectedExtentBasedOnHelper.isValid_UnitsOfUserData(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_UNITSOFUSERDATA);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_UNITSOFUSERDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_StorageExtent_1
	
	public CIMObjectPath get_CIM_StorageExtent_1() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtectedExtentBasedOn.CIM_PROPERTY_CIM_STORAGEEXTENT_1);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_CIM_STORAGEEXTENT_1 + " could not be found");
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_CIM_STORAGEEXTENT_1 + " is not of expected type CIM_StorageExtent.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_StorageExtent_1(CIM_StorageExtent newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtectedExtentBasedOn.CIM_PROPERTY_CIM_STORAGEEXTENT_1);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_CIM_STORAGEEXTENT_1 + " could not be found");
    		
		} else if (!CIM_ProtectedExtentBasedOnHelper.isValid_CIM_StorageExtent_1(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_CIM_STORAGEEXTENT_1);
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_CIM_STORAGEEXTENT_1 + " is not of expected type CIM_StorageExtent.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_StorageExtent.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_StorageExtent_2
	
	public CIMObjectPath get_CIM_StorageExtent_2() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtectedExtentBasedOn.CIM_PROPERTY_CIM_STORAGEEXTENT_2);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_CIM_STORAGEEXTENT_2 + " could not be found");
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_CIM_STORAGEEXTENT_2 + " is not of expected type CIM_StorageExtent.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_StorageExtent_2(CIM_StorageExtent newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtectedExtentBasedOn.CIM_PROPERTY_CIM_STORAGEEXTENT_2);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_CIM_STORAGEEXTENT_2 + " could not be found");
    		
		} else if (!CIM_ProtectedExtentBasedOnHelper.isValid_CIM_StorageExtent_2(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_CIM_STORAGEEXTENT_2);
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtectedExtentBasedOn.CIM_PROPERTY_CIM_STORAGEEXTENT_2 + " is not of expected type CIM_StorageExtent.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_StorageExtent.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
