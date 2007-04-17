/** 
 * CIM_iSCSIConnection.java
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
 * Description:  This class contains the attributes of and negotiated values for, an iSCSI
 * Connection which is modeled as a subclass of NetworkPipe. The original
 * settings that are a starting point for negotiation are found in the class
 * iSCSIConnectionSettings.
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
 *  This class contains the attributes of and negotiated values for, an iSCSI
 * Connection which is modeled as a subclass of NetworkPipe. The original
 * settings that are a starting point for negotiation are found in the class
 * iSCSIConnectionSettings.
 */
public class CIM_iSCSIConnection extends CIM_NetworkPipe  {
	
	public final static String CIM_CLASS_NAME = "CIM_iSCSIConnection"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.11.0";
	
	
	/**
	*	Active version number of the iSCSI specification negotiated on this connection.
	*/
	public final static String CIM_PROPERTY_ACTIVEISCSIVERSION = "ActiveiSCSIVersion"; //$NON-NLS-1$
	/**
	*	The authentication method being used on this connection, as communicated during the login phase.
	*/
	public final static String CIM_PROPERTY_AUTHENTICATIONMETHODUSED = "AuthenticationMethodUsed"; //$NON-NLS-1$
	/**
	*	The iSCSI Connection ID for this connection.
	*/
	public final static String CIM_PROPERTY_CONNECTIONID = "ConnectionID"; //$NON-NLS-1$
	/**
	*	This property identifies the iSCSI data digest scheme in use within this connection.
	*/
	public final static String CIM_PROPERTY_DATADIGESTMETHOD = "DataDigestMethod"; //$NON-NLS-1$
	/**
	*	This property identifies the iSCSI header digest scheme in use within this connection.
	*/
	public final static String CIM_PROPERTY_HEADERDIGESTMETHOD = "HeaderDigestMethod"; //$NON-NLS-1$
	/**
	*	The maximum data payload size supported for command or data PDUs able to be received on this connection.
	*/
	public final static String CIM_PROPERTY_MAXRECEIVEDATASEGMENTLENGTH = "MaxReceiveDataSegmentLength"; //$NON-NLS-1$
	/**
	*	The maximum data payload size supported for command or data PDUs to be sent on this connection.
	*/
	public final static String CIM_PROPERTY_MAXTRANSMITDATASEGMENTLENGTH = "MaxTransmitDataSegmentLength"; //$NON-NLS-1$
	/**
	*	This property when true, indicates that the Target was required to authenticate itself to the Initiator, in addition to the Initiator authenticating itself to the Target. When false, and AuthenticationMethod is other than 'No Authentication', only the Initatior authenticated itself to the Target. 
When AuthenticationMethodUsed is 'No Authentication', this property must be false.
	*/
	public final static String CIM_PROPERTY_MUTUALAUTHENTICATION = "MutualAuthentication"; //$NON-NLS-1$
	/**
	*	A string describing the Data Digest scheme in use when DataDigestMethod is equal to the value 1, "Other".
	*/
	public final static String CIM_PROPERTY_OTHERDATADIGESTMETHOD = "OtherDataDigestMethod"; //$NON-NLS-1$
	/**
	*	A string describing the Header Digest scheme in use when HeaderDigestMethod is equal to the value 1, "Other".
	*/
	public final static String CIM_PROPERTY_OTHERHEADERDIGESTMETHOD = "OtherHeaderDigestMethod"; //$NON-NLS-1$
	/**
	*	This property indicates whether or not this connection is receiving markers in in its incoming data stream.
	*/
	public final static String CIM_PROPERTY_RECEIVINGMARKERS = "ReceivingMarkers"; //$NON-NLS-1$
	/**
	*	This property indicates whether or not this connection is inserting markers in in its outgoing data stream.
	*/
	public final static String CIM_PROPERTY_SENDINGMARKERS = "SendingMarkers"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ACTIVEISCSIVERSION);
		CIM_PropertyNameList.add(CIM_PROPERTY_AUTHENTICATIONMETHODUSED);
		CIM_PropertyNameList.add(CIM_PROPERTY_CONNECTIONID);
		CIM_PropertyNameList.add(CIM_PROPERTY_DATADIGESTMETHOD);
		CIM_PropertyNameList.add(CIM_PROPERTY_HEADERDIGESTMETHOD);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXRECEIVEDATASEGMENTLENGTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXTRANSMITDATASEGMENTLENGTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_MUTUALAUTHENTICATION);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERDATADIGESTMETHOD);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERHEADERDIGESTMETHOD);
		CIM_PropertyNameList.add(CIM_PROPERTY_RECEIVINGMARKERS);
		CIM_PropertyNameList.add(CIM_PROPERTY_SENDINGMARKERS);
				
		for (int i = 0; i < CIM_NetworkPipe.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACTIVEISCSIVERSION)||
				((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AUTHENTICATIONMETHODUSED)||
				((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CONNECTIONID)||
				((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DATADIGESTMETHOD)||
				((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HEADERDIGESTMETHOD)||
				((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXRECEIVEDATASEGMENTLENGTH)||
				((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXTRANSMITDATASEGMENTLENGTH)||
				((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MUTUALAUTHENTICATION)||
				((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERDATADIGESTMETHOD)||
				((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERHEADERDIGESTMETHOD)||
				((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RECEIVINGMARKERS)||
				((String)CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SENDINGMARKERS)){
				continue;
			}
			
			CIM_iSCSIConnection.CIM_PropertyNameList.add(CIM_NetworkPipe.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACTIVEISCSIVERSION, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AUTHENTICATIONMETHODUSED, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CONNECTIONID, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DATADIGESTMETHOD, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HEADERDIGESTMETHOD, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXRECEIVEDATASEGMENTLENGTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXTRANSMITDATASEGMENTLENGTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MUTUALAUTHENTICATION, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERDATADIGESTMETHOD, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERHEADERDIGESTMETHOD, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RECEIVINGMARKERS, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SENDINGMARKERS, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
				
		for (int i = 0; i < CIM_NetworkPipe.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACTIVEISCSIVERSION)||
				((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AUTHENTICATIONMETHODUSED)||
				((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CONNECTIONID)||
				((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DATADIGESTMETHOD)||
				((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HEADERDIGESTMETHOD)||
				((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXRECEIVEDATASEGMENTLENGTH)||
				((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXTRANSMITDATASEGMENTLENGTH)||
				((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MUTUALAUTHENTICATION)||
				((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERDATADIGESTMETHOD)||
				((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERHEADERDIGESTMETHOD)||
				((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RECEIVINGMARKERS)||
				((CIMProperty)CIM_NetworkPipe.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SENDINGMARKERS)){
				continue;
			}
			
			CIM_iSCSIConnection.CIM_PropertyList.add(CIM_NetworkPipe.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_NetworkPipe.Java_Package_List.size(); i++) {
			if (((String)CIM_NetworkPipe.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_NetworkPipe.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_AUTHENTICATIONMETHODUSED = {"No Authentication","SRP","CHAP","Kerberos"};
	public final static String[] CIM_VALUEMAP_DATADIGESTMETHOD = {"Other","No Digest","CRC32C"};
	public final static String[] CIM_VALUEMAP_HEADERDIGESTMETHOD = {"Other","No Digest","CRC32C"};
	
	
	public final static int AUTHENTICATIONMETHODUSED_NOAUTHENTICATION = 2;
	public final static int AUTHENTICATIONMETHODUSED_SRP = 3;
	public final static int AUTHENTICATIONMETHODUSED_CHAP = 4;
	public final static int AUTHENTICATIONMETHODUSED_KERBEROS = 5;
	
	public final static int DATADIGESTMETHOD_OTHER = 1;
	public final static int DATADIGESTMETHOD_NODIGEST = 2;
	public final static int DATADIGESTMETHOD_CRC32C = 3;
	
	public final static int HEADERDIGESTMETHOD_OTHER = 1;
	public final static int HEADERDIGESTMETHOD_NODIGEST = 2;
	public final static int HEADERDIGESTMETHOD_CRC32C = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_iSCSIConnection() {

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
	public CIM_iSCSIConnection(Vector keyProperties){ 
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
	public CIM_iSCSIConnection(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_iSCSIConnection)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_iSCSIConnection)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_iSCSIConnection)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_iSCSIConnection)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_iSCSIConnection)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_iSCSIConnection)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_iSCSIConnection)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_iSCSIConnection)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_iSCSIConnection)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_iSCSIConnection)object).cimObjectPath)) {
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
	
	// Attribute ActiveiSCSIVersion
	
	public Boolean get_ActiveiSCSIVersion() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnection.CIM_PROPERTY_ACTIVEISCSIVERSION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_ACTIVEISCSIVERSION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_ACTIVEISCSIVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ActiveiSCSIVersion(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnection.CIM_PROPERTY_ACTIVEISCSIVERSION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_ACTIVEISCSIVERSION + " could not be found");
    		
		} else if (!CIM_iSCSIConnectionHelper.isValid_ActiveiSCSIVersion(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSIConnection.CIM_PROPERTY_ACTIVEISCSIVERSION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_ACTIVEISCSIVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AuthenticationMethodUsed
	
	public UnsignedInt16 get_AuthenticationMethodUsed() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnection.CIM_PROPERTY_AUTHENTICATIONMETHODUSED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_AUTHENTICATIONMETHODUSED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_AUTHENTICATIONMETHODUSED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AuthenticationMethodUsed(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnection.CIM_PROPERTY_AUTHENTICATIONMETHODUSED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_AUTHENTICATIONMETHODUSED + " could not be found");
    		
		} else if (!CIM_iSCSIConnectionHelper.isValid_AuthenticationMethodUsed(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSIConnection.CIM_PROPERTY_AUTHENTICATIONMETHODUSED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_AUTHENTICATIONMETHODUSED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ConnectionID
	
	public UnsignedInt32 get_ConnectionID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnection.CIM_PROPERTY_CONNECTIONID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_CONNECTIONID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_CONNECTIONID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ConnectionID(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnection.CIM_PROPERTY_CONNECTIONID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_CONNECTIONID + " could not be found");
    		
		} else if (!CIM_iSCSIConnectionHelper.isValid_ConnectionID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSIConnection.CIM_PROPERTY_CONNECTIONID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_CONNECTIONID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DataDigestMethod
	
	public UnsignedInt16 get_DataDigestMethod() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnection.CIM_PROPERTY_DATADIGESTMETHOD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_DATADIGESTMETHOD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_DATADIGESTMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DataDigestMethod(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnection.CIM_PROPERTY_DATADIGESTMETHOD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_DATADIGESTMETHOD + " could not be found");
    		
		} else if (!CIM_iSCSIConnectionHelper.isValid_DataDigestMethod(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSIConnection.CIM_PROPERTY_DATADIGESTMETHOD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_DATADIGESTMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HeaderDigestMethod
	
	public UnsignedInt16 get_HeaderDigestMethod() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnection.CIM_PROPERTY_HEADERDIGESTMETHOD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_HEADERDIGESTMETHOD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_HEADERDIGESTMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HeaderDigestMethod(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnection.CIM_PROPERTY_HEADERDIGESTMETHOD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_HEADERDIGESTMETHOD + " could not be found");
    		
		} else if (!CIM_iSCSIConnectionHelper.isValid_HeaderDigestMethod(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSIConnection.CIM_PROPERTY_HEADERDIGESTMETHOD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_HEADERDIGESTMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxReceiveDataSegmentLength
	
	public UnsignedInt32 get_MaxReceiveDataSegmentLength() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnection.CIM_PROPERTY_MAXRECEIVEDATASEGMENTLENGTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_MAXRECEIVEDATASEGMENTLENGTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_MAXRECEIVEDATASEGMENTLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxReceiveDataSegmentLength(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnection.CIM_PROPERTY_MAXRECEIVEDATASEGMENTLENGTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_MAXRECEIVEDATASEGMENTLENGTH + " could not be found");
    		
		} else if (!CIM_iSCSIConnectionHelper.isValid_MaxReceiveDataSegmentLength(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSIConnection.CIM_PROPERTY_MAXRECEIVEDATASEGMENTLENGTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_MAXRECEIVEDATASEGMENTLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxTransmitDataSegmentLength
	
	public UnsignedInt32 get_MaxTransmitDataSegmentLength() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnection.CIM_PROPERTY_MAXTRANSMITDATASEGMENTLENGTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_MAXTRANSMITDATASEGMENTLENGTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_MAXTRANSMITDATASEGMENTLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxTransmitDataSegmentLength(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnection.CIM_PROPERTY_MAXTRANSMITDATASEGMENTLENGTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_MAXTRANSMITDATASEGMENTLENGTH + " could not be found");
    		
		} else if (!CIM_iSCSIConnectionHelper.isValid_MaxTransmitDataSegmentLength(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSIConnection.CIM_PROPERTY_MAXTRANSMITDATASEGMENTLENGTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_MAXTRANSMITDATASEGMENTLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MutualAuthentication
	
	public Boolean get_MutualAuthentication() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnection.CIM_PROPERTY_MUTUALAUTHENTICATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_MUTUALAUTHENTICATION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_MUTUALAUTHENTICATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MutualAuthentication(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnection.CIM_PROPERTY_MUTUALAUTHENTICATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_MUTUALAUTHENTICATION + " could not be found");
    		
		} else if (!CIM_iSCSIConnectionHelper.isValid_MutualAuthentication(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSIConnection.CIM_PROPERTY_MUTUALAUTHENTICATION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_MUTUALAUTHENTICATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherDataDigestMethod
	
	public String get_OtherDataDigestMethod() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnection.CIM_PROPERTY_OTHERDATADIGESTMETHOD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_OTHERDATADIGESTMETHOD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_OTHERDATADIGESTMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherDataDigestMethod(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnection.CIM_PROPERTY_OTHERDATADIGESTMETHOD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_OTHERDATADIGESTMETHOD + " could not be found");
    		
		} else if (!CIM_iSCSIConnectionHelper.isValid_OtherDataDigestMethod(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSIConnection.CIM_PROPERTY_OTHERDATADIGESTMETHOD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_OTHERDATADIGESTMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherHeaderDigestMethod
	
	public String get_OtherHeaderDigestMethod() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnection.CIM_PROPERTY_OTHERHEADERDIGESTMETHOD);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_OTHERHEADERDIGESTMETHOD + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_OTHERHEADERDIGESTMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherHeaderDigestMethod(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnection.CIM_PROPERTY_OTHERHEADERDIGESTMETHOD);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_OTHERHEADERDIGESTMETHOD + " could not be found");
    		
		} else if (!CIM_iSCSIConnectionHelper.isValid_OtherHeaderDigestMethod(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSIConnection.CIM_PROPERTY_OTHERHEADERDIGESTMETHOD);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_OTHERHEADERDIGESTMETHOD + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReceivingMarkers
	
	public Boolean get_ReceivingMarkers() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnection.CIM_PROPERTY_RECEIVINGMARKERS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_RECEIVINGMARKERS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_RECEIVINGMARKERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ReceivingMarkers(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnection.CIM_PROPERTY_RECEIVINGMARKERS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_RECEIVINGMARKERS + " could not be found");
    		
		} else if (!CIM_iSCSIConnectionHelper.isValid_ReceivingMarkers(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSIConnection.CIM_PROPERTY_RECEIVINGMARKERS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_RECEIVINGMARKERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SendingMarkers
	
	public Boolean get_SendingMarkers() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnection.CIM_PROPERTY_SENDINGMARKERS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_SENDINGMARKERS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_SENDINGMARKERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SendingMarkers(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIConnection.CIM_PROPERTY_SENDINGMARKERS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_SENDINGMARKERS + " could not be found");
    		
		} else if (!CIM_iSCSIConnectionHelper.isValid_SendingMarkers(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSIConnection.CIM_PROPERTY_SENDINGMARKERS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIConnection.CIM_PROPERTY_SENDINGMARKERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
