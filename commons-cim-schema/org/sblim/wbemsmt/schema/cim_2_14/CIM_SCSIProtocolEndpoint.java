/** 
 * CIM_SCSIProtocolEndpoint.java
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
 * Description:  A SCSIProtocolEndpoint represents the protocol (command) aspects of a logical
 * SCSI port, independent of the connection/transport. SCSIProtocolEndpoint is
 * either directly or indirectly associated to one or more instances of
 * LogicalPort (via PortImplementsEndpoint) depending on the underlying
 * transport. Indirect associations aggregate one or more LogicalPorts using
 * intermediate ProtocolEndpoints (iSCSI, etc). SCSIProtocolEndpoint is also
 * associated to a SCSIProtocolController, representing the SCSI device.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.cim.UnsignedInt32;


/**
 *  A SCSIProtocolEndpoint represents the protocol (command) aspects of a logical
 * SCSI port, independent of the connection/transport. SCSIProtocolEndpoint is
 * either directly or indirectly associated to one or more instances of
 * LogicalPort (via PortImplementsEndpoint) depending on the underlying
 * transport. Indirect associations aggregate one or more LogicalPorts using
 * intermediate ProtocolEndpoints (iSCSI, etc). SCSIProtocolEndpoint is also
 * associated to a SCSIProtocolController, representing the SCSI device.
 */
public class CIM_SCSIProtocolEndpoint extends CIM_ProtocolEndpoint  {
	
