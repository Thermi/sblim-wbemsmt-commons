/** 
 * CIM_PolicyRoleCollection.java
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
 * Description: PolicyRoleCollection is used to represent a collection of ManagedElements that share a common policy role, and the PolicySets that CAN BE applied to those elements. (Note that the PolicySets that are CURRENTLY applied are indicated via instances of the association, PolicySetAppliesToElement.) The PolicyRoleCollection always exists in the context of a System, specified using the PolicyRoleCollectionInSystem aggregation. The value of the PolicyRole property in this class specifies the role. It is defined as a free-form string. ManagedElements that share the role defined in this collection are aggregated into the Collection via the ElementInPolicyRoleCollection association.
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



public class CIM_PolicyRoleCollection extends CIM_SystemSpecificCollection  {
	
	public final static String CIM_CLASS_NAME = "CIM_PolicyRoleCollection";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTINPOLICYROLECOLLECTION = "CIM_ElementInPolicyRoleCollection";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_POLICYROLECOLLECTIONINSYSTEM = "CIM_PolicyRoleCollectionInSystem";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_POLICYSETINROLECOLLECTION = "CIM_PolicySetInRoleCollection";
	
	
	/**
	*	The PolicyRole name for the PolicySets and other ManagedElements that are identified and aggregated by the Collection. Note that the aggregated PolicySets define the rules and groups of rules that may be applied to the associated ManagedElements. 

Although not officially designated as 'role combinations', multiple roles may be specified using the form: 
<RoleName>[&&<RoleName>]* 
where the individual role names appear in alphabetical order (according to the collating sequence for UCS-2). Implementations may treat PolicyRole values that are specified as 'role combinations' as simple strings.
	*/
	public final static String CIM_PROPERTY_POLICYROLE = "PolicyRole"; //$NON-NLS-1$
	
	
	/**
	*	Activates/applies the PolicySets aggregated into this Collection to the specified ManagedElement. The ManagedElement MUST be a member of the Collection, associated via ElementInPolicyRoleCollection. The result of this method, if it is successfully executed, is that the aggregated PolicySets are deployed and enforced for the Element. This is reflected by the instantiation of the PolicySetAppliesToElement association between the named Element and each PolicySet.
	*/
	public final static String CIM_METHOD_ACTIVATEPOLICYSET = "ActivatePolicySet";
	/**
	*	Deactivates the aggregated PolicySets for the specified ManagedElement. The result of this method, if it is successfully executed, is that the aggregated PolicySets are NOT enforced for the Element. This is reflected by the removal of the PolicySetAppliesToElement association between the named Element and each PolicySet. If a PolicySet is not currently enforced for the ManagedElement, then this method has no effect for that Set.
	*/
	public final static String CIM_METHOD_DEACTIVATEPOLICYSET = "DeactivatePolicySet";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_POLICYROLE);
				
		for (int i = 0; i < CIM_SystemSpecificCollection.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SystemSpecificCollection.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_POLICYROLE)){
				continue;
			}
			
			CIM_PolicyRoleCollection.CIM_PropertyNameList.add(CIM_SystemSpecificCollection.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_POLICYROLE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_SystemSpecificCollection.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SystemSpecificCollection.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_POLICYROLE)){
				continue;
			}
			
			CIM_PolicyRoleCollection.CIM_PropertyList.add(CIM_SystemSpecificCollection.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_SystemSpecificCollection.Java_Package_List.size(); i++) {
			if (((String)CIM_SystemSpecificCollection.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_SystemSpecificCollection.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PolicyRoleCollection() {

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
	public CIM_PolicyRoleCollection(Vector keyProperties){ 
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
	public CIM_PolicyRoleCollection(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_PolicyRole = this.cimInstance.getProperty(CIM_PROPERTY_POLICYROLE);
		
		if (CIMProperty_PolicyRole == null || CIMProperty_PolicyRole.getValue().isEmpty() || CIMProperty_PolicyRole.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_POLICYROLE, "Required"});
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
	    
	    if (!(object instanceof CIM_PolicyRoleCollection)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PolicyRoleCollection)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PolicyRoleCollection)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PolicyRoleCollection)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PolicyRoleCollection)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PolicyRoleCollection)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PolicyRoleCollection)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PolicyRoleCollection)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PolicyRoleCollection)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PolicyRoleCollection)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_ManagedElement_CIM_ElementInPolicyRoleCollections(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTINPOLICYROLECOLLECTION, 
					CIM_ManagedElement.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_PolicyRoleCollection.Java_Package_List.size(); i++) {
						if (!((String)(CIM_PolicyRoleCollection.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_PolicyRoleCollection.Java_Package_List.get(i))).endsWith(".")) {
							CIM_PolicyRoleCollection.Java_Package_List.setElementAt((String)(CIM_PolicyRoleCollection.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_PolicyRoleCollection.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ManagedElement(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_ManagedElement(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ManagedElement(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_ManagedElement_CIM_ElementInPolicyRoleCollection_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ELEMENTINPOLICYROLECOLLECTION, 
					CIM_ManagedElement.CIM_CLASS_NAME, 
					"Collection",
					"Member");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ManagedElement.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_System_CIM_PolicyRoleCollectionInSystems(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_POLICYROLECOLLECTIONINSYSTEM, 
					CIM_System.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_PolicyRoleCollection.Java_Package_List.size(); i++) {
						if (!((String)(CIM_PolicyRoleCollection.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_PolicyRoleCollection.Java_Package_List.get(i))).endsWith(".")) {
							CIM_PolicyRoleCollection.Java_Package_List.setElementAt((String)(CIM_PolicyRoleCollection.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_PolicyRoleCollection.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_System(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_System(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_System(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_System_CIM_PolicyRoleCollectionInSystem_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_POLICYROLECOLLECTIONINSYSTEM, 
					CIM_System.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_System.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_PolicySet_CIM_PolicySetInRoleCollections(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_POLICYSETINROLECOLLECTION, 
					CIM_PolicySet.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_PolicyRoleCollection.Java_Package_List.size(); i++) {
						if (!((String)(CIM_PolicyRoleCollection.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_PolicyRoleCollection.Java_Package_List.get(i))).endsWith(".")) {
							CIM_PolicyRoleCollection.Java_Package_List.setElementAt((String)(CIM_PolicyRoleCollection.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_PolicyRoleCollection.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PolicySet(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_PolicySet(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PolicySet(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_PolicySet_CIM_PolicySetInRoleCollection_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_POLICYSETINROLECOLLECTION, 
					CIM_PolicySet.CIM_CLASS_NAME, 
					"Collection",
					"Member");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_PolicySet.CIM_CLASS_NAME)) {
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
	
	// Attribute PolicyRole
	
	public String get_PolicyRole() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyRoleCollection.CIM_PROPERTY_POLICYROLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyRoleCollection.CIM_PROPERTY_POLICYROLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyRoleCollection.CIM_PROPERTY_POLICYROLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PolicyRole(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PolicyRoleCollection.CIM_PROPERTY_POLICYROLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PolicyRoleCollection.CIM_PROPERTY_POLICYROLE + " could not be found");
    		
		} else if (!CIM_PolicyRoleCollectionHelper.isValid_PolicyRole(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PolicyRoleCollection.CIM_PROPERTY_POLICYROLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PolicyRoleCollection.CIM_PROPERTY_POLICYROLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt32 invoke_activatePolicySet(CIMClient cimClient, CIM_ManagedElement Element) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_PolicyRoleCollection.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_Element = new CIMValue(Element.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("Element", cimValue_Element));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_ACTIVATEPOLICYSET,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_PolicyRoleCollection.CIM_METHOD_ACTIVATEPOLICYSET + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_PolicyRoleCollection.CIM_METHOD_ACTIVATEPOLICYSET + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_PolicyRoleCollection.CIM_METHOD_ACTIVATEPOLICYSET + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	
	public UnsignedInt32 invoke_deactivatePolicySet(CIMClient cimClient, CIM_ManagedElement Element) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_PolicyRoleCollection.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_Element = new CIMValue(Element.getCimObjectPath(), new CIMDataType(CIMDataType.REFERENCE));
		
	  	inParameter.add(new CIMArgument("Element", cimValue_Element));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_DEACTIVATEPOLICYSET,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_PolicyRoleCollection.CIM_METHOD_DEACTIVATEPOLICYSET + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_PolicyRoleCollection.CIM_METHOD_DEACTIVATEPOLICYSET + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_PolicyRoleCollection.CIM_METHOD_DEACTIVATEPOLICYSET + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
