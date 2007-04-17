/** 
 * CIM_SecurityAssociationEndpoint.java
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
 * Description:  SecurityAssociationEndpoint (SAEndpoint) represents the endpoint of a secure
 * connection. This is typically an IP connection, although the model allows
 * more flexibility than just IP. The SecurityAssociationEndpoint is tied to an
 * IPProtocolEndpoint (or possibly other endpoint) using the LogicalIdentity
 * association. Note that an endpoint is defined at both ends of the connection.
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
import org.sblim.wbem.cim.UnsignedInt64;
import org.sblim.wbem.cim.UnsignedInt8;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.CIMEnumeration;



/**
 *  SecurityAssociationEndpoint (SAEndpoint) represents the endpoint of a secure
 * connection. This is typically an IP connection, although the model allows
 * more flexibility than just IP. The SecurityAssociationEndpoint is tied to an
 * IPProtocolEndpoint (or possibly other endpoint) using the LogicalIdentity
 * association. Note that an endpoint is defined at both ends of the connection.
 */
public class CIM_SecurityAssociationEndpoint extends CIM_ProtocolEndpoint  {
	
	public final static String CIM_CLASS_NAME = "CIM_SecurityAssociationEndpoint"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_FILTEROFSECURITYASSOCIATION = "CIM_FilterOfSecurityAssociation"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_PHASE1SAUSEDFORPHASE2 = "CIM_Phase1SAUsedForPhase2"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_RULETHATGENERATEDSA = "CIM_RuleThatGeneratedSA"; //$NON-NLS-1$
	
	
	/**
	*	IdleDurationSeconds specifies how long the SA can be idle before it is deleted. The default value, 0, indicates that there is no idle timeout period.
	*/
	public final static String CIM_PROPERTY_IDLEDURATIONSECONDS = "IdleDurationSeconds"; //$NON-NLS-1$
	/**
	*	InstallDate records when the SA (and its endpoint) was created.
	*/
	public final static String CIM_PROPERTY_INSTALLDATE = "InstallDate"; //$NON-NLS-1$
	/**
	*	LifetimeKilobytes specifies the maximum number of kilobytes of data traffic to be protected by the SA. A value of zero (the default) indicates that there should be no maximum kilobyte lifetime. A non-zero value specifies the desired kilobyte lifetime. The SA is deleted when the LifetimeKilobyte value is exceeded.
	*/
	public final static String CIM_PROPERTY_LIFETIMEKILOBYTES = "LifetimeKilobytes"; //$NON-NLS-1$
	/**
	*	LifetimeSeconds specifies the maximum time that the SA will be considered valid after it has been created. A value of zero indicates that the default of 8 hours be used. A non-zero value indicates the seconds lifetime.
	*/
	public final static String CIM_PROPERTY_LIFETIMESECONDS = "LifetimeSeconds"; //$NON-NLS-1$
	/**
	*	PacketLoggingActive causes a log to be kept of traffic processed by the SAEndpoint.
	*/
	public final static String CIM_PROPERTY_PACKETLOGGINGACTIVE = "PacketLoggingActive"; //$NON-NLS-1$
	/**
	*	RefreshThresholdKbytesPercentage is the lifetime percentage of kilobytes processed, at which a new SA should be acquired. A random value may be added to the calculated threshold to reduce network thrashing.
	*/
	public final static String CIM_PROPERTY_REFRESHTHRESHOLDKBYTESPERCENTAGE = "RefreshThresholdKbytesPercentage"; //$NON-NLS-1$
	/**
	*	RefreshThresholdSecondsPercentage is the lifetime percentage after which a new SA should be acquired, before the existing SA expires. A random period may be added to a calculated threshold to reduce network thrashing.
	*/
	public final static String CIM_PROPERTY_REFRESHTHRESHOLDSECONDSPERCENTAGE = "RefreshThresholdSecondsPercentage"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_IDLEDURATIONSECONDS);
		CIM_PropertyNameList.add(CIM_PROPERTY_INSTALLDATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_LIFETIMEKILOBYTES);
		CIM_PropertyNameList.add(CIM_PROPERTY_LIFETIMESECONDS);
		CIM_PropertyNameList.add(CIM_PROPERTY_PACKETLOGGINGACTIVE);
		CIM_PropertyNameList.add(CIM_PROPERTY_REFRESHTHRESHOLDKBYTESPERCENTAGE);
		CIM_PropertyNameList.add(CIM_PROPERTY_REFRESHTHRESHOLDSECONDSPERCENTAGE);
				
		for (int i = 0; i < CIM_ProtocolEndpoint.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_IDLEDURATIONSECONDS)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INSTALLDATE)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LIFETIMEKILOBYTES)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LIFETIMESECONDS)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PACKETLOGGINGACTIVE)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REFRESHTHRESHOLDKBYTESPERCENTAGE)||
				((String)CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REFRESHTHRESHOLDSECONDSPERCENTAGE)){
				continue;
			}
			
			CIM_SecurityAssociationEndpoint.CIM_PropertyNameList.add(CIM_ProtocolEndpoint.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_IDLEDURATIONSECONDS, new CIMValue(new UnsignedInt64("0"), new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INSTALLDATE, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LIFETIMEKILOBYTES, new CIMValue(new UnsignedInt64("0"), new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LIFETIMESECONDS, new CIMValue(new UnsignedInt64("0"), new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PACKETLOGGINGACTIVE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REFRESHTHRESHOLDKBYTESPERCENTAGE, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REFRESHTHRESHOLDSECONDSPERCENTAGE, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
				
		for (int i = 0; i < CIM_ProtocolEndpoint.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_IDLEDURATIONSECONDS)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INSTALLDATE)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LIFETIMEKILOBYTES)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LIFETIMESECONDS)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PACKETLOGGINGACTIVE)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REFRESHTHRESHOLDKBYTESPERCENTAGE)||
				((CIMProperty)CIM_ProtocolEndpoint.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REFRESHTHRESHOLDSECONDSPERCENTAGE)){
				continue;
			}
			
			CIM_SecurityAssociationEndpoint.CIM_PropertyList.add(CIM_ProtocolEndpoint.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_ProtocolEndpoint.Java_Package_List.size(); i++) {
			if (((String)CIM_ProtocolEndpoint.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_ProtocolEndpoint.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_SecurityAssociationEndpoint() {

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
	public CIM_SecurityAssociationEndpoint(Vector keyProperties){ 
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
	public CIM_SecurityAssociationEndpoint(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_SecurityAssociationEndpoint)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_SecurityAssociationEndpoint)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_SecurityAssociationEndpoint)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_SecurityAssociationEndpoint)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_SecurityAssociationEndpoint)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_SecurityAssociationEndpoint)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_SecurityAssociationEndpoint)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_SecurityAssociationEndpoint)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_SecurityAssociationEndpoint)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_SecurityAssociationEndpoint)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_FilterList_CIM_FilterOfSecurityAssociations(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_FILTEROFSECURITYASSOCIATION, 
					CIM_FilterList.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_SecurityAssociationEndpoint.Java_Package_List.size(); i++) {
						if (!((String)(CIM_SecurityAssociationEndpoint.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_SecurityAssociationEndpoint.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_SecurityAssociationEndpoint.Java_Package_List.setElementAt((String)(CIM_SecurityAssociationEndpoint.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_SecurityAssociationEndpoint.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_FilterList(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_FilterList(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_FilterList(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_FilterList_CIM_FilterOfSecurityAssociation_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_FILTEROFSECURITYASSOCIATION, 
					CIM_FilterList.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_FilterList.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_IPsecSAEndpoint_CIM_Phase1SAUsedForPhase2s(CIMClient cimClient,
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
					CIM_IPsecSAEndpoint.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_SecurityAssociationEndpoint.Java_Package_List.size(); i++) {
						if (!((String)(CIM_SecurityAssociationEndpoint.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_SecurityAssociationEndpoint.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_SecurityAssociationEndpoint.Java_Package_List.setElementAt((String)(CIM_SecurityAssociationEndpoint.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_SecurityAssociationEndpoint.Java_Package_List.get(i)) + cimClassName;

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

	public ArrayList getAssociated_CIM_IPsecSAEndpoint_CIM_Phase1SAUsedForPhase2_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_PHASE1SAUSEDFORPHASE2, 
					CIM_IPsecSAEndpoint.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent"); //$NON-NLS-1$
		
		
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

	public ArrayList getAssociated_CIM_SARule_CIM_RuleThatGeneratedSAs(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_RULETHATGENERATEDSA, 
					CIM_SARule.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_SecurityAssociationEndpoint.Java_Package_List.size(); i++) {
						if (!((String)(CIM_SecurityAssociationEndpoint.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_SecurityAssociationEndpoint.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_SecurityAssociationEndpoint.Java_Package_List.setElementAt((String)(CIM_SecurityAssociationEndpoint.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_SecurityAssociationEndpoint.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_SARule(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_SARule(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_SARule(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_SARule_CIM_RuleThatGeneratedSA_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_RULETHATGENERATEDSA, 
					CIM_SARule.CIM_CLASS_NAME, 
					"Dependent", //$NON-NLS-1$
					"Antecedent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_SARule.CIM_CLASS_NAME)) {
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
	
	// Attribute IdleDurationSeconds
	
	public UnsignedInt64 get_IdleDurationSeconds() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SecurityAssociationEndpoint.CIM_PROPERTY_IDLEDURATIONSECONDS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_IDLEDURATIONSECONDS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_IDLEDURATIONSECONDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IdleDurationSeconds(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SecurityAssociationEndpoint.CIM_PROPERTY_IDLEDURATIONSECONDS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_IDLEDURATIONSECONDS + " could not be found");
    		
		} else if (!CIM_SecurityAssociationEndpointHelper.isValid_IdleDurationSeconds(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_IDLEDURATIONSECONDS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_IDLEDURATIONSECONDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute InstallDate
	
	public Calendar get_InstallDate() {

		CIMProperty property = this.cimInstance.getProperty(CIM_SecurityAssociationEndpoint.CIM_PROPERTY_INSTALLDATE);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_INSTALLDATE + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_INSTALLDATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_InstallDate(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SecurityAssociationEndpoint.CIM_PROPERTY_INSTALLDATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_INSTALLDATE + " could not be found");
    		
		} else if (!CIM_SecurityAssociationEndpointHelper.isValid_InstallDate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_INSTALLDATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_INSTALLDATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute LifetimeKilobytes
	
	public UnsignedInt64 get_LifetimeKilobytes() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SecurityAssociationEndpoint.CIM_PROPERTY_LIFETIMEKILOBYTES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_LIFETIMEKILOBYTES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_LIFETIMEKILOBYTES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LifetimeKilobytes(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SecurityAssociationEndpoint.CIM_PROPERTY_LIFETIMEKILOBYTES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_LIFETIMEKILOBYTES + " could not be found");
    		
		} else if (!CIM_SecurityAssociationEndpointHelper.isValid_LifetimeKilobytes(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_LIFETIMEKILOBYTES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_LIFETIMEKILOBYTES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LifetimeSeconds
	
	public UnsignedInt64 get_LifetimeSeconds() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SecurityAssociationEndpoint.CIM_PROPERTY_LIFETIMESECONDS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_LIFETIMESECONDS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_LIFETIMESECONDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LifetimeSeconds(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SecurityAssociationEndpoint.CIM_PROPERTY_LIFETIMESECONDS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_LIFETIMESECONDS + " could not be found");
    		
		} else if (!CIM_SecurityAssociationEndpointHelper.isValid_LifetimeSeconds(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_LIFETIMESECONDS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_LIFETIMESECONDS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PacketLoggingActive
	
	public Boolean get_PacketLoggingActive() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SecurityAssociationEndpoint.CIM_PROPERTY_PACKETLOGGINGACTIVE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_PACKETLOGGINGACTIVE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_PACKETLOGGINGACTIVE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PacketLoggingActive(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SecurityAssociationEndpoint.CIM_PROPERTY_PACKETLOGGINGACTIVE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_PACKETLOGGINGACTIVE + " could not be found");
    		
		} else if (!CIM_SecurityAssociationEndpointHelper.isValid_PacketLoggingActive(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_PACKETLOGGINGACTIVE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_PACKETLOGGINGACTIVE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RefreshThresholdKbytesPercentage
	
	public UnsignedInt8 get_RefreshThresholdKbytesPercentage() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SecurityAssociationEndpoint.CIM_PROPERTY_REFRESHTHRESHOLDKBYTESPERCENTAGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_REFRESHTHRESHOLDKBYTESPERCENTAGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_REFRESHTHRESHOLDKBYTESPERCENTAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RefreshThresholdKbytesPercentage(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SecurityAssociationEndpoint.CIM_PROPERTY_REFRESHTHRESHOLDKBYTESPERCENTAGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_REFRESHTHRESHOLDKBYTESPERCENTAGE + " could not be found");
    		
		} else if (!CIM_SecurityAssociationEndpointHelper.isValid_RefreshThresholdKbytesPercentage(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_REFRESHTHRESHOLDKBYTESPERCENTAGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_REFRESHTHRESHOLDKBYTESPERCENTAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RefreshThresholdSecondsPercentage
	
	public UnsignedInt8 get_RefreshThresholdSecondsPercentage() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SecurityAssociationEndpoint.CIM_PROPERTY_REFRESHTHRESHOLDSECONDSPERCENTAGE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_REFRESHTHRESHOLDSECONDSPERCENTAGE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_REFRESHTHRESHOLDSECONDSPERCENTAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RefreshThresholdSecondsPercentage(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_SecurityAssociationEndpoint.CIM_PROPERTY_REFRESHTHRESHOLDSECONDSPERCENTAGE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_REFRESHTHRESHOLDSECONDSPERCENTAGE + " could not be found");
    		
		} else if (!CIM_SecurityAssociationEndpointHelper.isValid_RefreshThresholdSecondsPercentage(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_REFRESHTHRESHOLDSECONDSPERCENTAGE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_SecurityAssociationEndpoint.CIM_PROPERTY_REFRESHTHRESHOLDSECONDSPERCENTAGE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
