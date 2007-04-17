/** 
 * CIM_Memory.java
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
 * Description:  Capabilities and management of Memory-related LogicalDevices.
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
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.cim.UnsignedInt32;
import org.sblim.wbem.cim.UnsignedInt64;
import org.sblim.wbem.cim.UnsignedInt8;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.CIMEnumeration;



/**
 *  Capabilities and management of Memory-related LogicalDevices.
 */
public class CIM_Memory extends CIM_StorageExtent  {
	
	public final static String CIM_CLASS_NAME = "CIM_Memory"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDMEMORY = "CIM_AssociatedMemory"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV = "CIM_BIOSLoadedInNV"; //$NON-NLS-1$
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY = "CIM_ComputerSystemMemory"; //$NON-NLS-1$
	
	
	/**
	*	An array of octets holding additional error information. An example is ECC Syndrome or the return of the check bits if a CRC-based ErrorMethodology is used. In the latter case, if a single bit error is recognized and the CRC algorithm is known, it is possible to determine the exact bit that failed. This type of data (ECC Syndrome, Check Bit or Parity Bit data, or other vendor supplied information) is included in this field. If the ErrorInfo property is equal to 3, "OK", then AdditionalErrorData has no meaning.
	*/
	public final static String CIM_PROPERTY_ADDITIONALERRORDATA = "AdditionalErrorData"; //$NON-NLS-1$
	/**
	*	Boolean indicating that the most recent error was correctable. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
	*/
	public final static String CIM_PROPERTY_CORRECTABLEERROR = "CorrectableError"; //$NON-NLS-1$
	/**
	*	The ending address, referenced by an application or operating system and mapped by a memory controller, for this Memory object. The ending address is specified in KBytes.
	*/
	public final static String CIM_PROPERTY_ENDINGADDRESS = "EndingAddress"; //$NON-NLS-1$
	/**
	*	An integer enumeration indicating the memory access operation that caused the last error. The type of error is described by the ErrorInfo property. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
	*/
	public final static String CIM_PROPERTY_ERRORACCESS = "ErrorAccess"; //$NON-NLS-1$
	/**
	*	Specifies the address of the last memory error. The type of error is described by the ErrorInfo property. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
	*/
	public final static String CIM_PROPERTY_ERRORADDRESS = "ErrorAddress"; //$NON-NLS-1$
	/**
	*	The ordering for data stored in the ErrorData property. "Least Significant Byte First" (value=1) or "Most Significant Byte First" (2) can be specified. If ErrorTransferSize is 0, then this property has no meaning.
	*/
	public final static String CIM_PROPERTY_ERRORDATAORDER = "ErrorDataOrder"; //$NON-NLS-1$
	/**
	*	Data captured during the last erroneous mebmory access. The data occupies the first n octets of the array necessary to hold the number of bits specified by the ErrorTransferSize property. If ErrorTransferSize is 0, then this property has no meaning.
	*/
	public final static String CIM_PROPERTY_ERRORDATA = "ErrorData"; //$NON-NLS-1$
	/**
	*	An integer enumeration describing the type of error that occurred most recently. For example, single (value=6) or double bit errors (7) can be specified using this property. The values, 12-14, are undefined in the CIM Schema since in DMI, they mix the semantics of the type of error and whether it was correctable or not. The latter is indicated in the property, CorrectableError.
	*/
	public final static String CIM_PROPERTY_ERRORINFO = "ErrorInfo"; //$NON-NLS-1$
	/**
	*	ErrorMethodology for Memory is a string property that indicates whether parity or CRC algorithms, ECC or other mechanisms are used. Details on the algorithm can also be supplied.
	*/
	public final static String CIM_PROPERTY_ERRORMETHODOLOGY = "ErrorMethodology"; //$NON-NLS-1$
	/**
	*	Specifies the range, in bytes, to which the last error can be resolved. For example, if error addresses are resolved to bit 11 (ie, on a typical page basis), then errors can be resolved to 4K boundaries and this property is set to 4000. If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
	*/
	public final static String CIM_PROPERTY_ERRORRESOLUTION = "ErrorResolution"; //$NON-NLS-1$
	/**
	*	The time that the last memory error occurred. The type of error is described by the ErrorInfo property. If the Error Info property is equal to 3, "OK", then this property has no meaning.
	*/
	public final static String CIM_PROPERTY_ERRORTIME = "ErrorTime"; //$NON-NLS-1$
	/**
	*	The size of the data transfer in bits that caused the last error. 0 indicates no error. If the ErrorInfo property is equal to 3, "OK", then this property should be set to 0.
	*/
	public final static String CIM_PROPERTY_ERRORTRANSFERSIZE = "ErrorTransferSize"; //$NON-NLS-1$
	/**
	*	Free form string providing more information if the Error Type property is set to 1, "Other". If not set to 1, this string has no meaning.
	*/
	public final static String CIM_PROPERTY_OTHERERRORDESCRIPTION = "OtherErrorDescription"; //$NON-NLS-1$
	/**
	*	The beginning address, referenced by an application or operating system and mapped by a memory controller, for this Memory object. The starting address is specified in KBytes.
	*/
	public final static String CIM_PROPERTY_STARTINGADDRESS = "StartingAddress"; //$NON-NLS-1$
	/**
	*	Boolean indicating whether the address information in the property, ErrorAddress, is a system-level address (TRUE) or a physical address (FALSE). If the ErrorInfo property is equal to 3, "OK", then this property has no meaning.
	*/
	public final static String CIM_PROPERTY_SYSTEMLEVELADDRESS = "SystemLevelAddress"; //$NON-NLS-1$
	/**
	*	Volatile is a property that indicates whether this memory is volatile or not.
	*/
	public final static String CIM_PROPERTY_VOLATILE = "Volatile"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ADDITIONALERRORDATA);
		CIM_PropertyNameList.add(CIM_PROPERTY_CORRECTABLEERROR);
		CIM_PropertyNameList.add(CIM_PROPERTY_ENDINGADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_ERRORACCESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_ERRORADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_ERRORDATAORDER);
		CIM_PropertyNameList.add(CIM_PROPERTY_ERRORDATA);
		CIM_PropertyNameList.add(CIM_PROPERTY_ERRORINFO);
		CIM_PropertyNameList.add(CIM_PROPERTY_ERRORMETHODOLOGY);
		CIM_PropertyNameList.add(CIM_PROPERTY_ERRORRESOLUTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_ERRORTIME);
		CIM_PropertyNameList.add(CIM_PROPERTY_ERRORTRANSFERSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_OTHERERRORDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_STARTINGADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_SYSTEMLEVELADDRESS);
		CIM_PropertyNameList.add(CIM_PROPERTY_VOLATILE);
				
		for (int i = 0; i < CIM_StorageExtent.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_StorageExtent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ADDITIONALERRORDATA)||
				((String)CIM_StorageExtent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CORRECTABLEERROR)||
				((String)CIM_StorageExtent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ENDINGADDRESS)||
				((String)CIM_StorageExtent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ERRORACCESS)||
				((String)CIM_StorageExtent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ERRORADDRESS)||
				((String)CIM_StorageExtent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ERRORDATAORDER)||
				((String)CIM_StorageExtent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ERRORDATA)||
				((String)CIM_StorageExtent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ERRORINFO)||
				((String)CIM_StorageExtent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ERRORMETHODOLOGY)||
				((String)CIM_StorageExtent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ERRORRESOLUTION)||
				((String)CIM_StorageExtent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ERRORTIME)||
				((String)CIM_StorageExtent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ERRORTRANSFERSIZE)||
				((String)CIM_StorageExtent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_OTHERERRORDESCRIPTION)||
				((String)CIM_StorageExtent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STARTINGADDRESS)||
				((String)CIM_StorageExtent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SYSTEMLEVELADDRESS)||
				((String)CIM_StorageExtent.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VOLATILE)){
				continue;
			}
			
			CIM_Memory.CIM_PropertyNameList.add(CIM_StorageExtent.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ADDITIONALERRORDATA, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CORRECTABLEERROR, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ENDINGADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ERRORACCESS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ERRORADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ERRORDATAORDER, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ERRORDATA, new CIMValue(null, new CIMDataType(CIMDataType.UINT8))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ERRORINFO, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ERRORMETHODOLOGY, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ERRORRESOLUTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ERRORTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ERRORTRANSFERSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_OTHERERRORDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STARTINGADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SYSTEMLEVELADDRESS, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VOLATILE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
				
		for (int i = 0; i < CIM_StorageExtent.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_StorageExtent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ADDITIONALERRORDATA)||
				((CIMProperty)CIM_StorageExtent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CORRECTABLEERROR)||
				((CIMProperty)CIM_StorageExtent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ENDINGADDRESS)||
				((CIMProperty)CIM_StorageExtent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ERRORACCESS)||
				((CIMProperty)CIM_StorageExtent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ERRORADDRESS)||
				((CIMProperty)CIM_StorageExtent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ERRORDATAORDER)||
				((CIMProperty)CIM_StorageExtent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ERRORDATA)||
				((CIMProperty)CIM_StorageExtent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ERRORINFO)||
				((CIMProperty)CIM_StorageExtent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ERRORMETHODOLOGY)||
				((CIMProperty)CIM_StorageExtent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ERRORRESOLUTION)||
				((CIMProperty)CIM_StorageExtent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ERRORTIME)||
				((CIMProperty)CIM_StorageExtent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ERRORTRANSFERSIZE)||
				((CIMProperty)CIM_StorageExtent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_OTHERERRORDESCRIPTION)||
				((CIMProperty)CIM_StorageExtent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STARTINGADDRESS)||
				((CIMProperty)CIM_StorageExtent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SYSTEMLEVELADDRESS)||
				((CIMProperty)CIM_StorageExtent.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VOLATILE)){
				continue;
			}
			
			CIM_Memory.CIM_PropertyList.add(CIM_StorageExtent.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_StorageExtent.Java_Package_List.size(); i++) {
			if (((String)CIM_StorageExtent.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_StorageExtent.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ERRORACCESS = {"Other","Unknown","Read","Write","Partial Write"};
	public final static String[] CIM_VALUEMAP_ERRORDATAORDER = {"Unknown","Least Significant Byte First","Most Significant Byte First"};
	public final static String[] CIM_VALUEMAP_ERRORINFO = {"Other","Unknown","OK","Bad Read","Parity Error","Single-Bit Error","Double-Bit Error","Multi-Bit Error","Nibble Error","Checksum Error","CRC Error","Undefined","Undefined","Undefined"};
	
	
	public final static int ERRORACCESS_OTHER = 1;
	public final static int ERRORACCESS_UNKNOWN = 2;
	public final static int ERRORACCESS_READ = 3;
	public final static int ERRORACCESS_WRITE = 4;
	public final static int ERRORACCESS_PARTIALWRITE = 5;
	
	public final static int ERRORDATAORDER_UNKNOWN = 0;
	public final static int ERRORDATAORDER_LEASTSIGNIFICANTBYTEFIRST = 1;
	public final static int ERRORDATAORDER_MOSTSIGNIFICANTBYTEFIRST = 2;
	
	public final static int ERRORINFO_OTHER = 1;
	public final static int ERRORINFO_UNKNOWN = 2;
	public final static int ERRORINFO_OK = 3;
	public final static int ERRORINFO_BADREAD = 4;
	public final static int ERRORINFO_PARITYERROR = 5;
	public final static int ERRORINFO_SINGLE_BITERROR = 6;
	public final static int ERRORINFO_DOUBLE_BITERROR = 7;
	public final static int ERRORINFO_MULTI_BITERROR = 8;
	public final static int ERRORINFO_NIBBLEERROR = 9;
	public final static int ERRORINFO_CHECKSUMERROR = 10;
	public final static int ERRORINFO_CRCERROR = 11;
	public final static int ERRORINFO_UNDEFINED = 12;
	public final static int ERRORINFO_UNDEFINED1 = 13;
	public final static int ERRORINFO_UNDEFINED2 = 14;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_Memory() {

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
	public CIM_Memory(Vector keyProperties){ 
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
	public CIM_Memory(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_Memory)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_Memory)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_Memory)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_Memory)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_Memory)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_Memory)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_Memory)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_Memory)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_Memory)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_Memory)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_LogicalElement_CIM_AssociatedMemorys(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDMEMORY, 
					CIM_LogicalElement.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_Memory.Java_Package_List.size(); i++) {
						if (!((String)(CIM_Memory.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_Memory.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_Memory.Java_Package_List.setElementAt((String)(CIM_Memory.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_Memory.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_LogicalElement(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_LogicalElement(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_LogicalElement(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_LogicalElement_CIM_AssociatedMemory_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ASSOCIATEDMEMORY, 
					CIM_LogicalElement.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_LogicalElement.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_BIOSElement_CIM_BIOSLoadedInNVs(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV, 
					CIM_BIOSElement.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_Memory.Java_Package_List.size(); i++) {
						if (!((String)(CIM_Memory.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_Memory.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_Memory.Java_Package_List.setElementAt((String)(CIM_Memory.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_Memory.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BIOSElement(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_BIOSElement(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_BIOSElement(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_BIOSElement_CIM_BIOSLoadedInNV_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_BIOSLOADEDINNV, 
					CIM_BIOSElement.CIM_CLASS_NAME, 
					"Antecedent", //$NON-NLS-1$
					"Dependent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_BIOSElement.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_UnitaryComputerSystem_CIM_ComputerSystemMemorys(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY, 
					CIM_UnitaryComputerSystem.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_Memory.Java_Package_List.size(); i++) {
						if (!((String)(CIM_Memory.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_Memory.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_Memory.Java_Package_List.setElementAt((String)(CIM_Memory.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_Memory.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_UnitaryComputerSystem(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_UnitaryComputerSystem(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_UnitaryComputerSystem(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_UnitaryComputerSystem_CIM_ComputerSystemMemory_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMMEMORY, 
					CIM_UnitaryComputerSystem.CIM_CLASS_NAME, 
					"PartComponent", //$NON-NLS-1$
					"GroupComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_UnitaryComputerSystem.CIM_CLASS_NAME)) {
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
	
	// Attribute AdditionalErrorData
	
	public UnsignedInt8 get_AdditionalErrorData() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_ADDITIONALERRORDATA);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_ADDITIONALERRORDATA + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_ADDITIONALERRORDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AdditionalErrorData(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_ADDITIONALERRORDATA);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_ADDITIONALERRORDATA + " could not be found");
    		
		} else if (!CIM_MemoryHelper.isValid_AdditionalErrorData(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Memory.CIM_PROPERTY_ADDITIONALERRORDATA);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_ADDITIONALERRORDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CorrectableError
	
	public Boolean get_CorrectableError() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_CORRECTABLEERROR);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_CORRECTABLEERROR + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_CORRECTABLEERROR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CorrectableError(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_CORRECTABLEERROR);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_CORRECTABLEERROR + " could not be found");
    		
		} else if (!CIM_MemoryHelper.isValid_CorrectableError(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Memory.CIM_PROPERTY_CORRECTABLEERROR);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_CORRECTABLEERROR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute EndingAddress
	
	public UnsignedInt64 get_EndingAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_ENDINGADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_ENDINGADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_ENDINGADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_EndingAddress(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_ENDINGADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_ENDINGADDRESS + " could not be found");
    		
		} else if (!CIM_MemoryHelper.isValid_EndingAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Memory.CIM_PROPERTY_ENDINGADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_ENDINGADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ErrorAccess
	
	public UnsignedInt16 get_ErrorAccess() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_ERRORACCESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_ERRORACCESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_ERRORACCESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ErrorAccess(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_ERRORACCESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_ERRORACCESS + " could not be found");
    		
		} else if (!CIM_MemoryHelper.isValid_ErrorAccess(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Memory.CIM_PROPERTY_ERRORACCESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_ERRORACCESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ErrorAddress
	
	public UnsignedInt64 get_ErrorAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_ERRORADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_ERRORADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_ERRORADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ErrorAddress(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_ERRORADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_ERRORADDRESS + " could not be found");
    		
		} else if (!CIM_MemoryHelper.isValid_ErrorAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Memory.CIM_PROPERTY_ERRORADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_ERRORADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ErrorDataOrder
	
	public UnsignedInt16 get_ErrorDataOrder() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_ERRORDATAORDER);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_ERRORDATAORDER + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_ERRORDATAORDER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ErrorDataOrder(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_ERRORDATAORDER);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_ERRORDATAORDER + " could not be found");
    		
		} else if (!CIM_MemoryHelper.isValid_ErrorDataOrder(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Memory.CIM_PROPERTY_ERRORDATAORDER);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_ERRORDATAORDER + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ErrorData
	
	public UnsignedInt8 get_ErrorData() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_ERRORDATA);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_ERRORDATA + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_ERRORDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt8)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ErrorData(UnsignedInt8 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_ERRORDATA);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_ERRORDATA + " could not be found");
    		
		} else if (!CIM_MemoryHelper.isValid_ErrorData(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Memory.CIM_PROPERTY_ERRORDATA);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT8) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_ERRORDATA + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT8) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT8));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ErrorInfo
	
	public UnsignedInt16 get_ErrorInfo() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_ERRORINFO);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_ERRORINFO + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_ERRORINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ErrorInfo(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_ERRORINFO);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_ERRORINFO + " could not be found");
    		
		} else if (!CIM_MemoryHelper.isValid_ErrorInfo(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Memory.CIM_PROPERTY_ERRORINFO);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_ERRORINFO + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ErrorMethodology
	
	public String get_ErrorMethodology() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_ERRORMETHODOLOGY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_ERRORMETHODOLOGY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_ERRORMETHODOLOGY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ErrorMethodology(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_ERRORMETHODOLOGY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_ERRORMETHODOLOGY + " could not be found");
    		
		} else if (!CIM_MemoryHelper.isValid_ErrorMethodology(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Memory.CIM_PROPERTY_ERRORMETHODOLOGY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_ERRORMETHODOLOGY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ErrorResolution
	
	public UnsignedInt64 get_ErrorResolution() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_ERRORRESOLUTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_ERRORRESOLUTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_ERRORRESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ErrorResolution(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_ERRORRESOLUTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_ERRORRESOLUTION + " could not be found");
    		
		} else if (!CIM_MemoryHelper.isValid_ErrorResolution(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Memory.CIM_PROPERTY_ERRORRESOLUTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_ERRORRESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ErrorTime
	
	public Calendar get_ErrorTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_ERRORTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_ERRORTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_ERRORTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_ErrorTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_ERRORTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_ERRORTIME + " could not be found");
    		
		} else if (!CIM_MemoryHelper.isValid_ErrorTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Memory.CIM_PROPERTY_ERRORTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_ERRORTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	// Attribute ErrorTransferSize
	
	public UnsignedInt32 get_ErrorTransferSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_ERRORTRANSFERSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_ERRORTRANSFERSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_ERRORTRANSFERSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ErrorTransferSize(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_ERRORTRANSFERSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_ERRORTRANSFERSIZE + " could not be found");
    		
		} else if (!CIM_MemoryHelper.isValid_ErrorTransferSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Memory.CIM_PROPERTY_ERRORTRANSFERSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_ERRORTRANSFERSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute OtherErrorDescription
	
	public String get_OtherErrorDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_OTHERERRORDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_OTHERERRORDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_OTHERERRORDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_OtherErrorDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_OTHERERRORDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_OTHERERRORDESCRIPTION + " could not be found");
    		
		} else if (!CIM_MemoryHelper.isValid_OtherErrorDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Memory.CIM_PROPERTY_OTHERERRORDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_OTHERERRORDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute StartingAddress
	
	public UnsignedInt64 get_StartingAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_STARTINGADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_STARTINGADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_STARTINGADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_StartingAddress(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_STARTINGADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_STARTINGADDRESS + " could not be found");
    		
		} else if (!CIM_MemoryHelper.isValid_StartingAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Memory.CIM_PROPERTY_STARTINGADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_STARTINGADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SystemLevelAddress
	
	public Boolean get_SystemLevelAddress() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_SYSTEMLEVELADDRESS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_SYSTEMLEVELADDRESS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_SYSTEMLEVELADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SystemLevelAddress(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_SYSTEMLEVELADDRESS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_SYSTEMLEVELADDRESS + " could not be found");
    		
		} else if (!CIM_MemoryHelper.isValid_SystemLevelAddress(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Memory.CIM_PROPERTY_SYSTEMLEVELADDRESS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_SYSTEMLEVELADDRESS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Volatile
	
	public Boolean get_Volatile() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_VOLATILE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_VOLATILE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_VOLATILE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Volatile(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Memory.CIM_PROPERTY_VOLATILE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Memory.CIM_PROPERTY_VOLATILE + " could not be found");
    		
		} else if (!CIM_MemoryHelper.isValid_Volatile(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Memory.CIM_PROPERTY_VOLATILE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Memory.CIM_PROPERTY_VOLATILE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}