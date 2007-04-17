/** 
 * CIM_SNMPCommunityString.java
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
 * Description:  SNMPCommunityString is an access point for an SNMPService. Each instance stores
 * a community string that can be used for making SNMP requests.
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
 *  SNMPCommunityString is an access point for an SNMPService. Each instance stores
 * a community string that can be used for making SNMP requests.
 */
public class CIM_SNMPCommunityString extends CIM_ServiceAccessPoint  {
	
	public final static String CIM_CLASS_NAME = "CIM_SNMPCommunityString"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	The SNMP community string/password used for read or read/write access to the agent's data.
	*/
	public final static String CIM_PROPERTY_COMMUNITYSTRING = "CommunityString"; //$NON-NLS-1$
	/**
	*	This array contains one or more object identifiers indicating the MIB modules/object subtrees that are accessed using the CommunityString. Either text strings of numbers (such as 1.2.3.4.5), or words (such as 'system') are specified. When using text strings of numbers, an asterisk (*) can replace any subidentifier to specify a subtree family - for example, 1.2.*.5. Descriptions related to each entry in the array are found at the corresponding index of the LogicalEntitiesDescriptions property.
	*/
	public final static String CIM_PROPERTY_LOGICALENTITIESACCESSED = "LogicalEntitiesAccessed"; //$NON-NLS-1$
	/**
	*	Free-form textual descriptions of the logical entities indicated in the LogicalEntitiesAccessed array. There is a correspondence between the entity identifier in the LogicalEntitiesAccessed array, and the description in this array at the corresponding index.
	*/
	public final static String CIM_PROPERTY_LOGICALENTITIESDESCRIPTIONS = "LogicalEntitiesDescriptions"; //$NON-NLS-1$
	/**
	*	An enumerated integer describing whether read or read/ write access is granted, or whether this information is unknown.
	*/
	public final static String CIM_PROPERTY_TYPEOFACCESS = "TypeOfAccess"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_COMMUNITYSTRING);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOGICALENTITIESACCESSED);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOGICALENTITIESDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_TYPEOFACCESS);
				
		for (int i = 0; i < CIM_ServiceAccessPoint.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_COMMUNITYSTRING)||
				((String)CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOGICALENTITIESACCESSED)||
				((String)CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOGICALENTITIESDESCRIPTIONS)||
				((String)CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TYPEOFACCESS)){
				continue;
			}
			
			CIM_SNMPCommunityString.CIM_PropertyNameList.add(CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_COMMUNITYSTRING, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOGICALENTITIESACCESSED, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOGICALENTITIESDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TYPEOFACCESS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_ServiceAccessPoint.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ServiceAccessPoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_COMMUNITYSTRING)||
				((CIMProperty)CIM_ServiceAccessPoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOGICALENTITIESACCESSED)||
				((CIMProperty)CIM_ServiceAccessPoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOGICALENTITIESDESCRIPTIONS)||
				((CIMProperty)CIM_ServiceAccessPoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TYPEOFACCESS)){
				continue;
			}
			
			CIM_SNMPCommunityString.CIM_PropertyList.add(CIM_ServiceAccessPoint.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_ServiceAccessPoint.Java_Package_List.size(); i++) {
			if (((String)CIM_ServiceAccessPoint.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_ServiceAccessPoint.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_TYPEOFACCESS = {"Unknown","Read Only","Read/Write"};
	
	
	public final static int TYPEOFACCESS_UNKNOWN = 0;
	public final static int TYPEOFACCESS_READONLY = 1;
	public final static int TYPEOFACCESS_READ_WRITE = 2;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_SNMPCommunityString() {

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
	public CIM_SNMPCommunityString(Vector keyProperties){ 
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
	public CIM_SNMPCommunityString(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_SNMPCommunityString)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_SNMPCommunityString)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_SNMPCommunityString)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_SNMPCommunityString)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_SNMPCommunityString)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_SNMPCommunityString)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_SNMPCommunityString)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_SNMPCommunityString)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_SNMPCommunityString)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_SNMPCommunityString)object).cimObjectPath)) {
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
	
	// Attribute CommunityString
	
	public String get_CommunityString() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPCommunityString.CIM_PROPERTY_COMMUNITYSTRING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPCommunityString.CIM_PROPERTY_COMMUNITYSTRING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPCommunityString.CIM_PROPERTY_COMMUNITYSTRING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CommunityString(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPCommunityString.CIM_PROPERTY_COMMUNITYSTRING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPCommunityString.CIM_PROPERTY_COMMUNITYSTRING + " could not be found");
    		
		} else if (!CIM_SNMPCommunityStringHelper.isValid_CommunityString(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SNMPCommunityString.CIM_PROPERTY_COMMUNITYSTRING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPCommunityString.CIM_PROPERTY_COMMUNITYSTRING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LogicalEntitiesAccessed
	
	public String[] get_LogicalEntitiesAccessed() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPCommunityString.CIM_PROPERTY_LOGICALENTITIESACCESSED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPCommunityString.CIM_PROPERTY_LOGICALENTITIESACCESSED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPCommunityString.CIM_PROPERTY_LOGICALENTITIESACCESSED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_LogicalEntitiesAccessed(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPCommunityString.CIM_PROPERTY_LOGICALENTITIESACCESSED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPCommunityString.CIM_PROPERTY_LOGICALENTITIESACCESSED + " could not be found");
    		
		} else if (!CIM_SNMPCommunityStringHelper.isValid_LogicalEntitiesAccessed(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SNMPCommunityString.CIM_PROPERTY_LOGICALENTITIESACCESSED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPCommunityString.CIM_PROPERTY_LOGICALENTITIESACCESSED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LogicalEntitiesDescriptions
	
	public String[] get_LogicalEntitiesDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPCommunityString.CIM_PROPERTY_LOGICALENTITIESDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPCommunityString.CIM_PROPERTY_LOGICALENTITIESDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPCommunityString.CIM_PROPERTY_LOGICALENTITIESDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_LogicalEntitiesDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPCommunityString.CIM_PROPERTY_LOGICALENTITIESDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPCommunityString.CIM_PROPERTY_LOGICALENTITIESDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_SNMPCommunityStringHelper.isValid_LogicalEntitiesDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SNMPCommunityString.CIM_PROPERTY_LOGICALENTITIESDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPCommunityString.CIM_PROPERTY_LOGICALENTITIESDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TypeOfAccess
	
	public UnsignedInt16 get_TypeOfAccess() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPCommunityString.CIM_PROPERTY_TYPEOFACCESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPCommunityString.CIM_PROPERTY_TYPEOFACCESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPCommunityString.CIM_PROPERTY_TYPEOFACCESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TypeOfAccess(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPCommunityString.CIM_PROPERTY_TYPEOFACCESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPCommunityString.CIM_PROPERTY_TYPEOFACCESS + " could not be found");
    		
		} else if (!CIM_SNMPCommunityStringHelper.isValid_TypeOfAccess(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SNMPCommunityString.CIM_PROPERTY_TYPEOFACCESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPCommunityString.CIM_PROPERTY_TYPEOFACCESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
