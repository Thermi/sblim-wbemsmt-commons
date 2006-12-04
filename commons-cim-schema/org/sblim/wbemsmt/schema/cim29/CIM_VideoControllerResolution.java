/** 
 * CIM_VideoControllerResolution.java
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
 * Description: VideoControllerResolution describes the various video modes that a VideoController can support. Video modes are defined by the possible horizontal and vertical resolutions, refresh rate, scan mode and number of colors settings supported by a Controller. The actual resolutions, etc. that are in use, are the values specified in the VideoController object.
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



public class CIM_VideoControllerResolution extends CIM_Setting  {
	
	public final static String CIM_CLASS_NAME = "CIM_VideoControllerResolution";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_VIDEOSETTING = "CIM_VideoSetting";
	
	
	/**
	*	Controller's horizontal resolution in Pixels.
	*/
	public final static String CIM_PROPERTY_HORIZONTALRESOLUTION = "HorizontalResolution"; //$NON-NLS-1$
	/**
	*	Maximum refresh rate in Hertz, when a range of rates is supported at the specified resolutions.
	*/
	public final static String CIM_PROPERTY_MAXREFRESHRATE = "MaxRefreshRate"; //$NON-NLS-1$
	/**
	*	Minimum refresh rate in Hertz, when a range of rates is supported at the specified resolutions.
	*/
	public final static String CIM_PROPERTY_MINREFRESHRATE = "MinRefreshRate"; //$NON-NLS-1$
	/**
	*	Number of colors supported at the current resolutions.
	*/
	public final static String CIM_PROPERTY_NUMBEROFCOLORS = "NumberOfColors"; //$NON-NLS-1$
	/**
	*	Refresh rate in Hertz. If a range of rates is supported, use the MinRefreshRate and MaxRefreshRate properties, and set RefreshRate (this property) to 0.
	*/
	public final static String CIM_PROPERTY_REFRESHRATE = "RefreshRate"; //$NON-NLS-1$
	/**
	*	Integer indicating whether the Controller operates in interlaced (value=5) or non-interlaced (4) mode.
	*/
	public final static String CIM_PROPERTY_SCANMODE = "ScanMode"; //$NON-NLS-1$
	/**
	*	The inherited SettingID serves as part of the key for a VideoControllerResolution instance.
	*/
	public final static String CIM_PROPERTY_SETTINGID = "SettingID"; //$NON-NLS-1$
	/**
	*	Controller's vertical resolution in Pixels.
	*/
	public final static String CIM_PROPERTY_VERTICALRESOLUTION = "VerticalResolution"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_HORIZONTALRESOLUTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAXREFRESHRATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MINREFRESHRATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_NUMBEROFCOLORS);
		CIM_PropertyNameList.add(CIM_PROPERTY_REFRESHRATE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SCANMODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_SETTINGID);
		CIM_PropertyNameList.add(CIM_PROPERTY_VERTICALRESOLUTION);
				
		for (int i = 0; i < CIM_Setting.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HORIZONTALRESOLUTION)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAXREFRESHRATE)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MINREFRESHRATE)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NUMBEROFCOLORS)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_REFRESHRATE)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SCANMODE)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SETTINGID)||
				((String)CIM_Setting.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VERTICALRESOLUTION)){
				continue;
			}
			
			CIM_VideoControllerResolution.CIM_PropertyNameList.add(CIM_Setting.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HORIZONTALRESOLUTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAXREFRESHRATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MINREFRESHRATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NUMBEROFCOLORS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_REFRESHRATE, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SCANMODE, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SETTINGID, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VERTICALRESOLUTION, new CIMValue(null, new CIMDataType(CIMDataType.UINT32))));
				
		for (int i = 0; i < CIM_Setting.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HORIZONTALRESOLUTION)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAXREFRESHRATE)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MINREFRESHRATE)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NUMBEROFCOLORS)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_REFRESHRATE)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SCANMODE)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SETTINGID)||
				((CIMProperty)CIM_Setting.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VERTICALRESOLUTION)){
				continue;
			}
			
			CIM_VideoControllerResolution.CIM_PropertyList.add(CIM_Setting.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_Setting.Java_Package_List.size(); i++) {
			if (((String)CIM_Setting.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_Setting.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_SCANMODE = {"Other","Unknown","Not Supported","Non-Interlaced Operation","Interlaced Operation"};
	
	
	public final static int SCANMODE_OTHER = 1;
	public final static int SCANMODE_UNKNOWN = 2;
	public final static int SCANMODE_NOTSUPPORTED = 3;
	public final static int SCANMODE_NON_INTERLACEDOPERATION = 4;
	public final static int SCANMODE_INTERLACEDOPERATION = 5;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_VideoControllerResolution() {

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
	public CIM_VideoControllerResolution(Vector keyProperties){ 
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
	public CIM_VideoControllerResolution(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
		
		CIMProperty CIMProperty_SettingID = this.cimInstance.getProperty(CIM_PROPERTY_SETTINGID);
		
		if (CIMProperty_SettingID == null || CIMProperty_SettingID.getValue().isEmpty() || CIMProperty_SettingID.getValue().isNullValue()) {
			invalidProperties.add(new String[]{CIM_PROPERTY_SETTINGID, "Key"});
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
	    
	    if (!(object instanceof CIM_VideoControllerResolution)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_VideoControllerResolution)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_VideoControllerResolution)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_VideoControllerResolution)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_VideoControllerResolution)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_VideoControllerResolution)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_VideoControllerResolution)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_VideoControllerResolution)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_VideoControllerResolution)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_VideoControllerResolution)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_VideoController_CIM_VideoSettings(CIMClient cimClient,
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
					CIM_VideoController.CIM_CLASS_NAME, 
					"Setting",
					"Element",
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
					Class clazz = null;
					String cimClassName = cimInstance.getClassName();
				
					for (int i = 0; clazz == null && i < CIM_VideoControllerResolution.Java_Package_List.size(); i++) {
						if (!((String)(CIM_VideoControllerResolution.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_VideoControllerResolution.Java_Package_List.get(i))).endsWith(".")) {
							CIM_VideoControllerResolution.Java_Package_List.setElementAt((String)(CIM_VideoControllerResolution.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_VideoControllerResolution.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_VideoController(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_VideoController(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_VideoController(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_VideoController_CIM_VideoSetting_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_VIDEOSETTING, 
					CIM_VideoController.CIM_CLASS_NAME, 
					"Setting",
					"Element");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_VideoController.CIM_CLASS_NAME)) {
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
	
	// Attribute HorizontalResolution
	
	public UnsignedInt32 get_HorizontalResolution() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoControllerResolution.CIM_PROPERTY_HORIZONTALRESOLUTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_HORIZONTALRESOLUTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_HORIZONTALRESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HorizontalResolution(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoControllerResolution.CIM_PROPERTY_HORIZONTALRESOLUTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_HORIZONTALRESOLUTION + " could not be found");
    		
		} else if (!CIM_VideoControllerResolutionHelper.isValid_HorizontalResolution(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VideoControllerResolution.CIM_PROPERTY_HORIZONTALRESOLUTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_HORIZONTALRESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MaxRefreshRate
	
	public UnsignedInt32 get_MaxRefreshRate() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoControllerResolution.CIM_PROPERTY_MAXREFRESHRATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_MAXREFRESHRATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_MAXREFRESHRATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MaxRefreshRate(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoControllerResolution.CIM_PROPERTY_MAXREFRESHRATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_MAXREFRESHRATE + " could not be found");
    		
		} else if (!CIM_VideoControllerResolutionHelper.isValid_MaxRefreshRate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VideoControllerResolution.CIM_PROPERTY_MAXREFRESHRATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_MAXREFRESHRATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MinRefreshRate
	
	public UnsignedInt32 get_MinRefreshRate() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoControllerResolution.CIM_PROPERTY_MINREFRESHRATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_MINREFRESHRATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_MINREFRESHRATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MinRefreshRate(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoControllerResolution.CIM_PROPERTY_MINREFRESHRATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_MINREFRESHRATE + " could not be found");
    		
		} else if (!CIM_VideoControllerResolutionHelper.isValid_MinRefreshRate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VideoControllerResolution.CIM_PROPERTY_MINREFRESHRATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_MINREFRESHRATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute NumberOfColors
	
	public UnsignedInt64 get_NumberOfColors() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoControllerResolution.CIM_PROPERTY_NUMBEROFCOLORS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_NUMBEROFCOLORS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_NUMBEROFCOLORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NumberOfColors(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoControllerResolution.CIM_PROPERTY_NUMBEROFCOLORS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_NUMBEROFCOLORS + " could not be found");
    		
		} else if (!CIM_VideoControllerResolutionHelper.isValid_NumberOfColors(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VideoControllerResolution.CIM_PROPERTY_NUMBEROFCOLORS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_NUMBEROFCOLORS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute RefreshRate
	
	public UnsignedInt32 get_RefreshRate() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoControllerResolution.CIM_PROPERTY_REFRESHRATE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_REFRESHRATE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_REFRESHRATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_RefreshRate(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoControllerResolution.CIM_PROPERTY_REFRESHRATE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_REFRESHRATE + " could not be found");
    		
		} else if (!CIM_VideoControllerResolutionHelper.isValid_RefreshRate(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VideoControllerResolution.CIM_PROPERTY_REFRESHRATE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_REFRESHRATE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ScanMode
	
	public UnsignedInt16 get_ScanMode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoControllerResolution.CIM_PROPERTY_SCANMODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_SCANMODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_SCANMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ScanMode(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoControllerResolution.CIM_PROPERTY_SCANMODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_SCANMODE + " could not be found");
    		
		} else if (!CIM_VideoControllerResolutionHelper.isValid_ScanMode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VideoControllerResolution.CIM_PROPERTY_SCANMODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_SCANMODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute SettingID
	
	public String get_SettingID() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoControllerResolution.CIM_PROPERTY_SETTINGID);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_SETTINGID + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_SETTINGID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_SettingID(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoControllerResolution.CIM_PROPERTY_SETTINGID);
    	
		if (isValidCimInstance()) {
    		throw new InvalidParameterException("The property " + CIM_VideoControllerResolution.CIM_PROPERTY_SETTINGID + "can not be modified. It is a KEY value.");
    		
		} else if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_SETTINGID + " could not be found");
    		
		} else if (!CIM_VideoControllerResolutionHelper.isValid_SettingID(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VideoControllerResolution.CIM_PROPERTY_SETTINGID);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_SETTINGID + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute VerticalResolution
	
	public UnsignedInt32 get_VerticalResolution() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoControllerResolution.CIM_PROPERTY_VERTICALRESOLUTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_VERTICALRESOLUTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_VERTICALRESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt32)currentProperty.getValue().getValue();
	}
	    
			
	public void set_VerticalResolution(UnsignedInt32 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VideoControllerResolution.CIM_PROPERTY_VERTICALRESOLUTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_VERTICALRESOLUTION + " could not be found");
    		
		} else if (!CIM_VideoControllerResolutionHelper.isValid_VerticalResolution(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VideoControllerResolution.CIM_PROPERTY_VERTICALRESOLUTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VideoControllerResolution.CIM_PROPERTY_VERTICALRESOLUTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT32));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
