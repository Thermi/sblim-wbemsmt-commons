/** 
 * CIM_StorageLibrary.java
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
 * Description: A StorageLibrary is a collection of ManagedSystemElements that operate together to provide cartridge library capabilities. This object serves as an aggregation point to group the following elements: MediaTransferDevices, a Label Reader, a library Door, MediaAccessDevices, and other Library components.
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



public class CIM_StorageLibrary extends CIM_System  {
	
	public final static String CIM_CLASS_NAME = "CIM_StorageLibrary";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_LIBRARYPACKAGE = "CIM_LibraryPackage";
	
	
	/**
	*	Boolean set to TRUE if an audit of the location of some or all of the Library's PhysicalMedia is currently being performed. That an individual Changer is currently doing an audit is indicated by a similar AuditInProgress boolean property on the Changer object.
	*/
	public final static String CIM_PROPERTY_AUDITINPROGRESS = "AuditInProgress"; //$NON-NLS-1$
	/**
	*	Boolean set to TRUE if the Library can not currently report the correct state of each PhysicalMedia within its proper StorageMediaLocation.
	*/
	public final static String CIM_PROPERTY_AUDITNEEDED = "AuditNeeded"; //$NON-NLS-1$
	/**
	*	Boolean set to TRUE if the Library includes a robotics mechanism that can be controlled by a ComputerSystem, to automatically load and unload PhysicalMedia to/from MediaAccessDevices and StorageMediaLocations. The property is set to FALSE if the Library represents a repository of Media that are inaccessible to a MediaAccess Device without human intervention. An example of a non- automated Library is a 'shelf' or 'vault' where Physical Media are kept for extended periods of time.
	*/
	public final static String CIM_PROPERTY_AUTOMATED = "Automated"; //$NON-NLS-1$
	/**
	*	Capabilities of the StorageLibrary. For example, it can be indicated that the Library can perform automatic cleaning of the MediaAccessDevices contained in it (value=1) or that the Library provides physical door access for an operator (value=2).
	*/
	public final static String CIM_PROPERTY_CAPABILITIES = "Capabilities"; //$NON-NLS-1$
	/**
	*	Maximum time in seconds that it takes for the Storage Library to perform a complete audit of each StorageMedia Location, to determine the absence or presence of a Physical Media. If automated support is not provided, then this property's value is undefined.
	*/
	public final static String CIM_PROPERTY_MAXAUDITTIME = "MaxAuditTime"; //$NON-NLS-1$
	/**
	*	Boolean set to TRUE if there are more PhysicalMedia in a Library than there are StorageMediaLocations to contain them. For instance, if all MediaAccessDevices have a Media loaded in them, and all StorageMediaLocations are loaded by an operator, then an Overfilled condition exists.
	*/
	public final static String CIM_PROPERTY_OVERFILLED = "Overfilled"; //$NON-NLS-1$
	/**
	*	Boolean indicating whether the Library's robotics are currently active/enabled. If TRUE, then the Library may not be safe for a human to enter.
	*/
	public final static String CIM_PROPERTY_ROBOTICSENABLED = "RoboticsEnabled"; //$NON-NLS-1$
	
	
	/**
	*	Requests that the Library robotics be enabled for automated operation (input parameter, Enabled, set to TRUE), or disabled for manual operation (input parameter set to FALSE). The return value should be 0 if the request was successfully executed, 1 if the request is not supported and some other value if an error occurred. In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	*/
	public final static String CIM_METHOD_ENABLEROBOTICS = "EnableRobotics";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_AUDITINPROGRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_AUDITNEEDED);
		CIM_PropertyNameList.add(CIM_PROPERTY_AUTOMATED);
		CIM_PropertyNameList.add(CIM_PROPERTY_CAPABILITIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXAUDITTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_OVERFILLED);
		CIM_PropertyNameList.add(CIM_PROPERTY_ROBOTICSENABLED);
				
		for (int i = 0; i < CIM_System.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_System.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AUDITINPROGRESS)||
				((String)CIM_System.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AUDITNEEDED)||
				((String)CIM_System.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AUTOMATED)||
				((String)CIM_System.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CAPABILITIES)||
				((String)CIM_System.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXAUDITTIME)||
				((String)CIM_System.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OVERFILLED)||
				((String)CIM_System.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ROBOTICSENABLED)){
				continue;
			}
			
			CIM_StorageLibrary.CIM_PropertyNameList.add(CIM_System.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AUDITINPROGRESS, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AUDITNEEDED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AUTOMATED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CAPABILITIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXAUDITTIME, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OVERFILLED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ROBOTICSENABLED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
				
		for (int i = 0; i < CIM_System.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_System.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AUDITINPROGRESS)||
				((CIMProperty)CIM_System.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AUDITNEEDED)||
				((CIMProperty)CIM_System.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AUTOMATED)||
				((CIMProperty)CIM_System.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CAPABILITIES)||
				((CIMProperty)CIM_System.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXAUDITTIME)||
				((CIMProperty)CIM_System.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OVERFILLED)||
				((CIMProperty)CIM_System.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ROBOTICSENABLED)){
				continue;
			}
			
			CIM_StorageLibrary.CIM_PropertyList.add(CIM_System.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_System.Java_Package_List.size(); i++) {
			if (((String)CIM_System.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_System.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_CAPABILITIES = {"Unknown","Other","Automatic Cleaning","Manual Operation","Front Panel Lockable"};
	
	
	public final static int CAPABILITIES_UNKNOWN = 0;
	public final static int CAPABILITIES_OTHER = 1;
	public final static int CAPABILITIES_AUTOMATICCLEANING = 2;
	public final static int CAPABILITIES_MANUALOPERATION = 3;
	public final static int CAPABILITIES_FRONTPANELLOCKABLE = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_StorageLibrary() {

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
	public CIM_StorageLibrary(Vector keyProperties){ 
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
	public CIM_StorageLibrary(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_StorageLibrary)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_StorageLibrary)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_StorageLibrary)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_StorageLibrary)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_StorageLibrary)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_StorageLibrary)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_StorageLibrary)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_StorageLibrary)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_StorageLibrary)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_StorageLibrary)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_PhysicalPackage_CIM_LibraryPackages(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_LIBRARYPACKAGE, 
					CIM_PhysicalPackage.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_StorageLibrary.Java_Package_List.size(); i++) {
						if (!((String)(CIM_StorageLibrary.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_StorageLibrary.Java_Package_List.get(i))).endsWith(".")) {
							CIM_StorageLibrary.Java_Package_List.setElementAt((String)(CIM_StorageLibrary.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_StorageLibrary.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PhysicalPackage(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_PhysicalPackage(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PhysicalPackage(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_PhysicalPackage_CIM_LibraryPackage_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_LIBRARYPACKAGE, 
					CIM_PhysicalPackage.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_PhysicalPackage.CIM_CLASS_NAME)) {
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
	
	// Attribute AuditInProgress
	
	public Boolean get_AuditInProgress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageLibrary.CIM_PROPERTY_AUDITINPROGRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageLibrary.CIM_PROPERTY_AUDITINPROGRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageLibrary.CIM_PROPERTY_AUDITINPROGRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AuditInProgress(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageLibrary.CIM_PROPERTY_AUDITINPROGRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageLibrary.CIM_PROPERTY_AUDITINPROGRESS + " could not be found");
    		
		} else if (!CIM_StorageLibraryHelper.isValid_AuditInProgress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageLibrary.CIM_PROPERTY_AUDITINPROGRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageLibrary.CIM_PROPERTY_AUDITINPROGRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute AuditNeeded
	
	public Boolean get_AuditNeeded() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageLibrary.CIM_PROPERTY_AUDITNEEDED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageLibrary.CIM_PROPERTY_AUDITNEEDED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageLibrary.CIM_PROPERTY_AUDITNEEDED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AuditNeeded(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageLibrary.CIM_PROPERTY_AUDITNEEDED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageLibrary.CIM_PROPERTY_AUDITNEEDED + " could not be found");
    		
		} else if (!CIM_StorageLibraryHelper.isValid_AuditNeeded(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageLibrary.CIM_PROPERTY_AUDITNEEDED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageLibrary.CIM_PROPERTY_AUDITNEEDED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Automated
	
	public Boolean get_Automated() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageLibrary.CIM_PROPERTY_AUTOMATED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageLibrary.CIM_PROPERTY_AUTOMATED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageLibrary.CIM_PROPERTY_AUTOMATED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Automated(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageLibrary.CIM_PROPERTY_AUTOMATED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageLibrary.CIM_PROPERTY_AUTOMATED + " could not be found");
    		
		} else if (!CIM_StorageLibraryHelper.isValid_Automated(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageLibrary.CIM_PROPERTY_AUTOMATED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageLibrary.CIM_PROPERTY_AUTOMATED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Capabilities
	
	public UnsignedInt16[] get_Capabilities() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageLibrary.CIM_PROPERTY_CAPABILITIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageLibrary.CIM_PROPERTY_CAPABILITIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageLibrary.CIM_PROPERTY_CAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_Capabilities(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageLibrary.CIM_PROPERTY_CAPABILITIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageLibrary.CIM_PROPERTY_CAPABILITIES + " could not be found");
    		
		} else if (!CIM_StorageLibraryHelper.isValid_Capabilities(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageLibrary.CIM_PROPERTY_CAPABILITIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageLibrary.CIM_PROPERTY_CAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxAuditTime
	
	public UnsignedInt64 get_MaxAuditTime() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageLibrary.CIM_PROPERTY_MAXAUDITTIME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageLibrary.CIM_PROPERTY_MAXAUDITTIME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageLibrary.CIM_PROPERTY_MAXAUDITTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxAuditTime(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageLibrary.CIM_PROPERTY_MAXAUDITTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageLibrary.CIM_PROPERTY_MAXAUDITTIME + " could not be found");
    		
		} else if (!CIM_StorageLibraryHelper.isValid_MaxAuditTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageLibrary.CIM_PROPERTY_MAXAUDITTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageLibrary.CIM_PROPERTY_MAXAUDITTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Overfilled
	
	public Boolean get_Overfilled() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageLibrary.CIM_PROPERTY_OVERFILLED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageLibrary.CIM_PROPERTY_OVERFILLED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageLibrary.CIM_PROPERTY_OVERFILLED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Overfilled(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageLibrary.CIM_PROPERTY_OVERFILLED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageLibrary.CIM_PROPERTY_OVERFILLED + " could not be found");
    		
		} else if (!CIM_StorageLibraryHelper.isValid_Overfilled(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageLibrary.CIM_PROPERTY_OVERFILLED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageLibrary.CIM_PROPERTY_OVERFILLED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RoboticsEnabled
	
	public Boolean get_RoboticsEnabled() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageLibrary.CIM_PROPERTY_ROBOTICSENABLED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageLibrary.CIM_PROPERTY_ROBOTICSENABLED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageLibrary.CIM_PROPERTY_ROBOTICSENABLED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RoboticsEnabled(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageLibrary.CIM_PROPERTY_ROBOTICSENABLED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageLibrary.CIM_PROPERTY_ROBOTICSENABLED + " could not be found");
    		
		} else if (!CIM_StorageLibraryHelper.isValid_RoboticsEnabled(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageLibrary.CIM_PROPERTY_ROBOTICSENABLED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageLibrary.CIM_PROPERTY_ROBOTICSENABLED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt32 invoke_enableRobotics(CIMClient cimClient, Boolean Enable) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_StorageLibrary.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_Enable = new CIMValue(Enable, new CIMDataType(CIMDataType.BOOLEAN));
		
	  	inParameter.add(new CIMArgument("Enable", cimValue_Enable));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_ENABLEROBOTICS,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_StorageLibrary.CIM_METHOD_ENABLEROBOTICS + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_StorageLibrary.CIM_METHOD_ENABLEROBOTICS + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_StorageLibrary.CIM_METHOD_ENABLEROBOTICS + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
