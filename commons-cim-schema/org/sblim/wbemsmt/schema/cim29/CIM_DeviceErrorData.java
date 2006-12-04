/** 
 * CIM_DeviceErrorData.java
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
 * Description: DeviceErrorData is a statistical class containing error- related counters for a LogicalDevice. The types of errors are as defined by CCITT (Rec X.733) and ISO (IEC 10164-4). The element whose statistics are described is associated using the relationship, ElementStatisticalData. Note that this class uses a simplified identity/naming algorithm over CIM_DeviceErrorCounts.
 * 
 */

package org.sblim.wbemsmt.schema.cim29;

import java.security.InvalidParameterException;
import java.util.Vector;
import java.util.Iterator;
import org.sblim.wbem.cim.*;


public class CIM_DeviceErrorData extends CIM_StatisticalData  {
	
	public final static String CIM_CLASS_NAME = "CIM_DeviceErrorData";
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.0";
	
	
	/**
	*	Count of the critical errors.
	*/
	public final static String CIM_PROPERTY_CRITICALERRORCOUNT = "CriticalErrorCount"; //$NON-NLS-1$
	/**
	*	ErrorDescription is a free-form string supplying more information about the error recorded in LastErrorCode, and information on any corrective actions that may be taken.
	*/
	public final static String CIM_PROPERTY_ERRORDESCRIPTION = "ErrorDescription"; //$NON-NLS-1$
	/**
	*	Count of the indeterminate errors.
	*/
	public final static String CIM_PROPERTY_INDETERMINATEERRORCOUNT = "IndeterminateErrorCount"; //$NON-NLS-1$
	/**
	*	LastErrorCode captures the last error code reported by the LogicalDevice. While the device is in this error condition, then the LogicalDevice's OperationalStatus should not reflect an 'Okay' status. Once this error condition is cleared, then the LogicalDevice's OperationalStatus should report an 'Okay' status.
	*/
	public final static String CIM_PROPERTY_LASTERRORCODE = "LastErrorCode"; //$NON-NLS-1$
	/**
	*	Count of the major errors.
	*/
	public final static String CIM_PROPERTY_MAJORERRORCOUNT = "MajorErrorCount"; //$NON-NLS-1$
	/**
	*	Count of the minor errors.
	*/
	public final static String CIM_PROPERTY_MINORERRORCOUNT = "MinorErrorCount"; //$NON-NLS-1$
	/**
	*	Count of the warnings.
	*/
	public final static String CIM_PROPERTY_WARNINGCOUNT = "WarningCount"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_CRITICALERRORCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_ERRORDESCRIPTION);
		CIM_PropertyNameList.add(CIM_PROPERTY_INDETERMINATEERRORCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_LASTERRORCODE);
		CIM_PropertyNameList.add(CIM_PROPERTY_MAJORERRORCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_MINORERRORCOUNT);
		CIM_PropertyNameList.add(CIM_PROPERTY_WARNINGCOUNT);
				
		for (int i = 0; i < CIM_StatisticalData.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_CRITICALERRORCOUNT)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_ERRORDESCRIPTION)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_INDETERMINATEERRORCOUNT)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_LASTERRORCODE)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MAJORERRORCOUNT)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_MINORERRORCOUNT)||
				((String)CIM_StatisticalData.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_WARNINGCOUNT)){
				continue;
			}
			
			CIM_DeviceErrorData.CIM_PropertyNameList.add(CIM_StatisticalData.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_CRITICALERRORCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_ERRORDESCRIPTION, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_INDETERMINATEERRORCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_LASTERRORCODE, new CIMValue(null, new CIMDataType(CIMDataType.STRING))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MAJORERRORCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_MINORERRORCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_WARNINGCOUNT, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
				
		for (int i = 0; i < CIM_StatisticalData.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_CRITICALERRORCOUNT)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_ERRORDESCRIPTION)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_INDETERMINATEERRORCOUNT)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_LASTERRORCODE)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MAJORERRORCOUNT)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_MINORERRORCOUNT)||
				((CIMProperty)CIM_StatisticalData.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_WARNINGCOUNT)){
				continue;
			}
			
			CIM_DeviceErrorData.CIM_PropertyList.add(CIM_StatisticalData.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim29");
				
		for (int i = 0; i < CIM_StatisticalData.Java_Package_List.size(); i++) {
			if (((String)CIM_StatisticalData.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim29")){
				continue;
			}
			
			Java_Package_List.add(CIM_StatisticalData.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_DeviceErrorData() {

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
	public CIM_DeviceErrorData(Vector keyProperties){ 
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
	public CIM_DeviceErrorData(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_DeviceErrorData)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_DeviceErrorData)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_DeviceErrorData)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_DeviceErrorData)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_DeviceErrorData)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_DeviceErrorData)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_DeviceErrorData)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_DeviceErrorData)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_DeviceErrorData)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_DeviceErrorData)object).cimObjectPath)) {
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
	
	// Attribute CriticalErrorCount
	
	public UnsignedInt64 get_CriticalErrorCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorData.CIM_PROPERTY_CRITICALERRORCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_CRITICALERRORCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_CRITICALERRORCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_CriticalErrorCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorData.CIM_PROPERTY_CRITICALERRORCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_CRITICALERRORCOUNT + " could not be found");
    		
		} else if (!CIM_DeviceErrorDataHelper.isValid_CriticalErrorCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceErrorData.CIM_PROPERTY_CRITICALERRORCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_CRITICALERRORCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute ErrorDescription
	
	public String get_ErrorDescription() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorData.CIM_PROPERTY_ERRORDESCRIPTION);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_ERRORDESCRIPTION + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_ERRORDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_ErrorDescription(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorData.CIM_PROPERTY_ERRORDESCRIPTION);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_ERRORDESCRIPTION + " could not be found");
    		
		} else if (!CIM_DeviceErrorDataHelper.isValid_ErrorDescription(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceErrorData.CIM_PROPERTY_ERRORDESCRIPTION);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_ERRORDESCRIPTION + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute IndeterminateErrorCount
	
	public UnsignedInt64 get_IndeterminateErrorCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorData.CIM_PROPERTY_INDETERMINATEERRORCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_INDETERMINATEERRORCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_INDETERMINATEERRORCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_IndeterminateErrorCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorData.CIM_PROPERTY_INDETERMINATEERRORCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_INDETERMINATEERRORCOUNT + " could not be found");
    		
		} else if (!CIM_DeviceErrorDataHelper.isValid_IndeterminateErrorCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceErrorData.CIM_PROPERTY_INDETERMINATEERRORCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_INDETERMINATEERRORCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute LastErrorCode
	
	public String get_LastErrorCode() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorData.CIM_PROPERTY_LASTERRORCODE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_LASTERRORCODE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_LASTERRORCODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (String)currentProperty.getValue().getValue();
	}
	    
			
	public void set_LastErrorCode(String newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorData.CIM_PROPERTY_LASTERRORCODE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_LASTERRORCODE + " could not be found");
    		
		} else if (!CIM_DeviceErrorDataHelper.isValid_LastErrorCode(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceErrorData.CIM_PROPERTY_LASTERRORCODE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.STRING) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_LASTERRORCODE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.STRING) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.STRING));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MajorErrorCount
	
	public UnsignedInt64 get_MajorErrorCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorData.CIM_PROPERTY_MAJORERRORCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_MAJORERRORCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_MAJORERRORCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MajorErrorCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorData.CIM_PROPERTY_MAJORERRORCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_MAJORERRORCOUNT + " could not be found");
    		
		} else if (!CIM_DeviceErrorDataHelper.isValid_MajorErrorCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceErrorData.CIM_PROPERTY_MAJORERRORCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_MAJORERRORCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute MinorErrorCount
	
	public UnsignedInt64 get_MinorErrorCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorData.CIM_PROPERTY_MINORERRORCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_MINORERRORCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_MINORERRORCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_MinorErrorCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorData.CIM_PROPERTY_MINORERRORCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_MINORERRORCOUNT + " could not be found");
    		
		} else if (!CIM_DeviceErrorDataHelper.isValid_MinorErrorCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceErrorData.CIM_PROPERTY_MINORERRORCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_MINORERRORCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute WarningCount
	
	public UnsignedInt64 get_WarningCount() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorData.CIM_PROPERTY_WARNINGCOUNT);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_WARNINGCOUNT + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_WARNINGCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_WarningCount(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_DeviceErrorData.CIM_PROPERTY_WARNINGCOUNT);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_WARNINGCOUNT + " could not be found");
    		
		} else if (!CIM_DeviceErrorDataHelper.isValid_WarningCount(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_DeviceErrorData.CIM_PROPERTY_WARNINGCOUNT);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_DeviceErrorData.CIM_PROPERTY_WARNINGCOUNT + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
