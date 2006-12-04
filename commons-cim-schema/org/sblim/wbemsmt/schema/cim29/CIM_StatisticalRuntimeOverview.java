/** 
 * CIM_StatisticalRuntimeOverview.java
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
 * Description: This class represents statistical data and metrics that characterize the application as a whole. It exists only once per application system instance and provides primarily raw data for the monitoring of service levels. Therefore, the metrics presented are only a summary or overview of the application system behavior at a certain point of time. Instances are only available if the concerned application is running. Therefore, an instance of ApplicationSystem MUST exist when the instance of this class is created.
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



public class CIM_StatisticalRuntimeOverview extends CIM_StatisticalData  {
	
	public final static String CIM_CLASS_NAME = "CIM_StatisticalRuntimeOverview";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDAPPSYSTEMOVERVIEWSTATISTICS = "CIM_AssociatedAppSystemOverviewStatistics";
	
	
	/**
	*	The average response time is the mean of a number of requests captured between StatisticTime and a close point in time in the past. This interval or duration, that the average depends on, is defined by the underlying implementation such that it still has a reasonable proximity to one point in time. The term average is not focused on averaging a number of requests but averaging a period of time. Therefore, the average does not relate to more than a couple of minutes and, consequently, AverageResponseTime has the notion of the response time at the point in time of StatisticTime. If the interval is too great, AverageResponseTime becomes meaningless for monitoring. If no response time can be determined, the value is 0.
	*/
	public final static String CIM_PROPERTY_AVERAGERESPONSETIME = "AverageResponseTime"; //$NON-NLS-1$
	/**
	*	The point in time (date and time) when the most recent inbound activity was observed for the application. A value of all zeros indicates that no inbound activity has taken place since the application was started.
	*/
	public final static String CIM_PROPERTY_LASTACTIVITY = "LastActivity"; //$NON-NLS-1$
	/**
	*	The number of active requestors in the application system. It may differ from the number of active requests (greater if a requestor has issued multiple requests, smaller if some of the requestors have no request running at the considered point in time). Very often it reflects the number of user logged on to the application system or the number of sessions being served by the system. 
Note that the semantics of a requestor are general enough to characterize the entire application system.
	*/
	public final static String CIM_PROPERTY_NUMBEROFACTIVEREQUESTORS = "NumberOfActiveRequestors"; //$NON-NLS-1$
	/**
	*	The number of requests currently being served. This is not the count of open connections! Very often it reflects the number of current user requests. Note that the semantics of a request are general enough to characterize the entire application system.
	*/
	public final static String CIM_PROPERTY_NUMBEROFACTIVEREQUESTS = "NumberOfActiveRequests"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_AVERAGERESPONSETIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_LASTACTIVITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_NUMBEROFACTIVEREQUESTORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_NUMBEROFACTIVEREQUESTS);
				
		for (int i = 0; i < CIM_StatisticalData.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AVERAGERESPONSETIME)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LASTACTIVITY)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NUMBEROFACTIVEREQUESTORS)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NUMBEROFACTIVEREQUESTS)){
				continue;
			}
			
			CIM_StatisticalRuntimeOverview.CIM_PropertyNameList.add(CIM_StatisticalData.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AVERAGERESPONSETIME, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LASTACTIVITY, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NUMBEROFACTIVEREQUESTORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NUMBEROFACTIVEREQUESTS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
				
		for (int i = 0; i < CIM_StatisticalData.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AVERAGERESPONSETIME)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LASTACTIVITY)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NUMBEROFACTIVEREQUESTORS)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NUMBEROFACTIVEREQUESTS)){
				continue;
			}
			
			CIM_StatisticalRuntimeOverview.CIM_PropertyList.add(CIM_StatisticalData.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_StatisticalData.Java_Package_List.size(); i++) {
			if (((String)CIM_StatisticalData.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_StatisticalData.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_StatisticalRuntimeOverview() {

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
	public CIM_StatisticalRuntimeOverview(Vector keyProperties){ 
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
	public CIM_StatisticalRuntimeOverview(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_StatisticalRuntimeOverview)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_StatisticalRuntimeOverview)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_StatisticalRuntimeOverview)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_StatisticalRuntimeOverview)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_StatisticalRuntimeOverview)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_StatisticalRuntimeOverview)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_StatisticalRuntimeOverview)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_StatisticalRuntimeOverview)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_StatisticalRuntimeOverview)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_StatisticalRuntimeOverview)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_ApplicationSystem_CIM_AssociatedAppSystemOverviewStatisticss(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDAPPSYSTEMOVERVIEWSTATISTICS, 
					CIM_ApplicationSystem.CIM_CLASS_NAME, 
					"Stats",
					"ManagedElement",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_StatisticalRuntimeOverview.Java_Package_List.size(); i++) {
						if (!((String)(CIM_StatisticalRuntimeOverview.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_StatisticalRuntimeOverview.Java_Package_List.get(i))).endsWith(".")) {
							CIM_StatisticalRuntimeOverview.Java_Package_List.setElementAt((String)(CIM_StatisticalRuntimeOverview.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_StatisticalRuntimeOverview.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ApplicationSystem(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_ApplicationSystem(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ApplicationSystem(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_ApplicationSystem_CIM_AssociatedAppSystemOverviewStatistics_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDAPPSYSTEMOVERVIEWSTATISTICS, 
					CIM_ApplicationSystem.CIM_CLASS_NAME, 
					"Stats",
					"ManagedElement");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ApplicationSystem.CIM_CLASS_NAME)) {
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
	
	// Attribute AverageResponseTime
	
	public UnsignedInt32 get_AverageResponseTime() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StatisticalRuntimeOverview.CIM_PROPERTY_AVERAGERESPONSETIME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StatisticalRuntimeOverview.CIM_PROPERTY_AVERAGERESPONSETIME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StatisticalRuntimeOverview.CIM_PROPERTY_AVERAGERESPONSETIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AverageResponseTime(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StatisticalRuntimeOverview.CIM_PROPERTY_AVERAGERESPONSETIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StatisticalRuntimeOverview.CIM_PROPERTY_AVERAGERESPONSETIME + " could not be found");
    		
		} else if (!CIM_StatisticalRuntimeOverviewHelper.isValid_AverageResponseTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StatisticalRuntimeOverview.CIM_PROPERTY_AVERAGERESPONSETIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StatisticalRuntimeOverview.CIM_PROPERTY_AVERAGERESPONSETIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LastActivity
	
	public Calendar get_LastActivity() {

		CIMProperty property = this.cimInstance.getProperty(CIM_StatisticalRuntimeOverview.CIM_PROPERTY_LASTACTIVITY);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StatisticalRuntimeOverview.CIM_PROPERTY_LASTACTIVITY + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StatisticalRuntimeOverview.CIM_PROPERTY_LASTACTIVITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_LastActivity(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StatisticalRuntimeOverview.CIM_PROPERTY_LASTACTIVITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StatisticalRuntimeOverview.CIM_PROPERTY_LASTACTIVITY + " could not be found");
    		
		} else if (!CIM_StatisticalRuntimeOverviewHelper.isValid_LastActivity(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StatisticalRuntimeOverview.CIM_PROPERTY_LASTACTIVITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StatisticalRuntimeOverview.CIM_PROPERTY_LASTACTIVITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute NumberOfActiveRequestors
	
	public UnsignedInt32 get_NumberOfActiveRequestors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StatisticalRuntimeOverview.CIM_PROPERTY_NUMBEROFACTIVEREQUESTORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StatisticalRuntimeOverview.CIM_PROPERTY_NUMBEROFACTIVEREQUESTORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StatisticalRuntimeOverview.CIM_PROPERTY_NUMBEROFACTIVEREQUESTORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NumberOfActiveRequestors(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StatisticalRuntimeOverview.CIM_PROPERTY_NUMBEROFACTIVEREQUESTORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StatisticalRuntimeOverview.CIM_PROPERTY_NUMBEROFACTIVEREQUESTORS + " could not be found");
    		
		} else if (!CIM_StatisticalRuntimeOverviewHelper.isValid_NumberOfActiveRequestors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StatisticalRuntimeOverview.CIM_PROPERTY_NUMBEROFACTIVEREQUESTORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StatisticalRuntimeOverview.CIM_PROPERTY_NUMBEROFACTIVEREQUESTORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NumberOfActiveRequests
	
	public UnsignedInt32 get_NumberOfActiveRequests() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StatisticalRuntimeOverview.CIM_PROPERTY_NUMBEROFACTIVEREQUESTS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StatisticalRuntimeOverview.CIM_PROPERTY_NUMBEROFACTIVEREQUESTS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StatisticalRuntimeOverview.CIM_PROPERTY_NUMBEROFACTIVEREQUESTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NumberOfActiveRequests(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StatisticalRuntimeOverview.CIM_PROPERTY_NUMBEROFACTIVEREQUESTS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StatisticalRuntimeOverview.CIM_PROPERTY_NUMBEROFACTIVEREQUESTS + " could not be found");
    		
		} else if (!CIM_StatisticalRuntimeOverviewHelper.isValid_NumberOfActiveRequests(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StatisticalRuntimeOverview.CIM_PROPERTY_NUMBEROFACTIVEREQUESTS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StatisticalRuntimeOverview.CIM_PROPERTY_NUMBEROFACTIVEREQUESTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
