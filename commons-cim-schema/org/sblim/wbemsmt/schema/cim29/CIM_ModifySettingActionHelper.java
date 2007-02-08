/** 
 * CIM_ModifySettingActionHelper.java
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

public final class CIM_ModifySettingActionHelper {

	public final static String CIM_CLASS_NAME = "CIM_ModifySettingAction";
	
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
						resultArrayList.add(new CIM_ModifySettingAction(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i=0; clazz==null && i<CIM_ModifySettingAction.Java_Package_List.size(); i++) {
						if (!((String)(CIM_ModifySettingAction.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_ModifySettingAction.Java_Package_List.get(i))).endsWith(".")) {
							CIM_ModifySettingAction.Java_Package_List.setElementAt((String)(CIM_ModifySettingAction.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_ModifySettingAction.Java_Package_List.get(i)) + cimClassName;
					
						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of class CIM_ModifySettingAction.");
						resultArrayList.add(new CIM_ModifySettingAction(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					Class[] constParams = new Class[2];
					constParams[0] = CIMObjectPath.class;
					constParams[1] = CIMInstance.class;
					Constructor cons = null;
					try {
						cons = clazz.getConstructor(constParams);
					
					} catch(NoSuchMethodException e) {
						System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of class CIM_ModifySettingAction.");
						resultArrayList.add(new CIM_ModifySettingAction(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of class CIM_ModifySettingAction.");
						resultArrayList.add(new CIM_ModifySettingAction(cimInstance.getObjectPath(), cimInstance));
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
	public final static CIM_ModifySettingAction getInstance(CIMClient cimClient, Vector keyProperties) {
		
		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
			
		} else if(keyProperties == null) {
			throw new InvalidParameterException("The dataInstance parameter does not contain a valid reference.");
			
		}
		
		return CIM_ModifySettingActionHelper.getInstance(cimClient, new CIM_ModifySettingAction(keyProperties));
	}
	
	
	/**
	*	The method returns an instance of a given CIM client at a given path
	*/	
	public final static CIM_ModifySettingAction getInstance(CIMClient cimClient, CIM_ModifySettingAction dataInstance) {
		
		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
			
		} else if(dataInstance == null) {
			throw new InvalidParameterException("The dataInstance parameter does not contain a valid reference.");
			
		}
		
		return CIM_ModifySettingActionHelper.getInstance(cimClient, dataInstance.getCimObjectPath());
	}
	
	
	/**
	*	The method returns an instance of a given CIM client at a given path
	*/	
	public final static CIM_ModifySettingAction getInstance(CIMClient cimClient, CIMObjectPath cimObjectPath) {
	
		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
	
		} else if (cimObjectPath == null) {
			throw new InvalidParameterException("The cimObjectPath parameter does not contain a valid reference.");
		}
		
		CIMInstance cimInstance = cimClient.getInstance(cimObjectPath);
		
		CIM_ModifySettingAction dataInstance = null;
		try {
			dataInstance = new CIM_ModifySettingAction(cimObjectPath, cimInstance);
		} catch (Exception e) {
			// This error should normally not happen, because the instance was received by the server with a valid CIMObjectPath
			System.err.println("The received CIMInstance object was not valid.\nReceived values are:\n" + cimObjectPath + "\n" + cimInstance);
			dataInstance = null;
		}
		
		return dataInstance;
	}
	
	
	/**
	*	The method creates a class instance in a given CIM client
	*/	
	public final static CIM_ModifySettingAction createInstance(CIMClient cimClient, CIM_ModifySettingAction dataInstance, boolean notifyDifferencies){ 
	
		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
	
		} else if (dataInstance == null) {
			throw new InvalidParameterException("The dataInstance parameter does not contain a valid CIMInstance object.");
	
		} else if (!dataInstance.isDataValid(null)) {
			throw new InvalidParameterException("The dataInstance parameter does not contain all required properties.");
	
		} else if (dataInstance.getCimObjectPath() == null) {
			throw new InvalidParameterException("The cimObjectPath parameter does not contain a valid reference.");
		}
	
		CIMInstance serverBasedInstance = copyDataToServerInstance(cimClient, dataInstance, notifyDifferencies);
		CIMObjectPath cimObjectPath = cimClient.createInstance(dataInstance.getCimObjectPath(), serverBasedInstance);
		
		CIM_ModifySettingAction newDataInstance = null;
		try {
			newDataInstance = CIM_ModifySettingActionHelper.getInstance(cimClient, cimObjectPath);
		} catch (Exception e) {
			// This error should normally never happen, except of a server or cimClient problem.
			System.err.println("The new created cimInstance could not retrieved properly from the server.");
			newDataInstance = null;
		}
		
		return newDataInstance;
	}
	
	
	/**
	*	The method modifies a class instance in a given CIM client
	*/	
	public final static CIM_ModifySettingAction modifyInstance(CIMClient cimClient, CIM_ModifySettingAction dataInstance, boolean notifyDifferencies){ 
	
		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		
		} else if (dataInstance == null || dataInstance.getCimObjectPath() == null) {
			throw new InvalidParameterException("The dataInstance parameter does not contain a valid reference to the destination object.");
	
		} else if (dataInstance == null) {
			throw new InvalidParameterException("The dataInstance parameter does not contain a valid CIMInstance object.");
	
		} else if (!dataInstance.isDataValid(null)) {
			throw new InvalidParameterException("The dataInstance parameter does not contain all required properties.");
		
		} else if (!dataInstance.isValidCimInstance()) {
			throw new InvalidParameterException("The specified dataInstance does not contain a CIMInstance retrieved from a CIMServer.");
		}
			
		if (dataInstance.isModified()) {
			CIMInstance serverBasedInstance = copyDataToServerInstance(cimClient, dataInstance, notifyDifferencies);
			cimClient.setInstance(dataInstance.getCimObjectPath(), serverBasedInstance);
			dataInstance = CIM_ModifySettingActionHelper.getInstance(cimClient, dataInstance.getCimObjectPath());
		}
		
		return dataInstance;
	}
	
	
	/**
	*	The method deletes a class instance in a given CIM client
	*/	
	public final static void deleteInstance(CIMClient cimClient, CIM_ModifySettingAction dataInstance){
	
		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		
		} else if (dataInstance == null || dataInstance.getCimObjectPath() == null) {
			throw new InvalidParameterException("The dataInstance parameter does not contain a valid reference to the destination object.");
		
		} else if (!dataInstance.isValidCimInstance()) {
			throw new InvalidParameterException("The specified dataInstance does not contain a CIMInstance retrieved from a CIMServer.");
		}
		
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.referenceNames(dataInstance.getCimObjectPath());
			
			while (enumeration.hasMoreElements()) {
				CIMObjectPath objectPath = (CIMObjectPath)enumeration.nextElement();
				
				cimClient.deleteInstance(objectPath);
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
		
		cimClient.deleteInstance(dataInstance.getCimObjectPath());
	}

	
	/**
	*	no description
	*/
	private final static CIMInstance copyDataToServerInstance(CIMClient cimClient, CIM_ModifySettingAction dataInstance, boolean notifyDifferencies) {
		CIMClass cimClass = cimClient.getClass(new CIMObjectPath(CIM_CLASS_NAME), false, true, true);
		CIMInstance serverCimInstance = cimClass.newInstance();
		CIMInstance clientCimInstance = dataInstance.getCimInstance();
	
		Vector serverPropertyListVector = serverCimInstance.getAllProperties();
			
		for (int i = 0; i < serverPropertyListVector.size(); i++) {
			if ((CIMProperty)serverPropertyListVector.get(i) != null && 
					CIM_ModifySettingAction.CIM_PropertyNameList.contains(((CIMProperty)serverPropertyListVector.get(i)).getName())) {
				CIMProperty orgProperty = clientCimInstance.getProperty(((CIMProperty)serverPropertyListVector.get(i)).getName());
				CIMProperty serverProperty = serverCimInstance.getProperty(((CIMProperty)serverPropertyListVector.get(i)).getName());
				
				if (orgProperty != null && serverProperty != null) {
					serverProperty.setValue(orgProperty.getValue());
					
				} else if (orgProperty == null){
					serverProperty.setValue(null);
					
				} else {
					serverCimInstance.addProperty(new CIMProperty(orgProperty.getName(),orgProperty.getValue()));
				}
			}
		}
			
		Vector missedProperties = new Vector();
		Vector unrecognizedProperties = new Vector();
		
		if (notifyDifferencies) {
			if (testClientServerIntegrity(cimClient, missedProperties, unrecognizedProperties)) {
							
			} else {
				String errorMSG = new String("The following parameter differ between the client and the server side:");
				for (int i = 0; i < missedProperties.size(); i++) {
					errorMSG+=("\nMissed property: " + missedProperties.get(i));
				}
				for (int i = 0; i < unrecognizedProperties.size(); i++) {
					errorMSG+=("\nNot recognized property: " + unrecognizedProperties.get(i));
				}
								
				throw new CIMException(CIMException.CIM_ERR_INVALID_PARAMETER, errorMSG);
			}
		}
		
		return serverCimInstance;
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
					!CIM_ModifySettingAction.CIM_PropertyNameList.contains(((CIMProperty)serverPropertyList.get(i)).getName())) {
				missedProperties.add(((CIMProperty)serverPropertyList.get(i))!=null?((CIMProperty)serverPropertyList.get(i)).getName():"");
				result = false;
			}
			serverPropertyNameList.add(((CIMProperty)serverPropertyList.get(i)).getName());
		}
			
		for (int i = 0; i < CIM_ModifySettingAction.CIM_PropertyNameList.size(); i++) {
				if (!serverPropertyNameList.contains(CIM_ModifySettingAction.CIM_PropertyNameList.get(i))) {
				unrecognizedProperties.add(CIM_ModifySettingAction.CIM_PropertyNameList.get(i));
				result = false;
			}
		}
		return result;
	}
	
	public static boolean isValid_ActionType(UnsignedInt16 ActionType) {
		return true;
	}

	public static boolean isValid_EntryName(String EntryName) {
		return true;
	}

	public static boolean isValid_EntryValue(String EntryValue) {
		return true;
	}

	public static boolean isValid_FileName(String FileName) {
		return true;
	}

	public static boolean isValid_SectionKey(String SectionKey) {
		return true;
	}

}
