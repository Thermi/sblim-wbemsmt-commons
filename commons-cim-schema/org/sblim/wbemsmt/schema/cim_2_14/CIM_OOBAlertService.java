/** 
 * CIM_OOBAlertService.java
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
 * Description:  This Service is implemented by a LogicalDevice (e.g. a NetworkAdapter or Modem)
 * that is capable of sending alert messages to a remote destination. The alert
 * messages reflect the state of one or more ManagedSystemElements. The Elements
 * for which alert messages are forwarded, are defined by enumerating the
 * ProvidesServiceToElement association for the Service. Out of Band (OOB)
 * refers to the mechanisms in use when normal OS-based management mechanisms
 * are not possible. This occurs when the OS is down or not functioning
 * properly.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.lang.reflect.Constructor;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.CIMEnumeration;



/**
 *  This Service is implemented by a LogicalDevice (e.g. a NetworkAdapter or Modem)
 * that is capable of sending alert messages to a remote destination. The alert
 * messages reflect the state of one or more ManagedSystemElements. The Elements
 * for which alert messages are forwarded, are defined by enumerating the
 * ProvidesServiceToElement association for the Service. Out of Band (OOB)
 * refers to the mechanisms in use when normal OS-based management mechanisms
 * are not possible. This occurs when the OS is down or not functioning
 * properly.
 */
public class CIM_OOBAlertService extends CIM_Service  {
	
