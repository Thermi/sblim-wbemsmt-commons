/** 
 * CIM_ServiceAvailableToDatabase.java
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
 * Description: The CIM_ServiceAvailableToDatabase association relates databases to the database services that are available for database use.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.Calendar;


public class CIM_ServiceAvailableToDatabase extends CIM_ServiceAvailableToElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_ServiceAvailableToDatabase";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_PROPERTY_CIM_DATABASESERVICE = "ServiceProvided"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_COMMONDATABASE = "UserOfService"; //$NON-NLS-1$
	
	
	/**
	*	The time that the database was made active by this service. If the AvailableState property is not active, then the value of this property MUST be set to zero.
	*/
	public final static String CIM_PROPERTY_ACTIVETIME = "ActiveTime"; //$NON-NLS-1$
	/**
	*	The AvailableState property indicates the current state of a database service regarding its ability to access a specific database. A service can be actively using a database (ACTIVE), or it can be waiting for a task to perform (AVAILABLE), or the service can be less than completely available for use by the database (RESTRICTED), or the database is not accessible from this service (UNAVAILABLE). Any service states that do not match one of these values should specify (OTHER).
	*/
	public final static String CIM_PROPERTY_AVAILABLESTATE = "AvailableState"; //$NON-NLS-1$
	/**
	*	A string describing the service's available state when the AvailableState property is set to 1 ("Other"). This property MUST be set to NULL when AvailableState is any value other than 1.
	*/
	public final static String CIM_PROPERTY_OTHERAVAILABLESTATE = "OtherAvailableState"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ACTIVETIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_AVAILABLESTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERAVAILABLESTATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_DATABASESERVICE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_COMMONDATABASE);
				
		for (int i = 0; i < CIM_ServiceAvailableToElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ServiceAvailableToElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACTIVETIME)||
				((String)CIM_ServiceAvailableToElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AVAILABLESTATE)||
				((String)CIM_ServiceAvailableToElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERAVAILABLESTATE)){
				continue;
			}
			
			CIM_ServiceAvailableToDatabase.CIM_PropertyNameList.add(CIM_ServiceAvailableToElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACTIVETIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AVAILABLESTATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERAVAILABLESTATE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_DATABASESERVICE, new CIMValue(null, new CIMDataType(CIM_DatabaseService.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_COMMONDATABASE, new CIMValue(null, new CIMDataType(CIM_CommonDatabase.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_ServiceAvailableToElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ServiceAvailableToElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACTIVETIME)||
				((CIMProperty)CIM_ServiceAvailableToElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AVAILABLESTATE)||
				((CIMProperty)CIM_ServiceAvailableToElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERAVAILABLESTATE)){
				continue;
			}
			
			CIM_ServiceAvailableToDatabase.CIM_PropertyList.add(CIM_ServiceAvailableToElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_ServiceAvailableToElement.Java_Package_List.size(); i++) {
			if (((String)CIM_ServiceAvailableToElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_ServiceAvailableToElement.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_AVAILABLESTATE = {"Other","Active","Available","Restricted","Unavailable"};
	
	
	public final static int AVAILABLESTATE_OTHER = 1;
	public final static int AVAILABLESTATE_ACTIVE = 2;
	public final static int AVAILABLESTATE_AVAILABLE = 3;
	public final static int AVAILABLESTATE_RESTRICTED = 4;
	public final static int AVAILABLESTATE_UNAVAILABLE = 5;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ServiceAvailableToDatabase() {

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
	public CIM_ServiceAvailableToDatabase(Vector keyProperties){ 
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
	public CIM_ServiceAvailableToDatabase(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_ServiceAvailableToDatabase)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ServiceAvailableToDatabase)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ServiceAvailableToDatabase)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ServiceAvailableToDatabase)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ServiceAvailableToDatabase)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ServiceAvailableToDatabase)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ServiceAvailableToDatabase)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ServiceAvailableToDatabase)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ServiceAvailableToDatabase)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ServiceAvailableToDatabase)object).cimObjectPath)) {
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
	
	// Attribute ActiveTime
	
	public Calendar get_ActiveTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_ServiceAvailableToDatabase.CIM_PROPERTY_ACTIVETIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceAvailableToDatabase.CIM_PROPERTY_ACTIVETIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceAvailableToDatabase.CIM_PROPERTY_ACTIVETIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_ActiveTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceAvailableToDatabase.CIM_PROPERTY_ACTIVETIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceAvailableToDatabase.CIM_PROPERTY_ACTIVETIME + " could not be found");
    		
		} else if (!CIM_ServiceAvailableToDatabaseHelper.isValid_ActiveTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ServiceAvailableToDatabase.CIM_PROPERTY_ACTIVETIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceAvailableToDatabase.CIM_PROPERTY_ACTIVETIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute AvailableState
	
	public UnsignedInt16 get_AvailableState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceAvailableToDatabase.CIM_PROPERTY_AVAILABLESTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceAvailableToDatabase.CIM_PROPERTY_AVAILABLESTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceAvailableToDatabase.CIM_PROPERTY_AVAILABLESTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AvailableState(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceAvailableToDatabase.CIM_PROPERTY_AVAILABLESTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceAvailableToDatabase.CIM_PROPERTY_AVAILABLESTATE + " could not be found");
    		
		} else if (!CIM_ServiceAvailableToDatabaseHelper.isValid_AvailableState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ServiceAvailableToDatabase.CIM_PROPERTY_AVAILABLESTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceAvailableToDatabase.CIM_PROPERTY_AVAILABLESTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherAvailableState
	
	public String get_OtherAvailableState() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceAvailableToDatabase.CIM_PROPERTY_OTHERAVAILABLESTATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceAvailableToDatabase.CIM_PROPERTY_OTHERAVAILABLESTATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceAvailableToDatabase.CIM_PROPERTY_OTHERAVAILABLESTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherAvailableState(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceAvailableToDatabase.CIM_PROPERTY_OTHERAVAILABLESTATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceAvailableToDatabase.CIM_PROPERTY_OTHERAVAILABLESTATE + " could not be found");
    		
		} else if (!CIM_ServiceAvailableToDatabaseHelper.isValid_OtherAvailableState(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ServiceAvailableToDatabase.CIM_PROPERTY_OTHERAVAILABLESTATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceAvailableToDatabase.CIM_PROPERTY_OTHERAVAILABLESTATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_DatabaseService
	
	public CIMObjectPath get_CIM_DatabaseService() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceAvailableToDatabase.CIM_PROPERTY_CIM_DATABASESERVICE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceAvailableToDatabase.CIM_PROPERTY_CIM_DATABASESERVICE + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_DatabaseService.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceAvailableToDatabase.CIM_PROPERTY_CIM_DATABASESERVICE + " is not of expected type CIM_DatabaseService.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_DatabaseService(CIM_DatabaseService newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceAvailableToDatabase.CIM_PROPERTY_CIM_DATABASESERVICE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceAvailableToDatabase.CIM_PROPERTY_CIM_DATABASESERVICE + " could not be found");
    		
		} else if (!CIM_ServiceAvailableToDatabaseHelper.isValid_CIM_DatabaseService(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ServiceAvailableToDatabase.CIM_PROPERTY_CIM_DATABASESERVICE);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_DatabaseService.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceAvailableToDatabase.CIM_PROPERTY_CIM_DATABASESERVICE + " is not of expected type CIM_DatabaseService.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_DatabaseService.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_CommonDatabase
	
	public CIMObjectPath get_CIM_CommonDatabase() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceAvailableToDatabase.CIM_PROPERTY_CIM_COMMONDATABASE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceAvailableToDatabase.CIM_PROPERTY_CIM_COMMONDATABASE + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_CommonDatabase.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceAvailableToDatabase.CIM_PROPERTY_CIM_COMMONDATABASE + " is not of expected type CIM_CommonDatabase.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_CommonDatabase(CIM_CommonDatabase newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ServiceAvailableToDatabase.CIM_PROPERTY_CIM_COMMONDATABASE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ServiceAvailableToDatabase.CIM_PROPERTY_CIM_COMMONDATABASE + " could not be found");
    		
		} else if (!CIM_ServiceAvailableToDatabaseHelper.isValid_CIM_CommonDatabase(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ServiceAvailableToDatabase.CIM_PROPERTY_CIM_COMMONDATABASE);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_CommonDatabase.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ServiceAvailableToDatabase.CIM_PROPERTY_CIM_COMMONDATABASE + " is not of expected type CIM_CommonDatabase.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_CommonDatabase.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
