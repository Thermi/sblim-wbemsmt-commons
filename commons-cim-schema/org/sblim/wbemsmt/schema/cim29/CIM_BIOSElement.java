/** 
 * CIM_BIOSElement.java
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
 * Description: BIOSElement represents the low-level software that is loaded into non-volatile storage and used to bring up and configure a ComputerSystem.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.Calendar;
import java.util.ArrayList;
import java.util.Enumeration;
import java.lang.reflect.Constructor;
import org.sblim.wbem.client.*;



public class CIM_BIOSElement extends CIM_SoftwareElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_BIOSElement";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS = "CIM_BIOSFeatureBIOSElements";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV = "CIM_BIOSLoadedInNV";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMBIOS = "CIM_SystemBIOS";
	
	
	/**
	*	The currently selected language for the BIOS. This information can be obtained from SMBIOS, using the Current Language attribute of the Type 13 structure, to index into the string list following the structure. The property is formatted using the ISO 639 Language Name, and may be followed by the ISO 3166 Territory Name and the encoding method.
	*/
	public final static String CIM_PROPERTY_CURRENTLANGUAGE = "CurrentLanguage"; //$NON-NLS-1$
	/**
	*	A list of installable languages for the BIOS. This information can be obtained from SMBIOS, from the string list that follows the Type 13 structure. An ISO 639 Language Name should be used to specify the BIOS' installable languages. The ISO 3166 Territory Name and the encoding method may also be specified, following the Language Name.
	*/
	public final static String CIM_PROPERTY_LISTOFLANGUAGES = "ListOfLanguages"; //$NON-NLS-1$
	/**
	*	A free form string describing the BIOS flash/load utility that is required to update the BIOSElement. Version and other information may be indicated in this property.
	*/
	public final static String CIM_PROPERTY_LOADUTILITYINFORMATION = "LoadUtilityInformation"; //$NON-NLS-1$
	/**
	*	The ending address of the memory which this BIOS occupies.
	*/
	public final static String CIM_PROPERTY_LOADEDENDINGADDRESS = "LoadedEndingAddress"; //$NON-NLS-1$
	/**
	*	The starting address of the memory which this BIOS occupies.
	*/
	public final static String CIM_PROPERTY_LOADEDSTARTINGADDRESS = "LoadedStartingAddress"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_MANUFACTURER = "Manufacturer"; //$NON-NLS-1$
	/**
	*	If true, this is the primary BIOS of the ComputerSystem.
	*/
	public final static String CIM_PROPERTY_PRIMARYBIOS = "PrimaryBIOS"; //$NON-NLS-1$
	/**
	*	Date that this BIOS was released.
	*/
	public final static String CIM_PROPERTY_RELEASEDATE = "ReleaseDate"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_VERSION = "Version"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTLANGUAGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_LISTOFLANGUAGES);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOADUTILITYINFORMATION);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOADEDENDINGADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_LOADEDSTARTINGADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_MANUFACTURER);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRIMARYBIOS);
		CIM_PropertyNameList.add(CIM_PROPERTY_RELEASEDATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_VERSION);
				
		for (int i = 0; i < CIM_SoftwareElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SoftwareElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTLANGUAGE)||
				((String)CIM_SoftwareElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LISTOFLANGUAGES)||
				((String)CIM_SoftwareElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOADUTILITYINFORMATION)||
				((String)CIM_SoftwareElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOADEDENDINGADDRESS)||
				((String)CIM_SoftwareElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LOADEDSTARTINGADDRESS)||
				((String)CIM_SoftwareElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MANUFACTURER)||
				((String)CIM_SoftwareElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRIMARYBIOS)||
				((String)CIM_SoftwareElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RELEASEDATE)||
				((String)CIM_SoftwareElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VERSION)){
				continue;
			}
			
			CIM_BIOSElement.CIM_PropertyNameList.add(CIM_SoftwareElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTLANGUAGE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LISTOFLANGUAGES, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOADUTILITYINFORMATION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOADEDENDINGADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LOADEDSTARTINGADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MANUFACTURER, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRIMARYBIOS, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RELEASEDATE, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VERSION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_SoftwareElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SoftwareElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTLANGUAGE)||
				((CIMProperty)CIM_SoftwareElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LISTOFLANGUAGES)||
				((CIMProperty)CIM_SoftwareElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOADUTILITYINFORMATION)||
				((CIMProperty)CIM_SoftwareElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOADEDENDINGADDRESS)||
				((CIMProperty)CIM_SoftwareElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LOADEDSTARTINGADDRESS)||
				((CIMProperty)CIM_SoftwareElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MANUFACTURER)||
				((CIMProperty)CIM_SoftwareElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRIMARYBIOS)||
				((CIMProperty)CIM_SoftwareElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RELEASEDATE)||
				((CIMProperty)CIM_SoftwareElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VERSION)){
				continue;
			}
			
			CIM_BIOSElement.CIM_PropertyList.add(CIM_SoftwareElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_SoftwareElement.Java_Package_List.size(); i++) {
			if (((String)CIM_SoftwareElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_SoftwareElement.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_BIOSElement() {

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
	public CIM_BIOSElement(Vector keyProperties){ 
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
	public CIM_BIOSElement(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_BIOSElement)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_BIOSElement)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_BIOSElement)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_BIOSElement)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_BIOSElement)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_BIOSElement)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_BIOSElement)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_BIOSElement)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_BIOSElement)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_BIOSElement)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_BIOSFeature_CIM_BIOSFeatureBIOSElementss(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS, 
					CIM_BIOSFeature.CIM_CLASS_NAME, 
					"PartComponent",
					"GroupComponent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_BIOSElement.Java_Package_List.size(); i++) {
						if (!((String)(CIM_BIOSElement.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_BIOSElement.Java_Package_List.get(i))).endsWith(".")) {
							CIM_BIOSElement.Java_Package_List.setElementAt((String)(CIM_BIOSElement.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_BIOSElement.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BIOSFeature(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_BIOSFeature(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BIOSFeature(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_BIOSFeature_CIM_BIOSFeatureBIOSElements_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSFEATUREBIOSELEMENTS, 
					CIM_BIOSFeature.CIM_CLASS_NAME, 
					"PartComponent",
					"GroupComponent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_BIOSFeature.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_Memory_CIM_BIOSLoadedInNVs(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV, 
					CIM_Memory.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_BIOSElement.Java_Package_List.size(); i++) {
						if (!((String)(CIM_BIOSElement.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_BIOSElement.Java_Package_List.get(i))).endsWith(".")) {
							CIM_BIOSElement.Java_Package_List.setElementAt((String)(CIM_BIOSElement.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_BIOSElement.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Memory(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_Memory(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_Memory(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_Memory_CIM_BIOSLoadedInNV_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV, 
					CIM_Memory.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_Memory.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_ComputerSystem_CIM_SystemBIOSs(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMBIOS, 
					CIM_ComputerSystem.CIM_CLASS_NAME, 
					"PartComponent",
					"GroupComponent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_BIOSElement.Java_Package_List.size(); i++) {
						if (!((String)(CIM_BIOSElement.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_BIOSElement.Java_Package_List.get(i))).endsWith(".")) {
							CIM_BIOSElement.Java_Package_List.setElementAt((String)(CIM_BIOSElement.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_BIOSElement.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ComputerSystem(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_ComputerSystem(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ComputerSystem(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_ComputerSystem_CIM_SystemBIOS_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_SYSTEMBIOS, 
					CIM_ComputerSystem.CIM_CLASS_NAME, 
					"PartComponent",
					"GroupComponent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ComputerSystem.CIM_CLASS_NAME)) {
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
	
	// Attribute CurrentLanguage
	
	public String get_CurrentLanguage() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSElement.CIM_PROPERTY_CURRENTLANGUAGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSElement.CIM_PROPERTY_CURRENTLANGUAGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSElement.CIM_PROPERTY_CURRENTLANGUAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CurrentLanguage(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSElement.CIM_PROPERTY_CURRENTLANGUAGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSElement.CIM_PROPERTY_CURRENTLANGUAGE + " could not be found");
    		
		} else if (!CIM_BIOSElementHelper.isValid_CurrentLanguage(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BIOSElement.CIM_PROPERTY_CURRENTLANGUAGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSElement.CIM_PROPERTY_CURRENTLANGUAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ListOfLanguages
	
	public String[] get_ListOfLanguages() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSElement.CIM_PROPERTY_LISTOFLANGUAGES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSElement.CIM_PROPERTY_LISTOFLANGUAGES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSElement.CIM_PROPERTY_LISTOFLANGUAGES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_ListOfLanguages(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSElement.CIM_PROPERTY_LISTOFLANGUAGES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSElement.CIM_PROPERTY_LISTOFLANGUAGES + " could not be found");
    		
		} else if (!CIM_BIOSElementHelper.isValid_ListOfLanguages(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BIOSElement.CIM_PROPERTY_LISTOFLANGUAGES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSElement.CIM_PROPERTY_LISTOFLANGUAGES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LoadUtilityInformation
	
	public String get_LoadUtilityInformation() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSElement.CIM_PROPERTY_LOADUTILITYINFORMATION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSElement.CIM_PROPERTY_LOADUTILITYINFORMATION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSElement.CIM_PROPERTY_LOADUTILITYINFORMATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LoadUtilityInformation(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSElement.CIM_PROPERTY_LOADUTILITYINFORMATION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSElement.CIM_PROPERTY_LOADUTILITYINFORMATION + " could not be found");
    		
		} else if (!CIM_BIOSElementHelper.isValid_LoadUtilityInformation(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BIOSElement.CIM_PROPERTY_LOADUTILITYINFORMATION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSElement.CIM_PROPERTY_LOADUTILITYINFORMATION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LoadedEndingAddress
	
	public UnsignedInt64 get_LoadedEndingAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSElement.CIM_PROPERTY_LOADEDENDINGADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSElement.CIM_PROPERTY_LOADEDENDINGADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSElement.CIM_PROPERTY_LOADEDENDINGADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LoadedEndingAddress(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSElement.CIM_PROPERTY_LOADEDENDINGADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSElement.CIM_PROPERTY_LOADEDENDINGADDRESS + " could not be found");
    		
		} else if (!CIM_BIOSElementHelper.isValid_LoadedEndingAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BIOSElement.CIM_PROPERTY_LOADEDENDINGADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSElement.CIM_PROPERTY_LOADEDENDINGADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LoadedStartingAddress
	
	public UnsignedInt64 get_LoadedStartingAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSElement.CIM_PROPERTY_LOADEDSTARTINGADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSElement.CIM_PROPERTY_LOADEDSTARTINGADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSElement.CIM_PROPERTY_LOADEDSTARTINGADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LoadedStartingAddress(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSElement.CIM_PROPERTY_LOADEDSTARTINGADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSElement.CIM_PROPERTY_LOADEDSTARTINGADDRESS + " could not be found");
    		
		} else if (!CIM_BIOSElementHelper.isValid_LoadedStartingAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BIOSElement.CIM_PROPERTY_LOADEDSTARTINGADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSElement.CIM_PROPERTY_LOADEDSTARTINGADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Manufacturer
	
	public String get_Manufacturer() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSElement.CIM_PROPERTY_MANUFACTURER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSElement.CIM_PROPERTY_MANUFACTURER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSElement.CIM_PROPERTY_MANUFACTURER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Manufacturer(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSElement.CIM_PROPERTY_MANUFACTURER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSElement.CIM_PROPERTY_MANUFACTURER + " could not be found");
    		
		} else if (!CIM_BIOSElementHelper.isValid_Manufacturer(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BIOSElement.CIM_PROPERTY_MANUFACTURER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSElement.CIM_PROPERTY_MANUFACTURER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PrimaryBIOS
	
	public Boolean get_PrimaryBIOS() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSElement.CIM_PROPERTY_PRIMARYBIOS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSElement.CIM_PROPERTY_PRIMARYBIOS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSElement.CIM_PROPERTY_PRIMARYBIOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PrimaryBIOS(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSElement.CIM_PROPERTY_PRIMARYBIOS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSElement.CIM_PROPERTY_PRIMARYBIOS + " could not be found");
    		
		} else if (!CIM_BIOSElementHelper.isValid_PrimaryBIOS(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BIOSElement.CIM_PROPERTY_PRIMARYBIOS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSElement.CIM_PROPERTY_PRIMARYBIOS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ReleaseDate
	
	public Calendar get_ReleaseDate() {

		CIMProperty property = this.cimInstance.getProperty(CIM_BIOSElement.CIM_PROPERTY_RELEASEDATE);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSElement.CIM_PROPERTY_RELEASEDATE + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSElement.CIM_PROPERTY_RELEASEDATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_ReleaseDate(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSElement.CIM_PROPERTY_RELEASEDATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSElement.CIM_PROPERTY_RELEASEDATE + " could not be found");
    		
		} else if (!CIM_BIOSElementHelper.isValid_ReleaseDate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BIOSElement.CIM_PROPERTY_RELEASEDATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSElement.CIM_PROPERTY_RELEASEDATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute Version
	
	public String get_Version() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSElement.CIM_PROPERTY_VERSION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSElement.CIM_PROPERTY_VERSION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSElement.CIM_PROPERTY_VERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Version(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_BIOSElement.CIM_PROPERTY_VERSION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_BIOSElement.CIM_PROPERTY_VERSION + " could not be found");
    		
		} else if (!CIM_BIOSElementHelper.isValid_Version(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_BIOSElement.CIM_PROPERTY_VERSION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_BIOSElement.CIM_PROPERTY_VERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
