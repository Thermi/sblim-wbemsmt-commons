/** 
 * CIM_X509CredentialFilterEntry.java
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
 * Description:  An X509CredentialFilterEntry allows filtering on the attributes of an X.509
 * certificate. Each instance includes a value for MatchFieldName that specifies
 * the particular X.509 attribute that is being matched.
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


/**
 *  An X509CredentialFilterEntry allows filtering on the attributes of an X.509
 * certificate. Each instance includes a value for MatchFieldName that specifies
 * the particular X.509 attribute that is being matched.
 */
public class CIM_X509CredentialFilterEntry extends CIM_FilterEntryBase  {
	
	public final static String CIM_CLASS_NAME = "CIM_X509CredentialFilterEntry"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	MatchFieldName specifies the X.509 attribute to match against MatchFieldValue. Note that this enumeration is modified from the IETF's IPSP Policy Model to explicitly list the 'standard' X.509 attributes.
	*/
	public final static String CIM_PROPERTY_MATCHFIELDNAME = "MatchFieldName"; //$NON-NLS-1$
	/**
	*	MatchFieldValue specifies the value to compare with the credential attribute (defined in MatchFieldName), to determine if the credential matches this filter entry. An implementation must convert this string to a DER- encoded string before matching against the values extracted from credentials at runtime. 

Note that a wildcard mechanism may be used when MatchFieldName specifies a general character string (for example, if MatchFieldName=7, 'Subject Name'). MatchFieldValue may contain a wildcard character, '*', in the pattern match specification. For example, for 'Subject Name', a MatchFieldValue of 'cn=*,ou=engineering,o=foo,c=be' will successfully match a certificate whose subject attribute is 'cn=JaneDoe,ou=engineering,o=foo,c=be'. A wildcard can be used to represent 0 or more characters as would be displayed to the user (i.e., a wildcard pattern match operates on displayable character boundaries).
	*/
	public final static String CIM_PROPERTY_MATCHFIELDVALUE = "MatchFieldValue"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_MATCHFIELDNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_MATCHFIELDVALUE);
				
		for (int i = 0; i < CIM_FilterEntryBase.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MATCHFIELDNAME)||
				((String)CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MATCHFIELDVALUE)){
				continue;
			}
			
			CIM_X509CredentialFilterEntry.CIM_PropertyNameList.add(CIM_FilterEntryBase.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MATCHFIELDNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MATCHFIELDVALUE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_FilterEntryBase.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MATCHFIELDNAME)||
				((CIMProperty)CIM_FilterEntryBase.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MATCHFIELDVALUE)){
				continue;
			}
			
			CIM_X509CredentialFilterEntry.CIM_PropertyList.add(CIM_FilterEntryBase.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_FilterEntryBase.Java_Package_List.size(); i++) {
			if (((String)CIM_FilterEntryBase.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_FilterEntryBase.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_MATCHFIELDNAME = {"Other","Version","Serial Number","Signature Algorithm Identifier","Issuer Name","Validity Period","Subject Name","Subject Public Key Info","Key Usage","Alternate Name","DMTF Reserved","Vendor Reserved"};
	
	
	public final static String MATCHFIELDNAME_OTHER = "1";
	public final static String MATCHFIELDNAME_VERSION = "2";
	public final static String MATCHFIELDNAME_SERIALNUMBER = "3";
	public final static String MATCHFIELDNAME_SIGNATUREALGORITHMIDENTIFIER = "4";
	public final static String MATCHFIELDNAME_ISSUERNAME = "5";
	public final static String MATCHFIELDNAME_VALIDITYPERIOD = "6";
	public final static String MATCHFIELDNAME_SUBJECTNAME = "7";
	public final static String MATCHFIELDNAME_SUBJECTPUBLICKEYINFO = "8";
	public final static String MATCHFIELDNAME_KEYUSAGE = "9";
	public final static String MATCHFIELDNAME_ALTERNATENAME = "10";
	public final static String MATCHFIELDNAME_DMTFRESERVED = "..";
	public final static String MATCHFIELDNAME_VENDORRESERVED = "x8000..";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_X509CredentialFilterEntry() {

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
	public CIM_X509CredentialFilterEntry(Vector keyProperties){ 
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
	public CIM_X509CredentialFilterEntry(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_MatchFieldName = this.cimInstance.getProperty(CIM_PROPERTY_MATCHFIELDNAME);
		
		if (CIMProperty_MatchFieldName == null || CIMProperty_MatchFieldName.getValue().isEmpty() || CIMProperty_MatchFieldName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_MATCHFIELDNAME, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_MatchFieldValue = this.cimInstance.getProperty(CIM_PROPERTY_MATCHFIELDVALUE);
		
		if (CIMProperty_MatchFieldValue == null || CIMProperty_MatchFieldValue.getValue().isEmpty() || CIMProperty_MatchFieldValue.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_MATCHFIELDVALUE, "Required"});
			result = false;
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
	    
	    if (!(object instanceof CIM_X509CredentialFilterEntry)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_X509CredentialFilterEntry)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_X509CredentialFilterEntry)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_X509CredentialFilterEntry)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_X509CredentialFilterEntry)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_X509CredentialFilterEntry)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_X509CredentialFilterEntry)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_X509CredentialFilterEntry)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_X509CredentialFilterEntry)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_X509CredentialFilterEntry)object).cimObjectPath)) {
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
	
	// Attribute MatchFieldName
	
	public String get_MatchFieldName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_X509CredentialFilterEntry.CIM_PROPERTY_MATCHFIELDNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_X509CredentialFilterEntry.CIM_PROPERTY_MATCHFIELDNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_X509CredentialFilterEntry.CIM_PROPERTY_MATCHFIELDNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MatchFieldName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_X509CredentialFilterEntry.CIM_PROPERTY_MATCHFIELDNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_X509CredentialFilterEntry.CIM_PROPERTY_MATCHFIELDNAME + " could not be found");
    		
		} else if (!CIM_X509CredentialFilterEntryHelper.isValid_MatchFieldName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_X509CredentialFilterEntry.CIM_PROPERTY_MATCHFIELDNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_X509CredentialFilterEntry.CIM_PROPERTY_MATCHFIELDNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MatchFieldValue
	
	public String get_MatchFieldValue() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_X509CredentialFilterEntry.CIM_PROPERTY_MATCHFIELDVALUE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_X509CredentialFilterEntry.CIM_PROPERTY_MATCHFIELDVALUE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_X509CredentialFilterEntry.CIM_PROPERTY_MATCHFIELDVALUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MatchFieldValue(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_X509CredentialFilterEntry.CIM_PROPERTY_MATCHFIELDVALUE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_X509CredentialFilterEntry.CIM_PROPERTY_MATCHFIELDVALUE + " could not be found");
    		
		} else if (!CIM_X509CredentialFilterEntryHelper.isValid_MatchFieldValue(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_X509CredentialFilterEntry.CIM_PROPERTY_MATCHFIELDVALUE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_X509CredentialFilterEntry.CIM_PROPERTY_MATCHFIELDVALUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
