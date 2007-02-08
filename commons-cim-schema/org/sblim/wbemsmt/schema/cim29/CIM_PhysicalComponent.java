/** 
 * CIM_PhysicalComponent.java
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
 * Description: The PhysicalComponent class represents any low-level or basic Component within a Package. A Component object either can not or does not need to be decomposed into its constituent parts. For example, an ASIC (or Chip) can not be further decomposed. A tape for data storage (PhysicalMedia) does not need to be decomposed. Any PhysicalElement that is not a Link, Connector, or Package is a descendent (or member) of this class. For example, the UART chipset on an internal modem Card would be a subclass (if additional properties or associations are defined) or an instance of PhysicalComponent.
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



public class CIM_PhysicalComponent extends CIM_PhysicalElement  {
	
	public final static String CIM_CLASS_NAME = "CIM_PhysicalComponent";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEDCOMPONENT = "CIM_PackagedComponent";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESEXTENT = "CIM_RealizesExtent";
	
	
	/**
	*	The use of this property is being deprecated. Instead RemovalConditions should be used. The RemovalConditions property addresses whether a PhysicalComponent is removable with or without power being applied. 

A PhysicalComponent is HotSwappable if it is possible to replace the Element with a physically different but equivalent one while the containing Package has power applied to it (ie, is 'on'). For example, a fan Component may be designed to be HotSwappable. All HotSwappable Components are inherently Removable and Replaceable.
	*/
	public final static String CIM_PROPERTY_HOTSWAPPABLE = "HotSwappable"; //$NON-NLS-1$
	/**
	*	The use of this property is being deprecated. Instead RemovalConditions should be used. The RemovalConditions property addresses whether a PhysicalComponent is removable with or without power being applied. 

A PhysicalComponent is Removable if it is designed to be taken in and out of the physical container in which it is normally found, without impairing the function of the overall packaging. A Component can still be Removable if power must be 'off' in order to perform the removal. If power can be 'on' and the Component removed, then the Element is both Removable and HotSwappable. For example, an upgradeable Processor chip is Removable.
	*/
	public final static String CIM_PROPERTY_REMOVABLE = "Removable"; //$NON-NLS-1$
	/**
	*	The RemovalCapabilites property is used to describe the conditions under which a PhysicalPackage can be removed. Since all PhysicalPackages are not removable, this property defaults to 2, 'Not Applicable'.
	*/
	public final static String CIM_PROPERTY_REMOVALCONDITIONS = "RemovalConditions"; //$NON-NLS-1$
	/**
	*	The use of this property is being deprecated because it is redundant with the FRU class and its associations. A PhysicalComponent is Replaceable if it is possible to replace (FRU or upgrade) the Element with a physically different one. For example, some ComputerSystems allow the main Processor chip to be upgraded to one of a higher clock rating. In this case, the Processor is said to be Replaceable. All Removable Components are inherently Replaceable.
	*/
	public final static String CIM_PROPERTY_REPLACEABLE = "Replaceable"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_HOTSWAPPABLE);
		CIM_PropertyNameList.add(CIM_PROPERTY_REMOVABLE);
		CIM_PropertyNameList.add(CIM_PROPERTY_REMOVALCONDITIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_REPLACEABLE);
				
		for (int i = 0; i < CIM_PhysicalElement.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_PhysicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HOTSWAPPABLE)||
				((String)CIM_PhysicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REMOVABLE)||
				((String)CIM_PhysicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REMOVALCONDITIONS)||
				((String)CIM_PhysicalElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REPLACEABLE)){
				continue;
			}
			
			CIM_PhysicalComponent.CIM_PropertyNameList.add(CIM_PhysicalElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HOTSWAPPABLE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REMOVABLE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REMOVALCONDITIONS, new CIMValue(new UnsignedInt16("2"), new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REPLACEABLE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
				
		for (int i = 0; i < CIM_PhysicalElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_PhysicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HOTSWAPPABLE)||
				((CIMProperty)CIM_PhysicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REMOVABLE)||
				((CIMProperty)CIM_PhysicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REMOVALCONDITIONS)||
				((CIMProperty)CIM_PhysicalElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REPLACEABLE)){
				continue;
			}
			
			CIM_PhysicalComponent.CIM_PropertyList.add(CIM_PhysicalElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_PhysicalElement.Java_Package_List.size(); i++) {
			if (((String)CIM_PhysicalElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_PhysicalElement.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_REMOVALCONDITIONS = {"Unknown","Not Applicable","Removable when off","Removable when on or off"};
	
	
	public final static int REMOVALCONDITIONS_UNKNOWN = 0;
	public final static int REMOVALCONDITIONS_NOTAPPLICABLE = 2;
	public final static int REMOVALCONDITIONS_REMOVABLEWHENOFF = 3;
	public final static int REMOVALCONDITIONS_REMOVABLEWHENONOROFF = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PhysicalComponent() {

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
	public CIM_PhysicalComponent(Vector keyProperties){ 
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
	public CIM_PhysicalComponent(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_PhysicalComponent)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PhysicalComponent)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PhysicalComponent)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PhysicalComponent)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PhysicalComponent)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PhysicalComponent)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PhysicalComponent)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PhysicalComponent)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PhysicalComponent)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PhysicalComponent)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_PhysicalPackage_CIM_PackagedComponents(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEDCOMPONENT, 
					CIM_PhysicalPackage.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_PhysicalComponent.Java_Package_List.size(); i++) {
						if (!((String)(CIM_PhysicalComponent.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_PhysicalComponent.Java_Package_List.get(i))).endsWith(".")) {
							CIM_PhysicalComponent.Java_Package_List.setElementAt((String)(CIM_PhysicalComponent.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_PhysicalComponent.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_PhysicalPackage_CIM_PackagedComponent_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PACKAGEDCOMPONENT, 
					CIM_PhysicalPackage.CIM_CLASS_NAME, 
					"PartComponent",
					"GroupComponent");
		
		
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

	public ArrayList getAssociated_CIM_StorageExtent_CIM_RealizesExtents(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESEXTENT, 
					CIM_StorageExtent.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_PhysicalComponent.Java_Package_List.size(); i++) {
						if (!((String)(CIM_PhysicalComponent.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_PhysicalComponent.Java_Package_List.get(i))).endsWith(".")) {
							CIM_PhysicalComponent.Java_Package_List.setElementAt((String)(CIM_PhysicalComponent.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_PhysicalComponent.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_StorageExtent(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_StorageExtent(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_StorageExtent(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_StorageExtent_CIM_RealizesExtent_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_REALIZESEXTENT, 
					CIM_StorageExtent.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_StorageExtent.CIM_CLASS_NAME)) {
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
	
	// Attribute HotSwappable
	
	public Boolean get_HotSwappable() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalComponent.CIM_PROPERTY_HOTSWAPPABLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalComponent.CIM_PROPERTY_HOTSWAPPABLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalComponent.CIM_PROPERTY_HOTSWAPPABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HotSwappable(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalComponent.CIM_PROPERTY_HOTSWAPPABLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalComponent.CIM_PROPERTY_HOTSWAPPABLE + " could not be found");
    		
		} else if (!CIM_PhysicalComponentHelper.isValid_HotSwappable(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalComponent.CIM_PROPERTY_HOTSWAPPABLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalComponent.CIM_PROPERTY_HOTSWAPPABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Removable
	
	public Boolean get_Removable() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalComponent.CIM_PROPERTY_REMOVABLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalComponent.CIM_PROPERTY_REMOVABLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalComponent.CIM_PROPERTY_REMOVABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Removable(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalComponent.CIM_PROPERTY_REMOVABLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalComponent.CIM_PROPERTY_REMOVABLE + " could not be found");
    		
		} else if (!CIM_PhysicalComponentHelper.isValid_Removable(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalComponent.CIM_PROPERTY_REMOVABLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalComponent.CIM_PROPERTY_REMOVABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RemovalConditions
	
	public UnsignedInt16 get_RemovalConditions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalComponent.CIM_PROPERTY_REMOVALCONDITIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalComponent.CIM_PROPERTY_REMOVALCONDITIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalComponent.CIM_PROPERTY_REMOVALCONDITIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RemovalConditions(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalComponent.CIM_PROPERTY_REMOVALCONDITIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalComponent.CIM_PROPERTY_REMOVALCONDITIONS + " could not be found");
    		
		} else if (!CIM_PhysicalComponentHelper.isValid_RemovalConditions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalComponent.CIM_PROPERTY_REMOVALCONDITIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalComponent.CIM_PROPERTY_REMOVALCONDITIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Replaceable
	
	public Boolean get_Replaceable() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalComponent.CIM_PROPERTY_REPLACEABLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalComponent.CIM_PROPERTY_REPLACEABLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalComponent.CIM_PROPERTY_REPLACEABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Replaceable(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PhysicalComponent.CIM_PROPERTY_REPLACEABLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PhysicalComponent.CIM_PROPERTY_REPLACEABLE + " could not be found");
    		
		} else if (!CIM_PhysicalComponentHelper.isValid_Replaceable(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PhysicalComponent.CIM_PROPERTY_REPLACEABLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PhysicalComponent.CIM_PROPERTY_REPLACEABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
