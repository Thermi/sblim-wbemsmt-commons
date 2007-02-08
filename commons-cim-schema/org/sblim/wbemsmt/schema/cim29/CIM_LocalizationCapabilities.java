/** 
 * CIM_LocalizationCapabilities.java
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
 * Description: Describes the input and output localization capabilities of the entity associated via ElementCapabilities.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_LocalizationCapabilities extends CIM_Capabilities  {
	
	public final static String CIM_CLASS_NAME = "CIM_LocalizationCapabilities";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.9.0";
	
	
	/**
	*	This property, along with locale properties in (for example) a SettingData class, specifies the locale for data consumed by a ManagedElement. 
A locale indicates a particular geographical, political, or cultural region. The SupportedInputLocales property is an array of strings whose entries specify one or more languages that can be used in the formulation of information input by a client. It may be defined by the ManagedElement or client as an input parameter to a method, as a Setting or SettingData property, or via other mechanisms. 

The SupportedInputLocales property publishes an element's support of various locales for input data. The first array entry MUST define the default locale (the natural language associated with the ManagedElement). If the SupportedInputLocales property is empty, it is assumed that the default locale is en_US (English). 
Each array entry consists of three sub-strings, separated by underscores: 
- The first sub-string is the language code, as specified in ISO639. 
- The second sub-string is the country code, as specified in ISO3166. 
- The third sub-string is a variant, which is vendor specific. 
For example, US English appears as: "en_US_WIN", where the "WIN" variant would specify a Windows browser-specific collation (if one exists). Since the variant is not standardized, it is not commonly used and is generally limited to easily recognizable values ("WIN", "UNIX", "EURO", etc.) used in standard environments. 
The language and country codes are required; the variant may be empty.
	*/
	public final static String CIM_PROPERTY_SUPPORTEDINPUTLOCALES = "SupportedInputLocales"; //$NON-NLS-1$
	/**
	*	This property, along with locale properties in (for example) a SettingData class, specifies the locale for data produced by a ManagedElement. 
A locale indicates a particular geographical, political, or cultural region. The SupportedOutputLocales property is an array of strings whose entries specify one or more languages that can be used in the formulation of information requested by and delivered to a client. It may be defined by the ManagedElement or client as an input parameter to a method, as a Setting or SettingData property, or via other mechanisms. Note that more than one locale may be specified in this array and later selected for output. If multiple locales are selected, information MUST be returned in each language specified, and indicated as supported by this Capabilities instance. 

The SupportedOutputLocales property publishes an element's support of various locales for output data. The first array entry MUST define the default locale (the natural language associated with the ManagedElement). If the SupportedOutputLocales property is empty, it is assumed that the default locale is en_US (English). 
Each array entry consists of three sub-strings, separated by underscores: 
- The first sub-string is the language code, as specified in ISO639. 
- The second sub-string is the country code, as specified in ISO3166. 
- The third sub-string is a variant, which is vendor specific. 
For example, US English appears as: "en_US_WIN", where the "WIN" variant would specify a Windows browser-specific collation (if one exists). Since the variant is not standardized, it is not commonly used and is generally limited to easily recognizable values ("WIN", "UNIX", "EURO", etc.) used in standard environments. 
The language and country codes are required; the variant may be empty.
	*/
	public final static String CIM_PROPERTY_SUPPORTEDOUTPUTLOCALES = "SupportedOutputLocales"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTEDINPUTLOCALES);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUPPORTEDOUTPUTLOCALES);
				
		for (int i = 0; i < CIM_Capabilities.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTEDINPUTLOCALES)||
				((String)CIM_Capabilities.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUPPORTEDOUTPUTLOCALES)){
				continue;
			}
			
			CIM_LocalizationCapabilities.CIM_PropertyNameList.add(CIM_Capabilities.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTEDINPUTLOCALES, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUPPORTEDOUTPUTLOCALES, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
				
		for (int i = 0; i < CIM_Capabilities.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTEDINPUTLOCALES)||
				((CIMProperty)CIM_Capabilities.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUPPORTEDOUTPUTLOCALES)){
				continue;
			}
			
			CIM_LocalizationCapabilities.CIM_PropertyList.add(CIM_Capabilities.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Capabilities.Java_Package_List.size(); i++) {
			if (((String)CIM_Capabilities.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Capabilities.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_LocalizationCapabilities() {

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
	public CIM_LocalizationCapabilities(Vector keyProperties){ 
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
	public CIM_LocalizationCapabilities(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_LocalizationCapabilities)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_LocalizationCapabilities)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_LocalizationCapabilities)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_LocalizationCapabilities)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_LocalizationCapabilities)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_LocalizationCapabilities)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_LocalizationCapabilities)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_LocalizationCapabilities)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_LocalizationCapabilities)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_LocalizationCapabilities)object).cimObjectPath)) {
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
	
	// Attribute SupportedInputLocales
	
	public String[] get_SupportedInputLocales() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LocalizationCapabilities.CIM_PROPERTY_SUPPORTEDINPUTLOCALES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LocalizationCapabilities.CIM_PROPERTY_SUPPORTEDINPUTLOCALES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LocalizationCapabilities.CIM_PROPERTY_SUPPORTEDINPUTLOCALES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_SupportedInputLocales(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LocalizationCapabilities.CIM_PROPERTY_SUPPORTEDINPUTLOCALES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LocalizationCapabilities.CIM_PROPERTY_SUPPORTEDINPUTLOCALES + " could not be found");
    		
		} else if (!CIM_LocalizationCapabilitiesHelper.isValid_SupportedInputLocales(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LocalizationCapabilities.CIM_PROPERTY_SUPPORTEDINPUTLOCALES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LocalizationCapabilities.CIM_PROPERTY_SUPPORTEDINPUTLOCALES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SupportedOutputLocales
	
	public String[] get_SupportedOutputLocales() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LocalizationCapabilities.CIM_PROPERTY_SUPPORTEDOUTPUTLOCALES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LocalizationCapabilities.CIM_PROPERTY_SUPPORTEDOUTPUTLOCALES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LocalizationCapabilities.CIM_PROPERTY_SUPPORTEDOUTPUTLOCALES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_SupportedOutputLocales(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_LocalizationCapabilities.CIM_PROPERTY_SUPPORTEDOUTPUTLOCALES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_LocalizationCapabilities.CIM_PROPERTY_SUPPORTEDOUTPUTLOCALES + " could not be found");
    		
		} else if (!CIM_LocalizationCapabilitiesHelper.isValid_SupportedOutputLocales(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_LocalizationCapabilities.CIM_PROPERTY_SUPPORTEDOUTPUTLOCALES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_LocalizationCapabilities.CIM_PROPERTY_SUPPORTEDOUTPUTLOCALES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
