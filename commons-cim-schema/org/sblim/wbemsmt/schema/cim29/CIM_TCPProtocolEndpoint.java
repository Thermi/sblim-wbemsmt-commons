/** 
 * CIM_TCPProtocolEndpoint.java
 *
 * � Copyright IBM Corp. 2005
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
 * Description: A protocol endpoint that is dedicated to running TCP.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_TCPProtocolEndpoint extends CIM_ProtocolEndpoint  {
	
	public final static String CIM_CLASS_NAME = "CIM_TCPProtocolEndpoint";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	The TCP port number.
	*/
	public final static String CIM_PROPERTY_PORTNUMBER = "PortNumber"; //$NON-NLS-1$
	/**
	*	ProtocolIFType's enumeration is limited to TCP and reserved values for this subclass of ProtocolEndpoint.
	*/
	public final static String CIM_PROPERTY_PROTOCOLIFTYPE = "ProtocolIFType"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_PORTNUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROTOCOLIFTYPE);
				
		for (int i = 0; i < CIM_ProtocolEndpoint.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PORTNUMBER)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROTOCOLIFTYPE)){
				continue;
			}
			
			CIM_TCPProtocolEndpoint.CIM_PropertyNameList.add(CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PORTNUMBER, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROTOCOLIFTYPE, new CIMValue(new UnsignedInt16("4111"), new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_ProtocolEndpoint.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PORTNUMBER)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROTOCOLIFTYPE)){
				continue;
			}
			
			CIM_TCPProtocolEndpoint.CIM_PropertyList.add(CIM_ProtocolEndpoint.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_ProtocolEndpoint.Java_Package_List.size(); i++) {
			if (((String)CIM_ProtocolEndpoint.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_ProtocolEndpoint.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_PROTOCOLIFTYPE = {"Other","IANA Reserved","TCP","DMTF Reserved","Vendor Reserved"};
	
	
	public final static String PROTOCOLIFTYPE_OTHER = "1";
	public final static String PROTOCOLIFTYPE_IANARESERVED = "225..4095";
	public final static String PROTOCOLIFTYPE_TCP = "4111";
	public final static String PROTOCOLIFTYPE_DMTFRESERVED = "4301..32767";
	public final static String PROTOCOLIFTYPE_VENDORRESERVED = "32768..";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_TCPProtocolEndpoint() {

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
	public CIM_TCPProtocolEndpoint(Vector keyProperties){ 
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
	public CIM_TCPProtocolEndpoint(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_TCPProtocolEndpoint)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_TCPProtocolEndpoint)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_TCPProtocolEndpoint)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_TCPProtocolEndpoint)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_TCPProtocolEndpoint)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_TCPProtocolEndpoint)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_TCPProtocolEndpoint)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_TCPProtocolEndpoint)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_TCPProtocolEndpoint)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_TCPProtocolEndpoint)object).cimObjectPath)) {
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
	
	// Attribute PortNumber
	
	public UnsignedInt32 get_PortNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TCPProtocolEndpoint.CIM_PROPERTY_PORTNUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TCPProtocolEndpoint.CIM_PROPERTY_PORTNUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TCPProtocolEndpoint.CIM_PROPERTY_PORTNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PortNumber(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TCPProtocolEndpoint.CIM_PROPERTY_PORTNUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TCPProtocolEndpoint.CIM_PROPERTY_PORTNUMBER + " could not be found");
    		
		} else if (!CIM_TCPProtocolEndpointHelper.isValid_PortNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TCPProtocolEndpoint.CIM_PROPERTY_PORTNUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TCPProtocolEndpoint.CIM_PROPERTY_PORTNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProtocolIFType
	
	public UnsignedInt16 get_ProtocolIFType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TCPProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TCPProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TCPProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProtocolIFType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_TCPProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_TCPProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE + " could not be found");
    		
		} else if (!CIM_TCPProtocolEndpointHelper.isValid_ProtocolIFType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_TCPProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_TCPProtocolEndpoint.CIM_PROPERTY_PROTOCOLIFTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
