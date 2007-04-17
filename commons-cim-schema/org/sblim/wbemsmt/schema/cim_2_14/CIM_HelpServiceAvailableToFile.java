/** 
 * CIM_HelpServiceAvailableToFile.java
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
 * Description:  CIM_HelpServiceAvailableToFile indicates that the service is available for
 * accessing the help file.
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


/**
 *  CIM_HelpServiceAvailableToFile indicates that the service is available for
 * accessing the help file.
 */
public class CIM_HelpServiceAvailableToFile extends CIM_ServiceAvailableToElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_HelpServiceAvailableToFile"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.9.0";
	public final static String CIM_PROPERTY_CIM_HELPSERVICE = "ServiceProvided"; //$NON-NLS-1$
	public final static String CIM_PROPERTY_CIM_LOGICALFILE = "UserOfService"; //$NON-NLS-1$
	
	
	/**
	*	Document format for the associated file.
	*/
	public final static String CIM_PROPERTY_DOCUMENTFORMAT = "DocumentFormat"; //$NON-NLS-1$
	/**
	*	Describes the format of the file when DocumentFormat= "Other" is specified.
	*/
	public final static String CIM_PROPERTY_OTHERDOCUMENTFORMATDESCRIPTION = "OtherDocumentFormatDescription"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DOCUMENTFORMAT);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERDOCUMENTFORMATDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_HELPSERVICE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CIM_LOGICALFILE);
				
		for (int i = 0; i < CIM_ServiceAvailableToElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ServiceAvailableToElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DOCUMENTFORMAT)||
				((String)CIM_ServiceAvailableToElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERDOCUMENTFORMATDESCRIPTION)){
				continue;
			}
			
			CIM_HelpServiceAvailableToFile.CIM_PropertyNameList.add(CIM_ServiceAvailableToElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DOCUMENTFORMAT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERDOCUMENTFORMATDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_HELPSERVICE, new CIMValue(null, new CIMDataType(CIM_HelpService.CIM_CLASS_NAME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CIM_LOGICALFILE, new CIMValue(null, new CIMDataType(CIM_LogicalFile.CIM_CLASS_NAME))));
				
		for (int i = 0; i < CIM_ServiceAvailableToElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ServiceAvailableToElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DOCUMENTFORMAT)||
				((CIMProperty)CIM_ServiceAvailableToElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERDOCUMENTFORMATDESCRIPTION)){
				continue;
			}
			
			CIM_HelpServiceAvailableToFile.CIM_PropertyList.add(CIM_ServiceAvailableToElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_ServiceAvailableToElement.Java_Package_List.size(); i++) {
			if (((String)CIM_ServiceAvailableToElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_ServiceAvailableToElement.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_DOCUMENTFORMAT = {"Unknown","Other","XML","HTML","Binary","Executable",".hlp"};
	
	
	public final static int DOCUMENTFORMAT_UNKNOWN = 0;
	public final static int DOCUMENTFORMAT_OTHER = 1;
	public final static int DOCUMENTFORMAT_XML = 2;
	public final static int DOCUMENTFORMAT_HTML = 3;
	public final static int DOCUMENTFORMAT_BINARY = 4;
	public final static int DOCUMENTFORMAT_EXECUTABLE = 5;
	public final static int DOCUMENTFORMAT__HLP = 6;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_HelpServiceAvailableToFile() {

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
	public CIM_HelpServiceAvailableToFile(Vector keyProperties){ 
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
	public CIM_HelpServiceAvailableToFile(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_HelpServiceAvailableToFile)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_HelpServiceAvailableToFile)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_HelpServiceAvailableToFile)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_HelpServiceAvailableToFile)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_HelpServiceAvailableToFile)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_HelpServiceAvailableToFile)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_HelpServiceAvailableToFile)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_HelpServiceAvailableToFile)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_HelpServiceAvailableToFile)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_HelpServiceAvailableToFile)object).cimObjectPath)) {
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
	
	// Attribute DocumentFormat
	
	public UnsignedInt16 get_DocumentFormat() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_HelpServiceAvailableToFile.CIM_PROPERTY_DOCUMENTFORMAT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_HelpServiceAvailableToFile.CIM_PROPERTY_DOCUMENTFORMAT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_HelpServiceAvailableToFile.CIM_PROPERTY_DOCUMENTFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DocumentFormat(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_HelpServiceAvailableToFile.CIM_PROPERTY_DOCUMENTFORMAT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_HelpServiceAvailableToFile.CIM_PROPERTY_DOCUMENTFORMAT + " could not be found");
    		
		} else if (!CIM_HelpServiceAvailableToFileHelper.isValid_DocumentFormat(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_HelpServiceAvailableToFile.CIM_PROPERTY_DOCUMENTFORMAT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_HelpServiceAvailableToFile.CIM_PROPERTY_DOCUMENTFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherDocumentFormatDescription
	
	public String get_OtherDocumentFormatDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_HelpServiceAvailableToFile.CIM_PROPERTY_OTHERDOCUMENTFORMATDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_HelpServiceAvailableToFile.CIM_PROPERTY_OTHERDOCUMENTFORMATDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_HelpServiceAvailableToFile.CIM_PROPERTY_OTHERDOCUMENTFORMATDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherDocumentFormatDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_HelpServiceAvailableToFile.CIM_PROPERTY_OTHERDOCUMENTFORMATDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_HelpServiceAvailableToFile.CIM_PROPERTY_OTHERDOCUMENTFORMATDESCRIPTION + " could not be found");
    		
		} else if (!CIM_HelpServiceAvailableToFileHelper.isValid_OtherDocumentFormatDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_HelpServiceAvailableToFile.CIM_PROPERTY_OTHERDOCUMENTFORMATDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_HelpServiceAvailableToFile.CIM_PROPERTY_OTHERDOCUMENTFORMATDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_HelpService
	
	public CIMObjectPath get_CIM_HelpService() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_HelpServiceAvailableToFile.CIM_PROPERTY_CIM_HELPSERVICE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_HelpServiceAvailableToFile.CIM_PROPERTY_CIM_HELPSERVICE + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_HelpService.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_HelpServiceAvailableToFile.CIM_PROPERTY_CIM_HELPSERVICE + " is not of expected type CIM_HelpService.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_HelpService(CIM_HelpService newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_HelpServiceAvailableToFile.CIM_PROPERTY_CIM_HELPSERVICE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_HelpServiceAvailableToFile.CIM_PROPERTY_CIM_HELPSERVICE + " could not be found");
    		
		} else if (!CIM_HelpServiceAvailableToFileHelper.isValid_CIM_HelpService(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_HelpServiceAvailableToFile.CIM_PROPERTY_CIM_HELPSERVICE);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_HelpService.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_HelpServiceAvailableToFile.CIM_PROPERTY_CIM_HELPSERVICE + " is not of expected type CIM_HelpService.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_HelpService.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CIM_LogicalFile
	
	public CIMObjectPath get_CIM_LogicalFile() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_HelpServiceAvailableToFile.CIM_PROPERTY_CIM_LOGICALFILE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_HelpServiceAvailableToFile.CIM_PROPERTY_CIM_LOGICALFILE + " could not be found");
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_LogicalFile.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_HelpServiceAvailableToFile.CIM_PROPERTY_CIM_LOGICALFILE + " is not of expected type CIM_LogicalFile.");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (CIMObjectPath)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CIM_LogicalFile(CIM_LogicalFile newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_HelpServiceAvailableToFile.CIM_PROPERTY_CIM_LOGICALFILE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_HelpServiceAvailableToFile.CIM_PROPERTY_CIM_LOGICALFILE + " could not be found");
    		
		} else if (!CIM_HelpServiceAvailableToFileHelper.isValid_CIM_LogicalFile(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_HelpServiceAvailableToFile.CIM_PROPERTY_CIM_LOGICALFILE);
    		
		} else if (currentProperty.getType() == null || !currentProperty.getType().getRefClassName().equals(CIM_LogicalFile.CIM_CLASS_NAME)) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_HelpServiceAvailableToFile.CIM_PROPERTY_CIM_LOGICALFILE + " is not of expected type CIM_LogicalFile.");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue.getCimObjectPath(), new CIMDataType(CIM_LogicalFile.CIM_CLASS_NAME));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
