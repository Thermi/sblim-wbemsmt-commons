/** 
 * CIM_StorageRedundancyGroup.java
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
 * Description:  A class derived from RedundancyGroup containing mass storage-related redundancy
 * information. StorageRedundancy Groups are used to protect user data. They act
 * on one or more underlying StorageExtents, associated via
 * ExtentRedundancyComponent and produce one or more protected StorageExtents
 * that are associated to the underlying StorageExtents via
 * ProtectedExtentBasedOn or CompositeExtentBasedOn. StorageRedundancyGroups may
 * overlap. However, the underlying StorageExtents within the overlap should not
 * contain any check data.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import java.util.ArrayList;
import java.util.Enumeration;
import java.lang.reflect.Constructor;
import org.sblim.wbem.client.*;



/**
 *  A class derived from RedundancyGroup containing mass storage-related redundancy
 * information. StorageRedundancy Groups are used to protect user data. They act
 * on one or more underlying StorageExtents, associated via
 * ExtentRedundancyComponent and produce one or more protected StorageExtents
 * that are associated to the underlying StorageExtents via
 * ProtectedExtentBasedOn or CompositeExtentBasedOn. StorageRedundancyGroups may
 * overlap. However, the underlying StorageExtents within the overlap should not
 * contain any check data.
 */
public class CIM_StorageRedundancyGroup extends CIM_RedundancyGroup  {
	
