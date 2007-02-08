/** 
 * CIM_IPRouteHelper.java
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
 * Description: 
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Enumeration;


import java.util.Vector;
import java.lang.reflect.Constructor;

import org.sblim.wbem.cim.*;
import org.sblim.wbem.client.*;

public final class CIM_IPRouteHelper {

	public final static String CIM_CLASS_NAME = "CIM_IPRoute";
	
	/**
	*	The method enumerates the instance names of a given CIM client with the same class name
	*/	
	public final static ArrayList enumerateInstanceNames(CIMClient cimClient, boolean deep){
	
		ArrayList cimInstanceNamesList = new ArrayList(); 
	
		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
			
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.enumerateInstanceNames(new CIMObjectPath(CIM_CLASS_NAME));

			CIMObjectPath cimObjectPath = null;
		
			while (enumeration != null && enumeration.hasMoreElements()) {
				cimObjectPath = (CIMObjectPath) enumeration.nextElement();
	           
				if (deep || CIM_CLASS_NAME.equals(cimObjectPath.getObjectName())) {
					cimInstanceNamesList.add(cimObjectPath);
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
			
		return cimInstanceNamesList;
	}


	/**
	*	The method enumerates the instances of a given CIM client
	*/		
	public final static ArrayList enumerateInstances(CIMClient cimClient, boolean deep){
	
		ArrayList resultArrayList = new ArrayList();
	
		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
			
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.enumerateInstances(new CIMObjectPath(CIM_CLASS_NAME), deep);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					if (!deep && cimInstance.getClassName().equals(CIM_CLASS_NAME)) {
						resultArrayList.add(new CIM_IPRoute(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i=0; clazz==null && i<CIM_IPRoute.Java_Package_List.size(); i++) {
						if (!((String)(CIM_IPRoute.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_IPRoute.Java_Package_List.get(i))).endsWith(".")) {
							CIM_IPRoute.Java_Package_List.setElementAt((String)(CIM_IPRoute.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_IPRoute.Java_Package_List.get(i)) + cimClassName;
					
						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of class CIM_IPRoute.");
						resultArrayList.add(new CIM_IPRoute(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					Class[] constParams = new Class[2];
					constParams[0] = CIMObjectPath.class;
					constParams[1] = CIMInstance.class;
					Constructor cons = null;
					try {
						cons = clazz.getConstructor(constParams);
					
					} catch(NoSuchMethodException e) {
						System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of class CIM_IPRoute.");
						resultArrayList.add(new CIM_IPRoute(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of class CIM_IPRoute.");
						resultArrayList.add(new CIM_IPRoute(cimInstance.getObjectPath(), cimInstance));
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
	
	
	/**
	*	The method returns an instance of a given CIM client at a given path
	*/	
	public final static CIM_IPRoute getInstance(CIMClient cimClient, Vector keyProperties) {
		
		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
			
		} else if(keyProperties == null) {
			throw new InvalidParameterException("The dataInstance parameter does not contain a valid reference.");
			
		}
		
		return CIM_IPRouteHelper.getInstance(cimClient, new CIM_IPRoute(keyProperties));
	}
	
	
	/**
	*	The method returns an instance of a given CIM client at a given path
	*/	
	public final static CIM_IPRoute getInstance(CIMClient cimClient, CIM_IPRoute dataInstance) {
		
		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
			
		} else if(dataInstance == null) {
			throw new InvalidParameterException("The dataInstance parameter does not contain a valid reference.");
			
		}
		
		return CIM_IPRouteHelper.getInstance(cimClient, dataInstance.getCimObjectPath());
	}
	
	
	/**
	*	The method returns an instance of a given CIM client at a given path
	*/	
	public final static CIM_IPRoute getInstance(CIMClient cimClient, CIMObjectPath cimObjectPath) {
	
		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
	
		} else if (cimObjectPath == null) {
			throw new InvalidParameterException("The cimObjectPath parameter does not contain a valid reference.");
		}
		
		CIMInstance cimInstance = cimClient.getInstance(cimObjectPath);
		
		CIM_IPRoute dataInstance = null;
		try {
			dataInstance = new CIM_IPRoute(cimObjectPath, cimInstance);
		} catch (Exception e) {
			// This error should normally not happen, because the instance was received by the server with a valid CIMObjectPath
			System.err.println("The received CIMInstance object was not valid.\nReceived values are:\n" + cimObjectPath + "\n" + cimInstance);
			dataInstance = null;
		}
		
		return dataInstance;
	}
	
		
	/**
	*	no description
	*/	
	public static boolean testClientServerIntegrity(CIMClient cimClient, Vector missedProperties, Vector unrecognizedProperties) {
		boolean result = true;
		
		if (missedProperties == null) {
			missedProperties = new Vector();
		} else {
			missedProperties.removeAllElements();
		}
		
		if (unrecognizedProperties == null) {
			unrecognizedProperties = new Vector();
		} else {
			unrecognizedProperties.removeAllElements();
		}
			
		CIMClass cimClass = cimClient.getClass(new CIMObjectPath(CIM_CLASS_NAME), false, true, true);
		CIMInstance serverCimInstance = cimClass.newInstance();
		
		Vector serverPropertyList = serverCimInstance.getAllProperties();
		Vector serverPropertyNameList = new Vector();
		
		for (int i = 0; i < serverPropertyList.size(); i++) {
			if ((CIMProperty)serverPropertyList.get(i) == null ||
					!CIM_IPRoute.CIM_PropertyNameList.contains(((CIMProperty)serverPropertyList.get(i)).getName())) {
				missedProperties.add(((CIMProperty)serverPropertyList.get(i))!=null?((CIMProperty)serverPropertyList.get(i)).getName():"");
				result = false;
			}
			serverPropertyNameList.add(((CIMProperty)serverPropertyList.get(i)).getName());
		}
			
		for (int i = 0; i < CIM_IPRoute.CIM_PropertyNameList.size(); i++) {
				if (!serverPropertyNameList.contains(CIM_IPRoute.CIM_PropertyNameList.get(i))) {
				unrecognizedProperties.add(CIM_IPRoute.CIM_PropertyNameList.get(i));
				result = false;
			}
		}
		return result;
	}
	
	public static boolean isValid_AddressType(UnsignedInt16 AddressType) {
		return true;
	}

	public static boolean isValid_CreationClassName(String CreationClassName) {
		return true;
	}

	public static boolean isValid_DestinationAddress(String DestinationAddress) {
		return true;
	}

	public static boolean isValid_DestinationMask(String DestinationMask) {
		return true;
	}

	public static boolean isValid_IPDestinationAddress(String IPDestinationAddress) {
		return true;
	}

	public static boolean isValid_IPDestinationMask(String IPDestinationMask) {
		return true;
	}

	public static boolean isValid_ServiceCreationClassName(String ServiceCreationClassName) {
		return true;
	}

	public static boolean isValid_ServiceName(String ServiceName) {
		return true;
	}

	public static boolean isValid_SystemCreationClassName(String SystemCreationClassName) {
		return true;
	}

	public static boolean isValid_SystemName(String SystemName) {
		return true;
	}

}
