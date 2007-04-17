/** 
 * CIM_iSCSIConnectionSettings.java
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
 * Description:  The settings for the usage of an iSCSI NetworkPortal by an
 * iSCSIProtcolEndpoint. These settings are the starting point for negotiation
 * for connection establishment. If an implmentation supports different
 * connections settings for a NetworkPortal for each iSCSIProtocolEndpoint that
 * is bound to it, an instance of this class will be associated by
 * ElementSettingData to an instance of iSCSIProtocolEndpoint. If an
 * implementation supports the same connection settings for a NetworkPortal for
 * all iSCSIProtocolEndpoints then an instance of this class will be associated
 * by ElementSettingData to an instance of either TCPProtocolEndpoint (When the
 * NetworkPortal is a target) or IPProtocolEndpoint (When the NetworkPortal is
 * an initiator). The properties that reflect the actual outcome of the
 * negotiation are found in the iSCSIConnection class.
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
import org.sblim.wbem.cim.UnsignedInt32;


/**
 *  The settings for the usage of an iSCSI NetworkPortal by an
 * iSCSIProtcolEndpoint. These settings are the starting point for negotiation
 * for connection establishment. If an implmentation supports different
 * connections settings for a NetworkPortal for each iSCSIProtocolEndpoint that
 * is bound to it, an instance of this class will be associated by
 * ElementSettingData to an instance of iSCSIProtocolEndpoint. If an
 * implementation supports the same connection settings for a NetworkPortal for
 * all iSCSIProtocolEndpoints then an instance of this class will be associated
 * by ElementSettingData to an instance of either TCPProtocolEndpoint (When the
 * NetworkPortal is a target) or IPProtocolEndpoint (When the NetworkPortal is
 * an initiator). The properties that reflect the actual outcome of the
 * negotiation are found in the iSCSIConnection class.
 */
public class CIM_iSCSIConnectionSettings extends CIM_SettingData  {
	
