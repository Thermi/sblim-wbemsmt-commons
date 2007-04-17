/** 
 * CIM_ObjectManagerCommunicationMechanism.java
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
 * Description:  The class, ObjectManagerCommunicationMechanism, describes access to an
 * ObjectManager. It describes a protocol and data encoding that can be used for
 * communication. When all instances of this class are enumerated for an
 * ObjectManager (using the CommMechanismForManager association), all possible
 * protocol and encoding schemes will be known. Also, specific capabilities (for
 * example, basic read or query) that are supported in the protocol/encoding are
 * described - using the ProfilesSupported property.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.lang.reflect.Constructor;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.CIMEnumeration;



/**
 *  The class, ObjectManagerCommunicationMechanism, describes access to an
 * ObjectManager. It describes a protocol and data encoding that can be used for
 * communication. When all instances of this class are enumerated for an
 * ObjectManager (using the CommMechanismForManager association), all possible
 * protocol and encoding schemes will be known. Also, specific capabilities (for
 * example, basic read or query) that are supported in the protocol/encoding are
 * described - using the ProfilesSupported property.
 */
public class CIM_ObjectManagerCommunicationMechanism extends CIM_ServiceAccessPoint  {
	
	public final static String CIM_CLASS_NAME = "CIM_ObjectManagerCommunicationMechanism"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.13.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORADAPTER = "CIM_CommMechanismForAdapter"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER = "CIM_CommMechanismForManager"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER = "CIM_CommMechanismForObjectManagerAdapter"; //$NON-NLS-1$
	
	
	/**
	*	A free-form string providing additional information related to the AdvertiseType. A description MUST be provided when the AdvertiseType is 1, "Other". An entry in this array corresponds to the entry in the AdvertiseTypes array at the same index. It is not expected that additional descriptions are needed if the Type is set to "Not Advertised" or "SLP". However, as the SLP template expands, or as other advertisement mechanisms are defined, support for additional descriptions may be needed. This array is defined to support this.
	*/
	public final static String CIM_PROPERTY_ADVERTISETYPEDESCRIPTIONS = "AdvertiseTypeDescriptions"; //$NON-NLS-1$
	/**
	*	This property signifies the advertisement for this access point. . It is used by the advertising services of the WBEM infrastructure to determine what should be advertised, via what mechanisms. The property is an array so that the communicationMechansim MAY be advertised using several mechanisms. Note: If this property is null/uninitialized, this is equivalent to specifying the value 2, "Not Advertised".
	*/
	public final static String CIM_PROPERTY_ADVERTISETYPES = "AdvertiseTypes"; //$NON-NLS-1$
	/**
	*	Free-form strings providing descriptions of the supported mechanisms. Entries in this array are correlated with those in the AuthenticationMechanismsSupported array. An entry in this Descriptions array MUST be provided when 1, "Other", is specified in AuthenticationMechanismsSupported.
	*/
	public final static String CIM_PROPERTY_AUTHENTICATIONMECHANISMDESCRIPTIONS = "AuthenticationMechanismDescriptions"; //$NON-NLS-1$
	/**
	*	Enumerated array describing the types of authentication supported by the ObjectManager, using the encoding/protocol. specified in the property, CommunicationMechanism. The defined values represent the authentication defined in the DMTF document, Specification for CIM Operations over HTTP.
	*/
	public final static String CIM_PROPERTY_AUTHENTICATIONMECHANISMSSUPPORTED = "AuthenticationMechanismsSupported"; //$NON-NLS-1$
	/**
	*	CommunicationMechanism describes an encoding and protocol which can be used to communicate with the server. ObjectManager, the specified string should be indicated. If Other is used, the value for OtherCommunicationMechanismDescription must not be null.
	*/
	public final static String CIM_PROPERTY_COMMUNICATIONMECHANISM = "CommunicationMechanism"; //$NON-NLS-1$
	/**
	*	Free-form strings providing descriptions of the supported operations of the object manager. Entries in the array are correlated with those in the ProfilesSupported array. An entry in this Descriptions array MUST be provided when 1, "Other", is specified in the FunctionalProfilesSupported array.
	*/
	public final static String CIM_PROPERTY_FUNCTIONALPROFILEDESCRIPTIONS = "FunctionalProfileDescriptions"; //$NON-NLS-1$
	/**
	*	Enumerated array describing the types of operations supported by the ObjectManager, using this encoding/protocol. The enumeration is based on the Functional Profiles defined for conformance in the DMTF document, Specification for CIM Operations over HTTP.
	*/
	public final static String CIM_PROPERTY_FUNCTIONALPROFILESSUPPORTED = "FunctionalProfilesSupported"; //$NON-NLS-1$
	/**
	*	Boolean indicating whether the ObjectManager supports multiple operation requests (TRUE) or only simple requests (FALSE).
	*/
	public final static String CIM_PROPERTY_MULTIPLEOPERATIONSSUPPORTED = "MultipleOperationsSupported"; //$NON-NLS-1$
	/**
	*	A free-form string providing a description of the supported protocols when 1, "Other", is specified in the CommunicationMechanism.
	*/
	public final static String CIM_PROPERTY_OTHERCOMMUNICATIONMECHANISMDESCRIPTION = "OtherCommunicationMechanismDescription"; //$NON-NLS-1$
	/**
	*	Provides the protocol version for this service access point. Version information MUST be in the form of M.N, where M is a numeric that describes the Major version and N is a numeric that describes the minor version.
	*/
	public final static String CIM_PROPERTY_VERSION = "Version"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ADVERTISETYPEDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_ADVERTISETYPES);
		CIM_PropertyNameList.add(CIM_PROPERTY_AUTHENTICATIONMECHANISMDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_AUTHENTICATIONMECHANISMSSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_COMMUNICATIONMECHANISM);
		CIM_PropertyNameList.add(CIM_PROPERTY_FUNCTIONALPROFILEDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_FUNCTIONALPROFILESSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_MULTIPLEOPERATIONSSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERCOMMUNICATIONMECHANISMDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_VERSION);
				
		for (int i = 0; i < CIM_ServiceAccessPoint.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ADVERTISETYPEDESCRIPTIONS)||
				((String)CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ADVERTISETYPES)||
				((String)CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AUTHENTICATIONMECHANISMDESCRIPTIONS)||
				((String)CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AUTHENTICATIONMECHANISMSSUPPORTED)||
				((String)CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_COMMUNICATIONMECHANISM)||
				((String)CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FUNCTIONALPROFILEDESCRIPTIONS)||
				((String)CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FUNCTIONALPROFILESSUPPORTED)||
				((String)CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MULTIPLEOPERATIONSSUPPORTED)||
				((String)CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERCOMMUNICATIONMECHANISMDESCRIPTION)||
				((String)CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VERSION)){
				continue;
			}
			
			CIM_ObjectManagerCommunicationMechanism.CIM_PropertyNameList.add(CIM_ServiceAccessPoint.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ADVERTISETYPEDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ADVERTISETYPES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AUTHENTICATIONMECHANISMDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AUTHENTICATIONMECHANISMSSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_COMMUNICATIONMECHANISM, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FUNCTIONALPROFILEDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FUNCTIONALPROFILESSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MULTIPLEOPERATIONSSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERCOMMUNICATIONMECHANISMDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VERSION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_ServiceAccessPoint.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ServiceAccessPoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ADVERTISETYPEDESCRIPTIONS)||
				((CIMProperty)CIM_ServiceAccessPoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ADVERTISETYPES)||
				((CIMProperty)CIM_ServiceAccessPoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AUTHENTICATIONMECHANISMDESCRIPTIONS)||
				((CIMProperty)CIM_ServiceAccessPoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AUTHENTICATIONMECHANISMSSUPPORTED)||
				((CIMProperty)CIM_ServiceAccessPoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_COMMUNICATIONMECHANISM)||
				((CIMProperty)CIM_ServiceAccessPoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FUNCTIONALPROFILEDESCRIPTIONS)||
				((CIMProperty)CIM_ServiceAccessPoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FUNCTIONALPROFILESSUPPORTED)||
				((CIMProperty)CIM_ServiceAccessPoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MULTIPLEOPERATIONSSUPPORTED)||
				((CIMProperty)CIM_ServiceAccessPoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERCOMMUNICATIONMECHANISMDESCRIPTION)||
				((CIMProperty)CIM_ServiceAccessPoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VERSION)){
				continue;
			}
			
			CIM_ObjectManagerCommunicationMechanism.CIM_PropertyList.add(CIM_ServiceAccessPoint.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_ServiceAccessPoint.Java_Package_List.size(); i++) {
			if (((String)CIM_ServiceAccessPoint.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_ServiceAccessPoint.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ADVERTISETYPES = {"Other","Not Advertised","SLP"};
	public final static String[] CIM_VALUEMAP_AUTHENTICATIONMECHANISMSSUPPORTED = {"Unknown","Other","None","Basic","Digest"};
	public final static String[] CIM_VALUEMAP_COMMUNICATIONMECHANISM = {"Unknown","Other","CIM-XML","SM-CLP","WS-Management","WSDM"};
	public final static String[] CIM_VALUEMAP_FUNCTIONALPROFILESSUPPORTED = {"Unknown","Other","Basic Read","Basic Write","Schema Manipulation","Instance Manipulation","Association Traversal","Query Execution","Qualifier Declaration","Indications"};
	
	
	public final static int ADVERTISETYPES_OTHER = 1;
	public final static int ADVERTISETYPES_NOTADVERTISED = 2;
	public final static int ADVERTISETYPES_SLP = 3;
	
	public final static int AUTHENTICATIONMECHANISMSSUPPORTED_UNKNOWN = 0;
	public final static int AUTHENTICATIONMECHANISMSSUPPORTED_OTHER = 1;
	public final static int AUTHENTICATIONMECHANISMSSUPPORTED_NONE = 2;
	public final static int AUTHENTICATIONMECHANISMSSUPPORTED_BASIC = 3;
	public final static int AUTHENTICATIONMECHANISMSSUPPORTED_DIGEST = 4;
	
	public final static int COMMUNICATIONMECHANISM_UNKNOWN = 0;
	public final static int COMMUNICATIONMECHANISM_OTHER = 1;
	public final static int COMMUNICATIONMECHANISM_CIM_XML = 2;
	public final static int COMMUNICATIONMECHANISM_SM_CLP = 3;
	public final static int COMMUNICATIONMECHANISM_WS_MANAGEMENT = 4;
	public final static int COMMUNICATIONMECHANISM_WSDM = 5;
	
	public final static int FUNCTIONALPROFILESSUPPORTED_UNKNOWN = 0;
	public final static int FUNCTIONALPROFILESSUPPORTED_OTHER = 1;
	public final static int FUNCTIONALPROFILESSUPPORTED_BASICREAD = 2;
	public final static int FUNCTIONALPROFILESSUPPORTED_BASICWRITE = 3;
	public final static int FUNCTIONALPROFILESSUPPORTED_SCHEMAMANIPULATION = 4;
	public final static int FUNCTIONALPROFILESSUPPORTED_INSTANCEMANIPULATION = 5;
	public final static int FUNCTIONALPROFILESSUPPORTED_ASSOCIATIONTRAVERSAL = 6;
	public final static int FUNCTIONALPROFILESSUPPORTED_QUERYEXECUTION = 7;
	public final static int FUNCTIONALPROFILESSUPPORTED_QUALIFIERDECLARATION = 8;
	public final static int FUNCTIONALPROFILESSUPPORTED_INDICATIONS = 9;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_ObjectManagerCommunicationMechanism() {

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
	public CIM_ObjectManagerCommunicationMechanism(Vector keyProperties){ 
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
	public CIM_ObjectManagerCommunicationMechanism(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_AuthenticationMechanismsSupported = this.cimInstance.getProperty(CIM_PROPERTY_AUTHENTICATIONMECHANISMSSUPPORTED);
		
		if (CIMProperty_AuthenticationMechanismsSupported == null || CIMProperty_AuthenticationMechanismsSupported.getValue().isEmpty() || CIMProperty_AuthenticationMechanismsSupported.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_AUTHENTICATIONMECHANISMSSUPPORTED, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_CommunicationMechanism = this.cimInstance.getProperty(CIM_PROPERTY_COMMUNICATIONMECHANISM);
		
		if (CIMProperty_CommunicationMechanism == null || CIMProperty_CommunicationMechanism.getValue().isEmpty() || CIMProperty_CommunicationMechanism.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_COMMUNICATIONMECHANISM, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_FunctionalProfilesSupported = this.cimInstance.getProperty(CIM_PROPERTY_FUNCTIONALPROFILESSUPPORTED);
		
		if (CIMProperty_FunctionalProfilesSupported == null || CIMProperty_FunctionalProfilesSupported.getValue().isEmpty() || CIMProperty_FunctionalProfilesSupported.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_FUNCTIONALPROFILESSUPPORTED, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_MultipleOperationsSupported = this.cimInstance.getProperty(CIM_PROPERTY_MULTIPLEOPERATIONSSUPPORTED);
		
		if (CIMProperty_MultipleOperationsSupported == null || CIMProperty_MultipleOperationsSupported.getValue().isEmpty() || CIMProperty_MultipleOperationsSupported.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_MULTIPLEOPERATIONSSUPPORTED, "Required"});
			result = false;
		}
		
		CIMProperty CIMProperty_Version = this.cimInstance.getProperty(CIM_PROPERTY_VERSION);
		
		if (CIMProperty_Version == null || CIMProperty_Version.getValue().isEmpty() || CIMProperty_Version.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_VERSION, "Required"});
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
	    
	    if (!(object instanceof CIM_ObjectManagerCommunicationMechanism)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_ObjectManagerCommunicationMechanism)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_ObjectManagerCommunicationMechanism)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_ObjectManagerCommunicationMechanism)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_ObjectManagerCommunicationMechanism)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_ObjectManagerCommunicationMechanism)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_ObjectManagerCommunicationMechanism)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_ObjectManagerCommunicationMechanism)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_ObjectManagerCommunicationMechanism)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_ObjectManagerCommunicationMechanism)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_ProtocolAdapter_CIM_CommMechanismForAdapters(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORADAPTER, 
					CIM_ProtocolAdapter.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_ObjectManagerCommunicationMechanism.Java_Package_List.size(); i++) {
						if (!((String)(CIM_ObjectManagerCommunicationMechanism.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_ObjectManagerCommunicationMechanism.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_ObjectManagerCommunicationMechanism.Java_Package_List.setElementAt((String)(CIM_ObjectManagerCommunicationMechanism.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_ObjectManagerCommunicationMechanism.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ProtocolAdapter(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_ProtocolAdapter(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ProtocolAdapter(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_ProtocolAdapter_CIM_CommMechanismForAdapter_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORADAPTER, 
					CIM_ProtocolAdapter.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ProtocolAdapter.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_ObjectManager_CIM_CommMechanismForManagers(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER, 
					CIM_ObjectManager.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_ObjectManagerCommunicationMechanism.Java_Package_List.size(); i++) {
						if (!((String)(CIM_ObjectManagerCommunicationMechanism.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_ObjectManagerCommunicationMechanism.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_ObjectManagerCommunicationMechanism.Java_Package_List.setElementAt((String)(CIM_ObjectManagerCommunicationMechanism.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_ObjectManagerCommunicationMechanism.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ObjectManager(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_ObjectManager(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ObjectManager(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_ObjectManager_CIM_CommMechanismForManager_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFORMANAGER, 
					CIM_ObjectManager.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ObjectManager.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_ObjectManagerAdapter_CIM_CommMechanismForObjectManagerAdapters(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER, 
					CIM_ObjectManagerAdapter.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_ObjectManagerCommunicationMechanism.Java_Package_List.size(); i++) {
						if (!((String)(CIM_ObjectManagerCommunicationMechanism.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_ObjectManagerCommunicationMechanism.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_ObjectManagerCommunicationMechanism.Java_Package_List.setElementAt((String)(CIM_ObjectManagerCommunicationMechanism.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_ObjectManagerCommunicationMechanism.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ObjectManagerAdapter(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_ObjectManagerAdapter(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ObjectManagerAdapter(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_ObjectManagerAdapter_CIM_CommMechanismForObjectManagerAdapter_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COMMMECHANISMFOROBJECTMANAGERADAPTER, 
					CIM_ObjectManagerAdapter.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ObjectManagerAdapter.CIM_CLASS_NAME)) {
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
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_ADVERTISETYPEDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_ADVERTISETYPEDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_ADVERTISETYPEDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_ADVERTISETYPEDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_ADVERTISETYPEDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_ObjectManagerCommunicationMechanismHelper.isValid_AdvertiseTypeDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_ADVERTISETYPEDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_ADVERTISETYPEDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AdvertiseTypes
	
	public UnsignedInt16[] get_AdvertiseTypes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_ADVERTISETYPES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_ADVERTISETYPES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_ADVERTISETYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_ADVERTISETYPES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_ADVERTISETYPES + " could not be found");
    		
		} else if (!CIM_ObjectManagerCommunicationMechanismHelper.isValid_AdvertiseTypes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_ADVERTISETYPES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_ADVERTISETYPES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AuthenticationMechanismDescriptions
	
	public String[] get_AuthenticationMechanismDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_AUTHENTICATIONMECHANISMDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_AUTHENTICATIONMECHANISMDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_AUTHENTICATIONMECHANISMDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_AuthenticationMechanismDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_AUTHENTICATIONMECHANISMDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_AUTHENTICATIONMECHANISMDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_ObjectManagerCommunicationMechanismHelper.isValid_AuthenticationMechanismDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_AUTHENTICATIONMECHANISMDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_AUTHENTICATIONMECHANISMDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AuthenticationMechanismsSupported
	
	public UnsignedInt16[] get_AuthenticationMechanismsSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_AUTHENTICATIONMECHANISMSSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_AUTHENTICATIONMECHANISMSSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_AUTHENTICATIONMECHANISMSSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_AuthenticationMechanismsSupported(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_AUTHENTICATIONMECHANISMSSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_AUTHENTICATIONMECHANISMSSUPPORTED + " could not be found");
    		
		} else if (!CIM_ObjectManagerCommunicationMechanismHelper.isValid_AuthenticationMechanismsSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_AUTHENTICATIONMECHANISMSSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_AUTHENTICATIONMECHANISMSSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CommunicationMechanism
	
	public UnsignedInt16 get_CommunicationMechanism() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_COMMUNICATIONMECHANISM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_COMMUNICATIONMECHANISM + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_COMMUNICATIONMECHANISM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CommunicationMechanism(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_COMMUNICATIONMECHANISM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_COMMUNICATIONMECHANISM + " could not be found");
    		
		} else if (!CIM_ObjectManagerCommunicationMechanismHelper.isValid_CommunicationMechanism(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_COMMUNICATIONMECHANISM);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_COMMUNICATIONMECHANISM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FunctionalProfileDescriptions
	
	public String[] get_FunctionalProfileDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_FUNCTIONALPROFILEDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_FUNCTIONALPROFILEDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_FUNCTIONALPROFILEDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_FunctionalProfileDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_FUNCTIONALPROFILEDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_FUNCTIONALPROFILEDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_ObjectManagerCommunicationMechanismHelper.isValid_FunctionalProfileDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_FUNCTIONALPROFILEDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_FUNCTIONALPROFILEDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FunctionalProfilesSupported
	
	public UnsignedInt16[] get_FunctionalProfilesSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_FUNCTIONALPROFILESSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_FUNCTIONALPROFILESSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_FUNCTIONALPROFILESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_FunctionalProfilesSupported(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_FUNCTIONALPROFILESSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_FUNCTIONALPROFILESSUPPORTED + " could not be found");
    		
		} else if (!CIM_ObjectManagerCommunicationMechanismHelper.isValid_FunctionalProfilesSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_FUNCTIONALPROFILESSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_FUNCTIONALPROFILESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MultipleOperationsSupported
	
	public Boolean get_MultipleOperationsSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_MULTIPLEOPERATIONSSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_MULTIPLEOPERATIONSSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_MULTIPLEOPERATIONSSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MultipleOperationsSupported(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_MULTIPLEOPERATIONSSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_MULTIPLEOPERATIONSSUPPORTED + " could not be found");
    		
		} else if (!CIM_ObjectManagerCommunicationMechanismHelper.isValid_MultipleOperationsSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_MULTIPLEOPERATIONSSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_MULTIPLEOPERATIONSSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherCommunicationMechanismDescription
	
	public String get_OtherCommunicationMechanismDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_OTHERCOMMUNICATIONMECHANISMDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_OTHERCOMMUNICATIONMECHANISMDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_OTHERCOMMUNICATIONMECHANISMDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherCommunicationMechanismDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_OTHERCOMMUNICATIONMECHANISMDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_OTHERCOMMUNICATIONMECHANISMDESCRIPTION + " could not be found");
    		
		} else if (!CIM_ObjectManagerCommunicationMechanismHelper.isValid_OtherCommunicationMechanismDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_OTHERCOMMUNICATIONMECHANISMDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_OTHERCOMMUNICATIONMECHANISMDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Version
	
	public String get_Version() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_VERSION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_VERSION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_VERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Version(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_VERSION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_VERSION + " could not be found");
    		
		} else if (!CIM_ObjectManagerCommunicationMechanismHelper.isValid_Version(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_VERSION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_ObjectManagerCommunicationMechanism.CIM_PROPERTY_VERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
