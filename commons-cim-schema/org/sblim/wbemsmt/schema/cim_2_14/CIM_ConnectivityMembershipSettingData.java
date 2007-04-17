/** 
 * CIM_ConnectivityMembershipSettingData.java
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
 * Description:  ConnectivityMembershipSettingData provides the identification criteria for
 * possible members of a ConnectivityCollection.
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
 *  ConnectivityMembershipSettingData provides the identification criteria for
 * possible members of a ConnectivityCollection.
 */
public class CIM_ConnectivityMembershipSettingData extends CIM_SettingData  {
	
	public final static String CIM_CLASS_NAME = "CIM_ConnectivityMembershipSettingData"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	The identification of the member, based on the type specified by ConnectivityMemberType.
	*/
	public final static String CIM_PROPERTY_CONNECTIVITYMEMBERID = "ConnectivityMemberID"; //$NON-NLS-1$
	/**
	*	ConnectivityMemberType specifies the type of identification used in the ConnectivityMemberID field.
	*/
	public final static String CIM_PROPERTY_CONNECTIVITYMEMBERTYPE = "ConnectivityMemberType"; //$NON-NLS-1$
	/**
	*	This property specifies the type of identification used in the ConnectivityMemberID field, when ConnectivityMemberType is 1, "Other".
	*/
	public final static String CIM_PROPERTY_OTHERCONNECTIVITYMEMBERTYPE = "OtherConnectivityMemberType"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CONNECTIVITYMEMBERID);
		CIM_PropertyNameList.add(CIM_PROPERTY_CONNECTIVITYMEMBERTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERCONNECTIVITYMEMBERTYPE);
				
		for (int i = 0; i < CIM_SettingData.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CONNECTIVITYMEMBERID)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CONNECTIVITYMEMBERTYPE)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERCONNECTIVITYMEMBERTYPE)){
				continue;
			}
			
			CIM_ConnectivityMembershipSettingData.CIM_PropertyNameList.add(CIM_SettingData.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CONNECTIVITYMEMBERID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CONNECTIVITYMEMBERTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERCONNECTIVITYMEMBERTYPE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_SettingData.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CONNECTIVITYMEMBERID)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CONNECTIVITYMEMBERTYPE)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERCONNECTIVITYMEMBERTYPE)){
				continue;
			}
			
			CIM_ConnectivityMembershipSettingData.CIM_PropertyList.add(CIM_SettingData.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_SettingData.Java_Package_List.size(); i++) {
			if (((String)CIM_SettingData.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_SettingData.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_CONNECTIVITYMEMBERTYPE = {"Unknown","Other","Permanent Address","Network Address","Switch Port ID","Logical Port Group","Connectivity Collection","DMTF Reserved","Vendor Reserved"};
	
	
	public final static String CONNECTIVITYMEMBERTYPE_UNKNOWN = "0";
	public final static String CONNECTIVITYMEMBERTYPE_OTHER = "1";
	public final static String CONNECTIVITYMEMBERTYPE_PERMANENTADDRESS = "2";
	public final static String CONNECTIVITYMEMBERTYPE_NETWORKADDRESS = "3";
	public final static String CONNECTIVITYMEMBERTYPE_SWITCHPORTID = "4";
	public final static String CONNECTIVITYMEMBERTYPE_LOGICALPORTGROUP = "5";
	public final static String CONNECTIVITYMEMBERTYPE_CONNECTIVITYCOLLECTION = "6";
	public final static String CONNECTIVITYMEMBERTYPE_DMTFRESERVED = "..";
	public final static String CONNECTIVITYMEMBERTYPE_VENDORRESERVED = "0x8000..";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ConnectivityMembershipSettingData() {

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
	public CIM_ConnectivityMembershipSettingData(Vector keyProperties){ 
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
	public CIM_ConnectivityMembershipSettingData(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_ConnectivityMemberID = this.cimInstance.getProperty(CIM_PROPERTY_CONNECTIVITYMEMBERID);
		
		if (CIMProperty_ConnectivityMemberID == null || CIMProperty_ConnectivityMemberID.getValue().isEmpty() || CIMProperty_ConnectivityMemberID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_CONNECTIVITYMEMBERID, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_ConnectivityMemberType = this.cimInstance.getProperty(CIM_PROPERTY_CONNECTIVITYMEMBERTYPE);
		
		if (CIMProperty_ConnectivityMemberType == null || CIMProperty_ConnectivityMemberType.getValue().isEmpty() || CIMProperty_ConnectivityMemberType.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_CONNECTIVITYMEMBERTYPE, "Required"});
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
	    
	    if (!(object instanceof CIM_ConnectivityMembershipSettingData)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ConnectivityMembershipSettingData)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ConnectivityMembershipSettingData)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ConnectivityMembershipSettingData)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ConnectivityMembershipSettingData)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ConnectivityMembershipSettingData)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ConnectivityMembershipSettingData)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ConnectivityMembershipSettingData)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ConnectivityMembershipSettingData)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ConnectivityMembershipSettingData)object).cimObjectPath)) {
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
	
	// Attribute ConnectivityMemberID
	
	public String get_ConnectivityMemberID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConnectivityMembershipSettingData.CIM_PROPERTY_CONNECTIVITYMEMBERID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConnectivityMembershipSettingData.CIM_PROPERTY_CONNECTIVITYMEMBERID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConnectivityMembershipSettingData.CIM_PROPERTY_CONNECTIVITYMEMBERID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ConnectivityMemberID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConnectivityMembershipSettingData.CIM_PROPERTY_CONNECTIVITYMEMBERID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConnectivityMembershipSettingData.CIM_PROPERTY_CONNECTIVITYMEMBERID + " could not be found");
    		
		} else if (!CIM_ConnectivityMembershipSettingDataHelper.isValid_ConnectivityMemberID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ConnectivityMembershipSettingData.CIM_PROPERTY_CONNECTIVITYMEMBERID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConnectivityMembershipSettingData.CIM_PROPERTY_CONNECTIVITYMEMBERID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ConnectivityMemberType
	
	public UnsignedInt16 get_ConnectivityMemberType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConnectivityMembershipSettingData.CIM_PROPERTY_CONNECTIVITYMEMBERTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConnectivityMembershipSettingData.CIM_PROPERTY_CONNECTIVITYMEMBERTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConnectivityMembershipSettingData.CIM_PROPERTY_CONNECTIVITYMEMBERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ConnectivityMemberType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConnectivityMembershipSettingData.CIM_PROPERTY_CONNECTIVITYMEMBERTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConnectivityMembershipSettingData.CIM_PROPERTY_CONNECTIVITYMEMBERTYPE + " could not be found");
    		
		} else if (!CIM_ConnectivityMembershipSettingDataHelper.isValid_ConnectivityMemberType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ConnectivityMembershipSettingData.CIM_PROPERTY_CONNECTIVITYMEMBERTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConnectivityMembershipSettingData.CIM_PROPERTY_CONNECTIVITYMEMBERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherConnectivityMemberType
	
	public String get_OtherConnectivityMemberType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConnectivityMembershipSettingData.CIM_PROPERTY_OTHERCONNECTIVITYMEMBERTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConnectivityMembershipSettingData.CIM_PROPERTY_OTHERCONNECTIVITYMEMBERTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConnectivityMembershipSettingData.CIM_PROPERTY_OTHERCONNECTIVITYMEMBERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherConnectivityMemberType(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConnectivityMembershipSettingData.CIM_PROPERTY_OTHERCONNECTIVITYMEMBERTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConnectivityMembershipSettingData.CIM_PROPERTY_OTHERCONNECTIVITYMEMBERTYPE + " could not be found");
    		
		} else if (!CIM_ConnectivityMembershipSettingDataHelper.isValid_OtherConnectivityMemberType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ConnectivityMembershipSettingData.CIM_PROPERTY_OTHERCONNECTIVITYMEMBERTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConnectivityMembershipSettingData.CIM_PROPERTY_OTHERCONNECTIVITYMEMBERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
