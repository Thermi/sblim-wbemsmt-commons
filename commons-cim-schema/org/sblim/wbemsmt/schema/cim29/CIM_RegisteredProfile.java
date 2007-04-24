/** 
 * CIM_RegisteredProfile.java
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
 * Description:  A RegisteredProfile describes a set of CIM Schema classes with required
 * properties and/or methods, necessary to manage a real-world entity or to
 * support a usage scenario, in an interoperable fashion. RegisteredProfiles can
 * be defined by the DMTF or other standards organizations. Note that this class
 * should not be confused with CIM_Profile, which collects SettingData
 * instances, to be applied as a 'configuration profile' for an element. A
 * RegisteredProfile is a named 'standard' for CIM-based management of a
 * particular System, subsystem, Service or other entity, for a specified set of
 * uses. It is a complete, standalone definition, as opposed to the subclass
 * RegisteredSubProfile, which requires a scoping profile for context. The uses
 * for a RegisteredProfile or SubProfile MUST be specified in the document that
 * defines the profile. Examples of Profiles are to manage various aspects of an
 * Operating System, Storage Array, or Database. The name of the profile is
 * defined and scoped by its authoring organization.
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



/**
 *  A RegisteredProfile describes a set of CIM Schema classes with required
 * properties and/or methods, necessary to manage a real-world entity or to
 * support a usage scenario, in an interoperable fashion. RegisteredProfiles can
 * be defined by the DMTF or other standards organizations. Note that this class
 * should not be confused with CIM_Profile, which collects SettingData
 * instances, to be applied as a 'configuration profile' for an element. A
 * RegisteredProfile is a named 'standard' for CIM-based management of a
 * particular System, subsystem, Service or other entity, for a specified set of
 * uses. It is a complete, standalone definition, as opposed to the subclass
 * RegisteredSubProfile, which requires a scoping profile for context. The uses
 * for a RegisteredProfile or SubProfile MUST be specified in the document that
 * defines the profile. Examples of Profiles are to manage various aspects of an
 * Operating System, Storage Array, or Database. The name of the profile is
 * defined and scoped by its authoring organization.
 */
