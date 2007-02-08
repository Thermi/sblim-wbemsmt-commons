/** 
 * CIM_CompositeExtentBasedOn.java
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
 * Description: This specialization defines how data is striped across StorageExtents. Additionally, it includes information on distribution of check data so that the 'usual case' RAID devices can be created in one step.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_CompositeExtentBasedOn extends CIM_BasedOn  {
	
	public final static String CIM_CLASS_NAME = "CIM_CompositeExtentBasedOn";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_PROPERTY_CIM_STORAGEEXTENT = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_COMPOSITEEXTENT = "Dependent"; //$NON-NLS-1$
	
	
	/**
	*	The Dependent's BlockSize is limited by the Antecedent's. In SCC, this is equivalent to the NUMBER OF BYTES PER LBA_PS field in the RedundancyGroup P_Extent Descriptor.
	*/
	public final static String CIM_PROPERTY_BLOCKSIZE = "BlockSize"; //$NON-NLS-1$
	/**
	*	True if the logical block mapping algorithm includes check data bytes. This property corresponds to the NOCHKSKIP attribute in the SCC-2 Volume Set PS_Extent Descriptor.
	*/
	public final static String CIM_PROPERTY_LBAMAPPINGINCLUDESCHECKDATA = "LBAMappingIncludesCheckData"; //$NON-NLS-1$
	/**
	*	True if logical blocks in the underlying StorageExtents are mapped in decrementing order. This property corresponds to the INCDEC value in the SCC-2 Volume Set PS_Extent Descriptor.
	*/
	public final static String CIM_PROPERTY_LBASMAPPEDBYDECREMENTING = "LBAsMappedByDecrementing"; //$NON-NLS-1$
	/**
	*	The total number of blocks that will be consumed on the Dependent Extent. This is limited by the Antecedent's NumberOfBlocks, but is included explicitly to provide for the DMTF MIF mapping. In SCC, this is equivalent to the NUMBER OF LBA_PS(s) field in the Volume Set PS_Extent Descriptor.
	*/
	public final static String CIM_PROPERTY_NUMBEROFBLOCKS = "NumberOfBlocks"; //$NON-NLS-1$
	/**
	*	Order matters to CompositeExtents. An example of the use of this property is when defining a RAID-0 striped array of 3 disks. The resultant RAID array is a CompositeExtent that is dependent on (as described by CompositeExtentBasedOn) the StorageExtents that represent each of the 3 disks. The OrderIndex of each CompositeExtentBasedOn association from the disk Extents to the RAID array could be specified as 1, 2 and 3 to indicate the order in which the disk Extents are used to access the RAID data.
	*/
	public final static String CIM_PROPERTY_ORDERINDEX = "OrderIndex"; //$NON-NLS-1$
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
	/**
	*	Number of bytes which form the stripe size for the Dependent StorageExtent. If the CompositeExtent is concatenated instead of striped, then UserDataStripeDepth should be set to zero.
	*/
	public final static String CIM_PROPERTY_USERDATASTRIPEDEPTH = "UserDataStripeDepth"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_BLOCKSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_LBAMAPPINGINCLUDESCHECKDATA);
		CIM_PropertyNameList.add(CIM_PROPERTY_LBASMAPPEDBYDECREMENTING);
		CIM_PropertyNameList.add(CIM_PROPERTY_NUMBEROFBLOCKS);
		CIM_PropertyNameList.add(CIM_PROPERTY_ORDERINDEX);
		CIM_PropertyNameList.add(CIM_PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE);
		CIM_PropertyNameList.add(CIM_PROPERTY_UNITSOFCHECKDATA);
		CIM_PropertyNameList.add(CIM_PROPERTY_UNITSOFUSERDATA);
		CIM_PropertyNameList.add(CIM_PROPERTY_USERDATASTRIPEDEPTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_STORAGEEXTENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_COMPOSITEEXTENT);
				
		for (int i = 0; i < CIM_BasedOn.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_BasedOn.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BLOCKSIZE)||
				((String)CIM_BasedOn.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LBAMAPPINGINCLUDESCHECKDATA)||
				((String)CIM_BasedOn.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LBASMAPPEDBYDECREMENTING)||
				((String)CIM_BasedOn.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NUMBEROFBLOCKS)||
				((String)CIM_BasedOn.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ORDERINDEX)||
				((String)CIM_BasedOn.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE)||
				((String)CIM_BasedOn.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UNITSOFCHECKDATA)||
				((String)CIM_BasedOn.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UNITSOFUSERDATA)||
				((String)CIM_BasedOn.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_USERDATASTRIPEDEPTH)){
				continue;
			}
			
			CIM_CompositeExtentBasedOn.CIM_PropertyNameList.add(CIM_BasedOn.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BLOCKSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LBAMAPPINGINCLUDESCHECKDATA, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LBASMAPPEDBYDECREMENTING, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NUMBEROFBLOCKS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ORDERINDEX, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UNITSOFCHECKDATA, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UNITSOFUSERDATA, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_USERDATASTRIPEDEPTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_STORAGEEXTENT, new CIMValue(null, new CIMDataType(CIM_StorageExtent.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_COMPOSITEEXTENT, new CIMValue(null, new CIMDataType(CIM_CompositeExtent.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_BasedOn.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_BasedOn.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BLOCKSIZE)||
				((CIMProperty)CIM_BasedOn.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LBAMAPPINGINCLUDESCHECKDATA)||
				((CIMProperty)CIM_BasedOn.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LBASMAPPEDBYDECREMENTING)||
				((CIMProperty)CIM_BasedOn.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NUMBEROFBLOCKS)||
				((CIMProperty)CIM_BasedOn.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ORDERINDEX)||
				((CIMProperty)CIM_BasedOn.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE)||
				((CIMProperty)CIM_BasedOn.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UNITSOFCHECKDATA)||
				((CIMProperty)CIM_BasedOn.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UNITSOFUSERDATA)||
				((CIMProperty)CIM_BasedOn.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_USERDATASTRIPEDEPTH)){
				continue;
			}
			
			CIM_CompositeExtentBasedOn.CIM_PropertyList.add(CIM_BasedOn.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_BasedOn.Java_Package_List.size(); i++) {
			if (((String)CIM_BasedOn.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_BasedOn.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_CompositeExtentBasedOn() {

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
	public CIM_CompositeExtentBasedOn(Vector keyProperties){ 
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
	public CIM_CompositeExtentBasedOn(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_OrderIndex = this.cimInstance.getProperty(CIM_PROPERTY_ORDERINDEX);
		
		if (CIMProperty_OrderIndex == null || CIMProperty_OrderIndex.getValue().isEmpty() || CIMProperty_OrderIndex.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_ORDERINDEX, "Required"});
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
	    
	    if (!(object instanceof CIM_CompositeExtentBasedOn)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_CompositeExtentBasedOn)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_CompositeExtentBasedOn)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_CompositeExtentBasedOn)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_CompositeExtentBasedOn)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_CompositeExtentBasedOn)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_CompositeExtentBasedOn)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_CompositeExtentBasedOn)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_CompositeExtentBasedOn)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_CompositeExtentBasedOn)object).cimObjectPath)) {
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
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CompositeExtentBasedOn.CIM_PROPERTY_BLOCKSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_BLOCKSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_BLOCKSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BlockSize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CompositeExtentBasedOn.CIM_PROPERTY_BLOCKSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_BLOCKSIZE + " could not be found");
    		
		} else if (!CIM_CompositeExtentBasedOnHelper.isValid_BlockSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_BLOCKSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_BLOCKSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LBAMappingIncludesCheckData
	
	public Boolean get_LBAMappingIncludesCheckData() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CompositeExtentBasedOn.CIM_PROPERTY_LBAMAPPINGINCLUDESCHECKDATA);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_LBAMAPPINGINCLUDESCHECKDATA + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_LBAMAPPINGINCLUDESCHECKDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LBAMappingIncludesCheckData(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CompositeExtentBasedOn.CIM_PROPERTY_LBAMAPPINGINCLUDESCHECKDATA);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_LBAMAPPINGINCLUDESCHECKDATA + " could not be found");
    		
		} else if (!CIM_CompositeExtentBasedOnHelper.isValid_LBAMappingIncludesCheckData(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_LBAMAPPINGINCLUDESCHECKDATA);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_LBAMAPPINGINCLUDESCHECKDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LBAsMappedByDecrementing
	
	public Boolean get_LBAsMappedByDecrementing() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CompositeExtentBasedOn.CIM_PROPERTY_LBASMAPPEDBYDECREMENTING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_LBASMAPPEDBYDECREMENTING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_LBASMAPPEDBYDECREMENTING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LBAsMappedByDecrementing(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CompositeExtentBasedOn.CIM_PROPERTY_LBASMAPPEDBYDECREMENTING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_LBASMAPPEDBYDECREMENTING + " could not be found");
    		
		} else if (!CIM_CompositeExtentBasedOnHelper.isValid_LBAsMappedByDecrementing(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_LBASMAPPEDBYDECREMENTING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_LBASMAPPEDBYDECREMENTING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NumberOfBlocks
	
	public UnsignedInt64 get_NumberOfBlocks() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CompositeExtentBasedOn.CIM_PROPERTY_NUMBEROFBLOCKS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_NUMBEROFBLOCKS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_NUMBEROFBLOCKS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NumberOfBlocks(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CompositeExtentBasedOn.CIM_PROPERTY_NUMBEROFBLOCKS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_NUMBEROFBLOCKS + " could not be found");
    		
		} else if (!CIM_CompositeExtentBasedOnHelper.isValid_NumberOfBlocks(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_NUMBEROFBLOCKS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_NUMBEROFBLOCKS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OrderIndex
	
	public UnsignedInt16 get_OrderIndex() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CompositeExtentBasedOn.CIM_PROPERTY_ORDERINDEX);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_ORDERINDEX + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_ORDERINDEX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OrderIndex(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CompositeExtentBasedOn.CIM_PROPERTY_ORDERINDEX);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_ORDERINDEX + " could not be found");
    		
		} else if (!CIM_CompositeExtentBasedOnHelper.isValid_OrderIndex(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_ORDERINDEX);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_ORDERINDEX + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UnitsBeforeCheckDataInterleave
	
	public UnsignedInt64 get_UnitsBeforeCheckDataInterleave() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CompositeExtentBasedOn.CIM_PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UnitsBeforeCheckDataInterleave(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CompositeExtentBasedOn.CIM_PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE + " could not be found");
    		
		} else if (!CIM_CompositeExtentBasedOnHelper.isValid_UnitsBeforeCheckDataInterleave(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_UNITSBEFORECHECKDATAINTERLEAVE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UnitsOfCheckData
	
	public UnsignedInt64 get_UnitsOfCheckData() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CompositeExtentBasedOn.CIM_PROPERTY_UNITSOFCHECKDATA);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_UNITSOFCHECKDATA + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_UNITSOFCHECKDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UnitsOfCheckData(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CompositeExtentBasedOn.CIM_PROPERTY_UNITSOFCHECKDATA);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_UNITSOFCHECKDATA + " could not be found");
    		
		} else if (!CIM_CompositeExtentBasedOnHelper.isValid_UnitsOfCheckData(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_UNITSOFCHECKDATA);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_UNITSOFCHECKDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UnitsOfUserData
	
	public UnsignedInt64 get_UnitsOfUserData() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CompositeExtentBasedOn.CIM_PROPERTY_UNITSOFUSERDATA);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_UNITSOFUSERDATA + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_UNITSOFUSERDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UnitsOfUserData(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CompositeExtentBasedOn.CIM_PROPERTY_UNITSOFUSERDATA);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_UNITSOFUSERDATA + " could not be found");
    		
		} else if (!CIM_CompositeExtentBasedOnHelper.isValid_UnitsOfUserData(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_UNITSOFUSERDATA);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_UNITSOFUSERDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UserDataStripeDepth
	
	public UnsignedInt64 get_UserDataStripeDepth() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CompositeExtentBasedOn.CIM_PROPERTY_USERDATASTRIPEDEPTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_USERDATASTRIPEDEPTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_USERDATASTRIPEDEPTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UserDataStripeDepth(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CompositeExtentBasedOn.CIM_PROPERTY_USERDATASTRIPEDEPTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_USERDATASTRIPEDEPTH + " could not be found");
    		
		} else if (!CIM_CompositeExtentBasedOnHelper.isValid_UserDataStripeDepth(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_USERDATASTRIPEDEPTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_USERDATASTRIPEDEPTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_StorageExtent
	
	public CIMObjectPath get_CIM_StorageExtent() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CompositeExtentBasedOn.CIM_PROPERTY_CIM_STORAGEEXTENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_CIM_STORAGEEXTENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_StorageExtent.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_CIM_STORAGEEXTENT + " is not of expected type CIM_StorageExtent.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_StorageExtent(CIM_StorageExtent newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CompositeExtentBasedOn.CIM_PROPERTY_CIM_STORAGEEXTENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_CIM_STORAGEEXTENT + " could not be found");
    		
		} else if (!CIM_CompositeExtentBasedOnHelper.isValid_CIM_StorageExtent(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_CIM_STORAGEEXTENT);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_StorageExtent.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_CIM_STORAGEEXTENT + " is not of expected type CIM_StorageExtent.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_StorageExtent.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_CompositeExtent
	
	public CIMObjectPath get_CIM_CompositeExtent() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CompositeExtentBasedOn.CIM_PROPERTY_CIM_COMPOSITEEXTENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_CIM_COMPOSITEEXTENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_CompositeExtent.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_CIM_COMPOSITEEXTENT + " is not of expected type CIM_CompositeExtent.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_CompositeExtent(CIM_CompositeExtent newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_CompositeExtentBasedOn.CIM_PROPERTY_CIM_COMPOSITEEXTENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_CIM_COMPOSITEEXTENT + " could not be found");
    		
		} else if (!CIM_CompositeExtentBasedOnHelper.isValid_CIM_CompositeExtent(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_CIM_COMPOSITEEXTENT);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_CompositeExtent.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_CompositeExtentBasedOn.CIM_PROPERTY_CIM_COMPOSITEEXTENT + " is not of expected type CIM_CompositeExtent.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_CompositeExtent.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
