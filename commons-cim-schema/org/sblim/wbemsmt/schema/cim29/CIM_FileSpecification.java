/** 
 * CIM_FileSpecification.java
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
 * Description: FileSpecification identifies a file that is either to be on or off the system. The file is to be located in the directory identified in FileName, or by the CIM_Directory SpecificationFile association. When the Invoke methods are executed, it is expected that they will use a combination of information to check for file existence. Therefore, any of the properties with a NULL value are not checked. So, if only the FileName and MD5Checksum properties have values, they are the only ones considered by the Invoke methods.
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



public class CIM_FileSpecification extends CIM_Check  {
	
	public final static String CIM_CLASS_NAME = "CIM_FileSpecification";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_DIRECTORYSPECIFICATIONFILE = "CIM_DirectorySpecificationFile";
	
	
	/**
	*	The CRC1 property is the CRC value calculated using the middle 512K bytes of the file.
	*/
	public final static String CIM_PROPERTY_CRC1 = "CRC1"; //$NON-NLS-1$
	/**
	*	The CRC2 property is the CRC value for the middle 512K bytes of the file, modulo 3.
	*/
	public final static String CIM_PROPERTY_CRC2 = "CRC2"; //$NON-NLS-1$
	/**
	*	A checksum calculated as the 16-bit sum of the first 32 bytes of the file.
	*/
	public final static String CIM_PROPERTY_CHECKSUM = "CheckSum"; //$NON-NLS-1$
	/**
	*	The creation date and time of the file.
	*/
	public final static String CIM_PROPERTY_CREATETIMESTAMP = "CreateTimeStamp"; //$NON-NLS-1$
	/**
	*	Either the name of the file or the name of the file with a directory prefix.
	*/
	public final static String CIM_PROPERTY_FILENAME = "FileName"; //$NON-NLS-1$
	/**
	*	The size of the file in Kilobytes.
	*/
	public final static String CIM_PROPERTY_FILESIZE = "FileSize"; //$NON-NLS-1$
	/**
	*	The MD5 algorithm is a well-known algorithm for computing a 128-bit checksum for any file or object. For purposes of MOF specification of the MD5Checksum property, the MD5 algorithm always generates a 32 character string. For example: The string abcdefghijklmnopqrstuvwxyz generates the string c3fcd3d76192e4007dfb496cca67e13b. See http: //www.ietf.org - RFC1321 for details on the // implementation of the MD5 algorithm.
	*/
	public final static String CIM_PROPERTY_MD5CHECKSUM = "MD5Checksum"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CRC1);
		CIM_PropertyNameList.add(CIM_PROPERTY_CRC2);
		CIM_PropertyNameList.add(CIM_PROPERTY_CHECKSUM);
		CIM_PropertyNameList.add(CIM_PROPERTY_CREATETIMESTAMP);
		CIM_PropertyNameList.add(CIM_PROPERTY_FILENAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_FILESIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MD5CHECKSUM);
				
		for (int i = 0; i < CIM_Check.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Check.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CRC1)||
				((String)CIM_Check.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CRC2)||
				((String)CIM_Check.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CHECKSUM)||
				((String)CIM_Check.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CREATETIMESTAMP)||
				((String)CIM_Check.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FILENAME)||
				((String)CIM_Check.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FILESIZE)||
				((String)CIM_Check.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MD5CHECKSUM)){
				continue;
			}
			
			CIM_FileSpecification.CIM_PropertyNameList.add(CIM_Check.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CRC1, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CRC2, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CHECKSUM, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CREATETIMESTAMP, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FILENAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FILESIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MD5CHECKSUM, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_Check.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Check.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CRC1)||
				((CIMProperty)CIM_Check.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CRC2)||
				((CIMProperty)CIM_Check.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CHECKSUM)||
				((CIMProperty)CIM_Check.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CREATETIMESTAMP)||
				((CIMProperty)CIM_Check.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FILENAME)||
				((CIMProperty)CIM_Check.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FILESIZE)||
				((CIMProperty)CIM_Check.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MD5CHECKSUM)){
				continue;
			}
			
			CIM_FileSpecification.CIM_PropertyList.add(CIM_Check.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Check.Java_Package_List.size(); i++) {
			if (((String)CIM_Check.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Check.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_FileSpecification() {

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
	public CIM_FileSpecification(Vector keyProperties){ 
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
	public CIM_FileSpecification(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_FileSpecification)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_FileSpecification)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_FileSpecification)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_FileSpecification)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_FileSpecification)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_FileSpecification)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_FileSpecification)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_FileSpecification)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_FileSpecification)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_FileSpecification)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_DirectorySpecification_CIM_DirectorySpecificationFiles(CIMClient cimClient,
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
					CIM_DirectorySpecification.CIM_CLASS_NAME, 
					"FileSpecification",
					"DirectorySpecification",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_FileSpecification.Java_Package_List.size(); i++) {
						if (!((String)(CIM_FileSpecification.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_FileSpecification.Java_Package_List.get(i))).endsWith(".")) {
							CIM_FileSpecification.Java_Package_List.setElementAt((String)(CIM_FileSpecification.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_FileSpecification.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_DirectorySpecification(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_DirectorySpecification(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_DirectorySpecification(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_DirectorySpecification_CIM_DirectorySpecificationFile_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_DIRECTORYSPECIFICATIONFILE, 
					CIM_DirectorySpecification.CIM_CLASS_NAME, 
					"FileSpecification",
					"DirectorySpecification");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_DirectorySpecification.CIM_CLASS_NAME)) {
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
	
	// Attribute CRC1
	
	public UnsignedInt32 get_CRC1() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSpecification.CIM_PROPERTY_CRC1);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSpecification.CIM_PROPERTY_CRC1 + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSpecification.CIM_PROPERTY_CRC1 + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CRC1(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSpecification.CIM_PROPERTY_CRC1);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSpecification.CIM_PROPERTY_CRC1 + " could not be found");
    		
		} else if (!CIM_FileSpecificationHelper.isValid_CRC1(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSpecification.CIM_PROPERTY_CRC1);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSpecification.CIM_PROPERTY_CRC1 + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CRC2
	
	public UnsignedInt32 get_CRC2() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSpecification.CIM_PROPERTY_CRC2);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSpecification.CIM_PROPERTY_CRC2 + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSpecification.CIM_PROPERTY_CRC2 + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CRC2(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSpecification.CIM_PROPERTY_CRC2);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSpecification.CIM_PROPERTY_CRC2 + " could not be found");
    		
		} else if (!CIM_FileSpecificationHelper.isValid_CRC2(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSpecification.CIM_PROPERTY_CRC2);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSpecification.CIM_PROPERTY_CRC2 + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CheckSum
	
	public UnsignedInt32 get_CheckSum() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSpecification.CIM_PROPERTY_CHECKSUM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSpecification.CIM_PROPERTY_CHECKSUM + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSpecification.CIM_PROPERTY_CHECKSUM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CheckSum(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSpecification.CIM_PROPERTY_CHECKSUM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSpecification.CIM_PROPERTY_CHECKSUM + " could not be found");
    		
		} else if (!CIM_FileSpecificationHelper.isValid_CheckSum(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSpecification.CIM_PROPERTY_CHECKSUM);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSpecification.CIM_PROPERTY_CHECKSUM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CreateTimeStamp
	
	public Calendar get_CreateTimeStamp() {

		CIMProperty property = this.cimInstance.getProperty(CIM_FileSpecification.CIM_PROPERTY_CREATETIMESTAMP);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSpecification.CIM_PROPERTY_CREATETIMESTAMP + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSpecification.CIM_PROPERTY_CREATETIMESTAMP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_CreateTimeStamp(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSpecification.CIM_PROPERTY_CREATETIMESTAMP);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSpecification.CIM_PROPERTY_CREATETIMESTAMP + " could not be found");
    		
		} else if (!CIM_FileSpecificationHelper.isValid_CreateTimeStamp(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSpecification.CIM_PROPERTY_CREATETIMESTAMP);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSpecification.CIM_PROPERTY_CREATETIMESTAMP + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute FileName
	
	public String get_FileName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSpecification.CIM_PROPERTY_FILENAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSpecification.CIM_PROPERTY_FILENAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSpecification.CIM_PROPERTY_FILENAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FileName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSpecification.CIM_PROPERTY_FILENAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSpecification.CIM_PROPERTY_FILENAME + " could not be found");
    		
		} else if (!CIM_FileSpecificationHelper.isValid_FileName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSpecification.CIM_PROPERTY_FILENAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSpecification.CIM_PROPERTY_FILENAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute FileSize
	
	public UnsignedInt64 get_FileSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSpecification.CIM_PROPERTY_FILESIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSpecification.CIM_PROPERTY_FILESIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSpecification.CIM_PROPERTY_FILESIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_FileSize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSpecification.CIM_PROPERTY_FILESIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSpecification.CIM_PROPERTY_FILESIZE + " could not be found");
    		
		} else if (!CIM_FileSpecificationHelper.isValid_FileSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSpecification.CIM_PROPERTY_FILESIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSpecification.CIM_PROPERTY_FILESIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MD5Checksum
	
	public String get_MD5Checksum() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSpecification.CIM_PROPERTY_MD5CHECKSUM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSpecification.CIM_PROPERTY_MD5CHECKSUM + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSpecification.CIM_PROPERTY_MD5CHECKSUM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MD5Checksum(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_FileSpecification.CIM_PROPERTY_MD5CHECKSUM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_FileSpecification.CIM_PROPERTY_MD5CHECKSUM + " could not be found");
    		
		} else if (!CIM_FileSpecificationHelper.isValid_MD5Checksum(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_FileSpecification.CIM_PROPERTY_MD5CHECKSUM);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_FileSpecification.CIM_PROPERTY_MD5CHECKSUM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
