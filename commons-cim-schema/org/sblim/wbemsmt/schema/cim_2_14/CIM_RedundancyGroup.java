/** 
 * CIM_RedundancyGroup.java
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
 * Description:  A class derived from LogicalElement that is a special collection of
 * ManagedSystemElements. This collection indicates that the aggregated
 * components together provide redundancy. All elements aggregated in a
 * RedundancyGroup should be instantiations of the same object class. The use of
 * this class is being deprecated in lieu of using the RedundancySet class.
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
 *  A class derived from LogicalElement that is a special collection of
 * ManagedSystemElements. This collection indicates that the aggregated
 * components together provide redundancy. All elements aggregated in a
 * RedundancyGroup should be instantiations of the same object class. The use of
 * this class is being deprecated in lieu of using the RedundancySet class.
 */
public class CIM_RedundancyGroup extends CIM_LogicalElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_RedundancyGroup"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.13.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_REDUNDANCYCOMPONENT = "CIM_RedundancyComponent"; //$NON-NLS-1$
	
	
	/**
	*	CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	*/
	public final static String CIM_PROPERTY_CREATIONCLASSNAME = "CreationClassName"; //$NON-NLS-1$
	/**
	*	The RedundancyGroup Name serves as the key for the Group's instance in an enterprise environment.
	*/
	public final static String CIM_PROPERTY_NAME = "Name"; //$NON-NLS-1$
	/**
	*	RedundancyStatus provides information on the state of the RedundancyGroup. "Fully Redundant" (value=2) means that all of the configured redundancy is still available; "Degraded Redundancy" (3) means that some failures have been experienced but some reduced amount of redundancy is still available; "Redundancy Lost" (4) means that a sufficient number of failures have been experienced such that no redundancy is available and the next failure experienced will cause overall failure. Also, the values, "Other" (1) and "Unknown" (0), are defined.
	*/
	public final static String CIM_PROPERTY_REDUNDANCYSTATUS = "RedundancyStatus"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_REDUNDANCYSTATUS);
				
		for (int i = 0; i < CIM_LogicalElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAME)||
				((String)CIM_LogicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REDUNDANCYSTATUS)){
				continue;
			}
			
			CIM_RedundancyGroup.CIM_PropertyNameList.add(CIM_LogicalElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REDUNDANCYSTATUS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_LogicalElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAME)||
				((CIMProperty)CIM_LogicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REDUNDANCYSTATUS)){
				continue;
			}
			
			CIM_RedundancyGroup.CIM_PropertyList.add(CIM_LogicalElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_LogicalElement.Java_Package_List.size(); i++) {
			if (((String)CIM_LogicalElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_LogicalElement.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_REDUNDANCYSTATUS = {"Unknown","Other","Fully Redundant","Degraded Redundancy","Redundancy Lost"};
	
	
	public final static int REDUNDANCYSTATUS_UNKNOWN = 0;
	public final static int REDUNDANCYSTATUS_OTHER = 1;
	public final static int REDUNDANCYSTATUS_FULLYREDUNDANT = 2;
	public final static int REDUNDANCYSTATUS_DEGRADEDREDUNDANCY = 3;
	public final static int REDUNDANCYSTATUS_REDUNDANCYLOST = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_RedundancyGroup() {

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
	public CIM_RedundancyGroup(Vector keyProperties){ 
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
	public CIM_RedundancyGroup(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_RedundancyGroup)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_RedundancyGroup)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_RedundancyGroup)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_RedundancyGroup)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_RedundancyGroup)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_RedundancyGroup)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_RedundancyGroup)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_RedundancyGroup)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_RedundancyGroup)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_RedundancyGroup)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_ManagedSystemElement_CIM_RedundancyComponents(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_REDUNDANCYCOMPONENT, 
					CIM_ManagedSystemElement.CIM_CLASS_NAME, 
					"GroupComponent", //$NON-NLS-1$
					"PartComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_RedundancyGroup.Java_Package_List.size(); i++) {
						if (!((String)(CIM_RedundancyGroup.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_RedundancyGroup.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_RedundancyGroup.Java_Package_List.setElementAt((String)(CIM_RedundancyGroup.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_RedundancyGroup.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ManagedSystemElement(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_ManagedSystemElement(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ManagedSystemElement(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_ManagedSystemElement_CIM_RedundancyComponent_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_REDUNDANCYCOMPONENT, 
					CIM_ManagedSystemElement.CIM_CLASS_NAME, 
					"GroupComponent", //$NON-NLS-1$
					"PartComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ManagedSystemElement.CIM_CLASS_NAME)) {
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
	
	// Attribute CreationClassName
	
	public String get_CreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RedundancyGroup.CIM_PROPERTY_CREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RedundancyGroup.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RedundancyGroup.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RedundancyGroup.CIM_PROPERTY_CREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_RedundancyGroup.CIM_PROPERTY_CREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RedundancyGroup.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_RedundancyGroupHelper.isValid_CreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RedundancyGroup.CIM_PROPERTY_CREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RedundancyGroup.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Name
	
	public String get_Name() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RedundancyGroup.CIM_PROPERTY_NAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RedundancyGroup.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RedundancyGroup.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Name(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RedundancyGroup.CIM_PROPERTY_NAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_RedundancyGroup.CIM_PROPERTY_NAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RedundancyGroup.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (!CIM_RedundancyGroupHelper.isValid_Name(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RedundancyGroup.CIM_PROPERTY_NAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RedundancyGroup.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RedundancyStatus
	
	public UnsignedInt16 get_RedundancyStatus() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RedundancyGroup.CIM_PROPERTY_REDUNDANCYSTATUS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RedundancyGroup.CIM_PROPERTY_REDUNDANCYSTATUS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RedundancyGroup.CIM_PROPERTY_REDUNDANCYSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RedundancyStatus(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_RedundancyGroup.CIM_PROPERTY_REDUNDANCYSTATUS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_RedundancyGroup.CIM_PROPERTY_REDUNDANCYSTATUS + " could not be found");
    		
		} else if (!CIM_RedundancyGroupHelper.isValid_RedundancyStatus(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_RedundancyGroup.CIM_PROPERTY_REDUNDANCYSTATUS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_RedundancyGroup.CIM_PROPERTY_REDUNDANCYSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}