	public final static String CIM_CLASS_NAME = "CIM_OOBAlertService"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONMODEM = "CIM_OOBAlertServiceOnModem"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKADAPTER = "CIM_OOBAlertServiceOnNetworkAdapter"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKPORT = "CIM_OOBAlertServiceOnNetworkPort"; //$NON-NLS-1$
	
	
	/**
	*	The address where this Service sends the alerts. The format of this address depends on the DestinationType. For example, if the DestinationType is a UDP Port (value=4), then this property contains a string identifying the IP address of the Port (for example, 111.222.333.444:4567). If DestinationType is a pager (value=2), then the address is a Pager number (for example, 18002257654).
	*/
	public final static String CIM_PROPERTY_DESTINATIONADDRESS = "DestinationAddress"; //$NON-NLS-1$
	/**
	*	If the destination is capable of sending an acknowledgement to the alert, then this flag is set to TRUE. The format of the acknowledgement is determined by the DestinationType and the MessageFormat.
	*/
	public final static String CIM_PROPERTY_DESTINATIONISACKCAPABLE = "DestinationIsAckCapable"; //$NON-NLS-1$
	/**
	*	The type of the alert destination. For example, the alert may be received by an application listening on a UDP Port on a remote destination, or could be sent to a pager (values 4 or 2, respectively).
	*/
	public final static String CIM_PROPERTY_DESTINATIONTYPE = "DestinationType"; //$NON-NLS-1$
	/**
	*	When set to true causes the OOBAlertService to send Presence heart beat messages.
	*/
	public final static String CIM_PROPERTY_ENABLEPRESENCEHEARTBEATS = "EnablePresenceHeartbeats"; //$NON-NLS-1$
	/**
	*	The AlertService may require some fixed data to send as part of the message. This may include things like the address or name of the System. This string contains the complete message when the property, OnlySendsFixedMessage, is set to TRUE.
	*/
	public final static String CIM_PROPERTY_FIXEDPARTOFMESSAGE = "FixedPartOfMessage"; //$NON-NLS-1$
	/**
	*	The format of the Alert Message sent by the Service.
	*/
	public final static String CIM_PROPERTY_MESSAGEFORMAT = "MessageFormat"; //$NON-NLS-1$
	/**
	*	If the AlertService only uses a fixed message to send an alert, then this flag should be set to TRUE.
	*/
	public final static String CIM_PROPERTY_ONLYSENDSFIXEDMESSAGE = "OnlySendsFixedMessage"; //$NON-NLS-1$
	/**
	*	The description of the alert DestinationType. This is used when the DestinationType is set to "Other" (value=1).
	*/
	public final static String CIM_PROPERTY_OTHERDESTINATIONTYPEDESCRIPTION = "OtherDestinationTypeDescription"; //$NON-NLS-1$
	/**
	*	The description of the format of the alert message used by the Service when the AlertMessageFormat property is set to "Other" (value=1).
	*/
	public final static String CIM_PROPERTY_OTHERMESSAGEFORMATDESCRIPTION = "OtherMessageFormatDescription"; //$NON-NLS-1$
	/**
	*	If the OOB Alerting service is capable of sending Presence heart beat messages.
	*/
	public final static String CIM_PROPERTY_PRESENCEHEARTBEATCAPABLE = "PresenceHeartbeatCapable"; //$NON-NLS-1$
	/**
	*	The AlertService may retry and send an alert more than once. The RetryCount identifies how often the operation will be repeated. If DestinationIsAckCapable is set to TRUE, then the retry will only be done if an Ack is not received. Otherwise, the retries are done unconditionally.
	*/
	public final static String CIM_PROPERTY_RETRYCOUNT = "RetryCount"; //$NON-NLS-1$
	/**
	*	The interval between each successive retry, in seconds. If DestinationIsAckCapable is set to TRUE, then this interval is used as a timeout interval, before the next retry is done.
	*/
	public final static String CIM_PROPERTY_RETRYINTERVAL = "RetryInterval"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DESTINATIONADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_DESTINATIONISACKCAPABLE);
		CIM_PropertyNameList.add(CIM_PROPERTY_DESTINATIONTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ENABLEPRESENCEHEARTBEATS);
		CIM_PropertyNameList.add(CIM_PROPERTY_FIXEDPARTOFMESSAGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MESSAGEFORMAT);
		CIM_PropertyNameList.add(CIM_PROPERTY_ONLYSENDSFIXEDMESSAGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERDESTINATIONTYPEDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERMESSAGEFORMATDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRESENCEHEARTBEATCAPABLE);
		CIM_PropertyNameList.add(CIM_PROPERTY_RETRYCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_RETRYINTERVAL);
				
		for (int i = 0; i < CIM_Service.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DESTINATIONADDRESS)||
				((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DESTINATIONISACKCAPABLE)||
				((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DESTINATIONTYPE)||
				((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ENABLEPRESENCEHEARTBEATS)||
				((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FIXEDPARTOFMESSAGE)||
				((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MESSAGEFORMAT)||
				((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ONLYSENDSFIXEDMESSAGE)||
				((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERDESTINATIONTYPEDESCRIPTION)||
				((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERMESSAGEFORMATDESCRIPTION)||
				((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRESENCEHEARTBEATCAPABLE)||
				((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RETRYCOUNT)||
				((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RETRYINTERVAL)){
				continue;
			}
			
			CIM_OOBAlertService.CIM_PropertyNameList.add(CIM_Service.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DESTINATIONADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DESTINATIONISACKCAPABLE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DESTINATIONTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ENABLEPRESENCEHEARTBEATS, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FIXEDPARTOFMESSAGE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MESSAGEFORMAT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ONLYSENDSFIXEDMESSAGE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERDESTINATIONTYPEDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERMESSAGEFORMATDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRESENCEHEARTBEATCAPABLE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RETRYCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RETRYINTERVAL, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_Service.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DESTINATIONADDRESS)||
				((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DESTINATIONISACKCAPABLE)||
				((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DESTINATIONTYPE)||
				((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ENABLEPRESENCEHEARTBEATS)||
				((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FIXEDPARTOFMESSAGE)||
				((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MESSAGEFORMAT)||
				((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ONLYSENDSFIXEDMESSAGE)||
				((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERDESTINATIONTYPEDESCRIPTION)||
				((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERMESSAGEFORMATDESCRIPTION)||
				((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRESENCEHEARTBEATCAPABLE)||
				((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RETRYCOUNT)||
				((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RETRYINTERVAL)){
				continue;
			}
			
			CIM_OOBAlertService.CIM_PropertyList.add(CIM_Service.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_Service.Java_Package_List.size(); i++) {
			if (((String)CIM_Service.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_Service.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_DESTINATIONTYPE = {"Unknown","Other","Pager","TCP Port","UDP Port"};
	public final static String[] CIM_VALUEMAP_MESSAGEFORMAT = {"Unknown","Other","Numeric","AlphaNumeric","Free Form Text","Platform Event Trap"};
	
	
	public final static int DESTINATIONTYPE_UNKNOWN = 0;
	public final static int DESTINATIONTYPE_OTHER = 1;
	public final static int DESTINATIONTYPE_PAGER = 2;
	public final static int DESTINATIONTYPE_TCPPORT = 3;
	public final static int DESTINATIONTYPE_UDPPORT = 4;
	
	public final static int MESSAGEFORMAT_UNKNOWN = 0;
	public final static int MESSAGEFORMAT_OTHER = 1;
	public final static int MESSAGEFORMAT_NUMERIC = 2;
	public final static int MESSAGEFORMAT_ALPHANUMERIC = 3;
	public final static int MESSAGEFORMAT_FREEFORMTEXT = 4;
	public final static int MESSAGEFORMAT_PLATFORMEVENTTRAP = 5;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_OOBAlertService() {

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
	public CIM_OOBAlertService(Vector keyProperties){ 
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
	public CIM_OOBAlertService(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_OOBAlertService)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_OOBAlertService)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_OOBAlertService)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_OOBAlertService)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_OOBAlertService)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_OOBAlertService)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_OOBAlertService)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_OOBAlertService)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_OOBAlertService)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_OOBAlertService)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_Modem_CIM_OOBAlertServiceOnModems(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONMODEM, 
					CIM_Modem.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_OOBAlertService.Java_Package_List.size(); i++) {
						if (!((String)(CIM_OOBAlertService.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_OOBAlertService.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_OOBAlertService.Java_Package_List.setElementAt((String)(CIM_OOBAlertService.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_OOBAlertService.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Modem(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
					
					Class[] constParams = new Class[2];
					constParams[0] = CIMObjectPath.class;
					constParams[1] = CIMInstance.class;
					Constructor cons = null;
					try {
						cons = clazz.getConstructor(constParams);
						
					} catch(NoSuchMethodException e) {
						System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Modem(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Modem(cimInstance.getObjectPath(), cimInstance));
						continue;
					}

				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	public ArrayList getAssociated_CIM_Modem_CIM_OOBAlertServiceOnModem_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONMODEM, 
					CIM_Modem.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_Modem.CIM_CLASS_NAME)) {
						resultArrayList.add(obj);
					}
				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	public ArrayList getAssociated_CIM_NetworkAdapter_CIM_OOBAlertServiceOnNetworkAdapters(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKADAPTER, 
					CIM_NetworkAdapter.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_OOBAlertService.Java_Package_List.size(); i++) {
						if (!((String)(CIM_OOBAlertService.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_OOBAlertService.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_OOBAlertService.Java_Package_List.setElementAt((String)(CIM_OOBAlertService.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_OOBAlertService.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_NetworkAdapter(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
					
					Class[] constParams = new Class[2];
					constParams[0] = CIMObjectPath.class;
					constParams[1] = CIMInstance.class;
					Constructor cons = null;
					try {
						cons = clazz.getConstructor(constParams);
						
					} catch(NoSuchMethodException e) {
						System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_NetworkAdapter(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_NetworkAdapter(cimInstance.getObjectPath(), cimInstance));
						continue;
					}

				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	public ArrayList getAssociated_CIM_NetworkAdapter_CIM_OOBAlertServiceOnNetworkAdapter_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKADAPTER, 
					CIM_NetworkAdapter.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_NetworkAdapter.CIM_CLASS_NAME)) {
						resultArrayList.add(obj);
					}
				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	public ArrayList getAssociated_CIM_NetworkPort_CIM_OOBAlertServiceOnNetworkPorts(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKPORT, 
					CIM_NetworkPort.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_OOBAlertService.Java_Package_List.size(); i++) {
						if (!((String)(CIM_OOBAlertService.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_OOBAlertService.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_OOBAlertService.Java_Package_List.setElementAt((String)(CIM_OOBAlertService.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_OOBAlertService.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_NetworkPort(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
					
					Class[] constParams = new Class[2];
					constParams[0] = CIMObjectPath.class;
					constParams[1] = CIMInstance.class;
					Constructor cons = null;
					try {
						cons = clazz.getConstructor(constParams);
						
					} catch(NoSuchMethodException e) {
						System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_NetworkPort(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_NetworkPort(cimInstance.getObjectPath(), cimInstance));
						continue;
					}

				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	public ArrayList getAssociated_CIM_NetworkPort_CIM_OOBAlertServiceOnNetworkPort_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_OOBALERTSERVICEONNETWORKPORT, 
					CIM_NetworkPort.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_NetworkPort.CIM_CLASS_NAME)) {
						resultArrayList.add(obj);
					}
				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	
	
	//*****************************************************
	// Attribute methods
	//*****************************************************
	
	// Attribute DestinationAddress
	
	public String get_DestinationAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OOBAlertService.CIM_PROPERTY_DESTINATIONADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OOBAlertService.CIM_PROPERTY_DESTINATIONADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OOBAlertService.CIM_PROPERTY_DESTINATIONADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DestinationAddress(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OOBAlertService.CIM_PROPERTY_DESTINATIONADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OOBAlertService.CIM_PROPERTY_DESTINATIONADDRESS + " could not be found");
    		
		} else if (!CIM_OOBAlertServiceHelper.isValid_DestinationAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OOBAlertService.CIM_PROPERTY_DESTINATIONADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OOBAlertService.CIM_PROPERTY_DESTINATIONADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DestinationIsAckCapable
	
	public Boolean get_DestinationIsAckCapable() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OOBAlertService.CIM_PROPERTY_DESTINATIONISACKCAPABLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OOBAlertService.CIM_PROPERTY_DESTINATIONISACKCAPABLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OOBAlertService.CIM_PROPERTY_DESTINATIONISACKCAPABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DestinationIsAckCapable(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OOBAlertService.CIM_PROPERTY_DESTINATIONISACKCAPABLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OOBAlertService.CIM_PROPERTY_DESTINATIONISACKCAPABLE + " could not be found");
    		
		} else if (!CIM_OOBAlertServiceHelper.isValid_DestinationIsAckCapable(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OOBAlertService.CIM_PROPERTY_DESTINATIONISACKCAPABLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OOBAlertService.CIM_PROPERTY_DESTINATIONISACKCAPABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DestinationType
	
	public UnsignedInt16 get_DestinationType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OOBAlertService.CIM_PROPERTY_DESTINATIONTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OOBAlertService.CIM_PROPERTY_DESTINATIONTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OOBAlertService.CIM_PROPERTY_DESTINATIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DestinationType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OOBAlertService.CIM_PROPERTY_DESTINATIONTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OOBAlertService.CIM_PROPERTY_DESTINATIONTYPE + " could not be found");
    		
		} else if (!CIM_OOBAlertServiceHelper.isValid_DestinationType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OOBAlertService.CIM_PROPERTY_DESTINATIONTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OOBAlertService.CIM_PROPERTY_DESTINATIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EnablePresenceHeartbeats
	
	public Boolean get_EnablePresenceHeartbeats() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OOBAlertService.CIM_PROPERTY_ENABLEPRESENCEHEARTBEATS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OOBAlertService.CIM_PROPERTY_ENABLEPRESENCEHEARTBEATS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OOBAlertService.CIM_PROPERTY_ENABLEPRESENCEHEARTBEATS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EnablePresenceHeartbeats(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OOBAlertService.CIM_PROPERTY_ENABLEPRESENCEHEARTBEATS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OOBAlertService.CIM_PROPERTY_ENABLEPRESENCEHEARTBEATS + " could not be found");
    		
		} else if (!CIM_OOBAlertServiceHelper.isValid_EnablePresenceHeartbeats(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OOBAlertService.CIM_PROPERTY_ENABLEPRESENCEHEARTBEATS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OOBAlertService.CIM_PROPERTY_ENABLEPRESENCEHEARTBEATS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FixedPartOfMessage
	
	public String get_FixedPartOfMessage() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OOBAlertService.CIM_PROPERTY_FIXEDPARTOFMESSAGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OOBAlertService.CIM_PROPERTY_FIXEDPARTOFMESSAGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OOBAlertService.CIM_PROPERTY_FIXEDPARTOFMESSAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FixedPartOfMessage(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OOBAlertService.CIM_PROPERTY_FIXEDPARTOFMESSAGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OOBAlertService.CIM_PROPERTY_FIXEDPARTOFMESSAGE + " could not be found");
    		
		} else if (!CIM_OOBAlertServiceHelper.isValid_FixedPartOfMessage(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OOBAlertService.CIM_PROPERTY_FIXEDPARTOFMESSAGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OOBAlertService.CIM_PROPERTY_FIXEDPARTOFMESSAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MessageFormat
	
	public UnsignedInt16 get_MessageFormat() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OOBAlertService.CIM_PROPERTY_MESSAGEFORMAT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OOBAlertService.CIM_PROPERTY_MESSAGEFORMAT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OOBAlertService.CIM_PROPERTY_MESSAGEFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MessageFormat(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OOBAlertService.CIM_PROPERTY_MESSAGEFORMAT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OOBAlertService.CIM_PROPERTY_MESSAGEFORMAT + " could not be found");
    		
		} else if (!CIM_OOBAlertServiceHelper.isValid_MessageFormat(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OOBAlertService.CIM_PROPERTY_MESSAGEFORMAT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OOBAlertService.CIM_PROPERTY_MESSAGEFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OnlySendsFixedMessage
	
	public Boolean get_OnlySendsFixedMessage() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OOBAlertService.CIM_PROPERTY_ONLYSENDSFIXEDMESSAGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OOBAlertService.CIM_PROPERTY_ONLYSENDSFIXEDMESSAGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OOBAlertService.CIM_PROPERTY_ONLYSENDSFIXEDMESSAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OnlySendsFixedMessage(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OOBAlertService.CIM_PROPERTY_ONLYSENDSFIXEDMESSAGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OOBAlertService.CIM_PROPERTY_ONLYSENDSFIXEDMESSAGE + " could not be found");
    		
		} else if (!CIM_OOBAlertServiceHelper.isValid_OnlySendsFixedMessage(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OOBAlertService.CIM_PROPERTY_ONLYSENDSFIXEDMESSAGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OOBAlertService.CIM_PROPERTY_ONLYSENDSFIXEDMESSAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherDestinationTypeDescription
	
	public String get_OtherDestinationTypeDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OOBAlertService.CIM_PROPERTY_OTHERDESTINATIONTYPEDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OOBAlertService.CIM_PROPERTY_OTHERDESTINATIONTYPEDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OOBAlertService.CIM_PROPERTY_OTHERDESTINATIONTYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherDestinationTypeDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OOBAlertService.CIM_PROPERTY_OTHERDESTINATIONTYPEDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OOBAlertService.CIM_PROPERTY_OTHERDESTINATIONTYPEDESCRIPTION + " could not be found");
    		
		} else if (!CIM_OOBAlertServiceHelper.isValid_OtherDestinationTypeDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OOBAlertService.CIM_PROPERTY_OTHERDESTINATIONTYPEDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OOBAlertService.CIM_PROPERTY_OTHERDESTINATIONTYPEDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherMessageFormatDescription
	
	public String get_OtherMessageFormatDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OOBAlertService.CIM_PROPERTY_OTHERMESSAGEFORMATDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OOBAlertService.CIM_PROPERTY_OTHERMESSAGEFORMATDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OOBAlertService.CIM_PROPERTY_OTHERMESSAGEFORMATDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherMessageFormatDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OOBAlertService.CIM_PROPERTY_OTHERMESSAGEFORMATDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OOBAlertService.CIM_PROPERTY_OTHERMESSAGEFORMATDESCRIPTION + " could not be found");
    		
		} else if (!CIM_OOBAlertServiceHelper.isValid_OtherMessageFormatDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OOBAlertService.CIM_PROPERTY_OTHERMESSAGEFORMATDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OOBAlertService.CIM_PROPERTY_OTHERMESSAGEFORMATDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PresenceHeartbeatCapable
	
	public Boolean get_PresenceHeartbeatCapable() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OOBAlertService.CIM_PROPERTY_PRESENCEHEARTBEATCAPABLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OOBAlertService.CIM_PROPERTY_PRESENCEHEARTBEATCAPABLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OOBAlertService.CIM_PROPERTY_PRESENCEHEARTBEATCAPABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PresenceHeartbeatCapable(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OOBAlertService.CIM_PROPERTY_PRESENCEHEARTBEATCAPABLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OOBAlertService.CIM_PROPERTY_PRESENCEHEARTBEATCAPABLE + " could not be found");
    		
		} else if (!CIM_OOBAlertServiceHelper.isValid_PresenceHeartbeatCapable(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OOBAlertService.CIM_PROPERTY_PRESENCEHEARTBEATCAPABLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OOBAlertService.CIM_PROPERTY_PRESENCEHEARTBEATCAPABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RetryCount
	
	public UnsignedInt16 get_RetryCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OOBAlertService.CIM_PROPERTY_RETRYCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OOBAlertService.CIM_PROPERTY_RETRYCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OOBAlertService.CIM_PROPERTY_RETRYCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RetryCount(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OOBAlertService.CIM_PROPERTY_RETRYCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OOBAlertService.CIM_PROPERTY_RETRYCOUNT + " could not be found");
    		
		} else if (!CIM_OOBAlertServiceHelper.isValid_RetryCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OOBAlertService.CIM_PROPERTY_RETRYCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OOBAlertService.CIM_PROPERTY_RETRYCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RetryInterval
	
	public UnsignedInt16 get_RetryInterval() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OOBAlertService.CIM_PROPERTY_RETRYINTERVAL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OOBAlertService.CIM_PROPERTY_RETRYINTERVAL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OOBAlertService.CIM_PROPERTY_RETRYINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RetryInterval(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OOBAlertService.CIM_PROPERTY_RETRYINTERVAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OOBAlertService.CIM_PROPERTY_RETRYINTERVAL + " could not be found");
    		
		} else if (!CIM_OOBAlertServiceHelper.isValid_RetryInterval(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OOBAlertService.CIM_PROPERTY_RETRYINTERVAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OOBAlertService.CIM_PROPERTY_RETRYINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
