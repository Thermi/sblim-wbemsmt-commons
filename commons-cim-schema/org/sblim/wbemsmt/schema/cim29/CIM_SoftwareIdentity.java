/** 
 * CIM_SoftwareIdentity.java
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
 * Description:  SoftwareIdentity represents software, viewed as an asset and/or individually
 * identifiable entity (similar to Physical Element). It does NOT indicate
 * whether the software is installed, executing, etc. (The latter is the role of
 * the SoftwareFeature/ SoftwareElement classes and the Application Model.)
 * Since software may be acquired, SoftwareIdentity can be associated with a
 * Product using the ProductSoftwareComponent relationship. Note that the
 * Application Model manages the deployment and installation of software via the
 * classes, SoftwareFeatures and SoftwareElements. The deployment/installation
 * concepts are related to the asset/identity one. In fact, a SoftwareIdentity
 * may correspond to a Product, or to one or more SoftwareFeatures or
 * SoftwareElements - depending on the granularity of these classes and the
 * deployment model. The correspondence of Software Identity to Product,
 * SoftwareFeature or SoftwareElement is indicated using the ConcreteIdentity
 * association. Note that there may not be sufficient detail or instrumentation
 * to instantiate ConcreteIdentity. And, if the association is instantiated,
 * some duplication of information may result. For example, the Vendor described
 * in the instances of Product and SoftwareIdentity MAY be the same. However,
 * this is not necessarily true, and it is why vendor and similar information
 * are duplicated in this class. Note that ConcreteIdentity can also be used to
 * describe the relationship of the software to any LogicalFiles that result
 * from installing it. As above, there may not be sufficient detail or
 * instrumentation to instantiate this association.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Enumeration;
import java.lang.reflect.Constructor;
import org.sblim.wbem.client.*;



/**
 *  SoftwareIdentity represents software, viewed as an asset and/or individually
 * identifiable entity (similar to Physical Element). It does NOT indicate
 * whether the software is installed, executing, etc. (The latter is the role of
 * the SoftwareFeature/ SoftwareElement classes and the Application Model.)
 * Since software may be acquired, SoftwareIdentity can be associated with a
 * Product using the ProductSoftwareComponent relationship. Note that the
 * Application Model manages the deployment and installation of software via the
 * classes, SoftwareFeatures and SoftwareElements. The deployment/installation
 * concepts are related to the asset/identity one. In fact, a SoftwareIdentity
 * may correspond to a Product, or to one or more SoftwareFeatures or
 * SoftwareElements - depending on the granularity of these classes and the
 * deployment model. The correspondence of Software Identity to Product,
 * SoftwareFeature or SoftwareElement is indicated using the ConcreteIdentity
 * association. Note that there may not be sufficient detail or instrumentation
 * to instantiate ConcreteIdentity. And, if the association is instantiated,
 * some duplication of information may result. For example, the Vendor described
 * in the instances of Product and SoftwareIdentity MAY be the same. However,
 * this is not necessarily true, and it is why vendor and similar information
 * are duplicated in this class. Note that ConcreteIdentity can also be used to
 * describe the relationship of the software to any LogicalFiles that result
 * from installing it. As above, there may not be sufficient detail or
 * instrumentation to instantiate this association.
 */
