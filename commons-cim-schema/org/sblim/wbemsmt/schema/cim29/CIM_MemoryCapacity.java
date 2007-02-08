/** 
 * CIM_MemoryCapacity.java
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
 * Description: MemoryCapacity describes the type of Memory that can be installed on a PhysicalElement and its minimum/maximum configurations. Information on what memory is currently 'installed', versus an Element's min/max requirements, is located in instances of the PhysicalMemory class.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_MemoryCapacity extends CIM_PhysicalCapacity  {
	
	public final static String CIM_CLASS_NAME = "CIM_MemoryCapacity";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.9.0";
	
	
	/**
	*	Maximum amount of memory, in Kbytes, that can be supported by the associated PhysicalElement.
	*/
	public final static String CIM_PROPERTY_MAXIMUMMEMORYCAPACITY = "MaximumMemoryCapacity"; //$NON-NLS-1$
	/**
	*	The type of memory. This is a part of the object key. Values correspond to the list of possible memory types in the PhysicalMemory class.
	*/
	public final static String CIM_PROPERTY_MEMORYTYPE = "MemoryType"; //$NON-NLS-1$
	/**
	*	Minimum amount of memory, in Kbytes, that is needed for the associated PhysicalElement to operate correctly.
	*/
	public final static String CIM_PROPERTY_MINIMUMMEMORYCAPACITY = "MinimumMemoryCapacity"; //$NON-NLS-1$
	/**
	*	The inherited Name serves as a part of the MemoryCapacity object key.
	*/
	public final static String CIM_PROPERTY_NAME = "Name"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXIMUMMEMORYCAPACITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_MEMORYTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MINIMUMMEMORYCAPACITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAME);
				
		for (int i = 0; i < CIM_PhysicalCapacity.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_PhysicalCapacity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXIMUMMEMORYCAPACITY)||
				((String)CIM_PhysicalCapacity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MEMORYTYPE)||
				((String)CIM_PhysicalCapacity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MINIMUMMEMORYCAPACITY)||
				((String)CIM_PhysicalCapacity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAME)){
				continue;
			}
			
			CIM_MemoryCapacity.CIM_PropertyNameList.add(CIM_PhysicalCapacity.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXIMUMMEMORYCAPACITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MEMORYTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MINIMUMMEMORYCAPACITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_PhysicalCapacity.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_PhysicalCapacity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXIMUMMEMORYCAPACITY)||
				((CIMProperty)CIM_PhysicalCapacity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MEMORYTYPE)||
				((CIMProperty)CIM_PhysicalCapacity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MINIMUMMEMORYCAPACITY)||
				((CIMProperty)CIM_PhysicalCapacity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAME)){
				continue;
			}
			
			CIM_MemoryCapacity.CIM_PropertyList.add(CIM_PhysicalCapacity.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_PhysicalCapacity.Java_Package_List.size(); i++) {
			if (((String)CIM_PhysicalCapacity.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_PhysicalCapacity.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_MEMORYTYPE = {"Unknown","Other","DRAM","Synchronous DRAM","Cache DRAM","EDO","EDRAM","VRAM","SRAM","RAM","ROM","Flash","EEPROM","FEPROM","EPROM","CDRAM","3DRAM","SDRAM","SGRAM","RDRAM","DDR","DDR2"};
	
	
	public final static int MEMORYTYPE_UNKNOWN = 0;
	public final static int MEMORYTYPE_OTHER = 1;
	public final static int MEMORYTYPE_DRAM = 2;
	public final static int MEMORYTYPE_SYNCHRONOUSDRAM = 3;
	public final static int MEMORYTYPE_CACHEDRAM = 4;
	public final static int MEMORYTYPE_EDO = 5;
	public final static int MEMORYTYPE_EDRAM = 6;
	public final static int MEMORYTYPE_VRAM = 7;
	public final static int MEMORYTYPE_SRAM = 8;
	public final static int MEMORYTYPE_RAM = 9;
	public final static int MEMORYTYPE_ROM = 10;
	public final static int MEMORYTYPE_FLASH = 11;
	public final static int MEMORYTYPE_EEPROM = 12;
	public final static int MEMORYTYPE_FEPROM = 13;
	public final static int MEMORYTYPE_EPROM = 14;
	public final static int MEMORYTYPE_CDRAM = 15;
	public final static int MEMORYTYPE_3DRAM = 16;
	public final static int MEMORYTYPE_SDRAM = 17;
	public final static int MEMORYTYPE_SGRAM = 18;
	public final static int MEMORYTYPE_RDRAM = 19;
	public final static int MEMORYTYPE_DDR = 20;
	public final static int MEMORYTYPE_DDR2 = 21;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_MemoryCapacity() {

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
	public CIM_MemoryCapacity(Vector keyProperties){ 
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
	public CIM_MemoryCapacity(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_MemoryType = this.cimInstance.getProperty(CIM_PROPERTY_MEMORYTYPE);
		
		if (CIMProperty_MemoryType == null || CIMProperty_MemoryType.getValue().isEmpty() || CIMProperty_MemoryType.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_MEMORYTYPE, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_Name = this.cimInstance.getProperty(CIM_PROPERTY_NAME);
		
		if (CIMProperty_Name == null || CIMProperty_Name.getValue().isEmpty() || CIMProperty_Name.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_NAME, "Key"});
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
	    
	    if (!(object instanceof CIM_MemoryCapacity)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_MemoryCapacity)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_MemoryCapacity)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_MemoryCapacity)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_MemoryCapacity)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_MemoryCapacity)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_MemoryCapacity)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_MemoryCapacity)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_MemoryCapacity)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_MemoryCapacity)object).cimObjectPath)) {
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
	
	// Attribute MaximumMemoryCapacity
	
	public UnsignedInt64 get_MaximumMemoryCapacity() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MemoryCapacity.CIM_PROPERTY_MAXIMUMMEMORYCAPACITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MemoryCapacity.CIM_PROPERTY_MAXIMUMMEMORYCAPACITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MemoryCapacity.CIM_PROPERTY_MAXIMUMMEMORYCAPACITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaximumMemoryCapacity(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MemoryCapacity.CIM_PROPERTY_MAXIMUMMEMORYCAPACITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MemoryCapacity.CIM_PROPERTY_MAXIMUMMEMORYCAPACITY + " could not be found");
    		
		} else if (!CIM_MemoryCapacityHelper.isValid_MaximumMemoryCapacity(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MemoryCapacity.CIM_PROPERTY_MAXIMUMMEMORYCAPACITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MemoryCapacity.CIM_PROPERTY_MAXIMUMMEMORYCAPACITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MemoryType
	
	public UnsignedInt16 get_MemoryType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MemoryCapacity.CIM_PROPERTY_MEMORYTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MemoryCapacity.CIM_PROPERTY_MEMORYTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MemoryCapacity.CIM_PROPERTY_MEMORYTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MemoryType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MemoryCapacity.CIM_PROPERTY_MEMORYTYPE);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_MemoryCapacity.CIM_PROPERTY_MEMORYTYPE + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MemoryCapacity.CIM_PROPERTY_MEMORYTYPE + " could not be found");
    		
		} else if (!CIM_MemoryCapacityHelper.isValid_MemoryType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MemoryCapacity.CIM_PROPERTY_MEMORYTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MemoryCapacity.CIM_PROPERTY_MEMORYTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MinimumMemoryCapacity
	
	public UnsignedInt64 get_MinimumMemoryCapacity() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MemoryCapacity.CIM_PROPERTY_MINIMUMMEMORYCAPACITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MemoryCapacity.CIM_PROPERTY_MINIMUMMEMORYCAPACITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MemoryCapacity.CIM_PROPERTY_MINIMUMMEMORYCAPACITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MinimumMemoryCapacity(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MemoryCapacity.CIM_PROPERTY_MINIMUMMEMORYCAPACITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MemoryCapacity.CIM_PROPERTY_MINIMUMMEMORYCAPACITY + " could not be found");
    		
		} else if (!CIM_MemoryCapacityHelper.isValid_MinimumMemoryCapacity(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MemoryCapacity.CIM_PROPERTY_MINIMUMMEMORYCAPACITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MemoryCapacity.CIM_PROPERTY_MINIMUMMEMORYCAPACITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Name
	
	public String get_Name() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MemoryCapacity.CIM_PROPERTY_NAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MemoryCapacity.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MemoryCapacity.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Name(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MemoryCapacity.CIM_PROPERTY_NAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_MemoryCapacity.CIM_PROPERTY_NAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MemoryCapacity.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (!CIM_MemoryCapacityHelper.isValid_Name(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MemoryCapacity.CIM_PROPERTY_NAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MemoryCapacity.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
