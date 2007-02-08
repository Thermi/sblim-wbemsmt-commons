/** 
 * CIM_Organization.java
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
 * Description: The Organization class is used to represent an organization such as a corporation or other autonomous entity. The class is defined so as to incorporate commonly-used LDAP attributes to permit implementations to easily derive this information from LDAP-accessible directories. This class's properties are a subset of a related class, OtherOrganizationInformation, which defines all the group properties and in array form for directory compatibility.
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



public class CIM_Organization extends CIM_OrganizationalEntity  {
	
	public final static String CIM_CLASS_NAME = "CIM_Organization";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_MOREORGANIZATIONINFO = "CIM_MoreOrganizationInfo";
	
	
	/**
	*	This property describes the kind of business performed by an organization.
	*/
	public final static String CIM_PROPERTY_BUSINESSCATEGORY = "BusinessCategory"; //$NON-NLS-1$
	/**
	*	CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	*/
	public final static String CIM_PROPERTY_CREATIONCLASSNAME = "CreationClassName"; //$NON-NLS-1$
	/**
	*	The organization's facsimile telephone number.
	*/
	public final static String CIM_PROPERTY_FACSIMILETELEPHONENUMBER = "FacsimileTelephoneNumber"; //$NON-NLS-1$
	/**
	*	This property contains the name of a locality, such as a city, county or other geographic region.
	*/
	public final static String CIM_PROPERTY_LOCALITYNAME = "LocalityName"; //$NON-NLS-1$
	/**
	*	Based on RFC1274, the mail box addresses for the organization as defined in RFC822.
	*/
	public final static String CIM_PROPERTY_MAIL = "Mail"; //$NON-NLS-1$
	/**
	*	The Name property defines the label by which the object is known. In the case of an LDAP-derived instance, the Name property value may be set to the distinguished name of the LDAP-accessed object instance.
	*/
	public final static String CIM_PROPERTY_NAME = "Name"; //$NON-NLS-1$
	/**
	*	The name of the organization.
	*/
	public final static String CIM_PROPERTY_ORGANIZATIONNAME = "OrganizationName"; //$NON-NLS-1$
	/**
	*	The PostalAddress property values specify the address information required for the physical delivery of postal messages by the postal authority to the organization.
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
	*	The TelephoneNumber property specifies a telephone number of the organization, e.g. + 44 582 10101).
	*/
	public final static String CIM_PROPERTY_TELEPHONENUMBER = "TelephoneNumber"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_BUSINESSCATEGORY);
		CIM_PropertyNameList.add(CIM_PROPERTY_CREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_FACSIMILETELEPHONENUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOCALITYNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAIL);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_ORGANIZATIONNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_POSTALADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_POSTALCODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_STATEORPROVINCE);
		CIM_PropertyNameList.add(CIM_PROPERTY_TELEPHONENUMBER);
				
		for (int i = 0; i < CIM_OrganizationalEntity.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_OrganizationalEntity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BUSINESSCATEGORY)||
				((String)CIM_OrganizationalEntity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((String)CIM_OrganizationalEntity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FACSIMILETELEPHONENUMBER)||
				((String)CIM_OrganizationalEntity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOCALITYNAME)||
				((String)CIM_OrganizationalEntity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAIL)||
				((String)CIM_OrganizationalEntity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAME)||
				((String)CIM_OrganizationalEntity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ORGANIZATIONNAME)||
				((String)CIM_OrganizationalEntity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_POSTALADDRESS)||
				((String)CIM_OrganizationalEntity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_POSTALCODE)||
				((String)CIM_OrganizationalEntity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STATEORPROVINCE)||
				((String)CIM_OrganizationalEntity.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TELEPHONENUMBER)){
				continue;
			}
			
			CIM_Organization.CIM_PropertyNameList.add(CIM_OrganizationalEntity.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BUSINESSCATEGORY, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FACSIMILETELEPHONENUMBER, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOCALITYNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAIL, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ORGANIZATIONNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_POSTALADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_POSTALCODE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STATEORPROVINCE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TELEPHONENUMBER, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_OrganizationalEntity.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_OrganizationalEntity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BUSINESSCATEGORY)||
				((CIMProperty)CIM_OrganizationalEntity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((CIMProperty)CIM_OrganizationalEntity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FACSIMILETELEPHONENUMBER)||
				((CIMProperty)CIM_OrganizationalEntity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOCALITYNAME)||
				((CIMProperty)CIM_OrganizationalEntity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAIL)||
				((CIMProperty)CIM_OrganizationalEntity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAME)||
				((CIMProperty)CIM_OrganizationalEntity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ORGANIZATIONNAME)||
				((CIMProperty)CIM_OrganizationalEntity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_POSTALADDRESS)||
				((CIMProperty)CIM_OrganizationalEntity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_POSTALCODE)||
				((CIMProperty)CIM_OrganizationalEntity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STATEORPROVINCE)||
				((CIMProperty)CIM_OrganizationalEntity.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TELEPHONENUMBER)){
				continue;
			}
			
			CIM_Organization.CIM_PropertyList.add(CIM_OrganizationalEntity.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_OrganizationalEntity.Java_Package_List.size(); i++) {
			if (((String)CIM_OrganizationalEntity.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_OrganizationalEntity.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_Organization() {

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
	public CIM_Organization(Vector keyProperties){ 
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
	public CIM_Organization(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_OrganizationName = this.cimInstance.getProperty(CIM_PROPERTY_ORGANIZATIONNAME);
		
		if (CIMProperty_OrganizationName == null || CIMProperty_OrganizationName.getValue().isEmpty() || CIMProperty_OrganizationName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_ORGANIZATIONNAME, "Required"});
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
	    
	    if (!(object instanceof CIM_Organization)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_Organization)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_Organization)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_Organization)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_Organization)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_Organization)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_Organization)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_Organization)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_Organization)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_Organization)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_OtherOrganizationInformation_CIM_MoreOrganizationInfos(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_MOREORGANIZATIONINFO, 
					CIM_OtherOrganizationInformation.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_Organization.Java_Package_List.size(); i++) {
						if (!((String)(CIM_Organization.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_Organization.Java_Package_List.get(i))).endsWith(".")) {
							CIM_Organization.Java_Package_List.setElementAt((String)(CIM_Organization.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_Organization.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_OtherOrganizationInformation(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_OtherOrganizationInformation(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_OtherOrganizationInformation(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_OtherOrganizationInformation_CIM_MoreOrganizationInfo_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_MOREORGANIZATIONINFO, 
					CIM_OtherOrganizationInformation.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_OtherOrganizationInformation.CIM_CLASS_NAME)) {
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
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Organization.CIM_PROPERTY_BUSINESSCATEGORY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Organization.CIM_PROPERTY_BUSINESSCATEGORY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Organization.CIM_PROPERTY_BUSINESSCATEGORY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BusinessCategory(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Organization.CIM_PROPERTY_BUSINESSCATEGORY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Organization.CIM_PROPERTY_BUSINESSCATEGORY + " could not be found");
    		
		} else if (!CIM_OrganizationHelper.isValid_BusinessCategory(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Organization.CIM_PROPERTY_BUSINESSCATEGORY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Organization.CIM_PROPERTY_BUSINESSCATEGORY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CreationClassName
	
	public String get_CreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Organization.CIM_PROPERTY_CREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Organization.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Organization.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Organization.CIM_PROPERTY_CREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_Organization.CIM_PROPERTY_CREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Organization.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_OrganizationHelper.isValid_CreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Organization.CIM_PROPERTY_CREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Organization.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FacsimileTelephoneNumber
	
	public String get_FacsimileTelephoneNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Organization.CIM_PROPERTY_FACSIMILETELEPHONENUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Organization.CIM_PROPERTY_FACSIMILETELEPHONENUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Organization.CIM_PROPERTY_FACSIMILETELEPHONENUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FacsimileTelephoneNumber(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Organization.CIM_PROPERTY_FACSIMILETELEPHONENUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Organization.CIM_PROPERTY_FACSIMILETELEPHONENUMBER + " could not be found");
    		
		} else if (!CIM_OrganizationHelper.isValid_FacsimileTelephoneNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Organization.CIM_PROPERTY_FACSIMILETELEPHONENUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Organization.CIM_PROPERTY_FACSIMILETELEPHONENUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LocalityName
	
	public String get_LocalityName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Organization.CIM_PROPERTY_LOCALITYNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Organization.CIM_PROPERTY_LOCALITYNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Organization.CIM_PROPERTY_LOCALITYNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LocalityName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Organization.CIM_PROPERTY_LOCALITYNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Organization.CIM_PROPERTY_LOCALITYNAME + " could not be found");
    		
		} else if (!CIM_OrganizationHelper.isValid_LocalityName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Organization.CIM_PROPERTY_LOCALITYNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Organization.CIM_PROPERTY_LOCALITYNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Mail
	
	public String get_Mail() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Organization.CIM_PROPERTY_MAIL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Organization.CIM_PROPERTY_MAIL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Organization.CIM_PROPERTY_MAIL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Mail(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Organization.CIM_PROPERTY_MAIL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Organization.CIM_PROPERTY_MAIL + " could not be found");
    		
		} else if (!CIM_OrganizationHelper.isValid_Mail(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Organization.CIM_PROPERTY_MAIL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Organization.CIM_PROPERTY_MAIL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Name
	
	public String get_Name() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Organization.CIM_PROPERTY_NAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Organization.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Organization.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Name(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Organization.CIM_PROPERTY_NAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_Organization.CIM_PROPERTY_NAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Organization.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (!CIM_OrganizationHelper.isValid_Name(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Organization.CIM_PROPERTY_NAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Organization.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OrganizationName
	
	public String get_OrganizationName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Organization.CIM_PROPERTY_ORGANIZATIONNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Organization.CIM_PROPERTY_ORGANIZATIONNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Organization.CIM_PROPERTY_ORGANIZATIONNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OrganizationName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Organization.CIM_PROPERTY_ORGANIZATIONNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Organization.CIM_PROPERTY_ORGANIZATIONNAME + " could not be found");
    		
		} else if (!CIM_OrganizationHelper.isValid_OrganizationName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Organization.CIM_PROPERTY_ORGANIZATIONNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Organization.CIM_PROPERTY_ORGANIZATIONNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PostalAddress
	
	public String[] get_PostalAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Organization.CIM_PROPERTY_POSTALADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Organization.CIM_PROPERTY_POSTALADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Organization.CIM_PROPERTY_POSTALADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Organization.CIM_PROPERTY_POSTALADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Organization.CIM_PROPERTY_POSTALADDRESS + " could not be found");
    		
		} else if (!CIM_OrganizationHelper.isValid_PostalAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Organization.CIM_PROPERTY_POSTALADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Organization.CIM_PROPERTY_POSTALADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PostalCode
	
	public String get_PostalCode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Organization.CIM_PROPERTY_POSTALCODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Organization.CIM_PROPERTY_POSTALCODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Organization.CIM_PROPERTY_POSTALCODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PostalCode(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Organization.CIM_PROPERTY_POSTALCODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Organization.CIM_PROPERTY_POSTALCODE + " could not be found");
    		
		} else if (!CIM_OrganizationHelper.isValid_PostalCode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Organization.CIM_PROPERTY_POSTALCODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Organization.CIM_PROPERTY_POSTALCODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute StateOrProvince
	
	public String get_StateOrProvince() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Organization.CIM_PROPERTY_STATEORPROVINCE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Organization.CIM_PROPERTY_STATEORPROVINCE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Organization.CIM_PROPERTY_STATEORPROVINCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_StateOrProvince(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Organization.CIM_PROPERTY_STATEORPROVINCE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Organization.CIM_PROPERTY_STATEORPROVINCE + " could not be found");
    		
		} else if (!CIM_OrganizationHelper.isValid_StateOrProvince(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Organization.CIM_PROPERTY_STATEORPROVINCE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Organization.CIM_PROPERTY_STATEORPROVINCE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TelephoneNumber
	
	public String get_TelephoneNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Organization.CIM_PROPERTY_TELEPHONENUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Organization.CIM_PROPERTY_TELEPHONENUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Organization.CIM_PROPERTY_TELEPHONENUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TelephoneNumber(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Organization.CIM_PROPERTY_TELEPHONENUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Organization.CIM_PROPERTY_TELEPHONENUMBER + " could not be found");
    		
		} else if (!CIM_OrganizationHelper.isValid_TelephoneNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Organization.CIM_PROPERTY_TELEPHONENUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Organization.CIM_PROPERTY_TELEPHONENUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
