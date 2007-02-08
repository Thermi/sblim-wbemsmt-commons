/** 
 * CIM_J2eeConnectionStats.java
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
 * Description: The J2eeConnectionStats class defines the performance statistics that are provided by a connection. JCA and JDBC connection statistics are represented by this class. The semantics are determined by the class to which the ConnectionStats instance is associated via the CIM_ElementStatisticalData association.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Enumeration;
import java.lang.reflect.Constructor;
import org.sblim.wbem.client.*;



public class CIM_J2eeConnectionStats extends CIM_J2eeStatistic  {
	
	public final static String CIM_CLASS_NAME = "CIM_J2eeConnectionStats";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_J2EEJCANONPOOLEDCONNECTIONS = "CIM_J2eeJCANonpooledConnections";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_J2EEJDBCNONPOOLEDCONNECTIONS = "CIM_J2eeJDBCNonpooledConnections";
	
	
	/**
	*	The time spent using a connection. The time is represented as a datetime interval.
	*/
	public final static String CIM_PROPERTY_USETIME = "UseTime"; //$NON-NLS-1$
	/**
	*	The maximum amount of time spent using a connection since the beginning of this measurement. The time is represented as a datetime interval.
	*/
	public final static String CIM_PROPERTY_USETIMEMAXTIME = "UseTimeMaxTime"; //$NON-NLS-1$
	/**
	*	The minimum amount of time spent using a connection since the beginning of this measurement. The time is represented as a datetime interval.
	*/
	public final static String CIM_PROPERTY_USETIMEMINTIME = "UseTimeMinTime"; //$NON-NLS-1$
	/**
	*	The total amount of time spent using a connection since the beginning of this measurement. Dividing UseTimeTotalTime by UseTime will provide the average time spent using a connection. The time is represented as a datetime interval.
	*/
	public final static String CIM_PROPERTY_USETIMETOTALTIME = "UseTimeTotalTime"; //$NON-NLS-1$
	/**
	*	The time spent waiting for a connection to be available. The time is represented as a datetime interval.
	*/
	public final static String CIM_PROPERTY_WAITTIME = "WaitTime"; //$NON-NLS-1$
	/**
	*	The maximum amount of time spent waiting for a connection to be available since the beginning of this measurement. The time is represented as a datetime interval.
	*/
	public final static String CIM_PROPERTY_WAITTIMEMAXTIME = "WaitTimeMaxTime"; //$NON-NLS-1$
	/**
	*	The minimum amount of time spent waiting for a connection to be available since the beginning of this measurement. The time is represented as a datetime interval.
	*/
	public final static String CIM_PROPERTY_WAITTIMEMINTIME = "WaitTimeMinTime"; //$NON-NLS-1$
	/**
	*	The total amount of time spent waiting for a connection to be available since the beginning of this measurement. Dividing WaitTimeTotalTime by WaitTime will provide the average time spent waiting for a connection. The time is represented as a datetime interval.
	*/
	public final static String CIM_PROPERTY_WAITTIMETOTALTIME = "WaitTimeTotalTime"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_USETIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_USETIMEMAXTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_USETIMEMINTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_USETIMETOTALTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_WAITTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_WAITTIMEMAXTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_WAITTIMEMINTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_WAITTIMETOTALTIME);
				
		for (int i = 0; i < CIM_J2eeStatistic.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_USETIME)||
				((String)CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_USETIMEMAXTIME)||
				((String)CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_USETIMEMINTIME)||
				((String)CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_USETIMETOTALTIME)||
				((String)CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WAITTIME)||
				((String)CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WAITTIMEMAXTIME)||
				((String)CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WAITTIMEMINTIME)||
				((String)CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WAITTIMETOTALTIME)){
				continue;
			}
			
			CIM_J2eeConnectionStats.CIM_PropertyNameList.add(CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_USETIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_USETIMEMAXTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_USETIMEMINTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_USETIMETOTALTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WAITTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WAITTIMEMAXTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WAITTIMEMINTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WAITTIMETOTALTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
				
		for (int i = 0; i < CIM_J2eeStatistic.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_J2eeStatistic.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_USETIME)||
				((CIMProperty)CIM_J2eeStatistic.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_USETIMEMAXTIME)||
				((CIMProperty)CIM_J2eeStatistic.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_USETIMEMINTIME)||
				((CIMProperty)CIM_J2eeStatistic.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_USETIMETOTALTIME)||
				((CIMProperty)CIM_J2eeStatistic.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WAITTIME)||
				((CIMProperty)CIM_J2eeStatistic.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WAITTIMEMAXTIME)||
				((CIMProperty)CIM_J2eeStatistic.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WAITTIMEMINTIME)||
				((CIMProperty)CIM_J2eeStatistic.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WAITTIMETOTALTIME)){
				continue;
			}
			
			CIM_J2eeConnectionStats.CIM_PropertyList.add(CIM_J2eeStatistic.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_J2eeStatistic.Java_Package_List.size(); i++) {
			if (((String)CIM_J2eeStatistic.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
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
	public CIM_J2eeConnectionStats() {

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
	public CIM_J2eeConnectionStats(Vector keyProperties){ 
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
	public CIM_J2eeConnectionStats(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_J2eeConnectionStats)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_J2eeConnectionStats)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_J2eeConnectionStats)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_J2eeConnectionStats)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_J2eeConnectionStats)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_J2eeConnectionStats)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_J2eeConnectionStats)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_J2eeConnectionStats)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_J2eeConnectionStats)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_J2eeConnectionStats)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_J2eeJCAStats_CIM_J2eeJCANonpooledConnectionss(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_J2EEJCANONPOOLEDCONNECTIONS, 
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
				
					for (int i = 0; clazz == null && i < CIM_J2eeConnectionStats.Java_Package_List.size(); i++) {
						if (!((String)(CIM_J2eeConnectionStats.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_J2eeConnectionStats.Java_Package_List.get(i))).endsWith(".")) {
							CIM_J2eeConnectionStats.Java_Package_List.setElementAt((String)(CIM_J2eeConnectionStats.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_J2eeConnectionStats.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_J2eeJCAStats_CIM_J2eeJCANonpooledConnections_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_J2EEJCANONPOOLEDCONNECTIONS, 
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

	public ArrayList getAssociated_CIM_J2eeJDBCStats_CIM_J2eeJDBCNonpooledConnectionss(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_J2EEJDBCNONPOOLEDCONNECTIONS, 
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
				
					for (int i = 0; clazz == null && i < CIM_J2eeConnectionStats.Java_Package_List.size(); i++) {
						if (!((String)(CIM_J2eeConnectionStats.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_J2eeConnectionStats.Java_Package_List.get(i))).endsWith(".")) {
							CIM_J2eeConnectionStats.Java_Package_List.setElementAt((String)(CIM_J2eeConnectionStats.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_J2eeConnectionStats.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_J2eeJDBCStats_CIM_J2eeJDBCNonpooledConnections_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_J2EEJDBCNONPOOLEDCONNECTIONS, 
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
	
	// Attribute UseTime
	
	public Calendar get_UseTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_J2eeConnectionStats.CIM_PROPERTY_USETIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_USETIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_USETIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_UseTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionStats.CIM_PROPERTY_USETIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_USETIME + " could not be found");
    		
		} else if (!CIM_J2eeConnectionStatsHelper.isValid_UseTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeConnectionStats.CIM_PROPERTY_USETIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_USETIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute UseTimeMaxTime
	
	public Calendar get_UseTimeMaxTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_J2eeConnectionStats.CIM_PROPERTY_USETIMEMAXTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_USETIMEMAXTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_USETIMEMAXTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_UseTimeMaxTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionStats.CIM_PROPERTY_USETIMEMAXTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_USETIMEMAXTIME + " could not be found");
    		
		} else if (!CIM_J2eeConnectionStatsHelper.isValid_UseTimeMaxTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeConnectionStats.CIM_PROPERTY_USETIMEMAXTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_USETIMEMAXTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute UseTimeMinTime
	
	public Calendar get_UseTimeMinTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_J2eeConnectionStats.CIM_PROPERTY_USETIMEMINTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_USETIMEMINTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_USETIMEMINTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_UseTimeMinTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionStats.CIM_PROPERTY_USETIMEMINTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_USETIMEMINTIME + " could not be found");
    		
		} else if (!CIM_J2eeConnectionStatsHelper.isValid_UseTimeMinTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeConnectionStats.CIM_PROPERTY_USETIMEMINTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_USETIMEMINTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute UseTimeTotalTime
	
	public Calendar get_UseTimeTotalTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_J2eeConnectionStats.CIM_PROPERTY_USETIMETOTALTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_USETIMETOTALTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_USETIMETOTALTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_UseTimeTotalTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionStats.CIM_PROPERTY_USETIMETOTALTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_USETIMETOTALTIME + " could not be found");
    		
		} else if (!CIM_J2eeConnectionStatsHelper.isValid_UseTimeTotalTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeConnectionStats.CIM_PROPERTY_USETIMETOTALTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_USETIMETOTALTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute WaitTime
	
	public Calendar get_WaitTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_WaitTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIME + " could not be found");
    		
		} else if (!CIM_J2eeConnectionStatsHelper.isValid_WaitTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute WaitTimeMaxTime
	
	public Calendar get_WaitTimeMaxTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIMEMAXTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIMEMAXTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIMEMAXTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_WaitTimeMaxTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIMEMAXTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIMEMAXTIME + " could not be found");
    		
		} else if (!CIM_J2eeConnectionStatsHelper.isValid_WaitTimeMaxTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIMEMAXTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIMEMAXTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute WaitTimeMinTime
	
	public Calendar get_WaitTimeMinTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIMEMINTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIMEMINTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIMEMINTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_WaitTimeMinTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIMEMINTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIMEMINTIME + " could not be found");
    		
		} else if (!CIM_J2eeConnectionStatsHelper.isValid_WaitTimeMinTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIMEMINTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIMEMINTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute WaitTimeTotalTime
	
	public Calendar get_WaitTimeTotalTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIMETOTALTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIMETOTALTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIMETOTALTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_WaitTimeTotalTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIMETOTALTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIMETOTALTIME + " could not be found");
    		
		} else if (!CIM_J2eeConnectionStatsHelper.isValid_WaitTimeTotalTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIMETOTALTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeConnectionStats.CIM_PROPERTY_WAITTIMETOTALTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
