/** 
 * CIM_DocumentAuthentication.java
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
 * Description: A class describing a company's and/or administrator's credential requirements that should be authenticated in order to establish/trust a CIM_Identity. This class defines the specific document that should be authenticated.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_DocumentAuthentication extends CIM_AuthenticationCondition  {
	
	public final static String CIM_CLASS_NAME = "CIM_DocumentAuthentication";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	String defining a particular document which may be used in the authentication process for example, a specific driver's license or passport number. If left blank, then any valid document matching the category specified by the TypeOfDocument property, can be accepted.
	*/
	public final static String CIM_PROPERTY_DOCUMENTIDENTIFIER = "DocumentIdentifier"; //$NON-NLS-1$
	/**
	*	String specifying the document when the TypeOfDocument property is set to 1, "Other".
	*/
	public final static String CIM_PROPERTY_OTHERDOCUMENT = "OtherDocument"; //$NON-NLS-1$
	/**
	*	Integer enumeration identifying the document that should be authenticated.
	*/
	public final static String CIM_PROPERTY_TYPEOFDOCUMENT = "TypeOfDocument"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DOCUMENTIDENTIFIER);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERDOCUMENT);
		CIM_PropertyNameList.add(CIM_PROPERTY_TYPEOFDOCUMENT);
				
		for (int i = 0; i < CIM_AuthenticationCondition.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_AuthenticationCondition.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DOCUMENTIDENTIFIER)||
				((String)CIM_AuthenticationCondition.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERDOCUMENT)||
				((String)CIM_AuthenticationCondition.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TYPEOFDOCUMENT)){
				continue;
			}
			
			CIM_DocumentAuthentication.CIM_PropertyNameList.add(CIM_AuthenticationCondition.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DOCUMENTIDENTIFIER, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERDOCUMENT, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TYPEOFDOCUMENT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_AuthenticationCondition.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_AuthenticationCondition.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DOCUMENTIDENTIFIER)||
				((CIMProperty)CIM_AuthenticationCondition.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERDOCUMENT)||
				((CIMProperty)CIM_AuthenticationCondition.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TYPEOFDOCUMENT)){
				continue;
			}
			
			CIM_DocumentAuthentication.CIM_PropertyList.add(CIM_AuthenticationCondition.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_AuthenticationCondition.Java_Package_List.size(); i++) {
			if (((String)CIM_AuthenticationCondition.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_AuthenticationCondition.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_TYPEOFDOCUMENT = {"Other","Passport","Birth Certificate","Credit Card","Drivers License","Membership Card","Social Security Card"};
	
	
	public final static int TYPEOFDOCUMENT_OTHER = 1;
	public final static int TYPEOFDOCUMENT_PASSPORT = 2;
	public final static int TYPEOFDOCUMENT_BIRTHCERTIFICATE = 3;
	public final static int TYPEOFDOCUMENT_CREDITCARD = 4;
	public final static int TYPEOFDOCUMENT_DRIVERSLICENSE = 5;
	public final static int TYPEOFDOCUMENT_MEMBERSHIPCARD = 6;
	public final static int TYPEOFDOCUMENT_SOCIALSECURITYCARD = 7;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_DocumentAuthentication() {

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
	public CIM_DocumentAuthentication(Vector keyProperties){ 
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
	public CIM_DocumentAuthentication(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_DocumentAuthentication)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_DocumentAuthentication)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_DocumentAuthentication)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_DocumentAuthentication)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_DocumentAuthentication)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_DocumentAuthentication)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_DocumentAuthentication)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_DocumentAuthentication)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_DocumentAuthentication)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_DocumentAuthentication)object).cimObjectPath)) {
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
	
	// Attribute DocumentIdentifier
	
	public String get_DocumentIdentifier() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DocumentAuthentication.CIM_PROPERTY_DOCUMENTIDENTIFIER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DocumentAuthentication.CIM_PROPERTY_DOCUMENTIDENTIFIER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DocumentAuthentication.CIM_PROPERTY_DOCUMENTIDENTIFIER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DocumentIdentifier(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DocumentAuthentication.CIM_PROPERTY_DOCUMENTIDENTIFIER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DocumentAuthentication.CIM_PROPERTY_DOCUMENTIDENTIFIER + " could not be found");
    		
		} else if (!CIM_DocumentAuthenticationHelper.isValid_DocumentIdentifier(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DocumentAuthentication.CIM_PROPERTY_DOCUMENTIDENTIFIER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DocumentAuthentication.CIM_PROPERTY_DOCUMENTIDENTIFIER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherDocument
	
	public String get_OtherDocument() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DocumentAuthentication.CIM_PROPERTY_OTHERDOCUMENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DocumentAuthentication.CIM_PROPERTY_OTHERDOCUMENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DocumentAuthentication.CIM_PROPERTY_OTHERDOCUMENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherDocument(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DocumentAuthentication.CIM_PROPERTY_OTHERDOCUMENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DocumentAuthentication.CIM_PROPERTY_OTHERDOCUMENT + " could not be found");
    		
		} else if (!CIM_DocumentAuthenticationHelper.isValid_OtherDocument(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DocumentAuthentication.CIM_PROPERTY_OTHERDOCUMENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DocumentAuthentication.CIM_PROPERTY_OTHERDOCUMENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TypeOfDocument
	
	public UnsignedInt16 get_TypeOfDocument() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DocumentAuthentication.CIM_PROPERTY_TYPEOFDOCUMENT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DocumentAuthentication.CIM_PROPERTY_TYPEOFDOCUMENT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DocumentAuthentication.CIM_PROPERTY_TYPEOFDOCUMENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TypeOfDocument(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DocumentAuthentication.CIM_PROPERTY_TYPEOFDOCUMENT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DocumentAuthentication.CIM_PROPERTY_TYPEOFDOCUMENT + " could not be found");
    		
		} else if (!CIM_DocumentAuthenticationHelper.isValid_TypeOfDocument(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DocumentAuthentication.CIM_PROPERTY_TYPEOFDOCUMENT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DocumentAuthentication.CIM_PROPERTY_TYPEOFDOCUMENT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
