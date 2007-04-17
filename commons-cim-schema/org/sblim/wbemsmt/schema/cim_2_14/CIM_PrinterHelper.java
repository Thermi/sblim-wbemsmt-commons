/** 
 * CIM_PrinterHelper.java
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

package org.sblim.wbemsmt.schema.cim_2_14;

import java.lang.reflect.Constructor;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Vector;

import org.sblim.wbem.cim.CIMClass;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.cim.UnsignedInt32;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.CIMEnumeration;

public final class CIM_PrinterHelper {

	public final static String CIM_CLASS_NAME = "CIM_Printer";
	
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
						resultArrayList.add(new CIM_Printer(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i=0; clazz==null && i<CIM_Printer.Java_Package_List.size(); i++) {
						if (!((String)(CIM_Printer.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_Printer.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_Printer.Java_Package_List.setElementAt((String)(CIM_Printer.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_Printer.Java_Package_List.get(i)) + cimClassName;
					
						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of class CIM_Printer.");
						resultArrayList.add(new CIM_Printer(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					Class[] constParams = new Class[2];
					constParams[0] = CIMObjectPath.class;
					constParams[1] = CIMInstance.class;
					Constructor cons = null;
					try {
						cons = clazz.getConstructor(constParams);
					
					} catch(NoSuchMethodException e) {
						System.err.println("The required constructor of class " + cimInstance.getClassName() + " could not be found. Constructing instance of class CIM_Printer.");
						resultArrayList.add(new CIM_Printer(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of class CIM_Printer.");
						resultArrayList.add(new CIM_Printer(cimInstance.getObjectPath(), cimInstance));
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
	public final static CIM_Printer getInstance(CIMClient cimClient, Vector keyProperties) {
		
		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
			
		} else if(keyProperties == null) {
			throw new InvalidParameterException("The dataInstance parameter does not contain a valid reference.");
			
		}
		
		return CIM_PrinterHelper.getInstance(cimClient, new CIM_Printer(keyProperties));
	}
	
	
	/**
	*	The method returns an instance of a given CIM client at a given path
	*/	
	public final static CIM_Printer getInstance(CIMClient cimClient, CIM_Printer dataInstance) {
		
		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
			
		} else if(dataInstance == null) {
			throw new InvalidParameterException("The dataInstance parameter does not contain a valid reference.");
			
		}
		
		return CIM_PrinterHelper.getInstance(cimClient, dataInstance.getCimObjectPath());
	}
	
	
	/**
	*	The method returns an instance of a given CIM client at a given path
	*/	
	public final static CIM_Printer getInstance(CIMClient cimClient, CIMObjectPath cimObjectPath) {
	
		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
	
		} else if (cimObjectPath == null) {
			throw new InvalidParameterException("The cimObjectPath parameter does not contain a valid reference.");
		}
		
		CIMInstance cimInstance = cimClient.getInstance(cimObjectPath);
		
		CIM_Printer dataInstance = null;
		try {
			dataInstance = new CIM_Printer(cimObjectPath, cimInstance);
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
	public final static CIM_Printer createInstance(CIMClient cimClient, CIM_Printer dataInstance, boolean notifyDifferencies){ 
	
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
		
		CIM_Printer newDataInstance = null;
		try {
			newDataInstance = CIM_PrinterHelper.getInstance(cimClient, cimObjectPath);
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
	public final static CIM_Printer modifyInstance(CIMClient cimClient, CIM_Printer dataInstance, boolean notifyDifferencies){ 
	
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
			dataInstance = CIM_PrinterHelper.getInstance(cimClient, dataInstance.getCimObjectPath());
		}
		
		return dataInstance;
	}
	
	
	/**
	*	The method deletes a class instance in a given CIM client
	*/	
	public final static void deleteInstance(CIMClient cimClient, CIM_Printer dataInstance){
	
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
	private final static CIMInstance copyDataToServerInstance(CIMClient cimClient, CIM_Printer dataInstance, boolean notifyDifferencies) {
		CIMClass cimClass = cimClient.getClass(new CIMObjectPath(CIM_CLASS_NAME), false, true, true);
		CIMInstance serverCimInstance = cimClass.newInstance();
		CIMInstance clientCimInstance = dataInstance.getCimInstance();
	
		Vector serverPropertyListVector = serverCimInstance.getAllProperties();
			
		for (int i = 0; i < serverPropertyListVector.size(); i++) {
			if ((CIMProperty)serverPropertyListVector.get(i) != null && 
					CIM_Printer.CIM_PropertyNameList.contains(((CIMProperty)serverPropertyListVector.get(i)).getName())) {
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
					!CIM_Printer.CIM_PropertyNameList.contains(((CIMProperty)serverPropertyList.get(i)).getName())) {
				missedProperties.add(((CIMProperty)serverPropertyList.get(i))!=null?((CIMProperty)serverPropertyList.get(i)).getName():"");
				result = false;
			}
			serverPropertyNameList.add(((CIMProperty)serverPropertyList.get(i)).getName());
		}
			
		for (int i = 0; i < CIM_Printer.CIM_PropertyNameList.size(); i++) {
				if (!serverPropertyNameList.contains(CIM_Printer.CIM_PropertyNameList.get(i))) {
				unrecognizedProperties.add(CIM_Printer.CIM_PropertyNameList.get(i));
				result = false;
			}
		}
		return result;
	}
	
	public static boolean isValid_AvailableJobSheets(String[] AvailableJobSheets) {
		return true;
	}

	public static boolean isValid_Capabilities(UnsignedInt16[] Capabilities) {
		return true;
	}

	public static boolean isValid_CapabilityDescriptions(String[] CapabilityDescriptions) {
		return true;
	}

	public static boolean isValid_CharSetsSupported(String[] CharSetsSupported) {
		return true;
	}

	public static boolean isValid_CurrentCapabilities(UnsignedInt16[] CurrentCapabilities) {
		return true;
	}

	public static boolean isValid_CurrentCharSet(String CurrentCharSet) {
		return true;
	}

	public static boolean isValid_CurrentLanguage(UnsignedInt16 CurrentLanguage) {
		return true;
	}

	public static boolean isValid_CurrentMimeType(String CurrentMimeType) {
		return true;
	}

	public static boolean isValid_CurrentNaturalLanguage(String CurrentNaturalLanguage) {
		return true;
	}

	public static boolean isValid_CurrentPaperType(String CurrentPaperType) {
		return true;
	}

	public static boolean isValid_DefaultCapabilities(UnsignedInt16[] DefaultCapabilities) {
		return true;
	}

	public static boolean isValid_DefaultCopies(UnsignedInt32 DefaultCopies) {
		return true;
	}

	public static boolean isValid_DefaultLanguage(UnsignedInt16 DefaultLanguage) {
		return true;
	}

	public static boolean isValid_DefaultMimeType(String DefaultMimeType) {
		return true;
	}

	public static boolean isValid_DefaultNumberUp(UnsignedInt32 DefaultNumberUp) {
		return true;
	}

	public static boolean isValid_DefaultPaperType(String DefaultPaperType) {
		return true;
	}

	public static boolean isValid_DetectedErrorState(UnsignedInt16 DetectedErrorState) {
		return true;
	}

	public static boolean isValid_ErrorInformation(String[] ErrorInformation) {
		return true;
	}

	public static boolean isValid_HorizontalResolution(UnsignedInt32 HorizontalResolution) {
		return true;
	}

	public static boolean isValid_JobCountSinceLastReset(UnsignedInt32 JobCountSinceLastReset) {
		return true;
	}

	public static boolean isValid_LanguagesSupported(UnsignedInt16[] LanguagesSupported) {
		return true;
	}

	public static boolean isValid_MarkingTechnology(UnsignedInt16 MarkingTechnology) {
		return true;
	}

	public static boolean isValid_MaxCopies(UnsignedInt32 MaxCopies) {
		return true;
	}

	public static boolean isValid_MaxNumberUp(UnsignedInt32 MaxNumberUp) {
		return true;
	}

	public static boolean isValid_MaxSizeSupported(UnsignedInt32 MaxSizeSupported) {
		return true;
	}

	public static boolean isValid_MimeTypesSupported(String[] MimeTypesSupported) {
		return true;
	}

	public static boolean isValid_NaturalLanguagesSupported(String[] NaturalLanguagesSupported) {
		return true;
	}

	public static boolean isValid_PaperSizesSupported(UnsignedInt16[] PaperSizesSupported) {
		return true;
	}

	public static boolean isValid_PaperTypesAvailable(String[] PaperTypesAvailable) {
		return true;
	}

	public static boolean isValid_PrinterStatus(UnsignedInt16 PrinterStatus) {
		return true;
	}

	public static boolean isValid_TimeOfLastReset(Calendar TimeOfLastReset) {
		return true;
	}

	public static boolean isValid_VerticalResolution(UnsignedInt32 VerticalResolution) {
		return true;
	}

}