/** 
 * CIM_ApplicationSystemDirectory.java
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
 * Description: CIM_ApplicationSystemDirectory is an association used to establish a relationship between an ApplicationSystem and the Directories that it uses. This is used to identify the single root installation directory for an ApplicationSystem, as well as the logical purpose of other directories utilized by the ApplicationSystem. Note: This class is intended to be a subclass of CIM_Dependency but the current specification prohibits the extension of parent keys in a subclass. This will be revisited when the specification changes to make the intended inheritance possible.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_ApplicationSystemDirectory  {
	
	protected CIMInstance cimInstance			= new CIMInstance();
	protected CIMInstance original_cimInstance	= null;
	protected CIMObjectPath cimObjectPath		= null; 
	
	public final static String CIM_CLASS_NAME = "CIM_ApplicationSystemDirectory";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_PROPERTY_CIM_DIRECTORY = "Antecedent"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_APPLICATIONSYSTEM = "Dependent"; //$NON-NLS-1$
	
	
	/**
	*	ApplicationDirectoryUse is an enumerated array which indicates the purpose(s) of the associated directory within the context of the ApplicationSystem. A value of "Root" indicates that the associated directory is the one and only root directory for the ApplicationSystem. This would typically be the directory path in which the application is installed. For applications which are installed in multiple directories, this would represent the directory from which initial program and configuration files are loaded. A value of "Program" indicates that the directory contains supplemental program files used by the ApplicationSystem. A value of "Data" indicates that the directory is used for data storage. A value of "Log" indicates that the directory is used to contain log files for the ApplicationSystem. It is considered invalid for multiple associations from the same ApplicationSystem to have a value of "Root". The "Unknown" state is expected to be short-lived and would typically be seen only in the installation phase of an ApplicationSystem, if at all. A value of "Temp" indicates that the associated directory is used to contain temporary files created by the ApplicationSystem. The "Other" state should only be used in cases where none of the designated values are appropriate. This is intended to enable use of the model for unanticipated purposes and would usually signal a need to extend this enumeration through the standards process.
	*/
	public final static String CIM_PROPERTY_APPLICATIONDIRECTORYUSES = "ApplicationDirectoryUses"; //$NON-NLS-1$
	/**
	*	Name is a string representing a meaningful identifier for referring to the associated Directory in the context of the ApplicationSystem. As an example, this might be the name of the environment variable used to hold the same directory information.
	*/
	public final static String CIM_PROPERTY_NAME = "Name"; //$NON-NLS-1$
	/**
	*	A string describing how the ApplicationSystem utilizes the associated directory when the corresponding entry in ApplicationDirectoryUses is set to 1, "Other". This attribute is meaningless and should be null when the corresponding entry in ApplicationDirectoryUses is set to any value other than 1.
	*/
	public final static String CIM_PROPERTY_OTHERUSEDESCRIPTIONS = "OtherUseDescriptions"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_APPLICATIONDIRECTORYUSES);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERUSEDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_DIRECTORY);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_APPLICATIONSYSTEM);
		
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_APPLICATIONDIRECTORYUSES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERUSEDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_DIRECTORY, new CIMValue(null, new CIMDataType(CIM_Directory.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_APPLICATIONSYSTEM, new CIMValue(null, new CIMDataType(CIM_ApplicationSystem.CIM_CLASS_NAME))));
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
		};
			
	public final static String[] CIM_VALUEMAP_APPLICATIONDIRECTORYUSES = {"Unknown","Other","Root","Program","Data","Log","Temp"};
	
	
	public final static int APPLICATIONDIRECTORYUSES_UNKNOWN = 0;
	public final static int APPLICATIONDIRECTORYUSES_OTHER = 1;
	public final static int APPLICATIONDIRECTORYUSES_ROOT = 2;
	public final static int APPLICATIONDIRECTORYUSES_PROGRAM = 3;
	public final static int APPLICATIONDIRECTORYUSES_DATA = 4;
	public final static int APPLICATIONDIRECTORYUSES_LOG = 5;
	public final static int APPLICATIONDIRECTORYUSES_TEMP = 6;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ApplicationSystemDirectory() {

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
	public CIM_ApplicationSystemDirectory(Vector keyProperties){ 
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
	public CIM_ApplicationSystemDirectory(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_ApplicationDirectoryUses = this.cimInstance.getProperty(CIM_PROPERTY_APPLICATIONDIRECTORYUSES);
		
		if (CIMProperty_ApplicationDirectoryUses == null || CIMProperty_ApplicationDirectoryUses.getValue().isEmpty() || CIMProperty_ApplicationDirectoryUses.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_APPLICATIONDIRECTORYUSES, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_Name = this.cimInstance.getProperty(CIM_PROPERTY_NAME);
		
		if (CIMProperty_Name == null || CIMProperty_Name.getValue().isEmpty() || CIMProperty_Name.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_NAME, "Key"});
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
	    
	    if (!(object instanceof CIM_ApplicationSystemDirectory)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ApplicationSystemDirectory)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ApplicationSystemDirectory)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ApplicationSystemDirectory)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ApplicationSystemDirectory)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ApplicationSystemDirectory)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ApplicationSystemDirectory)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ApplicationSystemDirectory)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ApplicationSystemDirectory)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ApplicationSystemDirectory)object).cimObjectPath)) {
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
	
	// Attribute ApplicationDirectoryUses
	
	public UnsignedInt16[] get_ApplicationDirectoryUses() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ApplicationSystemDirectory.CIM_PROPERTY_APPLICATIONDIRECTORYUSES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ApplicationSystemDirectory.CIM_PROPERTY_APPLICATIONDIRECTORYUSES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ApplicationSystemDirectory.CIM_PROPERTY_APPLICATIONDIRECTORYUSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_ApplicationDirectoryUses(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ApplicationSystemDirectory.CIM_PROPERTY_APPLICATIONDIRECTORYUSES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ApplicationSystemDirectory.CIM_PROPERTY_APPLICATIONDIRECTORYUSES + " could not be found");
    		
		} else if (!CIM_ApplicationSystemDirectoryHelper.isValid_ApplicationDirectoryUses(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ApplicationSystemDirectory.CIM_PROPERTY_APPLICATIONDIRECTORYUSES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ApplicationSystemDirectory.CIM_PROPERTY_APPLICATIONDIRECTORYUSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Name
	
	public String get_Name() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ApplicationSystemDirectory.CIM_PROPERTY_NAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ApplicationSystemDirectory.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ApplicationSystemDirectory.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Name(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ApplicationSystemDirectory.CIM_PROPERTY_NAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_ApplicationSystemDirectory.CIM_PROPERTY_NAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ApplicationSystemDirectory.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (!CIM_ApplicationSystemDirectoryHelper.isValid_Name(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ApplicationSystemDirectory.CIM_PROPERTY_NAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ApplicationSystemDirectory.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherUseDescriptions
	
	public String[] get_OtherUseDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ApplicationSystemDirectory.CIM_PROPERTY_OTHERUSEDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ApplicationSystemDirectory.CIM_PROPERTY_OTHERUSEDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ApplicationSystemDirectory.CIM_PROPERTY_OTHERUSEDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_OtherUseDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ApplicationSystemDirectory.CIM_PROPERTY_OTHERUSEDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ApplicationSystemDirectory.CIM_PROPERTY_OTHERUSEDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_ApplicationSystemDirectoryHelper.isValid_OtherUseDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ApplicationSystemDirectory.CIM_PROPERTY_OTHERUSEDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ApplicationSystemDirectory.CIM_PROPERTY_OTHERUSEDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_Directory
	
	public CIMObjectPath get_CIM_Directory() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ApplicationSystemDirectory.CIM_PROPERTY_CIM_DIRECTORY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ApplicationSystemDirectory.CIM_PROPERTY_CIM_DIRECTORY + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Directory.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ApplicationSystemDirectory.CIM_PROPERTY_CIM_DIRECTORY + " is not of expected type CIM_Directory.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_Directory(CIM_Directory newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ApplicationSystemDirectory.CIM_PROPERTY_CIM_DIRECTORY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ApplicationSystemDirectory.CIM_PROPERTY_CIM_DIRECTORY + " could not be found");
    		
		} else if (!CIM_ApplicationSystemDirectoryHelper.isValid_CIM_Directory(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ApplicationSystemDirectory.CIM_PROPERTY_CIM_DIRECTORY);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_Directory.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ApplicationSystemDirectory.CIM_PROPERTY_CIM_DIRECTORY + " is not of expected type CIM_Directory.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_Directory.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_ApplicationSystem
	
	public CIMObjectPath get_CIM_ApplicationSystem() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ApplicationSystemDirectory.CIM_PROPERTY_CIM_APPLICATIONSYSTEM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ApplicationSystemDirectory.CIM_PROPERTY_CIM_APPLICATIONSYSTEM + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ApplicationSystem.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ApplicationSystemDirectory.CIM_PROPERTY_CIM_APPLICATIONSYSTEM + " is not of expected type CIM_ApplicationSystem.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_ApplicationSystem(CIM_ApplicationSystem newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ApplicationSystemDirectory.CIM_PROPERTY_CIM_APPLICATIONSYSTEM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ApplicationSystemDirectory.CIM_PROPERTY_CIM_APPLICATIONSYSTEM + " could not be found");
    		
		} else if (!CIM_ApplicationSystemDirectoryHelper.isValid_CIM_ApplicationSystem(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ApplicationSystemDirectory.CIM_PROPERTY_CIM_APPLICATIONSYSTEM);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_ApplicationSystem.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ApplicationSystemDirectory.CIM_PROPERTY_CIM_APPLICATIONSYSTEM + " is not of expected type CIM_ApplicationSystem.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_ApplicationSystem.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
