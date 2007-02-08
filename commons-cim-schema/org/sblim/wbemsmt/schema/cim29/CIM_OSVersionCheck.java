/** 
 * CIM_OSVersionCheck.java
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
 * Description: The OSVersionCheck class specifies the versions of the operating system that can support/execute this Software Element. The operating system itself (whose version should be validated) is defined in the TargetOperatingSystem property of the Check's scoping SoftwareElement. 
This Check can be for a specific, minimum, maximum or a range of releases of an OS. To identify a specific version of the OS, the minimum and maximum versions must be the same. To specify a minimum, only the minimum version needs to be defined. To specify a maximum version, only the maximum version needs to be defined. To specify a range, both minimum and maximum versions need to be defined. 
The data gathered from the Check and SoftwareElement objects are compared with the corresponding details found in the CIM_OperatingSystem object (referenced by the InstalledOS association), for the CIM_ComputerSystem object that defines the environment. The OSType property of CIM_OperatingSystem must match the value of CIM_SoftwareElement.TargetOperating System. Also, the OS' version information should be within the range of CIM_OSVersionCheck.Minimum/MaximumValue properties. Note that all the operating systems on the relevant computer do not need to satisfy the Check.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_OSVersionCheck extends CIM_Check  {
	
	public final static String CIM_CLASS_NAME = "CIM_OSVersionCheck";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	
	
	/**
	*	Maximum version of the required operating system. The value is encoded as <major>.<minor>.<revision> or <major>.<minor><letter revision>.
	*/
	public final static String CIM_PROPERTY_MAXIMUMVERSION = "MaximumVersion"; //$NON-NLS-1$
	/**
	*	Minimum version of the required operating system. The value is encoded as <major>.<minor>.<revision> or <major>.<minor><letter revision>.
	*/
	public final static String CIM_PROPERTY_MINIMUMVERSION = "MinimumVersion"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXIMUMVERSION);
		CIM_PropertyNameList.add(CIM_PROPERTY_MINIMUMVERSION);
				
		for (int i = 0; i < CIM_Check.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Check.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXIMUMVERSION)||
				((String)CIM_Check.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MINIMUMVERSION)){
				continue;
			}
			
			CIM_OSVersionCheck.CIM_PropertyNameList.add(CIM_Check.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXIMUMVERSION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MINIMUMVERSION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_Check.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Check.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXIMUMVERSION)||
				((CIMProperty)CIM_Check.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MINIMUMVERSION)){
				continue;
			}
			
			CIM_OSVersionCheck.CIM_PropertyList.add(CIM_Check.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Check.Java_Package_List.size(); i++) {
			if (((String)CIM_Check.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Check.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_OSVersionCheck() {

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
	public CIM_OSVersionCheck(Vector keyProperties){ 
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
	public CIM_OSVersionCheck(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_OSVersionCheck)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_OSVersionCheck)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_OSVersionCheck)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_OSVersionCheck)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_OSVersionCheck)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_OSVersionCheck)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_OSVersionCheck)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_OSVersionCheck)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_OSVersionCheck)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_OSVersionCheck)object).cimObjectPath)) {
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
	
	// Attribute MaximumVersion
	
	public String get_MaximumVersion() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSVersionCheck.CIM_PROPERTY_MAXIMUMVERSION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSVersionCheck.CIM_PROPERTY_MAXIMUMVERSION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSVersionCheck.CIM_PROPERTY_MAXIMUMVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaximumVersion(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSVersionCheck.CIM_PROPERTY_MAXIMUMVERSION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSVersionCheck.CIM_PROPERTY_MAXIMUMVERSION + " could not be found");
    		
		} else if (!CIM_OSVersionCheckHelper.isValid_MaximumVersion(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OSVersionCheck.CIM_PROPERTY_MAXIMUMVERSION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSVersionCheck.CIM_PROPERTY_MAXIMUMVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MinimumVersion
	
	public String get_MinimumVersion() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSVersionCheck.CIM_PROPERTY_MINIMUMVERSION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSVersionCheck.CIM_PROPERTY_MINIMUMVERSION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSVersionCheck.CIM_PROPERTY_MINIMUMVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MinimumVersion(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_OSVersionCheck.CIM_PROPERTY_MINIMUMVERSION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_OSVersionCheck.CIM_PROPERTY_MINIMUMVERSION + " could not be found");
    		
		} else if (!CIM_OSVersionCheckHelper.isValid_MinimumVersion(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_OSVersionCheck.CIM_PROPERTY_MINIMUMVERSION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_OSVersionCheck.CIM_PROPERTY_MINIMUMVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
