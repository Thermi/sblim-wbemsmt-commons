/** 
 * CIM_TokenRingAdapterHelper.java
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

public final class CIM_TokenRingAdapterHelper {

	public final static String CIM_CLASS_NAME = "CIM_TokenRingAdapter";
	
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
						resultArrayList.add(new CIM_TokenRingAdapter(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i=0; clazz==null && i<CIM_TokenRingAdapter.Java_Package_List.size(); i++) {
						if (!((String)(CIM_TokenRingAdapter.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_TokenRingAdapter.Java_Package_List.get(i))).endsWith(".")) {
							CIM_TokenRingAdapter.Java_Package_List.setElementAt((String)(CIM_TokenRingAdapter.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_TokenRingAdapter.Java_Package_List.get(i)) + cimClassName;
					
						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of class CIM_TokenRingAdapter.");
						resultArrayList.add(new CIM_TokenRingAdapter(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					Class[] constParams = new Class[2];
					constParams[0] = CIMObjectPath.class;
					constParams[1] = CIMInstance.class;
					Constructor cons = null;
					try {
						cons = clazz.getConstructor(constParams);
					
					} catch(NoSuchMethodException e) {
						System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of class CIM_TokenRingAdapter.");
						resultArrayList.add(new CIM_TokenRingAdapter(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of class CIM_TokenRingAdapter.");
						resultArrayList.add(new CIM_TokenRingAdapter(cimInstance.getObjectPath(), cimInstance));
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
	public final static CIM_TokenRingAdapter getInstance(CIMClient cimClient, Vector keyProperties) {
		
		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
			
		} else if(keyProperties == null) {
			throw new InvalidParameterException("The dataInstance parameter does not contain a valid reference.");
			
		}
		
		return CIM_TokenRingAdapterHelper.getInstance(cimClient, new CIM_TokenRingAdapter(keyProperties));
	}
	
	
	/**
	*	The method returns an instance of a given CIM client at a given path
	*/	
	public final static CIM_TokenRingAdapter getInstance(CIMClient cimClient, CIM_TokenRingAdapter dataInstance) {
		
		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
			
		} else if(dataInstance == null) {
			throw new InvalidParameterException("The dataInstance parameter does not contain a valid reference.");
			
		}
		
		return CIM_TokenRingAdapterHelper.getInstance(cimClient, dataInstance.getCimObjectPath());
	}
	
	
	/**
	*	The method returns an instance of a given CIM client at a given path
	*/	
	public final static CIM_TokenRingAdapter getInstance(CIMClient cimClient, CIMObjectPath cimObjectPath) {
	
		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
	
		} else if (cimObjectPath == null) {
			throw new InvalidParameterException("The cimObjectPath parameter does not contain a valid reference.");
		}
		
		CIMInstance cimInstance = cimClient.getInstance(cimObjectPath);
		
		CIM_TokenRingAdapter dataInstance = null;
		try {
			dataInstance = new CIM_TokenRingAdapter(cimObjectPath, cimInstance);
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
	public final static CIM_TokenRingAdapter createInstance(CIMClient cimClient, CIM_TokenRingAdapter dataInstance, boolean notifyDifferencies){ 
	
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
		
		CIM_TokenRingAdapter newDataInstance = null;
		try {
			newDataInstance = CIM_TokenRingAdapterHelper.getInstance(cimClient, cimObjectPath);
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
	public final static CIM_TokenRingAdapter modifyInstance(CIMClient cimClient, CIM_TokenRingAdapter dataInstance, boolean notifyDifferencies){ 
	
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
			dataInstance = CIM_TokenRingAdapterHelper.getInstance(cimClient, dataInstance.getCimObjectPath());
		}
		
		return dataInstance;
	}
	
	
	/**
	*	The method deletes a class instance in a given CIM client
	*/	
	public final static void deleteInstance(CIMClient cimClient, CIM_TokenRingAdapter dataInstance){
	
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
	private final static CIMInstance copyDataToServerInstance(CIMClient cimClient, CIM_TokenRingAdapter dataInstance, boolean notifyDifferencies) {
		CIMClass cimClass = cimClient.getClass(new CIMObjectPath(CIM_CLASS_NAME), false, true, true);
		CIMInstance serverCimInstance = cimClass.newInstance();
		CIMInstance clientCimInstance = dataInstance.getCimInstance();
	
		Vector serverPropertyListVector = serverCimInstance.getAllProperties();
			
		for (int i = 0; i < serverPropertyListVector.size(); i++) {
			if ((CIMProperty)serverPropertyListVector.get(i) != null && 
					CIM_TokenRingAdapter.CIM_PropertyNameList.contains(((CIMProperty)serverPropertyListVector.get(i)).getName())) {
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
					!CIM_TokenRingAdapter.CIM_PropertyNameList.contains(((CIMProperty)serverPropertyList.get(i)).getName())) {
				missedProperties.add(((CIMProperty)serverPropertyList.get(i))!=null?((CIMProperty)serverPropertyList.get(i)).getName():"");
				result = false;
			}
			serverPropertyNameList.add(((CIMProperty)serverPropertyList.get(i)).getName());
		}
			
		for (int i = 0; i < CIM_TokenRingAdapter.CIM_PropertyNameList.size(); i++) {
				if (!serverPropertyNameList.contains(CIM_TokenRingAdapter.CIM_PropertyNameList.get(i))) {
				unrecognizedProperties.add(CIM_TokenRingAdapter.CIM_PropertyNameList.get(i));
				result = false;
			}
		}
		return result;
	}
	
	public static boolean isValid_ACErrors(UnsignedInt32 ACErrors) {
		return true;
	}

	public static boolean isValid_AbortTransErrors(UnsignedInt32 AbortTransErrors) {
		return true;
	}

	public static boolean isValid_BurstErrors(UnsignedInt32 BurstErrors) {
		return true;
	}

	public static boolean isValid_Capabilities(UnsignedInt16[] Capabilities) {
		return true;
	}

	public static boolean isValid_CapabilityDescriptions(String[] CapabilityDescriptions) {
		return true;
	}

	public static boolean isValid_EnabledCapabilities(UnsignedInt16[] EnabledCapabilities) {
		return true;
	}

	public static boolean isValid_FrameCopiedErrors(UnsignedInt32 FrameCopiedErrors) {
		return true;
	}

	public static boolean isValid_FrequencyErrors(UnsignedInt32 FrequencyErrors) {
		return true;
	}

	public static boolean isValid_HardErrors(UnsignedInt32 HardErrors) {
		return true;
	}

	public static boolean isValid_InternalErrors(UnsignedInt32 InternalErrors) {
		return true;
	}

	public static boolean isValid_LobeWires(UnsignedInt32 LobeWires) {
		return true;
	}

	public static boolean isValid_LostFrameErrors(UnsignedInt32 LostFrameErrors) {
		return true;
	}

	public static boolean isValid_MaxDataSize(UnsignedInt32 MaxDataSize) {
		return true;
	}

	public static boolean isValid_NetworkAddresses(String[] NetworkAddresses) {
		return true;
	}

	public static boolean isValid_ReceiveCongestions(UnsignedInt32 ReceiveCongestions) {
		return true;
	}

	public static boolean isValid_Recoverys(UnsignedInt32 Recoverys) {
		return true;
	}

	public static boolean isValid_Removes(UnsignedInt32 Removes) {
		return true;
	}

	public static boolean isValid_RingOpenStatus(UnsignedInt16 RingOpenStatus) {
		return true;
	}

	public static boolean isValid_RingSpeed(UnsignedInt16 RingSpeed) {
		return true;
	}

	public static boolean isValid_RingState(UnsignedInt16 RingState) {
		return true;
	}

	public static boolean isValid_RingStatus(UnsignedInt32 RingStatus) {
		return true;
	}

	public static boolean isValid_SignalLossCount(UnsignedInt32 SignalLossCount) {
		return true;
	}

	public static boolean isValid_Singles(UnsignedInt32 Singles) {
		return true;
	}

	public static boolean isValid_SoftErrors(UnsignedInt32 SoftErrors) {
		return true;
	}

	public static boolean isValid_TokenErrors(UnsignedInt32 TokenErrors) {
		return true;
	}

	public static boolean isValid_TransmittedBeacons(UnsignedInt32 TransmittedBeacons) {
		return true;
	}

}
