/** 
 * CIM_PhysicalLink.java
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
 * Description: The PhysicalLink class represents the cabling of PhysicalElements together. For example, serial or Ethernet cables would be subclasses (if additional properties or associations are defined) or instances of PhysicalLink. In many cases, the numerous physical cables within a PhysicalPackage or Network will not be modeled. However, where these cables or Links are critical components, or are tagged assets of the company, these objects can be instantiated using this class or one of its descendent classes.
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



public class CIM_PhysicalLink extends CIM_PhysicalElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_PhysicalLink";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSLINKED = "CIM_ElementsLinked";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_LINKHASCONNECTOR = "CIM_LinkHasConnector";
	
	
	/**
	*	The current length of the PhysicalLink in feet. For some connections, especially wireless technologies, this property may not be applicable and should be left uninitialized.
	*/
	public final static String CIM_PROPERTY_LENGTH = "Length"; //$NON-NLS-1$
	/**
	*	The maximum length of the PhysicalLink in feet.
	*/
	public final static String CIM_PROPERTY_MAXLENGTH = "MaxLength"; //$NON-NLS-1$
	/**
	*	The MediaType property defines the particular type of Media through which transmission signals pass. Common network media include twisted-pair (value=11 or 12), coaxial (7, 8 or 9) and fiber-optic cable (10).
	*/
	public final static String CIM_PROPERTY_MEDIATYPE = "MediaType"; //$NON-NLS-1$
	/**
	*	Boolean indicating whether the PhysicalLink is an actual cable (TRUE) or a wireless connection (FALSE).
	*/
	public final static String CIM_PROPERTY_WIRED = "Wired"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_LENGTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXLENGTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_MEDIATYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_WIRED);
				
		for (int i = 0; i < CIM_PhysicalElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_PhysicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LENGTH)||
				((String)CIM_PhysicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXLENGTH)||
				((String)CIM_PhysicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MEDIATYPE)||
				((String)CIM_PhysicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WIRED)){
				continue;
			}
			
			CIM_PhysicalLink.CIM_PropertyNameList.add(CIM_PhysicalElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LENGTH, new CIMValue(null, new CIMDataType(CIMDataType.REAL64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXLENGTH, new CIMValue(null, new CIMDataType(CIMDataType.REAL64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MEDIATYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WIRED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
				
		for (int i = 0; i < CIM_PhysicalElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_PhysicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LENGTH)||
				((CIMProperty)CIM_PhysicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXLENGTH)||
				((CIMProperty)CIM_PhysicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MEDIATYPE)||
				((CIMProperty)CIM_PhysicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WIRED)){
				continue;
			}
			
			CIM_PhysicalLink.CIM_PropertyList.add(CIM_PhysicalElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_PhysicalElement.Java_Package_List.size(); i++) {
			if (((String)CIM_PhysicalElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_PhysicalElement.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_MEDIATYPE = {"Unknown","Other","Cat1","Cat2","Cat3","Cat4","Cat5","50-ohm Coaxial","75-ohm Coaxial","100-ohm Coaxial","Fiber-optic","UTP","STP","Ribbon Cable","Twinaxial","Optical 9um","Optical 50um","Optical 62.5um"};
	
	
	public final static int MEDIATYPE_UNKNOWN = 0;
	public final static int MEDIATYPE_OTHER = 1;
	public final static int MEDIATYPE_CAT1 = 2;
	public final static int MEDIATYPE_CAT2 = 3;
	public final static int MEDIATYPE_CAT3 = 4;
	public final static int MEDIATYPE_CAT4 = 5;
	public final static int MEDIATYPE_CAT5 = 6;
	public final static int MEDIATYPE_50_OHMCOAXIAL = 7;
	public final static int MEDIATYPE_75_OHMCOAXIAL = 8;
	public final static int MEDIATYPE_100_OHMCOAXIAL = 9;
	public final static int MEDIATYPE_FIBER_OPTIC = 10;
	public final static int MEDIATYPE_UTP = 11;
	public final static int MEDIATYPE_STP = 12;
	public final static int MEDIATYPE_RIBBONCABLE = 13;
	public final static int MEDIATYPE_TWINAXIAL = 14;
	public final static int MEDIATYPE_OPTICAL9UM = 15;
	public final static int MEDIATYPE_OPTICAL50UM = 16;
	public final static int MEDIATYPE_OPTICAL62_5UM = 17;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PhysicalLink() {

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
	public CIM_PhysicalLink(Vector keyProperties){ 
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
	public CIM_PhysicalLink(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_PhysicalLink)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PhysicalLink)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PhysicalLink)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PhysicalLink)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PhysicalLink)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PhysicalLink)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PhysicalLink)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PhysicalLink)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PhysicalLink)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PhysicalLink)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_PhysicalElement_CIM_ElementsLinkeds(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSLINKED, 
					CIM_PhysicalElement.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_PhysicalLink.Java_Package_List.size(); i++) {
						if (!((String)(CIM_PhysicalLink.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_PhysicalLink.Java_Package_List.get(i))).endsWith(".")) {
							CIM_PhysicalLink.Java_Package_List.setElementAt((String)(CIM_PhysicalLink.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_PhysicalLink.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PhysicalElement(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_PhysicalElement(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PhysicalElement(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_PhysicalElement_CIM_ElementsLinked_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTSLINKED, 
					CIM_PhysicalElement.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_PhysicalElement.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_PhysicalConnector_CIM_LinkHasConnectors(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_LINKHASCONNECTOR, 
					CIM_PhysicalConnector.CIM_CLASS_NAME, 
					"GroupComponent",
					"PartComponent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_PhysicalLink.Java_Package_List.size(); i++) {
						if (!((String)(CIM_PhysicalLink.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_PhysicalLink.Java_Package_List.get(i))).endsWith(".")) {
							CIM_PhysicalLink.Java_Package_List.setElementAt((String)(CIM_PhysicalLink.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_PhysicalLink.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PhysicalConnector(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_PhysicalConnector(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PhysicalConnector(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_PhysicalConnector_CIM_LinkHasConnector_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_LINKHASCONNECTOR, 
					CIM_PhysicalConnector.CIM_CLASS_NAME, 
					"GroupComponent",
					"PartComponent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_PhysicalConnector.CIM_CLASS_NAME)) {
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
	
	// Attribute Length
	
	public Double get_Length() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalLink.CIM_PROPERTY_LENGTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalLink.CIM_PROPERTY_LENGTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.REAL64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalLink.CIM_PROPERTY_LENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.REAL64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Double)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Length(Double newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalLink.CIM_PROPERTY_LENGTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalLink.CIM_PROPERTY_LENGTH + " could not be found");
    		
		} else if (!CIM_PhysicalLinkHelper.isValid_Length(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalLink.CIM_PROPERTY_LENGTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.REAL64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalLink.CIM_PROPERTY_LENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.REAL64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.REAL64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxLength
	
	public Double get_MaxLength() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalLink.CIM_PROPERTY_MAXLENGTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalLink.CIM_PROPERTY_MAXLENGTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.REAL64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalLink.CIM_PROPERTY_MAXLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.REAL64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Double)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxLength(Double newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalLink.CIM_PROPERTY_MAXLENGTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalLink.CIM_PROPERTY_MAXLENGTH + " could not be found");
    		
		} else if (!CIM_PhysicalLinkHelper.isValid_MaxLength(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalLink.CIM_PROPERTY_MAXLENGTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.REAL64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalLink.CIM_PROPERTY_MAXLENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.REAL64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.REAL64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MediaType
	
	public UnsignedInt16 get_MediaType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalLink.CIM_PROPERTY_MEDIATYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalLink.CIM_PROPERTY_MEDIATYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalLink.CIM_PROPERTY_MEDIATYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MediaType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalLink.CIM_PROPERTY_MEDIATYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalLink.CIM_PROPERTY_MEDIATYPE + " could not be found");
    		
		} else if (!CIM_PhysicalLinkHelper.isValid_MediaType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalLink.CIM_PROPERTY_MEDIATYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalLink.CIM_PROPERTY_MEDIATYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Wired
	
	public Boolean get_Wired() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalLink.CIM_PROPERTY_WIRED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalLink.CIM_PROPERTY_WIRED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalLink.CIM_PROPERTY_WIRED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Wired(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalLink.CIM_PROPERTY_WIRED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalLink.CIM_PROPERTY_WIRED + " could not be found");
    		
		} else if (!CIM_PhysicalLinkHelper.isValid_Wired(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalLink.CIM_PROPERTY_WIRED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalLink.CIM_PROPERTY_WIRED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
