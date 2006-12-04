/** 
 * PRS_Administrative.java
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
 * Description: PRS_Administrative defines administrative information about associated objects. There must be at least one PRS_Administrative instance associated with a PRS_Solution. Administrative information is inherited from a parent object. 

If the administrative information among objects within a Solution is not the same, additional PRS_Administrative instances may be associated with other objects within the Solution. All instances under a specific parent inherit their administrative information unless there is an PRS_Administrative instance associated with that instance. 

For example, if there is a PRS_Administrative instance associated with a PRS_Problem instance, all of the PRS_Statement and PRS_ Product instances within the Problem use the same Administrative information as the PRS_Problem instance.
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



public class PRS_Administrative extends PRS_ExchangeElement  {
	
	public final static String CIM_CLASS_NAME = "PRS_Administrative";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_PRS_ADMINASSOCIATION = "PRS_AdminAssociation";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_PRS_ADMINISTRATIVECONTACT = "PRS_AdministrativeContact";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_PRS_ADMINISTRATIVEREVISION = "PRS_AdministrativeRevision";
	
	
	/**
	*	Level 0 means all information within a Reference, Problem or Resolution is conveyed by a single PRS_Statement. 

Level 1 means there may be multiple PRS_Statement instances within a Reference, Problem or Resolution. 

Level 2 means that a PRS_Statement may be associated with a PRS_Feature instance within a Reference, Problem or Resolution.
	*/
	public final static String CIM_PROPERTY_COMPLIANCELEVEL = "ComplianceLevel"; //$NON-NLS-1$
	/**
	*	Copyright for the associated information.
	*/
	public final static String CIM_PROPERTY_COPYRIGHT = "Copyright"; //$NON-NLS-1$
	/**
	*	Disclaimers about the associated information.
	*/
	public final static String CIM_PROPERTY_DISCLAIMER = "Disclaimer"; //$NON-NLS-1$
	/**
	*	Intended distribution audience for the associated information. If 'Proprietary', information contains proprietary information and is not to be released externally. If 'Internal', information is for internal use only. If 'Partner', information is only available to contracted partners. If 'Public', information is available to anyone.
	*/
	public final static String CIM_PROPERTY_DISTRIBUTION = "Distribution"; //$NON-NLS-1$
	/**
	*	Editorial status of the document. If 'Draft', information is complete, but unedited. If 'Reviewed', an editorial review has been completed. If 'Published', information has been reviewed and approved for distribution.
	*/
	public final static String CIM_PROPERTY_DOCUMENTSTATUS = "DocumentStatus"; //$NON-NLS-1$
	/**
	*	Language used in the associated information.
	*/
	public final static String CIM_PROPERTY_LANGUAGE = "Language"; //$NON-NLS-1$
	/**
	*	Usage rights for the associated information.
	*/
	public final static String CIM_PROPERTY_RIGHTS = "Rights"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_COMPLIANCELEVEL);
		CIM_PropertyNameList.add(CIM_PROPERTY_COPYRIGHT);
		CIM_PropertyNameList.add(CIM_PROPERTY_DISCLAIMER);
		CIM_PropertyNameList.add(CIM_PROPERTY_DISTRIBUTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_DOCUMENTSTATUS);
		CIM_PropertyNameList.add(CIM_PROPERTY_LANGUAGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_RIGHTS);
				
		for (int i = 0; i < PRS_ExchangeElement.CIM_PropertyNameList.size(); i++) {
			if (((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_COMPLIANCELEVEL)||
				((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_COPYRIGHT)||
				((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DISCLAIMER)||
				((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DISTRIBUTION)||
				((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DOCUMENTSTATUS)||
				((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LANGUAGE)||
				((String)PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_RIGHTS)){
				continue;
			}
			
			PRS_Administrative.CIM_PropertyNameList.add(PRS_ExchangeElement.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_COMPLIANCELEVEL, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_COPYRIGHT, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DISCLAIMER, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DISTRIBUTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DOCUMENTSTATUS, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LANGUAGE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_RIGHTS, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < PRS_ExchangeElement.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_COMPLIANCELEVEL)||
				((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_COPYRIGHT)||
				((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DISCLAIMER)||
				((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DISTRIBUTION)||
				((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DOCUMENTSTATUS)||
				((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LANGUAGE)||
				((CIMProperty)PRS_ExchangeElement.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_RIGHTS)){
				continue;
			}
			
			PRS_Administrative.CIM_PropertyList.add(PRS_ExchangeElement.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < PRS_ExchangeElement.Java_Package_List.size(); i++) {
			if (((String)PRS_ExchangeElement.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(PRS_ExchangeElement.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_COMPLIANCELEVEL = {"Value0","Value1","Value2"};
	public final static String[] CIM_VALUEMAP_DISTRIBUTION = {"Proprietary","Internal","Partner","Public","Other","Unknown"};
	public final static String[] CIM_VALUEMAP_DOCUMENTSTATUS = {"Draft","Reviewed","Published","Other","Unknown"};
	
	
	public final static int COMPLIANCELEVEL_VALUE0 = 0;
	public final static int COMPLIANCELEVEL_VALUE1 = 1;
	public final static int COMPLIANCELEVEL_VALUE2 = 2;
	
	public final static int DISTRIBUTION_PROPRIETARY = 0;
	public final static int DISTRIBUTION_INTERNAL = 1;
	public final static int DISTRIBUTION_PARTNER = 2;
	public final static int DISTRIBUTION_PUBLIC = 3;
	public final static int DISTRIBUTION_OTHER = 254;
	public final static int DISTRIBUTION_UNKNOWN = 255;
	
	public final static int DOCUMENTSTATUS_DRAFT = 0;
	public final static int DOCUMENTSTATUS_REVIEWED = 1;
	public final static int DOCUMENTSTATUS_PUBLISHED = 2;
	public final static int DOCUMENTSTATUS_OTHER = 254;
	public final static int DOCUMENTSTATUS_UNKNOWN = 255;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public PRS_Administrative() {

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
	public PRS_Administrative(Vector keyProperties){ 
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
	public PRS_Administrative(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof PRS_Administrative)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((PRS_Administrative)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((PRS_Administrative)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((PRS_Administrative)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((PRS_Administrative)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((PRS_Administrative)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((PRS_Administrative)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((PRS_Administrative)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((PRS_Administrative)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((PRS_Administrative)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_PRS_ExchangeElement_PRS_AdminAssociations(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_PRS_ADMINASSOCIATION, 
					PRS_ExchangeElement.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < PRS_Administrative.Java_Package_List.size(); i++) {
						if (!((String)(PRS_Administrative.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(PRS_Administrative.Java_Package_List.get(i))).endsWith(".")) {
							PRS_Administrative.Java_Package_List.setElementAt((String)(PRS_Administrative.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (PRS_Administrative.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new PRS_ExchangeElement(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new PRS_ExchangeElement(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new PRS_ExchangeElement(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_PRS_ExchangeElement_PRS_AdminAssociation_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_PRS_ADMINASSOCIATION, 
					PRS_ExchangeElement.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(PRS_ExchangeElement.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_PRS_Contact_PRS_AdministrativeContacts(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_PRS_ADMINISTRATIVECONTACT, 
					PRS_Contact.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < PRS_Administrative.Java_Package_List.size(); i++) {
						if (!((String)(PRS_Administrative.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(PRS_Administrative.Java_Package_List.get(i))).endsWith(".")) {
							PRS_Administrative.Java_Package_List.setElementAt((String)(PRS_Administrative.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (PRS_Administrative.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new PRS_Contact(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new PRS_Contact(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new PRS_Contact(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_PRS_Contact_PRS_AdministrativeContact_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_PRS_ADMINISTRATIVECONTACT, 
					PRS_Contact.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(PRS_Contact.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_PRS_Revision_PRS_AdministrativeRevisions(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_PRS_ADMINISTRATIVEREVISION, 
					PRS_Revision.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < PRS_Administrative.Java_Package_List.size(); i++) {
						if (!((String)(PRS_Administrative.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(PRS_Administrative.Java_Package_List.get(i))).endsWith(".")) {
							PRS_Administrative.Java_Package_List.setElementAt((String)(PRS_Administrative.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (PRS_Administrative.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new PRS_Revision(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new PRS_Revision(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new PRS_Revision(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_PRS_Revision_PRS_AdministrativeRevision_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_PRS_ADMINISTRATIVEREVISION, 
					PRS_Revision.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(PRS_Revision.CIM_CLASS_NAME)) {
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
	
	// Attribute ComplianceLevel
	
	public UnsignedInt16 get_ComplianceLevel() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Administrative.CIM_PROPERTY_COMPLIANCELEVEL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Administrative.CIM_PROPERTY_COMPLIANCELEVEL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Administrative.CIM_PROPERTY_COMPLIANCELEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ComplianceLevel(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Administrative.CIM_PROPERTY_COMPLIANCELEVEL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Administrative.CIM_PROPERTY_COMPLIANCELEVEL + " could not be found");
    		
		} else if (!PRS_AdministrativeHelper.isValid_ComplianceLevel(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_Administrative.CIM_PROPERTY_COMPLIANCELEVEL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Administrative.CIM_PROPERTY_COMPLIANCELEVEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Copyright
	
	public String get_Copyright() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Administrative.CIM_PROPERTY_COPYRIGHT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Administrative.CIM_PROPERTY_COPYRIGHT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Administrative.CIM_PROPERTY_COPYRIGHT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Copyright(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Administrative.CIM_PROPERTY_COPYRIGHT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Administrative.CIM_PROPERTY_COPYRIGHT + " could not be found");
    		
		} else if (!PRS_AdministrativeHelper.isValid_Copyright(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_Administrative.CIM_PROPERTY_COPYRIGHT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Administrative.CIM_PROPERTY_COPYRIGHT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Disclaimer
	
	public String get_Disclaimer() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Administrative.CIM_PROPERTY_DISCLAIMER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Administrative.CIM_PROPERTY_DISCLAIMER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Administrative.CIM_PROPERTY_DISCLAIMER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Disclaimer(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Administrative.CIM_PROPERTY_DISCLAIMER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Administrative.CIM_PROPERTY_DISCLAIMER + " could not be found");
    		
		} else if (!PRS_AdministrativeHelper.isValid_Disclaimer(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_Administrative.CIM_PROPERTY_DISCLAIMER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Administrative.CIM_PROPERTY_DISCLAIMER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Distribution
	
	public UnsignedInt8 get_Distribution() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Administrative.CIM_PROPERTY_DISTRIBUTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Administrative.CIM_PROPERTY_DISTRIBUTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Administrative.CIM_PROPERTY_DISTRIBUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Distribution(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Administrative.CIM_PROPERTY_DISTRIBUTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Administrative.CIM_PROPERTY_DISTRIBUTION + " could not be found");
    		
		} else if (!PRS_AdministrativeHelper.isValid_Distribution(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_Administrative.CIM_PROPERTY_DISTRIBUTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Administrative.CIM_PROPERTY_DISTRIBUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DocumentStatus
	
	public UnsignedInt8 get_DocumentStatus() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Administrative.CIM_PROPERTY_DOCUMENTSTATUS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Administrative.CIM_PROPERTY_DOCUMENTSTATUS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Administrative.CIM_PROPERTY_DOCUMENTSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DocumentStatus(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Administrative.CIM_PROPERTY_DOCUMENTSTATUS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Administrative.CIM_PROPERTY_DOCUMENTSTATUS + " could not be found");
    		
		} else if (!PRS_AdministrativeHelper.isValid_DocumentStatus(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_Administrative.CIM_PROPERTY_DOCUMENTSTATUS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Administrative.CIM_PROPERTY_DOCUMENTSTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Language
	
	public String get_Language() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Administrative.CIM_PROPERTY_LANGUAGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Administrative.CIM_PROPERTY_LANGUAGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Administrative.CIM_PROPERTY_LANGUAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Language(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Administrative.CIM_PROPERTY_LANGUAGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Administrative.CIM_PROPERTY_LANGUAGE + " could not be found");
    		
		} else if (!PRS_AdministrativeHelper.isValid_Language(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_Administrative.CIM_PROPERTY_LANGUAGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Administrative.CIM_PROPERTY_LANGUAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Rights
	
	public String get_Rights() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Administrative.CIM_PROPERTY_RIGHTS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Administrative.CIM_PROPERTY_RIGHTS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Administrative.CIM_PROPERTY_RIGHTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Rights(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(PRS_Administrative.CIM_PROPERTY_RIGHTS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + PRS_Administrative.CIM_PROPERTY_RIGHTS + " could not be found");
    		
		} else if (!PRS_AdministrativeHelper.isValid_Rights(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + PRS_Administrative.CIM_PROPERTY_RIGHTS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + PRS_Administrative.CIM_PROPERTY_RIGHTS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
