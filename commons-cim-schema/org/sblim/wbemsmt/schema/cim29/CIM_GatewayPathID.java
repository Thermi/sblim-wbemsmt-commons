/** 
 * CIM_GatewayPathID.java
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
 * Description: GatewayPathID extends StorageHardwareID to name a path segment defined by the end identities, HardwareID and GatewayID. The purpose is to describe Identity to allow access control to be applied to a particular path segment. Think of the element identified by GatewayPathID as a Gateway between a non-trusted world and a trusted world.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_GatewayPathID extends CIM_StorageHardwareID  {
	
	public final static String CIM_CLASS_NAME = "CIM_GatewayPathID";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	The ID representing the Gateway for a path segment from the element identified in the HardwareID property to the Gateway.
	*/
	public final static String CIM_PROPERTY_GATEWAYID = "GatewayID"; //$NON-NLS-1$
	/**
	*	The type of the GatewayID property.
	*/
	public final static String CIM_PROPERTY_GATEWAYIDTYPE = "GatewayIDType"; //$NON-NLS-1$
	/**
	*	The gateway ID type when Gateway IDType is "Other".
	*/
	public final static String CIM_PROPERTY_OTHERGATEWAYIDTYPE = "OtherGatewayIDType"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_GATEWAYID);
		CIM_PropertyNameList.add(CIM_PROPERTY_GATEWAYIDTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERGATEWAYIDTYPE);
				
		for (int i = 0; i < CIM_StorageHardwareID.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_StorageHardwareID.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_GATEWAYID)||
				((String)CIM_StorageHardwareID.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_GATEWAYIDTYPE)||
				((String)CIM_StorageHardwareID.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERGATEWAYIDTYPE)){
				continue;
			}
			
			CIM_GatewayPathID.CIM_PropertyNameList.add(CIM_StorageHardwareID.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_GATEWAYID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_GATEWAYIDTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERGATEWAYIDTYPE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_StorageHardwareID.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_StorageHardwareID.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_GATEWAYID)||
				((CIMProperty)CIM_StorageHardwareID.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_GATEWAYIDTYPE)||
				((CIMProperty)CIM_StorageHardwareID.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERGATEWAYIDTYPE)){
				continue;
			}
			
			CIM_GatewayPathID.CIM_PropertyList.add(CIM_StorageHardwareID.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_StorageHardwareID.Java_Package_List.size(); i++) {
			if (((String)CIM_StorageHardwareID.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_StorageHardwareID.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_GATEWAYIDTYPE = {"Other","PortWWN","NodeWWN","Hostname"};
	
	
	public final static int GATEWAYIDTYPE_OTHER = 1;
	public final static int GATEWAYIDTYPE_PORTWWN = 2;
	public final static int GATEWAYIDTYPE_NODEWWN = 3;
	public final static int GATEWAYIDTYPE_HOSTNAME = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_GatewayPathID() {

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
	public CIM_GatewayPathID(Vector keyProperties){ 
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
	public CIM_GatewayPathID(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_GatewayID = this.cimInstance.getProperty(CIM_PROPERTY_GATEWAYID);
		
		if (CIMProperty_GatewayID == null || CIMProperty_GatewayID.getValue().isEmpty() || CIMProperty_GatewayID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_GATEWAYID, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_GatewayIDType = this.cimInstance.getProperty(CIM_PROPERTY_GATEWAYIDTYPE);
		
		if (CIMProperty_GatewayIDType == null || CIMProperty_GatewayIDType.getValue().isEmpty() || CIMProperty_GatewayIDType.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_GATEWAYIDTYPE, "Required"});
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
	    
	    if (!(object instanceof CIM_GatewayPathID)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_GatewayPathID)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_GatewayPathID)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_GatewayPathID)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_GatewayPathID)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_GatewayPathID)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_GatewayPathID)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_GatewayPathID)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_GatewayPathID)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_GatewayPathID)object).cimObjectPath)) {
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
	
	// Attribute GatewayID
	
	public String get_GatewayID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_GatewayPathID.CIM_PROPERTY_GATEWAYID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_GatewayPathID.CIM_PROPERTY_GATEWAYID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_GatewayPathID.CIM_PROPERTY_GATEWAYID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_GatewayID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_GatewayPathID.CIM_PROPERTY_GATEWAYID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_GatewayPathID.CIM_PROPERTY_GATEWAYID + " could not be found");
    		
		} else if (!CIM_GatewayPathIDHelper.isValid_GatewayID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_GatewayPathID.CIM_PROPERTY_GATEWAYID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_GatewayPathID.CIM_PROPERTY_GATEWAYID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute GatewayIDType
	
	public UnsignedInt16 get_GatewayIDType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_GatewayPathID.CIM_PROPERTY_GATEWAYIDTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_GatewayPathID.CIM_PROPERTY_GATEWAYIDTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_GatewayPathID.CIM_PROPERTY_GATEWAYIDTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_GatewayIDType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_GatewayPathID.CIM_PROPERTY_GATEWAYIDTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_GatewayPathID.CIM_PROPERTY_GATEWAYIDTYPE + " could not be found");
    		
		} else if (!CIM_GatewayPathIDHelper.isValid_GatewayIDType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_GatewayPathID.CIM_PROPERTY_GATEWAYIDTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_GatewayPathID.CIM_PROPERTY_GATEWAYIDTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherGatewayIDType
	
	public String get_OtherGatewayIDType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_GatewayPathID.CIM_PROPERTY_OTHERGATEWAYIDTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_GatewayPathID.CIM_PROPERTY_OTHERGATEWAYIDTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_GatewayPathID.CIM_PROPERTY_OTHERGATEWAYIDTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherGatewayIDType(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_GatewayPathID.CIM_PROPERTY_OTHERGATEWAYIDTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_GatewayPathID.CIM_PROPERTY_OTHERGATEWAYIDTYPE + " could not be found");
    		
		} else if (!CIM_GatewayPathIDHelper.isValid_OtherGatewayIDType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_GatewayPathID.CIM_PROPERTY_OTHERGATEWAYIDTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_GatewayPathID.CIM_PROPERTY_OTHERGATEWAYIDTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
