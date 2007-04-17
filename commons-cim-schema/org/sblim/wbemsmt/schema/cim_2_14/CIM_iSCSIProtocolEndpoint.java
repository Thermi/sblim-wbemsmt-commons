/** 
 * CIM_iSCSIProtocolEndpoint.java
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
 * Description:  This is an iSCSI-specific SCSIProtocolEndpoint. ConnectionType MUST be 'iSCSI'.
 * An iSCSIProtocolEndpoint represents an iSCSI port, which is the usage of a
 * subset of network portals (TCP+IP ProtocolEndpoints) in a Portal Group by an
 * iSCSI node. The BindsTo associations from iSCSIProtocolEndpoint to
 * TCPProtocolEndpoints makes this relationship explicit. For an iSCSI target,
 * the Identifier property (the Target Portal Group Tag) makes the relationship
 * unique. For an iSCSI initiator, the session identifier makes the initiator
 * port unique within the node.
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
 *  This is an iSCSI-specific SCSIProtocolEndpoint. ConnectionType MUST be 'iSCSI'.
 * An iSCSIProtocolEndpoint represents an iSCSI port, which is the usage of a
 * subset of network portals (TCP+IP ProtocolEndpoints) in a Portal Group by an
 * iSCSI node. The BindsTo associations from iSCSIProtocolEndpoint to
 * TCPProtocolEndpoints makes this relationship explicit. For an iSCSI target,
 * the Identifier property (the Target Portal Group Tag) makes the relationship
 * unique. For an iSCSI initiator, the session identifier makes the initiator
 * port unique within the node.
 */
public class CIM_iSCSIProtocolEndpoint extends CIM_SCSIProtocolEndpoint  {
	
	public final static String CIM_CLASS_NAME = "CIM_iSCSIProtocolEndpoint"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.11.0";
	
	
	/**
	*	If this is an Initiator PE, Identifier MUST contain the ISID, if this is a Target PE, Identifier MUST contain the Target Portal Group Tag (TGPT). Each iSCSIProtocolEndpoint associated to a common SCSIProtocolController (iSCSI node) MUST have a unique Identifier. This field is formatted as 12 hexadecimal digits.
	*/
	public final static String CIM_PROPERTY_IDENTIFIER = "Identifier"; //$NON-NLS-1$
	/**
	*	The format of Name is based on the ConnectionType property. For iSCSI, the Name property of an SCSIProtocolEndpoint MUST contain the iSCSI port name as described in the iSCSI RFC (currently http://www.ietf.org/internet-drafts/draft-ietf- ips-iscsi-20.txt) - 
<iSCSI node name> + 'i,' + ISID for initiators, 
<iSCSI node name> + 't,' + TPGT for targets, 
where <iSCSI node name> can be any of the standard iSCSI name namespaces (eg. iqn, eui); and includes the namespace prefix.
	*/
	public final static String CIM_PROPERTY_NAME = "Name"; //$NON-NLS-1$
	/**
	*	For iSCSI, each SCSIProtocolEndpoint MUST act as either a target or an initiator endpoint.
	*/
	public final static String CIM_PROPERTY_ROLE = "Role"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_IDENTIFIER);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_ROLE);
				
		for (int i = 0; i < CIM_SCSIProtocolEndpoint.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SCSIProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_IDENTIFIER)||
				((String)CIM_SCSIProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAME)||
				((String)CIM_SCSIProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ROLE)){
				continue;
			}
			
			CIM_iSCSIProtocolEndpoint.CIM_PropertyNameList.add(CIM_SCSIProtocolEndpoint.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_IDENTIFIER, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ROLE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_SCSIProtocolEndpoint.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SCSIProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_IDENTIFIER)||
				((CIMProperty)CIM_SCSIProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAME)||
				((CIMProperty)CIM_SCSIProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ROLE)){
				continue;
			}
			
			CIM_iSCSIProtocolEndpoint.CIM_PropertyList.add(CIM_SCSIProtocolEndpoint.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_SCSIProtocolEndpoint.Java_Package_List.size(); i++) {
			if (((String)CIM_SCSIProtocolEndpoint.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_SCSIProtocolEndpoint.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ROLE = {"Initiator","Target"};
	
	
	public final static int ROLE_INITIATOR = 2;
	public final static int ROLE_TARGET = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_iSCSIProtocolEndpoint() {

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
	public CIM_iSCSIProtocolEndpoint(Vector keyProperties){ 
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
	public CIM_iSCSIProtocolEndpoint(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_Identifier = this.cimInstance.getProperty(CIM_PROPERTY_IDENTIFIER);
		
		if (CIMProperty_Identifier == null || CIMProperty_Identifier.getValue().isEmpty() || CIMProperty_Identifier.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_IDENTIFIER, "Required"});
			result = false;
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
	    
	    if (!(object instanceof CIM_iSCSIProtocolEndpoint)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_iSCSIProtocolEndpoint)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_iSCSIProtocolEndpoint)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_iSCSIProtocolEndpoint)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_iSCSIProtocolEndpoint)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_iSCSIProtocolEndpoint)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_iSCSIProtocolEndpoint)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_iSCSIProtocolEndpoint)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_iSCSIProtocolEndpoint)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_iSCSIProtocolEndpoint)object).cimObjectPath)) {
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
	
	// Attribute Identifier
	
	public String get_Identifier() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIProtocolEndpoint.CIM_PROPERTY_IDENTIFIER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIProtocolEndpoint.CIM_PROPERTY_IDENTIFIER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIProtocolEndpoint.CIM_PROPERTY_IDENTIFIER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Identifier(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIProtocolEndpoint.CIM_PROPERTY_IDENTIFIER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIProtocolEndpoint.CIM_PROPERTY_IDENTIFIER + " could not be found");
    		
		} else if (!CIM_iSCSIProtocolEndpointHelper.isValid_Identifier(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSIProtocolEndpoint.CIM_PROPERTY_IDENTIFIER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIProtocolEndpoint.CIM_PROPERTY_IDENTIFIER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Name
	
	public String get_Name() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIProtocolEndpoint.CIM_PROPERTY_NAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIProtocolEndpoint.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIProtocolEndpoint.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Name(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIProtocolEndpoint.CIM_PROPERTY_NAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIProtocolEndpoint.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (!CIM_iSCSIProtocolEndpointHelper.isValid_Name(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSIProtocolEndpoint.CIM_PROPERTY_NAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIProtocolEndpoint.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Role
	
	public UnsignedInt16 get_Role() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIProtocolEndpoint.CIM_PROPERTY_ROLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIProtocolEndpoint.CIM_PROPERTY_ROLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIProtocolEndpoint.CIM_PROPERTY_ROLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Role(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSIProtocolEndpoint.CIM_PROPERTY_ROLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSIProtocolEndpoint.CIM_PROPERTY_ROLE + " could not be found");
    		
		} else if (!CIM_iSCSIProtocolEndpointHelper.isValid_Role(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSIProtocolEndpoint.CIM_PROPERTY_ROLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSIProtocolEndpoint.CIM_PROPERTY_ROLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
