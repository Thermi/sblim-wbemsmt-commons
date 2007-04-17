/** 
 * CIM_VideoController.java
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
 * Description:  Capabilities and management of the VideoController.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.lang.reflect.Constructor;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;
import org.sblim.wbem.cim.UnsignedInt32;
import org.sblim.wbem.cim.UnsignedInt64;
import org.sblim.wbem.client.CIMClient;
import org.sblim.wbem.client.CIMEnumeration;



/**
 *  Capabilities and management of the VideoController.
 */
public class CIM_VideoController extends CIM_Controller  {
	
	public final static String CIM_CLASS_NAME = "CIM_VideoController"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_VIDEOSETTING = "CIM_VideoSetting"; //$NON-NLS-1$
	
	
	/**
	*	An array of integers indicating the graphics and 3D capabilities of the VideoController.
	*/
	public final static String CIM_PROPERTY_ACCELERATORCAPABILITIES = "AcceleratorCapabilities"; //$NON-NLS-1$
	/**
	*	An array of free-form strings providing more detailed explanations for any of the video Accelerator features indicated in the Capabilities array. Note, each entry of this array is related to the entry in the Capabilities array that is located at the same index.
	*/
	public final static String CIM_PROPERTY_CAPABILITYDESCRIPTIONS = "CapabilityDescriptions"; //$NON-NLS-1$
	/**
	*	The number of bits used to display each pixel.
	*/
	public final static String CIM_PROPERTY_CURRENTBITSPERPIXEL = "CurrentBitsPerPixel"; //$NON-NLS-1$
	/**
	*	Current number of horizontal pixels.
	*/
	public final static String CIM_PROPERTY_CURRENTHORIZONTALRESOLUTION = "CurrentHorizontalResolution"; //$NON-NLS-1$
	/**
	*	Number of colors supported at the current resolutions.
	*/
	public final static String CIM_PROPERTY_CURRENTNUMBEROFCOLORS = "CurrentNumberOfColors"; //$NON-NLS-1$
	/**
	*	If in character mode, number of columns for this VideoController. Otherwise, enter 0.
	*/
	public final static String CIM_PROPERTY_CURRENTNUMBEROFCOLUMNS = "CurrentNumberOfColumns"; //$NON-NLS-1$
	/**
	*	If in character mode, number of rows for this Video Controller. Otherwise, enter 0.
	*/
	public final static String CIM_PROPERTY_CURRENTNUMBEROFROWS = "CurrentNumberOfRows"; //$NON-NLS-1$
	/**
	*	Current refresh rate in Hertz.
	*/
	public final static String CIM_PROPERTY_CURRENTREFRESHRATE = "CurrentRefreshRate"; //$NON-NLS-1$
	/**
	*	Current scan mode. "Interlaced" (value=3) or "Non Interlaced" (4) can be defined using this property.
	*/
	public final static String CIM_PROPERTY_CURRENTSCANMODE = "CurrentScanMode"; //$NON-NLS-1$
	/**
	*	Current number of vertical pixels.
	*/
	public final static String CIM_PROPERTY_CURRENTVERTICALRESOLUTION = "CurrentVerticalResolution"; //$NON-NLS-1$
	/**
	*	
	*/
	public final static String CIM_PROPERTY_DESCRIPTION = "Description"; //$NON-NLS-1$
	/**
	*	Maximum amount of memory supported in bytes.
	*/
	public final static String CIM_PROPERTY_MAXMEMORYSUPPORTED = "MaxMemorySupported"; //$NON-NLS-1$
	/**
	*	Maximum refresh rate of the VideoController in Hertz.
	*/
	public final static String CIM_PROPERTY_MAXREFRESHRATE = "MaxRefreshRate"; //$NON-NLS-1$
	/**
	*	Minimum refresh rate of the Video Controller in Hertz.
	*/
	public final static String CIM_PROPERTY_MINREFRESHRATE = "MinRefreshRate"; //$NON-NLS-1$
	/**
	*	Number of video pages supported given the current resolutions and available memory.
	*/
	public final static String CIM_PROPERTY_NUMBEROFVIDEOPAGES = "NumberOfVideoPages"; //$NON-NLS-1$
	/**
	*	An integer enumeration indicating the type of video memory.
	*/
	public final static String CIM_PROPERTY_VIDEOMEMORYTYPE = "VideoMemoryType"; //$NON-NLS-1$
	/**
	*	A free-form string describing the video processor/Controller.
	*/
	public final static String CIM_PROPERTY_VIDEOPROCESSOR = "VideoProcessor"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ACCELERATORCAPABILITIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTBITSPERPIXEL);
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTHORIZONTALRESOLUTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTNUMBEROFCOLORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTNUMBEROFCOLUMNS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTNUMBEROFROWS);
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTREFRESHRATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTSCANMODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_CURRENTVERTICALRESOLUTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_DESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXMEMORYSUPPORTED);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXREFRESHRATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MINREFRESHRATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_NUMBEROFVIDEOPAGES);
		CIM_PropertyNameList.add(CIM_PROPERTY_VIDEOMEMORYTYPE);
		CIM_PropertyNameList.add(CIM_PROPERTY_VIDEOPROCESSOR);
				
		for (int i = 0; i < CIM_Controller.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ACCELERATORCAPABILITIES)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CAPABILITYDESCRIPTIONS)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTBITSPERPIXEL)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTHORIZONTALRESOLUTION)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTNUMBEROFCOLORS)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTNUMBEROFCOLUMNS)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTNUMBEROFROWS)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTREFRESHRATE)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTSCANMODE)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CURRENTVERTICALRESOLUTION)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_DESCRIPTION)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXMEMORYSUPPORTED)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXREFRESHRATE)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MINREFRESHRATE)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NUMBEROFVIDEOPAGES)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VIDEOMEMORYTYPE)||
				((String)CIM_Controller.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VIDEOPROCESSOR)){
				continue;
			}
			
			CIM_VideoController.CIM_PropertyNameList.add(CIM_Controller.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ACCELERATORCAPABILITIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CAPABILITYDESCRIPTIONS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTBITSPERPIXEL, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTHORIZONTALRESOLUTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTNUMBEROFCOLORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTNUMBEROFCOLUMNS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTNUMBEROFROWS, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTREFRESHRATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTSCANMODE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CURRENTVERTICALRESOLUTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_DESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXMEMORYSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXREFRESHRATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MINREFRESHRATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NUMBEROFVIDEOPAGES, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VIDEOMEMORYTYPE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VIDEOPROCESSOR, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
				
		for (int i = 0; i < CIM_Controller.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ACCELERATORCAPABILITIES)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CAPABILITYDESCRIPTIONS)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTBITSPERPIXEL)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTHORIZONTALRESOLUTION)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTNUMBEROFCOLORS)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTNUMBEROFCOLUMNS)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTNUMBEROFROWS)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTREFRESHRATE)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTSCANMODE)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CURRENTVERTICALRESOLUTION)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_DESCRIPTION)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXMEMORYSUPPORTED)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXREFRESHRATE)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MINREFRESHRATE)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NUMBEROFVIDEOPAGES)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VIDEOMEMORYTYPE)||
				((CIMProperty)CIM_Controller.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VIDEOPROCESSOR)){
				continue;
			}
			
			CIM_VideoController.CIM_PropertyList.add(CIM_Controller.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_Controller.Java_Package_List.size(); i++) {
			if (((String)CIM_Controller.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_Controller.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_ACCELERATORCAPABILITIES = {"Unknown","Other","Graphics Accelerator","3D Accelerator","PCI Fast Write","MultiMonitor Support","PCI Mastering","Second Monochrome Adapter Support","Large Memory Address Support"};
	public final static String[] CIM_VALUEMAP_CURRENTSCANMODE = {"Other","Unknown","Interlaced","Non Interlaced"};
	public final static String[] CIM_VALUEMAP_VIDEOMEMORYTYPE = {"Other","Unknown","VRAM","DRAM","SRAM","WRAM","EDO RAM","Burst Synchronous DRAM","Pipelined Burst SRAM","CDRAM","3DRAM","SDRAM","SGRAM"};
	
	
	public final static int ACCELERATORCAPABILITIES_UNKNOWN = 0;
	public final static int ACCELERATORCAPABILITIES_OTHER = 1;
	public final static int ACCELERATORCAPABILITIES_GRAPHICSACCELERATOR = 2;
	public final static int ACCELERATORCAPABILITIES_3DACCELERATOR = 3;
	public final static int ACCELERATORCAPABILITIES_PCIFASTWRITE = 4;
	public final static int ACCELERATORCAPABILITIES_MULTIMONITORSUPPORT = 5;
	public final static int ACCELERATORCAPABILITIES_PCIMASTERING = 6;
	public final static int ACCELERATORCAPABILITIES_SECONDMONOCHROMEADAPTERSUPPORT = 7;
	public final static int ACCELERATORCAPABILITIES_LARGEMEMORYADDRESSSUPPORT = 8;
	
	public final static int CURRENTSCANMODE_OTHER = 1;
	public final static int CURRENTSCANMODE_UNKNOWN = 2;
	public final static int CURRENTSCANMODE_INTERLACED = 3;
	public final static int CURRENTSCANMODE_NONINTERLACED = 4;
	
	public final static int VIDEOMEMORYTYPE_OTHER = 1;
	public final static int VIDEOMEMORYTYPE_UNKNOWN = 2;
	public final static int VIDEOMEMORYTYPE_VRAM = 3;
	public final static int VIDEOMEMORYTYPE_DRAM = 4;
	public final static int VIDEOMEMORYTYPE_SRAM = 5;
	public final static int VIDEOMEMORYTYPE_WRAM = 6;
	public final static int VIDEOMEMORYTYPE_EDORAM = 7;
	public final static int VIDEOMEMORYTYPE_BURSTSYNCHRONOUSDRAM = 8;
	public final static int VIDEOMEMORYTYPE_PIPELINEDBURSTSRAM = 9;
	public final static int VIDEOMEMORYTYPE_CDRAM = 10;
	public final static int VIDEOMEMORYTYPE_3DRAM = 11;
	public final static int VIDEOMEMORYTYPE_SDRAM = 12;
	public final static int VIDEOMEMORYTYPE_SGRAM = 13;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_VideoController() {

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
	public CIM_VideoController(Vector keyProperties){ 
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
	public CIM_VideoController(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_VideoController)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_VideoController)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_VideoController)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_VideoController)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_VideoController)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_VideoController)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_VideoController)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_VideoController)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_VideoController)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_VideoController)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_VideoControllerResolution_CIM_VideoSettings(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_VIDEOSETTING, 
					CIM_VideoControllerResolution.CIM_CLASS_NAME, 
					"Element", //$NON-NLS-1$
					"Setting", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_VideoController.Java_Package_List.size(); i++) {
						if (!((String)(CIM_VideoController.Java_Package_List.get(i))).trim().equals("") && //$NON-NLS-1$
								!((String)(CIM_VideoController.Java_Package_List.get(i))).endsWith(".")) { //$NON-NLS-1$
							CIM_VideoController.Java_Package_List.setElementAt((String)(CIM_VideoController.Java_Package_List.get(i)) + ("."), i); //$NON-NLS-1$
						}
						cimClassName = (CIM_VideoController.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_VideoControllerResolution(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_VideoControllerResolution(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_VideoControllerResolution(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_VideoControllerResolution_CIM_VideoSetting_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_VIDEOSETTING, 
					CIM_VideoControllerResolution.CIM_CLASS_NAME, 
					"Element", //$NON-NLS-1$
					"Setting"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_VideoControllerResolution.CIM_CLASS_NAME)) {
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
	
	// Attribute AcceleratorCapabilities
	
	public UnsignedInt16[] get_AcceleratorCapabilities() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_ACCELERATORCAPABILITIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_ACCELERATORCAPABILITIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_ACCELERATORCAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_AcceleratorCapabilities(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_ACCELERATORCAPABILITIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_ACCELERATORCAPABILITIES + " could not be found");
    		
		} else if (!CIM_VideoControllerHelper.isValid_AcceleratorCapabilities(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VideoController.CIM_PROPERTY_ACCELERATORCAPABILITIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_ACCELERATORCAPABILITIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CapabilityDescriptions
	
	public String[] get_CapabilityDescriptions() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " could not be found");
    		
		} else if (!CIM_VideoControllerHelper.isValid_CapabilityDescriptions(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VideoController.CIM_PROPERTY_CAPABILITYDESCRIPTIONS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_CAPABILITYDESCRIPTIONS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CurrentBitsPerPixel
	
	public UnsignedInt32 get_CurrentBitsPerPixel() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_CURRENTBITSPERPIXEL);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTBITSPERPIXEL + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTBITSPERPIXEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CurrentBitsPerPixel(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_CURRENTBITSPERPIXEL);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTBITSPERPIXEL + " could not be found");
    		
		} else if (!CIM_VideoControllerHelper.isValid_CurrentBitsPerPixel(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VideoController.CIM_PROPERTY_CURRENTBITSPERPIXEL);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTBITSPERPIXEL + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CurrentHorizontalResolution
	
	public UnsignedInt32 get_CurrentHorizontalResolution() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_CURRENTHORIZONTALRESOLUTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTHORIZONTALRESOLUTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTHORIZONTALRESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CurrentHorizontalResolution(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_CURRENTHORIZONTALRESOLUTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTHORIZONTALRESOLUTION + " could not be found");
    		
		} else if (!CIM_VideoControllerHelper.isValid_CurrentHorizontalResolution(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VideoController.CIM_PROPERTY_CURRENTHORIZONTALRESOLUTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTHORIZONTALRESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CurrentNumberOfColors
	
	public UnsignedInt64 get_CurrentNumberOfColors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_CURRENTNUMBEROFCOLORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTNUMBEROFCOLORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTNUMBEROFCOLORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CurrentNumberOfColors(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_CURRENTNUMBEROFCOLORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTNUMBEROFCOLORS + " could not be found");
    		
		} else if (!CIM_VideoControllerHelper.isValid_CurrentNumberOfColors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VideoController.CIM_PROPERTY_CURRENTNUMBEROFCOLORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTNUMBEROFCOLORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CurrentNumberOfColumns
	
	public UnsignedInt32 get_CurrentNumberOfColumns() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_CURRENTNUMBEROFCOLUMNS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTNUMBEROFCOLUMNS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTNUMBEROFCOLUMNS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CurrentNumberOfColumns(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_CURRENTNUMBEROFCOLUMNS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTNUMBEROFCOLUMNS + " could not be found");
    		
		} else if (!CIM_VideoControllerHelper.isValid_CurrentNumberOfColumns(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VideoController.CIM_PROPERTY_CURRENTNUMBEROFCOLUMNS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTNUMBEROFCOLUMNS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CurrentNumberOfRows
	
	public UnsignedInt32 get_CurrentNumberOfRows() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_CURRENTNUMBEROFROWS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTNUMBEROFROWS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTNUMBEROFROWS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CurrentNumberOfRows(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_CURRENTNUMBEROFROWS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTNUMBEROFROWS + " could not be found");
    		
		} else if (!CIM_VideoControllerHelper.isValid_CurrentNumberOfRows(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VideoController.CIM_PROPERTY_CURRENTNUMBEROFROWS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTNUMBEROFROWS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CurrentRefreshRate
	
	public UnsignedInt32 get_CurrentRefreshRate() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_CURRENTREFRESHRATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTREFRESHRATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTREFRESHRATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CurrentRefreshRate(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_CURRENTREFRESHRATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTREFRESHRATE + " could not be found");
    		
		} else if (!CIM_VideoControllerHelper.isValid_CurrentRefreshRate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VideoController.CIM_PROPERTY_CURRENTREFRESHRATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTREFRESHRATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CurrentScanMode
	
	public UnsignedInt16 get_CurrentScanMode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_CURRENTSCANMODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTSCANMODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTSCANMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CurrentScanMode(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_CURRENTSCANMODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTSCANMODE + " could not be found");
    		
		} else if (!CIM_VideoControllerHelper.isValid_CurrentScanMode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VideoController.CIM_PROPERTY_CURRENTSCANMODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTSCANMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute CurrentVerticalResolution
	
	public UnsignedInt32 get_CurrentVerticalResolution() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_CURRENTVERTICALRESOLUTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTVERTICALRESOLUTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTVERTICALRESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CurrentVerticalResolution(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_CURRENTVERTICALRESOLUTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTVERTICALRESOLUTION + " could not be found");
    		
		} else if (!CIM_VideoControllerHelper.isValid_CurrentVerticalResolution(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VideoController.CIM_PROPERTY_CURRENTVERTICALRESOLUTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_CURRENTVERTICALRESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute Description
	
	public String get_Description() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_DESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_DESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_DESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_Description(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_DESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_DESCRIPTION + " could not be found");
    		
		} else if (!CIM_VideoControllerHelper.isValid_Description(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VideoController.CIM_PROPERTY_DESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_DESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxMemorySupported
	
	public UnsignedInt32 get_MaxMemorySupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_MAXMEMORYSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_MAXMEMORYSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_MAXMEMORYSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxMemorySupported(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_MAXMEMORYSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_MAXMEMORYSUPPORTED + " could not be found");
    		
		} else if (!CIM_VideoControllerHelper.isValid_MaxMemorySupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VideoController.CIM_PROPERTY_MAXMEMORYSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_MAXMEMORYSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxRefreshRate
	
	public UnsignedInt32 get_MaxRefreshRate() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_MAXREFRESHRATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_MAXREFRESHRATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_MAXREFRESHRATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxRefreshRate(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_MAXREFRESHRATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_MAXREFRESHRATE + " could not be found");
    		
		} else if (!CIM_VideoControllerHelper.isValid_MaxRefreshRate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VideoController.CIM_PROPERTY_MAXREFRESHRATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_MAXREFRESHRATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MinRefreshRate
	
	public UnsignedInt32 get_MinRefreshRate() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_MINREFRESHRATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_MINREFRESHRATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_MINREFRESHRATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MinRefreshRate(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_MINREFRESHRATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_MINREFRESHRATE + " could not be found");
    		
		} else if (!CIM_VideoControllerHelper.isValid_MinRefreshRate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VideoController.CIM_PROPERTY_MINREFRESHRATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_MINREFRESHRATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NumberOfVideoPages
	
	public UnsignedInt32 get_NumberOfVideoPages() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_NUMBEROFVIDEOPAGES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_NUMBEROFVIDEOPAGES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_NUMBEROFVIDEOPAGES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NumberOfVideoPages(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_NUMBEROFVIDEOPAGES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_NUMBEROFVIDEOPAGES + " could not be found");
    		
		} else if (!CIM_VideoControllerHelper.isValid_NumberOfVideoPages(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VideoController.CIM_PROPERTY_NUMBEROFVIDEOPAGES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_NUMBEROFVIDEOPAGES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute VideoMemoryType
	
	public UnsignedInt16 get_VideoMemoryType() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_VIDEOMEMORYTYPE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_VIDEOMEMORYTYPE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_VIDEOMEMORYTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_VideoMemoryType(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_VIDEOMEMORYTYPE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_VIDEOMEMORYTYPE + " could not be found");
    		
		} else if (!CIM_VideoControllerHelper.isValid_VideoMemoryType(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VideoController.CIM_PROPERTY_VIDEOMEMORYTYPE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_VIDEOMEMORYTYPE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute VideoProcessor
	
	public String get_VideoProcessor() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_VIDEOPROCESSOR);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_VIDEOPROCESSOR + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_VIDEOPROCESSOR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_VideoProcessor(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoController.CIM_PROPERTY_VIDEOPROCESSOR);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoController.CIM_PROPERTY_VIDEOPROCESSOR + " could not be found");
    		
		} else if (!CIM_VideoControllerHelper.isValid_VideoProcessor(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VideoController.CIM_PROPERTY_VIDEOPROCESSOR);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoController.CIM_PROPERTY_VIDEOPROCESSOR + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