public class CIM_RegisteredProfile extends CIM_ManagedElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_RegisteredProfile"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFORMSTOPROFILE = "CIM_ElementConformsToProfile"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_SUBPROFILEREQUIRESPROFILE = "CIM_SubProfileRequiresProfile"; //$NON-NLS-1$
	
	
	/**
	*	A free-form string providing additional information related to the AdvertiseType. A description MUST be provided when the AdvertiseType is 1, "Other". An entry in this array corresponds to the entry in the AdvertiseTypes array at the same index. It is not expected that additional descriptions are needed if the Type is set to "Not Advertised" or "SLP". However, as the SLP template expands, or as other advertisement mechanisms are defined, support for additional descriptions may be needed. This array is defined to support this.
	*/
	public final static String CIM_PROPERTY_ADVERTISETYPEDESCRIPTIONS = "AdvertiseTypeDescriptions"; //$NON-NLS-1$
	/**
	*	This property signifies the advertisement for the profile information. It is used by the advertising services of the WBEM infrastructure to determine what should be advertised, via what mechanisms. The property is an array so that the profile MAY be advertised using several mechanisms. Note: If this property is null/uninitialized, this is equivalent to specifying the value 2, "Not Advertised".
	*/
	public final static String CIM_PROPERTY_ADVERTISETYPES = "AdvertiseTypes"; //$NON-NLS-1$
	/**
	*	Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
<OrgID>:<LocalID> 
Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority. (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness, <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between <OrgID> and <LocalID>. 
<LocalID> is chosen by the organizational entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance's NameSpace. 
For DMTF defined instances, the 'preferred' algorithm MUST be used with the <OrgID> set to 'CIM'.
	*/
	public final static String CIM_PROPERTY_INSTANCEID = "InstanceID"; //$NON-NLS-1$
	/**
	*	A free-form string providing a description of the organization when 1, "Other", is specified for the RegisteredOrganization.
	*/
	public final static String CIM_PROPERTY_OTHERREGISTEREDORGANIZATION = "OtherRegisteredOrganization"; //$NON-NLS-1$
	/**
	*	The name of this registered profile. Since multiple versions can exist for the same RegisteredName, the combination of RegisteredName, RegisteredOrganization, and RegisteredVersion MUST uniquely identify the registered profile within the scope of the organization.
	*/
	public final static String CIM_PROPERTY_REGISTEREDNAME = "RegisteredName"; //$NON-NLS-1$
	/**
	*	The organization that defines this profile.
	*/
	public final static String CIM_PROPERTY_REGISTEREDORGANIZATION = "RegisteredOrganization"; //$NON-NLS-1$
	/**
	*	The version of this profile. The string representing the version MUST be in the form: 
M + "." + N + "." + U 
Where: 
M - The major version (in numeric form) describing the profile's creation or last modification. 
N - The minor version (in numeric form) describing the profile's creation or last modification. 
U - The update (e.g. errata, patch, ..., in numeric form) describing the profile's creation or last modification.
	*/
	public final static String CIM_PROPERTY_REGISTEREDVERSION = "RegisteredVersion"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ADVERTISETYPEDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_ADVERTISETYPES);
		CIM_PropertyNameList.add(CIM_PROPERTY_INSTANCEID);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERREGISTEREDORGANIZATION);
		CIM_PropertyNameList.add(CIM_PROPERTY_REGISTEREDNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_REGISTEREDORGANIZATION);
		CIM_PropertyNameList.add(CIM_PROPERTY_REGISTEREDVERSION);
				
		for (int i = 0; i < CIM_ManagedElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ADVERTISETYPEDESCRIPTIONS)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ADVERTISETYPES)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INSTANCEID)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERREGISTEREDORGANIZATION)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REGISTEREDNAME)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REGISTEREDORGANIZATION)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REGISTEREDVERSION)){
				continue;
			}
			
			CIM_RegisteredProfile.CIM_PropertyNameList.add(CIM_ManagedElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ADVERTISETYPEDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ADVERTISETYPES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INSTANCEID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERREGISTEREDORGANIZATION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REGISTEREDNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REGISTEREDORGANIZATION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REGISTEREDVERSION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_ManagedElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ADVERTISETYPEDESCRIPTIONS)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ADVERTISETYPES)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INSTANCEID)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERREGISTEREDORGANIZATION)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REGISTEREDNAME)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REGISTEREDORGANIZATION)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REGISTEREDVERSION)){
				continue;
			}
			
			CIM_RegisteredProfile.CIM_PropertyList.add(CIM_ManagedElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_ManagedElement.Java_Package_List.size(); i++) {
			if (((String)CIM_ManagedElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_ManagedElement.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ADVERTISETYPES = {"Other","Not Advertised","SLP"};
	public final static String[] CIM_VALUEMAP_REGISTEREDORGANIZATION = {"Other","DMTF","CompTIA","Consortium for Service Innovation","FAST","GGF","INTAP","itSMF","NAC","Northwest Energy Efficiency Alliance","SNIA","TM Forum","The Open Group","ANSI","IEEE","IETF","INCITS","ISO","W3C"};
	
	
	public final static int ADVERTISETYPES_OTHER = 1;
	public final static int ADVERTISETYPES_NOTADVERTISED = 2;
	public final static int ADVERTISETYPES_SLP = 3;
	
	public final static int REGISTEREDORGANIZATION_OTHER = 1;
	public final static int REGISTEREDORGANIZATION_DMTF = 2;
	public final static int REGISTEREDORGANIZATION_COMPTIA = 3;
	public final static int REGISTEREDORGANIZATION_CONSORTIUMFORSERVICEINNOVATION = 4;
	public final static int REGISTEREDORGANIZATION_FAST = 5;
	public final static int REGISTEREDORGANIZATION_GGF = 6;
	public final static int REGISTEREDORGANIZATION_INTAP = 7;
	public final static int REGISTEREDORGANIZATION_ITSMF = 8;
	public final static int REGISTEREDORGANIZATION_NAC = 9;
	public final static int REGISTEREDORGANIZATION_NORTHWESTENERGYEFFICIENCYALLIANCE = 10;
	public final static int REGISTEREDORGANIZATION_SNIA = 11;
	public final static int REGISTEREDORGANIZATION_TMFORUM = 12;
	public final static int REGISTEREDORGANIZATION_THEOPENGROUP = 13;
	public final static int REGISTEREDORGANIZATION_ANSI = 14;
	public final static int REGISTEREDORGANIZATION_IEEE = 15;
	public final static int REGISTEREDORGANIZATION_IETF = 16;
	public final static int REGISTEREDORGANIZATION_INCITS = 17;
	public final static int REGISTEREDORGANIZATION_ISO = 18;
	public final static int REGISTEREDORGANIZATION_W3C = 19;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_RegisteredProfile() {

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
	public CIM_RegisteredProfile(Vector keyProperties){ 
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
	public CIM_RegisteredProfile(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_AdvertiseTypes = this.cimInstance.getProperty(CIM_PROPERTY_ADVERTISETYPES);
		
		if (CIMProperty_AdvertiseTypes == null || CIMProperty_AdvertiseTypes.getValue().isEmpty() || CIMProperty_AdvertiseTypes.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_ADVERTISETYPES, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_InstanceID = this.cimInstance.getProperty(CIM_PROPERTY_INSTANCEID);
		
		if (CIMProperty_InstanceID == null || CIMProperty_InstanceID.getValue().isEmpty() || CIMProperty_InstanceID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_INSTANCEID, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_RegisteredName = this.cimInstance.getProperty(CIM_PROPERTY_REGISTEREDNAME);
		
		if (CIMProperty_RegisteredName == null || CIMProperty_RegisteredName.getValue().isEmpty() || CIMProperty_RegisteredName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_REGISTEREDNAME, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_RegisteredOrganization = this.cimInstance.getProperty(CIM_PROPERTY_REGISTEREDORGANIZATION);
		
		if (CIMProperty_RegisteredOrganization == null || CIMProperty_RegisteredOrganization.getValue().isEmpty() || CIMProperty_RegisteredOrganization.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_REGISTEREDORGANIZATION, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_RegisteredVersion = this.cimInstance.getProperty(CIM_PROPERTY_REGISTEREDVERSION);
		
		if (CIMProperty_RegisteredVersion == null || CIMProperty_RegisteredVersion.getValue().isEmpty() || CIMProperty_RegisteredVersion.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_REGISTEREDVERSION, "Required"});
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
	    
	    if (!(object instanceof CIM_RegisteredProfile)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_RegisteredProfile)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_RegisteredProfile)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_RegisteredProfile)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_RegisteredProfile)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_RegisteredProfile)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_RegisteredProfile)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_RegisteredProfile)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_RegisteredProfile)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_RegisteredProfile)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_ManagedElement_CIM_ElementConformsToProfiles(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFORMSTOPROFILE, 
					CIM_ManagedElement.CIM_CLASS_NAME, 
					"ConformantStandard", //$NON-NLS-1$
					"ManagedElement", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_RegisteredProfile.Java_Package_List.size(); i++) {
						if (!((String)(CIM_RegisteredProfile.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_RegisteredProfile.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_RegisteredProfile.Java_Package_List.setElementAt((String)(CIM_RegisteredProfile.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_RegisteredProfile.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ManagedElement(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_ManagedElement(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ManagedElement(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_ManagedElement_CIM_ElementConformsToProfile_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTCONFORMSTOPROFILE, 
					CIM_ManagedElement.CIM_CLASS_NAME, 
					"ConformantStandard", //$NON-NLS-1$
					"ManagedElement"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ManagedElement.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_RegisteredSubProfile_CIM_SubProfileRequiresProfiles(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_SUBPROFILEREQUIRESPROFILE, 
					CIM_RegisteredSubProfile.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_RegisteredProfile.Java_Package_List.size(); i++) {
						if (!((String)(CIM_RegisteredProfile.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_RegisteredProfile.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_RegisteredProfile.Java_Package_List.setElementAt((String)(CIM_RegisteredProfile.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_RegisteredProfile.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_RegisteredSubProfile(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_RegisteredSubProfile(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_RegisteredSubProfile(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_RegisteredSubProfile_CIM_SubProfileRequiresProfile_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_SUBPROFILEREQUIRESPROFILE, 
					CIM_RegisteredSubProfile.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_RegisteredSubProfile.CIM_CLASS_NAME)) {
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
	
	// Attribute AdvertiseTypeDescriptions
	
	public String[] get_AdvertiseTypeDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RegisteredProfile.CIM_PROPERTY_ADVERTISETYPEDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_ADVERTISETYPEDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_ADVERTISETYPEDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_AdvertiseTypeDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RegisteredProfile.CIM_PROPERTY_ADVERTISETYPEDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_ADVERTISETYPEDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_RegisteredProfileHelper.isValid_AdvertiseTypeDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RegisteredProfile.CIM_PROPERTY_ADVERTISETYPEDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_ADVERTISETYPEDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AdvertiseTypes
	
	public UnsignedInt16[] get_AdvertiseTypes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RegisteredProfile.CIM_PROPERTY_ADVERTISETYPES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_ADVERTISETYPES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_ADVERTISETYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_AdvertiseTypes(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RegisteredProfile.CIM_PROPERTY_ADVERTISETYPES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_ADVERTISETYPES + " could not be found");
    		
		} else if (!CIM_RegisteredProfileHelper.isValid_AdvertiseTypes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RegisteredProfile.CIM_PROPERTY_ADVERTISETYPES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_ADVERTISETYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InstanceID
	
	public String get_InstanceID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RegisteredProfile.CIM_PROPERTY_INSTANCEID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_INSTANCEID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_INSTANCEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InstanceID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RegisteredProfile.CIM_PROPERTY_INSTANCEID);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_RegisteredProfile.CIM_PROPERTY_INSTANCEID + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_INSTANCEID + " could not be found");
    		
		} else if (!CIM_RegisteredProfileHelper.isValid_InstanceID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RegisteredProfile.CIM_PROPERTY_INSTANCEID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_INSTANCEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherRegisteredOrganization
	
	public String get_OtherRegisteredOrganization() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RegisteredProfile.CIM_PROPERTY_OTHERREGISTEREDORGANIZATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_OTHERREGISTEREDORGANIZATION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_OTHERREGISTEREDORGANIZATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherRegisteredOrganization(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RegisteredProfile.CIM_PROPERTY_OTHERREGISTEREDORGANIZATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_OTHERREGISTEREDORGANIZATION + " could not be found");
    		
		} else if (!CIM_RegisteredProfileHelper.isValid_OtherRegisteredOrganization(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RegisteredProfile.CIM_PROPERTY_OTHERREGISTEREDORGANIZATION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_OTHERREGISTEREDORGANIZATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RegisteredName
	
	public String get_RegisteredName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RegisteredProfile.CIM_PROPERTY_REGISTEREDNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_REGISTEREDNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_REGISTEREDNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RegisteredName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RegisteredProfile.CIM_PROPERTY_REGISTEREDNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_REGISTEREDNAME + " could not be found");
    		
		} else if (!CIM_RegisteredProfileHelper.isValid_RegisteredName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RegisteredProfile.CIM_PROPERTY_REGISTEREDNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_REGISTEREDNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RegisteredOrganization
	
	public UnsignedInt16 get_RegisteredOrganization() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RegisteredProfile.CIM_PROPERTY_REGISTEREDORGANIZATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_REGISTEREDORGANIZATION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_REGISTEREDORGANIZATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RegisteredOrganization(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RegisteredProfile.CIM_PROPERTY_REGISTEREDORGANIZATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_REGISTEREDORGANIZATION + " could not be found");
    		
		} else if (!CIM_RegisteredProfileHelper.isValid_RegisteredOrganization(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RegisteredProfile.CIM_PROPERTY_REGISTEREDORGANIZATION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_REGISTEREDORGANIZATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RegisteredVersion
	
	public String get_RegisteredVersion() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RegisteredProfile.CIM_PROPERTY_REGISTEREDVERSION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_REGISTEREDVERSION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_REGISTEREDVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RegisteredVersion(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RegisteredProfile.CIM_PROPERTY_REGISTEREDVERSION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_REGISTEREDVERSION + " could not be found");
    		
		} else if (!CIM_RegisteredProfileHelper.isValid_RegisteredVersion(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RegisteredProfile.CIM_PROPERTY_REGISTEREDVERSION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RegisteredProfile.CIM_PROPERTY_REGISTEREDVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
