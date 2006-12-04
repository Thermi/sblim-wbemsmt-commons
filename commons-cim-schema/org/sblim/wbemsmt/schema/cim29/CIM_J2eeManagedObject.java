/** 
 * CIM_J2eeManagedObject.java
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
 * Description: CIM_J2eeManagedObject is a class for defining operations that may supported by all J2EE managed objects. It contains the attributes and methods that are common to all J2EE managed objects. The J2EE Managed objects - for eg. J2eeServer should participate in instances of the CIM_LogicalIdentity association with the corresponding instance of the J2eeManagedObject class. The start and stop methods of JSR77's J2eeManagedObject find an equivalent in the RequestStateChange method inherited from EnabledLogicalElement. Using Enabled/Disabled as inputs to RequestStateChange, one can effect start and stop.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.Calendar;
import org.sblim.wbem.client.*;



public class CIM_J2eeManagedObject extends CIM_EnabledLogicalElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_J2eeManagedObject";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	The name of a J2EE managed object. The name MUST be constructed using the form specified in JSR77.3.1.1.1 in order to avoid the need for manual key propagation.
	*/
	public final static String CIM_PROPERTY_ELEMENTNAME = "ElementName"; //$NON-NLS-1$
	/**
	*	InstanceID identifies a unique instance of a J2EE ManagedObject's Capabilities in a given namespace. In order to ensure uniqueness, the value of InstanceID MUST be constructed using the form specified in JSR77.3.1.1.1 in order to avoid the need for manual key propagation.
	*/
	public final static String CIM_PROPERTY_INSTANCEID = "InstanceID"; //$NON-NLS-1$
	/**
	*	The current state of the entity for J2ee managed objects that support state management. If the StateManageable property is FALSE, the value of this property MUST be set to 0 - Unknown. The mapping from the J2ee management states to OperationalStatus is as follows - j2ee.state.starting - Starting, j2ee.state.running - OK, j2ee.state.stopping - Stopping, j2ee.state.stopped - Stopped, and j2ee.state.failed - Error.
	*/
	public final static String CIM_PROPERTY_OPERATIONALSTATUS = "OperationalStatus"; //$NON-NLS-1$
	/**
	*	The time that the J2EE managed object was started, represented as a datetime interval measured as the time interval since January 1, 1970, 00:00:00. If the StateManageable property of the CIM_J2eeManagedObjectCapabilities class is false, this value MUST be set to a zero time interval.
	*/
	public final static String CIM_PROPERTY_STARTTIME = "StartTime"; //$NON-NLS-1$
	
	
	/**
	*	This method starts the J2EE managed object. This operation can only be invoked when the OperationalStatus is Stopped. Note that StartService() will not be called on any of the child StateManageable instances that are registered with this instance. It is the responsibility of the calling application to start the child if required. The method returns 0 on success and non-zero for failure.
	*/
	public final static String CIM_METHOD_START = "Start";
	/**
	*	Starts the J2EE managed object. This operation can only be invoked in when State is Stopped. This method, causes State to become Starting initially, and eventually becomes the RUNNING state. Additionally, StartRecursive() is called on all the child StateManageable instances that are registered with this entity and are in the Stopped state. The method returns 0 on success and non-zero for failure.
	*/
	public final static String CIM_METHOD_STARTRECURSIVE = "StartRecursive";
	/**
	*	This method stops the J2EE managed object and all dependent objects that can be identified by following the Dependency/Component associations this object's identity participates in.
	*/
	public final static String CIM_METHOD_STOP = "Stop";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ELEMENTNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_INSTANCEID);
		CIM_PropertyNameList.add(CIM_PROPERTY_OPERATIONALSTATUS);
		CIM_PropertyNameList.add(CIM_PROPERTY_STARTTIME);
				
		for (int i = 0; i < CIM_EnabledLogicalElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ELEMENTNAME)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INSTANCEID)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OPERATIONALSTATUS)||
				((String)CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STARTTIME)){
				continue;
			}
			
			CIM_J2eeManagedObject.CIM_PropertyNameList.add(CIM_EnabledLogicalElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ELEMENTNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INSTANCEID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OPERATIONALSTATUS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STARTTIME, new CIMValue(new CIMSimpleDateTime("00000000000000.000000:000"), new CIMDataType(CIMDataType.DATETIME))));
				
		for (int i = 0; i < CIM_EnabledLogicalElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ELEMENTNAME)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INSTANCEID)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OPERATIONALSTATUS)||
				((CIMProperty)CIM_EnabledLogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STARTTIME)){
				continue;
			}
			
			CIM_J2eeManagedObject.CIM_PropertyList.add(CIM_EnabledLogicalElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_EnabledLogicalElement.Java_Package_List.size(); i++) {
			if (((String)CIM_EnabledLogicalElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_EnabledLogicalElement.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_OPERATIONALSTATUS = {"Unknown","OK","Error","Starting","Stopping","Stopped"};
	
	
	public final static int OPERATIONALSTATUS_UNKNOWN = 0;
	public final static int OPERATIONALSTATUS_OK = 2;
	public final static int OPERATIONALSTATUS_ERROR = 6;
	public final static int OPERATIONALSTATUS_STARTING = 8;
	public final static int OPERATIONALSTATUS_STOPPING = 9;
	public final static int OPERATIONALSTATUS_STOPPED = 10;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_J2eeManagedObject() {

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
	public CIM_J2eeManagedObject(Vector keyProperties){ 
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
	public CIM_J2eeManagedObject(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_J2eeManagedObject)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_J2eeManagedObject)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_J2eeManagedObject)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_J2eeManagedObject)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_J2eeManagedObject)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_J2eeManagedObject)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_J2eeManagedObject)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_J2eeManagedObject)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_J2eeManagedObject)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_J2eeManagedObject)object).cimObjectPath)) {
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
	
	// Attribute ElementName
	
	public String get_ElementName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeManagedObject.CIM_PROPERTY_ELEMENTNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeManagedObject.CIM_PROPERTY_ELEMENTNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeManagedObject.CIM_PROPERTY_ELEMENTNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ElementName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeManagedObject.CIM_PROPERTY_ELEMENTNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeManagedObject.CIM_PROPERTY_ELEMENTNAME + " could not be found");
    		
		} else if (!CIM_J2eeManagedObjectHelper.isValid_ElementName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeManagedObject.CIM_PROPERTY_ELEMENTNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeManagedObject.CIM_PROPERTY_ELEMENTNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InstanceID
	
	public String get_InstanceID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeManagedObject.CIM_PROPERTY_INSTANCEID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeManagedObject.CIM_PROPERTY_INSTANCEID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeManagedObject.CIM_PROPERTY_INSTANCEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InstanceID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeManagedObject.CIM_PROPERTY_INSTANCEID);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_J2eeManagedObject.CIM_PROPERTY_INSTANCEID + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeManagedObject.CIM_PROPERTY_INSTANCEID + " could not be found");
    		
		} else if (!CIM_J2eeManagedObjectHelper.isValid_InstanceID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeManagedObject.CIM_PROPERTY_INSTANCEID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeManagedObject.CIM_PROPERTY_INSTANCEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OperationalStatus
	
	public UnsignedInt16[] get_OperationalStatus() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeManagedObject.CIM_PROPERTY_OPERATIONALSTATUS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeManagedObject.CIM_PROPERTY_OPERATIONALSTATUS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeManagedObject.CIM_PROPERTY_OPERATIONALSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		UnsignedInt16[] resultArray = new UnsignedInt16[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (UnsignedInt16)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_OperationalStatus(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeManagedObject.CIM_PROPERTY_OPERATIONALSTATUS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeManagedObject.CIM_PROPERTY_OPERATIONALSTATUS + " could not be found");
    		
		} else if (!CIM_J2eeManagedObjectHelper.isValid_OperationalStatus(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeManagedObject.CIM_PROPERTY_OPERATIONALSTATUS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeManagedObject.CIM_PROPERTY_OPERATIONALSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute StartTime
	
	public Calendar get_StartTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_J2eeManagedObject.CIM_PROPERTY_STARTTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeManagedObject.CIM_PROPERTY_STARTTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeManagedObject.CIM_PROPERTY_STARTTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_StartTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeManagedObject.CIM_PROPERTY_STARTTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeManagedObject.CIM_PROPERTY_STARTTIME + " could not be found");
    		
		} else if (!CIM_J2eeManagedObjectHelper.isValid_StartTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeManagedObject.CIM_PROPERTY_STARTTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeManagedObject.CIM_PROPERTY_STARTTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt32 invoke_start(CIMClient cimClient) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_J2eeManagedObject.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	
	  	
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_START,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_J2eeManagedObject.CIM_METHOD_START + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_J2eeManagedObject.CIM_METHOD_START + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_J2eeManagedObject.CIM_METHOD_START + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_startRecursive(CIMClient cimClient) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_J2eeManagedObject.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	
	  	
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_STARTRECURSIVE,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_J2eeManagedObject.CIM_METHOD_STARTRECURSIVE + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_J2eeManagedObject.CIM_METHOD_STARTRECURSIVE + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_J2eeManagedObject.CIM_METHOD_STARTRECURSIVE + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_stop(CIMClient cimClient) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_J2eeManagedObject.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	
	  	
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_STOP,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_J2eeManagedObject.CIM_METHOD_STOP + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_J2eeManagedObject.CIM_METHOD_STOP + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_J2eeManagedObject.CIM_METHOD_STOP + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
