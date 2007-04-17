/** 
 * CIM_StorageHardwareID.java
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
 * Description:  CIM_StorageHardwareID is a hardware ID that serves as an authorization subject.
 * Example are host controller IDs that serve as authorization subjects in disk
 * array LUN Masking.
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
 *  CIM_StorageHardwareID is a hardware ID that serves as an authorization subject.
 * Example are host controller IDs that serve as authorization subjects in disk
 * array LUN Masking.
 */
public class CIM_StorageHardwareID extends CIM_Identity  {
	
	public final static String CIM_CLASS_NAME = "CIM_StorageHardwareID"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.1000";
	
	
	/**
	*	The type of the ID property. iSCSI IDs may use one of three iSCSI formats - iqn, eui, or naa. This three letter format is the name prefix; so a single iSCSI type is provided here, the prefix can be used to further refine the format.
	*/
	public final static String CIM_PROPERTY_IDTYPE = "IDType"; //$NON-NLS-1$
	/**
	*	The ID type when IDType is "Other".
	*/
	public final static String CIM_PROPERTY_OTHERIDTYPE = "OtherIDType"; //$NON-NLS-1$
	/**
	*	The hardware worldwide unique ID.
	*/
	public final static String CIM_PROPERTY_STORAGEID = "StorageID"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_IDTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERIDTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_STORAGEID);
				
		for (int i = 0; i < CIM_Identity.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Identity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_IDTYPE)||
				((String)CIM_Identity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERIDTYPE)||
				((String)CIM_Identity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STORAGEID)){
				continue;
			}
			
			CIM_StorageHardwareID.CIM_PropertyNameList.add(CIM_Identity.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_IDTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERIDTYPE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STORAGEID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_Identity.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Identity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_IDTYPE)||
				((CIMProperty)CIM_Identity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERIDTYPE)||
				((CIMProperty)CIM_Identity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STORAGEID)){
				continue;
			}
			
			CIM_StorageHardwareID.CIM_PropertyList.add(CIM_Identity.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_Identity.Java_Package_List.size(); i++) {
			if (((String)CIM_Identity.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_Identity.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_IDTYPE = {"Other","PortWWN","NodeWWN","Hostname","iSCSI Name"};
	
	
	public final static int IDTYPE_OTHER = 1;
	public final static int IDTYPE_PORTWWN = 2;
	public final static int IDTYPE_NODEWWN = 3;
	public final static int IDTYPE_HOSTNAME = 4;
	public final static int IDTYPE_ISCSINAME = 5;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_StorageHardwareID() {

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
	public CIM_StorageHardwareID(Vector keyProperties){ 
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
	public CIM_StorageHardwareID(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_IDType = this.cimInstance.getProperty(CIM_PROPERTY_IDTYPE);
		
		if (CIMProperty_IDType == null || CIMProperty_IDType.getValue().isEmpty() || CIMProperty_IDType.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_IDTYPE, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_StorageID = this.cimInstance.getProperty(CIM_PROPERTY_STORAGEID);
		
		if (CIMProperty_StorageID == null || CIMProperty_StorageID.getValue().isEmpty() || CIMProperty_StorageID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_STORAGEID, "Required"});
			result = false;
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
	    
	    if (!(object instanceof CIM_StorageHardwareID)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_StorageHardwareID)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_StorageHardwareID)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_StorageHardwareID)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_StorageHardwareID)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_StorageHardwareID)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_StorageHardwareID)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_StorageHardwareID)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_StorageHardwareID)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_StorageHardwareID)object).cimObjectPath)) {
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
	
	// Attribute IDType
	
	public UnsignedInt16 get_IDType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageHardwareID.CIM_PROPERTY_IDTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageHardwareID.CIM_PROPERTY_IDTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageHardwareID.CIM_PROPERTY_IDTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IDType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageHardwareID.CIM_PROPERTY_IDTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageHardwareID.CIM_PROPERTY_IDTYPE + " could not be found");
    		
		} else if (!CIM_StorageHardwareIDHelper.isValid_IDType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageHardwareID.CIM_PROPERTY_IDTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageHardwareID.CIM_PROPERTY_IDTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherIDType
	
	public String get_OtherIDType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageHardwareID.CIM_PROPERTY_OTHERIDTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageHardwareID.CIM_PROPERTY_OTHERIDTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageHardwareID.CIM_PROPERTY_OTHERIDTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherIDType(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageHardwareID.CIM_PROPERTY_OTHERIDTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageHardwareID.CIM_PROPERTY_OTHERIDTYPE + " could not be found");
    		
		} else if (!CIM_StorageHardwareIDHelper.isValid_OtherIDType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageHardwareID.CIM_PROPERTY_OTHERIDTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageHardwareID.CIM_PROPERTY_OTHERIDTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute StorageID
	
	public String get_StorageID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageHardwareID.CIM_PROPERTY_STORAGEID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageHardwareID.CIM_PROPERTY_STORAGEID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageHardwareID.CIM_PROPERTY_STORAGEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_StorageID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageHardwareID.CIM_PROPERTY_STORAGEID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageHardwareID.CIM_PROPERTY_STORAGEID + " could not be found");
    		
		} else if (!CIM_StorageHardwareIDHelper.isValid_StorageID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageHardwareID.CIM_PROPERTY_STORAGEID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageHardwareID.CIM_PROPERTY_STORAGEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}