/** 
 * CIM_StorageRedundancySet.java
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
 * Description:  A class derived from RedundancySet describing storage-related redundancy
 * information. StorageRedundancySets are used to protect user data. They
 * aggregate one or more underlying StorageExtents, associated via
 * MemberOfCollection, and produce one or more higher-level Extents. The Extents
 * are related to each other via a BasedOn association. And, the higher level
 * Extent is related to the StorageRedundancy Set via the LogicalIdentity
 * association. Note that StorageRedundancySets may overlap in their aggregation
 * of members. If this occurs, the overlapping Extents SHOULD NOT contain any
 * check data.
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


/**
 *  A class derived from RedundancySet describing storage-related redundancy
 * information. StorageRedundancySets are used to protect user data. They
 * aggregate one or more underlying StorageExtents, associated via
 * MemberOfCollection, and produce one or more higher-level Extents. The Extents
 * are related to each other via a BasedOn association. And, the higher level
 * Extent is related to the StorageRedundancy Set via the LogicalIdentity
 * association. Note that StorageRedundancySets may overlap in their aggregation
 * of members. If this occurs, the overlapping Extents SHOULD NOT contain any
 * check data.
 */
public class CIM_StorageRedundancySet extends CIM_RedundancySet  {
	
	public final static String CIM_CLASS_NAME = "CIM_StorageRedundancySet"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.1000";
	
	
	/**
	*	A string describing the redundancy algorithm when the TypeOfAlgorithm is set to 1 'Other'.
	*/
	public final static String CIM_PROPERTY_OTHERALGORITHM = "OtherAlgorithm"; //$NON-NLS-1$
	/**
	*	TypeOfAlgorithm specifies the algorithm used for storage data redundancy and reconstruction. For example, 'P+Q' (=5) or 'P+S' (=7) may be specified.
	*/
	public final static String CIM_PROPERTY_TYPEOFALGORITHM = "TypeOfAlgorithm"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERALGORITHM);
		CIM_PropertyNameList.add(CIM_PROPERTY_TYPEOFALGORITHM);
				
		for (int i = 0; i < CIM_RedundancySet.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_RedundancySet.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERALGORITHM)||
				((String)CIM_RedundancySet.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TYPEOFALGORITHM)){
				continue;
			}
			
			CIM_StorageRedundancySet.CIM_PropertyNameList.add(CIM_RedundancySet.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERALGORITHM, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TYPEOFALGORITHM, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_RedundancySet.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_RedundancySet.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERALGORITHM)||
				((CIMProperty)CIM_RedundancySet.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TYPEOFALGORITHM)){
				continue;
			}
			
			CIM_StorageRedundancySet.CIM_PropertyList.add(CIM_RedundancySet.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_RedundancySet.Java_Package_List.size(); i++) {
			if (((String)CIM_RedundancySet.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_RedundancySet.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_TYPEOFALGORITHM = {"Unknown","Other","Copy","XOR","P+Q","S","P+S"};
	
	
	public final static int TYPEOFALGORITHM_UNKNOWN = 0;
	public final static int TYPEOFALGORITHM_OTHER = 1;
	public final static int TYPEOFALGORITHM_COPY = 3;
	public final static int TYPEOFALGORITHM_XOR = 4;
	public final static int TYPEOFALGORITHM_P_Q = 5;
	public final static int TYPEOFALGORITHM_S = 6;
	public final static int TYPEOFALGORITHM_P_S = 7;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_StorageRedundancySet() {

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
	public CIM_StorageRedundancySet(Vector keyProperties){ 
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
	public CIM_StorageRedundancySet(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_StorageRedundancySet)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_StorageRedundancySet)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_StorageRedundancySet)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_StorageRedundancySet)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_StorageRedundancySet)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_StorageRedundancySet)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_StorageRedundancySet)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_StorageRedundancySet)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_StorageRedundancySet)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_StorageRedundancySet)object).cimObjectPath)) {
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
	
	// Attribute OtherAlgorithm
	
	public String get_OtherAlgorithm() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageRedundancySet.CIM_PROPERTY_OTHERALGORITHM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageRedundancySet.CIM_PROPERTY_OTHERALGORITHM + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageRedundancySet.CIM_PROPERTY_OTHERALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherAlgorithm(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageRedundancySet.CIM_PROPERTY_OTHERALGORITHM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageRedundancySet.CIM_PROPERTY_OTHERALGORITHM + " could not be found");
    		
		} else if (!CIM_StorageRedundancySetHelper.isValid_OtherAlgorithm(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageRedundancySet.CIM_PROPERTY_OTHERALGORITHM);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageRedundancySet.CIM_PROPERTY_OTHERALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TypeOfAlgorithm
	
	public UnsignedInt16 get_TypeOfAlgorithm() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageRedundancySet.CIM_PROPERTY_TYPEOFALGORITHM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageRedundancySet.CIM_PROPERTY_TYPEOFALGORITHM + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageRedundancySet.CIM_PROPERTY_TYPEOFALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TypeOfAlgorithm(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageRedundancySet.CIM_PROPERTY_TYPEOFALGORITHM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageRedundancySet.CIM_PROPERTY_TYPEOFALGORITHM + " could not be found");
    		
		} else if (!CIM_StorageRedundancySetHelper.isValid_TypeOfAlgorithm(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageRedundancySet.CIM_PROPERTY_TYPEOFALGORITHM);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageRedundancySet.CIM_PROPERTY_TYPEOFALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
