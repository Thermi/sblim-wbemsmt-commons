/** 
 * CIM_DVDDrive.java
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
 * Description: Capabilities and management of a DVDDrive, a subtype of MediaAccessDevice.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_DVDDrive extends CIM_MediaAccessDevice  {
	
	public final static String CIM_CLASS_NAME = "CIM_DVDDrive";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	
	
	/**
	*	The CD and DVD formats that are supported by this Device. For example, the Drive may support "CD-ROM" and "DVD-RAM". In this case, the values 16 and 24 would be written to the array. This property's values align with those defined in PhysicalMedia.MediaType.
	*/
	public final static String CIM_PROPERTY_FORMATSSUPPORTED = "FormatsSupported"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_FORMATSSUPPORTED);
				
		for (int i = 0; i < CIM_MediaAccessDevice.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_MediaAccessDevice.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_FORMATSSUPPORTED)){
				continue;
			}
			
			CIM_DVDDrive.CIM_PropertyNameList.add(CIM_MediaAccessDevice.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_FORMATSSUPPORTED, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
				
		for (int i = 0; i < CIM_MediaAccessDevice.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_MediaAccessDevice.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_FORMATSSUPPORTED)){
				continue;
			}
			
			CIM_DVDDrive.CIM_PropertyList.add(CIM_MediaAccessDevice.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_MediaAccessDevice.Java_Package_List.size(); i++) {
			if (((String)CIM_MediaAccessDevice.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_MediaAccessDevice.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_FORMATSSUPPORTED = {"Unknown","Other","CD-ROM","CD-ROM/XA","CD-I","CD Recordable","DVD","DVD-RW+","DVD-RAM","DVD-ROM","DVD-Video","Divx","CD-RW","CD-DA","CD+","DVD Recordable","DVD-RW","DVD-Audio","DVD-5","DVD-9","DVD-10","DVD-18"};
	
	
	public final static int FORMATSSUPPORTED_UNKNOWN = 0;
	public final static int FORMATSSUPPORTED_OTHER = 1;
	public final static int FORMATSSUPPORTED_CD_ROM = 16;
	public final static int FORMATSSUPPORTED_CD_ROM_XA = 17;
	public final static int FORMATSSUPPORTED_CD_I = 18;
	public final static int FORMATSSUPPORTED_CDRECORDABLE = 19;
	public final static int FORMATSSUPPORTED_DVD = 22;
	public final static int FORMATSSUPPORTED_DVD_RW_ = 23;
	public final static int FORMATSSUPPORTED_DVD_RAM = 24;
	public final static int FORMATSSUPPORTED_DVD_ROM = 25;
	public final static int FORMATSSUPPORTED_DVD_VIDEO = 26;
	public final static int FORMATSSUPPORTED_DIVX = 27;
	public final static int FORMATSSUPPORTED_CD_RW = 33;
	public final static int FORMATSSUPPORTED_CD_DA = 34;
	public final static int FORMATSSUPPORTED_CD_ = 35;
	public final static int FORMATSSUPPORTED_DVDRECORDABLE = 36;
	public final static int FORMATSSUPPORTED_DVD_RW = 37;
	public final static int FORMATSSUPPORTED_DVD_AUDIO = 38;
	public final static int FORMATSSUPPORTED_DVD_5 = 39;
	public final static int FORMATSSUPPORTED_DVD_9 = 40;
	public final static int FORMATSSUPPORTED_DVD_10 = 41;
	public final static int FORMATSSUPPORTED_DVD_18 = 42;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_DVDDrive() {

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
	public CIM_DVDDrive(Vector keyProperties){ 
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
	public CIM_DVDDrive(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_DVDDrive)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_DVDDrive)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_DVDDrive)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_DVDDrive)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_DVDDrive)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_DVDDrive)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_DVDDrive)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_DVDDrive)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_DVDDrive)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_DVDDrive)object).cimObjectPath)) {
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
	
	
	
	//*****************************************************
	// Attribute methods
	//*****************************************************
	
	// Attribute FormatsSupported
	
	public UnsignedInt16[] get_FormatsSupported() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DVDDrive.CIM_PROPERTY_FORMATSSUPPORTED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DVDDrive.CIM_PROPERTY_FORMATSSUPPORTED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DVDDrive.CIM_PROPERTY_FORMATSSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_FormatsSupported(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DVDDrive.CIM_PROPERTY_FORMATSSUPPORTED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DVDDrive.CIM_PROPERTY_FORMATSSUPPORTED + " could not be found");
    		
		} else if (!CIM_DVDDriveHelper.isValid_FormatsSupported(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DVDDrive.CIM_PROPERTY_FORMATSSUPPORTED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DVDDrive.CIM_PROPERTY_FORMATSSUPPORTED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
