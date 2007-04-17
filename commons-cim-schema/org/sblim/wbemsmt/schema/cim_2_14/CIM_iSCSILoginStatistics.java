/** 
 * CIM_iSCSILoginStatistics.java
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
 * Description:  Statistics for Logins and Logouts to or from an iSCSI Node. An instance of this
 * class will be associated by ElementStatisticalData to an instance of
 * SCSIProtocolController that represents the Node. The Node can be either an
 * Initiator or Target and so the interpretation of the properties in this class
 * varies accordingly.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMDateTime;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMSimpleDateTime;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.cim.UnsignedInt32;
import org.sblim.wbem.cim.UnsignedInt64;


/**
 *  Statistics for Logins and Logouts to or from an iSCSI Node. An instance of this
 * class will be associated by ElementStatisticalData to an instance of
 * SCSIProtocolController that represents the Node. The Node can be either an
 * Initiator or Target and so the interpretation of the properties in this class
 * varies accordingly.
 */
public class CIM_iSCSILoginStatistics extends CIM_StatisticalData  {
	
	public final static String CIM_CLASS_NAME = "CIM_iSCSILoginStatistics"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.11.0";
	
	
	/**
	*	If the node is an initiator this property is the number of times it has aborted a login because the target could not be authenticated. If the node is a target this property is the count of Login Response PDUs with status 0x0201, Authentication Failed, transmitted by this target.
	*/
	public final static String CIM_PROPERTY_AUTHENTICATIONLOGINFAILURES = "AuthenticationLoginFailures"; //$NON-NLS-1$
	/**
	*	If the node is an initiator this property is the count of Login Response PDUs with status class 0x201, 'Authentication Failed', received by this initiator. If the node is a target the property is the count of Login Response PDUs with status 0x0202, 'Forbidden Target', transmitted by this target.
	*/
	public final static String CIM_PROPERTY_AUTHORIZATIONLOGINFAILURES = "AuthorizationLoginFailures"; //$NON-NLS-1$
	/**
	*	An Internet Network Address giving the host address of the remote node that failed the last login attempt.
	*/
	public final static String CIM_PROPERTY_LASTLOGINFAILUREREMOTEADDRESS = "LastLoginFailureRemoteAddress"; //$NON-NLS-1$
	/**
	*	The type of Internet Network Address of the remote node that failed the last login attempt.
	*/
	public final static String CIM_PROPERTY_LASTLOGINFAILUREREMOTEADDRESSTYPE = "LastLoginFailureRemoteAddressType"; //$NON-NLS-1$
	/**
	*	The iSCSI name of the remote node that failed the last login attempt.
	*/
	public final static String CIM_PROPERTY_LASTLOGINFAILUREREMOTENODENAME = "LastLoginFailureRemoteNodeName"; //$NON-NLS-1$
	/**
	*	The timestamp of the most recent failure of a login attempt from this node(initiator) or to this node(target). A value of zero indicates that no such failures have occurred since the last system boot.
	*/
	public final static String CIM_PROPERTY_LASTLOGINFAILURETIME = "LastLoginFailureTime"; //$NON-NLS-1$
	/**
	*	The type of the most recent failure of a login attempt from this node(initiator) or to this node(target).
	*/
	public final static String CIM_PROPERTY_LASTLOGINFAILURETYPE = "LastLoginFailureType"; //$NON-NLS-1$
	/**
	*	This property counts the number of times a login attempt from this node(initiator) or to this node(target) has failed.
	*/
	public final static String CIM_PROPERTY_LOGINFAILURES = "LoginFailures"; //$NON-NLS-1$
	/**
	*	The count of Login Response PDUs with status class 0x01, Redirection, received by this node(initiator) or transmitted by this node(target).
	*/
	public final static String CIM_PROPERTY_LOGINREDIRECTS = "LoginRedirects"; //$NON-NLS-1$
	/**
	*	If the node is an initiator this property is the number of times it has aborted a login because parameter negotiation with the target failed. 
If the node is a target the property is the number of times a it has effectively refused a login because the parameter negotiation failed. While this situation can occur, the exact mechanism is as yet undefined in the iSCSI Protocol Spec.
	*/
	public final static String CIM_PROPERTY_NEGOTIATIONLOGINFAILURES = "NegotiationLoginFailures"; //$NON-NLS-1$
	/**
	*	The count of Logout Command PDUs generated by this node (initiator) or received by this node(target), with reason code 0 (closes the session).
	*/
	public final static String CIM_PROPERTY_NORMALLOGOUTS = "NormalLogouts"; //$NON-NLS-1$
	/**
	*	A string describing the type of the last login failure when LastLoginFailureType is equal to the value 1, "Other".
	*/
	public final static String CIM_PROPERTY_OTHERLASTLOGINFAILURETYPE = "OtherLastLoginFailureType"; //$NON-NLS-1$
	/**
	*	The number of failure Login Response PDUs which were received by this node(initiator) or were transmitted by this node(target), and which were not counted by any other property in this class.
	*/
	public final static String CIM_PROPERTY_OTHERLOGINFAILURES = "OtherLoginFailures"; //$NON-NLS-1$
	/**
	*	The count of Logout Command PDUs generated by this node, (initiator) or received by this node(target), with any reason code other than 0.
	*/
	public final static String CIM_PROPERTY_OTHERLOGOUTS = "OtherLogouts"; //$NON-NLS-1$
	/**
	*	The count of Login Response PDUs with status 0x0000, Accept Login, received by this node(initator), or transmitted by this node (target).
	*/
	public final static String CIM_PROPERTY_SUCCESSFULLOGINS = "SuccessfulLogins"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_AUTHENTICATIONLOGINFAILURES);
		CIM_PropertyNameList.add(CIM_PROPERTY_AUTHORIZATIONLOGINFAILURES);
		CIM_PropertyNameList.add(CIM_PROPERTY_LASTLOGINFAILUREREMOTEADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_LASTLOGINFAILUREREMOTEADDRESSTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_LASTLOGINFAILUREREMOTENODENAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_LASTLOGINFAILURETIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_LASTLOGINFAILURETYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOGINFAILURES);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOGINREDIRECTS);
		CIM_PropertyNameList.add(CIM_PROPERTY_NEGOTIATIONLOGINFAILURES);
		CIM_PropertyNameList.add(CIM_PROPERTY_NORMALLOGOUTS);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERLASTLOGINFAILURETYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERLOGINFAILURES);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERLOGOUTS);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUCCESSFULLOGINS);
				
		for (int i = 0; i < CIM_StatisticalData.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AUTHENTICATIONLOGINFAILURES)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AUTHORIZATIONLOGINFAILURES)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LASTLOGINFAILUREREMOTEADDRESS)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LASTLOGINFAILUREREMOTEADDRESSTYPE)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LASTLOGINFAILUREREMOTENODENAME)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LASTLOGINFAILURETIME)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LASTLOGINFAILURETYPE)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOGINFAILURES)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOGINREDIRECTS)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NEGOTIATIONLOGINFAILURES)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NORMALLOGOUTS)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERLASTLOGINFAILURETYPE)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERLOGINFAILURES)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERLOGOUTS)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUCCESSFULLOGINS)){
				continue;
			}
			
			CIM_iSCSILoginStatistics.CIM_PropertyNameList.add(CIM_StatisticalData.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AUTHENTICATIONLOGINFAILURES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AUTHORIZATIONLOGINFAILURES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LASTLOGINFAILUREREMOTEADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LASTLOGINFAILUREREMOTEADDRESSTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LASTLOGINFAILUREREMOTENODENAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LASTLOGINFAILURETIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LASTLOGINFAILURETYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOGINFAILURES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOGINREDIRECTS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NEGOTIATIONLOGINFAILURES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NORMALLOGOUTS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERLASTLOGINFAILURETYPE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERLOGINFAILURES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERLOGOUTS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUCCESSFULLOGINS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_StatisticalData.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AUTHENTICATIONLOGINFAILURES)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AUTHORIZATIONLOGINFAILURES)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LASTLOGINFAILUREREMOTEADDRESS)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LASTLOGINFAILUREREMOTEADDRESSTYPE)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LASTLOGINFAILUREREMOTENODENAME)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LASTLOGINFAILURETIME)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LASTLOGINFAILURETYPE)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOGINFAILURES)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOGINREDIRECTS)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NEGOTIATIONLOGINFAILURES)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NORMALLOGOUTS)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERLASTLOGINFAILURETYPE)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERLOGINFAILURES)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERLOGOUTS)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUCCESSFULLOGINS)){
				continue;
			}
			
			CIM_iSCSILoginStatistics.CIM_PropertyList.add(CIM_StatisticalData.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_StatisticalData.Java_Package_List.size(); i++) {
			if (((String)CIM_StatisticalData.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_StatisticalData.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_LASTLOGINFAILUREREMOTEADDRESSTYPE = {"IPv4","IPv6"};
	public final static String[] CIM_VALUEMAP_LASTLOGINFAILURETYPE = {"Other","Negotiate","Authenticate","Authorize","Redirect"};
	
	
	public final static int LASTLOGINFAILUREREMOTEADDRESSTYPE_IPV4 = 1;
	public final static int LASTLOGINFAILUREREMOTEADDRESSTYPE_IPV6 = 2;
	
	public final static int LASTLOGINFAILURETYPE_OTHER = 1;
	public final static int LASTLOGINFAILURETYPE_NEGOTIATE = 2;
	public final static int LASTLOGINFAILURETYPE_AUTHENTICATE = 3;
	public final static int LASTLOGINFAILURETYPE_AUTHORIZE = 4;
	public final static int LASTLOGINFAILURETYPE_REDIRECT = 5;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_iSCSILoginStatistics() {

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
	public CIM_iSCSILoginStatistics(Vector keyProperties){ 
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
	public CIM_iSCSILoginStatistics(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_iSCSILoginStatistics)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_iSCSILoginStatistics)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_iSCSILoginStatistics)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_iSCSILoginStatistics)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_iSCSILoginStatistics)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_iSCSILoginStatistics)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_iSCSILoginStatistics)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_iSCSILoginStatistics)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_iSCSILoginStatistics)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_iSCSILoginStatistics)object).cimObjectPath)) {
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
	
	// Attribute AuthenticationLoginFailures
	
	public UnsignedInt64 get_AuthenticationLoginFailures() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_AUTHENTICATIONLOGINFAILURES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_AUTHENTICATIONLOGINFAILURES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_AUTHENTICATIONLOGINFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AuthenticationLoginFailures(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_AUTHENTICATIONLOGINFAILURES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_AUTHENTICATIONLOGINFAILURES + " could not be found");
    		
		} else if (!CIM_iSCSILoginStatisticsHelper.isValid_AuthenticationLoginFailures(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_AUTHENTICATIONLOGINFAILURES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_AUTHENTICATIONLOGINFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AuthorizationLoginFailures
	
	public UnsignedInt64 get_AuthorizationLoginFailures() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_AUTHORIZATIONLOGINFAILURES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_AUTHORIZATIONLOGINFAILURES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_AUTHORIZATIONLOGINFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AuthorizationLoginFailures(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_AUTHORIZATIONLOGINFAILURES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_AUTHORIZATIONLOGINFAILURES + " could not be found");
    		
		} else if (!CIM_iSCSILoginStatisticsHelper.isValid_AuthorizationLoginFailures(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_AUTHORIZATIONLOGINFAILURES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_AUTHORIZATIONLOGINFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LastLoginFailureRemoteAddress
	
	public UnsignedInt32 get_LastLoginFailureRemoteAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILUREREMOTEADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILUREREMOTEADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILUREREMOTEADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LastLoginFailureRemoteAddress(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILUREREMOTEADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILUREREMOTEADDRESS + " could not be found");
    		
		} else if (!CIM_iSCSILoginStatisticsHelper.isValid_LastLoginFailureRemoteAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILUREREMOTEADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILUREREMOTEADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LastLoginFailureRemoteAddressType
	
	public UnsignedInt16 get_LastLoginFailureRemoteAddressType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILUREREMOTEADDRESSTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILUREREMOTEADDRESSTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILUREREMOTEADDRESSTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LastLoginFailureRemoteAddressType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILUREREMOTEADDRESSTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILUREREMOTEADDRESSTYPE + " could not be found");
    		
		} else if (!CIM_iSCSILoginStatisticsHelper.isValid_LastLoginFailureRemoteAddressType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILUREREMOTEADDRESSTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILUREREMOTEADDRESSTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LastLoginFailureRemoteNodeName
	
	public String get_LastLoginFailureRemoteNodeName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILUREREMOTENODENAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILUREREMOTENODENAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILUREREMOTENODENAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LastLoginFailureRemoteNodeName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILUREREMOTENODENAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILUREREMOTENODENAME + " could not be found");
    		
		} else if (!CIM_iSCSILoginStatisticsHelper.isValid_LastLoginFailureRemoteNodeName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILUREREMOTENODENAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILUREREMOTENODENAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LastLoginFailureTime
	
	public Calendar get_LastLoginFailureTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILURETIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILURETIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILURETIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_LastLoginFailureTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILURETIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILURETIME + " could not be found");
    		
		} else if (!CIM_iSCSILoginStatisticsHelper.isValid_LastLoginFailureTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILURETIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILURETIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute LastLoginFailureType
	
	public UnsignedInt16 get_LastLoginFailureType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILURETYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILURETYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILURETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LastLoginFailureType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILURETYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILURETYPE + " could not be found");
    		
		} else if (!CIM_iSCSILoginStatisticsHelper.isValid_LastLoginFailureType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILURETYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LASTLOGINFAILURETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LoginFailures
	
	public UnsignedInt64 get_LoginFailures() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_LOGINFAILURES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LOGINFAILURES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LOGINFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LoginFailures(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_LOGINFAILURES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LOGINFAILURES + " could not be found");
    		
		} else if (!CIM_iSCSILoginStatisticsHelper.isValid_LoginFailures(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LOGINFAILURES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LOGINFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LoginRedirects
	
	public UnsignedInt64 get_LoginRedirects() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_LOGINREDIRECTS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LOGINREDIRECTS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LOGINREDIRECTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LoginRedirects(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_LOGINREDIRECTS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LOGINREDIRECTS + " could not be found");
    		
		} else if (!CIM_iSCSILoginStatisticsHelper.isValid_LoginRedirects(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LOGINREDIRECTS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_LOGINREDIRECTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NegotiationLoginFailures
	
	public UnsignedInt64 get_NegotiationLoginFailures() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_NEGOTIATIONLOGINFAILURES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_NEGOTIATIONLOGINFAILURES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_NEGOTIATIONLOGINFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NegotiationLoginFailures(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_NEGOTIATIONLOGINFAILURES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_NEGOTIATIONLOGINFAILURES + " could not be found");
    		
		} else if (!CIM_iSCSILoginStatisticsHelper.isValid_NegotiationLoginFailures(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_NEGOTIATIONLOGINFAILURES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_NEGOTIATIONLOGINFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NormalLogouts
	
	public UnsignedInt64 get_NormalLogouts() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_NORMALLOGOUTS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_NORMALLOGOUTS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_NORMALLOGOUTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NormalLogouts(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_NORMALLOGOUTS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_NORMALLOGOUTS + " could not be found");
    		
		} else if (!CIM_iSCSILoginStatisticsHelper.isValid_NormalLogouts(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_NORMALLOGOUTS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_NORMALLOGOUTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherLastLoginFailureType
	
	public String get_OtherLastLoginFailureType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_OTHERLASTLOGINFAILURETYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_OTHERLASTLOGINFAILURETYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_OTHERLASTLOGINFAILURETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherLastLoginFailureType(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_OTHERLASTLOGINFAILURETYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_OTHERLASTLOGINFAILURETYPE + " could not be found");
    		
		} else if (!CIM_iSCSILoginStatisticsHelper.isValid_OtherLastLoginFailureType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_OTHERLASTLOGINFAILURETYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_OTHERLASTLOGINFAILURETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherLoginFailures
	
	public UnsignedInt64 get_OtherLoginFailures() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_OTHERLOGINFAILURES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_OTHERLOGINFAILURES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_OTHERLOGINFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherLoginFailures(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_OTHERLOGINFAILURES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_OTHERLOGINFAILURES + " could not be found");
    		
		} else if (!CIM_iSCSILoginStatisticsHelper.isValid_OtherLoginFailures(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_OTHERLOGINFAILURES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_OTHERLOGINFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherLogouts
	
	public UnsignedInt64 get_OtherLogouts() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_OTHERLOGOUTS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_OTHERLOGOUTS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_OTHERLOGOUTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherLogouts(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_OTHERLOGOUTS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_OTHERLOGOUTS + " could not be found");
    		
		} else if (!CIM_iSCSILoginStatisticsHelper.isValid_OtherLogouts(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_OTHERLOGOUTS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_OTHERLOGOUTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SuccessfulLogins
	
	public UnsignedInt64 get_SuccessfulLogins() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_SUCCESSFULLOGINS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_SUCCESSFULLOGINS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_SUCCESSFULLOGINS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SuccessfulLogins(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSILoginStatistics.CIM_PROPERTY_SUCCESSFULLOGINS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_SUCCESSFULLOGINS + " could not be found");
    		
		} else if (!CIM_iSCSILoginStatisticsHelper.isValid_SuccessfulLogins(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_SUCCESSFULLOGINS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSILoginStatistics.CIM_PROPERTY_SUCCESSFULLOGINS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
