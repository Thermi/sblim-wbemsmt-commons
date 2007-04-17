/** 
 * CIM_J2eeJVMStats.java
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
 * Description:  The CIM_J2eeJVMStats class defines the performance statistics that are provided
 * by a Java VM.
 * 
 */

package org.sblim.wbemsmt.schema.cim_2_14;

import java.security.InvalidParameterException;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Vector;

import org.sblim.wbem.cim.CIMDataType;
import org.sblim.wbem.cim.CIMDateTime;
import org.sblim.wbem.cim.CIMException;
import org.sblim.wbem.cim.CIMInstance;
import org.sblim.wbem.cim.CIMObjectPath;
import org.sblim.wbem.cim.CIMProperty;
import org.sblim.wbem.cim.CIMSimpleDateTime;
import org.sblim.wbem.cim.CIMValue;
import org.sblim.wbem.cim.UnsignedInt64;


/**
 *  The CIM_J2eeJVMStats class defines the performance statistics that are provided
 * by a Java VM.
 */
public class CIM_J2eeJVMStats extends CIM_J2eeStatistic  {
	
	public final static String CIM_CLASS_NAME = "CIM_J2eeJVMStats"; //$NON-NLS-1$
	public final static String CIM_CLASS_DISPLAYNAME = CIM_CLASS_NAME;

	private boolean validCimInstance = false;
	
	public final static String CIM_CLASS_VERSION = "2.8.2";
	
	
	/**
	*	The heap size of the JVM.
	*/
	public final static String CIM_PROPERTY_HEAPSIZE = "HeapSize"; //$NON-NLS-1$
	/**
	*	The largest size of the JVM heap since the beginning of the measurement.
	*/
	public final static String CIM_PROPERTY_HEAPSIZEHIGHWATERMARK = "HeapSizeHighWaterMark"; //$NON-NLS-1$
	/**
	*	The smallest size of the JVM heap since the beginning of the measurement.
	*/
	public final static String CIM_PROPERTY_HEAPSIZELOWWATERMARK = "HeapSizeLowWaterMark"; //$NON-NLS-1$
	/**
	*	The lower limit for the heap size of the JVM.
	*/
	public final static String CIM_PROPERTY_HEAPSIZELOWERBOUND = "HeapSizeLowerBound"; //$NON-NLS-1$
	/**
	*	The upper limit for the heap size of the JVM.
	*/
	public final static String CIM_PROPERTY_HEAPSIZEUPPERBOUND = "HeapSizeUpperBound"; //$NON-NLS-1$
	/**
	*	The amount of time the JVM has been running. The time is represented as a datetime interval.
	*/
	public final static String CIM_PROPERTY_UPTIME = "UpTime"; //$NON-NLS-1$
	
	
	

	public static Vector CIM_PropertyNameList	= new Vector();
	public static Vector CIM_PropertyList 		= new Vector();
	public static Vector Java_Package_List 		= new Vector();
	
