/** 
 * CIM_J2eeConnectionPoolStats.java
 *
 * © Copyright IBM Corp. 2005
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
 * Description: The J2eeConnectionPoolStats class defines the performance statistics that are provided by a connection pool. JCA and JDBC connection pool statistics are represented by this class. The semantics are determined by the class to which the ConnectionStats instance is associated via the CIM_ElementStatisticalData association.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.lang.reflect.Constructor;
import org.sblim.wbem.client.*;



public class CIM_J2eeConnectionPoolStats extends CIM_J2eeConnectionStats  {
	
	public final static String CIM_CLASS_NAME = "CIM_J2eeConnectionPoolStats";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_J2EEJCACONNECTIONPOOLS = "CIM_J2eeJCAConnectionPools";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_J2EEJDBCCONNECTIONPOOLS = "CIM_J2eeJDBCConnectionPools";
	
	
	/**
	*	The number of connections closed.
	*/
	public final static String CIM_PROPERTY_CLOSECOUNT = "CloseCount"; //$NON-NLS-1$
	/**
	*	The number of connections created.
	*/
	public final static String CIM_PROPERTY_CREATECOUNT = "CreateCount"; //$NON-NLS-1$
	/**
	*	The number of free connections in the pool.
	*/
	public final static String CIM_PROPERTY_FREEPOOLSIZE = "FreePoolSize"; //$NON-NLS-1$
	/**
	*	The highest number of free connections in the pool since the beginning of the measurement.
	*/
	public final static String CIM_PROPERTY_FREEPOOLSIZEHIGHWATERMARK = "FreePoolSizeHighWaterMark"; //$NON-NLS-1$
	/**
	*	The lowest number of free connections in the pool since the beginning of the measurement.
	*/
	public final static String CIM_PROPERTY_FREEPOOLSIZELOWWATERMARK = "FreePoolSizeLowWaterMark"; //$NON-NLS-1$
	/**
	*	The lower limit for the number of free connections in the pool.
	*/
	public final static String CIM_PROPERTY_FREEPOOLSIZELOWERBOUND = "FreePoolSizeLowerBound"; //$NON-NLS-1$
	/**
	*	The upper limit for the number of free connections in the pool.
	*/
	public final static String CIM_PROPERTY_FREEPOOLSIZEUPPERBOUND = "FreePoolSizeUpperBound"; //$NON-NLS-1$
	/**
	*	The size of the connection pool.
	*/
	public final static String CIM_PROPERTY_POOLSIZE = "PoolSize"; //$NON-NLS-1$
	/**
	*	The largest size of the connection pool since the beginning of the measurement.
	*/
	public final static String CIM_PROPERTY_POOLSIZEHIGHWATERMARK = "PoolSizeHighWaterMark"; //$NON-NLS-1$
	/**
	*	The lowest size of the connection pool since the beginning of the measurement.
	*/
	public final static String CIM_PROPERTY_POOLSIZELOWWATERMARK = "PoolSizeLowWaterMark"; //$NON-NLS-1$
	/**
	*	The lower limit for the size of the connection pool.
	*/
	public final static String CIM_PROPERTY_POOLSIZELOWERBOUND = "PoolSizeLowerBound"; //$NON-NLS-1$
	/**
	*	The upper limit for the size of the connection pool.
	*/
	public final static String CIM_PROPERTY_POOLSIZEUPPERBOUND = "PoolSizeUpperBound"; //$NON-NLS-1$
	/**
	*	The number of threads waiting for a connection.
	*/
	public final static String CIM_PROPERTY_WAITINGTHREADCOUNT = "WaitingThreadCount"; //$NON-NLS-1$
	/**
	*	The highest number of threads waiting for a connection since the beginning of the measurement.
	*/
	public final static String CIM_PROPERTY_WAITINGTHREADCOUNTHIGHWATERMARK = "WaitingThreadCountHighWaterMark"; //$NON-NLS-1$
	/**
	*	The lowest number of threads waiting for a connection since the beginning of the measurement.
	*/
	public final static String CIM_PROPERTY_WAITINGTHREADCOUNTLOWWATERMARK = "WaitingThreadCountLowWaterMark"; //$NON-NLS-1$
	/**
	*	The lower limit for the number of threads waiting for a connection.
	*/
	public final static String CIM_PROPERTY_WAITINGTHREADCOUNTLOWERBOUND = "WaitingThreadCountLowerBound"; //$NON-NLS-1$
	/**
	*	The upper limit for the number of threads waiting for a connection.
	*/
	public final static String CIM_PROPERTY_WAITINGTHREADCOUNTUPPERBOUND = "WaitingThreadCountUpperBound"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CLOSECOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CREATECOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_FREEPOOLSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_FREEPOOLSIZEHIGHWATERMARK);
		CIM_PropertyNameList.add(CIM_PROPERTY_FREEPOOLSIZELOWWATERMARK);
		CIM_PropertyNameList.add(CIM_PROPERTY_FREEPOOLSIZELOWERBOUND);
		CIM_PropertyNameList.add(CIM_PROPERTY_FREEPOOLSIZEUPPERBOUND);
		CIM_PropertyNameList.add(CIM_PROPERTY_POOLSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_POOLSIZEHIGHWATERMARK);
		CIM_PropertyNameList.add(CIM_PROPERTY_POOLSIZELOWWATERMARK);
		CIM_PropertyNameList.add(CIM_PROPERTY_POOLSIZELOWERBOUND);
		CIM_PropertyNameList.add(CIM_PROPERTY_POOLSIZEUPPERBOUND);
		CIM_PropertyNameList.add(CIM_PROPERTY_WAITINGTHREADCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_WAITINGTHREADCOUNTHIGHWATERMARK);
		CIM_PropertyNameList.add(CIM_PROPERTY_WAITINGTHREADCOUNTLOWWATERMARK);
		CIM_PropertyNameList.add(CIM_PROPERTY_WAITINGTHREADCOUNTLOWERBOUND);
		CIM_PropertyNameList.add(CIM_PROPERTY_WAITINGTHREADCOUNTUPPERBOUND);
				
		for (int i = 0; i < CIM_J2eeConnectionStats.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_J2eeConnectionStats.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLOSECOUNT)||
				((String)CIM_J2eeConnectionStats.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CREATECOUNT)||
				((String)CIM_J2eeConnectionStats.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FREEPOOLSIZE)||
				((String)CIM_J2eeConnectionStats.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FREEPOOLSIZEHIGHWATERMARK)||
				((String)CIM_J2eeConnectionStats.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FREEPOOLSIZELOWWATERMARK)||
				((String)CIM_J2eeConnectionStats.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FREEPOOLSIZELOWERBOUND)||
				((String)CIM_J2eeConnectionStats.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FREEPOOLSIZEUPPERBOUND)||
				((String)CIM_J2eeConnectionStats.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_POOLSIZE)||
				((String)CIM_J2eeConnectionStats.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_POOLSIZEHIGHWATERMARK)||
				((String)CIM_J2eeConnectionStats.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_POOLSIZELOWWATERMARK)||
				((String)CIM_J2eeConnectionStats.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_POOLSIZELOWERBOUND)||
				((String)CIM_J2eeConnectionStats.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_POOLSIZEUPPERBOUND)||
				((String)CIM_J2eeConnectionStats.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WAITINGTHREADCOUNT)||
				((String)CIM_J2eeConnectionStats.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WAITINGTHREADCOUNTHIGHWATERMARK)||
				((String)CIM_J2eeConnectionStats.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WAITINGTHREADCOUNTLOWWATERMARK)||
				((String)CIM_J2eeConnectionStats.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WAITINGTHREADCOUNTLOWERBOUND)||
				((String)CIM_J2eeConnectionStats.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WAITINGTHREADCOUNTUPPERBOUND)){
				continue;
			}
			
			CIM_J2eeConnectionPoolStats.CIM_PropertyNameList.add(CIM_J2eeConnectionStats.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLOSECOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CREATECOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FREEPOOLSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FREEPOOLSIZEHIGHWATERMARK, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FREEPOOLSIZELOWWATERMARK, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FREEPOOLSIZELOWERBOUND, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FREEPOOLSIZEUPPERBOUND, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_POOLSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_POOLSIZEHIGHWATERMARK, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_POOLSIZELOWWATERMARK, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_POOLSIZELOWERBOUND, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_POOLSIZEUPPERBOUND, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WAITINGTHREADCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WAITINGTHREADCOUNTHIGHWATERMARK, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WAITINGTHREADCOUNTLOWWATERMARK, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WAITINGTHREADCOUNTLOWERBOUND, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WAITINGTHREADCOUNTUPPERBOUND, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_J2eeConnectionStats.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_J2eeConnectionStats.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLOSECOUNT)||
				((CIMProperty)CIM_J2eeConnectionStats.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CREATECOUNT)||
				((CIMProperty)CIM_J2eeConnectionStats.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FREEPOOLSIZE)||
				((CIMProperty)CIM_J2eeConnectionStats.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FREEPOOLSIZEHIGHWATERMARK)||
				((CIMProperty)CIM_J2eeConnectionStats.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FREEPOOLSIZELOWWATERMARK)||
				((CIMProperty)CIM_J2eeConnectionStats.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FREEPOOLSIZELOWERBOUND)||
				((CIMProperty)CIM_J2eeConnectionStats.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FREEPOOLSIZEUPPERBOUND)||
				((CIMProperty)CIM_J2eeConnectionStats.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_POOLSIZE)||
				((CIMProperty)CIM_J2eeConnectionStats.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_POOLSIZEHIGHWATERMARK)||
				((CIMProperty)CIM_J2eeConnectionStats.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_POOLSIZELOWWATERMARK)||
				((CIMProperty)CIM_J2eeConnectionStats.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_POOLSIZELOWERBOUND)||
				((CIMProperty)CIM_J2eeConnectionStats.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_POOLSIZEUPPERBOUND)||
				((CIMProperty)CIM_J2eeConnectionStats.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WAITINGTHREADCOUNT)||
				((CIMProperty)CIM_J2eeConnectionStats.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WAITINGTHREADCOUNTHIGHWATERMARK)||
				((CIMProperty)CIM_J2eeConnectionStats.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WAITINGTHREADCOUNTLOWWATERMARK)||
				((CIMProperty)CIM_J2eeConnectionStats.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WAITINGTHREADCOUNTLOWERBOUND)||
				((CIMProperty)CIM_J2eeConnectionStats.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WAITINGTHREADCOUNTUPPERBOUND)){
				continue;
			}
			
			CIM_J2eeConnectionPoolStats.CIM_PropertyList.add(CIM_J2eeConnectionStats.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_J2eeConnectionStats.Java_Package_List.size(); i++) {
			if (((String)CIM_J2eeConnectionStats.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_J2eeConnectionStats.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_J2eeConnectionPoolStats() {

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
	public CIM_J2eeConnectionPoolStats(Vector keyProperties){ 
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
	public CIM_J2eeConnectionPoolStats(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		return validCimInstance;
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
	    
	    if (!(object instanceof CIM_J2eeConnectionPoolStats)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_J2eeConnectionPoolStats)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_J2eeConnectionPoolStats)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_J2eeConnectionPoolStats)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_J2eeConnectionPoolStats)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_J2eeConnectionPoolStats)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_J2eeConnectionPoolStats)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_J2eeConnectionPoolStats)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_J2eeConnectionPoolStats)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_J2eeConnectionPoolStats)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_J2eeJCAStats_CIM_J2eeJCAConnectionPoolss(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_J2EEJCACONNECTIONPOOLS, 
					CIM_J2eeJCAStats.CIM_CLASS_NAME, 
					"RelatedStats",
					"Stats",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_J2eeConnectionPoolStats.Java_Package_List.size(); i++) {
						if (!((String)(CIM_J2eeConnectionPoolStats.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_J2eeConnectionPoolStats.Java_Package_List.get(i))).endsWith(".")) {
							CIM_J2eeConnectionPoolStats.Java_Package_List.setElementAt((String)(CIM_J2eeConnectionPoolStats.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_J2eeConnectionPoolStats.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_J2eeJCAStats(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_J2eeJCAStats(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_J2eeJCAStats(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_J2eeJCAStats_CIM_J2eeJCAConnectionPools_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_J2EEJCACONNECTIONPOOLS, 
					CIM_J2eeJCAStats.CIM_CLASS_NAME, 
					"RelatedStats",
					"Stats");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_J2eeJCAStats.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_J2eeJDBCStats_CIM_J2eeJDBCConnectionPoolss(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_J2EEJDBCCONNECTIONPOOLS, 
					CIM_J2eeJDBCStats.CIM_CLASS_NAME, 
					"RelatedStats",
					"Stats",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_J2eeConnectionPoolStats.Java_Package_List.size(); i++) {
						if (!((String)(CIM_J2eeConnectionPoolStats.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_J2eeConnectionPoolStats.Java_Package_List.get(i))).endsWith(".")) {
							CIM_J2eeConnectionPoolStats.Java_Package_List.setElementAt((String)(CIM_J2eeConnectionPoolStats.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_J2eeConnectionPoolStats.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_J2eeJDBCStats(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_J2eeJDBCStats(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_J2eeJDBCStats(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_J2eeJDBCStats_CIM_J2eeJDBCConnectionPools_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_J2EEJDBCCONNECTIONPOOLS, 
					CIM_J2eeJDBCStats.CIM_CLASS_NAME, 
					"RelatedStats",
					"Stats");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_J2eeJDBCStats.CIM_CLASS_NAME)) {
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
	
	// Attribute CloseCount
	
	public UnsignedInt64 get_CloseCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_CLOSECOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_CLOSECOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_CLOSECOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CloseCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_CLOSECOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_CLOSECOUNT + " could not be found");
    		
		} else if (!CIM_J2eeConnectionPoolStatsHelper.isValid_CloseCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_CLOSECOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_CLOSECOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CreateCount
	
	public UnsignedInt64 get_CreateCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_CREATECOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_CREATECOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_CREATECOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CreateCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_CREATECOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_CREATECOUNT + " could not be found");
    		
		} else if (!CIM_J2eeConnectionPoolStatsHelper.isValid_CreateCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_CREATECOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_CREATECOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FreePoolSize
	
	public UnsignedInt64 get_FreePoolSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FreePoolSize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZE + " could not be found");
    		
		} else if (!CIM_J2eeConnectionPoolStatsHelper.isValid_FreePoolSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FreePoolSizeHighWaterMark
	
	public UnsignedInt64 get_FreePoolSizeHighWaterMark() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZEHIGHWATERMARK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZEHIGHWATERMARK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZEHIGHWATERMARK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FreePoolSizeHighWaterMark(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZEHIGHWATERMARK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZEHIGHWATERMARK + " could not be found");
    		
		} else if (!CIM_J2eeConnectionPoolStatsHelper.isValid_FreePoolSizeHighWaterMark(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZEHIGHWATERMARK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZEHIGHWATERMARK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FreePoolSizeLowWaterMark
	
	public UnsignedInt64 get_FreePoolSizeLowWaterMark() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZELOWWATERMARK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZELOWWATERMARK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZELOWWATERMARK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FreePoolSizeLowWaterMark(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZELOWWATERMARK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZELOWWATERMARK + " could not be found");
    		
		} else if (!CIM_J2eeConnectionPoolStatsHelper.isValid_FreePoolSizeLowWaterMark(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZELOWWATERMARK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZELOWWATERMARK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FreePoolSizeLowerBound
	
	public UnsignedInt64 get_FreePoolSizeLowerBound() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZELOWERBOUND);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZELOWERBOUND + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZELOWERBOUND + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FreePoolSizeLowerBound(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZELOWERBOUND);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZELOWERBOUND + " could not be found");
    		
		} else if (!CIM_J2eeConnectionPoolStatsHelper.isValid_FreePoolSizeLowerBound(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZELOWERBOUND);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZELOWERBOUND + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FreePoolSizeUpperBound
	
	public UnsignedInt64 get_FreePoolSizeUpperBound() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZEUPPERBOUND);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZEUPPERBOUND + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZEUPPERBOUND + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FreePoolSizeUpperBound(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZEUPPERBOUND);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZEUPPERBOUND + " could not be found");
    		
		} else if (!CIM_J2eeConnectionPoolStatsHelper.isValid_FreePoolSizeUpperBound(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZEUPPERBOUND);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_FREEPOOLSIZEUPPERBOUND + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PoolSize
	
	public UnsignedInt64 get_PoolSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PoolSize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZE + " could not be found");
    		
		} else if (!CIM_J2eeConnectionPoolStatsHelper.isValid_PoolSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PoolSizeHighWaterMark
	
	public UnsignedInt64 get_PoolSizeHighWaterMark() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZEHIGHWATERMARK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZEHIGHWATERMARK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZEHIGHWATERMARK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PoolSizeHighWaterMark(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZEHIGHWATERMARK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZEHIGHWATERMARK + " could not be found");
    		
		} else if (!CIM_J2eeConnectionPoolStatsHelper.isValid_PoolSizeHighWaterMark(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZEHIGHWATERMARK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZEHIGHWATERMARK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PoolSizeLowWaterMark
	
	public UnsignedInt64 get_PoolSizeLowWaterMark() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZELOWWATERMARK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZELOWWATERMARK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZELOWWATERMARK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PoolSizeLowWaterMark(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZELOWWATERMARK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZELOWWATERMARK + " could not be found");
    		
		} else if (!CIM_J2eeConnectionPoolStatsHelper.isValid_PoolSizeLowWaterMark(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZELOWWATERMARK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZELOWWATERMARK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PoolSizeLowerBound
	
	public UnsignedInt64 get_PoolSizeLowerBound() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZELOWERBOUND);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZELOWERBOUND + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZELOWERBOUND + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PoolSizeLowerBound(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZELOWERBOUND);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZELOWERBOUND + " could not be found");
    		
		} else if (!CIM_J2eeConnectionPoolStatsHelper.isValid_PoolSizeLowerBound(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZELOWERBOUND);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZELOWERBOUND + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PoolSizeUpperBound
	
	public UnsignedInt64 get_PoolSizeUpperBound() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZEUPPERBOUND);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZEUPPERBOUND + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZEUPPERBOUND + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PoolSizeUpperBound(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZEUPPERBOUND);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZEUPPERBOUND + " could not be found");
    		
		} else if (!CIM_J2eeConnectionPoolStatsHelper.isValid_PoolSizeUpperBound(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZEUPPERBOUND);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_POOLSIZEUPPERBOUND + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute WaitingThreadCount
	
	public UnsignedInt64 get_WaitingThreadCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_WaitingThreadCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNT + " could not be found");
    		
		} else if (!CIM_J2eeConnectionPoolStatsHelper.isValid_WaitingThreadCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute WaitingThreadCountHighWaterMark
	
	public UnsignedInt64 get_WaitingThreadCountHighWaterMark() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTHIGHWATERMARK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTHIGHWATERMARK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTHIGHWATERMARK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_WaitingThreadCountHighWaterMark(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTHIGHWATERMARK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTHIGHWATERMARK + " could not be found");
    		
		} else if (!CIM_J2eeConnectionPoolStatsHelper.isValid_WaitingThreadCountHighWaterMark(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTHIGHWATERMARK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTHIGHWATERMARK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute WaitingThreadCountLowWaterMark
	
	public UnsignedInt64 get_WaitingThreadCountLowWaterMark() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTLOWWATERMARK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTLOWWATERMARK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTLOWWATERMARK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_WaitingThreadCountLowWaterMark(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTLOWWATERMARK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTLOWWATERMARK + " could not be found");
    		
		} else if (!CIM_J2eeConnectionPoolStatsHelper.isValid_WaitingThreadCountLowWaterMark(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTLOWWATERMARK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTLOWWATERMARK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute WaitingThreadCountLowerBound
	
	public UnsignedInt64 get_WaitingThreadCountLowerBound() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTLOWERBOUND);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTLOWERBOUND + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTLOWERBOUND + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_WaitingThreadCountLowerBound(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTLOWERBOUND);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTLOWERBOUND + " could not be found");
    		
		} else if (!CIM_J2eeConnectionPoolStatsHelper.isValid_WaitingThreadCountLowerBound(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTLOWERBOUND);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTLOWERBOUND + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute WaitingThreadCountUpperBound
	
	public UnsignedInt64 get_WaitingThreadCountUpperBound() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTUPPERBOUND);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTUPPERBOUND + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTUPPERBOUND + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_WaitingThreadCountUpperBound(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTUPPERBOUND);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTUPPERBOUND + " could not be found");
    		
		} else if (!CIM_J2eeConnectionPoolStatsHelper.isValid_WaitingThreadCountUpperBound(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTUPPERBOUND);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionPoolStats.CIM_PROPERTY_WAITINGTHREADCOUNTUPPERBOUND + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
