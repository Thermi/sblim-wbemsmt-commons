/** 
 * CIM_InterLibraryPort.java
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
 * Description:  InterLibraryPorts represent hardware that transports Physical Media between
 * connected StorageLibraries. The LibraryExchange association identifies the
 * connected Libraries, by identifying the connected InterLibraryPorts.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.lang.reflect.Constructor;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMDateTime;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMSimpleDateTime;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.cim.UnsignedInt64;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.CIMEnumeration;



/**
 *  InterLibraryPorts represent hardware that transports Physical Media between
 * connected StorageLibraries. The LibraryExchange association identifies the
 * connected Libraries, by identifying the connected InterLibraryPorts.
 */
public class CIM_InterLibraryPort extends CIM_MediaTransferDevice  {
	
	public final static String CIM_CLASS_NAME = "CIM_InterLibraryPort"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_LIBRARYEXCHANGE = "CIM_LibraryExchange"; //$NON-NLS-1$
	
	
	/**
	*	An enumeration expressing whether the Port is used for import into the Library/System which scopes and names it (value=1), export from the Library/System (value=2), or both (value=3).
	*/
	public final static String CIM_PROPERTY_DIRECTION = "Direction"; //$NON-NLS-1$
	/**
	*	The number of times that the InterLibraryPort was used to move a PhysicalMedia out of the System/StorageLibrary.
	*/
	public final static String CIM_PROPERTY_EXPORTCOUNT = "ExportCount"; //$NON-NLS-1$
	/**
	*	The number of times that the InterLibraryPort was used to move a PhysicalMedia into the System/StorageLibrary.
	*/
	public final static String CIM_PROPERTY_IMPORTCOUNT = "ImportCount"; //$NON-NLS-1$
	/**
	*	Date and time that the Port was last accessed by its System/StorageLibrary. This value may be different than that specified for the Port(s) to which this Inter LibraryPort is connected. Connected Ports are identified using the LibraryExchange association.
	*/
	public final static String CIM_PROPERTY_LASTACCESSED = "LastAccessed"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DIRECTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_EXPORTCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_IMPORTCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_LASTACCESSED);
				
		for (int i = 0; i < CIM_MediaTransferDevice.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_MediaTransferDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DIRECTION)||
				((String)CIM_MediaTransferDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_EXPORTCOUNT)||
				((String)CIM_MediaTransferDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_IMPORTCOUNT)||
				((String)CIM_MediaTransferDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LASTACCESSED)){
				continue;
			}
			
			CIM_InterLibraryPort.CIM_PropertyNameList.add(CIM_MediaTransferDevice.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DIRECTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_EXPORTCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_IMPORTCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LASTACCESSED, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
				
		for (int i = 0; i < CIM_MediaTransferDevice.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_MediaTransferDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DIRECTION)||
				((CIMProperty)CIM_MediaTransferDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_EXPORTCOUNT)||
				((CIMProperty)CIM_MediaTransferDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_IMPORTCOUNT)||
				((CIMProperty)CIM_MediaTransferDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LASTACCESSED)){
				continue;
			}
			
			CIM_InterLibraryPort.CIM_PropertyList.add(CIM_MediaTransferDevice.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_MediaTransferDevice.Java_Package_List.size(); i++) {
			if (((String)CIM_MediaTransferDevice.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_MediaTransferDevice.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_DIRECTION = {"Unknown","Import","Export","Both Import and Export"};
	
	
	public final static int DIRECTION_UNKNOWN = 0;
	public final static int DIRECTION_IMPORT = 1;
	public final static int DIRECTION_EXPORT = 2;
	public final static int DIRECTION_BOTHIMPORTANDEXPORT = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_InterLibraryPort() {

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
	public CIM_InterLibraryPort(Vector keyProperties){ 
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
	public CIM_InterLibraryPort(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_InterLibraryPort)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_InterLibraryPort)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_InterLibraryPort)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_InterLibraryPort)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_InterLibraryPort)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_InterLibraryPort)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_InterLibraryPort)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_InterLibraryPort)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_InterLibraryPort)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_InterLibraryPort)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_InterLibraryPort_CIM_LibraryExchanges(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_LIBRARYEXCHANGE, 
					CIM_InterLibraryPort.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_InterLibraryPort.Java_Package_List.size(); i++) {
						if (!((String)(CIM_InterLibraryPort.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_InterLibraryPort.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_InterLibraryPort.Java_Package_List.setElementAt((String)(CIM_InterLibraryPort.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_InterLibraryPort.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_InterLibraryPort(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_InterLibraryPort(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_InterLibraryPort(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_InterLibraryPort_CIM_LibraryExchange_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_LIBRARYEXCHANGE, 
					CIM_InterLibraryPort.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_InterLibraryPort.CIM_CLASS_NAME)) {
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
	
	// Attribute Direction
	
	public UnsignedInt16 get_Direction() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InterLibraryPort.CIM_PROPERTY_DIRECTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InterLibraryPort.CIM_PROPERTY_DIRECTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InterLibraryPort.CIM_PROPERTY_DIRECTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Direction(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InterLibraryPort.CIM_PROPERTY_DIRECTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InterLibraryPort.CIM_PROPERTY_DIRECTION + " could not be found");
    		
		} else if (!CIM_InterLibraryPortHelper.isValid_Direction(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_InterLibraryPort.CIM_PROPERTY_DIRECTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InterLibraryPort.CIM_PROPERTY_DIRECTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ExportCount
	
	public UnsignedInt64 get_ExportCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InterLibraryPort.CIM_PROPERTY_EXPORTCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InterLibraryPort.CIM_PROPERTY_EXPORTCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InterLibraryPort.CIM_PROPERTY_EXPORTCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ExportCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InterLibraryPort.CIM_PROPERTY_EXPORTCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InterLibraryPort.CIM_PROPERTY_EXPORTCOUNT + " could not be found");
    		
		} else if (!CIM_InterLibraryPortHelper.isValid_ExportCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_InterLibraryPort.CIM_PROPERTY_EXPORTCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InterLibraryPort.CIM_PROPERTY_EXPORTCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ImportCount
	
	public UnsignedInt64 get_ImportCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InterLibraryPort.CIM_PROPERTY_IMPORTCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InterLibraryPort.CIM_PROPERTY_IMPORTCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InterLibraryPort.CIM_PROPERTY_IMPORTCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ImportCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InterLibraryPort.CIM_PROPERTY_IMPORTCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InterLibraryPort.CIM_PROPERTY_IMPORTCOUNT + " could not be found");
    		
		} else if (!CIM_InterLibraryPortHelper.isValid_ImportCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_InterLibraryPort.CIM_PROPERTY_IMPORTCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InterLibraryPort.CIM_PROPERTY_IMPORTCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LastAccessed
	
	public Calendar get_LastAccessed() {

		CIMProperty property = this.cimInstance.getProperty(CIM_InterLibraryPort.CIM_PROPERTY_LASTACCESSED);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InterLibraryPort.CIM_PROPERTY_LASTACCESSED + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InterLibraryPort.CIM_PROPERTY_LASTACCESSED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_LastAccessed(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InterLibraryPort.CIM_PROPERTY_LASTACCESSED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InterLibraryPort.CIM_PROPERTY_LASTACCESSED + " could not be found");
    		
		} else if (!CIM_InterLibraryPortHelper.isValid_LastAccessed(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_InterLibraryPort.CIM_PROPERTY_LASTACCESSED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InterLibraryPort.CIM_PROPERTY_LASTACCESSED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
