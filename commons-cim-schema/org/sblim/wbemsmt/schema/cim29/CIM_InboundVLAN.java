/** 
 * CIM_InboundVLAN.java
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
 * Description: This class is deprecated in lieu or not being necessary to indicate whether the VLAN is inbound/outbound This association makes explicit the operational dependencies of a SwitchPort when operating in a VLAN. If there is an association between a particular SwitchPort and a particular VLAN, then there is the possibility that a packet received by the port will be assigned to the VLAN (or if the packet already has a VLAN tag, that the packet will not be dropped). If there is no such association, then there is NO possibility that a packet received by the port will progress through the switch having been assigned to the referenced VLAN.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_InboundVLAN extends CIM_SAPSAPDependency  {
	
	public final static String CIM_CLASS_NAME = "CIM_InboundVLAN";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_PROPERTY_CIM_VLAN = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_SWITCHPORT = "Dependent"; //$NON-NLS-1$
	
	
	/**
	*	Default should be TRUE if untagged packets received by the SwitchPort are assigned to the VLAN. For 802.1Q-compliant ports, the Default property should be TRUE on the association instance connecting a SwitchPort to the VLAN corresponding to the port's PVID. Default MUST never be TRUE if Tagged is true -- it applies only to untagged packets.
	*/
	public final static String CIM_PROPERTY_DEFAULT = "Default"; //$NON-NLS-1$
	/**
	*	If TRUE, packets already tagged with this VLAN number will be accepted when arriving at this port. For example, if there is an InboundVLAN association between port 12 and VLAN 7 for which Tagged is true, then when a packet tagged with VLAN 7 arrives at port 12, the packet will be accepted into the switch for further processing. If there is no such association, then the packet will be dropped. 

If FALSE, it means that any untagged packets arriving at this port MIGHT be classified into the associated VLAN. If, for a particular SwitchPort, there is only one instance of the association for which Tagged is FALSE, then all incoming untagged packets will be classified into that VLAN. This is the typical configuration of a non-trunk port in a switch implementing port-based VLANs. If there is more than one such association instance, then the packet MIGHT be classified into any one of them, based on some criterion other than the identity of the switch port. For example, in a MAC-based VLAN switch, the decision would be based on the source MAC address. In a protocol-based VLAN switch, the decision would be based on the values of some set of bits in the packet. 

Note that the MAC address is formatted as twelve hexadecimal digits (e.g., "010203040506"), with each pair representing one of the six octets of the MAC address in "canonical" bit order according to RFC 2469.
	*/
	public final static String CIM_PROPERTY_TAGGED = "Tagged"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DEFAULT);
		CIM_PropertyNameList.add(CIM_PROPERTY_TAGGED);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_VLAN);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_SWITCHPORT);
				
		for (int i = 0; i < CIM_SAPSAPDependency.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SAPSAPDependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DEFAULT)||
				((String)CIM_SAPSAPDependency.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TAGGED)){
				continue;
			}
			
			CIM_InboundVLAN.CIM_PropertyNameList.add(CIM_SAPSAPDependency.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DEFAULT, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TAGGED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_VLAN, new CIMValue(null, new CIMDataType(CIM_VLAN.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_SWITCHPORT, new CIMValue(null, new CIMDataType(CIM_SwitchPort.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_SAPSAPDependency.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SAPSAPDependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DEFAULT)||
				((CIMProperty)CIM_SAPSAPDependency.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TAGGED)){
				continue;
			}
			
			CIM_InboundVLAN.CIM_PropertyList.add(CIM_SAPSAPDependency.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_SAPSAPDependency.Java_Package_List.size(); i++) {
			if (((String)CIM_SAPSAPDependency.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_SAPSAPDependency.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_InboundVLAN() {

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
	public CIM_InboundVLAN(Vector keyProperties){ 
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
	public CIM_InboundVLAN(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_InboundVLAN)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_InboundVLAN)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_InboundVLAN)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_InboundVLAN)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_InboundVLAN)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_InboundVLAN)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_InboundVLAN)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_InboundVLAN)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_InboundVLAN)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_InboundVLAN)object).cimObjectPath)) {
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
	
	// Attribute Default
	
	public Boolean get_Default() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InboundVLAN.CIM_PROPERTY_DEFAULT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InboundVLAN.CIM_PROPERTY_DEFAULT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InboundVLAN.CIM_PROPERTY_DEFAULT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Default(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InboundVLAN.CIM_PROPERTY_DEFAULT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InboundVLAN.CIM_PROPERTY_DEFAULT + " could not be found");
    		
		} else if (!CIM_InboundVLANHelper.isValid_Default(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_InboundVLAN.CIM_PROPERTY_DEFAULT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InboundVLAN.CIM_PROPERTY_DEFAULT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Tagged
	
	public Boolean get_Tagged() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InboundVLAN.CIM_PROPERTY_TAGGED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InboundVLAN.CIM_PROPERTY_TAGGED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InboundVLAN.CIM_PROPERTY_TAGGED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Tagged(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InboundVLAN.CIM_PROPERTY_TAGGED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InboundVLAN.CIM_PROPERTY_TAGGED + " could not be found");
    		
		} else if (!CIM_InboundVLANHelper.isValid_Tagged(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_InboundVLAN.CIM_PROPERTY_TAGGED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InboundVLAN.CIM_PROPERTY_TAGGED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_VLAN
	
	public CIMObjectPath get_CIM_VLAN() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InboundVLAN.CIM_PROPERTY_CIM_VLAN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InboundVLAN.CIM_PROPERTY_CIM_VLAN + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_VLAN.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InboundVLAN.CIM_PROPERTY_CIM_VLAN + " is not of expected type CIM_VLAN.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_VLAN(CIM_VLAN newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InboundVLAN.CIM_PROPERTY_CIM_VLAN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InboundVLAN.CIM_PROPERTY_CIM_VLAN + " could not be found");
    		
		} else if (!CIM_InboundVLANHelper.isValid_CIM_VLAN(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_InboundVLAN.CIM_PROPERTY_CIM_VLAN);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_VLAN.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InboundVLAN.CIM_PROPERTY_CIM_VLAN + " is not of expected type CIM_VLAN.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_VLAN.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_SwitchPort
	
	public CIMObjectPath get_CIM_SwitchPort() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InboundVLAN.CIM_PROPERTY_CIM_SWITCHPORT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InboundVLAN.CIM_PROPERTY_CIM_SWITCHPORT + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SwitchPort.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InboundVLAN.CIM_PROPERTY_CIM_SWITCHPORT + " is not of expected type CIM_SwitchPort.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_SwitchPort(CIM_SwitchPort newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InboundVLAN.CIM_PROPERTY_CIM_SWITCHPORT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InboundVLAN.CIM_PROPERTY_CIM_SWITCHPORT + " could not be found");
    		
		} else if (!CIM_InboundVLANHelper.isValid_CIM_SwitchPort(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_InboundVLAN.CIM_PROPERTY_CIM_SWITCHPORT);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_SwitchPort.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InboundVLAN.CIM_PROPERTY_CIM_SWITCHPORT + " is not of expected type CIM_SwitchPort.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_SwitchPort.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
