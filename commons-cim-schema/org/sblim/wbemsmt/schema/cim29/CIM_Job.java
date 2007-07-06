/** 
 * CIM_Job.java
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
 * Description:  A Job is a LogicalElement representing an executing unit of work, such as a
 * script or a print job. A Job is distinct from a Process in that a Job can be
 * scheduled, queued, and its execution is not limited to a single system.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Enumeration;
import java.lang.reflect.Constructor;
import org.sblim.wbem.client.*;



/**
 *  A Job is a LogicalElement representing an executing unit of work, such as a
 * script or a print job. A Job is distinct from a Process in that a Job can be
 * scheduled, queued, and its execution is not limited to a single system.
 */
public class CIM_Job extends CIM_LogicalElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_Job"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_AFFECTEDJOBELEMENT = "CIM_AffectedJobElement"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_JOBDESTINATIONJOBS = "CIM_JobDestinationJobs"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_OWNINGJOBELEMENT = "CIM_OwningJobElement"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PROCESSOFJOB = "CIM_ProcessOfJob"; //$NON-NLS-1$
	
	
	/**
	*	Indicates whether or not the job should be automatically deleted upon completion. Note that the 'completion' of a recurring job is defined by its JobRunTimes or UntilTime properties, OR when the Job is terminated by manual intervention. If this property is set to false and the job completes, then the extrinsic method DeleteInstance MUST be used to delete the job versus updating this property.
	*/
	public final static String CIM_PROPERTY_DELETEONCOMPLETION = "DeleteOnCompletion"; //$NON-NLS-1$
	/**
	*	The time interval that the Job has been executing or the total execution time if the Job is complete. Note that this property is also present in the JobProcessingStatistics class. This is necessary to capture the processing information for recurring Jobs, since only the 'last' run time can be stored in this single-valued property.
	*/
	public final static String CIM_PROPERTY_ELAPSEDTIME = "ElapsedTime"; //$NON-NLS-1$
	/**
	*	A vendor specific error code. This MUST be set to zero if the Job completed without error. Note that this property is also present in the JobProcessingStatistics class. This is necessary to capture the processing information for recurring Jobs, since only the 'last' run error can be stored in this single-valued property.
	*/
	public final static String CIM_PROPERTY_ERRORCODE = "ErrorCode"; //$NON-NLS-1$
	/**
	*	A free form string containing the vendor error description. Note that this property is also present in the JobProcessingStatistics class. This is necessary to capture the processing information for recurring Jobs, since only the 'last' run error can be stored in this single-valued property.
	*/
	public final static String CIM_PROPERTY_ERRORDESCRIPTION = "ErrorDescription"; //$NON-NLS-1$
	/**
	*	Number of times that the Job should be run. A value of 1 indicates that the Job is NOT recurring, while any non-zero value indicates a limit to the number of times that the Job will recur. Zero indicates that there is no limit to the number of times that the Job can be processed, but that it is terminated either AFTER the UntilTime, or by manual intervention. By default, a Job is processed once.
	*/
	public final static String CIM_PROPERTY_JOBRUNTIMES = "JobRunTimes"; //$NON-NLS-1$
	/**
	*	A free form string representing the Job's status. The primary status is reflected in the inherited OperationalStatus property. JobStatus provides additional, implementation-specific details.
	*/
	public final static String CIM_PROPERTY_JOBSTATUS = "JobStatus"; //$NON-NLS-1$
	/**
	*	This property indicates whether the times represented in the RunStartInterval and UntilTime properties represent local times or UTC times. Time values are synchronized worldwide by using the enumeration value 2, "UTC Time".
	*/
	public final static String CIM_PROPERTY_LOCALORUTCTIME = "LocalOrUtcTime"; //$NON-NLS-1$
	/**
	*	User to be notified upon the Job completion or failure.
	*/
	public final static String CIM_PROPERTY_NOTIFY = "Notify"; //$NON-NLS-1$
	/**
	*	A string describing the recovery action when the instance's RecoveryAction property is 1 ("Other").
	*/
	public final static String CIM_PROPERTY_OTHERRECOVERYACTION = "OtherRecoveryAction"; //$NON-NLS-1$
	/**
	*	The User that submitted the Job or the Service/method name/etc. that caused the job to be created.
	*/
	public final static String CIM_PROPERTY_OWNER = "Owner"; //$NON-NLS-1$
	/**
	*	The percentage of the job that has completed at the time that this value is requested. Note that this property is also present in the JobProcessingStatistics class. This is necessary to capture the processing information for recurring Jobs, since only the 'last' run data can be stored in this single-valued property. 
Note that the value 101 is undefined and will be not be allowed in the next major revision of the specification.
	*/
	public final static String CIM_PROPERTY_PERCENTCOMPLETE = "PercentComplete"; //$NON-NLS-1$
	/**
	*	Indicates the urgency or importance of execution of the Job. The lower the number, the higher the priority. Note that this property is also present in the JobProcessingStatistics class. This is necessary to capture the setting information that would influence a Job's results.
	*/
	public final static String CIM_PROPERTY_PRIORITY = "Priority"; //$NON-NLS-1$
	/**
	*	Describes the recovery action to be taken for an unsuccessfully run Job. The possible values are: 
0 = "Unknown", meaning it is unknown as to what recovery action to take 
1 = "Other", indicating that the recovery action will be specified in the property, OtherRecoveryAction 
2 = "Do Not Continue", meaning stop the execution of the job and appropriately update its status 
3 = "Continue With Next Job", meaning continue with the next job in the queue 
4 = "Re-run Job", indicating that the job should be re-run 
5 = "Run Recovery Job", meaning run the Job associated using the RecoveryJob relationship. Note that the recovery Job MUST already be on the queue from which it will run.
	*/
	public final static String CIM_PROPERTY_RECOVERYACTION = "RecoveryAction"; //$NON-NLS-1$
	/**
	*	The day in the month on which the Job should be processed. There are two different interpretations for this property, depending on the value of DayOfWeek. In one case, RunDay defines the day-in-month on which the Job is processed. This interpretation is used when the DayOfWeek is 0. A positive or negative integer indicates whether the RunDay should be calculated from the beginning or the end of the month. For example, 5 indicates the fifth day in RunMonth and -1 indicates the last day in the RunMonth. 

When RunDayOfWeek is not 0, RunDay is the day-in-month on which the Job is processed, defined in conjunction with RunDayOfWeek. For example, if RunDay is 15 and RunDayOfWeek is Saturday, then the Job is processed on the first Saturday on or AFTER the 15th day in the RunMonth (e.g., the third Saturday in the month). If RunDay is 20 and RunDayOfWeek is -Saturday, then this indicates the first Saturday on or BEFORE the 20th day in the RunMonth. If RunDay is -1 and RunDayOfWeek is -Sunday, then this indicates the last Sunday in the RunMonth.
	*/
	public final static String CIM_PROPERTY_RUNDAY = "RunDay"; //$NON-NLS-1$
	/**
	*	Positive or negative integer used in conjunction with RunDay to indicate the day of the week on which the Job is processed. RunDayOfWeek is set to 0 to indicate an exact day of the month, such as March 1. A positive integer (representing Sunday, Monday, ..., Saturday) means that the day of week is found on or AFTER the specified RunDay. A negative integer (representing -Sunday, -Monday, ..., -Saturday) means that the day of week is found on or BEFORE the RunDay.
	*/
	public final static String CIM_PROPERTY_RUNDAYOFWEEK = "RunDayOfWeek"; //$NON-NLS-1$
	/**
	*	The month during which the Job should be processed. Specify 0 for January, 1 for February, and so on.
	*/
	public final static String CIM_PROPERTY_RUNMONTH = "RunMonth"; //$NON-NLS-1$
	/**
	*	The time interval after midnight when the Job should be processed. For example, 
00000000020000.000000:000 
indicates that the Job should be run on or after two o'clock, local time or UTC time (distinguished using the LocalOrUtcTime property.
	*/
	public final static String CIM_PROPERTY_RUNSTARTINTERVAL = "RunStartInterval"; //$NON-NLS-1$
	/**
	*	The time that the current Job is scheduled to start. This may be represented by the actual date and time, or an interval relative to the time that this property is requested. A value of all zeroes indicates that the Job is already executing. The property is deprecated in lieu of the more expressive scheduling properties, RunMonth, RunDay, RunDayOfWeek and RunStartInterval.
	*/
	public final static String CIM_PROPERTY_SCHEDULEDSTARTTIME = "ScheduledStartTime"; //$NON-NLS-1$
	/**
	*	The time that the Job was actually started. This may be represented by an actual date and time, or by an interval relative to the time that this property is requested. Note that this property is also present in the JobProcessingStatistics class. This is necessary to capture the processing information for recurring Jobs, since only the 'last' run time can be stored in this single-valued property.
	*/
	public final static String CIM_PROPERTY_STARTTIME = "StartTime"; //$NON-NLS-1$
	/**
	*	The time that the Job was submitted to execute. A value of all zeroes indicates that the owning element is not capable of reporting a date and time. Therefore, the ScheduledStartTime and StartTime are reported as intervals relative to the time their values are requested.
	*/
	public final static String CIM_PROPERTY_TIMESUBMITTED = "TimeSubmitted"; //$NON-NLS-1$
	/**
	*	The time after which the Job is invalid or should be stopped. This may be represented by an actual date and time, or by an interval relative to the time that this property is requested. A value of all nines indicates that the Job can run indefinitely.
	*/
	public final static String CIM_PROPERTY_UNTILTIME = "UntilTime"; //$NON-NLS-1$
	
	
	/**
	*	KillJob is being deprecated because there is no distiction made between an orderly shutdown and an immediate kill. CIM_ConcreteJob.RequestStateChange() provides 'Terminate' and 'Kill' options to allow this distinction. 
A method to kill this job and any underlying processes, and to remove any 'dangling' associations.
	*/
	public final static String CIM_METHOD_KILLJOB = "KillJob";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DELETEONCOMPLETION);
		CIM_PropertyNameList.add(CIM_PROPERTY_ELAPSEDTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_ERRORCODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ERRORDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_JOBRUNTIMES);
		CIM_PropertyNameList.add(CIM_PROPERTY_JOBSTATUS);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOCALORUTCTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_NOTIFY);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERRECOVERYACTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_OWNER);
		CIM_PropertyNameList.add(CIM_PROPERTY_PERCENTCOMPLETE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRIORITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_RECOVERYACTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_RUNDAY);
		CIM_PropertyNameList.add(CIM_PROPERTY_RUNDAYOFWEEK);
		CIM_PropertyNameList.add(CIM_PROPERTY_RUNMONTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_RUNSTARTINTERVAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_SCHEDULEDSTARTTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_STARTTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMESUBMITTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_UNTILTIME);
				
		for (int i = 0; i < CIM_LogicalElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DELETEONCOMPLETION)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ELAPSEDTIME)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ERRORCODE)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ERRORDESCRIPTION)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_JOBRUNTIMES)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_JOBSTATUS)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOCALORUTCTIME)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NOTIFY)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERRECOVERYACTION)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OWNER)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PERCENTCOMPLETE)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRIORITY)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RECOVERYACTION)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RUNDAY)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RUNDAYOFWEEK)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RUNMONTH)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RUNSTARTINTERVAL)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SCHEDULEDSTARTTIME)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STARTTIME)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TIMESUBMITTED)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UNTILTIME)){
				continue;
			}
			
			CIM_Job.CIM_PropertyNameList.add(CIM_LogicalElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DELETEONCOMPLETION, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ELAPSEDTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ERRORCODE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ERRORDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_JOBRUNTIMES, new CIMValue(new UnsignedInt32("1"), new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_JOBSTATUS, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOCALORUTCTIME, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NOTIFY, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERRECOVERYACTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OWNER, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PERCENTCOMPLETE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRIORITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RECOVERYACTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RUNDAY, new CIMValue(null, new CIMDataType(CIMDataType.SINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RUNDAYOFWEEK, new CIMValue(null, new CIMDataType(CIMDataType.SINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RUNMONTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RUNSTARTINTERVAL, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SCHEDULEDSTARTTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STARTTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMESUBMITTED, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UNTILTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
				
		for (int i = 0; i < CIM_LogicalElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DELETEONCOMPLETION)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ELAPSEDTIME)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ERRORCODE)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ERRORDESCRIPTION)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_JOBRUNTIMES)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_JOBSTATUS)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOCALORUTCTIME)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NOTIFY)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERRECOVERYACTION)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OWNER)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PERCENTCOMPLETE)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRIORITY)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RECOVERYACTION)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RUNDAY)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RUNDAYOFWEEK)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RUNMONTH)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RUNSTARTINTERVAL)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SCHEDULEDSTARTTIME)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STARTTIME)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TIMESUBMITTED)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UNTILTIME)){
				continue;
			}
			
			CIM_Job.CIM_PropertyList.add(CIM_LogicalElement.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim29");
				
		String[] parentClassPackageList = CIM_LogicalElement.getPackages();
		
		for (int i = 0; i < parentClassPackageList.length; i++) {
			Java_Package_List.add(parentClassPackageList[i]);
		}
	};
			
	public final static String[] CIM_VALUEMAP_LOCALORUTCTIME = {"Local Time","UTC Time"};
	public final static String[] CIM_VALUEMAP_RECOVERYACTION = {"Unknown","Other","Do Not Continue","Continue With Next Job","Re-run Job","Run Recovery Job"};
	public final static String[] CIM_VALUEMAP_RUNDAYOFWEEK = {"-Saturday","-Friday","-Thursday","-Wednesday","-Tuesday","-Monday","-Sunday","ExactDayOfMonth","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
	public final static String[] CIM_VALUEMAP_RUNMONTH = {"January","February","March","April","May","June","July","August","September","October","November","December"};
	
	
	public final static int LOCALORUTCTIME_LOCALTIME = 1;
	public final static int LOCALORUTCTIME_UTCTIME = 2;
	
	public final static int RECOVERYACTION_UNKNOWN = 0;
	public final static int RECOVERYACTION_OTHER = 1;
	public final static int RECOVERYACTION_DONOTCONTINUE = 2;
	public final static int RECOVERYACTION_CONTINUEWITHNEXTJOB = 3;
	public final static int RECOVERYACTION_RE_RUNJOB = 4;
	public final static int RECOVERYACTION_RUNRECOVERYJOB = 5;
	
	public final static int RUNDAYOFWEEK__SATURDAY = -7;
	public final static int RUNDAYOFWEEK__FRIDAY = -6;
	public final static int RUNDAYOFWEEK__THURSDAY = -5;
	public final static int RUNDAYOFWEEK__WEDNESDAY = -4;
	public final static int RUNDAYOFWEEK__TUESDAY = -3;
	public final static int RUNDAYOFWEEK__MONDAY = -2;
	public final static int RUNDAYOFWEEK__SUNDAY = -1;
	public final static int RUNDAYOFWEEK_EXACTDAYOFMONTH = 0;
	public final static int RUNDAYOFWEEK_SUNDAY = 1;
	public final static int RUNDAYOFWEEK_MONDAY = 2;
	public final static int RUNDAYOFWEEK_TUESDAY = 3;
	public final static int RUNDAYOFWEEK_WEDNESDAY = 4;
	public final static int RUNDAYOFWEEK_THURSDAY = 5;
	public final static int RUNDAYOFWEEK_FRIDAY = 6;
	public final static int RUNDAYOFWEEK_SATURDAY = 7;
	
	public final static int RUNMONTH_JANUARY = 0;
	public final static int RUNMONTH_FEBRUARY = 1;
	public final static int RUNMONTH_MARCH = 2;
	public final static int RUNMONTH_APRIL = 3;
	public final static int RUNMONTH_MAY = 4;
	public final static int RUNMONTH_JUNE = 5;
	public final static int RUNMONTH_JULY = 6;
	public final static int RUNMONTH_AUGUST = 7;
	public final static int RUNMONTH_SEPTEMBER = 8;
	public final static int RUNMONTH_OCTOBER = 9;
	public final static int RUNMONTH_NOVEMBER = 10;
	public final static int RUNMONTH_DECEMBER = 11;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_Job() {

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
	public CIM_Job(Vector keyProperties){ 
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
	public CIM_Job(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
		if (cimInstance == null) {
			throw new InvalidParameterException("The cimInstance parameter does not contain a valid reference.");
		
		} else if (cimObjectPath == null){
			throw new InvalidParameterException("The cimObjectPath parameter does not contain a valid reference.");		
		
		} else if (!cimObjectPath.getObjectName().equals(cimInstance.getClassName())) {
			throw new InvalidParameterException("The class name of the instance and the ObjectPath are not the same.");
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
	
	public static void addPackage(String packagename) {
        if (packagename != null) {
            if (!packagename.endsWith(".")) {
                packagename = packagename + ".";
            }
            CIM_Job.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_Job.Java_Package_List.toArray(new String[CIM_Job.Java_Package_List.size()]);
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
	    
	    if (!(object instanceof CIM_Job)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_Job)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_Job)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_Job)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_Job)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_Job)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_Job)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_Job)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_Job)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_Job)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_ManagedElement_CIM_AffectedJobElements(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_AFFECTEDJOBELEMENT, 
					CIM_ManagedElement.CIM_CLASS_NAME, 
					"AffectingElement", //$NON-NLS-1$
					"AffectedElement", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
                    Class clazz = CIM_JobHelper.findClass(cimClient, cimInstance);
                    
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

	public ArrayList getAssociated_CIM_ManagedElement_CIM_AffectedJobElement_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_AFFECTEDJOBELEMENT, 
					CIM_ManagedElement.CIM_CLASS_NAME, 
					"AffectingElement", //$NON-NLS-1$
					"AffectedElement"); //$NON-NLS-1$
		
		
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

	public ArrayList getAssociated_CIM_JobDestination_CIM_JobDestinationJobss(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_JOBDESTINATIONJOBS, 
					CIM_JobDestination.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
                    Class clazz = CIM_JobHelper.findClass(cimClient, cimInstance);
                    
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_JobDestination(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_JobDestination(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_JobDestination(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_JobDestination_CIM_JobDestinationJobs_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_JOBDESTINATIONJOBS, 
					CIM_JobDestination.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_JobDestination.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_ManagedElement_CIM_OwningJobElements(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_OWNINGJOBELEMENT, 
					CIM_ManagedElement.CIM_CLASS_NAME, 
					"OwnedElement", //$NON-NLS-1$
					"OwningElement", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
                    Class clazz = CIM_JobHelper.findClass(cimClient, cimInstance);
                    
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

	public ArrayList getAssociated_CIM_ManagedElement_CIM_OwningJobElement_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_OWNINGJOBELEMENT, 
					CIM_ManagedElement.CIM_CLASS_NAME, 
					"OwnedElement", //$NON-NLS-1$
					"OwningElement"); //$NON-NLS-1$
		
		
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

	public ArrayList getAssociated_CIM_Process_CIM_ProcessOfJobs(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PROCESSOFJOB, 
					CIM_Process.CIM_CLASS_NAME, 
					"GroupComponent", //$NON-NLS-1$
					"PartComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
                    Class clazz = CIM_JobHelper.findClass(cimClient, cimInstance);
                    
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Process(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_Process(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Process(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_Process_CIM_ProcessOfJob_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PROCESSOFJOB, 
					CIM_Process.CIM_CLASS_NAME, 
					"GroupComponent", //$NON-NLS-1$
					"PartComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_Process.CIM_CLASS_NAME)) {
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
	
	// Attribute DeleteOnCompletion
	
	public Boolean get_DeleteOnCompletion() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_DELETEONCOMPLETION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_DELETEONCOMPLETION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_DELETEONCOMPLETION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DeleteOnCompletion(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_DELETEONCOMPLETION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_DELETEONCOMPLETION + " could not be found");
    		
		} else if (!CIM_JobHelper.isValid_DeleteOnCompletion(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Job.CIM_PROPERTY_DELETEONCOMPLETION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_DELETEONCOMPLETION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ElapsedTime
	
	public Calendar get_ElapsedTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_ELAPSEDTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_ELAPSEDTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_ELAPSEDTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_ElapsedTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_ELAPSEDTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_ELAPSEDTIME + " could not be found");
    		
		} else if (!CIM_JobHelper.isValid_ElapsedTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Job.CIM_PROPERTY_ELAPSEDTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_ELAPSEDTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute ErrorCode
	
	public UnsignedInt16 get_ErrorCode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_ERRORCODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_ERRORCODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_ERRORCODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ErrorCode(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_ERRORCODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_ERRORCODE + " could not be found");
    		
		} else if (!CIM_JobHelper.isValid_ErrorCode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Job.CIM_PROPERTY_ERRORCODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_ERRORCODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ErrorDescription
	
	public String get_ErrorDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_ERRORDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_ERRORDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_ERRORDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ErrorDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_ERRORDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_ERRORDESCRIPTION + " could not be found");
    		
		} else if (!CIM_JobHelper.isValid_ErrorDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Job.CIM_PROPERTY_ERRORDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_ERRORDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute JobRunTimes
	
	public UnsignedInt32 get_JobRunTimes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_JOBRUNTIMES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_JOBRUNTIMES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_JOBRUNTIMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_JobRunTimes(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_JOBRUNTIMES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_JOBRUNTIMES + " could not be found");
    		
		} else if (!CIM_JobHelper.isValid_JobRunTimes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Job.CIM_PROPERTY_JOBRUNTIMES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_JOBRUNTIMES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute JobStatus
	
	public String get_JobStatus() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_JOBSTATUS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_JOBSTATUS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_JOBSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_JobStatus(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_JOBSTATUS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_JOBSTATUS + " could not be found");
    		
		} else if (!CIM_JobHelper.isValid_JobStatus(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Job.CIM_PROPERTY_JOBSTATUS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_JOBSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LocalOrUtcTime
	
	public UnsignedInt16 get_LocalOrUtcTime() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_LOCALORUTCTIME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_LOCALORUTCTIME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_LOCALORUTCTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LocalOrUtcTime(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_LOCALORUTCTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_LOCALORUTCTIME + " could not be found");
    		
		} else if (!CIM_JobHelper.isValid_LocalOrUtcTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Job.CIM_PROPERTY_LOCALORUTCTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_LOCALORUTCTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Notify
	
	public String get_Notify() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_NOTIFY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_NOTIFY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_NOTIFY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Notify(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_NOTIFY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_NOTIFY + " could not be found");
    		
		} else if (!CIM_JobHelper.isValid_Notify(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Job.CIM_PROPERTY_NOTIFY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_NOTIFY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherRecoveryAction
	
	public String get_OtherRecoveryAction() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_OTHERRECOVERYACTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_OTHERRECOVERYACTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_OTHERRECOVERYACTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherRecoveryAction(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_OTHERRECOVERYACTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_OTHERRECOVERYACTION + " could not be found");
    		
		} else if (!CIM_JobHelper.isValid_OtherRecoveryAction(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Job.CIM_PROPERTY_OTHERRECOVERYACTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_OTHERRECOVERYACTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Owner
	
	public String get_Owner() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_OWNER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_OWNER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_OWNER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Owner(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_OWNER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_OWNER + " could not be found");
    		
		} else if (!CIM_JobHelper.isValid_Owner(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Job.CIM_PROPERTY_OWNER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_OWNER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PercentComplete
	
	public UnsignedInt16 get_PercentComplete() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_PERCENTCOMPLETE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_PERCENTCOMPLETE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_PERCENTCOMPLETE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PercentComplete(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_PERCENTCOMPLETE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_PERCENTCOMPLETE + " could not be found");
    		
		} else if (!CIM_JobHelper.isValid_PercentComplete(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Job.CIM_PROPERTY_PERCENTCOMPLETE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_PERCENTCOMPLETE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Priority
	
	public UnsignedInt32 get_Priority() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_PRIORITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_PRIORITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_PRIORITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Priority(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_PRIORITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_PRIORITY + " could not be found");
    		
		} else if (!CIM_JobHelper.isValid_Priority(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Job.CIM_PROPERTY_PRIORITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_PRIORITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RecoveryAction
	
	public UnsignedInt16 get_RecoveryAction() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_RECOVERYACTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_RECOVERYACTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_RECOVERYACTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RecoveryAction(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_RECOVERYACTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_RECOVERYACTION + " could not be found");
    		
		} else if (!CIM_JobHelper.isValid_RecoveryAction(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Job.CIM_PROPERTY_RECOVERYACTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_RECOVERYACTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RunDay
	
	public Byte get_RunDay() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_RUNDAY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_RUNDAY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_RUNDAY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Byte)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RunDay(Byte newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_RUNDAY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_RUNDAY + " could not be found");
    		
		} else if (!CIM_JobHelper.isValid_RunDay(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Job.CIM_PROPERTY_RUNDAY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_RUNDAY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RunDayOfWeek
	
	public Byte get_RunDayOfWeek() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_RUNDAYOFWEEK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_RUNDAYOFWEEK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_RUNDAYOFWEEK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Byte)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RunDayOfWeek(Byte newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_RUNDAYOFWEEK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_RUNDAYOFWEEK + " could not be found");
    		
		} else if (!CIM_JobHelper.isValid_RunDayOfWeek(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Job.CIM_PROPERTY_RUNDAYOFWEEK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.SINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_RUNDAYOFWEEK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.SINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.SINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RunMonth
	
	public UnsignedInt8 get_RunMonth() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_RUNMONTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_RUNMONTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_RUNMONTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RunMonth(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_RUNMONTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_RUNMONTH + " could not be found");
    		
		} else if (!CIM_JobHelper.isValid_RunMonth(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Job.CIM_PROPERTY_RUNMONTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_RUNMONTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RunStartInterval
	
	public Calendar get_RunStartInterval() {

		CIMProperty property = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_RUNSTARTINTERVAL);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_RUNSTARTINTERVAL + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_RUNSTARTINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_RunStartInterval(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_RUNSTARTINTERVAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_RUNSTARTINTERVAL + " could not be found");
    		
		} else if (!CIM_JobHelper.isValid_RunStartInterval(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Job.CIM_PROPERTY_RUNSTARTINTERVAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_RUNSTARTINTERVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute ScheduledStartTime
	
	public Calendar get_ScheduledStartTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_SCHEDULEDSTARTTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_SCHEDULEDSTARTTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_SCHEDULEDSTARTTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_ScheduledStartTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_SCHEDULEDSTARTTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_SCHEDULEDSTARTTIME + " could not be found");
    		
		} else if (!CIM_JobHelper.isValid_ScheduledStartTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Job.CIM_PROPERTY_SCHEDULEDSTARTTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_SCHEDULEDSTARTTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute StartTime
	
	public Calendar get_StartTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_STARTTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_STARTTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_STARTTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_StartTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_STARTTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_STARTTIME + " could not be found");
    		
		} else if (!CIM_JobHelper.isValid_StartTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Job.CIM_PROPERTY_STARTTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_STARTTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute TimeSubmitted
	
	public Calendar get_TimeSubmitted() {

		CIMProperty property = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_TIMESUBMITTED);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_TIMESUBMITTED + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_TIMESUBMITTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_TimeSubmitted(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_TIMESUBMITTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_TIMESUBMITTED + " could not be found");
    		
		} else if (!CIM_JobHelper.isValid_TimeSubmitted(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Job.CIM_PROPERTY_TIMESUBMITTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_TIMESUBMITTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute UntilTime
	
	public Calendar get_UntilTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_UNTILTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_UNTILTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_UNTILTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_UntilTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Job.CIM_PROPERTY_UNTILTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Job.CIM_PROPERTY_UNTILTIME + " could not be found");
    		
		} else if (!CIM_JobHelper.isValid_UntilTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Job.CIM_PROPERTY_UNTILTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Job.CIM_PROPERTY_UNTILTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt32 invoke_killJob(CIMClient cimClient, Boolean DeleteOnKill) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_Job.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_DeleteOnKill = new CIMValue(DeleteOnKill, new CIMDataType(CIMDataType.BOOLEAN));
		
	  	inParameter.add(new CIMArgument("DeleteOnKill", cimValue_DeleteOnKill));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_KILLJOB,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_Job.CIM_METHOD_KILLJOB + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_Job.CIM_METHOD_KILLJOB + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_Job.CIM_METHOD_KILLJOB + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
