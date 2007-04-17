/** 
 * CIM_Zone.java
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
 * Description:  A Zone is a group of Ports, Endpoints, Nodes, Zones, and
 * NamedAddressCollections that are managed collectively by the same domain. The
 * managing domain is indicated by the HostedCollection association. For Fibre
 * Channel, a Zone indicates a set of members that are participating together in
 * the fabric.
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
 *  A Zone is a group of Ports, Endpoints, Nodes, Zones, and
 * NamedAddressCollections that are managed collectively by the same domain. The
 * managing domain is indicated by the HostedCollection association. For Fibre
 * Channel, a Zone indicates a set of members that are participating together in
 * the fabric.
 */
public class CIM_Zone extends CIM_ConnectivityCollection  {
	
	public final static String CIM_CLASS_NAME = "CIM_Zone"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.10.0";
	
	
	/**
	*	Indicates that this Zone is currently active (that is, under enforcement of a fabric). This property can be used to distinguish between a Zone that is currently active and a snapshot of a Zone (with the same InstanceName) that is for "offline" editing.
	*/
	public final static String CIM_PROPERTY_ACTIVE = "Active"; //$NON-NLS-1$
	/**
	*	A user-friendly name for the Zone that is unique within the AdminDomain.
	*/
	public final static String CIM_PROPERTY_ELEMENTNAME = "ElementName"; //$NON-NLS-1$
	/**
	*	A string that describes the ZoneSubType when the ZoneSubType value is 1 "Other".
	*/
	public final static String CIM_PROPERTY_OTHERZONESUBTYPEDESCRIPTION = "OtherZoneSubTypeDescription"; //$NON-NLS-1$
	/**
	*	A string that describes the ZoneType when the ZoneType value is 1 "Other".
	*/
	public final static String CIM_PROPERTY_OTHERZONETYPEDESCRIPTION = "OtherZoneTypeDescription"; //$NON-NLS-1$
	/**
	*	Specific clarification to be used when the ProtocolType has an enumeration that requires it. Specifically, if ProtocolType is "Protocol", then SubType is the Fibre Channel FC4 type.
	*/
	public final static String CIM_PROPERTY_ZONESUBTYPE = "ZoneSubType"; //$NON-NLS-1$
	/**
	*	The type of zoning to be enforced.
	*/
	public final static String CIM_PROPERTY_ZONETYPE = "ZoneType"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ACTIVE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ELEMENTNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERZONESUBTYPEDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERZONETYPEDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_ZONESUBTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ZONETYPE);
				
		for (int i = 0; i < CIM_ConnectivityCollection.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ConnectivityCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACTIVE)||
				((String)CIM_ConnectivityCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ELEMENTNAME)||
				((String)CIM_ConnectivityCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERZONESUBTYPEDESCRIPTION)||
				((String)CIM_ConnectivityCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERZONETYPEDESCRIPTION)||
				((String)CIM_ConnectivityCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ZONESUBTYPE)||
				((String)CIM_ConnectivityCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ZONETYPE)){
				continue;
			}
			
			CIM_Zone.CIM_PropertyNameList.add(CIM_ConnectivityCollection.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACTIVE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ELEMENTNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERZONESUBTYPEDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERZONETYPEDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ZONESUBTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ZONETYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_ConnectivityCollection.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ConnectivityCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACTIVE)||
				((CIMProperty)CIM_ConnectivityCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ELEMENTNAME)||
				((CIMProperty)CIM_ConnectivityCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERZONESUBTYPEDESCRIPTION)||
				((CIMProperty)CIM_ConnectivityCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERZONETYPEDESCRIPTION)||
				((CIMProperty)CIM_ConnectivityCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ZONESUBTYPE)||
				((CIMProperty)CIM_ConnectivityCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ZONETYPE)){
				continue;
			}
			
			CIM_Zone.CIM_PropertyList.add(CIM_ConnectivityCollection.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_ConnectivityCollection.Java_Package_List.size(); i++) {
			if (((String)CIM_ConnectivityCollection.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_ConnectivityCollection.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ZONESUBTYPE = {"Unknown","Other","SCSI","VI","IP","DMTF Reserved","Vendor Reserved"};
	public final static String[] CIM_VALUEMAP_ZONETYPE = {"Unknown","Other","Default","Protocol","DMTF Reserved","Vendor Reserved"};
	
	
	public final static String ZONESUBTYPE_UNKNOWN = "0";
	public final static String ZONESUBTYPE_OTHER = "1";
	public final static String ZONESUBTYPE_SCSI = "2";
	public final static String ZONESUBTYPE_VI = "3";
	public final static String ZONESUBTYPE_IP = "4";
	public final static String ZONESUBTYPE_DMTFRESERVED = "..";
	public final static String ZONESUBTYPE_VENDORRESERVED = "32768..65535";
	
	public final static String ZONETYPE_UNKNOWN = "0";
	public final static String ZONETYPE_OTHER = "1";
	public final static String ZONETYPE_DEFAULT = "2";
	public final static String ZONETYPE_PROTOCOL = "3";
	public final static String ZONETYPE_DMTFRESERVED = "..";
	public final static String ZONETYPE_VENDORRESERVED = "32768..65535";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_Zone() {

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
	public CIM_Zone(Vector keyProperties){ 
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
	public CIM_Zone(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_Active = this.cimInstance.getProperty(CIM_PROPERTY_ACTIVE);
		
		if (CIMProperty_Active == null || CIMProperty_Active.getValue().isEmpty() || CIMProperty_Active.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_ACTIVE, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_ElementName = this.cimInstance.getProperty(CIM_PROPERTY_ELEMENTNAME);
		
		if (CIMProperty_ElementName == null || CIMProperty_ElementName.getValue().isEmpty() || CIMProperty_ElementName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_ELEMENTNAME, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_ZoneType = this.cimInstance.getProperty(CIM_PROPERTY_ZONETYPE);
		
		if (CIMProperty_ZoneType == null || CIMProperty_ZoneType.getValue().isEmpty() || CIMProperty_ZoneType.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_ZONETYPE, "Required"});
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
	    
	    if (!(object instanceof CIM_Zone)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_Zone)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_Zone)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_Zone)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_Zone)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_Zone)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_Zone)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_Zone)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_Zone)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_Zone)object).cimObjectPath)) {
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
	
	// Attribute Active
	
	public Boolean get_Active() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Zone.CIM_PROPERTY_ACTIVE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Zone.CIM_PROPERTY_ACTIVE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Zone.CIM_PROPERTY_ACTIVE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Active(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Zone.CIM_PROPERTY_ACTIVE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Zone.CIM_PROPERTY_ACTIVE + " could not be found");
    		
		} else if (!CIM_ZoneHelper.isValid_Active(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Zone.CIM_PROPERTY_ACTIVE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Zone.CIM_PROPERTY_ACTIVE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ElementName
	
	public String get_ElementName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Zone.CIM_PROPERTY_ELEMENTNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Zone.CIM_PROPERTY_ELEMENTNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Zone.CIM_PROPERTY_ELEMENTNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ElementName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Zone.CIM_PROPERTY_ELEMENTNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Zone.CIM_PROPERTY_ELEMENTNAME + " could not be found");
    		
		} else if (!CIM_ZoneHelper.isValid_ElementName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Zone.CIM_PROPERTY_ELEMENTNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Zone.CIM_PROPERTY_ELEMENTNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherZoneSubTypeDescription
	
	public String get_OtherZoneSubTypeDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Zone.CIM_PROPERTY_OTHERZONESUBTYPEDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Zone.CIM_PROPERTY_OTHERZONESUBTYPEDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Zone.CIM_PROPERTY_OTHERZONESUBTYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherZoneSubTypeDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Zone.CIM_PROPERTY_OTHERZONESUBTYPEDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Zone.CIM_PROPERTY_OTHERZONESUBTYPEDESCRIPTION + " could not be found");
    		
		} else if (!CIM_ZoneHelper.isValid_OtherZoneSubTypeDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Zone.CIM_PROPERTY_OTHERZONESUBTYPEDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Zone.CIM_PROPERTY_OTHERZONESUBTYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherZoneTypeDescription
	
	public String get_OtherZoneTypeDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Zone.CIM_PROPERTY_OTHERZONETYPEDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Zone.CIM_PROPERTY_OTHERZONETYPEDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Zone.CIM_PROPERTY_OTHERZONETYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherZoneTypeDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Zone.CIM_PROPERTY_OTHERZONETYPEDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Zone.CIM_PROPERTY_OTHERZONETYPEDESCRIPTION + " could not be found");
    		
		} else if (!CIM_ZoneHelper.isValid_OtherZoneTypeDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Zone.CIM_PROPERTY_OTHERZONETYPEDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Zone.CIM_PROPERTY_OTHERZONETYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ZoneSubType
	
	public UnsignedInt16 get_ZoneSubType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Zone.CIM_PROPERTY_ZONESUBTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Zone.CIM_PROPERTY_ZONESUBTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Zone.CIM_PROPERTY_ZONESUBTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ZoneSubType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Zone.CIM_PROPERTY_ZONESUBTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Zone.CIM_PROPERTY_ZONESUBTYPE + " could not be found");
    		
		} else if (!CIM_ZoneHelper.isValid_ZoneSubType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Zone.CIM_PROPERTY_ZONESUBTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Zone.CIM_PROPERTY_ZONESUBTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ZoneType
	
	public UnsignedInt16 get_ZoneType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Zone.CIM_PROPERTY_ZONETYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Zone.CIM_PROPERTY_ZONETYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Zone.CIM_PROPERTY_ZONETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ZoneType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Zone.CIM_PROPERTY_ZONETYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Zone.CIM_PROPERTY_ZONETYPE + " could not be found");
    		
		} else if (!CIM_ZoneHelper.isValid_ZoneType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Zone.CIM_PROPERTY_ZONETYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Zone.CIM_PROPERTY_ZONETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
