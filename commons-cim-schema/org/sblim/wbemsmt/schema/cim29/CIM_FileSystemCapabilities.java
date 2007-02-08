/** 
 * CIM_FileSystemCapabilities.java
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
 * Description: This class defines the abilities for persistence and recoverability of a FileSystem. This information is tied to the FileSystem using the ElementCapabilities association.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_FileSystemCapabilities extends CIM_Capabilities  {
	
	public final static String CIM_CLASS_NAME = "CIM_FileSystemCapabilities";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	An array of strings describing the persistence capabilities where the corresponding entry in SupportedPersistenceTypes has a value of "Other". This value is ignored in all other cases.
	*/
	public final static String CIM_PROPERTY_SUPPORTEDOTHERPERSISTENCETYPES = "SupportedOtherPersistenceTypes"; //$NON-NLS-1$
	/**
	*	An array of enumerated values representing the persistence capabilities of the FileSystem. A value of "Persistent" indicates that the FileSystem supports persistence, can be preserved through an orderly shutdown and could be protected. A value of "Temporary" indicates that the FileSystem supports non-persistence, may not be protected and may not survive a shutdown. A value of "External" indicates that the FileSystem could controlled outside of the operating environment and may need to be protected by specialized means. A value of "Other" is provided to allow for additional persistence types, to be described in the OtherPersistenceType attribute, and is expected to be rarely, if ever, used.
	*/
	public final static String CIM_PROPERTY_SUPPORTEDPERSISTENCETYPES = "SupportedPersistenceTypes"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTEDOTHERPERSISTENCETYPES);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTEDPERSISTENCETYPES);
				
		for (int i = 0; i < CIM_Capabilities.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTEDOTHERPERSISTENCETYPES)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTEDPERSISTENCETYPES)){
				continue;
			}
			
			CIM_FileSystemCapabilities.CIM_PropertyNameList.add(CIM_Capabilities.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTEDOTHERPERSISTENCETYPES, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTEDPERSISTENCETYPES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
				
		for (int i = 0; i < CIM_Capabilities.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTEDOTHERPERSISTENCETYPES)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTEDPERSISTENCETYPES)){
				continue;
			}
			
			CIM_FileSystemCapabilities.CIM_PropertyList.add(CIM_Capabilities.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Capabilities.Java_Package_List.size(); i++) {
			if (((String)CIM_Capabilities.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Capabilities.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_SUPPORTEDPERSISTENCETYPES = {"Other","Persistent","Temporary","External"};
	
	
	public final static int SUPPORTEDPERSISTENCETYPES_OTHER = 1;
	public final static int SUPPORTEDPERSISTENCETYPES_PERSISTENT = 2;
	public final static int SUPPORTEDPERSISTENCETYPES_TEMPORARY = 3;
	public final static int SUPPORTEDPERSISTENCETYPES_EXTERNAL = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_FileSystemCapabilities() {

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
	public CIM_FileSystemCapabilities(Vector keyProperties){ 
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
	public CIM_FileSystemCapabilities(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_FileSystemCapabilities)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_FileSystemCapabilities)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_FileSystemCapabilities)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_FileSystemCapabilities)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_FileSystemCapabilities)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_FileSystemCapabilities)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_FileSystemCapabilities)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_FileSystemCapabilities)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_FileSystemCapabilities)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_FileSystemCapabilities)object).cimObjectPath)) {
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
	
	// Attribute SupportedOtherPersistenceTypes
	
	public String[] get_SupportedOtherPersistenceTypes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystemCapabilities.CIM_PROPERTY_SUPPORTEDOTHERPERSISTENCETYPES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystemCapabilities.CIM_PROPERTY_SUPPORTEDOTHERPERSISTENCETYPES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystemCapabilities.CIM_PROPERTY_SUPPORTEDOTHERPERSISTENCETYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_SupportedOtherPersistenceTypes(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystemCapabilities.CIM_PROPERTY_SUPPORTEDOTHERPERSISTENCETYPES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystemCapabilities.CIM_PROPERTY_SUPPORTEDOTHERPERSISTENCETYPES + " could not be found");
    		
		} else if (!CIM_FileSystemCapabilitiesHelper.isValid_SupportedOtherPersistenceTypes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSystemCapabilities.CIM_PROPERTY_SUPPORTEDOTHERPERSISTENCETYPES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystemCapabilities.CIM_PROPERTY_SUPPORTEDOTHERPERSISTENCETYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportedPersistenceTypes
	
	public UnsignedInt16[] get_SupportedPersistenceTypes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystemCapabilities.CIM_PROPERTY_SUPPORTEDPERSISTENCETYPES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystemCapabilities.CIM_PROPERTY_SUPPORTEDPERSISTENCETYPES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystemCapabilities.CIM_PROPERTY_SUPPORTEDPERSISTENCETYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_SupportedPersistenceTypes(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSystemCapabilities.CIM_PROPERTY_SUPPORTEDPERSISTENCETYPES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSystemCapabilities.CIM_PROPERTY_SUPPORTEDPERSISTENCETYPES + " could not be found");
    		
		} else if (!CIM_FileSystemCapabilitiesHelper.isValid_SupportedPersistenceTypes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSystemCapabilities.CIM_PROPERTY_SUPPORTEDPERSISTENCETYPES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSystemCapabilities.CIM_PROPERTY_SUPPORTEDPERSISTENCETYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
