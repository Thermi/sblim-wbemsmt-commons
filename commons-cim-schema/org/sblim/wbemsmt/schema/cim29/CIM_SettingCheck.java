/** 
 * CIM_SettingCheck.java
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
 * Description: This class specifies information needed to verify a particular 'setting' file, for a specific entry in the file. The file entry is checked whether it contains or matches the value defined in EntryValue. All compares are assumed to be case insensitive.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_SettingCheck extends CIM_Check  {
	
	public final static String CIM_CLASS_NAME = "CIM_SettingCheck";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	
	
	/**
	*	CheckType specifies how the setting value should be compared.
	*/
	public final static String CIM_PROPERTY_CHECKTYPE = "CheckType"; //$NON-NLS-1$
	/**
	*	Name of the setting entry to be checked.
	*/
	public final static String CIM_PROPERTY_ENTRYNAME = "EntryName"; //$NON-NLS-1$
	/**
	*	Value to be compared for the named entry.
	*/
	public final static String CIM_PROPERTY_ENTRYVALUE = "EntryValue"; //$NON-NLS-1$
	/**
	*	File name of the 'setting' file to be checked.
	*/
	public final static String CIM_PROPERTY_FILENAME = "FileName"; //$NON-NLS-1$
	/**
	*	Key or label for the section of the file containing the settings to be checked.
	*/
	public final static String CIM_PROPERTY_SECTIONKEY = "SectionKey"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CHECKTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_ENTRYNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_ENTRYVALUE);
		CIM_PropertyNameList.add(CIM_PROPERTY_FILENAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_SECTIONKEY);
				
		for (int i = 0; i < CIM_Check.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Check.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CHECKTYPE)||
				((String)CIM_Check.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ENTRYNAME)||
				((String)CIM_Check.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ENTRYVALUE)||
				((String)CIM_Check.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FILENAME)||
				((String)CIM_Check.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SECTIONKEY)){
				continue;
			}
			
			CIM_SettingCheck.CIM_PropertyNameList.add(CIM_Check.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CHECKTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ENTRYNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ENTRYVALUE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FILENAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SECTIONKEY, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_Check.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Check.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CHECKTYPE)||
				((CIMProperty)CIM_Check.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ENTRYNAME)||
				((CIMProperty)CIM_Check.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ENTRYVALUE)||
				((CIMProperty)CIM_Check.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FILENAME)||
				((CIMProperty)CIM_Check.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SECTIONKEY)){
				continue;
			}
			
			CIM_SettingCheck.CIM_PropertyList.add(CIM_Check.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Check.Java_Package_List.size(); i++) {
			if (((String)CIM_Check.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Check.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_CHECKTYPE = {"Matches","Contains"};
	
	
	public final static int CHECKTYPE_MATCHES = 0;
	public final static int CHECKTYPE_CONTAINS = 1;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_SettingCheck() {

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
	public CIM_SettingCheck(Vector keyProperties){ 
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
	public CIM_SettingCheck(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_SettingCheck)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_SettingCheck)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_SettingCheck)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_SettingCheck)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_SettingCheck)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_SettingCheck)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_SettingCheck)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_SettingCheck)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_SettingCheck)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_SettingCheck)object).cimObjectPath)) {
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
	
	// Attribute CheckType
	
	public UnsignedInt16 get_CheckType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SettingCheck.CIM_PROPERTY_CHECKTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SettingCheck.CIM_PROPERTY_CHECKTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SettingCheck.CIM_PROPERTY_CHECKTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CheckType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SettingCheck.CIM_PROPERTY_CHECKTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SettingCheck.CIM_PROPERTY_CHECKTYPE + " could not be found");
    		
		} else if (!CIM_SettingCheckHelper.isValid_CheckType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SettingCheck.CIM_PROPERTY_CHECKTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SettingCheck.CIM_PROPERTY_CHECKTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EntryName
	
	public String get_EntryName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SettingCheck.CIM_PROPERTY_ENTRYNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SettingCheck.CIM_PROPERTY_ENTRYNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SettingCheck.CIM_PROPERTY_ENTRYNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EntryName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SettingCheck.CIM_PROPERTY_ENTRYNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SettingCheck.CIM_PROPERTY_ENTRYNAME + " could not be found");
    		
		} else if (!CIM_SettingCheckHelper.isValid_EntryName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SettingCheck.CIM_PROPERTY_ENTRYNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SettingCheck.CIM_PROPERTY_ENTRYNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EntryValue
	
	public String get_EntryValue() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SettingCheck.CIM_PROPERTY_ENTRYVALUE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SettingCheck.CIM_PROPERTY_ENTRYVALUE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SettingCheck.CIM_PROPERTY_ENTRYVALUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EntryValue(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SettingCheck.CIM_PROPERTY_ENTRYVALUE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SettingCheck.CIM_PROPERTY_ENTRYVALUE + " could not be found");
    		
		} else if (!CIM_SettingCheckHelper.isValid_EntryValue(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SettingCheck.CIM_PROPERTY_ENTRYVALUE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SettingCheck.CIM_PROPERTY_ENTRYVALUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FileName
	
	public String get_FileName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SettingCheck.CIM_PROPERTY_FILENAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SettingCheck.CIM_PROPERTY_FILENAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SettingCheck.CIM_PROPERTY_FILENAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FileName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SettingCheck.CIM_PROPERTY_FILENAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SettingCheck.CIM_PROPERTY_FILENAME + " could not be found");
    		
		} else if (!CIM_SettingCheckHelper.isValid_FileName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SettingCheck.CIM_PROPERTY_FILENAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SettingCheck.CIM_PROPERTY_FILENAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SectionKey
	
	public String get_SectionKey() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SettingCheck.CIM_PROPERTY_SECTIONKEY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SettingCheck.CIM_PROPERTY_SECTIONKEY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SettingCheck.CIM_PROPERTY_SECTIONKEY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SectionKey(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SettingCheck.CIM_PROPERTY_SECTIONKEY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SettingCheck.CIM_PROPERTY_SECTIONKEY + " could not be found");
    		
		} else if (!CIM_SettingCheckHelper.isValid_SectionKey(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SettingCheck.CIM_PROPERTY_SECTIONKEY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SettingCheck.CIM_PROPERTY_SECTIONKEY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
