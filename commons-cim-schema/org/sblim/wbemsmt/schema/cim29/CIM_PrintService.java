/** 
 * CIM_PrintService.java
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
 * Description: The Service that provides support for printing. The basic assumption of the Printing Model is that a PrintService accepts a PrintJob for processing, via its PrintSAP. The Job is then placed on a PrintQueue (indicated by the QueueForPrintService association). Printers take Jobs from Queues (indicated by the PrinterServicingQueue association).
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



public class CIM_PrintService extends CIM_Service  {
	
	public final static String CIM_CLASS_NAME = "CIM_PrintService";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.1";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_QUEUEFORPRINTSERVICE = "CIM_QueueForPrintService";
	
	
	/**
	*	Describes the filters that are available within this Print Service. For example, a PrintService may be able to convert a Job submitted in one page description language to another, so that it can be passed to an available Printer.
	*/
	public final static String CIM_PROPERTY_AVAILABLEFILTERS = "AvailableFilters"; //$NON-NLS-1$
	/**
	*	An array of integers indicating the capabilities supported by this service. Information such as "Duplex Printing" (value=3) or "Transparency Printing" (7) is specified in this property.
	*/
	public final static String CIM_PROPERTY_CAPABILITIES = "Capabilities"; //$NON-NLS-1$
	/**
	*	An array of free-form strings providing more detailed explanations for any of the Printer features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
	*/
	public final static String CIM_PROPERTY_CAPABILITYDESCRIPTIONS = "CapabilityDescriptions"; //$NON-NLS-1$
	/**
	*	An array indicating the print languages supported by the PrintService. A PrintService may support more languages than those available on the underlying Printer through the use of filters. An administrator may also choose to prevent some languages from being exported by the PrintService.
	*/
	public final static String CIM_PROPERTY_LANGUAGESSUPPORTED = "LanguagesSupported"; //$NON-NLS-1$
	/**
	*	An array of free-form strings providing more detailed explanations for any mime types that are supported by the PrintService. Support for mime types is indicated by specifying a value of 47 in the LanguagesSupported array.
	*/
	public final static String CIM_PROPERTY_MIMETYPESSUPPORTED = "MimeTypesSupported"; //$NON-NLS-1$
	/**
	*	An array of free-form strings specifying the types of paper that may be used by Jobs that are submitted to this PrintService. This may be different than the paper types that are installed on the Printer, because the PrintService may include support for manually making other types available or only a subset of paper types may be exported via this Service. Each string should be expressed in the form specified by ISO/IEC 10175 Document Printing Application (DPA) which is also summarized in Appendix C of RFC 1759 (Printer MIB). Examples of valid strings are "iso-a4-colored" and "na-10x14-envelope".
	*/
	public final static String CIM_PROPERTY_PAPERTYPESAVAILABLE = "PaperTypesAvailable"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_AVAILABLEFILTERS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CAPABILITIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_LANGUAGESSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_MIMETYPESSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_PAPERTYPESAVAILABLE);
				
		for (int i = 0; i < CIM_Service.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AVAILABLEFILTERS)||
				((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CAPABILITIES)||
				((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CAPABILITYDESCRIPTIONS)||
				((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LANGUAGESSUPPORTED)||
				((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MIMETYPESSUPPORTED)||
				((String)CIM_Service.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PAPERTYPESAVAILABLE)){
				continue;
			}
			
			CIM_PrintService.CIM_PropertyNameList.add(CIM_Service.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AVAILABLEFILTERS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CAPABILITIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CAPABILITYDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LANGUAGESSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MIMETYPESSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PAPERTYPESAVAILABLE, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
				
		for (int i = 0; i < CIM_Service.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AVAILABLEFILTERS)||
				((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CAPABILITIES)||
				((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CAPABILITYDESCRIPTIONS)||
				((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LANGUAGESSUPPORTED)||
				((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MIMETYPESSUPPORTED)||
				((CIMProperty)CIM_Service.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PAPERTYPESAVAILABLE)){
				continue;
			}
			
			CIM_PrintService.CIM_PropertyList.add(CIM_Service.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Service.Java_Package_List.size(); i++) {
			if (((String)CIM_Service.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Service.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_CAPABILITIES = {"Unknown","Other","Color Printing","Duplex Printing","Copies","Collation","Stapling","Transparency Printing","Punch","Cover","Bind","Black and White Printing","One Sided","Two Sided Long Edge","Two Sided Short Edge","Portrait","Landscape","Reverse Portrait","Reverse Landscape","Quality High","Quality Normal","Quality Low"};
	public final static String[] CIM_VALUEMAP_LANGUAGESSUPPORTED = {"Other","Unknown","PCL","HPGL","PJL","PS","PSPrinter","IPDS","PPDS","EscapeP","Epson","DDIF","Interpress","ISO6429","Line Data","MODCA","REGIS","SCS","SPDL","TEK4014","PDS","IGP","CodeV","DSCDSE","WPS","LN03","CCITT","QUIC","CPAP","DecPPL","Simple Text","NPAP","DOC","imPress","Pinwriter","NPDL","NEC201PL","Automatic","Pages","LIPS","TIFF","Diagnostic","CaPSL","EXCL","LCDS","XES","MIME","TIPSI","Prescribe","LinePrinter","IDP","XJCL","PDF","RPDL","IntermecIPL","UBIFingerprint","UBIDirectProtocol","Fujitsu","PCLXL"};
	
	
	public final static int CAPABILITIES_UNKNOWN = 0;
	public final static int CAPABILITIES_OTHER = 1;
	public final static int CAPABILITIES_COLORPRINTING = 2;
	public final static int CAPABILITIES_DUPLEXPRINTING = 3;
	public final static int CAPABILITIES_COPIES = 4;
	public final static int CAPABILITIES_COLLATION = 5;
	public final static int CAPABILITIES_STAPLING = 6;
	public final static int CAPABILITIES_TRANSPARENCYPRINTING = 7;
	public final static int CAPABILITIES_PUNCH = 8;
	public final static int CAPABILITIES_COVER = 9;
	public final static int CAPABILITIES_BIND = 10;
	public final static int CAPABILITIES_BLACKANDWHITEPRINTING = 11;
	public final static int CAPABILITIES_ONESIDED = 12;
	public final static int CAPABILITIES_TWOSIDEDLONGEDGE = 13;
	public final static int CAPABILITIES_TWOSIDEDSHORTEDGE = 14;
	public final static int CAPABILITIES_PORTRAIT = 15;
	public final static int CAPABILITIES_LANDSCAPE = 16;
	public final static int CAPABILITIES_REVERSEPORTRAIT = 17;
	public final static int CAPABILITIES_REVERSELANDSCAPE = 18;
	public final static int CAPABILITIES_QUALITYHIGH = 19;
	public final static int CAPABILITIES_QUALITYNORMAL = 20;
	public final static int CAPABILITIES_QUALITYLOW = 21;
	
	public final static int LANGUAGESSUPPORTED_OTHER = 1;
	public final static int LANGUAGESSUPPORTED_UNKNOWN = 2;
	public final static int LANGUAGESSUPPORTED_PCL = 3;
	public final static int LANGUAGESSUPPORTED_HPGL = 4;
	public final static int LANGUAGESSUPPORTED_PJL = 5;
	public final static int LANGUAGESSUPPORTED_PS = 6;
	public final static int LANGUAGESSUPPORTED_PSPRINTER = 7;
	public final static int LANGUAGESSUPPORTED_IPDS = 8;
	public final static int LANGUAGESSUPPORTED_PPDS = 9;
	public final static int LANGUAGESSUPPORTED_ESCAPEP = 10;
	public final static int LANGUAGESSUPPORTED_EPSON = 11;
	public final static int LANGUAGESSUPPORTED_DDIF = 12;
	public final static int LANGUAGESSUPPORTED_INTERPRESS = 13;
	public final static int LANGUAGESSUPPORTED_ISO6429 = 14;
	public final static int LANGUAGESSUPPORTED_LINEDATA = 15;
	public final static int LANGUAGESSUPPORTED_MODCA = 16;
	public final static int LANGUAGESSUPPORTED_REGIS = 17;
	public final static int LANGUAGESSUPPORTED_SCS = 18;
	public final static int LANGUAGESSUPPORTED_SPDL = 19;
	public final static int LANGUAGESSUPPORTED_TEK4014 = 20;
	public final static int LANGUAGESSUPPORTED_PDS = 21;
	public final static int LANGUAGESSUPPORTED_IGP = 22;
	public final static int LANGUAGESSUPPORTED_CODEV = 23;
	public final static int LANGUAGESSUPPORTED_DSCDSE = 24;
	public final static int LANGUAGESSUPPORTED_WPS = 25;
	public final static int LANGUAGESSUPPORTED_LN03 = 26;
	public final static int LANGUAGESSUPPORTED_CCITT = 27;
	public final static int LANGUAGESSUPPORTED_QUIC = 28;
	public final static int LANGUAGESSUPPORTED_CPAP = 29;
	public final static int LANGUAGESSUPPORTED_DECPPL = 30;
	public final static int LANGUAGESSUPPORTED_SIMPLETEXT = 31;
	public final static int LANGUAGESSUPPORTED_NPAP = 32;
	public final static int LANGUAGESSUPPORTED_DOC = 33;
	public final static int LANGUAGESSUPPORTED_IMPRESS = 34;
	public final static int LANGUAGESSUPPORTED_PINWRITER = 35;
	public final static int LANGUAGESSUPPORTED_NPDL = 36;
	public final static int LANGUAGESSUPPORTED_NEC201PL = 37;
	public final static int LANGUAGESSUPPORTED_AUTOMATIC = 38;
	public final static int LANGUAGESSUPPORTED_PAGES = 39;
	public final static int LANGUAGESSUPPORTED_LIPS = 40;
	public final static int LANGUAGESSUPPORTED_TIFF = 41;
	public final static int LANGUAGESSUPPORTED_DIAGNOSTIC = 42;
	public final static int LANGUAGESSUPPORTED_CAPSL = 43;
	public final static int LANGUAGESSUPPORTED_EXCL = 44;
	public final static int LANGUAGESSUPPORTED_LCDS = 45;
	public final static int LANGUAGESSUPPORTED_XES = 46;
	public final static int LANGUAGESSUPPORTED_MIME = 47;
	public final static int LANGUAGESSUPPORTED_TIPSI = 48;
	public final static int LANGUAGESSUPPORTED_PRESCRIBE = 50;
	public final static int LANGUAGESSUPPORTED_LINEPRINTER = 51;
	public final static int LANGUAGESSUPPORTED_IDP = 52;
	public final static int LANGUAGESSUPPORTED_XJCL = 53;
	public final static int LANGUAGESSUPPORTED_PDF = 54;
	public final static int LANGUAGESSUPPORTED_RPDL = 55;
	public final static int LANGUAGESSUPPORTED_INTERMECIPL = 56;
	public final static int LANGUAGESSUPPORTED_UBIFINGERPRINT = 57;
	public final static int LANGUAGESSUPPORTED_UBIDIRECTPROTOCOL = 58;
	public final static int LANGUAGESSUPPORTED_FUJITSU = 59;
	public final static int LANGUAGESSUPPORTED_PCLXL = 60;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PrintService() {

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
	public CIM_PrintService(Vector keyProperties){ 
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
	public CIM_PrintService(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_PrintService)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PrintService)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PrintService)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PrintService)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PrintService)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PrintService)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PrintService)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PrintService)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PrintService)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PrintService)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_PrintQueue_CIM_QueueForPrintServices(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_QUEUEFORPRINTSERVICE, 
					CIM_PrintQueue.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_PrintService.Java_Package_List.size(); i++) {
						if (!((String)(CIM_PrintService.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_PrintService.Java_Package_List.get(i))).endsWith(".")) {
							CIM_PrintService.Java_Package_List.setElementAt((String)(CIM_PrintService.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_PrintService.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PrintQueue(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_PrintQueue(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_PrintQueue(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_PrintQueue_CIM_QueueForPrintService_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_QUEUEFORPRINTSERVICE, 
					CIM_PrintQueue.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_PrintQueue.CIM_CLASS_NAME)) {
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
	
	// Attribute AvailableFilters
	
	public String[] get_AvailableFilters() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintService.CIM_PROPERTY_AVAILABLEFILTERS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintService.CIM_PROPERTY_AVAILABLEFILTERS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintService.CIM_PROPERTY_AVAILABLEFILTERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_AvailableFilters(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintService.CIM_PROPERTY_AVAILABLEFILTERS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintService.CIM_PROPERTY_AVAILABLEFILTERS + " could not be found");
    		
		} else if (!CIM_PrintServiceHelper.isValid_AvailableFilters(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintService.CIM_PROPERTY_AVAILABLEFILTERS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintService.CIM_PROPERTY_AVAILABLEFILTERS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Capabilities
	
	public UnsignedInt16[] get_Capabilities() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintService.CIM_PROPERTY_CAPABILITIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintService.CIM_PROPERTY_CAPABILITIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintService.CIM_PROPERTY_CAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_Capabilities(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintService.CIM_PROPERTY_CAPABILITIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintService.CIM_PROPERTY_CAPABILITIES + " could not be found");
    		
		} else if (!CIM_PrintServiceHelper.isValid_Capabilities(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintService.CIM_PROPERTY_CAPABILITIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintService.CIM_PROPERTY_CAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CapabilityDescriptions
	
	public String[] get_CapabilityDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintService.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintService.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintService.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_CapabilityDescriptions(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintService.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintService.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_PrintServiceHelper.isValid_CapabilityDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintService.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintService.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LanguagesSupported
	
	public UnsignedInt16[] get_LanguagesSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintService.CIM_PROPERTY_LANGUAGESSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintService.CIM_PROPERTY_LANGUAGESSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintService.CIM_PROPERTY_LANGUAGESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_LanguagesSupported(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintService.CIM_PROPERTY_LANGUAGESSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintService.CIM_PROPERTY_LANGUAGESSUPPORTED + " could not be found");
    		
		} else if (!CIM_PrintServiceHelper.isValid_LanguagesSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintService.CIM_PROPERTY_LANGUAGESSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintService.CIM_PROPERTY_LANGUAGESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MimeTypesSupported
	
	public String[] get_MimeTypesSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintService.CIM_PROPERTY_MIMETYPESSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintService.CIM_PROPERTY_MIMETYPESSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintService.CIM_PROPERTY_MIMETYPESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_MimeTypesSupported(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintService.CIM_PROPERTY_MIMETYPESSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintService.CIM_PROPERTY_MIMETYPESSUPPORTED + " could not be found");
    		
		} else if (!CIM_PrintServiceHelper.isValid_MimeTypesSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintService.CIM_PROPERTY_MIMETYPESSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintService.CIM_PROPERTY_MIMETYPESSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PaperTypesAvailable
	
	public String[] get_PaperTypesAvailable() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintService.CIM_PROPERTY_PAPERTYPESAVAILABLE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintService.CIM_PROPERTY_PAPERTYPESAVAILABLE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintService.CIM_PROPERTY_PAPERTYPESAVAILABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_PaperTypesAvailable(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PrintService.CIM_PROPERTY_PAPERTYPESAVAILABLE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PrintService.CIM_PROPERTY_PAPERTYPESAVAILABLE + " could not be found");
    		
		} else if (!CIM_PrintServiceHelper.isValid_PaperTypesAvailable(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PrintService.CIM_PROPERTY_PAPERTYPESAVAILABLE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PrintService.CIM_PROPERTY_PAPERTYPESAVAILABLE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
