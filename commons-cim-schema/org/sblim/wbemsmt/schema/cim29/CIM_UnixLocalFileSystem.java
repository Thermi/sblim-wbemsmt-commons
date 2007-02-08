/** 
 * CIM_UnixLocalFileSystem.java
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
 * Description: A class derived from LocalFileSystem that represents the Unix environment view of a file store controlled by a ComputerSystem through local means (e.g., direct device driver access). In this case, the file store is managed directly by the ComputerSystem without the need for another computer to act as a file server. This definition does not breakdown in the case of a Clustered File System. In this scenario, the FileSystem is a LocalFileSystem, weak to the Cluster.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_UnixLocalFileSystem extends CIM_LocalFileSystem  {
	
	public final static String CIM_CLASS_NAME = "CIM_UnixLocalFileSystem";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	The reserve data capacity of the file system in bytes.
	*/
	public final static String CIM_PROPERTY_FSRESERVEDCAPACITY = "FSReservedCapacity"; //$NON-NLS-1$
	/**
	*	The number of free inodes present in the file system. This value is only valid if TotalSlots is non-zero.
	*/
	public final static String CIM_PROPERTY_FREEINODES = "FreeInodes"; //$NON-NLS-1$
	/**
	*	The total number of inodes available in the file system. A value of zero for TotalInodes indicates that this file system does not have a preset limit.
	*/
	public final static String CIM_PROPERTY_TOTALINODES = "TotalInodes"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_FSRESERVEDCAPACITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_FREEINODES);
		CIM_PropertyNameList.add(CIM_PROPERTY_TOTALINODES);
				
		for (int i = 0; i < CIM_LocalFileSystem.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_LocalFileSystem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FSRESERVEDCAPACITY)||
				((String)CIM_LocalFileSystem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FREEINODES)||
				((String)CIM_LocalFileSystem.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TOTALINODES)){
				continue;
			}
			
			CIM_UnixLocalFileSystem.CIM_PropertyNameList.add(CIM_LocalFileSystem.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FSRESERVEDCAPACITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FREEINODES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TOTALINODES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_LocalFileSystem.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_LocalFileSystem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FSRESERVEDCAPACITY)||
				((CIMProperty)CIM_LocalFileSystem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FREEINODES)||
				((CIMProperty)CIM_LocalFileSystem.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TOTALINODES)){
				continue;
			}
			
			CIM_UnixLocalFileSystem.CIM_PropertyList.add(CIM_LocalFileSystem.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_LocalFileSystem.Java_Package_List.size(); i++) {
			if (((String)CIM_LocalFileSystem.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_LocalFileSystem.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_UnixLocalFileSystem() {

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
	public CIM_UnixLocalFileSystem(Vector keyProperties){ 
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
	public CIM_UnixLocalFileSystem(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_UnixLocalFileSystem)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_UnixLocalFileSystem)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_UnixLocalFileSystem)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_UnixLocalFileSystem)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_UnixLocalFileSystem)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_UnixLocalFileSystem)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_UnixLocalFileSystem)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_UnixLocalFileSystem)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_UnixLocalFileSystem)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_UnixLocalFileSystem)object).cimObjectPath)) {
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
	
	// Attribute FSReservedCapacity
	
	public UnsignedInt64 get_FSReservedCapacity() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixLocalFileSystem.CIM_PROPERTY_FSRESERVEDCAPACITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixLocalFileSystem.CIM_PROPERTY_FSRESERVEDCAPACITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixLocalFileSystem.CIM_PROPERTY_FSRESERVEDCAPACITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FSReservedCapacity(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixLocalFileSystem.CIM_PROPERTY_FSRESERVEDCAPACITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixLocalFileSystem.CIM_PROPERTY_FSRESERVEDCAPACITY + " could not be found");
    		
		} else if (!CIM_UnixLocalFileSystemHelper.isValid_FSReservedCapacity(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixLocalFileSystem.CIM_PROPERTY_FSRESERVEDCAPACITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixLocalFileSystem.CIM_PROPERTY_FSRESERVEDCAPACITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FreeInodes
	
	public UnsignedInt64 get_FreeInodes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixLocalFileSystem.CIM_PROPERTY_FREEINODES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixLocalFileSystem.CIM_PROPERTY_FREEINODES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixLocalFileSystem.CIM_PROPERTY_FREEINODES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FreeInodes(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixLocalFileSystem.CIM_PROPERTY_FREEINODES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixLocalFileSystem.CIM_PROPERTY_FREEINODES + " could not be found");
    		
		} else if (!CIM_UnixLocalFileSystemHelper.isValid_FreeInodes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixLocalFileSystem.CIM_PROPERTY_FREEINODES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixLocalFileSystem.CIM_PROPERTY_FREEINODES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TotalInodes
	
	public UnsignedInt64 get_TotalInodes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixLocalFileSystem.CIM_PROPERTY_TOTALINODES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixLocalFileSystem.CIM_PROPERTY_TOTALINODES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixLocalFileSystem.CIM_PROPERTY_TOTALINODES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TotalInodes(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UnixLocalFileSystem.CIM_PROPERTY_TOTALINODES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UnixLocalFileSystem.CIM_PROPERTY_TOTALINODES + " could not be found");
    		
		} else if (!CIM_UnixLocalFileSystemHelper.isValid_TotalInodes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UnixLocalFileSystem.CIM_PROPERTY_TOTALINODES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UnixLocalFileSystem.CIM_PROPERTY_TOTALINODES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