	public final static String CIM_CLASS_NAME = "CIM_StorageRedundancyGroup"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	public final static String CIM_ASSOCIATOR_CLASS_NAME_CIM_EXTENTREDUNDANCYCOMPONENT = "CIM_ExtentRedundancyComponent"; //$NON-NLS-1$
	
	
	/**
	*	True indicates that the data is concatenated across the various StorageExtents in the Group.
	*/
	public final static String CIM_PROPERTY_ISCONCATENATED = "IsConcatenated"; //$NON-NLS-1$
	/**
	*	True indicates that the data is striped across the various StorageExtents in the Group.
	*/
	public final static String CIM_PROPERTY_ISSTRIPED = "IsStriped"; //$NON-NLS-1$
	/**
	*	StorageRedundancy provides additional information on the state of the RedundancyGroup, beyond the RedundancyStatus property. Information like "Reconfig In Progress" (value =1) or "Redundancy Disabled" can be specified using this property.
	*/
	public final static String CIM_PROPERTY_STORAGEREDUNDANCY = "StorageRedundancy"; //$NON-NLS-1$
	/**
	*	The TypeOfAlgorithm specifies the algorithm used for data redundancy and reconstruction. For example, "P+Q" (value =5) or "P+S" (7) may be specified. The value of 0, is defined as "None" to indicate that data redundancy is not active. An inactive redundancy should only be instantiated if data striping or concatenation are active. These are indicated by the IsStriped or IsConcatentated boolean properties of this RedundancyGroup.
	*/
	public final static String CIM_PROPERTY_TYPEOFALGORITHM = "TypeOfAlgorithm"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_ISCONCATENATED);
		CIM_PropertyNameList.add(CIM_PROPERTY_ISSTRIPED);
		CIM_PropertyNameList.add(CIM_PROPERTY_STORAGEREDUNDANCY);
		CIM_PropertyNameList.add(CIM_PROPERTY_TYPEOFALGORITHM);
				
		for (int i = 0; i < CIM_RedundancyGroup.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_RedundancyGroup.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ISCONCATENATED)||
				((String)CIM_RedundancyGroup.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ISSTRIPED)||
				((String)CIM_RedundancyGroup.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_STORAGEREDUNDANCY)||
				((String)CIM_RedundancyGroup.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_TYPEOFALGORITHM)){
				continue;
			}
			
			CIM_StorageRedundancyGroup.CIM_PropertyNameList.add(CIM_RedundancyGroup.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ISCONCATENATED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ISSTRIPED, new CIMValue(null, new CIMDataType(CIMDataType.BOOLEAN))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_STORAGEREDUNDANCY, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_TYPEOFALGORITHM, new CIMValue(null, new CIMDataType(CIMDataType.UINT16))));
				
		for (int i = 0; i < CIM_RedundancyGroup.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_RedundancyGroup.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ISCONCATENATED)||
				((CIMProperty)CIM_RedundancyGroup.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ISSTRIPED)||
				((CIMProperty)CIM_RedundancyGroup.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_STORAGEREDUNDANCY)||
				((CIMProperty)CIM_RedundancyGroup.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_TYPEOFALGORITHM)){
				continue;
			}
			
			CIM_StorageRedundancyGroup.CIM_PropertyList.add(CIM_RedundancyGroup.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim29");
				
		String[] parentClassPackageList = CIM_RedundancyGroup.getPackages();
		
		for (int i = 0; i < parentClassPackageList.length; i++) {
			Java_Package_List.add(parentClassPackageList[i]);
		}
	};
			
	public final static String[] CIM_VALUEMAP_STORAGEREDUNDANCY = {"No Additional Status","Reconfig In Progress","Data Lost","Not Currently Configured","Protected Rebuild","Redundancy Disabled","Unprotected Rebuild","Recalculating","Verifying"};
	public final static String[] CIM_VALUEMAP_TYPEOFALGORITHM = {"None","Other","Unknown","Copy","XOR","P+Q","S","P+S"};
	
	
	public final static int STORAGEREDUNDANCY_NOADDITIONALSTATUS = 0;
	public final static int STORAGEREDUNDANCY_RECONFIGINPROGRESS = 1;
	public final static int STORAGEREDUNDANCY_DATALOST = 2;
	public final static int STORAGEREDUNDANCY_NOTCURRENTLYCONFIGURED = 3;
	public final static int STORAGEREDUNDANCY_PROTECTEDREBUILD = 4;
	public final static int STORAGEREDUNDANCY_REDUNDANCYDISABLED = 5;
	public final static int STORAGEREDUNDANCY_UNPROTECTEDREBUILD = 6;
	public final static int STORAGEREDUNDANCY_RECALCULATING = 7;
	public final static int STORAGEREDUNDANCY_VERIFYING = 8;
	
	public final static int TYPEOFALGORITHM_NONE = 0;
	public final static int TYPEOFALGORITHM_OTHER = 1;
	public final static int TYPEOFALGORITHM_UNKNOWN = 2;
	public final static int TYPEOFALGORITHM_COPY = 3;
	public final static int TYPEOFALGORITHM_XOR = 4;
	public final static int TYPEOFALGORITHM_P_Q = 5;
	public final static int TYPEOFALGORITHM_S = 6;
	public final static int TYPEOFALGORITHM_P_S = 7;
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_StorageRedundancyGroup() {

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
	public CIM_StorageRedundancyGroup(Vector keyProperties){ 
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
	public CIM_StorageRedundancyGroup(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
		if (cimInstance == null) {
			throw new InvalidParameterException("The cimInstance parameter does not contain a valid reference.");
		
		} else if (cimObjectPath == null){
			throw new InvalidParameterException("The cimObjectPath parameter does not contain a valid reference.");		
		
		} else if (!cimObjectPath.getObjectName().equals(cimInstance.getClassName())) {
			throw new InvalidParameterException("The class name of the instance and the ObjectPath are not the same.");
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
	
	public static void addPackage(String packagename) {
        if (packagename != null) {
            if (!packagename.endsWith(".")) {
                packagename = packagename + ".";
            }
            CIM_StorageRedundancyGroup.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_StorageRedundancyGroup.Java_Package_List.toArray(new String[CIM_StorageRedundancyGroup.Java_Package_List.size()]);
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
	    
	    if (!(object instanceof CIM_StorageRedundancyGroup)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_StorageRedundancyGroup)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_StorageRedundancyGroup)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_StorageRedundancyGroup)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_StorageRedundancyGroup)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_StorageRedundancyGroup)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_StorageRedundancyGroup)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_StorageRedundancyGroup)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_StorageRedundancyGroup)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_StorageRedundancyGroup)object).cimObjectPath)) {
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
	
	public ArrayList getAssociated_CIM_StorageExtent_CIM_ExtentRedundancyComponents(CIMClient cimClient,
	boolean includeQualifiers, boolean includeClassOrigin, java.lang.String[] propertyList){

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		ArrayList resultArrayList = new ArrayList();
		Enumeration enumeration = null;
		
		try {
			enumeration = cimClient.associators(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_EXTENTREDUNDANCYCOMPONENT, 
					CIM_StorageExtent.CIM_CLASS_NAME, 
					"GroupComponent", //$NON-NLS-1$
					"PartComponent", //$NON-NLS-1$
					includeQualifiers,
					includeClassOrigin,
					propertyList);
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
				if (obj instanceof CIMInstance) {
					CIMInstance cimInstance = (CIMInstance)obj;
                    Class clazz = CIM_StorageRedundancyGroupHelper.findClass(cimClient, cimInstance);
                    
					if (clazz == null) {
						System.err.println("The class " + cimInstance.getClassName() +" was not found. Constructing instance of the base class.");
						resultArrayList.add(new CIM_StorageExtent(cimInstance.getObjectPath(), cimInstance));
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
						resultArrayList.add(new CIM_StorageExtent(cimInstance.getObjectPath(), cimInstance));
						continue;
					}
				
					try {
						Object[] actargs = new Object[] {cimInstance.getObjectPath(), cimInstance};
					
						Object dataObj = cons.newInstance(actargs);
					
						resultArrayList.add(dataObj);
					} catch (Exception e) {
						System.err.println("The instance of class " + cimInstance.getClassName() + " could not be created successful. Constructing instance of the base class.");
						resultArrayList.add(new CIM_StorageExtent(cimInstance.getObjectPath(), cimInstance));
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

	public ArrayList getAssociated_CIM_StorageExtent_CIM_ExtentRedundancyComponent_Names(CIMClient cimClient, boolean deep) {

		if (cimClient == null) {
			throw new InvalidParameterException("The cimClient parameter does not contain a valid reference.");
		}
		
		Enumeration enumeration = null;
		ArrayList resultArrayList = new ArrayList();

		try {		
			enumeration = cimClient.associatorNames(
					this.getCimObjectPath(),
					CIM_ASSOCIATOR_CLASS_NAME_CIM_EXTENTREDUNDANCYCOMPONENT, 
					CIM_StorageExtent.CIM_CLASS_NAME, 
					"GroupComponent", //$NON-NLS-1$
					"PartComponent"); //$NON-NLS-1$
		
		
			while (enumeration.hasMoreElements()) {
				Object obj = enumeration.nextElement();
			
				if (obj instanceof CIMObjectPath) {
					if (deep || ((CIMObjectPath)obj).getObjectName().equals(CIM_StorageExtent.CIM_CLASS_NAME)) {
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
	
	// Attribute IsConcatenated
	
	public Boolean get_IsConcatenated() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageRedundancyGroup.CIM_PROPERTY_ISCONCATENATED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageRedundancyGroup.CIM_PROPERTY_ISCONCATENATED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageRedundancyGroup.CIM_PROPERTY_ISCONCATENATED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IsConcatenated(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageRedundancyGroup.CIM_PROPERTY_ISCONCATENATED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageRedundancyGroup.CIM_PROPERTY_ISCONCATENATED + " could not be found");
    		
		} else if (!CIM_StorageRedundancyGroupHelper.isValid_IsConcatenated(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageRedundancyGroup.CIM_PROPERTY_ISCONCATENATED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageRedundancyGroup.CIM_PROPERTY_ISCONCATENATED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IsStriped
	
	public Boolean get_IsStriped() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageRedundancyGroup.CIM_PROPERTY_ISSTRIPED);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageRedundancyGroup.CIM_PROPERTY_ISSTRIPED + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageRedundancyGroup.CIM_PROPERTY_ISSTRIPED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (Boolean)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IsStriped(Boolean newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageRedundancyGroup.CIM_PROPERTY_ISSTRIPED);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageRedundancyGroup.CIM_PROPERTY_ISSTRIPED + " could not be found");
    		
		} else if (!CIM_StorageRedundancyGroupHelper.isValid_IsStriped(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageRedundancyGroup.CIM_PROPERTY_ISSTRIPED);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.BOOLEAN) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageRedundancyGroup.CIM_PROPERTY_ISSTRIPED + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.BOOLEAN) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.BOOLEAN));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute StorageRedundancy
	
	public UnsignedInt16 get_StorageRedundancy() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageRedundancyGroup.CIM_PROPERTY_STORAGEREDUNDANCY);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageRedundancyGroup.CIM_PROPERTY_STORAGEREDUNDANCY + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageRedundancyGroup.CIM_PROPERTY_STORAGEREDUNDANCY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_StorageRedundancy(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageRedundancyGroup.CIM_PROPERTY_STORAGEREDUNDANCY);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageRedundancyGroup.CIM_PROPERTY_STORAGEREDUNDANCY + " could not be found");
    		
		} else if (!CIM_StorageRedundancyGroupHelper.isValid_StorageRedundancy(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageRedundancyGroup.CIM_PROPERTY_STORAGEREDUNDANCY);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageRedundancyGroup.CIM_PROPERTY_STORAGEREDUNDANCY + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute TypeOfAlgorithm
	
	public UnsignedInt16 get_TypeOfAlgorithm() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageRedundancyGroup.CIM_PROPERTY_TYPEOFALGORITHM);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageRedundancyGroup.CIM_PROPERTY_TYPEOFALGORITHM + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageRedundancyGroup.CIM_PROPERTY_TYPEOFALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt16)currentProperty.getValue().getValue();
	}
	    
			
	public void set_TypeOfAlgorithm(UnsignedInt16 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_StorageRedundancyGroup.CIM_PROPERTY_TYPEOFALGORITHM);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_StorageRedundancyGroup.CIM_PROPERTY_TYPEOFALGORITHM + " could not be found");
    		
		} else if (!CIM_StorageRedundancyGroupHelper.isValid_TypeOfAlgorithm(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_StorageRedundancyGroup.CIM_PROPERTY_TYPEOFALGORITHM);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT16) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_StorageRedundancyGroup.CIM_PROPERTY_TYPEOFALGORITHM + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT16) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT16));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
