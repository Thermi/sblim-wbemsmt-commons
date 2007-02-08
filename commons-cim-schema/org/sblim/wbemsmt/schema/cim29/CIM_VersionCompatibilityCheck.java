/** 
 * CIM_VersionCompatibilityCheck.java
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
 * Description: The VersionCompatibilityCheck class specifies whether it is permissible to create the next state of a SoftwareElement.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_VersionCompatibilityCheck extends CIM_Check  {
	
	public final static String CIM_CLASS_NAME = "CIM_VersionCompatibilityCheck";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	
	
	/**
	*	The AllowDownVersion property indicates that this Software Element can transition to its next state even if a higher or later version of the element already exists in the environment.
	*/
	public final static String CIM_PROPERTY_ALLOWDOWNVERSION = "AllowDownVersion"; //$NON-NLS-1$
	/**
	*	The AllowMultipleVersions option controls the ability to configure multiple versions of a SoftwareElement on a system.
	*/
	public final static String CIM_PROPERTY_ALLOWMULTIPLEVERSIONS = "AllowMultipleVersions"; //$NON-NLS-1$
	/**
	*	The Reinstall property indicates that this SoftwareElement can transition to its next state even if an element of the same version already exists in the environment.
	*/
	public final static String CIM_PROPERTY_REINSTALL = "Reinstall"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ALLOWDOWNVERSION);
		CIM_PropertyNameList.add(CIM_PROPERTY_ALLOWMULTIPLEVERSIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_REINSTALL);
				
		for (int i = 0; i < CIM_Check.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Check.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ALLOWDOWNVERSION)||
				((String)CIM_Check.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ALLOWMULTIPLEVERSIONS)||
				((String)CIM_Check.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REINSTALL)){
				continue;
			}
			
			CIM_VersionCompatibilityCheck.CIM_PropertyNameList.add(CIM_Check.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ALLOWDOWNVERSION, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ALLOWMULTIPLEVERSIONS, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REINSTALL, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
				
		for (int i = 0; i < CIM_Check.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Check.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ALLOWDOWNVERSION)||
				((CIMProperty)CIM_Check.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ALLOWMULTIPLEVERSIONS)||
				((CIMProperty)CIM_Check.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REINSTALL)){
				continue;
			}
			
			CIM_VersionCompatibilityCheck.CIM_PropertyList.add(CIM_Check.CIM_PropertyList.elementAt(i));
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
	public CIM_VersionCompatibilityCheck() {

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
	public CIM_VersionCompatibilityCheck(Vector keyProperties){ 
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
	public CIM_VersionCompatibilityCheck(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_VersionCompatibilityCheck)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_VersionCompatibilityCheck)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_VersionCompatibilityCheck)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_VersionCompatibilityCheck)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_VersionCompatibilityCheck)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_VersionCompatibilityCheck)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_VersionCompatibilityCheck)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_VersionCompatibilityCheck)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_VersionCompatibilityCheck)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_VersionCompatibilityCheck)object).cimObjectPath)) {
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
	
	// Attribute AllowDownVersion
	
	public Boolean get_AllowDownVersion() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VersionCompatibilityCheck.CIM_PROPERTY_ALLOWDOWNVERSION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VersionCompatibilityCheck.CIM_PROPERTY_ALLOWDOWNVERSION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VersionCompatibilityCheck.CIM_PROPERTY_ALLOWDOWNVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AllowDownVersion(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VersionCompatibilityCheck.CIM_PROPERTY_ALLOWDOWNVERSION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VersionCompatibilityCheck.CIM_PROPERTY_ALLOWDOWNVERSION + " could not be found");
    		
		} else if (!CIM_VersionCompatibilityCheckHelper.isValid_AllowDownVersion(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VersionCompatibilityCheck.CIM_PROPERTY_ALLOWDOWNVERSION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VersionCompatibilityCheck.CIM_PROPERTY_ALLOWDOWNVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AllowMultipleVersions
	
	public Boolean get_AllowMultipleVersions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VersionCompatibilityCheck.CIM_PROPERTY_ALLOWMULTIPLEVERSIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VersionCompatibilityCheck.CIM_PROPERTY_ALLOWMULTIPLEVERSIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VersionCompatibilityCheck.CIM_PROPERTY_ALLOWMULTIPLEVERSIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AllowMultipleVersions(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VersionCompatibilityCheck.CIM_PROPERTY_ALLOWMULTIPLEVERSIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VersionCompatibilityCheck.CIM_PROPERTY_ALLOWMULTIPLEVERSIONS + " could not be found");
    		
		} else if (!CIM_VersionCompatibilityCheckHelper.isValid_AllowMultipleVersions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VersionCompatibilityCheck.CIM_PROPERTY_ALLOWMULTIPLEVERSIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VersionCompatibilityCheck.CIM_PROPERTY_ALLOWMULTIPLEVERSIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Reinstall
	
	public Boolean get_Reinstall() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VersionCompatibilityCheck.CIM_PROPERTY_REINSTALL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VersionCompatibilityCheck.CIM_PROPERTY_REINSTALL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VersionCompatibilityCheck.CIM_PROPERTY_REINSTALL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Reinstall(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VersionCompatibilityCheck.CIM_PROPERTY_REINSTALL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VersionCompatibilityCheck.CIM_PROPERTY_REINSTALL + " could not be found");
    		
		} else if (!CIM_VersionCompatibilityCheckHelper.isValid_Reinstall(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VersionCompatibilityCheck.CIM_PROPERTY_REINSTALL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VersionCompatibilityCheck.CIM_PROPERTY_REINSTALL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
