/** 
 * CIM_DirectorySpecification.java
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
 * Description: The CIM_DirectorySpecification class captures the major directory structure of a SoftwareElement. This class is used to organize the files of a SoftwareElement into manageable units that can be relocated on a computer system.
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



public class CIM_DirectorySpecification extends CIM_Check  {
	
	public final static String CIM_CLASS_NAME = "CIM_DirectorySpecification";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_DIRECTORYSPECIFICATIONFILE = "CIM_DirectorySpecificationFile";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_FROMDIRECTORYSPECIFICATION = "CIM_FromDirectorySpecification";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_TODIRECTORYSPECIFICATION = "CIM_ToDirectorySpecification";
	
	
	/**
	*	The DirectoryPath property is used to capture the name of a directory. The value supplied by an application provider is actually a default or recommended path name. The value can be changed for a particular environment.
	*/
	public final static String CIM_PROPERTY_DIRECTORYPATH = "DirectoryPath"; //$NON-NLS-1$
	/**
	*	The DirectoryType property characterizes the type of directory being described.
	*/
	public final static String CIM_PROPERTY_DIRECTORYTYPE = "DirectoryType"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DIRECTORYPATH);
		CIM_PropertyNameList.add(CIM_PROPERTY_DIRECTORYTYPE);
				
		for (int i = 0; i < CIM_Check.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Check.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DIRECTORYPATH)||
				((String)CIM_Check.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DIRECTORYTYPE)){
				continue;
			}
			
			CIM_DirectorySpecification.CIM_PropertyNameList.add(CIM_Check.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DIRECTORYPATH, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DIRECTORYTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_Check.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Check.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DIRECTORYPATH)||
				((CIMProperty)CIM_Check.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DIRECTORYTYPE)){
				continue;
			}
			
			CIM_DirectorySpecification.CIM_PropertyList.add(CIM_Check.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Check.Java_Package_List.size(); i++) {
			if (((String)CIM_Check.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Check.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_DIRECTORYTYPE = {"Product base directory","Product executable directory","Product library directory","Product configuration directory","Product include directory","Product working directory","Product log directory","Shared base directory","Shared executable directory","Shared library directory","Shared include directory","System base directory","System executable directory","System library directory","System configuration directory","System include directory","System log directory","Other"};
	
	
	public final static int DIRECTORYTYPE_PRODUCTBASEDIRECTORY = 0;
	public final static int DIRECTORYTYPE_PRODUCTEXECUTABLEDIRECTORY = 1;
	public final static int DIRECTORYTYPE_PRODUCTLIBRARYDIRECTORY = 2;
	public final static int DIRECTORYTYPE_PRODUCTCONFIGURATIONDIRECTORY = 3;
	public final static int DIRECTORYTYPE_PRODUCTINCLUDEDIRECTORY = 4;
	public final static int DIRECTORYTYPE_PRODUCTWORKINGDIRECTORY = 5;
	public final static int DIRECTORYTYPE_PRODUCTLOGDIRECTORY = 6;
	public final static int DIRECTORYTYPE_SHAREDBASEDIRECTORY = 7;
	public final static int DIRECTORYTYPE_SHAREDEXECUTABLEDIRECTORY = 8;
	public final static int DIRECTORYTYPE_SHAREDLIBRARYDIRECTORY = 9;
	public final static int DIRECTORYTYPE_SHAREDINCLUDEDIRECTORY = 10;
	public final static int DIRECTORYTYPE_SYSTEMBASEDIRECTORY = 11;
	public final static int DIRECTORYTYPE_SYSTEMEXECUTABLEDIRECTORY = 12;
	public final static int DIRECTORYTYPE_SYSTEMLIBRARYDIRECTORY = 13;
	public final static int DIRECTORYTYPE_SYSTEMCONFIGURATIONDIRECTORY = 14;
	public final static int DIRECTORYTYPE_SYSTEMINCLUDEDIRECTORY = 15;
	public final static int DIRECTORYTYPE_SYSTEMLOGDIRECTORY = 16;
	public final static int DIRECTORYTYPE_OTHER = 17;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_DirectorySpecification() {

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
	public CIM_DirectorySpecification(Vector keyProperties){ 
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
	public CIM_DirectorySpecification(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_DirectorySpecification)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_DirectorySpecification)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_DirectorySpecification)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_DirectorySpecification)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_DirectorySpecification)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_DirectorySpecification)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_DirectorySpecification)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_DirectorySpecification)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_DirectorySpecification)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_DirectorySpecification)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_FileSpecification_CIM_DirectorySpecificationFiles(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_DIRECTORYSPECIFICATIONFILE, 
					CIM_FileSpecification.CIM_CLASS_NAME, 
					"DirectorySpecification",
					"FileSpecification",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_DirectorySpecification.Java_Package_List.size(); i++) {
						if (!((String)(CIM_DirectorySpecification.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_DirectorySpecification.Java_Package_List.get(i))).endsWith(".")) {
							CIM_DirectorySpecification.Java_Package_List.setElementAt((String)(CIM_DirectorySpecification.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_DirectorySpecification.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_FileSpecification(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_FileSpecification(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_FileSpecification(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_FileSpecification_CIM_DirectorySpecificationFile_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_DIRECTORYSPECIFICATIONFILE, 
					CIM_FileSpecification.CIM_CLASS_NAME, 
					"DirectorySpecification",
					"FileSpecification");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_FileSpecification.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_FileAction_CIM_FromDirectorySpecifications(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_FROMDIRECTORYSPECIFICATION, 
					CIM_FileAction.CIM_CLASS_NAME, 
					"SourceDirectory",
					"FileName",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_DirectorySpecification.Java_Package_List.size(); i++) {
						if (!((String)(CIM_DirectorySpecification.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_DirectorySpecification.Java_Package_List.get(i))).endsWith(".")) {
							CIM_DirectorySpecification.Java_Package_List.setElementAt((String)(CIM_DirectorySpecification.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_DirectorySpecification.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_FileAction(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_FileAction(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_FileAction(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_FileAction_CIM_FromDirectorySpecification_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_FROMDIRECTORYSPECIFICATION, 
					CIM_FileAction.CIM_CLASS_NAME, 
					"SourceDirectory",
					"FileName");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_FileAction.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_CopyFileAction_CIM_ToDirectorySpecifications(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_TODIRECTORYSPECIFICATION, 
					CIM_CopyFileAction.CIM_CLASS_NAME, 
					"DestinationDirectory",
					"FileName",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_DirectorySpecification.Java_Package_List.size(); i++) {
						if (!((String)(CIM_DirectorySpecification.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_DirectorySpecification.Java_Package_List.get(i))).endsWith(".")) {
							CIM_DirectorySpecification.Java_Package_List.setElementAt((String)(CIM_DirectorySpecification.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_DirectorySpecification.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_CopyFileAction(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_CopyFileAction(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_CopyFileAction(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_CopyFileAction_CIM_ToDirectorySpecification_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_TODIRECTORYSPECIFICATION, 
					CIM_CopyFileAction.CIM_CLASS_NAME, 
					"DestinationDirectory",
					"FileName");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_CopyFileAction.CIM_CLASS_NAME)) {
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
	
	// Attribute DirectoryPath
	
	public String get_DirectoryPath() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DirectorySpecification.CIM_PROPERTY_DIRECTORYPATH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DirectorySpecification.CIM_PROPERTY_DIRECTORYPATH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DirectorySpecification.CIM_PROPERTY_DIRECTORYPATH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DirectoryPath(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DirectorySpecification.CIM_PROPERTY_DIRECTORYPATH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DirectorySpecification.CIM_PROPERTY_DIRECTORYPATH + " could not be found");
    		
		} else if (!CIM_DirectorySpecificationHelper.isValid_DirectoryPath(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DirectorySpecification.CIM_PROPERTY_DIRECTORYPATH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DirectorySpecification.CIM_PROPERTY_DIRECTORYPATH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DirectoryType
	
	public UnsignedInt16 get_DirectoryType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DirectorySpecification.CIM_PROPERTY_DIRECTORYTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DirectorySpecification.CIM_PROPERTY_DIRECTORYTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DirectorySpecification.CIM_PROPERTY_DIRECTORYTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DirectoryType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DirectorySpecification.CIM_PROPERTY_DIRECTORYTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DirectorySpecification.CIM_PROPERTY_DIRECTORYTYPE + " could not be found");
    		
		} else if (!CIM_DirectorySpecificationHelper.isValid_DirectoryType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DirectorySpecification.CIM_PROPERTY_DIRECTORYTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DirectorySpecification.CIM_PROPERTY_DIRECTORYTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
