/** 
 * CIM_PickerStatInfo.java
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
 * Description:  Statistics for a PickerElement, related to pick/put successes, retries and
 * failures.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMArgument;
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



/**
 *  Statistics for a PickerElement, related to pick/put successes, retries and
 * failures.
 */
public class CIM_PickerStatInfo extends CIM_DeviceStatisticalInformation  {
	
	public final static String CIM_CLASS_NAME = "CIM_PickerStatInfo"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.6.0";
	
	
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
	*	Method to reset the statistical counters. The method takes one parameter as input - an integer indicating which counter to reset. For this input parameter, 0 indicates all, 1-3 reset the 'pick'-related counters, and 4-6 reset the 'put'- related counters. The method returns 0 if successful, 1 if not supported, and any other value if an error occurred. A method is specified so that the Device's instrumentation can also reset its internal pocessing and counters. 
In a subclass, the set of possible return codes should be specified in a ValueMap qualifier on the method. The strings to which the ValueMap contents are 'translated' can be specified as a Values array qualifier.
	*/
	public final static String CIM_METHOD_RESETCOUNTER = "ResetCounter";
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_PICKFAILURES);
		CIM_PropertyNameList.add(CIM_PROPERTY_PICKRETRIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_PICKSUCCESSES);
		CIM_PropertyNameList.add(CIM_PROPERTY_PUTFAILURES);
		CIM_PropertyNameList.add(CIM_PROPERTY_PUTRETRIES);
		CIM_PropertyNameList.add(CIM_PROPERTY_PUTSUCCESSES);
				
		for (int i = 0; i < CIM_DeviceStatisticalInformation.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PICKFAILURES)||
				((String)CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PICKRETRIES)||
				((String)CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PICKSUCCESSES)||
				((String)CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PUTFAILURES)||
				((String)CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PUTRETRIES)||
				((String)CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_PUTSUCCESSES)){
				continue;
			}
			
			CIM_PickerStatInfo.CIM_PropertyNameList.add(CIM_DeviceStatisticalInformation.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PICKFAILURES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PICKRETRIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PICKSUCCESSES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PUTFAILURES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PUTRETRIES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_PUTSUCCESSES, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_DeviceStatisticalInformation.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_DeviceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PICKFAILURES)||
				((CIMProperty)CIM_DeviceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PICKRETRIES)||
				((CIMProperty)CIM_DeviceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PICKSUCCESSES)||
				((CIMProperty)CIM_DeviceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PUTFAILURES)||
				((CIMProperty)CIM_DeviceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PUTRETRIES)||
				((CIMProperty)CIM_DeviceStatisticalInformation.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_PUTSUCCESSES)){
				continue;
			}
			
			CIM_PickerStatInfo.CIM_PropertyList.add(CIM_DeviceStatisticalInformation.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_DeviceStatisticalInformation.Java_Package_List.size(); i++) {
			if (((String)CIM_DeviceStatisticalInformation.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_DeviceStatisticalInformation.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_PickerStatInfo() {

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
	public CIM_PickerStatInfo(Vector keyProperties){ 
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
	public CIM_PickerStatInfo(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_PickerStatInfo)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_PickerStatInfo)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_PickerStatInfo)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_PickerStatInfo)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_PickerStatInfo)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_PickerStatInfo)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_PickerStatInfo)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_PickerStatInfo)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_PickerStatInfo)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_PickerStatInfo)object).cimObjectPath)) {
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
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PickerStatInfo.CIM_PROPERTY_PICKFAILURES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PickerStatInfo.CIM_PROPERTY_PICKFAILURES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PickerStatInfo.CIM_PROPERTY_PICKFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PickFailures(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PickerStatInfo.CIM_PROPERTY_PICKFAILURES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PickerStatInfo.CIM_PROPERTY_PICKFAILURES + " could not be found");
    		
		} else if (!CIM_PickerStatInfoHelper.isValid_PickFailures(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PickerStatInfo.CIM_PROPERTY_PICKFAILURES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PickerStatInfo.CIM_PROPERTY_PICKFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PickRetries
	
	public UnsignedInt64 get_PickRetries() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PickerStatInfo.CIM_PROPERTY_PICKRETRIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PickerStatInfo.CIM_PROPERTY_PICKRETRIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PickerStatInfo.CIM_PROPERTY_PICKRETRIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PickRetries(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PickerStatInfo.CIM_PROPERTY_PICKRETRIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PickerStatInfo.CIM_PROPERTY_PICKRETRIES + " could not be found");
    		
		} else if (!CIM_PickerStatInfoHelper.isValid_PickRetries(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PickerStatInfo.CIM_PROPERTY_PICKRETRIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PickerStatInfo.CIM_PROPERTY_PICKRETRIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PickSuccesses
	
	public UnsignedInt64 get_PickSuccesses() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PickerStatInfo.CIM_PROPERTY_PICKSUCCESSES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PickerStatInfo.CIM_PROPERTY_PICKSUCCESSES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PickerStatInfo.CIM_PROPERTY_PICKSUCCESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PickSuccesses(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PickerStatInfo.CIM_PROPERTY_PICKSUCCESSES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PickerStatInfo.CIM_PROPERTY_PICKSUCCESSES + " could not be found");
    		
		} else if (!CIM_PickerStatInfoHelper.isValid_PickSuccesses(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PickerStatInfo.CIM_PROPERTY_PICKSUCCESSES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PickerStatInfo.CIM_PROPERTY_PICKSUCCESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PutFailures
	
	public UnsignedInt64 get_PutFailures() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PickerStatInfo.CIM_PROPERTY_PUTFAILURES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PickerStatInfo.CIM_PROPERTY_PUTFAILURES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PickerStatInfo.CIM_PROPERTY_PUTFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PutFailures(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PickerStatInfo.CIM_PROPERTY_PUTFAILURES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PickerStatInfo.CIM_PROPERTY_PUTFAILURES + " could not be found");
    		
		} else if (!CIM_PickerStatInfoHelper.isValid_PutFailures(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PickerStatInfo.CIM_PROPERTY_PUTFAILURES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PickerStatInfo.CIM_PROPERTY_PUTFAILURES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PutRetries
	
	public UnsignedInt64 get_PutRetries() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PickerStatInfo.CIM_PROPERTY_PUTRETRIES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PickerStatInfo.CIM_PROPERTY_PUTRETRIES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PickerStatInfo.CIM_PROPERTY_PUTRETRIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PutRetries(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PickerStatInfo.CIM_PROPERTY_PUTRETRIES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PickerStatInfo.CIM_PROPERTY_PUTRETRIES + " could not be found");
    		
		} else if (!CIM_PickerStatInfoHelper.isValid_PutRetries(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PickerStatInfo.CIM_PROPERTY_PUTRETRIES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PickerStatInfo.CIM_PROPERTY_PUTRETRIES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute PutSuccesses
	
	public UnsignedInt64 get_PutSuccesses() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PickerStatInfo.CIM_PROPERTY_PUTSUCCESSES);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PickerStatInfo.CIM_PROPERTY_PUTSUCCESSES + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PickerStatInfo.CIM_PROPERTY_PUTSUCCESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_PutSuccesses(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_PickerStatInfo.CIM_PROPERTY_PUTSUCCESSES);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_PickerStatInfo.CIM_PROPERTY_PUTSUCCESSES + " could not be found");
    		
		} else if (!CIM_PickerStatInfoHelper.isValid_PutSuccesses(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_PickerStatInfo.CIM_PROPERTY_PUTSUCCESSES);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_PickerStatInfo.CIM_PROPERTY_PUTSUCCESSES + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
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
	  				CIM_PickerStatInfo.CIM_CLASS_NAME + "' is not a valid CIMInstance.");
	  	}
	  	
	  	CIMValue cimValue_SelectedCounter = new CIMValue(SelectedCounter, new CIMDataType(CIMDataType.UINT16));
		
	  	inParameter.add(new CIMArgument("SelectedCounter", cimValue_SelectedCounter));
		
	  	
	  	CIMValue returnValue = cimClient.invokeMethod(this.getCimObjectPath(), 
				  									  CIM_METHOD_RESETCOUNTER,
													  inParameter,
													  outParameter);
		
		if (returnValue == null || returnValue.isNull()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The returned CIMValue from remote method call '" + 
					CIM_PickerStatInfo.CIM_METHOD_RESETCOUNTER + "' is null.");
		}
		if (returnValue.getValue() == null || returnValue.isNullValue()) {
			throw new CIMException(CIMException.CIM_ERR_FAILED, "The return value from remote method call '" + 
					CIM_PickerStatInfo.CIM_METHOD_RESETCOUNTER + "' is null.");
		}
		if (returnValue.getType().getType() != CIMDataType.UINT32) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The return value from remote method call " + CIM_PickerStatInfo.CIM_METHOD_RESETCOUNTER + 
					" is not of expected type: " + CIMDataType.getPredefinedType(CIMDataType.UINT32) + ".");		
		}

		return (UnsignedInt32)returnValue.getValue(); 		  	
	  }

	

}