	static {
		CIM_PropertyNameList.add(CIM_PROPERTY_HEAPSIZE);
		CIM_PropertyNameList.add(CIM_PROPERTY_HEAPSIZEHIGHWATERMARK);
		CIM_PropertyNameList.add(CIM_PROPERTY_HEAPSIZELOWWATERMARK);
		CIM_PropertyNameList.add(CIM_PROPERTY_HEAPSIZELOWERBOUND);
		CIM_PropertyNameList.add(CIM_PROPERTY_HEAPSIZEUPPERBOUND);
		CIM_PropertyNameList.add(CIM_PROPERTY_UPTIME);
				
		for (int i = 0; i < CIM_J2eeStatistic.CIM_PropertyNameList.size(); i++) {
			if (((String)CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HEAPSIZE)||
				((String)CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HEAPSIZEHIGHWATERMARK)||
				((String)CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HEAPSIZELOWWATERMARK)||
				((String)CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HEAPSIZELOWERBOUND)||
				((String)CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_HEAPSIZEUPPERBOUND)||
				((String)CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i)).equals(CIM_PROPERTY_UPTIME)){
				continue;
			}
			
			CIM_J2eeJVMStats.CIM_PropertyNameList.add(CIM_J2eeStatistic.CIM_PropertyNameList.elementAt(i));
		}
		
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HEAPSIZE, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HEAPSIZEHIGHWATERMARK, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HEAPSIZELOWWATERMARK, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HEAPSIZELOWERBOUND, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_HEAPSIZEUPPERBOUND, new CIMValue(null, new CIMDataType(CIMDataType.UINT64))));
		CIM_PropertyList.add(new CIMProperty(CIM_PROPERTY_UPTIME, new CIMValue(null, new CIMDataType(CIMDataType.DATETIME))));
				
		for (int i = 0; i < CIM_J2eeStatistic.CIM_PropertyList.size(); i++) {
			if (((CIMProperty)CIM_J2eeStatistic.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HEAPSIZE)||
				((CIMProperty)CIM_J2eeStatistic.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HEAPSIZEHIGHWATERMARK)||
				((CIMProperty)CIM_J2eeStatistic.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HEAPSIZELOWWATERMARK)||
				((CIMProperty)CIM_J2eeStatistic.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HEAPSIZELOWERBOUND)||
				((CIMProperty)CIM_J2eeStatistic.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_HEAPSIZEUPPERBOUND)||
				((CIMProperty)CIM_J2eeStatistic.CIM_PropertyList.get(i)).getName().equals(CIM_PROPERTY_UPTIME)){
				continue;
			}
			
			CIM_J2eeJVMStats.CIM_PropertyList.add(CIM_J2eeStatistic.CIM_PropertyList.elementAt(i));
		}
		
		Java_Package_List.add("org.sblim.wbemsmt.schema.cim_2_14");
				
		for (int i = 0; i < CIM_J2eeStatistic.Java_Package_List.size(); i++) {
			if (((String)CIM_J2eeStatistic.Java_Package_List.elementAt(i)).equals("org.sblim.wbemsmt.schema.cim_2_14")){
				continue;
			}
			
			Java_Package_List.add(CIM_J2eeStatistic.Java_Package_List.elementAt(i));
		}
	};
			
	
	
	
	
	//**********************************************************************
	// Constructors 	
	//**********************************************************************

	/**
	*	Class constructor
	*/	
	public CIM_J2eeJVMStats() {

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
	public CIM_J2eeJVMStats(Vector keyProperties){ 
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
	public CIM_J2eeJVMStats(CIMObjectPath cimObjectPath, CIMInstance cimInstance){ 
		
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
	    
	    if (!(object instanceof CIM_J2eeJVMStats)) {
	        return false;
	    }
	    
	    if (this.cimInstance == null && ((CIM_J2eeJVMStats)object).cimInstance != null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && ((CIM_J2eeJVMStats)object).cimInstance == null) {
	    	return false;
	    	
	    } else if (this.cimInstance != null && !this.cimInstance.equals(((CIM_J2eeJVMStats)object).cimInstance)) {
	    	return false;
	    	
	    } else if (this.original_cimInstance == null && ((CIM_J2eeJVMStats)object).original_cimInstance != null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && ((CIM_J2eeJVMStats)object).original_cimInstance == null) {
	    	return false;
	    	
	    } else if (this.original_cimInstance != null && !this.original_cimInstance.equals(((CIM_J2eeJVMStats)object).original_cimInstance)) {
	        return false;
	        
	    } else if (this.cimObjectPath == null && ((CIM_J2eeJVMStats)object).cimObjectPath != null) {
	    	return false;
	    	
	    } else if (this.cimObjectPath != null && ((CIM_J2eeJVMStats)object).cimObjectPath == null) {
	    	return false;
		    	
	    } else if (this.cimObjectPath != null && !this.cimObjectPath.equals(((CIM_J2eeJVMStats)object).cimObjectPath)) {
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
	
	// Attribute HeapSize
	
	public UnsignedInt64 get_HeapSize() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZE);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZE + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HeapSize(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZE);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZE + " could not be found");
    		
		} else if (!CIM_J2eeJVMStatsHelper.isValid_HeapSize(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZE);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZE + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HeapSizeHighWaterMark
	
	public UnsignedInt64 get_HeapSizeHighWaterMark() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZEHIGHWATERMARK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZEHIGHWATERMARK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZEHIGHWATERMARK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HeapSizeHighWaterMark(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZEHIGHWATERMARK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZEHIGHWATERMARK + " could not be found");
    		
		} else if (!CIM_J2eeJVMStatsHelper.isValid_HeapSizeHighWaterMark(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZEHIGHWATERMARK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZEHIGHWATERMARK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HeapSizeLowWaterMark
	
	public UnsignedInt64 get_HeapSizeLowWaterMark() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZELOWWATERMARK);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZELOWWATERMARK + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZELOWWATERMARK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HeapSizeLowWaterMark(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZELOWWATERMARK);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZELOWWATERMARK + " could not be found");
    		
		} else if (!CIM_J2eeJVMStatsHelper.isValid_HeapSizeLowWaterMark(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZELOWWATERMARK);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZELOWWATERMARK + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HeapSizeLowerBound
	
	public UnsignedInt64 get_HeapSizeLowerBound() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZELOWERBOUND);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZELOWERBOUND + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZELOWERBOUND + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HeapSizeLowerBound(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZELOWERBOUND);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZELOWERBOUND + " could not be found");
    		
		} else if (!CIM_J2eeJVMStatsHelper.isValid_HeapSizeLowerBound(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZELOWERBOUND);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZELOWERBOUND + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute HeapSizeUpperBound
	
	public UnsignedInt64 get_HeapSizeUpperBound() {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZEUPPERBOUND);
        
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZEUPPERBOUND + " could not be found");
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZEUPPERBOUND + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
        
		if (currentProperty.getValue() == null) {
			return null;
		}
        
		return (UnsignedInt64)currentProperty.getValue().getValue();
	}
	    
			
	public void set_HeapSizeUpperBound(UnsignedInt64 newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZEUPPERBOUND);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZEUPPERBOUND + " could not be found");
    		
		} else if (!CIM_J2eeJVMStatsHelper.isValid_HeapSizeUpperBound(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZEUPPERBOUND);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.UINT64) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJVMStats.CIM_PROPERTY_HEAPSIZEUPPERBOUND + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.UINT64) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(newValue, new CIMDataType(CIMDataType.UINT64));
		currentProperty.setValue(updatedValue);
	}	
	    
	

	// Attribute UpTime
	
	public Calendar get_UpTime() {

		CIMProperty property = this.cimInstance.getProperty(CIM_J2eeJVMStats.CIM_PROPERTY_UPTIME);
        
		if (property == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJVMStats.CIM_PROPERTY_UPTIME + " could not be found");
    		
		} else if (property.getType() == null || property.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJVMStats.CIM_PROPERTY_UPTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
        
		if (property.getValue() == null) {
			return null;
		}
        
        CIMDateTime cimDateTime = (CIMDateTime)property.getValue().getValue();
		return cimDateTime != null?cimDateTime.getCalendar():null;
	}
	
	
	public void set_UpTime(Calendar newValue) {
		
		CIMProperty currentProperty = this.cimInstance.getProperty(CIM_J2eeJVMStats.CIM_PROPERTY_UPTIME);
    	
		if (currentProperty == null) {
			throw new CIMException(CIMException.CIM_ERR_NO_SUCH_PROPERTY, "The property " + CIM_J2eeJVMStats.CIM_PROPERTY_UPTIME + " could not be found");
    		
		} else if (!CIM_J2eeJVMStatsHelper.isValid_UpTime(newValue)) {
			throw new InvalidParameterException("The value " + newValue + " is not valid for property " + CIM_J2eeJVMStats.CIM_PROPERTY_UPTIME);
    		
		} else if (currentProperty.getType() == null || currentProperty.getType().getType() != CIMDataType.DATETIME) {
			throw new CIMException(CIMException.CIM_ERR_TYPE_MISMATCH, "The property " + CIM_J2eeJVMStats.CIM_PROPERTY_UPTIME + " is not of expected type " + CIMDataType.getPredefinedType(CIMDataType.DATETIME) + ".");
		}
    	
		CIMValue updatedValue = new CIMValue(new CIMSimpleDateTime(newValue), new CIMDataType(CIMDataType.DATETIME));
		currentProperty.setValue(updatedValue);
	}
    
	

	
	
	//*****************************************************
	// Invoke methods
	//*****************************************************
	
	

}
