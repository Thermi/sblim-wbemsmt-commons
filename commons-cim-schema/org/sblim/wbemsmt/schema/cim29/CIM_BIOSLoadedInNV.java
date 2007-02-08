/** 
 * CIM_BIOSLoadedInNV.java
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
 * Description: A link between BIOSElement and Memory where the BIOS is loaded.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_BIOSLoadedInNV extends CIM_Dependency  {
	
	public final static String CIM_CLASS_NAME = "CIM_BIOSLoadedInNV";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_PROPERTY_CIM_MEMORY = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_BIOSELEMENT = "Dependent"; //$NON-NLS-1$
	
	
	/**
	*	The ending address where the BIOS is located in non-volatile storage.
	*/
	public final static String CIM_PROPERTY_ENDINGADDRESS = "EndingAddress"; //$NON-NLS-1$
	/**
	*	The starting address where the BIOS is located in non-volatile storage.
	*/
	public final static String CIM_PROPERTY_STARTINGADDRESS = "StartingAddress"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ENDINGADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_STARTINGADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_MEMORY);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_BIOSELEMENT);
				
		for (int i = 0; i < CIM_Dependency.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Dependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ENDINGADDRESS)||
				((String)CIM_Dependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STARTINGADDRESS)){
				continue;
			}
			
			CIM_BIOSLoadedInNV.CIM_PropertyNameList.add(CIM_Dependency.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ENDINGADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STARTINGADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_MEMORY, new CIMValue(null, new CIMDataType(CIM_Memory.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_BIOSELEMENT, new CIMValue(null, new CIMDataType(CIM_BIOSElement.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_Dependency.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Dependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ENDINGADDRESS)||
				((CIMProperty)CIM_Dependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STARTINGADDRESS)){
				continue;
			}
			
			CIM_BIOSLoadedInNV.CIM_PropertyList.add(CIM_Dependency.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Dependency.Java_Package_List.size(); i++) {
			if (((String)CIM_Dependency.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Dependency.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_BIOSLoadedInNV() {

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
	public CIM_BIOSLoadedInNV(Vector keyProperties){ 
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
	public CIM_BIOSLoadedInNV(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_BIOSLoadedInNV)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_BIOSLoadedInNV)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_BIOSLoadedInNV)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_BIOSLoadedInNV)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_BIOSLoadedInNV)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_BIOSLoadedInNV)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_BIOSLoadedInNV)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_BIOSLoadedInNV)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_BIOSLoadedInNV)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_BIOSLoadedInNV)object).cimObjectPath)) {
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
	
	// Attribute EndingAddress
	
	public UnsignedInt64 get_EndingAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSLoadedInNV.CIM_PROPERTY_ENDINGADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSLoadedInNV.CIM_PROPERTY_ENDINGADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSLoadedInNV.CIM_PROPERTY_ENDINGADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EndingAddress(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSLoadedInNV.CIM_PROPERTY_ENDINGADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSLoadedInNV.CIM_PROPERTY_ENDINGADDRESS + " could not be found");
    		
		} else if (!CIM_BIOSLoadedInNVHelper.isValid_EndingAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BIOSLoadedInNV.CIM_PROPERTY_ENDINGADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSLoadedInNV.CIM_PROPERTY_ENDINGADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute StartingAddress
	
	public UnsignedInt64 get_StartingAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSLoadedInNV.CIM_PROPERTY_STARTINGADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSLoadedInNV.CIM_PROPERTY_STARTINGADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSLoadedInNV.CIM_PROPERTY_STARTINGADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_StartingAddress(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSLoadedInNV.CIM_PROPERTY_STARTINGADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSLoadedInNV.CIM_PROPERTY_STARTINGADDRESS + " could not be found");
    		
		} else if (!CIM_BIOSLoadedInNVHelper.isValid_StartingAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BIOSLoadedInNV.CIM_PROPERTY_STARTINGADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSLoadedInNV.CIM_PROPERTY_STARTINGADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_Memory
	
	public CIMObjectPath get_CIM_Memory() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSLoadedInNV.CIM_PROPERTY_CIM_MEMORY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSLoadedInNV.CIM_PROPERTY_CIM_MEMORY + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Memory.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSLoadedInNV.CIM_PROPERTY_CIM_MEMORY + " is not of expected type CIM_Memory.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_Memory(CIM_Memory newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSLoadedInNV.CIM_PROPERTY_CIM_MEMORY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSLoadedInNV.CIM_PROPERTY_CIM_MEMORY + " could not be found");
    		
		} else if (!CIM_BIOSLoadedInNVHelper.isValid_CIM_Memory(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BIOSLoadedInNV.CIM_PROPERTY_CIM_MEMORY);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Memory.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSLoadedInNV.CIM_PROPERTY_CIM_MEMORY + " is not of expected type CIM_Memory.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_Memory.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_BIOSElement
	
	public CIMObjectPath get_CIM_BIOSElement() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSLoadedInNV.CIM_PROPERTY_CIM_BIOSELEMENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSLoadedInNV.CIM_PROPERTY_CIM_BIOSELEMENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_BIOSElement.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSLoadedInNV.CIM_PROPERTY_CIM_BIOSELEMENT + " is not of expected type CIM_BIOSElement.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_BIOSElement(CIM_BIOSElement newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSLoadedInNV.CIM_PROPERTY_CIM_BIOSELEMENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSLoadedInNV.CIM_PROPERTY_CIM_BIOSELEMENT + " could not be found");
    		
		} else if (!CIM_BIOSLoadedInNVHelper.isValid_CIM_BIOSElement(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BIOSLoadedInNV.CIM_PROPERTY_CIM_BIOSELEMENT);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_BIOSElement.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSLoadedInNV.CIM_PROPERTY_CIM_BIOSELEMENT + " is not of expected type CIM_BIOSElement.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_BIOSElement.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
