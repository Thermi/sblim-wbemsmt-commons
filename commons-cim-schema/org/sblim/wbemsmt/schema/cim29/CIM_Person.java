/** 
 * CIM_Person.java
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
 * Description: The Person class is used to represent people, and holds their white and yellow pages data. The class is defined so as to incorporate commonly-used LDAP attributes to permit implementations to easily derive this information from LDAP-accessible directories. This class's properties are a subset of a related class, OtherPersonInformation, which defines all the group properties and in array form for directory compatibility.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.lang.reflect.Constructor;
import org.sblim.wbem.client.*;



public class CIM_Person extends CIM_UserContact  {
	
	public final static String CIM_CLASS_NAME = "CIM_Person";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_MOREPERSONINFO = "CIM_MorePersonInfo";
	
	
	/**
	*	This property describes the kind of business performed by an organization.
	*/
	public final static String CIM_PROPERTY_BUSINESSCATEGORY = "BusinessCategory"; //$NON-NLS-1$
	/**
	*	A CommonName is a (possibly ambiguous) name by which the Person is commonly known in some limited scope (such as an organization) and conforms to the naming conventions of the country or culture with which it is associated.
	*/
	public final static String CIM_PROPERTY_COMMONNAME = "CommonName"; //$NON-NLS-1$
	/**
	*	Based on inetOrgPerson, the EmployeeNumber property specifies a numeric or an alphanumeric identifier assigned to a person.
	*/
	public final static String CIM_PROPERTY_EMPLOYEENUMBER = "EmployeeNumber"; //$NON-NLS-1$
	/**
	*	Based on inetOrgPerson, the EmployeeType property is used to identify the employer to employee relationship. Typical values used may include 'Contractor', 'Employee', 'Intern', 'Temp', 'External', and 'Unknown' but any value may be used.
	*/
	public final static String CIM_PROPERTY_EMPLOYEETYPE = "EmployeeType"; //$NON-NLS-1$
	/**
	*	The person's facsimile telephone number.
	*/
	public final static String CIM_PROPERTY_FACSIMILETELEPHONENUMBER = "FacsimileTelephoneNumber"; //$NON-NLS-1$
	/**
	*	Based on RFC1274, the HomePhone property specifies a home telephone number for the person, e.g. + 44 582 10101).
	*/
	public final static String CIM_PROPERTY_HOMEPHONE = "HomePhone"; //$NON-NLS-1$
	/**
	*	The HomePostalAddress property values specify the home address information required for the physical delivery of postal messages by the postal authority.
	*/
	public final static String CIM_PROPERTY_HOMEPOSTALADDRESS = "HomePostalAddress"; //$NON-NLS-1$
	/**
	*	From inetOrgPerson, the JPEGPhoto property values may be used for one or more images of a person using the JPEG File Interchange Format.
	*/
	public final static String CIM_PROPERTY_JPEGPHOTO = "JPEGPhoto"; //$NON-NLS-1$
	/**
	*	The person's manager within the organization. In the case of an LDAP-derived instance, the Manager property value may contain the distinguished name of the Manager.
	*/
	public final static String CIM_PROPERTY_MANAGER = "Manager"; //$NON-NLS-1$
	/**
	*	Based on RFC1274, the Mobile phone property specifies a mobile telephone number for the person, e.g. + 44 582 10101).
	*/
	public final static String CIM_PROPERTY_MOBILE = "Mobile"; //$NON-NLS-1$
	/**
	*	The name of an organizational unit related to the person.
	*/
	public final static String CIM_PROPERTY_OU = "OU"; //$NON-NLS-1$
	/**
	*	Based on RFC1274, the Pager property specifies a pager telephone number for the person, e.g. + 44 582 10101).
	*/
	public final static String CIM_PROPERTY_PAGER = "Pager"; //$NON-NLS-1$
	/**
	*	Based on inetOrgPerson, the person's preferred written or spoken language.
	*/
	public final static String CIM_PROPERTY_PREFERREDLANGUAGE = "PreferredLanguage"; //$NON-NLS-1$
	/**
	*	Based on RFC1274, the Secretary property may be used to specify a secretary for the person. In the case of an LDAP-derived object instance, the value may be a distinguished name.
	*/
	public final static String CIM_PROPERTY_SECRETARY = "Secretary"; //$NON-NLS-1$
	/**
	*	The Title property may be used to specify the person's designated position or function of the object within an organization, e.g., Manager, Vice-President, etc.
	*/
	public final static String CIM_PROPERTY_TITLE = "Title"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_BUSINESSCATEGORY);
		CIM_PropertyNameList.add(CIM_PROPERTY_COMMONNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_EMPLOYEENUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_EMPLOYEETYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_FACSIMILETELEPHONENUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_HOMEPHONE);
		CIM_PropertyNameList.add(CIM_PROPERTY_HOMEPOSTALADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_JPEGPHOTO);
		CIM_PropertyNameList.add(CIM_PROPERTY_MANAGER);
		CIM_PropertyNameList.add(CIM_PROPERTY_MOBILE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OU);
		CIM_PropertyNameList.add(CIM_PROPERTY_PAGER);
		CIM_PropertyNameList.add(CIM_PROPERTY_PREFERREDLANGUAGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SECRETARY);
		CIM_PropertyNameList.add(CIM_PROPERTY_TITLE);
				
		for (int i = 0; i < CIM_UserContact.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_UserContact.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BUSINESSCATEGORY)||
				((String)CIM_UserContact.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_COMMONNAME)||
				((String)CIM_UserContact.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EMPLOYEENUMBER)||
				((String)CIM_UserContact.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EMPLOYEETYPE)||
				((String)CIM_UserContact.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FACSIMILETELEPHONENUMBER)||
				((String)CIM_UserContact.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HOMEPHONE)||
				((String)CIM_UserContact.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HOMEPOSTALADDRESS)||
				((String)CIM_UserContact.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_JPEGPHOTO)||
				((String)CIM_UserContact.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MANAGER)||
				((String)CIM_UserContact.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MOBILE)||
				((String)CIM_UserContact.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OU)||
				((String)CIM_UserContact.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PAGER)||
				((String)CIM_UserContact.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PREFERREDLANGUAGE)||
				((String)CIM_UserContact.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SECRETARY)||
				((String)CIM_UserContact.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TITLE)){
				continue;
			}
			
			CIM_Person.CIM_PropertyNameList.add(CIM_UserContact.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BUSINESSCATEGORY, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_COMMONNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EMPLOYEENUMBER, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EMPLOYEETYPE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FACSIMILETELEPHONENUMBER, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HOMEPHONE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HOMEPOSTALADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_JPEGPHOTO, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MANAGER, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MOBILE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OU, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PAGER, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PREFERREDLANGUAGE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SECRETARY, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TITLE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_UserContact.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_UserContact.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BUSINESSCATEGORY)||
				((CIMProperty)CIM_UserContact.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_COMMONNAME)||
				((CIMProperty)CIM_UserContact.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EMPLOYEENUMBER)||
				((CIMProperty)CIM_UserContact.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EMPLOYEETYPE)||
				((CIMProperty)CIM_UserContact.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FACSIMILETELEPHONENUMBER)||
				((CIMProperty)CIM_UserContact.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HOMEPHONE)||
				((CIMProperty)CIM_UserContact.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HOMEPOSTALADDRESS)||
				((CIMProperty)CIM_UserContact.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_JPEGPHOTO)||
				((CIMProperty)CIM_UserContact.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MANAGER)||
				((CIMProperty)CIM_UserContact.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MOBILE)||
				((CIMProperty)CIM_UserContact.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OU)||
				((CIMProperty)CIM_UserContact.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PAGER)||
				((CIMProperty)CIM_UserContact.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PREFERREDLANGUAGE)||
				((CIMProperty)CIM_UserContact.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SECRETARY)||
				((CIMProperty)CIM_UserContact.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TITLE)){
				continue;
			}
			
			CIM_Person.CIM_PropertyList.add(CIM_UserContact.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_UserContact.Java_Package_List.size(); i++) {
			if (((String)CIM_UserContact.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_UserContact.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_Person() {

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
	public CIM_Person(Vector keyProperties){ 
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
	public CIM_Person(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_CommonName = this.cimInstance.getProperty(CIM_PROPERTY_COMMONNAME);
		
		if (CIMProperty_CommonName == null || CIMProperty_CommonName.getValue().isEmpty() || CIMProperty_CommonName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_COMMONNAME, "Required"});
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
	    
	    if (!(object instanceof CIM_Person)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_Person)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_Person)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_Person)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_Person)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_Person)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_Person)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_Person)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_Person)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_Person)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_OtherPersonInformation_CIM_MorePersonInfos(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_MOREPERSONINFO, 
					CIM_OtherPersonInformation.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_Person.Java_Package_List.size(); i++) {
						if (!((String)(CIM_Person.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_Person.Java_Package_List.get(i))).endsWith(".")) {
							CIM_Person.Java_Package_List.setElementAt((String)(CIM_Person.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_Person.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_OtherPersonInformation(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
					
					Class[] constParams = new Class[2];
					constParams[0] = CIMObjectPath.class;
					constParams[1] = CIMInstance.class;
					Constructor cons = null;
					try {
						cons = clazz.getConstructor(constParams);
						
					} catch(NoSuchMethodException e) {
						System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_OtherPersonInformation(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_OtherPersonInformation(cimInstance.getObjectPath(), cimInstance));
						continue;
					}

				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	public ArrayList getAssociated_CIM_OtherPersonInformation_CIM_MorePersonInfo_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_MOREPERSONINFO, 
					CIM_OtherPersonInformation.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_OtherPersonInformation.CIM_CLASS_NAME)) {
						resultArrayList.add(obj);
					}
				}
			}
		} finally {
			try {
				if (enumeration != null) {
					((CIMEnumeration)enumeration).close();
				}
			} catch(Exception e) {
				throw new CIMException(CIMException.CIM_ERR_FAILED, "The socket of the result could not be closed properly.");
			}
		}
			
		return resultArrayList;
	}

	
	
	//*****************************************************
	// Attribute methods
	//*****************************************************
	
	// Attribute BusinessCategory
	
	public String get_BusinessCategory() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_BUSINESSCATEGORY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_BUSINESSCATEGORY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_BUSINESSCATEGORY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BusinessCategory(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_BUSINESSCATEGORY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_BUSINESSCATEGORY + " could not be found");
    		
		} else if (!CIM_PersonHelper.isValid_BusinessCategory(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Person.CIM_PROPERTY_BUSINESSCATEGORY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_BUSINESSCATEGORY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CommonName
	
	public String get_CommonName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_COMMONNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_COMMONNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_COMMONNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CommonName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_COMMONNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_COMMONNAME + " could not be found");
    		
		} else if (!CIM_PersonHelper.isValid_CommonName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Person.CIM_PROPERTY_COMMONNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_COMMONNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EmployeeNumber
	
	public String get_EmployeeNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_EMPLOYEENUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_EMPLOYEENUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_EMPLOYEENUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EmployeeNumber(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_EMPLOYEENUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_EMPLOYEENUMBER + " could not be found");
    		
		} else if (!CIM_PersonHelper.isValid_EmployeeNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Person.CIM_PROPERTY_EMPLOYEENUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_EMPLOYEENUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EmployeeType
	
	public String get_EmployeeType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_EMPLOYEETYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_EMPLOYEETYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_EMPLOYEETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EmployeeType(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_EMPLOYEETYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_EMPLOYEETYPE + " could not be found");
    		
		} else if (!CIM_PersonHelper.isValid_EmployeeType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Person.CIM_PROPERTY_EMPLOYEETYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_EMPLOYEETYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FacsimileTelephoneNumber
	
	public String get_FacsimileTelephoneNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_FACSIMILETELEPHONENUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_FACSIMILETELEPHONENUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_FACSIMILETELEPHONENUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FacsimileTelephoneNumber(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_FACSIMILETELEPHONENUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_FACSIMILETELEPHONENUMBER + " could not be found");
    		
		} else if (!CIM_PersonHelper.isValid_FacsimileTelephoneNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Person.CIM_PROPERTY_FACSIMILETELEPHONENUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_FACSIMILETELEPHONENUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HomePhone
	
	public String get_HomePhone() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_HOMEPHONE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_HOMEPHONE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_HOMEPHONE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HomePhone(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_HOMEPHONE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_HOMEPHONE + " could not be found");
    		
		} else if (!CIM_PersonHelper.isValid_HomePhone(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Person.CIM_PROPERTY_HOMEPHONE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_HOMEPHONE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HomePostalAddress
	
	public String[] get_HomePostalAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_HOMEPOSTALADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_HOMEPOSTALADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_HOMEPOSTALADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_HomePostalAddress(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_HOMEPOSTALADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_HOMEPOSTALADDRESS + " could not be found");
    		
		} else if (!CIM_PersonHelper.isValid_HomePostalAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Person.CIM_PROPERTY_HOMEPOSTALADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_HOMEPOSTALADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute JPEGPhoto
	
	public String get_JPEGPhoto() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_JPEGPHOTO);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_JPEGPHOTO + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_JPEGPHOTO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_JPEGPhoto(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_JPEGPHOTO);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_JPEGPHOTO + " could not be found");
    		
		} else if (!CIM_PersonHelper.isValid_JPEGPhoto(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Person.CIM_PROPERTY_JPEGPHOTO);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_JPEGPHOTO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Manager
	
	public String get_Manager() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_MANAGER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_MANAGER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_MANAGER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Manager(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_MANAGER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_MANAGER + " could not be found");
    		
		} else if (!CIM_PersonHelper.isValid_Manager(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Person.CIM_PROPERTY_MANAGER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_MANAGER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Mobile
	
	public String get_Mobile() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_MOBILE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_MOBILE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_MOBILE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Mobile(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_MOBILE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_MOBILE + " could not be found");
    		
		} else if (!CIM_PersonHelper.isValid_Mobile(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Person.CIM_PROPERTY_MOBILE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_MOBILE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OU
	
	public String get_OU() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_OU);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_OU + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_OU + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OU(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_OU);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_OU + " could not be found");
    		
		} else if (!CIM_PersonHelper.isValid_OU(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Person.CIM_PROPERTY_OU);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_OU + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Pager
	
	public String get_Pager() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_PAGER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_PAGER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_PAGER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Pager(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_PAGER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_PAGER + " could not be found");
    		
		} else if (!CIM_PersonHelper.isValid_Pager(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Person.CIM_PROPERTY_PAGER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_PAGER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PreferredLanguage
	
	public String get_PreferredLanguage() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_PREFERREDLANGUAGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_PREFERREDLANGUAGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_PREFERREDLANGUAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PreferredLanguage(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_PREFERREDLANGUAGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_PREFERREDLANGUAGE + " could not be found");
    		
		} else if (!CIM_PersonHelper.isValid_PreferredLanguage(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Person.CIM_PROPERTY_PREFERREDLANGUAGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_PREFERREDLANGUAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Secretary
	
	public String get_Secretary() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_SECRETARY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_SECRETARY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_SECRETARY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Secretary(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_SECRETARY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_SECRETARY + " could not be found");
    		
		} else if (!CIM_PersonHelper.isValid_Secretary(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Person.CIM_PROPERTY_SECRETARY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_SECRETARY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Title
	
	public String get_Title() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_TITLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_TITLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_TITLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Title(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Person.CIM_PROPERTY_TITLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Person.CIM_PROPERTY_TITLE + " could not be found");
    		
		} else if (!CIM_PersonHelper.isValid_Title(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Person.CIM_PROPERTY_TITLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Person.CIM_PROPERTY_TITLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
