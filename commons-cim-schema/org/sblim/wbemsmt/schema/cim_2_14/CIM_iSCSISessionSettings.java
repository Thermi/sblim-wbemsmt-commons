/** 
 * CIM_iSCSISessionSettings.java
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
 * Description:  The default negotiation settings for an iSCSI Session. These properties are
 * used as the starting position for login negotiations between initiator and
 * target nodes. The properties describing the resulting outcome of the login
 * negotiation are in the iSCSISession class. Depending on a given
 * implementation an instance of iSCSISessionSettings will be associated by
 * ElementSettingData to one or more instances of iSCSIProtocolEndpoint,
 * SCSIProtocolController, or ComputerSystem.
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
import org.sblim.wbem.cim.UnsignedInt32;


/**
 *  The default negotiation settings for an iSCSI Session. These properties are
 * used as the starting position for login negotiations between initiator and
 * target nodes. The properties describing the resulting outcome of the login
 * negotiation are in the iSCSISession class. Depending on a given
 * implementation an instance of iSCSISessionSettings will be associated by
 * ElementSettingData to one or more instances of iSCSIProtocolEndpoint,
 * SCSIProtocolController, or ComputerSystem.
 */
public class CIM_iSCSISessionSettings extends CIM_SettingData  {
	
	public final static String CIM_CLASS_NAME = "CIM_iSCSISessionSettings"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.11.0";
	
	
	/**
	*	The DataPDUInOrder preference of this node. False (=No) indicates that iSCSI data PDUs within sequences MAY be in any order. True (=Yes) indicates that data PDUs within sequences MUST be at continuously increasing addresses, with no gaps or overlay between PDUs.
	*/
	public final static String CIM_PROPERTY_DATAPDUINORDERPREFERENCE = "DataPDUInOrderPreference"; //$NON-NLS-1$
	/**
	*	The DataSequenceInOrder preference of this node. False (=No) indicates that iSCSI data PDU sequences MAY be transferred in any order. True (=Yes) indicates that data PDU sequences MUST be transferred using continuously increasing offsets, except during error recovery.
	*/
	public final static String CIM_PROPERTY_DATASEQUENCEINORDERPREFERENCE = "DataSequenceInOrderPreference"; //$NON-NLS-1$
	/**
	*	The DefaultTime2Retain preference of this node. This is the maximum time, in seconds after an initial wait (Time2Wait), before which an active iSCSI task reassignment is still possible after an unexpected connection termination or a connection reset.
	*/
	public final static String CIM_PROPERTY_DEFAULTTIMETORETAINPREFERENCE = "DefaultTimeToRetainPreference"; //$NON-NLS-1$
	/**
	*	The DefaultTime2Wait preference of this node. This is the minimum time, in seconds, to wait before attempting an explicit/implicit logout or active iSCSI task reassignment after an unexpected connection termination or a connection reset.
	*/
	public final static String CIM_PROPERTY_DEFAULTTIMETOWAITPREFERENCE = "DefaultTimeToWaitPreference"; //$NON-NLS-1$
	/**
	*	The ErrorRecoveryLevel preference of this node. Currently, only 0-2 are valid. This is designed to accommodate future error recover levels. 
Higher error recovery levels imply support in addition to support for the lower error level functions. In other words, error level 2 implies support for levels 0-1, since those functions are subsets of error level 2.
	*/
	public final static String CIM_PROPERTY_ERRORRECOVERYLEVELPREFERENCE = "ErrorRecoveryLevelPreference"; //$NON-NLS-1$
	/**
	*	This property indicates ImmediateData preference for this node True = YES (but will accept NO), False = NO.
	*/
	public final static String CIM_PROPERTY_IMMEDIATEDATAPREFERENCE = "ImmediateDataPreference"; //$NON-NLS-1$
	/**
	*	This property indicates the InitialR2T preference for this node: true = YES, false = will try to negotiate NO, will accept YES.
	*/
	public final static String CIM_PROPERTY_INITIALR2TPREFERENCE = "InitialR2TPreference"; //$NON-NLS-1$
	/**
	*	The maximum number of connections allowed in each session to and/or from this node.
	*/
	public final static String CIM_PROPERTY_MAXCONNECTIONSPERSESSION = "MaxConnectionsPerSession"; //$NON-NLS-1$
	/**
	*	The maximum number of bytes which can be sent within a single sequence of Data-In or Data-Out PDUs.
	*/
	public final static String CIM_PROPERTY_MAXDATABURSTLENGTH = "MaxDataBurstLength"; //$NON-NLS-1$
	/**
	*	Maximum number of outstanding R2Ts allowed per ISCSI task.
	*/
	public final static String CIM_PROPERTY_MAXOUTSTANDINGR2T = "MaxOutstandingR2T"; //$NON-NLS-1$
	/**
	*	The maximum length (bytes) supported for unsolicited data to/from this node.
	*/
	public final static String CIM_PROPERTY_MAXUNSOLICITEDFIRSTDATABURSTLENGTH = "MaxUnsolicitedFirstDataBurstLength"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DATAPDUINORDERPREFERENCE);
		CIM_PropertyNameList.add(CIM_PROPERTY_DATASEQUENCEINORDERPREFERENCE);
		CIM_PropertyNameList.add(CIM_PROPERTY_DEFAULTTIMETORETAINPREFERENCE);
		CIM_PropertyNameList.add(CIM_PROPERTY_DEFAULTTIMETOWAITPREFERENCE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ERRORRECOVERYLEVELPREFERENCE);
		CIM_PropertyNameList.add(CIM_PROPERTY_IMMEDIATEDATAPREFERENCE);
		CIM_PropertyNameList.add(CIM_PROPERTY_INITIALR2TPREFERENCE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXCONNECTIONSPERSESSION);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXDATABURSTLENGTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXOUTSTANDINGR2T);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXUNSOLICITEDFIRSTDATABURSTLENGTH);
				
		for (int i = 0; i < CIM_SettingData.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DATAPDUINORDERPREFERENCE)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DATASEQUENCEINORDERPREFERENCE)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEFAULTTIMETORETAINPREFERENCE)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEFAULTTIMETOWAITPREFERENCE)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ERRORRECOVERYLEVELPREFERENCE)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_IMMEDIATEDATAPREFERENCE)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INITIALR2TPREFERENCE)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXCONNECTIONSPERSESSION)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXDATABURSTLENGTH)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXOUTSTANDINGR2T)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXUNSOLICITEDFIRSTDATABURSTLENGTH)){
				continue;
			}
			
			CIM_iSCSISessionSettings.CIM_PropertyNameList.add(CIM_SettingData.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DATAPDUINORDERPREFERENCE, new CIMValue(new Boolean("true"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DATASEQUENCEINORDERPREFERENCE, new CIMValue(new Boolean("true"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEFAULTTIMETORETAINPREFERENCE, new CIMValue(new UnsignedInt32("20"), new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEFAULTTIMETOWAITPREFERENCE, new CIMValue(new UnsignedInt32("2"), new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ERRORRECOVERYLEVELPREFERENCE, new CIMValue(new UnsignedInt32("0"), new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_IMMEDIATEDATAPREFERENCE, new CIMValue(new Boolean("true"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INITIALR2TPREFERENCE, new CIMValue(new Boolean("true"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXCONNECTIONSPERSESSION, new CIMValue(new UnsignedInt32("1"), new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXDATABURSTLENGTH, new CIMValue(new UnsignedInt32("262144"), new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXOUTSTANDINGR2T, new CIMValue(new UnsignedInt32("1"), new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXUNSOLICITEDFIRSTDATABURSTLENGTH, new CIMValue(new UnsignedInt32("65536"), new CIMDataType(CIMDataType.UINT32))));
				
		for (int i = 0; i < CIM_SettingData.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DATAPDUINORDERPREFERENCE)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DATASEQUENCEINORDERPREFERENCE)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEFAULTTIMETORETAINPREFERENCE)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEFAULTTIMETOWAITPREFERENCE)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ERRORRECOVERYLEVELPREFERENCE)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_IMMEDIATEDATAPREFERENCE)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INITIALR2TPREFERENCE)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXCONNECTIONSPERSESSION)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXDATABURSTLENGTH)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXOUTSTANDINGR2T)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXUNSOLICITEDFIRSTDATABURSTLENGTH)){
				continue;
			}
			
			CIM_iSCSISessionSettings.CIM_PropertyList.add(CIM_SettingData.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_SettingData.Java_Package_List.size(); i++) {
			if (((String)CIM_SettingData.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_SettingData.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_iSCSISessionSettings() {

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
	public CIM_iSCSISessionSettings(Vector keyProperties){ 
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
	public CIM_iSCSISessionSettings(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_iSCSISessionSettings)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_iSCSISessionSettings)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_iSCSISessionSettings)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_iSCSISessionSettings)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_iSCSISessionSettings)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_iSCSISessionSettings)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_iSCSISessionSettings)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_iSCSISessionSettings)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_iSCSISessionSettings)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_iSCSISessionSettings)object).cimObjectPath)) {
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
	
	// Attribute DataPDUInOrderPreference
	
	public Boolean get_DataPDUInOrderPreference() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionSettings.CIM_PROPERTY_DATAPDUINORDERPREFERENCE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_DATAPDUINORDERPREFERENCE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_DATAPDUINORDERPREFERENCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DataPDUInOrderPreference(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionSettings.CIM_PROPERTY_DATAPDUINORDERPREFERENCE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_DATAPDUINORDERPREFERENCE + " could not be found");
    		
		} else if (!CIM_iSCSISessionSettingsHelper.isValid_DataPDUInOrderPreference(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISessionSettings.CIM_PROPERTY_DATAPDUINORDERPREFERENCE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_DATAPDUINORDERPREFERENCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DataSequenceInOrderPreference
	
	public Boolean get_DataSequenceInOrderPreference() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionSettings.CIM_PROPERTY_DATASEQUENCEINORDERPREFERENCE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_DATASEQUENCEINORDERPREFERENCE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_DATASEQUENCEINORDERPREFERENCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DataSequenceInOrderPreference(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionSettings.CIM_PROPERTY_DATASEQUENCEINORDERPREFERENCE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_DATASEQUENCEINORDERPREFERENCE + " could not be found");
    		
		} else if (!CIM_iSCSISessionSettingsHelper.isValid_DataSequenceInOrderPreference(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISessionSettings.CIM_PROPERTY_DATASEQUENCEINORDERPREFERENCE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_DATASEQUENCEINORDERPREFERENCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DefaultTimeToRetainPreference
	
	public UnsignedInt32 get_DefaultTimeToRetainPreference() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionSettings.CIM_PROPERTY_DEFAULTTIMETORETAINPREFERENCE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_DEFAULTTIMETORETAINPREFERENCE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_DEFAULTTIMETORETAINPREFERENCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DefaultTimeToRetainPreference(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionSettings.CIM_PROPERTY_DEFAULTTIMETORETAINPREFERENCE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_DEFAULTTIMETORETAINPREFERENCE + " could not be found");
    		
		} else if (!CIM_iSCSISessionSettingsHelper.isValid_DefaultTimeToRetainPreference(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISessionSettings.CIM_PROPERTY_DEFAULTTIMETORETAINPREFERENCE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_DEFAULTTIMETORETAINPREFERENCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DefaultTimeToWaitPreference
	
	public UnsignedInt32 get_DefaultTimeToWaitPreference() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionSettings.CIM_PROPERTY_DEFAULTTIMETOWAITPREFERENCE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_DEFAULTTIMETOWAITPREFERENCE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_DEFAULTTIMETOWAITPREFERENCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DefaultTimeToWaitPreference(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionSettings.CIM_PROPERTY_DEFAULTTIMETOWAITPREFERENCE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_DEFAULTTIMETOWAITPREFERENCE + " could not be found");
    		
		} else if (!CIM_iSCSISessionSettingsHelper.isValid_DefaultTimeToWaitPreference(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISessionSettings.CIM_PROPERTY_DEFAULTTIMETOWAITPREFERENCE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_DEFAULTTIMETOWAITPREFERENCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ErrorRecoveryLevelPreference
	
	public UnsignedInt32 get_ErrorRecoveryLevelPreference() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionSettings.CIM_PROPERTY_ERRORRECOVERYLEVELPREFERENCE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_ERRORRECOVERYLEVELPREFERENCE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_ERRORRECOVERYLEVELPREFERENCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ErrorRecoveryLevelPreference(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionSettings.CIM_PROPERTY_ERRORRECOVERYLEVELPREFERENCE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_ERRORRECOVERYLEVELPREFERENCE + " could not be found");
    		
		} else if (!CIM_iSCSISessionSettingsHelper.isValid_ErrorRecoveryLevelPreference(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISessionSettings.CIM_PROPERTY_ERRORRECOVERYLEVELPREFERENCE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_ERRORRECOVERYLEVELPREFERENCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ImmediateDataPreference
	
	public Boolean get_ImmediateDataPreference() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionSettings.CIM_PROPERTY_IMMEDIATEDATAPREFERENCE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_IMMEDIATEDATAPREFERENCE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_IMMEDIATEDATAPREFERENCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ImmediateDataPreference(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionSettings.CIM_PROPERTY_IMMEDIATEDATAPREFERENCE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_IMMEDIATEDATAPREFERENCE + " could not be found");
    		
		} else if (!CIM_iSCSISessionSettingsHelper.isValid_ImmediateDataPreference(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISessionSettings.CIM_PROPERTY_IMMEDIATEDATAPREFERENCE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_IMMEDIATEDATAPREFERENCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InitialR2TPreference
	
	public Boolean get_InitialR2TPreference() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionSettings.CIM_PROPERTY_INITIALR2TPREFERENCE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_INITIALR2TPREFERENCE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_INITIALR2TPREFERENCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InitialR2TPreference(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionSettings.CIM_PROPERTY_INITIALR2TPREFERENCE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_INITIALR2TPREFERENCE + " could not be found");
    		
		} else if (!CIM_iSCSISessionSettingsHelper.isValid_InitialR2TPreference(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISessionSettings.CIM_PROPERTY_INITIALR2TPREFERENCE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_INITIALR2TPREFERENCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxConnectionsPerSession
	
	public UnsignedInt32 get_MaxConnectionsPerSession() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionSettings.CIM_PROPERTY_MAXCONNECTIONSPERSESSION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_MAXCONNECTIONSPERSESSION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_MAXCONNECTIONSPERSESSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxConnectionsPerSession(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionSettings.CIM_PROPERTY_MAXCONNECTIONSPERSESSION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_MAXCONNECTIONSPERSESSION + " could not be found");
    		
		} else if (!CIM_iSCSISessionSettingsHelper.isValid_MaxConnectionsPerSession(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISessionSettings.CIM_PROPERTY_MAXCONNECTIONSPERSESSION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_MAXCONNECTIONSPERSESSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxDataBurstLength
	
	public UnsignedInt32 get_MaxDataBurstLength() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionSettings.CIM_PROPERTY_MAXDATABURSTLENGTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_MAXDATABURSTLENGTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_MAXDATABURSTLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxDataBurstLength(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionSettings.CIM_PROPERTY_MAXDATABURSTLENGTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_MAXDATABURSTLENGTH + " could not be found");
    		
		} else if (!CIM_iSCSISessionSettingsHelper.isValid_MaxDataBurstLength(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISessionSettings.CIM_PROPERTY_MAXDATABURSTLENGTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_MAXDATABURSTLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxOutstandingR2T
	
	public UnsignedInt32 get_MaxOutstandingR2T() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionSettings.CIM_PROPERTY_MAXOUTSTANDINGR2T);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_MAXOUTSTANDINGR2T + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_MAXOUTSTANDINGR2T + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxOutstandingR2T(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionSettings.CIM_PROPERTY_MAXOUTSTANDINGR2T);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_MAXOUTSTANDINGR2T + " could not be found");
    		
		} else if (!CIM_iSCSISessionSettingsHelper.isValid_MaxOutstandingR2T(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISessionSettings.CIM_PROPERTY_MAXOUTSTANDINGR2T);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_MAXOUTSTANDINGR2T + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxUnsolicitedFirstDataBurstLength
	
	public UnsignedInt32 get_MaxUnsolicitedFirstDataBurstLength() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionSettings.CIM_PROPERTY_MAXUNSOLICITEDFIRSTDATABURSTLENGTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_MAXUNSOLICITEDFIRSTDATABURSTLENGTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_MAXUNSOLICITEDFIRSTDATABURSTLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxUnsolicitedFirstDataBurstLength(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionSettings.CIM_PROPERTY_MAXUNSOLICITEDFIRSTDATABURSTLENGTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_MAXUNSOLICITEDFIRSTDATABURSTLENGTH + " could not be found");
    		
		} else if (!CIM_iSCSISessionSettingsHelper.isValid_MaxUnsolicitedFirstDataBurstLength(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISessionSettings.CIM_PROPERTY_MAXUNSOLICITEDFIRSTDATABURSTLENGTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionSettings.CIM_PROPERTY_MAXUNSOLICITEDFIRSTDATABURSTLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
