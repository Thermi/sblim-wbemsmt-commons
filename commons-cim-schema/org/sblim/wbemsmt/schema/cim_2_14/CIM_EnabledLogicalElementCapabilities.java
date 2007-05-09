/** 
 * CIM_EnabledLogicalElementCapabilities.java
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
 * Description:  EnabledLogicalElementCapabilities describes the capabilities supported for
 * changing the state of the associated EnabledLogicalElement.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


/**
 *  EnabledLogicalElementCapabilities describes the capabilities supported for
 * changing the state of the associated EnabledLogicalElement.
 */
public class CIM_EnabledLogicalElementCapabilities extends CIM_Capabilities  {
	
	public final static String CIM_CLASS_NAME = "CIM_EnabledLogicalElementCapabilities"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.14.0";
	
	
	/**
	*	Boolean indicating whether the ElementName can be modified.
	*/
	public final static String CIM_PROPERTY_ELEMENTNAMEEDITSUPPORTED = "ElementNameEditSupported"; //$NON-NLS-1$
	/**
	*	Maximum supported ElementName length.
	*/
	public final static String CIM_PROPERTY_MAXELEMENTNAMELEN = "MaxElementNameLen"; //$NON-NLS-1$
	/**
	*	RequestedStatesSupported indicates the possible states that can be requested when using the method RequestStateChange on the EnabledLogicalElement.
	*/
	public final static String CIM_PROPERTY_REQUESTEDSTATESSUPPORTED = "RequestedStatesSupported"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ELEMENTNAMEEDITSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXELEMENTNAMELEN);
		CIM_PropertyNameList.add(CIM_PROPERTY_REQUESTEDSTATESSUPPORTED);
				
		for (int i = 0; i < CIM_Capabilities.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ELEMENTNAMEEDITSUPPORTED)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXELEMENTNAMELEN)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REQUESTEDSTATESSUPPORTED)){
				continue;
			}
			
			CIM_EnabledLogicalElementCapabilities.CIM_PropertyNameList.add(CIM_Capabilities.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ELEMENTNAMEEDITSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXELEMENTNAMELEN, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REQUESTEDSTATESSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
				
		for (int i = 0; i < CIM_Capabilities.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ELEMENTNAMEEDITSUPPORTED)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXELEMENTNAMELEN)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REQUESTEDSTATESSUPPORTED)){
				continue;
			}
			
			CIM_EnabledLogicalElementCapabilities.CIM_PropertyList.add(CIM_Capabilities.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim_2_14");
				
		String[] parentClassPackageList = CIM_Capabilities.getPackages();
		
		for (int i = 0; i < parentClassPackageList.length; i++) {
			Java_Package_List.add(parentClassPackageList[i]);
		}
	};
			
	public final static String[] CIM_VALUEMAP_REQUESTEDSTATESSUPPORTED = {"Enabled","Disabled","Shut Down","Offline","Test","Defer","Quiesce","Reboot","Reset"};
	
	
	public final static int REQUESTEDSTATESSUPPORTED_ENABLED = 2;
	public final static int REQUESTEDSTATESSUPPORTED_DISABLED = 3;
	public final static int REQUESTEDSTATESSUPPORTED_SHUTDOWN = 4;
	public final static int REQUESTEDSTATESSUPPORTED_OFFLINE = 6;
	public final static int REQUESTEDSTATESSUPPORTED_TEST = 7;
	public final static int REQUESTEDSTATESSUPPORTED_DEFER = 8;
	public final static int REQUESTEDSTATESSUPPORTED_QUIESCE = 9;
	public final static int REQUESTEDSTATESSUPPORTED_REBOOT = 10;
	public final static int REQUESTEDSTATESSUPPORTED_RESET = 11;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_EnabledLogicalElementCapabilities() {

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
	public CIM_EnabledLogicalElementCapabilities(Vector keyProperties){ 
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
	public CIM_EnabledLogicalElementCapabilities(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
            CIM_EnabledLogicalElementCapabilities.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_EnabledLogicalElementCapabilities.Java_Package_List.toArray(new String[CIM_EnabledLogicalElementCapabilities.Java_Package_List.size()]);
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
	    
	    if (!(object instanceof CIM_EnabledLogicalElementCapabilities)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_EnabledLogicalElementCapabilities)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_EnabledLogicalElementCapabilities)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_EnabledLogicalElementCapabilities)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_EnabledLogicalElementCapabilities)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_EnabledLogicalElementCapabilities)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_EnabledLogicalElementCapabilities)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_EnabledLogicalElementCapabilities)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_EnabledLogicalElementCapabilities)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_EnabledLogicalElementCapabilities)object).cimObjectPath)) {
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
	
	// Attribute ElementNameEditSupported
	
	public Boolean get_ElementNameEditSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EnabledLogicalElementCapabilities.CIM_PROPERTY_ELEMENTNAMEEDITSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EnabledLogicalElementCapabilities.CIM_PROPERTY_ELEMENTNAMEEDITSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EnabledLogicalElementCapabilities.CIM_PROPERTY_ELEMENTNAMEEDITSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ElementNameEditSupported(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EnabledLogicalElementCapabilities.CIM_PROPERTY_ELEMENTNAMEEDITSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EnabledLogicalElementCapabilities.CIM_PROPERTY_ELEMENTNAMEEDITSUPPORTED + " could not be found");
    		
		} else if (!CIM_EnabledLogicalElementCapabilitiesHelper.isValid_ElementNameEditSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EnabledLogicalElementCapabilities.CIM_PROPERTY_ELEMENTNAMEEDITSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EnabledLogicalElementCapabilities.CIM_PROPERTY_ELEMENTNAMEEDITSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxElementNameLen
	
	public UnsignedInt16 get_MaxElementNameLen() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EnabledLogicalElementCapabilities.CIM_PROPERTY_MAXELEMENTNAMELEN);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EnabledLogicalElementCapabilities.CIM_PROPERTY_MAXELEMENTNAMELEN + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EnabledLogicalElementCapabilities.CIM_PROPERTY_MAXELEMENTNAMELEN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxElementNameLen(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EnabledLogicalElementCapabilities.CIM_PROPERTY_MAXELEMENTNAMELEN);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EnabledLogicalElementCapabilities.CIM_PROPERTY_MAXELEMENTNAMELEN + " could not be found");
    		
		} else if (!CIM_EnabledLogicalElementCapabilitiesHelper.isValid_MaxElementNameLen(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EnabledLogicalElementCapabilities.CIM_PROPERTY_MAXELEMENTNAMELEN);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EnabledLogicalElementCapabilities.CIM_PROPERTY_MAXELEMENTNAMELEN + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RequestedStatesSupported
	
	public UnsignedInt16[] get_RequestedStatesSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EnabledLogicalElementCapabilities.CIM_PROPERTY_REQUESTEDSTATESSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EnabledLogicalElementCapabilities.CIM_PROPERTY_REQUESTEDSTATESSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EnabledLogicalElementCapabilities.CIM_PROPERTY_REQUESTEDSTATESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_RequestedStatesSupported(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_EnabledLogicalElementCapabilities.CIM_PROPERTY_REQUESTEDSTATESSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_EnabledLogicalElementCapabilities.CIM_PROPERTY_REQUESTEDSTATESSUPPORTED + " could not be found");
    		
		} else if (!CIM_EnabledLogicalElementCapabilitiesHelper.isValid_RequestedStatesSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_EnabledLogicalElementCapabilities.CIM_PROPERTY_REQUESTEDSTATESSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_EnabledLogicalElementCapabilities.CIM_PROPERTY_REQUESTEDSTATESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
