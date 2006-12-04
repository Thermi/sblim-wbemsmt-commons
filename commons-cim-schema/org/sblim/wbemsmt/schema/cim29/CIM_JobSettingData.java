/** 
 * CIM_JobSettingData.java
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
 * Description: JobSettingData represents job characteristics and scheduling information for a CIM_Job. The settings may be applied to a job handling Service, a JobQueue or other destination to which jobs are submitted, and/or to individual CIM_Jobs. The applicability of the settings are defined using the ElementSettingData relationship. Since the Settings may be defined in several contexts and applied to many types of elements, this class is defined as a subclass of SettingData, versus ScopedSettingData.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_JobSettingData extends CIM_SettingData  {
	
	public final static String CIM_CLASS_NAME = "CIM_JobSettingData";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.9.0";
	
	
	/**
	*	Indicates whether or not the Job should be automatically deleted upon completion. Note that the 'completion' of a recurring job is defined by its JobRunTimes or UntilTime properties, OR when the Job is terminated by manual intervention.
	*/
	public final static String CIM_PROPERTY_DELETEONCOMPLETION = "DeleteOnCompletion"; //$NON-NLS-1$
	/**
	*	A string describing the recovery action when the instance's RecoveryAction property is 1 ("Other").
	*/
	public final static String CIM_PROPERTY_OTHERRECOVERYACTION = "OtherRecoveryAction"; //$NON-NLS-1$
	/**
	*	Describes the recovery setting if the Job does not successfully complete. The possible values are: 
0 = "Unknown", meaning it is unknown as to what recovery action to take 
1 = "Other", indicating that the recovery action will be specified in the property, OtherRecoveryAction 
2 = "Do Not Continue", meaning stop the execution of the job and appropriately update its status 
3 = "Continue With Next Job", meaning continue with the next job in the queue 
4 = "Re-run Job", indicating that the job should be re-run 
5 = "Run Recovery Job", meaning run the Job associated using the RecoveryJob relationship. Note that the recovery Job MUST already be on the queue from which it will run.
	*/
	public final static String CIM_PROPERTY_RECOVERYACTION = "RecoveryAction"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DELETEONCOMPLETION);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERRECOVERYACTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_RECOVERYACTION);
				
		for (int i = 0; i < CIM_SettingData.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DELETEONCOMPLETION)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERRECOVERYACTION)||
				((String)CIM_SettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RECOVERYACTION)){
				continue;
			}
			
			CIM_JobSettingData.CIM_PropertyNameList.add(CIM_SettingData.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DELETEONCOMPLETION, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERRECOVERYACTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RECOVERYACTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_SettingData.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DELETEONCOMPLETION)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERRECOVERYACTION)||
				((CIMProperty)CIM_SettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RECOVERYACTION)){
				continue;
			}
			
			CIM_JobSettingData.CIM_PropertyList.add(CIM_SettingData.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_SettingData.Java_Package_List.size(); i++) {
			if (((String)CIM_SettingData.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_SettingData.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_RECOVERYACTION = {"Unknown","Other","Do Not Continue","Continue With Next Job","Re-run Job","Run Recovery Job"};
	
	
	public final static int RECOVERYACTION_UNKNOWN = 0;
	public final static int RECOVERYACTION_OTHER = 1;
	public final static int RECOVERYACTION_DONOTCONTINUE = 2;
	public final static int RECOVERYACTION_CONTINUEWITHNEXTJOB = 3;
	public final static int RECOVERYACTION_RE_RUNJOB = 4;
	public final static int RECOVERYACTION_RUNRECOVERYJOB = 5;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_JobSettingData() {

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
	public CIM_JobSettingData(Vector keyProperties){ 
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
	public CIM_JobSettingData(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_JobSettingData)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_JobSettingData)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_JobSettingData)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_JobSettingData)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_JobSettingData)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_JobSettingData)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_JobSettingData)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_JobSettingData)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_JobSettingData)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_JobSettingData)object).cimObjectPath)) {
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
	
	// Attribute DeleteOnCompletion
	
	public Boolean get_DeleteOnCompletion() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_JobSettingData.CIM_PROPERTY_DELETEONCOMPLETION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_JobSettingData.CIM_PROPERTY_DELETEONCOMPLETION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_JobSettingData.CIM_PROPERTY_DELETEONCOMPLETION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DeleteOnCompletion(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_JobSettingData.CIM_PROPERTY_DELETEONCOMPLETION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_JobSettingData.CIM_PROPERTY_DELETEONCOMPLETION + " could not be found");
    		
		} else if (!CIM_JobSettingDataHelper.isValid_DeleteOnCompletion(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_JobSettingData.CIM_PROPERTY_DELETEONCOMPLETION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_JobSettingData.CIM_PROPERTY_DELETEONCOMPLETION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherRecoveryAction
	
	public String get_OtherRecoveryAction() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_JobSettingData.CIM_PROPERTY_OTHERRECOVERYACTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_JobSettingData.CIM_PROPERTY_OTHERRECOVERYACTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_JobSettingData.CIM_PROPERTY_OTHERRECOVERYACTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherRecoveryAction(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_JobSettingData.CIM_PROPERTY_OTHERRECOVERYACTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_JobSettingData.CIM_PROPERTY_OTHERRECOVERYACTION + " could not be found");
    		
		} else if (!CIM_JobSettingDataHelper.isValid_OtherRecoveryAction(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_JobSettingData.CIM_PROPERTY_OTHERRECOVERYACTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_JobSettingData.CIM_PROPERTY_OTHERRECOVERYACTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RecoveryAction
	
	public UnsignedInt16 get_RecoveryAction() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_JobSettingData.CIM_PROPERTY_RECOVERYACTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_JobSettingData.CIM_PROPERTY_RECOVERYACTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_JobSettingData.CIM_PROPERTY_RECOVERYACTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RecoveryAction(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_JobSettingData.CIM_PROPERTY_RECOVERYACTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_JobSettingData.CIM_PROPERTY_RECOVERYACTION + " could not be found");
    		
		} else if (!CIM_JobSettingDataHelper.isValid_RecoveryAction(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_JobSettingData.CIM_PROPERTY_RECOVERYACTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_JobSettingData.CIM_PROPERTY_RECOVERYACTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
