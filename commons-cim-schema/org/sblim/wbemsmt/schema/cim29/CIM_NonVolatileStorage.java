/** 
 * CIM_NonVolatileStorage.java
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
 * Description:  This class has been deprecated in favor of CIM_Memory with the volatile
 * parameter set to false. Capabilities and management of NV Storage.
 * Non-volatile memory natively includes flash and ROM storage. In addition, NV
 * memory can be BasedOn VolatileStorage, if the volatile memory is backed by a
 * Battery. This scenario would be completely described by an instance of the
 * AssociatedBattery relationship, referencing the NonVolatileStorage as the
 * Dependent and the Battery as the Antecedent, and an instance of the BasedOn
 * relationship, referencing the NonVolatileStorage as the Dependent and the
 * VolatileStorage as the Antecedent.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


/**
 *  This class has been deprecated in favor of CIM_Memory with the volatile
 * parameter set to false. Capabilities and management of NV Storage.
 * Non-volatile memory natively includes flash and ROM storage. In addition, NV
 * memory can be BasedOn VolatileStorage, if the volatile memory is backed by a
 * Battery. This scenario would be completely described by an instance of the
 * AssociatedBattery relationship, referencing the NonVolatileStorage as the
 * Dependent and the Battery as the Antecedent, and an instance of the BasedOn
 * relationship, referencing the NonVolatileStorage as the Dependent and the
 * VolatileStorage as the Antecedent.
 */
public class CIM_NonVolatileStorage extends CIM_Memory  {
	
