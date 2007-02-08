/** 
 * CIM_PrintQueue.java
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
 * Description: Capabilities and management of a Printer Queue. A PrintQueue holds PrintJobs - which are placed on the Queue by a Print Service. Jobs can move from Queue to Queue.
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



public class CIM_PrintQueue extends CIM_JobDestination  {
	
	public final static String CIM_CLASS_NAME = "CIM_PrintQueue";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_OWNINGPRINTQUEUE = "CIM_OwningPrintQueue";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PRINTERSERVICINGQUEUE = "CIM_PrinterServicingQueue";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_QUEUEFORPRINTSERVICE = "CIM_QueueForPrintService";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_QUEUEFORWARDSTOPRINTSAP = "CIM_QueueForwardsToPrintSAP";
	
	
	/**
	*	Specifies the job sheets that are supported by this Queue. Typically the job sheets provided by a Queue will be the union or aggregation of those provided by all the Printers that it supports. However, a system administrator may choose to restrict access to some job sheets on a particular Queue. A Queue might also support additional job sheets through the use of a filter that adds a banner or some other page when a Job is taken from the Queue.
	*/
	public final static String CIM_PROPERTY_AVAILABLEJOBSHEETS = "AvailableJobSheets"; //$NON-NLS-1$
	/**
	*	Specifies the priority that will be assigned to a new Job being submitted to this Queue, if the Job does not explicitly specify a priority. The range of valid priorities and the interpretation of priorities may be determined from the JobPriorityHigh and JobPriorityLow properties.
	*/
	public final static String CIM_PROPERTY_DEFAULTJOBPRIORITY = "DefaultJobPriority"; //$NON-NLS-1$
	/**
	*	Specifies the numeric value that is used to represent the highest priority Jobs that are submitted to this Queue. The range of numeric values for priority may be inversed, e.g. a high priority job is represented by a low integer value. This is indicated by JobPriorityLow being greater than JobPriorityHigh. If both values (PriorityLow and Priority High) are assigned to zero, then the Queue does not support Job priorities.
	*/
	public final static String CIM_PROPERTY_JOBPRIORITYHIGH = "JobPriorityHigh"; //$NON-NLS-1$
	/**
	*	Specifies the numeric value that is used to represent the lowest priority Jobs that are submitted to this Queue. The range of numeric values for priority may be inversed, e.g. a low priority job is represented by a high integer value. This is indicated by JobPriorityLow being greater than JobPriorityHigh. If both values (PriorityLow and PriorityHigh) are assigned to zero, then the Queue does not support Job priorities.
	*/
	public final static String CIM_PROPERTY_JOBPRIORITYLOW = "JobPriorityLow"; //$NON-NLS-1$
	/**
	*	Specifies the largest possible Job (in terms of a single byte stream) that may be submitted to this Queue. A value of zero indicates that no limit has been set. Units are Kbytes.
	*/
	public final static String CIM_PROPERTY_MAXJOBSIZE = "MaxJobSize"; //$NON-NLS-1$
	/**
	*	The current number of Jobs on the Queue.
	*/
	public final static String CIM_PROPERTY_NUMBERONQUEUE = "NumberOnQueue"; //$NON-NLS-1$
	/**
	*	When FALSE, no PrintService can place PrintJobs on the PrintQueue. The ability of an individual PrintService to place a Job on the Queue can be specified using the QueueAcceptingFromService property in the QueueForPrint Service association. This property, coupled with the information in QueueEnabled, aligns with various values of the inherited EnabledState property: 
- When both QueueEnabled and QueueAccepting are TRUE, then EnabledState is set to 2 ("Enabled") 
- When both QueueEnabled and QueueAccepting are FALSE, then EnabledState is set to 3 ("Disabled") 
- When QueueEnabled is TRUE and QueueAccepting is FALSE (i.e., when the Queue is outputting jobs to the printer, but not accepting new jobs), then EnabledState is set to 6 ("Enabled but Offline") 
- When QueueEnabled is FALSE and QueueAccepting is TRUE (i.e., when the Queue is accepting print jobs but not sending them to a printer), then EnabledState is set to 8 ("Deferred") 
Both this property and QueueEnabled are deprecated in lieu of EnabledState.
	*/
	public final static String CIM_PROPERTY_QUEUEACCEPTING = "QueueAccepting"; //$NON-NLS-1$
	/**
	*	Indicates that Jobs on the Queue will be passed to a Printer. When FALSE, a Job will remain on the Queue and will not be passed to a Printer for output. This property, coupled with the information in QueueAccepting, aligns with various values of the inherited EnabledState property: 
- When both QueueEnabled and QueueAccepting are TRUE, then EnabledState is set to 2 ("Enabled") 
- When both QueueEnabled and QueueAccepting are FALSE, then EnabledState is set to 3 ("Disabled") 
- When QueueEnabled is TRUE and QueueAccepting is FALSE (i.e., when the Queue is outputting jobs to the printer, but not accepting new jobs), then EnabledState is set to 6 ("Enabled but Offline") 
- When QueueEnabled is FALSE and QueueAccepting is TRUE (i.e., when the Queue is accepting print jobs but not sending them to a printer), then EnabledState is set to 8 ("Deferred") 
Both this property and QueueAccepting are deprecated in lieu of EnabledState.
	*/
	public final static String CIM_PROPERTY_QUEUEENABLED = "QueueEnabled"; //$NON-NLS-1$
	/**
	*	Gives Queue-specific status information, beyond the ManagedSystemElement.Status property. This may be used to provide further qualification as to the status of the Queue or to indicate a secondary condition (e.g. spool area is full).
	*/
	public final static String CIM_PROPERTY_QUEUESTATUS = "QueueStatus"; //$NON-NLS-1$
	/**
	*	Provides a textual explanation for the status of the Queue. The settings of both QueueStatus and the Status property inherited from ManagedSystemElement may be described by QueueStatusInfo. For example, if "Stopping" is the value assigned to Status, then this property may contain an explanation as to why the Queue is being stopped.
	*/
	public final static String CIM_PROPERTY_QUEUESTATUSINFO = "QueueStatusInfo"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_AVAILABLEJOBSHEETS);
		CIM_PropertyNameList.add(CIM_PROPERTY_DEFAULTJOBPRIORITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_JOBPRIORITYHIGH);
		CIM_PropertyNameList.add(CIM_PROPERTY_JOBPRIORITYLOW);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXJOBSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_NUMBERONQUEUE);
		CIM_PropertyNameList.add(CIM_PROPERTY_QUEUEACCEPTING);
		CIM_PropertyNameList.add(CIM_PROPERTY_QUEUEENABLED);
		CIM_PropertyNameList.add(CIM_PROPERTY_QUEUESTATUS);
		CIM_PropertyNameList.add(CIM_PROPERTY_QUEUESTATUSINFO);
				
		for (int i = 0; i < CIM_JobDestination.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_JobDestination.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AVAILABLEJOBSHEETS)||
				((String)CIM_JobDestination.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEFAULTJOBPRIORITY)||
				((String)CIM_JobDestination.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_JOBPRIORITYHIGH)||
				((String)CIM_JobDestination.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_JOBPRIORITYLOW)||
				((String)CIM_JobDestination.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXJOBSIZE)||
				((String)CIM_JobDestination.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NUMBERONQUEUE)||
				((String)CIM_JobDestination.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_QUEUEACCEPTING)||
				((String)CIM_JobDestination.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_QUEUEENABLED)||
				((String)CIM_JobDestination.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_QUEUESTATUS)||
				((String)CIM_JobDestination.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_QUEUESTATUSINFO)){
				continue;
			}
			
			CIM_PrintQueue.CIM_PropertyNameList.add(CIM_JobDestination.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AVAILABLEJOBSHEETS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEFAULTJOBPRIORITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_JOBPRIORITYHIGH, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_JOBPRIORITYLOW, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXJOBSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NUMBERONQUEUE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_QUEUEACCEPTING, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_QUEUEENABLED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_QUEUESTATUS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_QUEUESTATUSINFO, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_JobDestination.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_JobDestination.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AVAILABLEJOBSHEETS)||
				((CIMProperty)CIM_JobDestination.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEFAULTJOBPRIORITY)||
				((CIMProperty)CIM_JobDestination.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_JOBPRIORITYHIGH)||
				((CIMProperty)CIM_JobDestination.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_JOBPRIORITYLOW)||
				((CIMProperty)CIM_JobDestination.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXJOBSIZE)||
				((CIMProperty)CIM_JobDestination.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NUMBERONQUEUE)||
				((CIMProperty)CIM_JobDestination.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_QUEUEACCEPTING)||
				((CIMProperty)CIM_JobDestination.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_QUEUEENABLED)||
				((CIMProperty)CIM_JobDestination.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_QUEUESTATUS)||
				((CIMProperty)CIM_JobDestination.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_QUEUESTATUSINFO)){
				continue;
			}
			
			CIM_PrintQueue.CIM_PropertyList.add(CIM_JobDestination.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_JobDestination.Java_Package_List.size(); i++) {
			if (((String)CIM_JobDestination.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_JobDestination.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_QUEUESTATUS = {"Other","Unknown","No Additional Status","QueueSpoolAreaFull"};
	
	
	public final static int QUEUESTATUS_OTHER = 0;
	public final static int QUEUESTATUS_UNKNOWN = 1;
	public final static int QUEUESTATUS_NOADDITIONALSTATUS = 2;
	public final static int QUEUESTATUS_QUEUESPOOLAREAFULL = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PrintQueue() {

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
	public CIM_PrintQueue(Vector keyProperties){ 
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
	public CIM_PrintQueue(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_PrintQueue)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PrintQueue)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PrintQueue)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PrintQueue)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PrintQueue)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PrintQueue)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PrintQueue)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PrintQueue)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PrintQueue)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PrintQueue)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_PrintJob_CIM_OwningPrintQueues(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_OWNINGPRINTQUEUE, 
					CIM_PrintJob.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_PrintQueue.Java_Package_List.size(); i++) {
						if (!((String)(CIM_PrintQueue.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_PrintQueue.Java_Package_List.get(i))).endsWith(".")) {
							CIM_PrintQueue.Java_Package_List.setElementAt((String)(CIM_PrintQueue.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_PrintQueue.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PrintJob(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_PrintJob(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PrintJob(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_PrintJob_CIM_OwningPrintQueue_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_OWNINGPRINTQUEUE, 
					CIM_PrintJob.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_PrintJob.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_Printer_CIM_PrinterServicingQueues(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PRINTERSERVICINGQUEUE, 
					CIM_Printer.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_PrintQueue.Java_Package_List.size(); i++) {
						if (!((String)(CIM_PrintQueue.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_PrintQueue.Java_Package_List.get(i))).endsWith(".")) {
							CIM_PrintQueue.Java_Package_List.setElementAt((String)(CIM_PrintQueue.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_PrintQueue.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Printer(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_Printer(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Printer(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_Printer_CIM_PrinterServicingQueue_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PRINTERSERVICINGQUEUE, 
					CIM_Printer.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_Printer.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_PrintService_CIM_QueueForPrintServices(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_QUEUEFORPRINTSERVICE, 
					CIM_PrintService.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_PrintQueue.Java_Package_List.size(); i++) {
						if (!((String)(CIM_PrintQueue.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_PrintQueue.Java_Package_List.get(i))).endsWith(".")) {
							CIM_PrintQueue.Java_Package_List.setElementAt((String)(CIM_PrintQueue.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_PrintQueue.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PrintService(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_PrintService(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PrintService(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_PrintService_CIM_QueueForPrintService_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_QUEUEFORPRINTSERVICE, 
					CIM_PrintService.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_PrintService.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_PrintSAP_CIM_QueueForwardsToPrintSAPs(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_QUEUEFORWARDSTOPRINTSAP, 
					CIM_PrintSAP.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_PrintQueue.Java_Package_List.size(); i++) {
						if (!((String)(CIM_PrintQueue.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_PrintQueue.Java_Package_List.get(i))).endsWith(".")) {
							CIM_PrintQueue.Java_Package_List.setElementAt((String)(CIM_PrintQueue.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_PrintQueue.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PrintSAP(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_PrintSAP(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PrintSAP(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_PrintSAP_CIM_QueueForwardsToPrintSAP_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_QUEUEFORWARDSTOPRINTSAP, 
					CIM_PrintSAP.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_PrintSAP.CIM_CLASS_NAME)) {
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
	
	// Attribute AvailableJobSheets
	
	public String[] get_AvailableJobSheets() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintQueue.CIM_PROPERTY_AVAILABLEJOBSHEETS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintQueue.CIM_PROPERTY_AVAILABLEJOBSHEETS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintQueue.CIM_PROPERTY_AVAILABLEJOBSHEETS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_AvailableJobSheets(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintQueue.CIM_PROPERTY_AVAILABLEJOBSHEETS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintQueue.CIM_PROPERTY_AVAILABLEJOBSHEETS + " could not be found");
    		
		} else if (!CIM_PrintQueueHelper.isValid_AvailableJobSheets(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintQueue.CIM_PROPERTY_AVAILABLEJOBSHEETS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintQueue.CIM_PROPERTY_AVAILABLEJOBSHEETS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DefaultJobPriority
	
	public UnsignedInt32 get_DefaultJobPriority() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintQueue.CIM_PROPERTY_DEFAULTJOBPRIORITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintQueue.CIM_PROPERTY_DEFAULTJOBPRIORITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintQueue.CIM_PROPERTY_DEFAULTJOBPRIORITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DefaultJobPriority(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintQueue.CIM_PROPERTY_DEFAULTJOBPRIORITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintQueue.CIM_PROPERTY_DEFAULTJOBPRIORITY + " could not be found");
    		
		} else if (!CIM_PrintQueueHelper.isValid_DefaultJobPriority(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintQueue.CIM_PROPERTY_DEFAULTJOBPRIORITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintQueue.CIM_PROPERTY_DEFAULTJOBPRIORITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute JobPriorityHigh
	
	public UnsignedInt32 get_JobPriorityHigh() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintQueue.CIM_PROPERTY_JOBPRIORITYHIGH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintQueue.CIM_PROPERTY_JOBPRIORITYHIGH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintQueue.CIM_PROPERTY_JOBPRIORITYHIGH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_JobPriorityHigh(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintQueue.CIM_PROPERTY_JOBPRIORITYHIGH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintQueue.CIM_PROPERTY_JOBPRIORITYHIGH + " could not be found");
    		
		} else if (!CIM_PrintQueueHelper.isValid_JobPriorityHigh(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintQueue.CIM_PROPERTY_JOBPRIORITYHIGH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintQueue.CIM_PROPERTY_JOBPRIORITYHIGH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute JobPriorityLow
	
	public UnsignedInt32 get_JobPriorityLow() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintQueue.CIM_PROPERTY_JOBPRIORITYLOW);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintQueue.CIM_PROPERTY_JOBPRIORITYLOW + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintQueue.CIM_PROPERTY_JOBPRIORITYLOW + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_JobPriorityLow(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintQueue.CIM_PROPERTY_JOBPRIORITYLOW);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintQueue.CIM_PROPERTY_JOBPRIORITYLOW + " could not be found");
    		
		} else if (!CIM_PrintQueueHelper.isValid_JobPriorityLow(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintQueue.CIM_PROPERTY_JOBPRIORITYLOW);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintQueue.CIM_PROPERTY_JOBPRIORITYLOW + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxJobSize
	
	public UnsignedInt32 get_MaxJobSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintQueue.CIM_PROPERTY_MAXJOBSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintQueue.CIM_PROPERTY_MAXJOBSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintQueue.CIM_PROPERTY_MAXJOBSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxJobSize(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintQueue.CIM_PROPERTY_MAXJOBSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintQueue.CIM_PROPERTY_MAXJOBSIZE + " could not be found");
    		
		} else if (!CIM_PrintQueueHelper.isValid_MaxJobSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintQueue.CIM_PROPERTY_MAXJOBSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintQueue.CIM_PROPERTY_MAXJOBSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NumberOnQueue
	
	public UnsignedInt32 get_NumberOnQueue() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintQueue.CIM_PROPERTY_NUMBERONQUEUE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintQueue.CIM_PROPERTY_NUMBERONQUEUE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintQueue.CIM_PROPERTY_NUMBERONQUEUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NumberOnQueue(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintQueue.CIM_PROPERTY_NUMBERONQUEUE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintQueue.CIM_PROPERTY_NUMBERONQUEUE + " could not be found");
    		
		} else if (!CIM_PrintQueueHelper.isValid_NumberOnQueue(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintQueue.CIM_PROPERTY_NUMBERONQUEUE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintQueue.CIM_PROPERTY_NUMBERONQUEUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute QueueAccepting
	
	public Boolean get_QueueAccepting() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintQueue.CIM_PROPERTY_QUEUEACCEPTING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintQueue.CIM_PROPERTY_QUEUEACCEPTING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintQueue.CIM_PROPERTY_QUEUEACCEPTING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_QueueAccepting(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintQueue.CIM_PROPERTY_QUEUEACCEPTING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintQueue.CIM_PROPERTY_QUEUEACCEPTING + " could not be found");
    		
		} else if (!CIM_PrintQueueHelper.isValid_QueueAccepting(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintQueue.CIM_PROPERTY_QUEUEACCEPTING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintQueue.CIM_PROPERTY_QUEUEACCEPTING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute QueueEnabled
	
	public Boolean get_QueueEnabled() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintQueue.CIM_PROPERTY_QUEUEENABLED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintQueue.CIM_PROPERTY_QUEUEENABLED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintQueue.CIM_PROPERTY_QUEUEENABLED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_QueueEnabled(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintQueue.CIM_PROPERTY_QUEUEENABLED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintQueue.CIM_PROPERTY_QUEUEENABLED + " could not be found");
    		
		} else if (!CIM_PrintQueueHelper.isValid_QueueEnabled(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintQueue.CIM_PROPERTY_QUEUEENABLED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintQueue.CIM_PROPERTY_QUEUEENABLED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute QueueStatus
	
	public UnsignedInt16 get_QueueStatus() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintQueue.CIM_PROPERTY_QUEUESTATUS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintQueue.CIM_PROPERTY_QUEUESTATUS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintQueue.CIM_PROPERTY_QUEUESTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_QueueStatus(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintQueue.CIM_PROPERTY_QUEUESTATUS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintQueue.CIM_PROPERTY_QUEUESTATUS + " could not be found");
    		
		} else if (!CIM_PrintQueueHelper.isValid_QueueStatus(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintQueue.CIM_PROPERTY_QUEUESTATUS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintQueue.CIM_PROPERTY_QUEUESTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute QueueStatusInfo
	
	public String get_QueueStatusInfo() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintQueue.CIM_PROPERTY_QUEUESTATUSINFO);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintQueue.CIM_PROPERTY_QUEUESTATUSINFO + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintQueue.CIM_PROPERTY_QUEUESTATUSINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_QueueStatusInfo(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintQueue.CIM_PROPERTY_QUEUESTATUSINFO);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintQueue.CIM_PROPERTY_QUEUESTATUSINFO + " could not be found");
    		
		} else if (!CIM_PrintQueueHelper.isValid_QueueStatusInfo(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintQueue.CIM_PROPERTY_QUEUESTATUSINFO);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintQueue.CIM_PROPERTY_QUEUESTATUSINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
