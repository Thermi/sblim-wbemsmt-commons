/** 
 * CIM_ZoneService.java
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
 * Description:  The ZoneService if responsible for managing the zone enforcement for the
 * fabric. The ZoneService is hosted on an AdminDomain. This is depicted by the
 * HostedService association.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMArgument;
import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.cim.UnsignedInt32;
import org.sblim.wbem.client.CIMClient;



/**
 *  The ZoneService if responsible for managing the zone enforcement for the
 * fabric. The ZoneService is hosted on an AdminDomain. This is depicted by the
 * HostedService association.
 */
public class CIM_ZoneService extends CIM_Service  {
	
	public final static String CIM_CLASS_NAME = "CIM_ZoneService"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	RequestedSessionState is an integer enumeration indicating whether the ZoneService session has been requested to start (value = 2), end (3), or terminate (4). Note that when RequestedSessionState is set to 4 ("Not Applicable"), then this property is not used. By default, the element's RequestedSessionState is 5 ("No Change").
	*/
	public final static String CIM_PROPERTY_REQUESTEDSESSIONSTATE = "RequestedSessionState"; //$NON-NLS-1$
	/**
	*	SessionState is an integer enumeration indicating whether the session is currently starting (value = 2), or ended (value = 3). It is possible that a particular instance of a ZoneService may not support sessions. If this occurs, the value 4 ("Not Applicable") is used.
	*/
	public final static String CIM_PROPERTY_SESSIONSTATE = "SessionState"; //$NON-NLS-1$
	
	
	/**
	*	Activates the specified ZoneSet. Once the ZoneSet in activated, the ZoneSet and associatiated Zone, ZoneAliases, and ZoneMembershipSettingData instances will have the active flag set to true. 

This method maybe deprecated in the future in lieu of intrinsics once limitations in the CIM Operations are addressed.
	*/
	public final static String CIM_METHOD_ACTIVATEZONESET = "ActivateZoneSet";
	/**
	*	Adds to the ZoneSet the specified Zone. Adding a Zone to a ZoneSet, extends the zone enforcement definition of the ZoneSet to include the members of that Zone. If adding the Zone is, successful, the Zone should be associated to the ZoneSet by MemberOfCollection. 

This method maybe deprecated in the future in lieu of intrinsics once limitations in the CIM Operations are addressed.
	*/
	public final static String CIM_METHOD_ADDZONE = "AddZone";
	/**
	*	Adds to the Zone the specified ZoneAlias. 

This method maybe deprecated in the future in lieu of intrinsics once limitations in the CIM Operations are addressed.
	*/
	public final static String CIM_METHOD_ADDZONEALIAS = "AddZoneAlias";
	/**
	*	Adds to the Zone or ZoneAlias the specified ZoneMembershipSettingData. If adding the ZoneMembershipSettingData is successful, an ElementSettingData association will be created between the ZoneMembershipSettingData and either the Zone or ZoneAlias. 

This method maybe deprecated in the future in lieu of intrinsics once limitations in the CIM Operations are addressed.
	*/
	public final static String CIM_METHOD_ADDZONEMEMBERSHIPSETTINGDATA = "AddZoneMembershipSettingData";
	/**
	*	The method creates a Zone and the association HostedCollection. The newly created association, HostedCollection, associates the Zone to the same AdminDomain the ZoneService is hosted to. For the newly created Zone, the Active property is always set to false. 

This method maybe deprecated in the future in lieu of intrinsics once limitations in the CIM Operations are addressed.
	*/
	public final static String CIM_METHOD_CREATEZONE = "CreateZone";
	/**
	*	The method creates a ZoneAlias and the association HostedCollection. The newly created association, HostedCollection, associates the ZoneAlias to the same AdminDomain the ZoneService is hosted to. For the newly created ZoneAlias, the Active property is always set to false. 

This method maybe deprecated in the future in lieu of intrinsics once limitations in the CIM Operations are addressed.
	*/
	public final static String CIM_METHOD_CREATEZONEALIAS = "CreateZoneAlias";
	/**
	*	CreateZoneMembershipSettingData creates a ZoneMembershipSettingData and adds it to the specified Zone or ZoneAlias by creating a MemberOfCollection association. 

This method maybe deprecated in the future in lieu of intrinsics once limitations in the CIM Operations are addressed.
	*/
	public final static String CIM_METHOD_CREATEZONEMEMBERSHIPSETTINGDATA = "CreateZoneMembershipSettingData";
	/**
	*	The method creates a ZoneSet and the association HostedCollection. The newly created association, HostedCollection, associates the Zone to the same AdminDomain the ZoneService is hosted to. For the newly created ZoneSet, the Active property is always set to false. 

This method maybe deprecated in the future in lieu of intrinsics once limitations in the CIM Operations are addressed.
	*/
	public final static String CIM_METHOD_CREATEZONESET = "CreateZoneSet";
	/**
	*	SessionControl requests that a session start (value = 2), end (3), or terminate (4).
	*/
	public final static String CIM_METHOD_SESSIONCONTROL = "SessionControl";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_REQUESTEDSESSIONSTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SESSIONSTATE);
				
		for (int i = 0; i < CIM_Service.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REQUESTEDSESSIONSTATE)||
				((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SESSIONSTATE)){
				continue;
			}
			
			CIM_ZoneService.CIM_PropertyNameList.add(CIM_Service.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REQUESTEDSESSIONSTATE, new CIMValue(new UnsignedInt16("5"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SESSIONSTATE, new CIMValue(new UnsignedInt16("4"), new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_Service.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REQUESTEDSESSIONSTATE)||
				((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SESSIONSTATE)){
				continue;
			}
			
			CIM_ZoneService.CIM_PropertyList.add(CIM_Service.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_Service.Java_Package_List.size(); i++) {
			if (((String)CIM_Service.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_Service.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_REQUESTEDSESSIONSTATE = {"Start","End","Terminate","No Change"};
	public final static String[] CIM_VALUEMAP_SESSIONSTATE = {"Unknown","Starting","Ended","Not Applicable"};
	
	
	public final static int REQUESTEDSESSIONSTATE_START = 2;
	public final static int REQUESTEDSESSIONSTATE_END = 3;
	public final static int REQUESTEDSESSIONSTATE_TERMINATE = 4;
	public final static int REQUESTEDSESSIONSTATE_NOCHANGE = 5;
	
	public final static int SESSIONSTATE_UNKNOWN = 0;
	public final static int SESSIONSTATE_STARTING = 2;
	public final static int SESSIONSTATE_ENDED = 3;
	public final static int SESSIONSTATE_NOTAPPLICABLE = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ZoneService() {

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
	public CIM_ZoneService(Vector keyProperties){ 
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
	public CIM_ZoneService(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_ZoneService)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ZoneService)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ZoneService)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ZoneService)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ZoneService)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ZoneService)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ZoneService)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ZoneService)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ZoneService)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ZoneService)object).cimObjectPath)) {
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
	
	// Attribute RequestedSessionState
	
	public UnsignedInt16 get_RequestedSessionState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ZoneService.CIM_PROPERTY_REQUESTEDSESSIONSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ZoneService.CIM_PROPERTY_REQUESTEDSESSIONSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ZoneService.CIM_PROPERTY_REQUESTEDSESSIONSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RequestedSessionState(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ZoneService.CIM_PROPERTY_REQUESTEDSESSIONSTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ZoneService.CIM_PROPERTY_REQUESTEDSESSIONSTATE + " could not be found");
    		
		} else if (!CIM_ZoneServiceHelper.isValid_RequestedSessionState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ZoneService.CIM_PROPERTY_REQUESTEDSESSIONSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ZoneService.CIM_PROPERTY_REQUESTEDSESSIONSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SessionState
	
	public UnsignedInt16 get_SessionState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ZoneService.CIM_PROPERTY_SESSIONSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ZoneService.CIM_PROPERTY_SESSIONSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ZoneService.CIM_PROPERTY_SESSIONSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SessionState(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ZoneService.CIM_PROPERTY_SESSIONSTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ZoneService.CIM_PROPERTY_SESSIONSTATE + " could not be found");
    		
		} else if (!CIM_ZoneServiceHelper.isValid_SessionState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ZoneService.CIM_PROPERTY_SESSIONSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ZoneService.CIM_PROPERTY_SESSIONSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt32 invoke_activateZoneSet(CIMClient cimClient, CIM_ZoneSet ZoneSet, Boolean Activate) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_ZoneService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_ZoneSet = new CIMValue(ZoneSet.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_Activate = new CIMValue(Activate, new CIMDataType(CIMDataType.BOOLEAN));
		
	  	inParameter.add(new CIMArgument("ZoneSet", cimValue_ZoneSet));
		inParameter.add(new CIMArgument("Activate", cimValue_Activate));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_ACTIVATEZONESET,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_ZoneService.CIM_METHOD_ACTIVATEZONESET + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_ZoneService.CIM_METHOD_ACTIVATEZONESET + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_ZoneService.CIM_METHOD_ACTIVATEZONESET + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_addZone(CIMClient cimClient, CIM_ZoneSet ZoneSet, CIM_Zone Zone) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_ZoneService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_ZoneSet = new CIMValue(ZoneSet.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_Zone = new CIMValue(Zone.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("ZoneSet", cimValue_ZoneSet));
		inParameter.add(new CIMArgument("Zone", cimValue_Zone));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_ADDZONE,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_ZoneService.CIM_METHOD_ADDZONE + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_ZoneService.CIM_METHOD_ADDZONE + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_ZoneService.CIM_METHOD_ADDZONE + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_addZoneAlias(CIMClient cimClient, CIM_Zone Zone, CIM_NamedAddressCollection ZoneAlias) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_ZoneService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_Zone = new CIMValue(Zone.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_ZoneAlias = new CIMValue(ZoneAlias.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("Zone", cimValue_Zone));
		inParameter.add(new CIMArgument("ZoneAlias", cimValue_ZoneAlias));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_ADDZONEALIAS,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_ZoneService.CIM_METHOD_ADDZONEALIAS + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_ZoneService.CIM_METHOD_ADDZONEALIAS + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_ZoneService.CIM_METHOD_ADDZONEALIAS + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_addZoneMembershipSettingData(CIMClient cimClient, CIM_SystemSpecificCollection SystemSpecificCollection, CIM_ZoneMembershipSettingData ZoneMembershipSettingData) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_ZoneService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_SystemSpecificCollection = new CIMValue(SystemSpecificCollection.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_ZoneMembershipSettingData = new CIMValue(ZoneMembershipSettingData.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("SystemSpecificCollection", cimValue_SystemSpecificCollection));
		inParameter.add(new CIMArgument("ZoneMembershipSettingData", cimValue_ZoneMembershipSettingData));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_ADDZONEMEMBERSHIPSETTINGDATA,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_ZoneService.CIM_METHOD_ADDZONEMEMBERSHIPSETTINGDATA + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_ZoneService.CIM_METHOD_ADDZONEMEMBERSHIPSETTINGDATA + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_ZoneService.CIM_METHOD_ADDZONEMEMBERSHIPSETTINGDATA + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_createZone(CIMClient cimClient, String ZoneName, UnsignedInt16 ZoneType, UnsignedInt16 ZoneSubType, CIM_Zone Zone) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_ZoneService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_ZoneName = new CIMValue(ZoneName, new CIMDataType(CIMDataType.STRING));
		CIMValue cimValue_ZoneType = new CIMValue(ZoneType, new CIMDataType(CIMDataType.UINT16));
		CIMValue cimValue_ZoneSubType = new CIMValue(ZoneSubType, new CIMDataType(CIMDataType.UINT16));
		CIMValue cimValue_Zone = new CIMValue(Zone.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("ZoneName", cimValue_ZoneName));
		inParameter.add(new CIMArgument("ZoneType", cimValue_ZoneType));
		inParameter.add(new CIMArgument("ZoneSubType", cimValue_ZoneSubType));
		inParameter.add(new CIMArgument("Zone", cimValue_Zone));
		
	  	outParameter.add(new CIMArgument("Zone", cimValue_Zone));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_CREATEZONE,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_ZoneService.CIM_METHOD_CREATEZONE + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_ZoneService.CIM_METHOD_CREATEZONE + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_ZoneService.CIM_METHOD_CREATEZONE + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_createZoneAlias(CIMClient cimClient, String CollectionAlias, CIM_NamedAddressCollection ZoneAlias) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_ZoneService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_CollectionAlias = new CIMValue(CollectionAlias, new CIMDataType(CIMDataType.STRING));
		CIMValue cimValue_ZoneAlias = new CIMValue(ZoneAlias.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("CollectionAlias", cimValue_CollectionAlias));
		inParameter.add(new CIMArgument("ZoneAlias", cimValue_ZoneAlias));
		
	  	outParameter.add(new CIMArgument("ZoneAlias", cimValue_ZoneAlias));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_CREATEZONEALIAS,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_ZoneService.CIM_METHOD_CREATEZONEALIAS + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_ZoneService.CIM_METHOD_CREATEZONEALIAS + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_ZoneService.CIM_METHOD_CREATEZONEALIAS + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_createZoneMembershipSettingData(CIMClient cimClient, UnsignedInt16 ConnectivityMemberType, String ConnectivityMemberID, CIM_SystemSpecificCollection SystemSpecificCollection, CIM_ZoneMembershipSettingData ZoneMembershipSettingData) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_ZoneService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_ConnectivityMemberType = new CIMValue(ConnectivityMemberType, new CIMDataType(CIMDataType.UINT16));
		CIMValue cimValue_ConnectivityMemberID = new CIMValue(ConnectivityMemberID, new CIMDataType(CIMDataType.STRING));
		CIMValue cimValue_SystemSpecificCollection = new CIMValue(SystemSpecificCollection.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_ZoneMembershipSettingData = new CIMValue(ZoneMembershipSettingData.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("ConnectivityMemberType", cimValue_ConnectivityMemberType));
		inParameter.add(new CIMArgument("ConnectivityMemberID", cimValue_ConnectivityMemberID));
		inParameter.add(new CIMArgument("SystemSpecificCollection", cimValue_SystemSpecificCollection));
		inParameter.add(new CIMArgument("ZoneMembershipSettingData", cimValue_ZoneMembershipSettingData));
		
	  	outParameter.add(new CIMArgument("ZoneMembershipSettingData", cimValue_ZoneMembershipSettingData));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_CREATEZONEMEMBERSHIPSETTINGDATA,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_ZoneService.CIM_METHOD_CREATEZONEMEMBERSHIPSETTINGDATA + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_ZoneService.CIM_METHOD_CREATEZONEMEMBERSHIPSETTINGDATA + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_ZoneService.CIM_METHOD_CREATEZONEMEMBERSHIPSETTINGDATA + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_createZoneSet(CIMClient cimClient, String ZoneSetName, CIM_ZoneSet ZoneSet) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_ZoneService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_ZoneSetName = new CIMValue(ZoneSetName, new CIMDataType(CIMDataType.STRING));
		CIMValue cimValue_ZoneSet = new CIMValue(ZoneSet.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("ZoneSetName", cimValue_ZoneSetName));
		inParameter.add(new CIMArgument("ZoneSet", cimValue_ZoneSet));
		
	  	outParameter.add(new CIMArgument("ZoneSet", cimValue_ZoneSet));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_CREATEZONESET,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_ZoneService.CIM_METHOD_CREATEZONESET + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_ZoneService.CIM_METHOD_CREATEZONESET + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_ZoneService.CIM_METHOD_CREATEZONESET + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_sessionControl(CIMClient cimClient, UnsignedInt16 RequestedSessionState) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_ZoneService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_RequestedSessionState = new CIMValue(RequestedSessionState, new CIMDataType(CIMDataType.UINT16));
		
	  	inParameter.add(new CIMArgument("RequestedSessionState", cimValue_RequestedSessionState));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_SESSIONCONTROL,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_ZoneService.CIM_METHOD_SESSIONCONTROL + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_ZoneService.CIM_METHOD_SESSIONCONTROL + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_ZoneService.CIM_METHOD_SESSIONCONTROL + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
