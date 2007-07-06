/** 
 * CIM_MediaPhysicalStatInfo.java
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
 * Description:  Statistics related to reading physical labels and picks/puts at a specific
 * StorageMediaLocation, or for a specific piece of PhysicalMedia. Although the
 * same class is used to represent this data, at the instance level the object
 * holds information for the Location (independent of the Media), OR for the
 * Media (independent of its StorageMediaLocation). This class is deprecated in
 * lieu of MediaPhysicalStatData, to take advantage of the simplified key
 * structure defined there.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import org.sblim.wbem.cim.*;
import org.sblim.wbem.client.*;



/**
 *  Statistics related to reading physical labels and picks/puts at a specific
 * StorageMediaLocation, or for a specific piece of PhysicalMedia. Although the
 * same class is used to represent this data, at the instance level the object
 * holds information for the Location (independent of the Media), OR for the
 * Media (independent of its StorageMediaLocation). This class is deprecated in
 * lieu of MediaPhysicalStatData, to take advantage of the simplified key
 * structure defined there.
 */
public class CIM_MediaPhysicalStatInfo extends CIM_PhysicalStatisticalInformation  {
	
	public final static String CIM_CLASS_NAME = "CIM_MediaPhysicalStatInfo"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.7.0";
	
	
	/**
	*	The number of failed picks.
	*/
	public final static String CIM_PROPERTY_PICKFAILURES = "PickFailures"; //$NON-NLS-1$
	/**
	*	The number of retried picks.
	*/
	public final static String CIM_PROPERTY_PICKRETRIES = "PickRetries"; //$NON-NLS-1$
	/**
	*	The number of successful picks.
	*/
	public final static String CIM_PROPERTY_PICKSUCCESSES = "PickSuccesses"; //$NON-NLS-1$
	/**
	*	The number of failed puts.
	*/
	public final static String CIM_PROPERTY_PUTFAILURES = "PutFailures"; //$NON-NLS-1$
	/**
	*	The number of retried puts.
	*/
	public final static String CIM_PROPERTY_PUTRETRIES = "PutRetries"; //$NON-NLS-1$
	/**
	*	The number of successful puts.
	*/
	public final static String CIM_PROPERTY_PUTSUCCESSES = "PutSuccesses"; //$NON-NLS-1$
	/**
	*	The number of failed physical label scans.
	*/
	public final static String CIM_PROPERTY_SCANFAILURES = "ScanFailures"; //$NON-NLS-1$
	/**
	*	The number of retried physical label scans.
	*/
	public final static String CIM_PROPERTY_SCANRETRIES = "ScanRetries"; //$NON-NLS-1$
	/**
	*	The number of successful physical label scans.
	*/
	public final static String CIM_PROPERTY_SCANSUCCESSES = "ScanSuccesses"; //$NON-NLS-1$
	
	
	/**
	*	Method to reset the statistical counters. The method takes one parameter as input - an integer indicating which counter to reset. For this input parameter, 0 indicates all, 1-3 reset the scan-related counters, 4-6 reset the 'pick'-related counters, and 7-9 reset the 'put'-related counters. The method returns 0 if successful, 1 if not supported, and any other value if an error occurred. A method is specified so that the Element's instrumentation can also reset its internal processing and counters. The set of possible return codes should be specified in a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' should be specified as a Values array qualifier on the method.
	*/
	public final static String CIM_METHOD_RESETCOUNTER = "ResetCounter";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	private static Set Java_Package_List 		= new HashSet();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_PICKFAILURES);
		CIM_PropertyNameList.add(CIM_PROPERTY_PICKRETRIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_PICKSUCCESSES);
		CIM_PropertyNameList.add(CIM_PROPERTY_PUTFAILURES);
		CIM_PropertyNameList.add(CIM_PROPERTY_PUTRETRIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_PUTSUCCESSES);
		CIM_PropertyNameList.add(CIM_PROPERTY_SCANFAILURES);
		CIM_PropertyNameList.add(CIM_PROPERTY_SCANRETRIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_SCANSUCCESSES);
				
		for (int i = 0; i < CIM_PhysicalStatisticalInformation.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_PhysicalStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PICKFAILURES)||
				((String)CIM_PhysicalStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PICKRETRIES)||
				((String)CIM_PhysicalStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PICKSUCCESSES)||
				((String)CIM_PhysicalStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PUTFAILURES)||
				((String)CIM_PhysicalStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PUTRETRIES)||
				((String)CIM_PhysicalStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PUTSUCCESSES)||
				((String)CIM_PhysicalStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SCANFAILURES)||
				((String)CIM_PhysicalStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SCANRETRIES)||
				((String)CIM_PhysicalStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_SCANSUCCESSES)){
				continue;
			}
			
			CIM_MediaPhysicalStatInfo.CIM_PropertyNameList.add(CIM_PhysicalStatisticalInformation.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PICKFAILURES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PICKRETRIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PICKSUCCESSES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PUTFAILURES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PUTRETRIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PUTSUCCESSES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SCANFAILURES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SCANRETRIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_SCANSUCCESSES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_PhysicalStatisticalInformation.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_PhysicalStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PICKFAILURES)||
				((CIMProperty)CIM_PhysicalStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PICKRETRIES)||
				((CIMProperty)CIM_PhysicalStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PICKSUCCESSES)||
				((CIMProperty)CIM_PhysicalStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PUTFAILURES)||
				((CIMProperty)CIM_PhysicalStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PUTRETRIES)||
				((CIMProperty)CIM_PhysicalStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PUTSUCCESSES)||
				((CIMProperty)CIM_PhysicalStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SCANFAILURES)||
				((CIMProperty)CIM_PhysicalStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SCANRETRIES)||
				((CIMProperty)CIM_PhysicalStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_SCANSUCCESSES)){
				continue;
			}
			
			CIM_MediaPhysicalStatInfo.CIM_PropertyList.add(CIM_PhysicalStatisticalInformation.CIM_PropertyList.elementAt(i));
		}
		
		addPackage("org.sblim.wbemsmt.schema.cim29");
				
		String[] parentClassPackageList = CIM_PhysicalStatisticalInformation.getPackages();
		
		for (int i = 0; i < parentClassPackageList.length; i++) {
			Java_Package_List.add(parentClassPackageList[i]);
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_MediaPhysicalStatInfo() {

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
	public CIM_MediaPhysicalStatInfo(Vector keyProperties){ 
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
	public CIM_MediaPhysicalStatInfo(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
            CIM_MediaPhysicalStatInfo.Java_Package_List.add(packagename);
            
        } else {
            throw new NullPointerException();
        }
    }

    public static String[] getPackages() {
        return (String[]) CIM_MediaPhysicalStatInfo.Java_Package_List.toArray(new String[CIM_MediaPhysicalStatInfo.Java_Package_List.size()]);
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
	    
	    if (!(object instanceof CIM_MediaPhysicalStatInfo)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_MediaPhysicalStatInfo)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_MediaPhysicalStatInfo)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_MediaPhysicalStatInfo)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_MediaPhysicalStatInfo)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_MediaPhysicalStatInfo)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_MediaPhysicalStatInfo)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_MediaPhysicalStatInfo)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_MediaPhysicalStatInfo)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_MediaPhysicalStatInfo)object).cimObjectPath)) {
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
	
	// Attribute PickFailures
	
	public UnsignedInt64 get_PickFailures() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PICKFAILURES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PICKFAILURES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PICKFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PickFailures(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PICKFAILURES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PICKFAILURES + " could not be found");
    		
		} else if (!CIM_MediaPhysicalStatInfoHelper.isValid_PickFailures(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PICKFAILURES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PICKFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PickRetries
	
	public UnsignedInt64 get_PickRetries() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PICKRETRIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PICKRETRIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PICKRETRIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PickRetries(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PICKRETRIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PICKRETRIES + " could not be found");
    		
		} else if (!CIM_MediaPhysicalStatInfoHelper.isValid_PickRetries(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PICKRETRIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PICKRETRIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PickSuccesses
	
	public UnsignedInt64 get_PickSuccesses() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PICKSUCCESSES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PICKSUCCESSES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PICKSUCCESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PickSuccesses(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PICKSUCCESSES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PICKSUCCESSES + " could not be found");
    		
		} else if (!CIM_MediaPhysicalStatInfoHelper.isValid_PickSuccesses(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PICKSUCCESSES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PICKSUCCESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PutFailures
	
	public UnsignedInt64 get_PutFailures() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PUTFAILURES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PUTFAILURES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PUTFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PutFailures(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PUTFAILURES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PUTFAILURES + " could not be found");
    		
		} else if (!CIM_MediaPhysicalStatInfoHelper.isValid_PutFailures(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PUTFAILURES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PUTFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PutRetries
	
	public UnsignedInt64 get_PutRetries() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PUTRETRIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PUTRETRIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PUTRETRIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PutRetries(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PUTRETRIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PUTRETRIES + " could not be found");
    		
		} else if (!CIM_MediaPhysicalStatInfoHelper.isValid_PutRetries(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PUTRETRIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PUTRETRIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PutSuccesses
	
	public UnsignedInt64 get_PutSuccesses() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PUTSUCCESSES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PUTSUCCESSES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PUTSUCCESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PutSuccesses(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PUTSUCCESSES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PUTSUCCESSES + " could not be found");
    		
		} else if (!CIM_MediaPhysicalStatInfoHelper.isValid_PutSuccesses(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PUTSUCCESSES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_PUTSUCCESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ScanFailures
	
	public UnsignedInt64 get_ScanFailures() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPhysicalStatInfo.CIM_PROPERTY_SCANFAILURES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_SCANFAILURES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_SCANFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ScanFailures(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPhysicalStatInfo.CIM_PROPERTY_SCANFAILURES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_SCANFAILURES + " could not be found");
    		
		} else if (!CIM_MediaPhysicalStatInfoHelper.isValid_ScanFailures(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_SCANFAILURES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_SCANFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ScanRetries
	
	public UnsignedInt64 get_ScanRetries() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPhysicalStatInfo.CIM_PROPERTY_SCANRETRIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_SCANRETRIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_SCANRETRIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ScanRetries(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPhysicalStatInfo.CIM_PROPERTY_SCANRETRIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_SCANRETRIES + " could not be found");
    		
		} else if (!CIM_MediaPhysicalStatInfoHelper.isValid_ScanRetries(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_SCANRETRIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_SCANRETRIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ScanSuccesses
	
	public UnsignedInt64 get_ScanSuccesses() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPhysicalStatInfo.CIM_PROPERTY_SCANSUCCESSES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_SCANSUCCESSES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_SCANSUCCESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ScanSuccesses(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_MediaPhysicalStatInfo.CIM_PROPERTY_SCANSUCCESSES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_SCANSUCCESSES + " could not be found");
    		
		} else if (!CIM_MediaPhysicalStatInfoHelper.isValid_ScanSuccesses(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_SCANSUCCESSES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_MediaPhysicalStatInfo.CIM_PROPERTY_SCANSUCCESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	
	public UnsignedInt32 invoke_resetCounter(CIMClient cimClient, UnsignedInt16 SelectedCounter) {
	  	Vector inParameter = new Vector();
	  	Vector outParameter = new Vector();
	  	
	  	if (!isValidCimInstance()) {
	  		throw new CIMException(CIMException.CIM_ERR_METHOD_NOT_AVAILABLE,"Used instance of class '" + 
	  				CIM_MediaPhysicalStatInfo.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_SelectedCounter = new CIMValue(SelectedCounter, new CIMDataType(CIMDataType.UINT16));
		
	  	inParameter.add(new CIMArgument("SelectedCounter", cimValue_SelectedCounter));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_RESETCOUNTER,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_MediaPhysicalStatInfo.CIM_METHOD_RESETCOUNTER + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_MediaPhysicalStatInfo.CIM_METHOD_RESETCOUNTER + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_MediaPhysicalStatInfo.CIM_METHOD_RESETCOUNTER + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
