/** 
 * CIM_HelpService.java
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
 * Description: HelpService provides the ability for a managed element to describe and provide access to its Help information. Support for various delivery mechanisms and data formats can be specified so that the most suitable data representation can be chosen. In adddition, a request can be made to launch a "Help" program, if available.
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



public class CIM_HelpService extends CIM_Service  {
	
	public final static String CIM_CLASS_NAME = "CIM_HelpService";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.9.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_HELPSERVICEAVAILABLETOFILE = "CIM_HelpServiceAvailableToFile";
	
	
	/**
	*	Defines the delivery methods supported by this help service./n "File Contents" indicates that the contents of the Help file is returned by the GetHelp method. 
"File Pointer" indicates that a fully specified path to the Help file is returned by the GetHelp method. 
"Associated File" indicates that associations to CIM_LogicalFile instance(s) is available. 
"URL" indicates that a URL to a website is returned by the GetHelp method. 
"Program" indicates that a Help program is launched (on the local system) by the GetHelp method.
	*/
	public final static String CIM_PROPERTY_DELIVERYOPTIONS = "DeliveryOptions"; //$NON-NLS-1$
	/**
	*	List of descriptions for the corresponding documents.
	*/
	public final static String CIM_PROPERTY_DOCUMENTDESCRIPTIONS = "DocumentDescriptions"; //$NON-NLS-1$
	/**
	*	List of document formats for the corresponding documents.
	*/
	public final static String CIM_PROPERTY_DOCUMENTFORMAT = "DocumentFormat"; //$NON-NLS-1$
	/**
	*	List of all of the document names/ids that are available via this help service and NOT exposed by the HelpServiceAvailableToFile association.
	*/
	public final static String CIM_PROPERTY_DOCUMENTSAVAILABLE = "DocumentsAvailable"; //$NON-NLS-1$
	/**
	*	Describes the nature of the delivery method when DeliveryOptions = "Other" is specified.
	*/
	public final static String CIM_PROPERTY_OTHERDELIVERYOPTIONDESCRIPTION = "OtherDeliveryOptionDescription"; //$NON-NLS-1$
	/**
	*	Describes the format of the document when DocumentFormat= "Other" is specified.
	*/
	public final static String CIM_PROPERTY_OTHERDOCUMENTFORMATDESCRIPTION = "OtherDocumentFormatDescription"; //$NON-NLS-1$
	
	
	/**
	*	The GetHelp method produces, as an OUT parameter, a string containing document information as specified by the input parameters. The input parameters are expected to be valid sets of values from the corresponding indexed properties of this class.
	*/
	public final static String CIM_METHOD_GETHELP = "GetHelp";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_DELIVERYOPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_DOCUMENTDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_DOCUMENTFORMAT);
		CIM_PropertyNameList.add(CIM_PROPERTY_DOCUMENTSAVAILABLE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERDELIVERYOPTIONDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERDOCUMENTFORMATDESCRIPTION);
				
		for (int i = 0; i < CIM_Service.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DELIVERYOPTIONS)||
				((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DOCUMENTDESCRIPTIONS)||
				((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DOCUMENTFORMAT)||
				((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DOCUMENTSAVAILABLE)||
				((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERDELIVERYOPTIONDESCRIPTION)||
				((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERDOCUMENTFORMATDESCRIPTION)){
				continue;
			}
			
			CIM_HelpService.CIM_PropertyNameList.add(CIM_Service.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DELIVERYOPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DOCUMENTDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DOCUMENTFORMAT, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DOCUMENTSAVAILABLE, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERDELIVERYOPTIONDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERDOCUMENTFORMATDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_Service.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DELIVERYOPTIONS)||
				((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DOCUMENTDESCRIPTIONS)||
				((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DOCUMENTFORMAT)||
				((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DOCUMENTSAVAILABLE)||
				((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERDELIVERYOPTIONDESCRIPTION)||
				((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERDOCUMENTFORMATDESCRIPTION)){
				continue;
			}
			
			CIM_HelpService.CIM_PropertyList.add(CIM_Service.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Service.Java_Package_List.size(); i++) {
			if (((String)CIM_Service.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Service.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_DELIVERYOPTIONS = {"Other","File Contents","File Pointer","Associated File","URL","Program"};
	public final static String[] CIM_VALUEMAP_DOCUMENTFORMAT = {"Unknown","Other","XML","HTML","Binary","Executable",".hlp"};
	
	
	public final static int DELIVERYOPTIONS_OTHER = 1;
	public final static int DELIVERYOPTIONS_FILECONTENTS = 2;
	public final static int DELIVERYOPTIONS_FILEPOINTER = 3;
	public final static int DELIVERYOPTIONS_ASSOCIATEDFILE = 4;
	public final static int DELIVERYOPTIONS_URL = 5;
	public final static int DELIVERYOPTIONS_PROGRAM = 6;
	
	public final static int DOCUMENTFORMAT_UNKNOWN = 0;
	public final static int DOCUMENTFORMAT_OTHER = 1;
	public final static int DOCUMENTFORMAT_XML = 2;
	public final static int DOCUMENTFORMAT_HTML = 3;
	public final static int DOCUMENTFORMAT_BINARY = 4;
	public final static int DOCUMENTFORMAT_EXECUTABLE = 5;
	public final static int DOCUMENTFORMAT__HLP = 6;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_HelpService() {

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
	public CIM_HelpService(Vector keyProperties){ 
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
	public CIM_HelpService(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_HelpService)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_HelpService)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_HelpService)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_HelpService)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_HelpService)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_HelpService)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_HelpService)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_HelpService)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_HelpService)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_HelpService)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_LogicalFile_CIM_HelpServiceAvailableToFiles(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_HELPSERVICEAVAILABLETOFILE, 
					CIM_LogicalFile.CIM_CLASS_NAME, 
					"ServiceProvided",
					"UserOfService",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_HelpService.Java_Package_List.size(); i++) {
						if (!((String)(CIM_HelpService.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_HelpService.Java_Package_List.get(i))).endsWith(".")) {
							CIM_HelpService.Java_Package_List.setElementAt((String)(CIM_HelpService.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_HelpService.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_LogicalFile(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_LogicalFile(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_LogicalFile(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_LogicalFile_CIM_HelpServiceAvailableToFile_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_HELPSERVICEAVAILABLETOFILE, 
					CIM_LogicalFile.CIM_CLASS_NAME, 
					"ServiceProvided",
					"UserOfService");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_LogicalFile.CIM_CLASS_NAME)) {
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
	
	// Attribute DeliveryOptions
	
	public UnsignedInt16[] get_DeliveryOptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_HelpService.CIM_PROPERTY_DELIVERYOPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_HelpService.CIM_PROPERTY_DELIVERYOPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_HelpService.CIM_PROPERTY_DELIVERYOPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		UnsignedInt16[] resultArray = new UnsignedInt16[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (UnsignedInt16)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_DeliveryOptions(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_HelpService.CIM_PROPERTY_DELIVERYOPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_HelpService.CIM_PROPERTY_DELIVERYOPTIONS + " could not be found");
    		
		} else if (!CIM_HelpServiceHelper.isValid_DeliveryOptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_HelpService.CIM_PROPERTY_DELIVERYOPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_HelpService.CIM_PROPERTY_DELIVERYOPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DocumentDescriptions
	
	public String[] get_DocumentDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_HelpService.CIM_PROPERTY_DOCUMENTDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_HelpService.CIM_PROPERTY_DOCUMENTDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_HelpService.CIM_PROPERTY_DOCUMENTDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_DocumentDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_HelpService.CIM_PROPERTY_DOCUMENTDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_HelpService.CIM_PROPERTY_DOCUMENTDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_HelpServiceHelper.isValid_DocumentDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_HelpService.CIM_PROPERTY_DOCUMENTDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_HelpService.CIM_PROPERTY_DOCUMENTDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DocumentFormat
	
	public UnsignedInt16[] get_DocumentFormat() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_HelpService.CIM_PROPERTY_DOCUMENTFORMAT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_HelpService.CIM_PROPERTY_DOCUMENTFORMAT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_HelpService.CIM_PROPERTY_DOCUMENTFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		UnsignedInt16[] resultArray = new UnsignedInt16[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (UnsignedInt16)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_DocumentFormat(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_HelpService.CIM_PROPERTY_DOCUMENTFORMAT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_HelpService.CIM_PROPERTY_DOCUMENTFORMAT + " could not be found");
    		
		} else if (!CIM_HelpServiceHelper.isValid_DocumentFormat(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_HelpService.CIM_PROPERTY_DOCUMENTFORMAT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_HelpService.CIM_PROPERTY_DOCUMENTFORMAT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DocumentsAvailable
	
	public String[] get_DocumentsAvailable() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_HelpService.CIM_PROPERTY_DOCUMENTSAVAILABLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_HelpService.CIM_PROPERTY_DOCUMENTSAVAILABLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_HelpService.CIM_PROPERTY_DOCUMENTSAVAILABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		Vector returnedVector = (Vector)currentProperty.getValue().getValue();
		
		String[] resultArray = new String[returnedVector!=null?returnedVector.size():0];
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = (String)returnedVector.get(i);
		}
		
		return resultArray;
	}
	    
			
	public void set_DocumentsAvailable(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_HelpService.CIM_PROPERTY_DOCUMENTSAVAILABLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_HelpService.CIM_PROPERTY_DOCUMENTSAVAILABLE + " could not be found");
    		
		} else if (!CIM_HelpServiceHelper.isValid_DocumentsAvailable(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_HelpService.CIM_PROPERTY_DOCUMENTSAVAILABLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_HelpService.CIM_PROPERTY_DOCUMENTSAVAILABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherDeliveryOptionDescription
	
	public String get_OtherDeliveryOptionDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_HelpService.CIM_PROPERTY_OTHERDELIVERYOPTIONDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_HelpService.CIM_PROPERTY_OTHERDELIVERYOPTIONDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_HelpService.CIM_PROPERTY_OTHERDELIVERYOPTIONDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherDeliveryOptionDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_HelpService.CIM_PROPERTY_OTHERDELIVERYOPTIONDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_HelpService.CIM_PROPERTY_OTHERDELIVERYOPTIONDESCRIPTION + " could not be found");
    		
		} else if (!CIM_HelpServiceHelper.isValid_OtherDeliveryOptionDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_HelpService.CIM_PROPERTY_OTHERDELIVERYOPTIONDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_HelpService.CIM_PROPERTY_OTHERDELIVERYOPTIONDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherDocumentFormatDescription
	
	public String get_OtherDocumentFormatDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_HelpService.CIM_PROPERTY_OTHERDOCUMENTFORMATDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_HelpService.CIM_PROPERTY_OTHERDOCUMENTFORMATDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_HelpService.CIM_PROPERTY_OTHERDOCUMENTFORMATDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherDocumentFormatDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_HelpService.CIM_PROPERTY_OTHERDOCUMENTFORMATDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_HelpService.CIM_PROPERTY_OTHERDOCUMENTFORMATDESCRIPTION + " could not be found");
    		
		} else if (!CIM_HelpServiceHelper.isValid_OtherDocumentFormatDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_HelpService.CIM_PROPERTY_OTHERDOCUMENTFORMATDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_HelpService.CIM_PROPERTY_OTHERDOCUMENTFORMATDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt32 invoke_getHelp(CIMClient cimClient, String RequestedDocument, UnsignedInt16 Format, UnsignedInt16 RequestedDelivery, String DocumentInfo) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_HelpService.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_RequestedDocument = new CIMValue(RequestedDocument, new CIMDataType(CIMDataType.STRING));
		CIMValue cimValue_Format = new CIMValue(Format, new CIMDataType(CIMDataType.UINT16));
		CIMValue cimValue_RequestedDelivery = new CIMValue(RequestedDelivery, new CIMDataType(CIMDataType.UINT16));
		CIMValue cimValue_DocumentInfo = new CIMValue(DocumentInfo, new CIMDataType(CIMDataType.STRING));
		
	  	inParameter.add(new CIMArgument("RequestedDocument", cimValue_RequestedDocument));
		inParameter.add(new CIMArgument("Format", cimValue_Format));
		inParameter.add(new CIMArgument("RequestedDelivery", cimValue_RequestedDelivery));
		inParameter.add(new CIMArgument("DocumentInfo", cimValue_DocumentInfo));
		
	  	outParameter.add(new CIMArgument("Format", cimValue_Format));
		outParameter.add(new CIMArgument("DocumentInfo", cimValue_DocumentInfo));
		
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_GETHELP,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_HelpService.CIM_METHOD_GETHELP + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_HelpService.CIM_METHOD_GETHELP + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_HelpService.CIM_METHOD_GETHELP + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
