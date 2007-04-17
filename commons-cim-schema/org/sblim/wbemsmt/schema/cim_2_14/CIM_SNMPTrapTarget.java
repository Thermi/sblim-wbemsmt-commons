/** 
 * CIM_SNMPTrapTarget.java
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
 * Description:  SNMPTrapTarget contains information describing a remote system, to which
 * Informs and Traps are sent. An SNMPService is related via a
 * ServiceSAPDependency association to one or more instances of this class.
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


/**
 *  SNMPTrapTarget contains information describing a remote system, to which
 * Informs and Traps are sent. An SNMPService is related via a
 * ServiceSAPDependency association to one or more instances of this class.
 */
public class CIM_SNMPTrapTarget extends CIM_RemotePort  {
	
	public final static String CIM_CLASS_NAME = "CIM_SNMPTrapTarget"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	The host address.
	*/
	public final static String CIM_PROPERTY_ACCESSINFO = "AccessInfo"; //$NON-NLS-1$
	/**
	*	A community string/password to send with the trap operation.
	*/
	public final static String CIM_PROPERTY_COMMUNITYSTRING = "CommunityString"; //$NON-NLS-1$
	/**
	*	Allows the selection of the notification message - Traps or Informs. By default, Traps are selected.
	*/
	public final static String CIM_PROPERTY_NOTIFICATIONMESSAGE = "NotificationMessage"; //$NON-NLS-1$
	/**
	*	The UDP port number to which the traps/informs are sent. The default is port 162.
	*/
	public final static String CIM_PROPERTY_PORTINFO = "PortInfo"; //$NON-NLS-1$
	/**
	*	A UDP port to which the traps/informs are sent.
	*/
	public final static String CIM_PROPERTY_PORTPROTOCOL = "PortProtocol"; //$NON-NLS-1$
	/**
	*	The SNMP version used to send the traps or informs. Note that v1 does not support informs.
	*/
	public final static String CIM_PROPERTY_SNMPVERSION = "SNMPVersion"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ACCESSINFO);
		CIM_PropertyNameList.add(CIM_PROPERTY_COMMUNITYSTRING);
		CIM_PropertyNameList.add(CIM_PROPERTY_NOTIFICATIONMESSAGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_PORTINFO);
		CIM_PropertyNameList.add(CIM_PROPERTY_PORTPROTOCOL);
		CIM_PropertyNameList.add(CIM_PROPERTY_SNMPVERSION);
				
		for (int i = 0; i < CIM_RemotePort.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_RemotePort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACCESSINFO)||
				((String)CIM_RemotePort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_COMMUNITYSTRING)||
				((String)CIM_RemotePort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NOTIFICATIONMESSAGE)||
				((String)CIM_RemotePort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PORTINFO)||
				((String)CIM_RemotePort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PORTPROTOCOL)||
				((String)CIM_RemotePort.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SNMPVERSION)){
				continue;
			}
			
			CIM_SNMPTrapTarget.CIM_PropertyNameList.add(CIM_RemotePort.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACCESSINFO, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_COMMUNITYSTRING, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NOTIFICATIONMESSAGE, new CIMValue(new UnsignedInt16("1"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PORTINFO, new CIMValue("162", new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PORTPROTOCOL, new CIMValue(new UnsignedInt16("3"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SNMPVERSION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_RemotePort.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_RemotePort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACCESSINFO)||
				((CIMProperty)CIM_RemotePort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_COMMUNITYSTRING)||
				((CIMProperty)CIM_RemotePort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NOTIFICATIONMESSAGE)||
				((CIMProperty)CIM_RemotePort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PORTINFO)||
				((CIMProperty)CIM_RemotePort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PORTPROTOCOL)||
				((CIMProperty)CIM_RemotePort.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SNMPVERSION)){
				continue;
			}
			
			CIM_SNMPTrapTarget.CIM_PropertyList.add(CIM_RemotePort.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_RemotePort.Java_Package_List.size(); i++) {
			if (((String)CIM_RemotePort.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_RemotePort.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_NOTIFICATIONMESSAGE = {"Traps","Informs"};
	public final static String[] CIM_VALUEMAP_SNMPVERSION = {"v1","v2C","v3"};
	
	
	public final static int NOTIFICATIONMESSAGE_TRAPS = 1;
	public final static int NOTIFICATIONMESSAGE_INFORMS = 2;
	
	public final static int SNMPVERSION_V1 = 1;
	public final static int SNMPVERSION_V2C = 2;
	public final static int SNMPVERSION_V3 = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_SNMPTrapTarget() {

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
	public CIM_SNMPTrapTarget(Vector keyProperties){ 
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
	public CIM_SNMPTrapTarget(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_SNMPTrapTarget)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_SNMPTrapTarget)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_SNMPTrapTarget)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_SNMPTrapTarget)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_SNMPTrapTarget)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_SNMPTrapTarget)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_SNMPTrapTarget)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_SNMPTrapTarget)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_SNMPTrapTarget)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_SNMPTrapTarget)object).cimObjectPath)) {
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
	
	// Attribute AccessInfo
	
	public String get_AccessInfo() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPTrapTarget.CIM_PROPERTY_ACCESSINFO);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapTarget.CIM_PROPERTY_ACCESSINFO + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapTarget.CIM_PROPERTY_ACCESSINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AccessInfo(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPTrapTarget.CIM_PROPERTY_ACCESSINFO);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapTarget.CIM_PROPERTY_ACCESSINFO + " could not be found");
    		
		} else if (!CIM_SNMPTrapTargetHelper.isValid_AccessInfo(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SNMPTrapTarget.CIM_PROPERTY_ACCESSINFO);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapTarget.CIM_PROPERTY_ACCESSINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CommunityString
	
	public String get_CommunityString() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPTrapTarget.CIM_PROPERTY_COMMUNITYSTRING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapTarget.CIM_PROPERTY_COMMUNITYSTRING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapTarget.CIM_PROPERTY_COMMUNITYSTRING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CommunityString(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPTrapTarget.CIM_PROPERTY_COMMUNITYSTRING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapTarget.CIM_PROPERTY_COMMUNITYSTRING + " could not be found");
    		
		} else if (!CIM_SNMPTrapTargetHelper.isValid_CommunityString(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SNMPTrapTarget.CIM_PROPERTY_COMMUNITYSTRING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapTarget.CIM_PROPERTY_COMMUNITYSTRING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NotificationMessage
	
	public UnsignedInt16 get_NotificationMessage() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPTrapTarget.CIM_PROPERTY_NOTIFICATIONMESSAGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapTarget.CIM_PROPERTY_NOTIFICATIONMESSAGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapTarget.CIM_PROPERTY_NOTIFICATIONMESSAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NotificationMessage(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPTrapTarget.CIM_PROPERTY_NOTIFICATIONMESSAGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapTarget.CIM_PROPERTY_NOTIFICATIONMESSAGE + " could not be found");
    		
		} else if (!CIM_SNMPTrapTargetHelper.isValid_NotificationMessage(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SNMPTrapTarget.CIM_PROPERTY_NOTIFICATIONMESSAGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapTarget.CIM_PROPERTY_NOTIFICATIONMESSAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PortInfo
	
	public String get_PortInfo() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPTrapTarget.CIM_PROPERTY_PORTINFO);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapTarget.CIM_PROPERTY_PORTINFO + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapTarget.CIM_PROPERTY_PORTINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PortInfo(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPTrapTarget.CIM_PROPERTY_PORTINFO);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapTarget.CIM_PROPERTY_PORTINFO + " could not be found");
    		
		} else if (!CIM_SNMPTrapTargetHelper.isValid_PortInfo(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SNMPTrapTarget.CIM_PROPERTY_PORTINFO);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapTarget.CIM_PROPERTY_PORTINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PortProtocol
	
	public UnsignedInt16 get_PortProtocol() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPTrapTarget.CIM_PROPERTY_PORTPROTOCOL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapTarget.CIM_PROPERTY_PORTPROTOCOL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapTarget.CIM_PROPERTY_PORTPROTOCOL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PortProtocol(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPTrapTarget.CIM_PROPERTY_PORTPROTOCOL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapTarget.CIM_PROPERTY_PORTPROTOCOL + " could not be found");
    		
		} else if (!CIM_SNMPTrapTargetHelper.isValid_PortProtocol(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SNMPTrapTarget.CIM_PROPERTY_PORTPROTOCOL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapTarget.CIM_PROPERTY_PORTPROTOCOL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SNMPVersion
	
	public UnsignedInt16 get_SNMPVersion() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPTrapTarget.CIM_PROPERTY_SNMPVERSION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapTarget.CIM_PROPERTY_SNMPVERSION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapTarget.CIM_PROPERTY_SNMPVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SNMPVersion(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SNMPTrapTarget.CIM_PROPERTY_SNMPVERSION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SNMPTrapTarget.CIM_PROPERTY_SNMPVERSION + " could not be found");
    		
		} else if (!CIM_SNMPTrapTargetHelper.isValid_SNMPVersion(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SNMPTrapTarget.CIM_PROPERTY_SNMPVERSION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SNMPTrapTarget.CIM_PROPERTY_SNMPVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}