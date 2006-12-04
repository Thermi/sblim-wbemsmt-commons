/** 
 * CIM_InstalledProduct.java
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
 * Description: The InstalledProduct object allows the grouping of SoftwareFeatures and SoftwareElements that represent the result of the installation of a purchased Product. InstalledProduct is defined to be Weak to a Product. 
Often, Products are purchased once but may be installed several times in different locations on one or more systems. All of the SoftwareElements and SoftwareFeatures of a single install are grouped by an instance of InstalledProduct. These are defined using the associations, CollectedSoftwareFeatures and Collected SoftwareElements.
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



public class CIM_InstalledProduct extends CIM_Collection  {
	
	public final static String CIM_CLASS_NAME = "CIM_InstalledProduct";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_COLLECTEDSOFTWAREELEMENTS = "CIM_CollectedSoftwareElements";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_COLLECTEDSOFTWAREFEATURES = "CIM_CollectedSoftwareFeatures";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_INSTALLEDPRODUCTIMAGE = "CIM_InstalledProductImage";
	
	
	/**
	*	The identification of the InstalledProduct object. This key can be used to differentiate between Product installations and could include the installation location.
	*/
	public final static String CIM_PROPERTY_COLLECTIONID = "CollectionID"; //$NON-NLS-1$
	/**
	*	The Name property defines the label by which the object is known to the world, outside the data processing system. This label is a human-readable name that uniquely identifies the element in the context of the element's namespace.
	*/
	public final static String CIM_PROPERTY_NAME = "Name"; //$NON-NLS-1$
	/**
	*	The scoping Product's identification.
	*/
	public final static String CIM_PROPERTY_PRODUCTIDENTIFYINGNUMBER = "ProductIdentifyingNumber"; //$NON-NLS-1$
	/**
	*	The scoping Product's commonly used name.
	*/
	public final static String CIM_PROPERTY_PRODUCTNAME = "ProductName"; //$NON-NLS-1$
	/**
	*	The scoping Product's name.
	*/
	public final static String CIM_PROPERTY_PRODUCTVENDOR = "ProductVendor"; //$NON-NLS-1$
	/**
	*	The scoping Product's version information.
	*/
	public final static String CIM_PROPERTY_PRODUCTVERSION = "ProductVersion"; //$NON-NLS-1$
	/**
	*	The identifying information of the System (ie, the instance) on which the Product is installed. If the System is not known, this property returns NULL. If the System is known and represented in CIM, the property contains the namespace and model paths of the instance, encoded as a string parameter. If known but not represented in CIM, the property contains some identifying string that names the System on which the Product is installed.
	*/
	public final static String CIM_PROPERTY_SYSTEMID = "SystemID"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_COLLECTIONID);
		CIM_PropertyNameList.add(CIM_PROPERTY_NAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRODUCTIDENTIFYINGNUMBER);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRODUCTNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRODUCTVENDOR);
		CIM_PropertyNameList.add(CIM_PROPERTY_PRODUCTVERSION);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYSTEMID);
				
		for (int i = 0; i < CIM_Collection.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Collection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_COLLECTIONID)||
				((String)CIM_Collection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NAME)||
				((String)CIM_Collection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRODUCTIDENTIFYINGNUMBER)||
				((String)CIM_Collection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRODUCTNAME)||
				((String)CIM_Collection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRODUCTVENDOR)||
				((String)CIM_Collection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PRODUCTVERSION)||
				((String)CIM_Collection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYSTEMID)){
				continue;
			}
			
			CIM_InstalledProduct.CIM_PropertyNameList.add(CIM_Collection.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_COLLECTIONID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRODUCTIDENTIFYINGNUMBER, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRODUCTNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRODUCTVENDOR, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PRODUCTVERSION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYSTEMID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_Collection.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Collection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_COLLECTIONID)||
				((CIMProperty)CIM_Collection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NAME)||
				((CIMProperty)CIM_Collection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRODUCTIDENTIFYINGNUMBER)||
				((CIMProperty)CIM_Collection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRODUCTNAME)||
				((CIMProperty)CIM_Collection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRODUCTVENDOR)||
				((CIMProperty)CIM_Collection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PRODUCTVERSION)||
				((CIMProperty)CIM_Collection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYSTEMID)){
				continue;
			}
			
			CIM_InstalledProduct.CIM_PropertyList.add(CIM_Collection.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Collection.Java_Package_List.size(); i++) {
			if (((String)CIM_Collection.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Collection.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_InstalledProduct() {

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
	public CIM_InstalledProduct(Vector keyProperties){ 
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
	public CIM_InstalledProduct(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_CollectionID = this.cimInstance.getProperty(CIM_PROPERTY_COLLECTIONID);
		
		if (CIMProperty_CollectionID == null || CIMProperty_CollectionID.getValue().isEmpty() || CIMProperty_CollectionID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_COLLECTIONID, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_ProductIdentifyingNumber = this.cimInstance.getProperty(CIM_PROPERTY_PRODUCTIDENTIFYINGNUMBER);
		
		if (CIMProperty_ProductIdentifyingNumber == null || CIMProperty_ProductIdentifyingNumber.getValue().isEmpty() || CIMProperty_ProductIdentifyingNumber.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_PRODUCTIDENTIFYINGNUMBER, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_ProductName = this.cimInstance.getProperty(CIM_PROPERTY_PRODUCTNAME);
		
		if (CIMProperty_ProductName == null || CIMProperty_ProductName.getValue().isEmpty() || CIMProperty_ProductName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_PRODUCTNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_ProductVendor = this.cimInstance.getProperty(CIM_PROPERTY_PRODUCTVENDOR);
		
		if (CIMProperty_ProductVendor == null || CIMProperty_ProductVendor.getValue().isEmpty() || CIMProperty_ProductVendor.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_PRODUCTVENDOR, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_ProductVersion = this.cimInstance.getProperty(CIM_PROPERTY_PRODUCTVERSION);
		
		if (CIMProperty_ProductVersion == null || CIMProperty_ProductVersion.getValue().isEmpty() || CIMProperty_ProductVersion.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_PRODUCTVERSION, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_SystemID = this.cimInstance.getProperty(CIM_PROPERTY_SYSTEMID);
		
		if (CIMProperty_SystemID == null || CIMProperty_SystemID.getValue().isEmpty() || CIMProperty_SystemID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_SYSTEMID, "Key"});
			result = false;
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
	    
	    if (!(object instanceof CIM_InstalledProduct)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_InstalledProduct)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_InstalledProduct)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_InstalledProduct)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_InstalledProduct)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_InstalledProduct)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_InstalledProduct)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_InstalledProduct)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_InstalledProduct)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_InstalledProduct)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_SoftwareElement_CIM_CollectedSoftwareElementss(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COLLECTEDSOFTWAREELEMENTS, 
					CIM_SoftwareElement.CIM_CLASS_NAME, 
					"Collection",
					"Member",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_InstalledProduct.Java_Package_List.size(); i++) {
						if (!((String)(CIM_InstalledProduct.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_InstalledProduct.Java_Package_List.get(i))).endsWith(".")) {
							CIM_InstalledProduct.Java_Package_List.setElementAt((String)(CIM_InstalledProduct.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_InstalledProduct.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_SoftwareElement(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_SoftwareElement(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_SoftwareElement(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_SoftwareElement_CIM_CollectedSoftwareElements_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COLLECTEDSOFTWAREELEMENTS, 
					CIM_SoftwareElement.CIM_CLASS_NAME, 
					"Collection",
					"Member");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_SoftwareElement.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_SoftwareFeature_CIM_CollectedSoftwareFeaturess(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COLLECTEDSOFTWAREFEATURES, 
					CIM_SoftwareFeature.CIM_CLASS_NAME, 
					"Collection",
					"Member",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_InstalledProduct.Java_Package_List.size(); i++) {
						if (!((String)(CIM_InstalledProduct.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_InstalledProduct.Java_Package_List.get(i))).endsWith(".")) {
							CIM_InstalledProduct.Java_Package_List.setElementAt((String)(CIM_InstalledProduct.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_InstalledProduct.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_SoftwareFeature(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_SoftwareFeature(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_SoftwareFeature(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_SoftwareFeature_CIM_CollectedSoftwareFeatures_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COLLECTEDSOFTWAREFEATURES, 
					CIM_SoftwareFeature.CIM_CLASS_NAME, 
					"Collection",
					"Member");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_SoftwareFeature.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_Product_CIM_InstalledProductImages(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_INSTALLEDPRODUCTIMAGE, 
					CIM_Product.CIM_CLASS_NAME, 
					"Collection",
					"Product",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_InstalledProduct.Java_Package_List.size(); i++) {
						if (!((String)(CIM_InstalledProduct.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_InstalledProduct.Java_Package_List.get(i))).endsWith(".")) {
							CIM_InstalledProduct.Java_Package_List.setElementAt((String)(CIM_InstalledProduct.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_InstalledProduct.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
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

	public ArrayList getAssociated_CIM_Product_CIM_InstalledProductImage_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_INSTALLEDPRODUCTIMAGE, 
					CIM_Product.CIM_CLASS_NAME, 
					"Collection",
					"Product");
		
		
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
	
	// Attribute CollectionID
	
	public String get_CollectionID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstalledProduct.CIM_PROPERTY_COLLECTIONID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstalledProduct.CIM_PROPERTY_COLLECTIONID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstalledProduct.CIM_PROPERTY_COLLECTIONID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CollectionID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstalledProduct.CIM_PROPERTY_COLLECTIONID);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_InstalledProduct.CIM_PROPERTY_COLLECTIONID + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstalledProduct.CIM_PROPERTY_COLLECTIONID + " could not be found");
    		
		} else if (!CIM_InstalledProductHelper.isValid_CollectionID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_InstalledProduct.CIM_PROPERTY_COLLECTIONID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstalledProduct.CIM_PROPERTY_COLLECTIONID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Name
	
	public String get_Name() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstalledProduct.CIM_PROPERTY_NAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstalledProduct.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstalledProduct.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Name(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstalledProduct.CIM_PROPERTY_NAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstalledProduct.CIM_PROPERTY_NAME + " could not be found");
    		
		} else if (!CIM_InstalledProductHelper.isValid_Name(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_InstalledProduct.CIM_PROPERTY_NAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstalledProduct.CIM_PROPERTY_NAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProductIdentifyingNumber
	
	public String get_ProductIdentifyingNumber() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstalledProduct.CIM_PROPERTY_PRODUCTIDENTIFYINGNUMBER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstalledProduct.CIM_PROPERTY_PRODUCTIDENTIFYINGNUMBER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstalledProduct.CIM_PROPERTY_PRODUCTIDENTIFYINGNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProductIdentifyingNumber(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstalledProduct.CIM_PROPERTY_PRODUCTIDENTIFYINGNUMBER);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_InstalledProduct.CIM_PROPERTY_PRODUCTIDENTIFYINGNUMBER + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstalledProduct.CIM_PROPERTY_PRODUCTIDENTIFYINGNUMBER + " could not be found");
    		
		} else if (!CIM_InstalledProductHelper.isValid_ProductIdentifyingNumber(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_InstalledProduct.CIM_PROPERTY_PRODUCTIDENTIFYINGNUMBER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstalledProduct.CIM_PROPERTY_PRODUCTIDENTIFYINGNUMBER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProductName
	
	public String get_ProductName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstalledProduct.CIM_PROPERTY_PRODUCTNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstalledProduct.CIM_PROPERTY_PRODUCTNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstalledProduct.CIM_PROPERTY_PRODUCTNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProductName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstalledProduct.CIM_PROPERTY_PRODUCTNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_InstalledProduct.CIM_PROPERTY_PRODUCTNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstalledProduct.CIM_PROPERTY_PRODUCTNAME + " could not be found");
    		
		} else if (!CIM_InstalledProductHelper.isValid_ProductName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_InstalledProduct.CIM_PROPERTY_PRODUCTNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstalledProduct.CIM_PROPERTY_PRODUCTNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProductVendor
	
	public String get_ProductVendor() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstalledProduct.CIM_PROPERTY_PRODUCTVENDOR);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstalledProduct.CIM_PROPERTY_PRODUCTVENDOR + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstalledProduct.CIM_PROPERTY_PRODUCTVENDOR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProductVendor(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstalledProduct.CIM_PROPERTY_PRODUCTVENDOR);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_InstalledProduct.CIM_PROPERTY_PRODUCTVENDOR + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstalledProduct.CIM_PROPERTY_PRODUCTVENDOR + " could not be found");
    		
		} else if (!CIM_InstalledProductHelper.isValid_ProductVendor(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_InstalledProduct.CIM_PROPERTY_PRODUCTVENDOR);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstalledProduct.CIM_PROPERTY_PRODUCTVENDOR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProductVersion
	
	public String get_ProductVersion() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstalledProduct.CIM_PROPERTY_PRODUCTVERSION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstalledProduct.CIM_PROPERTY_PRODUCTVERSION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstalledProduct.CIM_PROPERTY_PRODUCTVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProductVersion(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstalledProduct.CIM_PROPERTY_PRODUCTVERSION);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_InstalledProduct.CIM_PROPERTY_PRODUCTVERSION + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstalledProduct.CIM_PROPERTY_PRODUCTVERSION + " could not be found");
    		
		} else if (!CIM_InstalledProductHelper.isValid_ProductVersion(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_InstalledProduct.CIM_PROPERTY_PRODUCTVERSION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstalledProduct.CIM_PROPERTY_PRODUCTVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SystemID
	
	public String get_SystemID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstalledProduct.CIM_PROPERTY_SYSTEMID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstalledProduct.CIM_PROPERTY_SYSTEMID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstalledProduct.CIM_PROPERTY_SYSTEMID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SystemID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_InstalledProduct.CIM_PROPERTY_SYSTEMID);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_InstalledProduct.CIM_PROPERTY_SYSTEMID + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_InstalledProduct.CIM_PROPERTY_SYSTEMID + " could not be found");
    		
		} else if (!CIM_InstalledProductHelper.isValid_SystemID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_InstalledProduct.CIM_PROPERTY_SYSTEMID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_InstalledProduct.CIM_PROPERTY_SYSTEMID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