public class CIM_SoftwareIdentity extends CIM_LogicalElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_SoftwareIdentity"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY = "CIM_ElementSoftwareIdentity"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_INSTALLEDSOFTWAREIDENTITY = "CIM_InstalledSoftwareIdentity"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSOFTWARECOMPONENT = "CIM_ProductSoftwareComponent"; //$NON-NLS-1$
	
	
	/**
	*	The build number of the software.
	*/
	public final static String CIM_PROPERTY_BUILDNUMBER = "BuildNumber"; //$NON-NLS-1$
	/**
	*	An array of free-form strings providing more detailed explanations for any of the entries in the Classifications array. Note that each entry is related to one in the Classifications array located at the same index.
	*/
	public final static String CIM_PROPERTY_CLASSIFICATIONDESCRIPTIONS = "ClassificationDescriptions"; //$NON-NLS-1$
	/**
	*	An array of enumerated integers that classify this software. For example, the software MAY be instrumentation (value=5) or firmware and diagnostic software (10 and 7). The use of value 6, Firmware/BIOS, is being deprecated. Instead, either the value 10 (Firmware) and/or 11 (BIOS/FCode) SHOULD be used.
	*/
	public final static String CIM_PROPERTY_CLASSIFICATIONS = "Classifications"; //$NON-NLS-1$
	/**
	*	Within the scope of the instantiating Namespace, InstanceID opaquely and uniquely identifies an instance of this class. In order to ensure uniqueness within the NameSpace, the value of InstanceID SHOULD be constructed using the following 'preferred' algorithm: 
<OrgID>:<LocalID> 
Where <OrgID> and <LocalID> are separated by a colon ':', and where <OrgID> MUST include a copyrighted, trademarked or otherwise unique name that is owned by the business entity creating/defining the InstanceID, or is a registered ID that is assigned to the business entity by a recognized global authority (This is similar to the <Schema Name>_<Class Name> structure of Schema class names.) In addition, to ensure uniqueness <OrgID> MUST NOT contain a colon (':'). When using this algorithm, the first colon to appear in InstanceID MUST appear between <OrgID> and <LocalID>. 
<LocalID> is chosen by the business entity and SHOULD not be re-used to identify different underlying (real-world) elements. If the above 'preferred' algorithm is not used, the defining entity MUST assure that the resultant InstanceID is not re-used across any InstanceIDs produced by this or other providers for this instance's NameSpace. 
For DMTF defined instances, the 'preferred' algorithm MUST be used with the <OrgID> set to 'CIM'.
	*/
	public final static String CIM_PROPERTY_INSTANCEID = "InstanceID"; //$NON-NLS-1$
	/**
	*	The language editions supported by the software. The language codes defined in ISO 639 should be used.
	*/
	public final static String CIM_PROPERTY_LANGUAGES = "Languages"; //$NON-NLS-1$
	/**
	*	The major number component of the software's version information - for example, '12' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' major release is indicated by a larger numeric value.
	*/
	public final static String CIM_PROPERTY_MAJORVERSION = "MajorVersion"; //$NON-NLS-1$
	/**
	*	Manufacturer of this software.
	*/
	public final static String CIM_PROPERTY_MANUFACTURER = "Manufacturer"; //$NON-NLS-1$
	/**
	*	The minor number component of the software's version information - for example, '1' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' minor release is indicated by a larger numeric value.
	*/
	public final static String CIM_PROPERTY_MINORVERSION = "MinorVersion"; //$NON-NLS-1$
	/**
	*	The date the software was released.
	*/
	public final static String CIM_PROPERTY_RELEASEDATE = "ReleaseDate"; //$NON-NLS-1$
	/**
	*	The revision or maintenance release component of the software's version information - for example, '3' from version 12.1(3)T. This property is defined as a numeric value to allow the determination of 'newer' vs. 'older' releases. A 'newer' revision is indicated by a larger numeric value.
	*/
	public final static String CIM_PROPERTY_REVISIONNUMBER = "RevisionNumber"; //$NON-NLS-1$
	/**
	*	A manufacturer-allocated number used to identify the software.
	*/
	public final static String CIM_PROPERTY_SERIALNUMBER = "SerialNumber"; //$NON-NLS-1$
	/**
	*	Specifies the target operating systems of the software. Due to the extreme variability in operating systems, this property is defined as a string array.
	*/
	public final static String CIM_PROPERTY_TARGETOPERATINGSYSTEMS = "TargetOperatingSystems"; //$NON-NLS-1$
	/**
	*	A string representing the complete software version information - for example, '12.1(3)T'. This string and the numeric major/minor/revision/build properties are complementary. Since vastly different representations and semantics exist for versions, it is not assumed that one representation is sufficient to permit a client to perform computations (i.e., the values are numeric) and a user to recognize the software's version (i.e., the values are understandable and readable). Hence, both numeric and string representations of version are provided.
	*/
	public final static String CIM_PROPERTY_VERSIONSTRING = "VersionString"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_BUILDNUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASSIFICATIONDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASSIFICATIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_INSTANCEID);
		CIM_PropertyNameList.add(CIM_PROPERTY_LANGUAGES);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAJORVERSION);
		CIM_PropertyNameList.add(CIM_PROPERTY_MANUFACTURER);
		CIM_PropertyNameList.add(CIM_PROPERTY_MINORVERSION);
		CIM_PropertyNameList.add(CIM_PROPERTY_RELEASEDATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_REVISIONNUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_SERIALNUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_TARGETOPERATINGSYSTEMS);
		CIM_PropertyNameList.add(CIM_PROPERTY_VERSIONSTRING);
				
		for (int i = 0; i < CIM_LogicalElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BUILDNUMBER)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASSIFICATIONDESCRIPTIONS)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASSIFICATIONS)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INSTANCEID)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LANGUAGES)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAJORVERSION)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MANUFACTURER)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MINORVERSION)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RELEASEDATE)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REVISIONNUMBER)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SERIALNUMBER)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TARGETOPERATINGSYSTEMS)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VERSIONSTRING)){
				continue;
			}
			
			CIM_SoftwareIdentity.CIM_PropertyNameList.add(CIM_LogicalElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BUILDNUMBER, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASSIFICATIONDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASSIFICATIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INSTANCEID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LANGUAGES, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAJORVERSION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MANUFACTURER, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MINORVERSION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RELEASEDATE, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REVISIONNUMBER, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SERIALNUMBER, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TARGETOPERATINGSYSTEMS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VERSIONSTRING, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_LogicalElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BUILDNUMBER)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASSIFICATIONDESCRIPTIONS)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASSIFICATIONS)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INSTANCEID)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LANGUAGES)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAJORVERSION)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MANUFACTURER)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MINORVERSION)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RELEASEDATE)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REVISIONNUMBER)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SERIALNUMBER)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TARGETOPERATINGSYSTEMS)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VERSIONSTRING)){
				continue;
			}
			
			CIM_SoftwareIdentity.CIM_PropertyList.add(CIM_LogicalElement.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim29");
				
		String[] parentClassPackageList = CIM_LogicalElement.getPackages();
		
		for (int i = 0; i < parentClassPackageList.length; i++) {
			Java_Package_List.add(parentClassPackageList[i]);
		}
	};
			
	public final static String[] CIM_VALUEMAP_CLASSIFICATIONS = {"Unknown","Other","Driver","Configuration Software","Application Software","Instrumentation","Firmware/BIOS","Diagnostic Software","Operating System","Middleware","Firmware","BIOS/FCode","DMTF Reserved","Vendor Reserved"};
	
	
	public final static String CLASSIFICATIONS_UNKNOWN = "0";
	public final static String CLASSIFICATIONS_OTHER = "1";
	public final static String CLASSIFICATIONS_DRIVER = "2";
	public final static String CLASSIFICATIONS_CONFIGURATIONSOFTWARE = "3";
	public final static String CLASSIFICATIONS_APPLICATIONSOFTWARE = "4";
	public final static String CLASSIFICATIONS_INSTRUMENTATION = "5";
	public final static String CLASSIFICATIONS_FIRMWARE_BIOS = "6";
	public final static String CLASSIFICATIONS_DIAGNOSTICSOFTWARE = "7";
	public final static String CLASSIFICATIONS_OPERATINGSYSTEM = "8";
	public final static String CLASSIFICATIONS_MIDDLEWARE = "9";
	public final static String CLASSIFICATIONS_FIRMWARE = "10";
	public final static String CLASSIFICATIONS_BIOS_FCODE = "11";
	public final static String CLASSIFICATIONS_DMTFRESERVED = "..";
	public final static String CLASSIFICATIONS_VENDORRESERVED = "0x8000..0xFFFF";
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_SoftwareIdentity() {

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
	public CIM_SoftwareIdentity(Vector keyProperties){ 
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
	public CIM_SoftwareIdentity(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
		if (cimInstance == null) {
			throw new InvalidParameterException("The cimInstance parameter does not contain a valid reference.");
		
		} else if (cimObjectPath == null){
			throw new InvalidParameterException("The cimObjectPath parameter does not contain a valid reference.");		
		
		} else if (!cimObjectPath.getObjectName().equals(cimInstance.getClassName())) {
			throw new InvalidParameterException("The class name of the instance and the ObjectPath are not the same.");
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
	
	public static void addPackage(String packagename) {
        if (packagename != null) {
            if (!packagename.endsWith(".")) {
                packagename = packagename + ".";
            }
            CIM_SoftwareIdentity.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_SoftwareIdentity.Java_Package_List.toArray(new String[CIM_SoftwareIdentity.Java_Package_List.size()]);
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
		
		CIMProperty CIMProperty_InstanceID = this.cimInstance.getProperty(CIM_PROPERTY_INSTANCEID);
		
		if (CIMProperty_InstanceID == null || CIMProperty_InstanceID.getValue().isEmpty() || CIMProperty_InstanceID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_INSTANCEID, "Key"});
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
	    
	    if (!(object instanceof CIM_SoftwareIdentity)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_SoftwareIdentity)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_SoftwareIdentity)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_SoftwareIdentity)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_SoftwareIdentity)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_SoftwareIdentity)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_SoftwareIdentity)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_SoftwareIdentity)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_SoftwareIdentity)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_SoftwareIdentity)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_ManagedElement_CIM_ElementSoftwareIdentitys(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY, 
					CIM_ManagedElement.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
                    Class clazz = CIM_SoftwareIdentityHelper.findClass(cimClient, cimInstance);
                    
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

	public ArrayList getAssociated_CIM_ManagedElement_CIM_ElementSoftwareIdentity_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSOFTWAREIDENTITY, 
					CIM_ManagedElement.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent"); //$NON-NLS-1$
		
		
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

	public ArrayList getAssociated_CIM_System_CIM_InstalledSoftwareIdentitys(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_INSTALLEDSOFTWAREIDENTITY, 
					CIM_System.CIM_CLASS_NAME, 
					"InstalledSoftware", //$NON-NLS-1$
					"System", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
                    Class clazz = CIM_SoftwareIdentityHelper.findClass(cimClient, cimInstance);
                    
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_System(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_System(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_System(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_System_CIM_InstalledSoftwareIdentity_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_INSTALLEDSOFTWAREIDENTITY, 
					CIM_System.CIM_CLASS_NAME, 
					"InstalledSoftware", //$NON-NLS-1$
					"System"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_System.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_Product_CIM_ProductSoftwareComponents(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSOFTWARECOMPONENT, 
					CIM_Product.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
                    Class clazz = CIM_SoftwareIdentityHelper.findClass(cimClient, cimInstance);
                    
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Product(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_Product(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Product(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_Product_CIM_ProductSoftwareComponent_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PRODUCTSOFTWARECOMPONENT, 
					CIM_Product.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_Product.CIM_CLASS_NAME)) {
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
	
	// Attribute BuildNumber
	
	public UnsignedInt16 get_BuildNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareIdentity.CIM_PROPERTY_BUILDNUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_BUILDNUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_BUILDNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BuildNumber(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareIdentity.CIM_PROPERTY_BUILDNUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_BUILDNUMBER + " could not be found");
    		
		} else if (!CIM_SoftwareIdentityHelper.isValid_BuildNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SoftwareIdentity.CIM_PROPERTY_BUILDNUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_BUILDNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ClassificationDescriptions
	
	public String[] get_ClassificationDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareIdentity.CIM_PROPERTY_CLASSIFICATIONDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_CLASSIFICATIONDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_CLASSIFICATIONDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_ClassificationDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareIdentity.CIM_PROPERTY_CLASSIFICATIONDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_CLASSIFICATIONDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_SoftwareIdentityHelper.isValid_ClassificationDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SoftwareIdentity.CIM_PROPERTY_CLASSIFICATIONDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_CLASSIFICATIONDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Classifications
	
	public UnsignedInt16[] get_Classifications() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareIdentity.CIM_PROPERTY_CLASSIFICATIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_CLASSIFICATIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_CLASSIFICATIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_Classifications(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareIdentity.CIM_PROPERTY_CLASSIFICATIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_CLASSIFICATIONS + " could not be found");
    		
		} else if (!CIM_SoftwareIdentityHelper.isValid_Classifications(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SoftwareIdentity.CIM_PROPERTY_CLASSIFICATIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_CLASSIFICATIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InstanceID
	
	public String get_InstanceID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareIdentity.CIM_PROPERTY_INSTANCEID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_INSTANCEID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_INSTANCEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InstanceID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareIdentity.CIM_PROPERTY_INSTANCEID);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_SoftwareIdentity.CIM_PROPERTY_INSTANCEID + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_INSTANCEID + " could not be found");
    		
		} else if (!CIM_SoftwareIdentityHelper.isValid_InstanceID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SoftwareIdentity.CIM_PROPERTY_INSTANCEID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_INSTANCEID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Languages
	
	public String[] get_Languages() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareIdentity.CIM_PROPERTY_LANGUAGES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_LANGUAGES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_LANGUAGES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_Languages(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareIdentity.CIM_PROPERTY_LANGUAGES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_LANGUAGES + " could not be found");
    		
		} else if (!CIM_SoftwareIdentityHelper.isValid_Languages(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SoftwareIdentity.CIM_PROPERTY_LANGUAGES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_LANGUAGES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MajorVersion
	
	public UnsignedInt16 get_MajorVersion() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareIdentity.CIM_PROPERTY_MAJORVERSION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_MAJORVERSION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_MAJORVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MajorVersion(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareIdentity.CIM_PROPERTY_MAJORVERSION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_MAJORVERSION + " could not be found");
    		
		} else if (!CIM_SoftwareIdentityHelper.isValid_MajorVersion(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SoftwareIdentity.CIM_PROPERTY_MAJORVERSION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_MAJORVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Manufacturer
	
	public String get_Manufacturer() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareIdentity.CIM_PROPERTY_MANUFACTURER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_MANUFACTURER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_MANUFACTURER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Manufacturer(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareIdentity.CIM_PROPERTY_MANUFACTURER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_MANUFACTURER + " could not be found");
    		
		} else if (!CIM_SoftwareIdentityHelper.isValid_Manufacturer(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SoftwareIdentity.CIM_PROPERTY_MANUFACTURER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_MANUFACTURER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MinorVersion
	
	public UnsignedInt16 get_MinorVersion() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareIdentity.CIM_PROPERTY_MINORVERSION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_MINORVERSION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_MINORVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MinorVersion(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareIdentity.CIM_PROPERTY_MINORVERSION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_MINORVERSION + " could not be found");
    		
		} else if (!CIM_SoftwareIdentityHelper.isValid_MinorVersion(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SoftwareIdentity.CIM_PROPERTY_MINORVERSION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_MINORVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReleaseDate
	
	public Calendar get_ReleaseDate() {

		CIMProperty property = this.cimInstance.getProperty(CIM_SoftwareIdentity.CIM_PROPERTY_RELEASEDATE);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_RELEASEDATE + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_RELEASEDATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_ReleaseDate(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareIdentity.CIM_PROPERTY_RELEASEDATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_RELEASEDATE + " could not be found");
    		
		} else if (!CIM_SoftwareIdentityHelper.isValid_ReleaseDate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SoftwareIdentity.CIM_PROPERTY_RELEASEDATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_RELEASEDATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute RevisionNumber
	
	public UnsignedInt16 get_RevisionNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareIdentity.CIM_PROPERTY_REVISIONNUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_REVISIONNUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_REVISIONNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RevisionNumber(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareIdentity.CIM_PROPERTY_REVISIONNUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_REVISIONNUMBER + " could not be found");
    		
		} else if (!CIM_SoftwareIdentityHelper.isValid_RevisionNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SoftwareIdentity.CIM_PROPERTY_REVISIONNUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_REVISIONNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SerialNumber
	
	public String get_SerialNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareIdentity.CIM_PROPERTY_SERIALNUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_SERIALNUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_SERIALNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SerialNumber(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareIdentity.CIM_PROPERTY_SERIALNUMBER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_SERIALNUMBER + " could not be found");
    		
		} else if (!CIM_SoftwareIdentityHelper.isValid_SerialNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SoftwareIdentity.CIM_PROPERTY_SERIALNUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_SERIALNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TargetOperatingSystems
	
	public String[] get_TargetOperatingSystems() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareIdentity.CIM_PROPERTY_TARGETOPERATINGSYSTEMS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_TARGETOPERATINGSYSTEMS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_TARGETOPERATINGSYSTEMS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_TargetOperatingSystems(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareIdentity.CIM_PROPERTY_TARGETOPERATINGSYSTEMS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_TARGETOPERATINGSYSTEMS + " could not be found");
    		
		} else if (!CIM_SoftwareIdentityHelper.isValid_TargetOperatingSystems(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SoftwareIdentity.CIM_PROPERTY_TARGETOPERATINGSYSTEMS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_TARGETOPERATINGSYSTEMS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute VersionString
	
	public String get_VersionString() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareIdentity.CIM_PROPERTY_VERSIONSTRING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_VERSIONSTRING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_VERSIONSTRING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_VersionString(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SoftwareIdentity.CIM_PROPERTY_VERSIONSTRING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_VERSIONSTRING + " could not be found");
    		
		} else if (!CIM_SoftwareIdentityHelper.isValid_VersionString(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SoftwareIdentity.CIM_PROPERTY_VERSIONSTRING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SoftwareIdentity.CIM_PROPERTY_VERSIONSTRING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
