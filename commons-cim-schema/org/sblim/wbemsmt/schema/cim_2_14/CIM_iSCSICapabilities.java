/** 
 * CIM_iSCSICapabilities.java
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
 * Description:  The capabilites for an iSCSI Network Entity. An instance of this class will be
 * associated by ElementCapabilities to a instance of ComputerSystem that
 * represents the Network Entity. These capability properties are associated to
 * a Network Entity/ComputerSystem since they affect all login negotiations on
 * all iSCSI ProtocolEndpoints aggregated to the system.
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
import org.sblim.wbem.cim.UnsignedInt8;


/**
 *  The capabilites for an iSCSI Network Entity. An instance of this class will be
 * associated by ElementCapabilities to a instance of ComputerSystem that
 * represents the Network Entity. These capability properties are associated to
 * a Network Entity/ComputerSystem since they affect all login negotiations on
 * all iSCSI ProtocolEndpoints aggregated to the system.
 */
public class CIM_iSCSICapabilities extends CIM_Capabilities  {
	
	public final static String CIM_CLASS_NAME = "CIM_iSCSICapabilities"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.11.0";
	
	
	/**
	*	An array containing a list of authentication methods supported by this Network Entity.
	*/
	public final static String CIM_PROPERTY_AUTHENTICATIONMETHODSSUPPORTED = "AuthenticationMethodsSupported"; //$NON-NLS-1$
	/**
	*	The maximum version number of the iSCSI specification such that this iSCSI instance supports this maximum value, the minimum value indicated by the corresponding property MinimumSpecificationVersionSupported, and all versions in between.
	*/
	public final static String CIM_PROPERTY_MAXIMUMSPECIFICATIONVERSIONSUPPORTED = "MaximumSpecificationVersionSupported"; //$NON-NLS-1$
	/**
	*	The minimum version number of the iSCSI specification such that this iSCSI instance supports this minimum value, the maximum value indicated by the corresponding property MaximumSpecificationVersionSupported, and all versions in between.
	*/
	public final static String CIM_PROPERTY_MINIMUMSPECIFICATIONVERSIONSUPPORTED = "MinimumSpecificationVersionSupported"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_AUTHENTICATIONMETHODSSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXIMUMSPECIFICATIONVERSIONSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_MINIMUMSPECIFICATIONVERSIONSUPPORTED);
				
		for (int i = 0; i < CIM_Capabilities.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AUTHENTICATIONMETHODSSUPPORTED)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXIMUMSPECIFICATIONVERSIONSUPPORTED)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MINIMUMSPECIFICATIONVERSIONSUPPORTED)){
				continue;
			}
			
			CIM_iSCSICapabilities.CIM_PropertyNameList.add(CIM_Capabilities.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AUTHENTICATIONMETHODSSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXIMUMSPECIFICATIONVERSIONSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MINIMUMSPECIFICATIONVERSIONSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
				
		for (int i = 0; i < CIM_Capabilities.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AUTHENTICATIONMETHODSSUPPORTED)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXIMUMSPECIFICATIONVERSIONSUPPORTED)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MINIMUMSPECIFICATIONVERSIONSUPPORTED)){
				continue;
			}
			
			CIM_iSCSICapabilities.CIM_PropertyList.add(CIM_Capabilities.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_Capabilities.Java_Package_List.size(); i++) {
			if (((String)CIM_Capabilities.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_Capabilities.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_AUTHENTICATIONMETHODSSUPPORTED = {"(None","SRP","CHAP","Kerberos"};
	
	
	public final static int AUTHENTICATIONMETHODSSUPPORTED_NONE = 2;
	public final static int AUTHENTICATIONMETHODSSUPPORTED_SRP = 3;
	public final static int AUTHENTICATIONMETHODSSUPPORTED_CHAP = 4;
	public final static int AUTHENTICATIONMETHODSSUPPORTED_KERBEROS = 5;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_iSCSICapabilities() {

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
	public CIM_iSCSICapabilities(Vector keyProperties){ 
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
	public CIM_iSCSICapabilities(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_iSCSICapabilities)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_iSCSICapabilities)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_iSCSICapabilities)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_iSCSICapabilities)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_iSCSICapabilities)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_iSCSICapabilities)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_iSCSICapabilities)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_iSCSICapabilities)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_iSCSICapabilities)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_iSCSICapabilities)object).cimObjectPath)) {
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
	
	// Attribute AuthenticationMethodsSupported
	
	public UnsignedInt16[] get_AuthenticationMethodsSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSICapabilities.CIM_PROPERTY_AUTHENTICATIONMETHODSSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSICapabilities.CIM_PROPERTY_AUTHENTICATIONMETHODSSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSICapabilities.CIM_PROPERTY_AUTHENTICATIONMETHODSSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_AuthenticationMethodsSupported(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSICapabilities.CIM_PROPERTY_AUTHENTICATIONMETHODSSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSICapabilities.CIM_PROPERTY_AUTHENTICATIONMETHODSSUPPORTED + " could not be found");
    		
		} else if (!CIM_iSCSICapabilitiesHelper.isValid_AuthenticationMethodsSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSICapabilities.CIM_PROPERTY_AUTHENTICATIONMETHODSSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSICapabilities.CIM_PROPERTY_AUTHENTICATIONMETHODSSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaximumSpecificationVersionSupported
	
	public UnsignedInt8 get_MaximumSpecificationVersionSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSICapabilities.CIM_PROPERTY_MAXIMUMSPECIFICATIONVERSIONSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSICapabilities.CIM_PROPERTY_MAXIMUMSPECIFICATIONVERSIONSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSICapabilities.CIM_PROPERTY_MAXIMUMSPECIFICATIONVERSIONSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaximumSpecificationVersionSupported(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSICapabilities.CIM_PROPERTY_MAXIMUMSPECIFICATIONVERSIONSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSICapabilities.CIM_PROPERTY_MAXIMUMSPECIFICATIONVERSIONSUPPORTED + " could not be found");
    		
		} else if (!CIM_iSCSICapabilitiesHelper.isValid_MaximumSpecificationVersionSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSICapabilities.CIM_PROPERTY_MAXIMUMSPECIFICATIONVERSIONSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSICapabilities.CIM_PROPERTY_MAXIMUMSPECIFICATIONVERSIONSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MinimumSpecificationVersionSupported
	
	public UnsignedInt8 get_MinimumSpecificationVersionSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSICapabilities.CIM_PROPERTY_MINIMUMSPECIFICATIONVERSIONSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSICapabilities.CIM_PROPERTY_MINIMUMSPECIFICATIONVERSIONSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSICapabilities.CIM_PROPERTY_MINIMUMSPECIFICATIONVERSIONSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MinimumSpecificationVersionSupported(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_iSCSICapabilities.CIM_PROPERTY_MINIMUMSPECIFICATIONVERSIONSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_iSCSICapabilities.CIM_PROPERTY_MINIMUMSPECIFICATIONVERSIONSUPPORTED + " could not be found");
    		
		} else if (!CIM_iSCSICapabilitiesHelper.isValid_MinimumSpecificationVersionSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_iSCSICapabilities.CIM_PROPERTY_MINIMUMSPECIFICATIONVERSIONSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_iSCSICapabilities.CIM_PROPERTY_MINIMUMSPECIFICATIONVERSIONSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
