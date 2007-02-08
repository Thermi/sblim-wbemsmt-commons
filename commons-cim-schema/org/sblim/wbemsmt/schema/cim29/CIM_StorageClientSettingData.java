/** 
 * CIM_StorageClientSettingData.java
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
 * Description: This class models host environment factors that influence the behavior of Storage Systems. For example, a disk array has different SCSI responses for clients (initiators) configured as AIX verses HPUX. Instances of this setting class can be associated via ElementSettingData to a storage system's LogicalPort, ProtocolController, or Volume instances when these elements have host awareness. These associations are created by the management instrumentation provider to reflect the current configuration. A client deletes/creates these associations to request changes in element host-awareness. This settings class can also be associated with StorageHardwareID instances when that HW ID is configured with host information. An instance of this setting may include several ClientType values if the storage system treats them identically. The storage system exposes all supported setting instances to a WBEM Enumerate request; the client uses the returned settings to determine which types are available.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_StorageClientSettingData extends CIM_SettingData  {
	
	public final static String CIM_CLASS_NAME = "CIM_StorageClientSettingData";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	This enumeration defines operating system, version, driver, and other host environment factors that influence the behavior exposed by storage systems. Values in this array are combined with data from the OtherClientTypeDescriptions property to provide complete information on the host environment.
	*/
	public final static String CIM_PROPERTY_CLIENTTYPES = "ClientTypes"; //$NON-NLS-1$
	/**
	*	When the the corresponding array entry in ClientTypes[] is "Other", this entry provides a string describing the manufacturer and OS/Environment. When the corresponding ClientTypes[] entry is not "Other", this entry allows variations or qualifications of ClientTypes - for example, different versions of Solaris.
	*/
	public final static String CIM_PROPERTY_OTHERCLIENTTYPEDESCRIPTIONS = "OtherClientTypeDescriptions"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CLIENTTYPES);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERCLIENTTYPEDESCRIPTIONS);
				
		for (int i = 0; i < CIM_SettingData.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLIENTTYPES)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERCLIENTTYPEDESCRIPTIONS)){
				continue;
			}
			
			CIM_StorageClientSettingData.CIM_PropertyNameList.add(CIM_SettingData.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLIENTTYPES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERCLIENTTYPEDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
				
		for (int i = 0; i < CIM_SettingData.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLIENTTYPES)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERCLIENTTYPEDESCRIPTIONS)){
				continue;
			}
			
			CIM_StorageClientSettingData.CIM_PropertyList.add(CIM_SettingData.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_SettingData.Java_Package_List.size(); i++) {
			if (((String)CIM_SettingData.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_SettingData.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_CLIENTTYPES = {"Unknown","Other","Standard","Solaris","HPUX","OpenVMS","Tru64","Netware","Sequent","AIX","DGUX","Dynix","Irix","Cisco iSCSI Storage Router","Linux","Microsoft Windows","OS400","TRESPASS","HI-UX","DMTF Reserved","Vendor Specific"};
	
	
	public final static String CLIENTTYPES_UNKNOWN = "0";
	public final static String CLIENTTYPES_OTHER = "1";
	public final static String CLIENTTYPES_STANDARD = "2";
	public final static String CLIENTTYPES_SOLARIS = "3";
	public final static String CLIENTTYPES_HPUX = "4";
	public final static String CLIENTTYPES_OPENVMS = "5";
	public final static String CLIENTTYPES_TRU64 = "6";
	public final static String CLIENTTYPES_NETWARE = "7";
	public final static String CLIENTTYPES_SEQUENT = "8";
	public final static String CLIENTTYPES_AIX = "9";
	public final static String CLIENTTYPES_DGUX = "10";
	public final static String CLIENTTYPES_DYNIX = "11";
	public final static String CLIENTTYPES_IRIX = "12";
	public final static String CLIENTTYPES_CISCOISCSISTORAGEROUTER = "13";
	public final static String CLIENTTYPES_LINUX = "14";
	public final static String CLIENTTYPES_MICROSOFTWINDOWS = "15";
	public final static String CLIENTTYPES_OS400 = "16";
	public final static String CLIENTTYPES_TRESPASS = "17";
	public final static String CLIENTTYPES_HI_UX = "18";
	public final static String CLIENTTYPES_DMTFRESERVED = "19..32767";
	public final static String CLIENTTYPES_VENDORSPECIFIC = "32768..65535";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_StorageClientSettingData() {

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
	public CIM_StorageClientSettingData(Vector keyProperties){ 
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
	public CIM_StorageClientSettingData(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_StorageClientSettingData)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_StorageClientSettingData)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_StorageClientSettingData)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_StorageClientSettingData)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_StorageClientSettingData)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_StorageClientSettingData)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_StorageClientSettingData)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_StorageClientSettingData)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_StorageClientSettingData)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_StorageClientSettingData)object).cimObjectPath)) {
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
	
	// Attribute ClientTypes
	
	public UnsignedInt16[] get_ClientTypes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageClientSettingData.CIM_PROPERTY_CLIENTTYPES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageClientSettingData.CIM_PROPERTY_CLIENTTYPES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageClientSettingData.CIM_PROPERTY_CLIENTTYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_ClientTypes(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageClientSettingData.CIM_PROPERTY_CLIENTTYPES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageClientSettingData.CIM_PROPERTY_CLIENTTYPES + " could not be found");
    		
		} else if (!CIM_StorageClientSettingDataHelper.isValid_ClientTypes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageClientSettingData.CIM_PROPERTY_CLIENTTYPES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageClientSettingData.CIM_PROPERTY_CLIENTTYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherClientTypeDescriptions
	
	public String[] get_OtherClientTypeDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageClientSettingData.CIM_PROPERTY_OTHERCLIENTTYPEDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageClientSettingData.CIM_PROPERTY_OTHERCLIENTTYPEDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageClientSettingData.CIM_PROPERTY_OTHERCLIENTTYPEDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_OtherClientTypeDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageClientSettingData.CIM_PROPERTY_OTHERCLIENTTYPEDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageClientSettingData.CIM_PROPERTY_OTHERCLIENTTYPEDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_StorageClientSettingDataHelper.isValid_OtherClientTypeDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageClientSettingData.CIM_PROPERTY_OTHERCLIENTTYPEDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageClientSettingData.CIM_PROPERTY_OTHERCLIENTTYPEDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
