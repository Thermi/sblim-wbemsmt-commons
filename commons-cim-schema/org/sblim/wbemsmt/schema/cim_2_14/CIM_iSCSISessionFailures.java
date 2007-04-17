/** 
 * CIM_iSCSISessionFailures.java
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
 * Description:  Failure Statistics for Sessions associated with a iSCSI Node. An instance of
 * this class will be associated by ElementStatisticalData to an instance of
 * SCSIProtocolController representing an iSCSI Node. These statistics are
 * associated to a Node since they describe the aggregated Session data for all
 * failed Sessions associated to iSCSI protocol endpoints used by the Node.
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
import org.sblim.wbem.cim.UnsignedInt64;


/**
 *  Failure Statistics for Sessions associated with a iSCSI Node. An instance of
 * this class will be associated by ElementStatisticalData to an instance of
 * SCSIProtocolController representing an iSCSI Node. These statistics are
 * associated to a Node since they describe the aggregated Session data for all
 * failed Sessions associated to iSCSI protocol endpoints used by the Node.
 */
public class CIM_iSCSISessionFailures extends CIM_StatisticalData  {
	
	public final static String CIM_CLASS_NAME = "CIM_iSCSISessionFailures"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.11.0";
	
	
	/**
	*	The iSCSI name of the remote node from the failed session.
	*/
	public final static String CIM_PROPERTY_LASTSESSIONFAILUREREMOTENODENAME = "LastSessionFailureRemoteNodeName"; //$NON-NLS-1$
	/**
	*	The type of the last session failure.
	*/
	public final static String CIM_PROPERTY_LASTSESSIONFAILURETYPE = "LastSessionFailureType"; //$NON-NLS-1$
	/**
	*	A string describing the type of the last Session failure when LastSessionFailureType is equal to the value 1, "Other".
	*/
	public final static String CIM_PROPERTY_OTHERLASTSESSIONFAILURETYPE = "OtherLastSessionFailureType"; //$NON-NLS-1$
	/**
	*	The count of sessions which were failed due to a sequence exceeding a time limit.
	*/
	public final static String CIM_PROPERTY_SESSIONCONNECTIONTIMEOUTFAILURES = "SessionConnectionTimeoutFailures"; //$NON-NLS-1$
	/**
	*	The count of sessions which were failed due to receipt of a PDU containing header or data digest errors.
	*/
	public final static String CIM_PROPERTY_SESSIONDIGESTFAILURES = "SessionDigestFailures"; //$NON-NLS-1$
	/**
	*	The number of times a session belonging to this Network Entity has been failed.
	*/
	public final static String CIM_PROPERTY_SESSIONFAILURES = "SessionFailures"; //$NON-NLS-1$
	/**
	*	The count of sessions which were failed due to receipt of a PDU which contained a format error.
	*/
	public final static String CIM_PROPERTY_SESSIONFORMATERRORS = "SessionFormatErrors"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_LASTSESSIONFAILUREREMOTENODENAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_LASTSESSIONFAILURETYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERLASTSESSIONFAILURETYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SESSIONCONNECTIONTIMEOUTFAILURES);
		CIM_PropertyNameList.add(CIM_PROPERTY_SESSIONDIGESTFAILURES);
		CIM_PropertyNameList.add(CIM_PROPERTY_SESSIONFAILURES);
		CIM_PropertyNameList.add(CIM_PROPERTY_SESSIONFORMATERRORS);
				
		for (int i = 0; i < CIM_StatisticalData.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LASTSESSIONFAILUREREMOTENODENAME)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LASTSESSIONFAILURETYPE)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERLASTSESSIONFAILURETYPE)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SESSIONCONNECTIONTIMEOUTFAILURES)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SESSIONDIGESTFAILURES)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SESSIONFAILURES)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SESSIONFORMATERRORS)){
				continue;
			}
			
			CIM_iSCSISessionFailures.CIM_PropertyNameList.add(CIM_StatisticalData.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LASTSESSIONFAILUREREMOTENODENAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LASTSESSIONFAILURETYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERLASTSESSIONFAILURETYPE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SESSIONCONNECTIONTIMEOUTFAILURES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SESSIONDIGESTFAILURES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SESSIONFAILURES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SESSIONFORMATERRORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_StatisticalData.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LASTSESSIONFAILUREREMOTENODENAME)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LASTSESSIONFAILURETYPE)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERLASTSESSIONFAILURETYPE)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SESSIONCONNECTIONTIMEOUTFAILURES)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SESSIONDIGESTFAILURES)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SESSIONFAILURES)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SESSIONFORMATERRORS)){
				continue;
			}
			
			CIM_iSCSISessionFailures.CIM_PropertyList.add(CIM_StatisticalData.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_StatisticalData.Java_Package_List.size(); i++) {
			if (((String)CIM_StatisticalData.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_StatisticalData.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_LASTSESSIONFAILURETYPE = {"Other","Digest","Timeout","Format"};
	
	
	public final static int LASTSESSIONFAILURETYPE_OTHER = 1;
	public final static int LASTSESSIONFAILURETYPE_DIGEST = 2;
	public final static int LASTSESSIONFAILURETYPE_TIMEOUT = 3;
	public final static int LASTSESSIONFAILURETYPE_FORMAT = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_iSCSISessionFailures() {

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
	public CIM_iSCSISessionFailures(Vector keyProperties){ 
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
	public CIM_iSCSISessionFailures(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_iSCSISessionFailures)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_iSCSISessionFailures)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_iSCSISessionFailures)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_iSCSISessionFailures)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_iSCSISessionFailures)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_iSCSISessionFailures)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_iSCSISessionFailures)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_iSCSISessionFailures)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_iSCSISessionFailures)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_iSCSISessionFailures)object).cimObjectPath)) {
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
	
	// Attribute LastSessionFailureRemoteNodeName
	
	public String get_LastSessionFailureRemoteNodeName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionFailures.CIM_PROPERTY_LASTSESSIONFAILUREREMOTENODENAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_LASTSESSIONFAILUREREMOTENODENAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_LASTSESSIONFAILUREREMOTENODENAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LastSessionFailureRemoteNodeName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionFailures.CIM_PROPERTY_LASTSESSIONFAILUREREMOTENODENAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_LASTSESSIONFAILUREREMOTENODENAME + " could not be found");
    		
		} else if (!CIM_iSCSISessionFailuresHelper.isValid_LastSessionFailureRemoteNodeName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISessionFailures.CIM_PROPERTY_LASTSESSIONFAILUREREMOTENODENAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_LASTSESSIONFAILUREREMOTENODENAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LastSessionFailureType
	
	public UnsignedInt16 get_LastSessionFailureType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionFailures.CIM_PROPERTY_LASTSESSIONFAILURETYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_LASTSESSIONFAILURETYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_LASTSESSIONFAILURETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LastSessionFailureType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionFailures.CIM_PROPERTY_LASTSESSIONFAILURETYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_LASTSESSIONFAILURETYPE + " could not be found");
    		
		} else if (!CIM_iSCSISessionFailuresHelper.isValid_LastSessionFailureType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISessionFailures.CIM_PROPERTY_LASTSESSIONFAILURETYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_LASTSESSIONFAILURETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherLastSessionFailureType
	
	public String get_OtherLastSessionFailureType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionFailures.CIM_PROPERTY_OTHERLASTSESSIONFAILURETYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_OTHERLASTSESSIONFAILURETYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_OTHERLASTSESSIONFAILURETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherLastSessionFailureType(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionFailures.CIM_PROPERTY_OTHERLASTSESSIONFAILURETYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_OTHERLASTSESSIONFAILURETYPE + " could not be found");
    		
		} else if (!CIM_iSCSISessionFailuresHelper.isValid_OtherLastSessionFailureType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISessionFailures.CIM_PROPERTY_OTHERLASTSESSIONFAILURETYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_OTHERLASTSESSIONFAILURETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SessionConnectionTimeoutFailures
	
	public UnsignedInt64 get_SessionConnectionTimeoutFailures() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONCONNECTIONTIMEOUTFAILURES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONCONNECTIONTIMEOUTFAILURES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONCONNECTIONTIMEOUTFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SessionConnectionTimeoutFailures(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONCONNECTIONTIMEOUTFAILURES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONCONNECTIONTIMEOUTFAILURES + " could not be found");
    		
		} else if (!CIM_iSCSISessionFailuresHelper.isValid_SessionConnectionTimeoutFailures(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONCONNECTIONTIMEOUTFAILURES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONCONNECTIONTIMEOUTFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SessionDigestFailures
	
	public UnsignedInt64 get_SessionDigestFailures() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONDIGESTFAILURES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONDIGESTFAILURES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONDIGESTFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SessionDigestFailures(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONDIGESTFAILURES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONDIGESTFAILURES + " could not be found");
    		
		} else if (!CIM_iSCSISessionFailuresHelper.isValid_SessionDigestFailures(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONDIGESTFAILURES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONDIGESTFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SessionFailures
	
	public UnsignedInt64 get_SessionFailures() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONFAILURES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONFAILURES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SessionFailures(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONFAILURES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONFAILURES + " could not be found");
    		
		} else if (!CIM_iSCSISessionFailuresHelper.isValid_SessionFailures(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONFAILURES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SessionFormatErrors
	
	public UnsignedInt64 get_SessionFormatErrors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONFORMATERRORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONFORMATERRORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONFORMATERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SessionFormatErrors(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONFORMATERRORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONFORMATERRORS + " could not be found");
    		
		} else if (!CIM_iSCSISessionFailuresHelper.isValid_SessionFormatErrors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONFORMATERRORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSISessionFailures.CIM_PROPERTY_SESSIONFORMATERRORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
