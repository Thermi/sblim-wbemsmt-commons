/** 
 * CIM_IPAssignmentSettingData.java
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
 * Description:  This SettingData instance is the aggregation point identifying an IP
 * configuration. Multiple IP configurations could exist for a target. Each
 * configuration is represented with an instance of IPAssignmentSettingData. The
 * details of the IP configuration are defined by instances of sub-classes of
 * this class (i.e. StaticIPAssignmentSettingData, DHCPSettingData,
 * DNSSettingData). These instances are associated with the
 * IPAssignmentSettingData instance using the OrderedComponent or
 * ConcreteComponent associations. For example, a static IP configuration would
 * be represented by an instance of IPAssignmentSettingData and an instance of
 * StaticIPAssignmentSettingData associated via an instance of
 * ConcreteComponent. A static IP configuration including DNS would be modeled
 * using an instance of IPAssignmentSettingData, DNSSettingData, and
 * StaticIPAssignmentSettingData. The DNSSettingData and
 * StaticIPAssignmentSettingData instance would be associated with the
 * IPAssignmentSettingData using instances of ConcreteComponent.
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
 *  This SettingData instance is the aggregation point identifying an IP
 * configuration. Multiple IP configurations could exist for a target. Each
 * configuration is represented with an instance of IPAssignmentSettingData. The
 * details of the IP configuration are defined by instances of sub-classes of
 * this class (i.e. StaticIPAssignmentSettingData, DHCPSettingData,
 * DNSSettingData). These instances are associated with the
 * IPAssignmentSettingData instance using the OrderedComponent or
 * ConcreteComponent associations. For example, a static IP configuration would
 * be represented by an instance of IPAssignmentSettingData and an instance of
 * StaticIPAssignmentSettingData associated via an instance of
 * ConcreteComponent. A static IP configuration including DNS would be modeled
 * using an instance of IPAssignmentSettingData, DNSSettingData, and
 * StaticIPAssignmentSettingData. The DNSSettingData and
 * StaticIPAssignmentSettingData instance would be associated with the
 * IPAssignmentSettingData using instances of ConcreteComponent.
 */
public class CIM_IPAssignmentSettingData extends CIM_SettingData  {
	
	public final static String CIM_CLASS_NAME = "CIM_IPAssignmentSettingData"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.14.0";
	
	
	/**
	*	AddressOrigin identifies the method by which the IP Address, Subnet Mask, and Gateway were assigned to the IPProtocolEndpoint. A value of 2 indicates that the application of the IPAssignmentSettingData instance does not affect these properties: 
A value of 3 indicates that values for the properties are contained in the IPAssignmentSettingData instance. 
A value of 4 indicates that the values will be assigned via DHCP. 
A value of 5 indicates that the values will be assigned via BOOTP.
	*/
	public final static String CIM_PROPERTY_ADDRESSORIGIN = "AddressOrigin"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ADDRESSORIGIN);
				
		for (int i = 0; i < CIM_SettingData.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ADDRESSORIGIN)){
				continue;
			}
			
			CIM_IPAssignmentSettingData.CIM_PropertyNameList.add(CIM_SettingData.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ADDRESSORIGIN, new CIMValue(new UnsignedInt16("0"), new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_SettingData.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ADDRESSORIGIN)){
				continue;
			}
			
			CIM_IPAssignmentSettingData.CIM_PropertyList.add(CIM_SettingData.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_SettingData.Java_Package_List.size(); i++) {
			if (((String)CIM_SettingData.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_SettingData.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ADDRESSORIGIN = {"Unknown","Other","Not Applicable","Static","DHCP","BOOTP","DMTF Reserved","Vendor Reserved"};
	
	
	public final static String ADDRESSORIGIN_UNKNOWN = "0";
	public final static String ADDRESSORIGIN_OTHER = "1";
	public final static String ADDRESSORIGIN_NOTAPPLICABLE = "2";
	public final static String ADDRESSORIGIN_STATIC = "3";
	public final static String ADDRESSORIGIN_DHCP = "4";
	public final static String ADDRESSORIGIN_BOOTP = "5";
	public final static String ADDRESSORIGIN_DMTFRESERVED = "6..32767";
	public final static String ADDRESSORIGIN_VENDORRESERVED = "32768..";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_IPAssignmentSettingData() {

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
	public CIM_IPAssignmentSettingData(Vector keyProperties){ 
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
	public CIM_IPAssignmentSettingData(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_IPAssignmentSettingData)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_IPAssignmentSettingData)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_IPAssignmentSettingData)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_IPAssignmentSettingData)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_IPAssignmentSettingData)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_IPAssignmentSettingData)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_IPAssignmentSettingData)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_IPAssignmentSettingData)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_IPAssignmentSettingData)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_IPAssignmentSettingData)object).cimObjectPath)) {
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
	
	// Attribute AddressOrigin
	
	public UnsignedInt16 get_AddressOrigin() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPAssignmentSettingData.CIM_PROPERTY_ADDRESSORIGIN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPAssignmentSettingData.CIM_PROPERTY_ADDRESSORIGIN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPAssignmentSettingData.CIM_PROPERTY_ADDRESSORIGIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AddressOrigin(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPAssignmentSettingData.CIM_PROPERTY_ADDRESSORIGIN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPAssignmentSettingData.CIM_PROPERTY_ADDRESSORIGIN + " could not be found");
    		
		} else if (!CIM_IPAssignmentSettingDataHelper.isValid_AddressOrigin(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPAssignmentSettingData.CIM_PROPERTY_ADDRESSORIGIN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPAssignmentSettingData.CIM_PROPERTY_ADDRESSORIGIN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
