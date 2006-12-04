/** 
 * CIM_BaseMetricDefinition.java
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
 * Description: CIM_BaseMetricDefinition represents the definitional aspects of a metric, i.e., a definition template containing meta data about a new metric. Since CIM_BaseMetricDefinition does not capture metric instance information, it does not contain the value of the metric. The associated class CIM_BaseMetricValue holds the metric value and encapsulates its runtime behavior. The purpose of CIM_BaseMetricDefinition is to provide a convenient mechanism for introducing a new metric definition at runtime and capturing its instance values in a separate class. This mechanism is targeted specifically at CIM users who would like to enhance existing CIM schemas by introducing domain-specific metrics that are not captured in the existing CIM schemas. In addition, vendors of managed resources may make use of this mechanism if a small subset of a potentially large and heterogeneous amount of performance-related data needs to be exposed, based on the context in which the data is captured. Additional meta data for a metric can be provided by subclassing from CIM_BaseMetricDefinition. The CIM_BaseMetricDefinition should be associated with the CIM_ManagedElement(s) to which it applies.
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



public class CIM_BaseMetricDefinition extends CIM_ManagedElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_BaseMetricDefinition";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.9.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_METRICDEFFORME = "CIM_MetricDefForME";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_METRICINSTANCE = "CIM_MetricInstance";
	
	
	/**
	*	Defines one or more strings that can be used to refine (break down) queries against the BaseMetricValues along a certain dimension. An example is a transaction name, allowing the break down of the total value for all transactions into a set of values, one for each transaction name. Other examples might be application system or user group name. The strings are free format and should be meaningful to the end users of the metric data. The strings indicate which break down dimensions are supported for this metric definition, by the underlying instrumentation.
	*/
	public final static String CIM_PROPERTY_BREAKDOWNDIMENSIONS = "BreakdownDimensions"; //$NON-NLS-1$
	/**
	*	An enumerated value that describes the characteristics of the metric, for purposes of performing calculations. The property can take one of the following values: 
1="Non-calculable" -> a string. Arithmetic makes no sense. 
2="Summable" -> It is reasonable to sum this value over many instances of e.g., UnitOfWork, such as the number of files processed in a backup job. For example, if each backup job is a UnitOfWork, and each job backs up 27,000 files on average, then it makes sense to say that 100 backup jobs processed 2,700,000 files. 
3="Non-summable" -> It does not make sense to sum this value over many instances of UnitOfWork. An example would be a metric that measures the queue length when a job arrives at a server. If each job is a UnitOfWork, and the average queue length when each job arrives is 33, it does not make sense to say that the queue length for 100 jobs is 3300. It does make sense to say that the mean is 33.
	*/
	public final static String CIM_PROPERTY_CALCULABLE = "Calculable"; //$NON-NLS-1$
	/**
	*	ChangeType indicates how the metric value changes, in the form of typical combinations of finer grain attributes such as direction change, minimum and maximum values, and wrapping semantics. 
0="Unknown": The metric designer did not qualify the ChangeType. 
2="N/A": If the "IsContinuous" property is "false", ChangeType does not make sense and MUST be is set to "N/A". 
3="Counter": The metric is a counter metric. These have non-negative integer values which increase monotonically until reaching the maximum representable number and then wrap around and start increasing from 0. Such counters, also known as rollover counters, can be used for instance to count the number of network errors or the number of transactions processed. The only way for a client application to keep track of wrap arounds is to retrieve the value of the counter in appropriately short intervals. 
4="Gauge": The metric is a gauge metric. These have integer or float values that can increase and decrease arbitrarily. A gauge MUST NOT wrap when reaching the minimum or maximum representable number, instead, the value "sticks" at that number. Minimum or maximum values inside of the representable value range at which the metric value "sticks", may or may not be defined. 
Vendors may extend this property in the vendor reserved range.
	*/
	public final static String CIM_PROPERTY_CHANGETYPE = "ChangeType"; //$NON-NLS-1$
	/**
	*	The data type of the metric. For example, "boolean" (value=1) or "datetime" (=3) may be specified. These types represent the datatypes defined for CIM.
	*/
	public final static String CIM_PROPERTY_DATATYPE = "DataType"; //$NON-NLS-1$
	/**
	*	GatheringType indicates how the metric values are gathered by the underlying instrumentation. This allows the client application to choose the right metric for the purpose. 
0="Unknown": Indicates that the GatheringType is not known. 
2="OnChange": Indicates that the CIM metric values get updated immediately when the values inside of the measured resource change. The values of OnChange metrics truly reflect the current situation within the resource at any time. An example is the number of logged on users that gets updated immediately as users log on and off. 
3="Periodic": Indicates that the CIM metric values get updated periodically. For instance, to a client application, a metric value applying to the current time will appear constant during each gathering interval, and then jumps to the new value at the end of each gathering interval. 
4="OnRequest": Indicates that the CIM metric value is determined each time a client application reads it. The values of OnRequest metrics truly return the current situation within the resource if somebody asks for it. However, they do not change "unobserved", and therefore subscribing for value changes of OnRequest metrics is NOT RECOMMENDED.
	*/
	public final static String CIM_PROPERTY_GATHERINGTYPE = "GatheringType"; //$NON-NLS-1$
	/**
	*	A string that uniquely identifies the metric definition. The use of OSF UUID/GUIDs is recommended.
	*/
	public final static String CIM_PROPERTY_ID = "Id"; //$NON-NLS-1$
	/**
	*	IsContinuous indicates whether or not the metric value is continuous or scalar. Performance metrics are an example of a linear metric. Examples of non-linear metrics include error codes or operational states. Continuous metrics can be compared using the "greater than" relation.
	*/
	public final static String CIM_PROPERTY_ISCONTINUOUS = "IsContinuous"; //$NON-NLS-1$
	/**
	*	The name of the metric. This name does not have to be unique, but should be descriptive and may contain blanks.
	*/
	public final static String CIM_PROPERTY_NAME = "Name"; //$NON-NLS-1$
	/**
	*	TimeScope indicates the time scope to which the metric value applies. 
0="Unknown" indicates the time scope was not qualified by the metric designer, or is unknown to the provider. 
2="Point" indicates that the metric applies to a point in time. On the corresponding BaseMetricValue instances, TimeStamp specifies the point in time and Duration is always 0. 
3="Interval" indicates that the metric applies to a time interval. On the corresponding BaseMetricValue instances, TimeStamp specifies the end of the time interval and Duration specifies its duration. 
4="StartupInterval" indicates that the metric applies to a time interval that began at the startup of the measured resource (i.e. the ManagedElement associated by MetricDefForMe). On the corresponding BaseMetricValue instances, TimeStamp specifies the end of the time interval. If Duration is 0, this indicates that the startup time of the measured resource is unknown. Else, Duration specifies the duration between startup of the resource and TimeStamp.
	*/
	public final static String CIM_PROPERTY_TIMESCOPE = "TimeScope"; //$NON-NLS-1$
	/**
	*	Identifies the specific units of a value. Examples are Bytes, Packets, Jobs, Files, Milliseconds, and Amps.
	*/
	public final static String CIM_PROPERTY_UNITS = "Units"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_BREAKDOWNDIMENSIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CALCULABLE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CHANGETYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_DATATYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_GATHERINGTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ID);
		CIM_PropertyNameList.add(CIM_PROPERTY_ISCONTINUOUS);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMESCOPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_UNITS);
				
		for (int i = 0; i < CIM_ManagedElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BREAKDOWNDIMENSIONS)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CALCULABLE)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CHANGETYPE)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DATATYPE)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_GATHERINGTYPE)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ID)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ISCONTINUOUS)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAME)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TIMESCOPE)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UNITS)){
				continue;
			}
			
			CIM_BaseMetricDefinition.CIM_PropertyNameList.add(CIM_ManagedElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BREAKDOWNDIMENSIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CALCULABLE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CHANGETYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DATATYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_GATHERINGTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ISCONTINUOUS, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMESCOPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UNITS, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_ManagedElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BREAKDOWNDIMENSIONS)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CALCULABLE)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CHANGETYPE)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DATATYPE)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_GATHERINGTYPE)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ID)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ISCONTINUOUS)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAME)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TIMESCOPE)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UNITS)){
				continue;
			}
			
			CIM_BaseMetricDefinition.CIM_PropertyList.add(CIM_ManagedElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_ManagedElement.Java_Package_List.size(); i++) {
			if (((String)CIM_ManagedElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_ManagedElement.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_CALCULABLE = {"Non-calculable","Summable","Non-summable"};
	public final static String[] CIM_VALUEMAP_CHANGETYPE = {"Unknown","N/A","Counter","Gauge","DMTF Reserved","Vendor Reserved"};
	public final static String[] CIM_VALUEMAP_DATATYPE = {"boolean","char16","datetime","real32","real64","sint16","sint32","sint64","sint8","string","uint16","uint32","uint64","uint8"};
	public final static String[] CIM_VALUEMAP_GATHERINGTYPE = {"Unknown","OnChange","Periodic","OnRequest","DMTF Reserved","Vendor Reserved"};
	public final static String[] CIM_VALUEMAP_TIMESCOPE = {"Unknown","Point","Interval","StartupInterval","DMTF Reserved","Vendor Reserved"};
	
	
	public final static int CALCULABLE_NON_CALCULABLE = 1;
	public final static int CALCULABLE_SUMMABLE = 2;
	public final static int CALCULABLE_NON_SUMMABLE = 3;
	
	public final static String CHANGETYPE_UNKNOWN = "0";
	public final static String CHANGETYPE_N_A = "2";
	public final static String CHANGETYPE_COUNTER = "3";
	public final static String CHANGETYPE_GAUGE = "4";
	public final static String CHANGETYPE_DMTFRESERVED = "5..32767";
	public final static String CHANGETYPE_VENDORRESERVED = "32768..65535";
	
	public final static int DATATYPE_BOOLEAN = 1;
	public final static int DATATYPE_CHAR16 = 2;
	public final static int DATATYPE_DATETIME = 3;
	public final static int DATATYPE_REAL32 = 4;
	public final static int DATATYPE_REAL64 = 5;
	public final static int DATATYPE_SINT16 = 6;
	public final static int DATATYPE_SINT32 = 7;
	public final static int DATATYPE_SINT64 = 8;
	public final static int DATATYPE_SINT8 = 9;
	public final static int DATATYPE_STRING = 10;
	public final static int DATATYPE_UINT16 = 11;
	public final static int DATATYPE_UINT32 = 12;
	public final static int DATATYPE_UINT64 = 13;
	public final static int DATATYPE_UINT8 = 14;
	
	public final static String GATHERINGTYPE_UNKNOWN = "0";
	public final static String GATHERINGTYPE_ONCHANGE = "2";
	public final static String GATHERINGTYPE_PERIODIC = "3";
	public final static String GATHERINGTYPE_ONREQUEST = "4";
	public final static String GATHERINGTYPE_DMTFRESERVED = "5..32767";
	public final static String GATHERINGTYPE_VENDORRESERVED = "32768..65535";
	
	public final static String TIMESCOPE_UNKNOWN = "0";
	public final static String TIMESCOPE_POINT = "2";
	public final static String TIMESCOPE_INTERVAL = "3";
	public final static String TIMESCOPE_STARTUPINTERVAL = "4";
	public final static String TIMESCOPE_DMTFRESERVED = "5..32767";
	public final static String TIMESCOPE_VENDORRESERVED = "32768..65535";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_BaseMetricDefinition() {

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
	public CIM_BaseMetricDefinition(Vector keyProperties){ 
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
	public CIM_BaseMetricDefinition(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_Id = this.cimInstance.getProperty(CIM_PROPERTY_ID);
		
		if (CIMProperty_Id == null || CIMProperty_Id.getValue().isEmpty() || CIMProperty_Id.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_ID, "Key"});
			result = false;
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
	    
	    if (!(object instanceof CIM_BaseMetricDefinition)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_BaseMetricDefinition)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_BaseMetricDefinition)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_BaseMetricDefinition)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_BaseMetricDefinition)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_BaseMetricDefinition)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_BaseMetricDefinition)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_BaseMetricDefinition)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_BaseMetricDefinition)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_BaseMetricDefinition)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_ManagedElement_CIM_MetricDefForMEs(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_METRICDEFFORME, 
					CIM_ManagedElement.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_BaseMetricDefinition.Java_Package_List.size(); i++) {
						if (!((String)(CIM_BaseMetricDefinition.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_BaseMetricDefinition.Java_Package_List.get(i))).endsWith(".")) {
							CIM_BaseMetricDefinition.Java_Package_List.setElementAt((String)(CIM_BaseMetricDefinition.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_BaseMetricDefinition.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ManagedElement(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_ManagedElement(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ManagedElement(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_ManagedElement_CIM_MetricDefForME_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_METRICDEFFORME, 
					CIM_ManagedElement.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ManagedElement.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_BaseMetricValue_CIM_MetricInstances(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_METRICINSTANCE, 
					CIM_BaseMetricValue.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_BaseMetricDefinition.Java_Package_List.size(); i++) {
						if (!((String)(CIM_BaseMetricDefinition.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_BaseMetricDefinition.Java_Package_List.get(i))).endsWith(".")) {
							CIM_BaseMetricDefinition.Java_Package_List.setElementAt((String)(CIM_BaseMetricDefinition.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_BaseMetricDefinition.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BaseMetricValue(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_BaseMetricValue(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BaseMetricValue(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_BaseMetricValue_CIM_MetricInstance_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_METRICINSTANCE, 
					CIM_BaseMetricValue.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_BaseMetricValue.CIM_CLASS_NAME)) {
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
	
	// Attribute BreakdownDimensions
	
	public String[] get_BreakdownDimensions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BaseMetricDefinition.CIM_PROPERTY_BREAKDOWNDIMENSIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_BREAKDOWNDIMENSIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_BREAKDOWNDIMENSIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_BreakdownDimensions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BaseMetricDefinition.CIM_PROPERTY_BREAKDOWNDIMENSIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_BREAKDOWNDIMENSIONS + " could not be found");
    		
		} else if (!CIM_BaseMetricDefinitionHelper.isValid_BreakdownDimensions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BaseMetricDefinition.CIM_PROPERTY_BREAKDOWNDIMENSIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_BREAKDOWNDIMENSIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Calculable
	
	public UnsignedInt16 get_Calculable() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BaseMetricDefinition.CIM_PROPERTY_CALCULABLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_CALCULABLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_CALCULABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Calculable(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BaseMetricDefinition.CIM_PROPERTY_CALCULABLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_CALCULABLE + " could not be found");
    		
		} else if (!CIM_BaseMetricDefinitionHelper.isValid_Calculable(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BaseMetricDefinition.CIM_PROPERTY_CALCULABLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_CALCULABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ChangeType
	
	public UnsignedInt16 get_ChangeType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BaseMetricDefinition.CIM_PROPERTY_CHANGETYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_CHANGETYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_CHANGETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ChangeType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BaseMetricDefinition.CIM_PROPERTY_CHANGETYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_CHANGETYPE + " could not be found");
    		
		} else if (!CIM_BaseMetricDefinitionHelper.isValid_ChangeType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BaseMetricDefinition.CIM_PROPERTY_CHANGETYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_CHANGETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DataType
	
	public UnsignedInt16 get_DataType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BaseMetricDefinition.CIM_PROPERTY_DATATYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_DATATYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_DATATYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DataType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BaseMetricDefinition.CIM_PROPERTY_DATATYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_DATATYPE + " could not be found");
    		
		} else if (!CIM_BaseMetricDefinitionHelper.isValid_DataType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BaseMetricDefinition.CIM_PROPERTY_DATATYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_DATATYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute GatheringType
	
	public UnsignedInt16 get_GatheringType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BaseMetricDefinition.CIM_PROPERTY_GATHERINGTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_GATHERINGTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_GATHERINGTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_GatheringType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BaseMetricDefinition.CIM_PROPERTY_GATHERINGTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_GATHERINGTYPE + " could not be found");
    		
		} else if (!CIM_BaseMetricDefinitionHelper.isValid_GatheringType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BaseMetricDefinition.CIM_PROPERTY_GATHERINGTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_GATHERINGTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Id
	
	public String get_Id() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BaseMetricDefinition.CIM_PROPERTY_ID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_ID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_ID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Id(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BaseMetricDefinition.CIM_PROPERTY_ID);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_ID + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_ID + " could not be found");
    		
		} else if (!CIM_BaseMetricDefinitionHelper.isValid_Id(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BaseMetricDefinition.CIM_PROPERTY_ID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_ID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IsContinuous
	
	public Boolean get_IsContinuous() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BaseMetricDefinition.CIM_PROPERTY_ISCONTINUOUS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_ISCONTINUOUS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_ISCONTINUOUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IsContinuous(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BaseMetricDefinition.CIM_PROPERTY_ISCONTINUOUS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_ISCONTINUOUS + " could not be found");
    		
		} else if (!CIM_BaseMetricDefinitionHelper.isValid_IsContinuous(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BaseMetricDefinition.CIM_PROPERTY_ISCONTINUOUS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_ISCONTINUOUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Name
	
	public String get_Name() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BaseMetricDefinition.CIM_PROPERTY_NAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Name(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BaseMetricDefinition.CIM_PROPERTY_NAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (!CIM_BaseMetricDefinitionHelper.isValid_Name(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BaseMetricDefinition.CIM_PROPERTY_NAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TimeScope
	
	public UnsignedInt16 get_TimeScope() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BaseMetricDefinition.CIM_PROPERTY_TIMESCOPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_TIMESCOPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_TIMESCOPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TimeScope(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BaseMetricDefinition.CIM_PROPERTY_TIMESCOPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_TIMESCOPE + " could not be found");
    		
		} else if (!CIM_BaseMetricDefinitionHelper.isValid_TimeScope(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BaseMetricDefinition.CIM_PROPERTY_TIMESCOPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_TIMESCOPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Units
	
	public String get_Units() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BaseMetricDefinition.CIM_PROPERTY_UNITS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_UNITS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_UNITS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Units(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BaseMetricDefinition.CIM_PROPERTY_UNITS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_UNITS + " could not be found");
    		
		} else if (!CIM_BaseMetricDefinitionHelper.isValid_Units(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BaseMetricDefinition.CIM_PROPERTY_UNITS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BaseMetricDefinition.CIM_PROPERTY_UNITS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
