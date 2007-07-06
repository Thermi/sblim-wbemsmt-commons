/** 
 * CIM_PortImplementsEndpoint.java
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
 * Description:  PortImplementsEndpoint associates a LogicalPort with one or more
 * ProtocolEndpoints that are implemented on it. This class specializes the
 * DeviceSAPImplementation association. It indicates that the referenced
 * Endpoint is dependent on the operations of the Port Device.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


/**
 *  PortImplementsEndpoint associates a LogicalPort with one or more
 * ProtocolEndpoints that are implemented on it. This class specializes the
 * DeviceSAPImplementation association. It indicates that the referenced
 * Endpoint is dependent on the operations of the Port Device.
 */
public class CIM_PortImplementsEndpoint extends CIM_DeviceSAPImplementation  {
	
	public final static String CIM_CLASS_NAME = "CIM_PortImplementsEndpoint"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_PROPERTY_CIM_LOGICALPORT = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_PROTOCOLENDPOINT = "Dependent"; //$NON-NLS-1$
	
	
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_LOGICALPORT);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_PROTOCOLENDPOINT);
				
		for (int i = 0; i < CIM_DeviceSAPImplementation.CIM_PropertyNameList.size(); i++) {
			
			CIM_PortImplementsEndpoint.CIM_PropertyNameList.add(CIM_DeviceSAPImplementation.CIM_PropertyNameList.elementAt(i));
		}
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_LOGICALPORT, new CIMValue(null, new CIMDataType(CIM_LogicalPort.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_PROTOCOLENDPOINT, new CIMValue(null, new CIMDataType(CIM_ProtocolEndpoint.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_DeviceSAPImplementation.CIM_PropertyList.size(); i++) {
			
			CIM_PortImplementsEndpoint.CIM_PropertyList.add(CIM_DeviceSAPImplementation.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim29");
				
		String[] parentClassPackageList = CIM_DeviceSAPImplementation.getPackages();
		
		for (int i = 0; i < parentClassPackageList.length; i++) {
			Java_Package_List.add(parentClassPackageList[i]);
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PortImplementsEndpoint() {

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
	public CIM_PortImplementsEndpoint(Vector keyProperties){ 
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
	public CIM_PortImplementsEndpoint(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
		if (cimInstance == null) {
			throw new InvalidParameterException("The cimInstance parameter does not contain a valid reference.");
		
		} else if (cimObjectPath == null){
			throw new InvalidParameterException("The cimObjectPath parameter does not contain a valid reference.");		
		
		} else if (!cimObjectPath.getObjectName().equals(cimInstance.getClassName())) {
			throw new InvalidParameterException("The class name of the instance and the ObjectPath are not the same.");
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
	
	public static void addPackage(String packagename) {
        if (packagename != null) {
            if (!packagename.endsWith(".")) {
                packagename = packagename + ".";
            }
            CIM_PortImplementsEndpoint.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_PortImplementsEndpoint.Java_Package_List.toArray(new String[CIM_PortImplementsEndpoint.Java_Package_List.size()]);
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
	    
	    if (!(object instanceof CIM_PortImplementsEndpoint)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PortImplementsEndpoint)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PortImplementsEndpoint)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PortImplementsEndpoint)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PortImplementsEndpoint)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PortImplementsEndpoint)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PortImplementsEndpoint)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PortImplementsEndpoint)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PortImplementsEndpoint)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PortImplementsEndpoint)object).cimObjectPath)) {
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
	
	// Attribute CIM_LogicalPort
	
	public CIMObjectPath get_CIM_LogicalPort() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PortImplementsEndpoint.CIM_PROPERTY_CIM_LOGICALPORT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PortImplementsEndpoint.CIM_PROPERTY_CIM_LOGICALPORT + " could not be found");
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PortImplementsEndpoint.CIM_PROPERTY_CIM_LOGICALPORT + " is not of expected type CIM_LogicalPort.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_LogicalPort(CIM_LogicalPort newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PortImplementsEndpoint.CIM_PROPERTY_CIM_LOGICALPORT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PortImplementsEndpoint.CIM_PROPERTY_CIM_LOGICALPORT + " could not be found");
    		
		} else if (!CIM_PortImplementsEndpointHelper.isValid_CIM_LogicalPort(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PortImplementsEndpoint.CIM_PROPERTY_CIM_LOGICALPORT);
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PortImplementsEndpoint.CIM_PROPERTY_CIM_LOGICALPORT + " is not of expected type CIM_LogicalPort.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_LogicalPort.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_ProtocolEndpoint
	
	public CIMObjectPath get_CIM_ProtocolEndpoint() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PortImplementsEndpoint.CIM_PROPERTY_CIM_PROTOCOLENDPOINT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PortImplementsEndpoint.CIM_PROPERTY_CIM_PROTOCOLENDPOINT + " could not be found");
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PortImplementsEndpoint.CIM_PROPERTY_CIM_PROTOCOLENDPOINT + " is not of expected type CIM_ProtocolEndpoint.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_ProtocolEndpoint(CIM_ProtocolEndpoint newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PortImplementsEndpoint.CIM_PROPERTY_CIM_PROTOCOLENDPOINT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PortImplementsEndpoint.CIM_PROPERTY_CIM_PROTOCOLENDPOINT + " could not be found");
    		
		} else if (!CIM_PortImplementsEndpointHelper.isValid_CIM_ProtocolEndpoint(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PortImplementsEndpoint.CIM_PROPERTY_CIM_PROTOCOLENDPOINT);
    		
		} else if (currentProperty.getType() == null ) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PortImplementsEndpoint.CIM_PROPERTY_CIM_PROTOCOLENDPOINT + " is not of expected type CIM_ProtocolEndpoint.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_ProtocolEndpoint.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
