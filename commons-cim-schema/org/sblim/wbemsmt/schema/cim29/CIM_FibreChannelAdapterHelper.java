/** 
 * CIM_FibreChannelAdapterHelper.java
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

public final class CIM_FibreChannelAdapterHelper {

	public final static String CIM_CLASS_NAME = "CIM_FibreChannelAdapter";
	
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
						resultArrayList.add(new CIM_FibreChannelAdapter(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
					Class clazz = CIM_FibreChannelAdapterHelper.findClass(cimClient, cimInstance);
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of class CIM_FibreChannelAdapter.");
						resultArrayList.add(new CIM_FibreChannelAdapter(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					Class[] constParams = new Class[2];
					constParams[0] = CIMObjectPath.class;
					constParams[1] = CIMInstance.class;
					Constructor cons = null;
					try {
						cons = clazz.getConstructor(constParams);
					
					} catch(NoSuchMethodException e) {
						System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of class CIM_FibreChannelAdapter.");
						resultArrayList.add(new CIM_FibreChannelAdapter(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of class CIM_FibreChannelAdapter.");
						resultArrayList.add(new CIM_FibreChannelAdapter(cimInstance.getObjectPath(), cimInstance));
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
	public final static CIM_FibreChannelAdapter getInstance(CIMClient cimClient, Vector keyProperties) {
		
		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
			
		} else if(keyProperties == null) {
			throw new InvalidParameterException("The dataInstance parameter does not contain a valid reference.");
			
		}
		
		return CIM_FibreChannelAdapterHelper.getInstance(cimClient, new CIM_FibreChannelAdapter(keyProperties));
	}
	
	
	/**
	*	The method returns an instance of a given CIM client at a given path
	*/	
	public final static CIM_FibreChannelAdapter getInstance(CIMClient cimClient, CIM_FibreChannelAdapter dataInstance) {
		
		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
			
		} else if(dataInstance == null) {
			throw new InvalidParameterException("The dataInstance parameter does not contain a valid reference.");
			
		}
		
		return CIM_FibreChannelAdapterHelper.getInstance(cimClient, dataInstance.getCimObjectPath());
	}
	
	
	/**
	*	The method returns an instance of a given CIM client at a given path
	*/	
	public final static CIM_FibreChannelAdapter getInstance(CIMClient cimClient, CIMObjectPath cimObjectPath) {
	
		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
	
		} else if (cimObjectPath == null) {
			throw new InvalidParameterException("The cimObjectPath parameter does not contain a valid reference.");
		}
		
		CIMInstance cimInstance = cimClient.getInstance(cimObjectPath);
		
		CIM_FibreChannelAdapter dataInstance = null;
		try {
			dataInstance = new CIM_FibreChannelAdapter(cimObjectPath, cimInstance);
		} catch (Exception e) {
			// This error should normally not happen, because the instance was received by the server with a valid CIMObjectPath
			System.err.println("The received CIMInstance object was not valid.\nReceived values are:\n" + cimObjectPath + "\n" + cimInstance);
			dataInstance = null;
		}
		
		return dataInstance;
	}
	
		/**
	 * find a FCO class which can represent the given cimInstance
	 * Begins at the lowest classes in the cim class hierarchy and try to create a FCO with
	 * all the defined packages. If the Class cannot be created go one step up in the hierarchy
	 * and try again and again and again...
	 * @param cimClient
	 * @param cimInstance
	 * @return The class for the FCO or null if a class was NOT found to create a FCO from
	 * @see #Java_Package_List
	 */
	public static Class findClass(CIMClient cimClient, CIMInstance cimInstance) {

		String[] packageList = CIM_FibreChannelAdapter.getPackages();
	
		String className = cimInstance.getClassName();
		Class clazz = findClassInPackages(className, packageList);

		if (clazz == null)
		{
			//try going up the class hierarchy and try to construct the next possible class
			CIMClass cimClass = cimClient.getClass(cimInstance.getObjectPath());
			while (clazz == null && cimClass != null && cimClass.getSuperClass() != null)
			{
				clazz = findClassInPackages(cimClass.getSuperClass(), packageList);
				cimClass = cimClient.getClass(new CIMObjectPath(cimClass.getSuperClass()));
			}
		}
		
		return clazz;
	}

	/**
	 * Try to create a class with the given classname and one of the packages
	 * if the first creation is possible the class is returned
	 * @param className
	 * @param packageList
	 * @return the Class or null if no combination between className and one of the Packages was possible
	 */
	private static Class findClassInPackages(String className, String[] packageList) {
		Class clazz = null;
		for (int i = 0; clazz == null && i < packageList.length; i++) {
			String cimClassName = (packageList[i]) + className;
			try {
				clazz = Class.forName(cimClassName);
			} catch(ClassNotFoundException e) {
			}
		}
		return clazz;
	}
	
	
	/**
	*	The method creates a class instance in a given CIM client
	*/	
	public final static CIM_FibreChannelAdapter createInstance(CIMClient cimClient, CIM_FibreChannelAdapter dataInstance, boolean notifyDifferencies){ 
	
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
		
		CIM_FibreChannelAdapter newDataInstance = null;
		try {
			newDataInstance = CIM_FibreChannelAdapterHelper.getInstance(cimClient, cimObjectPath);
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
	public final static CIM_FibreChannelAdapter modifyInstance(CIMClient cimClient, CIM_FibreChannelAdapter dataInstance, boolean notifyDifferencies){ 
	
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
			dataInstance = CIM_FibreChannelAdapterHelper.getInstance(cimClient, dataInstance.getCimObjectPath());
		}
		
		return dataInstance;
	}
	
	
	/**
	*	The method deletes a class instance in a given CIM client
	*/	
	public final static void deleteInstance(CIMClient cimClient, CIM_FibreChannelAdapter dataInstance){
	
		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		
		} else if (dataInstance == null || dataInstance.getCimObjectPath() == null) {
			throw new InvalidParameterException("The dataInstance parameter does not contain a valid reference to the destination object.");
		
		} else if (!dataInstance.isValidCimInstance()) {
			throw new InvalidParameterException("The specified dataInstance does not contain a CIMInstance retrieved from a CIMServer.");
		}
		
		cimClient.deleteInstance(dataInstance.getCimObjectPath());
	}

	
	/**
	*	no description
	*/
	private final static CIMInstance copyDataToServerInstance(CIMClient cimClient, CIM_FibreChannelAdapter dataInstance, boolean notifyDifferencies) {
		CIMClass cimClass = cimClient.getClass(new CIMObjectPath(CIM_CLASS_NAME), false, true, true);
		CIMInstance serverCimInstance = cimClass.newInstance();
		CIMInstance clientCimInstance = dataInstance.getCimInstance();
	
		Vector serverPropertyListVector = serverCimInstance.getAllProperties();
			
		for (int i = 0; i < serverPropertyListVector.size(); i++) {
			if ((CIMProperty)serverPropertyListVector.get(i) != null && 
					CIM_FibreChannelAdapter.CIM_PropertyNameList.contains(((CIMProperty)serverPropertyListVector.get(i)).getName())) {
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
					!CIM_FibreChannelAdapter.CIM_PropertyNameList.contains(((CIMProperty)serverPropertyList.get(i)).getName())) {
				missedProperties.add(((CIMProperty)serverPropertyList.get(i))!=null?((CIMProperty)serverPropertyList.get(i)).getName():"");
				result = false;
			}
			serverPropertyNameList.add(((CIMProperty)serverPropertyList.get(i)).getName());
		}
			
		for (int i = 0; i < CIM_FibreChannelAdapter.CIM_PropertyNameList.size(); i++) {
				if (!serverPropertyNameList.contains(CIM_FibreChannelAdapter.CIM_PropertyNameList.get(i))) {
				unrecognizedProperties.add(CIM_FibreChannelAdapter.CIM_PropertyNameList.get(i));
				result = false;
			}
		}
		return result;
	}
	
	public static boolean isValid_BufferCreditErrors(UnsignedInt64 BufferCreditErrors) {
		return true;
	}

	public static boolean isValid_Capabilities(UnsignedInt16[] Capabilities) {
		return true;
	}

	public static boolean isValid_CapabilityDescriptions(String[] CapabilityDescriptions) {
		return true;
	}

	public static boolean isValid_Class1SequencesSent(UnsignedInt64 Class1SequencesSent) {
		return true;
	}

	public static boolean isValid_Class2DiscardFrames(UnsignedInt64 Class2DiscardFrames) {
		return true;
	}

	public static boolean isValid_Class2FramesReceived(UnsignedInt64 Class2FramesReceived) {
		return true;
	}

	public static boolean isValid_Class2FramesTransmitted(UnsignedInt64 Class2FramesTransmitted) {
		return true;
	}

	public static boolean isValid_Class2OctetsReceived(UnsignedInt64 Class2OctetsReceived) {
		return true;
	}

	public static boolean isValid_Class2OctetsTransmitted(UnsignedInt64 Class2OctetsTransmitted) {
		return true;
	}

	public static boolean isValid_Class2SequencesSent(UnsignedInt64 Class2SequencesSent) {
		return true;
	}

	public static boolean isValid_Class3DiscardFrames(UnsignedInt64 Class3DiscardFrames) {
		return true;
	}

	public static boolean isValid_Class3FramesReceived(UnsignedInt64 Class3FramesReceived) {
		return true;
	}

	public static boolean isValid_Class3FramesTransmitted(UnsignedInt64 Class3FramesTransmitted) {
		return true;
	}

	public static boolean isValid_Class3OctetsReceived(UnsignedInt64 Class3OctetsReceived) {
		return true;
	}

	public static boolean isValid_Class3OctetsTransmitted(UnsignedInt64 Class3OctetsTransmitted) {
		return true;
	}

	public static boolean isValid_Class3SequencesSent(UnsignedInt64 Class3SequencesSent) {
		return true;
	}

	public static boolean isValid_Class4SequencesSent(UnsignedInt64 Class4SequencesSent) {
		return true;
	}

	public static boolean isValid_CurrentFC4Types(UnsignedInt16[] CurrentFC4Types) {
		return true;
	}

	public static boolean isValid_CurrentFC4VendorTypes(UnsignedInt16[] CurrentFC4VendorTypes) {
		return true;
	}

	public static boolean isValid_EndCreditErrors(UnsignedInt64 EndCreditErrors) {
		return true;
	}

	public static boolean isValid_ErrorDetectTimeout(UnsignedInt64 ErrorDetectTimeout) {
		return true;
	}

	public static boolean isValid_FC4TypesSupported(UnsignedInt16[] FC4TypesSupported) {
		return true;
	}

	public static boolean isValid_FC4VendorUniqueTypes(UnsignedInt16[] FC4VendorUniqueTypes) {
		return true;
	}

	public static boolean isValid_FrameTimeouts(UnsignedInt64 FrameTimeouts) {
		return true;
	}

	public static boolean isValid_MaxFrameSize(UnsignedInt64 MaxFrameSize) {
		return true;
	}

	public static boolean isValid_OutOfOrderFramesReceived(UnsignedInt64 OutOfOrderFramesReceived) {
		return true;
	}

	public static boolean isValid_ParityErrors(UnsignedInt64 ParityErrors) {
		return true;
	}

	public static boolean isValid_ReceiveBufferErrors(UnsignedInt64 ReceiveBufferErrors) {
		return true;
	}

	public static boolean isValid_ReceiveEndErrors(UnsignedInt64 ReceiveEndErrors) {
		return true;
	}

	public static boolean isValid_ResourceAllocationTimeout(UnsignedInt64 ResourceAllocationTimeout) {
		return true;
	}

	public static boolean isValid_SupportedCOS(UnsignedInt16[] SupportedCOS) {
		return true;
	}

}
