/** 
 * CIM_DMA.java
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
 * Description: Personal computer architecture DMA.
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



public class CIM_DMA extends CIM_SystemResource  {
	
	public final static String CIM_CLASS_NAME = "CIM_DMA";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_ALLOCATEDDMA = "CIM_AllocatedDMA";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMDMA = "CIM_ComputerSystemDMA";
	
	
	/**
	*	An integer indicating the DMA Channel address size in bits. Permissible values are 8, 16, 32 or 64 bits. If unknown, enter 0.
	*/
	public final static String CIM_PROPERTY_ADDRESSSIZE = "AddressSize"; //$NON-NLS-1$
	/**
	*	Availability of the DMA.
	*/
	public final static String CIM_PROPERTY_AVAILABILITY = "Availability"; //$NON-NLS-1$
	/**
	*	Indication that the DMA Channel supports burst mode.
	*/
	public final static String CIM_PROPERTY_BURSTMODE = "BurstMode"; //$NON-NLS-1$
	/**
	*	Indicates whether DMA may execute in 'count by byte' mode (value=4) or not (value=3). Also, "Other" (1) and "Unknown" (2) may be defined.
	*/
	public final static String CIM_PROPERTY_BYTEMODE = "ByteMode"; //$NON-NLS-1$
	/**
	*	The scoping ComputerSystem's CreationClassName.
	*/
	public final static String CIM_PROPERTY_CSCREATIONCLASSNAME = "CSCreationClassName"; //$NON-NLS-1$
	/**
	*	The scoping ComputerSystem's Name.
	*/
	public final static String CIM_PROPERTY_CSNAME = "CSName"; //$NON-NLS-1$
	/**
	*	DMA channel timing. For example, "Type A" (value =4) or "Type F" (6) could be specified.
	*/
	public final static String CIM_PROPERTY_CHANNELTIMING = "ChannelTiming"; //$NON-NLS-1$
	/**
	*	CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	*/
	public final static String CIM_PROPERTY_CREATIONCLASSNAME = "CreationClassName"; //$NON-NLS-1$
	/**
	*	A part of the object's key value, the DMA Channel number.
	*/
	public final static String CIM_PROPERTY_DMACHANNEL = "DMAChannel"; //$NON-NLS-1$
	/**
	*	The maximum number of bytes that can be transferred by this DMA Channel. If unknown, enter 0.
	*/
	public final static String CIM_PROPERTY_MAXTRANSFERSIZE = "MaxTransferSize"; //$NON-NLS-1$
	/**
	*	An array indicating all the transfer widths (in bits) supported by this DMA Channel. Permissible values are 8, 16, 32, 64 or 128 bits. If unknown, enter 0.
	*/
	public final static String CIM_PROPERTY_TRANSFERWIDTHS = "TransferWidths"; //$NON-NLS-1$
	/**
	*	Indicates whether C type (burst) timing is supported (value=5) or not (value=4). Also, "Other" (1), "Unknown" (2) and "ISA Compatible" (3) are defined.
	*/
	public final static String CIM_PROPERTY_TYPECTIMING = "TypeCTiming"; //$NON-NLS-1$
	/**
	*	Indicates whether DMA may execute in 'count by word' mode (value=4) or not (value=3). Also, "Other" (1) and "Unknown" (2) may be defined.
	*/
	public final static String CIM_PROPERTY_WORDMODE = "WordMode"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ADDRESSSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_AVAILABILITY);
		CIM_PropertyNameList.add(CIM_PROPERTY_BURSTMODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_BYTEMODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CSCREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_CSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_CHANNELTIMING);
		CIM_PropertyNameList.add(CIM_PROPERTY_CREATIONCLASSNAME);
		CIM_PropertyNameList.add(CIM_PROPERTY_DMACHANNEL);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXTRANSFERSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_TRANSFERWIDTHS);
		CIM_PropertyNameList.add(CIM_PROPERTY_TYPECTIMING);
		CIM_PropertyNameList.add(CIM_PROPERTY_WORDMODE);
				
		for (int i = 0; i < CIM_SystemResource.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_SystemResource.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ADDRESSSIZE)||
				((String)CIM_SystemResource.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_AVAILABILITY)||
				((String)CIM_SystemResource.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BURSTMODE)||
				((String)CIM_SystemResource.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_BYTEMODE)||
				((String)CIM_SystemResource.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CSCREATIONCLASSNAME)||
				((String)CIM_SystemResource.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CSNAME)||
				((String)CIM_SystemResource.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CHANNELTIMING)||
				((String)CIM_SystemResource.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((String)CIM_SystemResource.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DMACHANNEL)||
				((String)CIM_SystemResource.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXTRANSFERSIZE)||
				((String)CIM_SystemResource.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TRANSFERWIDTHS)||
				((String)CIM_SystemResource.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TYPECTIMING)||
				((String)CIM_SystemResource.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WORDMODE)){
				continue;
			}
			
			CIM_DMA.CIM_PropertyNameList.add(CIM_SystemResource.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ADDRESSSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_AVAILABILITY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BURSTMODE, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_BYTEMODE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CSCREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CHANNELTIMING, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CREATIONCLASSNAME, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DMACHANNEL, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXTRANSFERSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TRANSFERWIDTHS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TYPECTIMING, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WORDMODE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_SystemResource.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_SystemResource.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ADDRESSSIZE)||
				((CIMProperty)CIM_SystemResource.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_AVAILABILITY)||
				((CIMProperty)CIM_SystemResource.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BURSTMODE)||
				((CIMProperty)CIM_SystemResource.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_BYTEMODE)||
				((CIMProperty)CIM_SystemResource.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CSCREATIONCLASSNAME)||
				((CIMProperty)CIM_SystemResource.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CSNAME)||
				((CIMProperty)CIM_SystemResource.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CHANNELTIMING)||
				((CIMProperty)CIM_SystemResource.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CREATIONCLASSNAME)||
				((CIMProperty)CIM_SystemResource.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DMACHANNEL)||
				((CIMProperty)CIM_SystemResource.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXTRANSFERSIZE)||
				((CIMProperty)CIM_SystemResource.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TRANSFERWIDTHS)||
				((CIMProperty)CIM_SystemResource.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TYPECTIMING)||
				((CIMProperty)CIM_SystemResource.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WORDMODE)){
				continue;
			}
			
			CIM_DMA.CIM_PropertyList.add(CIM_SystemResource.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_SystemResource.Java_Package_List.size(); i++) {
			if (((String)CIM_SystemResource.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_SystemResource.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ADDRESSSIZE = {"Value0","Value1","Value2","Value3","Value4"};
	public final static String[] CIM_VALUEMAP_AVAILABILITY = {"Other","Unknown","Available","In Use/Not Available","In Use and Available/Shareable"};
	public final static String[] CIM_VALUEMAP_BYTEMODE = {"Other","Unknown","Not execute in 'count by byte' mode","Execute in 'count by byte' mode"};
	public final static String[] CIM_VALUEMAP_CHANNELTIMING = {"Other","Unknown","ISA Compatible","Type A","Type B","Type F"};
	public final static String[] CIM_VALUEMAP_TRANSFERWIDTHS = {"Value0","Value1","Value2","Value3","Value4","Value5"};
	public final static String[] CIM_VALUEMAP_TYPECTIMING = {"Other","Unknown","ISA Compatible","Not Supported","Supported"};
	public final static String[] CIM_VALUEMAP_WORDMODE = {"Other","Unknown","Not execute in 'count by word' mode","Execute in 'count by word' mode"};
	
	
	public final static int ADDRESSSIZE_VALUE0 = 0;
	public final static int ADDRESSSIZE_VALUE1 = 8;
	public final static int ADDRESSSIZE_VALUE2 = 16;
	public final static int ADDRESSSIZE_VALUE3 = 32;
	public final static int ADDRESSSIZE_VALUE4 = 64;
	
	public final static int AVAILABILITY_OTHER = 1;
	public final static int AVAILABILITY_UNKNOWN = 2;
	public final static int AVAILABILITY_AVAILABLE = 3;
	public final static int AVAILABILITY_INUSE_NOTAVAILABLE = 4;
	public final static int AVAILABILITY_INUSEANDAVAILABLE_SHAREABLE = 5;
	
	public final static int BYTEMODE_OTHER = 1;
	public final static int BYTEMODE_UNKNOWN = 2;
	public final static int BYTEMODE_NOTEXECUTEIN_COUNTBYBYTE_MODE = 3;
	public final static int BYTEMODE_EXECUTEIN_COUNTBYBYTE_MODE = 4;
	
	public final static int CHANNELTIMING_OTHER = 1;
	public final static int CHANNELTIMING_UNKNOWN = 2;
	public final static int CHANNELTIMING_ISACOMPATIBLE = 3;
	public final static int CHANNELTIMING_TYPEA = 4;
	public final static int CHANNELTIMING_TYPEB = 5;
	public final static int CHANNELTIMING_TYPEF = 6;
	
	public final static int TRANSFERWIDTHS_VALUE0 = 0;
	public final static int TRANSFERWIDTHS_VALUE1 = 8;
	public final static int TRANSFERWIDTHS_VALUE2 = 16;
	public final static int TRANSFERWIDTHS_VALUE3 = 32;
	public final static int TRANSFERWIDTHS_VALUE4 = 64;
	public final static int TRANSFERWIDTHS_VALUE5 = 128;
	
	public final static int TYPECTIMING_OTHER = 1;
	public final static int TYPECTIMING_UNKNOWN = 2;
	public final static int TYPECTIMING_ISACOMPATIBLE = 3;
	public final static int TYPECTIMING_NOTSUPPORTED = 4;
	public final static int TYPECTIMING_SUPPORTED = 5;
	
	public final static int WORDMODE_OTHER = 1;
	public final static int WORDMODE_UNKNOWN = 2;
	public final static int WORDMODE_NOTEXECUTEIN_COUNTBYWORD_MODE = 3;
	public final static int WORDMODE_EXECUTEIN_COUNTBYWORD_MODE = 4;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_DMA() {

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
	public CIM_DMA(Vector keyProperties){ 
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
	public CIM_DMA(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_CSCreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_CSCREATIONCLASSNAME);
		
		if (CIMProperty_CSCreationClassName == null || CIMProperty_CSCreationClassName.getValue().isEmpty() || CIMProperty_CSCreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_CSCREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_CSName = this.cimInstance.getProperty(CIM_PROPERTY_CSNAME);
		
		if (CIMProperty_CSName == null || CIMProperty_CSName.getValue().isEmpty() || CIMProperty_CSName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_CSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_CreationClassName = this.cimInstance.getProperty(CIM_PROPERTY_CREATIONCLASSNAME);
		
		if (CIMProperty_CreationClassName == null || CIMProperty_CreationClassName.getValue().isEmpty() || CIMProperty_CreationClassName.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_CREATIONCLASSNAME, "Key"});
			result = false;
		}
		
		CIMProperty CIMProperty_DMAChannel = this.cimInstance.getProperty(CIM_PROPERTY_DMACHANNEL);
		
		if (CIMProperty_DMAChannel == null || CIMProperty_DMAChannel.getValue().isEmpty() || CIMProperty_DMAChannel.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_DMACHANNEL, "Key"});
			result = false;
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
	    
	    if (!(object instanceof CIM_DMA)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_DMA)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_DMA)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_DMA)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_DMA)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_DMA)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_DMA)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_DMA)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_DMA)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_DMA)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_LogicalDevice_CIM_AllocatedDMAs(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ALLOCATEDDMA, 
					CIM_LogicalDevice.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_DMA.Java_Package_List.size(); i++) {
						if (!((String)(CIM_DMA.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_DMA.Java_Package_List.get(i))).endsWith(".")) {
							CIM_DMA.Java_Package_List.setElementAt((String)(CIM_DMA.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_DMA.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_LogicalDevice(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_LogicalDevice(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_LogicalDevice(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_LogicalDevice_CIM_AllocatedDMA_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_ALLOCATEDDMA, 
					CIM_LogicalDevice.CIM_CLASS_NAME, 
					"Antecedent",
					"Dependent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_LogicalDevice.CIM_CLASS_NAME)) {
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

	public ArrayList getAssociated_CIM_ComputerSystem_CIM_ComputerSystemDMAs(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMDMA, 
					CIM_ComputerSystem.CIM_CLASS_NAME, 
					"PartComponent",
					"GroupComponent",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_DMA.Java_Package_List.size(); i++) {
						if (!((String)(CIM_DMA.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_DMA.Java_Package_List.get(i))).endsWith(".")) {
							CIM_DMA.Java_Package_List.setElementAt((String)(CIM_DMA.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_DMA.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ComputerSystem(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_ComputerSystem(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ComputerSystem(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_ComputerSystem_CIM_ComputerSystemDMA_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_COMPUTERSYSTEMDMA, 
					CIM_ComputerSystem.CIM_CLASS_NAME, 
					"PartComponent",
					"GroupComponent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ComputerSystem.CIM_CLASS_NAME)) {
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
	
	// Attribute AddressSize
	
	public UnsignedInt16 get_AddressSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DMA.CIM_PROPERTY_ADDRESSSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DMA.CIM_PROPERTY_ADDRESSSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DMA.CIM_PROPERTY_ADDRESSSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_AddressSize(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DMA.CIM_PROPERTY_ADDRESSSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DMA.CIM_PROPERTY_ADDRESSSIZE + " could not be found");
    		
		} else if (!CIM_DMAHelper.isValid_AddressSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DMA.CIM_PROPERTY_ADDRESSSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DMA.CIM_PROPERTY_ADDRESSSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Availability
	
	public UnsignedInt16 get_Availability() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DMA.CIM_PROPERTY_AVAILABILITY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DMA.CIM_PROPERTY_AVAILABILITY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DMA.CIM_PROPERTY_AVAILABILITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Availability(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DMA.CIM_PROPERTY_AVAILABILITY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DMA.CIM_PROPERTY_AVAILABILITY + " could not be found");
    		
		} else if (!CIM_DMAHelper.isValid_Availability(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DMA.CIM_PROPERTY_AVAILABILITY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DMA.CIM_PROPERTY_AVAILABILITY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute BurstMode
	
	public Boolean get_BurstMode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DMA.CIM_PROPERTY_BURSTMODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DMA.CIM_PROPERTY_BURSTMODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DMA.CIM_PROPERTY_BURSTMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_BurstMode(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DMA.CIM_PROPERTY_BURSTMODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DMA.CIM_PROPERTY_BURSTMODE + " could not be found");
    		
		} else if (!CIM_DMAHelper.isValid_BurstMode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DMA.CIM_PROPERTY_BURSTMODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DMA.CIM_PROPERTY_BURSTMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ByteMode
	
	public UnsignedInt16 get_ByteMode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DMA.CIM_PROPERTY_BYTEMODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DMA.CIM_PROPERTY_BYTEMODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DMA.CIM_PROPERTY_BYTEMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ByteMode(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DMA.CIM_PROPERTY_BYTEMODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DMA.CIM_PROPERTY_BYTEMODE + " could not be found");
    		
		} else if (!CIM_DMAHelper.isValid_ByteMode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DMA.CIM_PROPERTY_BYTEMODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DMA.CIM_PROPERTY_BYTEMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CSCreationClassName
	
	public String get_CSCreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DMA.CIM_PROPERTY_CSCREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DMA.CIM_PROPERTY_CSCREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DMA.CIM_PROPERTY_CSCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CSCreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DMA.CIM_PROPERTY_CSCREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_DMA.CIM_PROPERTY_CSCREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DMA.CIM_PROPERTY_CSCREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_DMAHelper.isValid_CSCreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DMA.CIM_PROPERTY_CSCREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DMA.CIM_PROPERTY_CSCREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CSName
	
	public String get_CSName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DMA.CIM_PROPERTY_CSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DMA.CIM_PROPERTY_CSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DMA.CIM_PROPERTY_CSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CSName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DMA.CIM_PROPERTY_CSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_DMA.CIM_PROPERTY_CSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DMA.CIM_PROPERTY_CSNAME + " could not be found");
    		
		} else if (!CIM_DMAHelper.isValid_CSName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DMA.CIM_PROPERTY_CSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DMA.CIM_PROPERTY_CSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ChannelTiming
	
	public UnsignedInt16 get_ChannelTiming() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DMA.CIM_PROPERTY_CHANNELTIMING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DMA.CIM_PROPERTY_CHANNELTIMING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DMA.CIM_PROPERTY_CHANNELTIMING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ChannelTiming(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DMA.CIM_PROPERTY_CHANNELTIMING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DMA.CIM_PROPERTY_CHANNELTIMING + " could not be found");
    		
		} else if (!CIM_DMAHelper.isValid_ChannelTiming(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DMA.CIM_PROPERTY_CHANNELTIMING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DMA.CIM_PROPERTY_CHANNELTIMING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CreationClassName
	
	public String get_CreationClassName() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DMA.CIM_PROPERTY_CREATIONCLASSNAME);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DMA.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DMA.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CreationClassName(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DMA.CIM_PROPERTY_CREATIONCLASSNAME);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_DMA.CIM_PROPERTY_CREATIONCLASSNAME + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DMA.CIM_PROPERTY_CREATIONCLASSNAME + " could not be found");
    		
		} else if (!CIM_DMAHelper.isValid_CreationClassName(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DMA.CIM_PROPERTY_CREATIONCLASSNAME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DMA.CIM_PROPERTY_CREATIONCLASSNAME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute DMAChannel
	
	public UnsignedInt32 get_DMAChannel() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DMA.CIM_PROPERTY_DMACHANNEL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DMA.CIM_PROPERTY_DMACHANNEL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DMA.CIM_PROPERTY_DMACHANNEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_DMAChannel(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DMA.CIM_PROPERTY_DMACHANNEL);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_DMA.CIM_PROPERTY_DMACHANNEL + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DMA.CIM_PROPERTY_DMACHANNEL + " could not be found");
    		
		} else if (!CIM_DMAHelper.isValid_DMAChannel(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DMA.CIM_PROPERTY_DMACHANNEL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DMA.CIM_PROPERTY_DMACHANNEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxTransferSize
	
	public UnsignedInt32 get_MaxTransferSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DMA.CIM_PROPERTY_MAXTRANSFERSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DMA.CIM_PROPERTY_MAXTRANSFERSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DMA.CIM_PROPERTY_MAXTRANSFERSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxTransferSize(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DMA.CIM_PROPERTY_MAXTRANSFERSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DMA.CIM_PROPERTY_MAXTRANSFERSIZE + " could not be found");
    		
		} else if (!CIM_DMAHelper.isValid_MaxTransferSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DMA.CIM_PROPERTY_MAXTRANSFERSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DMA.CIM_PROPERTY_MAXTRANSFERSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TransferWidths
	
	public UnsignedInt16[] get_TransferWidths() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DMA.CIM_PROPERTY_TRANSFERWIDTHS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DMA.CIM_PROPERTY_TRANSFERWIDTHS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DMA.CIM_PROPERTY_TRANSFERWIDTHS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_TransferWidths(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DMA.CIM_PROPERTY_TRANSFERWIDTHS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DMA.CIM_PROPERTY_TRANSFERWIDTHS + " could not be found");
    		
		} else if (!CIM_DMAHelper.isValid_TransferWidths(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DMA.CIM_PROPERTY_TRANSFERWIDTHS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DMA.CIM_PROPERTY_TRANSFERWIDTHS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TypeCTiming
	
	public UnsignedInt16 get_TypeCTiming() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DMA.CIM_PROPERTY_TYPECTIMING);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DMA.CIM_PROPERTY_TYPECTIMING + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DMA.CIM_PROPERTY_TYPECTIMING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TypeCTiming(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DMA.CIM_PROPERTY_TYPECTIMING);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DMA.CIM_PROPERTY_TYPECTIMING + " could not be found");
    		
		} else if (!CIM_DMAHelper.isValid_TypeCTiming(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DMA.CIM_PROPERTY_TYPECTIMING);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DMA.CIM_PROPERTY_TYPECTIMING + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute WordMode
	
	public UnsignedInt16 get_WordMode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DMA.CIM_PROPERTY_WORDMODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DMA.CIM_PROPERTY_WORDMODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DMA.CIM_PROPERTY_WORDMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_WordMode(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DMA.CIM_PROPERTY_WORDMODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DMA.CIM_PROPERTY_WORDMODE + " could not be found");
    		
		} else if (!CIM_DMAHelper.isValid_WordMode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DMA.CIM_PROPERTY_WORDMODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DMA.CIM_PROPERTY_WORDMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
