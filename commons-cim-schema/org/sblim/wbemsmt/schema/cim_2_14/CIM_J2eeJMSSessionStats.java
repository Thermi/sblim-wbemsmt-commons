/** 
 * CIM_J2eeJMSSessionStats.java
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
 * Description:  The CIM_J2eeJMSSessionStats class defines the performance statistics that are
 * provided by a JMS session.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.lang.reflect.Constructor;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Enumeration;
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
import org.sblim.wbem.cim.UnsignedInt64;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.CIMEnumeration;



/**
 *  The CIM_J2eeJMSSessionStats class defines the performance statistics that are
 * provided by a JMS session.
 */
public class CIM_J2eeJMSSessionStats extends CIM_J2eeStatistic  {
	
	public final static String CIM_CLASS_NAME = "CIM_J2eeJMSSessionStats"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_J2EEJMSCONNECTIONSESSIONS = "CIM_J2eeJMSConnectionSessions"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_J2EEJMSSESSIONCONSUMERS = "CIM_J2eeJMSSessionConsumers"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_J2EEJMSSESSIONPRODUCERS = "CIM_J2eeJMSSessionProducers"; //$NON-NLS-1$
	
	
	/**
	*	The number of durable subscriptions.
	*/
	public final static String CIM_PROPERTY_DURABLESUBSCRIPTIONCOUNT = "DurableSubscriptionCount"; //$NON-NLS-1$
	/**
	*	The number of expired messages.
	*/
	public final static String CIM_PROPERTY_EXPIREDMESSAGECOUNT = "ExpiredMessageCount"; //$NON-NLS-1$
	/**
	*	The number of messages exchanged.
	*/
	public final static String CIM_PROPERTY_MESSAGECOUNT = "MessageCount"; //$NON-NLS-1$
	/**
	*	The time spent by a message before being delivered. The time is represented as a datetime interval.
	*/
	public final static String CIM_PROPERTY_MESSAGEWAITTIME = "MessageWaitTime"; //$NON-NLS-1$
	/**
	*	The maximum amount of time spent by a message before being delivered since the beginning of this measurement. The time is represented as a datetime interval.
	*/
	public final static String CIM_PROPERTY_MESSAGEWAITTIMEMAXTIME = "MessageWaitTimeMaxTime"; //$NON-NLS-1$
	/**
	*	The minimum amount of time spent by a message before being delivered since the beginning of this measurement. The time is represented as a datetime interval.
	*/
	public final static String CIM_PROPERTY_MESSAGEWAITTIMEMINTIME = "MessageWaitTimeMinTime"; //$NON-NLS-1$
	/**
	*	The total amount of time spent by a message before being delivered since the beginning of this measurement. Dividing MessageWaitTimeTotalTime by MessageWaitTime will provide the average time spent using a connection. The time is represented as a datetime interval.
	*/
	public final static String CIM_PROPERTY_MESSAGEWAITTIMETOTALTIME = "MessageWaitTimeTotalTime"; //$NON-NLS-1$
	/**
	*	The number of pending messages.
	*/
	public final static String CIM_PROPERTY_PENDINGMESSAGECOUNT = "PendingMessageCount"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DURABLESUBSCRIPTIONCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_EXPIREDMESSAGECOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_MESSAGECOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_MESSAGEWAITTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_MESSAGEWAITTIMEMAXTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_MESSAGEWAITTIMEMINTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_MESSAGEWAITTIMETOTALTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_PENDINGMESSAGECOUNT);
				
		for (int i = 0; i < CIM_J2eeStatistic.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DURABLESUBSCRIPTIONCOUNT)||
				((String)CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EXPIREDMESSAGECOUNT)||
				((String)CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MESSAGECOUNT)||
				((String)CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MESSAGEWAITTIME)||
				((String)CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MESSAGEWAITTIMEMAXTIME)||
				((String)CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MESSAGEWAITTIMEMINTIME)||
				((String)CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MESSAGEWAITTIMETOTALTIME)||
				((String)CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PENDINGMESSAGECOUNT)){
				continue;
			}
			
			CIM_J2eeJMSSessionStats.CIM_PropertyNameList.add(CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DURABLESUBSCRIPTIONCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EXPIREDMESSAGECOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MESSAGECOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MESSAGEWAITTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MESSAGEWAITTIMEMAXTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MESSAGEWAITTIMEMINTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MESSAGEWAITTIMETOTALTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PENDINGMESSAGECOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_J2eeStatistic.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_J2eeStatistic.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DURABLESUBSCRIPTIONCOUNT)||
				((CIMProperty)CIM_J2eeStatistic.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EXPIREDMESSAGECOUNT)||
				((CIMProperty)CIM_J2eeStatistic.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MESSAGECOUNT)||
				((CIMProperty)CIM_J2eeStatistic.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MESSAGEWAITTIME)||
				((CIMProperty)CIM_J2eeStatistic.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MESSAGEWAITTIMEMAXTIME)||
				((CIMProperty)CIM_J2eeStatistic.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MESSAGEWAITTIMEMINTIME)||
				((CIMProperty)CIM_J2eeStatistic.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MESSAGEWAITTIMETOTALTIME)||
				((CIMProperty)CIM_J2eeStatistic.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PENDINGMESSAGECOUNT)){
				continue;
			}
			
			CIM_J2eeJMSSessionStats.CIM_PropertyList.add(CIM_J2eeStatistic.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_J2eeStatistic.Java_Package_List.size(); i++) {
			if (((String)CIM_J2eeStatistic.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_J2eeStatistic.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_J2eeJMSSessionStats() {

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
	public CIM_J2eeJMSSessionStats(Vector keyProperties){ 
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
	public CIM_J2eeJMSSessionStats(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_J2eeJMSSessionStats)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_J2eeJMSSessionStats)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_J2eeJMSSessionStats)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_J2eeJMSSessionStats)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_J2eeJMSSessionStats)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_J2eeJMSSessionStats)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_J2eeJMSSessionStats)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_J2eeJMSSessionStats)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_J2eeJMSSessionStats)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_J2eeJMSSessionStats)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_J2eeJMSConnectionStats_CIM_J2eeJMSConnectionSessionss(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_J2EEJMSCONNECTIONSESSIONS, 
					CIM_J2eeJMSConnectionStats.CIM_CLASS_NAME, 
					"RelatedStats", //$NON-NLS-1$
					"Stats", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_J2eeJMSSessionStats.Java_Package_List.size(); i++) {
						if (!((String)(CIM_J2eeJMSSessionStats.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_J2eeJMSSessionStats.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_J2eeJMSSessionStats.Java_Package_List.setElementAt((String)(CIM_J2eeJMSSessionStats.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_J2eeJMSSessionStats.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_J2eeJMSConnectionStats(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_J2eeJMSConnectionStats(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_J2eeJMSConnectionStats(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_J2eeJMSConnectionStats_CIM_J2eeJMSConnectionSessions_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_J2EEJMSCONNECTIONSESSIONS, 
					CIM_J2eeJMSConnectionStats.CIM_CLASS_NAME, 
					"RelatedStats", //$NON-NLS-1$
					"Stats"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_J2eeJMSConnectionStats.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_J2eeJMSConsumerStats_CIM_J2eeJMSSessionConsumerss(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_J2EEJMSSESSIONCONSUMERS, 
					CIM_J2eeJMSConsumerStats.CIM_CLASS_NAME, 
					"Stats", //$NON-NLS-1$
					"RelatedStats", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_J2eeJMSSessionStats.Java_Package_List.size(); i++) {
						if (!((String)(CIM_J2eeJMSSessionStats.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_J2eeJMSSessionStats.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_J2eeJMSSessionStats.Java_Package_List.setElementAt((String)(CIM_J2eeJMSSessionStats.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_J2eeJMSSessionStats.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_J2eeJMSConsumerStats(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_J2eeJMSConsumerStats(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_J2eeJMSConsumerStats(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_J2eeJMSConsumerStats_CIM_J2eeJMSSessionConsumers_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_J2EEJMSSESSIONCONSUMERS, 
					CIM_J2eeJMSConsumerStats.CIM_CLASS_NAME, 
					"Stats", //$NON-NLS-1$
					"RelatedStats"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_J2eeJMSConsumerStats.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_J2eeJMSProducerStats_CIM_J2eeJMSSessionProducerss(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_J2EEJMSSESSIONPRODUCERS, 
					CIM_J2eeJMSProducerStats.CIM_CLASS_NAME, 
					"Stats", //$NON-NLS-1$
					"RelatedStats", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_J2eeJMSSessionStats.Java_Package_List.size(); i++) {
						if (!((String)(CIM_J2eeJMSSessionStats.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_J2eeJMSSessionStats.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_J2eeJMSSessionStats.Java_Package_List.setElementAt((String)(CIM_J2eeJMSSessionStats.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_J2eeJMSSessionStats.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_J2eeJMSProducerStats(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_J2eeJMSProducerStats(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_J2eeJMSProducerStats(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_J2eeJMSProducerStats_CIM_J2eeJMSSessionProducers_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_J2EEJMSSESSIONPRODUCERS, 
					CIM_J2eeJMSProducerStats.CIM_CLASS_NAME, 
					"Stats", //$NON-NLS-1$
					"RelatedStats"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_J2eeJMSProducerStats.CIM_CLASS_NAME)) {
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
	
	// Attribute DurableSubscriptionCount
	
	public UnsignedInt64 get_DurableSubscriptionCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJMSSessionStats.CIM_PROPERTY_DURABLESUBSCRIPTIONCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_DURABLESUBSCRIPTIONCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_DURABLESUBSCRIPTIONCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DurableSubscriptionCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJMSSessionStats.CIM_PROPERTY_DURABLESUBSCRIPTIONCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_DURABLESUBSCRIPTIONCOUNT + " could not be found");
    		
		} else if (!CIM_J2eeJMSSessionStatsHelper.isValid_DurableSubscriptionCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_DURABLESUBSCRIPTIONCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_DURABLESUBSCRIPTIONCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ExpiredMessageCount
	
	public UnsignedInt64 get_ExpiredMessageCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJMSSessionStats.CIM_PROPERTY_EXPIREDMESSAGECOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_EXPIREDMESSAGECOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_EXPIREDMESSAGECOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ExpiredMessageCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJMSSessionStats.CIM_PROPERTY_EXPIREDMESSAGECOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_EXPIREDMESSAGECOUNT + " could not be found");
    		
		} else if (!CIM_J2eeJMSSessionStatsHelper.isValid_ExpiredMessageCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_EXPIREDMESSAGECOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_EXPIREDMESSAGECOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MessageCount
	
	public UnsignedInt64 get_MessageCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGECOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGECOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGECOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MessageCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGECOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGECOUNT + " could not be found");
    		
		} else if (!CIM_J2eeJMSSessionStatsHelper.isValid_MessageCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGECOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGECOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MessageWaitTime
	
	public Calendar get_MessageWaitTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_MessageWaitTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIME + " could not be found");
    		
		} else if (!CIM_J2eeJMSSessionStatsHelper.isValid_MessageWaitTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute MessageWaitTimeMaxTime
	
	public Calendar get_MessageWaitTimeMaxTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIMEMAXTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIMEMAXTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIMEMAXTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_MessageWaitTimeMaxTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIMEMAXTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIMEMAXTIME + " could not be found");
    		
		} else if (!CIM_J2eeJMSSessionStatsHelper.isValid_MessageWaitTimeMaxTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIMEMAXTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIMEMAXTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute MessageWaitTimeMinTime
	
	public Calendar get_MessageWaitTimeMinTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIMEMINTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIMEMINTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIMEMINTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_MessageWaitTimeMinTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIMEMINTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIMEMINTIME + " could not be found");
    		
		} else if (!CIM_J2eeJMSSessionStatsHelper.isValid_MessageWaitTimeMinTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIMEMINTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIMEMINTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute MessageWaitTimeTotalTime
	
	public Calendar get_MessageWaitTimeTotalTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIMETOTALTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIMETOTALTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIMETOTALTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_MessageWaitTimeTotalTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIMETOTALTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIMETOTALTIME + " could not be found");
    		
		} else if (!CIM_J2eeJMSSessionStatsHelper.isValid_MessageWaitTimeTotalTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIMETOTALTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_MESSAGEWAITTIMETOTALTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute PendingMessageCount
	
	public UnsignedInt64 get_PendingMessageCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJMSSessionStats.CIM_PROPERTY_PENDINGMESSAGECOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_PENDINGMESSAGECOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_PENDINGMESSAGECOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PendingMessageCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJMSSessionStats.CIM_PROPERTY_PENDINGMESSAGECOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_PENDINGMESSAGECOUNT + " could not be found");
    		
		} else if (!CIM_J2eeJMSSessionStatsHelper.isValid_PendingMessageCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_PENDINGMESSAGECOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJMSSessionStats.CIM_PROPERTY_PENDINGMESSAGECOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
