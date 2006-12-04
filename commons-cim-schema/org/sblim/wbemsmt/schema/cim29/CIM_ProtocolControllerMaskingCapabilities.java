/** 
 * CIM_ProtocolControllerMaskingCapabilities.java
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
 * Description: A subclass of Capabilities that defines the Masking-related capabilities of a ProtocolController.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_ProtocolControllerMaskingCapabilities extends CIM_Capabilities  {
	
	public final static String CIM_CLASS_NAME = "CIM_ProtocolControllerMaskingCapabilities";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	Set to true if this storage system supports the AttachDevice method.
	*/
	public final static String CIM_PROPERTY_ATTACHDEVICESUPPORTED = "AttachDeviceSupported"; //$NON-NLS-1$
	/**
	*	Set to true if this storage system allows the client to specify the DeviceNumber parameter when calling ControllerConfigurationService.AttachDevice() and ControllerConfigurationService.AttachDevice() and Set to false if the implementation does not allow unit numbers to vary for a ProtocolController. However, if set to false and a Device is not the Dependent of a ProtocolControllerForUnit association, the client must provide a DeviceNumber parameter in ControllerConfigurationService.AttachDevice. If set to false and the Device is already the Dependent of a ProtocolControllerForUnit association, then the client can omit the DeviceNumber parameter (or supply the same value) in subsequent ControllerConfigurationService.AttachDevice calls.
	*/
	public final static String CIM_PROPERTY_CLIENTSELECTABLEDEVICENUMBERS = "ClientSelectableDeviceNumbers"; //$NON-NLS-1$
	/**
	*	Set to true if this storage system limits configurations to a single subject hardware ID per view. Otherwise, multiple hardware ID types can be used. The default is FALSE, that multiple ID types may be used in a single view.
	*/
	public final static String CIM_PROPERTY_ONEHARDWAREIDPERVIEW = "OneHardwareIDPerView"; //$NON-NLS-1$
	/**
	*	An array of strings describing types for valid StorageHardwareID.IDType. Used when the ValidHardwareIdTypes includes 1 ("Other").
	*/
	public final static String CIM_PROPERTY_OTHERVALIDHARDWAREIDTYPES = "OtherValidHardwareIDTypes"; //$NON-NLS-1$
	/**
	*	An integer enumeration indicating the way that ports per view (ProtocolController) are handled by the underlying storage system.
	*/
	public final static String CIM_PROPERTY_PORTSPERVIEW = "PortsPerView"; //$NON-NLS-1$
	/**
	*	Set to true if this storage system allows a client to create a Privilege instance with PrivilegeGranted set to FALSE.
	*/
	public final static String CIM_PROPERTY_PRIVILEGEDENIEDSUPPORTED = "PrivilegeDeniedSupported"; //$NON-NLS-1$
	/**
	*	If true, this property indicates that a Privilege/Identity pair MUST be specified when CreateProtocolControllerWithPorts() is called. If false, then the Privilege/Identity pair in CreateProtocolControllerWithPorts() MUST NOT be set.
	*/
	public final static String CIM_PROPERTY_PROTOCOLCONTROLLERREQUIRESAUTHORIZEDIDENTITY = "ProtocolControllerRequiresAuthorizedIdentity"; //$NON-NLS-1$
	/**
	*	If true, this property indicates that the Identity parameter of CreateProtocolConntrollerWithPorts() MUST contain a reference to a CIM_Collection (or subclass) or to a CIM_Identity (or subclass).
	*/
	public final static String CIM_PROPERTY_PROTOCOLCONTROLLERSUPPORTSCOLLECTIONS = "ProtocolControllerSupportsCollections"; //$NON-NLS-1$
	/**
	*	When set to false, different ProtocolContollers attached to a LogicalPort can expose the same unit numbers. If true, then this storage system requires unique unit numbers across all the ProtocolControllers connected to a LogicalPort.
	*/
	public final static String CIM_PROPERTY_UNIQUEUNITNUMBERSPERPORT = "UniqueUnitNumbersPerPort"; //$NON-NLS-1$
	/**
	*	A list of the valid values for StrorageHardwareID.IDType.
	*/
	public final static String CIM_PROPERTY_VALIDHARDWAREIDTYPES = "ValidHardwareIdTypes"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ATTACHDEVICESUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLIENTSELECTABLEDEVICENUMBERS);
		CIM_PropertyNameList.add(CIM_PROPERTY_ONEHARDWAREIDPERVIEW);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERVALIDHARDWAREIDTYPES);
		CIM_PropertyNameList.add(CIM_PROPERTY_PORTSPERVIEW);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRIVILEGEDENIEDSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROTOCOLCONTROLLERREQUIRESAUTHORIZEDIDENTITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROTOCOLCONTROLLERSUPPORTSCOLLECTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_UNIQUEUNITNUMBERSPERPORT);
		CIM_PropertyNameList.add(CIM_PROPERTY_VALIDHARDWAREIDTYPES);
				
		for (int i = 0; i < CIM_Capabilities.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ATTACHDEVICESUPPORTED)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLIENTSELECTABLEDEVICENUMBERS)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ONEHARDWAREIDPERVIEW)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERVALIDHARDWAREIDTYPES)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PORTSPERVIEW)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRIVILEGEDENIEDSUPPORTED)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROTOCOLCONTROLLERREQUIRESAUTHORIZEDIDENTITY)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROTOCOLCONTROLLERSUPPORTSCOLLECTIONS)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UNIQUEUNITNUMBERSPERPORT)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VALIDHARDWAREIDTYPES)){
				continue;
			}
			
			CIM_ProtocolControllerMaskingCapabilities.CIM_PropertyNameList.add(CIM_Capabilities.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ATTACHDEVICESUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLIENTSELECTABLEDEVICENUMBERS, new CIMValue(new Boolean("TRUE"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ONEHARDWAREIDPERVIEW, new CIMValue(new Boolean("FALSE"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERVALIDHARDWAREIDTYPES, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PORTSPERVIEW, new CIMValue(new UnsignedInt16("2"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRIVILEGEDENIEDSUPPORTED, new CIMValue(new Boolean("FALSE"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROTOCOLCONTROLLERREQUIRESAUTHORIZEDIDENTITY, new CIMValue(new Boolean("FALSE"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROTOCOLCONTROLLERSUPPORTSCOLLECTIONS, new CIMValue(new Boolean("FALSE"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UNIQUEUNITNUMBERSPERPORT, new CIMValue(new Boolean("FALSE"), new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VALIDHARDWAREIDTYPES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
				
		for (int i = 0; i < CIM_Capabilities.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ATTACHDEVICESUPPORTED)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLIENTSELECTABLEDEVICENUMBERS)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ONEHARDWAREIDPERVIEW)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERVALIDHARDWAREIDTYPES)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PORTSPERVIEW)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRIVILEGEDENIEDSUPPORTED)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROTOCOLCONTROLLERREQUIRESAUTHORIZEDIDENTITY)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROTOCOLCONTROLLERSUPPORTSCOLLECTIONS)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UNIQUEUNITNUMBERSPERPORT)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VALIDHARDWAREIDTYPES)){
				continue;
			}
			
			CIM_ProtocolControllerMaskingCapabilities.CIM_PropertyList.add(CIM_Capabilities.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Capabilities.Java_Package_List.size(); i++) {
			if (((String)CIM_Capabilities.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Capabilities.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_PORTSPERVIEW = {"One Port per View","Multiple Ports per View","All Ports share the same View"};
	public final static String[] CIM_VALUEMAP_VALIDHARDWAREIDTYPES = {"Other","Port WWN","Node WWN","Host Name"};
	
	
	public final static int PORTSPERVIEW_ONEPORTPERVIEW = 2;
	public final static int PORTSPERVIEW_MULTIPLEPORTSPERVIEW = 3;
	public final static int PORTSPERVIEW_ALLPORTSSHARETHESAMEVIEW = 4;
	
	public final static int VALIDHARDWAREIDTYPES_OTHER = 1;
	public final static int VALIDHARDWAREIDTYPES_PORTWWN = 2;
	public final static int VALIDHARDWAREIDTYPES_NODEWWN = 3;
	public final static int VALIDHARDWAREIDTYPES_HOSTNAME = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ProtocolControllerMaskingCapabilities() {

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
	public CIM_ProtocolControllerMaskingCapabilities(Vector keyProperties){ 
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
	public CIM_ProtocolControllerMaskingCapabilities(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_ProtocolControllerMaskingCapabilities)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ProtocolControllerMaskingCapabilities)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ProtocolControllerMaskingCapabilities)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ProtocolControllerMaskingCapabilities)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ProtocolControllerMaskingCapabilities)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ProtocolControllerMaskingCapabilities)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ProtocolControllerMaskingCapabilities)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ProtocolControllerMaskingCapabilities)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ProtocolControllerMaskingCapabilities)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ProtocolControllerMaskingCapabilities)object).cimObjectPath)) {
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
	
	// Attribute AttachDeviceSupported
	
	public Boolean get_AttachDeviceSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_ATTACHDEVICESUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_ATTACHDEVICESUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_ATTACHDEVICESUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AttachDeviceSupported(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_ATTACHDEVICESUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_ATTACHDEVICESUPPORTED + " could not be found");
    		
		} else if (!CIM_ProtocolControllerMaskingCapabilitiesHelper.isValid_AttachDeviceSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_ATTACHDEVICESUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_ATTACHDEVICESUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ClientSelectableDeviceNumbers
	
	public Boolean get_ClientSelectableDeviceNumbers() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_CLIENTSELECTABLEDEVICENUMBERS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_CLIENTSELECTABLEDEVICENUMBERS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_CLIENTSELECTABLEDEVICENUMBERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ClientSelectableDeviceNumbers(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_CLIENTSELECTABLEDEVICENUMBERS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_CLIENTSELECTABLEDEVICENUMBERS + " could not be found");
    		
		} else if (!CIM_ProtocolControllerMaskingCapabilitiesHelper.isValid_ClientSelectableDeviceNumbers(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_CLIENTSELECTABLEDEVICENUMBERS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_CLIENTSELECTABLEDEVICENUMBERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OneHardwareIDPerView
	
	public Boolean get_OneHardwareIDPerView() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_ONEHARDWAREIDPERVIEW);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_ONEHARDWAREIDPERVIEW + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_ONEHARDWAREIDPERVIEW + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OneHardwareIDPerView(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_ONEHARDWAREIDPERVIEW);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_ONEHARDWAREIDPERVIEW + " could not be found");
    		
		} else if (!CIM_ProtocolControllerMaskingCapabilitiesHelper.isValid_OneHardwareIDPerView(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_ONEHARDWAREIDPERVIEW);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_ONEHARDWAREIDPERVIEW + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherValidHardwareIDTypes
	
	public String[] get_OtherValidHardwareIDTypes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_OTHERVALIDHARDWAREIDTYPES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_OTHERVALIDHARDWAREIDTYPES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_OTHERVALIDHARDWAREIDTYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_OtherValidHardwareIDTypes(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_OTHERVALIDHARDWAREIDTYPES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_OTHERVALIDHARDWAREIDTYPES + " could not be found");
    		
		} else if (!CIM_ProtocolControllerMaskingCapabilitiesHelper.isValid_OtherValidHardwareIDTypes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_OTHERVALIDHARDWAREIDTYPES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_OTHERVALIDHARDWAREIDTYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PortsPerView
	
	public UnsignedInt16 get_PortsPerView() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PORTSPERVIEW);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PORTSPERVIEW + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PORTSPERVIEW + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PortsPerView(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PORTSPERVIEW);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PORTSPERVIEW + " could not be found");
    		
		} else if (!CIM_ProtocolControllerMaskingCapabilitiesHelper.isValid_PortsPerView(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PORTSPERVIEW);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PORTSPERVIEW + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PrivilegeDeniedSupported
	
	public Boolean get_PrivilegeDeniedSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PRIVILEGEDENIEDSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PRIVILEGEDENIEDSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PRIVILEGEDENIEDSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PrivilegeDeniedSupported(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PRIVILEGEDENIEDSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PRIVILEGEDENIEDSUPPORTED + " could not be found");
    		
		} else if (!CIM_ProtocolControllerMaskingCapabilitiesHelper.isValid_PrivilegeDeniedSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PRIVILEGEDENIEDSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PRIVILEGEDENIEDSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProtocolControllerRequiresAuthorizedIdentity
	
	public Boolean get_ProtocolControllerRequiresAuthorizedIdentity() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PROTOCOLCONTROLLERREQUIRESAUTHORIZEDIDENTITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PROTOCOLCONTROLLERREQUIRESAUTHORIZEDIDENTITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PROTOCOLCONTROLLERREQUIRESAUTHORIZEDIDENTITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProtocolControllerRequiresAuthorizedIdentity(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PROTOCOLCONTROLLERREQUIRESAUTHORIZEDIDENTITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PROTOCOLCONTROLLERREQUIRESAUTHORIZEDIDENTITY + " could not be found");
    		
		} else if (!CIM_ProtocolControllerMaskingCapabilitiesHelper.isValid_ProtocolControllerRequiresAuthorizedIdentity(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PROTOCOLCONTROLLERREQUIRESAUTHORIZEDIDENTITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PROTOCOLCONTROLLERREQUIRESAUTHORIZEDIDENTITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProtocolControllerSupportsCollections
	
	public Boolean get_ProtocolControllerSupportsCollections() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PROTOCOLCONTROLLERSUPPORTSCOLLECTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PROTOCOLCONTROLLERSUPPORTSCOLLECTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PROTOCOLCONTROLLERSUPPORTSCOLLECTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProtocolControllerSupportsCollections(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PROTOCOLCONTROLLERSUPPORTSCOLLECTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PROTOCOLCONTROLLERSUPPORTSCOLLECTIONS + " could not be found");
    		
		} else if (!CIM_ProtocolControllerMaskingCapabilitiesHelper.isValid_ProtocolControllerSupportsCollections(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PROTOCOLCONTROLLERSUPPORTSCOLLECTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_PROTOCOLCONTROLLERSUPPORTSCOLLECTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UniqueUnitNumbersPerPort
	
	public Boolean get_UniqueUnitNumbersPerPort() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_UNIQUEUNITNUMBERSPERPORT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_UNIQUEUNITNUMBERSPERPORT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_UNIQUEUNITNUMBERSPERPORT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UniqueUnitNumbersPerPort(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_UNIQUEUNITNUMBERSPERPORT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_UNIQUEUNITNUMBERSPERPORT + " could not be found");
    		
		} else if (!CIM_ProtocolControllerMaskingCapabilitiesHelper.isValid_UniqueUnitNumbersPerPort(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_UNIQUEUNITNUMBERSPERPORT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_UNIQUEUNITNUMBERSPERPORT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ValidHardwareIdTypes
	
	public UnsignedInt16[] get_ValidHardwareIdTypes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_VALIDHARDWAREIDTYPES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_VALIDHARDWAREIDTYPES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_VALIDHARDWAREIDTYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_ValidHardwareIdTypes(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_VALIDHARDWAREIDTYPES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_VALIDHARDWAREIDTYPES + " could not be found");
    		
		} else if (!CIM_ProtocolControllerMaskingCapabilitiesHelper.isValid_ValidHardwareIdTypes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_VALIDHARDWAREIDTYPES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ProtocolControllerMaskingCapabilities.CIM_PROPERTY_VALIDHARDWAREIDTYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