	public final static String CIM_CLASS_NAME = "CIM_SCSIProtocolEndpoint"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.11.0";
	
	
	/**
	*	The supported connection type for this endpoint. The connection type may be needed before the port(s) are associated and also is used in some SCSI commands.
	*/
	public final static String CIM_PROPERTY_CONNECTIONTYPE = "ConnectionType"; //$NON-NLS-1$
	/**
	*	The SCSI identifier for the target or initiator device, in the format appropriate for the ConnectionType. If a ConnectionType specific subclass is defined, the subclass may override Name to define the format. For other ConnectionTypes, the format (and content) should match that of PermamnentAddress of the corresponding LogicalPort.
	*/
	public final static String CIM_PROPERTY_NAME = "Name"; //$NON-NLS-1$
	/**
	*	The connection type, if ConnectionType is "Other".
	*/
	public final static String CIM_PROPERTY_OTHERCONNECTIONTYPE = "OtherConnectionType"; //$NON-NLS-1$
	/**
	*	For iSCSI, each SCSIProtocolEndpoint MUST act as either a target or an initiator endpoint. Other transports allow a SCSI PE to act as both an initiator and target endpoint. This property indicates which role this ProtocolEndpoint implements.
	*/
	public final static String CIM_PROPERTY_ROLE = "Role"; //$NON-NLS-1$
	/**
	*	For ports on a target device, the port number, relative to the storage system. 0 is reserved by T10, 1 is port A, 2 is port B, etc. These numbers are used in SCSI commands that operate on target port groups.
	*/
	public final static String CIM_PROPERTY_TARGETRELATIVEPORTNUMBER = "TargetRelativePortNumber"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CONNECTIONTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERCONNECTIONTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ROLE);
		CIM_PropertyNameList.add(CIM_PROPERTY_TARGETRELATIVEPORTNUMBER);
				
		for (int i = 0; i < CIM_ProtocolEndpoint.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CONNECTIONTYPE)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAME)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERCONNECTIONTYPE)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ROLE)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TARGETRELATIVEPORTNUMBER)){
				continue;
			}
			
			CIM_SCSIProtocolEndpoint.CIM_PropertyNameList.add(CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CONNECTIONTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERCONNECTIONTYPE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ROLE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TARGETRELATIVEPORTNUMBER, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
				
		for (int i = 0; i < CIM_ProtocolEndpoint.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CONNECTIONTYPE)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAME)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERCONNECTIONTYPE)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ROLE)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TARGETRELATIVEPORTNUMBER)){
				continue;
			}
			
			CIM_SCSIProtocolEndpoint.CIM_PropertyList.add(CIM_ProtocolEndpoint.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_ProtocolEndpoint.Java_Package_List.size(); i++) {
			if (((String)CIM_ProtocolEndpoint.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_ProtocolEndpoint.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_CONNECTIONTYPE = {"Other","Fibre Channel","Parallel SCSI","SSA","IEEE 1394","RDMA","iSCSI","SAS","ADT"};
	public final static String[] CIM_VALUEMAP_ROLE = {"Unknown","Initiator","Target","Both Initiator and Target"};
	
	
	public final static int CONNECTIONTYPE_OTHER = 1;
	public final static int CONNECTIONTYPE_FIBRECHANNEL = 2;
	public final static int CONNECTIONTYPE_PARALLELSCSI = 3;
	public final static int CONNECTIONTYPE_SSA = 4;
	public final static int CONNECTIONTYPE_IEEE1394 = 5;
	public final static int CONNECTIONTYPE_RDMA = 6;
	public final static int CONNECTIONTYPE_ISCSI = 7;
	public final static int CONNECTIONTYPE_SAS = 8;
	public final static int CONNECTIONTYPE_ADT = 9;
	
	public final static int ROLE_UNKNOWN = 0;
	public final static int ROLE_INITIATOR = 2;
	public final static int ROLE_TARGET = 3;
	public final static int ROLE_BOTHINITIATORANDTARGET = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_SCSIProtocolEndpoint() {

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
	public CIM_SCSIProtocolEndpoint(Vector keyProperties){ 
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
	public CIM_SCSIProtocolEndpoint(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_SCSIProtocolEndpoint)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_SCSIProtocolEndpoint)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_SCSIProtocolEndpoint)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_SCSIProtocolEndpoint)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_SCSIProtocolEndpoint)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_SCSIProtocolEndpoint)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_SCSIProtocolEndpoint)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_SCSIProtocolEndpoint)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_SCSIProtocolEndpoint)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_SCSIProtocolEndpoint)object).cimObjectPath)) {
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
	
	// Attribute ConnectionType
	
	public UnsignedInt16 get_ConnectionType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIProtocolEndpoint.CIM_PROPERTY_CONNECTIONTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIProtocolEndpoint.CIM_PROPERTY_CONNECTIONTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIProtocolEndpoint.CIM_PROPERTY_CONNECTIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ConnectionType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIProtocolEndpoint.CIM_PROPERTY_CONNECTIONTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIProtocolEndpoint.CIM_PROPERTY_CONNECTIONTYPE + " could not be found");
    		
		} else if (!CIM_SCSIProtocolEndpointHelper.isValid_ConnectionType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SCSIProtocolEndpoint.CIM_PROPERTY_CONNECTIONTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIProtocolEndpoint.CIM_PROPERTY_CONNECTIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Name
	
	public String get_Name() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIProtocolEndpoint.CIM_PROPERTY_NAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIProtocolEndpoint.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIProtocolEndpoint.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Name(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIProtocolEndpoint.CIM_PROPERTY_NAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIProtocolEndpoint.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (!CIM_SCSIProtocolEndpointHelper.isValid_Name(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SCSIProtocolEndpoint.CIM_PROPERTY_NAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIProtocolEndpoint.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherConnectionType
	
	public String get_OtherConnectionType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIProtocolEndpoint.CIM_PROPERTY_OTHERCONNECTIONTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIProtocolEndpoint.CIM_PROPERTY_OTHERCONNECTIONTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIProtocolEndpoint.CIM_PROPERTY_OTHERCONNECTIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherConnectionType(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIProtocolEndpoint.CIM_PROPERTY_OTHERCONNECTIONTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIProtocolEndpoint.CIM_PROPERTY_OTHERCONNECTIONTYPE + " could not be found");
    		
		} else if (!CIM_SCSIProtocolEndpointHelper.isValid_OtherConnectionType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SCSIProtocolEndpoint.CIM_PROPERTY_OTHERCONNECTIONTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIProtocolEndpoint.CIM_PROPERTY_OTHERCONNECTIONTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Role
	
	public UnsignedInt16 get_Role() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIProtocolEndpoint.CIM_PROPERTY_ROLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIProtocolEndpoint.CIM_PROPERTY_ROLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIProtocolEndpoint.CIM_PROPERTY_ROLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Role(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIProtocolEndpoint.CIM_PROPERTY_ROLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIProtocolEndpoint.CIM_PROPERTY_ROLE + " could not be found");
    		
		} else if (!CIM_SCSIProtocolEndpointHelper.isValid_Role(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SCSIProtocolEndpoint.CIM_PROPERTY_ROLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIProtocolEndpoint.CIM_PROPERTY_ROLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TargetRelativePortNumber
	
	public UnsignedInt32 get_TargetRelativePortNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIProtocolEndpoint.CIM_PROPERTY_TARGETRELATIVEPORTNUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIProtocolEndpoint.CIM_PROPERTY_TARGETRELATIVEPORTNUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIProtocolEndpoint.CIM_PROPERTY_TARGETRELATIVEPORTNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TargetRelativePortNumber(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SCSIProtocolEndpoint.CIM_PROPERTY_TARGETRELATIVEPORTNUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SCSIProtocolEndpoint.CIM_PROPERTY_TARGETRELATIVEPORTNUMBER + " could not be found");
    		
		} else if (!CIM_SCSIProtocolEndpointHelper.isValid_TargetRelativePortNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SCSIProtocolEndpoint.CIM_PROPERTY_TARGETRELATIVEPORTNUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SCSIProtocolEndpoint.CIM_PROPERTY_TARGETRELATIVEPORTNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
