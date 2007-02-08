/** 
 * CIM_ControlledBy.java
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
 * Description: The ControlledBy relationship indicates which Devices are controlled by a CIM_Controller.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.Calendar;


public class CIM_ControlledBy extends CIM_DeviceConnection  {
	
	public final static String CIM_CLASS_NAME = "CIM_ControlledBy";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_PROPERTY_CIM_CONTROLLER = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_LOGICALDEVICE = "Dependent"; //$NON-NLS-1$
	
	
	/**
	*	This property describes the accessibility of the device thru the antedecent controller.
	*/
	public final static String CIM_PROPERTY_ACCESSMODE = "AccessMode"; //$NON-NLS-1$
	/**
	*	The property describes the priority given to accesses of the device thru this controller. The highest priority path will have the lowest value for this parameter.
	*/
	public final static String CIM_PROPERTY_ACCESSPRIORITY = "AccessPriority"; //$NON-NLS-1$
	/**
	*	The State property indicates whether the Controller is actively commanding or accessing the Device (value=1) or not (value=2). Also, the value, "Unknown" (0), can be defined. This information is necessary when a LogicalDevice can be commanded by, or accessed through, multiple Controllers.
	*/
	public final static String CIM_PROPERTY_ACCESSSTATE = "AccessState"; //$NON-NLS-1$
	/**
	*	Address of associated Device in context of the antecedent Controller.
	*/
	public final static String CIM_PROPERTY_DEVICENUMBER = "DeviceNumber"; //$NON-NLS-1$
	/**
	*	Number of hard resets issued by the Controller. A hard reset returns the Device to its initialization or 'boot-up' state. All internal Device state information and data are lost.
	*/
	public final static String CIM_PROPERTY_NUMBEROFHARDRESETS = "NumberOfHardResets"; //$NON-NLS-1$
	/**
	*	Number of soft resets issued by the Controller. A soft reset does not completely clear current Device state and/or data. Exact semantics are dependent on the Device, and on the protocols and mechanisms used to communicate to it.
	*/
	public final static String CIM_PROPERTY_NUMBEROFSOFTRESETS = "NumberOfSoftResets"; //$NON-NLS-1$
	/**
	*	The time that the downstream Device was last reset by the Controller.
	*/
	public final static String CIM_PROPERTY_TIMEOFDEVICERESET = "TimeOfDeviceReset"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ACCESSMODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ACCESSPRIORITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_ACCESSSTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_DEVICENUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_NUMBEROFHARDRESETS);
		CIM_PropertyNameList.add(CIM_PROPERTY_NUMBEROFSOFTRESETS);
		CIM_PropertyNameList.add(CIM_PROPERTY_TIMEOFDEVICERESET);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_CONTROLLER);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_LOGICALDEVICE);
				
		for (int i = 0; i < CIM_DeviceConnection.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_DeviceConnection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACCESSMODE)||
				((String)CIM_DeviceConnection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACCESSPRIORITY)||
				((String)CIM_DeviceConnection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACCESSSTATE)||
				((String)CIM_DeviceConnection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEVICENUMBER)||
				((String)CIM_DeviceConnection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NUMBEROFHARDRESETS)||
				((String)CIM_DeviceConnection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NUMBEROFSOFTRESETS)||
				((String)CIM_DeviceConnection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TIMEOFDEVICERESET)){
				continue;
			}
			
			CIM_ControlledBy.CIM_PropertyNameList.add(CIM_DeviceConnection.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACCESSMODE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACCESSPRIORITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACCESSSTATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEVICENUMBER, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NUMBEROFHARDRESETS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NUMBEROFSOFTRESETS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TIMEOFDEVICERESET, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_CONTROLLER, new CIMValue(null, new CIMDataType(CIM_Controller.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_LOGICALDEVICE, new CIMValue(null, new CIMDataType(CIM_LogicalDevice.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_DeviceConnection.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_DeviceConnection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACCESSMODE)||
				((CIMProperty)CIM_DeviceConnection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACCESSPRIORITY)||
				((CIMProperty)CIM_DeviceConnection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACCESSSTATE)||
				((CIMProperty)CIM_DeviceConnection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEVICENUMBER)||
				((CIMProperty)CIM_DeviceConnection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NUMBEROFHARDRESETS)||
				((CIMProperty)CIM_DeviceConnection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NUMBEROFSOFTRESETS)||
				((CIMProperty)CIM_DeviceConnection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TIMEOFDEVICERESET)){
				continue;
			}
			
			CIM_ControlledBy.CIM_PropertyList.add(CIM_DeviceConnection.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_DeviceConnection.Java_Package_List.size(); i++) {
			if (((String)CIM_DeviceConnection.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_DeviceConnection.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ACCESSMODE = {"ReadWrite","ReadOnly","NoAccess"};
	public final static String[] CIM_VALUEMAP_ACCESSSTATE = {"Unknown","Active","Inactive"};
	
	
	public final static int ACCESSMODE_READWRITE = 2;
	public final static int ACCESSMODE_READONLY = 3;
	public final static int ACCESSMODE_NOACCESS = 4;
	
	public final static int ACCESSSTATE_UNKNOWN = 0;
	public final static int ACCESSSTATE_ACTIVE = 1;
	public final static int ACCESSSTATE_INACTIVE = 2;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ControlledBy() {

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
	public CIM_ControlledBy(Vector keyProperties){ 
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
	public CIM_ControlledBy(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_ControlledBy)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ControlledBy)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ControlledBy)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ControlledBy)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ControlledBy)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ControlledBy)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ControlledBy)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ControlledBy)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ControlledBy)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ControlledBy)object).cimObjectPath)) {
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
	
	// Attribute AccessMode
	
	public UnsignedInt16 get_AccessMode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ControlledBy.CIM_PROPERTY_ACCESSMODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ControlledBy.CIM_PROPERTY_ACCESSMODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ControlledBy.CIM_PROPERTY_ACCESSMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AccessMode(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ControlledBy.CIM_PROPERTY_ACCESSMODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ControlledBy.CIM_PROPERTY_ACCESSMODE + " could not be found");
    		
		} else if (!CIM_ControlledByHelper.isValid_AccessMode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ControlledBy.CIM_PROPERTY_ACCESSMODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ControlledBy.CIM_PROPERTY_ACCESSMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AccessPriority
	
	public UnsignedInt16 get_AccessPriority() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ControlledBy.CIM_PROPERTY_ACCESSPRIORITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ControlledBy.CIM_PROPERTY_ACCESSPRIORITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ControlledBy.CIM_PROPERTY_ACCESSPRIORITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AccessPriority(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ControlledBy.CIM_PROPERTY_ACCESSPRIORITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ControlledBy.CIM_PROPERTY_ACCESSPRIORITY + " could not be found");
    		
		} else if (!CIM_ControlledByHelper.isValid_AccessPriority(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ControlledBy.CIM_PROPERTY_ACCESSPRIORITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ControlledBy.CIM_PROPERTY_ACCESSPRIORITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AccessState
	
	public UnsignedInt16 get_AccessState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ControlledBy.CIM_PROPERTY_ACCESSSTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ControlledBy.CIM_PROPERTY_ACCESSSTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ControlledBy.CIM_PROPERTY_ACCESSSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AccessState(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ControlledBy.CIM_PROPERTY_ACCESSSTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ControlledBy.CIM_PROPERTY_ACCESSSTATE + " could not be found");
    		
		} else if (!CIM_ControlledByHelper.isValid_AccessState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ControlledBy.CIM_PROPERTY_ACCESSSTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ControlledBy.CIM_PROPERTY_ACCESSSTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DeviceNumber
	
	public String get_DeviceNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ControlledBy.CIM_PROPERTY_DEVICENUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ControlledBy.CIM_PROPERTY_DEVICENUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ControlledBy.CIM_PROPERTY_DEVICENUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DeviceNumber(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ControlledBy.CIM_PROPERTY_DEVICENUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ControlledBy.CIM_PROPERTY_DEVICENUMBER + " could not be found");
    		
		} else if (!CIM_ControlledByHelper.isValid_DeviceNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ControlledBy.CIM_PROPERTY_DEVICENUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ControlledBy.CIM_PROPERTY_DEVICENUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NumberOfHardResets
	
	public UnsignedInt32 get_NumberOfHardResets() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ControlledBy.CIM_PROPERTY_NUMBEROFHARDRESETS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ControlledBy.CIM_PROPERTY_NUMBEROFHARDRESETS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ControlledBy.CIM_PROPERTY_NUMBEROFHARDRESETS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NumberOfHardResets(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ControlledBy.CIM_PROPERTY_NUMBEROFHARDRESETS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ControlledBy.CIM_PROPERTY_NUMBEROFHARDRESETS + " could not be found");
    		
		} else if (!CIM_ControlledByHelper.isValid_NumberOfHardResets(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ControlledBy.CIM_PROPERTY_NUMBEROFHARDRESETS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ControlledBy.CIM_PROPERTY_NUMBEROFHARDRESETS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NumberOfSoftResets
	
	public UnsignedInt32 get_NumberOfSoftResets() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ControlledBy.CIM_PROPERTY_NUMBEROFSOFTRESETS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ControlledBy.CIM_PROPERTY_NUMBEROFSOFTRESETS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ControlledBy.CIM_PROPERTY_NUMBEROFSOFTRESETS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NumberOfSoftResets(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ControlledBy.CIM_PROPERTY_NUMBEROFSOFTRESETS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ControlledBy.CIM_PROPERTY_NUMBEROFSOFTRESETS + " could not be found");
    		
		} else if (!CIM_ControlledByHelper.isValid_NumberOfSoftResets(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ControlledBy.CIM_PROPERTY_NUMBEROFSOFTRESETS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ControlledBy.CIM_PROPERTY_NUMBEROFSOFTRESETS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TimeOfDeviceReset
	
	public Calendar get_TimeOfDeviceReset() {

		CIMProperty property = this.cimInstance.getProperty(CIM_ControlledBy.CIM_PROPERTY_TIMEOFDEVICERESET);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ControlledBy.CIM_PROPERTY_TIMEOFDEVICERESET + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ControlledBy.CIM_PROPERTY_TIMEOFDEVICERESET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_TimeOfDeviceReset(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ControlledBy.CIM_PROPERTY_TIMEOFDEVICERESET);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ControlledBy.CIM_PROPERTY_TIMEOFDEVICERESET + " could not be found");
    		
		} else if (!CIM_ControlledByHelper.isValid_TimeOfDeviceReset(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ControlledBy.CIM_PROPERTY_TIMEOFDEVICERESET);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ControlledBy.CIM_PROPERTY_TIMEOFDEVICERESET + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute CIM_Controller
	
	public CIMObjectPath get_CIM_Controller() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ControlledBy.CIM_PROPERTY_CIM_CONTROLLER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ControlledBy.CIM_PROPERTY_CIM_CONTROLLER + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Controller.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ControlledBy.CIM_PROPERTY_CIM_CONTROLLER + " is not of expected type CIM_Controller.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_Controller(CIM_Controller newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ControlledBy.CIM_PROPERTY_CIM_CONTROLLER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ControlledBy.CIM_PROPERTY_CIM_CONTROLLER + " could not be found");
    		
		} else if (!CIM_ControlledByHelper.isValid_CIM_Controller(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ControlledBy.CIM_PROPERTY_CIM_CONTROLLER);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Controller.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ControlledBy.CIM_PROPERTY_CIM_CONTROLLER + " is not of expected type CIM_Controller.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_Controller.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_LogicalDevice
	
	public CIMObjectPath get_CIM_LogicalDevice() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ControlledBy.CIM_PROPERTY_CIM_LOGICALDEVICE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ControlledBy.CIM_PROPERTY_CIM_LOGICALDEVICE + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_LogicalDevice.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ControlledBy.CIM_PROPERTY_CIM_LOGICALDEVICE + " is not of expected type CIM_LogicalDevice.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_LogicalDevice(CIM_LogicalDevice newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ControlledBy.CIM_PROPERTY_CIM_LOGICALDEVICE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ControlledBy.CIM_PROPERTY_CIM_LOGICALDEVICE + " could not be found");
    		
		} else if (!CIM_ControlledByHelper.isValid_CIM_LogicalDevice(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ControlledBy.CIM_PROPERTY_CIM_LOGICALDEVICE);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_LogicalDevice.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ControlledBy.CIM_PROPERTY_CIM_LOGICALDEVICE + " is not of expected type CIM_LogicalDevice.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_LogicalDevice.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
