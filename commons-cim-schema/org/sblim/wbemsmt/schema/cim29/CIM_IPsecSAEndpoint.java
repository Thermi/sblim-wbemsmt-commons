/** 
 * CIM_IPsecSAEndpoint.java
 *
 * � Copyright IBM Corp. 2005
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
 * Description: IPsecSAEndpoints are types of SecurityAssociationEndpoints representing both negotiated and static SAs that correspond to AH, ESP, or IPCOMP transforms.
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



public class CIM_IPsecSAEndpoint extends CIM_SecurityAssociationEndpoint  {
	
	public final static String CIM_CLASS_NAME = "CIM_IPsecSAEndpoint";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PEEROFSAENDPOINT = "CIM_PeerOfSAEndpoint";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PHASE1SAUSEDFORPHASE2 = "CIM_Phase1SAUsedForPhase2";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_TRANSFORMOFSECURITYASSOCIATION = "CIM_TransformOfSecurityAssociation";
	
	
	/**
	*	DFHandling controls how the 'Don't Fragment' bit is managed by the IPsecSAEndpoint.
	*/
	public final static String CIM_PROPERTY_DFHANDLING = "DFHandling"; //$NON-NLS-1$
	/**
	*	EncapsulationMode indicates whether the IPsecSAEndpoint uses transport or tunnel encapsulation.
	*/
	public final static String CIM_PROPERTY_ENCAPSULATIONMODE = "EncapsulationMode"; //$NON-NLS-1$
	/**
	*	InboundDirection specifies whether the SA applies to inbound (TRUE) or outbound (FALSE) traffic.
	*/
	public final static String CIM_PROPERTY_INBOUNDDIRECTION = "InboundDirection"; //$NON-NLS-1$
	/**
	*	PFSInUse indicates whether perfect forward secrecy is required when refreshing keys.
	*/
	public final static String CIM_PROPERTY_PFSINUSE = "PFSInUse"; //$NON-NLS-1$
	/**
	*	SPI contains the Security Parameter Index of the SA. This value in string form may also be used in the key field 'Name' inherited from ServiceAccessPoint.
	*/
	public final static String CIM_PROPERTY_SPI = "SPI"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DFHANDLING);
		CIM_PropertyNameList.add(CIM_PROPERTY_ENCAPSULATIONMODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_INBOUNDDIRECTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_PFSINUSE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SPI);
				
		for (int i = 0; i < CIM_SecurityAssociationEndpoint.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SecurityAssociationEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DFHANDLING)||
				((String)CIM_SecurityAssociationEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ENCAPSULATIONMODE)||
				((String)CIM_SecurityAssociationEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INBOUNDDIRECTION)||
				((String)CIM_SecurityAssociationEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PFSINUSE)||
				((String)CIM_SecurityAssociationEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SPI)){
				continue;
			}
			
			CIM_IPsecSAEndpoint.CIM_PropertyNameList.add(CIM_SecurityAssociationEndpoint.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DFHANDLING, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ENCAPSULATIONMODE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INBOUNDDIRECTION, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PFSINUSE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SPI, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
				
		for (int i = 0; i < CIM_SecurityAssociationEndpoint.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SecurityAssociationEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DFHANDLING)||
				((CIMProperty)CIM_SecurityAssociationEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ENCAPSULATIONMODE)||
				((CIMProperty)CIM_SecurityAssociationEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INBOUNDDIRECTION)||
				((CIMProperty)CIM_SecurityAssociationEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PFSINUSE)||
				((CIMProperty)CIM_SecurityAssociationEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SPI)){
				continue;
			}
			
			CIM_IPsecSAEndpoint.CIM_PropertyList.add(CIM_SecurityAssociationEndpoint.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_SecurityAssociationEndpoint.Java_Package_List.size(); i++) {
			if (((String)CIM_SecurityAssociationEndpoint.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_SecurityAssociationEndpoint.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_DFHANDLING = {"Unknown","Copy from Internal to External IP Header","Set DF Bit in External Header to 1","Set DF Bit in External Header to 0"};
	public final static String[] CIM_VALUEMAP_ENCAPSULATIONMODE = {"Unknown","Tunnel","Transport"};
	
	
	public final static int DFHANDLING_UNKNOWN = 0;
	public final static int DFHANDLING_COPYFROMINTERNALTOEXTERNALIPHEADER = 2;
	public final static int DFHANDLING_SETDFBITINEXTERNALHEADERTO1 = 3;
	public final static int DFHANDLING_SETDFBITINEXTERNALHEADERTO0 = 4;
	
	public final static int ENCAPSULATIONMODE_UNKNOWN = 0;
	public final static int ENCAPSULATIONMODE_TUNNEL = 2;
	public final static int ENCAPSULATIONMODE_TRANSPORT = 3;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_IPsecSAEndpoint() {

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
	public CIM_IPsecSAEndpoint(Vector keyProperties){ 
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
	public CIM_IPsecSAEndpoint(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_IPsecSAEndpoint)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_IPsecSAEndpoint)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_IPsecSAEndpoint)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_IPsecSAEndpoint)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_IPsecSAEndpoint)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_IPsecSAEndpoint)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_IPsecSAEndpoint)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_IPsecSAEndpoint)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_IPsecSAEndpoint)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_IPsecSAEndpoint)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_RemoteServiceAccessPoint_CIM_PeerOfSAEndpoints(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PEEROFSAENDPOINT, 
					CIM_RemoteServiceAccessPoint.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_IPsecSAEndpoint.Java_Package_List.size(); i++) {
						if (!((String)(CIM_IPsecSAEndpoint.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_IPsecSAEndpoint.Java_Package_List.get(i))).endsWith(".")) {
							CIM_IPsecSAEndpoint.Java_Package_List.setElementAt((String)(CIM_IPsecSAEndpoint.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_IPsecSAEndpoint.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_RemoteServiceAccessPoint(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_RemoteServiceAccessPoint(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_RemoteServiceAccessPoint(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_RemoteServiceAccessPoint_CIM_PeerOfSAEndpoint_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PEEROFSAENDPOINT, 
					CIM_RemoteServiceAccessPoint.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_RemoteServiceAccessPoint.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_SecurityAssociationEndpoint_CIM_Phase1SAUsedForPhase2s(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PHASE1SAUSEDFORPHASE2, 
					CIM_SecurityAssociationEndpoint.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_IPsecSAEndpoint.Java_Package_List.size(); i++) {
						if (!((String)(CIM_IPsecSAEndpoint.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_IPsecSAEndpoint.Java_Package_List.get(i))).endsWith(".")) {
							CIM_IPsecSAEndpoint.Java_Package_List.setElementAt((String)(CIM_IPsecSAEndpoint.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_IPsecSAEndpoint.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_SecurityAssociationEndpoint(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_SecurityAssociationEndpoint(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_SecurityAssociationEndpoint(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_SecurityAssociationEndpoint_CIM_Phase1SAUsedForPhase2_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PHASE1SAUSEDFORPHASE2, 
					CIM_SecurityAssociationEndpoint.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_SecurityAssociationEndpoint.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_SATransform_CIM_TransformOfSecurityAssociations(CIMClient cimClient,
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
					CIM_SATransform.CIM_CLASS_NAME, 
					"ManagedElement",
					"SettingData",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_IPsecSAEndpoint.Java_Package_List.size(); i++) {
						if (!((String)(CIM_IPsecSAEndpoint.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_IPsecSAEndpoint.Java_Package_List.get(i))).endsWith(".")) {
							CIM_IPsecSAEndpoint.Java_Package_List.setElementAt((String)(CIM_IPsecSAEndpoint.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_IPsecSAEndpoint.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_SATransform(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_SATransform(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_SATransform(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_SATransform_CIM_TransformOfSecurityAssociation_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_TRANSFORMOFSECURITYASSOCIATION, 
					CIM_SATransform.CIM_CLASS_NAME, 
					"ManagedElement",
					"SettingData");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_SATransform.CIM_CLASS_NAME)) {
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
	
	// Attribute DFHandling
	
	public UnsignedInt16 get_DFHandling() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPsecSAEndpoint.CIM_PROPERTY_DFHANDLING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPsecSAEndpoint.CIM_PROPERTY_DFHANDLING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPsecSAEndpoint.CIM_PROPERTY_DFHANDLING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DFHandling(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPsecSAEndpoint.CIM_PROPERTY_DFHANDLING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPsecSAEndpoint.CIM_PROPERTY_DFHANDLING + " could not be found");
    		
		} else if (!CIM_IPsecSAEndpointHelper.isValid_DFHandling(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPsecSAEndpoint.CIM_PROPERTY_DFHANDLING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPsecSAEndpoint.CIM_PROPERTY_DFHANDLING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EncapsulationMode
	
	public UnsignedInt16 get_EncapsulationMode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPsecSAEndpoint.CIM_PROPERTY_ENCAPSULATIONMODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPsecSAEndpoint.CIM_PROPERTY_ENCAPSULATIONMODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPsecSAEndpoint.CIM_PROPERTY_ENCAPSULATIONMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EncapsulationMode(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPsecSAEndpoint.CIM_PROPERTY_ENCAPSULATIONMODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPsecSAEndpoint.CIM_PROPERTY_ENCAPSULATIONMODE + " could not be found");
    		
		} else if (!CIM_IPsecSAEndpointHelper.isValid_EncapsulationMode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPsecSAEndpoint.CIM_PROPERTY_ENCAPSULATIONMODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPsecSAEndpoint.CIM_PROPERTY_ENCAPSULATIONMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InboundDirection
	
	public Boolean get_InboundDirection() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPsecSAEndpoint.CIM_PROPERTY_INBOUNDDIRECTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPsecSAEndpoint.CIM_PROPERTY_INBOUNDDIRECTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPsecSAEndpoint.CIM_PROPERTY_INBOUNDDIRECTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_InboundDirection(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPsecSAEndpoint.CIM_PROPERTY_INBOUNDDIRECTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPsecSAEndpoint.CIM_PROPERTY_INBOUNDDIRECTION + " could not be found");
    		
		} else if (!CIM_IPsecSAEndpointHelper.isValid_InboundDirection(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPsecSAEndpoint.CIM_PROPERTY_INBOUNDDIRECTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPsecSAEndpoint.CIM_PROPERTY_INBOUNDDIRECTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PFSInUse
	
	public Boolean get_PFSInUse() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPsecSAEndpoint.CIM_PROPERTY_PFSINUSE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPsecSAEndpoint.CIM_PROPERTY_PFSINUSE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPsecSAEndpoint.CIM_PROPERTY_PFSINUSE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PFSInUse(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPsecSAEndpoint.CIM_PROPERTY_PFSINUSE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPsecSAEndpoint.CIM_PROPERTY_PFSINUSE + " could not be found");
    		
		} else if (!CIM_IPsecSAEndpointHelper.isValid_PFSInUse(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPsecSAEndpoint.CIM_PROPERTY_PFSINUSE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPsecSAEndpoint.CIM_PROPERTY_PFSINUSE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SPI
	
	public UnsignedInt32 get_SPI() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPsecSAEndpoint.CIM_PROPERTY_SPI);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPsecSAEndpoint.CIM_PROPERTY_SPI + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPsecSAEndpoint.CIM_PROPERTY_SPI + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SPI(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_IPsecSAEndpoint.CIM_PROPERTY_SPI);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_IPsecSAEndpoint.CIM_PROPERTY_SPI + " could not be found");
    		
		} else if (!CIM_IPsecSAEndpointHelper.isValid_SPI(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_IPsecSAEndpoint.CIM_PROPERTY_SPI);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_IPsecSAEndpoint.CIM_PROPERTY_SPI + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
