/** 
 * CIM_USBDevice.java
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
 * Description: The management characterisitics of a USB Device.
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



public class CIM_USBDevice extends CIM_LogicalDevice  {
	
	public final static String CIM_CLASS_NAME = "CIM_USBDevice";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_USBCONNECTION = "CIM_USBConnection";
	
	
	/**
	*	Indicates the USB class code.
	*/
	public final static String CIM_PROPERTY_CLASSCODE = "ClassCode"; //$NON-NLS-1$
	/**
	*	An array of USB 'alternate settings' for each interface in the currently selected configuration (indicated by the CurrentConfigValue property). This array has one entry for each interface in the configuration. If the property, CurrentConfigValue, is zero (indicating the Device is not configured), the array is undefined. To understand how to parse this octet string, refer to the USB Specification.
	*/
	public final static String CIM_PROPERTY_CURRENTALTERNATESETTINGS = "CurrentAlternateSettings"; //$NON-NLS-1$
	/**
	*	Indicates the configuration currently selected for the Device. If this value is zero, the Device is unconfigured.
	*/
	public final static String CIM_PROPERTY_CURRENTCONFIGVALUE = "CurrentConfigValue"; //$NON-NLS-1$
	/**
	*	Number of device configurations that are defined for the Device.
	*/
	public final static String CIM_PROPERTY_NUMBEROFCONFIGS = "NumberOfConfigs"; //$NON-NLS-1$
	/**
	*	Indicates the USB protocol code.
	*/
	public final static String CIM_PROPERTY_PROTOCOLCODE = "ProtocolCode"; //$NON-NLS-1$
	/**
	*	Indicates the USB subclass code.
	*/
	public final static String CIM_PROPERTY_SUBCLASSCODE = "SubclassCode"; //$NON-NLS-1$
	/**
	*	Indicates the latest USB Version supported by the USB Device. The property is expressed as a Binary-Coded Decimal (BCD) where a decimal point is implied between the 2nd and 3rd digits. For example, a value of 0x201 indicates that version 2.01 is supported.
	*/
	public final static String CIM_PROPERTY_USBVERSION = "USBVersion"; //$NON-NLS-1$
	
	
	/**
	*	This method returns the USBDevice Descriptor as specified by the input parameters. Each parameter is briefly described here with more detail in its Qualifier list. RequestType is an input parameter that defines whether the request is for standard, class or vendor-specific information, as well as specifying the recipient. RequestValue is also an input parameter and defines the USB Descriptor Type and Index. RequestIndex is an input parameter which describes the language used to return a string Descriptor. RequestLength is both an input and output parameter. It specifies the length of the Descriptor that should be returned (on input) and what is actually returned in the Buffer parameter (on output). Buffer is an output parameter, containing the Descriptor data. The GetDescriptor method returns an integer value of 0 if the USB Descriptor is successfully returned, 1 if the request is not supported and any other number to indicate an error. 
In a subclass, the set of possible return codes could be specified, using a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' may also be specified in the subclass as a Values array qualifier.
	*/
	public final static String CIM_METHOD_GETDESCRIPTOR = "GetDescriptor";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CLASSCODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTALTERNATESETTINGS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTCONFIGVALUE);
		CIM_PropertyNameList.add(CIM_PROPERTY_NUMBEROFCONFIGS);
		CIM_PropertyNameList.add(CIM_PROPERTY_PROTOCOLCODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SUBCLASSCODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_USBVERSION);
				
		for (int i = 0; i < CIM_LogicalDevice.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CLASSCODE)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTALTERNATESETTINGS)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTCONFIGVALUE)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NUMBEROFCONFIGS)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PROTOCOLCODE)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SUBCLASSCODE)||
				((String)CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_USBVERSION)){
				continue;
			}
			
			CIM_USBDevice.CIM_PropertyNameList.add(CIM_LogicalDevice.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CLASSCODE, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTALTERNATESETTINGS, new CIMValue(null, new CIMDataType(CIMDataType.UINT8_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTCONFIGVALUE, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NUMBEROFCONFIGS, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PROTOCOLCODE, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SUBCLASSCODE, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_USBVERSION, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_LogicalDevice.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CLASSCODE)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTALTERNATESETTINGS)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTCONFIGVALUE)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NUMBEROFCONFIGS)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PROTOCOLCODE)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SUBCLASSCODE)||
				((CIMProperty)CIM_LogicalDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_USBVERSION)){
				continue;
			}
			
			CIM_USBDevice.CIM_PropertyList.add(CIM_LogicalDevice.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_LogicalDevice.Java_Package_List.size(); i++) {
			if (((String)CIM_LogicalDevice.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_LogicalDevice.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_USBDevice() {

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
	public CIM_USBDevice(Vector keyProperties){ 
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
	public CIM_USBDevice(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_USBDevice)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_USBDevice)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_USBDevice)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_USBDevice)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_USBDevice)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_USBDevice)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_USBDevice)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_USBDevice)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_USBDevice)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_USBDevice)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_USBPort_CIM_USBConnections(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_USBCONNECTION, 
					CIM_USBPort.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_USBDevice.Java_Package_List.size(); i++) {
						if (!((String)(CIM_USBDevice.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_USBDevice.Java_Package_List.get(i))).endsWith(".")) {
							CIM_USBDevice.Java_Package_List.setElementAt((String)(CIM_USBDevice.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_USBDevice.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_USBPort(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_USBPort(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_USBPort(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_USBPort_CIM_USBConnection_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_USBCONNECTION, 
					CIM_USBPort.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_USBPort.CIM_CLASS_NAME)) {
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
	
	// Attribute ClassCode
	
	public UnsignedInt8 get_ClassCode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_USBDevice.CIM_PROPERTY_CLASSCODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_USBDevice.CIM_PROPERTY_CLASSCODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_USBDevice.CIM_PROPERTY_CLASSCODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ClassCode(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_USBDevice.CIM_PROPERTY_CLASSCODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_USBDevice.CIM_PROPERTY_CLASSCODE + " could not be found");
    		
		} else if (!CIM_USBDeviceHelper.isValid_ClassCode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_USBDevice.CIM_PROPERTY_CLASSCODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_USBDevice.CIM_PROPERTY_CLASSCODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CurrentAlternateSettings
	
	public UnsignedInt8[] get_CurrentAlternateSettings() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_USBDevice.CIM_PROPERTY_CURRENTALTERNATESETTINGS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_USBDevice.CIM_PROPERTY_CURRENTALTERNATESETTINGS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_USBDevice.CIM_PROPERTY_CURRENTALTERNATESETTINGS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		UnsignedInt8[] resultArray = new UnsignedInt8[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (UnsignedInt8)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_CurrentAlternateSettings(UnsignedInt8[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_USBDevice.CIM_PROPERTY_CURRENTALTERNATESETTINGS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_USBDevice.CIM_PROPERTY_CURRENTALTERNATESETTINGS + " could not be found");
    		
		} else if (!CIM_USBDeviceHelper.isValid_CurrentAlternateSettings(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_USBDevice.CIM_PROPERTY_CURRENTALTERNATESETTINGS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_USBDevice.CIM_PROPERTY_CURRENTALTERNATESETTINGS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CurrentConfigValue
	
	public UnsignedInt8 get_CurrentConfigValue() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_USBDevice.CIM_PROPERTY_CURRENTCONFIGVALUE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_USBDevice.CIM_PROPERTY_CURRENTCONFIGVALUE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_USBDevice.CIM_PROPERTY_CURRENTCONFIGVALUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CurrentConfigValue(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_USBDevice.CIM_PROPERTY_CURRENTCONFIGVALUE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_USBDevice.CIM_PROPERTY_CURRENTCONFIGVALUE + " could not be found");
    		
		} else if (!CIM_USBDeviceHelper.isValid_CurrentConfigValue(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_USBDevice.CIM_PROPERTY_CURRENTCONFIGVALUE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_USBDevice.CIM_PROPERTY_CURRENTCONFIGVALUE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NumberOfConfigs
	
	public UnsignedInt8 get_NumberOfConfigs() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_USBDevice.CIM_PROPERTY_NUMBEROFCONFIGS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_USBDevice.CIM_PROPERTY_NUMBEROFCONFIGS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_USBDevice.CIM_PROPERTY_NUMBEROFCONFIGS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NumberOfConfigs(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_USBDevice.CIM_PROPERTY_NUMBEROFCONFIGS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_USBDevice.CIM_PROPERTY_NUMBEROFCONFIGS + " could not be found");
    		
		} else if (!CIM_USBDeviceHelper.isValid_NumberOfConfigs(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_USBDevice.CIM_PROPERTY_NUMBEROFCONFIGS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_USBDevice.CIM_PROPERTY_NUMBEROFCONFIGS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ProtocolCode
	
	public UnsignedInt8 get_ProtocolCode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_USBDevice.CIM_PROPERTY_PROTOCOLCODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_USBDevice.CIM_PROPERTY_PROTOCOLCODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_USBDevice.CIM_PROPERTY_PROTOCOLCODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ProtocolCode(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_USBDevice.CIM_PROPERTY_PROTOCOLCODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_USBDevice.CIM_PROPERTY_PROTOCOLCODE + " could not be found");
    		
		} else if (!CIM_USBDeviceHelper.isValid_ProtocolCode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_USBDevice.CIM_PROPERTY_PROTOCOLCODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_USBDevice.CIM_PROPERTY_PROTOCOLCODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SubclassCode
	
	public UnsignedInt8 get_SubclassCode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_USBDevice.CIM_PROPERTY_SUBCLASSCODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_USBDevice.CIM_PROPERTY_SUBCLASSCODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_USBDevice.CIM_PROPERTY_SUBCLASSCODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SubclassCode(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_USBDevice.CIM_PROPERTY_SUBCLASSCODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_USBDevice.CIM_PROPERTY_SUBCLASSCODE + " could not be found");
    		
		} else if (!CIM_USBDeviceHelper.isValid_SubclassCode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_USBDevice.CIM_PROPERTY_SUBCLASSCODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_USBDevice.CIM_PROPERTY_SUBCLASSCODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute USBVersion
	
	public UnsignedInt16 get_USBVersion() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_USBDevice.CIM_PROPERTY_USBVERSION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_USBDevice.CIM_PROPERTY_USBVERSION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_USBDevice.CIM_PROPERTY_USBVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_USBVersion(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_USBDevice.CIM_PROPERTY_USBVERSION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_USBDevice.CIM_PROPERTY_USBVERSION + " could not be found");
    		
		} else if (!CIM_USBDeviceHelper.isValid_USBVersion(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_USBDevice.CIM_PROPERTY_USBVERSION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_USBDevice.CIM_PROPERTY_USBVERSION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt32 invoke_getDescriptor(CIMClient cimClient, UnsignedInt8 RequestType, UnsignedInt16 RequestValue, UnsignedInt16 RequestIndex, UnsignedInt16 RequestLength, UnsignedInt8 Buffer) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_USBDevice.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_RequestType = new CIMValue(RequestType, new CIMDataType(CIMDataType.UINT8));
		CIMValue cimValue_RequestValue = new CIMValue(RequestValue, new CIMDataType(CIMDataType.UINT16));
		CIMValue cimValue_RequestIndex = new CIMValue(RequestIndex, new CIMDataType(CIMDataType.UINT16));
		CIMValue cimValue_RequestLength = new CIMValue(RequestLength, new CIMDataType(CIMDataType.UINT16));
		CIMValue cimValue_Buffer = new CIMValue(Buffer, new CIMDataType(CIMDataType.UINT8_ARRAY));
		
	  	inParameter.add(new CIMArgument("RequestType", cimValue_RequestType));
		inParameter.add(new CIMArgument("RequestValue", cimValue_RequestValue));
		inParameter.add(new CIMArgument("RequestIndex", cimValue_RequestIndex));
		inParameter.add(new CIMArgument("RequestLength", cimValue_RequestLength));
		inParameter.add(new CIMArgument("Buffer", cimValue_Buffer));
		
	  	outParameter.add(new CIMArgument("RequestLength", cimValue_RequestLength));
		outParameter.add(new CIMArgument("Buffer", cimValue_Buffer));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_GETDESCRIPTOR,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_USBDevice.CIM_METHOD_GETDESCRIPTOR + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_USBDevice.CIM_METHOD_GETDESCRIPTOR + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_USBDevice.CIM_METHOD_GETDESCRIPTOR + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
