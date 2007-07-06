/** 
 * CIM_LogicalDiskBasedOnVolume.java
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
 * Description:  LogicalDisks can be BasedOn a single Volume (for example, exposed by a software
 * volume manager), or be BasedOn a Disk Partition directly. The former
 * relationship is made explicit in this association.
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
 *  LogicalDisks can be BasedOn a single Volume (for example, exposed by a software
 * volume manager), or be BasedOn a Disk Partition directly. The former
 * relationship is made explicit in this association.
 */
public class CIM_LogicalDiskBasedOnVolume extends CIM_LogicalDiskBasedOnExtent  {
	
	public final static String CIM_CLASS_NAME = "CIM_LogicalDiskBasedOnVolume"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_PROPERTY_CIM_STORAGEVOLUME = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_LOGICALDISK = "Dependent"; //$NON-NLS-1$
	
	
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_STORAGEVOLUME);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_LOGICALDISK);
				
		for (int i = 0; i < CIM_LogicalDiskBasedOnExtent.CIM_PropertyNameList.size(); i++) {
			
			CIM_LogicalDiskBasedOnVolume.CIM_PropertyNameList.add(CIM_LogicalDiskBasedOnExtent.CIM_PropertyNameList.elementAt(i));
		}
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_STORAGEVOLUME, new CIMValue(null, new CIMDataType(CIM_StorageVolume.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_LOGICALDISK, new CIMValue(null, new CIMDataType(CIM_LogicalDisk.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_LogicalDiskBasedOnExtent.CIM_PropertyList.size(); i++) {
			
			CIM_LogicalDiskBasedOnVolume.CIM_PropertyList.add(CIM_LogicalDiskBasedOnExtent.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim29");
				
		String[] parentClassPackageList = CIM_LogicalDiskBasedOnExtent.getPackages();
		
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
	public CIM_LogicalDiskBasedOnVolume() {

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
	public CIM_LogicalDiskBasedOnVolume(Vector keyProperties){ 
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
	public CIM_LogicalDiskBasedOnVolume(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
            CIM_LogicalDiskBasedOnVolume.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_LogicalDiskBasedOnVolume.Java_Package_List.toArray(new String[CIM_LogicalDiskBasedOnVolume.Java_Package_List.size()]);
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
	    
	    if (!(object instanceof CIM_LogicalDiskBasedOnVolume)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_LogicalDiskBasedOnVolume)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_LogicalDiskBasedOnVolume)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_LogicalDiskBasedOnVolume)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_LogicalDiskBasedOnVolume)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_LogicalDiskBasedOnVolume)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_LogicalDiskBasedOnVolume)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_LogicalDiskBasedOnVolume)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_LogicalDiskBasedOnVolume)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_LogicalDiskBasedOnVolume)object).cimObjectPath)) {
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
	
	// Attribute CIM_StorageVolume
	
	public CIMObjectPath get_CIM_StorageVolume() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LogicalDiskBasedOnVolume.CIM_PROPERTY_CIM_STORAGEVOLUME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LogicalDiskBasedOnVolume.CIM_PROPERTY_CIM_STORAGEVOLUME + " could not be found");
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LogicalDiskBasedOnVolume.CIM_PROPERTY_CIM_STORAGEVOLUME + " is not of expected type CIM_StorageVolume.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_StorageVolume(CIM_StorageVolume newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LogicalDiskBasedOnVolume.CIM_PROPERTY_CIM_STORAGEVOLUME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LogicalDiskBasedOnVolume.CIM_PROPERTY_CIM_STORAGEVOLUME + " could not be found");
    		
		} else if (!CIM_LogicalDiskBasedOnVolumeHelper.isValid_CIM_StorageVolume(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LogicalDiskBasedOnVolume.CIM_PROPERTY_CIM_STORAGEVOLUME);
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LogicalDiskBasedOnVolume.CIM_PROPERTY_CIM_STORAGEVOLUME + " is not of expected type CIM_StorageVolume.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_StorageVolume.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_LogicalDisk
	
	public CIMObjectPath get_CIM_LogicalDisk() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LogicalDiskBasedOnVolume.CIM_PROPERTY_CIM_LOGICALDISK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LogicalDiskBasedOnVolume.CIM_PROPERTY_CIM_LOGICALDISK + " could not be found");
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LogicalDiskBasedOnVolume.CIM_PROPERTY_CIM_LOGICALDISK + " is not of expected type CIM_LogicalDisk.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_LogicalDisk(CIM_LogicalDisk newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LogicalDiskBasedOnVolume.CIM_PROPERTY_CIM_LOGICALDISK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LogicalDiskBasedOnVolume.CIM_PROPERTY_CIM_LOGICALDISK + " could not be found");
    		
		} else if (!CIM_LogicalDiskBasedOnVolumeHelper.isValid_CIM_LogicalDisk(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LogicalDiskBasedOnVolume.CIM_PROPERTY_CIM_LOGICALDISK);
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LogicalDiskBasedOnVolume.CIM_PROPERTY_CIM_LOGICALDISK + " is not of expected type CIM_LogicalDisk.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_LogicalDisk.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
