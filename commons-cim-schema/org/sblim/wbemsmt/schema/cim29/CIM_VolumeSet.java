/** 
 * CIM_VolumeSet.java
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
 * Description: VolumeSet is deprecated in lieu of CompositeExtent, which removes the restriction that the Set must be exported. A VolumeSet can be used to model an SCC RAID implementation. VolumeSets represent a contiguous range of logical blocks presented to the operating environment. VolumeSets may overlap. However, the underlying PhysicalExtents within the overlap shall not contain any check data. They are BasedOn one or more ProtectedSpaceExtents. These BasedOn associations should be instantiated or subclassed as needed.
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



public class CIM_VolumeSet extends CIM_StorageVolume  {
	
	public final static String CIM_CLASS_NAME = "CIM_VolumeSet";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_VOLUMESETBASEDONPSEXTENT = "CIM_VolumeSetBasedOnPSExtent";
	
	
	/**
	*	
	*/
	public final static String CIM_PROPERTY_NUMBEROFBLOCKS = "NumberOfBlocks"; //$NON-NLS-1$
	/**
	*	Number of ProtectedSpaceExtents to stripe as a collective set. In SCC, this value is defined as the number of stripes to count before continuing to map into the next contiguous set of Extents, beyond the current stripe.
	*/
	public final static String CIM_PROPERTY_PSEXTENTINTERLEAVEDEPTH = "PSExtentInterleaveDepth"; //$NON-NLS-1$
	/**
	*	Number of contiguous ProtectedSpaceExtents counted before looping back to the first ProtectedSpaceExtent of the current stripe. It is the number of Extents forming the user data stripe.
	*/
	public final static String CIM_PROPERTY_PSEXTENTSTRIPELENGTH = "PSExtentStripeLength"; //$NON-NLS-1$
	/**
	*	VolumeSets in SCC have additional status information beyond that captured in the Availability and other properties, inherited from ManagedSystemElement. This additional information (for example, "Protection Disabled", value=9) is captured in the VolumeStatus property.
	*/
	public final static String CIM_PROPERTY_VOLUMESTATUS = "VolumeStatus"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_NUMBEROFBLOCKS);
		CIM_PropertyNameList.add(CIM_PROPERTY_PSEXTENTINTERLEAVEDEPTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_PSEXTENTSTRIPELENGTH);
		CIM_PropertyNameList.add(CIM_PROPERTY_VOLUMESTATUS);
				
		for (int i = 0; i < CIM_StorageVolume.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_StorageVolume.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_NUMBEROFBLOCKS)||
				((String)CIM_StorageVolume.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PSEXTENTINTERLEAVEDEPTH)||
				((String)CIM_StorageVolume.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PSEXTENTSTRIPELENGTH)||
				((String)CIM_StorageVolume.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_VOLUMESTATUS)){
				continue;
			}
			
			CIM_VolumeSet.CIM_PropertyNameList.add(CIM_StorageVolume.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_NUMBEROFBLOCKS, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PSEXTENTINTERLEAVEDEPTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PSEXTENTSTRIPELENGTH, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_VOLUMESTATUS, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_StorageVolume.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_StorageVolume.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_NUMBEROFBLOCKS)||
				((CIMProperty)CIM_StorageVolume.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PSEXTENTINTERLEAVEDEPTH)||
				((CIMProperty)CIM_StorageVolume.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PSEXTENTSTRIPELENGTH)||
				((CIMProperty)CIM_StorageVolume.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_VOLUMESTATUS)){
				continue;
			}
			
			CIM_VolumeSet.CIM_PropertyList.add(CIM_StorageVolume.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_StorageVolume.Java_Package_List.size(); i++) {
			if (((String)CIM_StorageVolume.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_StorageVolume.Java_Package_List.elementAt(i));
		}
	};
			
	public final static String[] CIM_VALUEMAP_VOLUMESTATUS = {"Other","Unknown","None/Not Applicable","Broken","Data Lost","Dynamic Reconfig","Exposed","Fractionally Exposed","Partially Exposed","Protection Disabled","Readying","Rebuild","Recalculate","Spare in Use","Verify In Progress"};
	
	
	public final static int VOLUMESTATUS_OTHER = 0;
	public final static int VOLUMESTATUS_UNKNOWN = 1;
	public final static int VOLUMESTATUS_NONE_NOTAPPLICABLE = 2;
	public final static int VOLUMESTATUS_BROKEN = 3;
	public final static int VOLUMESTATUS_DATALOST = 4;
	public final static int VOLUMESTATUS_DYNAMICRECONFIG = 5;
	public final static int VOLUMESTATUS_EXPOSED = 6;
	public final static int VOLUMESTATUS_FRACTIONALLYEXPOSED = 7;
	public final static int VOLUMESTATUS_PARTIALLYEXPOSED = 8;
	public final static int VOLUMESTATUS_PROTECTIONDISABLED = 9;
	public final static int VOLUMESTATUS_READYING = 10;
	public final static int VOLUMESTATUS_REBUILD = 11;
	public final static int VOLUMESTATUS_RECALCULATE = 12;
	public final static int VOLUMESTATUS_SPAREINUSE = 13;
	public final static int VOLUMESTATUS_VERIFYINPROGRESS = 14;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_VolumeSet() {

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
	public CIM_VolumeSet(Vector keyProperties){ 
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
	public CIM_VolumeSet(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_VolumeSet)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_VolumeSet)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_VolumeSet)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_VolumeSet)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_VolumeSet)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_VolumeSet)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_VolumeSet)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_VolumeSet)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_VolumeSet)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_VolumeSet)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_ProtectedSpaceExtent_CIM_VolumeSetBasedOnPSExtents(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_VOLUMESETBASEDONPSEXTENT, 
					CIM_ProtectedSpaceExtent.CIM_CLASS_NAME, 
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
				
					for (int i = 0; clazz == null && i < CIM_VolumeSet.Java_Package_List.size(); i++) {
						if (!((String)(CIM_VolumeSet.Java_Package_List.get(i))).trim().equals("") &&
								!((String)(CIM_VolumeSet.Java_Package_List.get(i))).endsWith(".")) {
							CIM_VolumeSet.Java_Package_List.setElementAt((String)(CIM_VolumeSet.Java_Package_List.get(i)) + ("."), i);
						}
						cimClassName = (CIM_VolumeSet.Java_Package_List.get(i)) + cimClassName;

						try {
							clazz = Class.forName(cimClassName);
						} catch(ClassNotFoundException e) {
						}
					}
					
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ProtectedSpaceExtent(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_ProtectedSpaceExtent(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_ProtectedSpaceExtent(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_ProtectedSpaceExtent_CIM_VolumeSetBasedOnPSExtent_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_VOLUMESETBASEDONPSEXTENT, 
					CIM_ProtectedSpaceExtent.CIM_CLASS_NAME, 
					"Dependent",
					"Antecedent");
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_ProtectedSpaceExtent.CIM_CLASS_NAME)) {
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
	
	// Attribute NumberOfBlocks
	
	public UnsignedInt64 get_NumberOfBlocks() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VolumeSet.CIM_PROPERTY_NUMBEROFBLOCKS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VolumeSet.CIM_PROPERTY_NUMBEROFBLOCKS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VolumeSet.CIM_PROPERTY_NUMBEROFBLOCKS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_NumberOfBlocks(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VolumeSet.CIM_PROPERTY_NUMBEROFBLOCKS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VolumeSet.CIM_PROPERTY_NUMBEROFBLOCKS + " could not be found");
    		
		} else if (!CIM_VolumeSetHelper.isValid_NumberOfBlocks(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VolumeSet.CIM_PROPERTY_NUMBEROFBLOCKS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VolumeSet.CIM_PROPERTY_NUMBEROFBLOCKS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PSExtentInterleaveDepth
	
	public UnsignedInt64 get_PSExtentInterleaveDepth() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VolumeSet.CIM_PROPERTY_PSEXTENTINTERLEAVEDEPTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VolumeSet.CIM_PROPERTY_PSEXTENTINTERLEAVEDEPTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VolumeSet.CIM_PROPERTY_PSEXTENTINTERLEAVEDEPTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PSExtentInterleaveDepth(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VolumeSet.CIM_PROPERTY_PSEXTENTINTERLEAVEDEPTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VolumeSet.CIM_PROPERTY_PSEXTENTINTERLEAVEDEPTH + " could not be found");
    		
		} else if (!CIM_VolumeSetHelper.isValid_PSExtentInterleaveDepth(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VolumeSet.CIM_PROPERTY_PSEXTENTINTERLEAVEDEPTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VolumeSet.CIM_PROPERTY_PSEXTENTINTERLEAVEDEPTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PSExtentStripeLength
	
	public UnsignedInt64 get_PSExtentStripeLength() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VolumeSet.CIM_PROPERTY_PSEXTENTSTRIPELENGTH);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VolumeSet.CIM_PROPERTY_PSEXTENTSTRIPELENGTH + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VolumeSet.CIM_PROPERTY_PSEXTENTSTRIPELENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PSExtentStripeLength(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VolumeSet.CIM_PROPERTY_PSEXTENTSTRIPELENGTH);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VolumeSet.CIM_PROPERTY_PSEXTENTSTRIPELENGTH + " could not be found");
    		
		} else if (!CIM_VolumeSetHelper.isValid_PSExtentStripeLength(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VolumeSet.CIM_PROPERTY_PSEXTENTSTRIPELENGTH);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VolumeSet.CIM_PROPERTY_PSEXTENTSTRIPELENGTH + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute VolumeStatus
	
	public UnsignedInt16 get_VolumeStatus() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VolumeSet.CIM_PROPERTY_VOLUMESTATUS);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VolumeSet.CIM_PROPERTY_VOLUMESTATUS + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VolumeSet.CIM_PROPERTY_VOLUMESTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_VolumeStatus(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_VolumeSet.CIM_PROPERTY_VOLUMESTATUS);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_VolumeSet.CIM_PROPERTY_VOLUMESTATUS + " could not be found");
    		
		} else if (!CIM_VolumeSetHelper.isValid_VolumeStatus(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_VolumeSet.CIM_PROPERTY_VOLUMESTATUS);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_VolumeSet.CIM_PROPERTY_VOLUMESTATUS + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
