/** 
 * CIM_UserContact.java
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
 * Description: UserContact contains the details related to contacting a user. This information will be promoted to UserEntity in a later major release of CIM, but cannot be promoted at this time since UserEntity is abstract today, with no keys. Key and required properties cannot be added to a class in a minor version release since this breaks backward compatibility.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_UserContact extends CIM_UserEntity  {
	
	public final static String CIM_CLASS_NAME = "CIM_UserContact";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	*/
	public final static String CIM_PROPERTY_CREATIONCLASSNAME = "CreationClassName"; //$NON-NLS-1$
	/**
	*	The Given Name property is used for the part of a person's name that is not their surname nor their middle name (i.e., their first name).
	*/
	public final static String CIM_PROPERTY_GIVENNAME = "GivenName"; //$NON-NLS-1$
	/**
	*	This property contains the name of a locality, such as a city, county or other geographic region.
	*/
	public final static String CIM_PROPERTY_LOCALITYNAME = "LocalityName"; //$NON-NLS-1$
	/**
	*	Based on RFC1274, the mail box addresses for the person as defined in RFC822.
	*/
	public final static String CIM_PROPERTY_MAIL = "Mail"; //$NON-NLS-1$
	/**
	*	The Name property defines the label by which the object is known. In the case of an LDAP-derived instance, the Name property value may be set to the distinguished name of the LDAP-accessed object instance.
	*/
	public final static String CIM_PROPERTY_NAME = "Name"; //$NON-NLS-1$
	/**
	*	The PostalAddress property values specify the address information required for the physical delivery of postal messages by the postal authority to the person.
	*/
	public final static String CIM_PROPERTY_POSTALADDRESS = "PostalAddress"; //$NON-NLS-1$
	/**
	*	The PostalCode property specifies the postal code of the organization. If this value is present it will be part of the object's postal address.
	*/
	public final static String CIM_PROPERTY_POSTALCODE = "PostalCode"; //$NON-NLS-1$
	/**
	*	The State or Province name property specifies a state or province.
	*/
	public final static String CIM_PROPERTY_STATEORPROVINCE = "StateOrProvince"; //$NON-NLS-1$
	/**
	*	The Surname property specifies the linguistic construct that normally is inherited by an individual from the individual's parent or assumed by marriage, and by which the individual is commonly known.
	*/
	public final static String CIM_PROPERTY_SURNAME = "Surname"; //$NON-NLS-1$
	/**
	*	The TelephoneNumber property specifies a telephone number of the organization, e.g. + 44 582 10101).
	*/
	public final static String CIM_PROPERTY_TELEPHONENUMBER = "TelephoneNumber"; //$NON-NLS-1$
	/**
	*	A User ID property. Based on RFC1274, the property may be used to specify a computer system login name.
	*/
	public final static String CIM_PROPERTY_USERID = "UserID"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_GIVENNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOCALITYNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAIL);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_POSTALADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_POSTALCODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_STATEORPROVINCE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SURNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_TELEPHONENUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_USERID);
				
		for (int i = 0; i < CIM_UserEntity.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_UserEntity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((String)CIM_UserEntity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_GIVENNAME)||
				((String)CIM_UserEntity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOCALITYNAME)||
				((String)CIM_UserEntity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAIL)||
				((String)CIM_UserEntity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAME)||
				((String)CIM_UserEntity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_POSTALADDRESS)||
				((String)CIM_UserEntity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_POSTALCODE)||
				((String)CIM_UserEntity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STATEORPROVINCE)||
				((String)CIM_UserEntity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SURNAME)||
				((String)CIM_UserEntity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TELEPHONENUMBER)||
				((String)CIM_UserEntity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_USERID)){
				continue;
			}
			
			CIM_UserContact.CIM_PropertyNameList.add(CIM_UserEntity.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_GIVENNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOCALITYNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAIL, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_POSTALADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_POSTALCODE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STATEORPROVINCE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SURNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TELEPHONENUMBER, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_USERID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_UserEntity.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_UserEntity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((CIMProperty)CIM_UserEntity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_GIVENNAME)||
				((CIMProperty)CIM_UserEntity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOCALITYNAME)||
				((CIMProperty)CIM_UserEntity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAIL)||
				((CIMProperty)CIM_UserEntity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAME)||
				((CIMProperty)CIM_UserEntity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_POSTALADDRESS)||
				((CIMProperty)CIM_UserEntity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_POSTALCODE)||
				((CIMProperty)CIM_UserEntity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STATEORPROVINCE)||
				((CIMProperty)CIM_UserEntity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SURNAME)||
				((CIMProperty)CIM_UserEntity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TELEPHONENUMBER)||
				((CIMProperty)CIM_UserEntity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_USERID)){
				continue;
			}
			
			CIM_UserContact.CIM_PropertyList.add(CIM_UserEntity.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_UserEntity.Java_Package_List.size(); i++) {
			if (((String)CIM_UserEntity.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_UserEntity.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_UserContact() {

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
	public CIM_UserContact(Vector keyProperties){ 
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
	public CIM_UserContact(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_CreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_CREATIONCLASSNAME);
		
		if (CIMProperty_CreationClassName == null || CIMProperty_CreationClassName.getValue().isEmpty() || CIMProperty_CreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_CREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_Name = this.cimInstance.getProperty(CIM_PROPERTY_NAME);
		
		if (CIMProperty_Name == null || CIMProperty_Name.getValue().isEmpty() || CIMProperty_Name.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_NAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_Surname = this.cimInstance.getProperty(CIM_PROPERTY_SURNAME);
		
		if (CIMProperty_Surname == null || CIMProperty_Surname.getValue().isEmpty() || CIMProperty_Surname.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_SURNAME, "Required"});
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
	    
	    if (!(object instanceof CIM_UserContact)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_UserContact)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_UserContact)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_UserContact)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_UserContact)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_UserContact)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_UserContact)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_UserContact)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_UserContact)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_UserContact)object).cimObjectPath)) {
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
	
	// Attribute CreationClassName
	
	public String get_CreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UserContact.CIM_PROPERTY_CREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UserContact.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UserContact.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UserContact.CIM_PROPERTY_CREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_UserContact.CIM_PROPERTY_CREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UserContact.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_UserContactHelper.isValid_CreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UserContact.CIM_PROPERTY_CREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UserContact.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute GivenName
	
	public String get_GivenName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UserContact.CIM_PROPERTY_GIVENNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UserContact.CIM_PROPERTY_GIVENNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UserContact.CIM_PROPERTY_GIVENNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_GivenName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UserContact.CIM_PROPERTY_GIVENNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UserContact.CIM_PROPERTY_GIVENNAME + " could not be found");
    		
		} else if (!CIM_UserContactHelper.isValid_GivenName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UserContact.CIM_PROPERTY_GIVENNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UserContact.CIM_PROPERTY_GIVENNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LocalityName
	
	public String get_LocalityName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UserContact.CIM_PROPERTY_LOCALITYNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UserContact.CIM_PROPERTY_LOCALITYNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UserContact.CIM_PROPERTY_LOCALITYNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LocalityName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UserContact.CIM_PROPERTY_LOCALITYNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UserContact.CIM_PROPERTY_LOCALITYNAME + " could not be found");
    		
		} else if (!CIM_UserContactHelper.isValid_LocalityName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UserContact.CIM_PROPERTY_LOCALITYNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UserContact.CIM_PROPERTY_LOCALITYNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Mail
	
	public String get_Mail() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UserContact.CIM_PROPERTY_MAIL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UserContact.CIM_PROPERTY_MAIL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UserContact.CIM_PROPERTY_MAIL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Mail(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UserContact.CIM_PROPERTY_MAIL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UserContact.CIM_PROPERTY_MAIL + " could not be found");
    		
		} else if (!CIM_UserContactHelper.isValid_Mail(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UserContact.CIM_PROPERTY_MAIL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UserContact.CIM_PROPERTY_MAIL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Name
	
	public String get_Name() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UserContact.CIM_PROPERTY_NAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UserContact.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UserContact.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Name(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UserContact.CIM_PROPERTY_NAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_UserContact.CIM_PROPERTY_NAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UserContact.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (!CIM_UserContactHelper.isValid_Name(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UserContact.CIM_PROPERTY_NAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UserContact.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PostalAddress
	
	public String[] get_PostalAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UserContact.CIM_PROPERTY_POSTALADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UserContact.CIM_PROPERTY_POSTALADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UserContact.CIM_PROPERTY_POSTALADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_PostalAddress(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UserContact.CIM_PROPERTY_POSTALADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UserContact.CIM_PROPERTY_POSTALADDRESS + " could not be found");
    		
		} else if (!CIM_UserContactHelper.isValid_PostalAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UserContact.CIM_PROPERTY_POSTALADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UserContact.CIM_PROPERTY_POSTALADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PostalCode
	
	public String get_PostalCode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UserContact.CIM_PROPERTY_POSTALCODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UserContact.CIM_PROPERTY_POSTALCODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UserContact.CIM_PROPERTY_POSTALCODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PostalCode(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UserContact.CIM_PROPERTY_POSTALCODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UserContact.CIM_PROPERTY_POSTALCODE + " could not be found");
    		
		} else if (!CIM_UserContactHelper.isValid_PostalCode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UserContact.CIM_PROPERTY_POSTALCODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UserContact.CIM_PROPERTY_POSTALCODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute StateOrProvince
	
	public String get_StateOrProvince() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UserContact.CIM_PROPERTY_STATEORPROVINCE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UserContact.CIM_PROPERTY_STATEORPROVINCE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UserContact.CIM_PROPERTY_STATEORPROVINCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_StateOrProvince(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UserContact.CIM_PROPERTY_STATEORPROVINCE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UserContact.CIM_PROPERTY_STATEORPROVINCE + " could not be found");
    		
		} else if (!CIM_UserContactHelper.isValid_StateOrProvince(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UserContact.CIM_PROPERTY_STATEORPROVINCE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UserContact.CIM_PROPERTY_STATEORPROVINCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Surname
	
	public String get_Surname() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UserContact.CIM_PROPERTY_SURNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UserContact.CIM_PROPERTY_SURNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UserContact.CIM_PROPERTY_SURNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Surname(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UserContact.CIM_PROPERTY_SURNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UserContact.CIM_PROPERTY_SURNAME + " could not be found");
    		
		} else if (!CIM_UserContactHelper.isValid_Surname(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UserContact.CIM_PROPERTY_SURNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UserContact.CIM_PROPERTY_SURNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TelephoneNumber
	
	public String get_TelephoneNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UserContact.CIM_PROPERTY_TELEPHONENUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UserContact.CIM_PROPERTY_TELEPHONENUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UserContact.CIM_PROPERTY_TELEPHONENUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TelephoneNumber(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UserContact.CIM_PROPERTY_TELEPHONENUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UserContact.CIM_PROPERTY_TELEPHONENUMBER + " could not be found");
    		
		} else if (!CIM_UserContactHelper.isValid_TelephoneNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UserContact.CIM_PROPERTY_TELEPHONENUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UserContact.CIM_PROPERTY_TELEPHONENUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UserID
	
	public String get_UserID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UserContact.CIM_PROPERTY_USERID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UserContact.CIM_PROPERTY_USERID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UserContact.CIM_PROPERTY_USERID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_UserID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_UserContact.CIM_PROPERTY_USERID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_UserContact.CIM_PROPERTY_USERID + " could not be found");
    		
		} else if (!CIM_UserContactHelper.isValid_UserID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_UserContact.CIM_PROPERTY_USERID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_UserContact.CIM_PROPERTY_USERID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
