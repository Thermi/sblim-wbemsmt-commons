/** 
 * CIM_EnabledLogicalElement.java
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
 * Description: This class extends LogicalElement to abstract the concept of an element that is enabled and disabled, such as a LogicalDevice or a ServiceAccessPoint.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.Calendar;
import org.sblim.wbem.client.*;



public class CIM_EnabledLogicalElement extends CIM_LogicalElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_EnabledLogicalElement";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	An enumerated value indicating an administrator's default/startup configuration for an element's Enabled State. By default, the element is "Enabled" (value=2).
	*/
	public final static String CIM_PROPERTY_ENABLEDDEFAULT = "EnabledDefault"; //$NON-NLS-1$
	/**
	*	EnabledState is an integer enumeration that indicates the enabled/disabled states of an element. It can also indicate the transitions between these requested states. For example, shutting down (value = 4) and starting (value=10) are transient states between enabled and disabled. The following text briefly summarizes the various enabled/disabled states: 
Enabled (2) indicates that the element is/could be executing commands, will process any queued commands, and queues new requests. 
Disabled (3) indicates that the element will not execute commands and will drop any new requests. 
Shutting Down (4) indicates that the element is in the process of going to a Disabled state. 
Not Applicable (5) indicates the element doesn't support being enabled/disabled. 
Enabled but Offline (6) indicates that the element may be completing commands, and will drop any new requests. 
Test (7) indicates that the element is in a test state. 
Deferred (8) indicates that the element may be completing commands, but will queue any new requests. 
Quiesce (9) indicates that the element is enabled but in a restricted mode. The element's behavior is similar to the Enabled state, but it only processes a restricted set of commands. All other requests are queued. 
Starting (10) indicates that the element is in the process of going to an Enabled state. New requests are queued.
	*/
	public final static String CIM_PROPERTY_ENABLEDSTATE = "EnabledState"; //$NON-NLS-1$
	/**
	*	A string describing the element's enabled/disabled state when the EnabledState property is set to 1 ("Other"). This property MUST be set to NULL when EnabledState is any value other than 1.
	*/
	public final static String CIM_PROPERTY_OTHERENABLEDSTATE = "OtherEnabledState"; //$NON-NLS-1$
	/**
	*	RequestedState is an integer enumeration indicating the last requested or desired state for the element. The actual state of the element is represented by EnabledState. This property is provided to compare the last requested and current enabled/disabled states. Note that when EnabledState is set to 5 ("Not Applicable"), then this property has no meaning. By default, the element's RequestedState is 5 ("No Change"). Refer to the EnabledState's property Description for explanations of the values in the RequestedState enumeration. 

It should be noted that there are two new values in RequestedState that build on the statuses of EnabledState. These are "Reboot" (10) and "Reset" (11). The former, Reboot, refers to doing a "Shut Down" and then moving to an "Enabled" state. The latter, Reset, indicates that the element is first "Disabled" and then "Enabled". The distinction between requesting "Shut Down" and "Disabled" should also be noted. The former, Shut Down, requests an orderly transition to the Disabled state, and MAY involve removing power, to completely erase any existing state. The latter, the Disabled state, requests an immediate disabling of the element, such that it will not execute or accept any commands or processing requests. 

This property is set as the result of a method invocation (such as Start or StopService on CIM_Service), or may be overridden and defined as WRITEable in a subclass. The method approach is considered superior to a WRITEable property, since it allows an explicit invocation of the operation and the return of a result code.
	*/
	public final static String CIM_PROPERTY_REQUESTEDSTATE = "RequestedState"; //$NON-NLS-1$
	/**
	*	The date/time when the element's EnabledState last changed. If the state of the element has not changed and this property is populated, then it MUST be set to a 0 interval value. If a state change was requested, but rejected or not yet processed, the property MUST NOT be updated.
	*/
	public final static String CIM_PROPERTY_TIMEOFLASTSTATECHANGE = "TimeOfLastStateChange"; //$NON-NLS-1$
	
	
	/**
	*	Requests that the element's state be changed to the value specified in the RequestedState parameter. When the requested state change takes place, the element's EnabledState and RequestedState will be the same. Invoking the RequestStateChange method multiple times could result in earlier requests being overwritten/lost. 
If 0 is returned, then the task completed successfully and the use of ConcreteJob was not required. If 4096 (0x1000) is returned, then the task will take some time to complete, ConcreteJob will be created, and its reference returned in the output parameter Job. Any other return code indicates an error condition.
	*/
	public final static String CIM_METHOD_REQUESTSTATECHANGE = "RequestStateChange";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ENABLEDDEFAULT);
		CIM_PropertyNameList.add(CIM_PROPERTY_ENABLEDSTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERENABLEDSTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_REQUESTEDSTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMEOFLASTSTATECHANGE);
				
		for (int i = 0; i < CIM_LogicalElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ENABLEDDEFAULT)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ENABLEDSTATE)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERENABLEDSTATE)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REQUESTEDSTATE)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TIMEOFLASTSTATECHANGE)){
				continue;
			}
			
			CIM_EnabledLogicalElement.CIM_PropertyNameList.add(CIM_LogicalElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ENABLEDDEFAULT, new CIMValue(new UnsignedInt16("2"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ENABLEDSTATE, new CIMValue(new UnsignedInt16("5"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERENABLEDSTATE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REQUESTEDSTATE, new CIMValue(new UnsignedInt16("5"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMEOFLASTSTATECHANGE, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
				
		for (int i = 0; i < CIM_LogicalElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ENABLEDDEFAULT)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ENABLEDSTATE)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERENABLEDSTATE)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REQUESTEDSTATE)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TIMEOFLASTSTATECHANGE)){
				continue;
			}
			
			CIM_EnabledLogicalElement.CIM_PropertyList.add(CIM_LogicalElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_LogicalElement.Java_Package_List.size(); i++) {
			if (((String)CIM_LogicalElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_LogicalElement.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ENABLEDDEFAULT = {"Enabled","Disabled","Not Applicable","Enabled but Offline","No Default","DMTF Reserved","Vendor Reserved"};
	public final static String[] CIM_VALUEMAP_ENABLEDSTATE = {"Unknown","Other","Enabled","Disabled","Shutting Down","Not Applicable","Enabled but Offline","In Test","Deferred","Quiesce","Starting","DMTF Reserved","Vendor Reserved"};
	public final static String[] CIM_VALUEMAP_REQUESTEDSTATE = {"Enabled","Disabled","Shut Down","No Change","Offline","Test","Deferred","Quiesce","Reboot","Reset","DMTF Reserved","Vendor Reserved"};
	
	
	public final static String ENABLEDDEFAULT_ENABLED = "2";
	public final static String ENABLEDDEFAULT_DISABLED = "3";
	public final static String ENABLEDDEFAULT_NOTAPPLICABLE = "5";
	public final static String ENABLEDDEFAULT_ENABLEDBUTOFFLINE = "6";
	public final static String ENABLEDDEFAULT_NODEFAULT = "7";
	public final static String ENABLEDDEFAULT_DMTFRESERVED = "8..32767";
	public final static String ENABLEDDEFAULT_VENDORRESERVED = "32768..65535";
	
	public final static String ENABLEDSTATE_UNKNOWN = "0";
	public final static String ENABLEDSTATE_OTHER = "1";
	public final static String ENABLEDSTATE_ENABLED = "2";
	public final static String ENABLEDSTATE_DISABLED = "3";
	public final static String ENABLEDSTATE_SHUTTINGDOWN = "4";
	public final static String ENABLEDSTATE_NOTAPPLICABLE = "5";
	public final static String ENABLEDSTATE_ENABLEDBUTOFFLINE = "6";
	public final static String ENABLEDSTATE_INTEST = "7";
	public final static String ENABLEDSTATE_DEFERRED = "8";
	public final static String ENABLEDSTATE_QUIESCE = "9";
	public final static String ENABLEDSTATE_STARTING = "10";
	public final static String ENABLEDSTATE_DMTFRESERVED = "11..32767";
	public final static String ENABLEDSTATE_VENDORRESERVED = "32768..65535";
	
	public final static String REQUESTEDSTATE_ENABLED = "2";
	public final static String REQUESTEDSTATE_DISABLED = "3";
	public final static String REQUESTEDSTATE_SHUTDOWN = "4";
	public final static String REQUESTEDSTATE_NOCHANGE = "5";
	public final static String REQUESTEDSTATE_OFFLINE = "6";
	public final static String REQUESTEDSTATE_TEST = "7";
	public final static String REQUESTEDSTATE_DEFERRED = "8";
	public final static String REQUESTEDSTATE_QUIESCE = "9";
	public final static String REQUESTEDSTATE_REBOOT = "10";
	public final static String REQUESTEDSTATE_RESET = "11";
	public final static String REQUESTEDSTATE_DMTFRESERVED = "..";
	public final static String REQUESTEDSTATE_VENDORRESERVED = "32768..65535";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_EnabledLogicalElement() {

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
	public CIM_EnabledLogicalElement(Vector keyProperties){ 
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
	public CIM_EnabledLogicalElement(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_EnabledLogicalElement)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_EnabledLogicalElement)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_EnabledLogicalElement)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_EnabledLogicalElement)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_EnabledLogicalElement)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_EnabledLogicalElement)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_EnabledLogicalElement)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_EnabledLogicalElement)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_EnabledLogicalElement)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_EnabledLogicalElement)object).cimObjectPath)) {
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
	
	// Attribute EnabledDefault
	
	public UnsignedInt16 get_EnabledDefault() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EnabledLogicalElement.CIM_PROPERTY_ENABLEDDEFAULT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EnabledLogicalElement.CIM_PROPERTY_ENABLEDDEFAULT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EnabledLogicalElement.CIM_PROPERTY_ENABLEDDEFAULT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EnabledDefault(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EnabledLogicalElement.CIM_PROPERTY_ENABLEDDEFAULT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EnabledLogicalElement.CIM_PROPERTY_ENABLEDDEFAULT + " could not be found");
    		
		} else if (!CIM_EnabledLogicalElementHelper.isValid_EnabledDefault(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EnabledLogicalElement.CIM_PROPERTY_ENABLEDDEFAULT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EnabledLogicalElement.CIM_PROPERTY_ENABLEDDEFAULT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EnabledState
	
	public UnsignedInt16 get_EnabledState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EnabledLogicalElement.CIM_PROPERTY_ENABLEDSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EnabledLogicalElement.CIM_PROPERTY_ENABLEDSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EnabledLogicalElement.CIM_PROPERTY_ENABLEDSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EnabledState(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EnabledLogicalElement.CIM_PROPERTY_ENABLEDSTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EnabledLogicalElement.CIM_PROPERTY_ENABLEDSTATE + " could not be found");
    		
		} else if (!CIM_EnabledLogicalElementHelper.isValid_EnabledState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EnabledLogicalElement.CIM_PROPERTY_ENABLEDSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EnabledLogicalElement.CIM_PROPERTY_ENABLEDSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherEnabledState
	
	public String get_OtherEnabledState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EnabledLogicalElement.CIM_PROPERTY_OTHERENABLEDSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EnabledLogicalElement.CIM_PROPERTY_OTHERENABLEDSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EnabledLogicalElement.CIM_PROPERTY_OTHERENABLEDSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherEnabledState(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EnabledLogicalElement.CIM_PROPERTY_OTHERENABLEDSTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EnabledLogicalElement.CIM_PROPERTY_OTHERENABLEDSTATE + " could not be found");
    		
		} else if (!CIM_EnabledLogicalElementHelper.isValid_OtherEnabledState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EnabledLogicalElement.CIM_PROPERTY_OTHERENABLEDSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EnabledLogicalElement.CIM_PROPERTY_OTHERENABLEDSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RequestedState
	
	public UnsignedInt16 get_RequestedState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EnabledLogicalElement.CIM_PROPERTY_REQUESTEDSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EnabledLogicalElement.CIM_PROPERTY_REQUESTEDSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EnabledLogicalElement.CIM_PROPERTY_REQUESTEDSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RequestedState(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EnabledLogicalElement.CIM_PROPERTY_REQUESTEDSTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EnabledLogicalElement.CIM_PROPERTY_REQUESTEDSTATE + " could not be found");
    		
		} else if (!CIM_EnabledLogicalElementHelper.isValid_RequestedState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EnabledLogicalElement.CIM_PROPERTY_REQUESTEDSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EnabledLogicalElement.CIM_PROPERTY_REQUESTEDSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TimeOfLastStateChange
	
	public Calendar get_TimeOfLastStateChange() {

		CIMProperty property = this.cimInstance.getProperty(CIM_EnabledLogicalElement.CIM_PROPERTY_TIMEOFLASTSTATECHANGE);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EnabledLogicalElement.CIM_PROPERTY_TIMEOFLASTSTATECHANGE + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EnabledLogicalElement.CIM_PROPERTY_TIMEOFLASTSTATECHANGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_TimeOfLastStateChange(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EnabledLogicalElement.CIM_PROPERTY_TIMEOFLASTSTATECHANGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EnabledLogicalElement.CIM_PROPERTY_TIMEOFLASTSTATECHANGE + " could not be found");
    		
		} else if (!CIM_EnabledLogicalElementHelper.isValid_TimeOfLastStateChange(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EnabledLogicalElement.CIM_PROPERTY_TIMEOFLASTSTATECHANGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EnabledLogicalElement.CIM_PROPERTY_TIMEOFLASTSTATECHANGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt32 invoke_requestStateChange(CIMClient cimClient, UnsignedInt16 RequestedState, CIM_ConcreteJob Job, Calendar TimeoutPeriod) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_EnabledLogicalElement.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_RequestedState = new CIMValue(RequestedState, new CIMDataType(CIMDataType.UINT16));
		CIMValue cimValue_Job = new CIMValue(Job.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		CIMValue cimValue_TimeoutPeriod = new CIMValue(TimeoutPeriod, new CIMDataType(CIMDataType.DATETIME));
		
	  	inParameter.add(new CIMArgument("RequestedState", cimValue_RequestedState));
		inParameter.add(new CIMArgument("Job", cimValue_Job));
		inParameter.add(new CIMArgument("TimeoutPeriod", cimValue_TimeoutPeriod));
		
	  	outParameter.add(new CIMArgument("Job", cimValue_Job));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_REQUESTSTATECHANGE,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_EnabledLogicalElement.CIM_METHOD_REQUESTSTATECHANGE + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_EnabledLogicalElement.CIM_METHOD_REQUESTSTATECHANGE + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_EnabledLogicalElement.CIM_METHOD_REQUESTSTATECHANGE + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
