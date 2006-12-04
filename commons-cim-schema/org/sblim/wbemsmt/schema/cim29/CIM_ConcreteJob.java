/** 
 * CIM_ConcreteJob.java
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
 * Description: A concrete version of Job. This class represents a generic and instantiable unit of work, such as a batch or a print job.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.Calendar;
import org.sblim.wbem.client.*;



public class CIM_ConcreteJob extends CIM_Job  {
	
	public final static String CIM_CLASS_NAME = "CIM_ConcreteJob";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.9.0";
	
	
	/**
	*	Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
<OrgID>:<LocalID> 
Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between <OrgID> and <LocalID>. 
<LocalID> is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance's NameSpace. 
For DMTF defined instances, the 'preferred' algorithm MUST be used with the <OrgID> set to 'CIM'.
	*/
	public final static String CIM_PROPERTY_INSTANCEID = "InstanceID"; //$NON-NLS-1$
	/**
	*	JobState is an integer enumeration that indicates the operational state of a Job. It can also indicate transitions between these states, for example, 'Shutting Down' and 'Starting'. Following is a brief description of the states: 
New (2) indicates that the job has never been started. 
Starting (3) indicates that the job is moving from the 'New', 'Suspended', or 'Service' states into the 'Running' state. 
Running (4) indicates that the Job is running. 
Suspended (5) indicates that the Job is stopped, but may be restarted in a seamless manner. 
Shutting Down (6) indicates the job is moving to a 'Completed', 'Terminated', or 'Killed' state. 
Completed (7) indicates that the job has completed normally. 
Terminated (8) indicates that the job has been stopped by a 'Terminate' state change request. The job and all its underlying processes are ended and may be restarted (this is job-specific) only as a new job. 
Killed (9) indicates that the job has been stopped by a 'Kill' state change request. Underlying processes may have been left running and cleanup may be required to free up resources. 
Exception (10) indicates that the Job is in an abnormal state that may be indicative of an error condition. Actual status may be surfaced though job-specific objects. 
Service (11) indicates that the Job is in a vendor-specific state that supports problem discovery and/or resolution.
	*/
	public final static String CIM_PROPERTY_JOBSTATE = "JobState"; //$NON-NLS-1$
	/**
	*	The user friendly name for this instance of Job. In addition, the user friendly name can be used as a property for a search or query. (Note: Name does not have to be unique within a namespace.)
	*/
	public final static String CIM_PROPERTY_NAME = "Name"; //$NON-NLS-1$
	/**
	*	The amount of time the Job is retained after it has finished executing, either succeeding or failing in that execution. The job MUST remain in existence for some period of time regardless of the value of the DeleteOnCompletion property. 
The default is five minutes.
	*/
	public final static String CIM_PROPERTY_TIMEBEFOREREMOVAL = "TimeBeforeRemoval"; //$NON-NLS-1$
	/**
	*	The date/time when the Job's State last changed. If the state of the Job has not changed and this property is populated, then it MUST be set to a 0 interval value. If a state change was requested, but rejected or not yet processed, the property MUST NOT be updated.
	*/
	public final static String CIM_PROPERTY_TIMEOFLASTSTATECHANGE = "TimeOfLastStateChange"; //$NON-NLS-1$
	
	
	/**
	*	Requests that the job's state be changed to the value specified in the RequestedState parameter. Invoking the RequestStateChange method multiple times could result in earlier requests being overwritten/lost. 
If 0 is returned, then the task completed successfully. Any other return code indicates an error condition.
	*/
	public final static String CIM_METHOD_REQUESTSTATECHANGE = "RequestStateChange";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_INSTANCEID);
		CIM_PropertyNameList.add(CIM_PROPERTY_JOBSTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMEBEFOREREMOVAL);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMEOFLASTSTATECHANGE);
				
		for (int i = 0; i < CIM_Job.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Job.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INSTANCEID)||
				((String)CIM_Job.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_JOBSTATE)||
				((String)CIM_Job.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAME)||
				((String)CIM_Job.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TIMEBEFOREREMOVAL)||
				((String)CIM_Job.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TIMEOFLASTSTATECHANGE)){
				continue;
			}
			
			CIM_ConcreteJob.CIM_PropertyNameList.add(CIM_Job.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INSTANCEID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_JOBSTATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMEBEFOREREMOVAL, new CIMValue(new CIMSimpleDateTime("00000000000500.000000:000"), new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMEOFLASTSTATECHANGE, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
				
		for (int i = 0; i < CIM_Job.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Job.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INSTANCEID)||
				((CIMProperty)CIM_Job.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_JOBSTATE)||
				((CIMProperty)CIM_Job.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAME)||
				((CIMProperty)CIM_Job.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TIMEBEFOREREMOVAL)||
				((CIMProperty)CIM_Job.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TIMEOFLASTSTATECHANGE)){
				continue;
			}
			
			CIM_ConcreteJob.CIM_PropertyList.add(CIM_Job.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Job.Java_Package_List.size(); i++) {
			if (((String)CIM_Job.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Job.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_JOBSTATE = {"New","Starting","Running","Suspended","Shutting Down","Completed","Terminated","Killed","Exception","Service","DMTF Reserved","Vendor Reserved"};
	
	
	public final static String JOBSTATE_NEW = "2";
	public final static String JOBSTATE_STARTING = "3";
	public final static String JOBSTATE_RUNNING = "4";
	public final static String JOBSTATE_SUSPENDED = "5";
	public final static String JOBSTATE_SHUTTINGDOWN = "6";
	public final static String JOBSTATE_COMPLETED = "7";
	public final static String JOBSTATE_TERMINATED = "8";
	public final static String JOBSTATE_KILLED = "9";
	public final static String JOBSTATE_EXCEPTION = "10";
	public final static String JOBSTATE_SERVICE = "11";
	public final static String JOBSTATE_DMTFRESERVED = "12..32767";
	public final static String JOBSTATE_VENDORRESERVED = "32768..65535";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ConcreteJob() {

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
	public CIM_ConcreteJob(Vector keyProperties){ 
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
	public CIM_ConcreteJob(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_InstanceID = this.cimInstance.getProperty(CIM_PROPERTY_INSTANCEID);
		
		if (CIMProperty_InstanceID == null || CIMProperty_InstanceID.getValue().isEmpty() || CIMProperty_InstanceID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_INSTANCEID, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_Name = this.cimInstance.getProperty(CIM_PROPERTY_NAME);
		
		if (CIMProperty_Name == null || CIMProperty_Name.getValue().isEmpty() || CIMProperty_Name.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_NAME, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_TimeBeforeRemoval = this.cimInstance.getProperty(CIM_PROPERTY_TIMEBEFOREREMOVAL);
		
		if (CIMProperty_TimeBeforeRemoval == null || CIMProperty_TimeBeforeRemoval.getValue().isEmpty() || CIMProperty_TimeBeforeRemoval.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_TIMEBEFOREREMOVAL, "Required"});
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
	    
	    if (!(object instanceof CIM_ConcreteJob)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ConcreteJob)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ConcreteJob)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ConcreteJob)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ConcreteJob)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ConcreteJob)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ConcreteJob)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ConcreteJob)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ConcreteJob)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ConcreteJob)object).cimObjectPath)) {
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
	
	// Attribute InstanceID
	
	public String get_InstanceID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConcreteJob.CIM_PROPERTY_INSTANCEID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConcreteJob.CIM_PROPERTY_INSTANCEID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConcreteJob.CIM_PROPERTY_INSTANCEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InstanceID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConcreteJob.CIM_PROPERTY_INSTANCEID);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_ConcreteJob.CIM_PROPERTY_INSTANCEID + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConcreteJob.CIM_PROPERTY_INSTANCEID + " could not be found");
    		
		} else if (!CIM_ConcreteJobHelper.isValid_InstanceID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ConcreteJob.CIM_PROPERTY_INSTANCEID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConcreteJob.CIM_PROPERTY_INSTANCEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute JobState
	
	public UnsignedInt16 get_JobState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConcreteJob.CIM_PROPERTY_JOBSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConcreteJob.CIM_PROPERTY_JOBSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConcreteJob.CIM_PROPERTY_JOBSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_JobState(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConcreteJob.CIM_PROPERTY_JOBSTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConcreteJob.CIM_PROPERTY_JOBSTATE + " could not be found");
    		
		} else if (!CIM_ConcreteJobHelper.isValid_JobState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ConcreteJob.CIM_PROPERTY_JOBSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConcreteJob.CIM_PROPERTY_JOBSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Name
	
	public String get_Name() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConcreteJob.CIM_PROPERTY_NAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConcreteJob.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConcreteJob.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Name(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConcreteJob.CIM_PROPERTY_NAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConcreteJob.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (!CIM_ConcreteJobHelper.isValid_Name(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ConcreteJob.CIM_PROPERTY_NAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConcreteJob.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TimeBeforeRemoval
	
	public Calendar get_TimeBeforeRemoval() {

		CIMProperty property = this.cimInstance.getProperty(CIM_ConcreteJob.CIM_PROPERTY_TIMEBEFOREREMOVAL);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConcreteJob.CIM_PROPERTY_TIMEBEFOREREMOVAL + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConcreteJob.CIM_PROPERTY_TIMEBEFOREREMOVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_TimeBeforeRemoval(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConcreteJob.CIM_PROPERTY_TIMEBEFOREREMOVAL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConcreteJob.CIM_PROPERTY_TIMEBEFOREREMOVAL + " could not be found");
    		
		} else if (!CIM_ConcreteJobHelper.isValid_TimeBeforeRemoval(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ConcreteJob.CIM_PROPERTY_TIMEBEFOREREMOVAL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConcreteJob.CIM_PROPERTY_TIMEBEFOREREMOVAL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute TimeOfLastStateChange
	
	public Calendar get_TimeOfLastStateChange() {

		CIMProperty property = this.cimInstance.getProperty(CIM_ConcreteJob.CIM_PROPERTY_TIMEOFLASTSTATECHANGE);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConcreteJob.CIM_PROPERTY_TIMEOFLASTSTATECHANGE + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConcreteJob.CIM_PROPERTY_TIMEOFLASTSTATECHANGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_TimeOfLastStateChange(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ConcreteJob.CIM_PROPERTY_TIMEOFLASTSTATECHANGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ConcreteJob.CIM_PROPERTY_TIMEOFLASTSTATECHANGE + " could not be found");
    		
		} else if (!CIM_ConcreteJobHelper.isValid_TimeOfLastStateChange(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ConcreteJob.CIM_PROPERTY_TIMEOFLASTSTATECHANGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ConcreteJob.CIM_PROPERTY_TIMEOFLASTSTATECHANGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt32 invoke_requestStateChange(CIMClient cimClient, UnsignedInt16 RequestedState, Calendar TimeoutPeriod) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_ConcreteJob.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_RequestedState = new CIMValue(RequestedState, new CIMDataType(CIMDataType.UINT16));
		CIMValue cimValue_TimeoutPeriod = new CIMValue(TimeoutPeriod, new CIMDataType(CIMDataType.DATETIME));
		
	  	inParameter.add(new CIMArgument("RequestedState", cimValue_RequestedState));
		inParameter.add(new CIMArgument("TimeoutPeriod", cimValue_TimeoutPeriod));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_REQUESTSTATECHANGE,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_ConcreteJob.CIM_METHOD_REQUESTSTATECHANGE + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_ConcreteJob.CIM_METHOD_REQUESTSTATECHANGE + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_ConcreteJob.CIM_METHOD_REQUESTSTATECHANGE + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
