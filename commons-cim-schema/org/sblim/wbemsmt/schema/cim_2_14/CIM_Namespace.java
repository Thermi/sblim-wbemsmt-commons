/** 
 * CIM_Namespace.java
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
 * Description:  Namespace provides a domain (in other words, a container), in which the
 * instances [of a class] are guaranteed to be unique per the KEY qualifier
 * definitions. It is named relative to the CIM_ObjectManager implementation
 * that provides such a domain.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.lang.reflect.Constructor;
import org.sblim.wbem.client.*;



/**
 *  Namespace provides a domain (in other words, a container), in which the
 * instances [of a class] are guaranteed to be unique per the KEY qualifier
 * definitions. It is named relative to the CIM_ObjectManager implementation
 * that provides such a domain.
 */
public class CIM_Namespace extends CIM_ManagedElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_Namespace"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_NAMESPACEINMANAGER = "CIM_NamespaceInManager"; //$NON-NLS-1$
	
	
	/**
	*	Enumeration indicating the organization/schema of the Namespace's objects. For example, they may be instances of classes of a specific CIM version.
	*/
	public final static String CIM_PROPERTY_CLASSINFO = "ClassInfo"; //$NON-NLS-1$
	/**
	*	Enumeration indicating the schema of the Namespace's objects. For example, they may be instances of classes of a specific CIM version or a mapping from another standard, such as SNMP. If 'Other' is selected, the DescriptionOfClassType property MUST be populated.
	*/
	public final static String CIM_PROPERTY_CLASSTYPE = "ClassType"; //$NON-NLS-1$
	/**
	*	The version of the objects in this namespace. The string representing the version MUST be in the form: 
M + "." + N + "." + U 
Where: 
M - The major version (in numeric form) 
N - The minor version (in numeric form) 
U - The update (e.g. errata, patch, ..., in numeric form)
	*/
	public final static String CIM_PROPERTY_CLASSTYPEVERSION = "ClassTypeVersion"; //$NON-NLS-1$
	/**
	*	CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	*/
	public final static String CIM_PROPERTY_CREATIONCLASSNAME = "CreationClassName"; //$NON-NLS-1$
	/**
	*	A string providing more detail (beyond the general classification in ClassInfo) for the object hierarchy of the Namespace.
	*/
	public final static String CIM_PROPERTY_DESCRIPTIONOFCLASSINFO = "DescriptionOfClassInfo"; //$NON-NLS-1$
	/**
	*	A string providing more detail (beyond the general classification in ClassInfo) for the object hierarchy of the Namespace.
	*/
	public final static String CIM_PROPERTY_DESCRIPTIONOFCLASSTYPE = "DescriptionOfClassType"; //$NON-NLS-1$
	/**
	*	A string to uniquely identify the Namespace within the ObjectManager.
	*/
	public final static String CIM_PROPERTY_NAME = "Name"; //$NON-NLS-1$
	/**
	*	The scoping ObjectManager's CreationClassName.
	*/
	public final static String CIM_PROPERTY_OBJECTMANAGERCREATIONCLASSNAME = "ObjectManagerCreationClassName"; //$NON-NLS-1$
	/**
	*	The scoping ObjectManager's Name.
	*/
	public final static String CIM_PROPERTY_OBJECTMANAGERNAME = "ObjectManagerName"; //$NON-NLS-1$
	/**
	*	The scoping System's CreationClassName.
	*/
	public final static String CIM_PROPERTY_SYSTEMCREATIONCLASSNAME = "SystemCreationClassName"; //$NON-NLS-1$
	/**
	*	The scoping System's Name.
	*/
	public final static String CIM_PROPERTY_SYSTEMNAME = "SystemName"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASSINFO);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASSTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASSTYPEVERSION);
		CIM_PropertyNameList.add(CIM_PROPERTY_CREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_DESCRIPTIONOFCLASSINFO);
		CIM_PropertyNameList.add(CIM_PROPERTY_DESCRIPTIONOFCLASSTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_OBJECTMANAGERCREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_OBJECTMANAGERNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYSTEMNAME);
				
		for (int i = 0; i < CIM_ManagedElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASSINFO)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASSTYPE)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASSTYPEVERSION)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DESCRIPTIONOFCLASSINFO)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DESCRIPTIONOFCLASSTYPE)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAME)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OBJECTMANAGERCREATIONCLASSNAME)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OBJECTMANAGERNAME)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME)||
				((String)CIM_ManagedElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYSTEMNAME)){
				continue;
			}
			
			CIM_Namespace.CIM_PropertyNameList.add(CIM_ManagedElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASSINFO, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASSTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASSTYPEVERSION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DESCRIPTIONOFCLASSINFO, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DESCRIPTIONOFCLASSTYPE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OBJECTMANAGERCREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OBJECTMANAGERNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYSTEMNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_ManagedElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASSINFO)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASSTYPE)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASSTYPEVERSION)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DESCRIPTIONOFCLASSINFO)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DESCRIPTIONOFCLASSTYPE)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAME)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OBJECTMANAGERCREATIONCLASSNAME)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OBJECTMANAGERNAME)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME)||
				((CIMProperty)CIM_ManagedElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYSTEMNAME)){
				continue;
			}
			
			CIM_Namespace.CIM_PropertyList.add(CIM_ManagedElement.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim_2_14");
				
		String[] parentClassPackageList = CIM_ManagedElement.getPackages();
		
		for (int i = 0; i < parentClassPackageList.length; i++) {
			Java_Package_List.add(parentClassPackageList[i]);
		}
	};
			
	public final static String[] CIM_VALUEMAP_CLASSINFO = {"Unknown","Other","CIM 1.0","CIM 2.0","CIM 2.1","CIM 2.2","CIM 2.3","CIM 2.4","CIM 2.5","CIM 2.6","CIM 2.7","CIM 2.8","DMI Recast","SNMP Recast","CMIP Recast"};
	public final static String[] CIM_VALUEMAP_CLASSTYPE = {"Unknown","Other","CIM","DMI Recast","SNMP Recast","CMIP Recast"};
	
	
	public final static int CLASSINFO_UNKNOWN = 0;
	public final static int CLASSINFO_OTHER = 1;
	public final static int CLASSINFO_CIM1_0 = 2;
	public final static int CLASSINFO_CIM2_0 = 3;
	public final static int CLASSINFO_CIM2_1 = 4;
	public final static int CLASSINFO_CIM2_2 = 5;
	public final static int CLASSINFO_CIM2_3 = 6;
	public final static int CLASSINFO_CIM2_4 = 7;
	public final static int CLASSINFO_CIM2_5 = 8;
	public final static int CLASSINFO_CIM2_6 = 9;
	public final static int CLASSINFO_CIM2_7 = 10;
	public final static int CLASSINFO_CIM2_8 = 11;
	public final static int CLASSINFO_DMIRECAST = 200;
	public final static int CLASSINFO_SNMPRECAST = 201;
	public final static int CLASSINFO_CMIPRECAST = 202;
	
	public final static int CLASSTYPE_UNKNOWN = 0;
	public final static int CLASSTYPE_OTHER = 1;
	public final static int CLASSTYPE_CIM = 2;
	public final static int CLASSTYPE_DMIRECAST = 200;
	public final static int CLASSTYPE_SNMPRECAST = 201;
	public final static int CLASSTYPE_CMIPRECAST = 202;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_Namespace() {

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
	public CIM_Namespace(Vector keyProperties){ 
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
	public CIM_Namespace(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
            CIM_Namespace.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_Namespace.Java_Package_List.toArray(new String[CIM_Namespace.Java_Package_List.size()]);
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
		
		CIMProperty CIMProperty_ClassInfo = this.cimInstance.getProperty(CIM_PROPERTY_CLASSINFO);
		
		if (CIMProperty_ClassInfo == null || CIMProperty_ClassInfo.getValue().isEmpty() || CIMProperty_ClassInfo.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_CLASSINFO, "Required"});
			result = false;
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
		
		CIMProperty CIMProperty_ObjectManagerCreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_OBJECTMANAGERCREATIONCLASSNAME);
		
		if (CIMProperty_ObjectManagerCreationClassName == null || CIMProperty_ObjectManagerCreationClassName.getValue().isEmpty() || CIMProperty_ObjectManagerCreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_OBJECTMANAGERCREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_ObjectManagerName = this.cimInstance.getProperty(CIM_PROPERTY_OBJECTMANAGERNAME);
		
		if (CIMProperty_ObjectManagerName == null || CIMProperty_ObjectManagerName.getValue().isEmpty() || CIMProperty_ObjectManagerName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_OBJECTMANAGERNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_SystemCreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
		
		if (CIMProperty_SystemCreationClassName == null || CIMProperty_SystemCreationClassName.getValue().isEmpty() || CIMProperty_SystemCreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_SYSTEMCREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_SystemName = this.cimInstance.getProperty(CIM_PROPERTY_SYSTEMNAME);
		
		if (CIMProperty_SystemName == null || CIMProperty_SystemName.getValue().isEmpty() || CIMProperty_SystemName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_SYSTEMNAME, "Key"});
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
	    
	    if (!(object instanceof CIM_Namespace)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_Namespace)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_Namespace)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_Namespace)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_Namespace)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_Namespace)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_Namespace)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_Namespace)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_Namespace)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_Namespace)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_ObjectManager_CIM_NamespaceInManagers(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_NAMESPACEINMANAGER, 
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
                    Class clazz = CIM_NamespaceHelper.findClass(cimClient, cimInstance);
                    
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

	public ArrayList getAssociated_CIM_ObjectManager_CIM_NamespaceInManager_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_NAMESPACEINMANAGER, 
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

	
	
	//*****************************************************
	// Attribute methods
	//*****************************************************
	
	// Attribute ClassInfo
	
	public UnsignedInt16 get_ClassInfo() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Namespace.CIM_PROPERTY_CLASSINFO);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Namespace.CIM_PROPERTY_CLASSINFO + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Namespace.CIM_PROPERTY_CLASSINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ClassInfo(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Namespace.CIM_PROPERTY_CLASSINFO);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Namespace.CIM_PROPERTY_CLASSINFO + " could not be found");
    		
		} else if (!CIM_NamespaceHelper.isValid_ClassInfo(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Namespace.CIM_PROPERTY_CLASSINFO);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Namespace.CIM_PROPERTY_CLASSINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ClassType
	
	public UnsignedInt16 get_ClassType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Namespace.CIM_PROPERTY_CLASSTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Namespace.CIM_PROPERTY_CLASSTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Namespace.CIM_PROPERTY_CLASSTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ClassType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Namespace.CIM_PROPERTY_CLASSTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Namespace.CIM_PROPERTY_CLASSTYPE + " could not be found");
    		
		} else if (!CIM_NamespaceHelper.isValid_ClassType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Namespace.CIM_PROPERTY_CLASSTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Namespace.CIM_PROPERTY_CLASSTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ClassTypeVersion
	
	public String get_ClassTypeVersion() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Namespace.CIM_PROPERTY_CLASSTYPEVERSION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Namespace.CIM_PROPERTY_CLASSTYPEVERSION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Namespace.CIM_PROPERTY_CLASSTYPEVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ClassTypeVersion(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Namespace.CIM_PROPERTY_CLASSTYPEVERSION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Namespace.CIM_PROPERTY_CLASSTYPEVERSION + " could not be found");
    		
		} else if (!CIM_NamespaceHelper.isValid_ClassTypeVersion(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Namespace.CIM_PROPERTY_CLASSTYPEVERSION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Namespace.CIM_PROPERTY_CLASSTYPEVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CreationClassName
	
	public String get_CreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Namespace.CIM_PROPERTY_CREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Namespace.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Namespace.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Namespace.CIM_PROPERTY_CREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_Namespace.CIM_PROPERTY_CREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Namespace.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_NamespaceHelper.isValid_CreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Namespace.CIM_PROPERTY_CREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Namespace.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DescriptionOfClassInfo
	
	public String get_DescriptionOfClassInfo() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Namespace.CIM_PROPERTY_DESCRIPTIONOFCLASSINFO);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Namespace.CIM_PROPERTY_DESCRIPTIONOFCLASSINFO + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Namespace.CIM_PROPERTY_DESCRIPTIONOFCLASSINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DescriptionOfClassInfo(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Namespace.CIM_PROPERTY_DESCRIPTIONOFCLASSINFO);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Namespace.CIM_PROPERTY_DESCRIPTIONOFCLASSINFO + " could not be found");
    		
		} else if (!CIM_NamespaceHelper.isValid_DescriptionOfClassInfo(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Namespace.CIM_PROPERTY_DESCRIPTIONOFCLASSINFO);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Namespace.CIM_PROPERTY_DESCRIPTIONOFCLASSINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DescriptionOfClassType
	
	public String get_DescriptionOfClassType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Namespace.CIM_PROPERTY_DESCRIPTIONOFCLASSTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Namespace.CIM_PROPERTY_DESCRIPTIONOFCLASSTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Namespace.CIM_PROPERTY_DESCRIPTIONOFCLASSTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DescriptionOfClassType(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Namespace.CIM_PROPERTY_DESCRIPTIONOFCLASSTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Namespace.CIM_PROPERTY_DESCRIPTIONOFCLASSTYPE + " could not be found");
    		
		} else if (!CIM_NamespaceHelper.isValid_DescriptionOfClassType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Namespace.CIM_PROPERTY_DESCRIPTIONOFCLASSTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Namespace.CIM_PROPERTY_DESCRIPTIONOFCLASSTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Name
	
	public String get_Name() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Namespace.CIM_PROPERTY_NAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Namespace.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Namespace.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Name(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Namespace.CIM_PROPERTY_NAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_Namespace.CIM_PROPERTY_NAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Namespace.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (!CIM_NamespaceHelper.isValid_Name(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Namespace.CIM_PROPERTY_NAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Namespace.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ObjectManagerCreationClassName
	
	public String get_ObjectManagerCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Namespace.CIM_PROPERTY_OBJECTMANAGERCREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Namespace.CIM_PROPERTY_OBJECTMANAGERCREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Namespace.CIM_PROPERTY_OBJECTMANAGERCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ObjectManagerCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Namespace.CIM_PROPERTY_OBJECTMANAGERCREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_Namespace.CIM_PROPERTY_OBJECTMANAGERCREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Namespace.CIM_PROPERTY_OBJECTMANAGERCREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_NamespaceHelper.isValid_ObjectManagerCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Namespace.CIM_PROPERTY_OBJECTMANAGERCREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Namespace.CIM_PROPERTY_OBJECTMANAGERCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ObjectManagerName
	
	public String get_ObjectManagerName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Namespace.CIM_PROPERTY_OBJECTMANAGERNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Namespace.CIM_PROPERTY_OBJECTMANAGERNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Namespace.CIM_PROPERTY_OBJECTMANAGERNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ObjectManagerName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Namespace.CIM_PROPERTY_OBJECTMANAGERNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_Namespace.CIM_PROPERTY_OBJECTMANAGERNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Namespace.CIM_PROPERTY_OBJECTMANAGERNAME + " could not be found");
    		
		} else if (!CIM_NamespaceHelper.isValid_ObjectManagerName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Namespace.CIM_PROPERTY_OBJECTMANAGERNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Namespace.CIM_PROPERTY_OBJECTMANAGERNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SystemCreationClassName
	
	public String get_SystemCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Namespace.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Namespace.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Namespace.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SystemCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Namespace.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_Namespace.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Namespace.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_NamespaceHelper.isValid_SystemCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Namespace.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Namespace.CIM_PROPERTY_SYSTEMCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SystemName
	
	public String get_SystemName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Namespace.CIM_PROPERTY_SYSTEMNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Namespace.CIM_PROPERTY_SYSTEMNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Namespace.CIM_PROPERTY_SYSTEMNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SystemName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Namespace.CIM_PROPERTY_SYSTEMNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_Namespace.CIM_PROPERTY_SYSTEMNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Namespace.CIM_PROPERTY_SYSTEMNAME + " could not be found");
    		
		} else if (!CIM_NamespaceHelper.isValid_SystemName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Namespace.CIM_PROPERTY_SYSTEMNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Namespace.CIM_PROPERTY_SYSTEMNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
