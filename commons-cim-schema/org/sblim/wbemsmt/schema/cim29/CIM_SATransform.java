/** 
 * CIM_SATransform.java
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
 * Description: SATransform is the base class for the various types of transforms that are in effect for an existing IPsecSAEndpoint, or aggregated into phase 2 proposals used during the IPsec negotiation process. This class is defined as a kind of ScopedSettingData, since it describes the set of transform properties that MUST be applied together, if negotiated. This subclassing is different than that defined in IETF's IPSP Policy draft - where it is subclassed from Policy. The definition as SettingData is more consistent with the application of the properties as a set, to the negotiated Security Association. 

Note that an instance of this class is 'scoped' or contained by a System (either a ComputerSystem or AdminDomain), rather than by a SecurityAssociationEndpoint. This is indicated by instantiating the ScopedSetting association, and is necessary since the transform data is used in IPsec negotiation policies (also scoped by Systems) before ever being associated with a SecurityAssociationEndpoint. The latter semantics (i.e., that 'this' transform is negotiated for 'this' Security Association) is conveyed via a subclass of ElementSettingData, TransformOfSecurityAssociation.
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



public class CIM_SATransform extends CIM_ScopedSettingData  {
	
	public final static String CIM_CLASS_NAME = "CIM_SATransform";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINEDTRANSFORM = "CIM_ContainedTransform";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_TRANSFORMOFPRECONFIGUREDACTION = "CIM_TransformOfPreconfiguredAction";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_TRANSFORMOFSECURITYASSOCIATION = "CIM_TransformOfSecurityAssociation";
	
	
	/**
	*	
	*/
	public final static String CIM_PROPERTY_ELEMENTNAME = "ElementName"; //$NON-NLS-1$
	/**
	*	MaxLifetimeKilobytes specifies the maximum kilobyte lifetime for a Security Association. Different lifetimes are used, depending on the strength of the encryption algorithm. A value of 0, the default, indicates that no maximum should be defined. A non-zero value specifies the desired kilobyte lifetime.
	*/
	public final static String CIM_PROPERTY_MAXLIFETIMEKILOBYTES = "MaxLifetimeKilobytes"; //$NON-NLS-1$
	/**
	*	MaxLifetimeSeconds specifies the maximum time that the Security Association should be considered valid after it has been created. A value of 0, the default, indicates that 8 hours should be used. A non-zero value indicates the maximum lifetime in seconds.
	*/
	public final static String CIM_PROPERTY_MAXLIFETIMESECONDS = "MaxLifetimeSeconds"; //$NON-NLS-1$
	/**
	*	VendorID identifies vendor-defined transforms. If this field is empty (the default), then this is a standard transform.
	*/
	public final static String CIM_PROPERTY_VENDORID = "VendorID"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ELEMENTNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXLIFETIMEKILOBYTES);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXLIFETIMESECONDS);
		CIM_PropertyNameList.add(CIM_PROPERTY_VENDORID);
				
		for (int i = 0; i < CIM_ScopedSettingData.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ScopedSettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ELEMENTNAME)||
				((String)CIM_ScopedSettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXLIFETIMEKILOBYTES)||
				((String)CIM_ScopedSettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXLIFETIMESECONDS)||
				((String)CIM_ScopedSettingData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VENDORID)){
				continue;
			}
			
			CIM_SATransform.CIM_PropertyNameList.add(CIM_ScopedSettingData.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ELEMENTNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXLIFETIMEKILOBYTES, new CIMValue(new UnsignedInt64("0"), new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXLIFETIMESECONDS, new CIMValue(new UnsignedInt64("0"), new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VENDORID, new CIMValue("", new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_ScopedSettingData.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ScopedSettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ELEMENTNAME)||
				((CIMProperty)CIM_ScopedSettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXLIFETIMEKILOBYTES)||
				((CIMProperty)CIM_ScopedSettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXLIFETIMESECONDS)||
				((CIMProperty)CIM_ScopedSettingData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VENDORID)){
				continue;
			}
			
			CIM_SATransform.CIM_PropertyList.add(CIM_ScopedSettingData.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_ScopedSettingData.Java_Package_List.size(); i++) {
			if (((String)CIM_ScopedSettingData.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_ScopedSettingData.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_SATransform() {

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
	public CIM_SATransform(Vector keyProperties){ 
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
	public CIM_SATransform(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_SATransform)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_SATransform)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_SATransform)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_SATransform)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_SATransform)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_SATransform)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_SATransform)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_SATransform)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_SATransform)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_SATransform)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_IPsecProposal_CIM_ContainedTransforms(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINEDTRANSFORM, 
					CIM_IPsecProposal.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_SATransform.Java_Package_List.size(); i++) {
						if (!((String)(CIM_SATransform.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_SATransform.Java_Package_List.get(i))).endsWith(".")) {
							CIM_SATransform.Java_Package_List.setElementAt((String)(CIM_SATransform.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_SATransform.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_IPsecProposal(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_IPsecProposal(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_IPsecProposal(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_IPsecProposal_CIM_ContainedTransform_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_CONTAINEDTRANSFORM, 
					CIM_IPsecProposal.CIM_CLASS_NAME, 
					"PartComponent",
					"GroupComponent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_IPsecProposal.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_PreconfiguredSAAction_CIM_TransformOfPreconfiguredActions(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_TRANSFORMOFPRECONFIGUREDACTION, 
					CIM_PreconfiguredSAAction.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_SATransform.Java_Package_List.size(); i++) {
						if (!((String)(CIM_SATransform.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_SATransform.Java_Package_List.get(i))).endsWith(".")) {
							CIM_SATransform.Java_Package_List.setElementAt((String)(CIM_SATransform.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_SATransform.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PreconfiguredSAAction(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_PreconfiguredSAAction(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PreconfiguredSAAction(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_PreconfiguredSAAction_CIM_TransformOfPreconfiguredAction_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_TRANSFORMOFPRECONFIGUREDACTION, 
					CIM_PreconfiguredSAAction.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_PreconfiguredSAAction.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_IPsecSAEndpoint_CIM_TransformOfSecurityAssociations(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_TRANSFORMOFSECURITYASSOCIATION, 
					CIM_IPsecSAEndpoint.CIM_CLASS_NAME, 
					"SettingData",
					"ManagedElement",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_SATransform.Java_Package_List.size(); i++) {
						if (!((String)(CIM_SATransform.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_SATransform.Java_Package_List.get(i))).endsWith(".")) {
							CIM_SATransform.Java_Package_List.setElementAt((String)(CIM_SATransform.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_SATransform.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_IPsecSAEndpoint(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_IPsecSAEndpoint(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_IPsecSAEndpoint(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_IPsecSAEndpoint_CIM_TransformOfSecurityAssociation_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_TRANSFORMOFSECURITYASSOCIATION, 
					CIM_IPsecSAEndpoint.CIM_CLASS_NAME, 
					"SettingData",
					"ManagedElement");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_IPsecSAEndpoint.CIM_CLASS_NAME)) {
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
	
	// Attribute ElementName
	
	public String get_ElementName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SATransform.CIM_PROPERTY_ELEMENTNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SATransform.CIM_PROPERTY_ELEMENTNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SATransform.CIM_PROPERTY_ELEMENTNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ElementName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SATransform.CIM_PROPERTY_ELEMENTNAME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SATransform.CIM_PROPERTY_ELEMENTNAME + " could not be found");
    		
		} else if (!CIM_SATransformHelper.isValid_ElementName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SATransform.CIM_PROPERTY_ELEMENTNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SATransform.CIM_PROPERTY_ELEMENTNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxLifetimeKilobytes
	
	public UnsignedInt64 get_MaxLifetimeKilobytes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SATransform.CIM_PROPERTY_MAXLIFETIMEKILOBYTES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SATransform.CIM_PROPERTY_MAXLIFETIMEKILOBYTES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SATransform.CIM_PROPERTY_MAXLIFETIMEKILOBYTES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxLifetimeKilobytes(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SATransform.CIM_PROPERTY_MAXLIFETIMEKILOBYTES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SATransform.CIM_PROPERTY_MAXLIFETIMEKILOBYTES + " could not be found");
    		
		} else if (!CIM_SATransformHelper.isValid_MaxLifetimeKilobytes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SATransform.CIM_PROPERTY_MAXLIFETIMEKILOBYTES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SATransform.CIM_PROPERTY_MAXLIFETIMEKILOBYTES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxLifetimeSeconds
	
	public UnsignedInt64 get_MaxLifetimeSeconds() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SATransform.CIM_PROPERTY_MAXLIFETIMESECONDS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SATransform.CIM_PROPERTY_MAXLIFETIMESECONDS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SATransform.CIM_PROPERTY_MAXLIFETIMESECONDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxLifetimeSeconds(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SATransform.CIM_PROPERTY_MAXLIFETIMESECONDS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SATransform.CIM_PROPERTY_MAXLIFETIMESECONDS + " could not be found");
    		
		} else if (!CIM_SATransformHelper.isValid_MaxLifetimeSeconds(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SATransform.CIM_PROPERTY_MAXLIFETIMESECONDS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SATransform.CIM_PROPERTY_MAXLIFETIMESECONDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute VendorID
	
	public String get_VendorID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SATransform.CIM_PROPERTY_VENDORID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SATransform.CIM_PROPERTY_VENDORID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SATransform.CIM_PROPERTY_VENDORID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_VendorID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SATransform.CIM_PROPERTY_VENDORID);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SATransform.CIM_PROPERTY_VENDORID + " could not be found");
    		
		} else if (!CIM_SATransformHelper.isValid_VendorID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SATransform.CIM_PROPERTY_VENDORID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SATransform.CIM_PROPERTY_VENDORID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
