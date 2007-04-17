/** 
 * CIM_Magazine.java
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
 * Description:  StorageMediaLocations are typically slots or spaces where removable media are
 * located. However, a specific kind of MediaLocation is a Magazine. This entity
 * represents a single physical container with multiple StorageMediaLocations in
 * it. All the MediaLocations within the Magazine are added/removed together.
 * Often, this container has a Barcode or other label for identification. This
 * is the unique data captured in the CIM_Magazine class. Magazine's label
 * properties are defined exactly as are labels for PhysicalMedia.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt16;


/**
 *  StorageMediaLocations are typically slots or spaces where removable media are
 * located. However, a specific kind of MediaLocation is a Magazine. This entity
 * represents a single physical container with multiple StorageMediaLocations in
 * it. All the MediaLocations within the Magazine are added/removed together.
 * Often, this container has a Barcode or other label for identification. This
 * is the unique data captured in the CIM_Magazine class. Magazine's label
 * properties are defined exactly as are labels for PhysicalMedia.
 */
public class CIM_Magazine extends CIM_StorageMediaLocation  {
	
	public final static String CIM_CLASS_NAME = "CIM_Magazine"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	
	
	/**
	*	An array of enumerated integers describing the formats of each of the labels on a Magazine. The Labels themselves are listed in the PhysicalLabels property. Note, each entry of this array is related to the entry in PhysicalLabels that is located at the same index.
	*/
	public final static String CIM_PROPERTY_LABELFORMATS = "LabelFormats"; //$NON-NLS-1$
	/**
	*	An array of enumerated integers describing the states of each of the labels on a Magazine. The Labels themselves are listed in the PhysicalLabels property. Note, each entry of this array is related to the entry in PhysicalLabels that is located at the same index.
	*/
	public final static String CIM_PROPERTY_LABELSTATES = "LabelStates"; //$NON-NLS-1$
	/**
	*	One or more strings on 'labels' on the Magazine. The format of the labels and their state (readable, unreadable, upside-down) are indicated in the corresponding LabelFormats and LabelStates array properties.
	*/
	public final static String CIM_PROPERTY_PHYSICALLABELS = "PhysicalLabels"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_LABELFORMATS);
		CIM_PropertyNameList.add(CIM_PROPERTY_LABELSTATES);
		CIM_PropertyNameList.add(CIM_PROPERTY_PHYSICALLABELS);
				
		for (int i = 0; i < CIM_StorageMediaLocation.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_StorageMediaLocation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LABELFORMATS)||
				((String)CIM_StorageMediaLocation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LABELSTATES)||
				((String)CIM_StorageMediaLocation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PHYSICALLABELS)){
				continue;
			}
			
			CIM_Magazine.CIM_PropertyNameList.add(CIM_StorageMediaLocation.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LABELFORMATS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LABELSTATES, new CIMValue(null, new CIMDataType(CIMDataType.UINT16_ARRAY))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PHYSICALLABELS, new CIMValue(null, new CIMDataType(CIMDataType.STRING_ARRAY))));
				
		for (int i = 0; i < CIM_StorageMediaLocation.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_StorageMediaLocation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LABELFORMATS)||
				((CIMProperty)CIM_StorageMediaLocation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LABELSTATES)||
				((CIMProperty)CIM_StorageMediaLocation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PHYSICALLABELS)){
				continue;
			}
			
			CIM_Magazine.CIM_PropertyList.add(CIM_StorageMediaLocation.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_StorageMediaLocation.Java_Package_List.size(); i++) {
			if (((String)CIM_StorageMediaLocation.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_StorageMediaLocation.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_LABELFORMATS = {"Barcode","Radio Frequency Identification","OCR (Optical Character Recognition)","MICR (Magnetic Ink Character Recognition)","7 Character Barcode","9 Character Barcode"};
	public final static String[] CIM_VALUEMAP_LABELSTATES = {"OK/Readable","Unreadable","Upside Down"};
	
	
	public final static int LABELFORMATS_BARCODE = 0;
	public final static int LABELFORMATS_RADIOFREQUENCYIDENTIFICATION = 1;
	public final static int LABELFORMATS_OCROPTICALCHARACTERRECOGNITION = 2;
	public final static int LABELFORMATS_MICRMAGNETICINKCHARACTERRECOGNITION = 3;
	public final static int LABELFORMATS_7CHARACTERBARCODE = 4;
	public final static int LABELFORMATS_9CHARACTERBARCODE = 5;
	
	public final static int LABELSTATES_OK_READABLE = 0;
	public final static int LABELSTATES_UNREADABLE = 1;
	public final static int LABELSTATES_UPSIDEDOWN = 2;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_Magazine() {

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
	public CIM_Magazine(Vector keyProperties){ 
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
	public CIM_Magazine(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_Magazine)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_Magazine)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_Magazine)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_Magazine)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_Magazine)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_Magazine)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_Magazine)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_Magazine)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_Magazine)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_Magazine)object).cimObjectPath)) {
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
	
	// Attribute LabelFormats
	
	public UnsignedInt16[] get_LabelFormats() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Magazine.CIM_PROPERTY_LABELFORMATS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Magazine.CIM_PROPERTY_LABELFORMATS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Magazine.CIM_PROPERTY_LABELFORMATS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_LabelFormats(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Magazine.CIM_PROPERTY_LABELFORMATS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Magazine.CIM_PROPERTY_LABELFORMATS + " could not be found");
    		
		} else if (!CIM_MagazineHelper.isValid_LabelFormats(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Magazine.CIM_PROPERTY_LABELFORMATS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Magazine.CIM_PROPERTY_LABELFORMATS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LabelStates
	
	public UnsignedInt16[] get_LabelStates() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Magazine.CIM_PROPERTY_LABELSTATES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Magazine.CIM_PROPERTY_LABELSTATES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Magazine.CIM_PROPERTY_LABELSTATES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
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
	    
			
	public void set_LabelStates(UnsignedInt16[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Magazine.CIM_PROPERTY_LABELSTATES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Magazine.CIM_PROPERTY_LABELSTATES + " could not be found");
    		
		} else if (!CIM_MagazineHelper.isValid_LabelStates(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Magazine.CIM_PROPERTY_LABELSTATES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Magazine.CIM_PROPERTY_LABELSTATES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PhysicalLabels
	
	public String[] get_PhysicalLabels() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Magazine.CIM_PROPERTY_PHYSICALLABELS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Magazine.CIM_PROPERTY_PHYSICALLABELS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Magazine.CIM_PROPERTY_PHYSICALLABELS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
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
	    
			
	public void set_PhysicalLabels(String[] newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_Magazine.CIM_PROPERTY_PHYSICALLABELS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_Magazine.CIM_PROPERTY_PHYSICALLABELS + " could not be found");
    		
		} else if (!CIM_MagazineHelper.isValid_PhysicalLabels(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_Magazine.CIM_PROPERTY_PHYSICALLABELS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING_ARRAY) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_Magazine.CIM_PROPERTY_PHYSICALLABELS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING_ARRAY) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING_ARRAY));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
