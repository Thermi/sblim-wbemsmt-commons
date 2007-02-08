/** 
 * CIM_PortController.java
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
 * Description: PortController is a logical device corresponding to a hardware network port controller. Port controllers provide various features depending on their types and versions.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_PortController extends CIM_Controller  {
	
	public final static String CIM_CLASS_NAME = "CIM_PortController";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	The type or model of the port controller. Specific values will be enumerated in a later release of this schema. When set to 1 ("Other"), the related property OtherControllerType contains a string description of the controller's type.
	*/
	public final static String CIM_PROPERTY_CONTROLLERTYPE = "ControllerType"; //$NON-NLS-1$
	/**
	*	The revision number of the controller.
	*/
	public final static String CIM_PROPERTY_CONTROLLERVERSION = "ControllerVersion"; //$NON-NLS-1$
	/**
	*	A string value for controller types not captured by the ControllerType enumeration. This should only be used when the value of the ControllerType property is set to 1, "Other".
	*/
	public final static String CIM_PROPERTY_OTHERCONTROLLERTYPE = "OtherControllerType"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CONTROLLERTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CONTROLLERVERSION);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERCONTROLLERTYPE);
				
		for (int i = 0; i < CIM_Controller.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CONTROLLERTYPE)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CONTROLLERVERSION)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERCONTROLLERTYPE)){
				continue;
			}
			
			CIM_PortController.CIM_PropertyNameList.add(CIM_Controller.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CONTROLLERTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CONTROLLERVERSION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERCONTROLLERTYPE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_Controller.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CONTROLLERTYPE)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CONTROLLERVERSION)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERCONTROLLERTYPE)){
				continue;
			}
			
			CIM_PortController.CIM_PropertyList.add(CIM_Controller.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Controller.Java_Package_List.size(); i++) {
			if (((String)CIM_Controller.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Controller.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_CONTROLLERTYPE = {"Unknown","Other","Ethernet","IB","FC","FDDI","ATM","Token Ring","Frame Relay"};
	
	
	public final static int CONTROLLERTYPE_UNKNOWN = 0;
	public final static int CONTROLLERTYPE_OTHER = 1;
	public final static int CONTROLLERTYPE_ETHERNET = 2;
	public final static int CONTROLLERTYPE_IB = 3;
	public final static int CONTROLLERTYPE_FC = 4;
	public final static int CONTROLLERTYPE_FDDI = 5;
	public final static int CONTROLLERTYPE_ATM = 6;
	public final static int CONTROLLERTYPE_TOKENRING = 7;
	public final static int CONTROLLERTYPE_FRAMERELAY = 8;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PortController() {

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
	public CIM_PortController(Vector keyProperties){ 
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
	public CIM_PortController(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_PortController)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PortController)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PortController)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PortController)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PortController)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PortController)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PortController)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PortController)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PortController)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PortController)object).cimObjectPath)) {
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
	
	// Attribute ControllerType
	
	public UnsignedInt16 get_ControllerType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PortController.CIM_PROPERTY_CONTROLLERTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PortController.CIM_PROPERTY_CONTROLLERTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PortController.CIM_PROPERTY_CONTROLLERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ControllerType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PortController.CIM_PROPERTY_CONTROLLERTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PortController.CIM_PROPERTY_CONTROLLERTYPE + " could not be found");
    		
		} else if (!CIM_PortControllerHelper.isValid_ControllerType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PortController.CIM_PROPERTY_CONTROLLERTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PortController.CIM_PROPERTY_CONTROLLERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ControllerVersion
	
	public UnsignedInt16 get_ControllerVersion() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PortController.CIM_PROPERTY_CONTROLLERVERSION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PortController.CIM_PROPERTY_CONTROLLERVERSION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PortController.CIM_PROPERTY_CONTROLLERVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ControllerVersion(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PortController.CIM_PROPERTY_CONTROLLERVERSION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PortController.CIM_PROPERTY_CONTROLLERVERSION + " could not be found");
    		
		} else if (!CIM_PortControllerHelper.isValid_ControllerVersion(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PortController.CIM_PROPERTY_CONTROLLERVERSION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PortController.CIM_PROPERTY_CONTROLLERVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherControllerType
	
	public String get_OtherControllerType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PortController.CIM_PROPERTY_OTHERCONTROLLERTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PortController.CIM_PROPERTY_OTHERCONTROLLERTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PortController.CIM_PROPERTY_OTHERCONTROLLERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherControllerType(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PortController.CIM_PROPERTY_OTHERCONTROLLERTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PortController.CIM_PROPERTY_OTHERCONTROLLERTYPE + " could not be found");
    		
		} else if (!CIM_PortControllerHelper.isValid_OtherControllerType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PortController.CIM_PROPERTY_OTHERCONTROLLERTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PortController.CIM_PROPERTY_OTHERCONTROLLERTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