	public final static String CIM_CLASS_NAME = "CIM_NonVolatileStorage"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	Boolean indicating that at least some portion of the NonVolatileStorage is writeable by applications.
	*/
	public final static String CIM_PROPERTY_APPLICATIONWRITEABLE = "ApplicationWriteable"; //$NON-NLS-1$
	/**
	*	When at least some portion of the NonVolatileStorage is writeable (ApplicationWriteable property = TRUE), Application WritableSize indicates the number of bits available for application data. If the ApplicationWriteable property is FALSE, this property is undefined.
	*/
	public final static String CIM_PROPERTY_APPLICATIONWRITEABLESIZE = "ApplicationWriteableSize"; //$NON-NLS-1$
	/**
	*	Indicating that the NV storage is writeable.
	*/
	public final static String CIM_PROPERTY_ISWRITEABLE = "IsWriteable"; //$NON-NLS-1$
	/**
	*	When at least some portion of the NonVolatileStorage is writeable (ApplicationWriteable property = TRUE), StartAddress forApplcationWrite indicates the starting address for application data. If the ApplicationWriteable property is FALSE, this property is undefined.
	*/
	public final static String CIM_PROPERTY_STARTADDRESSFORAPPLICATIONWRITE = "StartAddressForApplicationWrite"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_APPLICATIONWRITEABLE);
		CIM_PropertyNameList.add(CIM_PROPERTY_APPLICATIONWRITEABLESIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ISWRITEABLE);
		CIM_PropertyNameList.add(CIM_PROPERTY_STARTADDRESSFORAPPLICATIONWRITE);
				
		for (int i = 0; i < CIM_Memory.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Memory.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_APPLICATIONWRITEABLE)||
				((String)CIM_Memory.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_APPLICATIONWRITEABLESIZE)||
				((String)CIM_Memory.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ISWRITEABLE)||
				((String)CIM_Memory.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STARTADDRESSFORAPPLICATIONWRITE)){
				continue;
			}
			
			CIM_NonVolatileStorage.CIM_PropertyNameList.add(CIM_Memory.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_APPLICATIONWRITEABLE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_APPLICATIONWRITEABLESIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ISWRITEABLE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STARTADDRESSFORAPPLICATIONWRITE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_Memory.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Memory.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_APPLICATIONWRITEABLE)||
				((CIMProperty)CIM_Memory.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_APPLICATIONWRITEABLESIZE)||
				((CIMProperty)CIM_Memory.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ISWRITEABLE)||
				((CIMProperty)CIM_Memory.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STARTADDRESSFORAPPLICATIONWRITE)){
				continue;
			}
			
			CIM_NonVolatileStorage.CIM_PropertyList.add(CIM_Memory.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Memory.Java_Package_List.size(); i++) {
			if (((String)CIM_Memory.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Memory.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_NonVolatileStorage() {

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
	public CIM_NonVolatileStorage(Vector keyProperties){ 
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
	public CIM_NonVolatileStorage(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_NonVolatileStorage)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_NonVolatileStorage)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_NonVolatileStorage)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_NonVolatileStorage)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_NonVolatileStorage)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_NonVolatileStorage)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_NonVolatileStorage)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_NonVolatileStorage)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_NonVolatileStorage)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_NonVolatileStorage)object).cimObjectPath)) {
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
	
	// Attribute ApplicationWriteable
	
	public Boolean get_ApplicationWriteable() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NonVolatileStorage.CIM_PROPERTY_APPLICATIONWRITEABLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NonVolatileStorage.CIM_PROPERTY_APPLICATIONWRITEABLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NonVolatileStorage.CIM_PROPERTY_APPLICATIONWRITEABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ApplicationWriteable(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NonVolatileStorage.CIM_PROPERTY_APPLICATIONWRITEABLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NonVolatileStorage.CIM_PROPERTY_APPLICATIONWRITEABLE + " could not be found");
    		
		} else if (!CIM_NonVolatileStorageHelper.isValid_ApplicationWriteable(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NonVolatileStorage.CIM_PROPERTY_APPLICATIONWRITEABLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NonVolatileStorage.CIM_PROPERTY_APPLICATIONWRITEABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ApplicationWriteableSize
	
	public UnsignedInt64 get_ApplicationWriteableSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NonVolatileStorage.CIM_PROPERTY_APPLICATIONWRITEABLESIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NonVolatileStorage.CIM_PROPERTY_APPLICATIONWRITEABLESIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NonVolatileStorage.CIM_PROPERTY_APPLICATIONWRITEABLESIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ApplicationWriteableSize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NonVolatileStorage.CIM_PROPERTY_APPLICATIONWRITEABLESIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NonVolatileStorage.CIM_PROPERTY_APPLICATIONWRITEABLESIZE + " could not be found");
    		
		} else if (!CIM_NonVolatileStorageHelper.isValid_ApplicationWriteableSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NonVolatileStorage.CIM_PROPERTY_APPLICATIONWRITEABLESIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NonVolatileStorage.CIM_PROPERTY_APPLICATIONWRITEABLESIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IsWriteable
	
	public Boolean get_IsWriteable() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NonVolatileStorage.CIM_PROPERTY_ISWRITEABLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NonVolatileStorage.CIM_PROPERTY_ISWRITEABLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NonVolatileStorage.CIM_PROPERTY_ISWRITEABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IsWriteable(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NonVolatileStorage.CIM_PROPERTY_ISWRITEABLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NonVolatileStorage.CIM_PROPERTY_ISWRITEABLE + " could not be found");
    		
		} else if (!CIM_NonVolatileStorageHelper.isValid_IsWriteable(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NonVolatileStorage.CIM_PROPERTY_ISWRITEABLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NonVolatileStorage.CIM_PROPERTY_ISWRITEABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute StartAddressForApplicationWrite
	
	public UnsignedInt64 get_StartAddressForApplicationWrite() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NonVolatileStorage.CIM_PROPERTY_STARTADDRESSFORAPPLICATIONWRITE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NonVolatileStorage.CIM_PROPERTY_STARTADDRESSFORAPPLICATIONWRITE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NonVolatileStorage.CIM_PROPERTY_STARTADDRESSFORAPPLICATIONWRITE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_StartAddressForApplicationWrite(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_NonVolatileStorage.CIM_PROPERTY_STARTADDRESSFORAPPLICATIONWRITE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_NonVolatileStorage.CIM_PROPERTY_STARTADDRESSFORAPPLICATIONWRITE + " could not be found");
    		
		} else if (!CIM_NonVolatileStorageHelper.isValid_StartAddressForApplicationWrite(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_NonVolatileStorage.CIM_PROPERTY_STARTADDRESSFORAPPLICATIONWRITE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_NonVolatileStorage.CIM_PROPERTY_STARTADDRESSFORAPPLICATIONWRITE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