	public final static String CIM_CLASS_NAME = "CIM_iSCSIConnectionSettings"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.11.0";
	
	
	/**
	*	The maximum PDU length this portal can receive. This MAY be constrained by hardware characteristics and individual implementations MAY choose not to allow this property to be changed.
	*/
	public final static String CIM_PROPERTY_MAXRECEIVEDATASEGMENTLENGTH = "MaxReceiveDataSegmentLength"; //$NON-NLS-1$
	/**
	*	A string describing the preferred Data Digest method when PrimaryDataDigestMethod is equal to the value 1, "Other".
	*/
	public final static String CIM_PROPERTY_OTHERPRIMARYDATADIGESTMETHOD = "OtherPrimaryDataDigestMethod"; //$NON-NLS-1$
	/**
	*	A string describing the preferred Header Digest method when PrimaryHeaderDigestMethod is equal to the value 1, "Other".
	*/
	public final static String CIM_PROPERTY_OTHERPRIMARYHEADERDIGESTMETHOD = "OtherPrimaryHeaderDigestMethod"; //$NON-NLS-1$
	/**
	*	A string describing the alternate Data Digest method preference when SecondaryDataDigestMethod is equal to the value 1, "Other".
	*/
	public final static String CIM_PROPERTY_OTHERSECONDARYDATADIGESTMETHOD = "OtherSecondaryDataDigestMethod"; //$NON-NLS-1$
	/**
	*	A string describing the alternate Header Digest method preference when SecondaryHeaderDigestMethod is equal to the value 1, "Other".
	*/
	public final static String CIM_PROPERTY_OTHERSECONDARYHEADERDIGESTMETHOD = "OtherSecondaryHeaderDigestMethod"; //$NON-NLS-1$
	/**
	*	The preferred primary authentication method for connections, as communicated during the login phase.
	*/
	public final static String CIM_PROPERTY_PRIMARYAUTHENTICATIONMETHOD = "PrimaryAuthenticationMethod"; //$NON-NLS-1$
	/**
	*	The preferred data digest method for this portal.
	*/
	public final static String CIM_PROPERTY_PRIMARYDATADIGESTMETHOD = "PrimaryDataDigestMethod"; //$NON-NLS-1$
	/**
	*	The preferred header digest for this portal.
	*/
	public final static String CIM_PROPERTY_PRIMARYHEADERDIGESTMETHOD = "PrimaryHeaderDigestMethod"; //$NON-NLS-1$
	/**
	*	This property indicates whether or not this portal will request markers in it's incoming data stream.
	*/
	public final static String CIM_PROPERTY_REQUESTINGMARKERSONRECEIVE = "RequestingMarkersOnReceive"; //$NON-NLS-1$
	/**
	*	The preferred secondary authentication method for connections, as communicated during the login phase.
	*/
	public final static String CIM_PROPERTY_SECONDARYAUTHENTICATIONMETHOD = "SecondaryAuthenticationMethod"; //$NON-NLS-1$
	/**
	*	The secondary data digest preference for this portal.
	*/
	public final static String CIM_PROPERTY_SECONDARYDATADIGESTMETHOD = "SecondaryDataDigestMethod"; //$NON-NLS-1$
	/**
	*	The secondary header digest preference for this portal.
	*/
	public final static String CIM_PROPERTY_SECONDARYHEADERDIGESTMETHOD = "SecondaryHeaderDigestMethod"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXRECEIVEDATASEGMENTLENGTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERPRIMARYDATADIGESTMETHOD);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERPRIMARYHEADERDIGESTMETHOD);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERSECONDARYDATADIGESTMETHOD);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERSECONDARYHEADERDIGESTMETHOD);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRIMARYAUTHENTICATIONMETHOD);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRIMARYDATADIGESTMETHOD);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRIMARYHEADERDIGESTMETHOD);
		CIM_PropertyNameList.add(CIM_PROPERTY_REQUESTINGMARKERSONRECEIVE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SECONDARYAUTHENTICATIONMETHOD);
		CIM_PropertyNameList.add(CIM_PROPERTY_SECONDARYDATADIGESTMETHOD);
		CIM_PropertyNameList.add(CIM_PROPERTY_SECONDARYHEADERDIGESTMETHOD);
				
		for (int i = 0; i < CIM_SettingData.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXRECEIVEDATASEGMENTLENGTH)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERPRIMARYDATADIGESTMETHOD)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERPRIMARYHEADERDIGESTMETHOD)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERSECONDARYDATADIGESTMETHOD)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERSECONDARYHEADERDIGESTMETHOD)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRIMARYAUTHENTICATIONMETHOD)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRIMARYDATADIGESTMETHOD)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRIMARYHEADERDIGESTMETHOD)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REQUESTINGMARKERSONRECEIVE)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SECONDARYAUTHENTICATIONMETHOD)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SECONDARYDATADIGESTMETHOD)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SECONDARYHEADERDIGESTMETHOD)){
				continue;
			}
			
			CIM_iSCSIConnectionSettings.CIM_PropertyNameList.add(CIM_SettingData.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXRECEIVEDATASEGMENTLENGTH, new CIMValue(new UnsignedInt32("8192"), new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERPRIMARYDATADIGESTMETHOD, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERPRIMARYHEADERDIGESTMETHOD, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERSECONDARYDATADIGESTMETHOD, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERSECONDARYHEADERDIGESTMETHOD, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRIMARYAUTHENTICATIONMETHOD, new CIMValue(new UnsignedInt16("5"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRIMARYDATADIGESTMETHOD, new CIMValue(new UnsignedInt16("3"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRIMARYHEADERDIGESTMETHOD, new CIMValue(new UnsignedInt16("3"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REQUESTINGMARKERSONRECEIVE, new CIMValue(new Boolean("false"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SECONDARYAUTHENTICATIONMETHOD, new CIMValue(new UnsignedInt16("3"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SECONDARYDATADIGESTMETHOD, new CIMValue(new UnsignedInt16("2"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SECONDARYHEADERDIGESTMETHOD, new CIMValue(new UnsignedInt16("2"), new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_SettingData.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXRECEIVEDATASEGMENTLENGTH)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERPRIMARYDATADIGESTMETHOD)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERPRIMARYHEADERDIGESTMETHOD)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERSECONDARYDATADIGESTMETHOD)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERSECONDARYHEADERDIGESTMETHOD)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRIMARYAUTHENTICATIONMETHOD)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRIMARYDATADIGESTMETHOD)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRIMARYHEADERDIGESTMETHOD)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REQUESTINGMARKERSONRECEIVE)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SECONDARYAUTHENTICATIONMETHOD)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SECONDARYDATADIGESTMETHOD)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SECONDARYHEADERDIGESTMETHOD)){
				continue;
			}
			
			CIM_iSCSIConnectionSettings.CIM_PropertyList.add(CIM_SettingData.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_SettingData.Java_Package_List.size(); i++) {
			if (((String)CIM_SettingData.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_SettingData.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_PRIMARYAUTHENTICATIONMETHOD = {"None","No Authentication","SRP","CHAP","Kerberos"};
	public final static String[] CIM_VALUEMAP_PRIMARYDATADIGESTMETHOD = {"Other","No Digest","CRC32C"};
	public final static String[] CIM_VALUEMAP_PRIMARYHEADERDIGESTMETHOD = {"Other","No Digest","CRC32C"};
	public final static String[] CIM_VALUEMAP_SECONDARYAUTHENTICATIONMETHOD = {"None","No Authentication","SRP","CHAP","Kerberos"};
	public final static String[] CIM_VALUEMAP_SECONDARYDATADIGESTMETHOD = {"Other","No Digest","CRC32C","No Secondary Preference"};
	public final static String[] CIM_VALUEMAP_SECONDARYHEADERDIGESTMETHOD = {"Other","No Digest","CRC32C","No Secondary Preference"};
	
	
	public final static int PRIMARYAUTHENTICATIONMETHOD_NONE = 2;
	public final static int PRIMARYAUTHENTICATIONMETHOD_NOAUTHENTICATION = 3;
	public final static int PRIMARYAUTHENTICATIONMETHOD_SRP = 4;
	public final static int PRIMARYAUTHENTICATIONMETHOD_CHAP = 5;
	public final static int PRIMARYAUTHENTICATIONMETHOD_KERBEROS = 6;
	
	public final static int PRIMARYDATADIGESTMETHOD_OTHER = 1;
	public final static int PRIMARYDATADIGESTMETHOD_NODIGEST = 2;
	public final static int PRIMARYDATADIGESTMETHOD_CRC32C = 3;
	
	public final static int PRIMARYHEADERDIGESTMETHOD_OTHER = 1;
	public final static int PRIMARYHEADERDIGESTMETHOD_NODIGEST = 2;
	public final static int PRIMARYHEADERDIGESTMETHOD_CRC32C = 3;
	
	public final static int SECONDARYAUTHENTICATIONMETHOD_NONE = 2;
	public final static int SECONDARYAUTHENTICATIONMETHOD_NOAUTHENTICATION = 3;
	public final static int SECONDARYAUTHENTICATIONMETHOD_SRP = 4;
	public final static int SECONDARYAUTHENTICATIONMETHOD_CHAP = 5;
	public final static int SECONDARYAUTHENTICATIONMETHOD_KERBEROS = 6;
	
	public final static int SECONDARYDATADIGESTMETHOD_OTHER = 1;
	public final static int SECONDARYDATADIGESTMETHOD_NODIGEST = 2;
	public final static int SECONDARYDATADIGESTMETHOD_CRC32C = 3;
	public final static int SECONDARYDATADIGESTMETHOD_NOSECONDARYPREFERENCE = 4;
	
	public final static int SECONDARYHEADERDIGESTMETHOD_OTHER = 1;
	public final static int SECONDARYHEADERDIGESTMETHOD_NODIGEST = 2;
	public final static int SECONDARYHEADERDIGESTMETHOD_CRC32C = 3;
	public final static int SECONDARYHEADERDIGESTMETHOD_NOSECONDARYPREFERENCE = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_iSCSIConnectionSettings() {

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
	public CIM_iSCSIConnectionSettings(Vector keyProperties){ 
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
	public CIM_iSCSIConnectionSettings(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_iSCSIConnectionSettings)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_iSCSIConnectionSettings)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_iSCSIConnectionSettings)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_iSCSIConnectionSettings)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_iSCSIConnectionSettings)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_iSCSIConnectionSettings)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_iSCSIConnectionSettings)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_iSCSIConnectionSettings)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_iSCSIConnectionSettings)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_iSCSIConnectionSettings)object).cimObjectPath)) {
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
	
	// Attribute MaxReceiveDataSegmentLength
	
	public UnsignedInt32 get_MaxReceiveDataSegmentLength() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnectionSettings.CIM_PROPERTY_MAXRECEIVEDATASEGMENTLENGTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_MAXRECEIVEDATASEGMENTLENGTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_MAXRECEIVEDATASEGMENTLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxReceiveDataSegmentLength(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnectionSettings.CIM_PROPERTY_MAXRECEIVEDATASEGMENTLENGTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_MAXRECEIVEDATASEGMENTLENGTH + " could not be found");
    		
		} else if (!CIM_iSCSIConnectionSettingsHelper.isValid_MaxReceiveDataSegmentLength(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_MAXRECEIVEDATASEGMENTLENGTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_MAXRECEIVEDATASEGMENTLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherPrimaryDataDigestMethod
	
	public String get_OtherPrimaryDataDigestMethod() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERPRIMARYDATADIGESTMETHOD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERPRIMARYDATADIGESTMETHOD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERPRIMARYDATADIGESTMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherPrimaryDataDigestMethod(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERPRIMARYDATADIGESTMETHOD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERPRIMARYDATADIGESTMETHOD + " could not be found");
    		
		} else if (!CIM_iSCSIConnectionSettingsHelper.isValid_OtherPrimaryDataDigestMethod(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERPRIMARYDATADIGESTMETHOD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERPRIMARYDATADIGESTMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherPrimaryHeaderDigestMethod
	
	public String get_OtherPrimaryHeaderDigestMethod() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERPRIMARYHEADERDIGESTMETHOD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERPRIMARYHEADERDIGESTMETHOD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERPRIMARYHEADERDIGESTMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherPrimaryHeaderDigestMethod(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERPRIMARYHEADERDIGESTMETHOD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERPRIMARYHEADERDIGESTMETHOD + " could not be found");
    		
		} else if (!CIM_iSCSIConnectionSettingsHelper.isValid_OtherPrimaryHeaderDigestMethod(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERPRIMARYHEADERDIGESTMETHOD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERPRIMARYHEADERDIGESTMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherSecondaryDataDigestMethod
	
	public String get_OtherSecondaryDataDigestMethod() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERSECONDARYDATADIGESTMETHOD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERSECONDARYDATADIGESTMETHOD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERSECONDARYDATADIGESTMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherSecondaryDataDigestMethod(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERSECONDARYDATADIGESTMETHOD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERSECONDARYDATADIGESTMETHOD + " could not be found");
    		
		} else if (!CIM_iSCSIConnectionSettingsHelper.isValid_OtherSecondaryDataDigestMethod(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERSECONDARYDATADIGESTMETHOD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERSECONDARYDATADIGESTMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherSecondaryHeaderDigestMethod
	
	public String get_OtherSecondaryHeaderDigestMethod() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERSECONDARYHEADERDIGESTMETHOD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERSECONDARYHEADERDIGESTMETHOD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERSECONDARYHEADERDIGESTMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherSecondaryHeaderDigestMethod(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERSECONDARYHEADERDIGESTMETHOD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERSECONDARYHEADERDIGESTMETHOD + " could not be found");
    		
		} else if (!CIM_iSCSIConnectionSettingsHelper.isValid_OtherSecondaryHeaderDigestMethod(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERSECONDARYHEADERDIGESTMETHOD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_OTHERSECONDARYHEADERDIGESTMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PrimaryAuthenticationMethod
	
	public UnsignedInt16 get_PrimaryAuthenticationMethod() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnectionSettings.CIM_PROPERTY_PRIMARYAUTHENTICATIONMETHOD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_PRIMARYAUTHENTICATIONMETHOD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_PRIMARYAUTHENTICATIONMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PrimaryAuthenticationMethod(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnectionSettings.CIM_PROPERTY_PRIMARYAUTHENTICATIONMETHOD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_PRIMARYAUTHENTICATIONMETHOD + " could not be found");
    		
		} else if (!CIM_iSCSIConnectionSettingsHelper.isValid_PrimaryAuthenticationMethod(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_PRIMARYAUTHENTICATIONMETHOD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_PRIMARYAUTHENTICATIONMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PrimaryDataDigestMethod
	
	public UnsignedInt16 get_PrimaryDataDigestMethod() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnectionSettings.CIM_PROPERTY_PRIMARYDATADIGESTMETHOD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_PRIMARYDATADIGESTMETHOD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_PRIMARYDATADIGESTMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PrimaryDataDigestMethod(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnectionSettings.CIM_PROPERTY_PRIMARYDATADIGESTMETHOD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_PRIMARYDATADIGESTMETHOD + " could not be found");
    		
		} else if (!CIM_iSCSIConnectionSettingsHelper.isValid_PrimaryDataDigestMethod(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_PRIMARYDATADIGESTMETHOD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_PRIMARYDATADIGESTMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PrimaryHeaderDigestMethod
	
	public UnsignedInt16 get_PrimaryHeaderDigestMethod() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnectionSettings.CIM_PROPERTY_PRIMARYHEADERDIGESTMETHOD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_PRIMARYHEADERDIGESTMETHOD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_PRIMARYHEADERDIGESTMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PrimaryHeaderDigestMethod(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnectionSettings.CIM_PROPERTY_PRIMARYHEADERDIGESTMETHOD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_PRIMARYHEADERDIGESTMETHOD + " could not be found");
    		
		} else if (!CIM_iSCSIConnectionSettingsHelper.isValid_PrimaryHeaderDigestMethod(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_PRIMARYHEADERDIGESTMETHOD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_PRIMARYHEADERDIGESTMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RequestingMarkersOnReceive
	
	public Boolean get_RequestingMarkersOnReceive() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnectionSettings.CIM_PROPERTY_REQUESTINGMARKERSONRECEIVE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_REQUESTINGMARKERSONRECEIVE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_REQUESTINGMARKERSONRECEIVE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RequestingMarkersOnReceive(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnectionSettings.CIM_PROPERTY_REQUESTINGMARKERSONRECEIVE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_REQUESTINGMARKERSONRECEIVE + " could not be found");
    		
		} else if (!CIM_iSCSIConnectionSettingsHelper.isValid_RequestingMarkersOnReceive(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_REQUESTINGMARKERSONRECEIVE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_REQUESTINGMARKERSONRECEIVE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SecondaryAuthenticationMethod
	
	public UnsignedInt16 get_SecondaryAuthenticationMethod() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnectionSettings.CIM_PROPERTY_SECONDARYAUTHENTICATIONMETHOD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_SECONDARYAUTHENTICATIONMETHOD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_SECONDARYAUTHENTICATIONMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SecondaryAuthenticationMethod(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnectionSettings.CIM_PROPERTY_SECONDARYAUTHENTICATIONMETHOD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_SECONDARYAUTHENTICATIONMETHOD + " could not be found");
    		
		} else if (!CIM_iSCSIConnectionSettingsHelper.isValid_SecondaryAuthenticationMethod(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_SECONDARYAUTHENTICATIONMETHOD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_SECONDARYAUTHENTICATIONMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SecondaryDataDigestMethod
	
	public UnsignedInt16 get_SecondaryDataDigestMethod() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnectionSettings.CIM_PROPERTY_SECONDARYDATADIGESTMETHOD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_SECONDARYDATADIGESTMETHOD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_SECONDARYDATADIGESTMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SecondaryDataDigestMethod(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnectionSettings.CIM_PROPERTY_SECONDARYDATADIGESTMETHOD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_SECONDARYDATADIGESTMETHOD + " could not be found");
    		
		} else if (!CIM_iSCSIConnectionSettingsHelper.isValid_SecondaryDataDigestMethod(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_SECONDARYDATADIGESTMETHOD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_SECONDARYDATADIGESTMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SecondaryHeaderDigestMethod
	
	public UnsignedInt16 get_SecondaryHeaderDigestMethod() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnectionSettings.CIM_PROPERTY_SECONDARYHEADERDIGESTMETHOD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_SECONDARYHEADERDIGESTMETHOD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_SECONDARYHEADERDIGESTMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SecondaryHeaderDigestMethod(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnectionSettings.CIM_PROPERTY_SECONDARYHEADERDIGESTMETHOD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_SECONDARYHEADERDIGESTMETHOD + " could not be found");
    		
		} else if (!CIM_iSCSIConnectionSettingsHelper.isValid_SecondaryHeaderDigestMethod(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_SECONDARYHEADERDIGESTMETHOD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnectionSettings.CIM_PROPERTY_SECONDARYHEADERDIGESTMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
