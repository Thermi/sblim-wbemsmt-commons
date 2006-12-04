/** 
 * CIM_CallBasedModemHelper.java
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


import java.util.Calendar;
import java.util.Vector;
import java.lang.reflect.Constructor;

import org.sblim.wbem.cim.*;
import org.sblim.wbem.client.*;

public final class CIM_CallBasedModemHelper {

	public final static String CIM_CLASS_NAME = "CIM_CallBasedModem";
	
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
						resultArrayList.add(new CIM_CallBasedModem(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i=0; clazz==null && i<CIM_CallBasedModem.Java_Package_List.size(); i++) {
						if (!((String)(CIM_CallBasedModem.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_CallBasedModem.Java_Package_List.get(i))).endsWith(".")) {
							CIM_CallBasedModem.Java_Package_List.setElementAt((String)(CIM_CallBasedModem.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_CallBasedModem.Java_Package_List.get(i)) + cimClassName;
					
						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of class CIM_CallBasedModem.");
						resultArrayList.add(new CIM_CallBasedModem(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					Class[] constParams = new Class[2];
					constParams[0] = CIMObjectPath.class;
					constParams[1] = CIMInstance.class;
					Constructor cons = null;
					try {
						cons = clazz.getConstructor(constParams);
					
					} catch(NoSuchMethodException e) {
						System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of class CIM_CallBasedModem.");
						resultArrayList.add(new CIM_CallBasedModem(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of class CIM_CallBasedModem.");
						resultArrayList.add(new CIM_CallBasedModem(cimInstance.getObjectPath(), cimInstance));
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
	public final static CIM_CallBasedModem getInstance(CIMClient cimClient, Vector keyProperties) {
		
		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
			
		} else if(keyProperties == null) {
			throw new InvalidParameterException("The dataInstance parameter does not contain a valid reference.");
			
		}
		
		return CIM_CallBasedModemHelper.getInstance(cimClient, new CIM_CallBasedModem(keyProperties));
	}
	
	
	/**
	*	The method returns an instance of a given CIM client at a given path
	*/	
	public final static CIM_CallBasedModem getInstance(CIMClient cimClient, CIM_CallBasedModem dataInstance) {
		
		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
			
		} else if(dataInstance == null) {
			throw new InvalidParameterException("The dataInstance parameter does not contain a valid reference.");
			
		}
		
		return CIM_CallBasedModemHelper.getInstance(cimClient, dataInstance.getCimObjectPath());
	}
	
	
	/**
	*	The method returns an instance of a given CIM client at a given path
	*/	
	public final static CIM_CallBasedModem getInstance(CIMClient cimClient, CIMObjectPath cimObjectPath) {
	
		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
	
		} else if (cimObjectPath == null) {
			throw new InvalidParameterException("The cimObjectPath parameter does not contain a valid reference.");
		}
		
		CIMInstance cimInstance = cimClient.getInstance(cimObjectPath);
		
		CIM_CallBasedModem dataInstance = null;
		try {
			dataInstance = new CIM_CallBasedModem(cimObjectPath, cimInstance);
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
					!CIM_CallBasedModem.CIM_PropertyNameList.contains(((CIMProperty)serverPropertyList.get(i)).getName())) {
				missedProperties.add(((CIMProperty)serverPropertyList.get(i))!=null?((CIMProperty)serverPropertyList.get(i)).getName():"");
				result = false;
			}
			serverPropertyNameList.add(((CIMProperty)serverPropertyList.get(i)).getName());
		}
			
		for (int i = 0; i < CIM_CallBasedModem.CIM_PropertyNameList.size(); i++) {
				if (!serverPropertyNameList.contains(CIM_CallBasedModem.CIM_PropertyNameList.get(i))) {
				unrecognizedProperties.add(CIM_CallBasedModem.CIM_PropertyNameList.get(i));
				result = false;
			}
		}
		return result;
	}
	
	public static boolean isValid_BlockErrors(UnsignedInt32 BlockErrors) {
		return true;
	}

	public static boolean isValid_BlocksReceived(UnsignedInt32 BlocksReceived) {
		return true;
	}

	public static boolean isValid_BlocksResent(UnsignedInt32 BlocksResent) {
		return true;
	}

	public static boolean isValid_BlocksSent(UnsignedInt32 BlocksSent) {
		return true;
	}

	public static boolean isValid_CallLength(Calendar CallLength) {
		return true;
	}

	public static boolean isValid_CallSpeed(UnsignedInt32 CallSpeed) {
		return true;
	}

	public static boolean isValid_CallStatus(UnsignedInt16 CallStatus) {
		return true;
	}

	public static boolean isValid_CharsLost(UnsignedInt32 CharsLost) {
		return true;
	}

	public static boolean isValid_CharsReceived(UnsignedInt32 CharsReceived) {
		return true;
	}

	public static boolean isValid_CharsSent(UnsignedInt32 CharsSent) {
		return true;
	}

	public static boolean isValid_CompressionInfo(UnsignedInt16 CompressionInfo) {
		return true;
	}

	public static boolean isValid_CompressionSupported(UnsignedInt16[] CompressionSupported) {
		return true;
	}

	public static boolean isValid_ErrorControlInfo(UnsignedInt16 ErrorControlInfo) {
		return true;
	}

	public static boolean isValid_ErrorControlSupported(UnsignedInt16[] ErrorControlSupported) {
		return true;
	}

	public static boolean isValid_FallbackEnabled(Boolean FallbackEnabled) {
		return true;
	}

	public static boolean isValid_ModulationScheme(UnsignedInt16 ModulationScheme) {
		return true;
	}

	public static boolean isValid_ModulationSupported(UnsignedInt16[] ModulationSupported) {
		return true;
	}

	public static boolean isValid_NumberDialed(String NumberDialed) {
		return true;
	}

	public static boolean isValid_OtherCompressionDescription(String OtherCompressionDescription) {
		return true;
	}

	public static boolean isValid_OtherCompressionInfoDescription(String OtherCompressionInfoDescription) {
		return true;
	}

	public static boolean isValid_OtherErrorControlDescription(String OtherErrorControlDescription) {
		return true;
	}

	public static boolean isValid_OtherErrorControlInfoDescription(String OtherErrorControlInfoDescription) {
		return true;
	}

	public static boolean isValid_OtherModulationDescription(String OtherModulationDescription) {
		return true;
	}

	public static boolean isValid_OtherSchemeDescription(String OtherSchemeDescription) {
		return true;
	}

	public static boolean isValid_TimeOfLastReset(Calendar TimeOfLastReset) {
		return true;
	}

}
